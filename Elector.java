import java.util.Random;

class Elector extends Person{
    public Elector(int id){
        Random random = new Random();
        opinionA = random.nextFloat(-1, 1);
        opinionB = random.nextFloat(-1, 1);
        num = id;
    }
}
