package array;

import java.util.ArrayList;
import java.util.List;

public class SnakeInMatrix {
	public int finalPositionOfSnake(int n, List<String> commands) {
		int i = 0, j = 0;
		int s = commands.size();
		int count = 0;
		while (count < s) {
			if (commands.get(count).equals("RIGHT")) {
				++j;
				++count;
				continue;
			}
			if (commands.get(count).equals("LEFT")) {
				--j;
				++count;
				continue;
			}
			if (commands.get(count).equals("DOWN")) {
				++i;
				++count;
				continue;
			}
			if (commands.get(count).equals("UP")) {
				--i;
				++count;
				continue;
			}
		}
		return (i * n) + j;
	}

	public static void main(String args[]) {
		int n = 4;
		List<String> commands = new ArrayList<>();
		commands.add("DOWN");
		commands.add("DOWN");
		commands.add("RIGHT");
		commands.add("UP");
		commands.add("LEFT");
		SnakeInMatrix obj = new SnakeInMatrix();
		int result = obj.finalPositionOfSnake(n, commands);
		System.out.print(result);
	}

}
