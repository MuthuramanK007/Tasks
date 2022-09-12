import java.util.*;
import static java.util.Objects.*;
public class StringMain{
	InvalidInput nullPassed;
	public int lenOfStr(String[] str) throws Exception, InvalidInput{
		if(str.length < 1){
			throw new Exception("Array is not passed");
		}
		if(isNull(str[0])){
			throwNullExcep();
		}
		return str[0].length();
	}
	public char[] toCharArr(String str) throws InvalidInput{
		if(isNull(str)){
			throw new InvalidInput("Null value passed");
		}
		if(!StringValidator.isValidLen(str, 1) ){
			throw new InvalidInput("String length not sufficient");
		}
		return str.toCharArray();
	}
	public char nthLastChar(String str,int place) throws InvalidInput{
		if(isNull(str)){
			throw new InvalidInput("Null value passed");
		}
		if(!StringValidator.isValidLen(str,place)){
			throw new InvalidInput("String length is insufficient");
		}
		return str.charAt(str.length()-place);
	}
	public int numOfOccur(String str, char c) throws InvalidInput{ 
		if(isNull(str)){
			throw new InvalidInput("Null value passed");
		}
		int count = 0;
		for(int i =0;i<str.length();i++){
			if(str.charAt(i)==c){ count ++ ;}
		}		
		return count;
	}
	public int greatestPosOfChar(String str, char c) throws InvalidInput{
		if(isNull(str)){
			throwNullExcep();
		}
		if(!StringValidator.isValidLen(str, 1)){
			throw new InvalidInput("Length of the string is insufficient for the process");
		}
		return str.lastIndexOf(c);
	}
	public String lastNChars(String str, int lenOfLastNChars) throws InvalidInput{
		if(isNull(str)){
			throwNullExcep();
		}
		if(!StringValidator.isValidLen(str, lenOfLastNChars)){
			throw new InvalidInput("Length of the string is insufficient for the process");
		}
		return str.substring(str.length()-lenOfLastNChars);
	}
	public String firstNChars(String str, int lenOfChars) throws InvalidInput{
		if(isNull(str)){
			throwNullExcep();
		}
		if(!StringValidator.isValidLen(str,lenOfChars)){
			throw new InvalidInput("Length of the string is insufficient for the process");
		}
		return str.substring(0,lenOfChars);
	}
	public String replaceFirstNCharsWith(String str, int numOfCharsToReplace, String toReplaceWith) throws InvalidInput{
		if(isNull(str)){
			throwNullExcep();
		}	
		if(!StringValidator.isValidLen(str,numOfCharsToReplace)){
			throw new InvalidInput("Length of the string must be higher than "+ numOfCharsToReplace);
		}
		String partToReplace = str.substring(0,numOfCharsToReplace);
		String replacedString = str.replaceFirst(partToReplace,toReplaceWith);
		return replacedString;
	}
	public boolean isStrBeginWithPrefix(String str, String prefix) throws InvalidInput{
		if(isNull(str)){
			throwNullExcep();
		}
		Boolean isStrBeginWithPrefix = str.startsWith(prefix);
		return isStrBeginWithPrefix;
	}

	public boolean isStrEndWithSuffix(String str, String suffix) throws InvalidInput{
		if(isNull(str)){
			throwNullExcep();
		}
		Boolean isStrEndWithSuffix = str.endsWith(suffix);
		return isStrEndWithSuffix;
	}

	public String lowToUpper(String str) throws InvalidInput{
		if(isNull(str)){
			throwNullExcep();
		}
		if(!StringValidator.isValidLen(str,1)){
			throw new InvalidInput("Length should be higher than 1");
		}
		String upperCasedStr = str.toUpperCase();
		return upperCasedStr;
	}

	public String upperToLow(String str) throws InvalidInput{
		if(isNull(str)){
			throwNullExcep();
		}
		if(!StringValidator.isValidLen(str,1)){
			throw new InvalidInput("Length should be higher than 1");
		}
		String lowerCasedStr = str.toLowerCase();
		return lowerCasedStr;
	}

	public void throwNullExcep() throws InvalidInput{
		if(nullPassed==null){
			nullPassed = new InvalidInput("Null value passed");
		}
		throw nullPassed;
	}
	
}