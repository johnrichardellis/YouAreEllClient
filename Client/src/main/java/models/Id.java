package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


/* 
 * POJO for an Id object
 */

 @Entity
 @Table
public class Id {


     @Id
    @GeneratedValue   

    private String uid = "";
    private String name = "";
    private String github = "";
    private Long id = 0L;

     public Id() {
     }

     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

     public Id (String name, String githubId) {}

    public String getUid() {
        return uid;
    }

   public void setUid(String uid) {
       this.uid = uid;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.github + ") ";
    }
}