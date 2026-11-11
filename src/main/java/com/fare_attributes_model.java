package com;
import jakarta.persistence.*;

@Entity 
@Table (name = "fare_attributes")


public class fare_attributes_model {

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column 
private String fare_id;

@Column 
private  double price;

@Column 
private String currency_type;

@Column 
private Integer  payment_method;

@Column 
private Integer transfers;

@Column 
private Integer transfer_duration;

@Column 
private String agency_id ;

}
