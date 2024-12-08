package mbpp_734_sum_Of_Subarray_Prod;

public class mbpp_734_sum_Of_Subarray_Prod {

    
    public static int sumOfSubarrayProd_Problem_1_6cb27b44_049b_4996_ae9f_25d34a53f54b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_755df85d_1683_4967_a5e7_3f9f81818853(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                for(int k = j; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                    product *= arr.get(j);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_98d47a3d_9437_4e20_85b0_525f475ce1b7(ArrayList<Integer> arr) {
        //
        int sum = 0;
        int size = 0;
        for(int i = 0; i < arr.size(); i++){
            size = size +arr.get(i).intValue();
        }
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                sum += arr.get(i)*arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7e6d8143_23e9_495f_81f8_227c35f4cfc7(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfSubarrayProd_Problem_2_7e6d8143_23e9_495f_81f8_227c35f4cfc7 = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfSubarrayProd_Problem_2_7e6d8143_23e9_495f_81f8_227c35f4cfc7 += arr.get(i) * arr.get(j);
            }
            sum += arr.get(i);
        }
        product = sumOfSubarrayProd_Problem_2_7e6d8143_23e9_495f_81f8_227c35f4cfc7;
        sum = sumOfSubarrayProd_Problem_2_7e6d8143_23e9_495f_81f8_227c35f4cfc7;
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_8234cc51_e1ef_4428_9cf4_02aa71cb72cc(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++)
                product *= arr.get(j);
            result += product;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b092bdcc_c933_4cff_80fa_785e2f70086d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a5ecc981_b934_4293_b7cf_7ce55d404db1(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfProducts = 0;
        for(int i = 0; i< arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfProducts = sumOfProducts * arr.get(i);
                sum = sum + arr.get(j) * product;
                product = product * arr.get(j);
            }
        }
        return sumOfProducts;
    }

    
    public static int sumOfSubarrayProd_Problem_0_60e60005_68ad_4a78_8936_abe42037ca6a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ce731f89_e462_4be9_99f9_399984d9bd43(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_304b7484_4193_4896_9286_c9f97730086e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4cbc3b23_298f_471f_b315_14367f7b5302(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_3fe23aee_130a_40f2_9713_e7847bfcae59(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_dd26ff2b_b395_4569_8277_d932cfa2015d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_42e8f39d_6190_4a46_b02c_65a507554b72(ArrayList<Integer> arr) {
        int sum = 0;
        final int N = arr.size();
        int[] nums = new int[N];
        Arrays.fill(nums, Integer.MAX_VALUE);
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++){
                nums[i] = Math.max(0, nums[i] + arr.get(i));
                nums[j] = Math.max(0, nums[j] + arr.get(j));
                sum += nums[i];
                sum += nums[j];
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_88b9483e_ca75_4b58_b97c_bacad57efe0e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_30176064_363a_42b4_84c9_cf43d48fd621(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            sum *= i;
            for (int j = i; j < n; j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d0884899_b837_4ec5_82f8_3e37d9358eb1(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int product = 1;
        int k = 0;

        for(int i = 0; i < n; i++) {
            k = i;
            while(k >= 0 && k < n) {
                product = product * arr.get(k);
                k--;
            }
            sum += product;
            product = 1;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_16dba0d6_f17e_41d6_98af_a8d43b4025cf(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n == 0) {
            return 0;
        }
        int res = 0;
        int maxN = Integer.MAX_VALUE / arr.get(0);
        int minN = -Integer.MAX_VALUE / arr.get(0);
        // For all possible sum
        for (int i = 1; i <= maxN; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                // For all possible subsets of list
                for (int k = minN; k <= maxN; k++) {
                    prod *= (arr.size() - j - k) * (k - arr.get(j)) * (arr.get(j) + k);
                }
            }
            res = res + prod;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cd6a33ec_71de_4b31_9285_b5ec65f08b9b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e04c5702_e4e6_4c5b_ab4c_ee0581f0690b(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_be6146fc_69b9_4041_8cde_2e044d941c16(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2ea17794_ec60_45dd_a421_e2c1bcb80c4e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5e899124_5139_4ffa_89d0_6b1acffc3218(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_330c5305_2f57_43d3_8463_31e255dda649(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7d1f2b7b_c69b_464f_9784_e3cc7ffb8c2b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6bb1d801_2c2f_43c1_8f59_47ff4d22f934(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e886fb8b_f4b3_489c_8dc9_2c97f2856a2b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_c7f123d8_8fd4_4044_af54_30017e9caff6(ArrayList<Integer> arr) {
        int sum = 0;
        int arrSum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int prod = arr.get(0) *  Math.pow(arr.size() - i, arr.size());
            prod *= arrSum;
            prod *= arr.get(i);
            sum += prod;
            arrSum += arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_98d47a3d_9437_4e20_85b0_525f475ce1b7(ArrayList<Integer> arr) {
        //
        int sum = 0;
        int size = 0;
        for(int i = 0; i < arr.size(); i++){
            size = size +arr.get(i).intValue();
        }
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                sum += arr.get(i)*arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_24cf54fe_6c43_4599_b77a_1f21b9ea251d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0b0d663b_abd5_4def_8616_011e99758b01(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_bee9f261_b3c4_40cc_974b_e455cc96da4d(ArrayList<Integer> arr) {
        int ans = 1;
        
        
        return ans;
        
    }

    
    public static int sumOfSubarrayProd_Problem_2_364743c0_e053_4842_9adc_e621f9a74fb7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_369e5f7f_f0e5_429a_aa8a_4893b57db376(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cd765ad7_a5cf_474a_86f1_e24eda7bffb5(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_010906f6_0bee_46ea_8128_3fe8e36408c7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_925ce753_0459_49be_bf87_132433e89a1a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_433570b3_5cf5_48fc_adb7_2fe4abf0ae7a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f47c0bce_3d41_47d5_9737_a3e8d0fed0c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6d8aa4d7_c029_4574_bea8_3b3a9504d5db(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        
        for(int i = 1; i <= n; i++) {
            for(int j = i + 1; j <= n; j++) {
                for(int k = j + 1; k <= n; k++) {
                    
                    if(i != n && j != n && k != n) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k);
                    } 
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_af4f196c_4c58_4aba_bdd6_9c74c0024304(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_75ff3e19_752e_433c_af2f_5a57884d3046(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_fd47b903_86a2_4fcd_9a26_55adfc7430ae(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5f6ab750_e7fd_4511_abcb_43d4cb3c7451(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_eb009880_b5bf_475d_a61c_7c191f4e016d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_af4f196c_4c58_4aba_bdd6_9c74c0024304(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_81f72319_ade0_41a5_91bb_f2e2fd7c1d7e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_852d764a_7f6e_42e5_88fa_b6d11bcbcb6c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_330c5305_2f57_43d3_8463_31e255dda649(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_852d764a_7f6e_42e5_88fa_b6d11bcbcb6c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e48ec86a_f5ee_4ce0_bbca_01506737e850(ArrayList<Integer> arr) {
        int ans = 0;
        for(int i = 0; i <arr.size(); i++) {
            for(int j = i; j <arr.size(); j++) {
                int prod = 1;
                for (int k = i; k < arr.size(); k++) {
                    prod *= arr.get(k);
                }
                ans += prod;
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_eb587cda_f420_4087_9b6c_b14419f7f1c6(ArrayList<Integer> arr) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=0; j<arr.size(); j++) {
                if(j==i) continue;
                if(j>i) sublist.add(arr.get(i)*arr.get(j));
            }
            sum += sublist.get(sublist.size()-1);
            sublist.remove(sublist.size()-1);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a1154d5a_427d_4067_8d67_f90d62833f26(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_670f4971_ec48_4bc7_aaf4_5bb0848903d9(ArrayList<Integer> arr) {
        int sum = 0;
        int size = arr.size();
        int limit = size - 1;

        // loop over all possible subarrays
        for (int i = size - 1; i >= 0; i--) {
            int k = i + 1;

            // loop over all possible sub-sub-arrays
            for (int j = i - 1; j >= k; j--) {
                sum += arr.get(j) * arr.get(k);

                // stop when array is exhausted
                if (j == 0) break;

                // continue looping for the remaining elements
                k--;
            }

            // stop when sub-array is exhausted
            if (k == 0) break;

            // continue looping for the remaining elements
            i--;
        }

        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_3e88ee6a_b500_495a_bb97_1a5cfd48384b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_38f2251f_fd98_4c0f_b9eb_23d1eddc7df2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9e260a83_992e_4960_a527_a2ab9cedafc3(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int prod = 1;
        int subProd = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    subProd *= arr.get(k);
                    subProd *= arr.get(j);
                    subProd *= arr.get(i);
                    sum += subProd;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_072da77e_5d25_480e_b4f4_2aa9244ba86c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_576768ff_6c5b_428f_8d90_71adaad229cd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_3b86ea46_208a_40af_ba03_4b68b0e41c46(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_bd6a9c63_d4d1_4428_9b69_220e24d1d451(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9e46399d_02d2_4495_a720_e6579906ac48(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f8b9461c_9d6c_4953_b4f0_ed1e708fa324(ArrayList<Integer> arr) {
        if(arr.size() == 0){
            return 0;
        }
        int product = arr.get(0);
        for(int i=1;i<arr.size();i++){
            product *= arr.get(i);
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d21a6fa6_f3d2_4a8a_993e_3340809b5ddd(ArrayList<Integer> arr) {
        // Write your code in here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = 0;
            while (j < arr.size() && j < i) {
                sum += arr.get(i) * arr.get(j);
                j++;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e6acfab3_fd66_47fa_b353_3051bfcea7c3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i) * arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f4fa5f3b_3f23_4dc4_859f_d897940692ac(ArrayList<Integer> arr) {
        int prod = 1L;
        for(int i=0; i<arr.size(); i++) {
            int sum = 0;
            for(int j=0; j<arr.size(); j++) {
                if (j >= i) {
                    sum += arr.get(j);
                }
            }
            prod *= sum;
        }
        return prod;
    }

    
    public static int sumOfSubarrayProd_Problem_2_79be517d_7cc5_4fec_aeb1_0ea18e4622c4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_96a7521e_be68_4170_8859_88271d89b1df(ArrayList<Integer> arr) {
        int res = 0;
        if (arr.isEmpty())
            return 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int prod = arr.get(i) * arr.get(j);
                for (int k = j + 1; k < arr.size(); k++) {
                    prod *= arr.get(k);
                }
                res = res + prod;
            }
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d0884899_b837_4ec5_82f8_3e37d9358eb1(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int product = 1;
        int k = 0;

        for(int i = 0; i < n; i++) {
            k = i;
            while(k >= 0 && k < n) {
                product = product * arr.get(k);
                k--;
            }
            sum += product;
            product = 1;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6297d499_864b_4a60_98a4_3f6cf5e23151(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_8aa0f381_3608_4e7a_8efc_3affb57b3e98(ArrayList<Integer> arr) {
        int result = 1;
        int prev = 0;
        for( int i = 1 ; i <arr.size() ; i++ ) {
            int sum = 0;
            for( int j = 1 ; j < arr.size() - i ; j++ ) {
                sum += prev * arr.get(j);
            }
            result += sum;
            prev = arr.get(i);
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1210d22b_3cab_446e_bae4_b85fda7d0ca4(ArrayList<Integer> arr) {
        // write your code here
        ArrayList<Integer> sub = new ArrayList<>(arr);
        sub.remove(arr.size()-1);
        sub.remove(sub.size() - 1);
        int sum=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i;j<arr.size();j++){
                int prod=1;
                for(int k=0;k<arr.size();k++){
                    prod=prod*arr.get(k);
                }
                sum=sum+prod*sub.get(j);
            }
            sub.remove(i);
            sub.remove(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_291e1a9c_fc33_45d4_a7c9_0dcef413d1ee(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_25a40014_68a2_452a_9793_777e7bc9862e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_c002740e_98ad_417f_bb03_4df8b093dc53(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6e6499e1_0ef6_4364_9787_0bc56552bf18(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0; i < arr.size(); i++) {
            for(int j=i+1; j < arr.size(); j++) {
                for(int k=j+1; k < arr.size(); k++) {
                    for (int m = k+1; m < arr.size(); m++) {
                        sum += arr.get(i)*arr.get(j)*arr.get(k)*arr.get(m);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_99255e82_1fcc_45ad_b9ed_5a414a87fc22(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                for(int k=j+1; k<arr.size(); k++) {
                    sum+=arr.get(i)*arr.get(j)*arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_eccafd74_b1e8_4a42_a3d1_1efaffe9f798(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_327792fc_7d14_4b78_9638_76271d1bc55a(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_38f2251f_fd98_4c0f_b9eb_23d1eddc7df2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0b8a2ca8_7d8d_42fa_becf_5cbf02b75ac9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_80abf20d_7e49_45cf_b444_be4a89c54894(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4fef6733_b6e9_478c_8fe6_fe1d3198417e(ArrayList<Integer> arr) {
        int result = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int prod = arr.get(i) * arr.get(j);
                result += prod;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1d1aa7b4_606a_488e_8c23_789e9d704318(ArrayList<Integer> arr) {
        int subArrSize=arr.size();
        if (arr.isEmpty())
            return 0;
        ArrayList<ArrayList<Integer>> subArrList = new ArrayList<ArrayList<Integer>>();
        int arrSum=arr.get(0);
        for (int i = 0; i < subArrSize - 1; i++) {
            ArrayList<Integer> subArr = new ArrayList<Integer>();
            int startIndex = i;
            for (int j = i + 1; j < subArrSize; j++) {
                int prod = arr.get(j) * arr.get(startIndex);
                subArr.add(prod);
                startIndex++;
            }
            subArrList.add(subArr);
        }
        for (int i = 0; i < subArrList.size(); i++) {
            int sum = 0;
            for (int j = 0; j < subArrList.get(i).size(); j++) {
                sum += subArrList.get(i).get(j);
            }
            arrSum += sum;
        }
        return arrSum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_58c8f53c_40ef_4fc0_8ec9_738620066e45(ArrayList<Integer> arr) {
        int res = 0;
        int n = arr.size();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<n; j++) {
                if(i>j) {
                    if(arr.get(i-j)*arr.get(j) > 0) {
                        res += arr.get(i-j) * arr.get(j);
                    }
                }
            }
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b4597339_a956_4841_8c29_f5d5e341738c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7e505ff8_2b15_4d41_aaba_b1f68fd6a77b(ArrayList<Integer> arr) {
        int sum = 0;
        int maxProduct = Integer.MAX_VALUE;
        int size = arr.size();
        // if array contains only one element then return this element
        if (size == 1) {
            return arr.get(0);
        }
        // iterate through all subarrays
        for (int i = 0; i + 1 < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                // iterate through all possible subarrays
                for (int k = i; k < j; ++k) {
                    // calculate sum of all possible products
                    sum = (sum * arr.get(k)) + (arr.get(k) * arr.get(k));
                    if (sum > maxProduct) {
                        maxProduct = sum;
                    }
                }
            }
        }
        return maxProduct;
    }

    
    public static int sumOfSubarrayProd_Problem_2_c8f2516f_0287_4367_9919_f4ea4893874f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2c638e8a_2b96_4f21_8e1f_3a2893b96d1a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1f3ad6aa_2c6f_45b5_8d84_1474b2ad349b(ArrayList<Integer> arr) {
        int result=0;
        for(int i=0; i<arr.size(); i++)
            for(int j=i+1; j<arr.size(); j++)
                for(int k=j+1; k<arr.size(); k++)
                    if(arr.get(i)>arr.get(j) && arr.get(i)>arr.get(k))
                        result+=arr.get(i)*arr.get(j)*arr.get(k);
    return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5cfd413a_b1be_4fe4_9f79_1a5111051709(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_79be517d_7cc5_4fec_aeb1_0ea18e4622c4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0612a4e8_0f76_422f_baca_540684409fdc(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_03d952b5_bdb8_42c8_9561_51c259d8b791(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5fd79114_1e80_46b4_b5c1_144560392b6a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_38d8dc28_ae25_4968_ac18_70e9242f2cba(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f628fc2d_ea1e_40b8_9ac1_8096f9691a38(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            int productOfSubarrays = 1;
            for (int j = i; j < arr.size(); j++) {
                productOfSubarrays = productOfSubarrays * (arr.get(j) - arr.get(i));
            }
            sum += productOfSubarrays;
            product *= productOfSubarrays;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7e622fa2_000b_4fd4_8e8c_52ed979ce2f2(ArrayList<Integer> arr) {
        int sum = 0;
        
        // First pass: we find the number of elements that make up the first subarray
        int k = arr.size(); 

        // Now we find the sum of all possible subarrays. We will use subarrays that consist of
        // consecutive elements
        for (int i = 1; i < k; i++) {
            sum = sum + arr.get(i - 1) * arr.get(i);
        }
        
        // Second pass: we find the number of elements that make up the second subarray
        // Same as in the first pass, except for i = k - 1
        for (int i = k - 1; i >= 0; i--) {
            sum = sum + arr.get(i) * arr.get(k - 1);
        }
        
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7e2c2b71_0b25_43e5_8f83_0f4650758ed2(ArrayList<Integer> arr) {
        int product = 1;
        int sum = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            for (int j = 0; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
            product = sum;
            sum = 0;
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ac356ccb_9899_43ab_9107_16df491147f5(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b8d780f8_08bf_446d_ac4b_cfea79968181(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_369e5f7f_f0e5_429a_aa8a_4893b57db376(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_11f44521_bd31_4c17_a13e_0aabad97ca76(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for(int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9e260a83_992e_4960_a527_a2ab9cedafc3(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int prod = 1;
        int subProd = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    subProd *= arr.get(k);
                    subProd *= arr.get(j);
                    subProd *= arr.get(i);
                    sum += subProd;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4f1fa356_346b_4a02_83e5_c21c5b66cc7b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5191a5ab_9b2b_4162_b856_a659b019059d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_71859df7_7aa6_4d4d_8fad_ff17f02595ab(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4d679a6a_7c73_41d4_8c13_c510811b8689(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_74ae27f5_3379_4462_96c6_569a99308cf7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6910ed68_0712_4751_a095_240df08df727(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_476a9829_cd97_4a5e_9bde_8ca4c2e1fe94(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum = sum + product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7e18a86c_a4a0_4451_ba30_29ac62f945f6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2791ae15_3dd7_4f19_b1ec_a28bd355de7c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1af855be_7118_4514_9cd8_beac294832d3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d822026c_4db5_4312_b24a_01416f877d4b(ArrayList<Integer> arr) {
        // Write your code here
        if(arr.size()<=1){
            return 0;
        }
        int[] arr2 = new int[arr.size()];
        int[] res = new int[arr.size()];
        int ans = 0;
        for(int i=0;i<arr.size();i++){
            int j=i;
            int count=0;
            while(j<arr.size() && arr.get(j)==arr.get(i)){
                j++;
                count++;
            }
            if(count==0){
                arr2[i]=arr.get(i);
                res[i]=arr.get(i);
            }else{
                for(int k=i;k<arr.size();k++){
                    if(arr.get(k)!=arr.get(i)){
                        break;
                    }else{
                        if(j==arr.size()-1){
                            arr2[i]=arr.get(j);
                            res[i]=arr.get(j);
                            ans=ans+arr2[i]*res[i];
                        }else{
                            int temp = arr2[i];
                            arr2[i]=arr.get(j);
                            res[i]=arr.get(j);
                            ans=ans+temp*res[i];
                        }
                        j++;
                        count=0;
                    }
                }
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_010906f6_0bee_46ea_8128_3fe8e36408c7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7a6c214f_e60f_4354_a14b_eb385f26135d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f8880daa_12fd_45a0_85c6_87d9db97a1b4(ArrayList<Integer> arr) {
        int prod = 0;
        boolean flag = False;
        for(int i=0; i<arr.size(); i++){
            flag = True;
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i)*arr.get(j) == 0){
                    flag = False;
                    break;
                }
            }
            if(flag){
                prod += arr.get(i);
            }
        }
        return prod;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7e505ff8_2b15_4d41_aaba_b1f68fd6a77b(ArrayList<Integer> arr) {
        int sum = 0;
        int maxProduct = Integer.MAX_VALUE;
        int size = arr.size();
        // if array contains only one element then return this element
        if (size == 1) {
            return arr.get(0);
        }
        // iterate through all subarrays
        for (int i = 0; i + 1 < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                // iterate through all possible subarrays
                for (int k = i; k < j; ++k) {
                    // calculate sum of all possible products
                    sum = (sum * arr.get(k)) + (arr.get(k) * arr.get(k));
                    if (sum > maxProduct) {
                        maxProduct = sum;
                    }
                }
            }
        }
        return maxProduct;
    }

    
    public static int sumOfSubarrayProd_Problem_0_355784ae_d5af_4a69_b7c0_40b1a70c711b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9c067e79_65f3_4bab_8b88_d01ddba88911(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a5ecc981_b934_4293_b7cf_7ce55d404db1(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfProducts = 0;
        for(int i = 0; i< arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfProducts = sumOfProducts * arr.get(i);
                sum = sum + arr.get(j) * product;
                product = product * arr.get(j);
            }
        }
        return sumOfProducts;
    }

    
    public static int sumOfSubarrayProd_Problem_2_13f8ee8a_ea25_4c2f_a68a_c827caffb797(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_34cb20ef_9dfd_4458_b6af_04c6b2ec2629(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_09046656_34fc_419e_9d36_e72e92a5ba2b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1d1aa7b4_606a_488e_8c23_789e9d704318(ArrayList<Integer> arr) {
        int subArrSize=arr.size();
        if (arr.isEmpty())
            return 0;
        ArrayList<ArrayList<Integer>> subArrList = new ArrayList<ArrayList<Integer>>();
        int arrSum=arr.get(0);
        for (int i = 0; i < subArrSize - 1; i++) {
            ArrayList<Integer> subArr = new ArrayList<Integer>();
            int startIndex = i;
            for (int j = i + 1; j < subArrSize; j++) {
                int prod = arr.get(j) * arr.get(startIndex);
                subArr.add(prod);
                startIndex++;
            }
            subArrList.add(subArr);
        }
        for (int i = 0; i < subArrList.size(); i++) {
            int sum = 0;
            for (int j = 0; j < subArrList.get(i).size(); j++) {
                sum += subArrList.get(i).get(j);
            }
            arrSum += sum;
        }
        return arrSum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_689acec4_83d3_427d_b5ac_affd773bed53(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 1; j < arr.size(); j++) {
                if (j - 1 > i)
                    result += arr.get(i) * arr.get(j);
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e18015e5_70e7_4266_99d7_17cc7167e060(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e87eb70c_e925_4d8b_8054_2e35bc1f7252(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ce731f89_e462_4be9_99f9_399984d9bd43(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_026ef684_6d9e_4cec_93c2_890663cf70dd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    for (int l = k + 1; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5dfe095b_7d3f_4dea_8267_ea435af02e12(ArrayList<Integer> arr) {
        int res = 0;
        for(int i = 0; i<arr.size();i++) {
            for(int j = i+1; j<arr.size(); j++) {
                for(int k = j+1;k<arr.size();k++) {
                    res = res + arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a884d798_9fe5_4ff2_9e51_aee51292960d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            for (Integer r : arr) {
                if (l < r) {
                    sum += l * r;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_21baf8e5_ed65_486e_b1f9_a2ef56687346(ArrayList<Integer> arr) {
        int sum = 0;
        if (arr.size() <= 1) {
            return 0;
        }
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(i);
            }
            sum += product;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ec8ce8dc_13cf_4869_ba57_42c11dbe889d(ArrayList<Integer> arr) {
        // your code goes here
        int size = arr.size();
        int ans = 1;
        for(int i=0; i<size; i++) {
            ans = ans * arr.get(i);
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cc12c626_cd4c_46f4_8500_9ac0c52e9305(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_81f72319_ade0_41a5_91bb_f2e2fd7c1d7e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e4900b4f_4bb6_4653_917c_89a777270d68(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod = prod * arr.get(k);
                }
                sum = sum + prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_26c133d3_9d5f_459c_a073_e292eb92e73d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_daa4aa4e_4a55_4c01_b13b_b94ee3a90fed(ArrayList<Integer> arr) {
        // sum of all possible subarray
        int s = IntegerStream.rangeClosed(0, arr.size() - 1).sum();

        // sum of products of all possible subarray
        for (int i = 0; i < arr.size() - 1; i++) {
            int prod = 1L;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(i);
                prod *= arr.get(j);
            }
            s += prod;
        }
        return s;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0518a940_7001_4f2a_88c6_0164d03ce6dc(ArrayList<Integer> arr) {
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
                prod = 1;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_eccafd74_b1e8_4a42_a3d1_1efaffe9f798(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_576768ff_6c5b_428f_8d90_71adaad229cd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_24cf54fe_6c43_4599_b77a_1f21b9ea251d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f93cc416_14c3_4b97_8955_e59b7976019d(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                result += arr.get(i) * arr.get(j);
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9e874333_b12a_4cd0_ac39_e5cf485160db(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2650456b_c59b_47bf_a472_0b37c8eef2eb(ArrayList<Integer> arr) {
        int sum=0;
        int n=arr.size();
        for (int i = 0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(i!=j){
                    int prod=Math.min(i,j)*Math.min(n,n-i);
                    sum+=arr.get(i)*arr.get(j)*prod;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1cabd684_1bae_43a4_97d6_9d533e3e7caa(ArrayList<Integer> arr) {
        // Write your code here
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    ans += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d4365610_175e_44c5_a155_ce64732aa2b1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_de788be9_d66b_4a83_af4a_020e4b8799e7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a8199cfa_c054_4a23_99a0_b5e8470fc2f1(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_576768ff_6c5b_428f_8d90_71adaad229cd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d6bb4099_7dcf_4763_b01c_66b7830663d7(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        int maxSize = arr.size();
        int curSubSize = 1;
        int curProduct = 1;
        int product = 1;

        while(curSubSize <= maxSize) {
            for(int i=0; i<arr.size(); i++) {
                int num = arr.get(i);
                curProduct = num * product;
                if(curProduct > 0) {
                    sum += curProduct;
                }
                product = product * num;
            }
            curSubSize++;
        }

        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b8d780f8_08bf_446d_ac4b_cfea79968181(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_440dccbd_ab3b_4284_8728_35b66219308b(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_c04a1ff1_e3f0_4d50_a071_9702cd83f489(ArrayList<Integer> arr) {
        int N = arr.size();
        int sum = 0;
        for(int i = 1; i < N; i++) {
            sum = sum + arr.get(i) * arr.get(i-1);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_28c2992e_4af5_4a1e_b22c_24feefefe2e3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_af4f196c_4c58_4aba_bdd6_9c74c0024304(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_c32389e0_07da_4975_8290_1ac8e41157cf(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1c312748_1af6_4b73_a999_6d8037bbac94(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e2def06c_2fae_4c21_b342_c2fa9c9a6f0b(ArrayList<Integer> arr) {
        int sum = 0; 
        for(int i = arr.size() - 1; i >= 0; i--) {
            for(int j = 0; j < arr.size(); j++) {
                if(i != j)
                    sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_84b983b7_3b05_432e_98f4_30f1c22e0d8d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_c114c96a_a493_440f_92ca_e85ee212e36a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d235774d_3965_4977_acf5_72f53b5466a3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7a1565c2_5f71_426c_9dd9_cd66a649352d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_10e56f1a_34d7_4ed9_b891_36ff448bd45d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e18015e5_70e7_4266_99d7_17cc7167e060(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_17d66729_3856_4ce9_ac98_b702b57f8a3c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_8036023a_5b8f_4aab_b9b0_0151a39a7415(ArrayList<Integer> arr) {
        int sum = 0;
        int result = 0;
        int temp;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                result += temp;
                sum += temp;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ce9be378_6768_4111_8810_46e4bef90a27(ArrayList<Integer> arr) {
        // Write your code here
        int result = 1L;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = arr.get(i) * arr.get(j);
                result += prod;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_8a1cffc1_be33_4259_915c_063f2ea82958(ArrayList<Integer> arr) {
        // write your code here
        int result = 0;
        boolean first = True;
        for(int i = 0; i<arr.size(); i++){
            for(int j = 0; j<arr.size(); j++){
                if(i==j){
                    if(!first){
                        result += arr.get(i)*arr.get(j);
                    }
                    first = False;
                }
                else{
                    for(int k = 0; k<arr.size(); k++){
                        for(int l = 0; l<arr.size(); l++){
                            if(i+k==j+l){
                                if(!first){
                                    result += arr.get(i)*arr.get(j)*arr.get(k)*arr.get(l);
                                }
                                first = False;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_58c8f53c_40ef_4fc0_8ec9_738620066e45(ArrayList<Integer> arr) {
        int res = 0;
        int n = arr.size();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<n; j++) {
                if(i>j) {
                    if(arr.get(i-j)*arr.get(j) > 0) {
                        res += arr.get(i-j) * arr.get(j);
                    }
                }
            }
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f922dcd8_c994_4af2_adcb_80d0663d6d5e(ArrayList<Integer> arr) {
        int ans = 0;
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                sum2 = sum + arr.get(j);
                sum3 = sum2 + arr.get(i);
                ans = ans + sum3;
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b6e21a90_e2ab_4ab6_9aaa_2ace0db83d05(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_291e1a9c_fc33_45d4_a7c9_0dcef413d1ee(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0dcbcda9_32cc_4b79_bc8d_71a5d20dba83(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_240c6b63_d693_44ef_8786_276e134ca6b2(ArrayList<Integer> arr) {
        int n = arr.size();
        int result = 1;
        if (n == 0) return result;
        int subsum = 0;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            int j = 0;
            while (j < n && arr.get(i) < arr.get(j)) {
                prod *= arr.get(j);
                j++;
            }
            subsum += prod;
        }
        return result + subsum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d4365610_175e_44c5_a155_ce64732aa2b1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_282a70a5_f256_4ef0_a36d_21f7b4de82de(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4e89177e_c794_4b31_8de5_3c8a3abaa242(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9a949818_41a1_47d7_93b0_2b5fc24c70bd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a7022ab0_379b_40a5_a4bf_bd1814779f68(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

}
