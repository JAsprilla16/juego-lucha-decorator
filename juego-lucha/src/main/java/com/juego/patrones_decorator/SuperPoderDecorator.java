package com.juego.patrones_decorator;
import com.juego.model.ICombatiente;
import java.util.Random;

public class SuperPoderDecorator extends PersonajeDecorator {

    private int turno = 0;
    private boolean stunActivo = false;

    public SuperPoderDecorator(ICombatiente personaje) {
        super(personaje);
    }

    @Override
    public void atacar(ICombatiente oponente) {

        // Si está en stun, pierde turno
        if (stunActivo) {
            System.out.println(getNombre() + " está en stun y pierde el turno!");
            stunActivo = false;
            return;
        }

        turno++;

        // Activar poder en turno 3
        if (turno == 3) {
            activarPoder(oponente);
            turno = 0; // reinicia ciclo
        }

        personaje.atacar(oponente);
    }

    private void activarPoder(ICombatiente oponente) {
        Random rand = new Random();
        int tipo = rand.nextInt(3);

        switch (tipo) {
            case 0:
                // CURACIÓN
                int curacion = 20;
                System.out.println(getNombre() + " activa SUPER PODER: CURACIÓN +" + curacion);

                // hack: curar usando daño negativo
                personaje.recibirDano(-curacion);
                break;

            case 1:
                // DAÑO EXTRA
                int danoExtra = 20;
                System.out.println(getNombre() + " activa SUPER PODER: ATAQUE EXTRA " + danoExtra);
                oponente.recibirDano(danoExtra);
                break;

            case 2:
                // STUN
                System.out.println(getNombre() + " activa SUPER PODER: STUN!");

                if (oponente instanceof SuperPoderDecorator) {
                    ((SuperPoderDecorator) oponente).stunActivo = true;
                }
                break;
        }
    }
}