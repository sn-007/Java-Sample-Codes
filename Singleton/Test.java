public class Test 
{
    public static void main(String[] args) 
    {
        ConfigurationManager manager1 = ConfigurationManager.getInstance();
        print("Data: " + manager1.getData());

        ConfigurationManager manager2 = ConfigurationManager.getInstance();
        print("Data: " + manger2.getData());

        System.out.println("Are randomData variables same? " + (manager1 == manager2));

        
    }
}