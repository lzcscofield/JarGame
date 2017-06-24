public class GuessingGame {
    public static void main(String[] args) {
       Prompter jar = new Prompter();
        System.out.println("------------Guess Jar Game------------");
        jar.printName();
        jar.RandomGem();
        System.out.println("------------Let's Play----------------");
        jar.Guess();
        jar.Compare();
    }
}
