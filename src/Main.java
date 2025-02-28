/*import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,7,1,3,2,9,8,9,5,2,6);

        numbers.sort(Integer::compareTo);
        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder());
        //names.sort(String::compareTo);
        System.out.println(numbers);
    }
}

class Addition{
    static int a=5;static int b=6;
    public static int add(int a,int b){
        return a+b;
    }
}
public class Main {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        Addition a2 = new Addition();

        System.out.println(a1.add(5,8));
        System.out.println(a1.add(6,10));
    }
}*/
class Student{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String name;
    int age;
}
public class Main{
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.setName("A");
        System.out.println(s);

    }
}