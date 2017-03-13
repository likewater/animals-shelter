public class Animal {
  public int mAge;
  public String mName;
  public String mSpecies;
  public String[] mQualities;


  public boolean isBiter(int maxAge)  {
    return (mAge < maxAge);
  }
}
