package com.protegemais.backend.calendar_dates;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table (name="calendar_dates")

public class calendar_dates_model {

@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)


@Column 
private Long service_id;

@Column 
private Date date;

@Column 
private  Integer  exception_type;


public calendar_dates_model(){}

public calendar_dates_model(Date date , Integer exception_type){
    this.date = date;
    this.exception_type = exception_type;
}

public Date getDate(){
     return date;
 }
public void  setDate(Date date){
    this.date = date;
} 
public Integer getException_type(){
    return exception_type;
}
public void setException_type( Integer exception_type){
    this.exception_type =exception_type; 
}

}
