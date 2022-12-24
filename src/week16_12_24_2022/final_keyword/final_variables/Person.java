package week16_12_24_2022.final_keyword.final_variables;

public class Person {

    private String name;
   final private String birthDay;

    public Person(String name, String birthDay) {
       setName(name);
        this.birthDay = birthDay;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}

