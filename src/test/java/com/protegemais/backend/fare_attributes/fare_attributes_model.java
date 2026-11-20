package com.protegemais.backend.fare_attributes;
import jakarta.persistence.*;

@Entity 
@Table (name = "fare_attributes")


public class fare_attributes_model {

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column 
private Long fare_id;

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


public fare_attributes_model(){}

public fare_attributes_model(double  price ,String currency_type, Integer  payment_method,
    Integer transfers ,Integer transfer_duration ,  String agency_id ){
        this.price = price;
        this.currency_type = currency_type;
        this.payment_method = payment_method;
        this.transfers = transfers;
        this.transfer_duration = transfer_duration;
        this.agency_id = agency_id;

}

public double getPrice(){
    return price;
}
public void  setPrice(double price){
    this.price = price;
}
public String getCurrency_type(){
    return currency_type;
}
public void setCurrency_type(String currency_type){
    this.currency_type = currency_type;
}
public Integer  getPayment_method(){
    return  payment_method;
}

public void setpayment_method(Integer payment_method){
    this.payment_method = payment_method;
}
public Integer gettransfers(){
    return transfers;

} 
public void transfers(Integer transfers){
    this.transfers = transfers;
}

public Integer gettransfer_duration(){
    return  transfer_duration;
}
public void  settransfer_duration(Integer  transfer_duration){
    this.transfer_duration =  transfer_duration;
}
public String getAgency_id(){
     return agency_id;
} 
public void agency_id(String agency_id){
    this.agency_id = agency_id;
}

}
