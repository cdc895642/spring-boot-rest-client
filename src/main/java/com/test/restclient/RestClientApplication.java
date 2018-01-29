package com.test.restclient;

import com.test.restclient.service.GroovyRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestClientApplication implements CommandLineRunner {

  @Autowired
  GroovyRestClient restClient;

  public static void main(String[] args) {
    SpringApplication.run(RestClientApplication.class, args);
  }

  @Override
  public void run(String... strings) throws Exception {
    restClient.sendPost();
  }
}
