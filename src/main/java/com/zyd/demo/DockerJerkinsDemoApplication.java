package com.zyd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class DockerJerkinsDemoApplication {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost());
        SpringApplication.run(DockerJerkinsDemoApplication.class, args);
    }

}
