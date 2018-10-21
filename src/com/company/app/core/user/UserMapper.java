package com.company.app.core.user;

import com.company.domain.user.User;

class UserMapper {

    static UserDTO mapUser(User user){
        return new UserDTO(user.getId(), user.getName(),user.getSurname(),user.getAge());
    }
}
