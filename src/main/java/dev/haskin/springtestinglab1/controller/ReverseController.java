package dev.haskin.springtestinglab1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*

Problems:
x Create an endpoint in your controller called /reverse
x Make it take a string as a parameter
x Make it return the reverse of that string
 */

@RestController
//@RequestMapping("/reverse")
public class ReverseController {
    @GetMapping(consumes = "text/plain")
    String reverseString(@RequestBody String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
