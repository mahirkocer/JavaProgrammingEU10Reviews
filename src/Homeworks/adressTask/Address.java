package Homeworks.adressTask;

public class Address {
    private String street,city,state,country,zipCode;

    public Address(String street, String city, String state, String country, String zipCode) {
        setStreet(street);
        this.city = city;
        this.state = state;
        this.country = country;
        setZipCode(zipCode);
    }
    public Address(){

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.length()>50||street.isEmpty()){
            System.out.println("error");
        }else
            this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode.length()==5)
        this.zipCode = zipCode;
    }


    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
/*
AdressTask

    Create a class named Address

            Private variables:
                    street, city, state, zipCode,country

            encapsulate all the fields

            add a constructor that can set all the instances
                  overload constr with no arg constr

            - if the street name isEmpty or street length is bigger than 50
             otherwise
                 ERROR : Invalid Street

            - ZipCode length should be equal 5 otherwise
                 ERROR :Invalid ZipCode

            DO NOT duplicate any code fragments
 */