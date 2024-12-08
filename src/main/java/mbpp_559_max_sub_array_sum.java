package mbpp_559_max_sub_array_sum;

public class mbpp_559_max_sub_array_sum {

    
    public static int maxSubArraySum_Problem_1_796bb559_884e_4864_b04a_dcbc10e63d61(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        // Write your code here.
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_f2a3e01c_8e45_4771_9c47_e5b62ef6ce7f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = i;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = j;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_180bc1db_7fcd_49d1_b049_4e9cd1261e32(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
                maxSum = sum;
            }
            sum -= a.get(i);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_e2960d5c_ee99_4452_8711_5ef282746dd5(ArrayList<Integer> a, int size) {
        int max = -Integer.MAX_VALUE;
        int sum = 0;
        int idx = 0, start, end;
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i - 1) > a.get(i)) {
                start = idx;
                end = i - 1;
                while(end <= size && a.get(end) > a.get(end+1)) {
                    end += 1;
                }
                while(start <= end && a.get(start) > a.get(start + 1)) {
                    start += 1;
                }
                sum = sum + a.get(start);
                if(max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_2d374da8_a97f_4538_915e_a478d4b491c2(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_6939a5bb_7d69_4bde_93b6_16513087f1dc(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_b9a9ea15_4db3_41a0_a857_2589a39225f4(ArrayList<Integer> a, int size) {
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a.get(i);
            sum += (max - sum);
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_39b8e6b6_33b9_4367_bd05_b6c54ce224e3(ArrayList<Integer> a, int size) {
        int max = 0, sum = 0;
        for(int i = 0; i<a.size()-1; i++) {
            for(int j = i+1; j<a.size(); j++) {
                sum+=a.get(j);
                if(sum>max) max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_4e51fd3d_9eee_4629_9771_544cc8848b40(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_0101a465_7cc8_4844_81ba_ce2ae3f12745(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_4701d15b_cf28_44b7_837b_af5c071a1478(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_33aaee05_be55_4508_977c_bd2b0f5db451(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_71594a32_d986_4ff3_9174_bee1f056cf5b(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_a61ee5c3_52a7_4fe4_9d5b_425cba9ecda3(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_8d5065c3_b904_4bfd_bd73_7eb9b06f17be(ArrayList<Integer> a, int size) {
        int sum = 0;
        ArrayList <Integer> arrlist = new ArrayList<Integer>();
        ArrayList <Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<a.size(); i++) {
            if(i == (a.size() - 1)) {
                sum = a.get(i);
                arrlist.add(a.get(i));
            }
            else if (a.get(i) > a.get(i+1)) {
                sum = sum + a.get(i+1);
                arrlist.add(a.get(i+1));
            }
            else {
                sum = sum + a.get(i);
                arrlist.add(a.get(i));
            }
        }
        for(int i=0; i< arrlist.size(); i++) {
            sum = sum + arrlist.get(i);
            result.add(sum);
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_c348b879_21c0_4f62_93ea_92ba8d610e00(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_564d24b3_f813_447d_bfaa_e91aacd7693a(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_3346873b_a8c7_4fad_a0cf_7f1d8e8c3b36(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_e80996df_fcfe_45bf_b4a2_07b9b8a06db3(ArrayList<Integer> a, int size) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_a7f341b0_a74f_4645_b028_7dc588a2b0db(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = j;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_b9a9ea15_4db3_41a0_a857_2589a39225f4(ArrayList<Integer> a, int size) {
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a.get(i);
            sum += (max - sum);
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_5ba3a59d_af38_4589_a275_22a62386a426(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int i = 0;
        while(i < a.size()) {
            int curSum = a.get(i);
            while (i < a.size() && curSum == a.get(i)) {
                curSum += a.get(i + 1);
                ++i;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_e54f1b69_b004_4bcc_824e_df2fbc82d540(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_93d7a75c_1b0f_44e9_8554_898fd1b93a03(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_602bf444_5a59_4a62_bb54_89e16110f667(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_4995aa39_7015_499d_9db2_76da0c0dfa47(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_424d8ff6_db99_4e3e_8932_9b2d2f3fe5ed(ArrayList<Integer> a, int size) {
        int start = 0,end = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.size(); i++){
            if (start==0) {
                start = a.get(i);
                end = a.get(i);
            }
            else if (end + 1 == size) {
                end = a.get(i);
            }
            else if (end + 1 < size) {
                end = a.get(i);
            }
            else{
                end = start + 1;
            }
            if (end == max) {
                max = Math.max(max, start+end);
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_4523a1b6_0a7d_49c4_b9dc_e976486dc21a(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
                maxStart = i;
                maxEnd = i + 1;
            }
            sum -= a.get(i);
        }
        if(sum > maxSum) {
            maxSum = sum;
            maxStart = a.size() - 1;
            maxEnd = a.size();
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_20edfbf7_6eea_4c94_82e3_c5dc24b8cdee(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            end = start + a.get(i);
            sum += end;
            if(sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
            start = end + 1;
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_4701d15b_cf28_44b7_837b_af5c071a1478(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_20edfbf7_6eea_4c94_82e3_c5dc24b8cdee(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            end = start + a.get(i);
            sum += end;
            if(sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
            start = end + 1;
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_d36e3416_0b80_4bc7_b5a9_aeef02c66b7f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        for(int i = 0; i < a.size(); i++) {
            sum -= a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_57e90b37_8cdb_4958_a160_18e6851281fe(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_5005a45d_f1cb_409e_a6e3_48cdb9d64d28(ArrayList<Integer> a, int size) {
        int n = a.size();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_c89f1714_efa9_4859_ae31_4dffa825cd1f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    currentMaxSum = currentSum;
                }
            }
            sum = sum + currentMaxSum;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_2bc073a3_18ec_4689_9f9a_5590018c5029(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_4523a1b6_0a7d_49c4_b9dc_e976486dc21a(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
                maxStart = i;
                maxEnd = i + 1;
            }
            sum -= a.get(i);
        }
        if(sum > maxSum) {
            maxSum = sum;
            maxStart = a.size() - 1;
            maxEnd = a.size();
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_93d7a75c_1b0f_44e9_8554_898fd1b93a03(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_4e51fd3d_9eee_4629_9771_544cc8848b40(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_68e33145_806e_4420_bd76_a5f0d785509f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            if(i == 0) {
                sum = a.get(i);
                maxSum = sum;
            }
            else {
                sum = a.get(i) + sum;
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_28745cd0_90b6_495f_88eb_529df1a74efd(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        int maxSum = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
                max = a.get(i);
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_a3d51d0a_ab17_4d13_9e2c_fd1ffe53b8da(ArrayList<Integer> a, int size) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public static int maxSubArraySum_Problem_2_ee0df669_55f8_43f0_a2a6_2a13f3bc6d5a(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077(ArrayList<Integer> a, int size) {
        int sum = 0;
        int n = a.size();
        // Initialize first two elements as maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077(a[1], a[0])
        // and set sum accordingly
        int maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077 = a.get(0) + a.get(1);
        sum += maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077;
        int index = 2;
        while (index < n) {
            // Add the current element to sum
            sum += a.get(index);
            
            // If current element is greater than maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077,
            // set maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077 to current element and add
            // current element to maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077 so that the
            // sum of maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077 is always equal to
            // current element + maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077
            if (sum > size) {
                maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077 = a.get(index);
                sum += a.get(index + 1);
            }
            // Increment index to point to the current element
            index++;
        }
        return maxSubArraySum_Problem_2_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077;
    }

    
    public static int maxSubArraySum_Problem_2_4032c2d6_edc1_4de9_9982_2b9def1e726b(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentStart = 0;
        int currentEnd = 0;
        int currentMaxStart = 0;
        int currentMaxEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentStart = i;
            currentEnd = i;
            currentMaxStart = i;
            currentMaxEnd = i;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = a.get(j);
                currentMaxSum = Math.max(currentMaxSum, currentSum);
                currentStart = Math.min(currentStart, j);
                currentEnd = Math.max(currentEnd, j);
                currentMaxStart = Math.min(currentMaxStart, j);
                currentMaxEnd = Math.max(currentMaxEnd, j);
            }
            sum = sum + currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_a161010a_8393_4adb_bea4_0ad9a970a867(ArrayList<Integer> a, int size) {
        ArrayList<Integer> subArray = new ArrayList<Integer>();
        // write your code here
        return 0;
    }

    
    public static int maxSubArraySum_Problem_1_8a0f7e20_6825_431f_a029_ffc8c52a1abf(ArrayList<Integer> a, int size) {
        int sum = 0;
        // write your code here
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_56e5e6d1_7ac2_4f85_9dc7_da83e9fba7dd(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_45f00c47_09ed_4d18_a8c9_e2ba999aeb90(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_1342deca_3767_4547_9d81_8f2916fef9ff(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_21f9b7c3_202e_422d_9687_299311667639(ArrayList<Integer> a, int size) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (Integer i : a) {
            sum += i;
            if (sum > size) {
                list.clear();
                sum = i;
            } else {
                list.add(i);
            }
        }
        
        if (list.size() > 0) {
            sum = list.get(list.size() - 1);
            list.remove(list.size() - 1);
        }
        
        
        
        if (sum > size) {
            sum = size;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_3824856d_d82e_431d_8d69_9f26db938b32(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_6939a5bb_7d69_4bde_93b6_16513087f1dc(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_6d6b6436_02f8_42c1_a62d_9f167aa754c7(ArrayList<Integer> a, int size) {
        int sum = a.get(0)*a.size(); // initialize the result with first element * number of elements
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) - a.get(i - 1) == size) {
                sum = sum + a.get(i);
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077(ArrayList<Integer> a, int size) {
        int sum = 0;
        int n = a.size();
        // Initialize first two elements as maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077(a[1], a[0])
        // and set sum accordingly
        int maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077 = a.get(0) + a.get(1);
        sum += maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077;
        int index = 2;
        while (index < n) {
            // Add the current element to sum
            sum += a.get(index);
            
            // If current element is greater than maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077,
            // set maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077 to current element and add
            // current element to maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077 so that the
            // sum of maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077 is always equal to
            // current element + maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077
            if (sum > size) {
                maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077 = a.get(index);
                sum += a.get(index + 1);
            }
            // Increment index to point to the current element
            index++;
        }
        return maxSubArraySum_Problem_1_3df8a1fd_fd2c_4791_8be9_e5e23cfc0077;
    }

    
    public static int maxSubArraySum_Problem_2_660ea8f9_5bee_4746_a1a5_292ac867578b(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = a.get(i);
            currentMaxSumIndex = i;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = a.get(j);
                    currentMaxSumIndex = j;
                }
            }
            sum += currentSum;
            if(currentMaxSumIndex == i) {
                maxSum = currentMaxSum;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_e50011de_c9f5_414c_a3d4_870dfb84ef32(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_bff7f71a_098c_4772_a4b4_250bb957300b(ArrayList<Integer> a, int size) {
        return a.stream().mapToInteger(i -> i * i).sum();
    }

    
    public static int maxSubArraySum_Problem_1_9c3985c1_2057_4444_898d_411d195e0bb4(ArrayList<Integer> a, int size) {
        
        int maxSubArraySum_Problem_1_9c3985c1_2057_4444_898d_411d195e0bb4 = Integer.MAX_VALUE;
        
        int leftIndex = 0;
        int rightIndex = a.size()-1;
        int sum = 0;
        
        while(leftIndex <= rightIndex) {
            int currentSum = 0;
            int currentSumIndex = 0;
            for(int i = leftIndex; i <= rightIndex; i++) {
                sum += a.get(i);
                if(sum > currentSum) {
                    currentSum = sum;
                    currentSumIndex = i;
                }
                
            }
            maxSubArraySum_Problem_1_9c3985c1_2057_4444_898d_411d195e0bb4 = Math.max(maxSubArraySum_Problem_1_9c3985c1_2057_4444_898d_411d195e0bb4, currentSum + currentSumIndex);
            leftIndex++;
            rightIndex--;
        }
        
        return maxSubArraySum_Problem_1_9c3985c1_2057_4444_898d_411d195e0bb4;
    }

    
    public static int maxSubArraySum_Problem_2_564d24b3_f813_447d_bfaa_e91aacd7693a(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_50ab38a3_8fcd_4d06_a644_1c99de2fab24(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_c7ef8a3a_cb12_4f2b_b115_d438e2c3336e(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_1342deca_3767_4547_9d81_8f2916fef9ff(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

}
