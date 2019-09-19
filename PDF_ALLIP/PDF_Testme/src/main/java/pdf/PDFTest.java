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
import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.File;
import java.io.IOException;

public class PDFTest
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
        final String[] names = { "DATUM", "RECHNUNGSKONTONUMMER", "KUNDENNUMMERFESTNETZ", "KUNDENNAME", "2171", "2171.1", "2171.2", "2171.3", "2171.4", "2171.5", "2171.6", "2171.7", "2171.8", "2171.9", "2171.10", "2171.11", "2171.12", "2171.13", "2171.14", "2171.15", "2171.16", "2171.17", "2171.18", "2171.19", "2171.20", "2171.21", "2171.22", "2171.23", "2171.24", "2171.25", "2171.26", "2171.27", "2171.28", "2171.29", "2171.30", "2171.31", "2171.32", "2171.33", "2171.34", "2171.35", "2171.36", "2171.37", "2171.38", "2171.39", "2171.40", "2171.41", "VO-MAIL", "FESTNETZVO", "VO-TEL" };
        final StringBuffer sb = new StringBuffer();
        final File sourceFile = new File(path);
        final PDDocument document = PDDocument.load(sourceFile);
        final PDDocumentCatalog pdCat = document.getDocumentCatalog();
        final PDAcroForm acroForm = pdCat.getAcroForm();
        if (acroForm != null) {
            for (int i = 0; i < names.length; ++i) {
                final String fieldName = names[i];
                final PDField field = acroForm.getField(fieldName);
                if (field != null) {
                    sb.append(field.getValueAsString());
                    sb.append(";");
                }
            }
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
        System.out.print("\"" + field.getFullyQualifiedName() + "\",");
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
