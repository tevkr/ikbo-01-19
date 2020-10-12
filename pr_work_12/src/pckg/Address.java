package pckg;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, block, flat;
    public Address(String address) throws Exception
    {
        StringTokenizer st = new StringTokenizer(address, ",;.");
        if(st.countTokens() == 7) {
            country = st.nextToken();
            region = st.nextToken();
            city = st.nextToken();
            street = st.nextToken();
            house = st.nextToken();
            block = st.nextToken();
            flat = st.nextToken();
        } else throw new Exception("Error!");
    }

    @Override
    public String toString() {
        return country + ", "  + region + ", " + city + ", " + street + ", " + house + ", " + block + ", " + flat;
    }
}
