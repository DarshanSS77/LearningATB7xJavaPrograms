package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ComparableAndComparator {


    public static void main(String[] args) {
        Car c1 = new Car("Toyoto", 2030);
        Car c2 = new Car("Tata", 2004);
        Car c3 = new Car("Honda", 2008);
        Car c4 = new Car("Mahendra", 2000);

        ArrayList l = new ArrayList();
        l.add(c1);
        l.add(c2);
        l.add(c3);
        l.add(c4);

        System.out.println(l);
        Collections.sort(l, new SortByYear());
        System.out.println(l);

    }
}


class SortByYear implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYear().compareTo(o2.getYear());
    }
}


class Car {
    private String name;
    private Integer year;


    public Car(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
