package kz.aldi.chat.services;

import kz.aldi.chat.models.dto.UserDto;
import kz.aldi.chat.models.entity.User;

import java.util.Optional;

public interface UserService {
    User create(UserDto userDto);

    Optional<User> findById(Long id);

    User update(UserDto userDto, Long id);

}
