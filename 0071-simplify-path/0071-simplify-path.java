class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] p = path.split("/");
        
        for(int i = 0; i < p.length; i++){
            if(!stack.isEmpty()  && p[i].equals("..")) stack.pop();
            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")) stack.push(p[i]);
        }
        
        StringBuilder out = new StringBuilder();
        if(stack.isEmpty()) return "/";
        while(!stack.isEmpty()){
            out.insert(0, stack.pop()).insert(0,"/");
        }
        
        return out.toString();
    }
}