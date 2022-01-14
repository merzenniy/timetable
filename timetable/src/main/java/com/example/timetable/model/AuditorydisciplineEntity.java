package com.example.timetable.model;

import javax.persistence.*;

@Entity
@Table(name = "auditorydiscipline", schema = "timetable", catalog = "")
public class AuditorydisciplineEntity {
    private int idAd;
    private AuditoryEntity auditoryByIdAuditory;
    private DisciplineEntity disciplineByIdDiscipline;

    @Id
    @Column(name = "idAD", nullable = false)
    public int getIdAd() {
        return idAd;
    }

    public void setIdAd(int idAd) {
        this.idAd = idAd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuditorydisciplineEntity that = (AuditorydisciplineEntity) o;

        if (idAd != that.idAd) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idAd;
    }

    @ManyToOne
    @JoinColumn(name = "idAuditory", referencedColumnName = "idAuditory")
    public AuditoryEntity getAuditoryByIdAuditory() {
        return auditoryByIdAuditory;
    }

    public void setAuditoryByIdAuditory(AuditoryEntity auditoryByIdAuditory) {
        this.auditoryByIdAuditory = auditoryByIdAuditory;
    }

    @ManyToOne
    @JoinColumn(name = "idDiscipline", referencedColumnName = "idDiscipline")
    public DisciplineEntity getDisciplineByIdDiscipline() {
        return disciplineByIdDiscipline;
    }

    public void setDisciplineByIdDiscipline(DisciplineEntity disciplineByIdDiscipline) {
        this.disciplineByIdDiscipline = disciplineByIdDiscipline;
    }
}
