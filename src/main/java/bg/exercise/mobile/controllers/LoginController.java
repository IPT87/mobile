package bg.exercise.mobile.controllers;

import bg.exercise.mobile.domain.dto.LoggedUser;
import bg.exercise.mobile.domain.dto.LoginUserDto;
import bg.exercise.mobile.domain.entity.User;
import bg.exercise.mobile.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users/login")
public class LoginController {

    private final UserServiceImpl userService;
    private final LoggedUser loggedUser;

    @Autowired
    public LoginController(UserServiceImpl userService, LoggedUser loggedUser) {
        this.userService = userService;
        this.loggedUser = loggedUser;
    }

    @GetMapping
    public String goToLogin() {
        return "auth-login";
    }

    @PostMapping
    public ModelAndView loginUser(LoginUserDto loginUserDto, ModelAndView modelAndView) {

        String username = loginUserDto.getUsername();
        String password = loginUserDto.getPassword();

        if (this.userService.getUserByUsernameAndPassword(username, password) != null) {
            User user = this.userService.getUserByUsernameAndPassword(username, password);
            this.loggedUser.setFirstName(user.getFirstName());
            this.loggedUser.setRole(user.getRole().getRole().toString());

            modelAndView.setViewName("auth-login");
        } else {

        }

        return modelAndView;
    }

}
