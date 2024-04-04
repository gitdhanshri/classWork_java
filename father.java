//Multiple inheritance using interfaces

interface Father {
	float HT = 6f ;
	void height(int a);
}

interface Mother {
	float HT = 5.8f ; 
	void height(int a);
}
class Child implements Father, Mother {
	public void height(int age) {
		//child got average height of its parents 
		System.out.println(Father. HT);
		System.out.println(Mother. HT);
		float ht =(Father. HT+ Mother.HT)/2;
		System.out.println("Child's height='"+ ht);
		System.out.println("Age is->"+age);
	}

}
class Multi {
	public static void main(String args[]) { 
		Child ch = new Child(); 
		ch.height(10);
	}
}
