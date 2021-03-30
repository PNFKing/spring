package com.turing.sb3.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "emp")
public class Emp {
    @Id
    @Column(name = "EMPNO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer EmpNo;
    @Column(name = "ENAME")
    private String EName;
    @Column(name = "JOB")
    private String Job;
    @Column(name = "MGR")
    private Integer Mgr;
    @Column(name = "HIREDATE")
    private Date HireDate;
    @Column(name = "SAL")
    private Integer Sal;
    @Column(name = "COMM")
    private Integer Comm;
    @Column(name = "DEPTNO")
    private Integer DeptNo;

    public Integer getEmpNo() {
        return EmpNo;
    }

    public String getEName() {
        return EName;
    }

    public String getJob() {
        return Job;
    }

    public Integer getMgr() {
        return Mgr;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public Integer getSal() {
        return Sal;
    }

    public Integer getComm() {
        return Comm;
    }

    public Integer getDeptNo() {
        return DeptNo;
    }

    public void setEmpNo(Integer empNo) {
        EmpNo = empNo;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public void setJob(String job) {
        Job = job;
    }

    public void setMgr(Integer mgr) {
        Mgr = mgr;
    }

    public void setHireDate(Date hireDate) {
        HireDate = hireDate;
    }

    public void setSal(Integer sal) {
        Sal = sal;
    }

    public void setComm(Integer comm) {
        Comm = comm;
    }

    public void setDeptNo(Integer deptNo) {
        DeptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "EmpNo=" + EmpNo +
                ", EName='" + EName + '\'' +
                ", Job='" + Job + '\'' +
                ", Mgr=" + Mgr +
                ", HireDate=" + HireDate +
                ", Sal=" + Sal +
                ", Comm=" + Comm +
                ", DeptNo=" + DeptNo +
                '}';
    }
}
