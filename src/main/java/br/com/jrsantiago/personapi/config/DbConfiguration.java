package br.com.jrsantiago.personapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties("spring.datasource")
public class DbConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Bean
    @Profile("dev")
    public String devDataBaseConnection() {
        System.out.println("DB connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);

        return "DB Connection to H2_DEV - Dev instance";
    }

    @Bean
    @Profile("prod")
    public String productionDataBaseConnection() {
        System.out.println("DB connection for DEV - POSTGRE");
        System.out.println(driverClassName);
        System.out.println(url);

        return "DB Connection to POSTGRE_PROD - Production instance";
    }
}
