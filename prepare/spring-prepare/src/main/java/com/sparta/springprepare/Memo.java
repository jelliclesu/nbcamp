package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private String contents;
}