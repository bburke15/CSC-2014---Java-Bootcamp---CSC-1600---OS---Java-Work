
public class TitanicTester {

	public static void main(String[] args) {
		PassengerData titanic = new PassengerData();
        titanic.addPassenger (4, false, "male", false);
        titanic.addPassenger (3, false, "female", false);
        titanic.addPassenger (1, true, "male", true);
        titanic.addPassenger (2, false, "male", false);
        titanic.addPassenger (3, true, "female", true);
        System.out.println(titanic);

        titanic.addPassenger (3, true, "male", false);
        titanic.addPassenger (1, true, "female", false);
        titanic.addPassenger (3, false, "female", false);
        System.out.println(titanic);

	}

}
