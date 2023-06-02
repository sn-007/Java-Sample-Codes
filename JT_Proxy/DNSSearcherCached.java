import java.util.*;

//class implements the same interface as the vanilla DNS searcher, therefore it can be passed as a proxy object to driver code
public class DNSSearcherCached implements DNSSearcher{

    ArrayList<DNSRecord> cache = new ArrayList<DNSRecord>();
    @Override
    public DNSRecord lookup(DNSRecord record) {

        if(searchRecordInCache(record) != null)
        {
            return searchRecordInCache(record);
        }

        DNSSearcherVanilla dnssv = new DNSSearcherVanilla();
        DNSRecord found_record = dnssv.lookup(record);
        cache.add(found_record);
        return found_record;
    }

    private DNSRecord searchRecordInCache(DNSRecord record_to_search)
    {
        if(cache.size() < 1)
        {
            return null;
        }
        for(DNSRecord dr : cache)
        {
            //simple linear search through the cache, other searching algorithms can also be implemented here
            if(dr.getHostname().equals(record_to_search.getHostname()))
            {
                return dr;
            }
        }
        return null;
    }
}
