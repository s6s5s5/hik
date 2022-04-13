//package sun.util;
//
//import com.google.common.base.Strings;
//import com.sun.crypto.provider.DESedeParameters;
//import com.sun.crypto.provider.SunJCE;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.stereotype.Component;
//
//import javax.crypto.Cipher;
//import javax.crypto.spec.SecretKeySpec;
//import java.io.UnsupportedEncodingException;
//import java.security.Key;
//import java.security.Security;
//import java.util.Random;
//
//@Component
//public class DESUtil {
//
//    private DESedeParameters deSedeParameters;
//
//    private Random random = new Random();
//
//    /**
//     * 随机产生数字与字母组合的字符串
//     **/
//    private String randString = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//
//    private static class InstanceNoKey {
//        private static final DESUtil INSTANCE = new DESUtil();
//
//    }
//
//    public static final DESUtil getNoKeyInstance() {
//        return InstanceNoKey.INSTANCE;
//    }
//
//
//    private Cipher encryptCipher;
//
//    private Cipher decryptCipher;
//    private static final String strDefaultKey = "hikB2";   //默认的密钥
//
//    public static String byteArr2HexStr(byte[] arrB) {
//        int iLen = arrB.length;
//        StringBuffer sb = new StringBuffer(iLen * 2);
//
//        for (int i = 0; i < iLen; ++i) {
//            int intTmp;
//            for (intTmp = arrB[i]; intTmp < 0; intTmp += 256) {
//
//            }
//
//            if (intTmp < 16) {
//                sb.append("0");
//            }
//
//            sb.append(Integer.toString(intTmp, 16));
//        }
//
//        return sb.toString();
//    }
//
//    public static byte[] hexStr2ByteArr(String strIn) {
//
//        byte[] arrB = new byte[0];
//        try {
//
//            arrB = strIn.getBytes("utf-8");
//            int iLen = arrB.length;
//            byte[] arrOut = new byte[iLen / 2];
//
//            for (int i = 0; i < iLen; i += 2) {
//                String strTmp = new String(arrB, i, 2);
//                arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
//            }
//
//            return arrOut;
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//            return arrB;
//        }
//    }
//
//
//    /**
//     * 加密
//     *
//     * @return 加密后的密文
//     */
//    public static String encryptPrice(String sourceStr, String key) {
//        if (Strings.isNullOrEmpty(sourceStr)) {
//            return null;
//        }
//        DESUtil desUtil = new DESUtil(key);
//        String result = null;
//        try {
//            result = desUtil.encrypt(sourceStr);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//        return result;
//    }
//
//    /**
//     * 解密
//     *
//     * @param cipherStr
//     * @param key
//     * @return
//     */
//    public static String decryptPrice(String cipherStr, String key) {
//        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(cipherStr)) {
//            return null;
//        }
//        DESUtil desUtil = new DESUtil(key);
//        String result = null;
//        try {
//            result = desUtil.decrypt(cipherStr);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//        return result;
//    }
//
//    public DESUtil() {
//        this(strDefaultKey);
//    }
//
//    public DESUtil(String strKey) {
//        this.encryptCipher = null;
//        this.decryptCipher = null;
//        Security.addProvider(new SunJCE());
//
//        try {
//            if (strKey == null) {
//                strKey = "";
//            }
//            Key key = this.getKey(strKey.getBytes("utf-8"));
//            this.encryptCipher = Cipher.getInstance("DES");
//            this.encryptCipher.init(1, key);
//            this.decryptCipher = Cipher.getInstance("DES");
//            this.decryptCipher.init(2, key);
//        } catch (Exception var4) {
//            var4.printStackTrace();
//        }
//
//    }
//
//    public byte[] encrypt(byte[] arrB) throws Exception {
//        return this.encryptCipher.doFinal(arrB);
//    }
//
//
//    /**
//     * @return java.lang.String
//     * @Author zhangjianlong
//     * @Description 生成随机盐
//     * @Date 9:56 2019/7/12
//     * @Param [count]
//     **/
//    public String generateRandomSalt(int count) {
//        StringBuilder sb = new StringBuilder(16);
//        sb.append(random.nextInt(99999999)).append(random.nextInt(99999999));
//        int len = sb.length();
//        if (len < count) {
//            for (int i = 0; i < count - len; i++) {
//                sb.append("0");
//            }
//        }
//        return sb.toString();
//    }
//
//    /**
//     * @return java.lang.String
//     * @Author zhangjianlong
//     * @Description 获取随机的字符
//     * @Date 15:12 2019/5/24
//     * @Param [num]
//     **/
//    public String getRandomString(int num) {
//        StringBuilder sb = new StringBuilder(num);
//        for (int i = 1; i <= num; i++) {
//            sb.append(randString.charAt(num));
//        }
//        return sb.toString();
//    }
//
//    //加密方法
//    public String encrypt(String strIn) {
//
//        try {
//
//            return byteArr2HexStr(this.encrypt(strIn.getBytes("utf-8")));
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public byte[] decrypt(byte[] arrB) {
//
//        try {
//            return this.decryptCipher.doFinal(arrB);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    //解密方法
//    public String decrypt(String strIn) {
//        byte[] decryptBytes = this.decrypt(hexStr2ByteArr(strIn));
//        if (decryptBytes == null) {
//            return null;
//        }
//        return new String(decryptBytes);
//    }
//
//    private Key getKey(byte[] arrBTmp) throws Exception {
//        byte[] arrB = new byte[8];
//
//        for (int key = 0; key < arrBTmp.length && key < arrB.length; ++key) {
//            arrB[key] = arrBTmp[key];
//        }
//
//        SecretKeySpec var4 = new SecretKeySpec(arrB, "DES");
//        return var4;
//    }
//
//
//}