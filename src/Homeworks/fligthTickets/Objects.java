package Homeworks.fligthTickets;

import java.util.ArrayList;
import java.util.Arrays;

public class Objects {
    public static void main(String[] args) {

        Fligths ticket1 = new Fligths("first", "Chicago", "Virgina");
        Fligths ticket2 = new Fligths("first", "Chicago", "Virgina");
        Fligths ticket3 = new Fligths("business", "Chicago", "Virgina");
        Fligths ticket4 = new Fligths("business", "Chicago", "Virgina");
        Fligths ticket5 = new Fligths("business", "Chicago", "Virgina");
        Fligths ticket6 = new Fligths("first", "Chicago", "Virgina");
        Fligths ticket7 = new Fligths("business", "Chicago", "Virgina");
        Fligths ticket8 = new Fligths("business", "Chicago", "Virgina");
        Fligths ticket9 = new Fligths("first", "Chicago", "Virgina");
        Fligths ticket10 = new Fligths("economy", "Chicago", "Virgina");

        Fligths[] tickets = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8, ticket9, ticket10};

        ArrayList<Fligths> list = new ArrayList<>(Arrays.asList(tickets));

        System.out.println(firstClass(list, "first"));

    }

    public static ArrayList<Fligths> firstClass(ArrayList<Fligths> list, String type) {
        ArrayList<Fligths> list1 = new ArrayList<>();

        for (Fligths ticket : list) {
            if (ticket.getType().equals(type))
                list1.add(ticket);
        }
        return list1;
    }
}
