package staff;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedList<Staff> staffList = new LinkedList<>();
        Stack<Staff> NU = new Stack<>();
        LinkedList<Staff> newSortList = new LinkedList<>();
        for (int i = 1; i < 20; i++) {
            String dateOfBirth = i + "/" + 8 + "/" + "2000";
            boolean gender = new Random().nextBoolean();
            String name;
            if (gender)
                name = "NAM_";
            else
                name = "NU_";
            staffList.add(new Staff( name + i, gender, dateOfBirth));
        }
        for(Staff staff : staffList){
            if (!staff.isGender()){
                NU.add(staff);
            } else {
                newSortList.add(staff);
            }
        }

       while (!NU.isEmpty()){
           newSortList.addFirst(NU.pop());
       }
        for (Staff staff: newSortList) {
            System.out.println(staff);
        }
    }
}
