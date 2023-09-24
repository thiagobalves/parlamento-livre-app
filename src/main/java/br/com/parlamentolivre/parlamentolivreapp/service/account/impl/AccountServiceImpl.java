package br.com.parlamentolivre.parlamentolivreapp.service.account.impl;

import br.com.parlamentolivre.parlamentolivreapp.service.account.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public String getHelloWorld() {
        return "Hello, Cabra!";
    }
}
