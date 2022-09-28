package ext;

import dao.Idao;

public class DaoImpl2 implements Idao {
    @Override
    public double getData() {
        System.out.println("Version capteur.");
        double temp= 6000;
        return temp;
    }
}
