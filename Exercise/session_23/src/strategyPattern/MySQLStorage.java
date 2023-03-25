package strategyPattern;

public class MySQLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("Inset to SQL");
    }
}
