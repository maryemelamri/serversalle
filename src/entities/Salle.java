/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
 

import javax.persistence.OneToMany;
@Entity
//@NamedQuery(name = "findAllSalle", query = "from Salle") //HQL
//@NamedNativeQuery(name = "findAllNative", query = "select * from salle", resultClass = Salle.class) 
public class Salle implements Serializable{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String code;


    public Salle() {
    }

    public Salle(String code) {
        this.code = code;
   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code +  '}';
    }
     
     
    
}
