/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Admin;
import pojo.User;
import pojo.userUtil;

/**
 *
 * @author Laksamana Zaidan
 */
public class DAOlogin {

    public List<User> getBy(String uEmail, String uPass) {

        Transaction trans = null;
        User us = new User();
        List<User> user = new ArrayList<>();

        Session session = userUtil.getSessionFactory().openSession();

        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from User where email=:uEmail AND password=:uPass ");
            query.setString("uEmail", uEmail);
            query.setString("uPass", uPass);
            us = (User) query.uniqueResult();
            user = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }

    public List<Admin> getAdmin(String aEmail, String aPass) {

        Transaction trans = null;
        Admin adm = new Admin();
        List<Admin> admin = new ArrayList<>();

        Session session = userUtil.getSessionFactory().openSession();

        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Admin where email=:aEmail AND password=:aPass ");
            query.setString("aEmail", aEmail);
            query.setString("aPass", aPass);
            adm = (Admin) query.uniqueResult();
            admin = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return admin;
    }

    public void add_user(User user) {
        Transaction trans = null;
        Session session = userUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(user);
            trans.commit();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
