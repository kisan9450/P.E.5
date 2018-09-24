import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private int age;

    Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getID(){
        return id;
    }

    public int getAge(){
        return age;
    }
}

class StudentSorter implements Comparator {
    public int compare(Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        if(s1.getAge() == s2.getAge()){
            int answer = s1.getName().compareTo(s2.getName());
            if(answer == 0){
                return s1.getID().compareTo(s2.getID());
            }
            return answer;
        }
        else if(s1.getAge() > s2.getAge())
            return 1;
        else
            return -1;
    }
}

class Maintest{
    public static void main(String[] args){
        List<Student> listofstudents = new ArrayList<>();
        listofstudents.add(new Student("1", "Arya", 18));
        listofstudents.add(new Student("2", "Jack", 22));
        listofstudents.add(new Student("3", "Jill", 36));
        listofstudents.add(new Student("4", "Bill", 31));
        listofstudents.add(new Student("5","Cane",22));
        Collections.sort(listofstudents, new StudentSorter());
        for(int i=0;i<listofstudents.size();i++){
            System.out.println(listofstudents.get(i).getID() + " "+ listofstudents.get(i).getName() + " " + listofstudents.get(i).getAge());
        }
    }
}
