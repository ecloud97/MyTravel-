public class AirTravel extends Travel  {
	Travel travel;
	private String airline;
	private String travelRefNumber;



	public AirTravel(String travelType, String country, String city, String travelDate, String returnDate, int days, String airline, String hotel, String travelRefNumber, double cost, int travelMileage ) {
		super(travelType, country, city, travelDate, returnDate, days, hotel, cost, travelMileage);
		this.airline = airline;
		this.travelRefNumber = travelRefNumber;
	}

	public String getAirline() {
		return airline;
	}

	public String getTravelRefNumber() {
		return travelRefNumber;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public void setTravelRefNumber(String travelRefNumber) {
		this.travelRefNumber = travelRefNumber;
	}

	public void print() {
		super.print();
		System.out.println("Airline: " + airline);
		System.out.print("TravelRefNumber: " + travelRefNumber);
		System.out.println("\n");

	}
}
