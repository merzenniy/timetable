package com.example.timetable.repository;

import com.example.timetable.dto.AuditoryEntity;
import com.example.timetable.model.Auditory;

import java.util.List;

public interface AuditoryRepository {
    Auditory getAuditory(int id);
    //получить список аудиторий
    List<Auditory> getAuditoriesList();
    //добавить аудиторию
    Auditory createAuditory(Auditory auditory);
    //обновить аудиторию
    Auditory updateAuditory(int id, Auditory auditory);
    //удалить аудиторию
    void deleteAuditory(int id);
}
