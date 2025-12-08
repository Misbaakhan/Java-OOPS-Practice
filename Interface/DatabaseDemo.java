
interface Database {

    void connect();

}

class MySQL implements Database {

    @Override
    public void connect() {
        System.out.println("connected to MySQL");
    }

}

class Oracle implements Database {

    @Override
    public void connect() {
        System.out.println("connected to Oracle");

    }

}

public class DatabaseDemo {

    public static void main(String[] args) {
        Database db1 = new MySQL();
        db1.connect();
        Database db2 = new Oracle();
        db2.connect();

    }

}
