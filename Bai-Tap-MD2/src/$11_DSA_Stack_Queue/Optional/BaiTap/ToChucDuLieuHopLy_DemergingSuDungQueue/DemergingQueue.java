package $11_DSA_Stack_Queue.Optional.BaiTap.ToChucDuLieuHopLy_DemergingSuDungQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingQueue {

    private static final String MALE = "male";
    private static final String FEMALE = "female";

    public static void main(String[] args) {
        Queue<Person> femaleQueue = new LinkedList<>();
        Queue<Person> maleQueue = new LinkedList<>();

        ArrayList<Person> listStaff;
        listStaff = ListPerson.getPersonList();

        for (Person person : listStaff) {
            switch (person.getGender()) {
                case FEMALE:
                    femaleQueue.add(person);
                    break;
                case MALE:
                    maleQueue.add(person);
            }

        }


    }

}