import java.lang.annotation.*;

// Step 1: Create Repeatable Annotation
@Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.TYPE)
@Repeatable(Students.class)
@interface Student {
    int roll();
    String name();
}

// Step 2: Container Annotation (required for repeatable)
@Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.TYPE)
@interface Students {
    Student[] value();
}

// Step 3: Apply Multiple Annotations
@Student(roll = 1, name = "Keshu Dalmiya")
@Student(roll = 2, name = "Keshu")
public class Custom {

    public static void main(String[] args) {

        // Access annotations
        // Class<Custom> c = Custom.class;

        // Get all Student annotations
        Student[] students =  Custom.class.getAnnotationsByType(Student.class);

        for (Student s : students) {
            System.out.println("Roll: " + s.roll());
            System.out.println("Name: " + s.name());
            System.out.println();
        }
    }
}
