class Solution {
    public String reverseWords(String s) {
        Stack<String> wordStack = new Stack<String>();
        for (String str : s.trim().split(" ")){
            if (!str.isEmpty()) wordStack.push(str);
        }

        StringBuilder out = new StringBuilder();
        while (!wordStack.isEmpty()){
            out.append(wordStack.pop() + " ");
        }
        return out.toString().trim();
    }
}