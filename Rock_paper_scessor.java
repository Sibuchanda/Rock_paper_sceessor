
  import java.lang.Math;
  import java.util.Scanner;


  public class Rock_paper_scessor {

    public static void main(String[] args) {

      int cp = 0, pp = 0, min = 1, max = 3, p_choice, c_choice, n = 0;
//   cp stands for Computer point and pp stands for person point

      Scanner sc = new Scanner(System.in);

      while (n != 5) {

        c_choice = (int) (Math.random() * (max - min + 1) + min);;

        System.out.println("----------------------------------------------");
        System.out.println("Computer choosed");
        System.out.println("Your turn.........");

        System.out.println("\nEnter 1.Rock\nEnter 2. Paper\nEnter 3. Scessor");
        p_choice = sc.nextInt();

        switch (p_choice) {

          case 1: {
            if (c_choice == 1) {
              System.out.println("Draw.\nBoth choose Rock");
              System.out.println("Computer point:" + cp);
              System.out.println("Your point:" + pp);
            }
            else if (c_choice == 2) {
              System.out.println("Computer choose Paper\nComputer won");
              cp++;
              System.out.println("Computer point:" + cp);
              System.out.println("Your point:" + pp);
            }
            else if (c_choice == 3) {
              System.out.println("Computer choose Scessor\nYou Won");
              pp++;
              System.out.println("Computer point:" + cp);
              System.out.println("Your point:" + pp);

            }

          }
          break;

          case 2: {

            if (c_choice == 2) {
              System.out.println("Draw.\nBoth choose Paper");
              System.out.println("Computer point:" + cp);
              System.out.println("Your point:" + pp);
            } else if (c_choice == 1) {
              System.out.println("Computer choose Rock\nYou won");
              pp++;
              System.out.println("Computer point:" + cp);
              System.out.println("Your point:" + pp);
            } else if (c_choice == 3) {
              System.out.println("Computer choose Scessor\nComputer Won");
              cp++;
              System.out.println("Computer point:" + cp);
              System.out.println("Your point:" + pp);

            }
          }
          break;

          case 3: {
            if (c_choice == 3) {
              System.out.println("Draw.\nBoth choose Scessor");
              System.out.println("Computer point:" + cp);
              System.out.println("Your point:" + pp);
            } else if (c_choice == 1) {
              System.out.println("Computer choose Rock\nComputer won");
              cp++;
              System.out.println("Computer point:" + cp);
              System.out.println("Your point:" + pp);
            } else if (c_choice == 2) {
              System.out.println("Computer choose Paper\nYou Won");
              pp++;
              System.out.println("Computer point:" + cp);
              System.out.println("Your point:" + pp);
            }
          }
          break;

          default:
            System.out.println("Please choose a valid choice(Between 1, 2, 3 )");

        }


        n++;

      }

      System.out.println("----------------------------------------------");
      System.out.println("---------------------RESULT--------------------");
      System.out.println("----------------------------------------------");

      if (cp == pp) {
        System.out.println("Match Draw");
        System.out.println("Computer point:" + cp);
        System.out.println("Your point:" + pp);
      } else if (cp > pp) {
        System.out.println("OPPS!!\nComputer Won");
        System.out.println("Computer point:" + cp);
        System.out.println("Your point:" + pp);
        System.out.println("Better luck next time");
      } else {
        System.out.println("Congratulations.....\nYou won");
        System.out.println("Your point:" + pp);
        System.out.println("Computer point:" + cp);

      }

    }
}
