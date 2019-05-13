

import java.net.*;

public class Catalog {
    class HomePage {
        String owner;
        URL address;
        String category = "none";

        public HomePage(String inOwner, String inAddress) throws MalformedURLException{
            owner = inOwner;
            address = new URL (inAddress);
        }
        public HomePage(String inOwner, String inAddress, String inCategory) throws MalformedURLException{
            this(inOwner, inAddress);
            category = inCategory;
        }
    }
    public Catalog() {
        Catalog.HomePage[] catalog = new Catalog.HomePage[5];
        try {
            catalog[0] = new HomePage("Mikey Glyer", "http://www.file770.com", "science fiction");
            catalog[1] = new HomePage("Shelly Powers", "http://butningbird.net", "environment");
            catalog[2] = new HomePage("Rogers Cadenhead", "http://workbench.cadenhead.org", "programming");
            catalog[3] = new HomePage("Taegan Goddard", "https://politicalwire.com", "politics");
            catalog[4] = new HomePage("Manton Reese", "http://manton.org");

            for( int i = 0; i< catalog.length; i++){
                System.out.println(catalog[i].owner + ":" + catalog[i].address + "--" + catalog[i].category);
            }
        }catch (MalformedURLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Catalog();
    }
}
