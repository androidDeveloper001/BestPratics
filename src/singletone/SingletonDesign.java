package singletone;

/**
 * Created by jitendra.kadu on 8/17/2015.
 */

//This is Singletone Design pattern
/*Des: define a class that has only one instance and provides a global point of access to it*/

public class SingletonDesign {

//    create a static Object of Singleton class
    private static SingletonDesign mSingletonDesign = null;

//    create a private constructor
    private SingletonDesign(){

    }

    public static SingletonDesign getInstance(){
        if(mSingletonDesign==null){
            return mSingletonDesign = new SingletonDesign();
        }
        return mSingletonDesign;
    }

    public int doSomethings(int number_one, int number_two){
        return number_one + number_two;
    }

}
