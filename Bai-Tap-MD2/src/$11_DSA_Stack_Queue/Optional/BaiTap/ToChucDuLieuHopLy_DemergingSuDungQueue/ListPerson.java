package $11_DSA_Stack_Queue.Optional.BaiTap.ToChucDuLieuHopLy_DemergingSuDungQueue;

import java.util.ArrayList;

public class ListPerson extends Person {

    static ArrayList<Person> listPerson = new ArrayList<>();

    public ListPerson() {
    }

    public static void setPersonList() {
        Person person1 = new Person("dung", "male", new int[]{17, 9, 1997});
        Person person2 = new Person("thuy", "female", new int[]{1, 1, 1988});
        Person person3 = new Person("tung", "male", new int[]{15, 3, 1995});
        Person person4 = new Person("adam", "male", new int[]{1, 3, 1994});
        Person person5 = new Person("eva", "female", new int[]{1, 7, 1996});

        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);
        listPerson.add(person4);
        listPerson.add(person5);
    }

    public static ArrayList<Person> getPersonList() {
        return listPerson;
    }

}