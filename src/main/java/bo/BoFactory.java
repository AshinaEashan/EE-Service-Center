package bo;

import bo.custom.impl.CustomerBoImpl;
import dao.util.BoTypes;

public class BoFactory {
    private static BoFactory boFactory;

    private BoFactory() {

    }
    private static BoFactory getInstance(){
        return boFactory != null ? boFactory : (boFactory = new BoFactory());
    }

    public static <T extends SuperBo>T getBo(BoTypes type){
        switch (type){
            case CUSTOMER:
                return (T) new CustomerBoImpl();
        }
        return  null;
    }
}
