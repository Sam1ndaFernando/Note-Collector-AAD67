package lk.ijse.notecal.entity;

import jakarta.persistence.*;
import lk.ijse.notecal.dto.impl.NoteDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class UserEntity implements SuperEntity{
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    private String profilePic;
    @OneToMany(mappedBy = "user")
    private List<NoteEntity> notes;
}
