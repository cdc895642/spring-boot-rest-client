package com.test.restclient.service

import com.test.restclient.dto.InputDto
import com.test.restclient.dto.ResponseDto
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
@CompileStatic
class GroovyRestClient {

    private RestTemplate restTemplate

    @Autowired
    void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate
    }

    void sendPost() {
        String url = "http://localhost:2018/"
        HttpHeaders headers = new HttpHeaders()
        headers.with {
            add("Accept", "application/xml")
            add("Content-Type", "application/xml")
        }
        InputDto inputDto = new InputDto()
        inputDto.with {
            inputId = 1
            inpStr = "input string"
        }
        HttpEntity<InputDto> request = new HttpEntity<>(inputDto, headers)
        ResponseDto responseDto = restTemplate
                .postForObject(url, request,  ResponseDto)
        responseDto.with {
            System.out.println (name)
            System.out.println (id)
        }
    }
}
