package pojo;
// Generated Oct 26, 2020 12:40:27 PM by Hibernate Tools 4.3.1

import DAO.DAOlogin;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;




/**
 * User generated by hbm2java
 */
@ManagedBean
public class User  implements java.io.Serializable {


     private Integer id;
     private String nama;
     private String email;
     private String password;
     private String phoneNum;
     private String alamat;
     
      public void onLoad() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);

        if (session.getAttribute("user_session_email") == null) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
            } catch (Exception e) {
            }
        }
    }

    public String getUsername() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
        return session.getAttribute("user_session_email").toString();
    }

    public String login_user() {
        DAOlogin uDao = new DAOlogin();
        List<User> us = uDao.getBy(email, password);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        try {
            if (us != null) {
                email = us.get(0).email;
                HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
                session.setAttribute("user_session_email", email);
                password = us.get(0).password;
                return "sukses";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "gagal";
    }

    public void save_user() {
        DAOlogin add = new DAOlogin();
        add.add_user(this);
    }


    public User() {
    }

    public User(String nama, String email, String password, String phoneNum, String alamat) {
       this.nama = nama;
       this.email = email;
       this.password = password;
       this.phoneNum = phoneNum;
       this.alamat = alamat;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
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
    public String getPhoneNum() {
        return this.phoneNum;
    }
    
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }




}

