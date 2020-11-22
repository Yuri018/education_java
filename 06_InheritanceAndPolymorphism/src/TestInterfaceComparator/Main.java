package TestInterfaceComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Comparator<Person> personComparator = new PersonNameComparator().thenComparing(new PersonAgeComparator());
//        //если сортировать по имени (по алфавиту), то надо поменять местами компараторы
//        TreeSet<Person> people = new TreeSet<>(personComparator);


        //Вариант, когда не надо создавать отдельный метод и имплементировать интерфейс Comparator,
                                            // а создавать класс в скобках
//        TreeSet<Person> people = new TreeSet<>(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                if (o1.getAge() > o2.getAge()){
//                    return 1;
//                } else if (o1.getAge() < o2.getAge()){
//                    return - 1;
//                } else
//                    return 0;
//            }
//        });

        // вариант с использованием лямбда выражения
        TreeSet<Person> people = new TreeSet<>((o1, o2) -> {
            if (o1.getAge() > o2.getAge()){
                return 1;
            } else if (o1.getAge() < o2.getAge()){
                return - 1;
            } else
                return 0;
        });


        people.add(new Person("Tom", 23));
        people.add(new Person("Nick",34));
        people.add(new Person("Tom",10));
        people.add(new Person("Bill",14));

        for (Person person: people){
            System.out.println(person.getName() + " " + person.getAge());
        }

    }
}
