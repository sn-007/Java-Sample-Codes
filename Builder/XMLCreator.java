// Define a class that uses the builder to create an XML document 
public class XMLCreator
{ // Use a static method to create an example HTML document 
    public static String createHTML() 
    { // Create a builder object 
        XMLBuilder builder = new HTMLBuilder(); 
        // Use the builder methods to create and append different nodes and attributes 
        builder.createDocument() .createElement("html") 
                                 .createElement("head") 
                                 .createElement("title") 
                                 .setText("Example HTML") 
                                 .appendElement("title") 
                                 .appendElement("head") 
                                 .createElement("body") 
                                 .createElement("h1") 
                                 .setAttribute("style", "color:blue") 
                                 .setText("Hello World!") 
                                 .appendElement("h1") 
                                 .createElement("p") 
                                 .setText("This is an example of using the builder design pattern to create an XML document with HTML elements.") 
                                 .appendElement("p") 
                                 .appendElement("body") 
                                 .appendElement("html"); 
        // Return the final product
         return builder.build();          
    } 
         
}