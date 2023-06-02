// Define a concrete class that implements the builder interface 
public class XMLBuilder {
    private StringBuilder xml;

    public XMLBuilder() {
        xml = new StringBuilder();
    }

    public XMLBuilder createDocument() {
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        return this;
    }

    public XMLBuilder startElement(String name) {
        xml.append("<").append(name).append(">\n");
        return this;
    }

    public XMLBuilder endElement(String name) {
        xml.append("</").append(name).append(">\n");
        return this;
    }

    public XMLBuilder attribute(String name, String value) {
        xml.append(" ").append(name).append("=\"").append(value).append("\"");
        return this;
    }

    public XMLBuilder text(String text) {
        xml.append(text);
        return this;
    }

    public String build() {
        return xml.toString();
    }
}
