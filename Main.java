
import java.text.SimpleDateFormat;
import java.util.*;
    public class Main {

        public static void main(String[] args) {
            StudentArrayOperation studentOps = new StudentGroup(100);

            SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
            formatter.getCalendar().getTime();
            Date parsedDate = null;
            try {
                parsedDate = formatter.parse("16/09/2018");
            }catch(Exception e){

            }
            Student student = new Student(1,"Aishwarya Swetha",parsedDate,47);


            studentOps.add();
            studentOps.addFirst();
            studentOps.addLast();
            studentOps.bubbleSort();
            studentOps.getBetweenBirthDates();
            studentOps.getStudent();
            studentOps.getNearBirthDate();
            studentOps.getByBirthDate();
            studentOps.setStudents();
            studentOps.setStudent();




        }

    }




