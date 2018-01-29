package com.test.restclient.dto;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
public class ResponseDto {

    private int id;
    private String name;
}
