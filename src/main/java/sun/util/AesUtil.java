//package sun.util;
//
//import org.apache.commons.lang3.StringUtils;
//import org.puristframework.boot.crypto.Aes;
//
//
//public class AesUtil {
//    private static final String SECRET_KEY = "434a7f28f2d21e481c6354b3c969e2b3";
//    private static final String IV="77831948223a3407856ea810fecb761a";
//
//    /**
//     * 解密
//     * @param encryptStr
//     * @return
//     */
//    public static String decrypt(String encryptStr) {
//        if(StringUtils.isBlank(encryptStr)) {
//            return encryptStr;
//        }
//        return Aes.decrypt(encryptStr, SECRET_KEY,IV);
//    }
//
//    /**
//     * 加密
//     * @param sourceStr
//     * @return
//     */
//    public static String encrypt(String sourceStr) {
//        if(StringUtils.isBlank(sourceStr)) {
//            return sourceStr;
//        }
//        return Aes.encrypt(sourceStr, SECRET_KEY,IV);
//    }
//}