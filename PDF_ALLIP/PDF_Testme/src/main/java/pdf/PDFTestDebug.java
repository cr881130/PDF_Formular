// 
// Decompiled by Procyon v0.5.36
// 

package pdf;

import org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox;
import org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import java.util.Iterator;
import java.util.List;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import java.io.FileWriter;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.File;
import java.io.IOException;

public class PDFTestDebug
{
    public static void main(final String[] args) throws Exception, IOException {
        if (readFile(args[0])) {
            System.exit(0);
        }
        else {
            System.exit(-1);
        }
    }
    
    private static boolean readFile(final String path) throws InvalidPasswordException, IOException {
        boolean result = true;
        final StringBuffer sb = new StringBuffer();
        final File sourceFile = new File(path);
        final PDDocument document = PDDocument.load(sourceFile);
        final PDFTextStripper pdfStripper = new PDFTextStripper();
        final String text = pdfStripper.getText(document);
        text.contains("FOR 60002171 / 1018");
        System.out.println("PDFTestDebug.readFile() " + text);
        final PDDocumentCatalog pdCat = document.getDocumentCatalog();
        final PDAcroForm acroForm = pdCat.getAcroForm();
        if (acroForm != null) {
            final List<PDField> fields = acroForm.getFields();
            for (final PDField pdField : fields) {
                readField(pdField);
            }
        }
        else {
            result = false;
        }
        System.out.println("PDFTest.readFile() " + sb.toString());
        final FileWriter fw = new FileWriter(new File(String.valueOf(path.substring(0, path.length() - 3)) + "csv"));
        fw.write(sb.toString());
        fw.flush();
        fw.close();
        document.close();
        return result;
    }
    
    private static void readField(final PDField field) {
        System.out.println("\"" + field.getFullyQualifiedName() + "\"=" + field.getValueAsString() + ",");
        if (field instanceof PDNonTerminalField) {
            final PDNonTerminalField p = (PDNonTerminalField)field;
            final List<PDField> children = p.getChildren();
            for (final PDField child : children) {
                readField(child);
            }
        }
        if (field instanceof PDCheckBox) {
            final PDCheckBox p2 = (PDCheckBox)field;
            p2.getAcroForm().getFieldTree();
        }
    }
}
