
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ListOfList{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		List<List<Integer>> matrix = new ArrayList<>();

		int rows = 0;
		int cols = 0;

		System.out.print("Enter the number of rows needed for the matrix: ");
		rows = input.nextInt();

		System.out.print("Enter the number of columns needed for the matrix: ");
		cols = input.nextInt();

		for (int i = 0; i < rows; i++) {
			List<Integer> column = new ArrayList<>();
			for (int j = 0; j < cols; j++) {
				column.add(ThreadLocalRandom.current().nextInt(10, 100));
			}
			matrix.add(column);
		}

		matrix.forEach(row -> {
			row.forEach(number -> {
				System.out.print(number + "  ");
			});
			System.out.println();
		});

		input.close();

	}

}