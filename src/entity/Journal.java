/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author user
 */
public class Journal {
    private Person student;
    private Subject subject;
    private Integer mark;
    private Date date;
    
    public Journal() {   
    }
    
    public Journal(Person student, Subject subject, Integer mark, Date date) {
        this.student = student;
        this.subject = subject;
        this.mark = mark;
        this.date = date;    
    }
    
    public Person getPerson() {
        return student;
    }

    public void setPerson(String person) {
        this.student = student;
    }
    
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
    }
    
}
