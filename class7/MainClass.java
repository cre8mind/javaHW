import java.util.Arrays;


public class MainClass {

	public static void main(String[] args) {

		// initializing a 2 dimensional array. Notice that this array of arrays has elements of variable length	
		int [][] ints = {{1,2,3},{4,5,6,7,8},{9,10}};


		// here we are basically just putting in the same values we initialized the array ints to be, but
		// we are doing it programmatically, since in this case we know every element will be the previous element
		// + 1. Of course this will not always (or usually) be true for 2 dimensional arrays we work with

		int arrayVal = 1;
		for (int row= 0;row < ints.length;row++)
		{
			for (int col = 0;col < ints[row].length;col++) // for the inner loop our limit is ints[row].length
			{
				ints[row][col]= arrayVal;
				arrayVal++;

			}
		}

		// here we are assigning values to the 2 dimensional array by referencing the indexed elements and 
		// assigning them individual values
		/*ints[0][0] = 1;
		ints[0][1] = 2;
		ints[0][2] = 3;
		ints[0][3] = 4;
		ints[0][4] = 5;

		ints[1][0] = 6;
		ints[1][1] = 7;
		ints[1][2] = 8;
		ints[1][3] = 9;
		ints[1][4] = 10;

		ints[2][0] = 11;
		ints[2][1] = 12;
		ints[2][2] = 13;
		ints[2][3] = 14;
		ints[2][4] = 15;*/

		// nested loop to print out every element of the 2 dimensional array
		for (int row= 0;row < ints.length;row++)
		{
			for (int col = 0;col < ints[row].length;col++)
			{
				System.out.println(ints[row][col]);
			}
		}

		// example of an array of objects, in this case, our user defined Employee object 
		// (user defined meaning we wrote the class and it's not part of the java framework)

		Employee daveJones = new Employee();
		daveJones.name = "Dave Jones";
		daveJones.ssNumb = "1234568432";

		Employee joeDaves = new Employee();
		joeDaves.name = "Joe Daves";
		joeDaves.ssNumb = "452156732";

		Employee janeJoseph = new Employee();
		janeJoseph.name = "Jane Joseph";
		janeJoseph.ssNumb = "332431129";

		// initializing our array of objects with an initializer expression.
		Employee[] employees = {daveJones, joeDaves, janeJoseph, new Employee()};

		// employees[3] is an Employee object and therefore has a field called "name" which we can 
		// assign a value to.
		employees[3].name = "Jane Daves";

		// we can also assign any element in our array to an Employee object defined in our code
		employees[0] = daveJones;
		employees[1] = joeDaves;
		employees[2] = janeJoseph;

		Arrays.sort(employees); // we can use the sort() method of the class Arrays on our array of 
		// Employees because Employees implements the comparable interface
		// and is therefore sortable (more about this in a later class

		// enhanced for loop to print the name of each Employee object in our array
		for (Employee e:employees)
		{
			System.out.println(e.name);
		}


		// we pass arguments to methods by value not reference. 
		// for this reason, even though x gets changed in the method mMethod(), its value 
		// remains unchanged after returning from the method
		int x = 5;
		mMethod1(x);
		System.out.println("in calling method x = " + x);


		// the value of an object is its "memory address", so in effect you are passing in 
		// a pointer to the object itself. If you change a field in the object within a method, 
		// that change will persist when returning from the method.

		System.out.println("in calling method employees[0].name = " + employees[0].name);
		mMethod2(employees[0]);
		System.out.println("in calling method employees[0].name = " + employees[0].name);

	}

	public static void mMethod1(int x)
	{
		x+= 7;
		System.out.println("in method x = "+ x);

	}

	public static void mMethod2(Employee e)
	{
		e.name = "Joe Blow"; 
		System.out.println("in method e.name = "+ e.name);
	}
}
