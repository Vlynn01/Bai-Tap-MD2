package $12_JavaCollectionFrameWork.ThucHanh.SapXepVoiComparableVaComparator;


import java.util.Comparator;

//Tạo lớp AgeComparator thực thi giao diện Comparator
public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
