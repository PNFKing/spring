package com.turing.sb3.entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="dept")
@AllArgsConstructor
public class Dept {
    @Id
    @Column(name = "DEPTNO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer DeptNo;
    @Column(name = "DNAME")
    private String DName;
    @Column(name = "LOC")
    private String Loc;

    public void setDeptNo(Integer deptNo) {
        DeptNo = deptNo;
    }

    public void setDName(String DName) {
        this.DName = DName;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }

    public Integer getDeptNo() {
        return DeptNo;
    }

    public String getDName() {
        return DName;
    }

    public String getLoc() {
        return Loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "DeptNo=" + DeptNo +
                ", DName='" + DName + '\'' +
                ", Loc='" + Loc + '\'' +
                '}';
    }
}
