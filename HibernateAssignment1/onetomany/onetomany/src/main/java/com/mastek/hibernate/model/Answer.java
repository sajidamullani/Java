package com.mastek.hibernate.model;


import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

 

import javax.persistence.Entity;

 

@Entity  
@Table(name="onetomanyanswer")  
public class Answer {   
@Id  
@GeneratedValue(strategy=GenerationType.TABLE)  
  
private int id;    
private String answername;    
private String postedBy;  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getAnswername() {  
    return answername;  
}  
public void setAnswername(String answername) {  
    this.answername = answername;  
}  
public String getPostedBy() {  
    return postedBy;  
}  
public void setPostedBy(String postedBy) {  
    this.postedBy = postedBy;  
}      
}    


