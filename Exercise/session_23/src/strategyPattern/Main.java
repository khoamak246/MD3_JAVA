package strategyPattern;

public class Main {
    public static void main(String[] args) {
        XMLStorage xml = new XMLStorage();
        UserController userController = new UserController(xml);
        userController.store(new User("Khoa", "khoa.mak246", "123456"));

        MySQLStorage mySQLStorage = new MySQLStorage();
         userController = new UserController(mySQLStorage);
        userController.store(new User("Khoa", "khoa.mak246", "123456"));
    }
}
