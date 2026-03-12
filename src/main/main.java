// NumberProcessor.java - Main class
class NumberProcessor {
    private double[] numbers;
    private String name;

    // Constructor
    public NumberProcessor(String name, double[] nums) {
        this.name = name;
        this.numbers = nums;
    }

    // Method to calculate average
    public double calculateAverage() {
        if (numbers.length == 0) return 0.0;
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Method to find maximum
    public double findMax() {
        if (numbers.length == 0) return 0.0;
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Getter method (encapsulation)
    public String getName() {
        return name;
    }
}

// Main class to run the app
class Main {
    public static void main(String[] args) {
        double[] data1 = {10.5, 20.0, 15.75, 30.2};
        double[] data2 = {5.0, 8.9, 12.1};

        NumberProcessor proc1 = new NumberProcessor("Dataset A", data1);
        NumberProcessor proc2 = new NumberProcessor("Dataset B", data2);

        System.out.println(proc1.getName() + " Average: " + proc1.calculateAverage());
        System.out.println(proc1.getName() + " Max: " + proc1.findMax());
        System.out.println(proc2.getName() + " Average: " + proc2.calculateAverage());
        System.out.println(proc2.getName() + " Max: " + proc2.findMax());
    }
}
