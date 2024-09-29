package lk.ijse.notecal.service.impl;

import lk.ijse.notecal.dto.impl.NoteDTO;
import lk.ijse.notecal.service.NoteService;
import lk.ijse.notecal.util.AppUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteSericeImpl implements NoteService {

    private static List<NoteDTO>noteDTOList=new ArrayList<>();
    public NoteSericeImpl(){
        noteDTOList.add(new NoteDTO( "NOTE-20ffbc65-1fd5-45bf-b03b-ce00f8fd04d0",
                "python",
                "Js",
                "2024/sep/14",
                "P4",
                "5"
        ));
    }

    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteId(AppUtil.generateNoteId());
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return null;
    }

    @Override
    public NoteDTO getNote(String NoteId) {
        return null;
    }

    @Override
    public void deleteNote(String noteId) {

    }

    @Override
    public void updateNote(String noteId, NoteDTO noteDTO) {
    }
}
