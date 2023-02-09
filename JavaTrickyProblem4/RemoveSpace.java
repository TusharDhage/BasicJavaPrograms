package JavaTrickyProblem4;

import com.sun.deploy.util.StringUtils;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "  This is shitty coding  ";

       /* System.out.println(str.trim());
        System.out.println(str.replaceAll("\\s",""));
        String remString = StringUtils.trimWhitespace(str);
        System.out.println(remString);*/

        String noWhiteSpaces = "";
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)!=' ' && str.charAt(i)!='\t')
            {
                noWhiteSpaces= noWhiteSpaces+str.charAt(i);
            }
        }
        System.out.println(noWhiteSpaces);
    }

}
