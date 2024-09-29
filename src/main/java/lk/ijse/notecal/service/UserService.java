package lk.ijse.notecal.service;

import lk.ijse.notecal.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    List <UserDTO> getAllUsers();
    UserDTO getUser(String userId);
    void updateUser(UserDTO userDTO, String userId);
    void deleteUser(String userId);
}
