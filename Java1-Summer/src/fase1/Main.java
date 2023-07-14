package fase1;

public class Main {
	public static void main (String[] args) {
		/*Pokemon pikachu = new Pokemon();
		
		pikachu.setNombre("Alberto");
		
		pikachu.setColor("Negro");
		pikachu.setNivel(666);
		pikachu.setTipo("Maricon");
		pikachu.setAtaque(100);
		pikachu.setDefensa(69);
		pikachu.setVida(1444);
		
		pikachu.getInfo(); */
	
		Car Volkswagen = new Car();
		Volkswagen.setMarca("Volkswagen");
		Volkswagen.setModelo("Golf");
		Volkswagen.setTanque(100);
		Volkswagen.setFuel(25);
		Volkswagen.setMaxspeed(299.5f);
		Volkswagen.refuel();
		Volkswagen.setSpeed("autopista");
		Volkswagen.conduccion('A');
		
		System.out.println();
		Car Seat = new Car();
				
		Seat.setMarca("Seat");
		Seat.setModelo("Leon");
		Seat.setTanque(75);
		Seat.setFuel(75);
		Seat.setMaxspeed(120.0f);
		Seat.refuel();
		Seat.setSpeed("autovia");
		Seat.conduccion('M');
		
		
		System.out.println();
		Car Audi = new Car();
				
		Seat.setMarca("Audi");
		Seat.setModelo("Q5");
		Seat.setTanque(199);
		Seat.setFuel(198);
		Seat.setMaxspeed(300.0f);
		Seat.refuel();
		Seat.setSpeed("poblado");
		Seat.conduccion('M');
		
		Car Hyundai = new Car("Hyunday","Hi5", 100.1,100.1f,true,new String[]{"M"}, 100);


	}
		
		
}
