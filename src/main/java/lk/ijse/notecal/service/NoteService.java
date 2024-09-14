package lk.ijse.notecal.service;

import lk.ijse.notecal.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {
    String saveNote(NoteDTO noteDTO);
    List <NoteDTO> getAllNotes();
    NoteDTO getNote(String noteId);
    void deleteNote(String noteId);
    void updateNote(String noteId,NoteDTO noteDTO);
}
