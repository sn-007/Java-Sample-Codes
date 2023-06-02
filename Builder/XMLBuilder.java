// Define a concrete class that implements the builder interface 
public class XMLBuilder 
{ // Use a StringBuilder to store the XML document 
    private StringBuilder xml;

// Implement the constructor and the builder methods 
    public HTMLBuilder() { xml = new StringBuilder(); }

    public XMLBuilder createDocument() { xml.append(“<?xml version="1.0" encoding="UTF-8"?>\n”); return this; }

    public XMLBuilder createElement(String name) { xml.append(“<”).append(name).append(“>\n”); return this; }

    public XMLBuilder appendElement(String name) { xml.append(“</”).append(name).append(“>\n”); return this; }

    public XMLBuilder setAttribute(String name, String value) { xml.append(" “).append(name).append(”="“).append(value).append(”""); return this; }

    public XMLBuilder setText(String text) { xml.append(text); return this; }

    public String build() { return xml.toString(); } 
    
}

