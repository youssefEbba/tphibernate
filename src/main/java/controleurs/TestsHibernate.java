package controleurs;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import modeles.Film;
import modeles.Pays;

public class TestsHibernate {

    /**
     * Objet Session de Hibernate
     */
    private Session session;

    /**
     * Constructeur établissant une connexion avec Hibernate
     */
    public TestsHibernate() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(modeles.Pays.class);
        configuration.addAnnotatedClass(modeles.Film.class);
        configuration.addAnnotatedClass(modeles.Artiste.class);
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration
                .buildSessionFactory(serviceRegistry);
        session = sessionFactory.openSession();
    }

    public void insertPays(Pays pays) {
        session.beginTransaction();
        session.persist(pays);
        session.getTransaction().commit();
    }

    public List<Pays> lecturePays() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Pays> criteria = builder.createQuery(Pays.class);
        Root<Pays> rootp = criteria.from(Pays.class);
        criteria.select(rootp);
        List<Pays> pays = session.createQuery(criteria).getResultList();
        return pays;
    }
    public List<Film> lectureFilm() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Film> criteria = builder.createQuery(Film.class);
        Root<Film> rootp = criteria.from(Film.class);
        criteria.select(rootp);
        List<Film> films = session.createQuery(criteria).getResultList();
        return films;
    }
    

}
