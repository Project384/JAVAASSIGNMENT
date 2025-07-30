// 17.	Write a program to identify valid and invalid identifiers in Java.
public class code17{
    public static void main(String[] args) {
        String[] testIdentifiers={ "myVariable", "2ndVariable", "class" };

        for (String id : testIdentifiers) {
            if (isValidJavaIdentifier(id)) {
                System.out.println(id + " is a valid identifier.");
            } else {
                System.out.println(id + " is NOT a valid identifier.");
            }
        }
    }

    public static boolean isValidJavaIdentifier(String s) {
        if (s==null || s.isEmpty()) return false;
        if (!Character.isJavaIdentifierStart(s.charAt(0))) return false;
        for (int i=1; i < s.length(); i++) {
            if (!Character.isJavaIdentifierPart(s.charAt(i))) return false;
        }
        return !isJavaKeyword(s);
    }

    public static boolean isJavaKeyword(String s) {
        String[] keywords = {
            "abstract","assert","boolean","break","byte",
            "case","catch","char","class","const","continue","default",
            "do","double","else","enum","extends","final","finally","float",
            "for","goto","if","implements","import","instanceof","int",
            "interface","long","native","new","package","private","protected",
            "public","return","short","static","strictfp","super","switch",
            "synchronized","this","throw","throws","transient","try","void",
            "volatile","while","true","false","null"
        };
        for (String keyword : keywords) {
            if (keyword.equals(s)) return true;
        }
        return false;
    }
}
