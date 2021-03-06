package harper.github.io;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan
public class SpringCloudNacosSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosSampleProviderApplication.class, args);
    }

}
