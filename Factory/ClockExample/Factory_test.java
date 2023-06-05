public class Factory_test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        
        Calendar calendar = factory.getInstance();
        System.out.println(calendar.dayInfo());
            }
}