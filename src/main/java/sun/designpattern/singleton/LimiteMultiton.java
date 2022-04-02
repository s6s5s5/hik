package sun.designpattern.singleton;

import java.util.ArrayList;

/**
 * @Author sun
 * @Data 2022/4/2 15:02
 */
public class LimiteMultiton {
    private static ArrayList<LimiteMultiton> list=new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            list.add(new LimiteMultiton());
        }
    }

    private LimiteMultiton() {

    }

    public static LimiteMultiton getInstance() {
        return list.get((int) Math.random() * 10);
    }
}
