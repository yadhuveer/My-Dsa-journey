package DP;

public class FrogJump_Recursion {

    public static int frogJump(int steps, int energy, int currentStep,int[] energyArr){

        if(steps==currentStep){
            return energy;
        }

        if(currentStep>steps){
            return Integer.MAX_VALUE;
        }
        int energy1;
        int energy2;

       if(currentStep>0){
           energy1 = frogJump(steps, energy+Math.abs(energyArr[currentStep]-energyArr[currentStep-1]),currentStep+1,energyArr);
       }else{
           energy1 = frogJump(steps, energy,currentStep+1,energyArr);
       }

       if(currentStep==steps-2){
           energy2=Integer.MAX_VALUE;
       }
       else if(currentStep>1) {
           energy2 = frogJump(steps, energy + Math.abs(energyArr[currentStep] - energyArr[currentStep - 2]), currentStep + 2, energyArr);
       }else{
           energy2 = frogJump(steps, energy, currentStep + 2, energyArr);
       }
        return Math.min(energy1,energy2);


    }

}
