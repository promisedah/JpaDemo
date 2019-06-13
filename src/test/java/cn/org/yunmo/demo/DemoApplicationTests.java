package cn.org.yunmo.demo;

import cn.org.yunmo.dao.TestStudentDao;
import cn.org.yunmo.hotel.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Resource
    private TestStudentDao testStudentDao;

    @Test
    public void insert() {
        Student s = new Student();
        s.setAge(18);
        s.setName("张三");
        testStudentDao.save(s);
    }

    @Test
    public void update() {
        Student s = new Student();
        s.setId(1);
        s.setAge(111);
        s.setName("张三");
        testStudentDao.save(s);
    }

    @Test
    public void select() {
        Optional<Student> user = testStudentDao.findById(1);
        System.out.println(user);
    }

    @Test
    public void delete() {
        testStudentDao.deleteById(1);
    }
}
