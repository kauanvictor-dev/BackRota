package com.protegemais.backend.agency;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "Agency")
class agency_model {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)

@Column
private Long agency_id;

@Column
private String agency_name;

@Column
private  String agency_url;

@Column
private String agency_timezone;

@Column 
private String agency_lang;

@Column 
private  String agency_phone;

@Column 
private String agency_fare_url;

@Column 
private String agency_email;


public agency_model() {}

public agency_model(String agency_name ,String agency_url , String  agency_timezone , String agency_lang , 
    String agency_phone, String agency_fare_url, String agency_email  ){

        this.agency_name = agency_name;
        this.agency_url = agency_url;
        this.agency_timezone = agency_timezone;
        this.agency_lang = agency_lang;
        this.agency_phone = agency_phone;
        this.agency_fare_url = agency_fare_url;
        this.agency_email = agency_email;
    }

public String getAgency_name(){
    return agency_name;
}

public void setAgency_name(String agency_name){
    this.agency_name = agency_name;

}

public String getAgency_url(){
    return agency_url;
}
public void setAgency_url(String agency_url){
    this.agency_url= agency_url;
}

public String getAgency_timezone(){
    return agency_timezone;
}
public void setAgency_timezone(String agency_timezone){
    this.agency_timezone= agency_timezone;
}
public String getAgency_lang(){
    return agency_lang;
}
public void setAgency_lang(String agency_lang){
    this.agency_lang = agency_lang;
} 
public String getAgency_phone(){
    return agency_phone;
}
public void setAgency_phone(String agency_phone){
    this.agency_phone = agency_phone;
}
public String getAgency_fare_url(){
    return agency_fare_url;
}
public void setAgency_fare_url( String agency_fare_url){
    this.agency_fare_url = agency_fare_url;
} 
public String getAgency_email(){
    return agency_email;
}
public void setAgency_email(String agency_email){
    this.agency_email = agency_email;
}

}
