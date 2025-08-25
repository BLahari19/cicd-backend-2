package com.klu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ACalc {

    // Addition
    @GetMapping("add/{A}/{B}")
    public Map<String, Object> add(@PathVariable("A") int a, @PathVariable("B") int b) {
        return buildResponse("add", a, b, a + b);
    }

    // Subtraction
    @GetMapping("sub/{A}/{B}")
    public Map<String, Object> sub(@PathVariable("A") int a, @PathVariable("B") int b) {
        return buildResponse("sub", a, b, a - b);
    }

    // Multiplication
    @GetMapping("mul/{A}/{B}")
    public Map<String, Object> mul(@PathVariable("A") int a, @PathVariable("B") int b) {
        return buildResponse("mul", a, b, a * b);
    }

    // Division
    @GetMapping("div/{A}/{B}")
    public Map<String, Object> div(@PathVariable("A") int a, @PathVariable("B") int b) {
        if (b == 0) {
            return errorResponse("Division by zero is not allowed!");
        }
        return buildResponse("div", a, b, a / b);
    }

    // Modulo
    @GetMapping("mod/{A}/{B}")
    public Map<String, Object> mod(@PathVariable("A") int a, @PathVariable("B") int b) {
        if (b == 0) {
            return errorResponse("Modulo by zero is not allowed!");
        }
        return buildResponse("mod", a, b, a % b);
    }

    // ✅ Helper methods
    private Map<String, Object> buildResponse(String operation, int a, int b, int result) {
        Map<String, Object> response = new HashMap<>();
        response.put("operation", operation);
        response.put("operand1", a);
        response.put("operand2", b);
        response.put("result", result);
        return response;
    }

    private Map<String, Object> errorResponse(String message) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", message);
        return response;
    }
}
