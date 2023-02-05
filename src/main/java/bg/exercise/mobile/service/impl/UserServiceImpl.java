package bg.exercise.mobile.service.impl;

import bg.exercise.mobile.domain.dto.LoggedUser;
import bg.exercise.mobile.domain.dto.UserDto;
import bg.exercise.mobile.domain.entity.User;
import bg.exercise.mobile.repository.UserRepository;
import bg.exercise.mobile.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;
    private final LoggedUser loggedUser;

    public UserServiceImpl(UserRepository userRepository, ModelMapper mapper, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.mapper = mapper;
        this.loggedUser = loggedUser;
    }

    @Override
    public User registerUser(UserDto userDto) {
        User user = mapper.map(userDto, User.class);
        user.setCreated(LocalDate.now());
        return this.userRepository.save(user);
    }

    @Override
    public User getUserByUsernameAndPassword(String username, String password) {
        return this.userRepository.getUserByUsernameAndPassword(username, password).orElse(null);
    }

    @Override
    public void logout() {
        this.loggedUser.setFirstName(null);
        this.loggedUser.setRole(null);
    }
}
