package com.example.sanitation_system.interceptor;

import com.example.sanitation_system.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class HeadInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        int aid = (int) request.getAttribute("aid");
        if(aid != User.HEAD_AUTHORITY){
            throw new ResponseStatusException(HttpStatus.FORBIDDEN,"无权限");
        }
        return true;
    }
}
