class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<String>();
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));

        for (String directory : path.split("/")){
            if (directory.equals("..") && !stack.isEmpty()) stack.pop();
            else if (!skip.contains(directory)) stack.push(directory);
        }

        String out = "";

        for (String directory : stack) out = "/" + directory + out;
        return out.isEmpty() ? "/" : out;
    }
}