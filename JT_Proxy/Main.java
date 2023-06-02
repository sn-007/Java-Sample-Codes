// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        String hostname = "iith.ac.in";
        DNSSearcher dnssearch = new DNSSearcherCached();
        DNSRecord record_iith = new DNSRecord(hostname);
        dnssearch.lookup(record_iith); // the business logic of finding the IP address is not actually in the DNSSearcherCached class
        System.out.println(record_iith.getIP());
    }
}