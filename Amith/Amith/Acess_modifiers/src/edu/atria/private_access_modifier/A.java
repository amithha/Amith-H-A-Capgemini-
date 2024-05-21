package edu.atria.private_access_modifier;


	class A {
	    private void display()
	    {
	        System.out.println("Be aware of your own worth, use all of your power to achieve it");
	    }
	}
	 
	// Class B
	class B {
	    public static void main(String args[])
	    {
	        A obj = new A();
	        // Trying to access private method
	        // of another class
	        obj.display();
	    }
	}

}
