import java.util.Random;

class Elector extends Person{
    public Elector(int id, int numOpinions){
        Random random = new Random();
        for (int i = 0; i < numOpinions; i++){
               opinions.add(random.nextFloat());
        }
        num = id;
    }
}
