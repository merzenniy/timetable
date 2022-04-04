package com.example.timetable.dto;

import javax.persistence.*;

@Entity
@Table(name = "student", schema = "timetable", catalog = "")
public class StudentEntity {
    private int idStudent;
    private String nameSt;
    private String phoneSt;
    private String surnameSt;

    @Id
    @Column(name = "idStudent", nullable = false)
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Basic
    @Column(name = "nameSt", nullable = true, length = 30)
    public String getNameSt() {
        return nameSt;
    }

    public void setNameSt(String nameSt) {
        this.nameSt = nameSt;
    }

    @Basic
    @Column(name = "phoneSt", nullable = true, length = 30)
    public String getPhoneSt() {
        return phoneSt;
    }

    public void setPhoneSt(String phoneSt) {
        this.phoneSt = phoneSt;
    }

    @Basic
    @Column(name = "surnameSt", nullable = true, length = 30)
    public String getSurnameSt() {
        return surnameSt;
    }

    public void setSurnameSt(String surnameSt) {
        this.surnameSt = surnameSt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (idStudent != that.idStudent) return false;
        if (nameSt != null ? !nameSt.equals(that.nameSt) : that.nameSt != null) return false;
        if (phoneSt != null ? !phoneSt.equals(that.phoneSt) : that.phoneSt != null) return false;
        if (surnameSt != null ? !surnameSt.equals(that.surnameSt) : that.surnameSt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStudent;
        result = 31 * result + (nameSt != null ? nameSt.hashCode() : 0);
        result = 31 * result + (phoneSt != null ? phoneSt.hashCode() : 0);
        result = 31 * result + (surnameSt != null ? surnameSt.hashCode() : 0);
        return result;
    }
}
