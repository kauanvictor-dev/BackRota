import jakarta.persistence.*;

@Entity 
@Table(name = "Agency")
class agency_model {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)

@Column
private Long Agency_id;

@Column
private String Agency_name;

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

@Column String agency_email;
}