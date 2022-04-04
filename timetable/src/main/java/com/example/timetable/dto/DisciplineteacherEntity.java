package com.example.timetable.dto;

import javax.persistence.*;

@Entity
@Table(name = "disciplineteacher", schema = "timetable", catalog = "")
public class DisciplineteacherEntity {
    private int idDt;
    private DisciplineEntity disciplineByIdDiscipline;
    private TeacherEntity teacherByIdTeacher;

    @Id
    @Column(name = "idDT", nullable = false)
    public int getIdDt() {
        return idDt;
    }

    public void setIdDt(int idDt) {
        this.idDt = idDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisciplineteacherEntity that = (DisciplineteacherEntity) o;

        if (idDt != that.idDt) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idDt;
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
    @JoinColumn(name = "idTeacher", referencedColumnName = "idTeacher")
    public TeacherEntity getTeacherByIdTeacher() {
        return teacherByIdTeacher;
    }

    public void setTeacherByIdTeacher(TeacherEntity teacherByIdTeacher) {
        this.teacherByIdTeacher = teacherByIdTeacher;
    }
}
