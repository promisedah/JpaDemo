package cn.org.yunmo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@ComponentScan("cn")
@EntityScan("cn.org.yunmo.hotel.pojo")
@EnableJpaRepositories("cn")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    public static void main(String[] args) {
//        //1.创建 EntityManagerFactory
//        String persistenceUnitName = "jpa";
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
//
//        //2.创建 EntityManager
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        //4.开启事务
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//
//        //5.进行持久化操作
////        Customer customer = new Customer();
////        customer.setLastName("AA");
////        customer.setEmail("aa@163.com");
////        customer.setAge(20);
////        entityManager.persist(customer);
////        HotelUser hotelUser =  new HotelUser();
////        hotelUser.getUserId()
//        Student s = new Student();
//        s.setId(1);
//        s.setAge(18);
//        s.setName("张三");
//
//        entityManager.persist(s);
//
//        //6.提交事务
//        transaction.commit();
//
//        //7.关闭 EntityManager
//        entityManager.close();
//
//        //8.关闭 EntityManagerFactory
//        entityManagerFactory.close();
//    }
}

