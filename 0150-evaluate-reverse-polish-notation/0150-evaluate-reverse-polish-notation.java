class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int a, b;
        for (String str : tokens){
            if (str.equals("+")){
                stack.add(stack.pop() + stack.pop());
            }
            else if (str.equals("/")){
                a = stack.pop();
                b = stack.pop();
                stack.add(b/a);
            }
            else if (str.equals("*")){
                stack.add(stack.pop() * stack.pop());
            }
            else if (str.equals("-")){
                a = stack.pop();
                b = stack.pop();
                stack.add(b - a);
            }
            else{
                stack.add(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}