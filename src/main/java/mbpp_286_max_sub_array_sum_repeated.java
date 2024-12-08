package mbpp_286_max_sub_array_sum_repeated;

public class mbpp_286_max_sub_array_sum_repeated {

    
    public static int maxSubArraySumRepeated_Problem_0_a2cc35bc_5c1a_4004_ae3f_31e1c6e32de6(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            int[] temp = new int[a.size()];
            System.arraycopy(a.toArray(), 0, temp, 0, a.size());
            int sum = 0;
            int endSum = 0;
            for (int j = 0; j < temp.length; j++) {
                sum += temp[j];
                endSum += temp[j];
            }
            if (endSum > maxSum) {
                maxSum = endSum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_7f114fe3_9210_4657_bd5d_04f787faa448(ArrayList<Integer> a, int n, int k) {
        // write your code here
        int max = 0, cur = 0;
        for(int i=0; i < k; i++){
            cur = 0;
            for(int j=a.size()-1; j>=0; j--){
                cur += a.get(j);
                if(cur > max){
                    max = cur;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_4cb9a616_0433_4c26_a743_cab9cb80d5d5(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_4cb9a616_0433_4c26_a743_cab9cb80d5d5(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_26e8f176_7816_48c2_921b_5bfe1c0a7990(ArrayList<Integer> a, int n, int k) {
        // Write your code here.
        ArrayList<Integer> max = new ArrayList<>();
        int ans = 0, sum = 0;
        for (int i = 0; i < n; ++i) {
            sum = 0;
            int count = 0;
            int j = i;
            while (j < n && count < k) {
                sum += a.get(j);
                ++count;
                ++j;
            }
            ans = Math.max(ans, sum);
            max.add(sum);
        }
        Collections.sort(max);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5010e500_f36c_4d6b_bd3d_e9960585bc4d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int max_element = 0;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (max_element < 0) {
            return max_element;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        int ans = Math.max(max_sum, sum * k);
        int prefix = 0;
        for (int i = 0; i < n; i++) {
            prefix += a.get(i);
            int suffix = sum - prefix;
            ans = Math.max(ans, prefix + suffix * (k - 1));
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_0b1182f2_a6f6_42e0_bcb5_643e7964d9d0(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        max_wrap = max_wrap * (k - 2);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_f8e08938_2b9f_48c1_8308_8bfb22ea4c00(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += (k - 1) * a.get(i);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_6cefffc8_86df_46df_b137_75cfac6efbe4(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = max_wrap * k;
        if (max_wrap > 0)
            max_so_far = Math.max(max_so_far, max_wrap);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_da1cb5a8_edac_4502_b51b_f46a3c667951(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int max_wrap_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_wrap_ending_here += a.get(i);
            if (max_wrap_ending_here < 0)
                max_wrap_ending_here = 0;
            if (max_wrap < max_wrap_ending_here)
                max_wrap = max_wrap_ending_here;
        }
        int ans = max_so_far + (k - 2) * max_wrap;
        return Math.max(ans, max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d7b73bf6_1f63_4f10_b3a7_9bc46c24b9e2(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (max_wrap > 0)
            return Math.max(max_so_far, max_wrap * (k - 2) + max_so_far);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d5764c1c_29cc_45a2_bfb8_54294e7acc2b(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int max_wrap = sum + maxSubArraySumRepeated_Problem_2_d5764c1c_29cc_45a2_bfb8_54294e7acc2b(a, n, 1);
        return Math.max(max_wrap, max_sum * k);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_27e6f578_63ea_4fde_ae06_faa116998539(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + a.get(i);
        }
        int max_sum = 0;
        int max_sum_i = 0;
        for (int j = 0; j < k; j++) {
            sum = sum + a.get(j);
            if (sum > max_sum) {
                max_sum = sum;
                max_sum_i = j;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_ef4d34d8_80b3_4f42_a5c4_4fc602d7f8c6(ArrayList<Integer> a, int n, int k) {
        
        // Your code goes here
        
        return -1;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_2a14690a_4e68_4b9b_8c2d_9fee0b1cdbd8(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_2a14690a_4e68_4b9b_8c2d_9fee0b1cdbd8(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_6e88db2d_9de8_4f7e_82b7_1c1b18397f46(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        int ans = max_sum + (k - 2) * max_wrap;
        return Math.max(ans, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_ae18d352_cef1_45a5_9e1b_f575b7c18fd8(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            curr_sum += a.get(i);
            curr_sum = Math.max(curr_sum, 0);
            max_wrap = Math.max(max_wrap, curr_sum);
        }
        if (max_wrap > 0) {
            return Math.max(max_wrap, max_sum + (k - 2) * sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_4262a450_1811_42f2_be7b_275dad18ff98(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_6cefffc8_86df_46df_b137_75cfac6efbe4(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = max_wrap * k;
        if (max_wrap > 0)
            max_so_far = Math.max(max_so_far, max_wrap);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_2b2277d5_2c9e_4beb_9824_047c38ed257d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        max_wrap = max_wrap * (k - 2);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_60f03be5_d9ed_4a26_978f_85effc8bcd80(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int ans = max_so_far;
        ans = Math.max(ans, max_wrap + (k - 2) * max_wrap);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_c63ce041_c6f1_41df_9a28_f7f219339775(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < a.size() - k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_91a97dc4_af70_45d2_a528_90fd4c60cb2f(ArrayList<Integer> a, int n, int k) {
        int largestSum = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a.get(j);
            }
            largestSum = Math.max(largestSum, sum);
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_e629903e_eff5_4fa9_a86f_101da5be1d46(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_so_far = sum;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = max_so_far * k;
        if (max_sum < sum)
            max_sum = sum;
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_4cb9a616_0433_4c26_a743_cab9cb80d5d5(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_4cb9a616_0433_4c26_a743_cab9cb80d5d5(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_52cea992_c04b_455a_a3a1_a9861215e2c6(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_wrap) {
                max_wrap = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 2) {
            return max_wrap;
        }
        int ans = Math.max(max_wrap, max_sum + (k - 2) * sum);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_06fe1616_e8e9_4808_94ea_4e06e372d043(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int temp = 0;
        for(int i = 0; i < a.size(); i++) {
            temp = temp + a.get(i);
            if(temp == k) {
                temp = 0;
                for (int j = i + 1; j < a.size(); j++) {
                    temp += a.get(j);
                    if (temp > max_sum) {
                        max_sum = temp;
                    }
                }
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_547b1cf3_60d5_4229_85b4_5e53d2bca533(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_ce6ff9aa_5b65_4d1e_9f87_96365d6033b3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (sum < 0)
            return max_so_far;
        int max_sum = max_so_far;
        int min_sum = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here > max_sum)
                max_sum = max_ending_here;
            if (max_ending_here < min_sum)
                min_sum = max_ending_here;
        }
        int max_wrap = 0;
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here > max_wrap)
                max_wrap = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        return Math.max(max_sum, max_wrap + (k - 2) * sum + min_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_03c93aa3_3533_435d_972d_55c11a01b000(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        int count = 0;
        for(int i = 0; i < a.size(); i++) {
            for(int j = 0; j < a.size() - i; j++) {
                sum = a.get(j) + a.get(j + i);
                if(count >= k && sum > sum) {
                    sum = sum;
                }
                count++;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_08612910_17e9_493d_96c0_36265c8c6ee8(ArrayList<Integer> a, int n, int k) {
        // Complete this function
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get((i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_fa257d72_6c72_4a4c_9f83_26110f6950a9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1)
            return max_sum;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_0_fa257d72_6c72_4a4c_9f83_26110f6950a9(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_75db17a4_8bac_46db_8ffc_f6e14053af3c(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_cd0b8145_d915_48f7_8984_0e90c7071209(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        ArrayList <Integer> newArr = new ArrayList <Integer> (a.size());
        for( int i = 1 ; i < k ; i++ ) {
            sum = sum + a.get (i) - a.get (0);
            newArr.add (sum);
            sum = 0;
        }
        for( int i = 0 ; i < a.size()-k ; i++ ) {
            sum = a.get(i) + newArr.get(i);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_7122830b_8c4d_4801_8163_5b9103177290(ArrayList<Integer> a, int n, int k) {
        int sum = 0; // Initialize sum to zero

        // Iterate over every element in the array
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i); // Add the element to the sum

            // Repeat the element k times
            for (int j = 0; j < k; j++) {
                a.set(i, sum); // Add the sum to the element
                sum = 0; // Reset the sum
            }
        }

        // Return the sum of the final element
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_b15bff6f_5cac_4b0f_b243_c648a182e027(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            sum += a.get(i);
            if (min_sum > sum) {
                min_sum = sum;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        int max_wrap = sum - min_sum;
        if (max_wrap > 0) {
            return Math.max(max_wrap, max_so_far + (k - 2) * sum);
        } else {
            return Math.max(max_wrap, max_so_far);
        }
    }

    
    public static int maxSubArraySumRepeated_Problem_2_34fb0372_48ff_4324_b928_acc19bb8689a(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a.get(i);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d23777d0_5eff_4d22_93fb_74dc5be1b6ef(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                temp.add(a.get(i));
                sum -= temp.get(i);
                temp.set(i, sum);
                sum += temp.get(i);
            }
            result.add(sum);
            sum = 0;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i : result){
            if(i > max)
            {
                max = i;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_02cc070a_195d_4db8_bccb_c51728460eeb(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_ae18d352_cef1_45a5_9e1b_f575b7c18fd8(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            curr_sum += a.get(i);
            curr_sum = Math.max(curr_sum, 0);
            max_wrap = Math.max(max_wrap, curr_sum);
        }
        if (max_wrap > 0) {
            return Math.max(max_wrap, max_sum + (k - 2) * sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_408113fb_cc03_4dbb_9c1f_a1c5ee839e43(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_ae18d352_cef1_45a5_9e1b_f575b7c18fd8(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            curr_sum += a.get(i);
            curr_sum = Math.max(curr_sum, 0);
            max_wrap = Math.max(max_wrap, curr_sum);
        }
        if (max_wrap > 0) {
            return Math.max(max_wrap, max_sum + (k - 2) * sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_27e6f578_63ea_4fde_ae06_faa116998539(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + a.get(i);
        }
        int max_sum = 0;
        int max_sum_i = 0;
        for (int j = 0; j < k; j++) {
            sum = sum + a.get(j);
            if (sum > max_sum) {
                max_sum = sum;
                max_sum_i = j;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_4eb65041_e41c_4891_815d_73616b2d1130(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_02b68d71_acfb_4db2_a5fc_7731ca8e5b19(ArrayList<Integer> a, int n, int k) {
        // write your code here
        if (n < 2)
            return 0;
        ArrayList<Integer> repeat = new ArrayList<Integer>();
        int max = 0;
        int maxDiff = 0;
        int diff = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum = 0;
            diff = n;
            repeat.clear();
            for (int j = 0; j < k; j++) {
                if (i == j) {
                    sum += a.get(i);
                    repeat.add(i);
                } else {
                    sum += a.get(i);
                    diff--;
                    if (diff == 0) {
                        repeat.add(j);
                    }
                }
            }
            if (sum > max)
                max = sum;
            diff = n - sum;
            if (diff > maxDiff)
                maxDiff = diff;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_fbfb4217_9bb3_4b1d_9291_208935ed0bd9(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_fbfb4217_9bb3_4b1d_9291_208935ed0bd9(a, n, k);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_bbd7265e_ae2d_4fa5_9863_899db1ff362e(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_bbd7265e_ae2d_4fa5_9863_899db1ff362e(a, n, 1);
        if (max_wrap > max_so_far)
            max_so_far = max_wrap;
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_2b2277d5_2c9e_4beb_9824_047c38ed257d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        max_wrap = max_wrap * (k - 2);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_1c636457_e34f_4731_8113_d051e69328cd(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_40ffb74f_8580_460d_8156_999e69aaa143(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_eb7d8ff9_2d61_45ce_84ce_f037bc44ee1d(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> modified = new ArrayList<Integer>();
        ArrayList<Integer> repeated = new ArrayList<Integer>();

        for(int i=0; i < n; i++) {
            for(int j=i; j < n; j++) {
                int temp = a.get(i);
                a.set(j, a.get(i));
                a.set(i, temp);
            }
        }

        for(int i=0; i < k; i++) {
            modified.addAll(a);
            repeated.addAll(a);
        }

        // Find the difference between all consecutive sums
        int diff = 0;
        for(int i=0; i < k; i++) {
            diff += repeated.get(i);
            repeated.removeAll(modified);
        }

        return diff;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_31f768c2_1088_4ac9_a5a5_2530c5df042d(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_60f03be5_d9ed_4a26_978f_85effc8bcd80(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int ans = max_so_far;
        ans = Math.max(ans, max_wrap + (k - 2) * max_wrap);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_0c24483e_a894_40c5_b622_34a84cd0d7e0(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, a.get( i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get( i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, (max_wrap * (k - 2)) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_7b990626_1dca_459d_b977_aa5a02fbea1c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (max_element < 0) {
            return max_element;
        }
        int max_wrap = 0;
        int wrap_sum = 0;
        for (int i = 0; i < n; i++) {
            wrap_sum += a.get(i);
            max_wrap = Math.max(max_wrap, wrap_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        return Math.max(max_sum, max_wrap + (k - 2) * wrap_sum + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_69c8dd6a_5595_4a7e_a13c_1badaa0daefa(ArrayList<Integer> a, int n, int k) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum = sum + a.get(i);
            if (sum > max)
                max = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_66c89115_17c3_4a65_869e_4ebc1d57d423(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int maxSum = 0;
        // Create a list to store all the sums of the sub-array and store it in the list sum
        for(int i = 0; i < k; i++){
            sum.add(0L);
        }
        for(int i = 0; i < n; i++){
            int index = 0;
            for(int j = 0; j < k; j++){
                if(j >= sum.get(j)) {
                    index++;
                }
                sum.set(j, index+sum.get(j));
            }
            maxSum = Math.max(maxSum, sum.get(0));
            sum.remove(0);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_8e6ed806_6590_4b52_acf8_4715e494e753(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, -a.get( i));
        }
        int min_wrap = 0;
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum > 0) {
                curr_sum = 0;
            }
            min_wrap = Math.min(min_wrap, curr_sum);
        }
        max_wrap = max_wrap + min_wrap;
        if (max_wrap > 0) {
            max_sum = Math.max(max_sum, (max_wrap * (k - 2)) + max_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_8e6ed806_6590_4b52_acf8_4715e494e753(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, -a.get( i));
        }
        int min_wrap = 0;
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum > 0) {
                curr_sum = 0;
            }
            min_wrap = Math.min(min_wrap, curr_sum);
        }
        max_wrap = max_wrap + min_wrap;
        if (max_wrap > 0) {
            max_sum = Math.max(max_sum, (max_wrap * (k - 2)) + max_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_e5d96fa3_abb1_498c_9e7e_71d101a959cb(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (max_element < 0)
            return max_element;
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a.get(i);
        int max_wrap = sum * k;
        int max_non_wrap = max_so_far;
        return Math.max(max_wrap, max_non_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5830d948_b92e_4d4a_b08b_3af5b49912d3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_afb739c1_bb37_4dc8_bea8_b78156842a9b(ArrayList<Integer> a, int n, int k) {
        int ans = 0;
        int i = 0, j = 0;
        ArrayList<Integer> b = new ArrayList<>();
        while (i<n) {
            b.add(a.get(i));
            i++;
        }
        while (k>0) {
            j++;
            b.add(0,k);
            k--;
        }
        while (b.get(i+1)+b.get(i+2)<=n) {
            ans = Math.max(ans, b.get(i)+b.get(i+1)+b.get(i+2));
            i++;
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5d98751e_ae3d_4b89_b07d_c312619e3039(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < k; i++) {
            temp.add(a.get(i));
        }
        for(int i = 0; i < k; i++) {
            sum = 0;
            for(int j = 0; j < n; j++) {
                sum += a.get(j);
            }
            sum -= temp.get(i);
            if((sum > maxSum) && (sum > 0)) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_df76f3a6_6b83_4866_b936_58dc34797ab5(ArrayList<Integer> a, int n, int k) {
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            ArrayList<Integer> b = new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                b.add(a.get(j));
            }
            sum += maxSubArraySumRepeated_Problem_2_df76f3a6_6b83_4866_b936_58dc34797ab5(b,n,k);
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_17d138af_9a5d_4af7_8158_3e1a55f38f89(ArrayList<Integer> a, int n, int k) {
        int maxSum = Integer.MIN_VALUE;
        
        // Create array list containing all permutations of k elements
        ArrayList<ArrayList<Integer>> perms = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>(a);
            Collections.shuffle(list);
            perms.add(list);
        }

        // Iterate through all permutations
        for (ArrayList<Integer> perm : perms) {
            // Get the sum of the permutation, add that sum to maxSum
            int sum = 0;
            for (int x : perm) {
                sum += x;
            }
            int tempMaxSum = sum + maxSum;
            if (tempMaxSum > maxSum) {
                maxSum = tempMaxSum;
            }
        }

        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_ec015b97_e1d1_4a74_9b95_20c61e646b47(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0, curr_sum = 0;
        for(int i=0; i<n; i++) {
            curr_sum += a.get(i);
            if(curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        int max_wrap = 0;
        for(int i=0; i<n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        curr_sum = 0;
        for(int i=0; i<n; i++) {
            curr_sum += a.get(i);
            if(curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        max_sum = Math.max(max_sum, max_wrap);
        if(k == 1) {
            return max_sum;
        }
        return Math.max(max_sum, max_wrap + maxSubArraySumRepeated_Problem_0_ec015b97_e1d1_4a74_9b95_20c61e646b47(a, n, k-2));
    }

    
    public static int maxSubArraySumRepeated_Problem_1_0ac693a3_4881_49d1_a6d6_f759154bedc4(ArrayList<Integer> a, int n, int k) {
        int largeSum = Integer.MIN_VALUE;
        // Find starting point of array list
        int start = 0;
        // Find length of array list
        int len = 0;
        // Find length of repeating array list
        int lenOfRep = 0;
        // Find starting point of repeating array list
        int startOfRep = 0;
        // Loop to find length of array list and length of repeating array list
        for (int i = 0; i < (2 * k - 1); i++) {
            if (a.size() > (2 * k - 1)) {
                len = a.size() - i;
            } else {
                len = i;
            }
            if (i < k) {
                lenOfRep = a.size() - i;
            } else {
                lenOfRep = i;
            }
            // Find largest sum possible from repeating array list
            if (lenOfRep > largeSum) {
                largeSum = lenOfRep;
                start = i;
                startOfRep = startOfRep + i;
            }
        }
        // Loop to find largest sum from array list
        int largeSum2 = 0;
        // Loop to find largest sum possible from array list
        for (int i = start; i < a.size(); i++) {
            if (a.size() > (2 * k - 1)) {
                largeSum2 = largeSum2 + a.get(i);
            } else {
                largeSum2 = largeSum2 + a.get(i);
            }
            if (largeSum2 > largeSum) {
                largeSum = largeSum2;
            }
        }
        return largeSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_326567b5_8342_4635_a391_60384fc5f259(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_c25d4d12_9af5_43c0_ab69_141f01f62c08(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_4d51c89c_7a2c_4116_8be4_c473c620c4b3(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_a7a5f0c2_f5fb_4b1c_8695_c1d97f117e3e(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += a.get(j);
                if (sum > k) {
                    sum = k;
                    break;
                }
            }
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_a7fa060f_c04f_4c7a_8ef2_e0cecdbda04b(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_b70796c7_9ade_4838_bedb_2317671f7f80(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get( i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, a.get( i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_b70796c7_9ade_4838_bedb_2317671f7f80(a, n, 1);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_66c89115_17c3_4a65_869e_4ebc1d57d423(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int maxSum = 0;
        // Create a list to store all the sums of the sub-array and store it in the list sum
        for(int i = 0; i < k; i++){
            sum.add(0L);
        }
        for(int i = 0; i < n; i++){
            int index = 0;
            for(int j = 0; j < k; j++){
                if(j >= sum.get(j)) {
                    index++;
                }
                sum.set(j, index+sum.get(j));
            }
            maxSum = Math.max(maxSum, sum.get(0));
            sum.remove(0);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_f00bae17_63e3_4593_80e6_898fde0e50f9(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < a.size() - k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_f1ee8bf8_d39f_4b85_b06f_99520eb9ef49(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max = 0;
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        for (int i=0; i<n; i++) {
            arrayList.add(a.get(i));
        }
        ArrayList <Integer> temp = new ArrayList<Integer>();
        for (int i=0; i<k; i++) {
            for(int j=0; j<arrayList.size(); j++) {
                temp.add(arrayList.get(j));
            }
            arrayList.clear();
            arrayList.addAll(temp);
        }
        for (int i=0; i<arrayList.size(); i++) {
            sum+=arrayList.get(i);
            if(sum>max)
                max = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_079470ba_f848_40ba_b2ab_e32b921d6ef4(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        max_wrap = max_wrap + max_wrap;
        if (max_wrap > max_sum) {
            max_sum = max_wrap;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_8aa9dcb4_4214_4f9d_a29d_8c304fb4ff36(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = max_wrap * k;
        if (max_wrap > 0)
            max_so_far = Math.max(max_so_far, max_wrap);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_6f1fe79f_0270_4a98_8f76_5cf586607842(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a.get(i);
            if (max_sum < sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap = max_wrap + a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_0_6f1fe79f_0270_4a98_8f76_5cf586607842(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        if (max_wrap > max_sum) {
            max_sum = max_wrap;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5de1210c_90aa_4f85_871c_c4b2517ec3b1(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum = curr_sum - a.get(i) + a.get( (i + n));
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_10e91119_c0ac_42b6_b8f9_b12d5b5815c0(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        ArrayList<Integer> b = new ArrayList<>(a);
        for(int i = 0; i <k; i++) {
            sum = sum + b.get(i);
        }
        int count = 0;
        for(Integer d : b) {
            sum += d;
            count++;
            if(b.get(count) == 0) {
                b.remove(count);
            }
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_2a14690a_4e68_4b9b_8c2d_9fee0b1cdbd8(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_2a14690a_4e68_4b9b_8c2d_9fee0b1cdbd8(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_9c3d8393_98c2_48a1_a67d_5c3028ea8a25(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_84c39e44_3b00_4ca0_9bcc_32318bd29628(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_element = Collections.max(a);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        if (sum > 0) {
            max_sum = sum * k;
        } else {
            max_sum = max_element;
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if ((max_so_far + (sum - max_so_far) * (k - 2)) > max_sum) {
            max_sum = max_so_far + (sum - max_so_far) * (k - 2);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_26e8f176_7816_48c2_921b_5bfe1c0a7990(ArrayList<Integer> a, int n, int k) {
        // Write your code here.
        ArrayList<Integer> max = new ArrayList<>();
        int ans = 0, sum = 0;
        for (int i = 0; i < n; ++i) {
            sum = 0;
            int count = 0;
            int j = i;
            while (j < n && count < k) {
                sum += a.get(j);
                ++count;
                ++j;
            }
            ans = Math.max(ans, sum);
            max.add(sum);
        }
        Collections.sort(max);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_467bb2fc_64c9_45b6_96e0_166f21a85c1a(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5de1210c_90aa_4f85_871c_c4b2517ec3b1(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum = curr_sum - a.get(i) + a.get( (i + n));
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d5a30aef_e10a_47ca_a5b3_e9fa65f4861a(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        for (int i=0; i<a.size(); i++) {
            int currSum = a.get(i);
            for (int j=i; j<a.size(); j++) {
                currSum += a.get(j);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_7b990626_1dca_459d_b977_aa5a02fbea1c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (max_element < 0) {
            return max_element;
        }
        int max_wrap = 0;
        int wrap_sum = 0;
        for (int i = 0; i < n; i++) {
            wrap_sum += a.get(i);
            max_wrap = Math.max(max_wrap, wrap_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        return Math.max(max_sum, max_wrap + (k - 2) * wrap_sum + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_1e139638_e491_49ca_bef7_3b27825278f3(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            curr_sum = curr_sum % n;
            max_wrap = Math.max(max_wrap, curr_sum);
        }
        int ans1 = max_wrap + (k - 2) * sum;
        int ans2 = max_sum;
        return Math.max(ans1, ans2);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d5a30aef_e10a_47ca_a5b3_e9fa65f4861a(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        for (int i=0; i<a.size(); i++) {
            int currSum = a.get(i);
            for (int j=i; j<a.size(); j++) {
                currSum += a.get(j);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d5764c1c_29cc_45a2_bfb8_54294e7acc2b(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int max_wrap = sum + maxSubArraySumRepeated_Problem_1_d5764c1c_29cc_45a2_bfb8_54294e7acc2b(a, n, 1);
        return Math.max(max_wrap, max_sum * k);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_c43f3077_b534_4e41_91b6_6ea5d8a09bc5(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_c43f3077_b534_4e41_91b6_6ea5d8a09bc5(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_663ba10c_6d51_4125_ae12_ecc91bd2fdb6(ArrayList<Integer> a, int n, int k) {
        int len = a.size();
        if(k < 1 || len < 2){
            return 0;
        }
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            sum += a.get(i);
            if(sum >= max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        sum = a.get(0);
        for(int i = 1; i < len; i++){
            sum += a.get(i);
            if(sum >= max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5519e66c_d34e_44aa_b078_aa94f2f1764b(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_02284ec3_c33f_4dd0_b373_706548e0d51d(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_e0d1ef75_e4c9_45d9_b8a7_6b66c55cf747(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_wrap) {
                max_wrap = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (max_wrap > 0) {
            return Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
        } else {
            return max_sum;
        }
    }

    
    public static int maxSubArraySumRepeated_Problem_2_6e88db2d_9de8_4f7e_82b7_1c1b18397f46(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        int ans = max_sum + (k - 2) * max_wrap;
        return Math.max(ans, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_a00105b8_d424_4e2f_91b6_991b323f5825(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_sum = sum * k;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        return Math.max(max_sum, max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_a1509676_7037_4b97_a8f1_ca5d14def6f3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

}
