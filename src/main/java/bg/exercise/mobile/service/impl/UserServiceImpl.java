package bg.exercise.mobile.service.impl;

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

    public UserServiceImpl(UserRepository userRepository, ModelMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public User registerUser(UserDto userDto) {
        User user = mapper.map(userDto, User.class);
        user.setCreated(LocalDate.now());
        return this.userRepository.save(user);
    }
}
