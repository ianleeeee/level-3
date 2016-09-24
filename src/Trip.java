import java.util.ArrayList;

public class Trip {
	ArrayList <Flight> flights = new ArrayList<Flight>();
	public int getNumberOfFlights() {
		int numberOfFlights = flights.size();
		return numberOfFlights;
		
	}

	public void add(Flight f) {
		flights.add(f);
		
	}

	public void clear() {
		flights.clear();
		
	}

	public int getDuration() {
	if (flights.size()==0) {
			return 0;
		}
		else{
				
				Time arrive =flights.get(1).getArrivalTime();
				Time depart = flights.get(0).getDepartureTime();
				 int x = arrive.minutesUntil(depart);
				 return x;
			
			
		}
	}

	public int getShortestLayover() {
		if (flights.size()<2) {
			return -1;
			
				
			
		}
		else{
			Time arrive =flights.get(1).getArrivalTime();
			Time depart = flights.get(2).getDepartureTime();
			int z = arrive.minutesUntil(depart);
			return z;
		}
		
	}

}
