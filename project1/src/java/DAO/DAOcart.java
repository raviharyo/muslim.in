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
import pojo.Ordertbl;
import pojo.userUtil;

/**
 *
 * @author Laksamana Zaidan
 */
public class DAOcart {
    public List<Ordertbl> retrieveOrder() {
        List stud = new ArrayList();
        Ordertbl stud1 = new Ordertbl();
        Transaction trans = null;
        Session session = userUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Ordertbl");
            stud = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return stud;
    }
    
    public void add_order(Ordertbl order) {
        Transaction trans = null;
        Session session = userUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(order);
            trans.commit();
            System.out.println(order.getQuantity());
            System.out.println("asdasdasd");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
