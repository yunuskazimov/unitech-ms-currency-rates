package az.unibank.unitechmscurrencyrates.client;

import az.unibank.unitechmscurrencyrates.client.model.CurrencyClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "fixer",
        url = "${api.fixer.url}"
)
public interface CurrencyClient {

    @GetMapping(value = "/latest")
    CurrencyClientResponse getRatesBaseUSD(@RequestParam("access_key") String access_key);

}
