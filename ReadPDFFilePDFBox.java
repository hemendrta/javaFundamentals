package demoproject;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPDFFilePDFBox {

	public static void main(String[] args) throws IOException {
		
		long start=System.currentTimeMillis();

		File file = new File("D:\\Hemendra Data\\HemendraResume.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		String text = pdfTextStripper.getText(document);
		System.out.println(text);
		
		long end=System.currentTimeMillis();
		System.out.println();
		System.out.println(end-start);
	}

}
