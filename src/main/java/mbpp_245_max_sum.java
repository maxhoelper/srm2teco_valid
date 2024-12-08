package mbpp_245_max_sum;

public class mbpp_245_max_sum {

    
    public static int maxSum_Problem_0_f520c152_5053_46e8_b369_6210321b6c48(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < 0) {
                max = Math.max(max, sum);
            } else {
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_c9842102_5242_413d_9829_b3a753ac64fb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_87b6ee1a_5901_42e6_9365_0b8e67d26741(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_603b62f8_b7d7_4d83_9cd4_5bd038526cdd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e945d111_284f_481a_80da_4928c78f170b(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_33854ae3_b291_4378_97c4_883764f21c4c(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size()-1] = arr.get(arr.size()-1);
        for(int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size()-2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for(int j = arr.size()-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_6049422a_6562_446b_bf4e_1bca5e79afc9(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8ceebed5_4984_4f38_8bb7_30e9342c4db0(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_9ba85b9d_eb1f_496c_abea_4b7603ab87de(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cb36c30d_6f6b_48ef_8444_2b473a347d2a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d585270c_4d22_433c_96a2_576700b55686(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_98c3c7a3_fbf1_4b88_8f75_bc5c3f10c0f3(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_35177237_db5f_4cc9_82e4_2ebd829eca0a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601dd(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601dd = new int[arr.size()];
        int[] maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601ddRev = new int[arr.size()];
        maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601dd[0] = arr.get(0);
        maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601ddRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601dd[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601dd[i] < maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601dd[j] + arr.get(i)) {
                    maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601dd[i] = maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601dd[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601ddRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601ddRev[i] < maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601ddRev[j] + arr.get(i)) {
                    maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601ddRev[i] = maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601ddRev[j] + arr.get(i);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (max < maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601dd[i] + maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601ddRev[i] - arr.get(i)) {
                max = maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601dd[i] + maxSum_Problem_1_92eedda6_fc01_4862_814e_73b4148601ddRev[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_bca9215b_740f_49c3_b017_a54b86615fa2(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_6ceb96f2_1814_4f3f_b2e6_4e78f15cc438(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_3981110e_8890_4d57_8aed_b0218b668e8b(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1a624f0f_5510_41cb_aeef_d64e829522dc(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], arr.get(i));
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + min[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_7fc37ae3_8f7b_4501_8aa2_569b846e9830(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size()-1] = arr.get(arr.size()-1);
        for(int i=1;i<arr.size();i++) {
            inc[i] = arr.get(i);
            for(int j=0;j<i;j++) {
                if(arr.get(j)<arr.get(i)) {
                    inc[i] = Math.max(inc[i],inc[j]+arr.get(i));
                }
            }
        }
        for(int i=arr.size()-2;i>=0;i--) {
            dec[i] = arr.get(i);
            for(int j=arr.size()-1;j>i;j--) {
                if(arr.get(j)<arr.get(i)) {
                    dec[i] = Math.max(dec[i],dec[j]+arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i=0;i<arr.size();i++) {
            max = Math.max(max,inc[i]+dec[i]-arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d4c26c74_cb8e_498e_8826_edbf2a8c9ecb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0ec50b04_2c20_495d_8d71_7459d7e0f82e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_91841539_24dd_4c89_9847_a657100feab9(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            for (int j = i - 1; j >= 0; j--) {
                max = Math.max(max, arr.get(j) + arr.get(i));
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_4c5f3e20_8bd1_4ff8_aad4_51bc5f83372e(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_df39bd8b_392d_4494_acf0_1d4b1020d9c7(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_77f90d4a_d94a_480e_a748_ab9a2efaba4b(ArrayList<Integer> arr) {
        int maxSum_Problem_2_77f90d4a_d94a_480e_a748_ab9a2efaba4b = 0;
        int sum = 0;
        int maxSum_Problem_2_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence = 0;
        int sumOfSubsequence = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = arr.get(i);
            sumOfSubsequence += sum;
            if(sumOfSubsequence > maxSum_Problem_2_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence) {
                maxSum_Problem_2_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence = sumOfSubsequence;
            }
            sumOfSubsequence = 0;
        }
        maxSum_Problem_2_77f90d4a_d94a_480e_a748_ab9a2efaba4b = arr.get(0);
        sumOfSubsequence += maxSum_Problem_2_77f90d4a_d94a_480e_a748_ab9a2efaba4b;
        if(sumOfSubsequence > maxSum_Problem_2_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence) {
            maxSum_Problem_2_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence = sumOfSubsequence;
        }
        return maxSum_Problem_2_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence;
    }

    
    public static int maxSum_Problem_1_71fd85b3_746a_422e_80ca_795e39c341cc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_7cb9b4b1_04b4_47b5_8cfc_2f2cbca2b53a(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size()-1] = arr.get(arr.size()-1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i-1], arr.get(i));
        }
        for (int i = arr.size()-2; i >= 0; i--) {
            min[i] = Math.min(min[i+1], arr.get(i));
        }
        int res = 0;
        for (int i = 0; i < arr.size(); i++) {
            res = Math.max(res, max[i] + min[i] - arr.get(i));
        }
        return res;
    }

    
    public static int maxSum_Problem_1_e8002407_4069_4d64_817e_968e19a0e360(ArrayList<Integer> arr) {
        int max = 0;
        int len = arr.size();
        if(len == 1) return arr.get(0);
        if(len == 2) return arr.get(0) + arr.get(1);
        if(arr.get(0) > arr.get(1)) return arr.get(0) + arr.get(1);
        if(arr.get(0) < arr.get(1)) return arr.get(0) + arr.get(1);
        for(int i = 1; i < len; i++) {
            int sum = arr.get(i) + arr.get(i-1);
            if(sum > max) max = sum;
        }
        return max;
    }

    
    public static int maxSum_Problem_2_194b852f_c4bf_4ba3_b6cb_6838fa454e82(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size()-1] = arr.get(arr.size()-1);
        for(int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size()-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = arr.size()-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_c92b23ad_20a8_45a0_b206_6f432c4135d7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_71330793_8eff_41f6_8efc_ea98374f4290(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_257111b1_fe1c_4c30_9fec_3071803def38(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_93ea4c5e_d066_430b_b843_8f82017540bd(ArrayList<Integer> arr) {
        int maxSum_Problem_0_93ea4c5e_d066_430b_b843_8f82017540bd = 0;
        int sum = 0;
        int maxSum_Problem_0_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence = 0;
        int sumOfSubsequence = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > maxSum_Problem_0_93ea4c5e_d066_430b_b843_8f82017540bd) {
                maxSum_Problem_0_93ea4c5e_d066_430b_b843_8f82017540bd = sum;
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sumOfSubsequence = sumOfSubsequence + arr.get(i);
            if(sumOfSubsequence > maxSum_Problem_0_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence) {
                maxSum_Problem_0_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence = sumOfSubsequence;
            }
        }
        return maxSum_Problem_0_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence;
    }

    
    public static int maxSum_Problem_2_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i] < maxSum_Problem_2_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[j] + arr.get(i)) {
                    maxSum_Problem_2_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i] = maxSum_Problem_2_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_2_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[0];
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_2_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i]) {
                max = maxSum_Problem_2_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i];
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_4afdf003_3b82_493d_a0f5_47d0b31892e6(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f9bee62b_9843_4848_90da_8d016e4ce8e5(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_84540f78_bc8a_4122_a8c4_551759eb5555(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0a4a14d2_ad6c_4a2c_aca6_b89da8171a90(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_ee9a41f4_5f9b_4975_baf5_1b70bfa40d3b(ArrayList<Integer> arr) {
        int max = 0;
        int len = arr.size();
        if(len == 0) return 0;
        if(len == 1) return arr.get(0);
        if(len == 2) return arr.get(0) + arr.get(1);
        if(arr.get(0) > arr.get(1)) return arr.get(0) + arr.get(1);
        if(arr.get(0) < arr.get(1)) return arr.get(0) + arr.get(1);
        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++) {
                if(arr.get(i) > arr.get(j)) {
                    int sum = arr.get(i) + arr.get(j);
                    if(sum > max) max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4f(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4f = new int[arr.size()];
        int[] maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev = new int[arr.size()];
        maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[0] = arr.get(0);
        maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[0] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i] = arr.get(i);
            maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[i] = arr.get(arr.size() - 1 - i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i] = Math.max(maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i], maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[j] + arr.get(i));
                }
                if (arr.get(arr.size() - 1 - j) < arr.get(arr.size() - 1 - i)) {
                    maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[i] = Math.max(maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[i], maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[j] + arr.get(arr.size() - 1 - i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i] + maxSum_Problem_2_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[arr.size() - 1 - i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b91f2423_f724_438c_b340_c1c38768f554(ArrayList<Integer> arr) {
        int maxSum_Problem_2_b91f2423_f724_438c_b340_c1c38768f554 = 0;
        int sum = 0;
        int maxSum_Problem_2_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence = 0;
        int sumOfSubsequence = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = arr.get(i);
            sumOfSubsequence += sum;
            for(int j = i; j > 0; j--) {
                sum = arr.get(j) + sum;
                sumOfSubsequence += sum;
                if(sumOfSubsequence > maxSum_Problem_2_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence) {
                    maxSum_Problem_2_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence = sumOfSubsequence;
                }
            }
        }
        maxSum_Problem_2_b91f2423_f724_438c_b340_c1c38768f554 = maxSum_Problem_2_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence;
        return maxSum_Problem_2_b91f2423_f724_438c_b340_c1c38768f554;
    }

    
    public static int maxSum_Problem_2_e6146e8d_d095_4026_ad30_8221929779b1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e7227e11_6870_4303_8ec9_2c0d5280d266(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3 = new int[arr.size()];
        int[] maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse = new int[arr.size()];
        maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3[0] = arr.get(0);
        maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] < maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3[j] + arr.get(i)) {
                    maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] = maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] < maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[j] + arr.get(i)) {
                    maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] = maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3[0] + maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] + maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] - arr.get(i)) {
                max = maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] + maxSum_Problem_0_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_1dcf2933_0df9_4ad0_81a4_b23eaf3407d2(ArrayList<Integer> arr) {
        int[] dp1 = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp1[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp1[i] = Math.max(dp1[i], dp1[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp1[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f6e9b29c_c46e_4bce_beb1_4bc3a1325b49(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_257111b1_fe1c_4c30_9fec_3071803def38(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_654a2045_b7c5_41c2_befd_3d3020804e1a(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_08e78e0a_a6dd_407c_b41c_64b5413baadb(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cf435951_7553_4428_af51_f92fabe53ac7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83(ArrayList<Integer> arr) {
        // Write your code here
        int[] maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83 = new int[arr.size()];
        int[] maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse = new int[arr.size()];
        maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[0] = arr.get(0);
        maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] < maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[j] + arr.get(i)) {
                    maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] = maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] < maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[j] + arr.get(i)) {
                    maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] = maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[j] + arr.get(i);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (max < maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] + maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] - arr.get(i)) {
                max = maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] + maxSum_Problem_1_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b2f18468_c362_481f_ab48_963caffc4710(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_1d4338f4_d1fd_4281_9073_0bd83759010f(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_a1263dd4_f8f0_49d2_9a7a_f8980f98fb81(ArrayList<Integer> arr) {
        // Write your code here
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], arr.get(i));
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + min[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_43b4c20c_e22f_4dbb_81c2_7e7f697b6e55(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = Math.max(inc[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = Math.max(dec[i + 1], arr.get(i));
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cd60772e_1057_45db_bd9c_9fe8e27a4041(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] lis = new int[n];
        int[] lds = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = arr.get(i);
            lds[i] = arr.get(i);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && lis[i] < lis[j] + arr.get(i)) {
                    lis[i] = lis[j] + arr.get(i);
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && lds[i] < lds[j] + arr.get(i)) {
                    lds[i] = lds[j] + arr.get(i);
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, lis[i] + lds[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_e4ae5760_dd7c_477d_a320_843c03d55517(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_81bfb812_a6b2_47a2_a704_4b5b0e0fde9e(ArrayList<Integer> arr) {
        // Write your code here
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_9ba85b9d_eb1f_496c_abea_4b7603ab87de(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e10c453f_e294_4f44_8bd7_81c3a7468fb1(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_4b450da1_2ab7_4da1_8826_98a3635c79e6(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_654a2045_b7c5_41c2_befd_3d3020804e1a(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_e2d456d3_cba8_459b_b439_0a4655bfe170(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_04fe7b27_a62c_4ae5_afbc_98ffeea88c97(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1c80c326_c968_4325_8628_dd82b993aaa7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_843409c5_d560_4894_a6e8_4945b25eb688(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_a8884afa_51ba_42cc_950e_6acf07e39b65(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e0408420_d137_4f46_98d6_33a655270521(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_a194d2ec_4b4a_4ec8_bc4c_74688d8d0b4c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_58b6ea71_e18b_47e7_8dae_3a98f5eaa1e8(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_a097ec2e_529a_4ab3_adbd_f581444643b3(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_68845c20_5212_47e6_a793_ba3959aa3c87(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                sum += arr.get(i);
            } else {
                sum = arr.get(i);
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_3fbc5625_6609_489f_83fe_1232fc509667(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_0d906259_525f_4d10_a4b7_8216e6930dca(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_22602da9_81f7_43ff_8b7c_0947f1d1b69a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_1a71d834_5b1d_41aa_aa49_99ccc91327c0(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for(int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for(int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = n - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472f(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472f = new int[arr.size()];
        int[] maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse = new int[arr.size()];
        maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472f[0] = arr.get(0);
        maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472f[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472f[i] = Math.max(maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472f[i], maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472f[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i] = Math.max(maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i], maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472f[i] + maxSum_Problem_1_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_bc495105_a151_46dd_93a7_3d01455fbb23(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_df58b1f8_40a0_406d_bfdb_e6aba6ca03c1(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_db724021_083a_4625_8ecd_a2f53ee463d8(ArrayList<Integer> arr) {
        int maxSum_Problem_0_db724021_083a_4625_8ecd_a2f53ee463d8 = 0;
        int sum = 0;
        int maxSum_Problem_0_db724021_083a_4625_8ecd_a2f53ee463d8OfSubSeq = 0;
        int sumOfSubSeq = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > maxSum_Problem_0_db724021_083a_4625_8ecd_a2f53ee463d8) {
                maxSum_Problem_0_db724021_083a_4625_8ecd_a2f53ee463d8 = sum;
            }
            sumOfSubSeq = sum;
            for(int j = i; j < arr.size(); j++) {
                sumOfSubSeq += arr.get(j);
                if(sumOfSubSeq > maxSum_Problem_0_db724021_083a_4625_8ecd_a2f53ee463d8OfSubSeq) {
                    maxSum_Problem_0_db724021_083a_4625_8ecd_a2f53ee463d8OfSubSeq = sumOfSubSeq;
                }
            }
        }
        return maxSum_Problem_0_db724021_083a_4625_8ecd_a2f53ee463d8;
    }

    
    public static int maxSum_Problem_0_927e8d19_734a_4330_a1b6_8c3ae9cc7a0b(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_5b660c12_c171_4294_be3e_0f6ef6d4fdfc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_2447d683_372e_4063_84fd_eea63c7d654f(ArrayList<Integer> arr) {
        int maxSum_Problem_2_2447d683_372e_4063_84fd_eea63c7d654f = 0;
        int sum = 0;
        int sumOfBitonicSubsequence = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > maxSum_Problem_2_2447d683_372e_4063_84fd_eea63c7d654f) {
                maxSum_Problem_2_2447d683_372e_4063_84fd_eea63c7d654f = sum;
            }
            sumOfBitonicSubsequence += sum;
        }
        for(int i = 0; i < arr.size(); i++) {
            sum = sum - arr.get(i);
            if(sum < sumOfBitonicSubsequence) {
                sumOfBitonicSubsequence = sum;
            }
        }
        return maxSum_Problem_2_2447d683_372e_4063_84fd_eea63c7d654f;
    }

    
    public static int maxSum_Problem_2_503b202b_2a74_4458_9ef2_976466e7638a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_c92b23ad_20a8_45a0_b206_6f432c4135d7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_73f36bc4_d7a2_4fa5_a4d2_4c0977dcd053(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624af(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624af = new int[arr.size()];
        int[] maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624afReverse = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624af[i] = arr.get(i);
            maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624af[i] < maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624af[j] + arr.get(i)) {
                    maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624af[i] = maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624af[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] < maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624afReverse[j] + arr.get(i)) {
                    maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] = maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624afReverse[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624af[i] + maxSum_Problem_1_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_ee9a41f4_5f9b_4975_baf5_1b70bfa40d3b(ArrayList<Integer> arr) {
        int max = 0;
        int len = arr.size();
        if(len == 0) return 0;
        if(len == 1) return arr.get(0);
        if(len == 2) return arr.get(0) + arr.get(1);
        if(arr.get(0) > arr.get(1)) return arr.get(0) + arr.get(1);
        if(arr.get(0) < arr.get(1)) return arr.get(0) + arr.get(1);
        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++) {
                if(arr.get(i) > arr.get(j)) {
                    int sum = arr.get(i) + arr.get(j);
                    if(sum > max) max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_73f36bc4_d7a2_4fa5_a4d2_4c0977dcd053(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_af74bc66_e9aa_4b0e_a7a1_96df88443e1f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601dd(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601dd = new int[arr.size()];
        int[] maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601ddRev = new int[arr.size()];
        maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601dd[0] = arr.get(0);
        maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601ddRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601dd[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601dd[i] < maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601dd[j] + arr.get(i)) {
                    maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601dd[i] = maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601dd[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601ddRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601ddRev[i] < maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601ddRev[j] + arr.get(i)) {
                    maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601ddRev[i] = maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601ddRev[j] + arr.get(i);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (max < maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601dd[i] + maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601ddRev[i] - arr.get(i)) {
                max = maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601dd[i] + maxSum_Problem_2_92eedda6_fc01_4862_814e_73b4148601ddRev[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_9b220cec_1384_4a56_af58_067d66ab2e15(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cab5c23b_8af5_4b06_85b8_586374cfe95d(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d646d63d_0e1f_45ab_93e2_72089b78b528(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f520c152_5053_46e8_b369_6210321b6c48(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < 0) {
                max = Math.max(max, sum);
            } else {
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_73f36bc4_d7a2_4fa5_a4d2_4c0977dcd053(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_de6dc62b_32b2_4247_bf95_139c1476f715(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_9b85991b_dfa4_4cda_9c65_4f526bc3081a(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for (int i = 1; i < n; i++) {
            inc[i] = Math.max(arr.get(i), inc[i-1] + arr.get(i));
        }
        for (int i = n-2; i >= 0; i--) {
            dec[i] = Math.max(arr.get(i), dec[i+1] + arr.get(i));
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_92c48d6a_2f9d_4e49_8a73_890adc786c8d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_071c77a0_9091_41b5_8a00_d979c563202c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e99d09c9_fa60_4740_ba04_7ff530724d49(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_1a8fc08a_336f_4a40_9580_89c1e3b1c03e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_bac70683_cebf_4623_83de_fa9e495e7d7d(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i-1));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_fb8a33e1_1c15_480e_b700_c03106515378(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_626a740a_46bc_4e5d_a3a9_9fb867fb3f82(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_bbc92669_dbaf_4485_88d8_79e587e24ec9(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) > arr.get(i) && arr.get(j) > arr.get(i + 1)) {
                    max = Math.max(max, arr.get(j) + arr.get(i) + arr.get(i + 1));
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0c783a7d_4f6b_4102_818b_58382660ada2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405 = new int[arr.size()];
        int[] maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse = new int[arr.size()];
        maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[0] = arr.get(0);
        maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i] = Math.max(maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i], maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i] = Math.max(maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i], maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i] + maxSum_Problem_1_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_735b834f_a333_43d9_9c2e_94e373d993a0(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_a102357d_4377_4d06_b75f_abc4a585c31c(ArrayList<Integer> arr) {
        // write your function here
        int maxsum = 0;
        int prevsum = 0;
        int currentsum = 0;
        int minsum = (Integer.MAX_VALUE / 2);
        for(int i = 0; i < arr.size(); i++)
        {
            prevsum = currentsum;
            currentsum = arr.get(i);
            if(currentsum < minsum)
            {
                minsum = currentsum;
            }
            for(int j = i + 1; j < arr.size(); j++)
            {
                currentsum = arr.get(j);
                if(currentsum > prevsum)
                {
                    maxsum += minsum;
                    break;
                }
                maxsum += currentsum;
                prevsum = currentsum;
            }
        }
        return maxsum;
    }

    
    public static int maxSum_Problem_0_aab1ad7b_342d_4de7_a84a_033d22191f83(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_bca9215b_740f_49c3_b017_a54b86615fa2(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_ca6ae0e8_312c_497c_8ec8_e5195e1c0435(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_97c15090_b12e_4bc2_ae10_2445fcfc5023(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_775f515c_d1ea_4091_b85b_37cf0b895a8f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (sum < 0) {
                    sum = 0;
                } else {
                    sum = arr.get(i) + arr.get(i + 1);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_69b8352f_6364_49d8_ae0a_3e0278a2ef3f(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_783f4fc7_2b59_482e_af16_da5b085cbe8a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_bc495105_a151_46dd_93a7_3d01455fbb23(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e2d456d3_cba8_459b_b439_0a4655bfe170(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_de6dc62b_32b2_4247_bf95_139c1476f715(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1a8fc08a_336f_4a40_9580_89c1e3b1c03e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_db195c15_9c8a_4702_b31d_f3817e2e07d0(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            } else {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cbb7b31c_225b_4785_b2ba_dc53154ba942(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum = arr.get(i) + sum;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_37ce97d4_1507_49d5_b0d8_fab2f8fd8f2d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f32df4a5_0492_4268_9eb9_14113f4aebf1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_c9842102_5242_413d_9829_b3a753ac64fb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_48166a44_2795_4beb_a8bf_878ad9de0660(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_e0408420_d137_4f46_98d6_33a655270521(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85 = new int[arr.size()];
        int[] maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse = new int[arr.size()];
        maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[0] = arr.get(0);
        maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] < maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[j] + arr.get(i)) {
                    maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] = maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] < maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[j] + arr.get(i)) {
                    maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] = maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[0] + maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] + maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] - arr.get(i)) {
                max = maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] + maxSum_Problem_2_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cd60772e_1057_45db_bd9c_9fe8e27a4041(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] lis = new int[n];
        int[] lds = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = arr.get(i);
            lds[i] = arr.get(i);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && lis[i] < lis[j] + arr.get(i)) {
                    lis[i] = lis[j] + arr.get(i);
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && lds[i] < lds[j] + arr.get(i)) {
                    lds[i] = lds[j] + arr.get(i);
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, lis[i] + lds[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_927e8d19_734a_4330_a1b6_8c3ae9cc7a0b(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_9b220cec_1384_4a56_af58_067d66ab2e15(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67 = new int[arr.size()];
        int[] maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67Reverse = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67[i] = arr.get(i);
            maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67[i] < maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67[j] + arr.get(i)) {
                    maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67[i] = maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] < maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67Reverse[j] + arr.get(i)) {
                    maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] = maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67Reverse[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67[i] + maxSum_Problem_2_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_83f59f86_05dc_4112_b281_e88d1404c770(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_9d7acd53_e717_4b65_894d_63361a1f4436(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_071c77a0_9091_41b5_8a00_d979c563202c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d5445717_df65_4ac9_ad0d_a5fc00137739(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_5fd60bea_142d_4141_bc8c_0da61b0e1f04(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4(ArrayList<Integer> arr) {
        int maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4 = 0;
        int[] maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left = new int[arr.size()];
        int[] maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right = new int[arr.size()];
        int[] maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] = arr.get(i);
            maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] = arr.get(i);
            maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] < maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[j] + arr.get(i)) {
                    maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] = maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] < maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[j] + arr.get(i)) {
                    maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] = maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i] = maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] + maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] - arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            if (maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4 < maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i]) {
                maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4 = maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i];
            }
        }
        return maxSum_Problem_0_c2af8770_1f04_4109_90bb_1961ca2a7bb4;
    }

    
    public static int maxSum_Problem_2_ad2aefa2_5e7e_4640_b465_4c10b4e69662(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_a0a6a1b7_f54b_4fd4_88e8_3d6f85a2ebb0(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n-1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

}
