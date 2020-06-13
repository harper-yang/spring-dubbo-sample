package harper.github.io;

import harper.github.io.user.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class OrderProviderApplication {

    @Reference(url = "localhost:20880/harper.github.io.user.IUserService")
    private IUserService userService;

    public static void main(String[] args) {
        SpringApplication.run(OrderProviderApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        log.info("【远程调用】调用user服务:", userService);
        return args -> System.out.println(userService.getNameById(1000L));
    }
}
