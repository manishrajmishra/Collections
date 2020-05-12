package ticketbookingSystem;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String args[]) {
		
		Threater threater = new Threater("PVR" , 8, 12);
		
		if(threater.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(threater.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(threater.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Threater.Seat> reverseSeats = new ArrayList<>(threater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);


        List<Threater.Seat> priceSeats = new ArrayList<>(threater.getSeats());
        priceSeats.add(threater.new Seat("B00", 13.00));
        priceSeats.add(threater.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Threater.PRICE_ORDER);
        printList(priceSeats);
    }


    public static void printList(List<Threater.Seat> list) {
        for(Threater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================================================================");
    }
//		List<Threater.Seat> seatCopy = new ArrayList<>(threater.seats);
//		printList(seatCopy);
		
//		seatCopy.get(1).reserve();
//		if(threater.reserveSeat("D12")) {
//			System.out.println("Please pay for D12");
//		}else {
//			System.out.println("Seat already reserved");
//		}
//		
//		if(threater.reserveSeat("K13")) {
//			System.out.println("Please pay for k13");
//		}else {
//			System.out.println("Seat already reserved");
//		}
//		
////		Collections.reverse(seatCopy);
//		Collections.shuffle(seatCopy);
//		System.out.println("Printing seatCopy");
//		printList(seatCopy);
//		System.out.println("Printing threater.seat");
//		printList(threater.seats);
//		
//		Threater.Seat minSeat = Collections.min(seatCopy);
//		Threater.Seat maxSeat = Collections.max(seatCopy);
//		System.out.println("Min seat number is " + minSeat.getSeatNumber());
//		System.out.println("Max seat Number is " + maxSeat.getSeatNumber());
//		
////		threater.getSeats();
////		if(threater.reserveSeat("F12")) {
////			System.out.println("Please pay");
////		}else {
////			System.out.println("Sorry, seat is taken");
////		}
////		if again we reserve the same seat
////		if(threater.reserveSeat("H11")) {
////			System.out.println("Please pay");
////		}else {
////			System.out.println("Sorry, seat is taken");
////		}
//		
//		sortList(seatCopy);
//		System.out.println("Printing sorted seatCopy");
//		printList(seatCopy);
//		
//		List<Threater.Seat> newList = new ArrayList<>(threater.seats.size());
//		Collections.copy(newList, threater.seats);
	
//	public static void printList(List<Threater.Seat> list) {
//		for(Threater.Seat seat : list) {
//			System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
//		}
//		System.out.println();
//		System.out.println("=================");
//	}
//	
//	public static void sortList(List<? extends Threater.Seat> list) {
//		for(int i=0;i<list.size(); i++) {
//			for(int j=i;j<list.size();j++) {
//				if(list.get(i).compareTo(list.get(i)) > 0) {
//					Collections.swap(list, i, j);
//				}
//			}
//		}
//	}	
	
}