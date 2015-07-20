package burp;

import java.util.regex.Pattern;

public class HashAlgorithm
{
	public int charWidth;
	public HashAlgorithmName name;
	public Pattern pattern;
	private final String hexRegex = "([a-fA-F0-9]{%s})";
	
	public HashAlgorithm(int charWidth, HashAlgorithmName name)
	{
		this.charWidth = charWidth;
		this.name = name;
		pattern = Pattern.compile(String.format(hexRegex, charWidth));
	}
}