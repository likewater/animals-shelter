import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animal buddy = new Animal(12, "buddy", "Dog - Sheepdog", new String[] {"sleepy", "old", "hairy"}, true);

    Animal tomas = new Animal(44, "Tomas", "Parrot - African Grey", new String[] {"loud", "friendly", "smart"}, true);

    Animal cloe = new Animal(1, "Cloe the Clawer", "Cat - Domestic Long Hair", new String[] {"cute", "fluffy", "playful"}, true);

    Animal[] allAnimals = {buddy, tomas, cloe};
    System.out.println("What is the max age?");
    String stringDesiredMaxAge = myConsole.readLine();
    int desiredMaxAge = Integer.parseInt(stringDesiredMaxAge);


    System.out.println("These are all the animals that fit your age range");


    for ( Animal individualAnimal : allAnimals) {
      if (individualAnimal.youngEnough(desiredMaxAge)){
      System.out.println("_______________");
      System.out.println(individualAnimal.mName);
      System.out.println(individualAnimal.mAge + " years old");
      System.out.println(individualAnimal.mSpecies);
       System.out.println(individualAnimal.mQualities[0]+ ", " + individualAnimal.mQualities[1]+ ", " + individualAnimal.mQualities[2]);
       System.out.println("Available for Adoption: "+individualAnimal.mAdopted);
    };
  };
    System.out.println("Do you want to Adopt them all? enter true or false.");
    String stringAdoptAll = myConsole.readLine();
    boolean adoptAll = java.lang.Boolean.parseBoolean(stringAdoptAll);
    if (adoptAll == true) {

      for ( Animal individualAnimal : allAnimals) {
        individualAnimal.mAdopted = individualAnimal.adoptAll(individualAnimal.mAdopted);
        System.out.println("_______________");
        System.out.println("Thank you for adopting "+individualAnimal.mName);
        System.out.println(individualAnimal.mAge + " years old");
        System.out.println(individualAnimal.mSpecies);
         System.out.println(individualAnimal.mQualities[0]+ ", " + individualAnimal.mQualities[1]+ ", " + individualAnimal.mQualities[2]);
         System.out.println("Available for Adoption: "+individualAnimal.mAdopted);
    };

    }

  }



}
