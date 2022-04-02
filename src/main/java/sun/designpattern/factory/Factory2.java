package sun.designpattern.factory;

/**
 * @Author sun
 * @Data 2022/4/2 16:29
 */
public class Factory2 implements  Factory {

    @Override
    public Product1 produce1() {
        return new Product12();
    }

    @Override
    public product2 produce2() {
        return new Product22();
    }
}
