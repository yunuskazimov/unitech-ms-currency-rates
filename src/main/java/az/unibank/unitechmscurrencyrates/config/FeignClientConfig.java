package az.unibank.unitechmscurrencyrates.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "az.unibank.unitechmscurrencyrates.client")
public class FeignClientConfig {
}