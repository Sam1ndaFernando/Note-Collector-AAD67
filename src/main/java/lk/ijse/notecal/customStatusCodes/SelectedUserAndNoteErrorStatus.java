package lk.ijse.notecal.customStatusCodes;

import lk.ijse.notecal.dto.NoteStatus;
import lk.ijse.notecal.dto.UserStatus;
import lk.ijse.notecal.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserAndNoteErrorStatus implements UserStatus, NoteStatus {
    private int statusCode;
    private String statusMessage;
}