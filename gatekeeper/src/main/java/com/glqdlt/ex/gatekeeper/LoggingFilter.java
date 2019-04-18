package com.glqdlt.ex.gatekeeper;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jhun
 * 2019-04-18
 */

@Slf4j
public class LoggingFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest req = requestContext.getRequest();
        String url = req.getRequestURL().toString();
        log.info("Request URI ==> {}", url);
        if (url.contains("no2")) {
            HttpServletResponse response = requestContext.getResponse();
            try {
                response.sendRedirect("http://www.naver.com");
            } catch (IOException e) {
                log.error(e.getMessage(), e);
            }
        }
        return null;
    }
}
