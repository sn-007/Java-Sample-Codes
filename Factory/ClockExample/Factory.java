public class Factory {
    //get type of calendar form loacal storage
    

    public Calendar getInstance() {

        Type type = localJRE.getTimeZone();

        if (type == Type.GREGORIAN) {
            return new GregorianCalendar();
        } 
        else if (type == Type.CHINESE) {
            return new ChineseCalendar();
        } 
        
        else if (type == Type.ISLAMIC) {
            return new IslamicCalendar();
        }   
    }
    
}

