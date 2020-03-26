package cursojava;

import entities.Rooms;
import java.util.Scanner;

public class ProgramRooms {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Rooms[] vectRoom = new Rooms[10];
        
        System.out.print("How many rooms will be rented? ");
        int reserv = sc.nextInt();
        
        
        for(int i = 0; i < reserv; i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vectRoom[room] = new Rooms(name, email);
        }
        
        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i = 0; i < vectRoom.length; i++){
            if(vectRoom[i] != null){
                System.out.println(i + ": " + vectRoom[i]);
            }
        }
        
        sc.close();
    }
    
}
