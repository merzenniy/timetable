package com.example.timetable.mapper;

import com.example.timetable.dto.AuditoryEntity;
import com.example.timetable.model.Auditory;
import com.example.timetable.model.Auditory.AuditoryBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-04T07:38:40+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Amazon.com Inc.)"
)
@Component
public class AuditoryMapperImpl implements AuditoryMapper {

    @Override
    public AuditoryEntity mapAuditoryEntity(Auditory auditory) {
        if ( auditory == null ) {
            return null;
        }

        AuditoryEntity auditoryEntity = new AuditoryEntity();

        auditoryEntity.setIdAuditory( auditory.getIdAuditory() );
        auditoryEntity.setWorkplaces( auditory.getWorkplaces() );

        return auditoryEntity;
    }

    @Override
    public Auditory mapAuditory(AuditoryEntity auditoryEntity) {
        if ( auditoryEntity == null ) {
            return null;
        }

        AuditoryBuilder auditory = Auditory.builder();

        auditory.idAuditory( auditoryEntity.getIdAuditory() );
        auditory.workplaces( auditoryEntity.getWorkplaces() );

        return auditory.build();
    }

    @Override
    public List<AuditoryEntity> mapOAuditoryEntities(List<Auditory> auditories) {
        if ( auditories == null ) {
            return null;
        }

        List<AuditoryEntity> list = new ArrayList<AuditoryEntity>( auditories.size() );
        for ( Auditory auditory : auditories ) {
            list.add( mapAuditoryEntity( auditory ) );
        }

        return list;
    }
}
