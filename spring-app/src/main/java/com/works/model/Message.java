package com.works.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
 private String senderName;
 private String recievedName;
 private String message;
 private String date;
 private Status status;

}
