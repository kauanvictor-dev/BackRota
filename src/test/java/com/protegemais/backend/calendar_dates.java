package com.protegemais.backend;
import jakarta.persistence.*;
import java.util.*;

@Entity 
@Table (name="calendar_dates")

public class calendar_dates {

@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)


@Column 
private String  service_id;

@Column 
private Date date;

@Column 
private  Integer  exception_type;


}
