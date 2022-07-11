import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Subscription> subscriptions = session.createQuery("" +
                " from Subscription sub" +
                " join fetch sub.course c" +
                " join fetch sub.student s" +
                "", Subscription.class).getResultList();

        List<PurchaseList> LinkedPurchaseLists = session.createQuery(" from PurchaseList",
                PurchaseList.class).getResultList();

        subscriptions.forEach(s -> LinkedPurchaseLists.forEach(p -> {
            if (p.getStudentId() == null && s.getStudent().getName().equals(p.getId().getStudentName())) {
                p.setStudentId(s.getStudent().getId());
            }
            if (p.getCourseId() == null && s.getCourse().getName().equals(p.getId().getCourseName())) {
                p.setCourseId(s.getCourse().getId());
            }
        }));

        LinkedPurchaseLists.forEach(System.out::println);

        transaction.commit();

        sessionFactory.close();
    }
}
