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
import pojo.Barang;
import pojo.User;
import pojo.userUtil;

/**
 *
 * @author Laksamana Zaidan
 */
public class DAObarang {

    public List<Barang> retrieveBarang() {
        List stud = new ArrayList();
        Barang stud1 = new Barang();
        Transaction trans = null;
        Session session = userUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Barang");
            stud = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return stud;
    }
    
    
    
    public List<Barang> getbyID(String idBarang){
       Barang prd = new Barang();
       List <Barang> iUsr = new ArrayList();
       
       Transaction trans = null;
       Session session = userUtil.getSessionFactory().openSession();
       
       try {
           trans = session.beginTransaction();
           Query query = session.createQuery("from Barang where id_barang = :id");
           query.setString("id", idBarang);
           prd = (Barang) query.uniqueResult();
           iUsr = query.list();
           trans.commit();
       } catch (Exception e) {
           System.out.println(e);
       }
       return iUsr;
   }
    
   public void deletePrd(Integer idPrd){
       Transaction trans = null;
       Session session = userUtil.getSessionFactory().openSession();
       try {
           trans = session.beginTransaction();
           Barang prd = (Barang) session.load(Barang.class, new Integer(idPrd));
           session.delete(prd);
           trans.commit();
       } catch (Exception e) {
           System.out.println(e);
       }
   }
   
   public void editPrd(Barang prd){
       Transaction trans = null;
       Session session = userUtil.getSessionFactory().openSession();
       try {
           trans = session.beginTransaction();
           session.update(prd);
           trans.commit();
       } catch (Exception e) {
           System.out.println(e);
       }
   }
   
   public void add_prd(Barang prd) {
        Transaction trans = null;
        Session session = userUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(prd);
            trans.commit();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
