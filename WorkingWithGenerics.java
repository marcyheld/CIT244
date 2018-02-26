
/**
 * This program uses the GenericStack Class.
 * 
 * @author Marcy Held
 * Date: 03-02-2016
 */
public class WorkingWithGenerics {

    public static void main(String[] args) {
        
        GenericStack <String> stack1 = new GenericStack();
        // prev. versions: GenericStack <String> stack1 = new GenericStack<String>();
        
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        System.out.println(stack1.peek()); // does not remove item from the stack
        
        System.out.println(stack1);
        // also, System.out.println(stack1.toString());
        
        GenericStack <Double> stack2 = new GenericStack();
        stack2.push(12.4); 
        // auto-boxing, 12.4 numeric constant double will automatically 
        // be converted to a Wrapper Class class-level Double
        stack2.push(17.4);
        stack2.push(11.9);
        System.out.println(stack2);
        
        stack2.pop();
        System.out.println(stack2); // "first in last out" FILO
        
    }
    
}
