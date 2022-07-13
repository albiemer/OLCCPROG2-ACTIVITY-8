
import java.util.Scanner;

public class Quiz{

	public static void opt(){

			System.out.println("[a]Arnist");
			System.out.println("[b]Jose Riza");
			System.out.println("[c]Bonifacio");
			System.out.println("[d]Billard");
			System.out.println("[e]Lapu-Lapu");
			System.out.println("[f]Sampaguita");
			System.out.println("[g]Villar Family");
			System.out.println("[h]Cong Tv");
			System.out.println("[i]Pacquiao");
			System.out.println("[j]Earth");
			System.out.println("[k]Mars");

	}

	public static int pts = 0;

	public static void main(String[] args){

		String[] quest = new String[11];

		Scanner input = new Scanner(System.in);

		quest[0] = "Null";
		quest[1] = "What is national sports? ";
		quest[2] = "who is national hero? ";
		quest[3] = "Who is the leader of Katipunan? ";
		quest[4] = "What is the sport of Efren bata? ";
		quest[5] = "who killed magellan? ";
		quest[6] = "what is national flower? ";
		quest[7] = "Who is the wealthiest family in the Philippines? ";
		quest[8] = "who is the most popular Vlogger? ";
		quest[9] = "Whos is the most popular professional boxer in the Philippines today? ";
		quest[10] = "What Planet are in the Goldilux Habitat? ";

		System.out.println("\033[H\033[2J");

		System.out.println("[1]"+ quest[1]);
		System.out.println("[2]"+ quest[2]);
		System.out.println("[3]"+ quest[3]);
		System.out.println("[4]"+ quest[4]);
		System.out.println("[5]"+ quest[5]);
		System.out.println("[6]"+ quest[6]);
		System.out.println("[7]"+ quest[7]);
		System.out.println("[8]"+ quest[8]);
		System.out.println("[9]"+ quest[9]);
		System.out.println("[10]"+ quest[10]);

		System.out.print("Choose Question to answer: ");
		int questopt = 1; //input.nextInt();


		if (quest[questopt] == quest[1]){

			String[] answer1= {"a", "A"};

			System.out.println("\033[H\033[2J");

			opt();

			System.out.println(quest[1]);
			String ansinput = input.next();

			if(ansinput.equals(answer1[0]) || ansinput.equals(answer1[1])){
				pts += 1;
				System.out.println("correct");

			}
			else{

				System.out.println("Wrong");

			}

		} // q1

		if (quest[questopt] == quest[1]){

			String[] answer1= {"b", "B"};

			System.out.println("\033[H\033[2J");

			opt();

			System.out.println(quest[2]);
			String ansinput = input.next();

			if(ansinput.equals(answer1[0]) || ansinput.equals(answer1[1])){
				pts += 1;
				System.out.println("Points: "+pts);
				System.out.println("correct");

			}
			else{

				System.out.println("Wrong");

			}

		} //q2

		if (quest[questopt] == quest[1]){

			String[] answer1= {"c", "C"};

			System.out.println("\033[H\033[2J");

			opt();

			System.out.println(quest[3]);
			String ansinput = input.next();

			if(ansinput.equals(answer1[0]) || ansinput.equals(answer1[1])){
				pts += 1;
				System.out.println("Points: "+pts);
				System.out.println("correct");

			}
			else{

				System.out.println("Wrong");

			}

		} //end q3


		if (quest[questopt] == quest[1]){

			String[] answer1= {"d", "D"};

			System.out.println("\033[H\033[2J");

			opt();

			System.out.println(quest[4]);
			String ansinput = input.next();

			if(ansinput.equals(answer1[0]) || ansinput.equals(answer1[1])){
				pts += 1;
				System.out.println("Points: "+pts);
				System.out.println("correct");

			}
			else{

				System.out.println("Wrong");

			}

		} //end q4


		if (quest[questopt] == quest[1]){

			String[] answer1= {"e", "E"};

			System.out.println("\033[H\033[2J");

			opt();

			System.out.println(quest[5]);
			String ansinput = input.next();

			if(ansinput.equals(answer1[0]) || ansinput.equals(answer1[1])){
				pts += 1;
				System.out.println("Points: "+pts);
				System.out.println("correct");

			}
			else{

				System.out.println("Wrong");

			}

		} //end q5

		if (quest[questopt] == quest[1]){

			String[] answer1= {"f", "F"};

			System.out.println("\033[H\033[2J");

			opt();

			System.out.println(quest[6]);
			String ansinput = input.next();

			if(ansinput.equals(answer1[0]) || ansinput.equals(answer1[1])){
				pts += 1;
				System.out.println("Points: "+pts);
				System.out.println("correct");

			}
			else{

				System.out.println("Wrong");

			}

		} //end q6


		if (quest[questopt] == quest[1]){

			String[] answer1= {"g", "G"};

			System.out.println("\033[H\033[2J");

			opt();

			System.out.println(quest[7]);
			String ansinput = input.next();

			if(ansinput.equals(answer1[0]) || ansinput.equals(answer1[1])){
				pts += 1;
				System.out.println("Points: "+pts);
				System.out.println("correct");

			}
			else{

				System.out.println("Wrong");

			}

		} //end q7


		if (quest[questopt] == quest[1]){

			String[] answer1= {"h", "H"};

			System.out.println("\033[H\033[2J");

			opt();

			System.out.println(quest[8]);
			String ansinput = input.next();

			if(ansinput.equals(answer1[0]) || ansinput.equals(answer1[1])){
				pts += 1;
				System.out.println("Points: "+pts);
				System.out.println("correct");

			}
			else{

				System.out.println("Wrong");

			}

		} //end q8


		if (quest[questopt] == quest[1]){

			String[] answer1= {"i", "I"};

			System.out.println("\033[H\033[2J");

			opt();

			System.out.println(quest[9]);
			String ansinput = input.next();

			if(ansinput.equals(answer1[0]) || ansinput.equals(answer1[1])){
				pts += 1;
				System.out.println("Points: "+pts);
				System.out.println("correct");

			}
			else{

				System.out.println("Wrong");

			}

		} //end q9


		if (quest[questopt] == quest[1]){

			String[] answer1= {"j", "J"};

			System.out.println("\033[H\033[2J");

			opt();

			System.out.println(quest[10]);
			String ansinput = input.next();

			if(ansinput.equals(answer1[0]) || ansinput.equals(answer1[1])){
				pts += 1;
				System.out.println("Points: "+pts);
				System.out.println("correct");

			}
			else{

				System.out.println("Wrong");

			}

		} //end q10


	} // end main

} //end class quiz
