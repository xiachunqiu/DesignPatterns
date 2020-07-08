package patterns.j2eepatterns.transferobjectpattern;

import patterns.j2eepatterns.transferobjectpattern.bo.StudentBO;
import patterns.j2eepatterns.transferobjectpattern.vo.StudentVO;

/**
 * 传输对象模式
 */
public class Demo {
    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        // 输出所有的学生
        studentBusinessObject.getAllStudents().forEach(
                student -> System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]")
        );

        // 更新学生
        StudentVO student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        // 获取学生
        student = studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
