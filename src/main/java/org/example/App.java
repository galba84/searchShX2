package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class App implements CommandLineRunner
{
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(App.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Calc calc = new Calc();
        double result = calc.findShA(Integer.parseInt(args[0]));
        System.out.println(result);
    }
}
