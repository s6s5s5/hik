package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @Author sun
 * @Data 2022/2/24 14:03
 */

@SpringBootApplication
@EntityScan(basePackages ="sun")
public class SunApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunApplication.class, args);
    }
}
