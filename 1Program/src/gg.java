class Uber{
	 static int u=2;
	 Uber(int x){
		 this();
		 u=u+2;
		
	 }
	 Uber(){
		 u++;
	 }
}

class Minor extends Uber{
	Minor(){
		super(u);
		u=u+3;
	}
	public static void main(String args[]) {
		new Minor();
		System.out.println(u);
	}
}
