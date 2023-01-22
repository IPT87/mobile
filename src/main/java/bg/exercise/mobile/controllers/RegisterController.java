package bg.exercise.mobile.controllers;

import bg.exercise.mobile.domain.dto.UserDto;
import bg.exercise.mobile.enums.Role;
import bg.exercise.mobile.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users/register")
public class RegisterController {

    private final UserServiceImpl userService;

    public RegisterController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public ModelAndView registerUser(ModelAndView modelAndView) {
        modelAndView.addObject("user-roles", Role.values());
        modelAndView.setViewName("auth-register");
        return modelAndView;
    }

    @PostMapping
    public String redirectAfterRegister(UserDto userDto) {
        this.userService.registerUser(userDto);

        return "redirect:/auth-login";
    }

}
