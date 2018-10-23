public class CarApp {
	public static void main(String arg[]){
		ArrayList<Car> carList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Motors admin Console!");
		System.out.print("How many Cars are you entering : ");
		int num = input.nextInt();
		
		for(int i=0; i<num; i++){
			Car car = new Car();
			System.out.print("Enter Car # "+(i+1)+" Make : ");
			String make = input.next();
			System.out.print("Enter Car # "+(i+1)+" Model : ");
			String model = input.next();
			System.out.print("Enter Car # "+(i+1)+" Year : ");
			int year = input.nextInt();
			System.out.print("Enter Car # "+(i+1)+" Price : ");
			double price = input.nextDouble();
			
			car.setMake(make);
			car.setModel(model);
			car.setYear(year);
			car.setPrice(price);
			
			carList.add(car);
			System.out.println();
		}
		
		
		System.out.println("Car Inventory");
		
		for(Car car:carList){
			System.out.println(car.toString());
		}
	}
}
