package com.example.timetable.model;

import javax.persistence.*;

@Entity
@Table(name = "discipline", schema = "timetable", catalog = "")
public class DisciplineEntity {
    private int idDiscipline;
    private String disciplineName;
    private Integer hoursAmount;
    private Integer disciplinePrice;

    @Id
    @Column(name = "idDiscipline", nullable = false)
    public int getIdDiscipline() {
        return idDiscipline;
    }

    public void setIdDiscipline(int idDiscipline) {
        this.idDiscipline = idDiscipline;
    }

    @Basic
    @Column(name = "disciplineName", nullable = true, length = 30)
    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    @Basic
    @Column(name = "hoursAmount", nullable = true)
    public Integer getHoursAmount() {
        return hoursAmount;
    }

    public void setHoursAmount(Integer hoursAmount) {
        this.hoursAmount = hoursAmount;
    }

    @Basic
    @Column(name = "disciplinePrice", nullable = true)
    public Integer getDisciplinePrice() {
        return disciplinePrice;
    }

    public void setDisciplinePrice(Integer disciplinePrice) {
        this.disciplinePrice = disciplinePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisciplineEntity that = (DisciplineEntity) o;

        if (idDiscipline != that.idDiscipline) return false;
        if (disciplineName != null ? !disciplineName.equals(that.disciplineName) : that.disciplineName != null)
            return false;
        if (hoursAmount != null ? !hoursAmount.equals(that.hoursAmount) : that.hoursAmount != null) return false;
        if (disciplinePrice != null ? !disciplinePrice.equals(that.disciplinePrice) : that.disciplinePrice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDiscipline;
        result = 31 * result + (disciplineName != null ? disciplineName.hashCode() : 0);
        result = 31 * result + (hoursAmount != null ? hoursAmount.hashCode() : 0);
        result = 31 * result + (disciplinePrice != null ? disciplinePrice.hashCode() : 0);
        return result;
    }
}
