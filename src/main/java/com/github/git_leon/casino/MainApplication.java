package com.github.git_leon.casino;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
    }

    public static Person createPerson() {
        Console console = new Console();
        String name = console.getStringInput("What is your name?");
        Integer age = console.getIntegerInput("What is your age?");
        Person newUser = new Person(name, age);
        return newUser;
    }
}
