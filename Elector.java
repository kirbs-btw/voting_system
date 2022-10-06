import java.util.Random;

class Elector extends Person{
    public Elector(int num){
        Random random = new Random();
        opinionA = random.nextFloat(-1, 1);
        opinionB = random.nextFloat(-1, 1);

        candidateNum = num;
    }
}
