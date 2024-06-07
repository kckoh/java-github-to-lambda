package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.Map;

public class App implements RequestHandler<Map<String, Object>, String> {
    public String handleRequest(Map<String, Object> input, Context context) {
        System.out.println("Hello World! executed with input: " + input);
        return input.toString();
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