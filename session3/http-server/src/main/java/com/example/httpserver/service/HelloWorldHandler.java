package com.example.httpserver.service;

import com.example.httpserver.model.HttpRequest;
import com.example.httpserver.model.HttpResponse;
import com.example.tcpserver.MessageHandler;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component("helloComponent")
public class HelloWorldHandler implements MessageHandler <HttpRequest, HttpResponse> {
    @Override
    public List<HttpResponse> handle(HttpRequest request){
        HttpResponse response = new HttpResponse();
        response.setStatus(200);
        response.setReason("ok");
        response.setBody("Hello World!");
        return Collections.singletonList(response);

    }
}