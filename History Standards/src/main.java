import java.util.Scanner;

public class main {
	public static void main (String[] args){

		Scanner scanner = new Scanner(System.in);
		
		while (true) {

			System.out.print("Would you like to learn about the Civil War or Reconstruction? : ");
			String input = scanner.nextLine();
			//System.out.print(input);
			//System.out.print(input == "Civil War");
			if (input.toLowerCase().equals("civil war")){ 
				System.out.print("Would you like to learn about the causes, course, or consequences? : ");
				String civilSelect = scanner.nextLine();
						
					if (civilSelect.toLowerCase().equals("causes")){
						System.out.print("The cause of the Civil War was slavery.");
						
					}else if (civilSelect.toLowerCase().equals("course")){
						System.out.print("The Civil War started in April 1861 when the Confederacy attacked the US Fort Sumter and ended on April 9, 1865 when the Confederate army surrendered.");
					}else if (civilSelect.toLowerCase().equals("consequences")){
						System.out.print("The war ravaged many towns in the north and south and over 700,000 Americans lost their lives.");
			}else if (input.toLowerCase().equals("reconstruction")){
				String reconSelect = scanner.nextLine();
				
					if (reconSelect.toLowerCase().equals("causes")){
						System.out.print("Due to the destruction from the Civil War the country needed time to fix towns as well as relations between the divided country.");
					
					}else if (reconSelect.toLowerCase().equals("course")){
						System.out.print("Reconstruction lasted for almost 12 years after the Civil War as the C repaired broken infrastructure and society.");
					}else if (reconSelect.toLowerCase().equals("consequences")){
						System.out.print("Society rebuilt itself in many different ways. The constitution was amended to include the rights of African-Americans and other equality movements followed like suffrage.");
			
					}
				}
			}
		}
	}
}
