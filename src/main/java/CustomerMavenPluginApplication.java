import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAsync
@EnableAutoConfiguration
public class CustomerMavenPluginApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerMavenPluginApplication.class, args);
    }

}
