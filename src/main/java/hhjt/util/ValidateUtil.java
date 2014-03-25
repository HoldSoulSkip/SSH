package hhjt.util;



import java.util.Collection;

/**
 * 验证工具类
 */
public class ValidateUtil {

	/**
	 * 验证字符串有效性
	 */
	public static boolean isValid(String name){
		if(name == null || name.trim().equals("")){
			return false ;
		}
		return true ;
	}
	
	/**
	 * 判断集合有效性
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isValid(Collection col){
		if(col == null || col.isEmpty()){
			return false ;
		}
		return true ;
	}
	
	/**
	 * 判断数组有效性
	 */
	public static boolean isValid(Object[] arr){
		if(arr == null || arr.length == 0){
			return false ;
		}
		return true ;
	}
}