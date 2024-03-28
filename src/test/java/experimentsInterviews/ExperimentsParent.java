package experimentsInterviews;

import java.util.Random;

import org.openqa.selenium.devtools.v118.input.Input.DispatchDragEventType;

public class ExperimentsParent extends  parentClass {
	
	public void disp() {
		System.out.println("printing ffrom child class meth");
	}
	
	public ExperimentsParent() {
		System.out.println("default parent construuctor");
	}

public void meth1() {
		meth2();
		
		System.out.println("inside meth1");
	}
public void meth2() {
	
	System.out.println("inside meth2");
}

	
	public static void main(String[] args) {
		
//		ExperimentsParent e=new ExperimentsParent();
//		e.meth1();
			
		parentClass ob=new ExperimentsParent();
		ob.disp();
		
		String str="Original";
		String rev="";
		boolean st=true;
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(str+rev);
		System.out.println(str.length()+" "+rev.length());
		//rev="Original";
		if(str.length()!=rev.length()) {
			st=false;
		}
		for(int i=0;i<=str.length()-1;i++) {
				System.out.println("cecking   "
						+i+" "+(rev.length()-i-1)+" "+str.charAt(i)+" "+rev.charAt(rev.length()-i-1));
					if(str.charAt(i) != rev.charAt(rev.length()-i-1)) {
						
						st=false;
					}
			}
		
		System.out.println(st);
		
	}
	

}
