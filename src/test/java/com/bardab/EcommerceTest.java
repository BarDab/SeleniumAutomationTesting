package com.bardab;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.bardab.pageobjectmodel.*;
import com.bardab.utilites.ExcelReadUtil;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceTest {
	
	private WebDriver driver;
	private StartingPage startingPage;
	private WebDriverWait explicitWait;
	private MobilePage mobilePage;
	private SonyXperiaPage sonyXperiaPage;
	private CheckoutCartPage checkoutCartPage;
	private LoginPage loginPage;
	private CreateAccountPage createAccountPage;
	private WelocmePage welcomePage;
	private TVPage tvPage;
	private WishListPage wishListPage;
	private ShareWishListPage shareWishListPage;
	private ShoppingCartPage shoppingCartPage;
	private AccountPage accountPage;
	private BackendloginPage backendLoginPage;
	private BackendPage backendPage;
	private SalesOrderPage salesOrderPage;
	private CompareProductsPopUpWindow compareProductsPopUpWindow;
	
	
	@BeforeTest
	public void init() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(" http://live.demoguru99.com/\r\n");
		this.startingPage = new StartingPage(driver);
		this.loginPage = new LoginPage(driver);
		this.mobilePage = new MobilePage(driver);
		this.sonyXperiaPage = new SonyXperiaPage(driver);
		this.checkoutCartPage = new CheckoutCartPage(driver);
		this.loginPage = new LoginPage(driver);
		this.createAccountPage = new CreateAccountPage(driver);
		this.welcomePage = new WelocmePage(driver);
		this.tvPage = new TVPage(driver);
		this.wishListPage = new WishListPage(driver);
		this.shareWishListPage =new ShareWishListPage(driver);
		this.shoppingCartPage = new ShoppingCartPage(driver);
		this.accountPage = new AccountPage(driver);
		this.backendLoginPage = new BackendloginPage(driver);
		this.backendPage = new BackendPage(driver);
		this.salesOrderPage = new SalesOrderPage(driver);
		this.compareProductsPopUpWindow =new CompareProductsPopUpWindow(driver);

		
		}
	
	
	
	@DataProvider(name="user-ids-passwords-data-provider-xlsx")
	public String[][] Logins() {
		
		 return  ExcelReadUtil.readFromExcelSheetWithoutFirstRow("src\\\\test\\\\resources\\\\accounts.xlsx", "accounts", 5);
	}
	
	@DataProvider(name="user-shipping-information-data-provider-xlsx")
	public String[][] ShippingInformation() {
		
		return ExcelReadUtil.readFromExcelSheetWithoutFirstRow("src\\\\test\\\\resources\\\\accounts.xlsx", "shippingInformation", 6);
	}
	
	
	@Test (dataProvider="user-ids-passwords-data-provider-xlsx")
	public void login(String firstName, String lastName, String email, String password, String confirmationPassword) {
		this.startingPage.goToLoginPage();
		this.loginPage.enterCredentialsAndLogIn(email, password);
	}
	
	
//	@Test
//	public void sortMobileListByName_TC1() throws InterruptedException {
//		assertEquals(this.startingPage.getTitleOfThePage(),"THIS IS DEMO SITE FOR   ");
//		startingPage.clickMobile();
//		List<String> list =  Utility.getTextFromWebElements(mobilePage.getSmartphones());
//		assertEquals(Utility.getTextFromWebElements(mobilePage.getSmartphonesSortedBy("Name")),Utility.sortByName(list));
//		}
	
//	@Test 
//	public void compareCostFromListAndFromDetailsPage_TC2() {
//		startingPage.clickMobile();
//		String priceFromList = mobilePage.getSonyXperiaPrice();
//		mobilePage.goToSonyXperiaPage();
//		assertEquals(sonyXperiaPage.getPrice(),priceFromList);
//		
//	}
	
//	@Test
//	public void addMoreProductThanInStore_TC3() {
//		startingPage.clickMobile();
//		mobilePage.addToCartSonyXperia();
//		shoppingCartPage.changeQuantity(1000);
//		shoppingCartPage.updateQuantity();
//		assertEquals(shoppingCartPage.getErrorMessage(),"* The maximum quantity allowed for purchase is 500.");
//		shoppingCartPage.emptyCart();
//		assertEquals(shoppingCartPage.getEmptyCartMessage(),"SHOPPING CART IS EMPTY");
//	}
	
//	@Test
//	public void compareTwoProducts_TC4() {
//		startingPage.clickMobile();
//		mobilePage.addToCompare();
//		mobilePage.comparePopUp();
//		this.compareProductsPopUpWindow.switchToThisPopUpWindow();
//		assertEquals(this.compareProductsPopUpWindow.getWindowTitle(),"COMPARE PRODUCTS");
//	}
	
	
//	@Test(dataProvider="user-ids-passwords-data-provider-xlsx")
//	public void register_TC5A(String firstName, String lastName, String emailAddress, String password, String confirmationPassword) throws InterruptedException, IOException {
//		
//		this.startingPage.goToLoginPage();
//		this.loginPage.clickCreateAccount();
//		this.createAccountPage.populateAllFieldsAndRegister(firstName, lastName, emailAddress, password, confirmationPassword);
//		assertEquals(this.welcomePage.getWelcomeMsg(),"Thank you for registering with Main Website Store.");
//		
//		}
	
//	@Test(dependsOnMethods = "login")
//	public void ShareWishList_TC5B() {
//		String email = "xyz@xyz.com";
//		this.welcomePage.goToTV();
//		this.tvPage.addToWishListLG();
//		this.wishListPage.shareWishListLG();
//		this.shareWishListPage.enterEmailAndCustomMessageAndClick(email);
//		assertEquals(this.wishListPage.getSuccesfulShareMsg(),"Your Wishlist has been shared.");
//	}
////
//	@Test(dataProvider="user-shipping-information-data-provider-xlsx", dependsOnMethods = "ShareWishList_TC5B")
//	public void purchaseProductTest_TC6(String address,String city,String state,String zip,String country,String telephone) {
//		this.welcomePage.goToMyWishList();
//		this.wishListPage.addToCartLG();
//		this.shoppingCartPage.proceedToCheckout();
//		this.checkoutCartPage.enterBillingDetails(address, city, state, zip, country, telephone);
//		assertEquals(this.checkoutCartPage.getShippingCost(),(double) 5.0*this.checkoutCartPage.getNumberOfProductsInBasket());
//		this.checkoutCartPage.continueFromShipping();
//		this.checkoutCartPage.selectMoneyOrderButton();
//		this.checkoutCartPage.continueFromPaymentMethod();
//		
//		assertEquals((this.checkoutCartPage.getGrandTotal() - this.checkoutCartPage.getSubTotal()),5.0*this.checkoutCartPage.getNumberOfProductsInBasket());
//		this.checkoutCartPage.placeOrder();
//		}
//	
//	
//	@Test(dependsOnMethods = "login")
//	public void saveOrderAsPDF_TC7() throws Exception {
//		this.accountPage.goToMyOrders();
//		this.accountPage.clickViewOrder();
//		this.accountPage.printOrderToPDF();
//	}
	
//	@Test(dataProvider="user-ids-passwords-data-provider-xlsx",dependsOnMethods = "login")
//	public void reorder_TC8(String firstName, String lastName, String email, String password, String confirmationPassword) throws Exception {
//		this.accountPage.reorder();
//		this.shoppingCartPage.changeQuantity(10);
//		this.shoppingCartPage.updateQuantity();
//		assertEquals(Double.parseDouble(this.shoppingCartPage.getGrandTotal().substring(1).replace(",", "")), this.shoppingCartPage.getFirstProductInTheLstPrice()*10);
//		this.shoppingCartPage.proceedToCheckout();
//		this.checkoutCartPage.continueFromBilling();
//		this.checkoutCartPage.continueFromShipping();
//		this.checkoutCartPage.selectMoneyOrderButton();
//		this.checkoutCartPage.continueFromPaymentMethod();
//		this.checkoutCartPage.placeOrder();
//		System.out.println(this.checkoutCartPage.getOrderNumber());
//		}
	
	
//	@Test()
//	public void verifyDiscountCoupon_TC9() {
//		this.startingPage.goToMobilePage();
//		this.mobilePage.addToCartIphone();
//		this.shoppingCartPage.enterDiscountCode("GURU50");
//		this.shoppingCartPage.applyDiscount();
//		double totalValueBeforeDiscount = Double.parseDouble(this.shoppingCartPage.getGrandTotal().replace("$", ""));
//		double discountValue = Double.parseDouble( this.shoppingCartPage.discountValue().replace("$", "").replace("-", ""));
//		assertEquals(discountValue/totalValueBeforeDiscount,0.05);
//		}
	

	

//	@Test
//	public void exportOrdersToCSV_TC10() throws Exception {
//	
//	driver.get("http://live.demoguru99.com/index.php/backendlogin");
//	this.backendLoginPage.enterUsername("user01");
//	this.backendLoginPage.enterPassword("guru99com");
//	this.backendLoginPage.clickLoginButton();
//	this.backendPage.closePopUpWindow();
//	this.backendPage.openOrders();
//	this.salesOrderPage.setPageNumber(5);
//	this.salesOrderPage.exportToCSV();
//	
//	}
//	

	
		
	
	@AfterTest
	public void after() {
		
//		driver.close();
	}

}
