package sun.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author sun
 * @Data 2022/2/23 16:01
 */
public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {

            parse = sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Long sevenDaysAgo = parse.getTime() - 6 * 24 * 60 * 60 * 1000L;
        System.out.println(parse.getTime());
        System.out.println(sevenDaysAgo);
    }

}
