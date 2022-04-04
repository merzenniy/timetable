package com.example.timetable.dto;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "lesson", schema = "timetable", catalog = "")
public class LessonEntity {
    private int idLesson;
    private String workDay;
    private Time timeOfLesson;
    private GroupEntity groupByIdGroup;
    private DisciplineEntity disciplineByIdDiscipline;
    private AuditoryEntity auditoryByIdAudotiry;
    private TeacherEntity teacherByIdTeacher;

    @Id
    @Column(name = "idLesson", nullable = false)
    public int getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(int idLesson) {
        this.idLesson = idLesson;
    }

    @Basic
    @Column(name = "workDay", nullable = true, length = 15)
    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    @Basic
    @Column(name = "timeOfLesson", nullable = true)
    public Time getTimeOfLesson() {
        return timeOfLesson;
    }

    public void setTimeOfLesson(Time timeOfLesson) {
        this.timeOfLesson = timeOfLesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LessonEntity that = (LessonEntity) o;

        if (idLesson != that.idLesson) return false;
        if (workDay != null ? !workDay.equals(that.workDay) : that.workDay != null) return false;
        if (timeOfLesson != null ? !timeOfLesson.equals(that.timeOfLesson) : that.timeOfLesson != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLesson;
        result = 31 * result + (workDay != null ? workDay.hashCode() : 0);
        result = 31 * result + (timeOfLesson != null ? timeOfLesson.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idGroup", referencedColumnName = "idGroup")
    public GroupEntity getGroupByIdGroup() {
        return groupByIdGroup;
    }

    public void setGroupByIdGroup(GroupEntity groupByIdGroup) {
        this.groupByIdGroup = groupByIdGroup;
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
    @JoinColumn(name = "idAudotiry", referencedColumnName = "idAuditory")
    public AuditoryEntity getAuditoryByIdAudotiry() {
        return auditoryByIdAudotiry;
    }

    public void setAuditoryByIdAudotiry(AuditoryEntity auditoryByIdAudotiry) {
        this.auditoryByIdAudotiry = auditoryByIdAudotiry;
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
