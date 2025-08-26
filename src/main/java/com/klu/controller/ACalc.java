package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc1")   // ✅ base path added
public class ACalc {

    @GetMapping("add/{A}/{B}")
    public int add(@PathVariable int A, @PathVariable int B) {
        return A + B;
    }

    @GetMapping("sub/{A}/{B}")
    public int sub(@PathVariable int A, @PathVariable int B) {
        return A - B;
    }

    @GetMapping("mul/{A}/{B}")
    public int mul(@PathVariable int A, @PathVariable int B) {
        return A * B;
    }

    @GetMapping("div/{A}/{B}")
    public int div(@PathVariable int A, @PathVariable int B) {
        return A / B;
    }

    @GetMapping("mod/{A}/{B}")
    public int mod(@PathVariable int A, @PathVariable int B) {
        return A % B;
    }
}
