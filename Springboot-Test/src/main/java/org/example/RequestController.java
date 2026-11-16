package org.example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;

public class RequestController {

    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        //
        String method = request.getMethod();
        System.out.println("request method:"+method);

        //
        String url = request.getRequestURL().toString();
        System.out.println("request url:"+url);

        String uri = request.getRequestURI();
        System.out.println("request uri:"+uri);

        //
        String protocol = request.getProtocol();
        System.out.println("request protocol:"+protocol);

        //
        String name=request.getParameter("name");
        String age=request.getParameter("age");
        System.out.println("name:"+name+"\nage:"+age);

        //
        String accept = request.getHeader("Accept");
        System.out.println("Accept:"+accept);

        return "OK";
    }
}
