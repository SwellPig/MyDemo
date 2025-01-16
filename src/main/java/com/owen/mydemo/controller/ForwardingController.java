package com.owen.mydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ForwardingController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/forward")
    public ResponseEntity<String> forwardPostRequest(@RequestBody String requestBody) {
        // 目标地址
        String targetUrl = "http://example.com/another-url";

        // 创建 HTTP 请求头
        HttpHeaders headers = new HttpHeaders();
        // 这里可以添加自定义的请求头，例如：headers.add("Authorization", "Bearer your_token");

        // 创建 HTTP 实体，包含请求体和请求头
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        // 发送 POST 请求并接收响应
        ResponseEntity<String> response = restTemplate.exchange(targetUrl, HttpMethod.POST, entity, String.class);

        // 将响应返回给客户端
        return response;
    }
}