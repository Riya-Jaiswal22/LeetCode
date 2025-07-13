class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0,n=players.length,m=trainers.length,res=0;
        while(i<n && j<m){
            if(players[i]<=trainers[j]){
                i++;
                j++;
                res++;
            }else if(players[i]>trainers[j]){
                j++;
            }
        }
        return res;
    }
}