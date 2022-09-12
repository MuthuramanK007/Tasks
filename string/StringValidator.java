import static java.util.Objects.*;
public class StringValidator{
	public static boolean isValidLen(String str, int len){
		if(isNull(str)){
			return false;
		}
		return str.length() >= len;
	}
}