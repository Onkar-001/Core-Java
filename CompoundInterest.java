public class CompoundInterest {
	public static void main(String[] args) {
	float principle, rate, time, numberOfTimes;
	principle = Float.parseFloat(args[0]);
	rate = Float.parseFloat(args[1]);
	time = Float.parseFloat(args[2]);
	numberOfTimes = Float.parseFloat(args[3]);

	double CompoundInterest = principle * (1 + rate / 100);
	System.out.println("The Compound Interest is " + CompoundInterest);
	}
}