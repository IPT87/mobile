package bg.exercise.mobile.service;

import bg.exercise.mobile.domain.dto.UserDto;
import bg.exercise.mobile.domain.entity.User;

public interface UserService {
    User registerUser(UserDto userDto);
    User getUserByUsernameAndPassword(String username, String password);
    void logout();
}
