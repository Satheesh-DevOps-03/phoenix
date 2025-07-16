package com.phoenix;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Phoenix app started...");

        int result = add(5, 3);
        System.out.println("Addition result: " + result);

        while (true) {
            Thread.sleep(10000);  // Keeps container running
            System.out.println("Phoenix app is still running...");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
