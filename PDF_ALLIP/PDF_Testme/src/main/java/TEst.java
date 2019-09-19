//import com.sun.deploy.util.StringUtils.*;
//import org.apache.commons.lang3.*;


public class TEst {
    public static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isAlpha(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

    public static final boolean containsDigit(String s) {
        boolean containsDigit = false;

        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (containsDigit = Character.isDigit(c)) {
                    break;
                }
            }
        }

        return containsDigit;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(isNumeric("8"));
        System.out.println(!(isNumeric("&%7")));
        System.out.println(!containsDigit("$%/&%/&%8"));


        //System.out.println(NumberUtils.isParsable("0xFF"));
    }
}