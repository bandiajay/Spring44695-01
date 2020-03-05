package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		/*
		 * static Pattern compile(String regexp) Return compiled version of a regular
		 * expression into the pattern
		 */
		System.out.println("static Pattern compile(String regexp)");
		Pattern p = Pattern.compile("@gmail");
		Matcher m = p.matcher("abc@gmail.com");
		System.out.println(m.find());
		m = p.matcher("abc@GMAIL.COM");
		System.out.println(m.find());

		System.out.println("********************************************");

		/*
		 * static Pattern compile(String regexp, int flags) Return compiled version of a
		 * regular expression into the pattern with the given flag
		 */
		/*
		 * We can set flags like: CASE_INSENSITIVE, MULTILINE, DOTALL, UNICODE_CASE,
		 * CANON_EQ, UNIX_LINES, LITERAL, UNICODE_CHARACTER_CLASS and COMMENTS
		 */

		System.out.println("static Pattern compile(String regexp, int flags)");
		Pattern p1 = Pattern.compile("@gmail", Pattern.CASE_INSENSITIVE);
		Matcher m1 = p1.matcher("abc@GMAIL.com");
		System.out.println(m1.find());
		m1 = p1.matcher("abc@nwmissouri.edu");
		System.out.println(m1.find());

		System.out.println("********************************************");

		/*
		 * Pattern.compile with multiple flags sets
		 */

		System.out.println("static Pattern compile(String regexp, int flags) with multiple flags set");
		Pattern p2 = Pattern.compile("\u00de",
				Pattern.MULTILINE | Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE | Pattern.COMMENTS);
		// \u00de:LATIN LARGE LETTER THORN Where as \u00fe: LATIN SMALL LETTER THORN
		Matcher m2 = p2.matcher("\u00fE \n \u00fe ");
		System.out.println(m2.find());

		m2 = p2.matcher("\u00bE \n");
		System.out.println(m2.find());

		System.out.println("********************************************");

		/*
		 * boolean matches() - test whether the regular expression matches the pattern.
		 */
		System.out.println("boolean matches()");
		Pattern p3 = Pattern.compile(".s");// . represents single character
		Matcher m3 = p3.matcher("as");
		System.out.println(m3.matches());

		m3 = p3.matcher("ab");
		System.out.println(m3.matches());

		System.out.println("********************************************");

		/*
		 * Character Matches [abc]
		 */
		System.out.println("[abc]");
		System.out.println(Pattern.matches("[abc]", "a"));// true (among a or b or c)
		System.out.println(Pattern.matches("[abc]", "abbbbca"));// false (a and b comes more than once)

		System.out.println("********************************************");

		/*
		 * Character Matches [^abc]
		 */
		System.out.println("[^abc]");
		System.out.println(Pattern.matches("[^abc]", "d"));// true (matches everything except a, b, or c )
		System.out.println(Pattern.matches("[^abc]", "apple"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches [a-z]
		 */
		System.out.println("[a-z]");
		System.out.println(Pattern.matches("[a-z]", "a"));// true
		System.out.println(Pattern.matches("[a-z]", "A"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches [a-c[f-h]] union
		 */
		System.out.println("[a-c[f-h]]");
		System.out.println(Pattern.matches("[a-c[f-h]]", "a"));// true because matches a, b, c, f, g, h
		System.out.println(Pattern.matches("[a-c[f-h]]", "d"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches [a-z&&[cat]]
		 */
		System.out.println("[a-z&&[cat]] ");
		System.out.println(Pattern.matches("[a-z&&[cat]]", "c"));// true because matches c or a or t
		System.out.println(Pattern.matches("[a-z&&[cat]]", "d"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches [a-z&&[^aiueo]]
		 */
		System.out.println("[a-z&&[^aiueo]] ");
		System.out.println(Pattern.matches("[a-z&&[^aiueo]]", "c"));// true because matches except the vowels (‘a’, ‘i’,
																	// ‘u’, ‘e’, ‘o’)
		System.out.println(Pattern.matches("[a-z&&[^aiueo]]", "e"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches backslash
		 */
		System.out.println("backslash ");
		System.out.println(Pattern.matches("\\\\", "\\"));// true because first letter is backslash
		System.out.println(Pattern.matches("\\\\", "d"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches \d- A digit
		 */
		System.out.println("\\d- A digit");
		System.out.println(Pattern.matches("\\d", "1"));// true
		System.out.println(Pattern.matches("\\d", "a"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches \D - A non-digit: [^0-9]
		 */
		System.out.println("\\D - A non-digit: [^0-9]");
		System.out.println(Pattern.matches("\\D", "a"));// true
		System.out.println(Pattern.matches("\\D", "1"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches \s - A whitespace character: [ \t\n\x0B\f\r]
		 */
		System.out.println("\\s  - A whitespace character: [ \\t\\n\\x0B\\f\\r]");
		System.out.println(Pattern.matches("\\s", " "));// true
		System.out.println(Pattern.matches("\\s", "1"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches \S - A non-whitespace character: [^\s]
		 */
		System.out.println("\\S  - A non-whitespace character: [^\\s]");
		System.out.println(Pattern.matches("\\S", "$"));// true
		System.out.println(Pattern.matches("\\S", " "));// false

		System.out.println("********************************************");

		/*
		 * Character Matches \w - A word character: [a-zA-Z_0-9]
		 */
		System.out.println("\\w - A word character: [a-zA-Z_0-9]");
		System.out.println(Pattern.matches("\\w", "A"));// true
		System.out.println(Pattern.matches("\\w", "#"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches \W - A non-word character: [^\w]
		 */
		System.out.println("\\W - A non-word character: [^\\w]");
		System.out.println(Pattern.matches("\\W", "%"));// true
		System.out.println(Pattern.matches("\\W", "h"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches ? quantifier
		 */
		System.out.println("? quantifier");
		System.out.println(Pattern.matches("[amn]?", "a"));// true (a or m or n comes one time)
		System.out.println(Pattern.matches("[amn]?", "aaa"));// false (a comes more than one time)

		System.out.println("********************************************");

		/*
		 * Character Matches + quantifier
		 */
		System.out.println("+ quantifier");
		System.out.println(Pattern.matches("[amn]+", "aaa"));// true (a or m or n once or more times)
		System.out.println(Pattern.matches("[amn]+", "aazzta"));// false (z and t are not matching pattern)

		System.out.println("********************************************");

		/*
		 * Character Matches * quantifier
		 */
		System.out.println("* quantifier");
		System.out.println(Pattern.matches("[amn]*", "ammmna"));// true (a or m or n may come zero or more times)
		System.out.println(Pattern.matches("[amn]*", "bbbbbbbb"));// false (z and t are not matching pattern)

		System.out.println("********************************************");

		/*
		 * Character Matches {n} quantifier
		 */
		System.out.println("{n} quantifier");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "maveen"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "apache maveen"));// false (more than 6 char)

		System.out.println("********************************************");

		/*
		 * Character Matches {n,m} quantifier
		 */
		System.out.println("{n,m} quantifier");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{3,6}", "hello"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{3,6}", "apache maveen"));// false (more than 6 char)

		System.out.println("********************************************");

		/*
		 * Character Matches ^
		 */
		System.out.println("^ Boundary Construct");
		System.out.println(Pattern.matches("^The.*", "The sun rises in east"));// true
		System.out.println(Pattern.matches("^The.*", "sun "));// false

		System.out.println("********************************************");

		/*
		 * Character Matches $
		 */
		System.out.println("$ Boundary Construct");
		System.out.println(Pattern.matches(".*east$", "The sun rises in east"));// true
		System.out.println(Pattern.matches(".*east$*", "sun "));// false

		System.out.println("********************************************");

		/*
		 * Character Matches \b Boundary Construct
		 */
		System.out.println("\\b Boundary Construct");
		System.out.println(Pattern.matches(".*\\bdog\\b.*", "The dog plays in the yard"));// true
		System.out.println(Pattern.matches(".*\\bdog\\b.*", "The doggie plays in the yard"));// false

		System.out.println("********************************************");

		/*
		 * Character Matches \B Boundary Construct
		 */
		System.out.println("\\B Boundary Construct");
		System.out.println(Pattern.matches(".*\\bdog\\B.*", "The doggie plays in the yard"));// true
		System.out.println(Pattern.matches(".*\\bdog\\B.*", "The dog plays in the yard"));// false
	}
}
