package rock_papers_scissors;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GamePlay {

	private int gameCount;

	public static void main(String[] args) {
		GamePlay thisGame = new GamePlay();
		thisGame.playGame();
	}

	public String getRandomRockPaperScissors() {

		Random rand = new Random();
		int r = rand.nextInt(3);

		if (r == 0) {
			return "rock";
		} else if (r == 1) {
			return "paper";
		} else if (r == 2) {
			return "scissors";
		} else {
			System.out.println(r + "is this amount");
			return "Null";
		}
	}

	public String playGame() {

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\tom\\Desktop\\keeping_score.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				gameCount = Integer.parseInt(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileWriter myFileWriter = null;
		try {
			myFileWriter = new FileWriter("C:\\Users\\tom\\Desktop\\keeping_score.txt");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
		try {
			myBufferedWriter.write(Integer.toString(gameCount += 1));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			myBufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out
				.println("The game count is: " + gameCount + "\n\nNew Game! Please enter - rock, paper, or scissors!");

		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		String computerChoice = getRandomRockPaperScissors();

		if (userInput.equalsIgnoreCase(computerChoice)) {
			System.out.println("The computer has chosen " + computerChoice + ". The game is tied!");
			scanner.close();
			return "tie";
		} else if (userInput.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) {
			System.out.println("The computer has chosen " + computerChoice + ". You win, congratulations!");
			scanner.close();
			return "win";

		} else if (userInput.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("scissors")) {
			System.out.println("The computer has chosen " + computerChoice + ". You lose, sorry!");
			scanner.close();
			return "lose";
		} else if (userInput.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) {
			System.out.println("The computer has chosen " + computerChoice + ". You win, congratulations!");
			scanner.close();
			return "win";

		} else if (userInput.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("paper")) {
			System.out.println("The computer has chosen " + computerChoice + ". You lose, sorry!");
			scanner.close();
			return "lose";
		} else if (userInput.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) {
			System.out.println("The computer has chosen " + computerChoice + ". You win, congratulations!");
			scanner.close();
			return "win";

		} else if (userInput.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("rock")) {
			System.out.println("The computer has chosen " + computerChoice + ". You lose, sorry!");
			scanner.close();
			return "lose";
		} else {
			System.out.println("The computer has chosen " + computerChoice
					+ ". Enter rock, paper, or scissors, to play the game!");
			scanner.close();
			return "Null";
		}
	}
}