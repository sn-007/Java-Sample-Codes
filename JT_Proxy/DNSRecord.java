public class DNSRecord {
    String hostname;
    String IP;

    boolean IP_accurate = false;

    public DNSRecord(String _hostname)
    {
        this.hostname = _hostname;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String _IP){
        this.IP = _IP;
    }

    // No getter for IP since we plan to have it tied to the hostname

    public String getHostname()
    {
        return hostname;
    }

}
