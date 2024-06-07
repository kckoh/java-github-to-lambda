package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String input, Context context) {
        return "Hello, " + input + "!";
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

}

// public class App {
// public static void main(String[] args) {
// System.out.println("Hello, World!");
// }
// }