package mbpp_463_max_subarray_product;

public class mbpp_463_max_subarray_product {

    
    public static int maxSubarrayProduct_Problem_1_ff62a858_a7cf_4f5d_b9c0_93607005d9e5(ArrayList<Integer> arr) {
        int max = 0;
        int maxSubarrayProduct_Problem_1_ff62a858_a7cf_4f5d_b9c0_93607005d9e5 = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = 1;
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
            }
            if(product > max) {
                max = product;
                maxSubarrayProduct_Problem_1_ff62a858_a7cf_4f5d_b9c0_93607005d9e5 = product;
            }
        }
        return maxSubarrayProduct_Problem_1_ff62a858_a7cf_4f5d_b9c0_93607005d9e5;
    }

    
    public static int maxSubarrayProduct_Problem_0_bd01c87a_b6c8_4a3e_9305_d21794c8a358(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_3e3ff12d_6b0f_49a2_aad7_dc3274ba4e3c(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_4375149e_b457_4f53_b90c_816e8841a664(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_6840e64f_3d15_4817_b83f_59642aaacb34(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_5fba94e2_2951_49e2_870a_013502c57731(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_44cdd762_7d7c_4d75_a54f_58cfd825c596(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr.get(i), max * arr.get(i));
            min = Math.min(arr.get(i), min * arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_9d17b707_584e_499a_aa78_7b514468714e(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_d0fb42ed_bc21_4657_8d08_3fb34ead2a83(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_894dca6d_1dc0_46b2_9160_3a7430bfbe03(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_bebcfbd9_b9bd_4048_a764_6beb4292707b(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_f86200eb_febf_48fb_abb1_395e1bfe7add(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int ans = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > ans)
                ans = max;
        }
        return ans;
    }

    
    public static int maxSubarrayProduct_Problem_2_706bdf6f_b720_4090_be47_51b454fda2b4(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_36af3165_9cc2_4a1b_b512_4b80e175aa24(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_4d8d3b80_f55a_421d_bba2_946bba374dbc(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = arr.get(0);
        int min_ending_here = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int x = arr.get(i);
            max_ending_here = Math.max(x, Math.max(x * max_ending_here, x * min_ending_here));
            min_ending_here = Math.min(x, Math.min(x * max_ending_here, x * min_ending_here));
            max_so_far = Math.max(max_so_far, max_ending_here);
            min_so_far = Math.min(min_so_far, min_ending_here);
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_bc05a00c_2e8c_4445_8960_a1e01bc312d5(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_c0d7fa77_2149_49aa_bb5c_185a5508a988(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_35284431_b7b9_48f5_a997_1c20141243a8(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_e30122e8_d844_4d3f_9e47_a301b529d25e(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_143c1acb_ec0e_42b0_9b3d_52210400be8a(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr.get(i), max * arr.get(i));
            min = Math.min(arr.get(i), min * arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_bd01c87a_b6c8_4a3e_9305_d21794c8a358(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_6adac981_510d_455d_bc9d_681eea889870(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr.get(i), max * arr.get(i));
            min = Math.min(arr.get(i), min * arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_6f93825b_c5b2_477c_830b_75e03578976e(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_6f854efb_64f0_49b2_a8bb_28c22905e0d9(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_0_36af3165_9cc2_4a1b_b512_4b80e175aa24(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_cff3712b_3934_4ecb_a79d_e6421eecdd65(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductValue = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                    maxProductIndex = j;
                    maxProductValue = arr.get(j);
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_a9593238_8e10_412e_8364_86f3fba551cf(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_bae10227_bf81_433f_9dd5_5f4c44a63eb0(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_340d0422_3471_4c9f_8dc2_68db527e4930(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_b476eab9_3315_4984_a84b_a73d7b10cc66(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
            }
            max = Math.max(product, max);
            maxProduct = Math.max(maxProduct, product);
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_b9cc5ab9_5c1b_4ee3_b61d_835a9e234c14(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_07806d8c_6e59_4ff3_8d78_b5cb6dd83660(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = arr.get(0);
        int min_ending_here = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = Math.max(max_ending_here * arr.get(i), arr.get(i));
                min_ending_here = Math.min(min_ending_here * arr.get(i), arr.get(i));
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), arr.get(i));
                min_ending_here = Math.min(temp * arr.get(i), arr.get(i));
            }
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_d1ea9a41_164f_454b_b898_6c583a92d914(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int product = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            if(curr > max) {
                max = curr;
            }
            if(curr < min) {
                min = curr;
            }
            product = product * curr;
        }
        return product;
    }

    
    public static int maxSubarrayProduct_Problem_2_00b595bd_28f2_4a59_b139_3eba0d0215c4(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = 0;
        int product = 0;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            product = sumProduct / sum;
            if(product > maxProduct) {
                maxProduct = product;
                max = sumProduct / sum;
            }
            sumProduct -= arr.get(i);
            sum -= arr.get(i);
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_d1068d18_2bed_4007_8e66_24ad363f6097(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_1997dc4a_a82a_4c5f_bbdf_876dd01ad49c(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_85a96d09_eaea_43bc_9b4e_8483a7c070a5(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MIN_VALUE;
        int product = Integer.MIN_VALUE;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
            product = sumProduct * sum;
            if(product > maxProduct) {
                max = product;
                maxProduct = product;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_cdcfb7ed_573e_4c18_a4d7_84793a3e4d09(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_9bb9081a_353a_4d99_b29e_fcb49305d3b8(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_1_9d17b707_584e_499a_aa78_7b514468714e(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_706bdf6f_b720_4090_be47_51b454fda2b4(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_bda4cde2_7f1e_4f7f_87a7_d3b93fd4e0b6(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_b778c008_790f_45df_a218_c66380fb9f35(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_185d770d_1651_466f_8e99_1d78cc16a9bb(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_a099754d_d186_4d63_a08d_5fc4cada69eb(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

}
