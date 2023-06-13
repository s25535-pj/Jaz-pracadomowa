package zgapa.praca.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping()
public class PracaController {
    private final RestTemplate restTemplate;

    public PracaController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/praca/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Test message from Rest Controller");
    }
}