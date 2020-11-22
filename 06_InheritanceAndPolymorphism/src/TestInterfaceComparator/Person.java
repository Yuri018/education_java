package TestInterfaceComparator;

import java.util.Comparator;

public class Person {
    private String name;
    private int age;

    public Person(String n, int a){
        name = n;
        age = a;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class PersonNameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class PersonAgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        //для изменения сортировки в обратном порядке надо поменять 1 и -1 местами
        if (o1.getAge() > o2.getAge()){
            return 1;
        } else if (o1.getAge() < o2.getAge()){
            return - 1;
        } else
        return 0;
    }
}

