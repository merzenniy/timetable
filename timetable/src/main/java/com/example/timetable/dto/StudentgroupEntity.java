package com.example.timetable.dto;

import javax.persistence.*;

@Entity
@Table(name = "studentgroup", schema = "timetable", catalog = "")
public class StudentgroupEntity {
    private int idSg;
    private StudentEntity studentByIdStudent;
    private GroupEntity groupByIdGroup;

    @Id
    @Column(name = "idSG", nullable = false)
    public int getIdSg() {
        return idSg;
    }

    public void setIdSg(int idSg) {
        this.idSg = idSg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentgroupEntity that = (StudentgroupEntity) o;

        if (idSg != that.idSg) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idSg;
    }

    @ManyToOne
    @JoinColumn(name = "idStudent", referencedColumnName = "idStudent")
    public StudentEntity getStudentByIdStudent() {
        return studentByIdStudent;
    }

    public void setStudentByIdStudent(StudentEntity studentByIdStudent) {
        this.studentByIdStudent = studentByIdStudent;
    }

    @ManyToOne
    @JoinColumn(name = "idGroup", referencedColumnName = "idGroup")
    public GroupEntity getGroupByIdGroup() {
        return groupByIdGroup;
    }

    public void setGroupByIdGroup(GroupEntity groupByIdGroup) {
        this.groupByIdGroup = groupByIdGroup;
    }
}
