package com.example.timetable.dto;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "group", schema = "timetable", catalog = "")
public class GroupEntity {
    private int idGroup;
    private Timestamp startDate;
    private DisciplineEntity disciplineByIdDiscipline;
    private AuditoryEntity auditoryByIdAuditory;

    @Id
    @Column(name = "idGroup", nullable = false)
    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Basic
    @Column(name = "startDate", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupEntity that = (GroupEntity) o;

        if (idGroup != that.idGroup) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGroup;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idDiscipline", referencedColumnName = "idDiscipline")
    public DisciplineEntity getDisciplineByIdDiscipline() {
        return disciplineByIdDiscipline;
    }

    public void setDisciplineByIdDiscipline(DisciplineEntity disciplineByIdDiscipline) {
        this.disciplineByIdDiscipline = disciplineByIdDiscipline;
    }

    @ManyToOne
    @JoinColumn(name = "idAuditory", referencedColumnName = "idAuditory")
    public AuditoryEntity getAuditoryByIdAuditory() {
        return auditoryByIdAuditory;
    }

    public void setAuditoryByIdAuditory(AuditoryEntity auditoryByIdAuditory) {
        this.auditoryByIdAuditory = auditoryByIdAuditory;
    }
}
