package readAndWriteObjectStudent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){

            ex.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args) {
        String PATH_FILE = "src/readAndWriteObjectStudent/student.txt";
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Trinh Duc Toan", "Ha Noi"));
        students.add(new Student(2, "Le Viet Dung", "Phu tho"));
        students.add(new Student(3,"Phung Trung Dung", "Da Nang"));
        students.add(new Student(4, "Nguyen Khanh Tung", "Ha Noi"));
        students.add(new Student(5, "Nguyen Dong Chinh", "Hai Duong"));
        writeToFile(PATH_FILE, students);
        List<Student> studentDataFromFile = readDataFromFile(PATH_FILE);
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
