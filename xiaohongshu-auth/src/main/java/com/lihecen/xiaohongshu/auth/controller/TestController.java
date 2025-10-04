package com.lihecen.xiaohongshu.auth.controller;

import com.lihecen.framework.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public Response<String> test() {
        return Response.success("Hello");
    }
}
