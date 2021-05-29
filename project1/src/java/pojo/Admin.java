package pojo;
// Generated Oct 26, 2020 12:40:27 PM by Hibernate Tools 4.3.1

import DAO.DAOlogin;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;




/**
 * Admin generated by hbm2java
 */
@ManagedBean
public class Admin  implements java.io.Serializable {


     private Integer id;
     private String email;
     private String password;
     
     
     public String login_admin() {
        DAOlogin uDao = new DAOlogin();
        List<Admin> us = uDao.getAdmin(email, password);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        try {
            if (us != null) {
                email = us.get(0).email;
                password = us.get(0).password;
                return "admin";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "index";
    }

    public Admin() {
    }

    public Admin(String email, String password) {
       this.email = email;
       this.password = password;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


