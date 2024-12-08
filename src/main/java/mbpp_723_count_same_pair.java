package mbpp_723_count_same_pair;

public class mbpp_723_count_same_pair {

    
    public static int countSamePair_Problem_1_c8f602b0_410a_48ea_b8e3_dfcee301e6b6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2244c13c_7d95_41b2_9e91_1db507f07d1e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        int nums2index = 0;
        int nums1index = 0;
        int count = 0;
        while(nums2index < size) {
            if(nums1.get(nums1index) == nums2.get(nums2index)) {
                count++;
                nums1index++;
                nums2index++;
            } else if(nums1.get(nums1index) < nums2.get(nums2index)) {
                nums2index++;
            } else if(nums2.get(nums2index) < nums1.get(nums1index)) {
                nums1index++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_3f03b48b_ed42_4e73_a495_b3fc4fe6715b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_767b858d_40ef_4422_ac1d_352d89febf05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        int count = 0;
        int n1 = nums1.size();
        int n2 = nums2.size();
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_788f95d6_82c8_4f40_a93d_030ba9783e65(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_6dead7d2_d6a5_49d5_ab6e_8047bbf344c8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_29abdd1a_eafc_4f70_b13c_def7322a2bf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Return the length of the intest list that has the same value as the other
        // If the lists differ in length, return -1
        int length = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    length++;
                }
            }
        }
        return length;
    }

    
    public static int countSamePair_Problem_2_e603d3b6_276e_4422_8f03_4d20cd4970ff(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(nums2.get(0), 0);
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(0)) {
                count.put(nums2.get(0), count.get(nums2.get(0)) + 1);
            }
        }
        return count.entrySet().stream().filter(e -> e.getValue() > 1).count();
    }

    
    public static int countSamePair_Problem_2_9a8005da_291c_4cb9_a3fc_1c0580c60d44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        if (maxDiff > minDiff) {
            count += nums1.size() - 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ab9ca4a4_e160_47c5_813e_a1c3732497ba(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_108ec2c7_4594_4040_8ec1_0582a7a60559(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        HashSet<Integer> unique1 = new HashSet<>();
        for(Integer a: nums1) {
            unique1.add(a);
        }
        for(Integer b: nums2) {
            if(unique1.contains(b)) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_1_2ff53841_9f44_443d_b208_cac1eb75e523(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_767b858d_40ef_4422_ac1d_352d89febf05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        int count = 0;
        int n1 = nums1.size();
        int n2 = nums2.size();
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_bdfe56c2_0020_4704_8ad1_6864129c5357(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(set.contains(num1)) {
                count++;
            }
            else {
                set.add(num1);
            }
            if(set.contains(num2)) {
                count++;
            }
            else {
                set.add(num2);
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_3c61f428_8fb7_4d50_a989_c8624d6fbbdd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_7d2bd4ec_03ef_420b_9866_52cfb8762cc1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairCount = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    samePairCount++;
                }
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_0_e5a63b6f_82fe_4e3f_80a5_2130bee68516(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        int n = nums1.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_1_87ea1eef_907d_4391_bce8_78c1a5c5f187(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_4f9fcd48_8562_48fc_bae4_1e362854c442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // Initializing count with zero
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) { // Checks both lists elements match with the current index
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9bd62295_2b40_46f9_8fba_f38b8dae10e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] unique1 = new int[nums1.size()];
        int[] unique2 = new int[nums2.size()];

        // copy unique lists to new arrays
        for(int i = 0; i<nums1.size(); i++)
            unique1[i] = nums1.get(i);

        for(int i = 0; i<nums2.size(); i++)
            unique2[i] = nums2.get(i);

        // check if values in unique1 are in unique2
        for(int i = 0; i<unique1.length; i++)
            if(unique2[i] == unique1[i])
                return i;

        // if not, no pair
        return -1;
    }

    
    public static int countSamePair_Problem_0_c317d590_1a17_4610_ac0e_b1a28e49d333(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c0fcaf5e_10e0_4130_bedf_c62c09ffeb35(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_2_809e9efe_6ae4_44e9_81f1_2ea11bfb5fd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) return 0;
        
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c8c4f814_a289_425a_bcf3_06940de354e7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer l : nums1) {
            map.put(l, nums1.indexOf(l));
        }
        for(Integer l : nums2) {
            res += (map.get(l) == nums2.indexOf(l) ? 1 : 0);
        }
        return res;
    }

    
    public static int countSamePair_Problem_2_01419d17_58ce_4eb1_8ba2_2895fc96c04f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your logic here
        int numOne = 0;
        int numTwo = 0;
        int sum = 0;
        for(int i : nums1) {
            for(int j : nums2) {
                if(j == i) {
                    numOne++;
                }
                sum += j;
            }
        }
        if(numOne == nums2.size()) {
            return sum;
        } else {
            return -1;
        }
    }

    
    public static int countSamePair_Problem_1_e89be6d5_a503_4287_a787_edf2e3f99eb8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_8430d407_6e1a_47c3_9e7f_3deff02e6a75(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    i = nums1.size();
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a7c3580c_e4d9_44f6_a18c_560a26ca2720(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    ++count;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e350a083_9d46_435d_a2d9_d643888acc9b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len1 = nums1.size();
        int len2 = nums2.size();
        int count = 0;
        
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_1_9de087fe_23c7_452c_8c8c_3643cdc1eb77(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum = sum + Math.abs(nums1.get(i) - nums2.get(i));
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_e9597d77_dcce_4c69_aa1c_81e81d8562ea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int current1 = nums1.get(i);
            int current2 = nums2.get(i);
            if (current1 == current2) {
                count++;
            }
            if (current1 > max1) {
                max1 = current1;
            }
            if (current2 > max2) {
                max2 = current2;
            }
            if (current1 < min1) {
                min1 = current1;
            }
            if (current2 < min2) {
                min2 = current2;
            }
            sum += current1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d491774b_37f9_4692_a199_fab4706bd23a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> set1 = new HashSet<>(nums1);
        HashSet<Integer> set2 = new HashSet<>(nums2);
        for(Integer i : set1){
            if(set2.contains(i)){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e39e1f85_12a4_4242_9305_2c0aa3808e2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_1_2135c607_51f6_4df2_97f7_067bafd753db(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_ac24e08e_6cc2_4b7d_aaad_148b731308de(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int diff = 0;
        if (maxDiff != minDiff) {
            diff = maxDiff - minDiff;
        }
        if (diff > 0) {
            count = diff / 2;
        } else if (diff < 0) {
            count = diff / 2;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_b55a3fe7_8c06_47a8_91b0_5f9cae915cb5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_ad45f6d4_624d_4cc0_8c74_b1a21ac0e049(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_6dead7d2_d6a5_49d5_ab6e_8047bbf344c8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_f3dab9f7_6071_46b2_8eca_325dd5189801(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (size != nums2.size()) return 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2ad2d4f8_93be_42fb_bef3_b01658ef6e33(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream().mapToInteger(a -> nums2.indexOf(a)).filter(a -> a != -1).count();
    }

    
    public static int countSamePair_Problem_1_fcbe7463_3d9a_4ffa_b7e1_09a2107c6077(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        // Iterate through the first list
        for (int i = 0; i < nums1.size(); i++) {
            // Iterate through the second list
            for (int j = 0; j < nums2.size(); j++) {
                // If the current index is the same in the two lists, add 1 to sum
                if (nums1.get(i) == nums2.get(j)) {
                    sum += 1;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_85ff4fca_a553_4ce4_8e18_87c2c8eacdda(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp = 0;
        int temp2 = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f5808dbe_a9a6_4e3f_9a31_5a5d0477c051(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The number of pairs of equal values is the length of the intest array.
        int pairCount = 0;

        // Create a sorted list of all the values in the arrays. This list will be used to compare elements with the same values.
        ArrayList<Integer> values = new ArrayList<Integer>(nums1);
        for (int i = 0; i < nums1.size(); i++) {
            values.add(nums1.get(i));
        }

        // Create a sorted list of all the values in the arrays. This list will be used to compare elements with the same values.
        ArrayList<Integer> values2 = new ArrayList<Integer>(nums2);
        for (int i = 0; i < nums2.size(); i++) {
            values2.add(nums2.get(i));
        }

        // Compare the arrays. If two elements with the same values then increment the count for both arrays.
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values2.size(); j++) {
                if (values.get(i) == values2.get(j)) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }

    
    public static int countSamePair_Problem_3_ba3e1b62_3388_4831_8471_695e81ab85ec(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_6589e1d5_6290_464c_8ce1_ecc19a51cbd0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_c7547bea_2f56_4def_ace4_2b4114c3c0e5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_f53bdc11_ab49_4324_a56c_322807689442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int numSame = 0;

        // Sort the two lists so we can compare them
        ArrayList<Integer> numsList = nums2;
        Collections.sort(numsList);

        for(int i=0; i<nums2.size(); i++) {
            int index = Collections.binarySearch(numsList, nums2.get(i));
            if (index >= 0) {
                numSame += 1;
                numsList.remove(i);
            }
        }

        return numSame;
    }

    
    public static int countSamePair_Problem_3_e00942dc_6865_43fb_acb6_f3d322ad0ffc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e8f9ec08_66ed_4eaa_b1b8_c5b4a5737120(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a47dbf90_5b34_47cb_9829_1d2ef1787a6f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e669ad81_2b2f_4bb3_bac0_1ed348606454(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_c71f3729_249d_42c8_99a3_42aa3e718963(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(i == j) continue;
                if(nums1.get(i) == nums2.get(j)) sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_a82467b1_fd90_4d85_a971_1bb3f3b9bae1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int smallestNum = Collections.min(nums1);
        int largestNum = Collections.max(nums1);
        int smallestNum2 = Collections.min(nums2);
        int largestNum2 = Collections.max(nums2);

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == smallestNum && nums2.get(i) == largestNum) {
                count++;
            }
        }

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == smallestNum2 && nums2.get(i) == largestNum2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_850819b7_8423_4452_a692_3328eed8604d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        if(n != nums2.size()) {
            return 0L;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if(!map.containsKey(num1)) {
                map.put(num1, 0);
            }
            if(!map.containsKey(num2)) {
                map.put(num2, 0);
            }
            if(map.get(num1).equals(map.get(num2))) {
                map.put(num1, map.get(num1) + 1);
                map.put(num2, map.get(num2) + 1);
            }
        }
        int sum = 0L;
        for(Integer key : map.keySet()) {
            if(map.get(key).equals(2)) {
                sum += map.get(key);
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_76b24447_5f3d_4390_987f_b02379c96a02(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size1 = nums1.size();
        int size2 = nums2.size();
        int count = 0;
        if (size1 > size2) return count;
        for (int i = 0; i < size1; i++) {
            boolean same = True;
            for (int j = 0; j < size2; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same = False;
                }
            }
            if (same) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_90bc40bd_52f2_4675_8a75_4e8a6e9c0f90(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_4a2269ab_c51a_4ff1_9b79_2a9143bd296f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (size != nums2.size()) {
            return 0L;
        }
        int count = 0L;
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count += 1L;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_479a865f_d290_45fd_bc62_427f84d45bce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : nums1) set.add(num);
        for (Integer num : nums2) set.add(num);
        return set.stream().filter(i -> {
            return nums1.contains(i) && nums2.contains(i);
        }).count();
    }

    
    public static int countSamePair_Problem_2_277fbc1a_a6a2_435f_968f_957dbb952a2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            if(nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c71f3729_249d_42c8_99a3_42aa3e718963(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(i == j) continue;
                if(nums1.get(i) == nums2.get(j)) sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_479a865f_d290_45fd_bc62_427f84d45bce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : nums1) set.add(num);
        for (Integer num : nums2) set.add(num);
        return set.stream().filter(i -> {
            return nums1.contains(i) && nums2.contains(i);
        }).count();
    }

    
    public static int countSamePair_Problem_0_314ba713_988b_43ff_afe0_05e928642dc6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        ArrayList<Integer> temp = nums1;
        ArrayList<Integer> temp2 = nums2;
        while(!temp.isEmpty() && !temp2.isEmpty()) {
            Integer l1 = temp.get(0);
            Integer l2 = temp2.get(0);
            if(l1 == l2) count++;
            temp.remove(0);
            temp2.remove(0);
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_8e718b8f_725a_4224_ba48_3d76746b2ea6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int index = 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    index = i;
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_5582ebc7_4b06_411b_8b05_916a59152034(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int numCount = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                numCount++;
        }
        return numCount;
    }

    
    public static int countSamePair_Problem_2_9758c508_49e4_4ace_b5f1_3bb491566deb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0L;
        
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return counter;
        }
        
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                counter++;
            }
        }
        
        return counter;
    }

    
    public static int countSamePair_Problem_1_5582ebc7_4b06_411b_8b05_916a59152034(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int numCount = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                numCount++;
        }
        return numCount;
    }

    
    public static int countSamePair_Problem_3_53795a48_407d_4c02_91b8_cae9e5318a3b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a8153fb4_abc0_4b60_8929_aee54f335c9d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean found1 = False;
        boolean found2 = False;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                found1 = True;
                found2 = True;
            }
        }
        
        if(found1 == True && found2 == True) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_87ea1eef_907d_4391_bce8_78c1a5c5f187(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c6e46a25_f51f_4d7f_8d6a_3d60c45393dd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_8cbe3509_41ae_466a_9ffa_774dae767432(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1.size() != nums2.size())
            return -1;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_9576786b_5b18_4d6e_93e3_dfe598464a88(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c202f24c_2198_41db_8099_24b00e4bdd17(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int diff;
        for(int i = 0; i < nums1.size(); i++) {
            diff = nums1.get(i) - nums2.get(i);
            if(diff == maxDiff) {
                count++;
            }
            if(diff == minDiff) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9758c508_49e4_4ace_b5f1_3bb491566deb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0L;
        
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return counter;
        }
        
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                counter++;
            }
        }
        
        return counter;
    }

    
    public static int countSamePair_Problem_1_a1f7fc6e_c623_4dc9_a8a0_679c6b991ba5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_8e718b8f_725a_4224_ba48_3d76746b2ea6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int index = 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    index = i;
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ac064ae6_84c6_4e15_818a_27528bcb7e08(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a18e80c7_8f9f_49c7_aa7e_756609c66c56(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int num1Index = -1;
        int num2Index = -1;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                num1Index = i;
                num2Index = i;
            }
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                num1Index = i;
                num2Index = i;
            }
        }
        if(num1Index != -1 && num2Index != -1) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c64330bb_c32f_415e_9c15_44bfbff79c45(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_32222bbf_e35a_4f40_8748_d1c2a7027178(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a287326b_9c28_413e_ab06_615299d70b77(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_5b9d3358_fde4_4fa4_a266_6c2210a2cce4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_29723c65_ee60_486a_a6c8_97bae4b36093(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_37a93f64_8aa3_41d5_a901_fbd31fbe9dd5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] counts = new int[nums1.size()];
        // loop through all the numbers in the first list
        for (int i = 0; i < nums1.size(); i++) {
            // initialize a variable for storing the number of times
            // the array list has this number
            int same = 0;
            // loop through the second list to find how many times
            // this number appears
            for (int j = 0; j < nums2.size(); j++) {
                // if the first and second list have the same number
                // then the count++ will happen
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
            // update this array list with the current count for that
            // number
            counts[i] = same;
        }
        // return the total number of times each number appears
        return Arrays.stream(counts).sum();
    }

    
    public static int countSamePair_Problem_0_7ddd56b3_251e_4b86_b7fc_8b565b37ca6e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_3_565265ac_2757_42b7_80ee_008fee46a715(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_35b47115_9ad6_4ce2_8d32_7b9facb6b22b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums1){
            map.put(i,map.getOrDefault(i,0L)+1);
        }
        for (Integer i : nums2){
            map.put(i,map.getOrDefault(i,0L)+1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                count+=entry.getKey();
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_e9d62336_4745_4d14_b2fc_140bfd9a518e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return count;
        }
        
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_1_54581733_f93f_4cde_9188_98be577f9a74(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b8b3b937_0d91_456c_9432_a1642f81755e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean same = True;
        while ((same = True) && (nums1.size() > 0 && nums2.size() > 0)) {
            same = False;
            int smallest = nums1.size() > nums2.size() ? nums1.size() : nums2.size();
            int i = 0;
            int j = 0;
            if (smallest > 0) {
                for (; i <= smallest - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            if (smallest < nums1.size()) {
                for (; i <= nums1.size() - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            if (smallest > nums2.size()) {
                for (; i <= nums2.size() - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            i++;
            j++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_dca3f40a_720a_4575_9d79_6ff4a9c7b1ae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_dca3f40a_720a_4575_9d79_6ff4a9c7b1ae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_147d9870_e1a2_46fe_ae1e_400eaa80cf2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b6319d6d_24aa_41c9_8b01_9e2678ae0173(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_610cd7cf_dfcc_4ab0_977b_5b2597e7f3c9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int temp1 = nums1.get(0) - nums1.get(1);
        int temp2 = nums2.get(0) - nums2.get(1);
        if (temp1 == temp2) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_bc9c8dba_6a3b_44c1_bf7b_c0d98f4b9e26(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_017a8df9_29a2_41a8_a687_e20d05be8ec7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_bff862f1_a584_478d_91c1_30257a5112e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i < nums1.size(); i++){
            for(int j=0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2135c607_51f6_4df2_97f7_067bafd753db(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_5e0a4ab7_0492_4f23_8f91_186b6eea718e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        
        int count = 0;
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i = 0; i < nums1.size(); i++) {
            set1.add(nums1.get(i));
            set2.add(nums2.get(i));
        }
        
        Iterator<Integer> it1 = set1.iterator();
        Iterator<Integer> it2 = set2.iterator();
        
        while(it1.hasNext()) {
            if(it2.hasNext()) {
                if(it1.next() == it2.next()) {
                    count++;
                    it2.next();
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_2_267fbad1_dcce_44b2_bab3_a986a7e7ae97(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums2.contains(nums1.get(i))) { 
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f4c721d1_1d63_4b98_9fe9_a44c295150a7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_0_dd6b4816_d160_46c4_bee9_afb6ed032c96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for(int i = 0; i < nums1.size(); i++) {
            count += (sum - nums1.get(i)) * (sum - nums2.get(i));
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_89d619de_4027_47b9_afab_f04221b043b7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int pairs = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int countSamePair_Problem_2_d7af4d55_77d6_4858_b6b3_06e8aae90f93(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>(nums1);
        HashSet<Integer> set2 = new HashSet<Integer>(nums2);

        int count = 0;
        for(Integer key : set1) {
            if(set2.contains(key)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_fc6bba91_e60c_43b8_96c0_e38316686772(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_2_3a59db8f_2737_498d_8473_f083db2ec182(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7f2b645c_4e72_4c2e_b894_7349feb23d62(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int ret = 0;
        for (int i = 0; i < len; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_3_40f802c7_4ebc_406f_8bba_ebc21d02c153(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        int num;
        for(int i = 0; i < nums1.size(); i++){
            num = nums1.get(i);
            if(nums2.contains(num)){
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_2_1e280603_4027_4e40_aa3e_5f8532545ab2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_fb6046c8_2db1_4341_be8b_a6b68c52f551(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        for (Integer value : nums1) {
            if (value < min1) {
                min1 = value;
            }
            if (value > max1) {
                max1 = value;
            }
        }
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (Integer value : nums2) {
            if (value < min2) {
                min2 = value;
            }
            if (value > max2) {
                max2 = value;
            }
        }
        int index1 = 0;
        for (int value : nums1) {
            index1++;
            int index2 = 0;
            for (int value2 : nums2) {
                index2++;
                if (value == value2) {
                    count += (index1 - index2);
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_497dde6f_75cb_42db_83cf_57ff64fa0183(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_47981d37_f351_4c85_94bf_9a4b5e5a96cd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e89be6d5_a503_4287_a787_edf2e3f99eb8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d24350d7_3e07_4aff_ad5b_33995049da4e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    total++;
                }
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_3_c6e46a25_f51f_4d7f_8d6a_3d60c45393dd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_905a7640_6af0_41ea_811d_b2d8a0135f30(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if (nums1.size() != nums2.size()) return -1;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            if (nums1.get(i) != nums2.get(i)) break;
            result++;
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_497dde6f_75cb_42db_83cf_57ff64fa0183(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_8d977fe5_e560_44e2_bf73_a8d00a14e442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int num : nums1){
            for(int num2 : nums2){
                if(num == num2)
                    count += 1;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_982e0bcc_756f_4d03_a6b5_a431c6eda9d1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_1c99f120_d72e_494c_9b0d_0582514cb2f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    sum += i;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b05bb83f_072c_4b70_ae23_18f4bcb574df(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a8153fb4_abc0_4b60_8929_aee54f335c9d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean found1 = False;
        boolean found2 = False;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                found1 = True;
                found2 = True;
            }
        }
        
        if(found1 == True && found2 == True) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_65b20d2c_ea4c_4e86_aebc_6ede1c13ecf9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] num1 = nums1.stream().toArray(Integer[]::new);
        Integer[] num2 = nums2.stream().toArray(Integer[]::new);
        int count = 0;
        for(int i = 0; i < num1.length; i++) {
            if(num1[i] == num2[i]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_79ec09c3_7639_47a6_9344_86dbfce7d7b3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_aae1f94e_68f4_4db8_b399_464d9beb0275(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i : nums1){
            for(int j : nums2){
                if (i == j){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_809e9efe_6ae4_44e9_81f1_2ea11bfb5fd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) return 0;
        
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_6efdd30d_c8d5_4853_9d4d_fc49dda9e43d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] arr = new Integer[nums1.size()];
        nums1.toArray(arr);
        int ind = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_955c85fa_cc75_4db5_a6bd_b1b91787eb59(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO Auto-generated method stub
        int countSamePair_Problem_1_955c85fa_cc75_4db5_a6bd_b1b91787eb59 = 0;
        for(int i=0; i < nums1.size(); i++) {
            for(int j=0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_1_955c85fa_cc75_4db5_a6bd_b1b91787eb59++;
                }
            }
        }
        return countSamePair_Problem_1_955c85fa_cc75_4db5_a6bd_b1b91787eb59;
    }

    
    public static int countSamePair_Problem_0_329d772b_0bf9_428e_ab7c_bc8618a7faef(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            for (int j = 0; j < nums2.size(); j++) {
                if (num1.equals(nums2.get(j))) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c5f6b41f_a59e_4e96_b689_8ceb419b7590(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;

        // For each element in the arraylist
        for (int i : nums1) {
            for (int j : nums2) {
                // If the current number is the same
                if (i == j) {
                    // Add to the count
                    count++;
                    // Add 1 to the sum
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_aa14a5a2_6745_487a_a84e_7f6a20c888e8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_277fbc1a_a6a2_435f_968f_957dbb952a2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            if(nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_353c7d36_cc4f_4620_82a6_1a9e3ed0f3be(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        int n = nums1.size();
        for (int i = 0; i < n; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_500155ab_f771_4740_8474_f96d3ca17f8e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair=0;
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i)==nums2.get(j)) {
                    samePair++;
                }
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_1_024afd8f_4749_48ee_8f3a_8bd768d66e55(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        Iterator<Integer> itr = nums1.iterator();
        Iterator<Integer> itr2 = nums2.iterator();

        int first = itr.next();
        int second = itr2.next();

        while(itr.hasNext() && itr2.hasNext()) {
            if (itr.next() == itr2.next()) {
                count++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_1_560b6b79_b5ca_4381_878c_d2965407b4f5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i=0;i<nums1.size();i++) {
            if(nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_fe711868_bf83_40c6_80d5_d9b40dd96a60(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b8d8a20e_85dc_4771_a926_ff22acdfa9c0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count=0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_50e46fcf_325d_4f6c_8fa4_34a83d8abaf1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp;
        for (int i = 0; i < nums1.size(); i++) {
            temp = nums1.get(i);
            sum += temp;
            if (nums2.contains(sum)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_72876941_a980_4745_9c47_c1c346bc9234(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a8b6955a_9e11_4fd0_aaa9_ceb5e027bf3b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d29dd7a3_53b4_4b6e_b113_08d59b7345c4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
                    .filter(n -> nums2.contains(n))
                    .count();
    }

    
    public static int countSamePair_Problem_1_edf0c7d4_f150_43e2_a89e_07db83a57709(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        int[] map = new int[nums1.size()];
        for(int i = 0; i < nums1.size(); i++) {
            map[i] = nums1.get(i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(map[i] == nums2.get(i)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_3_d7849fe2_69bb_43e9_83a9_7d2bb741dc3a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=i+1; j<nums1.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_3_c5f6b41f_a59e_4e96_b689_8ceb419b7590(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;

        // For each element in the arraylist
        for (int i : nums1) {
            for (int j : nums2) {
                // If the current number is the same
                if (i == j) {
                    // Add to the count
                    count++;
                    // Add 1 to the sum
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_11acdbb1_4588_4f9b_a5ed_9f8ea648fb08(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        int max = Math.max(nums1.size(), nums2.size());
        for (int i = 0; i < max; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                same += 1;
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_0_c71f3729_249d_42c8_99a3_42aa3e718963(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(i == j) continue;
                if(nums1.get(i) == nums2.get(j)) sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_469cf4b3_9e3c_482f_a200_f9e047d4e555(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2746902a_2703_42d7_a476_b9ea95d424d6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Initialize a boolean to return False for first call
        boolean firstCall = True;
        int sameCount = 0;
        // Iterate through all indices 
        for (int i = 0; i < nums1.size(); i++) {
            if (firstCall) {
                // Initialize first index and flag as True
                firstCall = False;
                sameCount = 1;
            }
            else {
                // Initialize flag to False 
                sameCount = 0;
            }
            // Iterate through all indices to check for same values
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sameCount++;
                }
            }
            // If all indices are found equal to same value, increment count of pairs
            if (sameCount == nums2.size()) {
                sameCount++;
            }
        }
        return sameCount;
    }

    
    public static int countSamePair_Problem_1_23da1225_f0f2_4d93_a660_bf0e93df3095(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (nums1.size() != nums2.size()) {
            return 0;
        } else {
            int i = 0;
            int j = 0;
            while (i<nums1.size() && j<nums2.size()) {
                int num1 = nums1.get(i);
                int num2 = nums2.get(j);
                if (num1 == num2) {
                    i++;
                    j++;
                    result++;
                }
                if (num1 > num2) {
                    max = num2;
                } else {
                    min = num2;
                }
                if (max == min) {
                    break;
                }
                i++;
                j++;
            }
            if (i >= nums1.size()) {
                return result;
            } else {
                return 0;
            }
        }
    }

    
    public static int countSamePair_Problem_0_898ec38f_613f_40fd_95c3_5978bc5a49f7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d29dd7a3_53b4_4b6e_b113_08d59b7345c4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
                    .filter(n -> nums2.contains(n))
                    .count();
    }

    
    public static int countSamePair_Problem_2_a4ddc9f2_71e8_43b3_a263_f85434475915(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = nums1.get(nums1.size() / 2);
        int mid2 = nums2.get(nums2.size() / 2);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int midDiff = mid1 - mid2;
        int sumDiff = sum - midDiff;
        int diffDiff = maxDiff - minDiff;
        if (maxDiff == minDiff) {
            count++;
        }
        if (maxDiff == midDiff) {
            count += 2;
        }
        if (maxDiff == sumDiff) {
            count += 3;
        }
        if (maxDiff == diffDiff) {
            count += 4;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_6d8a5604_d7d0_48a4_9692_298a6ce90215(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_0c8d4fd0_5a0a_43b2_a21b_acc7821941cf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for(int j = i+1; j < nums1.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ab9ca4a4_e160_47c5_813e_a1c3732497ba(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_bf0e1ed6_f563_45c4_aa5e_9fc5c43e175d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7ded0297_0a04_4852_8b63_600bf042d8df(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_878d09da_9280_499e_9286_873e377b1e11(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countsame = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j))
                    countsame++;
            }
        }
        return countsame;
    }

    
    public static int countSamePair_Problem_1_5e0a4ab7_0492_4f23_8f91_186b6eea718e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        
        int count = 0;
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i = 0; i < nums1.size(); i++) {
            set1.add(nums1.get(i));
            set2.add(nums2.get(i));
        }
        
        Iterator<Integer> it1 = set1.iterator();
        Iterator<Integer> it2 = set2.iterator();
        
        while(it1.hasNext()) {
            if(it2.hasNext()) {
                if(it1.next() == it2.next()) {
                    count++;
                    it2.next();
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_0_87ccc802_d991_491d_a434_a5c5d9fc4fae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = Math.min(nums1.size(), nums2.size());
        int num = 0;
        for (int i = 0; i < len; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                num++;
            }
        }
        return num;
    }

    
    public static int countSamePair_Problem_3_ac24e08e_6cc2_4b7d_aaad_148b731308de(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int diff = 0;
        if (maxDiff != minDiff) {
            diff = maxDiff - minDiff;
        }
        if (diff > 0) {
            count = diff / 2;
        } else if (diff < 0) {
            count = diff / 2;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_9aba959a_31cd_46bf_8687_3d49336102a6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_eaeedb82_4727_4040_a515_b2607d0602a3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c7547bea_2f56_4def_ace4_2b4114c3c0e5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0c32bae8_656b_450f_887b_979e434ef05a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_93dd57ed_8b21_4998_af5b_1782de904f1f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_208adb6d_308d_45ac_91c4_18bfdf89fef1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_37a93f64_8aa3_41d5_a901_fbd31fbe9dd5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] counts = new int[nums1.size()];
        // loop through all the numbers in the first list
        for (int i = 0; i < nums1.size(); i++) {
            // initialize a variable for storing the number of times
            // the array list has this number
            int same = 0;
            // loop through the second list to find how many times
            // this number appears
            for (int j = 0; j < nums2.size(); j++) {
                // if the first and second list have the same number
                // then the count++ will happen
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
            // update this array list with the current count for that
            // number
            counts[i] = same;
        }
        // return the total number of times each number appears
        return Arrays.stream(counts).sum();
    }

    
    public static int countSamePair_Problem_0_3493c3cd_7163_4768_8a74_7f0844777dda(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_55213487_f399_4261_9f43_8069fe2ebc4f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7f9b13f0_bf5c_43c4_844f_03724ca58b7c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSame = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int l1 = nums1.get(i);
            int l2 = nums2.get(i);
            if (l1 == l2) countSame++;
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_2_610cd7cf_dfcc_4ab0_977b_5b2597e7f3c9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int temp1 = nums1.get(0) - nums1.get(1);
        int temp2 = nums2.get(0) - nums2.get(1);
        if (temp1 == temp2) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b9298177_5084_4f9e_9c23_ce68b9cfcb44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0, j = 0, same = 0;
        while (i < nums1.size()) {
            while (j < nums2.size()) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            i++;
        }
        return same;
    }

    
    public static int countSamePair_Problem_2_aaca1395_0d65_48b5_988a_9f94717e1253(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // Initialize count
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_bf0e1ed6_f563_45c4_aa5e_9fc5c43e175d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a18e80c7_8f9f_49c7_aa7e_756609c66c56(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int num1Index = -1;
        int num2Index = -1;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                num1Index = i;
                num2Index = i;
            }
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                num1Index = i;
                num2Index = i;
            }
        }
        if(num1Index != -1 && num2Index != -1) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_bbbce57b_a0b3_4fdd_9d3c_f091563af8e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7a2cb560_c8a2_4efd_a679_ba45414656d7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int countSamePair_Problem_2_7a2cb560_c8a2_4efd_a679_ba45414656d7 = 0;
        for(int i = 0; i <= nums1.size(); i++) {
            for(int j=0; j <= nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_2_7a2cb560_c8a2_4efd_a679_ba45414656d7++;
                }
            }
        }
        return countSamePair_Problem_2_7a2cb560_c8a2_4efd_a679_ba45414656d7;
    }

    
    public static int countSamePair_Problem_2_14201f96_86a1_4c43_b3c1_34a14ba14388(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_cf17457b_400e_4c26_9dda_a0f8a5913664(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = max1 + (max2 - min1) / 2;
        int mid2 = max1 + (max2 - min1) / 2;
        int mid = mid1 + (mid2 - min1) / 2;
        int diff1 = max1 - mid1;
        int diff2 = max2 - mid2;
        int diff = mid - min1;
        if (diff1 == diff2 && diff1 == diff) {
            count++;
            sum += max1 - min1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a18e80c7_8f9f_49c7_aa7e_756609c66c56(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int num1Index = -1;
        int num2Index = -1;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                num1Index = i;
                num2Index = i;
            }
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                num1Index = i;
                num2Index = i;
            }
        }
        if(num1Index != -1 && num2Index != -1) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_bf52c663_1a11_4919_b62f_4b894c45724a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    cnt += 1;
                    // break;
                }
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_2_1174586c_b5c1_425c_b104_cadf82e5463f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int l1 = nums1.size();
        int l2 = nums2.size();
        
        int i = 0, j = 0;
        
        while (i < l1 && j < l2) {
            if (nums1.get(i) == nums2.get(j)) {
                i++;
                j++;
            } else if (nums1.get(i) < nums2.get(j)) {
                i++;
            } else if (nums1.get(i) > nums2.get(j)) {
                j++;
            }
        }
        
        return i + j;
    }

    
    public static int countSamePair_Problem_1_ff678200_4142_42df_ac5c_ae90cc2b798d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_d634943e_ce51_4c67_aa3f_2b280d0a4d5a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_560b6b79_b5ca_4381_878c_d2965407b4f5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i=0;i<nums1.size();i++) {
            if(nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_c64330bb_c32f_415e_9c15_44bfbff79c45(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2ce37688_9d18_497f_be43_df2a802a0123(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_f437cd54_5ff6_495d_85c6_2d97de64c924(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_81bad13a_f668_471d_ac39_d5074ef13239(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> same = new ArrayList<Integer>();
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    same.add(nums1.get(i));
                }
            }
        }
        return same.size();
    }

    
    public static int countSamePair_Problem_2_2ebcf6ec_a4a7_40cf_86e1_28efcb51b694(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_833ba37b_e144_4e3c_a86d_5cbc188b092b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int length1 = nums1.size();
        int length2 = nums2.size();
        int count = 0;
        for(int i=0; i<length1; i++) {
            for(int j=0; j<length2; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f3a6ac92_d4d6_4b9a_ab91_6b481d32e5d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_d7af4d55_77d6_4858_b6b3_06e8aae90f93(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>(nums1);
        HashSet<Integer> set2 = new HashSet<Integer>(nums2);

        int count = 0;
        for(Integer key : set1) {
            if(set2.contains(key)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a3509190_ec94_45ba_abb8_217785409668(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
                .flatMap(i -> nums2.stream())
                .distinct()
                .count();
    }

    
    public static int countSamePair_Problem_1_d6707972_76c6_48f8_8c00_05ced137e08e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.size(); i++) {
            map.put(nums1.get(i), nums2.get(i));
        }
        int count = 0;
        for(Integer num: map.values()){
            if(map.get(num) != null){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ad45f6d4_624d_4cc0_8c74_b1a21ac0e049(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_105c3c5c_51da_41de_b076_fa175c98800a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    sum += i;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_d535ba10_b992_4cb6_8fcd_d1aa1fd51a94(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int cur1 = nums1.get(i);
            int cur2 = nums2.get(i);
            if(cur1 == max1 && cur2 == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_dee772ce_3899_4786_a38f_923eda682533(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int[] nums1s = new int[n];
        int[] nums2s = new int[n];
        for(int i = 0; i < n; i++) {
            nums1s[i] = nums1.get(i);
            nums2s[i] = nums2.get(i);
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(nums1s[i] == nums2s[i]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_63208cdf_ef18_455d_a4e2_f63a7e652492(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_b81696a0_875c_4b6f_8877_795fce15daba(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int x = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    x++;
                }
            }
        }
        return x;
    }

    
    public static int countSamePair_Problem_1_f8678f01_70c5_4bcc_a58f_47361dc2c31f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_905a7640_6af0_41ea_811d_b2d8a0135f30(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if (nums1.size() != nums2.size()) return -1;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            if (nums1.get(i) != nums2.get(i)) break;
            result++;
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_5aa9ef34_d651_4df4_99fb_58b740a4a4af(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_ece47310_ce07_4b66_8899_6c98d3cc003e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_0_0f1e6dd9_e245_4809_bf3c_4ccfdd3599d7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len = nums1.size();
        if(len == nums2.size()) {
            for(int i = 0; i < len; i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a38e76c5_3919_4e92_b0cf_2c0c1bd1eb31(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_6b746ac0_870c_4a81_afce_414d7ba03115(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) return 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_898ec38f_613f_40fd_95c3_5978bc5a49f7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_11d223a1_681c_4d9b_a673_853a7ee689ac(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9fde907f_3c72_4843_9e46_eaf4f551ebce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_bdb69997_a2bb_49e4_b5cf_be49d2037eb4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_5d956aa5_1f87_497e_bdcc_d2cbbd70732a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0, j = 0;
        int count = 0;
        for(; i < nums1.size() && j < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(j)) {
                count++;
                j++;
            } else {
                j = 0;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0f1e6dd9_e245_4809_bf3c_4ccfdd3599d7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len = nums1.size();
        if(len == nums2.size()) {
            for(int i = 0; i < len; i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_1ac70470_7fc1_4b62_984d_7ed55608e5f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_6cb1cf30_1f27_453e_9b0d_674c34eec94c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val = nums1.get(i);
            if (nums2.contains(val)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_1_329d772b_0bf9_428e_ab7c_bc8618a7faef(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            for (int j = 0; j < nums2.size(); j++) {
                if (num1.equals(nums2.get(j))) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_544a8313_1ae4_4ff0_af12_3fb217c4b143(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int N = nums1.size();
        int M = nums2.size();
        if (N == M) {
            int ans = 0;
            int num1 = 0;
            for (int i = 0; i < N; i++) {
                num1 = nums1.get(i);
                int num2 = nums2.get(i);
                if (num1 == num2) {
                    ans++;
                }
            }
            return ans;
        }
        return -1;
    }

    
    public static int countSamePair_Problem_3_558bde51_77d0_45ac_a57e_eaf373fb5ed7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_40f802c7_4ebc_406f_8bba_ebc21d02c153(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        int num;
        for(int i = 0; i < nums1.size(); i++){
            num = nums1.get(i);
            if(nums2.contains(num)){
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_2_40798809_6bbc_4264_9510_05430fd9749e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }

    
    public static int countSamePair_Problem_1_099615c3_7269_49d0_8072_0256c2f3fe0f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7557985a_1d77_4e22_8431_e67a1ac6fad2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return count;
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_9758c508_49e4_4ace_b5f1_3bb491566deb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0L;
        
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return counter;
        }
        
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                counter++;
            }
        }
        
        return counter;
    }

    
    public static int countSamePair_Problem_3_ece47310_ce07_4b66_8899_6c98d3cc003e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_0_4a2269ab_c51a_4ff1_9b79_2a9143bd296f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (size != nums2.size()) {
            return 0L;
        }
        int count = 0L;
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count += 1L;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2d0f8b37_5ea0_4297_b23f_6acc38efdb05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int n1:nums1){
            for(int n2:nums2){
                if(n1 == n2){
                    count ++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_ac81386a_6e3e_44a2_9fb1_4d17f84dba96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // your code here
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.size(); i++) {
            if (!set.add(nums1.get(i))) {
                return i;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (!set.add(nums2.get(i))) {
                return i;
            }
        }
        return nums1.size();
    }

    
    public static int countSamePair_Problem_3_e3668522_7441_456e_8153_198e775abcb1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_5b22ffee_ad6d_4584_b9a7_5a3144cc89ae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Loop over the 2 arrays
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                // Compare the 2 numbers 
                if (num1 == num2) {
                    // Increment the count
                    count++;
                }
            }
        }
        // Return the count variable
        return count;
    }

    
    public static int countSamePair_Problem_0_fcbe7463_3d9a_4ffa_b7e1_09a2107c6077(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        // Iterate through the first list
        for (int i = 0; i < nums1.size(); i++) {
            // Iterate through the second list
            for (int j = 0; j < nums2.size(); j++) {
                // If the current index is the same in the two lists, add 1 to sum
                if (nums1.get(i) == nums2.get(j)) {
                    sum += 1;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_f4c721d1_1d63_4b98_9fe9_a44c295150a7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_0_f67c9c7c_218e_469f_b4f7_b21ce5a5c611(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).intValue() == nums2.get(j).intValue()) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_696b79b0_87ab_4771_b09f_1c4553b16e05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        int cnt = 0;
        int i = 0, j = 0;
        while (i < nums1.size() && j < nums2.size()) {
            if (nums1.get(i).equals(nums2.get(j))) {
                cnt++;
                i++;
                j++;
            } else {
                i++;
                j++;
            }
        }
        res = cnt;
        return res;
    }

    
    public static int countSamePair_Problem_1_497dde6f_75cb_42db_83cf_57ff64fa0183(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d788aa26_d2d4_4105_9887_9030c1d4b17b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for(int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                same++;
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_1_93f0c9a8_4f16_4a41_b9b4_b2fbc29d7c38(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d989b7a6_98d8_4b4b_8f3c_d26f74205fbf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i).equals(nums2.get(i)))
                cnt++;
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_3_76ff891d_0186_4125_a733_ca21d0491574(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) {
            return count;
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_75c313b0_9393_4244_b11a_d0c8b65e945a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        int result = 0;
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += nums1.get(i);
            sum += nums2.get(i);
            for(int j = 1; j < size; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    result += 1;
                }
            }
        }
        return result - sum;
    }

    
    public static int countSamePair_Problem_3_2e882707_b49d_460d_98d4_e2e60f4d7665(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_a2012f0b_6c00_44ce_b7dc_9a70b1acadc6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_52074eea_4137_4169_9d7f_6970549321ad(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count = maxDiff - minDiff;
        } else {
            count = minDiff - maxDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_73af5a18_bd8e_447b_b78c_e4733c49c48e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Your code here
        int n1 = nums1.size();
        int n2 = nums2.size();
        if(n1 != n2){
            return 0;
        }
        int result = 0;
        for(int i=0; i<n1; i++){
            if(nums1.get(i) == nums2.get(i)){
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_a2012f0b_6c00_44ce_b7dc_9a70b1acadc6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_a4bf9141_864f_454a_ae8a_4ca305b71daa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_0_dd786725_836d_438a_8b2d_6019560b419b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
            sum = maxDiff + minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9c6dfb98_75dd_4c16_9552_876c8d1b9859(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return IntStream.range(0, nums1.size())
                .filter(i -> nums1.get(i) == nums2.get(i))
                .count();
    }

    
    public static int countSamePair_Problem_1_87ccc802_d991_491d_a434_a5c5d9fc4fae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = Math.min(nums1.size(), nums2.size());
        int num = 0;
        for (int i = 0; i < len; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                num++;
            }
        }
        return num;
    }

    
    public static int countSamePair_Problem_1_e985f31c_20b4_49f4_a240_ebf003533dc9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a4ddc9f2_71e8_43b3_a263_f85434475915(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = nums1.get(nums1.size() / 2);
        int mid2 = nums2.get(nums2.size() / 2);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int midDiff = mid1 - mid2;
        int sumDiff = sum - midDiff;
        int diffDiff = maxDiff - minDiff;
        if (maxDiff == minDiff) {
            count++;
        }
        if (maxDiff == midDiff) {
            count += 2;
        }
        if (maxDiff == sumDiff) {
            count += 3;
        }
        if (maxDiff == diffDiff) {
            count += 4;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_f8864eae_26c3_476c_aa98_8aee6889dd03(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(0);
        int max2 = nums2.get(0);
        int min1 = nums1.get(nums1.size()-1);
        int min2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f67c9c7c_218e_469f_b4f7_b21ce5a5c611(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).intValue() == nums2.get(j).intValue()) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_6e902d9f_c34a_451b_836e_59aa8bca3b57(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        int maxSum = nums1.stream().reduce(Integer::sum).get();
        int minSum = nums2.stream().reduce(Integer::sum).get();
        int sumDiff = maxSum - minSum;
        if (sumDiff != 0) {
            count = sumDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_ab089927_932c_4154_96bd_f05518875208(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
            .map(a -> nums2.indexOf(a))
            .filter( e -> e != -1 )
            .count();
    }

    
    public static int countSamePair_Problem_3_905a7640_6af0_41ea_811d_b2d8a0135f30(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if (nums1.size() != nums2.size()) return -1;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            if (nums1.get(i) != nums2.get(i)) break;
            result++;
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_8bd60857_85da_42fc_8c3d_76aeb46dece7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int temp;
        for(int i = 0; i < nums1.size(); i++) {
            temp = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(temp == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_982e0bcc_756f_4d03_a6b5_a431c6eda9d1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e59cf106_9b44_4178_9073_17beb35c4c45(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_696b79b0_87ab_4771_b09f_1c4553b16e05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        int cnt = 0;
        int i = 0, j = 0;
        while (i < nums1.size() && j < nums2.size()) {
            if (nums1.get(i).equals(nums2.get(j))) {
                cnt++;
                i++;
                j++;
            } else {
                i++;
                j++;
            }
        }
        res = cnt;
        return res;
    }

    
    public static int countSamePair_Problem_0_edf0c7d4_f150_43e2_a89e_07db83a57709(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        int[] map = new int[nums1.size()];
        for(int i = 0; i < nums1.size(); i++) {
            map[i] = nums1.get(i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(map[i] == nums2.get(i)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_1_b55a3fe7_8c06_47a8_91b0_5f9cae915cb5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_cdf3a5ed_06e5_4c27_8a1b_8c0ad8e4d55a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) return 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c8f602b0_410a_48ea_b8e3_dfcee301e6b6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_da135745_a753_4779_9bb5_850c739be176(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums1.size(); j++) {
                if (nums1.get(i).equals(nums1.get(j))) {
                    sum++;
                }
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums2.get(i).equals(nums2.get(j))) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_a9be8eff_0f23_4892_9633_d42b22cf74ce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList <Integer> temp = new ArrayList<>();
        ArrayList <Integer> newNums1 = new ArrayList<>();
        ArrayList <Integer> newNums2 = new ArrayList<>();
        for(int i=0; i<nums1.size(); i++) {
            int first = nums1.get(i);
            int second = nums2.get(i);
            if(first == second) {
                temp.add(first);
                temp.add(second);
            } else {
                newNums1.add(first);
                newNums2.add(second);
            }
        }
        int count = newNums1.size();
        return count;
    }

    
    public static int countSamePair_Problem_0_6f21b78d_5877_4098_aec0_6a510b9c8dd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) return count;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_5e0a4ab7_0492_4f23_8f91_186b6eea718e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        
        int count = 0;
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i = 0; i < nums1.size(); i++) {
            set1.add(nums1.get(i));
            set2.add(nums2.get(i));
        }
        
        Iterator<Integer> it1 = set1.iterator();
        Iterator<Integer> it2 = set2.iterator();
        
        while(it1.hasNext()) {
            if(it2.hasNext()) {
                if(it1.next() == it2.next()) {
                    count++;
                    it2.next();
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_2_bdfe56c2_0020_4704_8ad1_6864129c5357(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(set.contains(num1)) {
                count++;
            }
            else {
                set.add(num1);
            }
            if(set.contains(num2)) {
                count++;
            }
            else {
                set.add(num2);
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_fb6046c8_2db1_4341_be8b_a6b68c52f551(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        for (Integer value : nums1) {
            if (value < min1) {
                min1 = value;
            }
            if (value > max1) {
                max1 = value;
            }
        }
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (Integer value : nums2) {
            if (value < min2) {
                min2 = value;
            }
            if (value > max2) {
                max2 = value;
            }
        }
        int index1 = 0;
        for (int value : nums1) {
            index1++;
            int index2 = 0;
            for (int value2 : nums2) {
                index2++;
                if (value == value2) {
                    count += (index1 - index2);
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7f2b645c_4e72_4c2e_b894_7349feb23d62(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int ret = 0;
        for (int i = 0; i < len; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_1_43b35184_644b_4b0e_8647_9285c6b66232(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int value1 = nums1.get(i);
            int value2 = nums2.get(i);
            if (value1 == value2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_4cd30a25_cc91_4e46_9eba_312270a5bc39(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for (int i = 0; i < size; i++) {
            int a = nums1.get(i);
            int b = nums2.get(i);
            if (a == b) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_58174803_9a78_4a9d_b40d_df5034120cc5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int num_of_pairs = 0;
        int min_value = Math.min(nums1.size(), nums2.size());
        for (int i = 0; i < min_value; ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                ++num_of_pairs;
            }
        }
        return num_of_pairs;
    }

    
    public static int countSamePair_Problem_1_bf52c663_1a11_4919_b62f_4b894c45724a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    cnt += 1;
                    // break;
                }
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_1_d24350d7_3e07_4aff_ad5b_33995049da4e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    total++;
                }
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_1_7d299ce8_babc_437c_b1a5_7d071725471a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_469cf4b3_9e3c_482f_a200_f9e047d4e555(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d8b592f1_a846_4e79_aa0d_653bc9aeb6d5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countsame = 0;
        int x = nums1.get(0);
        int y = nums2.get(0);
        int count = 0;
        while (x != y) {
            if (x == nums2.get(0)) {
                count++;
            }
            countsame++;
            count++;
            x = nums1.get(0);
            y = nums2.get(0);
        }
        return countsame;
    }

    
    public static int countSamePair_Problem_2_6361c4cf_ab07_4ace_bfa6_8db420319269(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_9dbeef83_b934_4e7f_a6cd_efe57ffb205a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(num1 == num2) {
                count++;
            }
            if(num1 > max1 && num2 > max2) {
                max1 = num1;
                max2 = num2;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_767b858d_40ef_4422_ac1d_352d89febf05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        int count = 0;
        int n1 = nums1.size();
        int n2 = nums2.size();
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_fc6bba91_e60c_43b8_96c0_e38316686772(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_2_1569b77f_02e4_4cd0_a7e2_1fdbd659a6de(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // This first list will be used to track which positions in nums1 are used.
        ArrayList<Integer> used1 = new ArrayList<>();
        // This second list will be used to track which positions in nums2 are used.
        ArrayList<Integer> used2 = new ArrayList<>();

        int pairs = 0;

        for (int i = 0; i < nums1.size(); i++) {
            // If nums1[i] is in used2, then it is not possible that nums2[i] is in used1 as well. Hence, nums1[i] and nums2[i] cannot be in the same pair.
            if (used2.contains(nums2.get(i))) {
                pairs += 1;
                continue;
            }

            // If nums1[i] is not in used1, then we can use nums1[i]. nums2[i] can still be in used2 as well, so it is not possible that nums1[i] and nums2[i] have the same value.
            if (used1.contains(nums1.get(i))) {
                continue;
            }

            // nums1[i] is in used1 and nums2[i] is in used2. So now we have to see if nums1[i] and nums2[i] have the same value. That is, nums1[i] == nums2[i]. Do this by comparing each element in the lists.
            for (int j = 0; j < nums2.size(); j++) {
                // If the values match, then we have found a match.
                if (nums1.get(i) == nums2.get(j)) {
                    // Remember which positions we have seen nums1[i] and nums2[i]
                    used1.add(i);
                    used2.add(j);

                    // We have found a pair. Increment the total number of pairs found.
                    pairs += 1;
                    break;
                }
            }
        }

        return pairs;
    }

    
    public static int countSamePair_Problem_0_7974c722_3313_4eb8_b978_e7e586326c63(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int same = 0;
        for(Integer a: nums1) {
            if(set.contains(a)) {
                same++;
            }
            set.add(a);
        }
        for(Integer b: nums2) {
            if(set.contains(b)) {
                same++;
            }
            set.add(b);
        }
        return same;
    }

    
    public static int countSamePair_Problem_2_4a7a591a_d37b_44d3_9210_ba9e29cdc7f6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); ++i) {
            for(int j=0; j<nums2.size(); ++j) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2ad2d4f8_93be_42fb_bef3_b01658ef6e33(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream().mapToInteger(a -> nums2.indexOf(a)).filter(a -> a != -1).count();
    }

    
    public static int countSamePair_Problem_3_08bfb615_e4b3_4b33_a6cc_39db2e78491a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0;
        int count = 0;
        while (i < nums1.size()) {
            if (nums1.get(i) == nums2.get(i)) {
                count += 1;
            }
            i += 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_b6a5f03a_74fb_481a_84cb_3a9e5ce76001(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int numsSize = nums1.size();
        int nums2Size = nums2.size();
        int count = 0;
        int index = 0;
        if (numsSize < nums2Size) {
            while (index != numsSize - 1) {
                if (nums1.get(index) == nums2.get(index)) {
                    count++;
                    index++;
                } else if (nums2.get(index) == nums1.get(index)) {
                    count++;
                    index++;
                } else {
                    index++;
                }
            }
            return count;
        } else if (numsSize > nums2Size) {
            while (index != nums2Size - 1) {
                if (nums2.get(index) == nums1.get(index)) {
                    count++;
                    index++;
                } else if (nums1.get(index) == nums2.get(index)) {
                    count++;
                    index++;
                } else {
                    index++;
                }
            }
            return count;
        } else {
            return numsSize;
        }

    }

    
    public static int countSamePair_Problem_0_54581733_f93f_4cde_9188_98be577f9a74(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_13f295db_43f1_4e00_a41e_22164c823f41(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_565265ac_2757_42b7_80ee_008fee46a715(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c7c4cbfd_1f68_4579_a8f1_3ed3316d2516(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Set<Integer> set1 = new HashSet<Integer>(nums1);
        Set<Integer> set2 = new HashSet<Integer>(nums2);
        set1.removeAll(set2);
        return set1.size();
    }

    
    public static int countSamePair_Problem_3_7f6090c8_440e_44d2_ae36_d8f6f0d39bab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int len = nums1.size();
        if(len == 0 || nums2.size() == 0 || len != nums2.size()){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < len; i++){
            if(nums1.get(i) == nums2.get(i)){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9241711d_c7a6_4983_9af1_b5654ff0d370(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(num1 == num2) {
                count++;
            }
            if(num1 > max1 && num2 > max2) {
                max1 = num1;
                max2 = num2;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_bf52c663_1a11_4919_b62f_4b894c45724a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    cnt += 1;
                    // break;
                }
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_1_76b24447_5f3d_4390_987f_b02379c96a02(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size1 = nums1.size();
        int size2 = nums2.size();
        int count = 0;
        if (size1 > size2) return count;
        for (int i = 0; i < size1; i++) {
            boolean same = True;
            for (int j = 0; j < size2; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same = False;
                }
            }
            if (same) count++;
        }
        return count;
    }

}
