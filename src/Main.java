
public class Main {

	public static void main(String[] args) {
		        //create a variable to hold the quantity of available plane seats left on a flight
		        int availablePlaneSeats = 10;
		        
				//create a variable to hold the cost of groceries at checkout
				double costAtCheckout = 22.56;
				
				//create a variable to hold a person's middle initial
				char middleIntial = 'N';
				
				//create a variable to hold true if it's hot outside and false if it's cold outside
				boolean isHotOutside = false;
				
				//create a variable to hold a customer's first name
				String firstName = "David";
				
				//create a variable to hold a street address
				String streetAddress = "9876 N 7th Drive"; 
				
				//print all variables to the console
				System.out.println(availablePlaneSeats);
				System.out.println(costAtCheckout);
				System.out.println(middleIntial);
				System.out.println(isHotOutside);
				System.out.println(firstName);
				System.out.println(streetAddress);
				
				
				//a customer booked 2 plane seats, remove 2 seats from the available seats variable
				availablePlaneSeats = availablePlaneSeats - 2;
				System.out.println(availablePlaneSeats);
				
				//impulse candy bar purchase, add 2.15 to the grocery total
				costAtCheckout = costAtCheckout + 2.15;	
				System.out.println(costAtCheckout);		
				
				//birth certificate was printed incorrectly, change the middle initial to something else
				middleIntial = 'C';
				System.out.println(middleIntial);
				//the season has changed, update the hot outside variable to be opposite of what it was
				//isHotOutside = true;
				isHotOutside =!isHotOutside;
				System.out.println(isHotOutside);
				
				//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
				String fullName = firstName + " "  + middleIntial + " Doe";
				
				//print a line to the console that introduces the customer and says they live at the address variable
                System.out.println("Hi, my name is " + fullName + " and I live at " + streetAddress);
	}

}
