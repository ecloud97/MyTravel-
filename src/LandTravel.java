public class LandTravel extends Travel {
	Travel travel;
	String carType;



	public LandTravel(String travelType, String country, String city, String travelDate, String returnDate, int days, String hotel, double cost, int travelMileage, String carType) {
		super(travelType, country, city, travelDate, returnDate, days, hotel, cost, travelMileage);
		this.carType = carType;
	}


	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void print() {
		super.print();
		System.out.println("CarType: " + carType);
		System.out.print("\n");
	}
}
