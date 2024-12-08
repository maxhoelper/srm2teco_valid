package mbpp_306_max_sum_increasing_subseq;

public class mbpp_306_max_sum_increasing_subseq {

    
    public static int maxSumIncreasingSubseq_Problem_1_07960420_2d8d_4b69_a576_f258b0bceca0(ArrayList<Integer> a, int n, int index, int k) {
        // write your logic here
        return 0;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_27b29502_f208_45e8_8531_44f17cb1a12d(ArrayList<Integer> a, int n, int index, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (i == index) {
                sum += a.get(i);
                if (k <= index) {
                    sum += a.get(i);
                }
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_b3dbbdbb_4006_46bb_8561_a89d70b84554(ArrayList<Integer> a, int n, int index, int k) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a.get(i);
            if(sum > k) {
                break;
            }
        }
        return sum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_105bcdf0_e722_4fd5_984f_21b058dc720e(ArrayList<Integer> a, int n, int index, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (i == index) {
                max = Math.max(max, sum);
                sum = 0;
            }
            if (i == k) {
                max = Math.max(max, sum);
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_a29e884f_0c8d_435e_815e_f473d8766ad0(ArrayList<Integer> a, int n, int index, int k) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int maxSumIndexIncludingK = 0;
        for(int i = 0; i < n; i++) {
            if(i == index) {
                sum += a.get(i);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = i;
                    maxSumIndexIncludingK = i;
                }
            }
            else {
                sum = 0;
            }
        }
        if(k > maxSumIndexIncludingK) {
            return maxSum;
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_01c0c69f_086d_4467_a7af_119420fbff2c(ArrayList<Integer> a, int n, int index, int k) {
        // Write your logic here
        return 0;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_687e0adb_c17f_4908_b78d_62cd095f1136(ArrayList<Integer> a, int n, int index, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (i == index) {
                sum += a.get(i + 1);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_4f430589_c016_4447_ad2c_2bdc939451ec(ArrayList<Integer> a, int n, int index, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(sum > k) {
                sum -= a.get(i);
            }
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_2fb1e91d_01d0_47aa_a2e1_7677645a2eb8(ArrayList<Integer> a, int n, int index, int k) {
        int sum = 0;
        for (int i = index; i < k; i++) {
            sum += a.get( i);
        }
        return sum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_16e36c2d_6604_4e07_bcfa_389dccb556dc(ArrayList<Integer> a, int n, int index, int k) {
        // write your logic here
        return 0;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_b8697373_0e60_4fbf_892f_a1ccf77866bd(ArrayList<Integer> a, int n, int index, int k) {
        if (index == n) {
            return 0;
        }
        int ans = 0;
        for (int i = index; i < n; i++) {
            if (i < k) {
                ans = Math.max(ans, maxSumIncreasingSubseq_Problem_1_b8697373_0e60_4fbf_892f_a1ccf77866bd(a, n, i + 1, k) + a.get( i));
            } else {
                ans = Math.max(ans, maxSumIncreasingSubseq_Problem_1_b8697373_0e60_4fbf_892f_a1ccf77866bd(a, n, i + 1, k));
            }
        }
        return ans;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_e338cfa8_530a_4fcc_a117_139578ebe930(ArrayList<Integer> a, int n, int index, int k) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i == index) {
                sum = 0;
            }
            if(i == k) {
                break;
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_492641c5_658b_4184_b3c6_82051d772c40(ArrayList<Integer> a, int n, int index, int k) {
        return 0;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_43208c5d_d1a0_40fc_8723_e443d92b477a(ArrayList<Integer> a, int n, int index, int k) {
        if (index == n) {
            return 0;
        }
        int max = 0;
        for (int i = index; i < n; i++) {
            if (a.get(i) < a.get(k)) {
                max = Math.max(max, maxSumIncreasingSubseq_Problem_1_43208c5d_d1a0_40fc_8723_e443d92b477a(a, n, i + 1, k) + a.get(i));
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_75100aab_d792_40bc_a9c7_5575198ceaf3(ArrayList<Integer> a, int n, int index, int k) {
        // Write your code here
        int[] arr = new int[100];
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum = sum + a.get(i);
        }
        if (sum + k <= n) {
            arr[0] = sum + k;
            for (int i = 1; i < index; i++) {
                arr[i] = Math.max(arr[i-1], sum + a.get(i));
            }
        }
        int maxSum = 0;
        for (int i = 1; i < index; i++) {
            maxSum = Math.max(maxSum, arr[i]);
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_2_8554b9cf_2c02_416d_8e89_d379cad28ffb(ArrayList<Integer> a, int n, int index, int k) {
        // write your logic here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(i == index && i == k) {
                System.out.println();
            }
            System.out.print(a.get(i));
            System.out.println();
            if(a.get(i) < max) {
                max = a.get(i);
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_ba3de835_8449_46cd_a606_7115cbb5dd9c(ArrayList<Integer> a, int n, int index, int k) {
        // Write your code here
        return -1;
    }

    
    public static int maxSumIncreasingSubseq_Problem_2_462bd53b_e449_40e6_96e6_02bed23ee516(ArrayList<Integer> a, int n, int index, int k) {
        int maxSum = 0;
        for (int i = 0; i < index; i++) {
            if (a.get( i) < a.get( k)) {
                maxSum = Math.max(maxSum, maxSumIncreasingSubseq_Problem_2_462bd53b_e449_40e6_96e6_02bed23ee516(a, n, i, k));
            }
        }
        return maxSum + a.get( k);
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_75100aab_d792_40bc_a9c7_5575198ceaf3(ArrayList<Integer> a, int n, int index, int k) {
        // Write your code here
        int[] arr = new int[100];
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum = sum + a.get(i);
        }
        if (sum + k <= n) {
            arr[0] = sum + k;
            for (int i = 1; i < index; i++) {
                arr[i] = Math.max(arr[i-1], sum + a.get(i));
            }
        }
        int maxSum = 0;
        for (int i = 1; i < index; i++) {
            maxSum = Math.max(maxSum, arr[i]);
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_a29e884f_0c8d_435e_815e_f473d8766ad0(ArrayList<Integer> a, int n, int index, int k) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int maxSumIndexIncludingK = 0;
        for(int i = 0; i < n; i++) {
            if(i == index) {
                sum += a.get(i);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = i;
                    maxSumIndexIncludingK = i;
                }
            }
            else {
                sum = 0;
            }
        }
        if(k > maxSumIndexIncludingK) {
            return maxSum;
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_7849f969_cc3d_4d87_8b64_882d26bfbf21(ArrayList<Integer> a, int n, int index, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (i == index) {
                sum += a.get(i);
                max = Math.max(max, sum);
            }
            if (i == k - 1) {
                sum += a.get(i);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_bcc64b01_c9c8_4c81_8cc9_e81128dd27d5(ArrayList<Integer> a, int n, int index, int k) {
        if (index == n) {
            return 0;
        }
        int ans = maxSumIncreasingSubseq_Problem_1_bcc64b01_c9c8_4c81_8cc9_e81128dd27d5(a, n, index + 1, k);
        if (index < k) {
            ans = Math.max(ans, a.get( index) + maxSumIncreasingSubseq_Problem_1_bcc64b01_c9c8_4c81_8cc9_e81128dd27d5(a, n, index + 1, k));
        }
        return ans;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_a29e884f_0c8d_435e_815e_f473d8766ad0(ArrayList<Integer> a, int n, int index, int k) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int maxSumIndexIncludingK = 0;
        for(int i = 0; i < n; i++) {
            if(i == index) {
                sum += a.get(i);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = i;
                    maxSumIndexIncludingK = i;
                }
            }
            else {
                sum = 0;
            }
        }
        if(k > maxSumIndexIncludingK) {
            return maxSum;
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_efb30f92_4e0a_4d74_a014_c12cdbda879e(ArrayList<Integer> a, int n, int index, int k) {
        if (index == n) {
            return 0;
        }
        int ans = 0;
        if (a.get(index) < a.get(k)) {
            ans = a.get(index) + maxSumIncreasingSubseq_Problem_1_efb30f92_4e0a_4d74_a014_c12cdbda879e(a, n, index + 1, k);
        }
        ans = Math.max(ans, maxSumIncreasingSubseq_Problem_1_efb30f92_4e0a_4d74_a014_c12cdbda879e(a, n, index + 1, k));
        return ans;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_496c85fa_b08b_4b60_b68c_bd4da5c50f4b(ArrayList<Integer> a, int n, int index, int k) {
        int maxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; ++i) {
            map.put(a.get(i), a.get(i));
            for(int j = i + 1; j < n; ++j) {
                int s = map.get(a.get(j));
                map.put(a.get(j), s + a.get(j));
            }
            map.remove(a.get(i));
            int sum = map.get(k);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_01c0c69f_086d_4467_a7af_119420fbff2c(ArrayList<Integer> a, int n, int index, int k) {
        // Write your logic here
        return 0;
    }

    
    public static int maxSumIncreasingSubseq_Problem_2_496c85fa_b08b_4b60_b68c_bd4da5c50f4b(ArrayList<Integer> a, int n, int index, int k) {
        int maxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; ++i) {
            map.put(a.get(i), a.get(i));
            for(int j = i + 1; j < n; ++j) {
                int s = map.get(a.get(j));
                map.put(a.get(j), s + a.get(j));
            }
            map.remove(a.get(i));
            int sum = map.get(k);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_75100aab_d792_40bc_a9c7_5575198ceaf3(ArrayList<Integer> a, int n, int index, int k) {
        // Write your code here
        int[] arr = new int[100];
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum = sum + a.get(i);
        }
        if (sum + k <= n) {
            arr[0] = sum + k;
            for (int i = 1; i < index; i++) {
                arr[i] = Math.max(arr[i-1], sum + a.get(i));
            }
        }
        int maxSum = 0;
        for (int i = 1; i < index; i++) {
            maxSum = Math.max(maxSum, arr[i]);
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_6015a5f0_6460_4506_91f0_ae685981367c(ArrayList<Integer> a, int n, int index, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (i == index) {
                sum += a.get(i);
                if (sum > max) {
                    max = sum;
                }
                sum = 0;
            }
        }
        if (k > index) {
            sum += a.get(a.size() - 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_75100aab_d792_40bc_a9c7_5575198ceaf3(ArrayList<Integer> a, int n, int index, int k) {
        // Write your code here
        int[] arr = new int[100];
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum = sum + a.get(i);
        }
        if (sum + k <= n) {
            arr[0] = sum + k;
            for (int i = 1; i < index; i++) {
                arr[i] = Math.max(arr[i-1], sum + a.get(i));
            }
        }
        int maxSum = 0;
        for (int i = 1; i < index; i++) {
            maxSum = Math.max(maxSum, arr[i]);
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_2_3b44ef2e_7335_461a_b9d1_873158a70799(ArrayList<Integer> a, int n, int index, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i == index) {
                sum = 0;
            }
            if (i == k) {
                break;
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_0d810b73_f191_4331_aeb8_878e541bfbe8(ArrayList<Integer> a, int n, int index, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(sum > k) {
                sum -= a.get(i);
            }
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_692a7388_9cfc_4f5c_9897_aebcf5ce7730(ArrayList<Integer> a, int n, int index, int k) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < n; i++) {
            if(i == index || i == k) {
                sum += a.get(i);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = i;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_19eac42f_2f2a_41b4_8f00_bc48a0641246(ArrayList<Integer> a, int n, int index, int k) {
        int result = Integer.MAX_VALUE;
        int startIndex = -1;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (a.get(j) < index + k) break;
                sum += a.get(j);
            }
            if (sum > result) {
                result = sum;
                startIndex = i;
            }
        }
        return result;
    }

    
    public static int maxSumIncreasingSubseq_Problem_2_c2a7921f_e512_4737_9f00_1b50e95a839b(ArrayList<Integer> a, int n, int index, int k) {
        return -1;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_43208c5d_d1a0_40fc_8723_e443d92b477a(ArrayList<Integer> a, int n, int index, int k) {
        if (index == n) {
            return 0;
        }
        int max = 0;
        for (int i = index; i < n; i++) {
            if (a.get(i) < a.get(k)) {
                max = Math.max(max, maxSumIncreasingSubseq_Problem_1_43208c5d_d1a0_40fc_8723_e443d92b477a(a, n, i + 1, k) + a.get(i));
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_49d65055_ae2b_453e_b063_1b62a729a83c(ArrayList<Integer> a, int n, int index, int k) {
        int sum = 0, max = 0;
        for(int i=0; i < index; i++) {
            sum += a.get(i);
        }
        max = sum;
        if(sum < k) {
            max = Math.max(max, sum + maxSumIncreasingSubseq_Problem_1_49d65055_ae2b_453e_b063_1b62a729a83c(a, n, index, k - sum));
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_dde0fed3_0062_4a28_ac65_ef96d6f6632e(ArrayList<Integer> a, int n, int index, int k) {
        int maxSum = a.get(0);
        for (int i = 1; i < n; i++) {
            int currSum = a.get(i) + maxSum;
            if (currSum > index && currSum > k) {
                maxSum = a.get(i);
            } else if (currSum > index && currSum < k) {
                maxSum -= k;
            } else if (currSum < index && currSum < k) {
                maxSum += k;
            } else if (currSum < index && currSum > k) {
                maxSum -= k;
            }
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_1763c189_0b1a_4af3_82f9_b2db01da68a2(ArrayList<Integer> a, int n, int index, int k) {
        if (index == n) {
            return 0;
        }
        int ans = 0;
        if (a.get(index) < a.get(k)) {
            ans = a.get(index) + maxSumIncreasingSubseq_Problem_1_1763c189_0b1a_4af3_82f9_b2db01da68a2(a, n, index + 1, k);
        }
        ans = Math.max(ans, maxSumIncreasingSubseq_Problem_1_1763c189_0b1a_4af3_82f9_b2db01da68a2(a, n, index + 1, k));
        return ans;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_19eac42f_2f2a_41b4_8f00_bc48a0641246(ArrayList<Integer> a, int n, int index, int k) {
        int result = Integer.MAX_VALUE;
        int startIndex = -1;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (a.get(j) < index + k) break;
                sum += a.get(j);
            }
            if (sum > result) {
                result = sum;
                startIndex = i;
            }
        }
        return result;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_49d65055_ae2b_453e_b063_1b62a729a83c(ArrayList<Integer> a, int n, int index, int k) {
        int sum = 0, max = 0;
        for(int i=0; i < index; i++) {
            sum += a.get(i);
        }
        max = sum;
        if(sum < k) {
            max = Math.max(max, sum + maxSumIncreasingSubseq_Problem_0_49d65055_ae2b_453e_b063_1b62a729a83c(a, n, index, k - sum));
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_16e36c2d_6604_4e07_bcfa_389dccb556dc(ArrayList<Integer> a, int n, int index, int k) {
        // write your logic here
        return 0;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_da2eec66_44ac_458f_be87_316f6904b126(ArrayList<Integer> a, int n, int index, int k) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (i < index) {
                sum += a.get(i);
            } else if (i == index) {
                sum += a.get(i);
                maxSum = Math.max(maxSum, sum);
            } else {
                sum += a.get(i);
                sum += a.get(i) + a.get(i + 1);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_1763c189_0b1a_4af3_82f9_b2db01da68a2(ArrayList<Integer> a, int n, int index, int k) {
        if (index == n) {
            return 0;
        }
        int ans = 0;
        if (a.get(index) < a.get(k)) {
            ans = a.get(index) + maxSumIncreasingSubseq_Problem_0_1763c189_0b1a_4af3_82f9_b2db01da68a2(a, n, index + 1, k);
        }
        ans = Math.max(ans, maxSumIncreasingSubseq_Problem_0_1763c189_0b1a_4af3_82f9_b2db01da68a2(a, n, index + 1, k));
        return ans;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_3b44ef2e_7335_461a_b9d1_873158a70799(ArrayList<Integer> a, int n, int index, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i == index) {
                sum = 0;
            }
            if (i == k) {
                break;
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_8554b9cf_2c02_416d_8e89_d379cad28ffb(ArrayList<Integer> a, int n, int index, int k) {
        // write your logic here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(i == index && i == k) {
                System.out.println();
            }
            System.out.print(a.get(i));
            System.out.println();
            if(a.get(i) < max) {
                max = a.get(i);
            }
        }
        return max;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_f2dc3cf2_bba5_44f1_8d31_5aa2c9335791(ArrayList<Integer> a, int n, int index, int k) {
        // write your logic here
        int maxSum = 0;
        int currMax = Integer.MIN_VALUE;
        int currSum = 0;
        int totalSum = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            currSum+=a.get(i);
            curr=currSum;
            if(i<=index){
                sum+=currSum;
                if(sum>maxSum){
                    currMax=sum;
                    max=currMax;
                }
                currSum=sum;
                sum=0;
            }
            else{
                if(sum<=0){
                    currMax=max;
                }
                else{
                    sum=sum+a.get(i);
                    currSum=sum;
                }
            }
        }
        if(currMax>=k){
            maxSum=currMax;
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_1_830307ad_1f32_4cb0_9e6e_00a4043f1101(ArrayList<Integer> a, int n, int index, int k) {
        if(index == n) {
            return 0;
        }
        int sum = 0;
        for(int i = index; i < n; i++) {
            if(i == k) {
                sum = Math.max(sum, a.get(i) + maxSumIncreasingSubseq_Problem_1_830307ad_1f32_4cb0_9e6e_00a4043f1101(a, n, i + 1, k));
            } else {
                sum = Math.max(sum, a.get(i) + maxSumIncreasingSubseq_Problem_1_830307ad_1f32_4cb0_9e6e_00a4043f1101(a, n, i + 1, k));
            }
        }
        return sum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_da2eec66_44ac_458f_be87_316f6904b126(ArrayList<Integer> a, int n, int index, int k) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (i < index) {
                sum += a.get(i);
            } else if (i == index) {
                sum += a.get(i);
                maxSum = Math.max(maxSum, sum);
            } else {
                sum += a.get(i);
                sum += a.get(i) + a.get(i + 1);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    
    public static int maxSumIncreasingSubseq_Problem_0_6015a5f0_6460_4506_91f0_ae685981367c(ArrayList<Integer> a, int n, int index, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (i == index) {
                sum += a.get(i);
                if (sum > max) {
                    max = sum;
                }
                sum = 0;
            }
        }
        if (k > index) {
            sum += a.get(a.size() - 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

}
