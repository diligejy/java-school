package com.test;

public class Emp<T>{
    private String emp_name;
    private T emp_no;

    public Emp() {
        super();
    }

    public Emp(String emp_name, T emp_no) {
        super();
        this.emp_name = emp_name;
        this.emp_no = emp_no;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public T getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(T emp_no) {
        this.emp_no = emp_no;
    }

    @Override
    public String toString() {
        return "Emp [emp_name=" + emp_name + ", emp_no=" + emp_no + "]";
    }
    
    
}