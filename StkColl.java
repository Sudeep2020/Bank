import java.util.Stack;
class StkColl
{   
    static void push(Stack<Integer> st)
    {
        for(int i=0;i<4;i++)
        {
            st.push(i);
        }
    }
    static void pop(Stack<Integer> st)
    {
        System.out.println("popped:");
        for(int i=0;i<4;i++)
        {
            Integer y = (Integer) st.pop();
            System.out.println(y);
        }
    }
    public static void main (String[] args)
	{
    Stack<Integer> st = new Stack<Integer>();
    push(st);
    pop(st);
    push(st);
	}
}