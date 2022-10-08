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
                for (int i = 0; i < elector.opinions.size(); i++){
                    float opinionDiff = elector.opinions.get(i) - candidate.opinions.get(i);
                    System.out.println(elector.num + " " + candidate.num + " Opinions: " + i + " : " + i);
                    System.out.println(opinionDiff);
                }
            }
        }
    }


    public static void main(String[] args) {
        List<Person> candidateList = new ArrayList<>();

        // hardcoded candidates
        Candidate PersonA = new Candidate(0, 0.1f, -0.7f);
        Candidate PersonB = new Candidate(1, -0.8f, 0.1f);
        Candidate PersonC = new Candidate(2, 0.2f, -0.1f);

        candidateList.add(PersonA);
        candidateList.add(PersonB);
        candidateList.add(PersonC);

        List<Person> electorList = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            Elector person = new Elector(i, 2);
            electorList.add(person);
        }

        //checkList(candidateList);
        //checkList(electorList);

        compare(electorList, candidateList);

    }
}