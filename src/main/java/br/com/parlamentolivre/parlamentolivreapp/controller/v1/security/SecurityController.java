package br.com.parlamentolivre.parlamentolivreapp.controller.v1.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api-parlamento-livre/v1/security/")
public class SecurityController {

    @GetMapping("teste")
    public String openService() {
        return "endpoint aberto";
    }
}
