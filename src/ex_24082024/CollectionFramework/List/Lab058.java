package ex_24082024.CollectionFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab058 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Darshan");
        Student s2 = new Student(3, "Bob");
        Student s3 = new Student(2, "Jack");
        Student s4 = new Student(4, "Tom");

        ArrayList a = new ArrayList();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);

        System.out.println(a);
        System.out.println("==============");
        //sort using comparable
//        Collections.sort(a);
//        System.out.println(a);
// Sort using Comaparator
        //Sort by id
        Collections.sort(a, new SortById());
        System.out.println(a);

        System.out.println("==============");

        //Sort by name
        Collections.sort(a, new SortByName());
        System.out.println(a);


        System.out.println("==============");
        //Sort by id in decending order
        Collections.sort(a, new SortByIdDecending());
        System.out.println(a);

    }


}

class SortById implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

class SortByIdDecending implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getId().compareTo(o1.getId());
    }
}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Student implements Comparable<Student> {
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';

//        return id + name;
    }

    //With Comparable, only one kind of sort can do. Either sort by number or name

//    @Override
//    public int compareTo(Student o) {
//        //Sort by id(Number)
//        return Integer.compare(this.id, o.id);
//    }

    @Override
    public int compareTo(Student o) {
        //Sort by name(first character)
        return CharSequence.compare(this.name, o.name);
    }


}
