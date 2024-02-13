package org.zerock.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TodoDTO {

    private String name;
    private String id;
    private String password;
    private String age;
    private String gender;
    private String[] hobbies;
    private String travel;
    private String content;

}
