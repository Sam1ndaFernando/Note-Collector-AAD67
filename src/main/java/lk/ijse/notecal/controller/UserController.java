package lk.ijse.notecal.controller;

import lk.ijse.notecal.dto.impl.UserDTO;
import lk.ijse.notecal.service.UserService;
import lk.ijse.notecal.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser(@RequestPart ("firstName") String firstName,
                            @RequestPart ("lastName") String lastName,
                            @RequestPart ("email") String email,
                            @RequestPart ("password") String password,
                            @RequestPart ("profilePic") String profilePic){


        String base64ToProfilePic = "";
        try{
            byte[] bytesProPic = profilePic.getBytes();
            base64ToProfilePic = AppUtil.profilePicToBase64(bytesProPic);
        }catch (Exception e){
            e.printStackTrace();
        }

        String userId = AppUtil.generateUserId();

        UserDTO buildUserDTO = new UserDTO();
        buildUserDTO.setUserId(userId);
        buildUserDTO.setFirstName(firstName);
        buildUserDTO.setLastName(lastName);
        buildUserDTO.setEmail(email);
        buildUserDTO.setPassword(password);
        buildUserDTO.setProfilePic(base64ToProfilePic);
        userService.saveUser(buildUserDTO);

        return buildUserDTO;

    }
    @GetMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO getSelectedUser(@PathVariable ("userId") String userId){
        return userService.getUser(userId);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable ("userId") String userId){
        userService.deleteUser(userId);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }


    @PutMapping(value = "/{userId}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestPart ("firstName") String firstName,
                           @RequestPart ("lastName") String lastName,
                           @RequestPart ("email") String email,
                           @RequestPart ("password") String password,
                           @RequestPart ("profilePic") String profilePic,
                           @PathVariable String userId){

        String base64ToProfilePic = AppUtil.profilePicToBase64(profilePic.getBytes());

        UserDTO buildUserDTO = new UserDTO();
        buildUserDTO.setUserId(userId);
        buildUserDTO.setFirstName(firstName);
        buildUserDTO.setLastName(lastName);
        buildUserDTO.setEmail(email);
        buildUserDTO.setPassword(password);
        buildUserDTO.setProfilePic(base64ToProfilePic);
        userService.updateUser(buildUserDTO, userId);

    }

}
