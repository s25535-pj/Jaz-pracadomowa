package zgapa.praca.service;

import org.springframework.web.client.RestTemplate;

public class PracaService {

    private final RestTemplate restTemplate;
    public PracaService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
}