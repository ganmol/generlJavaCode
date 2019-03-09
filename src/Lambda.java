

 class Lambda {
	 int x=2;
	 
	 public void m2(){
			int y=10;
			//Interface i = (o1, o2) ->{
				//x is instance var which can be used in lambda method and can be modified
				//y is local var to m2 method and used in lambda exp thus becomes final var and cannot be modified , not have been used then in that case it value can be modified .
				//y=4; will give CE as y is final since used in lambda function
				System.out.println(x);
				System.out.println(y);
	 }
		//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda lambda = new Lambda();
		lambda.m2();
		
	}

}
  