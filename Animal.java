public class Animal {
  public int mAge;
  public String mName;
  public String mSpecies;
  public String[] mQualities;
  public boolean mAdopted;

  public Animal(int age, String name, String species, String[] qualities, boolean adopted){
    mAge = age;
    mName = name;
    mSpecies = species;
    mQualities = qualities;
    mAdopted = adopted;
  }


  public boolean youngEnough(int maxAge)  {
    return (mAge < maxAge);
  }
  public boolean adoptAll( boolean mAdopted) {
    if (mAdopted == true) {
      return !mAdopted;
    } else {
      return mAdopted;
    }
  }
}
