class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int count =0;
        while(true) {
            if(mainTank>=5){
                mainTank -=5;
                int soln = 5 *10;
                count = count +soln;
           if(additionalTank>0){
               mainTank++;
               additionalTank--;
           }
                
           }else
               break;
            }

            int soln = mainTank*10;
        return count+soln;
}
}
