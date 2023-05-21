package Test;

import com.cs.pojo.Course;
import com.cs.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class mybatis01test {
    @Test
    public void Test01(){
        SqlSession session= MyBatisUtils.getSession();
        Course course=new Course();
        course.setId(2);
        List<Course> courses=session.selectList("com.cs.mapper.CourseMapper.Test01",course);
        System.out.println("查询 id=2 的课程信息:");
        for(Course course1: courses){
            System.out.println(course1);
        }
        session.close();
    }
    @Test
    public void Test02(){
        SqlSession session= MyBatisUtils.getSession();
        Course course=new Course();
        List<Course> courses=session.selectList("com.cs.mapper.CourseMapper.Test02",course);
        System.out.println("查询出所有计算机学院开设的课程信息:");
        for(Course course1: courses){
            System.out.println(course1);
        }
        session.close();
    }
    @Test
    public void Test03(){
        SqlSession session= MyBatisUtils.getSession();
        Course course=new Course();
        course.setHours(40);
        course.setId(4);
        int rows=session.update("com.cs.mapper.CourseMapper.Test03",course);
        if(rows>0){
            System.out.println("您成功修改了"+rows+"条数据!");
        }else{
            System.out.println("执行修改操作失败!!!");
        }
        session.commit();
        session.close();
    }
    /**@Test
     * 已经执行过此操作（已经插入过该信息）
    public void Test04(){
        SqlSession session= MyBatisUtils.getSession();
        Course course=new Course();
        course.setId(5);
        course.setName("大数据存储");
        course.setHours(40);
        course.setSid(1);
        int rows=session.update("com.cs.mapper.CourseMapper.Test04",course);
        if(rows>0){
            System.out.println("您成功插入了"+rows+"条数据!");
        }else{
            System.out.println("执行插入操作失败!!!");
        }
        session.commit();
        session.close();
    }*/
    @Test
    public void Test05(){
        SqlSession session= MyBatisUtils.getSession();
        Course course=new Course();
        List<Course> courses=session.selectList("com.cs.mapper.CourseMapper.Test05",course);
        System.out.println("输出所有的学院开设的课程信息:");
        for(Course course1: courses){
            System.out.println(course1);
        }
        session.close();
    }
}
