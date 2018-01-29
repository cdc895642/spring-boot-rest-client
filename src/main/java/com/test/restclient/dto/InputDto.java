package com.test.restclient.dto;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
public class InputDto {

    private int inputId;
    private String inpStr;
}
