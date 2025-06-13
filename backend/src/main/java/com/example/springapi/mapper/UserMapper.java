package com.example.springapi.mapper;

import com.example.springapi.dto.UserDTO;
import com.example.springapi.model.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO dto);
}
