public class Dog
{
    //id, name, age
    private int id;
	private String name; 
	private int age;
	
    public int getId(){ return id; }
	public String getName(){ return name;}
	public int getAge(){return age;}

	public Dog(int id, String name, int age)
	{
        this.id = id;
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "ID: " + id + " Name: " + name + " Age: " + age;
	}
}
