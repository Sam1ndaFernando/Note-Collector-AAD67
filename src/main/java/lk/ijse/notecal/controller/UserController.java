package lk.ijse.notecal.controller;

import lk.ijse.notecal.dto.impl.UserDTO;
import lk.ijse.notecal.util.AppUtil;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser(@RequestPart ("firstName") String firstName,
                            @RequestPart ("lastName") String lastName,
                            @RequestPart ("email") String email,
                            @RequestPart ("password") String password,
                            @RequestPart ("profilePic") String profilePic){


        String picToBase64 = AppUtil.profilePicToBase64(profilePic);
        String generateUserId = AppUtil.generateUserId();
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(generateUserId);
        userDTO.setFirstName(firstName);
        userDTO.setLastName(lastName);
        userDTO.setEmail(email);
        userDTO.setPassword(password);
        userDTO.setProfilePic(picToBase64);
        return userDTO;

    }

}
