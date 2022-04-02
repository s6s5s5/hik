package sun.designpattern.Builder;

/**
 * @Author sun
 * @Data 2022/4/2 16:58
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
