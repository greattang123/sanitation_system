package com.example.sanitation_system.interceptor;

import com.example.sanitation_system.component.EncryptComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    private EncryptComponent ec;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Optional.ofNullable(request.getHeader("token"))
                .ifPresentOrElse(token ->{
                    var map = ec.decrypt(token);
                    request.setAttribute("uid", map.get("uid")); //用户id
                    request.setAttribute("aid", map.get("aid")); //用户权限id
                },() -> {
                    throw new  ResponseStatusException(HttpStatus.UNAUTHORIZED,"未登录！");
                });
        return true;
    }
}
