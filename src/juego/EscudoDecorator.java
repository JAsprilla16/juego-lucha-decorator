import java.util.Random;

public class EscudoDecorator extends PersonajeDecorator {

    private Random rand = new Random();
    private double probabilidad = 0.4; // 40%

    public EscudoDecorator(ICombatiente personaje) {
        super(personaje);
    }

    @Override
    public void recibirDano(int dano) {

        if (rand.nextDouble() < probabilidad) {
            int reducido = dano - 5;
            if (reducido < 0) reducido = 0;

            personaje.recibirDano(reducido);
            System.out.println(getNombre() + " activa escudo (-5 daño)");
        } else {
            personaje.recibirDano(dano);
            System.out.println(getNombre() + " no logró activar escudo");
        }
    }
}
