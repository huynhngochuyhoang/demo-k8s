package com.example.demok8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
public class DemoK8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoK8sApplication.class, args);
    }

    @GetMapping ("/fib/{n}")
    @CrossOrigin(origins = "*")
    public String highestCandle(@PathVariable long n) {
        return n > 40 ? "Number is to large" : "Which " +
                n +
                ". The fibonacci number is " +
                fib(n);
    }

    private long fib(Long n) {
        if (n <= 1)
            return  n;
        return fib(n-1) + fib(n-2);
    }

}
