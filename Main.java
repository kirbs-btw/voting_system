import java.util.*;

public class Main {

    public static void checkList(List<Person> arr){
        for (Person person : arr) {
            person.checkValues();
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

        checkList(candidateList);
        checkList(electorList);

    }
}