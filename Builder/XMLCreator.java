// Define a class that uses the builder to create an XML document 
public class XMLCreator {
    public static String createXML() 
    {
        XMLBuilder builder = new XMLBuilder();

        builder.createDocument().startElement("html");
            builder.startElement("head");
                builder.startElement("title").text("Example HTML").endElement("title");
            builder.endElement("head");

            builder.startElement("body");
                builder.startElement("h1");
                    builder.attribute("style", "color:blue").text("Hello World!");
                builder.endElement("h1");

                builder.startElement("p");
                    builder.text("This is an example of using the Builder design pattern to create an XML document with HTML elements.");
                builder.endElement("p");
            builder.endElement("body");
        builder.endElement("html");



        String xml = builder.build();
        return xml;
    }
}

/*
String xml = builder.createDocument()
        .startElement("html")
        .startElement("head")
        .startElement("title")
        .text("Example HTML")
        .endElement("title")
        .endElement("head")
        .startElement("body")
        .startElement("h1")
        .attribute("style", "color:blue")
        .text("Hello World!")
        .endElement("h1")
        .startElement("p")
        .text("This is an example of using the Builder design pattern to create an XML document with HTML elements.")
        .endElement("p")
        .endElement("body")
        .endElement("html")
        .build();

*/
