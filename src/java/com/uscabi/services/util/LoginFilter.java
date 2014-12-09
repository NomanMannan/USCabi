/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.services.util;

/**
 *
 * @author noman-pc
 */
import com.uscabi.services.LoginService;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Filter checks if LoginBean has loginIn property set to true. If it is not set
 * then request is being redirected to the login.xhml page.
 *
 * @author itcuties
 *
 */
public class LoginFilter implements Filter {

    /**
     * Checks if user is logged in. If not it redirects to the default.xhtml page.
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // Get the loginBean from session attribute
        LoginService loginService = (LoginService) ((HttpServletRequest) request).getSession().getAttribute("loginService");

        // For the first application request there is no loginService in the session so user needs to log in
        // For other requests loginService is present but we need to check if user has logged in successfully
        if (loginService == null || !loginService.isLoggedIn()) {
            String contextPath = ((HttpServletRequest) request).getContextPath();
            ((HttpServletResponse) response).sendRedirect(contextPath + "/login.xhtml");
        }

        chain.doFilter(request, response);

    }

    public void init(FilterConfig config) throws ServletException {
        // Nothing to do here!
    }

    public void destroy() {
        // Nothing to do here!
    }

}
