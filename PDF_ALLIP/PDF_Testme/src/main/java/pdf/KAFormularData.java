// 
// Decompiled by Procyon v0.5.36
// 

package pdf;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KAFormularData extends FormularData implements PDFConstants
{
    private List<String> checkFehlers;
    private List<String> fehlers;
    private Date orderDate;
    private String customerName;
    private String customerNumber;
    private String account;
    private String name;
    private String surname;
    private String street;
    private String houseNumber;
    private String zipCode;
    private String city;
    private String tcGender;
    private String tcName;
    private String tcSurname;
    private String tcPhone;
    private String tcMobile;
    private String tcFax;
    private String tcEMail;
    private String locName;
    private String locSurname;
    private String locStreet;
    private String locHouseNumber;
    private String locZipCode;
    private String locCity;
    private String prefix;
    private String number;
    private boolean oldRate;
    private String rate;
    private boolean fixNetFlat;
    private boolean mobileFlat;
    private boolean int1Flat;
    private boolean int2Flat;
    private boolean int3Flat;
    private boolean regio;
    private String downloadSpeed;
    private boolean staticIP;
    private boolean clir;
    private boolean lock900;
    private boolean lockForeign;
    private boolean classicPlus;
    private boolean fitter;
    private String additionalSevice;
    private String action;
    private int durration;
    private Date preferredDate;
    private String voNummer;
    private String voEMail;
    private String voTelNr;
    
    public KAFormularData() {
        this.checkFehlers = new ArrayList<String>();
        this.fehlers = new ArrayList<String>();
    }
    
    public List<String> getCheckFehlers() {
        return this.checkFehlers;
    }
    
    public List<String> getFehlers() {
        return this.fehlers;
    }
    
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(final Date orderDate) {
        this.orderDate = orderDate;
    }
    
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        if (customerName != null) {
            customerName = customerName.replace(";", ",");
        }
        this.customerName = customerName;
    }
    
    public String getCustomerNumber() {
        return this.customerNumber;
    }
    
    public void setCustomerNumber(String customerNumber) {
        /*if (customerNumber != null) {
            while (customerNumber.length() < 12) {
                customerNumber = "0" + customerNumber;
            }

        }*/
        //Removed
        this.customerNumber = customerNumber;

    }
    
    public String getAccount() {
        return this.account;
    }
    
    public void setAccount(String account) {
        if (account != null) {
            account = account.replace(";", ",");
        }
        this.account = account;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        if (name != null) {
            name = name.replace(";", ",");
        }
        this.name = name;
    }
    
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        if (surname != null) {
            surname = surname.replace(";", ",");
        }
        this.surname = surname;
    }
    
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        if (street != null) {
            street = street.replace(";", ",");
        }
        this.street = street;
    }
    
    public String getHouseNumber() {
        return this.houseNumber;
    }
    
    public void setHouseNumber(String houseNumber) {
        if (houseNumber != null) {
            houseNumber = houseNumber.replace(";", ",");
        }
        this.houseNumber = houseNumber;
    }
    
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        if (zipCode != null) {
            zipCode = zipCode.replace(";", ",");
        }
        this.zipCode = zipCode;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        if (city != null) {
            city = city.replace(";", ",");
        }
        this.city = city;
    }
    
    public String getTcGender() {
        return this.tcGender;
    }
    
    public void setTcGender(String tcGender) {
        if (tcGender != null) {
            tcGender = tcGender.replace(";", ",");
        }
        this.tcGender = tcGender;
    }
    
    public String getTcName() {
        return this.tcName;
    }
    
    public void setTcName(String tcName) {
        if (tcName != null) {
            tcName = tcName.replace(";", ",");
        }
        this.tcName = tcName;
    }
    
    public String getTcSurname() {
        return this.tcSurname;
    }
    
    public void setTcSurname(String tcSurname) {
        if (tcSurname != null) {
            tcSurname = tcSurname.replace(";", ",");
        }
        this.tcSurname = tcSurname;
    }
    
    public String getTcPhone() {
        return this.tcPhone;
    }
    
    public void setTcPhone(String tcPhone) {
        if (tcPhone != null) {
            tcPhone = tcPhone.replace(";", ",");
        }
        this.tcPhone = tcPhone;
    }
    
    public String getTcMobile() {
        return this.tcMobile;
    }
    
    public void setTcMobile(String tcMobile) {
        if (tcMobile != null) {
            tcMobile = tcMobile.replace(";", ",");
        }
        this.tcMobile = tcMobile;
    }
    
    public String getTcFax() {
        return this.tcFax;
    }
    
    public void setTcFax(String tcFax) {
        if (tcFax != null) {
            tcFax = tcFax.replace(";", ",");
        }
        this.tcFax = tcFax;
    }
    
    public String getTcEMail() {
        return this.tcEMail;
    }
    
    public void setTcEMail(String tcEMail) {
        if (tcEMail != null) {
            tcEMail = tcEMail.replace(";", ",");
        }
        this.tcEMail = tcEMail;
    }
    
    public String getLocName() {
        return this.locName;
    }
    
    public void setLocName(String locName) {
        if (locName != null) {
            locName = locName.replace(";", ",");
        }
        this.locName = locName;
    }
    
    public String getLocSurname() {
        return this.locSurname;
    }
    
    public void setLocSurname(String locSurname) {
        if (locSurname != null) {
            locSurname = locSurname.replace(";", ",");
        }
        this.locSurname = locSurname;
    }
    
    public String getLocStreet() {
        return this.locStreet;
    }
    
    public void setLocStreet(String locStreet) {
        if (locStreet != null) {
            locStreet = locStreet.replace(";", ",");
        }
        this.locStreet = locStreet;
    }
    
    public String getLocHouseNumber() {
        return this.locHouseNumber;
    }
    
    public void setLocHouseNumber(String locHouseNumber) {
        if (locHouseNumber != null) {
            locHouseNumber = locHouseNumber.replace(";", ",");
        }
        this.locHouseNumber = locHouseNumber;
    }
    
    public String getLocZipCode() {
        return this.locZipCode;
    }
    
    public void setLocZipCode(String locZipCode) {
        if (locZipCode != null) {
            locZipCode = locZipCode.replace(";", ",");
        }
        this.locZipCode = locZipCode;
    }
    
    public String getLocCity() {
        return this.locCity;
    }
    
    public void setLocCity(String locCity) {
        if (locCity != null) {
            locCity = locCity.replace(";", ",");
        }
        this.locCity = locCity;
    }
    
    public String getPrefix() {
        return this.prefix;
    }
    
    public void setPrefix(String prefix) {
        if (prefix != null) {
            prefix = prefix.replace(";", ",");
        }
        this.prefix = prefix;
    }
    
    public String getNumber() {
        return this.number;
    }
    
    public void setNumber(String number) {
        if (number != null) {
            number = number.replace(";", ",");
        }
        this.number = number;
    }
    
    public boolean isOldRate() {
        return this.oldRate;
    }
    
    public void setOldRate(final boolean oldRate) {
        this.oldRate = oldRate;
    }
    
    public String getRate() {
        return this.rate;
    }
    
    public void setRate(String rate) {
        if (rate != null) {
            rate = rate.replace(";", ",");
        }
        this.rate = rate;
    }
    
    public boolean isFixNetFlat() {
        return this.fixNetFlat;
    }
    
    public void setFixNetFlat(final boolean fixNetFlat) {
        this.fixNetFlat = fixNetFlat;
    }
    
    public boolean isMobileFlat() {
        return this.mobileFlat;
    }
    
    public void setMobileFlat(final boolean mobileFlat) {
        this.mobileFlat = mobileFlat;
    }
    
    public boolean isInt1Flat() {
        return this.int1Flat;
    }
    
    public void setInt1Flat(final boolean int1Flat) {
        this.int1Flat = int1Flat;
    }
    
    public boolean isInt2Flat() {
        return this.int2Flat;
    }
    
    public void setInt2Flat(final boolean int2Flat) {
        this.int2Flat = int2Flat;
    }
    
    public boolean isInt3Flat() {
        return this.int3Flat;
    }
    
    public void setInt3Flat(final boolean int3Flat) {
        this.int3Flat = int3Flat;
    }
    
    public boolean isRegio() {
        return this.regio;
    }
    
    public void setRegio(final boolean regio) {
        this.regio = regio;
    }
    
    public String getDownloadSpeed() {
        return this.downloadSpeed;
    }
    
    public void setDownloadSpeed(String downloadSpeed) {
        if (downloadSpeed != null) {
            downloadSpeed = downloadSpeed.replace(";", ",");
        }
        this.downloadSpeed = downloadSpeed;
    }
    
    public boolean isStaticIP() {
        return this.staticIP;
    }
    
    public void setStaticIP(final boolean staticIP) {
        this.staticIP = staticIP;
    }
    
    public boolean isClir() {
        return this.clir;
    }
    
    public void setClir(final boolean clir) {
        this.clir = clir;
    }
    
    public boolean isLock900() {
        return this.lock900;
    }
    
    public void setLock900(final boolean lock900) {
        this.lock900 = lock900;
    }
    
    public boolean isLockForeign() {
        return this.lockForeign;
    }
    
    public void setLockForeign(final boolean lockForeign) {
        this.lockForeign = lockForeign;
    }
    
    public boolean isClassicPlus() {
        return this.classicPlus;
    }
    
    public void setClassicPlus(final boolean classicPlus) {
        this.classicPlus = classicPlus;
    }
    
    public boolean isFitter() {
        return this.fitter;
    }
    
    public void setFitter(final boolean fitter) {
        this.fitter = fitter;
    }
    
    public String getAdditionalSevice() {
        return this.additionalSevice;
    }
    
    public void setAdditionalSevice(String additionalSevice) {
        if (additionalSevice != null) {
            additionalSevice = additionalSevice.replace(";", ",");
        }
        this.additionalSevice = additionalSevice;
    }
    
    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        if (action != null) {
            action = action.replace(";", ",");
        }
        this.action = action;
    }
    
    public int getDurration() {
        return this.durration;
    }
    
    public void setDurration(final int durration) {
        this.durration = durration;
    }
    
    public Date getPreferredDate() {
        return this.preferredDate;
    }
    
    public void setPreferredDate(final Date preferredDate) {
        this.preferredDate = preferredDate;
    }
    
    public String getVoNummer() {
        return this.voNummer;
    }
    
    public void setVoNummer(String voNummer) {
        if (voNummer != null) {
            voNummer = voNummer.replace(";", ",");
        }
        this.voNummer = voNummer;
    }
    
    public String getVoEMail() {
        return this.voEMail;
    }
    
    public void setVoEMail(String voEMail) {
        if (voEMail != null) {
            voEMail = voEMail.replace(";", ",");
        }
        this.voEMail = voEMail;
    }
    
    public String getVoTelNr() {
        return this.voTelNr;
    }
    
    public void setVoTelNr(String voTelNr) {
        if (voTelNr != null) {
            voTelNr = voTelNr.replace(";", ",");
        }
        this.voTelNr = voTelNr;
    }
    
    @Override
    public String toString() {
        return String.format("KAFormularData [orderDate=%s, customerName=%s, customerNumber=%s, account=%s, name=%s, surname=%s, street=%s, houseNumber=%s, zipCode=%s, city=%s, tcGender=%s, tcName=%s, tcSurname=%s, tcPhone=%s, tcMobile=%s, tcFax=%s, tcEMail=%s, locName=%s, locSurname=%s, locStreet=%s, locHouseNumber=%s, locZipCode=%s, locCity=%s, prefix=%s, number=%s, oldRate=%s, rate=%s, fixNetFlat=%s, mobileFlat=%s, int1Flat=%s, int2Flat=%s, int3Flat=%s, regio=%s, downloadSpeed=%s, staticIP=%s, clir=%s, lock900=%s, lockForeign=%s, classicPlus=%s, fitter=%s, additionalSevice=%s, action=%s, durration=%s, preferredDate=%s, voNummer=%s, voEMail=%s, voTelNr=%s]", this.orderDate, this.customerName, this.customerNumber, this.account, this.name, this.surname, this.street, this.houseNumber, this.zipCode, this.city, this.tcGender, this.tcName, this.tcSurname, this.tcPhone, this.tcMobile, this.tcFax, this.tcEMail, this.locName, this.locSurname, this.locStreet, this.locHouseNumber, this.locZipCode, this.locCity, this.prefix, this.number, this.oldRate, this.rate, this.fixNetFlat, this.mobileFlat, this.int1Flat, this.int2Flat, this.int3Flat, this.regio, this.downloadSpeed, this.staticIP, this.clir, this.lock900, this.lockForeign, this.classicPlus, this.fitter, this.additionalSevice, this.action, this.durration, this.preferredDate, this.voNummer, this.voEMail, this.voTelNr);
    }
    
    @Override
    public String toCSVString() {
        String status = "OK";
        if (this.fehlers.size() != 0 || this.checkFehlers.size() != 0) {
            status = "NOK";
        }
        final StringBuilder fehlersBuilder = new StringBuilder();
        for (final String string : this.fehlers) {
            fehlersBuilder.append(string);
            fehlersBuilder.append(",");
        }
        for (final String string : this.checkFehlers) {
            fehlersBuilder.append(string);
            fehlersBuilder.append(",");
        }
        return String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;", getType(), status, this.getSourceFileName(), this.formatDates(this.orderDate), this.customerName, this.customerNumber, this.account, this.name, this.surname, this.street, this.houseNumber, this.zipCode, this.city, this.tcGender, this.tcName, this.tcSurname, this.tcPhone, this.tcMobile, this.tcFax, this.tcEMail, this.locName, this.locSurname, this.locStreet, this.locHouseNumber, this.locZipCode, this.locCity, this.prefix, this.number, this.oldRate, this.rate, this.fixNetFlat, this.mobileFlat, this.int1Flat, this.int2Flat, this.int3Flat, this.regio, this.downloadSpeed, this.staticIP, this.clir, this.lock900, this.lockForeign, this.classicPlus, this.fitter, this.additionalSevice, this.action, this.durration, this.formatDates(this.preferredDate), this.voNummer, this.voEMail, this.voTelNr, fehlersBuilder.toString());
    }
    
    private String formatDates(final Date date) {
        if (date == null) {
            return "";
        }
        return KAFormularData.sdf.format(date);
    }
    
    @Override
    public boolean check() {
        boolean result = true;
        this.checkFehlers.clear();
        Date datepast = new Date(99, 01, 01);
        //System.out.println("Fecha pasada: "+datepast);
        //System.out.println("Fecha formulario: "+this.orderDate);
        if (this.orderDate == null) {
            this.checkFehlers.add("Auftragsdatum leer");
            result = false;
        }else if (this.orderDate.after(new Date())) {
            this.checkFehlers.add("Auftragsdatum in Zukunft");
            result = false;
        }else if (this.orderDate.before(datepast)) {
            this.checkFehlers.add("Auftragsdatum in Vergangeheit");
            result = false;
        }

        if (this.customerName == null || this.customerName.length() == 0) {
            this.checkFehlers.add("Kundenname leer");
            result = false;
        }
        if (this.customerNumber == null || this.customerNumber.length() == 1 || this.customerNumber == "Keine") {
            this.checkFehlers.add("Kundennummer leer");
            result = false;
        }else if (ValidationTools.isNumeric(this.customerNumber)== false){
            this.checkFehlers.add("Kundennummer Fehler");
            result = false;
        }
        if (this.account == null || this.account.length() == 0) {
            this.checkFehlers.add("Rechnungskonto leer");
            result = false;
        }else if (ValidationTools.isNumeric(this.account)== false){
            this.checkFehlers.add("Rechnungskonto Fehler");
            result = false;
        }
        if ((this.name == null || this.name.length() == 0) && (this.surname == null || this.surname.length() == 0)) {
            this.checkFehlers.add("Name leer");
            result = false;
        }
        if (this.street == null || this.street.length() == 0) {
            this.checkFehlers.add("Strasse leer");
            result = false;
        }
        if (this.houseNumber == null || this.houseNumber.length() == 0) {
            this.checkFehlers.add("Hausnummer leer");
            result = false;
        }
        if (this.zipCode == null || this.zipCode.length() == 0 ) {
            this.checkFehlers.add("Postleitzahl leer");
            result = false;
        }else if (ValidationTools.isNumeric(zipCode)== false){
            this.checkFehlers.add("Postleitzahl Fehler");
            result = false;
        }
        if (this.city == null || this.city.length() == 0) {
            this.checkFehlers.add("Stadt leer");
            result = false;
        }else if (!(ValidationTools.containsDigit(city))== false){
            this.checkFehlers.add("Stadt Fehler");
            result = false;
        }
        if ((this.tcName == null || this.tcName.length() == 0) && (this.tcSurname == null || this.tcSurname.length() == 0)) {
            this.checkFehlers.add("Ansprechpartner Name und Vorname leer");
            result = false;
        }
        if ((this.tcPhone == null || this.tcPhone.length() == 0) && (this.tcMobile == null || this.tcMobile.length() == 0) && (this.tcFax == null || this.tcFax.length() == 0) && (this.tcEMail == null || this.tcEMail.length() == 0)) {
            this.checkFehlers.add("Ansprechpartner kontakten sind leer");
            result = false;
        }
        if ((this.locName == null || this.locName.length() == 0) && (this.locSurname == null || this.locSurname.length() == 0)) {
            this.checkFehlers.add("Anschluss-Name und Vorname leer");
            result = false;
        }
        if (this.locStreet == null || this.locStreet.length() == 0) {
            this.checkFehlers.add("Anschluss-Strasse leer");
            result = false;
        }
        if (this.locHouseNumber == null || this.locHouseNumber.length() == 0) {
            this.checkFehlers.add("Anschluss-Hausnummer leer");
            result = false;
        }
        if (this.locZipCode == null || this.locZipCode.length() == 0) {
            this.checkFehlers.add("Anschluss-PLZ leer");
            result = false;
        }else if (ValidationTools.isNumeric(locZipCode)== false){
            this.checkFehlers.add("Anschluss-PLZ Fehler");
            result = false;
        }
        if (this.locCity == null || this.locCity.length() == 0) {
            this.checkFehlers.add("Anschluss-Stadt leer");
            result = false;
        }else if (!(ValidationTools.containsDigit(locCity))== false){
            this.checkFehlers.add("Anschluss-Stadt Fehler");
            result = false;
        }
        if (this.prefix == null || this.prefix.length() == 0) {
            this.checkFehlers.add("Vorwahl unbekannt leer");
            result = false;
        }else if (ValidationTools.isNumeric(prefix)== false){
            this.checkFehlers.add("Vorwahl Fehler");
            result = false;
        }
        if (this.number == null || this.number.length() == 0) {
            this.checkFehlers.add("Telfonnummer leer");
            result = false;
        }else if (ValidationTools.isNumeric(number)== false){
            this.checkFehlers.add("Telfonnummer Fehler");
            result = false;
        }
        if (!this.oldRate && (this.rate == null || this.rate.length() == 0)) {
            this.checkFehlers.add("Tarif nicht bekannt");
            result = false;
        }
        if (this.oldRate && this.rate != null) {
            this.checkFehlers.add("Tarif doppelt gew\u00e4hlt");
            result = false;
        }
        if (this.rate != null) {
            final String rate;
            switch (rate = this.rate) {
                case "Phone XL": {
                    if (this.fixNetFlat) {
                        this.checkFehlers.add("Unn\u00f6tige Flate - National-Flat");
                    }
                    if (this.mobileFlat) {
                        this.checkFehlers.add("Unn\u00f6tige Flate - Mobile-Flat");
                        break;
                    }
                    break;
                }
                case "Phone XXL": {
                    if (this.fixNetFlat) {
                        this.checkFehlers.add("Unn\u00f6tige Flate - National-Flat");
                    }
                    if (this.mobileFlat) {
                        this.checkFehlers.add("Unn\u00f6tige Flate - Mobile-Flat");
                    }
                    if (this.int1Flat) {
                        this.checkFehlers.add("Unn\u00f6tige Flate - nternational--Flat");
                        break;
                    }
                    break;
                }
                case "Phone L": {
                    if (this.fixNetFlat) {
                        this.checkFehlers.add("Unn\u00f6tige Flate - National-Flat");
                        break;
                    }
                    break;
                }
                default:
                    break;
            }
        }
        if (this.voNummer == null || this.voNummer.length() == 0) {
            this.checkFehlers.add("voNummer leer");
            result = false;
        }else if (ValidationTools.isNumeric(this.voNummer)== false){
            this.checkFehlers.add("voNummer Fehler");
            result = false;
        }
        /*if (this.voEMail == null || this.voEMail.length() == 0) {
            this.checkFehlers.add("voEMail leer");
            result = false;
        }*/
        return result;
    }
    
    public static String getType() {
        return "KA";
    }
    
    public static String getHeader() {
        final StringBuilder sb = new StringBuilder();
        final String[] headerString = getHeaderString();
        String[] array;
        for (int length = (array = headerString).length, i = 0; i < length; ++i) {
            final String header = array[i];
            sb.append(header);
            sb.append(";");
        }
        return sb.toString();
    }
    
    public static String[] getHeaderString() {
        return new String[] { "Typ", "Status", "Datei", "Auftrag vom", "Kundenname", "VF-Festnetz-Kunden-Nr", "Rechnungskontonummer", "Firmenname bzw. Name", "Vorname", "Stra\u00dfe", "Nr.", "PLZ", "Ort", "technische Ansprechpartner Geschlecht", "technische Ansprechpartner Name", "technische Ansprechpartner Vorname", "technische Ansprechpartner Rufnummer", "technische Ansprechpartner Mobilfunknummer", "technische Ansprechpartner Faxnummer", "technische Ansprechpartner E-Mail-Adresse", "Anschluss Firmenname bzw. Name", "Anschluss Vorname", "Anschluss Stra\u00dfe", "Anschluss Nr.", "Anschluss PLZ", "Anschluss Ort", "Anschluss Vorwahl", "Anschluss Rufnummer", "Alte Tarif beibehalten", "neue Tarif", "Nationale Flat", "Mobilfunk Flat", "Internatiionale Flat 1", "Internatiionale Flat 2", "Internatiionale Flat 3", "Regio", "Bandbreite", "Feste IP-Adresse", "St\u00e4ndige Rufnummernunterdr\u00fcckung", "Sperre 0900-Rufnummern", "Sperre Ausland", "Service Level classic plus", "Techniker-Service", "Zusatzleistungen", "Aktionskennung", "Vertragslaufzeit", "Terminwunsch", "VO Nummer", "VO eMail", "VO Rufnummer", "Fehler/Mangel" };
    }
}
