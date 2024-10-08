package lk.ijse.notecal.dao;

import lk.ijse.notecal.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao extends JpaRepository<NoteEntity, String> {
}