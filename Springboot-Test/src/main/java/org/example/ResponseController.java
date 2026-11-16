package org.example;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ResponseController {
    //1.HttpServletResponse方法
    @RequestMapping("/response")
    public String response(HttpServletResponse response) throws IOException {
        //
        response.setStatus(200);

        //
        response.setHeader("Access-Control-Allow-Origin", "*");

        //
        response.getWriter().write("<h1>hhh</h1>");

        return "OK";
    }

    //Spring提供方法
    @RequestMapping("/response2")
    public ResponseEntity<String> response2(){
       return ResponseEntity.status(200)
                            .header("name","spring")
                            .body("<h1>hhh2</h1>");
    }
}
