package az.maqa.spring.hazelcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching // to enable caching throughout the project
public class HazelcastCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(HazelcastCacheApplication.class, args);
    }

}
