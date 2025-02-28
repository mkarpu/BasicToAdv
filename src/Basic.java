//import java.util.Scanner;
/*
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n = sc.nextInt();
        System.out.print("Enter second integer: ");
        int m = sc.nextInt();

            if(n>m){
                n=m;
               System.out.println("value of n from if  " +n);
            }else{
                n=m;
                System.out.println("value of n from else  " +n);
            }
    }
}

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class Basic {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
public class Basic{

    public int add(){
        int a=5;int b=2;
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        int i = 1000000000;
        System.out.println(i);
        double d = 99.99;
        int num = (int) d;
        System.out.println(num);
    }
}
import javax.swing.*;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        int n; int i=0;int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        n = sc.nextInt();
        System.out.println("Entered number " + n);

      for (i=0;i<=n;i++) {
          System.out.println(n1);
          n1 = n2 + n3;
          n2 = n3;
          n3 = n1;
      }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String s = sc.nextLine();
        System.out.println("Enter the Sentence: " + s);
        String[] str = s.split(" ");
        ArrayList<Integer> words = new ArrayList<Integer>();

        for (String str1 : str) {
        words.add(str1.length());
        }
        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);
        int w = words.getLast();
        System.out.println(w);

        for(String str1: str){
            if(str1.length()==w){
                System.out.println("Long word in the String : " +str1);
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        Integer n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(n);
        System.out.println("do you want to add another number ? ");
        sc.nextLine();

        while(sc.nextLine().equals("y"))
        {
            System.out.println("Enter the number : ");
            int s = sc.nextInt();
            System.out.println(s);
            arr.add(s);
            System.out.println("Do you want to add more? ");
            sc.nextLine();
        }
            System.out.print(arr);
            Collections.sort(arr);
            System.out.println(arr);

            System.out.println(arr.get(arr.size()-2));
    }
}

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.println(fact);
        }
    }
}

public class Basic {
    public static void main(String[] args) {
        int i = 1; // Initialization

        while (i <= 5) { // Condition
            System.out.println("Number: " + i);
            i++; // Increment

        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate");
        int n = sc.nextInt();
        System.out.println("The number entered is: " + n);
        //n=n+1;
        int i = 1;int sum =0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum is: " + sum);
    }
}

interface myBasic{
    void greetMe();
}
class Greet implements myBasic {
    public void greetMe() {
        System.out.println("Hey how are you");
    }
}
public class Basic {
    public static void main(String[] args) {
        myBasic my = new Greet();
        my.greetMe();
    }
}

interface Calculator{
    void Add(int a, int b);
    void Subtract(int a, int b);
    void Multiply(int a, int b);
}
class Operations implements Calculator{
    public void Add(int a, int b){
        System.out.println("Sum is " +(a+b));
    }
    public void Subtract(int a, int b){
        System.out.println("Subtract is " +(a-b));
    }
    public void Multiply(int a, int b){
        System.out.println("Multiply is " +(a*b));
    }
}
public class Basic{
    public static void main(String[] args){
        Calculator calc = new Operations();
        calc.Add(2, 3);
        calc.Subtract(3, 4);
        calc.Multiply(4, 5);
    }
}

interface Greet{
    void sayHello();
    void sayGoodbye();
}
abstract class Customer implements Greet{
    public void sayGoodbye(){
        System.out.println("Goodbye");
    }
}
public class Basic {
    public static void main(String[] args) {
        Greet g = new Customer() {
            public void sayHello() {
                System.out.println("Hello");
            }
        };
        g.sayHello();
        g.sayGoodbye();
    }
}

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int[] numbers = new int[10];

        for (int i = 0; i <= 3; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Entered numbers are");
        for(int num: numbers) {
            System.out.print(num + ",");
        }
    }
}

import java.util.*;




class Product {
    String name;
    int price;

    Product(String name) {
        this.name = name;
    }
}

public class Basic {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("pen"),
                new Product("book"),
                new Product("Tablet")
        );
        products.forEach(System.out::println);
    }
}

import java.util.*;

public class Basic{

    public static void main(String[] args) {

        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(5, 3, 8, 9, 1, 4));
        Collections.sort(num2, (o1, o2) -> {
            System.out.println(o1 + " " + o2);
            System.out.println(num2);
            return Integer.compare(o1, o2);
        });
        System.out.println(num2);

    }
    }

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee1 implements Comparable<Employee1> {
    String name;
    int salary;

    Employee1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee1 o) {
        return Integer.compare(this.salary, o.salary);
    }
    public String toString() {
        return "Employee1{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
    public class Basic {
        public static void main(String[] args) {
            List<Employee1> employees = Arrays.asList(
                    new Employee1("Alice", 50000),
                    new Employee1("Bob", 60000),
                    new Employee1("Charlie", 45000)
            );
            Collections.sort(employees); // Uses compareTo()
            System.out.println(employees);
        }
    }

class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        //super(); // Calls Parent() constructor
        System.out.println("Child class constructor");
    }
}

public class Basic {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}

class Basic1 {
    public int i; public int z = 10;

    public String Display(){
        return "Hello";
    }
}
class Basic2 extends Basic1 {
    int k;int j;
    Basic2(int k) {
        super.Display();
        super.z = k;
        this.k = k;
    }
    void print(){
        super.Display();
    }
}
public class Basic {
    public static void main(String[] args) {
        Basic2 b2 = new Basic2(5);

    }
}

class Grandparent {
    Grandparent() {
        System.out.println("Grandparent Constructor");
    }

    void show() {
        System.out.println("Grandparent Show Method");
    }
}

class Parent extends Grandparent {
    Parent() {
        super();  // Calls Grandparent's constructor
        System.out.println("Parent Constructor");
    }

    void show() {
        super.show(); // Calls Grandparent's show() method
        System.out.println("Parent Show Method");
    }
}

class Child extends Parent {
    Child() {
        super();  // Calls Parent's constructor
        System.out.println("Child Constructor");
    }

    void show() {
        super.show(); // Calls Parent's show() method
        System.out.println("Child Show Method");
    }
}

public class Basic {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}

class Product {
    static String name;
    static int price;

    public Product() {
        this("Smith", 55);
        System.out.println("No Parameters");
    }

    //    }
//    public Product(String name){
//        this.name = name;
//        System.out.println("One parameter");
//    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("Two parameters");
    }

    static void Display() {
        System.out.println(name + " " + price);
    }
}
public class Basic {
    public static void main(String[] args) {
        //Product p1 = new Product();
        //Product.Display();
        //p1.Display();
        Product p2 = new Product();
        p2.Display();
//        Product p3 = new Product("John", 50);
//        p3.Display();
    }
}



class Example{
    int a;
    Example(){
        this(6);
        System.out.println("No Parameters");
    }
    Example(int a){
        this.a = a;
        System.out.println("One Parameter "+a);
    }
}
public class Basic {
    public static void main(String[] args) {
        Example ex = new Example();
    }
}

class Example {
    int a, b;
    Example() {
        this(2,4);// ❌ Infinite loop (Recursive constructor call)
        System.out.println("Example");
    }
    Example(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Example {
    Example() {
        this();  // Constructor calling itself
    }
}

public class Basic {
    public static void main(String[] args) {
        Example obj = new Example(); // Creates an object -> Calls constructor
    }
}

class Addition1 {
    int a;int b;
    Addition1() {
        this(5,5);
        System.out.println("No Param");
    }
    public Addition1(int a, int b) {
        this.a =a;
        this.b =b;
        System.out.println(add(55,45));
    }
    public boolean add(int a, int b) {
        System.out.println("Addition is " +(a + b));
        return false;
    }
}
class Addition2 extends Addition1 {
    public Addition2(){
        super();
    }
    public void subtract(int a, int b, int c) {
        System.out.println("Subtraction is " +(a - b - c));
    }
}
public class Basic {
    public static void main(String[] args) {
        Addition2 a1 = new Addition2();
        //a1.add(1,2);
        a1.subtract(2,3, 5);
        Addition1 a2 = new Addition1();
        a2.add(5,8);
    }
}

class Parent {
    void show() {
        System.out.println("Parent show method");
    }
    void show2() {
        System.out.println("Parent show method2");
    }
}

class Child extends Parent {
    void show() {
        super.show();  // Calls parent class method
        System.out.println("Child show method");
    }
    void show2() {
        super.show2();
        System.out.println("Child show method2");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.show2();
    }
}

class Parent {
    Parent(int x) {  // No default constructor
        System.out.println("Parent Constructor: " + x);
    }
}

class Child extends Parent {
    int a;int b;
    Child(int a, int b) {
        super(6);
        this.a = a;
        this.b = b;

        // Java tries to insert super() here, but Parent has no default constructor.
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child obj = new Child(4,4); // ERROR
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}
public class Basic {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

class MyRunnable implements Runnable{
    public void run() {
        System.out.println("Hello World  " + Thread.currentThread().getName());
    }
}
public class Basic{
    public static void main(String[] args) {
        Thread my = new Thread(new MyRunnable());
        my.run();
        my.start();
    }
}
import java.util.concurrent.*;

class MyCallable implements Callable<String> {
    public String call() throws Exception {
        return "Hello from Callable!";
    }
}
public class Basic {
    public static void main(String[] args) throws Exception {
        MyCallable callable = new MyCallable();
        System.out.println(callable.call());
        //ExecutorService executor = Executors.newSingleThreadExecutor();
        //Future<String> future = executor.submit(new MyCallable());

        //System.out.println(future.get()); // Retrieves result from thread
        //executor.shutdown();
    }
}
class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Basic {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::printNumbers);
        Thread t2 = new Thread(resource::printNumbers);

        t1.start();
        t2.start();
    }
}
class SharedBlock {
    void printNumbers() {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        }
    }
}
public class Basic {
    public static void main(String[] args) {
        SharedBlock sharedBlock = new SharedBlock();
        sharedBlock.printNumbers();
    }
}

import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final ReentrantLock lock = new ReentrantLock();

    void printNumbers() {
        lock.lock();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        } finally {
            lock.unlock();
        }
    }
}

    public class Basic {
        public static void main(String[] args) {
            SharedResource sharedResource = new SharedResource();
            sharedResource.printNumbers();

            Thread t1 = new Thread(sharedResource::printNumbers, "Thread-1");
            Thread t2 = new Thread(sharedResource::printNumbers, "Thread-2");

            t1.start();
            t2.start();
        }
    }

class MyThread extends Thread {
    public void run() {
        System.out.println("This is a Thread : " +Thread.currentThread().getName());
    }
}
public class Basic {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 0; i < 10; i++) {
            MyThread t2 = new MyThread();
            t2.start();
            Thread.sleep(1000);

        }
    }
}

import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final ReentrantLock lock = new ReentrantLock(true);

    public void printNumbers(){
        lock.lock();
        try{
            for(int i = 0; i<10; i++){
                System.out.println("This is my Thread " + Thread.currentThread().getName()+ " --" + i);
            }
        }
        finally{
            lock.unlock();
        }
    }
}
public class Basic {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(sharedResource::printNumbers);
        Thread t2 = new Thread(sharedResource::printNumbers);
        Thread t3 = new Thread(sharedResource::printNumbers);
        t1.start();
        t3.start();
        t2.start();



    }
}
class Student{
    static String name = "SchoolName";
    String StudentName;
    int age;

    public static void Display(Student std){
        System.out.println("age: " + std.age);
        System.out.println("Name: " + name);
    }
    public void Age(int age){
        System.out.println(name);
        System.out.println("Age: " + age);
    }
}
public class Basic{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Age(20);
        Student.Display(s1);

    }
}

//Create a generic class Pair that stores two values of any type.
//It should have the following methods:
//A constructor that accepts two values.
//Getter methods to retrieve the two values.
//A toString method that returns both values in a formatted string.

import java.util.ArrayList;
import java.util.List;

class Gen<T, U>{
    private  T a;
    private  U b;

//    private List<Integer> x;
//    x= new ArrayList<>;
    public Gen(T a, U b){
        this.a = a;
        this.b = b;
    }
    public T getA(){
        System.out.println("GetA" + a);
        return a;
    }
    public U getB(){
        System.out.println("GetB" +b);
        return b;
    }
  public String toString(){
        return "A: " + a + " B: " + b;
    }

//    public List<Integer> getX() {
//        return x;
//    }
//
//    public void setX(List<Integer> x) {
//        this.x = x;
//    }
}

public class Basic{
    public static void main(String[] args) {
        Gen<Integer, String> t = new Gen<>(1,"one");
        System.out.println(t);

        Gen<String, String> t1 = new Gen<>("Hello","two");
        System.out.println(t1);
    }
}

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        ListIterator<String> itr = names.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //System.out.println("Backward Traversal:");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));

        Spliterator<String> spliterator = names.spliterator();
        System.out.println(spliterator.estimateSize());

        spliterator.forEachRemaining(System.out::print);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ExofArraylist<E>{

    private List<E> list = new ArrayList<>();

    public void add(E e){
        list.add(e);
    }
    public String toString(){
        return list.toString();

    }
}
public class Basic{
    public static void main(String[] args){
        ExofArraylist<String> list = new ExofArraylist<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        ExofArraylist<Integer> list2 = new ExofArraylist<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.size();
        System.out.println(list3);

    }
}*/

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 4, 6, 6, 7, 8, 8,8, 10));
        System.out.println(list);

        HashSet<Integer> set = new HashSet<>(Arrays.asList(3,4));
        System.out.println(set);

        List<String> list2 = Arrays.asList("A", "B","B", "C", "D","M", "E", "F");
        //list2.set(2,"Y");
        System.out.println(list2);

        System.out.println(list2.get(2));

        Set<String> list1 = new HashSet<>(Arrays.asList("kate", "John", "John","john"));
        System.out.println(list1);

        HashSet<String> str = new HashSet<>();
        str.add("A");
        str.add("B");
        str.add("C");

        for(String s : str){
            System.out.println(s);
        }
    }
}



















