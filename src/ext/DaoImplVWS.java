package ext;

import dao.Idao;

public class DaoImplVWS implements Idao {
    @Override
    public double getData() {
        System.out.println("Version Web Service.");
        return 90;
    }
}
