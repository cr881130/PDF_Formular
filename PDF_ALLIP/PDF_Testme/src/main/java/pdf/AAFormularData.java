// 
// Decompiled by Procyon v0.5.36
// 

package pdf;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AAFormularData extends FormularData implements PDFConstants
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
    private String taeBuilding;
    private String taeFloor;
    private String taeRoom;
    private String taeExtended;
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
    private String extensionStart;
    private String extensionEnde;
    private String vtcGender;
    private String vtcName;
    private String vtcSurname;
    private String vtcPhone;
    private String vtcMobile;
    private String vtcFax;
    private String vtcEMail;
    private boolean oldRate;
    private String rate;
    private boolean fixNetFlat;
    private boolean mobileFlat;
    private boolean int1Flat;
    private boolean int2Flat;
    private boolean int3Flat;
    private int countOfLines;
    private String downloadSpeed;
    private boolean central;
    private boolean irregular;
    private boolean clip;
    private boolean classicPlus;
    private boolean fitter;
    private String additionalSevice;
    private String action;
    private int durration;
    private Date preferredDate;
    private String voNummer;
    private String voEMail;
    private String voTelNr;
    private String OneGroupID;
    private String locationRefNum1;
    private String pilotrufnummer1;
    private String phoneNumberAndRange1;
    private String phoneRange1Ende;
    private String phoneNumberAndRange2;
    private String phoneRange2Ende;
    private String phoneNumberAndRange3;
    private String phoneRange3Ende;
    private String phoneNumberAndRange4;
    private String phoneRange4Ende;
    private String phoneNumberAndRange5;
    private String phoneRange5Ende;
    private String phoneNumberAndRange6;
    private String phoneRange6Ende;
    private String phoneNumberAndRange7;
    private String phoneRange7Ende;
    private String phoneNumberAndRange8;
    private String phoneRange8Ende;
    private String phoneNumberAndRange9;
    private String phoneRange9Ende;
    private String phoneNumberAndRange10;
    private String phoneRange10Ende;
    private String locationRefNum2;
    private String pilotrufnummer2;
    private String phoneNumberAndRange11;
    private String phoneRange11Ende;
    private String phoneNumberAndRange12;
    private String phoneRange12Ende;
    private String phoneNumberAndRange13;
    private String phoneRange13Ende;
    private String phoneNumberAndRange14;
    private String phoneRange14Ende;
    private String phoneNumberAndRange15;
    private String phoneRange15Ende;
    private String phoneNumberAndRange16;
    private String phoneRange16Ende;
    private String phoneNumberAndRange17;
    private String phoneRange17Ende;
    private String phoneNumberAndRange18;
    private String phoneRange18Ende;
    private String phoneNumberAndRange19;
    private String phoneRange19Ende;
    private String phoneNumberAndRange20;
    private String phoneRange20Ende;
    private String locationRefNum3;
    private String pilotrufnummer3;
    private String phoneNumberAndRange21;
    private String phoneRange21Ende;
    private String phoneNumberAndRange22;
    private String phoneRange22Ende;
    private String phoneNumberAndRange23;
    private String phoneRange23Ende;
    private String phoneNumberAndRange24;
    private String phoneRange24Ende;
    private String phoneNumberAndRange25;
    private String phoneRange25Ende;
    private String phoneNumberAndRange26;
    private String phoneRange26Ende;
    private String phoneNumberAndRange27;
    private String phoneRange27Ende;
    private String phoneNumberAndRange28;
    private String phoneRange28Ende;
    private String phoneNumberAndRange29;
    private String phoneRange29Ende;
    private String phoneNumberAndRange30;
    private String phoneRange30Ende;
    private String locationRefNum4;
    private String pilotrufnummer4;
    private String phoneNumberAndRange31;
    private String phoneRange31Ende;
    private String phoneNumberAndRange32;
    private String phoneRange32Ende;
    private String phoneNumberAndRange33;
    private String phoneRange33Ende;
    private String phoneNumberAndRange34;
    private String phoneRange34Ende;
    private String phoneNumberAndRange35;
    private String phoneRange35Ende;
    private String phoneNumberAndRange36;
    private String phoneRange36Ende;
    private String phoneNumberAndRange37;
    private String phoneRange37Ende;
    private String phoneNumberAndRange38;
    private String phoneRange38Ende;
    private String phoneNumberAndRange39;
    private String phoneRange39Ende;
    private String phoneNumberAndRange40;
    private String phoneRange40Ende;
    private String aapOneGroupID;
    private String aapOneGroupPhoneNumber;
    private String aapAdministrationsFitma;
    private String aapAdministrationsNameAndSurname;
    private String aapAdministrationsStreetAndHouse;
    private String aapAdministrationsZipAndCity;
    private String aapAdministrationsPhoneNumber;
    private String aapAdministrationsMobile;
    private String aapAdministrationsFax;
    private String aapAdministrationsEMail;
    
    public AAFormularData() {
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
    
    public String getDownloadSpeed() {
        return this.downloadSpeed;
    }
    
    public void setDownloadSpeed(String downloadSpeed) {
        if (downloadSpeed != null) {
            downloadSpeed = downloadSpeed.replace(";", ",");
        }
        this.downloadSpeed = downloadSpeed;
    }
    
    public boolean isClir() {
        return this.clip;
    }
    
    public void setClir(final boolean clir) {
        this.clip = clir;
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
        return String.format("%s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s", getType(), status, this.getSourceFileName(), this.formatDates(this.orderDate), this.customerName, this.customerNumber, this.account, this.name, this.surname, this.street, this.houseNumber, this.zipCode, this.city, this.taeBuilding, this.taeFloor, this.taeRoom, this.taeExtended, this.tcGender, this.tcName, this.tcSurname, this.tcPhone, this.tcMobile, this.tcFax, this.tcEMail, this.locName, this.locSurname, this.locStreet, this.locHouseNumber, this.locZipCode, this.locCity, this.prefix, this.number, this.extensionStart, this.extensionEnde, this.vtcGender, this.vtcName, this.vtcSurname, this.vtcPhone, this.vtcMobile, this.vtcFax, this.vtcEMail, this.oldRate, this.rate, this.fixNetFlat, this.mobileFlat, this.int1Flat, this.int2Flat, this.int3Flat, this.countOfLines, this.downloadSpeed, this.central, this.irregular, this.clip, this.classicPlus, this.fitter, this.additionalSevice, this.action, this.durration, this.preferredDate, this.voNummer, this.voEMail, this.voTelNr, this.OneGroupID, this.locationRefNum1, this.pilotrufnummer1, this.phoneNumberAndRange1, this.phoneRange1Ende, this.phoneNumberAndRange2, this.phoneRange2Ende, this.phoneNumberAndRange3, this.phoneRange3Ende, this.phoneNumberAndRange4, this.phoneRange4Ende, this.phoneNumberAndRange5, this.phoneRange5Ende, this.phoneNumberAndRange6, this.phoneRange6Ende, this.phoneNumberAndRange7, this.phoneRange7Ende, this.phoneNumberAndRange8, this.phoneRange8Ende, this.phoneNumberAndRange9, this.phoneRange9Ende, this.phoneNumberAndRange10, this.phoneRange10Ende, this.locationRefNum2, this.pilotrufnummer2, this.phoneNumberAndRange11, this.phoneRange11Ende, this.phoneNumberAndRange12, this.phoneRange12Ende, this.phoneNumberAndRange13, this.phoneRange13Ende, this.phoneNumberAndRange14, this.phoneRange14Ende, this.phoneNumberAndRange15, this.phoneRange15Ende, this.phoneNumberAndRange16, this.phoneRange16Ende, this.phoneNumberAndRange17, this.phoneRange17Ende, this.phoneNumberAndRange18, this.phoneRange18Ende, this.phoneNumberAndRange19, this.phoneRange19Ende, this.phoneNumberAndRange20, this.phoneRange20Ende, this.locationRefNum3, this.pilotrufnummer3, this.phoneNumberAndRange21, this.phoneRange21Ende, this.phoneNumberAndRange22, this.phoneRange22Ende, this.phoneNumberAndRange23, this.phoneRange23Ende, this.phoneNumberAndRange24, this.phoneRange24Ende, this.phoneNumberAndRange25, this.phoneRange25Ende, this.phoneNumberAndRange26, this.phoneRange26Ende, this.phoneNumberAndRange27, this.phoneRange27Ende, this.phoneNumberAndRange28, this.phoneRange28Ende, this.phoneNumberAndRange29, this.phoneRange29Ende, this.phoneNumberAndRange30, this.phoneRange30Ende, this.locationRefNum4, this.pilotrufnummer4, this.phoneNumberAndRange31, this.phoneRange31Ende, this.phoneNumberAndRange32, this.phoneRange32Ende, this.phoneNumberAndRange33, this.phoneRange33Ende, this.phoneNumberAndRange34, this.phoneRange34Ende, this.phoneNumberAndRange35, this.phoneRange35Ende, this.phoneNumberAndRange36, this.phoneRange36Ende, this.phoneNumberAndRange37, this.phoneRange37Ende, this.phoneNumberAndRange38, this.phoneRange38Ende, this.phoneNumberAndRange39, this.phoneRange39Ende, this.phoneNumberAndRange40, this.phoneRange40Ende, this.aapOneGroupID, this.aapOneGroupPhoneNumber, this.aapAdministrationsFitma, this.aapAdministrationsNameAndSurname, this.aapAdministrationsStreetAndHouse, this.aapAdministrationsZipAndCity, this.aapAdministrationsPhoneNumber, this.aapAdministrationsMobile, this.aapAdministrationsFax, this.aapAdministrationsEMail, fehlersBuilder.toString());
    }
    
    public String getExtensionStart() {
        return this.extensionStart;
    }
    
    public void setExtensionStart(final String extensionStart) {
        this.extensionStart = extensionStart;
    }
    
    public String getExtensionEnde() {
        return this.extensionEnde;
    }
    
    public void setExtensionEnde(final String extensionEnde) {
        this.extensionEnde = extensionEnde;
    }
    
    public String getVtcGender() {
        return this.vtcGender;
    }
    
    public void setVtcGender(final String vtcGender) {
        this.vtcGender = vtcGender;
    }
    
    public String getVtcName() {
        return this.vtcName;
    }
    
    public void setVtcName(final String vtcName) {
        this.vtcName = vtcName;
    }
    
    public String getVtcSurname() {
        return this.vtcSurname;
    }
    
    public void setVtcSurname(final String vtcSurname) {
        this.vtcSurname = vtcSurname;
    }
    
    public String getVtcPhone() {
        return this.vtcPhone;
    }
    
    public void setVtcPhone(final String vtcPhone) {
        this.vtcPhone = vtcPhone;
    }
    
    public String getVtcMobile() {
        return this.vtcMobile;
    }
    
    public void setVtcMobile(final String vtcMobile) {
        this.vtcMobile = vtcMobile;
    }
    
    public String getVtcFax() {
        return this.vtcFax;
    }
    
    public void setVtcFax(final String vtcFax) {
        this.vtcFax = vtcFax;
    }
    
    public String getTaeBuilding() {
        return this.taeBuilding;
    }
    
    public void setTaeBuilding(final String taeBuilding) {
        this.taeBuilding = taeBuilding;
    }
    
    public String getTaeFloor() {
        return this.taeFloor;
    }
    
    public void setTaeFloor(final String taeFloor) {
        this.taeFloor = taeFloor;
    }
    
    public String getTaeRoom() {
        return this.taeRoom;
    }
    
    public void setTaeRoom(final String taeRoom) {
        this.taeRoom = taeRoom;
    }
    
    public String getTaeExtended() {
        return this.taeExtended;
    }
    
    public void setTaeExtended(final String taeExtended) {
        this.taeExtended = taeExtended;
    }
    
    public String getVtcEMail() {
        return this.vtcEMail;
    }
    
    public void setVtcEMail(final String vtcEMail) {
        this.vtcEMail = vtcEMail;
    }
    
    public int getCountOfLines() {
        return this.countOfLines;
    }
    
    public void setCountOfLines(final int countOfLines) {
        this.countOfLines = countOfLines;
    }
    
    public boolean isCentral() {
        return this.central;
    }
    
    public void setCentral(final boolean central) {
        this.central = central;
    }
    
    public boolean isIrregular() {
        return this.irregular;
    }
    
    public void setIrregular(final boolean irregular) {
        this.irregular = irregular;
    }
    
    public boolean isClip() {
        return this.clip;
    }
    
    public void setClip(final boolean clip) {
        this.clip = clip;
    }
    
    public String getOneGroupID() {
        return this.OneGroupID;
    }
    
    public void setOneGroupID(final String oneGroupID) {
        this.OneGroupID = oneGroupID;
    }
    
    public String getLocationRefNum1() {
        return this.locationRefNum1;
    }
    
    public void setLocationRefNum1(final String locationRefNum1) {
        this.locationRefNum1 = locationRefNum1;
    }
    
    public String getPhoneNumberAndRange1() {
        return this.phoneNumberAndRange1;
    }
    
    public void setPhoneNumberAndRange1(final String phoneNumberAndRange1) {
        this.phoneNumberAndRange1 = phoneNumberAndRange1;
    }
    
    public String getPhoneRange1Ende() {
        return this.phoneRange1Ende;
    }
    
    public void setPhoneRange1Ende(final String phoneRange1Ende) {
        this.phoneRange1Ende = phoneRange1Ende;
    }
    
    public String getPhoneNumberAndRange2() {
        return this.phoneNumberAndRange2;
    }
    
    public void setPhoneNumberAndRange2(final String phoneNumberAndRange2) {
        this.phoneNumberAndRange2 = phoneNumberAndRange2;
    }
    
    public String getPhoneRange2Ende() {
        return this.phoneRange2Ende;
    }
    
    public void setPhoneRange2Ende(final String phoneRange2Ende) {
        this.phoneRange2Ende = phoneRange2Ende;
    }
    
    public String getPhoneNumberAndRange3() {
        return this.phoneNumberAndRange3;
    }
    
    public void setPhoneNumberAndRange3(final String phoneNumberAndRange3) {
        this.phoneNumberAndRange3 = phoneNumberAndRange3;
    }
    
    public String getPhoneRange3Ende() {
        return this.phoneRange3Ende;
    }
    
    public void setPhoneRange3Ende(final String phoneRange3Ende) {
        this.phoneRange3Ende = phoneRange3Ende;
    }
    
    public String getPhoneNumberAndRange4() {
        return this.phoneNumberAndRange4;
    }
    
    public void setPhoneNumberAndRange4(final String phoneNumberAndRange4) {
        this.phoneNumberAndRange4 = phoneNumberAndRange4;
    }
    
    public String getPhoneRange4Ende() {
        return this.phoneRange4Ende;
    }
    
    public void setPhoneRange4Ende(final String phoneRange4Ende) {
        this.phoneRange4Ende = phoneRange4Ende;
    }
    
    public String getPhoneNumberAndRange5() {
        return this.phoneNumberAndRange5;
    }
    
    public void setPhoneNumberAndRange5(final String phoneNumberAndRange5) {
        this.phoneNumberAndRange5 = phoneNumberAndRange5;
    }
    
    public String getPhoneRange5Ende() {
        return this.phoneRange5Ende;
    }
    
    public void setPhoneRange5Ende(final String phoneRange5Ende) {
        this.phoneRange5Ende = phoneRange5Ende;
    }
    
    public String getPhoneNumberAndRange6() {
        return this.phoneNumberAndRange6;
    }
    
    public void setPhoneNumberAndRange6(final String phoneNumberAndRange6) {
        this.phoneNumberAndRange6 = phoneNumberAndRange6;
    }
    
    public String getPhoneRange6Ende() {
        return this.phoneRange6Ende;
    }
    
    public void setPhoneRange6Ende(final String phoneRange6Ende) {
        this.phoneRange6Ende = phoneRange6Ende;
    }
    
    public String getPhoneNumbetAndRange7() {
        return this.phoneNumberAndRange7;
    }
    
    public void setPhoneNumbetAndRange7(final String phoneNumbetAndRange7) {
        this.phoneNumberAndRange7 = phoneNumbetAndRange7;
    }
    
    public String getPhoneRange7Ende() {
        return this.phoneRange7Ende;
    }
    
    public void setPhoneRange7Ende(final String phoneRange7Ende) {
        this.phoneRange7Ende = phoneRange7Ende;
    }
    
    public String getPhoneNumberAndRange8() {
        return this.phoneNumberAndRange8;
    }
    
    public void setPhoneNumberAndRange8(final String phoneNumberAndRange8) {
        this.phoneNumberAndRange8 = phoneNumberAndRange8;
    }
    
    public String getPhoneRange8Ende() {
        return this.phoneRange8Ende;
    }
    
    public void setPhoneRange8Ende(final String phoneRange8Ende) {
        this.phoneRange8Ende = phoneRange8Ende;
    }
    
    public String getPhoneNumberAndRange9() {
        return this.phoneNumberAndRange9;
    }
    
    public void setPhoneNumberAndRange9(final String phoneNumberAndRange9) {
        this.phoneNumberAndRange9 = phoneNumberAndRange9;
    }
    
    public String getPhoneRange9Ende() {
        return this.phoneRange9Ende;
    }
    
    public void setPhoneRange9Ende(final String phoneRange9Ende) {
        this.phoneRange9Ende = phoneRange9Ende;
    }
    
    public String getPhoneNumberAndRange10() {
        return this.phoneNumberAndRange10;
    }
    
    public void setPhoneNumberAndRange10(final String phoneNumberAndRange10) {
        this.phoneNumberAndRange10 = phoneNumberAndRange10;
    }
    
    public String getPhoneRange10Ende() {
        return this.phoneRange10Ende;
    }
    
    public void setPhoneRange10Ende(final String phoneRange10Ende) {
        this.phoneRange10Ende = phoneRange10Ende;
    }
    
    public String getLocationRefNum2() {
        return this.locationRefNum2;
    }
    
    public void setLocationRefNum2(final String locationRefNum2) {
        this.locationRefNum2 = locationRefNum2;
    }
    
    public String getPhoneNumberAndRange11() {
        return this.phoneNumberAndRange11;
    }
    
    public void setPhoneNumberAndRange11(final String phoneNumberAndRange11) {
        this.phoneNumberAndRange11 = phoneNumberAndRange11;
    }
    
    public String getPhoneRange11Ende() {
        return this.phoneRange11Ende;
    }
    
    public void setPhoneRange11Ende(final String phoneRange11Ende) {
        this.phoneRange11Ende = phoneRange11Ende;
    }
    
    public String getPhoneNumberAndRange12() {
        return this.phoneNumberAndRange12;
    }
    
    public void setPhoneNumberAndRange12(final String phoneNumberAndRange12) {
        this.phoneNumberAndRange12 = phoneNumberAndRange12;
    }
    
    public String getPhoneRange12Ende() {
        return this.phoneRange12Ende;
    }
    
    public void setPhoneRange12Ende(final String phoneRange12Ende) {
        this.phoneRange12Ende = phoneRange12Ende;
    }
    
    public String getPhoneNumberAndRange13() {
        return this.phoneNumberAndRange13;
    }
    
    public void setPhoneNumberAndRange13(final String phoneNumberAndRange13) {
        this.phoneNumberAndRange13 = phoneNumberAndRange13;
    }
    
    public String getPhoneRange13Ende() {
        return this.phoneRange13Ende;
    }
    
    public void setPhoneRange13Ende(final String phoneRange13Ende) {
        this.phoneRange13Ende = phoneRange13Ende;
    }
    
    public String getPhoneNumberAndRange14() {
        return this.phoneNumberAndRange14;
    }
    
    public void setPhoneNumberAndRange14(final String phoneNumberAndRange14) {
        this.phoneNumberAndRange14 = phoneNumberAndRange14;
    }
    
    public String getPhoneRange14Ende() {
        return this.phoneRange14Ende;
    }
    
    public void setPhoneRange14Ende(final String phoneRange14Ende) {
        this.phoneRange14Ende = phoneRange14Ende;
    }
    
    public String getPhoneNumberAndRange15() {
        return this.phoneNumberAndRange15;
    }
    
    public void setPhoneNumberAndRange15(final String phoneNumberAndRange15) {
        this.phoneNumberAndRange15 = phoneNumberAndRange15;
    }
    
    public String getPhoneRange15Ende() {
        return this.phoneRange15Ende;
    }
    
    public void setPhoneRange15Ende(final String phoneRange15Ende) {
        this.phoneRange15Ende = phoneRange15Ende;
    }
    
    public String getPhoneNumberAndRange16() {
        return this.phoneNumberAndRange16;
    }
    
    public void setPhoneNumberAndRange16(final String phoneNumberAndRange16) {
        this.phoneNumberAndRange16 = phoneNumberAndRange16;
    }
    
    public String getPhoneRange16Ende() {
        return this.phoneRange16Ende;
    }
    
    public void setPhoneRange16Ende(final String phoneRange16Ende) {
        this.phoneRange16Ende = phoneRange16Ende;
    }
    
    public String getPhoneNumberAndRange17() {
        return this.phoneNumberAndRange17;
    }
    
    public void setPhoneNumberAndRange17(final String phoneNumbetAndRange17) {
        this.phoneNumberAndRange17 = phoneNumbetAndRange17;
    }
    
    public String getPhoneRange17Ende() {
        return this.phoneRange17Ende;
    }
    
    public void setPhoneRange17Ende(final String phoneRange17Ende) {
        this.phoneRange17Ende = phoneRange17Ende;
    }
    
    public String getPhoneNumberAndRange18() {
        return this.phoneNumberAndRange18;
    }
    
    public void setPhoneNumberAndRange18(final String phoneNumberAndRange18) {
        this.phoneNumberAndRange18 = phoneNumberAndRange18;
    }
    
    public String getPhoneRange18Ende() {
        return this.phoneRange18Ende;
    }
    
    public void setPhoneRange18Ende(final String phoneRange18Ende) {
        this.phoneRange18Ende = phoneRange18Ende;
    }
    
    public String getPhoneNumberAndRange19() {
        return this.phoneNumberAndRange19;
    }
    
    public void setPhoneNumberAndRange19(final String phoneNumberAndRange19) {
        this.phoneNumberAndRange19 = phoneNumberAndRange19;
    }
    
    public String getPhoneRange19Ende() {
        return this.phoneRange19Ende;
    }
    
    public void setPhoneRange19Ende(final String phoneRange19Ende) {
        this.phoneRange19Ende = phoneRange19Ende;
    }
    
    public String getPhoneNumberAndRange20() {
        return this.phoneNumberAndRange20;
    }
    
    public void setPhoneNumberAndRange20(final String phoneNumberAndRange20) {
        this.phoneNumberAndRange20 = phoneNumberAndRange20;
    }
    
    public String getPhoneRange20Ende() {
        return this.phoneRange20Ende;
    }
    
    public void setPhoneRange20Ende(final String phoneRange20Ende) {
        this.phoneRange20Ende = phoneRange20Ende;
    }
    
    public String getLocationRefNum3() {
        return this.locationRefNum3;
    }
    
    public void setLocationRefNum3(final String locationRefNum3) {
        this.locationRefNum3 = locationRefNum3;
    }
    
    public String getPhoneNumberAndRange21() {
        return this.phoneNumberAndRange21;
    }
    
    public void setPhoneNumberAndRange21(final String phoneNumberAndRange21) {
        this.phoneNumberAndRange21 = phoneNumberAndRange21;
    }
    
    public String getPhoneRange21Ende() {
        return this.phoneRange21Ende;
    }
    
    public void setPhoneRange21Ende(final String phoneRange21Ende) {
        this.phoneRange21Ende = phoneRange21Ende;
    }
    
    public String getPhoneNumberAndRange22() {
        return this.phoneNumberAndRange22;
    }
    
    public void setPhoneNumberAndRange22(final String phoneNumberAndRange22) {
        this.phoneNumberAndRange22 = phoneNumberAndRange22;
    }
    
    public String getPhoneRange22Ende() {
        return this.phoneRange22Ende;
    }
    
    public void setPhoneRange22Ende(final String phoneRange22Ende) {
        this.phoneRange22Ende = phoneRange22Ende;
    }
    
    public String getPhoneNumberAndRange23() {
        return this.phoneNumberAndRange23;
    }
    
    public void setPhoneNumberAndRange23(final String phoneNumberAndRange23) {
        this.phoneNumberAndRange23 = phoneNumberAndRange23;
    }
    
    public String getPhoneRange23Ende() {
        return this.phoneRange23Ende;
    }
    
    public void setPhoneRange23Ende(final String phoneRange23Ende) {
        this.phoneRange23Ende = phoneRange23Ende;
    }
    
    public String getPhoneNumberAndRange24() {
        return this.phoneNumberAndRange24;
    }
    
    public void setPhoneNumberAndRange24(final String phoneNumberAndRange24) {
        this.phoneNumberAndRange24 = phoneNumberAndRange24;
    }
    
    public String getPhoneRange24Ende() {
        return this.phoneRange24Ende;
    }
    
    public void setPhoneRange24Ende(final String phoneRange24Ende) {
        this.phoneRange24Ende = phoneRange24Ende;
    }
    
    public String getPhoneNumberAndRange25() {
        return this.phoneNumberAndRange25;
    }
    
    public void setPhoneNumberAndRange25(final String phoneNumberAndRange25) {
        this.phoneNumberAndRange25 = phoneNumberAndRange25;
    }
    
    public String getPhoneRange25Ende() {
        return this.phoneRange25Ende;
    }
    
    public void setPhoneRange25Ende(final String phoneRange25Ende) {
        this.phoneRange25Ende = phoneRange25Ende;
    }
    
    public String getPhoneNumberAndRange26() {
        return this.phoneNumberAndRange26;
    }
    
    public void setPhoneNumberAndRange26(final String phoneNumberAndRange26) {
        this.phoneNumberAndRange26 = phoneNumberAndRange26;
    }
    
    public String getPhoneRange26Ende() {
        return this.phoneRange26Ende;
    }
    
    public void setPhoneRange26Ende(final String phoneRange26Ende) {
        this.phoneRange26Ende = phoneRange26Ende;
    }
    
    public String getPhoneNumberAndRange27() {
        return this.phoneNumberAndRange27;
    }
    
    public void setPhoneNumberAndRange27(final String phoneNumbetAndRange27) {
        this.phoneNumberAndRange27 = phoneNumbetAndRange27;
    }
    
    public String getPhoneRange27Ende() {
        return this.phoneRange27Ende;
    }
    
    public void setPhoneRange27Ende(final String phoneRange27Ende) {
        this.phoneRange27Ende = phoneRange27Ende;
    }
    
    public String getPhoneNumberAndRange28() {
        return this.phoneNumberAndRange28;
    }
    
    public void setPhoneNumberAndRange28(final String phoneNumberAndRange28) {
        this.phoneNumberAndRange28 = phoneNumberAndRange28;
    }
    
    public String getPhoneRange28Ende() {
        return this.phoneRange28Ende;
    }
    
    public void setPhoneRange28Ende(final String phoneRange28Ende) {
        this.phoneRange28Ende = phoneRange28Ende;
    }
    
    public String getPhoneNumberAndRange29() {
        return this.phoneNumberAndRange29;
    }
    
    public void setPhoneNumberAndRange29(final String phoneNumberAndRange29) {
        this.phoneNumberAndRange29 = phoneNumberAndRange29;
    }
    
    public String getPhoneRange29Ende() {
        return this.phoneRange29Ende;
    }
    
    public void setPhoneRange29Ende(final String phoneRange29Ende) {
        this.phoneRange29Ende = phoneRange29Ende;
    }
    
    public String getPhoneNumberAndRange30() {
        return this.phoneNumberAndRange30;
    }
    
    public void setPhoneNumberAndRange30(final String phoneNumberAndRange30) {
        this.phoneNumberAndRange30 = phoneNumberAndRange30;
    }
    
    public String getPhoneRange30Ende() {
        return this.phoneRange30Ende;
    }
    
    public void setPhoneRange30Ende(final String phoneRange30Ende) {
        this.phoneRange30Ende = phoneRange30Ende;
    }
    
    public String getLocationRefNum4() {
        return this.locationRefNum4;
    }
    
    public void setLocationRefNum4(final String locationRefNum4) {
        this.locationRefNum4 = locationRefNum4;
    }
    
    public String getPhoneNumberAndRange31() {
        return this.phoneNumberAndRange31;
    }
    
    public void setPhoneNumberAndRange31(final String phoneNumberAndRange31) {
        this.phoneNumberAndRange31 = phoneNumberAndRange31;
    }
    
    public String getPhoneRange31Ende() {
        return this.phoneRange31Ende;
    }
    
    public void setPhoneRange31Ende(final String phoneRange31Ende) {
        this.phoneRange31Ende = phoneRange31Ende;
    }
    
    public String getPhoneNumberAndRange32() {
        return this.phoneNumberAndRange32;
    }
    
    public void setPhoneNumberAndRange32(final String phoneNumberAndRange32) {
        this.phoneNumberAndRange32 = phoneNumberAndRange32;
    }
    
    public String getPhoneRange32Ende() {
        return this.phoneRange32Ende;
    }
    
    public void setPhoneRange32Ende(final String phoneRange32Ende) {
        this.phoneRange32Ende = phoneRange32Ende;
    }
    
    public String getPhoneNumberAndRange33() {
        return this.phoneNumberAndRange33;
    }
    
    public void setPhoneNumberAndRange33(final String phoneNumberAndRange33) {
        this.phoneNumberAndRange33 = phoneNumberAndRange33;
    }
    
    public String getPhoneRange33Ende() {
        return this.phoneRange33Ende;
    }
    
    public void setPhoneRange33Ende(final String phoneRange33Ende) {
        this.phoneRange33Ende = phoneRange33Ende;
    }
    
    public String getPhoneNumberAndRange34() {
        return this.phoneNumberAndRange34;
    }
    
    public void setPhoneNumberAndRange34(final String phoneNumberAndRange34) {
        this.phoneNumberAndRange34 = phoneNumberAndRange34;
    }
    
    public String getPhoneRange34Ende() {
        return this.phoneRange34Ende;
    }
    
    public void setPhoneRange34Ende(final String phoneRange34Ende) {
        this.phoneRange34Ende = phoneRange34Ende;
    }
    
    public String getPhoneNumberAndRange35() {
        return this.phoneNumberAndRange35;
    }
    
    public void setPhoneNumberAndRange35(final String phoneNumberAndRange35) {
        this.phoneNumberAndRange35 = phoneNumberAndRange35;
    }
    
    public String getPhoneRange35Ende() {
        return this.phoneRange35Ende;
    }
    
    public void setPhoneRange35Ende(final String phoneRange35Ende) {
        this.phoneRange35Ende = phoneRange35Ende;
    }
    
    public String getPhoneNumberAndRange36() {
        return this.phoneNumberAndRange36;
    }
    
    public void setPhoneNumberAndRange36(final String phoneNumberAndRange36) {
        this.phoneNumberAndRange36 = phoneNumberAndRange36;
    }
    
    public String getPhoneRange36Ende() {
        return this.phoneRange36Ende;
    }
    
    public void setPhoneRange36Ende(final String phoneRange36Ende) {
        this.phoneRange36Ende = phoneRange36Ende;
    }
    
    public String getPhoneNumberAndRange37() {
        return this.phoneNumberAndRange37;
    }
    
    public void setPhoneNumberAndRange37(final String phoneNumbetAndRange37) {
        this.phoneNumberAndRange37 = phoneNumbetAndRange37;
    }
    
    public String getPhoneRange37Ende() {
        return this.phoneRange37Ende;
    }
    
    public void setPhoneRange37Ende(final String phoneRange37Ende) {
        this.phoneRange37Ende = phoneRange37Ende;
    }
    
    public String getPhoneNumberAndRange38() {
        return this.phoneNumberAndRange38;
    }
    
    public void setPhoneNumberAndRange38(final String phoneNumberAndRange38) {
        this.phoneNumberAndRange38 = phoneNumberAndRange38;
    }
    
    public String getPhoneRange38Ende() {
        return this.phoneRange38Ende;
    }
    
    public void setPhoneRange38Ende(final String phoneRange38Ende) {
        this.phoneRange38Ende = phoneRange38Ende;
    }
    
    public String getPhoneNumberAndRange39() {
        return this.phoneNumberAndRange39;
    }
    
    public void setPhoneNumberAndRange39(final String phoneNumberAndRange39) {
        this.phoneNumberAndRange39 = phoneNumberAndRange39;
    }
    
    public String getPhoneRange39Ende() {
        return this.phoneRange39Ende;
    }
    
    public void setPhoneRange39Ende(final String phoneRange39Ende) {
        this.phoneRange39Ende = phoneRange39Ende;
    }
    
    public String getPhoneNumberAndRange40() {
        return this.phoneNumberAndRange40;
    }
    
    public void setPhoneNumberAndRange40(final String phoneNumberAndRange40) {
        this.phoneNumberAndRange40 = phoneNumberAndRange40;
    }
    
    public String getPhoneRange40Ende() {
        return this.phoneRange40Ende;
    }
    
    public void setPhoneRange40Ende(final String phoneRange40Ende) {
        this.phoneRange40Ende = phoneRange40Ende;
    }
    
    public String getAapOneGroupID() {
        return this.aapOneGroupID;
    }
    
    public void setAapOneGroupID(final String aapOneGroupID) {
        this.aapOneGroupID = aapOneGroupID;
    }
    
    public String getAapOneGroupPhoneNumber() {
        return this.aapOneGroupPhoneNumber;
    }
    
    public void setAapOneGroupPhoneNumber(final String aapOneGroupPhoneNumber) {
        this.aapOneGroupPhoneNumber = aapOneGroupPhoneNumber;
    }
    
    public String getAapAdministrationsFitma() {
        return this.aapAdministrationsFitma;
    }
    
    public void setAapAdministrationsFitma(final String aapAdministrationsFitma) {
        this.aapAdministrationsFitma = aapAdministrationsFitma;
    }
    
    public String getAapAdministrationsNameAndSurname() {
        return this.aapAdministrationsNameAndSurname;
    }
    
    public void setAapAdministrationsNameAndSurname(final String aapAdministrationsNameAndSurname) {
        this.aapAdministrationsNameAndSurname = aapAdministrationsNameAndSurname;
    }
    
    public String getAapAdministrationsStreetAndHouse() {
        return this.aapAdministrationsStreetAndHouse;
    }
    
    public void setAapAdministrationsStreetAndHouse(final String aapAdministrationsStreetAndHouse) {
        this.aapAdministrationsStreetAndHouse = aapAdministrationsStreetAndHouse;
    }
    
    public String getAapAdministrationsZipAndCity() {
        return this.aapAdministrationsZipAndCity;
    }
    
    public void setAapAdministrationsZipAndCity(final String aapAdministrationsZipAndCity) {
        this.aapAdministrationsZipAndCity = aapAdministrationsZipAndCity;
    }
    
    public String getAapAdministrationsPhoneNumber() {
        return this.aapAdministrationsPhoneNumber;
    }
    
    public void setAapAdministrationsPhoneNumber(final String aapAdministrationsPhoneNumber) {
        this.aapAdministrationsPhoneNumber = aapAdministrationsPhoneNumber;
    }
    
    public String getAapAdministrationsMobile() {
        return this.aapAdministrationsMobile;
    }
    
    public void setAapAdministrationsMobile(final String aapAdministrationsMobile) {
        this.aapAdministrationsMobile = aapAdministrationsMobile;
    }
    
    public String getAapAdministrationsFax() {
        return this.aapAdministrationsFax;
    }
    
    public void setAapAdministrationsFax(final String aapAdministrationsFax) {
        this.aapAdministrationsFax = aapAdministrationsFax;
    }
    
    public String getAapAdministrationsEMail() {
        return this.aapAdministrationsEMail;
    }
    
    public void setAapAdministrationsEMail(final String aapAdministrationsEMail) {
        this.aapAdministrationsEMail = aapAdministrationsEMail;
    }
    
    public void setCheckFehlers(final List<String> checkFehlers) {
        this.checkFehlers = checkFehlers;
    }
    
    public void setFehlers(final List<String> fehlers) {
        this.fehlers = fehlers;
    }
    
    private String formatDates(final Date date) {
        if (date == null) {
            return "";
        }
        return AAFormularData.sdf.format(date);
    }
    
    public final String getPilotrufnummer1() {
        return this.pilotrufnummer1;
    }
    
    public final void setPilotrufnummer1(final String pilotrufnummer1) {
        this.pilotrufnummer1 = pilotrufnummer1;
    }
    
    public final String getPilotrufnummer2() {
        return this.pilotrufnummer2;
    }
    
    public final void setPilotrufnummer2(final String pilotrufnummer2) {
        this.pilotrufnummer2 = pilotrufnummer2;
    }
    
    public final String getPilotrufnummer3() {
        return this.pilotrufnummer3;
    }
    
    public final void setPilotrufnummer3(final String pilotrufnummer3) {
        this.pilotrufnummer3 = pilotrufnummer3;
    }
    
    public final String getPilotrufnummer4() {
        return this.pilotrufnummer4;
    }
    
    public final void setPilotrufnummer4(final String pilotrufnummer4) {
        this.pilotrufnummer4 = pilotrufnummer4;
    }
    
    @Override
    public boolean check() {
        boolean result = true;
        this.checkFehlers.clear();
        if (this.orderDate == null) {
            this.checkFehlers.add("Auftragsdatum leer");
            result = false;
        }
        if (this.orderDate.after(new Date())) {
            this.checkFehlers.add("Auftragsdatum in Zukunft");
            result = false;
        }
        if (this.customerName == null || this.customerName.length() == 0|| this.customerNumber == "Keine") {//Add
            this.checkFehlers.add("Kundenname leer");
            result = false;
        }
        if (this.customerNumber == null || this.customerNumber.length() <= 3) {
            this.checkFehlers.add("Kundennummer leer oder unm\u00f6glich");
            result = false;
        }
        if (this.account == null || this.account.length() == 0) {
            this.checkFehlers.add("Rechnungskonto leer");
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
        if (this.zipCode == null || this.zipCode.length() == 0) {
            this.checkFehlers.add("Postleitzahl leer");
            result = false;
        }
        if (this.city == null || this.city.length() == 0) {
            this.checkFehlers.add("Stadt leer");
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
        }
        if (this.locCity == null || this.locCity.length() == 0) {
            this.checkFehlers.add("Anschluss-Stadt der  leer");
            result = false;
        }
        if (this.prefix == null || this.prefix.length() == 0) {
            this.checkFehlers.add("Vorwahl unbekannt leer");
            result = false;
        }
        if (this.number == null || this.number.length() == 0) {
            this.checkFehlers.add("Telfonnummer leer");
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
        }
        /*if (this.voEMail == null || this.voEMail.length() == 0) {
            this.checkFehlers.add("voEMail leer");
            result = false;
        }*/
        return result;
    }
    
    public static String getType() {
        return "AAPlus";
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
    
    @Override
    public String toString() {
        return String.format("AAFormularData [checkFehlers=%s, fehlers=%s, sourceFileName=%s, orderDate=%s, customerName=%s, customerNumber=%s, account=%s, name=%s, surname=%s, street=%s, houseNumber=%s, zipCode=%s, city=%s, tcGender=%s, tcName=%s, tcSurname=%s, tcPhone=%s, tcMobile=%s, tcFax=%s, tcEMail=%s, locName=%s, locSurname=%s, locStreet=%s, locHouseNumber=%s, locZipCode=%s, locCity=%s, prefix=%s, number=%s, extensionStart=%s, extensionEnde=%s, vtcGender=%s, vtcName=%s, vtcSurname=%s, vtcPhone=%s, vtcMobile=%s, vtcFax=%s, vtcEMail=%s, oldRate=%s, rate=%s, fixNetFlat=%s, mobileFlat=%s, int1Flat=%s, int2Flat=%s, int3Flat=%s, countOfLines=%s, downloadSpeed=%s, central=%s, irregular=%s, clip=%s, classicPlus=%s, fitter=%s, additionalSevice=%s, action=%s, durration=%s, preferredDate=%s, voNummer=%s, voEMail=%s, voTelNr=%s, OneGroupID=%s, locationRefNum1=%s, phoneNumberAndRange1=%s, phoneRange1Ende=%s, phoneNumberAndRange2=%s, phoneRange2Ende=%s, phoneNumberAndRange3=%s, phoneRange3Ende=%s, phoneNumberAndRange4=%s, phoneRange4Ende=%s, phoneNumberAndRange5=%s, phoneRange5Ende=%s, phoneNumberAndRange6=%s, phoneRange6Ende=%s, phoneNumbetAndRange7=%s, phoneRange7Ende=%s, phoneNumberAndRange8=%s, phoneRange8Ende=%s, phoneNumberAndRange9=%s, phoneRange9Ende=%s, phoneNumberAndRange10=%s, phoneRange10Ende=%s, locationRefNum2=%s, phoneNumberAndRange11=%s, phoneRange11Ende=%s, phoneNumberAndRange12=%s, phoneRange12Ende=%s, phoneNumberAndRange13=%s, phoneRange13Ende=%s, phoneNumberAndRange14=%s, phoneRange14Ende=%s, phoneNumberAndRange15=%s, phoneRange15Ende=%s, phoneNumberAndRange16=%s, phoneRange16Ende=%s, phoneNumbetAndRange17=%s, phoneRange17Ende=%s, phoneNumberAndRange18=%s, phoneRange18Ende=%s, phoneNumberAndRange19=%s, phoneRange19Ende=%s, phoneNumberAndRange20=%s, phoneRange20Ende=%s, locationRefNum3=%s, phoneNumberAndRange21=%s, phoneRange21Ende=%s, phoneNumberAndRange22=%s, phoneRange22Ende=%s, phoneNumberAndRange23=%s, phoneRange23Ende=%s, phoneNumberAndRange24=%s, phoneRange24Ende=%s, phoneNumberAndRange25=%s, phoneRange25Ende=%s, phoneNumberAndRange26=%s, phoneRange26Ende=%s, phoneNumbetAndRange27=%s, phoneRange27Ende=%s, phoneNumberAndRange28=%s, phoneRange28Ende=%s, phoneNumberAndRange29=%s, phoneRange29Ende=%s, phoneNumberAndRange30=%s, phoneRange30Ende=%s, locationRefNum4=%s, phoneNumberAndRange31=%s, phoneRange31Ende=%s, phoneNumberAndRange32=%s, phoneRange32Ende=%s, phoneNumberAndRange33=%s, phoneRange33Ende=%s, phoneNumberAndRange34=%s, phoneRange34Ende=%s, phoneNumberAndRange35=%s, phoneRange35Ende=%s, phoneNumberAndRange36=%s, phoneRange36Ende=%s, phoneNumbetAndRange37=%s, phoneRange37Ende=%s, phoneNumberAndRange38=%s, phoneRange38Ende=%s, phoneNumberAndRange39=%s, phoneRange39Ende=%s, phoneNumberAndRange40=%s, phoneRange40Ende=%s, aapOneGroupID=%s, aapOneGroupPhoneNumber=%s, aapAdministrationsFitma=%s, aapAdministrationsNameAndSurname=%s, aapAdministrationsStreetAndHouse=%s, aapAdministrationsZipAndCity=%s, aapAdministrationsPhoneNumber=%s, aapAdministrationsMobile=%s, aapAdministrationsFax=%s, aapAdministrationsEMail=%s]", this.checkFehlers, this.fehlers, this.getSourceFileName(), this.orderDate, this.customerName, this.customerNumber, this.account, this.name, this.surname, this.street, this.houseNumber, this.zipCode, this.city, this.tcGender, this.tcName, this.tcSurname, this.tcPhone, this.tcMobile, this.tcFax, this.tcEMail, this.locName, this.locSurname, this.locStreet, this.locHouseNumber, this.locZipCode, this.locCity, this.prefix, this.number, this.extensionStart, this.extensionEnde, this.vtcGender, this.vtcName, this.vtcSurname, this.vtcPhone, this.vtcMobile, this.vtcFax, this.vtcEMail, this.oldRate, this.rate, this.fixNetFlat, this.mobileFlat, this.int1Flat, this.int2Flat, this.int3Flat, this.countOfLines, this.downloadSpeed, this.central, this.irregular, this.clip, this.classicPlus, this.fitter, this.additionalSevice, this.action, this.durration, this.preferredDate, this.voNummer, this.voEMail, this.voTelNr, this.OneGroupID, this.locationRefNum1, this.pilotrufnummer1, this.phoneNumberAndRange1, this.phoneRange1Ende, this.phoneNumberAndRange2, this.phoneRange2Ende, this.phoneNumberAndRange3, this.phoneRange3Ende, this.phoneNumberAndRange4, this.phoneRange4Ende, this.phoneNumberAndRange5, this.phoneRange5Ende, this.phoneNumberAndRange6, this.phoneRange6Ende, this.phoneNumberAndRange7, this.phoneRange7Ende, this.phoneNumberAndRange8, this.phoneRange8Ende, this.phoneNumberAndRange9, this.phoneRange9Ende, this.phoneNumberAndRange10, this.phoneRange10Ende, this.locationRefNum2, this.pilotrufnummer2, this.phoneNumberAndRange11, this.phoneRange11Ende, this.phoneNumberAndRange12, this.phoneRange12Ende, this.phoneNumberAndRange13, this.phoneRange13Ende, this.phoneNumberAndRange14, this.phoneRange14Ende, this.phoneNumberAndRange15, this.phoneRange15Ende, this.phoneNumberAndRange16, this.phoneRange16Ende, this.phoneNumberAndRange17, this.phoneRange17Ende, this.phoneNumberAndRange18, this.phoneRange18Ende, this.phoneNumberAndRange19, this.phoneRange19Ende, this.phoneNumberAndRange20, this.phoneRange20Ende, this.locationRefNum3, this.pilotrufnummer3, this.phoneNumberAndRange21, this.phoneRange21Ende, this.phoneNumberAndRange22, this.phoneRange22Ende, this.phoneNumberAndRange23, this.phoneRange23Ende, this.phoneNumberAndRange24, this.phoneRange24Ende, this.phoneNumberAndRange25, this.phoneRange25Ende, this.phoneNumberAndRange26, this.phoneRange26Ende, this.phoneNumberAndRange27, this.phoneRange27Ende, this.phoneNumberAndRange28, this.phoneRange28Ende, this.phoneNumberAndRange29, this.phoneRange29Ende, this.phoneNumberAndRange30, this.phoneRange30Ende, this.locationRefNum4, this.pilotrufnummer4, this.phoneNumberAndRange31, this.phoneRange31Ende, this.phoneNumberAndRange32, this.phoneRange32Ende, this.phoneNumberAndRange33, this.phoneRange33Ende, this.phoneNumberAndRange34, this.phoneRange34Ende, this.phoneNumberAndRange35, this.phoneRange35Ende, this.phoneNumberAndRange36, this.phoneRange36Ende, this.phoneNumberAndRange37, this.phoneRange37Ende, this.phoneNumberAndRange38, this.phoneRange38Ende, this.phoneNumberAndRange39, this.phoneRange39Ende, this.phoneNumberAndRange40, this.phoneRange40Ende, this.aapOneGroupID, this.aapOneGroupPhoneNumber, this.aapAdministrationsFitma, this.aapAdministrationsNameAndSurname, this.aapAdministrationsStreetAndHouse, this.aapAdministrationsZipAndCity, this.aapAdministrationsPhoneNumber, this.aapAdministrationsMobile, this.aapAdministrationsFax, this.aapAdministrationsEMail);
    }
    
    public static String[] getHeaderString() {
        return new String[] { "Typ", "Status", "Datei", "Auftrag vom", "Kundenname", "VF-Festnetz-Kunden-Nr", "Rechnungskontonummer", "Firmenname bzw. Name", "Vorname", "Stra\u00dfe", "Nr.", "PLZ", "Ort", "Lagebezeichnung Geb\u00e4ude", "Lagebezeichnung Etage", "Lagebezeichnung Raum", "Lagebezeichnung Weitere Beschreibung", "technische Ansprechpartner Geschlecht", "technische Ansprechpartner Name", "technische Ansprechpartner Vorname", "technische Ansprechpartner Rufnummer", "technische Ansprechpartner Mobilfunknummer", "technische Ansprechpartner Faxnummer", "technische Ansprechpartner E-Mail-Adresse", "Anschluss Firmenname bzw. Name", "Anschluss Vorname", "Anschluss Stra\u00dfe", "Anschluss Nr.", "Anschluss PLZ", "Anschluss Ort", "Anschluss Vorwahl", "Anschluss Anlagenrufnummer", "Durchwahl von", "Durchwahl bis", "Vorort Ansprechpartner Geschlecht", "Vorort  Ansprechpartner Name", "Vorort  Ansprechpartner Vorname", "Vorort  Ansprechpartner Rufnummer", "Vorort  Ansprechpartner Mobilfunknummer", "Vorort Ansprechpartner Faxnummer", "Vorort Ansprechpartner E-Mail-Adresse", "Alte Tarif beibehalten", "neue Tarif", "Nationale Flat", "Mobilfunk Flat", "Internatiionale Flat 1", "Internatiionale Flat 2", "Internatiionale Flat 3", "Anzahl Sprachkan\u00e4le", "Bandbreite", "Rufnummer f\u00fcr die Zentrale", "iregul\u00e4ren Nebenstellenbereich", "Clip", "Service Level classic plus", "Techniker-Service", "Zusatzleistungen", "Aktionskennung", "Vertragslaufzeit", "Terminwunsch", "VO Nummer", "VO eMail", "VO Rufnummer", "OneGroup-ID", "Standort Referenznummer 1", "Pilotrufnummer 1", "Rufnummer/Rufnummernbereich 1 von ", "Rufnummer/Rufnummernbereich 1 Ende ", "Rufnummer/Rufnummernbereich 2 von ", "Rufnummer/Rufnummernbereich 2 Ende ", "Rufnummer/Rufnummernbereich 3 von ", "Rufnummer/Rufnummernbereich 3 Ende ", "Rufnummer/Rufnummernbereich 4 von ", "Rufnummer/Rufnummernbereich 4 Ende ", "Rufnummer/Rufnummernbereich 5 von ", "Rufnummer/Rufnummernbereich 5 Ende ", "Rufnummer/Rufnummernbereich 6 von ", "Rufnummer/Rufnummernbereich 6 Ende ", "Rufnummer/Rufnummernbereich 7 von ", "Rufnummer/Rufnummernbereich 7 Ende ", "Rufnummer/Rufnummernbereich 8 von ", "Rufnummer/Rufnummernbereich 8 Ende ", "Rufnummer/Rufnummernbereich 9 von ", "Rufnummer/Rufnummernbereich 9 Ende ", "Rufnummer/Rufnummernbereich 10 von ", "Rufnummer/Rufnummernbereich 10 Ende ", "Standort Referenznummer 2", "Pilotrufnummer 2", "Rufnummer/Rufnummernbereich 11 von ", "Rufnummer/Rufnummernbereich 11 Ende ", "Rufnummer/Rufnummernbereich 12 von ", "Rufnummer/Rufnummernbereich 12 Ende ", "Rufnummer/Rufnummernbereich 13 von ", "Rufnummer/Rufnummernbereich 13 Ende ", "Rufnummer/Rufnummernbereich 14 von ", "Rufnummer/Rufnummernbereich 14 Ende ", "Rufnummer/Rufnummernbereich 15 von ", "Rufnummer/Rufnummernbereich 15 Ende ", "Rufnummer/Rufnummernbereich 16 von ", "Rufnummer/Rufnummernbereich 16 Ende ", "Rufnummer/Rufnummernbereich 17 von ", "Rufnummer/Rufnummernbereich 17 Ende ", "Rufnummer/Rufnummernbereich 18 von ", "Rufnummer/Rufnummernbereich 18 Ende ", "Rufnummer/Rufnummernbereich 19 von ", "Rufnummer/Rufnummernbereich 19 Ende ", "Rufnummer/Rufnummernbereich 20 von ", "Rufnummer/Rufnummernbereich 20 Ende ", "Standort Referenznummer 3", "Pilotrufnummer 3", "Rufnummer/Rufnummernbereich 21 von ", "Rufnummer/Rufnummernbereich 21 Ende ", "Rufnummer/Rufnummernbereich 22 von ", "Rufnummer/Rufnummernbereich 22 Ende ", "Rufnummer/Rufnummernbereich 23 von ", "Rufnummer/Rufnummernbereich 23 Ende ", "Rufnummer/Rufnummernbereich 24 von ", "Rufnummer/Rufnummernbereich 24 Ende ", "Rufnummer/Rufnummernbereich 25 von ", "Rufnummer/Rufnummernbereich 25 Ende ", "Rufnummer/Rufnummernbereich 26 von ", "Rufnummer/Rufnummernbereich 26 Ende ", "Rufnummer/Rufnummernbereich 27 von ", "Rufnummer/Rufnummernbereich 27 Ende ", "Rufnummer/Rufnummernbereich 28 von ", "Rufnummer/Rufnummernbereich 28 Ende ", "Rufnummer/Rufnummernbereich 29 von ", "Rufnummer/Rufnummernbereich 29 Ende ", "Rufnummer/Rufnummernbereich 30 von ", "Rufnummer/Rufnummernbereich 30 Ende ", "Standort Referenznummer 4", "Pilotrufnummer 4", "Rufnummer/Rufnummernbereich 31 von ", "Rufnummer/Rufnummernbereich 31 Ende ", "Rufnummer/Rufnummernbereich 32 von ", "Rufnummer/Rufnummernbereich 32 Ende ", "Rufnummer/Rufnummernbereich 33 von ", "Rufnummer/Rufnummernbereich 33 Ende ", "Rufnummer/Rufnummernbereich 34 von ", "Rufnummer/Rufnummernbereich 34 Ende ", "Rufnummer/Rufnummernbereich 35 von ", "Rufnummer/Rufnummernbereich 35 Ende ", "Rufnummer/Rufnummernbereich 36 von ", "Rufnummer/Rufnummernbereich 36 Ende ", "Rufnummer/Rufnummernbereich 37 von ", "Rufnummer/Rufnummernbereich 37 Ende ", "Rufnummer/Rufnummernbereich 38 von ", "Rufnummer/Rufnummernbereich 38 Ende ", "Rufnummer/Rufnummernbereich 39 von ", "Rufnummer/Rufnummernbereich 39 Ende ", "Rufnummer/Rufnummernbereich 40 von ", "Rufnummer/Rufnummernbereich 40 Ende ", "Anlagen-Anschluss Plus OneGroup-ID", "OneGroup  Rufnummer", "Administrationszugang Firma", "Administrationszugang Name, Vorname", "Administrationszugang Stra\u00dfe/Nr.", "Administrationszugang PLZ/Ort", "Administrationszugang Rufnummer", "Administrationszugang Mobilfunknummer", "Administrationszugang Faxnummer", "Administrationszugang E-Mail-Adresse", "Fehler/Mangel" };
    }
    
    public static void main(final String[] args) {
        final AAFormularData aadf = new AAFormularData();
        aadf.setSourceFileName("sourceFileName");
        aadf.setOrderDate(new Date());
        aadf.setCustomerName("customerName");
        aadf.setCustomerNumber("customerNumber");
        aadf.setAccount("account");
        aadf.setName("name");
        aadf.setSurname("surname");
        aadf.setStreet("street");
        aadf.setHouseNumber("houseNumber");
        aadf.setZipCode("zipCode");
        aadf.setCity("city");
        aadf.setTcGender("tcGender");
        aadf.setTcName("tcName");
        aadf.setTcSurname("tcSurname");
        aadf.setTcPhone("tcPhone");
        aadf.setTcMobile("tcMobile");
        aadf.setTcFax("tcFax");
        aadf.setTcEMail("tcEMail");
        aadf.setLocName("locName");
        aadf.setLocSurname("locSurname");
        aadf.setLocStreet("locStreet");
        aadf.setLocHouseNumber("locHouseNumber");
        aadf.setLocZipCode("locZipCode");
        aadf.setLocCity("locCity");
        aadf.setPrefix("prefix");
        aadf.setNumber("number");
        aadf.setExtensionStart("extensionStart");
        aadf.setExtensionEnde("extensionEnde");
        aadf.setVtcGender("vtcGender");
        aadf.setVtcName("vtcName");
        aadf.setVtcSurname("vtcSurname");
        aadf.setVtcPhone("vtcPhone");
        aadf.setVtcMobile("vtcMobile");
        aadf.setVtcFax("vtcFax");
        aadf.setVtcEMail("vtcEMail");
        aadf.setOldRate(true);
        aadf.setRate("rate");
        aadf.setFixNetFlat(true);
        aadf.setMobileFlat(true);
        aadf.setInt1Flat(true);
        aadf.setInt2Flat(true);
        aadf.setInt3Flat(true);
        aadf.setCountOfLines(2);
        aadf.setDownloadSpeed("downloadSpeed");
        aadf.setCentral(true);
        aadf.setIrregular(true);
        aadf.setClip(true);
        aadf.setClassicPlus(true);
        aadf.setFitter(true);
        aadf.setAdditionalSevice("additionalSevice");
        aadf.setAction("action");
        aadf.setDurration(60);
        aadf.setPreferredDate(new Date());
        aadf.setVoNummer("voNummer");
        aadf.setVoEMail("voEMail");
        aadf.setVoTelNr("voTelNr");
        aadf.setOneGroupID("OneGroupID");
        aadf.setLocationRefNum1("locationRefNum1");
        aadf.setPhoneNumberAndRange1("phoneNumberAndRange1");
        aadf.setPhoneRange1Ende("phoneRange1Ende");
        aadf.setPhoneNumberAndRange2("phoneNumberAndRange2");
        aadf.setPhoneRange2Ende("phoneRange2Ende");
        aadf.setPhoneNumberAndRange3("phoneNumberAndRange3");
        aadf.setPhoneRange3Ende("phoneRange3Ende");
        aadf.setPhoneNumberAndRange4("phoneNumberAndRange4");
        aadf.setPhoneRange4Ende("phoneRange4Ende");
        aadf.setPhoneNumberAndRange5("phoneNumberAndRange5");
        aadf.setPhoneRange5Ende("phoneRange5Ende");
        aadf.setPhoneNumberAndRange6("phoneNumberAndRange6");
        aadf.setPhoneRange6Ende("phoneRange6Ende");
        aadf.setPhoneNumbetAndRange7("phoneNumbetAndRange7");
        aadf.setPhoneRange7Ende("phoneRange7Ende");
        aadf.setPhoneNumberAndRange8("phoneNumberAndRange8");
        aadf.setPhoneRange8Ende("phoneRange8Ende");
        aadf.setPhoneNumberAndRange9("phoneNumberAndRange9");
        aadf.setPhoneRange9Ende("phoneRange9Ende");
        aadf.setPhoneNumberAndRange10("phoneNumberAndRange10");
        aadf.setPhoneRange10Ende("phoneRange10Ende");
        aadf.setLocationRefNum2("locationRefNum2");
        aadf.setPhoneNumberAndRange11("phoneNumberAndRange11");
        aadf.setPhoneRange11Ende("phoneRange11Ende");
        aadf.setPhoneNumberAndRange12("phoneNumberAndRange12");
        aadf.setPhoneRange12Ende("phoneRange12Ende");
        aadf.setPhoneNumberAndRange13("phoneNumberAndRange13");
        aadf.setPhoneRange13Ende("phoneRange13Ende");
        aadf.setPhoneNumberAndRange14("phoneNumberAndRange14");
        aadf.setPhoneRange14Ende("phoneRange14Ende");
        aadf.setPhoneNumberAndRange15("phoneNumberAndRange15");
        aadf.setPhoneRange15Ende("phoneRange15Ende");
        aadf.setPhoneNumberAndRange16("phoneNumberAndRange16");
        aadf.setPhoneRange16Ende("phoneRange16Ende");
        aadf.setPhoneNumberAndRange17("phoneNumbetAndRange17");
        aadf.setPhoneRange17Ende("phoneRange17Ende");
        aadf.setPhoneNumberAndRange18("phoneNumberAndRange18");
        aadf.setPhoneRange18Ende("phoneRange18Ende");
        aadf.setPhoneNumberAndRange19("phoneNumberAndRange19");
        aadf.setPhoneRange19Ende("phoneRange19Ende");
        aadf.setPhoneNumberAndRange20("phoneNumberAndRange20");
        aadf.setPhoneRange20Ende("phoneRange20Ende");
        aadf.setLocationRefNum3("locationRefNum3");
        aadf.setPhoneNumberAndRange21("phoneNumberAndRange21");
        aadf.setPhoneRange21Ende("phoneRange21Ende");
        aadf.setPhoneNumberAndRange22("phoneNumberAndRange22");
        aadf.setPhoneRange22Ende("phoneRange22Ende");
        aadf.setPhoneNumberAndRange23("phoneNumberAndRange23");
        aadf.setPhoneRange23Ende("phoneRange23Ende");
        aadf.setPhoneNumberAndRange24("phoneNumberAndRange24");
        aadf.setPhoneRange24Ende("phoneRange24Ende");
        aadf.setPhoneNumberAndRange25("phoneNumberAndRange25");
        aadf.setPhoneRange25Ende("phoneRange25Ende");
        aadf.setPhoneNumberAndRange26("phoneNumberAndRange26");
        aadf.setPhoneRange26Ende("phoneRange26Ende");
        aadf.setPhoneNumberAndRange27("phoneNumbetAndRange27");
        aadf.setPhoneRange27Ende("phoneRange27Ende");
        aadf.setPhoneNumberAndRange28("phoneNumberAndRange28");
        aadf.setPhoneRange28Ende("phoneRange28Ende");
        aadf.setPhoneNumberAndRange29("phoneNumberAndRange29");
        aadf.setPhoneRange29Ende("phoneRange29Ende");
        aadf.setPhoneNumberAndRange30("phoneNumberAndRange30");
        aadf.setPhoneRange30Ende("phoneRange30Ende");
        aadf.setLocationRefNum4("locationRefNum4");
        aadf.setPhoneNumberAndRange31("phoneNumberAndRange31");
        aadf.setPhoneRange31Ende("phoneRange31Ende");
        aadf.setPhoneNumberAndRange32("phoneNumberAndRange32");
        aadf.setPhoneRange32Ende("phoneRange32Ende");
        aadf.setPhoneNumberAndRange33("phoneNumberAndRange33");
        aadf.setPhoneRange33Ende("phoneRange33Ende");
        aadf.setPhoneNumberAndRange34("phoneNumberAndRange34");
        aadf.setPhoneRange34Ende("phoneRange34Ende");
        aadf.setPhoneNumberAndRange35("phoneNumberAndRange35");
        aadf.setPhoneRange35Ende("phoneRange35Ende");
        aadf.setPhoneNumberAndRange36("phoneNumberAndRange36");
        aadf.setPhoneRange36Ende("phoneRange36Ende");
        aadf.setPhoneNumberAndRange37("phoneNumbetAndRange37");
        aadf.setPhoneRange37Ende("phoneRange37Ende");
        aadf.setPhoneNumberAndRange38("phoneNumberAndRange38");
        aadf.setPhoneRange38Ende("phoneRange38Ende");
        aadf.setPhoneNumberAndRange39("phoneNumberAndRange39");
        aadf.setPhoneRange39Ende("phoneRange39Ende");
        aadf.setPhoneNumberAndRange40("phoneNumberAndRange40");
        aadf.setPhoneRange40Ende("phoneRange40Ende");
        aadf.setAapOneGroupID("aapOneGroupID");
        aadf.setAapOneGroupPhoneNumber("aapOneGroupPhoneNumber");
        aadf.setAapAdministrationsFitma("aapAdministrationsFitma");
        aadf.setAapAdministrationsNameAndSurname("aapAdministrationsNameAndSurname");
        aadf.setAapAdministrationsStreetAndHouse("aapAdministrationsStreetAndHouse");
        aadf.setAapAdministrationsZipAndCity("aapAdministrationsZipAndCity");
        aadf.setAapAdministrationsPhoneNumber("aapAdministrationsPhoneNumber");
        aadf.setAapAdministrationsMobile("aapAdministrationsMobile");
        aadf.setAapAdministrationsFax("aapAdministrationsFax");
        aadf.setAapAdministrationsEMail("aapAdministrationsEMail");
        aadf.setTaeBuilding("taeBuilding");
        aadf.setTaeFloor("taeFloor");
        aadf.setTaeRoom("taeRoom");
        aadf.setTaeExtended("taeExtended");
        System.out.println(getHeader());
        System.out.println(aadf.toCSVString());
    }
}
