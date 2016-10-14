
import java.util.*;
/**
 * Created by mM on 17-09-2016.
 */
public class Factory extends IAnimalFactory {

    public IAnimal GetObj(char val) throws Exception
    {
        switch (val) {
            case 'D':
                return new Duck();

            case 'L':
                return new Lion();
            default:
                throw new Exception("Animal type : " + val + " cannot be instantiated");
        }
    }

}


interface IAnimal
{
    void Speak();
}

class Duck implements IAnimal {

    @Override
    public void Speak() {
        System.out.println("Duck Whack");
    }
}

class Lion implements IAnimal{


    @Override
    public void Speak() {
        System.out.println("Lion roars");
    }
}

abstract class IAnimalFactory extends Exception
{
    public abstract IAnimal GetObj(char val) throws Exception;
}