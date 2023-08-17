class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalFuel = 0;
        int fuel = 0;
        int res = 0;
        
        for(int i = 0; i < n; i++){
            totalFuel += gas[i] - cost[i];
            fuel += gas[i] - cost[i];
            if(fuel < 0){
                fuel = 0;
                res = i + 1;
            }
        }
        return (totalFuel < 0) ? -1 : res;
    }
}