package dao;

public class DaoImpl implements Idao{
    @Override
    public double getData() {
        System.out.println("Version base de donnée.");
        double temp = Math.random()*40;
        return temp;
    }
}
