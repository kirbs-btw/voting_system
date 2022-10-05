import java.util.Random;

public class Candidate{
    public float opinionA;
    public float opinionB;
    public int candidateNum;

    public Candidate(float a, float b, int num){
        //Random random = new Random();
        // opinionA = random.nextFloat(-1, 1);
        //opinionB = random.nextFloat(-1, 1);
        opinionA = a;
        opinionB = b;
        candidateNum = num;
    }

    public void checkValues(){
        System.out.println("Num: "+ candidateNum);
        System.out.println("opinionA: "+ opinionA);
        System.out.println("opinionB: "+ opinionB);
    }

    public static void main(String[] args) {
        Candidate a = new Candidate(0.1f, 0.2f, 4);

    }

}