package je1809;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootDemo01_Eureka_server02 {

    public static void main(String[] args){
        SpringApplication.run(SpringBootDemo01_Eureka_server02.class,args);
    }
}
