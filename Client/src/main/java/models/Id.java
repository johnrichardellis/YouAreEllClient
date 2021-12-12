package models;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Table;


/* 
 * POJO for an Id object
 */

// @Entity
// @Table
public class Id {


//     @Id
//    @GeneratedValue

    private String userid = "";
    private String name = "";
    private String github = "";
//    private Long id = 0L;

     public Id() {
     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Id (String name, String githubId) {}

    public String getUid() {
        return userid;
    }

   public void setUid(String uid) {
       this.userid = uid;
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
        return "***************************\n"+
                "userid: "  + userid + '\n' +
                "name: " + name + '\n' +
                "github: " + github + '\n';

    }
}