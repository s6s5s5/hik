//package sun.repository.convert;
//
//import sun.util.DESUtil;
//
//import javax.annotation.Resource;
//import javax.persistence.AttributeConverter;
//
///**
// * @Author sun
// * @Data 2022/3/8 15:58
// */
//public class EncryptStringConvert implements AttributeConverter<String, String> {
//    @Resource
//    private DESUtil desUtil;
//
//
//    @Override
//    public String convertToDatabaseColumn(String s) {
//        return desUtil.encrypt(s);
//    }
//
//    @Override
//    public String convertToEntityAttribute(String s) {
//        return desUtil.decrypt(s);
//    }
//
//    public static void main(String[] args) {
//        DESUtil desUtil = new DESUtil();
//
//        System.out.println(desUtil.decrypt("1d892f3fce7461154b48d616dd2a90e8579f33be0af9c330"));
//    }
//}
