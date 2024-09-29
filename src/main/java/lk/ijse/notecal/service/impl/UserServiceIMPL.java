package lk.ijse.notecal.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.notecal.dao.UserDao;
import lk.ijse.notecal.dto.impl.UserDTO;
import lk.ijse.notecal.entity.UserEntity;
import lk.ijse.notecal.service.UserService;
import lk.ijse.notecal.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class UserServiceIMPL implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private Mapping mapping;
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return mapping.toUserDTO(userDao.save(mapping.toUserEntity(userDTO)));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserEntity> userEntities = userDao.findAll();
        return mapping.asUserDTOList(userEntities);
    }

    @Override
    public UserDTO getUser(String userId) {
        UserEntity selectedUser = userDao.getReferenceById(userId);
        return mapping.toUserDTO(selectedUser);
    }

    @Override
    public void updateUser(UserDTO userDTO, String userId) {

    }

    @Override
    public void deleteUser(String userId) {
        userDao.deleteById(userId);
    }
}
