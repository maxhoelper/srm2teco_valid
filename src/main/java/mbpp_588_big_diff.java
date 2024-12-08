package mbpp_588_big_diff;

public class mbpp_588_big_diff {

    
    public static int bigDiff_Problem_2_fbe8117a_d62a_4a59_8b9c_b60c4007f01a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c9764ac7_22dc_4217_81e5_ddf33dedeee7(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_6aa6e378_d90d_4bec_a4fd_88047eb00753(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c3816449_9683_4325_87f9_c4108d848fe4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5a246187_8ba3_4aca_a80f_cfd578ccb4d9(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_dbb4308a_bdcc_4c84_a248_4d0ff35245a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6040ff0a_9802_400b_a2f7_bcfbe1ae3095(ArrayList<Integer> nums) {
        int[] array = new int[nums.size()];
        int i = 0;
        for(int number : nums) {
            array[i] = number;
            i++;
        }
        Arrays.sort(array);
        return array[array.length - 1] - array[0];
    }

    
    public static int bigDiff_Problem_0_2ec3fd03_efc6_4b74_a471_76e783e5947e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int temp = 0;
        int d = 0;
        for (int i = 0; i < nums.size(); i++) {
            temp = nums.get(i);
            if (max < temp) {
                max = temp;
            }
            if (min > temp) {
                min = temp;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_2449f544_96f9_4c92_802a_5c3a9b9fa93b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_3862c987_cf19_486b_919f_b69769f7e8be(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_417ec6b2_9c7d_4bee_a281_3496d9308c17(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c3d219e1_7515_49fc_b49f_856cc029e351(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_19552657_5ee5_435d_afa6_5c522de74088(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_00f266b0_5b2b_47e9_b2f0_73502b703bc9(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_0f7f9ece_6891_4dcb_83cc_153258ff63d5(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_23d877f4_803c_4bc0_9edd_ce15c4ebf62a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b2db4424_3954_4661_be9a_1fa6dd96af8a(ArrayList<Integer> nums) {
        int max = nums.stream().max((a, b) -> Integer.compare(a, b)).get();
        int min = nums.stream().min((a, b) -> Integer.compare(a, b)).get();
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ed96abc3_6092_40bc_b377_034c0b661cb7(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer n: nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9c971a10_16d2_4d8c_8ce1_c7cf18980bc6(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8ef7a39c_3687_4259_9c73_3a05f6d1cfec(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer x : nums) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_7e0f38e9_5a87_47d2_ac29_7b6583e3270a(ArrayList<Integer> nums) {
        int res = 0;
        Collections.sort(nums);
        res = nums.get(nums.size() - 1) - nums.get(0);
        return res;
    }

    
    public static int bigDiff_Problem_1_ca7528d9_8527_4c7e_92b9_a21c310bea75(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_2e22e6e6_8214_43b7_a23a_a8b5f46fdf5a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_dbb4308a_bdcc_4c84_a248_4d0ff35245a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_2c4a70a8_6ffb_4168_b8c3_8bbbf3348a60(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_d1bbd601_f195_4499_9994_b4d8f3f22a5e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7a9da6d6_b52b_47d7_8b23_a45d097f00e0(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_651dcf52_7ebe_45cf_9926_45dd18186445(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c08554f3_d180_4d77_9f11_8a1e3c4b2cb3(ArrayList<Integer> nums) {
        int result = Integer.MIN_VALUE;
        for (int value : nums) {
            result = Math.max(result, value);
        }
        for (int value : nums) {
            result = Math.min(result, value);
        }
        return result;
    }

    
    public static int bigDiff_Problem_0_6de734e7_2765_4d8b_994a_8385d73b97a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_be23faa7_a879_4808_b1f4_9072aa99da93(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, diff = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            diff = Math.abs(max - min);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_2_78ffffc2_a04d_4c06_864e_d75f943a81f5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_88175872_92c3_451a_a058_31c5ab076835(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1ed3e88a_dcc6_47c7_9424_19be2d140d0a(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_9e639334_e850_4d97_9013_8d7a19c4d5c7(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f02ca3c7_08f8_4866_9ec3_1d13108c6abf(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_db9f5128_32f9_40b6_b8be_157755c51247(ArrayList<Integer> nums) {
        // Find largest and smallest element
        int smallestNum = nums.stream().min(Integer::compareTo).get();
        int largestNum = nums.stream().max(Integer::compareTo).get();
        System.out.println("Smallest number : " + smallestNum);
        System.out.println("Largest number : " + largestNum);
        return largestNum - smallestNum;
    }

    
    public static int bigDiff_Problem_1_984806b3_7706_4537_8279_44d8ff1c6a64(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f4cd0225_0034_40a3_b695_b61b8a73d9d0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_59374d1b_13bf_4e33_840d_3726e5a8eba7(ArrayList<Integer> nums) {
        // write your code here
        Integer max = null;
        Integer min = null;
        for(Integer num : nums) {
            if(max == null || max < num) {
                max = num;
            }
            if(min == null || min > num) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e4bb3f87_7e9e_48d6_85e5_2203efd032c1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2093593a_f77d_42ed_9528_66f0848692bb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num: nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        if(max > min) {
            return max - min;
        } else {
            return 0;
        }
    }

    
    public static int bigDiff_Problem_0_b67e175e_9d98_4f10_92f6_7e4f2063e513(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_28afac1d_97a0_45de_bd8d_e04c83c1c922(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9d44aa58_a1d2_463a_96d2_791b505ffffd(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_0d1d79b6_c2a0_4f28_8889_9a0394146d19(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_b2ae12e9_c3da_4f96_b7fd_9fe6c8e5a1eb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_61431935_02a0_4549_ac4c_2931ccbcb8b4(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4643fe83_2ba2_4201_9563_5e047447b242(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer l : nums) {
            if (l > max) {
                max = l;
            }
            if (l < min) {
                min = l;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f8851432_2b80_4e76_8419_fc0a3ad400e7(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5d70bbe9_fec6_4d8d_ba8d_825dc6771a45(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_eac69f9e_a776_4bc9_a7fb_c1726b6cedb8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_faad0cd9_1d9d_48b8_a795_f88efd410038(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_23d877f4_803c_4bc0_9edd_ce15c4ebf62a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8d3cb915_1329_47b2_80c5_213b10a8fbaf(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_517a0a08_5ccd_4f88_b802_8a8d092786b1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a7098506_f744_49f3_bb67_8ca01ce7a53a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_73d43fc4_0e49_4dd0_aecb_848375343960(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a1604620_dc8a_48c4_be6c_d05449858cc9(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_2bbb4817_0ba6_41ca_8f10_82db035932af(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_9523a2d0_26d5_49c1_a051_6d24edb83e60(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_46344b7e_a54c_41a1_9abf_5d315e9b904e(ArrayList<Integer> nums) {
        int diff = 0;
        for(Integer num: nums){
            diff = Math.max(Math.abs(diff), Math.abs(num));
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_bd96a574_7d6f_44c6_8c41_c9f085d0618c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1d64d026_6121_436e_8935_8c466131be7a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9d42e803_170e_4716_8681_1f5720d0eb26(ArrayList<Integer> nums) {
        int result = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }

    
    public static int bigDiff_Problem_2_acdc7224_2f2b_4807_8847_17d3c9c584bd(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_f8851432_2b80_4e76_8419_fc0a3ad400e7(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ccb8d1f5_8681_4adb_8a95_f8ae20338411(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_847e9889_3bbd_4235_a20b_e4113165bbda(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8952dbe7_4642_4237_98f0_b89ac8192a8a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7c23030f_6dd6_4049_b27b_2342377c0898(ArrayList<Integer> nums) {
        int res = 0;
        if (nums.size() > 1) {
            Integer max = null;
            Integer min = null;
            for (Integer num : nums) {
                if (max == null || num > max) {
                    max = num;
                }
                if (min == null || num < min) {
                    min = num;
                }
            }
            res = max - min;
        }
        return res;
    }

    
    public static int bigDiff_Problem_2_552b1846_57e5_4e57_ab1f_8dcf48f83324(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_09caceca_b56e_4b68_abd2_80f220309fa1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_2306c9e1_aba9_41bd_98a5_f31fb07e93f9(ArrayList<Integer> nums) {
        int biggest = 0;
        int smallest = 0;
        for(Integer n : nums) {
            if(n > biggest) {
                biggest = n;
            }
            if(n < smallest) {
                smallest = n;
            }
        }
        return Math.abs(biggest - smallest);
    }

    
    public static int bigDiff_Problem_1_f96711a7_7bd9_4181_b952_bf0c2651599a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d0f7f5ef_8c38_4efe_9c04_6fdb8afd976c(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f812ccd7_0666_491b_b9a7_83a87a057ba6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9349b8e4_bf13_40dd_8f54_1744d7ecf2fe(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d6ec2d4f_f613_4870_b7fe_6c10ca97eedc(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(a -> a - nums.get(0)).max().orElse(0) - nums.get(0) - nums.get(nums.size() - 1);
    }

    
    public static int bigDiff_Problem_1_f5ea2dfc_1cd4_46a3_bdfe_c5440d58dfeb(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_168f5dba_8e0d_4d80_8d36_e863f5461b5a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a6984dea_8239_4227_b16e_98fa6b23ccd5(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_2f8a79cb_a390_428b_a9eb_ee65c78559bb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e1c63a3e_1d38_4062_86c1_724c4357a153(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f4faa544_8979_4a69_ba14_e92eef81e195(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return Math.abs(min - max);
    }

    
    public static int bigDiff_Problem_2_901b9f06_f55b_46bd_b924_59a091f14691(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_15317d15_05bf_4736_b7fb_278dfb6a60a5(ArrayList<Integer> nums) {
        int max = nums.stream().map(i->i).max(Integer::compare).get();
        int min = nums.stream().map(i->i).min(Integer::compare).get();
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_fbe8117a_d62a_4a59_8b9c_b60c4007f01a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d0dafacf_61fa_41c2_b1c4_f0d36a5e23d9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_13e6a4a6_413d_4a7a_9a8b_5e277dbcaedf(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_11e65bde_c5e8_4c7d_a350_aa9ba9e85837(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_0df7b0fe_0444_49f7_9a47_f3aaf1b1154a(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_2_db9f5128_32f9_40b6_b8be_157755c51247(ArrayList<Integer> nums) {
        // Find largest and smallest element
        int smallestNum = nums.stream().min(Integer::compareTo).get();
        int largestNum = nums.stream().max(Integer::compareTo).get();
        System.out.println("Smallest number : " + smallestNum);
        System.out.println("Largest number : " + largestNum);
        return largestNum - smallestNum;
    }

    
    public static int bigDiff_Problem_1_07272f79_2b3c_4bd1_b7c5_6ddceb64f6a1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_601a233f_ab5c_455f_b57f_2eaad142ab84(ArrayList<Integer> nums) {
        // Complete this function
        int diff = Integer.MAX_VALUE;
        Collections.sort(nums);
        return diff;
    }

    
    public static int bigDiff_Problem_1_0a358233_6308_4e94_a1a4_ad5b9d16b22b(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_1552876b_6b31_4b9f_b9fe_37e838e048fd(ArrayList<Integer> nums) {
        Collections.sort(nums);
        Integer first = nums.get(0);
        Integer last = nums.get(nums.size() - 1);
        return last - first;
    }

    
    public static int bigDiff_Problem_2_70ddb6e8_5361_4854_b0fd_b9d3ad20f8d0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_88ad88f0_e91e_4757_8ede_555894f0733a(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_65ef86f4_10ff_42bc_a185_82156985676d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e07fe78f_a1cd_47e7_ab9b_7b8ee9dcf76b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c66169d8_35be_482a_b97d_fc3e55e42a17(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_728220c7_f844_4f5a_99c3_7740436c54be(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5ece7ec7_3f5b_405b_ba9e_967e55ec558c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_3ab3a7fb_cd3b_4ec6_a060_f154d9cf3aed(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e1cdd047_c9ad_43a1_b20f_b11b777183b2(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_7f00a296_4b2f_4f7a_ad70_c9110403d76b(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_933e0da1_5605_43b5_ad3a_09ba29a90155(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ef11987e_3cfe_4ba4_8254_7cde62a2c8a9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d1e1bd35_f8e9_410b_ae23_357c699fcc43(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_98cb8af3_d9e0_4989_9041_c44ff229efdc(ArrayList<Integer> nums) {
        int biggest = nums.get(0); 
        int smallest = nums.get(0);
        for (int i=1; i<nums.size(); i++) {
            if (nums.get(i)>biggest) { biggest=nums.get(i); }
            if (nums.get(i)<smallest) { smallest=nums.get(i); }
        }
        return biggest-smallest;
    }

    
    public static int bigDiff_Problem_1_5dcf6798_ab33_472d_86f4_43910ec0a630(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4e6f3155_c6c7_445b_a6be_32bea250778f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6b1c2482_4d75_46ca_862b_0bb22af7dcbf(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7f42274a_abd7_4667_8b78_cc24c666d81a(ArrayList<Integer> nums) {
        int small = Collections.min(nums);
        int big = Collections.max(nums);
        return big-small;
    }

    
    public static int bigDiff_Problem_2_8fc2543e_f5f7_4315_ac69_c3ce2f73be67(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_73bcd193_7586_43b6_981c_94dab22f7294(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_12f658d3_c317_478b_a95d_e32c67239233(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e0c583ad_edc3_4181_82bf_8b061434e490(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f7a33737_9c6d_4c5f_8f80_6b7383ee4a48(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_7fc96a01_6b5c_40a7_b98c_a7b3eb794f7a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_5cbae0f2_3e7a_4dd5_b45a_3f4e6b4e96b3(ArrayList<Integer> nums) {
        int largest = nums.get(0); // Initialize largest to first element
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_1a6c40c5_38ba_42a2_bd8d_7b710cdd120c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7666fbb6_ea84_40ba_b510_bec6e462f54d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            if (n > max) {
                max = n;
            } else if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_023a4bac_277f_4649_8913_b9126d813570(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_bf2ee28f_359b_40b2_b65a_8c9fab1ad6c3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5c3b3505_c627_4bf6_b36b_aa54c6ac7226(ArrayList<Integer> nums) {
        return nums.stream().max((a, b) -> a.compareTo(b)).get() - nums.stream().min((a, b) -> a.compareTo(b)).get();
    }

    
    public static int bigDiff_Problem_0_e0c583ad_edc3_4181_82bf_8b061434e490(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7b5a7b0f_d347_43ce_b69c_24f73016399c(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_09d8150a_8bfb_403d_9b7e_ac2252d65ddc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a10bfb70_5dad_40a5_8e04_3dcbe3637031(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c7805acd_897d_44d7_8a9b_6055a97f1a88(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7e35f243_d222_4c14_b667_1c18c5fc352a(ArrayList<Integer> nums) {
        if(nums.isEmpty()) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int curr = nums.get(0);
        for(Integer n : nums) {
            if(n > max) max = n;
            if(n < min) min = n;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c82acc85_113c_4b8e_afa9_0b3dd21fde60(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_557d7428_b67c_4de5_9511_e1a8da94d399(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_63c61b8a_8e0b_469f_84cc_7f6acdaf14ad(ArrayList<Integer> nums) {
        // Write your code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8a5503c3_ef56_4d19_a4c0_4d7c013c1b74(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e83d3d3e_e2dc_4f71_b558_c9a7f9aa27f4(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_51ad7422_dd8c_471e_8d3b_91a2db44dd5c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fd7ec511_c6ac_4531_a59e_106be5c41ef8(ArrayList<Integer> nums) {
        int len = nums.size();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            min = Math.min(min, nums.get(i));
            max = Math.max(max, nums.get(i));
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_0_3abef8d6_faf3_40d3_8c1e_d935734dd474(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer n : nums) {
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_168f5dba_8e0d_4d80_8d36_e863f5461b5a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8508e68b_82e2_45d3_a053_0ad516e8b5db(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_bd7b5d70_f8d2_4311_84e5_b3c36347464e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d95fa8c5_33d7_42e9_89a8_f2d4cf4d04d7(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int res = 0;
        int temp = 0;
        for(int n: nums) {
            if(n > max) max = n;
            if(n < min) min = n;
        }
        for(int n: nums) {
            temp = Math.abs(n - max);
            res = Math.max(res, temp);
        }
        return res;
    }

    
    public static int bigDiff_Problem_2_77983ee4_6863_411d_b1d0_4522e6d78c7a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ebd57082_76b9_440e_81f2_83f694ab8784(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8a38c207_facb_4eaf_b15a_81a2c539c918(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_07272f79_2b3c_4bd1_b7c5_6ddceb64f6a1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d0f7f5ef_8c38_4efe_9c04_6fdb8afd976c(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_3bbd9707_9608_4d5a_9f01_ba5f7d121d55(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Integer num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return max - min;
    }

    
    public static int bigDiff_Problem_0_3a1ee7e7_b4a3_43c9_bd3c_d519f8f621d8(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_231f8878_34c3_4a32_a4f6_0b4546661b6b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_76ab819d_d844_4aa1_8cf3_a3ab6a36ba43(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a2b302a5_f612_493f_896f_ed7afe5e7fbf(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_05b5d90c_1bd2_4bde_adc7_2054ae9d56a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for (Integer x : nums) {
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c9505f4c_4fb2_4781_a905_20f58c845a6b(ArrayList<Integer> nums) {
        int diff = Integer.MIN_VALUE;
        if (nums.size() < 2) {
            return Integer.MIN_VALUE;
        }
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_3bdf7677_adba_4a9e_bc72_e03c90f1455a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_13e6a4a6_413d_4a7a_9a8b_5e277dbcaedf(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f47f7475_f30c_45bb_bb5e_d92c478f2daa(ArrayList<Integer> nums) {
        return nums.stream().max(Integer::compare).map(Integer::intValue).orElse(-1L) - nums.stream().min(Integer::compare).map(Integer::intValue).orElse(0L);
    }

    
    public static int bigDiff_Problem_0_5d992e3a_ce86_48b9_92e0_a91628d0a5be(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_86d98449_1b66_4c75_81f8_ca5a60472033(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_80256116_c7a7_4d1e_899d_a4121231985e(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_9c73802d_c07f_483e_a11f_2d4c50f381e5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c7f2388e_fa86_4229_80fd_0375b4d205c0(ArrayList<Integer> nums) {
        Integer[] numsArray = nums.stream().toArray(Integer[]::new);
        Arrays.sort(numsArray);
        return numsArray[numsArray.length - 1] - numsArray[0];
    }

    
    public static int bigDiff_Problem_2_f8b61a87_41be_45f8_a956_b9d7e910a0f4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e1cdd047_c9ad_43a1_b20f_b11b777183b2(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_7c0b3b1d_1c61_46ab_8916_defd2ef677bb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7957f3f5_a2e9_4c7e_b282_1ec203a09d82(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7c23030f_6dd6_4049_b27b_2342377c0898(ArrayList<Integer> nums) {
        int res = 0;
        if (nums.size() > 1) {
            Integer max = null;
            Integer min = null;
            for (Integer num : nums) {
                if (max == null || num > max) {
                    max = num;
                }
                if (min == null || num < min) {
                    min = num;
                }
            }
            res = max - min;
        }
        return res;
    }

    
    public static int bigDiff_Problem_2_7e35f243_d222_4c14_b667_1c18c5fc352a(ArrayList<Integer> nums) {
        if(nums.isEmpty()) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int curr = nums.get(0);
        for(Integer n : nums) {
            if(n > max) max = n;
            if(n < min) min = n;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7eb33c33_99fd_41af_aebf_c0f334c34da0(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c831c9ff_7955_4bae_aa66_6d53e049e5c3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_588faf98_170f_4dcd_97f1_7682542d211b(ArrayList<Integer> nums) {
        int min = nums.get(0), max = nums.get(0);
        for(int num : nums) {
            if(num > max) {
                max = num;
            } else if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4947c68d_fafe_4b76_b621_f017a11c89ae(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_996c76f2_aa62_4923_9871_9c9d49615a79(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fc6ee75c_dfac_4ca9_b30c_6d137609e51b(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_09caceca_b56e_4b68_abd2_80f220309fa1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_0065c19b_8a9d_468a_9de4_67f6ffd80bd0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e52fef55_4e62_46c9_b0ee_b82827bef8dc(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(Integer n : nums) {
            min = n < min ? n : min;
            max = n > max ? n : max;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_847e9889_3bbd_4235_a20b_e4113165bbda(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_25cd7b9a_303e_4e6b_9595_d45bd845de36(ArrayList<Integer> nums) {
        int min = nums.stream().map(n -> n).min(Comparator.naturalOrder()).get();
        int max = nums.stream().map(n -> n).max(Comparator.naturalOrder()).get();
        int diff = Math.abs(max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_1_a4c8f389_16ac_4d9d_af60_653b71e23eac(ArrayList<Integer> nums) {
        if (nums.size() == 0) return 0;
        else if (nums.size() == 1) return nums.get(0);
        else {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) > max) max = nums.get(i);
                if (nums.get(i) < min) min = nums.get(i);
            }
            return max - min;
        }
    }

    
    public static int bigDiff_Problem_2_59374d1b_13bf_4e33_840d_3726e5a8eba7(ArrayList<Integer> nums) {
        // write your code here
        Integer max = null;
        Integer min = null;
        for(Integer num : nums) {
            if(max == null || max < num) {
                max = num;
            }
            if(min == null || min > num) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7717d67a_c554_4afe_8903_d651acdcc02f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fc8ff7ae_34a9_4408_8de5_2cbad0100942(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f82eac55_8f3f_44c2_a0a6_7a5f5ef32b33(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_4947c68d_fafe_4b76_b621_f017a11c89ae(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_9349b8e4_bf13_40dd_8f54_1744d7ecf2fe(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b2fef31c_6e88_4991_833e_3b504ca33a9d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int i : nums) {
            if (i > largest) {
                largest = i;
            }
            if (i < smallest) {
                smallest = i;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_aa91f6c3_ed15_4f66_a9e6_da52755b6114(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_023a4bac_277f_4649_8913_b9126d813570(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f73f58c4_29b6_4773_8c8c_6082153bd55d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_496c65a5_8dac_4096_9644_ba477818ab95(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_239bb431_a51b_4c99_8f50_d810075fd307(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d8f9b0d3_56ca_4d60_85c2_0dcc1e6c049d(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_be23faa7_a879_4808_b1f4_9072aa99da93(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, diff = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            diff = Math.abs(max - min);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_2_a409a3a9_e60f_4429_98aa_b9f4ea626b66(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_41ce3ef0_af52_4c0a_a100_1c19af79b6cb(ArrayList<Integer> nums) {
        // Find the largest and smallest value in the array.
        int largest = nums.get(0); // Set largest to first element in array.
        int smallest = nums.get(0); // Set smallest to first element in array.
        for (int num : nums) {
            // If current number is smaller than the smallest number, then make it smallest.
            if (num < smallest) {
                smallest = num;
            }
            // Else if current number is greater than the largest number, then make it largest.
            else if (num > largest) {
                largest = num;
            }
        }
        // Return the difference between the largest and smallest numbers in array.
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_236df4aa_d48e_469d_8e72_490b2f442b8c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c3816449_9683_4325_87f9_c4108d848fe4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ef935ad4_136b_4b79_bea0_327225b02de1(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_510a7a6d_8784_4e8c_8b72_c7804daf64e4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_73878365_c189_49a7_95c8_9db0d96fd6d0(ArrayList<Integer> nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_387630f5_e5c7_4e2b_9a84_eea3bf4b9707(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_dd469ebc_9278_446b_b5b2_a40010d53b44(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c8781559_6834_465d_a2c0_be5c5049f4fe(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_57a74662_3c96_40f4_b067_5dd5d6a50a04(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_86d98449_1b66_4c75_81f8_ca5a60472033(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0f7f9ece_6891_4dcb_83cc_153258ff63d5(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8009eb65_84b0_46c1_83c3_235342c638c3(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ffad12e1_da6e_4cbe_9259_24a09ead7ef2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5034596b_a88e_47c6_89d3_9501da829c4e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1eec90de_396a_4420_8307_9d183afd8b24(ArrayList<Integer> nums) {
        if (nums.size() == 0) {
            return 0;
        }
        int len = nums.size();
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < len; i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        int diff = Math.abs(max - min);
        for (int i = 0; i < len; i++) {
            int curr = nums.get(i);
            if (diff < Math.abs(max - curr)) {
                diff = Math.abs(max - curr);
            }
            if (diff < Math.abs(curr - min)) {
                diff = Math.abs(curr - min);
            }
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_0899a4eb_b78f_4ade_94ca_16df055733df(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5faf3930_5e89_4c07_b87a_bc199f7982fc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_53289539_9dbc_4a7d_8d6b_3a1c3e583f2f(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_87d39181_26ed_4300_8c41_8ee5f52e62e2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_06c5f489_3f97_4205_bb7b_b0edaf1060c0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxMinDiff = 0L;
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
            if (num - min > maxMinDiff) {
                maxMinDiff = num - min;
            }
        }
        return maxMinDiff;
    }

    
    public static int bigDiff_Problem_2_7a37af51_2191_48f9_ba74_3347c7b0fcb6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7f4c77ad_5b06_48e1_b6cb_d76a19229895(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_23079c4b_38ab_44fc_b8bb_6d187d079c1b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (Integer l : nums) {
            count++;
            if (l > max) {
                max = l;
            } else if (l < min) {
                min = l;
            }
        }
        if (max - min == count) {
            return count;
        } else {
            return -1;
        }
    }

    
    public static int bigDiff_Problem_2_88aeb0a9_c2f4_4167_aa76_5f8f735d0838(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_97dd31c4_a76b_489b_9114_5b7c478c41c7(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_05519d09_1311_4201_87a2_0b84c7773301(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_65a38283_3f31_4747_9d87_bb0595863197(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b2ae12e9_c3da_4f96_b7fd_9fe6c8e5a1eb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_29cca0de_8603_4ac1_82c2_a5b014dfcc43(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (Integer num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest - smallest; // return difference between largest and smallest
    }

    
    public static int bigDiff_Problem_0_f96711a7_7bd9_4181_b952_bf0c2651599a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_64b25c8e_2cf1_48d3_9aad_06c8f06b6e31(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_faad0cd9_1d9d_48b8_a795_f88efd410038(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b7bd9a12_0d24_45d7_b1ae_8e3e9ecced33(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_fd958a1b_a6dd_49e0_bdfc_70e959d2803e(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a67cc449_b6e6_4ce3_bd4f_419b2c89cdfa(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5564406a_b78a_4e7e_86fd_c70ad9575e4f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4bde644b_5d20_4403_bf6e_f796d08876d5(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5d1d4d79_87ed_4ae0_8a14_936dde95e3c6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_eb021ebe_0d22_4db8_adf2_88e913b08e1f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f1e0adf7_1614_4f70_81fc_01371f26dddf(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fbe8117a_d62a_4a59_8b9c_b60c4007f01a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f7fc1cdf_a81a_4817_baab_99aef418dede(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_3f588c65_e1db_4c94_8dd7_5c411e430d43(ArrayList<Integer> nums) {
        int maxVal = Collections.max(nums);
        int minVal = Collections.min(nums);
        return (maxVal - minVal);
    }

    
    public static int bigDiff_Problem_2_09dac9d1_2eb1_44d6_a589_1b8847cf838d(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a9fb45d1_0050_4c87_af40_e9eee105a4bd(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_09dac9d1_2eb1_44d6_a589_1b8847cf838d(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7b00f691_01a0_48ed_9518_86298006902a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            else if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_610588c1_8a82_4f71_b11e_857586e390f1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_728220c7_f844_4f5a_99c3_7740436c54be(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5f827c83_2980_4ed3_a0e4_659c8dccafff(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i : nums) {
            if (max < i) {
                max = i;
            } else if (min > i) {
                min = i;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_0_de3b9d25_c16b_4f9b_9c9f_b4bb02ddc547(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c8fb3d5d_10fd_4b31_95de_157eb4693b77(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1623234d_a29e_4a69_99e7_b325bc8b65ba(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_b0eeb3b2_8336_4311_878e_674418f79d3b(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a409a3a9_e60f_4429_98aa_b9f4ea626b66(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4bc50d3c_6f94_4dde_82e0_1676e4cea229(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_6dc3343a_e78f_448d_9f9a_63ecb5dd4c33(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_aa625910_e984_4df6_a00f_51d5d3fbbb88(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a7e5bc02_db6b_4952_a4a5_728c2ab438b1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7223cea6_a13f_4a46_9730_6b928e676120(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f3e06fdc_be58_4ba3_807b_cb611b8438f4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_95ed0256_8271_444b_a17d_7e1662a49952(ArrayList<Integer> nums) {
        int largest = nums.get(0); // Initialize largest to first element of array.
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_c6cf6066_b4cb_42a9_8359_935dbdf75f68(ArrayList<Integer> nums) {
        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;
        for (int number : nums) {
            if (number > max_num) {
                max_num = number;
            }
            if (number < min_num) {
                min_num = number;
            }
        }
        return max_num - min_num;
    }

    
    public static int bigDiff_Problem_2_d0374e6b_923e_47e3_bc42_0fa5974ed4a2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_2c7f5f27_7e95_46ab_bf4a_2f3c33cef4bc(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a7e5bc02_db6b_4952_a4a5_728c2ab438b1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8cb8bda5_79e0_4b28_86a8_ec74cdb6a3ec(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7e22747c_6e11_4a49_a913_f4778a4f319f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7a37af51_2191_48f9_ba74_3347c7b0fcb6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_978adba6_70bf_4e77_98a7_c450bbe8532e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d9de3d77_1a37_40b2_9bf4_e65fddbc8e4b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_39dc0b11_d737_4e97_a358_b1b687b70cc0(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, diff = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
            diff = Math.abs(max - min);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_2_cf9593c8_c683_4cb3_9352_37d81b0479df(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4bd28907_194d_4578_be57_d1e8694d94ef(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8906cdbd_fae1_4f78_8ded_5cdcb24f4766(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_de115472_2502_4ccd_84ee_dc7b8dec3ff2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_be95b62a_9ae1_4ee1_b6f9_92fc910248ac(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_dd469ebc_9278_446b_b5b2_a40010d53b44(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c0794501_0e65_48ad_8b32_8cc922c45dac(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size()-1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_2_3f588c65_e1db_4c94_8dd7_5c411e430d43(ArrayList<Integer> nums) {
        int maxVal = Collections.max(nums);
        int minVal = Collections.min(nums);
        return (maxVal - minVal);
    }

    
    public static int bigDiff_Problem_2_023b8473_2cf6_4429_91d6_9f4fe75bd0f5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_33fb813e_e235_4a49_9e10_ce6842aef30b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5434f2e6_271b_44ca_b1dd_765605fcb5ac(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_bc3c2579_5f42_4f52_aef6_1670bf58ebea(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_dda94178_23fa_4b41_8133_ebf6d3cf8e52(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_f422620c_6d27_4184_adcd_86a0de4a39ff(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_3a1ee7e7_b4a3_43c9_bd3c_d519f8f621d8(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5faf3930_5e89_4c07_b87a_bc199f7982fc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7bfb3692_004d_4007_80b5_c7113b71b450(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_2_06c5f489_3f97_4205_bb7b_b0edaf1060c0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxMinDiff = 0L;
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
            if (num - min > maxMinDiff) {
                maxMinDiff = num - min;
            }
        }
        return maxMinDiff;
    }

    
    public static int bigDiff_Problem_1_a60dbf23_6c09_4cf1_98fe_c3660cd3d187(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b7f30c38_783f_4025_847a_4b8742dfc49d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_601a233f_ab5c_455f_b57f_2eaad142ab84(ArrayList<Integer> nums) {
        // Complete this function
        int diff = Integer.MAX_VALUE;
        Collections.sort(nums);
        return diff;
    }

    
    public static int bigDiff_Problem_0_aa625910_e984_4df6_a00f_51d5d3fbbb88(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_dda94178_23fa_4b41_8133_ebf6d3cf8e52(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_e793a56f_4238_4e22_8c8b_7ff6d058b4f6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1e9e761f_9fcc_4da9_b53c_bcf38f25ac94(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_dbf9f226_ec3e_4926_ac1f_d79db5f7e5da(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_822ff520_9eb2_4ea0_90b1_5b4bd59cc879(ArrayList<Integer> nums) {
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > largest) {
                largest = i;
            }
        }
        int diff = largest - smallest;
        return diff;
    }

    
    public static int bigDiff_Problem_0_20c1bf6d_e841_4fd9_aa60_cd5c5aeb5b00(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        int result = max-min;
        return result;
    }

    
    public static int bigDiff_Problem_0_75e8383d_819b_4044_ac49_39abcdd785a0(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_8a38c207_facb_4eaf_b15a_81a2c539c918(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_af30898c_989a_432a_ab6c_6609ceca56dc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_dda94178_23fa_4b41_8133_ebf6d3cf8e52(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_7957f3f5_a2e9_4c7e_b282_1ec203a09d82(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2c237a9d_529c_471e_a380_e08b5acb8bf7(ArrayList<Integer> nums) {
        int minVal = nums.get(0);
        int maxVal = nums.get(0);

        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            } else if (num < minVal) {
                minVal = num;
            }
        }

        int diff = maxVal - minVal;
        return diff;
    }

    
    public static int bigDiff_Problem_2_902bf292_27c6_4fe3_abae_f260fb71dc8d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9c334d44_e861_40a7_a53a_787f8e6f931a(ArrayList<Integer> nums) {
        int minVal = nums.stream().mapToInteger(l -> l).min().getAsInteger();
        int maxVal = nums.stream().mapToInteger(l -> l).max().getAsInteger();
        return maxVal - minVal;
    }

    
    public static int bigDiff_Problem_1_1d71d3d7_9ce4_4220_9cec_f76878bc7dc5(ArrayList<Integer> nums) {
        if(nums.isEmpty()) throw new IllegalArgumentException("array list is empty");
        int maxValue = nums.get(0);
        int minValue = nums.get(0);
        int diff;
        for(Integer num : nums) {
            if(num > maxValue) {
                maxValue = num;
            }
            if(num < minValue) {
                minValue = num;
            }
        }
        diff = maxValue - minValue;
        return diff;
    }

    
    public static int bigDiff_Problem_0_fe7602b8_1e5f_4c46_94ec_ef932b6e64f3(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_1_943ad178_2296_4e2d_9606_400241fefc60(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_eb021ebe_0d22_4db8_adf2_88e913b08e1f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_07f31056_b5b8_41ea_b9af_cc19c8b53076(ArrayList<Integer> nums) {
        Integer max = Collections.max(nums);
        Integer min = Collections.min(nums);
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_0_c944ca51_278d_428a_b5d5_cb9b0f5736cc(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ff046637_3ea1_4c8f_8484_a78da02dd3ef(ArrayList<Integer> nums) {
        Collections.sort(nums);
        Integer max = nums.get(0);
        Integer min = nums.get(0);
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            } else if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

}
