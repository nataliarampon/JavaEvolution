public interface Calculator {

    default int addNumbers(int a, int b) {
        if (validateNumber(a) && validateNumber(b)) {
            return a + b;
        }
        return 0;
    }

    private boolean validateNumber(int number) {
        return number > 0;
    }
    
}