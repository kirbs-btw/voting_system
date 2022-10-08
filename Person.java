import java.util.*;

public class Person{
    public List<Float> opinions = new ArrayList<>();
    public int num;

    public void checkValues(){
        /*
        System.out.println("Num: "+ candidateNum);
        System.out.println("opinionA: "+ opinionA);
        System.out.println("opinionB: "+ opinionB);
         */
        System.out.println(num);
        for (float opinion: opinions){
            System.out.println(opinion);

        }
    }
}