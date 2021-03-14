package main.com.application;
import java.util.stream.IntStream;

public class Application {
	protected Application() {}
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 105).mapToObj(i -> {
			if(i % 105 == 0) {
				return "Devhaus Learning Model";
			} else if(i % 21 == 0) {
				return "Devhaus Model";
			} else if(i % 15 == 0) {
				return "Devhaus Learning";
			} else if(i % 7 == 0) {
				return "Model";
			} else if(i % 5 == 0) {
				return "Learning";
			} else if(i % 3 == 0) {
				return "Devhaus";
			} else {
				return i;
			}
		}).forEach(System.out::println);
	}
}
