package creational.singleton;


/* this is a double check locking mechanism. This is best because the nul check happens at two levels

    1. checking without a lock
    2. checking with a lock

    we can ensure that the object is only created once.

 */

public class Database {
    private Database()
    {}

    public static Database instance;

    public static Database getInstance()
    {
        if(instance == null)
        {
            synchronized(instance)
            {
                if(instance == null)
                {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

}

class Runner
{
    public static void main(String[] args) {
        Database instance = Database.getInstance();
        System.out.println(instance.hashCode());

        Database instance2 = Database.getInstance();
        System.out.println(instance2.hashCode());

    }
}
