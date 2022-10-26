/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Stack<String> stack = new Stack<>();
	    
	    String a[] = {"G", "G", "B", "R", "B"};
	   //String a[] = {"R", "R"};
	    
	    
	   // for(String i : a){
	   //     stack.push(i);
	   // }
	    
	   
	   
	   
	   
	    String smurf = a[0];
	    int idx = 1;
	    stack.push(smurf);
	    while(idx<a.length){
	        String cons = a[idx];
	        String flag = stack.peek();
	        if(flag!= cons){
	            stack.pop();
	            if(flag == "R"){
	                if(cons == "B"){
	                    smurf = "G";
	                    stack.push(smurf);
	                }
	                if(cons == "G"){
	                    smurf = "B";
	                    stack.push(smurf);
	                }
	            }
	            if(flag == "G"){
	               if(cons == "R"){
	                   smurf = "B";
	                   stack.push(smurf);
	               }
	               if(cons == "B"){
	                   smurf = "R";
	                   stack.push(smurf);
	               }
	            }
	            if(flag == "B"){
	                if(cons == "R"){
	                    smurf = "G";
	                    stack.push(smurf);
	                }
	                if(cons == "G"){
	                    smurf = "R";
	                    stack.push(smurf);
	                }
	            }
	        }
	        else{
	            // else push both the smurf and flag
	            stack.push(cons);
	           // stack.push(flag);
	        }
	        idx++;
	    }
	    
	    System.out.println(stack);
	}
}
