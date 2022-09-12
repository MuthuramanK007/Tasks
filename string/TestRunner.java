import java.util.*;
public class TestRunner{
	private static boolean cont = true;
	private static StringMain sm = new StringMain();
	private static String[] arg;
	public static void main(String[] args) {
		arg = args;
		while(cont){
			int chosedOption = options();
			methodsToCall(chosedOption);
			System.out.println();
		}
	}
	private static int options(){
		// to implement options field;
		prints("Enter the option :");
		prints("0. To exit .");
		prints("1. Get the length of the first String passed to the main method.");
		prints("2. String to character array.");
		prints("3. N_th Last character from the string.");
		prints("4. Find the characters occurrence count in string.");
		prints("5. Last index position of Character in string.");
		prints("6. Get the last N characters from the string.");
		prints("7. Get the first N characters from the string.");
		prints("8. Replace first N characters in the string.");
		prints("9. Verify whether the string starts with given prefix or not. ");
		prints("10.Verify whether the string ends with given suffix of not.");
		prints("11.Convert the given string to UPPERCASE.");
		prints("12.Convert the given string to LOWERCASE.");
		Scanner scanner2 = new Scanner(System.in);
		int chosedOption = scanner2.nextInt();
		return chosedOption;

	}

	private static void methodsToCall(int option){
		Scanner scanner = new Scanner(System.in);
		switch(option){
			case 1: 
				//len of string using argument passed to main method
				try{
					System.out.println(sm.lenOfStr(arg));
				}
				catch(Exception ii){
					System.out.println(ii.getMessage());
				}
				break;
			case 2:
				//to char array
				prints("Enter the string to get char arr");
				String strToConvert = scanner.nextLine();
				try{
					char [] ch = sm.toCharArr(strToConvert);
					System.out.println(ch.length);
				}catch(InvalidInput ii){
					System.out.println(ii.getMessage());
				}
				break;
			case 3:
				//nth last character of the string 
				prints("Enter the string with length of greater than 1,to find the "
					+"nth last element");
				try{
					String strGreatThanOne = scanner.nextLine();	
					prints("Enter the nth Character to find from the above string");
					int nthChar = scanner.nextInt();
					char nthLastChar = 	sm.nthLastChar(strGreatThanOne,nthChar);
					System.out.println(nthLastChar);
				}catch(InvalidInput ii){
					prints(ii.getMessage());
				} 
				break;
			case 4:
				//char occurrences in str 
				prints("Enter the string to experiment");
				String strToExp = scanner.nextLine();
				prints("Enter the Character to find no of occurrence in the string");
				char charToExp = scanner.nextLine().charAt(0);
				try{ 
					int noOfOccur = sm.numOfOccur(strToExp, charToExp);
					System.out.println(noOfOccur);
				}catch(InvalidInput ii){
					prints(ii.getMessage());
				}			
				break;
			case 5:
				//greatest position of the character in string
				prints("Enter the string with repeated letters");
				String repeatedLetters = scanner.nextLine();
				prints("Enter the Character to find greatest position in the string");
				char charToFind = scanner.nextLine().charAt(0);
				try{
					System.out.println(sm.greatestPosOfChar(repeatedLetters, charToFind));
				}catch(InvalidInput ii){
					System.out.println(ii.getMessage());
				}
				break;
			case 6:
				//print last n characters of the string
				prints("Enter the string to find its last n characters");
				String strToExperiment = scanner.nextLine();
				prints("Enter the number of last characters you want to see from the above string");
				int numOfLastCharsFromString = scanner.nextInt(); 
				try{
					String lastNCharsFromString = sm.lastNChars(strToExperiment,numOfLastCharsFromString);
					System.out.println(lastNCharsFromString);
				}catch(InvalidInput ii){
					System.out.println(ii.getMessage());
				}
				break;
			case 7:
				//print frist n characters of the string
				prints("Enter the string to find its first n characters");
				String strToFindItsFirstNChr = scanner.nextLine();
				prints("Enter the number of First characters you want to see from the above string");
				String numOfFirstCharsFromStringStr = scanner.nextLine();
				int numOfFirstCharsFromString = Integer.parseInt(numOfFirstCharsFromStringStr);
				try{
					String firstNCharsfromString = sm.firstNChars(strToFindItsFirstNChr, numOfFirstCharsFromString);
					System.out.println(firstNCharsfromString);
				}catch(InvalidInput ii){
					System.out.println(ii.getMessage());
				}
				break;
			case 8:
				//replace first n chars with XYZ
				prints("Enter the string to replace its beginnings with another string");
				String strToBegin = scanner.nextLine();
				prints("Enter the no of first n characters in the string to replace");
				String numOfCharsToReplaceStr = scanner.nextLine();
				int numOfCharsToReplace = Integer.parseInt(numOfCharsToReplaceStr);
				prints("Enter the string to replace with");
				String strToReplaceWith = scanner.nextLine();
				try{
					String replacedFinalString = sm.replaceFirstNCharsWith(strToBegin, numOfCharsToReplace, strToReplaceWith);
					System.out.println(replacedFinalString);
				}
				catch(InvalidInput ii){
					System.out.println(ii.getMessage());
				}
				break;
			case 9:
				//is String starts with expected prefix
				prints("Enter the string");
				String strToVerifyPrefix = scanner.nextLine();
				prints("Enter the prefix to to find in the above string");
				String prefixOfStr = scanner.nextLine();
				try{
					boolean isStrBeginWithPrefix = sm.isStrBeginWithPrefix(strToVerifyPrefix, prefixOfStr);
					System.out.println(isStrBeginWithPrefix);
				}catch(InvalidInput ii){
					System.out.println(ii.getMessage());
				}
				break;
			case 10:
				//is String ends with expected suffix
				prints("Enter the string");
				String strToVerifysuffix = scanner.nextLine();
				prints("Enter the suffix to to find in the above string");
				String suffixOfStr = scanner.nextLine();
				try{
					boolean isStrEndWithSuffix = sm.isStrEndWithSuffix(strToVerifysuffix, suffixOfStr);
					System.out.println(isStrEndWithSuffix);
				}catch(InvalidInput ii){
					System.out.println(ii.getMessage());
				}
				break;
			case 11:
				//converts string to upper case
				prints("Enter the string to convert to uppercase");
				String lowerCaseStr = scanner.nextLine();
				try{
					String invertedLowerCaseStr = sm.lowToUpper(lowerCaseStr);
					System.out.println(invertedLowerCaseStr);
				}catch(InvalidInput ii){
					System.out.println(ii.getMessage());
				}
				break;
			case 12:
				//converts string to lower case
				prints("Enter the string to convert to lowercase");
				String upperCaseStr = scanner.nextLine();
				try{
					String invertedUpperCaseStr = sm.upperToLow(upperCaseStr);
					System.out.println(invertedUpperCaseStr);
				}catch(InvalidInput ii){
					System.out.println(ii.getMessage());
				}
				break;
			case 0:
				cont = false;
				break;

		}
	}
	public static void prints(String str){
		System.out.println(str);
	}
}