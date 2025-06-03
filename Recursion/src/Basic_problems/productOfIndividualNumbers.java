package Basic_problems;

public class productOfIndividualNumbers {

    public int productIndividual(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num % 10 * productIndividual(num / 10);
        }
    }
}
