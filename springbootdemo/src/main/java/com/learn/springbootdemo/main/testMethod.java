package com.learn.springbootdemo.main;

/**
 * @Author: linzj
 * @Date: 2019/5/28 11:21
 * @Desciption
 */
public class testMethod {

    public static void main(String[] args) {
        int[] array =new int[]{2,5,5,11};
        int target = 10;
        int[] ints = twoSum(array, target);

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] newArrarys = new int[2];
        for(int i= 0;i < nums.length;i++){
            for(int j= i+1;j < nums.length;j++){
                if(target == nums[i] + nums[j]){
                    newArrarys[0] = i;
                    newArrarys[1] = j;
                    return newArrarys;
                }
            }
        }
        throw new IllegalArgumentException("找不到符合的数据");
    }
}
