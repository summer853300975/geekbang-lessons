package org.geektimes.projects.user.web.controller;

import org.apache.commons.lang.StringUtils;
import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path ("/register")
public class RegisterController implements PageController {

    private UserService userService;

    /**
     * @param request  HTTP 请求
     * @param response HTTP 相应
     * @return 视图地址路径
     * @throws Throwable 异常发生时
     */
    @POST
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (StringUtils.isEmpty(request.getParameter("name"))) {
            return "register.jsp";
        }
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("email"));
        user.setPhoneNumber(request.getParameter("phoneNumber"));
        userService.register(user);
        userService.getAll().forEach(e -> System.out.println(RegisterController.class.getName() + ":" + e));
        return "login-form.jsp";
    }




}
