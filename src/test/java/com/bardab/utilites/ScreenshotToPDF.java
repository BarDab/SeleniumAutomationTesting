package com.bardab.utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
public class ScreenshotToPDF {
	
		public static void screenShotToPDF (WebDriver driver) throws Exception 
		{
			
			// Capture screenshot and store it in byte[] array format
			byte[] input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			Document document = new Document();
			String output = "target\\"+"order.pdf";
			FileOutputStream fos = new FileOutputStream(output);

			// Instantiate the PDF writer
			PdfWriter writer = PdfWriter.getInstance(document, fos);

			// open the pdf for writing
			writer.open();
			document.open();

			// process content into image
			Image im = Image.getInstance(input);

			//set the size of the image
			im.scaleToFit(PageSize.A4.getWidth()/2, PageSize.A4.getHeight());

			// add the captured image to PDF
			document.add(im);
			document.add(new Paragraph(" "));

			//close the files and write to local system
			document.close();
			writer.close();
		}
		
		
	
	
}
