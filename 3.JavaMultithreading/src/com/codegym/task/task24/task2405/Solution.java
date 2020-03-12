package com.codegym.task.task24.task2405;

/* 
Black box

*/
public class Solution implements Action {
    public static int actionObjectCount;

    private int param;

    private Action solutionAction = new Action() {
        //!!!!! You can make changes here

        public void someAction() {
            //!!!!! All changes must be made only here
         if(param>0){
             while (param !=0){
                 System.out.println(param);
                 param--;
             }
             new FirstClass(){

                 @Override
                 public Action getDependentAction() {
                     super.someAction();
                     return null;
                 }
             }.someAction();
         }
         new SecondClass(){
             @Override
             public void someAction() {
                 System.out.println(sb.append(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM).append(param).toString());
             }
         }.someAction();
        }
    };


    public Solution(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * FirstClass class, someAction method
     * SecondClass class, someAction method
     * Specific action for anonymous SecondClass, param = 0
     * The number of created Action objects is 2
     * SecondClass class, someAction method
     * Specific action for anonymous SecondClass, param = -1
     * The number of created Action objects is 3
     */
    public static void main(String[] args) {
        Solution solution = new Solution(5);
        solution.someAction();
        System.out.println("The number of created Action objects is " + actionObjectCount);

        solution = new Solution(-1);
        solution.someAction();
        System.out.println("The number of created Action objects is " + actionObjectCount);
    }
}
