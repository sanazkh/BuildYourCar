package Cars;
import Enums.Model;
public class CarFactory {

     public Car makePorche(Model model) {

               switch (model) {
                    case BOXTER718:
                         return new Boxter718();

                    case CARRERA911:
                         return new Carrera911();

                    case CARRERA911S:
                         return new Carrera911S();

                    case CAYENNEGTS:
                         return new CayenneGTS();

                    case CAYENNETURBO:
                         return new CayenneTurbo();

                    case CAYMAN718:
                         return new Cayman718();

                    case MACANGTS:
                         return new MacanGTS();

                    case MACANTURBO:
                         return new MacanTurbo();

                    case PANAMERA4:
                         return new Panamera4();

                    case PANAMERA4HYBRID:
                         return new Panamera4Hybrid();

                         default:
                         return null;


               }

          }
}