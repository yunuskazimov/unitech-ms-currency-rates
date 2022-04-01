package az.unibank.unitechmscurrencyrates.controller;

import az.unibank.unitechmscurrencyrates.model.CurrencyRequestDto;
import az.unibank.unitechmscurrencyrates.model.CurrencyResponseDto;
import az.unibank.unitechmscurrencyrates.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/currency")
@Slf4j
@RequiredArgsConstructor
public class CurrencyController {
    private final CurrencyService service;

    @GetMapping("/exchange")
    public CurrencyResponseDto exchange(@RequestBody CurrencyRequestDto requestDto) {
        log.info("controller exchange started");
        return service.exchange(requestDto);
    }
}
