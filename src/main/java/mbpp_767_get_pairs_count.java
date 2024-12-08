package mbpp_767_get_pairs_count;

public class mbpp_767_get_pairs_count {

    
    public static int getPairsCount_Problem_0_bb69389e_bd00_41e0_b18d_434b9c5e458b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_a3da53cc_64f1_4276_93e6_9bb5968e16b2(ArrayList<Integer> arr, int sum) {
        // write your code here
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > sum) {
                count += 1;
            } else if (num == sum) {
                temp += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_6d6563b6_87d6_4403_9c3e_bb5e2378e8e5(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_60c8620c_dda7_4d1d_82f2_04b3097b2f24(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_3_46c8daa4_3e46_4ea1_89c2_d6d7f7f43859(ArrayList<Integer> arr, int sum) {
        // sort the array
        Collections.sort(arr);
        // set the two pointers
        int left = 0;
        int right = arr.size() - 1;
        int count = 0;
        while (left < right) {
            int s = arr.get(left) + arr.get(right);
            if (s == sum) {
                count++;
                left++;
                right--;
            } else if (s < sum) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_9f7b6fc3_f70a_4e9e_9f24_47dfd34ace0c(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_c0256a42_7b91_4d28_a243_604c6aeb1a93(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_193bddbf_f18c_4cb8_ab8f_662344f61d8e(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int l : arr) {
            for (int r : arr) {
                if (l + r == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_28775493_ead2_43ce_8a69_8b93a306de4b(ArrayList<Integer> arr, int sum) {
        int result = 0;
        int n = arr.size();
        for(int i: arr){
            for(int j: arr){
                if(i != j){
                    if(Math.abs(sum - i) + Math.abs(sum - j) == sum){
                        result++;
                    }
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_2_f3c04ce8_015a_4b16_9b35_1a65315c1a47(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int pairs = 0;
        for (int i = 0; i < size; i++) {
            int leftSum = arr.get(i);
            for (int j = i + 1; j < size; j++) {
                int rightSum = arr.get(j);
                if (leftSum + rightSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_ef53fe51_28ab_4a0b_bfad_64181237494c(ArrayList<Integer> arr, int sum) {
        return arr.stream()
                .map(num -> Math.abs(num - sum))
                .filter(i -> i >= 0)
                .count();
    }

    
    public static int getPairsCount_Problem_2_fb229b93_81b5_4511_a898_8a085c1f2d74(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_2124efb2_f6f7_473a_ac22_a098e6f84034(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (Integer l : arr) {
            for (Integer r : arr) {
                if (l != r) {
                    if (sum == sum) {
                        count += 2;
                    } else if (sum < sum) {
                        sum += l;
                        count += 2;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_e3bece64_7ba6_4582_a721_daf32362f9db(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (Integer num : arr) {
            pairs += arr.stream().filter(w -> w == num).count();
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_ce9aa73b_794b_4c32_b755_0626c11ecfb7(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_f1daef0b_fb4b_41b5_971a_46a195d2caef(ArrayList<Integer> arr, int sum) {
        // Write a loop to count the number of pairs whose sum is equal to ‘sum’
        // Your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_0_fe161724_555a_476e_bb90_7a3d4060f9d9(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int ans = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    ans++;
                }
            }
        }
        return ans;
    }

    
    public static int getPairsCount_Problem_2_7eab2bcf_d2ce_4fd2_bdfc_707bd3d2010b(ArrayList<Integer> arr, int sum) {
        if (sum < 0)
            return 0;
        if (arr.size() == 0)
            return 0;
        int count = 0; // counting the number of pairs whose sum is equal to sum
        for (int i : arr)
            for (int j : arr)
                if (i != j && sum - i + j == 0) // count if i and j are different 
                    count++;
        return count;
    }

    
    public static int getPairsCount_Problem_0_c4ef7a0a_264a_4c17_94da_1926208f1d1f(ArrayList<Integer> arr, int sum) {
        int count = 1;
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                count += arr.get(i) * arr.get(j);
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_e4de7784_a4ec_40b1_b302_460c61dc2f6d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_9f640c35_9d47_4db0_827b_c86055f3a7cd(ArrayList<Integer> arr, int sum) {
        int count = 0, pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                pairsCount++;
            }
            else
                count++;
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_3_30fad1e5_5e47_4784_83bf_b789c9c5e318(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sumOfArray = sumOfArray + arr.get(i);
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_28775493_ead2_43ce_8a69_8b93a306de4b(ArrayList<Integer> arr, int sum) {
        int result = 0;
        int n = arr.size();
        for(int i: arr){
            for(int j: arr){
                if(i != j){
                    if(Math.abs(sum - i) + Math.abs(sum - j) == sum){
                        result++;
                    }
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_0_bd142ef8_5b76_4414_8bce_76046e2d2dcf(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_0_193bddbf_f18c_4cb8_ab8f_662344f61d8e(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int l : arr) {
            for (int r : arr) {
                if (l + r == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_e3bece64_7ba6_4582_a721_daf32362f9db(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (Integer num : arr) {
            pairs += arr.stream().filter(w -> w == num).count();
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_a1f632fd_b8ec_4a07_a3b8_bc3c3372fe37(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int cur = arr.get(i);
            int next = arr.get(i + 1);
            if (cur + next == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_5e5914a9_e762_41b3_a3cb_15329ab4b53b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_3952898e_606b_490b_8f81_ea092ef4b72a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_eb48b50e_880b_4a97_b8d0_040966a37bce(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer num : arr) {
            if (num % 2 == 0 && num > 0 && sum % num == 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_1f4f5249_3fe2_4fcb_b3fb_c843d93bc938(ArrayList<Integer> arr, int sum) {
        int totalPairsCount = 0;
        for (int l : arr) {
            for (int r : arr) {
                if (l == r) {
                    continue;
                }
                if (l + r == sum) {
                    totalPairsCount++;
                }
            }
        }
        return totalPairsCount;
    }

    
    public static int getPairsCount_Problem_1_9ca0d72a_09e6_4ec0_9468_ab416e26d9dd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for( int i : arr){
            for( int j : arr){
                if((i+j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_7b9391b3_e63e_4cf1_a45a_574857db986e(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int count = 0;
        for(int i=0;i<arr.size();i++) {
            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i) + arr.get(j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_4fb72899_6e48_4d96_a410_382cc332e336(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        for (int i : arr) {
            sumOfArray -= i;
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_6920f4d1_6a3e_4a1f_8e30_ecb2d9251ba8(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_829538b5_7c91_4f4e_9652_0adf895c30dd(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_480dc5d0_5e0c_4ba4_8e18_ed74e24f09fc(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_d5a9c2cb_409e_49ba_96b8_73c73a773638(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size();i++) {
            for(int j = i+1; j<arr.size();j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_f71c56b0_b120_4857_841c_6e71fde29b03(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int l : arr) {
            for(int r : arr) {
                if(l != r) {
                    if(l == sum - r) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_30025980_552a_4adc_9c81_c94ac472463d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_bfa29432_5b82_4e62_adfe_7d4e07b3f687(ArrayList<Integer> arr, int sum) {
        int res = 0;
        for (int i : arr)
            for (int j : arr)
                if (i != j && sum - i != j && sum - j != i) {
                    ++res;
                }
        return res;
    }

    
    public static int getPairsCount_Problem_3_4d568a5e_ae70_4791_bbd8_ae188c15ba03(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_6d6563b6_87d6_4403_9c3e_bb5e2378e8e5(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_4d568a5e_ae70_4791_bbd8_ae188c15ba03(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_d7eae898_e211_459a_9284_624cabc4c3f3(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_e44e8316_a05f_4b1c_a337_ea03acf9ce72(ArrayList<Integer> arr, int sum) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total = total + arr.get(i);
            if (total > sum) {
                return i;
            }
        }
        return arr.size();
    }

    
    public static int getPairsCount_Problem_2_e383d20c_f4ee_4f97_a308_07ab03c220a7(ArrayList<Integer> arr, int sum) {
        return IntStream.range(0, arr.size() - 1).filter(i -> arr.get(i) + arr.get(i + 1) == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_3_54f84083_ae04_4eee_92c1_3ccaafd9f632(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_6920f4d1_6a3e_4a1f_8e30_ecb2d9251ba8(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_b87b3f65_a9fa_464d_ad4d_093481ca5f21(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_b6403572_72aa_4e1f_8705_2e3d284d1eee(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_7eab2bcf_d2ce_4fd2_bdfc_707bd3d2010b(ArrayList<Integer> arr, int sum) {
        if (sum < 0)
            return 0;
        if (arr.size() == 0)
            return 0;
        int count = 0; // counting the number of pairs whose sum is equal to sum
        for (int i : arr)
            for (int j : arr)
                if (i != j && sum - i + j == 0) // count if i and j are different 
                    count++;
        return count;
    }

    
    public static int getPairsCount_Problem_3_90799114_7c93_4c41_abe1_1ef3c806222f(ArrayList<Integer> arr, int sum) {
        if (arr.isEmpty() || sum < 0)
            return 0;

        // Use a map to count the number of pairs whose sum is equal to sum. 
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer l : arr) {
            map.put(l, map.containsKey(sum - l) ? map.get(sum - l) + 1 : 1);
        }

        return map.values().stream().distinct().count();
    }

    
    public static int getPairsCount_Problem_0_22e41848_69bb_462a_abfc_3024f58ab683(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int total = 0;
        int count = 0;
        // write your logic here
        for(int i=0; i<size; i++){
            total += arr.get(i);
            if(total == sum){
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_716c0b91_dafd_4f24_bb90_d2a9a41c0c4f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        ArrayList<Integer> ints = new ArrayList<>();
        arr.stream().mapToInteger(Integer::intValue).forEach(n-> {
            if (sum == n) {
                ints.add(n);
            }
        });
        for (int n : ints) {
            for (int m : ints) {
                if (n == m && n != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_bc9a3e97_04f4_4df2_9395_08268ab34907(ArrayList<Integer> arr, int sum) {
        int pairCount = 0;
        int currentSum = 0;
        for(int currentNum : arr) {
            currentSum += currentNum;
            if(currentSum == sum) {
                pairCount++;
            }
        }
        return pairCount;
    }

    
    public static int getPairsCount_Problem_2_ab8da46c_3928_46dc_b449_a8f7407d09c4(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_66f4e8e8_2f65_463f_966e_c5eb29c3f693(ArrayList<Integer> arr, int sum) {
        int numPairs = 0;
        for (Integer num : arr) {
            if (num.intValue() >= sum) {
                numPairs++;
            }
        }
        return numPairs;
    }

    
    public static int getPairsCount_Problem_0_17acc1b6_32e6_44b2_992f_d6abf4678a9f(ArrayList<Integer> arr, int sum) {
        int counter = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            int x = arr.get(i);
            int y = x + arr.get(i + 1);
            counter++;

            if (y == sum) {
                counter++;
            }
        }
        return counter;
    }

    
    public static int getPairsCount_Problem_0_1f4f5249_3fe2_4fcb_b3fb_c843d93bc938(ArrayList<Integer> arr, int sum) {
        int totalPairsCount = 0;
        for (int l : arr) {
            for (int r : arr) {
                if (l == r) {
                    continue;
                }
                if (l + r == sum) {
                    totalPairsCount++;
                }
            }
        }
        return totalPairsCount;
    }

    
    public static int getPairsCount_Problem_1_337f7552_6121_48e3_993c_f3454d2f25e2(ArrayList<Integer> arr, int sum) {
        //int count = 0L;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i< arr.size(); i++){
            sum1 = sum1 + arr.get(i);
        }
        for(int i=0; i< arr.size(); i++){
            sum2 = sum2 + arr.get(i);
        }
        //count = count++;
        int count = sum1 % sum2;
        return count;
    }

    
    public static int getPairsCount_Problem_2_e4f0fa0b_b9d5_4c58_b398_a19b2706a265(ArrayList<Integer> arr, int sum) {
        int total = 0;
        int count = 0;
        for (int i : arr) {
            if (total + i == sum) {
                total++;
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_ee80c815_30ed_419f_a493_63fd7a937e10(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_5ded4291_d2f9_43d8_842d_a0e4d8e466d6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i == j) continue;
                if (i + j == sum) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_66f4e8e8_2f65_463f_966e_c5eb29c3f693(ArrayList<Integer> arr, int sum) {
        int numPairs = 0;
        for (Integer num : arr) {
            if (num.intValue() >= sum) {
                numPairs++;
            }
        }
        return numPairs;
    }

    
    public static int getPairsCount_Problem_2_90f8eaed_2043_4d1f_a494_2d5d8c69f596(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_d26e16e7_9c49_449b_a201_978c517cef13(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_364be8d6_00b6_47b5_b3d0_7ef4089caa26(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_ee80c815_30ed_419f_a493_63fd7a937e10(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_a258942a_68c9_48a4_a446_67568d1994d9(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_5ded4291_d2f9_43d8_842d_a0e4d8e466d6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i == j) continue;
                if (i + j == sum) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_f24360b3_62fe_4bf6_9660_51c862abec6c(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (Integer x : arr) {
            pairs += arr.stream().filter((y) -> y == x).count();
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_4c43875b_9c19_44fe_82d7_24d9585f7a56(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_da68c33a_d916_4c5a_9419_04f0b9a27523(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_269b40e0_a21a_4b1e_ab92_afc82f509afe(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_34038a77_c265_4ae1_a9a7_3a1d76869f87(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int element : arr)
            if (element != 0 && element <= sum)
                count++;
        return count;
    }

    
    public static int getPairsCount_Problem_0_1c68ad62_0d63_43f0_8d9f_caab49eb0f52(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter((e) -> e % 2 == 0).mapToInteger(x -> x * x).sum();
    }

    
    public static int getPairsCount_Problem_3_7103d668_300c_4123_b1c4_9a30b913bfbb(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(i -> i + sum < sum).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_1_24311999_e86d_44a8_a9c0_b25f44a31b60(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (Integer n : arr) {
            if (sum - n == 0) {
                pairs++;
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_46c8daa4_3e46_4ea1_89c2_d6d7f7f43859(ArrayList<Integer> arr, int sum) {
        // sort the array
        Collections.sort(arr);
        // set the two pointers
        int left = 0;
        int right = arr.size() - 1;
        int count = 0;
        while (left < right) {
            int s = arr.get(left) + arr.get(right);
            if (s == sum) {
                count++;
                left++;
                right--;
            } else if (s < sum) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_a4ea5238_0045_4bbd_b969_124e7129e975(ArrayList<Integer> arr, int sum) {
        // initialize variables 
        int count = 0;
        int k = 0;
        int currentSum = 0;
        int sumOfNextTwoElements = -1;
        
        // traverse the array list 
        for(int i = 0; i < arr.size(); i++) {
            currentSum = arr.get(i);
            
            // if the current element sum is equal to sum, then increment the count 
            if(currentSum == sum) {
                count++;
            }
            // if current element sum is not equal to sum, then get the sum of next two elements 
            else if(currentSum != sum) {
                sumOfNextTwoElements = arr.get(i+1);
            }
        }
        
        // return the count 
        return count;
    }

    
    public static int getPairsCount_Problem_0_e803b43c_99e9_4719_b431_358d67a59159(ArrayList<Integer> arr, int sum) {
        // Write your code here.
        int count = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i);
        }
        if (sum1 == sum) {
            count += 1;
        }
        sum1 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i);
            if (sum1 == sum) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_b87b3f65_a9fa_464d_ad4d_093481ca5f21(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_863952c9_8791_4c88_a646_3b16f8684ad0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(i);
            int s = sum - n;
            if (s == 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_1434279b_aa51_4fd5_8805_e718ae18c643(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum)
                    count ++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_bb69389e_bd00_41e0_b18d_434b9c5e458b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_34ec04b7_85dd_40c7_84a6_63ac8820f400(ArrayList<Integer> arr, int sum) {
        return  arr.stream()
                .filter(x -> (x%2 == 0) || (x%2 == 1))
                .map(x -> x * x)
                .distinct()
                .filter(x -> x == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_3_ca6d972e_7309_4fa6_8c3d_419050a7bbcc(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_a92905f7_b5c4_4642_8eb8_4d19e41c667f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i : arr) {
            for(int j : arr) {
                if(i == j) {
                    continue;
                }
                if(sum - i == j - sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_bb69389e_bd00_41e0_b18d_434b9c5e458b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_fb229b93_81b5_4511_a898_8a085c1f2d74(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_84aec0ff_5e2d_4fe1_b6e7_00e04277490d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_44ff4dae_21fd_4a5c_85aa_2175c09169d8(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_25bd34f1_be57_4718_9931_413b6e773a00(ArrayList<Integer> arr, int sum) {
        int countPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    countPairs++;
                    break;
                }
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_3_39106257_0c2b_482f_8cc0_287cf6984d44(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        // Write code here
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_7eab2bcf_d2ce_4fd2_bdfc_707bd3d2010b(ArrayList<Integer> arr, int sum) {
        if (sum < 0)
            return 0;
        if (arr.size() == 0)
            return 0;
        int count = 0; // counting the number of pairs whose sum is equal to sum
        for (int i : arr)
            for (int j : arr)
                if (i != j && sum - i + j == 0) // count if i and j are different 
                    count++;
        return count;
    }

    
    public static int getPairsCount_Problem_0_628da007_86e7_4d73_a70b_cdc8e985f384(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (int i : arr) {
            if (sum - i != 0) {
                pairs += arr.indexOf(i + 1);
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_a258942a_68c9_48a4_a446_67568d1994d9(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_a27dd3d5_4d5a_49fa_99ff_99cbf4e12757(ArrayList<Integer> arr, int sum) {
        // code here
        return 0;
    }

    
    public static int getPairsCount_Problem_1_963963aa_aa8f_430a_a19f_b6286f06217e(ArrayList<Integer> arr, int sum) {
        // Create a Java stream on the array of numbers.
        int count = arr.stream().filter(num -> num % 2 == 0).count();
        // Return the number of pairs.
        return count;
    }

    
    public static int getPairsCount_Problem_1_954f6348_67a5_491a_b69c_854938e34a85(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (Integer i: arr) {
            for (Integer j: arr) {
                if (i != j && sum-i == j) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_ce9aa73b_794b_4c32_b755_0626c11ecfb7(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_60c8620c_dda7_4d1d_82f2_04b3097b2f24(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_1_60c8620c_dda7_4d1d_82f2_04b3097b2f24(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_2_f4b3917d_f84b_4b8c_a4a7_25056198d699(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // loop on each element and add it to the sum
        for (int element : arr) {
            sum += element;
            // loop on the elements of the list and compare if the sum of them is equal to the sum
            for (int element2 : arr) {
                if (element == element2) {
                    count++;
                    // if the sum of two elements are equal then the loop will stop
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_54f84083_ae04_4eee_92c1_3ccaafd9f632(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_4c43875b_9c19_44fe_82d7_24d9585f7a56(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_223fd504_afa3_41c1_9a20_982f024a2105(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1L);
            }
        }
        for (int i : arr) {
            if (map.containsKey(sum - i)) {
                count += map.get(sum - i);
                if (sum - i == i) {
                    count--;
                }
            }
        }
        return count / 2;
    }

    
    public static int getPairsCount_Problem_3_a81141a8_35a1_4b8b_b0b8_0d9b86354f81(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (Integer num : arr) {
            pairsCount += (Math.pow(sum, 2) - num * num);
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_cd74c722_fea1_47bf_bda0_3c8c822af76f(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        int sumOfArr = sum;
        for (Integer item : arr) {
            if (sumOfArr - item.intValue() > 0) {
                sumOfArr -= item.intValue();
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_e4f0fa0b_b9d5_4c58_b398_a19b2706a265(ArrayList<Integer> arr, int sum) {
        int total = 0;
        int count = 0;
        for (int i : arr) {
            if (total + i == sum) {
                total++;
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_f179b0c2_8303_4c58_911c_2d6a17ab9aa7(ArrayList<Integer> arr, int sum) {
        return IntStream.range(0, arr.size())
            .filter(i -> i + 1 < arr.size())
            .filter(i -> arr.get(i) == arr.get(i + 1))
            .filter(i -> arr.get(i).intValue() == sum)
            .count();
    }

    
    public static int getPairsCount_Problem_1_a585aeb3_cdd3_4f0e_afbb_189fc23851d1(ArrayList<Integer> arr, int sum) {
        int countPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int first = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int second = arr.get(j);
                if (first + second == sum) {
                    countPairs++;
                }
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_3_542d11a5_db65_45c3_9299_3fb1844d6d73(ArrayList<Integer> arr, int sum) {
        int totalPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            totalPairs += arr.get(i) * arr.get(i + 1);
        }
        totalPairs = totalPairs % 10000;
        int pairs = totalPairs / 2;
        int pairsRemainder = totalPairs - pairs;

        return totalPairs;
    }

    
    public static int getPairsCount_Problem_2_d7eae898_e211_459a_9284_624cabc4c3f3(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_364be8d6_00b6_47b5_b3d0_7ef4089caa26(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_a27dd3d5_4d5a_49fa_99ff_99cbf4e12757(ArrayList<Integer> arr, int sum) {
        // code here
        return 0;
    }

    
    public static int getPairsCount_Problem_2_f3d8d0da_8520_43f9_9053_6706904c1c64(ArrayList<Integer> arr, int sum) {
        // Your code here
        int count=0;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)<arr.get(j)){
                    count+=arr.get(i);
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_74b48fb1_f5a4_468a_89b2_8820d5e902af(ArrayList<Integer> arr, int sum) {
        int pairCount = 0;
        int sumOfArray = arr.stream().mapToInteger(a -> a).sum();

        for (int i : arr) {
            if (sum == sumOfArray) {
                pairCount++;
            }
        }
        return pairCount;
    }

    
    public static int getPairsCount_Problem_3_3f508ddd_b26d_4815_8a7f_cd28bbdeef0c(ArrayList<Integer> arr, int sum) {
        int countPairs = arr.stream().filter(i -> sum - i > 0).collect(Collectors.toList()).size();
        return countPairs;
    }

}
