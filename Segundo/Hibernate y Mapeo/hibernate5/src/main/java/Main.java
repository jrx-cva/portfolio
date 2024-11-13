import modelos.Alumnos;
import org.hibernate.Session;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Session session = HibernateUtils.getSession();

        Alumnos alumno1 = new Alumnos("Carmen", "Velasco Acosta");
        Alumnos alumno2 = new Alumnos("Jesus", "Cañas Cobos");

        session.beginTransaction();
        session.save(alumno1);
        session.save(alumno2);
        session.getTransaction().commit();

        //getNameQuery= ejecutar consulta que se ha creado en el .xml
        session.getNamedQuery("mostrarAlumnos").list().forEach(System.out::println); //forEach= recorre y System.out::println= imprime los resultados listados
        session.close();
    }
}
