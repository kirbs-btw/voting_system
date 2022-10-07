import java.util.*;

public class Main {

    public static void checkList(List<Person> arr){
        for (Person person : arr) {
            person.checkValues();
        }
    }

    public static void compare(List<Person> electors, List<Person>candidates){
        for (Person elector : electors){
            for (Person candidate : candidates){
                float a = elector.opinionA - candidate.opinionA;
                float b = elector.opinionB - candidate.opinionB;

                float len = (float) Math.sqrt(a*a+b*b);

                System.out.println(elector.num + " " + candidate.num);
                System.out.println(a + " " + b);
                System.out.println(len + "\n");

            }
            // find the biggest one of the 3 values
            // return the choice of the elector
        }
    }


    public static void main(String[] args) {
        List<Person> candidateList = new ArrayList<>();

        // hardcoded candidates
        Candidate PersonA = new Candidate(0.1f, -0.7f, 0);
        Candidate PersonB = new Candidate(-0.8f, 0.1f, 1);
        Candidate PersonC = new Candidate(0.2f, -0.1f, 2);

        candidateList.add(PersonA);
        candidateList.add(PersonB);
        candidateList.add(PersonC);

        List<Person> electorList = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            Elector person = new Elector(i);
            electorList.add(person);
        }

        // checkList(candidateList);
        // checkList(electorList);

        compare(electorList, candidateList);

    }
}