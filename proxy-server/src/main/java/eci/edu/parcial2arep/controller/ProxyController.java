package eci.edu.parcial2arep.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api")
public class ProxyController {

    private final RestTemplate restTemplate = new RestTemplate();

    private final String[] services = {
            System.getenv().getOrDefault("SERVICE1_URL", "http://localhost:8081"),
            System.getenv().getOrDefault("SERVICE2_URL", "http://localhost:8082")
    };

    private String getServiceUrl() {
        return services[0];
    }

    @GetMapping("/lucasseq")
    public Object proxyRequest(
            @RequestParam int value) {

        String serviceUrl = getServiceUrl();
        String url = String.format("lucasseq?value=%d",
                serviceUrl, value);

        System.out.println("Redirigiendo solicitud a: " + url);

        return restTemplate.getForObject(url, Object.class);
    }
}
