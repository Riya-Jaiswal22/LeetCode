class Solution {
    public boolean isOperator(char op){
        if(op=='+' || op=='-' || op=='*' || op=='/') return true;
        return false;
    }
    public int priority(char op){
        if(op=='+' || op=='-') return 1;
        else if(op=='*' || op=='/') return 2;
        else return 0;
    }
    public int eval(char op, int b, int a) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        if (op == '*') return a * b;
        if (op == '/') return a / b;
        return 0;
    }
    public char prevNonSpace(String s, int i) {
        i--;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        return (i >= 0 ? s.charAt(i) : '\0');
    }
    public int calculate(String s) {
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                i++;
                continue;
            }
            if(Character.isDigit(s.charAt(i))){
                String num = "";
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num += s.charAt(i);
                    i++;
                }
                operand.push(Integer.parseInt(num));
                continue;
            }else if(isOperator(s.charAt(i))){
                char prev = prevNonSpace(s, i);
                if (s.charAt(i) == '-' && (i == 0 || prev == '(')) {
                    operand.push(0);
                }
                while (!operator.isEmpty() && priority(operator.peek()) >= priority(s.charAt(i))) {
                    int b = operand.pop();
                    int a = operand.pop();
                    operand.push(eval(operator.pop(), b, a));
                }
                operator.push(s.charAt(i));
            }else if(s.charAt(i)=='('){
                operator.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                while(operator.peek()!='('){
                    int b = operand.pop();
                    int a = operand.pop();
                    operand.push(eval(operator.pop(), b, a));
                }
                operator.pop();
            }
            i++;
        }
        while(!operator.isEmpty()){
            int b = operand.pop();
            int a = operand.pop();
            operand.push(eval(operator.pop(), b, a));
        }
        return operand.pop();
    }
}