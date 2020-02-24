import java.util.Random;

public class SortingCandidates {

    static class Candidate {
        String name;
        int iq;
        int number;

        @Override
        public String toString() {
            return name + ", " + "IQ = " + iq;
        }
    }

    public static void main(String[] args) {
        String[] Names = {"Andy", "Bob", "Matt", "Dave", "Leo", "Alex", "Roman"};
        Random random = new Random();
        int numberOfCandidates = 5; // Change it!
        Candidate[] candidates = new Candidate[numberOfCandidates];

        System.out.println("Candidates:");

        for (int i = 0; i < numberOfCandidates; i++) {
            int iq = random.nextInt(145);
            int randomNumberName = random.nextInt(numberOfCandidates);
            String name = Names[randomNumberName];
            Candidate candidate = new Candidate();
            candidate.name = name;
            candidate.iq = iq;
            candidates[i] = candidate;
            System.out.println(candidates[i]);
        }
        int transpositions = 0;
        int bubble = 0;
        for (int j = 1 + bubble; j < numberOfCandidates; j++) {
            for (int i = 1; i < numberOfCandidates; i++) {
                Candidate first = candidates[i - 1];
                Candidate second = candidates[i];
                if (first.iq < second.iq) {
                    candidates[i - 1] = second;
                    candidates[i] = first;
                    transpositions++;
                }
                bubble++;
            }

            if (transpositions == 0) {
                break;
            }
        }
        System.out.println("Candidate rating by IQ:");

        for (int i = 0; i < numberOfCandidates; i++) {
            System.out.println(i + 1 + "." + candidates[i]);
        }
    }
}