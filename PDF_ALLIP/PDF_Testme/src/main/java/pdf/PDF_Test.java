package pdf;


import java.text.ParseException;
import java.util.Properties;
import java.util.Iterator;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import java.util.List;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.pdmodel.PDDocument;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PDF_Test {

    public static void main(final String[] args) {
        boolean readFile = false;
        try {
            readFile = readFile("C:\\Users\\cristian.quintero\\Documents\\MIG3_2171_0919_BK_PW_KA_Classic-ISDN_zu_KA_Plus_PlusRegio_000.pdf");

        }
        catch (IOException e) {
            try {
                final FileWriter fw = new FileWriter(new File(String.valueOf(args[0].substring(0, args[0].length() - 3)) + "error.txt"));
                fw.write(e.getLocalizedMessage());
                fw.flush();
                fw.close();
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        if (readFile) {
            System.exit(0);
        }
        else {
            System.exit(-1);
        }
    }
    private static boolean readFile(final String path) throws IOException {
        boolean knownFormular = false;
        FormularData kfd = null;
        final File sourceFile = new File(path);
        final List<String> fehlers = new ArrayList<String>();
        PDDocument document = null;
        System.out.println("Entonces que o que");
        try {
            document = PDDocument.load(sourceFile);
        }
        catch (Exception e) {
            fehlers.add("Datei ist kein PDF");
            System.out.println("Datei ist kein PDF");
        }
        if (document != null) {
            PDFTextStripper pdfStripper = null;
            try {
                pdfStripper = new PDFTextStripper();
            }
            catch (IOException e2) {
                fehlers.add("Datei ist kein digital PDF- hat kein Text");
                System.out.println("Datei ist kein digital PDF- hat kein Text");
            }
            final PDDocumentCatalog pdCat = document.getDocumentCatalog();
            if (pdCat == null) {
                fehlers.add("Datei ist kein digital PDF- hat kein Formular");
                System.out.println("Datei ist kein digital PDF- hat kein Formular");
            }
            else {
                final PDAcroForm acroForm = pdCat.getAcroForm();
                if (acroForm == null) {
                    fehlers.add("Datei ist kein digital PDF- hat kein Formular");
                    System.out.println("Datei ist kein digital PDF- hat kein Formular");
                }
                else {
                    String text = null;
                    try {
                        text = pdfStripper.getText(document);
                    }
                    catch (IOException e3) {
                        fehlers.add("Datei ist kein Digital PDF - hat kein Text");
                        System.out.println("Datei ist kein Digital PDF - hat kein Text");
                    }
                    if (text != null) {
                        if (text.contains("FOR 60002171 / 0219")) {
                            knownFormular = true;
                            kfd = v201902KAC2KAP(acroForm);
                            kfd.check();
                        }
                        if (text.contains("FOR 60002171 / 0319")) {
                            knownFormular = true;
                            kfd = v201903KAC2KAP(acroForm);
                            kfd.check();
                        }
                        if (text.contains("FOR 60002171 / 1018")) {
                            knownFormular = true;
                            kfd = v201810KAC2KAP(acroForm);
                            kfd.check();
                        }
                        if (text.contains("FOR 60002172 / 0319")) {
                            knownFormular = true;
                            kfd = v201903AAP(acroForm);
                            kfd.check();
                        }
                        if (text.contains("FOR 60002171 / 0919")) {
                            knownFormular = true;
                            kfd = v201909KAC2KAP(acroForm);
                            kfd.check();
                            System.out.println("Paso por aqui");
                        }
                        if (!knownFormular) {
                            fehlers.add("Unknown Type");
                        }
                    }
                }
            }
        }
        if (knownFormular) {
            final int indexOfNameStart = path.lastIndexOf("\\") + 1;
            final String sourceFileName = path.substring(indexOfNameStart);
            kfd.setSourceFileName(sourceFileName);
            final FileWriter fw = new FileWriter(new File(String.valueOf(path.substring(0, path.length() - 3)) + "csv"));
            fw.write(kfd.toCSVString());
            fw.flush();
            fw.close();
            document.close();
        }
        else {
            final FileWriter fw2 = new FileWriter(new File(String.valueOf(path.substring(0, path.length() - 3)) + "fehler.txt"));
            for (final String string : fehlers) {
                fw2.write(string);
                fw2.write(System.lineSeparator());
            }
            fw2.flush();
            fw2.close();
            document.close();
        }
        return knownFormular;
    }

    private static AAFormularData v201903AAP(final PDAcroForm acroForm) {
        final String[] namen = { "VO-MAIL", "VO-TEL", "2172", "2172.2", "2172.1", "2172.3", "2172.4", "2172.5", "2172.6", "2172.7", "2172.8", "2172.9", "2172.10", "2172.11", "2172.18", "2172.19", "2172.20", "2172.21", "2172.22", "2172.23", "2172.24", "2172.25", "2172.26", "2172.27", "2172.35", "2172.36", "2172.37", "2172.38", "2172.39", "2172.43", "2172.12", "2172.13", "2172.14", "2172.15", "2172.16", "2172.17", "2172.28", "2172.29", "2172.30", "2172.31", "2172.40", "2172.41", "2172.42", "2172.44", "2172.45", "2172.51", "2172.52", "2172.49", "2172.50", "2172.48", "2172.47", "2172.46", "2172.32", "2172.33", "2172.34", "2042", "2042.1a", "2042.1b", "2042.1", "2042.2", "2042.3", "2042.4", "2042.5", "2042.6", "2042.7", "2042.8", "2042.9", "2042.10", "2042.11", "2042.12", "2042.13", "2042.14", "2042.15", "2042.16", "2042.18", "2042.17", "2042.19", "2042.20", "2042.21", "2042.23", "2042.25", "2042.26", "2042.27", "2042.28", "2042.29", "2042.30", "2042.31", "2042.32", "2042.33", "2042.34", "2042.35", "2042.36", "2042.37", "2042.38", "2042.39", "2042.40", "2042.41", "2042.42", "2042.43", "2042.44", "2042.67", "2042.68", "2042.69", "2042.70", "2042.71", "2042.72", "2042.73", "2042.74", "2042.75", "2042.76", "2042.77", "2042.78", "2042.79", "2042.80", "2042.81", "2042.82", "2042.83", "2042.84", "2042.85", "2042.86", "2042.87", "2042.88", "2042.89", "2042.91", "2042.92", "2042.93", "2042.94", "2042.95", "2042.96", "2042.97", "2042.98", "2042.99", "2042.100", "2042.101", "2042.102", "2042.103", "2042.104", "2042.105", "2042.106", "2042.107", "2042.108", "2042.109", "2042.110", "DATUM", "KUNDENNAME", "KUNDENNUMMERFESTNETZ", "RECHNUNGSKONTONUMMER", "1583", "1583.22", "1583.24", "1583.90", "OneGroup ID", "FESTNETZVO", "2043", "2043.1", "2043.2", "2043.5", "2043.6", "2043.7", "2043.8", "2043.9", "2043.10", "2043.11", "2043.12", "2043.13", "2043.14", "2108", "2108.1", "2108.2", "2108.3", "2108.4" };
        final Properties p = new Properties();
        readFields(p, acroForm, namen);
        final AAFormularData kfd = new AAFormularData();
        kfd.setVoEMail(p.getProperty("VO-MAIL"));
        kfd.setVoNummer(p.getProperty("FESTNETZVO"));
        kfd.setVoTelNr(p.getProperty("VO-TEL"));
        kfd.setCustomerName(p.getProperty("KUNDENNAME"));
        try {
            kfd.setOrderDate(PDFExctractor.sdf.parse(p.getProperty("DATUM")));
        }
        catch (Exception ex) {}

        //kfd.setCustomerNumber(p.getProperty("KUNDENNUMMERFESTNETZ"));
        String KundeNumber = null;
        KundeNumber=p.getProperty("KUNDENNUMMERFESTNETZ");
        if (KundeNumber.length()<3){
            kfd.setCustomerNumber("Keine");
            //kfd.getFehlers().add("Kundennummer leer");
        }else if (KundeNumber!=null){
            kfd.setCustomerNumber(KundeNumber);
        }//Added

        kfd.setAccount(p.getProperty("RECHNUNGSKONTONUMMER"));
        kfd.setSurname(p.getProperty("2172.2"));
        kfd.setName(p.getProperty("2172.1"));
        kfd.setStreet(p.getProperty("2172.3"));
        kfd.setHouseNumber(p.getProperty("2172.4"));
        kfd.setZipCode(p.getProperty("2172.5"));
        kfd.setCity(p.getProperty("2172.6"));
        kfd.setTaeBuilding(p.getProperty("2172.7"));
        kfd.setTaeFloor(p.getProperty("2172.8"));
        kfd.setTaeRoom(p.getProperty("2172.9"));
        kfd.setTaeExtended(p.getProperty("2172.10"));
        kfd.setTcGender(calcGender(p, "2172.11"));
        kfd.setTcName(p.getProperty("2172.12"));
        kfd.setTcSurname(p.getProperty("2172.13"));
        kfd.setTcPhone(p.getProperty("2172.14"));
        kfd.setTcMobile(p.getProperty("2172.15"));
        kfd.setTcFax(p.getProperty("2172.16"));
        kfd.setTcEMail(p.getProperty("2172.17"));
        kfd.setLocName(p.getProperty("2172.18"));
        kfd.setLocSurname(p.getProperty("2172.19"));
        kfd.setLocStreet(p.getProperty("2172.20"));
        kfd.setLocHouseNumber(p.getProperty("2172.21"));
        kfd.setLocZipCode(p.getProperty("2172.22"));
        kfd.setLocCity(p.getProperty("2172.23"));
        kfd.setPrefix(p.getProperty("2172.24"));
        kfd.setNumber(p.getProperty("2172.25"));
        kfd.setExtensionStart(p.getProperty("2172.26"));
        kfd.setExtensionEnde(p.getProperty("2172.27"));
        kfd.setVtcGender(calcGender(p, "2172.28"));
        kfd.setVtcName(p.getProperty("2172.29"));
        kfd.setVtcSurname(p.getProperty("2172.30"));
        kfd.setVtcPhone(p.getProperty("2172.31"));
        kfd.setVtcMobile(p.getProperty("2172.32"));
        kfd.setVtcFax(p.getProperty("2172.33"));
        kfd.setVtcEMail(p.getProperty("2172.34"));
        kfd.setOldRate(getBooleanFromField(p.getProperty("2172.35")));
        String tarifID = null;
        final String tarif = p.getProperty("2172.36");
        if (tarif != null) {
            final String s;
            switch (s = tarif) {
                case "1": {
                    tarifID = "Phone XXL";
                    break;
                }
                case "2": {
                    tarifID = "Phone XL";
                    break;
                }
                case "3": {
                    tarifID = "Phone L";
                    break;
                }
                case "4": {
                    tarifID = "Phone M";
                    break;
                }
                default:
                    break;
            }
        }
        kfd.setRate(tarifID);
        kfd.setFixNetFlat(getBooleanFromField(p.getProperty("2172.37")));
        kfd.setMobileFlat(getBooleanFromField(p.getProperty("2172.38")));
        kfd.setInt1Flat(getBooleanFromField(p.getProperty("2172.39")));
        kfd.setInt2Flat(getBooleanFromField(p.getProperty("2172.40")));
        kfd.setInt3Flat(getBooleanFromField(p.getProperty("2172.41")));
        final String count = p.getProperty("2172.42");
        //kfd.setVtcFax(count+" That is");
        String countOfLines = "Keine";
        if (count != null) {
            final String s2;
            switch (s2 = count) {
                case "2": {
                    countOfLines = "2";
                    break;
                }
                case "4": {
                    countOfLines = "4";
                    break;
                }
                case "5": {
                    countOfLines = "6";
                    break;
                }
                case "3": {
                    countOfLines = "8";
                    break;
                }
                default:
                    break;
            }
        }
        kfd.setCountOfLines(countOfLines);
        final String dSL = p.getProperty("2172.43");
        String downloadSpeed = "kein Internet Option";
        if (dSL != null) {
            final String s3;
            switch (s3 = dSL) {
                case "1": {
                    downloadSpeed = "BSA 16";
                    break;
                }
                case "2": {
                    downloadSpeed = "BSA 50";
                    break;
                }
                case "3": {
                    downloadSpeed = "BSA 100";
                    break;
                }
                default:
                    break;
            }
        }
        kfd.setDownloadSpeed(downloadSpeed);
        kfd.setCentral(getBooleanFromField(p.getProperty("2172.44")));
        kfd.setIrregular(getBooleanFromField(p.getProperty("2172.45")));
        kfd.setClip(getBooleanFromField(p.getProperty("2172.46")));
        kfd.setClassicPlus(getBooleanFromField(p.getProperty("2172.47")));
        kfd.setFitter(getBooleanFromField(p.getProperty("2172.48")));
        kfd.setAdditionalSevice(p.getProperty("2172.49"));
        kfd.setAction(p.getProperty("2172.50"));
        int durration = 24;
        final String durrationnBox = p.getProperty("2172.51");
        Label_2504: {
            if (durrationnBox != null) {
                final String s4;
                switch (s4 = durrationnBox) {
                    case "1": {
                        durration = 36;
                        break Label_2504;
                    }
                    case "2": {
                        durration = 48;
                        break Label_2504;
                    }
                    case "3": {
                        durration = 60;
                        break Label_2504;
                    }
                    case "Off": {
                        durration = 24;
                        break Label_2504;
                    }
                    default:
                        break;
                }
                durration = 24;
            }
        }
        kfd.setDurration(durration);
        if (p.getProperty("2172.52") != null) {
            try {
                kfd.setPreferredDate(PDFExctractor.sdf.parse(p.getProperty("2172.52")));
            }
            catch (ParseException ex2) {}
        }
        kfd.setOneGroupID(p.getProperty("OneGroup ID"));
        kfd.setLocationRefNum1(p.getProperty("2042.1"));
        kfd.setPilotrufnummer1(p.getProperty("2042.2"));
        kfd.setPhoneNumberAndRange1(p.getProperty("2042.3"));
        kfd.setPhoneRange1Ende(p.getProperty("2042.4"));
        kfd.setPhoneNumberAndRange2(p.getProperty("2042.5"));
        kfd.setPhoneRange2Ende(p.getProperty("2042.6"));
        kfd.setPhoneNumberAndRange3(p.getProperty("2042.7"));
        kfd.setPhoneRange3Ende(p.getProperty("2042.8"));
        kfd.setPhoneNumberAndRange4(p.getProperty("2042.9"));
        kfd.setPhoneRange4Ende(p.getProperty("2042.10"));
        kfd.setPhoneNumberAndRange5(p.getProperty("2042.11"));
        kfd.setPhoneRange5Ende(p.getProperty("2042.12"));
        kfd.setPhoneNumberAndRange6(p.getProperty("2042.13"));
        kfd.setPhoneRange6Ende(p.getProperty("2042.14"));
        kfd.setPhoneNumbetAndRange7(p.getProperty("2042.15"));
        kfd.setPhoneRange7Ende(p.getProperty("2042.16"));
        kfd.setPhoneNumberAndRange8(p.getProperty("2042.17"));
        kfd.setPhoneRange8Ende(p.getProperty("2042.18"));
        kfd.setPhoneNumberAndRange9(p.getProperty("2042.19"));
        kfd.setPhoneRange9Ende(p.getProperty("2042.20"));
        kfd.setPhoneNumberAndRange10(p.getProperty("2042.21"));
        kfd.setPhoneRange10Ende(p.getProperty("1583.22"));
        kfd.setLocationRefNum3(p.getProperty("2042.23"));
        kfd.setPilotrufnummer3(p.getProperty("1583.24"));
        kfd.setPhoneNumberAndRange21(p.getProperty("2042.25"));
        kfd.setPhoneRange21Ende(p.getProperty("2042.26"));
        kfd.setPhoneNumberAndRange22(p.getProperty("2042.27"));
        kfd.setPhoneRange22Ende(p.getProperty("2042.28"));
        kfd.setPhoneNumberAndRange23(p.getProperty("2042.29"));
        kfd.setPhoneRange23Ende(p.getProperty("2042.30"));
        kfd.setPhoneNumberAndRange24(p.getProperty("2042.31"));
        kfd.setPhoneRange24Ende(p.getProperty("2042.32"));
        kfd.setPhoneNumberAndRange25(p.getProperty("2042.33"));
        kfd.setPhoneRange25Ende(p.getProperty("2042.34"));
        kfd.setPhoneNumberAndRange26(p.getProperty("2042.35"));
        kfd.setPhoneRange26Ende(p.getProperty("2042.36"));
        kfd.setPhoneNumberAndRange27(p.getProperty("2042.37"));
        kfd.setPhoneRange27Ende(p.getProperty("2042.38"));
        kfd.setPhoneNumberAndRange28(p.getProperty("2042.39"));
        kfd.setPhoneRange28Ende(p.getProperty("2042.40"));
        kfd.setPhoneNumberAndRange29(p.getProperty("2042.41"));
        kfd.setPhoneRange29Ende(p.getProperty("2042.42"));
        kfd.setPhoneNumberAndRange30(p.getProperty("2042.43"));
        kfd.setPhoneRange30Ende(p.getProperty("2042.44"));
        kfd.setLocationRefNum2(p.getProperty("2042.67"));
        kfd.setPilotrufnummer2(p.getProperty("2042.68"));
        kfd.setPhoneNumberAndRange11(p.getProperty("2042.69"));
        kfd.setPhoneRange11Ende(p.getProperty("2042.70"));
        kfd.setPhoneNumberAndRange12(p.getProperty("2042.71"));
        kfd.setPhoneRange12Ende(p.getProperty("2042.72"));
        kfd.setPhoneNumberAndRange13(p.getProperty("2042.73"));
        kfd.setPhoneRange13Ende(p.getProperty("2042.74"));
        kfd.setPhoneNumberAndRange14(p.getProperty("2042.75"));
        kfd.setPhoneRange14Ende(p.getProperty("2042.76"));
        kfd.setPhoneNumberAndRange15(p.getProperty("2042.77"));
        kfd.setPhoneRange15Ende(p.getProperty("2042.78"));
        kfd.setPhoneNumberAndRange16(p.getProperty("2042.79"));
        kfd.setPhoneRange16Ende(p.getProperty("2042.80"));
        kfd.setPhoneNumberAndRange17(p.getProperty("2042.81"));
        kfd.setPhoneRange17Ende(p.getProperty("2042.82"));
        kfd.setPhoneNumberAndRange18(p.getProperty("2042.83"));
        kfd.setPhoneRange18Ende(p.getProperty("2042.84"));
        kfd.setPhoneNumberAndRange19(p.getProperty("2042.85"));
        kfd.setPhoneRange19Ende(p.getProperty("2042.86"));
        kfd.setPhoneNumberAndRange20(p.getProperty("2042.87"));
        kfd.setPhoneRange20Ende(p.getProperty("2042.88"));
        kfd.setLocationRefNum4(p.getProperty("2042.89"));
        kfd.setPilotrufnummer4(p.getProperty("1583.90"));
        kfd.setPhoneNumberAndRange31(p.getProperty("2042.91"));
        kfd.setPhoneRange31Ende(p.getProperty("2042.92"));
        kfd.setPhoneNumberAndRange32(p.getProperty("2042.93"));
        kfd.setPhoneRange32Ende(p.getProperty("2042.94"));
        kfd.setPhoneNumberAndRange33(p.getProperty("2042.95"));
        kfd.setPhoneRange33Ende(p.getProperty("2042.96"));
        kfd.setPhoneNumberAndRange34(p.getProperty("2042.97"));
        kfd.setPhoneRange34Ende(p.getProperty("2042.98"));
        kfd.setPhoneNumberAndRange35(p.getProperty("2042.99"));
        kfd.setPhoneRange35Ende(p.getProperty("2042.100"));
        kfd.setPhoneNumberAndRange36(p.getProperty("2042.101"));
        kfd.setPhoneRange36Ende(p.getProperty("2042.102"));
        kfd.setPhoneNumberAndRange37(p.getProperty("2042.103"));
        kfd.setPhoneRange37Ende(p.getProperty("2042.104"));
        kfd.setPhoneNumberAndRange38(p.getProperty("2042.105"));
        kfd.setPhoneRange38Ende(p.getProperty("2042.106"));
        kfd.setPhoneNumberAndRange39(p.getProperty("2042.107"));
        kfd.setPhoneRange39Ende(p.getProperty("2042.108"));
        kfd.setPhoneNumberAndRange40(p.getProperty("2042.109"));
        kfd.setPhoneRange40Ende(p.getProperty("2042.110"));
        kfd.setAapOneGroupID(p.getProperty("2043.5"));
        kfd.setAapOneGroupPhoneNumber(p.getProperty("2043.6"));
        kfd.setAapAdministrationsFitma(p.getProperty("2043.7"));
        kfd.setAapAdministrationsNameAndSurname(p.getProperty("2043.8"));
        kfd.setAapAdministrationsStreetAndHouse(p.getProperty("2043.9"));
        kfd.setAapAdministrationsZipAndCity(p.getProperty("2043.10"));
        kfd.setAapAdministrationsPhoneNumber(p.getProperty("2043.11"));
        kfd.setAapAdministrationsMobile(p.getProperty("2043.12"));
        kfd.setAapAdministrationsFax(p.getProperty("2043.13"));
        kfd.setAapAdministrationsEMail(p.getProperty("2043.14"));
        return kfd;
    }

    private static String calcGender(final Properties p, final String key) {
        String gender = null;
        if (p.getProperty(key) != null) {
            if ("1".equals(p.getProperty(key))) {
                gender = "Frau";
            }
            if ("2".equals(p.getProperty(key))) {
                gender = "Herr";
            }
        }
        return gender;
    }

    private static KAFormularData v201909KAC2KAP(final PDAcroForm acroForm){
        final String[] namen = { "DATUM", "RECHNUNGSKONTONUMMER", "KUNDENNUMMERFESTNETZ", "KUNDENNAME", "VO-MAIL", "FESTNETZVO", "VO-TEL", "2171", "2171.1", "2171.2", "2171.3", "2171.4", "2171.5", "2171.6", "2171.7", "2171.8", "2171.9", "2171.10", "2171.11", "2171.12", "2171.13", "2171.14", "2171.15", "2171.16", "2171.17", "2171.18", "2171.19", "2171.20", "2171.21", "2171.22", "2171.23", "2171.24", "2171.25", "2171.26", "2171.27", "2171.28" , "2171.31", "2171.32", "2171.34", "2171.35", "2171.36", "2171.37", "2171.38", "2171.39", "2171.40", "2171.41" };
        final Properties p = new Properties();
        readFields(p, acroForm, namen);
        final KAFormularData kfd = new KAFormularData();
        kfd.setVoEMail(p.getProperty("VO-MAIL"));
        kfd.setVoNummer(p.getProperty("FESTNETZVO"));
        kfd.setVoTelNr(p.getProperty("VO-TEL"));
        kfd.setCustomerName(p.getProperty("KUNDENNAME"));
        try {
            kfd.setOrderDate(PDFExctractor.sdf.parse(p.getProperty("DATUM")));
        }
        catch (Exception ex) {}

        String KundeNumber = null;
        KundeNumber=p.getProperty("KUNDENNUMMERFESTNETZ");
        if (KundeNumber.length()<3){
            kfd.setCustomerNumber("Keine");
            //kfd.getFehlers().add("Kundennummer leer");
        }else if (KundeNumber!=null){
            kfd.setCustomerNumber(KundeNumber);
        }//Added

        kfd.setAccount(p.getProperty("RECHNUNGSKONTONUMMER"));
        kfd.setName(p.getProperty("2171.1"));
        kfd.setSurname(p.getProperty("2171.2"));
        kfd.setStreet(p.getProperty("2171.3"));
        kfd.setHouseNumber(p.getProperty("2171.4"));
        kfd.setZipCode(p.getProperty("2171.5"));
        //boolean ZipCodebool;
        //ZipCodebool= ValidationTools.isNumeric(kfd.getZipCode());

        kfd.setCity(p.getProperty("2171.6"));
        String gender = null;
        if (p.getProperty("2171.7") != null) {
            if ("1".equals(p.getProperty("2171.7"))) {
                gender = "Frau";
            }
            if ("2".equals(p.getProperty("2171.7"))) {
                gender = "Herr";
            }
        }
        kfd.setTcGender(gender);
        kfd.setTcName(p.getProperty("2171.8"));
        kfd.setTcSurname(p.getProperty("2171.9"));
        kfd.setTcPhone(p.getProperty("2171.10"));
        kfd.setTcMobile(p.getProperty("2171.11"));
        kfd.setTcFax(p.getProperty("2171.12"));
        kfd.setTcEMail(p.getProperty("2171.13"));
        kfd.setLocName(p.getProperty("2171.14"));
        kfd.setLocSurname(p.getProperty("2171.15"));
        kfd.setLocStreet(p.getProperty("2171.16"));
        kfd.setLocHouseNumber(p.getProperty("2171.17"));
        kfd.setLocZipCode(p.getProperty("2171.18"));
        kfd.setLocCity(p.getProperty("2171.19"));
        kfd.setPrefix(p.getProperty("2171.20"));
        kfd.setNumber(p.getProperty("2171.21"));
        kfd.setOldRate(getBooleanFromField(p.getProperty("2171.22")));
        String tarifID = null;
        final String tarif = p.getProperty("2171.23");
        if (tarif != null) {
            final String s;
            switch (s = tarif) {
                case "1": {
                    tarifID = "Phone XXL";
                    break;
                }
                case "2": {
                    tarifID = "Phone XL";
                    break;
                }
                case "3": {
                    tarifID = "Phone L";
                    break;
                }
                case "4": {
                    tarifID = "Phone M";
                    break;
                }
                default:
                    break;
            }
        }
        kfd.setRate(tarifID);
        kfd.setFixNetFlat(getBooleanFromField(p.getProperty("2171.24")));
        kfd.setMobileFlat(getBooleanFromField(p.getProperty("2171.25")));
        kfd.setInt1Flat(getBooleanFromField(p.getProperty("2171.26")));
        kfd.setInt2Flat(getBooleanFromField(p.getProperty("2171.27")));
        kfd.setInt3Flat(getBooleanFromField(p.getProperty("2171.28")));
        final String talDSL = p.getProperty("2171.30");
        String talDSLId = null;
        boolean tal = false;
        if (talDSL != null) {
            tal=true;
            final String s2;
            switch (s2 = talDSL) {
                case "1": {
                    talDSLId = "TAL 16";
                    break;
                }
                case "2": {
                    talDSLId = "TAL 50";
                    break;
                }
                default:
                    break;
            }
        }
        final String regioDSL = p.getProperty("2171.31");
        String regioDSLID = null;
        boolean regio = false;
        if (regioDSL != null) {
            regio = true;
            final String s3;
            switch (s3 = regioDSL) {
                case "1": {
                    regioDSLID = "BSA 16";
                    break;
                }
                case "2": {
                    regioDSLID = "BSA 50";
                    break;
                }
                case "3": {
                    regioDSLID = "BSA 100";
                    break;
                }
                case "4": {
                    regioDSLID = "BSA 250";
                    break;
                }
                default:
                    break;
            }
        }
        if (talDSLId == null && regioDSLID == null) {
            kfd.setDownloadSpeed("kein");
            kfd.getFehlers().add("Bandbreite ist leer");
        }
        else if (talDSLId != null && regioDSLID != null) {
            kfd.getFehlers().add("TAL & BSA sind ausgew\u00e4hlt");
            kfd.setDownloadSpeed("kein");
        }
        else if (talDSLId == null && regioDSLID != null) {
            kfd.setDownloadSpeed(regioDSLID);
        }
        else if(talDSLId != null && regioDSLID == null) {//Added
            kfd.setDownloadSpeed(talDSLId);
        }

        kfd.setStaticIP(getBooleanFromField(p.getProperty("2171.32")));
        kfd.setClir(getBooleanFromField(p.getProperty("2171.33")));
        kfd.setLock900(getBooleanFromField(p.getProperty("2171.34")));
        kfd.setLockForeign(getBooleanFromField(p.getProperty("2171.35")));
        kfd.setClassicPlus(getBooleanFromField(p.getProperty("2171.36")));
        kfd.setFitter(getBooleanFromField(p.getProperty("2171.37")));
        kfd.setAdditionalSevice(p.getProperty("2171.38"));
        kfd.setAction(p.getProperty("2171.39"));
        int durration = 24;
        final String durrationnBox = p.getProperty("2171.40");
        Label_1548: {
            if (durrationnBox != null) {

                final String s4;
                switch (s4 = durrationnBox) {
                    case "1": {
                        durration = 36;
                        break Label_1548;
                    }
                    case "2": {
                        durration = 48;
                        break Label_1548;
                    }
                    case "3": {
                        durration = 60;
                        break Label_1548;
                    }
                    case "Off": {
                        durration = 24;
                        break Label_1548;
                    }
                    default:
                        durration = 24;
                        break;
                }

            }
        }


        kfd.setDurration(durration);
        if (p.getProperty("2171.41") != null) {
            try {
                kfd.setPreferredDate(PDFExctractor.sdf.parse(p.getProperty("2171.41")));
            }
            catch (ParseException ex2) {}
        }
        return kfd;
    }

    private static KAFormularData v201902KAC2KAP(final PDAcroForm acroForm) {
        final String[] namen = { "DATUM", "RECHNUNGSKONTONUMMER", "KUNDENNUMMERFESTNETZ", "KUNDENNAME", "VO-MAIL", "FESTNETZVO", "VO-TEL", "2171", "2171.1", "2171.2", "2171.3", "2171.4", "2171.5", "2171.6", "2171.7", "2171.8", "2171.9", "2171.10", "2171.11", "2171.12", "2171.13", "2171.14", "2171.15", "2171.16", "2171.17", "2171.18", "2171.19", "2171.20", "2171.21", "2171.22", "2171.23", "2171.24", "2171.25", "2171.26", "2171.27", "2171.28", "2171.30", "2171.31", "2171.32", "2171.33", "2171.34", "2171.35", "2171.36", "2171.37", "2171.38", "2171.39", "2171.40", "2171.41" };
        final Properties p = new Properties();
        readFields(p, acroForm, namen);
        final KAFormularData kfd = new KAFormularData();
        kfd.setVoEMail(p.getProperty("VO-MAIL"));
        kfd.setVoNummer(p.getProperty("FESTNETZVO"));
        kfd.setVoTelNr(p.getProperty("VO-TEL"));
        kfd.setCustomerName(p.getProperty("KUNDENNAME"));
        try {
            kfd.setOrderDate(PDFExctractor.sdf.parse(p.getProperty("DATUM")));
        }
        catch (Exception ex) {}

        String KundeNumber = null;
        KundeNumber=p.getProperty("KUNDENNUMMERFESTNETZ");
        if (KundeNumber.length()<3){
            kfd.setCustomerNumber("Keine");
            //kfd.getFehlers().add("Kundennummer leer");
        }else if (KundeNumber!=null){
            kfd.setCustomerNumber(KundeNumber);
        }//Added

        kfd.setAccount(p.getProperty("RECHNUNGSKONTONUMMER"));
        kfd.setName(p.getProperty("2171.1"));
        kfd.setSurname(p.getProperty("2171.2"));
        kfd.setStreet(p.getProperty("2171.3"));
        kfd.setHouseNumber(p.getProperty("2171.4"));
        kfd.setZipCode(p.getProperty("2171.5"));
        //boolean ZipCodebool;
        //ZipCodebool= ValidationTools.isNumeric(kfd.getZipCode());

        kfd.setCity(p.getProperty("2171.6"));
        String gender = null;
        if (p.getProperty("2171.7") != null) {
            if ("1".equals(p.getProperty("2171.7"))) {
                gender = "Frau";
            }
            if ("2".equals(p.getProperty("2171.7"))) {
                gender = "Herr";
            }
        }
        kfd.setTcGender(gender);
        kfd.setTcName(p.getProperty("2171.8"));
        kfd.setTcSurname(p.getProperty("2171.9"));
        kfd.setTcPhone(p.getProperty("2171.10"));
        kfd.setTcMobile(p.getProperty("2171.11"));
        kfd.setTcFax(p.getProperty("2171.12"));
        kfd.setTcEMail(p.getProperty("2171.13"));
        kfd.setLocName(p.getProperty("2171.14"));
        kfd.setLocSurname(p.getProperty("2171.15"));
        kfd.setLocStreet(p.getProperty("2171.16"));
        kfd.setLocHouseNumber(p.getProperty("2171.17"));
        kfd.setLocZipCode(p.getProperty("2171.18"));
        kfd.setLocCity(p.getProperty("2171.19"));
        kfd.setPrefix(p.getProperty("2171.20"));
        kfd.setNumber(p.getProperty("2171.21"));
        kfd.setOldRate(getBooleanFromField(p.getProperty("2171.22")));
        String tarifID = null;
        final String tarif = p.getProperty("2171.23");
        if (tarif != null) {
            final String s;
            switch (s = tarif) {
                case "1": {
                    tarifID = "Phone XXL";
                    break;
                }
                case "2": {
                    tarifID = "Phone XL";
                    break;
                }
                case "3": {
                    tarifID = "Phone L";
                    break;
                }
                case "4": {
                    tarifID = "Phone M";
                    break;
                }
                default:
                    break;
            }
        }
        kfd.setRate(tarifID);
        kfd.setFixNetFlat(getBooleanFromField(p.getProperty("2171.24")));
        kfd.setMobileFlat(getBooleanFromField(p.getProperty("2171.25")));
        kfd.setInt1Flat(getBooleanFromField(p.getProperty("2171.26")));
        kfd.setInt2Flat(getBooleanFromField(p.getProperty("2171.27")));
        kfd.setInt3Flat(getBooleanFromField(p.getProperty("2171.28")));
        final String talDSL = p.getProperty("2171.30");
        String talDSLId = null;
        boolean tal = false;
        if (talDSL != null) {
            tal=true;
            final String s2;
            switch (s2 = talDSL) {
                case "1": {
                    talDSLId = "TAL 16";
                    break;
                }
                case "2": {
                    talDSLId = "TAL 50";
                    break;
                }
                default:
                    break;
            }
        }
        final String regioDSL = p.getProperty("2171.31");
        String regioDSLID = null;
        boolean regio = false;
        if (regioDSL != null) {
            regio = true;
            final String s3;
            switch (s3 = regioDSL) {
                case "1": {
                    regioDSLID = "BSA 16";
                    break;
                }
                case "2": {
                    regioDSLID = "BSA 50";
                    break;
                }
                case "3": {
                    regioDSLID = "BSA 100";
                    break;
                }
                case "4": {
                    regioDSLID = "BSA 250";
                    break;
                }
                default:
                    break;
            }
        }
        if (talDSLId == null && regioDSLID == null) {
            kfd.setDownloadSpeed("kein");
            kfd.getFehlers().add("Bandbreite ist leer");
        }
        else if (talDSLId != null && regioDSLID != null) {
            kfd.getFehlers().add("TAL & BSA sind ausgew\u00e4hlt");
            kfd.setDownloadSpeed("kein");
        }
        else if (talDSLId == null && regioDSLID != null) {
            kfd.setDownloadSpeed(regioDSLID);
        }
        else if(talDSLId != null && regioDSLID == null) {//Added
            kfd.setDownloadSpeed(talDSLId);
        }

        kfd.setStaticIP(getBooleanFromField(p.getProperty("2171.32")));
        kfd.setClir(getBooleanFromField(p.getProperty("2171.33")));
        kfd.setLock900(getBooleanFromField(p.getProperty("2171.34")));
        kfd.setLockForeign(getBooleanFromField(p.getProperty("2171.35")));
        kfd.setClassicPlus(getBooleanFromField(p.getProperty("2171.36")));
        kfd.setFitter(getBooleanFromField(p.getProperty("2171.37")));
        kfd.setAdditionalSevice(p.getProperty("2171.38"));
        kfd.setAction(p.getProperty("2171.40"));
        int durration = 24;
        final String durrationnBox = p.getProperty("2171.41");
        Label_1548: {
            if (durrationnBox != null) {
                final String s4;
                switch (s4 = durrationnBox) {
                    case "1": {
                        durration = 36;
                        break Label_1548;
                    }
                    case "2": {
                        durration = 48;
                        break Label_1548;
                    }
                    case "3": {
                        durration = 60;
                        break Label_1548;
                    }
                    case "Off": {
                        durration = 24;
                        break Label_1548;
                    }
                    default:
                        break;
                }
                durration = 24;
            }
        }
        kfd.setDurration(durration);
        if (p.getProperty("2171.42") != null) {
            try {
                kfd.setPreferredDate(PDFExctractor.sdf.parse(p.getProperty("2171.42")));
            }
            catch (ParseException ex2) {}
        }
        return kfd;
    }

    private static KAFormularData v201903KAC2KAP(final PDAcroForm acroForm) {
        final String[] namen = { "DATUM", "RECHNUNGSKONTONUMMER", "KUNDENNUMMERFESTNETZ", "KUNDENNAME", "VO-MAIL", "FESTNETZVO", "VO-TEL", "2171", "2171.1", "2171.2", "2171.3", "2171.4", "2171.5", "2171.6", "2171.7", "2171.8", "2171.9", "2171.10", "2171.11", "2171.12", "2171.13", "2171.14", "2171.15", "2171.16", "2171.17", "2171.18", "2171.19", "2171.20", "2171.21", "2171.22", "2171.23", "2171.24", "2171.25", "2171.26", "2171.27", "2171.28", "2171.30", "2171.31", "2171.32", "2171.33", "2171.34", "2171.35", "2171.36", "2171.37", "2171.38", "2171.39", "2171.40", "2171.41" };
        final Properties p = new Properties();
        readFields(p, acroForm, namen);
        final KAFormularData kfd = new KAFormularData();
        kfd.setVoEMail(p.getProperty("VO-MAIL"));
        kfd.setVoNummer(p.getProperty("FESTNETZVO"));
        kfd.setVoTelNr(p.getProperty("VO-TEL"));
        kfd.setCustomerName(p.getProperty("KUNDENNAME"));
        try {
            kfd.setOrderDate(PDFExctractor.sdf.parse(p.getProperty("DATUM")));
        }
        catch (Exception ex) {}

        //kfd.setCustomerNumber(p.getProperty("KUNDENNUMMERFESTNETZ"));
        String KundeNumber = null;
        KundeNumber=p.getProperty("KUNDENNUMMERFESTNETZ");
        if (KundeNumber.length()<3){
            kfd.setCustomerNumber("Keine");
            //kfd.getFehlers().add("Kundennummer leer");
        }else if (KundeNumber==null){
            kfd.setCustomerNumber("Keine");
            //kfd.getFehlers().add("Kundennummer leer");
        }else if (KundeNumber!=null){
            kfd.setCustomerNumber(KundeNumber);
        }

        kfd.setAccount(p.getProperty("RECHNUNGSKONTONUMMER"));
        kfd.setName(p.getProperty("2171.1"));
        kfd.setSurname(p.getProperty("2171.2"));
        kfd.setStreet(p.getProperty("2171.3"));
        kfd.setHouseNumber(p.getProperty("2171.4"));
        kfd.setZipCode(p.getProperty("2171.5"));
        kfd.setCity(p.getProperty("2171.6"));
        String gender = null;
        if (p.getProperty("2171.7") != null) {
            if ("1".equals(p.getProperty("2171.7"))) {
                gender = "Frau";
            }
            if ("2".equals(p.getProperty("2171.7"))) {
                gender = "Herr";
            }
        }
        kfd.setTcGender(gender);
        kfd.setTcName(p.getProperty("2171.8"));
        kfd.setTcSurname(p.getProperty("2171.9"));
        kfd.setTcPhone(p.getProperty("2171.10"));
        kfd.setTcMobile(p.getProperty("2171.11"));
        kfd.setTcFax(p.getProperty("2171.12"));
        kfd.setTcEMail(p.getProperty("2171.13"));
        kfd.setLocName(p.getProperty("2171.14"));
        kfd.setLocSurname(p.getProperty("2171.15"));
        kfd.setLocStreet(p.getProperty("2171.16"));
        kfd.setLocHouseNumber(p.getProperty("2171.17"));
        kfd.setLocZipCode(p.getProperty("2171.18"));
        kfd.setLocCity(p.getProperty("2171.19"));
        kfd.setPrefix(p.getProperty("2171.20"));
        kfd.setNumber(p.getProperty("2171.21"));
        kfd.setOldRate(getBooleanFromField(p.getProperty("2171.22")));
        String tarifID = null;
        final String tarif = p.getProperty("2171.23");
        if (tarif != null) {
            final String s;
            switch (s = tarif) {
                case "1": {
                    tarifID = "Phone XXL";
                    break;
                }
                case "2": {
                    tarifID = "Phone XL";
                    break;
                }
                case "3": {
                    tarifID = "Phone L";
                    break;
                }
                case "4": {
                    tarifID = "Phone M";
                    break;
                }
                default:
                    break;
            }
        }
        kfd.setRate(tarifID);
        kfd.setFixNetFlat(getBooleanFromField(p.getProperty("2171.24")));
        kfd.setMobileFlat(getBooleanFromField(p.getProperty("2171.25")));
        kfd.setInt1Flat(getBooleanFromField(p.getProperty("2171.26")));
        kfd.setInt2Flat(getBooleanFromField(p.getProperty("2171.27")));
        kfd.setInt2Flat(getBooleanFromField(p.getProperty("2171.28")));
        final String talDSL = p.getProperty("2171.30");
        String talDSLId = null;
        if (talDSL != null) {
            final String s2;
            switch (s2 = talDSL) {
                case "1": {
                    talDSLId = "TAL 16";
                    break;
                }
                case "2": {
                    talDSLId = "TAL 50";
                    break;
                }
                default:
                    break;
            }
        }
        final String regioDSL = p.getProperty("2171.31");
        String regioDSLID = null;
        boolean regio = false;
        if (regioDSL != null) {
            regio = true;
            final String s3;
            switch (s3 = regioDSL) {
                case "1": {
                    regioDSLID = "BSA 16";
                    break;
                }
                case "2": {
                    regioDSLID = "BSA 50";
                    break;
                }
                case "3": {
                    regioDSLID = "BSA 100";
                    break;
                }
                case "4": {
                    regioDSLID = "BSA 250";
                    break;
                }
                default:
                    break;
            }
        }
        if (talDSLId == null && regioDSLID == null) {
            kfd.setDownloadSpeed("kein");
            kfd.getFehlers().add("Bandbreite ist leer");
        }
        else if (talDSLId != null && regioDSLID != null) {
            kfd.getFehlers().add("TAL & BSA sind ausgew\u00e4hlt");
            kfd.setDownloadSpeed("kein");
        }
        else if (talDSLId == null && regioDSLID != null) {
            kfd.setDownloadSpeed(regioDSLID);
        }
        else if(talDSLId != null && regioDSLID == null) {//Added
            kfd.setDownloadSpeed(talDSLId);
        }

        kfd.setStaticIP(getBooleanFromField(p.getProperty("2171.32")));
        kfd.setClir(getBooleanFromField(p.getProperty("2171.33")));
        kfd.setLock900(getBooleanFromField(p.getProperty("2171.34")));
        kfd.setLockForeign(getBooleanFromField(p.getProperty("2171.35")));
        kfd.setClassicPlus(getBooleanFromField(p.getProperty("2171.36")));
        kfd.setFitter(getBooleanFromField(p.getProperty("2171.37")));
        kfd.setAdditionalSevice(p.getProperty("2171.38"));
        kfd.setAction(p.getProperty("2171.40"));
        int durration = 24;
        final String durrationnBox = p.getProperty("2171.41");
        Label_1548: {
            if (durrationnBox != null) {
                final String s4;
                switch (s4 = durrationnBox) {
                    case "1": {
                        durration = 36;
                        break Label_1548;
                    }
                    case "2": {
                        durration = 48;
                        break Label_1548;
                    }
                    case "3": {
                        durration = 60;
                        break Label_1548;
                    }
                    case "Off": {
                        durration = 24;
                        break Label_1548;
                    }
                    default:
                        break;
                }
                durration = 24;
            }
        }
        kfd.setDurration(durration);
        if (p.getProperty("2171.42") != null) {
            try {
                kfd.setPreferredDate(PDFExctractor.sdf.parse(p.getProperty("2171.42")));
            }
            catch (ParseException ex2) {}
        }
        return kfd;
    }

    private static KAFormularData v201810KAC2KAP(final PDAcroForm acroForm) {
        final String[] namen = { "DATUM", "RECHNUNGSKONTONUMMER", "KUNDENNUMMERFESTNETZ", "KUNDENNAME", "VO-MAIL", "FESTNETZVO", "VO-TEL", "2171", "2171.1", "2171.2", "2171.3", "2171.4", "2171.5", "2171.6", "2171.7", "2171.8", "2171.9", "2171.10", "2171.11", "2171.12", "2171.13", "2171.14", "2171.15", "2171.16", "2171.17", "2171.18", "2171.19", "2171.20", "2171.21", "2171.22", "2171.23", "2171.24", "2171.25", "2171.26", "2171.27", "2171.28", "2171.30", "2171.31", "2171.32", "2171.33", "2171.34", "2171.35", "2171.36", "2171.37", "2171.38", "2171.39", "2171.40", "2171.41", "2171.42" };
        final Properties p = new Properties();
        readFields(p, acroForm, namen);
        final KAFormularData kfd = new KAFormularData();
        kfd.setVoEMail(p.getProperty("VO-MAIL"));
        kfd.setVoNummer(p.getProperty("FESTNETZVO"));
        kfd.setVoTelNr(p.getProperty("VO-TEL"));
        kfd.setCustomerName(p.getProperty("KUNDENNAME"));

        String KundeNumber = null;
        KundeNumber=p.getProperty("KUNDENNUMMERFESTNETZ");
        if (KundeNumber.length()<3){
            kfd.setCustomerNumber("Keine");
            //kfd.getFehlers().add("Kundennummer leer");
        }else if (KundeNumber!=null){
            kfd.setCustomerNumber(KundeNumber);
        }//Added

        try {
            kfd.setOrderDate(PDFExctractor.sdf.parse(p.getProperty("DATUM")));
        }
        catch (Exception ex) {}
        kfd.setCustomerNumber(p.getProperty("KUNDENNUMMERFESTNETZ"));
        kfd.setAccount(p.getProperty("RECHNUNGSKONTONUMMER"));
        kfd.setName(p.getProperty("2171.1"));
        kfd.setSurname(p.getProperty("2171.2"));
        kfd.setStreet(p.getProperty("2171.3"));
        kfd.setHouseNumber(p.getProperty("2171.4"));
        kfd.setZipCode(p.getProperty("2171.5"));
        kfd.setCity(p.getProperty("2171.6"));
        String gender = null;
        if (p.getProperty("2171.7") != null) {
            if ("1".equals(p.getProperty("2171.7"))) {
                gender = "Frau";
            }
            if ("2".equals(p.getProperty("2171.7"))) {
                gender = "Herr";
            }
        }
        kfd.setTcGender(gender);
        kfd.setTcName(p.getProperty("2171.8"));
        kfd.setTcSurname(p.getProperty("2171.9"));
        kfd.setTcPhone(p.getProperty("2171.10"));
        kfd.setTcMobile(p.getProperty("2171.11"));
        kfd.setTcFax(p.getProperty("2171.12"));
        kfd.setTcEMail(p.getProperty("2171.13"));
        kfd.setLocName(p.getProperty("2171.14"));
        kfd.setLocSurname(p.getProperty("2171.15"));
        kfd.setLocStreet(p.getProperty("2171.16"));
        kfd.setLocHouseNumber(p.getProperty("2171.17"));
        kfd.setLocZipCode(p.getProperty("2171.18"));
        kfd.setLocCity(p.getProperty("2171.19"));
        kfd.setPrefix(p.getProperty("2171.20"));
        kfd.setNumber(p.getProperty("2171.21"));
        kfd.setOldRate(getBooleanFromField(p.getProperty("2171.22")));
        String tarifID = null;
        final String tarif = p.getProperty("2171.23");
        if (tarif != null) {
            final String s;
            switch (s = tarif) {
                case "1": {
                    tarifID = "Phone XXL";
                    break;
                }
                case "2": {
                    tarifID = "Phone XL";
                    break;
                }
                case "3": {
                    tarifID = "Phone L";
                    break;
                }
                case "4": {
                    tarifID = "Phone M";
                    break;
                }
                default:
                    break;
            }
        }
        kfd.setRate(tarifID);
        kfd.setFixNetFlat(getBooleanFromField(p.getProperty("2171.24")));
        kfd.setMobileFlat(getBooleanFromField(p.getProperty("2171.25")));
        kfd.setInt1Flat(getBooleanFromField(p.getProperty("2171.26")));
        kfd.setInt2Flat(getBooleanFromField(p.getProperty("2171.27")));
        kfd.setInt2Flat(getBooleanFromField(p.getProperty("2171.28")));
        final String talDSL = p.getProperty("2171.30");
        String talDSLId = null;
        if (talDSL != null) {
            final String s2;
            switch (s2 = talDSL) {
                case "1": {
                    talDSLId = "TAL 16";
                    break;
                }
                case "2": {
                    talDSLId = "TAL 50";
                    break;
                }
                default:
                    break;
            }
        }
        final String regioDSL = p.getProperty("2171.31");
        String regioDSLID = null;
        boolean regio = false;
        if (regioDSL != null) {
            final String s3;
            switch (s3 = regioDSL) {
                case "1": {
                    regio = true;
                    regioDSLID = "BSA 16";
                    break;
                }
                case "2": {
                    regio = true;
                    regioDSLID = "BSA 50";
                    break;
                }
                case "3": {
                    regio = true;
                    regioDSLID = "BSA 100";
                    break;
                }
                case "4": {
                    regio = true;
                    regioDSLID = "BSA 250";
                    break;
                }
                default:
                    break;
            }
        }
        if (talDSLId == null && regioDSLID == null) {
            kfd.setDownloadSpeed("kein");
            kfd.getFehlers().add("Bandbreite ist leer");
        }
        else if (talDSLId != null && regioDSLID != null) {
            kfd.getFehlers().add("TAL & BSA sind ausgew\u00e4hlt");
            kfd.setDownloadSpeed("kein");
        }
        else if (talDSLId == null && regioDSLID != null) {
            kfd.setDownloadSpeed(regioDSLID);
        }
        else if(talDSLId != null && regioDSLID == null) {//Added
            kfd.setDownloadSpeed(talDSLId);
        }


        kfd.setStaticIP(getBooleanFromField(p.getProperty("2171.32")));
        kfd.setClir(getBooleanFromField(p.getProperty("2171.33")));
        kfd.setLock900(getBooleanFromField(p.getProperty("2171.34")));
        kfd.setLockForeign(getBooleanFromField(p.getProperty("2171.35")));
        kfd.setClassicPlus(getBooleanFromField(p.getProperty("2171.36")));
        kfd.setFitter(getBooleanFromField(p.getProperty("2171.37")));
        kfd.setAdditionalSevice(p.getProperty("2171.38"));
        kfd.setAction(p.getProperty("2171.40"));
        int durration = 24;
        final String durrationnBox = p.getProperty("2171.41");
        Label_1568: {
            if (durrationnBox != null) {
                final String s4;
                switch (s4 = durrationnBox) {
                    case "1": {
                        durration = 36;
                        break Label_1568;
                    }
                    case "2": {
                        durration = 48;
                        break Label_1568;
                    }
                    case "3": {
                        durration = 60;
                        break Label_1568;
                    }
                    case "Off": {
                        durration = 24;
                        break Label_1568;
                    }
                    default:
                        break;
                }
                durration = 24;
            }
        }
        kfd.setDurration(durration);
        if (p.getProperty("2171.42") != null) {
            try {
                kfd.setPreferredDate(PDFExctractor.sdf.parse(p.getProperty("2171.42")));
            }
            catch (ParseException ex2) {}
        }
        return kfd;
    }

    private static void readFields(final Properties p, final PDAcroForm acroForm, final String[] namen) {
        for (int i = 0; i < namen.length; ++i) {
            final String name = namen[i];
            System.out.println("Valor name: "+namen[i]);
            p.setProperty(name, acroForm.getField(name).getValueAsString());
        }
    }

    String getBandbreitenCode(final String input) {
        final Properties bandbreitenCode = new Properties();
        bandbreitenCode.setProperty("768", "V0116");
        bandbreitenCode.setProperty("1500", "V0117");
        bandbreitenCode.setProperty("1000", "V0118");
        bandbreitenCode.setProperty("2000", "V0174");
        bandbreitenCode.setProperty("3000", "V0175");
        bandbreitenCode.setProperty("6000", "V0178");
        bandbreitenCode.setProperty("16000", "V018C");
        bandbreitenCode.setProperty("25000", "V018G");
        bandbreitenCode.setProperty("50000", "V018H");
        bandbreitenCode.setProperty("100000", "V018N");
        String result = bandbreitenCode.getProperty(input);
        if (result == null) {
            result = "unbekannt";
        }
        return result;
    }

    private static final boolean getBooleanFromField(final String value) {
        return value != null && !"Off".equalsIgnoreCase(value);
    }

}
