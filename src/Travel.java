

public abstract class Travel {

	protected String country;
	protected String city;
	protected String travelDate;
	protected String returnDate;
	protected int days;
	protected String hotel;
	protected double cost;
	protected String travelType;
	protected int travelMileage;

	public Travel(String travelType, String country, String city, String travelDate, String returnDate, int days, String hotel, double cost, int travelMileage) {
		this.country = country;
		this.city = city;
		this.travelDate = travelDate;
		this.returnDate = returnDate;
		this.days = days;
		this.hotel = hotel;
		this.cost = cost;
		this.travelType = travelType;
		this.travelMileage = travelMileage;
	}


	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public int getDays() {
		return days;
	}

	public String getHotel() {
		return hotel;
	}

	public double getCost() {
		return cost;
	}

	public String getTravelType() {
		return travelType;
	}

	public int getTravelMileage() {
		return travelMileage;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}

	public void setTravelMileage(int travelMileage) {
		this.travelMileage = travelMileage;
	}

	public void print() {
		System.out.println("TravelType: " + travelType);
		System.out.println("Country: " + country);
		System.out.println("City: " + city);
		System.out.println("TravelDate: " + travelDate);
		System.out.println("ReturnDate: " + returnDate);
		System.out.println("Days: " + days);
		System.out.println("Hotel: " + hotel);
		System.out.println("Cost: " + cost);
		System.out.println("TravelMileage: " + travelMileage);


	}
}