package Homeworks.instagram;

public class MobileApp {
    public String name;
    public String version;

    public MobileApp(String name, String version) {
        this.name = name;
        this.version = version;
    }
    public void useTheApp(int minutes){
        System.out.println(name+" is use app "+minutes);
    }
    public void download(){
        System.out.println(name+" is downloading");
    }

    @Override
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
/*
    Create a class called MobileApp

            instance variables:
                name, version

                add a constructor to set all the fields

            instance methods:
                useTheApp(int minutes), download()

        Create the following sub classes of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)

 */