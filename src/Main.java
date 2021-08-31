public class Main {

    public static long repeatedString(String s, long n) {
        long stringLength = s.length();
        long additionalString = n%stringLength;
        long multipleRepetition = n/stringLength;

        long findABaseString=stringLength-Long.valueOf(s.replace("a", "").length());

        String additionalSubString = s.substring(0,(int)additionalString);
        long findASubString = Long.valueOf(additionalSubString.length())-Long.valueOf(additionalSubString.replace("a","").length());

        long totalA = findABaseString*multipleRepetition+findASubString;
        System.out.println(totalA);

        return totalA;
    }

    public static void main(String[] args) {
        repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400l);
    }
}

