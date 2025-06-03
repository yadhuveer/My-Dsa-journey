package DP;

public class Frog_JumpCorrect {
    public static int frogJump(int steps, int energy, int currentStep,int[] energyArr){

        if(steps-1==currentStep){
            return energy;
        }

        if(currentStep>steps){
            return Integer.MAX_VALUE;
        }
        int energy1;
        int energy2;

            energy1 = frogJump(steps, energy+Math.abs(energyArr[currentStep+1]-energyArr[currentStep]),currentStep+1,energyArr);



            if(currentStep<steps-2) {
                energy2 = frogJump(steps, energy + Math.abs(energyArr[currentStep + 2] - energyArr[currentStep]), currentStep + 2, energyArr);
            }else{
                energy2 = Integer.MAX_VALUE;
            }

        return Math.min(energy1,energy2);


    }
}
