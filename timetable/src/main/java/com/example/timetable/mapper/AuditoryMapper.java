package com.example.timetable.mapper;

import com.example.timetable.dto.AuditoryEntity;
import com.example.timetable.model.Auditory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AuditoryMapper {
    AuditoryMapper INSTANCE = Mappers.getMapper(AuditoryMapper.class);

    AuditoryEntity mapAuditoryEntity (Auditory auditory);

    Auditory mapAuditory (AuditoryEntity auditoryEntity);

    List<AuditoryEntity> mapOAuditoryEntities(List<Auditory> auditories);
}
