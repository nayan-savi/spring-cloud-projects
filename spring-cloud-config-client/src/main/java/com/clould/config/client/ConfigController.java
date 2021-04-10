package com.clould.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/config")
public class ConfigController {


    @Autowired
    private RestTemplate template;


    @GetMapping("/{environment}")
    public Config getConfiguration(@PathVariable String environment) {
        String url = "http://localhost:8888/catalog-" + environment + ".json";
        Config forObject = template.getForObject(url, Config.class);
        return forObject;
    }

}
