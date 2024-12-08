package mbpp_62_smallest_num;

public class mbpp_62_smallest_num {

    
    public static int smallestNum_Problem_2_b208da69_b1e6_497b_8069_356385b0f92c(ArrayList<Integer> xs) {
        int lowest = Integer.MAX_VALUE;
        for (Integer val : xs) {
            if (lowest > val) {
                lowest = val;
            }
        }
        return lowest;
    }

    
    public static int smallestNum_Problem_2_04dfa6ba_9f69_4a10_bc8c_4622d909ede8(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (int x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_2_7acada82_098f_4818_9602_f88757bb14a7(ArrayList<Integer> xs) {
        int min = xs.get(0); // initialize to first element.
        for(int num : xs) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_0_cb4767ac_c586_4f8e_9f80_93e1e9499d08(ArrayList<Integer> xs) {
        int min = xs.get(0);
        for (int i = 1; i < xs.size(); i++) {
            if (xs.get(i) < min) {
                min = xs.get(i);
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_0_34415c88_7d65_4703_bb81_3c760a562af5(ArrayList<Integer> xs) {
        int length = xs.size();
        if (length == 0) return 0;
        int min = xs.get(0);
        for (int i = 1; i < length; i++) {
            if (xs.get(i) < min) {
                min = xs.get(i);
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_0_6043d082_9a3e_4709_b75f_ea8c72912a34(ArrayList<Integer> xs) {
        int minNum = xs.get(0), maxNum = xs.get(0);
        for (Integer num : xs) {
            if (num < minNum)
                minNum = num;
            if (num > maxNum)
                maxNum = num;
        }
        return minNum;
    }

    
    public static int smallestNum_Problem_1_23423810_1b88_4531_b67d_4e10ed21137d(ArrayList<Integer> xs) {
        // Write your code here
        int minValue = xs.get(0);
        for (Integer i : xs) {
            if (i.compareTo(minValue) < 0) {
                minValue = i;
            }
        }
        return minValue;
    }

    
    public static int smallestNum_Problem_0_7acada82_098f_4818_9602_f88757bb14a7(ArrayList<Integer> xs) {
        int min = xs.get(0); // initialize to first element.
        for(int num : xs) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_1_8410fa2e_8c43_49a3_a058_0b138a9ad50b(ArrayList<Integer> xs) {
        Integer min = Integer.valueOf(xs.get(0));
        for (Integer x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_2_4cee5c63_52dd_4296_b5a0_00ade5fdb607(ArrayList<Integer> xs) {
        int minNum = xs.get(0);
        for(int i = 0; i < xs.size(); i++){
            if(xs.get(i) < minNum)
                minNum = xs.get(i);
        }
        return minNum;
    }

    
    public static int smallestNum_Problem_1_04dfa6ba_9f69_4a10_bc8c_4622d909ede8(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (int x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_1_4cee5c63_52dd_4296_b5a0_00ade5fdb607(ArrayList<Integer> xs) {
        int minNum = xs.get(0);
        for(int i = 0; i < xs.size(); i++){
            if(xs.get(i) < minNum)
                minNum = xs.get(i);
        }
        return minNum;
    }

    
    public static int smallestNum_Problem_2_c30b5e9a_3eb0_4030_9afd_f670e25da706(ArrayList<Integer> xs) {
        int smallest = Integer.MAX_VALUE;
        for (Integer value : xs) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    
    public static int smallestNum_Problem_0_012a8982_d691_4612_b2ba_b64ef4ab608e(ArrayList<Integer> xs) {
        // write code here
        int min = xs.get(0);
        for (int num : xs) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_1_1faee522_37dc_4db5_8120_511abe220458(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (Integer x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_0_89ffd52f_e5df_4575_adc3_976344ad9de6(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (Integer x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_2_edbb5a27_fc7e_4437_a3ef_670eadc198e3(ArrayList<Integer> xs) {
        int smallestNum_Problem_2_edbb5a27_fc7e_4437_a3ef_670eadc198e3 = xs.get(0);
        for(int i = 1 ; i < xs.size() ; i++) {
            if(smallestNum_Problem_2_edbb5a27_fc7e_4437_a3ef_670eadc198e3 > xs.get(i)) {
                smallestNum_Problem_2_edbb5a27_fc7e_4437_a3ef_670eadc198e3 = xs.get(i);
            }
        }
        return smallestNum_Problem_2_edbb5a27_fc7e_4437_a3ef_670eadc198e3;
    }

    
    public static int smallestNum_Problem_1_8932e98d_c79e_42c4_8797_dd59544f3e1b(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (Integer x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_2_04b5c466_5229_462d_b280_06c71e8001a6(ArrayList<Integer> xs) {
        int smallest = xs.get(0); // initialize smallest to first element
        for (Integer x : xs) {
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;
    }

    
    public static int smallestNum_Problem_2_0228b814_ac2f_49a3_b6de_dd4615fe3545(ArrayList<Integer> xs) {
        int result = Integer.MAX_VALUE;
        for (int num : xs) {
            if (num < result) {
                result = num;
            }
        }
        return result;
    }

    
    public static int smallestNum_Problem_2_35f86c79_51f8_4f28_a80b_4db64ec37a3b(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for(int x : xs)
            if(x < min)
                min = x;
        return min;
    }

    
    public static int smallestNum_Problem_0_6da02128_b831_46e0_9156_ea66e16e72e7(ArrayList<Integer> xs) {
        // Write your code here.
        int smallest = Integer.MAX_VALUE;
        for (Integer num : xs) {
            if (num < smallest)
                smallest = num;
        }
        return smallest;
    }

    
    public static int smallestNum_Problem_2_3ee6ca9a_6c64_4837_b51c_8690234a8d36(ArrayList<Integer> xs) {
        int min = xs.stream().min(Integer::compareTo).get();
        int max = xs.stream().max(Integer::compareTo).get();
        return min > max ? min : max;
    }

    
    public static int smallestNum_Problem_2_3872b92e_3f75_43d2_bb51_184ba3a34432(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (Integer num: xs) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_1_89ffd52f_e5df_4575_adc3_976344ad9de6(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (Integer x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_1_35f86c79_51f8_4f28_a80b_4db64ec37a3b(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for(int x : xs)
            if(x < min)
                min = x;
        return min;
    }

    
    public static int smallestNum_Problem_0_6ab86d55_1330_4aeb_97d2_035ba6709a8d(ArrayList<Integer> xs) {
        int minNum = xs.get(0); // First element in the list is the smallest number

        for (int i = 1; i < xs.size(); i++) { // Iterate from 2nd to the last element
            if (xs.get(i) < minNum) {
                minNum = xs.get(i);
            }
        }
        return minNum;
    }

}
