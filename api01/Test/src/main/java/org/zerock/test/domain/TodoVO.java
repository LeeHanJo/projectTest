package org.zerock.test.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TodoVO {

    private String name;
    private String id;
    private String password;
    private String age;
    private String gender;
    private String[] hobbies;
    private String travel;
    private String content;
}
