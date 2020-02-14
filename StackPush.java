import java.util.*;
public class StackPush
{
public static void main(String arg[])
{
Stack<String> STACK= new Stack<String>();
STACK.push("Welcome");
STACK.push("to");
STACK.push("Ambala");
System.out.println("Initial: "+ STACK);
 STACK.push("Thank");
   STACK.push("You");
System.out.println("Final: "+ STACK);
}
}
