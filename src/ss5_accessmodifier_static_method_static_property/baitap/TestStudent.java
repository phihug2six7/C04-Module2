package ss5_accessmodifier_static_method_static_property.baitap;

public class TestStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Hùng");
        student.setClasses("C0422G1");
        System.out.println(student.getName()+student.getClasses());
    }
}
