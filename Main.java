import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void checkList(List<Person> arr){
        for (Person person : arr) {
            person.checkValues();
        }
    }

    public static List<List<Float>> distance(List<Person> electors, List<Person>candidates){
        /*
         * comparing the difference of the candidates and electors
         */

        List<List<Float>> distSetList = new ArrayList<>();

        for (Person elector : electors){
            List<Float> distSet = new ArrayList<>();
            for (Person candidate : candidates){
                /*
                *  1. Calculation the difference
                *  2. Calculating the distance ot of the values of the vector
                */
                float diffSqareSum = 0f;

                for (int i = 0; i < elector.opinions.size(); i++){
                    float opinionDiff = elector.opinions.get(i) - candidate.opinions.get(i);
                    diffSqareSum = diffSqareSum + opinionDiff * opinionDiff;
                }

                float dist = (float) Math.sqrt(diffSqareSum);
                distSet.add(dist);
            }
            distSetList.add(distSet);
        }
        return distSetList;
    }

    public static float max(List<Float> arr){
        return arr.stream().sorted(Comparator.reverseOrder()).toList().get(0);
    }


    public static void main(String[] args) {
        List<Person> candidateList = new ArrayList<>();

        // hardcoded candidates
        // number of opinions of the candidate and the electors have to be the same!
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

        List<List<Float>> distSetList = distance(electorList, candidateList);
        // set of the distances between elector and ever candidate
    }
}