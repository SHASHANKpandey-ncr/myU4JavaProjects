package Q1;
// use of var-args:(Variable Argument):

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public static void searchOutdatedModel(String company,String... models) {
		
				Mobile mobile=new Mobile();
				
		for(String i:models) {
			for(String j:mobile.outdatedModels) {
				if(i==j) {
					System.out.println(i+"_OUTDATED");
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		searchOutdatedModel("Samsung","note4","note15","note6","note20");
	}

}

/*
1.--if we want to declare any other parmerter along with var-args then in this case 
var-args should be at last.

2. two var-args in a single method parameter is not possible.

3.if multiple overloaded methods are there then var-args gets the least priority.

4.along with var-args we can not define another method which takes array of same type as parameter.
it will become duplicate method defination.
*/
