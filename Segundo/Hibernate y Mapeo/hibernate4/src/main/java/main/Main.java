package main;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import javax.persistence.Query;


public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtils.getSession();

        //CONSULTAS HQL

        Query query = session.createQuery("select c.city from Customers c");
        List<String> list = query.list();
        list.forEach(System.out::println);




    }

}
