package lk.ijse.notecal.service;

import lk.ijse.notecal.dto.SuperDTO;
import lk.ijse.notecal.dto.impl.NoteDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NoteService {
    ResponseEntity<Void> saveNote(NoteDTO noteDTO);
    List <NoteDTO> getAllNotes();
    SuperDTO getNote(String noteId);
    void deleteNote(String noteId);
    void updateNote(String noteId,NoteDTO noteDTO);
}
