class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for (String str : tokens){
            if (str.equals("+")){
                stack.add(stack.pop() + stack.pop());
            }
            else if (str.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b/a);
            }
            else if (str.equals("*")){
                stack.add(stack.pop() * stack.pop());
            }
            else if (str.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b - a);
            }
            else{
                stack.add(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}