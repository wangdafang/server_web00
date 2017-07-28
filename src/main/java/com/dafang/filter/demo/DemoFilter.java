package com.dafang.filter.demo;

import javax.servlet.*;
import java.io.IOException;

public class DemoFilter implements Filter {

    private String demoName;

    public void init(FilterConfig filterConfig) throws ServletException {
        demoName = filterConfig.getInitParameter("demoName");
        System.out.println("【DemoFilter】进入init~~~~");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("【DemoFilter】进入Filter~~~~demoName:"+ demoName);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {
        System.out.println("【DemoFilter】进入destroy方法~~~~");
    }

}
