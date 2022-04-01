package az.unibank.unitechmscurrencyrates.service;

import az.unibank.unitechmscurrencyrates.model.CurrencyResponseDto;
import az.unibank.unitechmscurrencyrates.model.CurrencyRequestDto;

public interface CurrencyService {
    CurrencyResponseDto exchange(CurrencyRequestDto requestDto);
}
