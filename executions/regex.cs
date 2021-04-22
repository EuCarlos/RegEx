using System;
using System.Text.RegularExpressions;

public class Example {
    public static void Main() {
        string pattern = @"[a-f]";
        string input = @"any text here 1 2 3 4 5";
        RegexOptions options = RegexOptions.IgnoreCase;
        
        foreach (Match m in Regex.Matches(input, pattern, options)) {
            Console.Write(m.Value); // Return aee
        }
        Regex regex = new Regex(pattern, options);
        string result = regex.Replace(input, @"*");
        Console.Write("\n" + result); // Return *ny t*xt h*r* 1 2 3 4 5
    }
}