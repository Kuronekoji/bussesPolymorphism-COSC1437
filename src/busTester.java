/**
 * This is Lab 10 Busses Polymorphism
 * @aurthor Scylla
 * @date 11/9/2022
 */

import java.util.ArrayList;

public class busTester 
{
    public static void main(String[] args)
    {
        ArrayList<Bus> objectList = new ArrayList<>();

        String[] daysInService = {"Friday", "Saturday", "Sunday", "Wednesday"};

        objectList.add(new Bus("Bus of All Busses", "2069"));

        objectList.add(new PartyBus("Vegas Strip Extravaganza 777", daysInService));

        objectList.add(new SchoolBus("Correctional Facility Transport Bus 56", 50));

        for (Bus bus : objectList)
        {
            System.out.println(bus);
            System.out.println("------------------------");
        }

    }
    
}
