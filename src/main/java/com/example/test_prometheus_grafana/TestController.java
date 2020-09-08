package com.example.test_prometheus_grafana;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "Test";
    }

    @RequestMapping("/testurl")
    public String testUrl() {
        return "Test Prometheus and Grafana";
    }
}
