package com.example.timetable.repository;

import com.example.timetable.exception.ItemNotFoundException;
import com.example.timetable.model.Auditory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class AuditoryRepositoryImpl implements AuditoryRepository {
    private final List<Auditory> auditories = new ArrayList<>();

    @Override
    public Auditory getAuditory(int id) {
        log.info(this.getClass().getSimpleName() + ". Inside getClient method");
        return auditories.stream()
                .filter(auditory -> auditory.getIdAuditory() == id)
                .findFirst()
                .orElseThrow(() -> new ItemNotFoundException("Can`t found auditory with id = " + id));    }

    @Override
    public List<Auditory> getAuditoriesList() {
        return new ArrayList<>(auditories);
    }

    @Override
    public Auditory createAuditory(Auditory auditory) {
        auditories.add(auditory);
        return auditory;    }

    @Override
    public Auditory updateAuditory(int id, Auditory auditory) {
        boolean isChanged = auditories.removeIf(auditory1 -> auditory1.getIdAuditory() == id);
        if (isChanged) {
            auditories.add(auditory);
        } else {
            throw new ItemNotFoundException("Сlient with given id does not exist");
        }
        return auditory;    }

    @Override
    public void deleteAuditory(int id) {
        auditories.removeIf(auditory -> auditory.getIdAuditory() == id);
    }
}
