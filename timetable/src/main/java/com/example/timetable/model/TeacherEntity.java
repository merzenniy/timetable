package com.example.timetable.model;

import javax.persistence.*;

@Entity
@Table(name = "teacher", schema = "timetable", catalog = "")
public class TeacherEntity {
    private int idTeacher;
    private String nameTeacher;
    private String phone;

    @Id
    @Column(name = "idTeacher", nullable = false)
    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Basic
    @Column(name = "nameTeacher", nullable = true, length = 30)
    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 30)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (idTeacher != that.idTeacher) return false;
        if (nameTeacher != null ? !nameTeacher.equals(that.nameTeacher) : that.nameTeacher != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTeacher;
        result = 31 * result + (nameTeacher != null ? nameTeacher.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
