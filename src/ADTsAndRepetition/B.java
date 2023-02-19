package ADTsAndRepetition;

public class B {
    public static void main(String[] args) {

        cprChecker("3107001212");

    }

    public static boolean cprChecker (String cpr) {

        if (cpr.length() != 10) {
            System.out.println("CPR number " + cpr + " is invalid");
            return false;
        }

        int twoFirstDigits = Integer.parseInt(cpr.substring(0,2));

        if (twoFirstDigits > 31) {
            System.out.println("CPR number " + cpr + " is invalid");
            return false;
        }

        int twoMiddleDigits = Integer.parseInt(cpr.substring(2,4));

        if (twoMiddleDigits > 12) {
            System.out.println("CPR number " + cpr + " is invalid");
            return false;
        }
        else {
            System.out.println("CPR number " + cpr + " is valid");
            return true;
        }
    }
}
