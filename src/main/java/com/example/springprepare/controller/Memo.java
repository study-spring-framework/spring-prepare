package com.example.springprepare.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Memo {
    private String username;

}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo();
        memo.setUsername("Thomas");
        System.out.println(memo.getUsername());
    }
}
