package bg.exercise.mobile.controllers;

import bg.exercise.mobile.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users/logout")
public class LogoutController {

    private final UserServiceImpl userService;

    @Autowired
    public LogoutController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public ModelAndView logout(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        this.userService.logout();

        return modelAndView;
    }

}
