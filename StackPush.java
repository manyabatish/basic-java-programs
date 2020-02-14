import java.util.*;
public class StackPush
{
public static void main(String arg[])
{
Stack<String> STACK= new Stack<String>();
STACK.push("Welcome");
STACK.push("to");
STACK.push("ambala");
System.out.println("Initial: "+ STACK);
STACK.push("City");
System.out.println("Final: "+ STACK);
}
}
