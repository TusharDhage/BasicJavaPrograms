package JavaTrickyProblem4;

public class ElementPercentage {
    public static void main(String[] args) {
        getCharPercentage("Tushar123@TD");
    }
    public static void getCharPercentage(String str){
        int len = str.length();

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        int countSpecChar = 0;

        for (int i=0;i<len;i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                countUpperCase++;
            } else if (Character.isLowerCase(ch)) {
                countLowerCase++;
            } else if (Character.isDigit(ch)) {
                countDigit++;
            } else {
                countSpecChar++;
            }
        }
        double upperCasePercentage =(countUpperCase*100.0)/len;
        double lowerCasePercentage =(countLowerCase*100.0)/len;
        double digitPercentage =(countDigit*100.0)/len;
        double specialCharPercentage =(countSpecChar*100.0)/len;

        System.out.println("in the given string :"+str);
        System.out.println("Upper Case Percentage is --> "+upperCasePercentage);
        System.out.println("Lower Case Percentage is --> "+lowerCasePercentage);
        System.out.println("digit Percentage is --> "+digitPercentage);
        System.out.println("specialChar Percentage is --> "+specialCharPercentage);



    }
}

