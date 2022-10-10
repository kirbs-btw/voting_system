import java.util.*;

public class Main {

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

    public static float min(List<Float> arr){
        int small = 0;
        for (int i = 1; i < arr.size(); i++){
            if (arr.get(i) < arr.get(small)) small = i;
        }
        return small;
    }

    public static List<Integer> choice(List<List<Float>> distSetList){
        List<Integer> choices = new ArrayList<>();

        for (List<Float> distSet : distSetList){
            choices.add((int) min(distSet));
        }

        return choices;
    }

    public static List<Integer> analyze(List<Integer> choices, int candidateCount){
        List<Integer> data = new ArrayList<>();

        for (int i = 0; i < candidateCount; i++){
            int count = 0;
            for (int choice : choices){
                if (i == choice){
                       count++;
                }
            }
            data.add(count);
        }
        return data;
    }

    public static void main(String[] args) {
        List<Person> candidateList = new ArrayList<>();

        // hardcoded candidates
        // number of opinions of the candidate and the electors have to be the same!
        Candidate PersonA = new Candidate(0, -1, -1);
        Candidate PersonB = new Candidate(1, 1, 1);
        Candidate PersonC = new Candidate(2, 0, 0);

        candidateList.add(PersonA);
        candidateList.add(PersonB);
        candidateList.add(PersonC);

        List<Person> electorList = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            Elector person = new Elector(i, 2;
            electorList.add(person);
        }

        List<List<Float>> distSetList = distance(electorList, candidateList);
        // set of the distances between elector and ever candidate
        List<Integer> choices = choice(distSetList);
        List<Integer> data = analyze(choices, candidateList.size());
        System.out.println(data);

    }
}