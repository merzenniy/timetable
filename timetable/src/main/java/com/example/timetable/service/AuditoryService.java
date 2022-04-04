package com.example.timetable.service;

import com.example.timetable.dto.AuditoryEntity;

import java.util.List;

public interface AuditoryService {
    AuditoryEntity getAuditory(int id);
//получить список аудиторий
    List<AuditoryEntity> getAuditoriesList();
//добавить аудиторию
    AuditoryEntity createAuditory(AuditoryEntity auditoryEntity);
//обновить аудиторию
    AuditoryEntity updateAuditory(int id, AuditoryEntity auditoryEntity);
//удалить аудиторию
    void deleteAuditory(int id);
}
