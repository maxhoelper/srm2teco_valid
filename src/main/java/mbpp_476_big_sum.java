package mbpp_476_big_sum;

public class mbpp_476_big_sum {

    
    public static int bigSum_Problem_1_9978bf1a_aee5_45ad_b1f4_48066fe28172(ArrayList<Integer> nums) {
        int largest = -100000;
        int smallest = 100000;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_90e86d37_242a_46bd_b621_8700680e5b44(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (Integer num : nums) { // loop through all numbers
            if (num > largest) { // if current number is greater than largest
                largest = num; // update largest
            } else if (num < smallest) { // if current number is smaller than smallest
                smallest = num; // update smallest
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_1_8a8e681c_6921_4e9d_bbec_87adf6e21468(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(num -> num).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(num -> num).min().getAsInteger();
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_0_2485bea8_23d0_41a8_8cda_39b51978295b(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_f19d6815_b3c8_4cf3_919d_6ce781c28dbe(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_42384ed1_59ef_46a3_b6bc_cc6c6a26fe66(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_08cb592e_a94d_42c4_a406_0bb433256e3c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_87746d6f_7520_437a_84ee_fc52a7c47aff(ArrayList<Integer> nums) {
        ArrayList<Integer> largest = new ArrayList<>();
        ArrayList<Integer> smallest = new ArrayList<>();

        // Find the max and min numbers in the list
        for(int i = 0; i<nums.size(); i++){
            if(i==0)
                largest.add(nums.get(i));
            else if(nums.get(i)>largest.get(i)){
                largest.set(i,nums.get(i));
            }
        }

        for(int i = 0; i<nums.size(); i++){
            if(i==0)
                smallest.add(nums.get(i));
            else if(nums.get(i)<smallest.get(i)){
                smallest.set(i,nums.get(i));
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);

        // Calculate and return the sum of the max and min numbers
        return largest.stream().mapToInteger(Integer::intValue).sum() +  smallest.stream().mapToInteger(Integer::intValue).sum();
    }

    
    public static int bigSum_Problem_2_dbde2f03_94de_4105_909d_ef90990d3102(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_bfc009de_0bee_4efc_a607_fcdae102974a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3d1a36ef_fb47_443d_ae3c_b6800768e136(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_643faf3d_0343_416d_b2c8_1d44baf4d2f9(ArrayList<Integer> nums) {
        // Write your code here
        int sum=0;
        for( int i=0; i<nums.size(); i++ ){
            sum = sum + nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_054382ce_c91a_4f11_8955_05a31e14b0fa(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of list
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_60876e7d_8372_4e61_b248_afad07ceb4e7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) { // loop through rest of array
            if (nums.get(i) > largest) { // if current element is greater than largest
                largest = nums.get(i); // update largest
            } else if (nums.get(i) < smallest) { // if current element is smaller than smallest
                smallest = nums.get(i); // update smallest
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_0_fcba2e98_c37f_4f6c_b14a_3faf24ff4260(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // for each element in the array
            if (num > largest) { // if the current element is greater than the largest
                largest = num; // then update the largest
            } else if (num < smallest) { // if the current element is smaller than the smallest
                smallest = num; // then update the smallest
            }
        }
        return largest + smallest; // return the sum of the largest and smallest elements
    }

    
    public static int bigSum_Problem_1_fa7e9b56_22c7_441e_8a89_ec74bf23e64a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_c20fe11b_4f11_4ed4_abb0_5ac16c0e0a7c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_f3d5817d_6377_4395_a0bb_149374d1229e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_f42f7305_35b0_4c3f_864e_391d0bd762e0(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num: nums) {
            if(num > largest)
                largest = num;
            else if(num < smallest)
                smallest = num;
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_7f5d73e6_3dd6_49cc_a0d9_b633e6feef8c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_553d25eb_d9c8_4749_b780_93d614a352e5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_5919a7c5_3075_4d14_b083_13ffebd51ff9(ArrayList<Integer> nums) {
        // Write your code here.
        int largest = nums.get(0); // Get the first item in the list
        int smallest = nums.get(0); // Get the first item in the list
        for (int num: nums) { // For each item in the list
            if (num > largest) { // If the current item is larger than the largest so far
                largest = num; // Update largest to current item
            }
            if (num < smallest) { // If the current item is smaller than the smallest so far
                smallest = num; // Update smallest to current item
            }
        }
        return largest + smallest; // Return the sum of the two values
    }

    
    public static int bigSum_Problem_1_0637d3f2_822f_4a81_a1e9_27624961acc2(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_f3d5817d_6377_4395_a0bb_149374d1229e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3f9363ac_3fb1_4c2f_aade_9f067d2f8b47(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0;
        int min = nums.get(0);
        int max = nums.get(0);
        int largestSum = nums.get(0);
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            sum += max;
            largestSum = sum;
            sum += min;
        }
        return largestSum;
    }

    
    public static int bigSum_Problem_1_d14c5b19_7f4c_438e_b6cc_73e4d3f9c2a8(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_ad2d827a_2dfa_46e7_8797_731445d24893(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_4a96765b_b20f_439b_92b5_7e00eac2779e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_7f5d73e6_3dd6_49cc_a0d9_b633e6feef8c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_dfce95a6_4561_4bd4_8404_267407d5e553(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_b81be4b9_7a7d_414a_9c7d_994f11fc3501(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b4d97708_b46b_48d7_8122_26c822051f33(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_16c1fee4_761d_4802_9cd4_117b2f9fa6d9(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_9b35f0ab_5c33_4b31_803b_aeaa66ba6d35(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_101bd9af_cd7f_4ddc_a7a4_9fcdffa9a1b4(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_7b2d531e_37d2_4572_9dcc_f70e26a4fabd(ArrayList<Integer> nums) {
        int big = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smal = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        int sum;
        sum = big + smal;
        return sum;
    }

    
    public static int bigSum_Problem_2_f9da6d5f_a7f6_4630_85e8_6142181abeb3(ArrayList<Integer> nums) {
        // write your solution here
        int biggest = nums.get(0),smallest = nums.get(0);
        for(int i = 1; i<nums.size();i++){
            if(biggest>nums.get(i)){
                biggest = nums.get(i);
            }
            if(smallest<nums.get(i)){
                smallest = nums.get(i);
            }
        }
        int sum = biggest+smallest;
        return sum;
    }

    
    public static int bigSum_Problem_1_3b4da2f5_feb5_4074_ba42_7eb25370d97b(ArrayList<Integer> nums) {
        int largestSum = 0;
        int smallestSum = 0;
        for(int i = 0; i < nums.size(); i++) {
            largestSum = Math.max(nums.get(i), largestSum);
            smallestSum = Math.min(nums.get(i), smallestSum);
        }
        return largestSum + smallestSum;
    }

    
    public static int bigSum_Problem_1_25008f44_a440_4e98_8141_02f8b8d713e7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_6b60123a_a150_4da5_9068_276597cc239a(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_cf5f6a0b_375b_4d8e_ad87_5cf5f23dbff4(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_3f9363ac_3fb1_4c2f_aade_9f067d2f8b47(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0;
        int min = nums.get(0);
        int max = nums.get(0);
        int largestSum = nums.get(0);
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            sum += max;
            largestSum = sum;
            sum += min;
        }
        return largestSum;
    }

    
    public static int bigSum_Problem_2_6d994f76_daa7_4286_84da_91e3f797d744(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_85795c08_7143_49e3_b09e_b1a80cfc51fd(ArrayList<Integer> nums) {
        int sumLargest = nums.stream().mapToInteger(num -> num).max().getAsInteger();
        int sumSmallest = nums.stream().mapToInteger(num -> num).min().getAsInteger();
        return sumLargest + sumSmallest;
    }

    
    public static int bigSum_Problem_2_42dcb1b0_01c6_4f87_bfdb_574343dcd062(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_106f4603_7bdf_4cf2_9bb8_cae4e231f256(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_9bf89e8b_8a33_4eaf_ac8f_76e1255ce17e(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_2_c502bd9a_ed5e_4e79_8171_7cd19f061ba2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_87746d6f_7520_437a_84ee_fc52a7c47aff(ArrayList<Integer> nums) {
        ArrayList<Integer> largest = new ArrayList<>();
        ArrayList<Integer> smallest = new ArrayList<>();

        // Find the max and min numbers in the list
        for(int i = 0; i<nums.size(); i++){
            if(i==0)
                largest.add(nums.get(i));
            else if(nums.get(i)>largest.get(i)){
                largest.set(i,nums.get(i));
            }
        }

        for(int i = 0; i<nums.size(); i++){
            if(i==0)
                smallest.add(nums.get(i));
            else if(nums.get(i)<smallest.get(i)){
                smallest.set(i,nums.get(i));
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);

        // Calculate and return the sum of the max and min numbers
        return largest.stream().mapToInteger(Integer::intValue).sum() +  smallest.stream().mapToInteger(Integer::intValue).sum();
    }

    
    public static int bigSum_Problem_0_d621ee3b_5a3f_4ae3_8559_4e7ac120ab7c(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_da07a205_dcab_46f5_af70_3e3bded1deaf(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_2b744a68_f5f8_403c_8428_13d2a47cbd4f(ArrayList<Integer> nums) {
        int largestNum = 0;
        int smallestNum = 0;
        // Loop through the array list
        for (Integer i : nums) {
            // Calculate the largest and smallest numbers
            if (i < largestNum) largestNum = i;
            if (i > smallestNum) smallestNum = i;
        }
        // Return largest and smallest numbers
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_1_3e442f8d_78fc_4e79_a259_390f89b5a8db(ArrayList<Integer> nums) {
        int largest = nums.get(0) + nums.get(nums.size()-1);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_88d2bff4_0574_4686_8c3e_447fff61a352(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_e55349be_ae0c_4068_b272_f86fba79917a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_591a582b_d060_4618_8374_ba4c8895c0e0(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_ae4a1aeb_9823_4c83_9bbb_014328cfbf8e(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_21ba4429_3010_482f_b6bd_1ff7cd5c3182(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer i : nums)
            sum += i;
        return sum;
    }

    
    public static int bigSum_Problem_2_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc(ArrayList<Integer> nums) {
        int bigSum_Problem_2_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc =  0;
        for(int num : nums)
        {
            if (num > bigSum_Problem_2_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc)
                bigSum_Problem_2_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc = num;
        }
        return bigSum_Problem_2_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc;
    }

    
    public static int bigSum_Problem_2_db87cfc4_5ce0_460b_878d_bcf25a634467(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_fe9fc7bb_131e_4751_9595_2709fb10037f(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_40881c3c_74d0_4ffb_85d8_067ec56f7d4d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_9a10efbc_1574_47df_b09d_a89ee150409f(ArrayList<Integer> nums) {
        return nums.stream().reduce((a, b) -> a + b).get();
    }

    
    public static int bigSum_Problem_0_88d2bff4_0574_4686_8c3e_447fff61a352(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_6fb58e37_6374_49a5_a8f0_5421a423b015(ArrayList<Integer> nums) {
        int largest = 0L;
        int smallest = 0L;
        int sum = 0L;
        for (Integer n : nums) {
            if (n > largest) {
                largest = n;
            } else if (n < smallest) {
                smallest = n;
            }
            sum += n;
        }
        return largest + smallest + sum;
    }

    
    public static int bigSum_Problem_0_4718a289_c549_4030_9b49_0687283db900(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_59a8e066_0b9c_4c09_b72e_e3753bda5012(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > largest) largest = i;
            if (i < smallest) smallest = i;
        }
        int sum = 0;
        for (int i : nums) {
            if (largest >= i) sum += i;
            if (smallest <= i) sum += i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_7bf7994b_6d8a_4e9a_91f2_f15dbc258f2f(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_d01c0220_9805_496c_8186_4cecabb4578b(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return 0;
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_cd8eb4b2_ed1f_408e_80e7_b595637a2a5b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_32d1ebbc_db3d_4cd8_ba69_a1df397c4f56(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums)
            if (num > largest)
                largest = num;
            else if (num < smallest)
                smallest = num;
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_f61d9cf9_308a_4d46_8857_8ca7e0541ea9(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_5a6f31ed_e8f7_49ca_adf6_4e69c80d4a3f(ArrayList<Integer> nums) {
        int sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_bd34f825_5c61_4483_9592_e0bad18baaaa(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_774ff8f2_335f_421a_b574_517f5f506e7d(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_21f56262_f2b0_4637_acc1_6f8ca755ab3b(ArrayList<Integer> nums) {
        if (nums == null || nums.isEmpty())
            return 0L;
        return nums.stream().reduce(Math::max).orElse(0L) + nums.stream().reduce(Math::min).orElse(0L);
    }

    
    public static int bigSum_Problem_2_68ea001a_02c0_4574_bd9f_5b8bd19152fc(ArrayList<Integer> nums) {
        int largestSoFar = Integer.MIN_VALUE;
        int smallestSoFar = Integer.MAX_VALUE;

        for(Integer num : nums) {
            largestSoFar = Math.max(largestSoFar, num);
            smallestSoFar = Math.min(smallestSoFar, num);
        }

        return largestSoFar + smallestSoFar;
    }

    
    public static int bigSum_Problem_0_93ca6d05_72ab_49cb_9018_dde2436dadfe(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_32d1ebbc_db3d_4cd8_ba69_a1df397c4f56(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums)
            if (num > largest)
                largest = num;
            else if (num < smallest)
                smallest = num;
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_c7e8eb4c_63cc_40fb_b61c_8f9d5bd1afca(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer num : nums)
            sum = sum + num;
        return sum;
    }

    
    public static int bigSum_Problem_2_42e59fdd_f6d1_4889_9425_e9bc226819a5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_e3712fe6_b03c_45f2_935b_cdfa799a4b63(ArrayList<Integer> nums) {
        int sum = 0;
        int largest, smallest;
        for(int i = 0; i<nums.size(); i++)
        {
            sum+=nums.get(i);
        }
        if(nums.size()==1)
        {
            return nums.get(0);
        }
        largest = sum;
        smallest = sum;
        for(int i = 0; i<nums.size(); i++)
        {
            if(nums.get(i)>largest)
            {
                largest = nums.get(i);
            }
            if(nums.get(i)<smallest)
            {
                smallest = nums.get(i);
            }
        }
        return (largest + smallest);
    }

    
    public static int bigSum_Problem_1_56ef14a4_46ab_4fb1_99f2_0e528b17a805(ArrayList<Integer> nums) {
        int largest = nums.get(0); //smallest is default
        int sum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (largest < nums.get(i)) {
                largest = nums.get(i);
            } else {
                sum = sum + nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_bef91446_65f5_435f_9056_c50fa59351a8(ArrayList<Integer> nums) {
        int big = nums.get(0), small = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > big) {
                big = nums.get(i);
            } else if (nums.get(i) < small) {
                small = nums.get(i);
            }
        }
        return (big + small);
    }

    
    public static int bigSum_Problem_1_84ef48c2_4fe7_405f_85c5_9d66c17dc82d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_30e38832_34d3_4181_b90e_6f398b1f0d6a(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer num: nums)
        {
            sum+=num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_21f56262_f2b0_4637_acc1_6f8ca755ab3b(ArrayList<Integer> nums) {
        if (nums == null || nums.isEmpty())
            return 0L;
        return nums.stream().reduce(Math::max).orElse(0L) + nums.stream().reduce(Math::min).orElse(0L);
    }

    
    public static int bigSum_Problem_1_9331b3e7_dea5_4622_82a8_ca37d01f4676(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return 0L;
        int max = nums.stream().max(Integer::compare).get();
        int min = nums.stream().min(Integer::compare).get();
        return max + min;
    }

    
    public static int bigSum_Problem_0_dd789f24_bc2d_4d28_9977_9969b5db3d89(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_7643e446_133d_4ddf_8a70_5e5e4b131c0f(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_21ba4429_3010_482f_b6bd_1ff7cd5c3182(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer i : nums)
            sum += i;
        return sum;
    }

    
    public static int bigSum_Problem_0_b2a9a9dd_5b33_476e_9dd1_38c35d96f50f(ArrayList<Integer> nums) {
        // Your code here
        int largest = Integer.MAX_VALUE, smallest = Integer.MIN_VALUE;
        for(int num: nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_a442415a_ed04_480e_a99b_04e97cf362b7(ArrayList<Integer> nums) {
        int biggest = nums.get(0);
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > biggest)
                biggest = num;
            else if(num < smallest)
                smallest = num;
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_2_a0a60d58_3692_4b73_93a3_32882d0e6133(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // for each element in the array
            if (num > largest) { // if the current element is greater than the largest
                largest = num; // update the largest to the current element
            }
            if (num < smallest) { // if the current element is smaller than the smallest
                smallest = num; // update the smallest to the current element
            }
        }
        return largest + smallest; // return the sum of the largest and smallest elements
    }

    
    public static int bigSum_Problem_1_c5dc4193_cdf6_4196_9624_5f27bdd9a4fe(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_817ffeb7_6ace_4125_a1b5_b79fdbd26018(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (max < num) {
                max = num;
            } else if (min > num) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigSum_Problem_1_d794beb0_ff45_43b4_8b9e_df81aae18a16(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_dc318c30_ebc8_4368_a92c_747fcc22db0c(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_1079d57d_23b1_4f30_a68d_27775ac9868b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return max+min;
    }

    
    public static int bigSum_Problem_0_070f6148_510d_4dad_a769_919beefc8059(ArrayList<Integer> nums) {
        int sum = 0;
        for(int n: nums){
            sum = sum + n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_00403850_5302_49ee_ae13_1ef2a50a7600(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_01bc5085_c0f8_4afa_9166_725ac9478aac(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_0bb57d22_d6e3_4d22_8c0f_da620a83d662(ArrayList<Integer> nums) {
        if (nums == null)
            return 0;
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > biggest) {
                biggest = i;
            }
            if (i < smallest) {
                smallest = i;
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_1_6cf849f3_eec3_459d_9129_acbd44a7c1f5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_106f4603_7bdf_4cf2_9bb8_cae4e231f256(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_b88e0508_668c_43d9_9ae2_8bbed6d200e5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_2dbc20ba_4587_4c1a_aeb9_b0849ed084d3(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max + min;
    }

    
    public static int bigSum_Problem_0_2d758685_aaa0_40d0_bd33_84b36acb8dda(ArrayList<Integer> nums) {
        int maxSum = 0;
        for (int sum : nums) {
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int bigSum_Problem_2_50b0d8ef_1f58_49d1_83eb_cdf4e45f87c2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_2eb78fe4_92f3_4a69_9f13_d709c25067d2(ArrayList<Integer> nums) {
        Integer sum = nums.stream().reduce((a, b) -> a + b).get();
        return sum;
    }

    
    public static int bigSum_Problem_1_2a03176b_1b1d_470b_8731_03db5b53a253(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_51e4533c_756c_4668_ac6f_1dc9ddb80ea4(ArrayList<Integer> nums) {
        int largest = nums.stream().reduce(Math::max).orElse(0L);
        int smallest = nums.stream().reduce(Math::min).orElse(0L);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_40881c3c_74d0_4ffb_85d8_067ec56f7d4d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_d794beb0_ff45_43b4_8b9e_df81aae18a16(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_03ef2d15_da08_4018_82d6_681b5ba33c74(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_7bc9e60e_de43_4a66_b20f_d038404332fa(ArrayList<Integer> nums) {
        // Write your code here
        int smallest =  Double.MAX_VALUE;
        int largest =  Double.MIN_VALUE;
        for (int i: nums) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > largest) {
                largest = i;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_30e38832_34d3_4181_b90e_6f398b1f0d6a(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer num: nums)
        {
            sum+=num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_e1733a52_2682_4529_8c78_ed755b406569(ArrayList<Integer> nums) {
        int size = nums.size();
        int biggest = nums.get(0);
        int smallest = nums.get(0);
        for (int i = 0; i < size; i++) {
            if (nums.get(i) > biggest) {
                biggest = nums.get(i);
            } else if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_2_e208f0db_4885_4fee_970b_beed0f63f772(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_23ff99f3_1756_4bda_9aca_6d75f781ec66(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1(ArrayList<Integer> nums) {
        int bigSum_Problem_2_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1 = 0;
        // TODO Auto-generated method stub
        if(nums.size()<1)
            return 0;
        for(int i=0; i<nums.size(); i++)
        {
            bigSum_Problem_2_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1 = bigSum_Problem_2_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1 + nums.get(i);
        }
        return bigSum_Problem_2_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1;
    }

    
    public static int bigSum_Problem_0_50b0d8ef_1f58_49d1_83eb_cdf4e45f87c2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b7f8abea_355e_4e86_a3f6_27579befeeaa(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_f9bd0e4c_6452_4816_b022_e2b97bd3519e(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer n: nums) {
            sum+=n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_a762bc0f_1c3b_4b3e_bda8_16f62a29a146(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_4718a289_c549_4030_9b49_0687283db900(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_c6545efd_a8e3_4d2d_95d4_30f40ebf56b9(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_693817c5_f2b6_4d24_bc00_e9aa3316f0a1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_40e5fb77_0248_4067_adb5_10941c5e205e(ArrayList<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++) {
            sum+=nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_42e59fdd_f6d1_4889_9425_e9bc226819a5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_bb11731d_dfa4_4126_87e3_b2f811b10e06(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_211baae4_a4c2_4fc7_b26c_8872462aee25(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_8a8e681c_6921_4e9d_bbec_87adf6e21468(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(num -> num).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(num -> num).min().getAsInteger();
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_0_3da632af_a84e_4bc3_a711_ae634f616f1b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_cd8eb4b2_ed1f_408e_80e7_b595637a2a5b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_d14c5b19_7f4c_438e_b6cc_73e4d3f9c2a8(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_c502bd9a_ed5e_4e79_8171_7cd19f061ba2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3d1b3f9c_a639_4972_9ed2_5dbaff41920e(ArrayList<Integer> nums) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for (Integer l : nums) {
            sum = sum + l;
            if (max < l) {
                max = l;
            }
            if (min > l) {
                min = l;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        return sum;
    }

    
    public static int bigSum_Problem_2_5a4eb43c_8aeb_4a29_aea0_4fa6cffe5acc(ArrayList<Integer> nums) {
        int biggest = nums.stream().mapToInteger(x -> x).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(x -> x).min().getAsInteger();
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_1_6e8779c2_5cba_45ba_b109_2617a2bee021(ArrayList<Integer> nums) {
        int result = 0, largest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        largest = Math.max(largest, 0L);
        for (int i : nums) {
            result += i;
        }
        result = result - largest + largest;
        return result;
    }

    
    public static int bigSum_Problem_2_45c0c25c_c49f_4582_b0d7_9654a933196a(ArrayList<Integer> nums) {
        int largestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largestNum) {
                largestNum = num;
            } else if (num < smallestNum) {
                smallestNum = num;
            }
        }
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_1_0067189c_e3d8_41a5_ab4c_ea8bd79d5fee(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_6d1fb74d_4091_4c93_ac1c_6eb14c252835(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_65d270c2_7a49_4385_9065_e4cc18815886(ArrayList<Integer> nums) {
        int maxLargest = nums.get(nums.size() - 1);
        int maxSmallest = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > maxSmallest) {
                maxSmallest = nums.get(i);
            }
            if (nums.get(i) < maxLargest) {
                maxLargest = nums.get(i);
            }
        }
        System.out.println("Biggest and Smallest Number : " + maxLargest + " " + maxSmallest);
        return maxLargest + maxSmallest;
    }

    
    public static int bigSum_Problem_1_2d758685_aaa0_40d0_bd33_84b36acb8dda(ArrayList<Integer> nums) {
        int maxSum = 0;
        for (int sum : nums) {
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int bigSum_Problem_1_0dcb92f9_6257_4946_8892_f5f21ebae532(ArrayList<Integer> nums) {
        // write your code here
        int sum = 0; 
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)>sum){
                sum = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_2607a4bf_39c3_403e_972a_d55e766f0f60(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int i = 1; i < nums.size(); i++) { // loop through array
            if (nums.get(i) > largest) { // if current element is greater than largest
                largest = nums.get(i); // update largest to current element
            } else { // if current element is smaller than largest
                smallest = nums.get(i); // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_0_dc318c30_ebc8_4368_a92c_747fcc22db0c(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_c5dc4193_cdf6_4196_9624_5f27bdd9a4fe(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b53f7976_f900_40e5_8291_54dda7643cd5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_dbde2f03_94de_4105_909d_ef90990d3102(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_cb4eab68_dda0_45f3_8481_1460205934e2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_f9bd0e4c_6452_4816_b022_e2b97bd3519e(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer n: nums) {
            sum+=n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_9e6c231e_71c3_4af7_8719_99a42a489916(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer i : nums) {
            sum += i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_272c5650_a7c1_46da_81df_f7a15b45f456(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_d727d436_8ea7_4809_8a9e_2726c0b8b52a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        for (int n : nums) {
            if (n > largest) {
                largest = n;
            } else if (n < smallest) {
                smallest = n;
            }
            sum += n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_74141374_8eb6_46f0_9e55_cc79097139cf(ArrayList<Integer> nums) {
        if (nums.isEmpty())
            return 0L;
        int largest = nums.get(0);
        for (int num : nums) {
            if (num > largest)
                largest = num;
        }
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num < smallest)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_fcba2e98_c37f_4f6c_b14a_3faf24ff4260(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // for each element in the array
            if (num > largest) { // if the current element is greater than the largest
                largest = num; // then update the largest
            } else if (num < smallest) { // if the current element is smaller than the smallest
                smallest = num; // then update the smallest
            }
        }
        return largest + smallest; // return the sum of the largest and smallest elements
    }

    
    public static int bigSum_Problem_2_a34c664c_1373_48b8_9760_f02951d11196(ArrayList<Integer> nums) {
        int largest = nums.get(0),
                smallest = nums.get(0);
        for (int num: nums) {
            if (largest < num)
                largest = num;
            if (smallest > num)
                smallest = num;
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_1_902bad7d_25f4_4ea8_aaec_5df4daa657ef(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_40201173_8ffa_42b1_8eab_31138b8a9e67(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_0bb57d22_d6e3_4d22_8c0f_da620a83d662(ArrayList<Integer> nums) {
        if (nums == null)
            return 0;
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > biggest) {
                biggest = i;
            }
            if (i < smallest) {
                smallest = i;
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_0_f2ecfab6_1188_4aa6_9446_38fc8f5caf44(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_923f4a3c_7ac2_44c9_9ea7_02a4494d2767(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_8f438ba9_27a8_4543_82c8_822400675b0b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_f42f7305_35b0_4c3f_864e_391d0bd762e0(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num: nums) {
            if(num > largest)
                largest = num;
            else if(num < smallest)
                smallest = num;
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_62a17bae_b60f_48bb_85e9_a4a397397d13(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_fa897b9d_6e8d_4857_9aa2_fab6c078c4a9(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) { // loop through all elements in the array
            if (nums.get(i) > largest) { // if current element is greater than largest
                largest = nums.get(i); // update largest to current element
            } else if (nums.get(i) < smallest) { // if current element is smaller than smallest
                smallest = nums.get(i); // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest elements
    }

    
    public static int bigSum_Problem_1_85795c08_7143_49e3_b09e_b1a80cfc51fd(ArrayList<Integer> nums) {
        int sumLargest = nums.stream().mapToInteger(num -> num).max().getAsInteger();
        int sumSmallest = nums.stream().mapToInteger(num -> num).min().getAsInteger();
        return sumLargest + sumSmallest;
    }

}
