package harouane.u5w1weeklyproject.Suppliers;



import harouane.u5w1weeklyproject.Enums.WorkstationType;

import java.util.Random;
import java.util.function.Supplier;

public class Suppliers {
    static Random random = new Random();
    public static Supplier<WorkstationType> getWorkstationType = () -> {
        switch (random.nextInt(1, 3)+1) {
            case 1:
                return WorkstationType.OPENSPACE;
            case 2:
                return WorkstationType.PRIVATO;
            case 3:
                return WorkstationType.SALA_RIUNIONI;
        }
        return null;
    };

    public static int getRandomNumberFromMinToMax(int min, int max){
        return random.nextInt(min, max);
    }

}
