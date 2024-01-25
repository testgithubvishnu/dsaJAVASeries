package Stack;

import java.util.Stack;

public class infixExpression {
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";

        Stack<Integer> numbers= new Stack<>();
        Stack<Character> operator= new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int ascii=(int)ch;
            // '0'-> 48 and '9'->57
            if(ascii>=48 && ascii<=57) numbers.push(ascii-48);

            else if (operator.size()==0 || ch=='(' || operator.peek()=='(') operator.push(ch);

            else if(ch==')') {
                while (operator.peek()!='(')
                {
                    int v2=numbers.pop();
                    int v1=numbers.pop();

                    if(operator.peek()=='+') numbers.push(v1+v2);
                    if(operator.peek()=='-') numbers.push(v1-v2);
                    if(operator.peek()=='*') numbers.push(v1*v2);
                    if(operator.peek()=='/') numbers.push(v1/v2);

                    operator.pop();
                }
                operator.pop();
            }

            else {
                if(ch=='+' || ch=='-' )
                {
                  // work
                    int v2=numbers.pop();
                    int v1=numbers.pop();

                    if(operator.peek()=='+') numbers.push(v1+v2);
                    if(operator.peek()=='-') numbers.push(v1-v2);
                    if(operator.peek()=='*') numbers.push(v1*v2);
                    if(operator.peek()=='/') numbers.push(v1/v2);

                    operator.pop();
                    operator.push(ch);
                }

                if(ch=='*' || ch=='/')
                {
                    if(operator.peek()=='*' || operator.peek()=='/') {
                        int v2 = numbers.pop();
                        int v1 = numbers.pop();

                        if(operator.peek()=='*') numbers.push(v1*v2);
                        if(operator.peek()=='/') numbers.push(v1/v2);

                        operator.pop();
                        operator.push(ch);
                    }

                    else {
                        operator.push(ch);
                    }
                }
            }
        }
        while(numbers.size()>1)
        {
            int v2=numbers.pop();
            int v1=numbers.pop();

            if(operator.peek()=='+') numbers.push(v1+v2);
            if(operator.peek()=='-') numbers.push(v1-v2);
            if(operator.peek()=='*') numbers.push(v1*v2);
            if(operator.peek()=='/') numbers.push(v1/v2);

            operator.pop();
        }
        System.out.println(numbers.pop());

    }
}
