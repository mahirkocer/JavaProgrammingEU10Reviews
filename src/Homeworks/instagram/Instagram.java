package Homeworks.instagram;

public class Instagram extends MobileApp {
    public Instagram(String version) {
        super("Instagram", version);
    }
    public void postPhoto(){
        System.out.println(name +" is posting photos");
    }

}
/*

        Create the following sub classes of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
 */