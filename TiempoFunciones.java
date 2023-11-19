package org.example;

public class TiempoFunciones {

    public boolean esBisiesto(int a){
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0 && a % 100 == 0);
    }

    public int[] sumarTiempo(int[] hora, char unidad, int cant) {
        int horas = hora[0];
        int minutos = hora[1];
        int segundos = hora[2];

        switch (unidad) {
            case 'h':
                horas += cant;
                break;
            case 'm':
                minutos += cant;
                break;
            case 's':
                segundos += cant;
                break;
        }

        minutos += segundos / 60;
        segundos %= 60;

        horas += minutos / 60;
        minutos %= 60;

        return new int[]{horas, minutos, segundos};
    }
}
