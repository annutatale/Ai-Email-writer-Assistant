package com.email.writer.sb.app;

import lombok.Data;



@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}