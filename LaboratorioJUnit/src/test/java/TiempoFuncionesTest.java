import org.example.TiempoFunciones;
import org.junit.Test;
import static org.junit.Assert.*;

public class TiempoFuncionesTest {
    private final TiempoFunciones tiempo = new TiempoFunciones();

    @Test
    public void esBisiestoTest(){
          boolean esBisiesto = tiempo.esBisiesto(2000);
          assertTrue(esBisiesto);

    }
    @Test
    public void noEsBisiestoTest(){
        boolean esBisiesto = tiempo.esBisiesto(1900);
        assertFalse(esBisiesto);
    }

    @Test
    public void sumarTiempoMinutos(){
        int[] hora = {10,30,35};
        int[] horaFinal = tiempo.sumarTiempo(hora, 'm', 133 );
        assertArrayEquals(horaFinal,
                new int[] {12,43,35});

    }

    @Test
    public void sumarTiempoSegundos(){
        int[] hora = {10,30,35};
        int[] horaFinal = tiempo.sumarTiempo(hora, 's', 1000 );
        assertArrayEquals(horaFinal,
                new int[] {10,47,15});
    }
    @Test
    public void sumarTiempoHoras(){
        int[] hora = {10,30,35};
        int[] horaFinal = tiempo.sumarTiempo(hora, 'h', 3 );
        assertArrayEquals(horaFinal,
                new int[] {13,30,35});
    }

}
