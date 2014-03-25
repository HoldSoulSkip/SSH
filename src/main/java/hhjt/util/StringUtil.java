package hhjt.util;



/**
 * StringUtil
 */
public class StringUtil {
	/**
	 * 将字符串数组转换成字符串
	 */
	public static String arr2Str(String[] arr){
		String str0 = null ;
		StringBuffer buffer = new StringBuffer();
		if(ValidateUtil.isValid(arr)){
			for(int i = 0 ; i < arr.length ; i ++){
				buffer.append(arr[i]).append(",");
			}
			str0 = buffer.toString();
			str0 = str0.substring(0,str0.length() - 1);
		}
		return str0 ;
	}
	
	/**
	 * 将字符串转换成字符串数组,
	 */
	public static String[] str2Arr(String str,String tag){
		if(ValidateUtil.isValid(str)){
			return str.split(tag);
		}
		return null ;
	}
	
	/**
	 * 判断数组当中是否含有指定的字符串
	 */
	public static boolean contains(String[] arr,String str){
		if(ValidateUtil.isValid(arr) && ValidateUtil.isValid(str)){
			for(String s : arr){
				if(s.equals(str)){
					return true ;
				}
			}
		}
		return false ;
	}
}
