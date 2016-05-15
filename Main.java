import java.util.Arrays;

import java.util.Scanner;

public class Main {

	private static boolean[] visited;

	private static int[][] map;

	private static int mapSize;

	private static int maxSum = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tcNum = sc.nextInt();

		for (int i = 0; i < tcNum; i++) {

			read(sc);

			run(0, 0);

			System.out.println(maxSum);

		}

	}

	public static void read(Scanner sc) {

		mapSize = sc.nextInt();

		visited = new boolean[mapSize];

		map = new int[mapSize][mapSize];

		for (int i = 0; i < mapSize; i++) {

			for (int j = 0; j < mapSize; j++) {

				map[i][j] = sc.nextInt();

			}

		}

	}

	public static void run(int column, int sum) {

		if (column == mapSize) {

			maxSum = Math.max(maxSum, sum);

			//System.out.println("maxSum: " + maxSum);

			return;

		}

		for (int row = 0; row < mapSize; row++) {

			if (visited[row] != true) {

				System.out.println(row + ", " + column);

				visited[row] = true;

				run(column + 1, sum + map[row][column]);

				visited[row] = false;

			}

		}

	}

}
