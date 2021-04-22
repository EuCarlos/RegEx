import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String regex = "[a-f]"; //This is the regular expression
        final String string = "any text here 1 2 3 4 5";
        
        final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        final Matcher matcher = pattern.matcher(string);
        
        while (matcher.find()) {
            System.out.print(matcher.group(0));
            
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.print(matcher.group(i)); // Return aeee
            }
        }
        final String result = matcher.replaceAll("*");
        System.out.println("\n" + result); // Return *ny t*xt h*r* 1 2 3 4 5"
    }
}
