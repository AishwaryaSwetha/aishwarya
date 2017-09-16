
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

    private Student[] students;

    /**
     * DO NOT remove or change this constructor, it will be used during task check
     * @param length
     */
    public StudentGroup(int length) {
        this.students = new Student[length];
    }

    @Override
    public Student[] getStudents() {
        return students;

    }

    @Override
    public void setStudents(Student[] students) throws IllegalArgumentException {
        if (students==null) {
            throw new IllegalArgumentException("array is empty");
        }
        // Add your implementation here
        this.students=students;
    }

    @Override
    public Student getStudent(int index) {
        // Add your implementation here
        return students[index];
    }

    @Override
    public void setStudent(Student student, int index) {
        // Add your implementation here
        this.students[index] = student;
    }

    @Override
    public void addFirst(Student student) {
        // Add your implementation here
        this.students[0] = student;
    }

    @Override
    public void addLast(Student student) {
        // Add your implementation here
        this.students[students.length + 1] = student;
    }

    @Override
    public void add(Student student, int index) {
        // Add your implementation here
        this.students[index]=student;
    }

    @Override
    public void remove(int index) {
        // Add your implementation here
        this.students[index]=null;
        (students.length())-1;
    }

    @Override
    public void remove(Student student) {
        // Add your implementation here
        for (int i : (students.length))
        {
            if(students[i]==student)
                students[i]=null;
                int t = students[i];
                students[i]=students[i++];
                students[i++]=t;

    }

    @Override
    public void removeFromIndex(int index) {
        // Add your implementation here
            for (int i=0;i<students.length;i++)
            {
                if(i>index)
                    students[index]=null;
            }



    }

    @Override
    public void removeFromElement(Student student) {
        // Add your implementation here
        for(int i=0;i<students.length;i++)
        {
            if(students[i]==student)
                student=null;
        }
    }

    @Override
    public void removeToIndex(int index) {
        // Add your implementation here
            for (int i=0;i<students.length;i++)
            {
                if(i<=index)
                    students[index]=null;
            }

    }

    @Override
    public void removeToElement(Student student) {
        // Add your implementation here
    }

    @Override
    public void bubbleSort(int[] arr) {
        // Add your implementation here
                    int n = arr.length;
                    int temp = 0;
                    for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                            if(arr[j-1] > arr[j]){
                                //swap elements
                                temp = arr[j-1];
                                arr[j-1] = arr[j];
                                arr[j] = temp;
                            }

                        }
                    }

                }

    @Override
    public Student[] getByBirthDate(Date date) {
        // Add your implementation here
            if(date == )
        return null;
    }

    @Override
    public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
        // Add your implementation here
        return null;
    }

    @Override
    public Student[] getNearBirthDate(Date date, int days) {
        // Add your implementation here
        return null;
    }

    @Override
    public int getCurrentAgeByDate(int indexOfStudent) {
        // Add your implementation here
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar dob = Calendar.getInstance();
            dob.setTime(sdf.parse(students(indexOfStudent)));
            Calendar today = Calendar.getInstance();
            int curYear = today.get(Calendar.YEAR);
            int dobYear = dob.get(Calendar.YEAR);
            int age = curYear - dobYear;
            return 0;
    }

    @Override
    public Student[] getStudentsByAge(int age) {
        // Add your implementation here
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar dob = Calendar.getInstance();
            dob.setTime(sdf.parse(students(indexOfStudent)));
            Calendar today = Calendar.getInstance();
            int curYear = today.get(Calendar.YEAR);
            int dobYear = dob.get(Calendar.YEAR);
            int age = curYear - dobYear;

        return null;
    }

    @Override
    public Student[] getStudentsWithMaxAvgMark() {
        // Add your implementation here
            for(int i=0;i<students.length;i++)
            {

            }
    }

    @Override
    public Student getNextStudent(Student student) {
        // Add your implementation here
            for(int i=0;i<students.length;i++)
                if(students[index]==student)
                {
                    return student[index++];
                }
        }

    }
