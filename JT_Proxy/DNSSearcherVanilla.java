public class DNSSearcherVanilla implements DNSSearcher{
    @Override
    public DNSRecord lookup(DNSRecord record) {
        String found_IP = findIP(record.hostname);
        record.setIP(found_IP);
        return record;
    }
    //uncached version, suppose this is our normal version

    private String findIP(String hostname)
    {
        //logic for DNS lookup

        return "1.1.1.1";
    }

}
