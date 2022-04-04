package com.example.timetable.service;

import com.example.timetable.dto.AuditoryEntity;
import com.example.timetable.mapper.AuditoryMapper;
import com.example.timetable.model.Auditory;
import com.example.timetable.repository.AuditoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuditoryServiceImpl implements AuditoryService {
  private final AuditoryRepository auditoryRepository;

  @Override
  public AuditoryEntity getAuditory(int id) {
    Auditory auditory = auditoryRepository.getAuditory(id);
    return AuditoryMapper.INSTANCE.mapAuditoryEntity(auditory);
  }

  @Override
  public List<AuditoryEntity> getAuditoriesList() {
    return AuditoryMapper.INSTANCE.mapOAuditoryEntities(auditoryRepository.getAuditoriesList());
  }

  @Override
  public AuditoryEntity createAuditory(AuditoryEntity auditoryEntity) {
    Auditory auditory = AuditoryMapper.INSTANCE.mapAuditory(auditoryEntity);
    auditory = auditoryRepository.createAuditory(auditory);
    return AuditoryMapper.INSTANCE.mapAuditoryEntity(auditory);
  }

  @Override
  public AuditoryEntity updateAuditory(int id, AuditoryEntity auditoryEntity) {
    Auditory auditory = AuditoryMapper.INSTANCE.mapAuditory(auditoryEntity);
    auditory = auditoryRepository.updateAuditory(id, auditory);
    return AuditoryMapper.INSTANCE.mapAuditoryEntity(auditory);
  }

  @Override
  public void deleteAuditory(int id) {
    auditoryRepository.deleteAuditory(id);
  }
}
