public class App {
  public static void main(String[] args) {

    Animal buddy = new Animal();
    buddy.mAge = 12;
    buddy.mName = "Buddy";
    buddy.mSpecies = "Dog - Sheepdog";
    buddy.mQualities = new String[] {"sleepy", "old", "hairy"};

    Animal tomas = new Animal();
    tomas.mAge = 44;
    tomas.mName = "Tomas";
    tomas.mSpecies = "Parrot - African Grey";
    tomas.mQualities = new String[] {"loud", "friendly", "smart"};
    //
    Animal cloe = new Animal();
    cloe.mAge = 1;
    cloe.mName = "Cloe the Clawer";
    cloe.mSpecies = "Cat - Domestic Long Hair";
    cloe.mQualities = new String[] {"cute", "fluffy", "playful"};

    Animal[] allAnimals = {buddy, tomas, cloe};


    System.out.println("All animals available for adoption:");

    for ( Animal individualAnimal : allAnimals) {
      System.out.println("_______________");
      System.out.println(individualAnimal.mAge + " years old");
      System.out.println(individualAnimal.mName);
      System.out.println(individualAnimal.mSpecies);
       System.out.println(individualAnimal.mQualities[0]+ ", " + individualAnimal.mQualities[1]+ ", " + individualAnimal.mQualities[2]);
    };

  }


}