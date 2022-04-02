package sun.designpattern.factory;

/**
 * @Author sun
 * @Data 2022/4/2 16:28
 */
public class Factory1 implements Factory {


    @Override
    public Product1 produce1() {
        return new Product11();
    }

    @Override
    public product2 produce2() {
        return new Product21();
    }
}
