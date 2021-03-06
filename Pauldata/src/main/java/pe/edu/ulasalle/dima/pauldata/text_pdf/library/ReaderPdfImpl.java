package pe.edu.ulasalle.dima.pauldata.text_pdf.library;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class ReaderPdfImpl implements IReaderPdf {

	public String readPDF(FileInputStream fstream) throws IOException {
		
		InputStream instream = fstream;
		PDDocument document = PDDocument.load(instream);
    	StringBuilder str = new StringBuilder();
		
		document.getClass();

        if (!document.isEncrypted()) {
		
            PDFTextStripperByArea stripper = new PDFTextStripperByArea();
            stripper.setSortByPosition(true);

            PDFTextStripper tStripper = new PDFTextStripper();

            String pdfFileInText = tStripper.getText(document);

            String lines[] = pdfFileInText.split("\\r?\\n");
            for (String line : lines) {
            	str.append(line);
            }
        }
        
		return str.toString();
		
	}
	

	
}
