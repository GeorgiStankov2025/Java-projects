public class Dog
{

    private String DogName;

    protected String DogBreed;

    private int DogAge;

    public Dog(String name, String breed, int age)
    {

        this.DogName=name;

        this.DogBreed=breed;

        this.DogAge=age;

    }

    public int GetDogAge()
    {

        return this.DogAge;

    }

    public void SetDogAge(int agevalue)
    {

        if(agevalue>0)
        {

            this.DogAge=agevalue;

        }

    }

    public void Laene()
    {

        System.out.println("Hello, my name is "+ this.DogName+".");

    }

    public void Info()
    {

        System.out.println("Name: "+ this.DogName+" Breed: "+ this.DogBreed+" Age: "+this.DogAge);

    }

}
