package app;

import order.api.BusinessService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class KApplication implements CommandLineRunner {

    @DubboReference
    BusinessService businessService;

    public static void main(String[] args) {
        SpringApplication.run(KApplication.class, args);
    }

    @Override
    public void run(String... strings) {
        businessService.purchase("1013", "1013", 39);
    }
}
