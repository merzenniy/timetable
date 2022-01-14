package com.example.timetable.model;

import javax.persistence.*;

@Entity
@Table(name = "auditory", schema = "timetable", catalog = "")
public class AuditoryEntity {
    private int idAuditory;
    private Integer workplaces;

    @Id
    @Column(name = "idAuditory", nullable = false)
    public int getIdAuditory() {
        return idAuditory;
    }

    public void setIdAuditory(int idAuditory) {
        this.idAuditory = idAuditory;
    }

    @Basic
    @Column(name = "workplaces", nullable = true)
    public Integer getWorkplaces() {
        return workplaces;
    }

    public void setWorkplaces(Integer workplaces) {
        this.workplaces = workplaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuditoryEntity that = (AuditoryEntity) o;

        if (idAuditory != that.idAuditory) return false;
        if (workplaces != null ? !workplaces.equals(that.workplaces) : that.workplaces != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAuditory;
        result = 31 * result + (workplaces != null ? workplaces.hashCode() : 0);
        return result;
    }
}
