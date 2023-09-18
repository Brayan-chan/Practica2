public class ControladorAutomovil {
	public static void main(String[] args) {
		Automovil auto = new Automovil("Ford", "Fiesta");
		auto.encenderMotor();	
		auto.acelerar(50);
		//11 valor entero
		auto.frenar(5);

		//13 paso de argumentos
		auto.acelerar(50);
		

		//Paso por valor
		Automovil.verNumeroDeAutos();
		auto.duplicarVelocidad(auto.velocidad);
		System.out.println("El auto se mueve a " + auto.verVelocidad() + " km/h");
		auto.color = "Rojo";
		System.out.println("Mi auto es de color " + auto.color);
		//Paso por referencia
		Automovil.pintar(auto);
		System.out.println("El color de mi auto ahora es " + auto.color);

		Automovil.Estereo radio = new Automovil.Estereo(); 
		radio.reproducirCancion("Gus n' Roses - Nightrain");

		Automovil.Radiador radiador = auto.new Radiador();
		radiador.enfriar();

		}
}