package cn.org.yunmo.dao;

import cn.org.yunmo.hotel.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description JpaSqlServer
 * @Author zyh
 * @Date 2018-11-21 17:29
 */
public interface TestStudentDao extends JpaRepository<Student,Integer> {

    Student findByAge(int age);
}
