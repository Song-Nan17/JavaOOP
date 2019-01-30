import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("小明", 15, "男", "2019013001");
        System.out.println("生成一个名为student的Studetn实例：");
        System.out.println("student姓名：" + student.getName() + "，年龄：" + student.getId() + "，性别：" + student.getGender() + "，学号：" + student.getId());

        student.setName("小红");
        student.setGender("女");
        System.out.println("\n将student姓名改为“小红”，性别改为“女”：");
        System.out.println("student姓名：" + student.getName() + "，年龄：" + student.getId() + "，性别：" + student.getGender() + "，学号：" + student.getId());

        student.setAge(16);
        student.setId("2019013002");
        System.out.println("\n将student的年龄改为“16”，学号改为“2019013002”：");
        System.out.println("student姓名：" + student.getName() + "，年龄：" + student.getId() + "，性别：" + student.getGender() + "，学号：" + student.getId());
    }
}
