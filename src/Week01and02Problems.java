import java.util.*;

public class Week01and02Problems {
    static String[] spots = new String[10];

    public static void main(String[] args){

        parkVehicle("ABC123");
        parkVehicle("ABC124");
        exitVehicle("ABC123");
    }

    static void parkVehicle(String plate){

        int index = Math.abs(plate.hashCode()) % spots.length;

        while(spots[index]!=null)
            index = (index+1)%spots.length;

        spots[index] = plate;

        System.out.println("Vehicle "+plate+" parked at "+index);
    }

    static void exitVehicle(String plate){

        for(int i=0;i<spots.length;i++){

            if(plate.equals(spots[i])){
                spots[i]=null;
                System.out.println("Vehicle exited spot "+i);
                return;
            }
        }
    }
}
