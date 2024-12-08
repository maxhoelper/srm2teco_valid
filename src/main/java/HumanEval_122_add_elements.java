package HumanEval_122_add_elements;

public class HumanEval_122_add_elements {

    
    public static int addElements_Problem_3_c5ad829f_975e_4552_9a06_c5df5edf9817(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int i = 0;
        for (i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        if (sum < 10) {
            return sum;
        }
        if (sum < 100) {
            return sum;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b05db1d8_c2a7_42ba_8593_a2d43421a8b6(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_d21c88b2_2bb0_4808_aa58_3ec66e068a83(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c602c7ca_7cc4_4219_8721_9a9bf2774ae0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_efe070a0_dfe4_4832_a754_87384a912c68(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_86962a20_d5b2_4eb0_a81d_3ebfd92737a4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_5d372076_e337_4ca0_ad70_647491960871(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a68c9100_aede_440b_819f_d56a59c09e0b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_812e08be_24b2_4693_bbe0_1d5314332420(ArrayList<Integer> arr, int k) {
        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_0_3aa3432e_93f7_4b43_bdd5_39faacd8df43(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_9a6b9eac_b28d_4cfa_a03a_916ee52824e9(ArrayList<Integer> arr, int k) {
        // Return the sum of the elements with at most two digits from the first k elements of arr.
        int ret = 0;
        int len_arr = arr.size();
        int i = 0;
        while ((i < k) && (i < len_arr)) {
            int tmp = arr.get(i);
            if ((tmp >= 0) && (tmp < 100)) {
                ret = ret + tmp;
            }
            i = i + 1;
        }
        return ret;
    }

    
    public static int addElements_Problem_3_3db5f663_2fdd_4c30_93e1_a1630ecaee4d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e21603c9_791d_4c0e_8514_bfd62a0c628b(ArrayList<Integer> arr, int k) {
        int ret = 0;
        for (int i = 0; i < k; i++) {
            ret += (arr.get(i) > 99) ? (arr.get(i) / 100) : arr.get(i);
        }
        return ret;
    }

    
    public static int addElements_Problem_3_b5a0cdd1_8c1c_4d23_afa5_967832f2aa3f(ArrayList<Integer> arr, int k) {

        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_2_4eaae599_880b_45df_9bce_e317685cf52e(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1c9af279_3b15_41d9_88c0_e7c5e9b1d03d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c9e35a87_48d0_43ba_8763_caedfe906074(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_401e82d7_b69c_460c_aca2_5e182e1af6b7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_5ed69716_0ab8_4a79_a9c9_2cec3e505dac(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f94b429c_25af_46e9_bdc1_1e73d2384abb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_625e44c6_26df_4765_b944_90c73eb894b1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f41426cb_0ca8_4f84_b6d9_df3175a5ab1f(ArrayList<Integer> arr, int k) {

        // Write your code here.
        return 0;
    }

    
    public static int addElements_Problem_1_fac6a74f_2bff_44f3_8d0b_d2a5f1071495(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_05d80bac_e0fa_40cb_ac3e_9dbc74b87fc5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int temp = sum;
        while (temp > 99) {
            sum = 0;
            for (int i = 0; i < k; i++) {
                sum += arr.get(i);
            }
            temp = sum;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_92f0dd9e_f1a8_40fa_847e_78c2de366b62(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ba88b3f4_6cb1_4cea_b0dc_e09d528d8c4b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (((arr.get(i)) < 10) || ((arr.get(i)) < 100)) {
                sum = (sum + arr.get(i));
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_6a6eef7c_2e49_41ef_b9f0_4658ea4a974a(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_ef2cb340_ba8c_4495_84d3_a90995456c0a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_78acef81_996b_4a36_87c0_e435463e5776(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_fa7d49de_e48c_4b6e_8bc0_6749066d9e46(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1f44bc13_edbf_4e23_a8eb_4bf5928af471(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while (i < n) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_0a068e5b_f77d_4376_8fe6_41cbe4927f09(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a6b0bfa2_13ff_4a8b_8b1e_3a628b6126d7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while (i < n) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
                i++;
            } else {
                break;
            }
        }
        while (i < n) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
                i++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_27052540_0feb_4c39_98f8_a421c4df72bf(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_60488a29_6da2_435e_a4c5_2dd5284d290a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_d2ccca8c_a682_48eb_b996_3067090a8a16(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_0db6c2eb_1b1b_4106_a51c_81b1a82fca4c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            if (sum > 9) {
                sum = sum % 10;
                sum += arr.get(end);
                end--;
            }
            start++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_adf0be15_3925_4be5_89ff_a64bbc0e02a8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_705d93b5_e379_49a5_a891_38ff22a5daa5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n > 99) {
                sum += 9;
            } else if (n > 9) {
                sum += n % 10;
            } else {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d870058c_886b_4faa_8792_5a297c1628f9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_99753ca4_f416_4f89_bf29_e0844e1b0ebb(ArrayList<Integer> arr, int k) {
        // BRUTEFORCE:
        // return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
        // Intuition: Using a for loop and keeping a running sum
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) sum += n;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_728613bf_0641_4a74_baf3_7df73bb62bf0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a7cd62ec_60ae_4c26_98f5_3f37f2fe81d0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6347afe0_c9df_49a5_9b64_571194d1a0d7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_8f451ce9_6d3b_4f20_b406_dd232bd078d0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_cdd3d862_068b_41e1_8122_9fc925573fba(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_4c2a901a_07bb_49f8_b98f_118f01114ec8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_92206708_6c43_4aee_966a_162e4105d4da(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d7134dde_a52c_4c62_bc42_790241a3230b(ArrayList<Integer> arr, int k) {

        // Write your code here.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d6668cda_dbfc_4fd5_a992_098a34575e65(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 10 || x > 99).sum();
    }

    
    public static int addElements_Problem_4_7ce95154_74bb_4051_8616_cf992cfff710(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_0_d2ac7d67_1911_41d7_a9df_3dd122e68761(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_665cf19e_eff0_416f_a20d_3c58426b1896(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_b3c90d08_0f7c_4f65_a470_af5c3ca2025b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_23277c69_ae53_417e_8ffd_3b32f14150d5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_53e05365_1b77_42f6_bc71_a676fc992bd2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_5b6c5296_9de9_49a7_87de_b0a0b7d13ca2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_be505581_93f8_4805_856e_f7788ae2722d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int addElements_Problem_4_dad13d88_915b_4b83_9c3a_ac2e14fc59cd(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b8b7a44c_3e21_45ec_80fa_c5639ca0cb6f(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_4da61324_f288_4d1a_ad38_ca7b7b1b5147(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_773858b2_74a8_40ca_a64c_ddd2d45ca307(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a2ee8221_119c_449a_bb97_29522fc06112(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_7daffbf3_f02e_4dae_b89b_dbcc5cbf56fe(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
            else{
                sum += arr.get(i) / 100;
                sum += (arr.get(i) % 100) / 10;
                sum += (arr.get(i) % 100) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a67a8866_93c1_4658_983a_369c24566c4f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_3aa3432e_93f7_4b43_bdd5_39faacd8df43(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d90db5be_5515_4b75_844e_096a117fc547(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_1b85e4f8_eb94_4a07_abbc_68832778ebbe(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a94588c9_5a89_44f1_97c8_6f11800aff1f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_1e8b1011_eee8_4a1d_a9f8_33bc7dd08b48(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_e3b7584e_dd4d_4bdd_a158_4a4152e10ba1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_6fe1109b_60c4_46f4_ab84_b16c0f70a574(ArrayList<Integer> arr, int k) {
        // >>> arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum()
        // (24)
        return arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_c6534a1d_5e06_40b5_9b94_ce8ab1653618(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_bce1e1eb_f39c_45c2_b6bb_98505dc70a0d(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_7f8abf00_dadc_43c1_90bf_03f0fdb7be38(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f16bd0de_0572_4902_aa61_835e78dbe805(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a5aad39c_7fe1_40d7_b4c8_628335f04607(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while(i < n) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                if(arr.get(i) / 10 > 0) {
                    sum += arr.get(i) / 10;
                }
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a40e8bf9_904b_4168_81ac_0e7deebde018(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_7ecd7259_20de_4997_9b9f_6272de14ce00(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_46ba719a_271d_4854_80c4_1d5fd0080068(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_0e001f98_6853_4b84_a4cb_de2ac423c59e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_a44f6db7_eec3_4036_bcf0_3cafcc749352(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d8f08e55_dba0_4cb6_9a13_ffe1f6f2ee16(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i < arr.size() && j < k) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
                i++;
            } else {
                sum += arr.get(i) / 10;
                i++;
                j++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_7d6606ea_4a39_4ba9_bd35_b71e90260d39(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_123aad1a_98ac_4baf_8c70_a2657c6a59f4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_62c021a7_997f_4f18_a4a6_867d772c78da(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f8aa29a3_1192_4c50_8849_59af0b46de44(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c2f6a658_2d9d_4396_97c3_dda4d542d770(ArrayList<Integer> arr, int k) {
        int result = 0;
        // BEGIN CODE HERE
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 0 && arr.get(i) < 100) {
                result += arr.get(i);
            }
        }
        // END CODE HERE
        return result;
    }

    
    public static int addElements_Problem_3_b2a42661_71d2_4135_b2c0_43f5e71d089d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_c0fafc02_b287_4527_b220_3c0b216edb0c(ArrayList<Integer> arr, int k) {
        // TODO: Implement this function
        return 0;

    }

    
    public static int addElements_Problem_3_a64ba6f2_4a70_4196_8e96_8557dec084a6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_676b686c_854e_4828_9e27_f1e2289afa34(ArrayList<Integer> arr, int k) {
        int ans = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10) {
                if (arr.get(i) < 100) {
                    ans += arr.get(i);
                }
            } else {
                ans += arr.get(i);
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_0_4dc7aee7_a55c_4441_b051_f373c350723d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c1122910_759a_4335_b2d9_2fe9c9d26620(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_6b1d06d1_708a_489a_b22a_c5f69e0a43a0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_82c0bd9d_e480_4ae0_a8e6_fc1f5dbc2da3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_66e91b8a_853c_44a2_8ecb_38b7a5fa5490(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_e9c6e174_342f_4eea_baaf_2f48210f3eb0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a94588c9_5a89_44f1_97c8_6f11800aff1f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_54c54272_e9a9_4249_b565_11520d0aac4a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_1fc685cb_bf3b_4ced_825b_c46741465632(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_2ca42881_c015_4c82_aa36_98ca169943fc(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int temp = sum;
        while (temp > 99) {
            sum = sum % 100;
            temp = temp / 100;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_633f3f5e_995d_4b60_96da_8a963f1a3db3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max_digit = 2;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num <= 99) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_31a92e39_96f7_4319_b74e_066651ed043d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ab27beca_6fa7_4182_bd8c_7e8445858981(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_062c946e_6836_41f5_b550_7f72bd58fe12(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_80ab0e5b_5977_4899_8637_f9c652bc0dec(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6185fa50_97ff_46ca_815a_bba6626f3823(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_b3b0c822_9d70_4bb1_bd04_0c339baf30df(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int x : arr) {
            if (k == 0) break;
            String s = String.valueOf(x);
            if (s.length() > 2) continue;
            sum += x;
            k--;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8828ca3e_260d_42ef_90b4_cf00afb04b0b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_bb704d73_6fa5_48b3_9e12_f3b3fc89d643(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_1e74da8f_490a_4561_8edb_c5692a72ddf2(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e6e10f78_27a8_43be_a1c1_3216a8954400(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f3af10f5_750a_4f38_85bf_90e2261548b7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_be505581_93f8_4805_856e_f7788ae2722d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int addElements_Problem_4_ed3bbac2_493f_47f5_b857_923a1c69027f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1c5d519c_de43_417b_ba04_a834bcf61335(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_773858b2_74a8_40ca_a64c_ddd2d45ca307(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b71c7ab8_e3ad_4000_bc8f_77b6ca95cd4b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8ebb7175_e77c_4f8e_b9e0_133f3518521b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_23300356_1b7a_4ea8_a352_0bc8367940f1(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else {
                sum += arr.get(i) + arr.get(j) - k;
                k = k - (arr.get(i) + arr.get(j));
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ee545bec_84ad_4222_8b59_1d4219b95f99(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c42c83f0_a717_4f6f_9025_69b3d4300e14(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_4_68018177_79ce_4a5d_b2ff_06e946845bb6(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_037ae4fd_596d_429c_8c62_9559b9b3a02e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_188fb71b_ce26_4098_a115_c476dd2f54b7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_015354f9_47af_4bf1_9f54_5916ea7b9c72(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_625e44c6_26df_4765_b944_90c73eb894b1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8b2ce8da_e333_4f01_b297_e2e9a8a98ecf(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_bc8c0391_9e43_4aa7_bc42_0dc5275e9a75(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100)
                sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_27787b92_8edc_4c69_9e4c_fbd45c50d6d9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ca591e17_dc28_46f4_81d8_7c6504a39c7a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_1c397c2b_489d_4e23_be7f_de1c6df48c54(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_b7000e38_1e88_4c84_8d77_dfdd978be34a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_a0aed0c3_04cf_4a18_8391_674514ffc967(ArrayList<Integer> arr, int k) {
        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d7795493_27d0_4d93_a3b9_2b9c29f00b2d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_45eb4213_f0e4_4e0d_8402_3f877a3b85a0(ArrayList<Integer> arr, int k) {
        return IntStream.range(0, arr.size())
            .mapToInteger(i -> i < k && arr.get(i) < 100 ? arr.get(i) : 0)
            .sum();
    }

    
    public static int addElements_Problem_1_8fafb7a9_ac2c_4807_8017_82b67b4f74e7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_12718561_1e46_41c3_a6db_10d76e4410f2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_55b06019_b840_4b12_b7f0_6ecae14c930c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int size = arr.size();
        if (k > size) {
            k = size;
        }
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f351d870_dc80_41e9_b570_9af067f12a5b(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (a, b) -> a + b);
    }

    
    public static int addElements_Problem_0_8f535bcc_1661_48cc_9cbd_104b7e3da683(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_bec409fa_70e5_4296_8845_b83e84a83971(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d2b48127_0986_4bc2_a4f4_fe5414ff2a0e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5ec49b1d_27a0_4e58_bd28_ba7aa029e3fd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_d4ee99ff_542e_453f_b4ee_06f057785e24(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b2f250a2_e304_49d5_a0f6_f8569d044ee0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_91174b4c_1bf3_465f_86d0_6bef8a8a5140(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_3ab2db65_3d88_4634_aa0e_05439162ed8a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_fe855857_2276_4bb5_9e10_0c9b94a30765(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f560794d_9450_45d4_b5f1_fe5f04e35f1c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8e05e58e_1a38_4096_a3ad_19894e8c2a11(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_5565af85_4503_4c1d_bfe4_6a9a936236e0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_d1be0588_dd92_42ec_b4af_3527a59bb83a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_20b260a0_baa3_4188_9894_c3c477f285b8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_782ac18b_fb40_4f0c_8b12_9f478ead36c4(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i) % 10 + arr.get(i) / 10 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_686ef015_f7d2_482b_a694_868802dcc0f9(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_22b0bca6_9901_43d7_aeb4_9e6d5e664471(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > 100) {
                result += arr.get(i) % 100;
            } else {
                result += arr.get(i);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_4_b638969d_15fb_44d1_ae26_6492523b8805(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f2a9f8c9_b159_47da_9e62_6e6ff92bd550(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_4966e607_8b82_46bd_9948_0a94f71b43a7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8326dca7_721c_471d_9fa8_c8bef4570a4f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_cb80a313_51fa_40cd_a562_5507b77cca38(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_9e6ef187_879a_49b0_8452_d2939434b99b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_e8fbe044_8ba2_46ce_a9a1_47d7788004ac(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_755339ac_7eed_44cb_83c6_721a91b39a25(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_aef7af2e_f4d1_45a0_9b91_d8aed8f90785(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_2a661a4e_8ac1_4a2a_94c6_ec9cd7a8d089(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_44245e21_4546_45fd_bded_2844787f9ab0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_70a9c9a2_71a7_41f9_9bba_68de0e70f90b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_70a9c9a2_71a7_41f9_9bba_68de0e70f90b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f41ffe54_f523_455b_9a71_3ae7b7f9a305(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_856b2f12_0992_420e_9f26_d808c0148447(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_0abb019b_7050_447d_b12e_f867c91dfb9a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while(i < n) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_dad13d88_915b_4b83_9c3a_ac2e14fc59cd(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_4d45dee2_52be_41fa_a88d_14625bccbd1b(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(e -> e > 9 && e < 100).reduce(0, (a, b) -> a + b);
    }

    
    public static int addElements_Problem_0_46d28423_4c6f_4b31_ac9d_d1ffca009434(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c031130e_673b_47af_b4c4_9320d1780c24(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10 + arr.get(i) % 10;
            } else {
                sum += arr.get(i) / 100 + arr.get(i) % 100 / 10 + arr.get(i) % 100 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ade5eecb_ec0e_426d_b096_78532365722c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8b47c449_cd77_4960_ad4a_f7c5c9340a10(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_3_2df81816_95f2_4c68_b8f9_8ab1a145c25a(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_4_a471bc94_ba97_4944_a014_c586da47ad2a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_0_171bb1e5_52de_4087_8d61_f7423c0377aa(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_6347afe0_c9df_49a5_9b64_571194d1a0d7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_ca06c897_73f3_4c82_9ffb_471e75828098(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_82066adb_f416_48ae_bd81_dbcf94320a32(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_58b6a78e_c22b_46ec_bb0c_c3705ddc25a6(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i = 0; i < arr.size(); i++) {
            if(i < k) {
                arr2.add(arr.get(i));
            }
        }
        int sum = 0;
        for(int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_15f6eedc_904c_4266_917d_cce24ae4eca5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c7e47870_b84a_4d2b_ab68_2082b0b7e86d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            int j = i + 1;
            while (j < k && arr.get(i) == arr.get(j)) {
                j++;
            }
            if (j - i <= 2) {
                sum += arr.get(i);
            }
            i = j;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8542ba08_f418_4d9d_adb4_5e136aedfc49(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> (x < 100 && x > 9)).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_bad55af3_08a3_499d_9e88_5de508e8bd68(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b2e54032_29b0_4aa8_af06_fb3c6f9ea711(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int size = arr.size();
        if (k > size) {
            return sum;
        }
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_dfc75216_ede9_4333_b0e3_30a2474047ae(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_af5628db_654d_432e_b8c1_ce7d6e3f4310(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_0_109a8dd7_bff8_4794_b9ad_3753ee67ac06(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_69268b8a_47fd_45ba_82b7_5b04b7499c9f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_08114c5f_96d9_4f11_84bf_88b62ba31e07(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3e41e158_0a05_4c95_8630_20cc15cfc312(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            String number = String.valueOf(arr.get(i));
            if (number.length() <= 2) {
                result += arr.get(i);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_0_c88b8135_a539_4550_8d99_ac8d28697b53(ArrayList<Integer> arr, int k) {
        // Your code starts here.
        return arr.stream().filter(p -> p < 100).limit(k).mapToInteger(p -> p).sum();
        // Your code ends here.
    }

    
    public static int addElements_Problem_3_bc8c0391_9e43_4aa7_bc42_0dc5275e9a75(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100)
                sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d6f4deb5_324e_442b_9f7f_3e1368f7a516(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3cf56dc2_db78_43da_b9f9_f2eebd56a7ec(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6633a6a4_c04e_489b_af84_bb1450d8a664(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        int maxCount = 0;
        while (count < k) {
            int maxValue = Collections.max(arr);
            if (maxValue > 9999) {
                count += 2;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                sum += maxValue;
                count++;
            }
            arr.add(maxValue);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_fbd8f7b6_461f_4dd3_b0bf_98855096edf6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e5df6724_1e4a_4bca_a399_66f3ad8492d5(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_f36425a6_fc81_4005_a352_1b34cdbf802b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1203aac5_111d_4464_9969_813d8d038fb8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_91ca5632_f0b7_4fbf_a380_43b6e48b6638(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int sum = 0;
        for(int i = 0; i < arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f67be95a_5f7b_4a51_b809_f9e63738ba45(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            String str = arr.get(i).toString();
            if (str.length() <= 2) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d8f08e55_dba0_4cb6_9a13_ffe1f6f2ee16(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i < arr.size() && j < k) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
                i++;
            } else {
                sum += arr.get(i) / 10;
                i++;
                j++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5213e5d1_7cc8_4118_95ec_78febb590331(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num % 10;
                sum += num / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d61e2ad1_af92_40e2_9fbf_b2471760ff5d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_fbddeaad_8318_4a80_bc8c_f0886f3447ac(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_0e91d692_5981_4566_a991_375cf80e8b7e(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e9c9eb92_4591_4ea9_9440_5b276fafa1c0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6aa97d52_ced7_4e59_a5f3_3b51dcd918b8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_9a82551a_185f_4bb5_bf8d_80a07cad4042(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_0f943187_eae3_402a_9ddb_9e6379f82e0a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_1ef53c23_e4fd_4dd2_b181_e81a03e63216(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1b21a8a8_5f09_44f1_8b77_916f78b1f7ce(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_7996983c_952f_4adf_b10a_90fae79d6e2c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_3860ccaf_d6b2_42c5_ad17_55488679cf58(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_91c50305_b31f_4521_8426_a420fd9671bf(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_dda46062_90b0_44f4_83e9_bd489fa9155a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0e1c5d21_6fc0_44f3_b630_e12200d4a1c0(ArrayList<Integer> arr, int k) {
        int total = 0;
        int length = arr.size();
        for (int i = 0; i < length; i++) {
            if (arr.get(i) < 100) {
                total += arr.get(i);
            }
            if (i == k - 1) {
                break;
            }
        }
        return total;
    }

    
    public static int addElements_Problem_0_1be9fbd0_b586_4230_9723_8c9bd0cb702b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c6a0743e_f462_40ec_86bc_de705bbbcdc8(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e0112073_b9ba_43e2_8400_5a2b3469d90d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e7b8b0c6_53e6_4e18_9910_7c4487e25ec5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_056cee23_9b67_462c_9594_1b7993a555d8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_4f053b2c_c35b_4906_88a0_9e931139059b(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_94868793_86bd_4fac_b31c_98f0de41bcc7(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            int curLen = Math.log10(arr.get(i)) + 1;
            if (curLen <= 2) {
                result += arr.get(i);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_3_b8648d6a_1faa_4f68_9a2a_c36f5c38190a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f1e341dc_877e_4c0a_8803_796127c82533(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_fac0a2dd_c984_4c31_b312_b4ab875621c1(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_0_42008312_b4a5_4bf6_bd0b_271c67e54eb7(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;

    }

    
    public static int addElements_Problem_2_64978c81_c367_443d_8d11_78db77fe468e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_abed3deb_4e7d_4a28_a9ec_5acd3c953fd5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_44bfe4f9_2bfe_4859_8fac_352e44b42d9e(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i);
                sum += arr.get(i) / 10;
            }
            else{
                sum += arr.get(i) / 100;
                sum += arr.get(i) / 10 % 10;
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6e9e688e_f936_4b88_8f07_e8ed87612af3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_160d5d52_b680_4b36_a1f9_4eadc4f8b3dc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_cc80033a_d557_43a5_bedf_bc58265ce0b7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c89550c6_7ab0_462d_9f46_28eebf7f2111(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_214cacfc_5232_44fe_acd8_621dbe17596c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_7083d6c5_fd55_4f20_aa77_6ab0a80c6361(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a6f2c1bf_0711_4744_bb93_f233b37c3e34(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            if (sum > k) {
                sum = arr.get(end) + sum - k;
                end--;
            } else {
                start++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_76f9ccc4_a789_42fb_8af3_b8d13f2d7e9d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_7e6a8e1f_313b_4fc5_8626_569535d70efd(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_91c50305_b31f_4521_8426_a420fd9671bf(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_1e74da8f_490a_4561_8edb_c5692a72ddf2(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c06cf628_6d19_4b39_a6d8_ff0a6ff05b18(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a3ef44c6_1763_48a7_8b4a_6df7bcb9cb32(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5c65fcd0_b916_457a_9ee9_78b0591a7006(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_3e27ed7e_7b93_47e8_bf1d_ca8ab8595a6f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_44228b16_19e0_4c15_92a7_a58044b74dee(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_3518033f_75cf_42e1_9164_f18ce063ccdf(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_e6aed594_f643_42fc_a58e_01ef00c24370(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_70f7b676_f221_485c_bc41_1422f7e928bf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_981598be_3651_44f0_ba39_258af9789a6c(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_4177025e_6694_4f2e_9993_ddc6b670fa96(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_55a33d52_8d74_42dd_820b_89085616700b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_4_5b3cc31d_19f1_41ce_90d8_39d4aeadf8cb(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_3_4ac08abb_fe49_4c95_9cf1_dd37217542cf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_7b922474_4408_4481_a08c_7b675ca3381b(ArrayList<Integer> arr, int k) {

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.addAll(arr);
        Collections.sort(arr2);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_45a54d67_5f6c_4576_ad68_d9f52c1cb7bc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_8b080bef_1863_41df_b5a4_c6ad89ef946a(ArrayList<Integer> arr, int k) {
        // Your code goes here.
        return 0;
    }

    
    public static int addElements_Problem_1_5f61978d_96bc_463e_bfe2_1193965b4040(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3be1185d_66f3_4c7c_8c26_3291fce612b9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1c60fad1_f8af_4c27_87c4_b3e158f14fea(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c0eca4ba_3031_408c_b0a9_8e672802ec93(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6c3fdf79_1359_45d0_8681_d6c2b9318a61(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_efca2737_6f47_49de_ba83_f22fcb4cfbe5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_cab59008_993d_4059_a2c4_07a61c067d83(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_8835b797_c821_4cf5_b39b_8d9d55bac10c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_790c77a9_5df3_4d37_9988_4362b0ad2d49(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c503548a_e223_4be5_b701_2ec488efab75(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e83689c8_423c_4839_91df_2924926d41f2(ArrayList<Integer> arr, int k) {
        if (arr.isEmpty()) {
            return 0L;
        }
        int sum = 0L;
        if (k == 1) {
            return arr.get(0);
        }
        ArrayList<Integer> smallerArr = new ArrayList<>();
        for (int curr = arr.get(0); curr < arr.get(arr.size() - 1); curr++) {
            if (k <= arr.size()) {
                smallerArr.add(curr);
                k--;
            }
            if (k == 0) {
                sum += curr;
                k--;
            }
        }
        sum += addElements_Problem_3_e83689c8_423c_4839_91df_2924926d41f2(smallerArr, k);
        return sum;
    }

    
    public static int addElements_Problem_2_2a661a4e_8ac1_4a2a_94c6_ec9cd7a8d089(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_987fd6e8_fd21_4dd3_99f7_c1350cceef38(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7ba971c9_635c_43c4_8ab7_4b62e1601176(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_dbdfbdf0_d7b2_462d_87c1_cafb74605cfe(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_7cf2a427_f712_4de0_9e15_b9ea208be7c5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2781b33d_9689_494a_a69e_c4e752ea550c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3d1f214e_3d90_4cb6_8354_50e80bc5c3ce(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_33f36eef_eec3_4639_a960_681ce9c780cf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f5aca5fa_8962_4794_b5fe_ab3f04efd65c(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_db2a8751_e643_49f6_8138_ea632eff6392(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_1b820575_48cf_4ba1_9b0e_9cee97eeae21(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f5fa053f_ba97_4e87_8181_1ab61afadaf3(ArrayList<Integer> arr, int k) {
        if (arr.size() < k) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int num : arr) {
            if (num % 10 > 0) {
                sum += num;
            } else if (num % 10 == 0) {
                sum += num / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_fd1151e2_c3ba_44c7_9796_44c0861b38b6(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_114ba5be_84e4_4eac_9f58_f5a8fc5ea3e9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_19780ca9_357a_464b_be09_de30fffb7aca(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_1a87f485_f584_44ce_92a5_f2800491341b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a64ba6f2_4a70_4196_8e96_8557dec084a6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_49a43f74_e886_4736_805e_1ee33e2dd99c(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (acc, x) -> acc + x);
    }

    
    public static int addElements_Problem_0_17fe4dc2_e42b_43f9_a341_ad4a30eae99b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_f0bf4980_da70_47f3_b53e_4b63fa7d3389(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_717ce353_b314_4e5c_85bd_28d88e809d17(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_2_3c229453_87d7_4b8d_af0a_1edf6f73b62f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_f5d10536_1816_40d6_974f_5b9024cb3bfb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_6ed5ac5a_583d_47fd_afe1_eb656cee3942(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_a7f1098f_2ce1_4241_899b_e8868aeee4ea(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_cfc3eadd_b831_49cc_bb81_630e77aceaf5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_96200b00_1a74_4aed_92d1_d36a26a55779(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).map(x -> x % 10 + (x / 10) % 10).sum();
    }

    
    public static int addElements_Problem_4_c977ce27_b214_458d_bc5a_6e872d6e8c06(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_2_72909e77_d888_4708_8bfd_f7c1bef011ee(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_7ee7ba4e_2d49_4243_b021_053f8f031aaf(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_b7b18806_2537_4cc5_8c19_64948c93353a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_6a59ba16_5122_4f07_9c8f_a9a989754081(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_1b820575_48cf_4ba1_9b0e_9cee97eeae21(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_96524b10_5cc5_44cb_80d8_12cdc0b51fa8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_0_6481ced1_6fe7_4eef_9f81_7609302274e8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_00d36ed3_2ec6_43ea_a1d8_88868b6a9249(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
            } else {
                sum += arr.get(j) - arr.get(i);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_201981eb_bb3d_4308_9870_e46db71447c0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_5558a482_8af3_48eb_8625_5e4dc2381b9e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_f6ab0401_7eb4_4a49_9e6b_5f5c304fbcd6(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_85bfb2fa_5829_4a8a_b604_7af5fb705975(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_85145930_cea4_4ce5_b017_6aaaba992fbd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c8b92880_29d2_42c6_bab2_87a319f5050a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_42e45d5b_8368_4d7b_8849_8be9ab9d14e4(ArrayList<Integer> arr, int k) {
        // write your code here
        if(arr.size() < 1 || k > arr.size()){
            return 0;
        }
        int sum = 0;
        for(int i = 1; i <= k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6d6c79dc_9526_4275_8195_78cf44df588c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c26ecc40_c2e9_448c_808e_d857ac1e5f16(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_df49fa49_6aa4_4099_8998_a6bf283e1903(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_262b16bb_e46f_44e7_a181_d9366c798637(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_12718561_1e46_41c3_a6db_10d76e4410f2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a67a8866_93c1_4658_983a_369c24566c4f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_e601187b_c8d2_4080_9201_c01fe0e8d7f4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_53e05365_1b77_42f6_bc71_a676fc992bd2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_55b06019_b840_4b12_b7f0_6ecae14c930c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int size = arr.size();
        if (k > size) {
            k = size;
        }
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_bc6c3b92_a74b_40de_bd67_2d2b0101fc52(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3decb9e1_d838_4320_b136_0b09e2e8b077(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_54341e54_ea3f_46fc_bfdd_31435aab1e52(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(n -> n < 100).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_0_3e27ed7e_7b93_47e8_bf1d_ca8ab8595a6f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_e45d779a_f2de_4423_953a_3e8c2168f7c9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_8ead9730_6f37_47c2_8fd2_30df40ffd4cb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e67546d6_bfc3_4446_888f_34de8ffc429a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int max = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                max = Math.max(max, num);
            }
        }
        return sum - max;
    }

    
    public static int addElements_Problem_2_2df81816_95f2_4c68_b8f9_8ab1a145c25a(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_4_b5ef5c50_e42c_49f0_b4c9_7212f9f4491e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d7f964a7_03f7_48ad_bd22_cac2c0ad8a53(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_30d1a606_f81e_43d4_9239_04022769b186(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_69268b8a_47fd_45ba_82b7_5b04b7499c9f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_0b2d8184_0d36_49b2_b166_3e893df03be2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6394ecff_3e5e_49df_b69e_3ea1806164e4(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a3244a9b_866a_4d1f_963c_5347b22397ab(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(i -> i).sum();
    }

    
    public static int addElements_Problem_1_a42e51f1_26bd_4bb0_93cd_18335d545207(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_0cc5f289_cbb4_4387_b417_dbaf0eac0132(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_4177025e_6694_4f2e_9993_ddc6b670fa96(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6b29c45a_2a82_4241_a84a_2b1cfcea181b(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> (1 <= x) && (x <= 99)).limit(k).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_3a1b8a16_e882_4747_9bcb_d599ef0ae342(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < k; i++) {
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        for(int i = 0; i < k; i++) {
            sum += arr.get(i) - max;
            sum += arr.get(i) - min;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6a991d6e_fdc9_48ba_8244_a0e3f47b5d6c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_69334526_56a6_43e9_af4c_f364b401dc67(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_30fcdfda_9754_4fa6_a8ba_faebda010c1c(ArrayList<Integer> arr, int k) {
        int index = 0;
        int sum = 0;
        while (index < k) {
            int elem = arr.get(index);
            if (elem < 10) {
                sum += elem;
            } else if (elem < 100) {
                sum += elem;
            }
            index++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0e4a40f0_fe56_452f_9c93_c490267f3bde(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(len - i < 2) {
                break;
            }
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_0203665a_9090_4b15_82dd_66497e4d6d5c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_a5fce224_9a09_4430_a116_53289170d679(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_8a33f99d_3178_4d54_bcc4_ca57a9cd85ba(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c17d1f6e_736c_4651_9545_a8ce9c4daec9(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, Integer::sum);
    }

    
    public static int addElements_Problem_2_311b5a2e_7ed8_47ff_b070_8b1ad22b4c47(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i <= arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b6bf7909_d544_4843_9139_a0a2b503edcb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2f29d8a3_12d5_44e4_a1c5_dd8a96830aa0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        if (len == 0) {
            return 0;
        }
        int start = 0;
        int end = len - 1;
        int count = 0;
        while (start <= end) {
            if (count == k) {
                break;
            }
            if (count == 0) {
                count++;
                start++;
                continue;
            }
            if (count == 1) {
                count++;
                end--;
                continue;
            }
            if (count == 2) {
                count++;
                continue;
            }
            count++;
            start++;
        }
        if (count == 2) {
            return arr.get(start) + arr.get(end);
        }
        return arr.get(start) + arr.get(end) + arr.get(start + 1) + arr.get(end - 1);
    }

    
    public static int addElements_Problem_0_53db1987_041f_4167_9d89_1a7f30c06e3d(ArrayList<Integer> arr, int k) {
        // write your code in Java SE 8
        int sum = 0;
        for(int i = 0; i< arr.size() && i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5132e6bd_83c1_4909_9259_d264ce320708(ArrayList<Integer> arr, int k) {
        // Initialize a counter to iterate through the first k elements
        int counter = 0;
        // Initialize a total variable to store the sum of the elements
        int total = 0;
        // While the counter is less than k
        while (counter < k) {
            // Add the element at the counter index of arr to the total
            total += arr.get(counter);
            // Increment the counter
            counter++;
        }
        // Return the total
        return total;
    }

    
    public static int addElements_Problem_3_70c1317b_79b0_41cd_be9a_108b3ed55ab5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_53f4a706_1ade_4dfe_a106_673fdb1eb575(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_94868793_86bd_4fac_b31c_98f0de41bcc7(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            int curLen = Math.log10(arr.get(i)) + 1;
            if (curLen <= 2) {
                result += arr.get(i);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_3_b3c90d08_0f7c_4f65_a470_af5c3ca2025b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_f5356311_9680_445d_a6aa_8b8ddb997ca6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b4b6ec5d_2e4b_4f3f_9570_c1cd439ca6e0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_2a9f87a3_a951_4921_9102_137be5560141(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e0d784a1_bdf9_42b5_97fb_b1fffb4a7c27(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int max = arr.size();
        int sum = 0;
        if (k > max){
            k = max;
        }
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_527e410e_fb86_4604_b339_9162fb06ad4d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2e329d2c_4a59_4009_a08b_e3b5db83c482(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_220e9226_a762_4a1f_b29e_c1ae7c902d6f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_89262f92_c508_402c_a817_06cc108e9b27(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d10d32cd_c9d8_4d3d_99b8_f8683123ce9c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) < 10) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else {
                sum += arr.get(i) + arr.get(j) / 10;
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_aaae0a18_1cca_43d7_a80c_3b6723ca2c5d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_160d5d52_b680_4b36_a1f9_4eadc4f8b3dc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_4214bb9d_87d3_442b_88b0_1d30f74eb3bc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_15eb3306_09a6_4201_af08_542b4557b22c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0c22ae52_c7b5_4853_a011_7350e2c26f91(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d5f29a26_11fb_4063_b687_04209ff9f0dc(ArrayList<Integer> arr, int k) {

        int len = arr.size();
        int i = 0;
        int sum = 0;
        while (i < len) {
            if (i + k > len) {
                sum += arr.get(i);
                break;
            }
            sum += arr.get(i);
            i += 2;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_0b2d8184_0d36_49b2_b166_3e893df03be2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c48285f7_9f80_4733_98d6_23f71be6ece4(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int i = 0;
        for (Integer l : arr) {
            if (i < k) {
                sum += l;
            } else {
                break;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0bbc2610_3a7a_45f9_9ac2_c7a7f8499bd1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_773e0de6_7e90_4c02_a164_80d1025e4bb0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        for (Integer l : arr) {
            if (i < k) {
                sum += l;
                i++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_7f9eaf21_b655_48d8_8ebf_79de89d25b26(ArrayList<Integer> arr, int k) {

        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_2_1c0e3bd8_adec_477f_8bcb_4b07ecdfe6fc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_91ca5632_f0b7_4fbf_a380_43b6e48b6638(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int sum = 0;
        for(int i = 0; i < arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a382260e_96fc_473b_aed6_d170d52898e6(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a, b) -> a + b);
    }

    
    public static int addElements_Problem_1_87a56e00_1df2_4f0b_924c_002d48835f2d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_4d8e1c19_1c95_4bdc_b916_6bb7e069349b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_39eb068a_1f3d_4762_9de4_96e062d6c410(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_2b26bec8_f674_46bb_9ea4_f45d9c197714(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_100f207b_a9c2_4501_b2ec_23c8621b7af8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f575282f_4cf5_462b_b7a4_76a181c78ef5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_4b613339_875f_4874_a19d_d08a2660cfb2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_625dde8c_b83f_4e23_80a6_578296c7b655(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_b829c0b3_44f8_4e5a_9629_783641a4bb1c(ArrayList<Integer> arr, int k) {
        int len = arr.size();
        int sum = 0;
        int i = 0;
        while (i < len && i < k) {
            if (arr.get(i) >= 10 && arr.get(i) < 100) {
                sum += arr.get(i);
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_83d52991_0345_42fb_8333_54447ddc72a4(ArrayList<Integer> arr, int k) {
        return ((Stream<Integer>)arr.stream().limit(k)).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_a1cc82ef_4a1e_409d_a13b_75e7fa086616(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_fe855857_2276_4bb5_9e10_0c9b94a30765(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e07c8aa2_a2e8_4291_912e_fd8fef5262f4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_4e271ce9_e608_432a_b1c3_c39683d522b7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_035f0862_eaa3_4159_8ded_7849977d23b0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_3c78ca13_1788_42f9_9edc_43bad4fdce12(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f1e341dc_877e_4c0a_8803_796127c82533(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a80355d5_38a2_4bd1_affc_4e7cc2c52d63(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_61d56cd5_a386_4675_8f56_c4882a181a55(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (count < k) {
                sum += arr.get(i);
                count++;
            }
            if (count >= k) {
                sum += arr.get(i);
                count -= k + 1;
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2b0b6ae0_b7ee_4889_8f8f_8165c263430b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ba89dcb8_1ec4_435e_823f_8f8522c76ae7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_31120fc1_26e2_4fdc_ba09_5a500cc921e6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_9e676007_cc57_435e_bffb_ccb0de935b19(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_be505581_93f8_4805_856e_f7788ae2722d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int addElements_Problem_1_7ddc82f8_df6d_4048_b232_e6a1ad1cf4f6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_dd637cbb_2389_4ff9_8904_201b885f0b51(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_ef77c458_9e2a_4675_81d9_167f9b15b714(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_39d2c033_36be_4265_a029_42b685541eed(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_026e91a7_1a49_4d98_8c24_686ff71b8a58(ArrayList<Integer> arr, int k) {
        int sum = 0;
        if (k == 1) {
            sum = arr.get(0);
            return sum;
        }
        if (arr.size() <= k) {
            return 0;
        }
        // we now know that there are at least k elements, so we can find the first
        // k-2 elements and add them.
        ArrayList<Integer> first2Elements = new ArrayList<Integer>();
        int i = 0;
        while (i < arr.size() && i < k - 1) {
            first2Elements.add(arr.get(i));
            i++;
        }
        sum += addElements_Problem_2_026e91a7_1a49_4d98_8c24_686ff71b8a58(first2Elements, k - 2);
        // now add the remaining elements
        while (i < arr.size()) {
            first2Elements.add(arr.get(i));
            i++;
        }
        sum += addElements_Problem_2_026e91a7_1a49_4d98_8c24_686ff71b8a58(first2Elements, k - 1);
        return sum;
    }

    
    public static int addElements_Problem_3_49755b0c_68c0_48fb_b5d4_ff673f5839cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int elem = arr.get(i);
            if (elem > 10 && elem < 100) {
                sum += elem;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ad9479c5_109e_41fe_a060_b3d767089e94(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_0e91d692_5981_4566_a991_375cf80e8b7e(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_96200b00_1a74_4aed_92d1_d36a26a55779(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).map(x -> x % 10 + (x / 10) % 10).sum();
    }

    
    public static int addElements_Problem_3_4fda675c_f5cc_447e_8830_b8b68317b500(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c06cf628_6d19_4b39_a6d8_ff0a6ff05b18(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2003ca48_0cfd_4ca3_925b_fda00fb60c7f(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            int curr = arr.get(i);
            if (curr < 100) {
                result += curr;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_1_45179921_8f2f_489d_943a_f36b6800c7e0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_947e08ee_70f4_4211_ace0_9bd255c5c2a3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_ef9a7716_b45c_44ad_9277_2c5fa4c5c46f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_9c70d7f0_fec0_4dce_8a6d_7f2816513bd0(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (a, b) -> a + b);
    }

    
    public static int addElements_Problem_2_5be7a0ab_d738_4e19_89e3_fc653a82d554(ArrayList<Integer> arr, int k) {
        // First solution: Do it the old fashioned way.
        // >>> def addElements_Problem_2_5be7a0ab_d738_4e19_89e3_fc653a82d554(arr, k):
        // ...     return sum(v for v in arr[:k] if 0 <= v < 100)
        // ...
        // >>> addElements_Problem_2_5be7a0ab_d738_4e19_89e3_fc653a82d554([111, 21, 3, 4000, 5, 6, 7, 8, 9], 4)
        // 24
        // >>> addElements_Problem_2_5be7a0ab_d738_4e19_89e3_fc653a82d554([111, 21, 3, 4000, 5, 6, 7, 8, 9], 4) == addElements_Problem_2_5be7a0ab_d738_4e19_89e3_fc653a82d554(arr, k)
        // True
        // Time complexity: O(n) linear
        // Space complexity: O(1) constant
        return arr.stream().filter(v -> (v < 100)).limit(k).mapToInteger(v -> v).sum();
    }

    
    public static int addElements_Problem_3_f9590468_317a_43b6_89c0_40414216395b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_714d1045_a933_405c_ba44_91d791e788b9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_5baa5d28_3412_4a44_9b03_1220ad94e2fd(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(n -> (n<100)).limit(k).reduce(0, (n1, n2) -> (n1+n2));
    }

    
    public static int addElements_Problem_3_9a6b9eac_b28d_4cfa_a03a_916ee52824e9(ArrayList<Integer> arr, int k) {
        // Return the sum of the elements with at most two digits from the first k elements of arr.
        int ret = 0;
        int len_arr = arr.size();
        int i = 0;
        while ((i < k) && (i < len_arr)) {
            int tmp = arr.get(i);
            if ((tmp >= 0) && (tmp < 100)) {
                ret = ret + tmp;
            }
            i = i + 1;
        }
        return ret;
    }

    
    public static int addElements_Problem_3_5213e5d1_7cc8_4118_95ec_78febb590331(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num % 10;
                sum += num / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c73be1b1_0bb4_4be5_8af3_e013440523ef(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len){
            if(len - i < k){
                sum += arr.get(i);
                break;
            }
            if(len - i == k){
                sum += arr.get(i);
                break;
            }
            if(len - i == k + 1){
                sum += arr.get(i);
                break;
            }
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_45eb4213_f0e4_4e0d_8402_3f877a3b85a0(ArrayList<Integer> arr, int k) {
        return IntStream.range(0, arr.size())
            .mapToInteger(i -> i < k && arr.get(i) < 100 ? arr.get(i) : 0)
            .sum();
    }

    
    public static int addElements_Problem_2_b22267df_113a_449f_a477_18786a6947c3(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_42b87c6b_6ff4_4a4b_b869_d853606d006b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_4fbe2357_13b4_4ba0_8604_6178b7c49da3(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_93daeb16_8aef_449f_a33c_5dfb5333b419(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_89bdc043_3662_4956_b71d_0d119b230af9(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(i -> i.toString().length() <= 2).mapToInteger(i -> i).sum();
    }

    
    public static int addElements_Problem_1_dc6156cc_a6fa_49e3_90f6_f8ed8d544fbf(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8b45746c_4695_4161_b0a4_b276b98888e8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            sum += arr.get(i);
            if (sum >= k) {
                sum -= arr.get(j);
                j--;
            } else {
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3c78ca13_1788_42f9_9edc_43bad4fdce12(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_05cc4c51_ca84_4763_bc02_503af93aefd4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_9483b8f5_1d2e_432a_9ec8_7fcd1491c480(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while(start <= end){
            sum += arr.get(start);
            if(sum > 9){
                sum = sum % 10;
                sum += arr.get(end);
                end--;
            }
            start++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3a2bf0e7_4f38_498d_b8db_7b5555a49502(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_dab6200c_85ec_4423_879e_dae296d3d0fb(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c8ca3587_c516_4854_9cd7_9aae4cab7009(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while(i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_82005d8d_2071_4129_b805_2f9ee6d28a08(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;

    }

    
    public static int addElements_Problem_2_840e822e_327c_4ec6_92e3_d5a65d3db282(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_27787b92_8edc_4c69_9e4c_fbd45c50d6d9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e83689c8_423c_4839_91df_2924926d41f2(ArrayList<Integer> arr, int k) {
        if (arr.isEmpty()) {
            return 0L;
        }
        int sum = 0L;
        if (k == 1) {
            return arr.get(0);
        }
        ArrayList<Integer> smallerArr = new ArrayList<>();
        for (int curr = arr.get(0); curr < arr.get(arr.size() - 1); curr++) {
            if (k <= arr.size()) {
                smallerArr.add(curr);
                k--;
            }
            if (k == 0) {
                sum += curr;
                k--;
            }
        }
        sum += addElements_Problem_4_e83689c8_423c_4839_91df_2924926d41f2(smallerArr, k);
        return sum;
    }

    
    public static int addElements_Problem_4_1e304cbb_e6a8_467a_8cf1_b9c1439fa321(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_48c162b9_ed5b_435a_8646_9d7cfe8d8919(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_65f1079f_29be_4cae_a268_59f5f670cb09(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(i -> (i < 100)).reduce(0, (a,b) -> (a + b));
    }

    
    public static int addElements_Problem_4_e77de649_0a3b_4d0c_bc8f_148d3ac9dc03(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6d6c79dc_9526_4275_8195_78cf44df588c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a6b0bfa2_13ff_4a8b_8b1e_3a628b6126d7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while (i < n) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
                i++;
            } else {
                break;
            }
        }
        while (i < n) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
                i++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1f44bc13_edbf_4e23_a8eb_4bf5928af471(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while (i < n) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6e8d7008_63cc_4eb4_8d4b_9a4ea6b59185(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_6354367a_7037_4523_b1ac_e3cf87656dc2(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f368436b_778e_4a9a_9796_6338f0fc11d6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f6a0ff58_4829_43fb_87ef_e21802d12249(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_801bf8e7_f536_429b_a893_7f182eb0e529(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_91ca5632_f0b7_4fbf_a380_43b6e48b6638(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int sum = 0;
        for(int i = 0; i < arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6cf7039f_f89e_4476_b538_38a9304fdd11(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_68018177_79ce_4a5d_b2ff_06e946845bb6(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_14a62712_d3d1_4fd6_b00e_265d90a23726(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_1fb52d1d_668f_41e6_9c05_a75a1b4daf94(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c3e80388_8904_4d19_833b_e5a33a7801ce(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d366e088_b112_4413_a38a_d3194e1e262e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_3c331023_dbd5_4b18_b0db_4b373bf511f5(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_d7d6f7c1_efc1_4e8e_9c76_4721cb2dcbe4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_098b9672_69c3_433d_802a_a2ce300fe120(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_9e74530b_93eb_4067_8167_3846532917ce(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int index = 0; index < k; index++) {
            if (arr.get(index) >= 0 && arr.get(index) <= 99) {
                result += arr.get(index);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_4_882648ce_5cb9_4310_ba38_fa85635e64cb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_aebde560_e0e5_440a_9987_d9055cc2f62b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ac7d0fc1_a9ac_4fe4_937c_fb5771c98320(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            sum += arr.get(end);
            start++;
            end--;
            if (sum > k) {
                sum = sum - arr.get(start) - arr.get(end);
                start++;
                end--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_02b458ed_2954_48b5_aad6_a2ee717cfe3f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_781a9c2f_0ded_4d4b_9c19_c829e3907f36(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_cc8df452_2138_4c34_83d5_f910d57dcedd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_e2dd3c13_d2ec_493f_9c33_3828706bbd91(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_69ce742c_1edd_423d_9134_42a48c0c37f0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e4cae927_6223_47d9_9a3b_50760b57937c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_b9e7fcff_84ec_4802_9251_2fd4ca05133e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_795c9d9b_0ed5_452d_94b5_fc17fd1656bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_65509a8c_ca11_421d_abbd_4c4fff74f13a(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_260fecd0_b978_4363_9529_f63447ec9c98(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_79f0d5cd_ce87_4cd2_b61c_6a9132107168(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_640b479d_7446_4eb5_bb53_9a18471c2d71(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            sum += arr.get(i);
            if (sum > k) {
                sum = arr.get(j);
                j--;
            } else {
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d7baf9a5_db5a_4583_9891_97d962a67d71(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_67290664_a271_4e4a_94be_dbd171791c43(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_5763d0d4_a1e3_4db5_992e_103913c5874a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_fcd34b08_1ecc_400b_ac2f_91ac917c230a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1bddb132_7173_4147_8e78_40c116997e46(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i<arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        for(int i = 0; i<arr.size(); i++) {
            sum += arr.get(i);
            if((sum % 10) == 0) {
                sum += k;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f9ab9eb3_71fb_4ca4_8cf9_b8d7de678386(ArrayList<Integer> arr, int k) {
        if (arr.size() < 1) {
            return 0L;
        }
        if (k > arr.size()) {
            k = arr.size();
        }
        int sum = 0L;
        boolean isFirstDigitDigit = False;
        for (int i = 0; i < k; i++) {
            int sum2 = sum + arr.get(i);
            boolean isFirstDigitDigit2 = isFirstDigitDigit;
            if (sum2 % 10L == 0 && sum2 > 0){
                return sum;
            }
            sum = 0L;
            isFirstDigitDigit = False;
            int lastDigitSum = sum2;
            for (int j = i; j < arr.size(); j++) {
                int sum3 = sum2 + arr.get(j);
                if (sum3 % 10L == 0 && sum3 > 0) {
                    if (sum3 > lastDigitSum) {
                        lastDigitSum = sum3;
                        sum = sum3;
                        isFirstDigitDigit = True;
                    }
                }
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_4f4dedce_b446_43c9_97cb_3bf273a6221d(ArrayList<Integer> arr, int k) {

        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < len) {
            if (j < k) {
                sum += arr.get(i);
                i++;
                j++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_3c78ca13_1788_42f9_9edc_43bad4fdce12(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_864557ed_50ab_4a66_a273_b695a1ab3f34(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e657c062_38b0_4d2a_9282_37efcf79a20c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_5163456a_6d7b_4266_9609_cbfca08eec48(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_e3b7584e_dd4d_4bdd_a158_4a4152e10ba1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_46945bef_ec77_4feb_99fc_d2db8fe60ded(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_4251d67c_5f3a_4e9e_ba02_0e2b238a47fd(ArrayList<Integer> arr, int k) {
        // Write your code here
        if (arr.isEmpty() || k == 0 || k > arr.size()) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < Math.min(k, arr.size()); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_bc573144_21e7_4193_b20b_0194602e3b43(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_97a4fc5e_250b_4a92_89c3_12543c8587c2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int size = arr.size();
        for (int i = 0; i < size - k; i++) {
            sum += arr.get(i);
        }
        for (int i = size; i > k; i++) {
            sum += arr.get(i-1);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3e9ca4a2_9a9e_4860_9d12_d052cee161fd(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a041a3ec_bdcf_430c_9fb0_59c2f8b5b75d(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(l -> l).sum();
    }

    
    public static int addElements_Problem_1_87c0bde3_64fd_4c97_9677_c50a91e543cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i <= arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c06cf628_6d19_4b39_a6d8_ff0a6ff05b18(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1be9fbd0_b586_4230_9723_8c9bd0cb702b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3c229453_87d7_4b8d_af0a_1edf6f73b62f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_9972edf8_a12c_47f0_981f_9dc60a79a55d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e9f71b09_430d_4279_bc44_0c70aa2d6341(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_6d6c79dc_9526_4275_8195_78cf44df588c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_38303f39_9faa_4863_81c4_7dad8d8b85ea(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_0_754a9ad4_fddf_45a1_a26c_8328895fd574(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_45b0b802_0cac_4762_9f74_e575203bfb1c(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a, b) -> a + ((a < 10) ? b : b % 10));
    }

    
    public static int addElements_Problem_2_5540ee30_122b_46eb_9c88_36f493b562f9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_038c410b_b8f6_4df7_b607_5815fe1f76e2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_78a704ad_d95d_44a7_a013_33205854fb78(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_0d8df43c_4f99_4f6e_86d3_23207b8eb82e(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_aa97f894_5a33_4c57_9e76_5b1c6e8770b2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_69268b8a_47fd_45ba_82b7_5b04b7499c9f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_4ba35c88_c49d_40d3_b2d4_1c255c6f3217(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            arr2.add(arr.get(i));
        }
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3cb155aa_697f_40ae_8e9e_6b47b22c02b0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a6f2c1bf_0711_4744_bb93_f233b37c3e34(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            if (sum > k) {
                sum = arr.get(end) + sum - k;
                end--;
            } else {
                start++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_75554711_10e2_4efe_9bb0_a73058cbaf31(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) < Math.pow(10, k)) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_7996983c_952f_4adf_b10a_90fae79d6e2c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_ee99f2a8_d258_4a39_855d_8c98844a41ad(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_9cc887e7_fd7b_47ee_b15e_7bd8bcc12a90(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(l -> l < 100).reduce(0, (a,b) -> a + b);
    }

    
    public static int addElements_Problem_1_7109a3aa_d9df_46d7_90bc_d3d80a389b6f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_afb82dbd_adef_48d7_903b_ba3d77a35fa0(ArrayList<Integer> arr, int k) {
        List<Integer> myIntegers = arr.stream().filter(n -> n < 100).collect(Collectors.toList());
        int[] myArray = myIntegers.stream().mapToInteger(l -> l).toArray();
        Arrays.sort(myArray);
        Integer[] myIntegerArray = Arrays.stream(myArray).boxed().toArray(Integer[]::new);
        ArrayList<Integer> myIntegerArrayList = new ArrayList<Integer>(Arrays.asList(myIntegerArray));
        int mySum = 0;
        for (int i = 0; i < myIntegerArrayList.size(); i++) {
            if (i == k) {
                break;
            }
            mySum += myIntegerArrayList.get(i);
        }
        return mySum;
    }

    
    public static int addElements_Problem_4_5b51524a_0048_4a49_938c_778d4c63698a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_29ecfa28_669a_446f_9286_894453c901c0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < n && i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ed054c51_bf40_4b83_a355_40a24647daf7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int max = 0;
        int min = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return sum - max - min;
    }

    
    public static int addElements_Problem_0_b565f4ff_2304_4761_88f2_bf00e22597b0(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_3_4b9a8e63_91c8_43e1_99f6_a372b128561d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while (i < len) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_89dfdba6_e99a_42c0_9776_596f877efeeb(ArrayList<Integer> arr, int k) {
        int res = 0;
        for (int i = 0, j = 0; i < arr.size() && j < k; i++) {
            int first = arr.get(i);
            int second = arr.get(j);
            if (first * 10 + second <= 9 * 10 + k) {
                j++;
            } else if (second * 10 + first <= 9 * 10 + k) {
                i++;
            } else {
                int x = Math.max(first, second);
                int y = Math.min(first, second);
                res = res + x / 10 + y / 10;
                i = j;
            }
        }
        return res;
    }

    
    public static int addElements_Problem_4_08fba9ab_8359_4713_9476_03745ddea8f8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_9d69ecf8_a624_4ed5_8974_51025c5fa080(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_0e66af83_0e4c_418c_8a8c_4e20a7d4644a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_fcef18b1_bb14_4faa_8145_62ae0c009bdf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_62ea2765_cf26_4c81_98ed_4418e4ddf0ff(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_2ceb1e33_dd79_49d7_89ce_6fcf668e41f5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3c8d856b_383b_4773_898b_38dbe352ae1e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_4a2bc2dc_7c49_4a75_9b2c_e3cd6532a8e2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_253b350c_ad65_4632_abfd_dd3fe29626a9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f5a70002_0f93_451d_bb6d_ca3fb2280795(ArrayList<Integer> arr, int k) {
        int count = 0;
        for (Integer num : arr) {
            if (num >= 10 && num < 100) {
                count++;
            }
        }
        return count;
    }

    
    public static int addElements_Problem_3_ef2cb340_ba8c_4495_84d3_a90995456c0a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_9483b8f5_1d2e_432a_9ec8_7fcd1491c480(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while(start <= end){
            sum += arr.get(start);
            if(sum > 9){
                sum = sum % 10;
                sum += arr.get(end);
                end--;
            }
            start++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_32b6de23_95ae_4c9b_8437_fbaed4a0bf7d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_c2f6a658_2d9d_4396_97c3_dda4d542d770(ArrayList<Integer> arr, int k) {
        int result = 0;
        // BEGIN CODE HERE
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 0 && arr.get(i) < 100) {
                result += arr.get(i);
            }
        }
        // END CODE HERE
        return result;
    }

    
    public static int addElements_Problem_3_ff0c9440_6f58_4651_b639_bfd80e401835(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_f3ed7090_4b48_450f_8b3b_99ff5a60f3cf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > 99) {
                sum += arr.get(i) % 100;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7e2e17c4_706a_44dd_be8d_3b58d094313d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_b8648d6a_1faa_4f68_9a2a_c36f5c38190a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_52f31cf4_1265_461c_a3fa_7bff3afd7ecf(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_72f70645_88e1_4690_af3e_2b1a57931fe5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_cbde1573_ac0a_4163_9484_06372d822a3d(ArrayList<Integer> arr, int k) {
        //System.out.println(arr.size());
        //System.out.println(k);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 99) {
                continue;
            }
            sum += arr.get(i);
            count++;
            if (count == k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1b95d89e_e363_4c01_bc53_337c77df949a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_106435b9_8922_4e73_aefb_8a75505ce11f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_dd2a3b2d_3232_44c7_93f9_3a0cc4ec4abe(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_36b56a8c_7909_4e10_8daa_577d8bde9e1f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_4614422d_f6c6_43ff_a9ba_0371c5662bea(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) < k) {
                sum += arr.get(i++);
            } else {
                sum += arr.get(j--);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_6748f74e_a56a_40a0_a5bc_6c768b4028b3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a5bcb540_40dd_4a8e_a38c_e00201d0b6ac(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_12e4d5ef_d325_4f1b_8a2e_e60de24a5750(ArrayList<Integer> arr, int k) {
        // Please fill out this function
        return arr.stream().filter(x -> x > 99).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_af5628db_654d_432e_b8c1_ce7d6e3f4310(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_2_8fafb7a9_ac2c_4807_8017_82b67b4f74e7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d028fefb_0543_47c3_a031_601becb5ee10(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_263fdaa8_8057_439c_a38c_2e02cac985ee(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_a1cc82ef_4a1e_409d_a13b_75e7fa086616(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_70f7b676_f221_485c_bc41_1422f7e928bf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_8c5640b0_4072_4715_8b91_bbb3cf826663(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ed3bbac2_493f_47f5_b857_923a1c69027f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_467a6cc9_dcee_4731_89ec_32c44a2b9c71(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> (x <= 99)).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_3cbc912f_5cec_470c_a67a_e7db9d55f354(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_c1d132f2_a8b0_4300_a22e_3610296110dc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_52f3c45d_a2fe_4e0c_8d01_0ec94e375d4f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2cee6bd0_0982_4872_aa97_8d38bf910911(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a, b) -> a + ((a < 10) ? b : b % 10));
    }

    
    public static int addElements_Problem_3_fbef5100_abee_4d67_b085_c6a0471a2d4a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_8bb99756_0986_4006_b404_48e9b1e9b683(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_c0ca6adb_1184_4119_9b40_67dadcaf8641(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_694e58b4_f3b3_4223_ba29_c8e67a8f701f(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c950b7cd_7186_4f47_a558_4c5b3c9ace1a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;

    }

    
    public static int addElements_Problem_0_5bdd60e5_d2dd_4bad_ab81_e06d03261ae5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ff8a0bc8_ccf1_4a3c_b5e3_f7510892a5e0(ArrayList<Integer> arr, int k) {
        // Input: (ArrayList<Integer>), Integer
        // Output: Integer
        //
        // Time: O(n)
        // Space: O(1)
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10 && arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_bcd96c02_5f19_464c_ae82_4d37de8c1682(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_686411a2_0fb5_4091_ba32_ee35e389c20d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_27cadcc2_b5e6_4637_ab88_838a6efcd886(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_93daeb16_8aef_449f_a33c_5dfb5333b419(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2f008a0f_fef3_423d_b1fe_5cff577409d8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_7ecc595c_d56b_4d56_897b_4dfd3bfb232d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e3deddfe_1c17_4f9f_8fe9_9b7892c29696(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_828ca588_312c_409f_bebd_7799587f90b4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2f3544ef_e12d_406b_8dcb_4ceb40eda765(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a471bc94_ba97_4944_a014_c586da47ad2a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_4_adf6d243_b837_45a7_9f1c_17e919796be8(ArrayList<Integer> arr, int k) {
        // for each item in the array
        //   if it's a two-digit number
        //     add it to the sum
        //   if not, and you have room left
        //     add it to the sum
        //   otherwise,
        //     break
        int sum = 0;
        int c = 0;
        for (Integer i : arr) {
            if (c >= k) break;
            if (i >= 10 && i < 100) {
                sum += i;
                c++;
            } else if (c < k) {
                sum += i;
                c++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_4c2a901a_07bb_49f8_b98f_118f01114ec8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_39bfe812_9664_4e60_ab04_415b45e275eb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_ad0a3a2b_4c7f_4546_8d2d_9b27fe4b6b31(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_20998754_cb9f_4ed1_b9de_e01bdeecca41(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d4ac403f_66ef_4ca5_9363_95576e78e8b3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_a0e55dfa_8650_4f0f_aab0_406e740f5729(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_2eeef152_ffc7_4e89_9052_0a85296cbd34(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f962d925_5e5c_47f0_9989_5cc5d0dda53b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2773fa64_70db_4e26_9f51_5579a437206f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10 + arr.get(i) % 10;
            } else {
                sum += arr.get(i) / 100 + arr.get(i) % 100 / 10 + arr.get(i) % 100 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_67519e65_24a1_4ab1_82a3_d17601a7d6a0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_3fb08884_45e5_49e3_a558_0e9e1afd00a5(ArrayList<Integer> arr, int k) {
        // Start by building a stream of the first k elements
        Stream<Integer> s = arr.stream().limit(k);
        // Then, filter the stream down to elements with at most two digits,
        // and finally, reduce the elements down to a sum
        return s.filter(x -> x.toString().length() <= 2).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_639e02d4_a01d_466d_baac_5e2d169b51a9(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) < k) {
                sum += arr.get(i);
                i++;
            } else {
                sum += arr.get(j);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ef63122b_c43b_4441_8b73_84ccced6de18(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_fdea9f5e_de7a_42a0_b8a4_437a8d536c9b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c13e6aa9_8e4d_4c28_9cc2_8dcae4474d75(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (k == 1) {
            return sum;
        }
        int[] dp = new int[n + 1];
        dp[0] = sum;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            for (int j = 1; j <= i; j++) {
                dp[i] += arr.get(i - j);
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += dp[i];
        }
        return ans;
    }

    
    public static int addElements_Problem_2_151a825f_8804_495e_b4c8_250a96354400(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c16c0d38_f578_4c6e_99ac_697993d1bedc(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_876cdae1_117f_49e9_ba76_bf3ec82d462f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_a39a7068_587d_4c8d_b3ca_2a4e55399674(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_f4fd7404_ae7e_491e_81f4_50b23c72ab01(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b6889c57_cd32_4f05_bfb5_12e82faaaccc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_0cc5f289_cbb4_4387_b417_dbaf0eac0132(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_44526b27_a5e9_4557_a0d9_f3e9ed908dfa(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_985d3369_5507_4141_875b_abea1e19dc0c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len && k > 0) {
            sum += arr.get(i);
            i++;
            k--;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c106119b_d3a4_41ad_b290_da96b78be8c3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_de3ea0a8_9411_416e_9497_2b0051fee7b5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len){
            if(j == k){
                break;
            }
            if(j == 0){
                sum += arr.get(i);
                j++;
            }
            else if(j == 1){
                if(arr.get(i) > 9){
                    sum += arr.get(i) % 10;
                    j++;
                }
                else{
                    sum += arr.get(i);
                    j++;
                }
            }
            else{
                if(arr.get(i) > 9){
                    sum += arr.get(i) % 10;
                    j++;
                }
                else{
                    sum += arr.get(i);
                    j++;
                }
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_cd3c92a1_2b31_4e15_a7c0_ef87890b5433(ArrayList<Integer> arr, int k) {
        // write your code here
        int sum = 0;
        for(int i=0; i< Math.min(k, arr.size()); i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b906c40c_851b_42f3_a3e3_4642a0331e0d(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_cc8df452_2138_4c34_83d5_f910d57dcedd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_60488a29_6da2_435e_a4c5_2dd5284d290a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_a62b45ae_b77f_4baa_abf7_ba48af2d8262(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e0806dfd_1c73_4935_b53a_6ccf975ef4e8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_4966e607_8b82_46bd_9948_0a94f71b43a7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f3bf0b21_54bd_42f6_9ae8_33eeed73832a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
            } else {
                sum += arr.get(j);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_7cd7d95b_2617_4352_ac20_1dc5599dd67f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int temp = sum;
        while (temp > 99) {
            sum = sum % 100;
            temp = temp / 100;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_65741a91_1c70_4d4e_a222_71740077d0e8(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e7b342d0_e40d_4337_a6d7_bdfce0e2cc50(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_7454cc9d_a9c6_47ef_816f_dcb8b3cf2cc5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_28506f0a_9bb5_486d_b6c4_8a0e14821c80(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d2ccca8c_a682_48eb_b996_3067090a8a16(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_563f37fb_2043_4399_be3e_ea73a423909b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_cb84528d_5715_40f7_996f_175564239d6d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e99d4839_8d1f_4725_aa1b_bf765a219ab3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8bcdab1c_633a_4b27_a829_e45c3cc365c4(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x.toString().length() <= 2).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_f3946b0b_e9db_4d49_b3ef_a35e115365b9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f36a0107_c72e_4f0c_832c_4144358cd7ec(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_bc282ee9_f9a9_430a_8ed2_8b17943d1573(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int limit = k > arr.size() ? arr.size() : k;
        for (int i = 0; i < limit; i++) {
            Integer elem = arr.get(i);
            if (elem > 0 && elem < 100) {
                sum += elem;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c674cace_a64d_451a_8c12_a0ddf8e1e33f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e9c6e174_342f_4eea_baaf_2f48210f3eb0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2f195090_b0dc_49af_b9a6_be77793c7850(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_0cc5f289_cbb4_4387_b417_dbaf0eac0132(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_9cc887e7_fd7b_47ee_b15e_7bd8bcc12a90(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(l -> l < 100).reduce(0, (a,b) -> a + b);
    }

    
    public static int addElements_Problem_4_938bb325_305b_434b_8838_314ee8d72113(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6f1e4f7c_20b0_49cf_a10a_31605de20e6f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c5bced2a_2f72_4782_be4f_8774f6d14fef(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        int j = 0;
        while(i < arr.size() && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_852ba96e_9043_4156_9db7_c63cfa5f636f(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i : arr) {
            if(l.size() >= k) {
                break;
            }
            l.add(i);
        }
        int sum = 0;
        for(int i : l) {
            if(i%10 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d317be96_bfc9_498b_90d6_13dfd39d23df(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9a52b8ff_58aa_4dc8_91a1_4e4acf3a3048(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_bb94bbcf_465d_43ad_9a78_6b31b3d8f16b(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> (x < 100)).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_4_97dadc0f_44b7_411d_9f28_6213ec9c17c9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_70167f05_7372_4f58_a15d_8955ce223353(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_10f0e0e0_412d_42e6_a7e2_a643bd66ee77(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > 9 && arr.get(i) < 100) {
                result += arr.get(i);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_1_723d2304_a26d_4a8f_bfe3_2f8abfc75c5c(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_1f103c02_0c42_46f3_9519_5fed37d174ae(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_be1c71f1_3a8e_4df6_9b1e_b2007783f930(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_acb0974e_c744_448b_a554_3bcb4f0bd741(ArrayList<Integer> arr, int k) {
        int ret = 0;
        for (int i = 0; i < k; i++) {
            String s = String.valueOf(arr.get(i));
            if (s.length() <= 2) {
                ret += arr.get(i);
            }
        }
        return ret;
    }

    
    public static int addElements_Problem_3_9dd52bdc_012e_4ba9_b8c5_9fbd8d6144a9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_98289b08_c935_4417_be27_6dc715118ef6(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        for (int num : arr) {
            if (i < k) {
                sum += num;
                i++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_016d0ee3_3348_4e5b_b1a5_75f2445aacd1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_72cca132_6abd_49d7_8269_e3a9733ff543(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_3032de24_d380_4977_8bec_30ee1cc51035(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e5d949fe_79f0_4e83_98d8_6afe15a1dd93(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b671a4b0_cd13_49fc_9694_83b13f7dec01(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ba89dcb8_1ec4_435e_823f_8f8522c76ae7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_81c041b3_c3bd_4720_9eb7_874a33f66f79(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_0f9254e4_040f_485b_8355_6b6c5b5f46cf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_44245e21_4546_45fd_bded_2844787f9ab0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_bc587044_7561_4007_afb4_80f2a56a41e5(ArrayList<Integer> arr, int k) {
        // Solution:
        // 1. Set an accumulator
        // 2. Iterate through the array
        // 3. Add to the accumulator if the element has at most two digits
        // 4. Return the accumulator
        int total = 0;
        int i = 0;
        while (i < arr.size() && i < k) {
            if (arr.get(i) < 100) {
                total += arr.get(i);
            }
            i++;
        }
        return total;
    }

    
    public static int addElements_Problem_1_726574a5_9a5a_4032_9254_83bbbec032c4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c3a7d438_e58e_40f4_81f1_38af16800eda(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_9a52b8ff_58aa_4dc8_91a1_4e4acf3a3048(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_3c229453_87d7_4b8d_af0a_1edf6f73b62f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_429df7a9_42aa_4c33_9095_824d1573b60d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e5df6724_1e4a_4bca_a399_66f3ad8492d5(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_86962a20_d5b2_4eb0_a81d_3ebfd92737a4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_49a43f74_e886_4736_805e_1ee33e2dd99c(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (acc, x) -> acc + x);
    }

    
    public static int addElements_Problem_4_ddad71d4_2b34_4f00_8a45_13f8311288e6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f3712d07_6a6a_4e9e_8773_354a6ea587e6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_b8dda961_28e5_4698_9335_3deb3913c890(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ca3e264e_2430_4c75_857a_367ee03d9872(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d893fe49_85ce_45c9_8d96_362bd6da8cb2(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_3_0035b721_7d08_4168_bdcd_b933b156a59f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d24e193e_5d5b_4865_b206_7b81643b17e7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_22a5bd41_382a_4b03_bcd7_247d48683b71(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_00a42c8c_2e91_4265_8651_1d0daf7c6ce1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_2cb3cd23_5103_4628_869d_b76638b72260(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_efca2737_6f47_49de_ba83_f22fcb4cfbe5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_30ed58ba_c9e4_4dbb_b9e2_10ecbb913864(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f8301792_a520_4401_ac66_805acafdefd1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8dce508c_3691_48a2_8d5c_18b358cfca72(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f0f20b73_e04d_42f1_bc53_1e6ac512753b(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_ea66cbb5_afd5_4873_96e5_96334815a8bf(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e2b12189_bdea_4e7e_b4fd_383fc55686b1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7cc43317_a163_4b07_8a36_635d88ea9c20(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_5f1c0848_9f4f_40c0_a1b5_990f7df7d04a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_8a4d3fb6_44ca_46e4_bfe7_1c2da4792deb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_0bf2f775_2353_435f_ab65_8a624704838a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_163ffc7f_5553_4185_a10d_6700ceed5002(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3be1185d_66f3_4c7c_8c26_3291fce612b9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f7f2dc2a_93d8_467b_9d1b_d143383dbd81(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_0d5f0a1a_9036_4361_adc1_8fb7671c1fd7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int n = arr.size();
        for(int i = 0; i < n; i++) {
            if(i < k) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_be7ce192_eb1b_4cbd_b0a8_c7ed17275678(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8d22d0a2_e9d4_4c58_be4d_007b5e6e7034(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_5c065c2f_e7c4_41ab_811a_d32a74b8742a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_2f29d8a3_12d5_44e4_a1c5_dd8a96830aa0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        if (len == 0) {
            return 0;
        }
        int start = 0;
        int end = len - 1;
        int count = 0;
        while (start <= end) {
            if (count == k) {
                break;
            }
            if (count == 0) {
                count++;
                start++;
                continue;
            }
            if (count == 1) {
                count++;
                end--;
                continue;
            }
            if (count == 2) {
                count++;
                continue;
            }
            count++;
            start++;
        }
        if (count == 2) {
            return arr.get(start) + arr.get(end);
        }
        return arr.get(start) + arr.get(end) + arr.get(start + 1) + arr.get(end - 1);
    }

    
    public static int addElements_Problem_0_45a54d67_5f6c_4576_ad68_d9f52c1cb7bc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_1df32723_b779_436f_8bfc_aaa80f03786f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_90703164_55d0_46bc_8212_13fce1a71d03(ArrayList<Integer> arr, int k) {

        // Write your code here
        if (arr.size() == 0) {
            return 0;
        }
        if (k == 0) {
            return 0;
        }
        if (k > arr.size()) {
            k = arr.size();
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_662f09d5_cdc8_47a9_9de3_f2e061b425b4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_00206733_1d94_42d0_ad78_d7e04753b61e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_db45c7af_c51d_4371_8f4c_f1ced533b185(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_81c041b3_c3bd_4720_9eb7_874a33f66f79(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_17788016_8ffa_462b_ac8d_0bedc1de4b1f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ddbcb832_f510_4934_8c2a_3a57fc3cef98(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3ec42401_f0d2_4da5_8107_c40be6cdfe4f(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_bb704d73_6fa5_48b3_9e12_f3b3fc89d643(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_42008312_b4a5_4bf6_bd0b_271c67e54eb7(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;

    }

    
    public static int addElements_Problem_2_1fa1d90d_d6f7_4899_9f6f_0fbfdc169a95(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_38a1d821_cf7d_47e7_a578_33688a507fbf(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            arr2.add(arr.get(i));
        }
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ca3f571c_5202_4a64_92f6_f5a3071773de(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_d590081c_3ce3_4fec_89a6_93a982487621(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            } else {
                sum += num % 10 + num / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_aee1008c_1325_4971_9d4e_3c6dbe621ae5(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_7edafe74_f023_4361_a975_6944781d4438(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1b7c464b_1b85_464d_99f4_a0ff72ef6cf3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_623ba70c_abc3_48ab_aaee_2e442ba941b9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_9483b8f5_1d2e_432a_9ec8_7fcd1491c480(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while(start <= end){
            sum += arr.get(start);
            if(sum > 9){
                sum = sum % 10;
                sum += arr.get(end);
                end--;
            }
            start++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_22a592d9_b40c_4ad6_820e_c47f39a9495c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_789966b3_7165_42d4_b1c5_b5e6756ffdbe(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d4ac403f_66ef_4ca5_9363_95576e78e8b3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_de2eee3a_9ac6_49c6_b669_edf5bf61e49b(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_594b36ff_41ad_42c9_853f_e3856aa241b8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_11bcb5a5_14b2_4852_aa35_d0b73d40be5d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10 + arr.get(i) % 10;
            } else {
                sum += arr.get(i) / 100 + arr.get(i) % 100 / 10 + arr.get(i) % 100 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_bb1b8492_a5ff_48a7_b42b_04cf14ed2d0a(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 100) {
                arr.set(i, 99);
            }
        }
        for (int i = 0; i < k; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_4_43e5817b_7127_47eb_88a3_746b261cb12d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_52b4c0c7_6625_4c5b_82a0_bdfa6f3eefaf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_08fba9ab_8359_4713_9476_03745ddea8f8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_82c0bd9d_e480_4ae0_a8e6_fc1f5dbc2da3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f27cb5b7_def4_4636_ade9_8196d42b8d7f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3cb155aa_697f_40ae_8e9e_6b47b22c02b0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_fee24437_a18b_4c4b_9c84_b5e86b924d63(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_2_faecd649_2fb5_46b5_87f3_ed9ca6ec5f86(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for( int i=1; i<=k; i++ ) {
            sum = sum + arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_717ce353_b314_4e5c_85bd_28d88e809d17(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_1_a27825c3_aceb_4a83_b7c9_c3840c1370fc(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a20cba73_710d_40e1_afa8_2d915f2e7fa6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ae6362b5_cf9c_4ac8_80f4_cb19b5efbb23(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d56a9034_5aff_40e2_b55c_5e311d62e745(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_28c7ad05_5132_491c_b929_1ee209a57eec(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_24ced16e_5092_4eea_ab16_8251abe52e3f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b713bec7_eea4_4b67_9268_1cf0aef2b579(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5c065c2f_e7c4_41ab_811a_d32a74b8742a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_cb86baa6_c822_4580_977d_6d4380d97436(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7996983c_952f_4adf_b10a_90fae79d6e2c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_09a18005_b501_4672_a129_cbfdd6a7acae(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> twodigits = new ArrayList<Integer>();
        int res = 0;
        int i = 0;
        int acc_k = 0;
        while (i < arr.size()) {
            Integer curr = arr.get(i);
            if (curr < 100) {
                twodigits.add(curr);
            }
            i = i + 1;
        }
        i = 0;
        while (i < twodigits.size()) {
            if (acc_k == k) {
                break;
            }
            res = res + twodigits.get(i);
            acc_k = acc_k + 1;
            i = i + 1;
        }
        return res;
    }

    
    public static int addElements_Problem_2_e5d949fe_79f0_4e83_98d8_6afe15a1dd93(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1f05864c_270d_4dfc_ae88_e9bf2e1912ab(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ec2806e4_4bab_4e7f_a84e_d8869b854890(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int count = 0;
        while (k > 0) {
            if (sum > 9) {
                sum = sum / 10;
                count++;
            }
            k--;
        }
        return sum + count;
    }

    
    public static int addElements_Problem_1_f192822a_d4bb_4439_a3cd_4cce10f3dafd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum += (arr.get(i) - min) * (arr.get(i) - max);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_fe855857_2276_4bb5_9e10_0c9b94a30765(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_7959df53_7eb3_448f_8f71_8c36e9bc678a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_9c70d7f0_fec0_4dce_8a6d_7f2816513bd0(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (a, b) -> a + b);
    }

    
    public static int addElements_Problem_4_616f4841_c457_40ac_8fed_23d2a03c642f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int ans = sum;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = sum - arr.get(i) - arr.get(j);
                if (temp <= k) {
                    ans += temp;
                }
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_2_9d69ecf8_a624_4ed5_8974_51025c5fa080(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e62ef732_95ea_4087_bc37_4d9af3b4e9cb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c34ec932_8753_496a_b536_e5afdb7d2889(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1391d3ba_b6dd_4bda_a8ff_41a8c505238f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a683a7a7_e1a2_400c_8b54_9640287cba60(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9869ca12_2867_4461_8e67_6380f97a0532(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 10) {
                sum += n;
            } else if (n < 100) {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f2162eac_2804_4266_805a_0d1cfe27427b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_fcef18b1_bb14_4faa_8145_62ae0c009bdf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_da6d0e61_8a4b_4010_a069_7802b7db574b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_623ba70c_abc3_48ab_aaee_2e442ba941b9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_08114c5f_96d9_4f11_84bf_88b62ba31e07(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6cf7039f_f89e_4476_b538_38a9304fdd11(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_faecd649_2fb5_46b5_87f3_ed9ca6ec5f86(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for( int i=1; i<=k; i++ ) {
            sum = sum + arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_fa133a04_1689_4cdd_8f3e_087225574612(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c5bced2a_2f72_4782_be4f_8774f6d14fef(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        int j = 0;
        while(i < arr.size() && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_bf302486_f550_4f1d_99eb_cb255d4a30e1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_5b0e5036_6ce6_416d_99ed_777bd2b745df(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_476feb18_c1aa_4626_8ece_7600556a9e59(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            String s = arr.get(i).toString();
            if (s.length() <= 2) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1c5d519c_de43_417b_ba04_a834bcf61335(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e12d7d35_8597_41ce_b0c2_b23d7991d42a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_f3ed7090_4b48_450f_8b3b_99ff5a60f3cf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > 99) {
                sum += arr.get(i) % 100;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5ae0a4ec_dafb_4ded_abc2_6e7d34e00f41(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d58038c9_17ff_47a1_adc7_0d497eda802c(ArrayList<Integer> arr, int k) {
        // your code here
        return arr.stream().limit(k).filter(num -> num > 9 && num < 100).mapToInteger(num -> num).sum();
    }

    
    public static int addElements_Problem_2_07ceead3_07c4_44e3_a587_66fd3f0fb688(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        for (i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int result = sum;
        for (; i < arr.size(); i++) {
            result = result + arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_3_6b29c45a_2a82_4241_a84a_2b1cfcea181b(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> (1 <= x) && (x <= 99)).limit(k).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_62a912c4_8304_4a4f_a4f9_a41d13f5a258(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_13f49573_f32c_46cd_972b_a36a910ad013(ArrayList<Integer> arr, int k) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 10) {
                count++;
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                count++;
                sum += arr.get(i);
            }
            if (count == k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_3526fa21_5b9f_42bc_89fb_f489a93d1856(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a0756727_bf02_4edd_b02f_c15bd409faca(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                result += n;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_3_681c907b_818b_452b_ac99_90462828cc4b(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_55dc5c6e_7099_4e22_836c_c00f6ac81f48(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(e -> e.toString().length() <= 2).mapToInteger(l -> l).sum();
    }

    
    public static int addElements_Problem_4_0d11287e_c773_4607_b9e2_81dce21c3b70(ArrayList<Integer> arr, int k) {
        int numDigits =  Math.log10(arr.size())+2;
        int sum = 0;
        int sum1 = 0, sum2 = 0;
        if (arr.size() < k) k = arr.size();
        if (k == 0) {
            sum = arr.get(0);
        } else if (k >= numDigits && numDigits == 0) {
            sum = sum1 = arr.get(0);
            sum2 = 0;
            for (int i=1; i<arr.size(); i++) {
                sum1 += arr.get(i);
                sum2 += sum1;
            }
        } else {
            sum1 = arr.get(0);
            sum2 = 0;
            for (int i=1; i<arr.size(); i++) {
                sum1 += arr.get(i);
                sum2 += sum1;
                if (i==(k-1))
                    sum1 += sum2;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2d93a7c9_6180_44cc_8dac_bab6c9b97796(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_cbc7924c_b62e_4b66_9bd0_6934da746dbf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_8ce801ba_29d6_4dfe_92e1_b797702f1357(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e7417a9c_a0f5_4ee0_b010_0fa091d6f535(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c137fe0a_a74a_4341_ba77_b8b51fde2666(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_6de7cd88_a717_4702_a025_2578f8bdcf2b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7e6a8e1f_313b_4fc5_8626_569535d70efd(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c53cc237_dc1d_4b61_a83b_3fc38442f0a6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_30fcdfda_9754_4fa6_a8ba_faebda010c1c(ArrayList<Integer> arr, int k) {
        int index = 0;
        int sum = 0;
        while (index < k) {
            int elem = arr.get(index);
            if (elem < 10) {
                sum += elem;
            } else if (elem < 100) {
                sum += elem;
            }
            index++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d317be96_bfc9_498b_90d6_13dfd39d23df(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f94b429c_25af_46e9_bdc1_1e73d2384abb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_234fdc22_76c3_4f02_88a6_1e31755e08bd(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_58d04b5f_50f4_4cce_b52a_1b2046ee1782(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1f3c293d_2fae_4850_b28f_dabd2bf041ad(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            int tmp;
            if (n > 9) {
                tmp = n / 10;
                n = n % 10;
                if (tmp > 9) {
                    sum += tmp / 10;
                    tmp = tmp % 10;
                }
                sum += tmp;
            }
            sum += n;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_87c0bde3_64fd_4c97_9677_c50a91e543cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i <= arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_5e488f58_260a_45b3_a7ae_f9927e49f417(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len) {
            if(j < k) {
                sum += arr.get(i);
                i++;
            } else {
                sum += arr.get(j);
                j++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e728a2a5_976e_4fa0_822d_63db4427a581(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_e266e8c8_7def_4dbb_b70e_fd23ec53a6ba(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e55898fb_fbed_4541_9a9d_f5ac22ce48bd(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1fee2249_9e85_4497_bd80_c03c497bf040(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_72472434_7a35_49bd_942e_eee8b9b2e0b8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_bc1406c7_4748_4ffb_afdd_f2ef2e931655(ArrayList<Integer> arr, int k) {
        if (k > arr.size()) {
            throw new IllegalArgumentException("k must be in range 1..len(arr)");
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int value = arr.get(i);
            // One digit, nothing to do
            if (value < 10) {
                sum += value;
            }
            // Two digits, sum the digits
            else if (value < 100) {
                sum += value / 10;
                sum += value % 10;
            }
            // Lots of digits, sum the digits
            else {
                while (value > 0) {
                    sum += value % 10;
                    value /= 10;
                }
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_6d99d75c_21f5_48be_ac0d_82d96c8d3c94(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d6a77a7f_00d3_40ae_bcf1_992bb04523ee(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_2_496d8be7_21a8_4839_bbeb_367b5447bab9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_d185893c_0603_4ab3_bd3b_60173f6fea05(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(e -> e.toString().length() <= 2).limit(k).mapToInteger(e -> e).sum();
    }

    
    public static int addElements_Problem_4_ac07dbac_dc68_48df_a678_0b4c1c423932(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_4_7306f0cc_4a75_4bb7_bfcd_d94aac5f5461(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c9e02712_5f08_46d7_b463_65f22b32d694(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_70a9c9a2_71a7_41f9_9bba_68de0e70f90b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e2b12189_bdea_4e7e_b4fd_383fc55686b1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1b820575_48cf_4ba1_9b0e_9cee97eeae21(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_76ff51bc_513a_44cc_a47a_a06f99144cc4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_9c69f11c_04b2_4310_8b82_9a7262dc0bb7(ArrayList<Integer> arr, int k) {
        return (arr.subList(0, k).stream().filter(x -> x.toString().length() <= 2).mapToInteger(Integer::intValue).sum());
    }

    
    public static int addElements_Problem_2_fb88df5e_3bb8_4928_98a4_b1b5549460dd(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_f5356311_9680_445d_a6aa_8b8ddb997ca6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ba8a5863_4df5_4099_8071_85eea793a789(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_694e58b4_f3b3_4223_ba29_c8e67a8f701f(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_78f3f213_d2fd_443d_a32e_26b9395257ea(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_311b5a2e_7ed8_47ff_b070_8b1ad22b4c47(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i <= arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_944e442e_eaa1_44e0_8466_789030b6bc9e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_585822b1_4b8a_4668_a0ee_4f42b973ac5f(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(i -> i).sum();
    }

    
    public static int addElements_Problem_0_bb76185f_a6f7_4dc1_8e7c_79a8f5b4c8b6(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_e9b96814_e345_4e61_8e89_f37456a77a23(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(e -> String.valueOf(e).length() <= 2).mapToInteger(e -> e).sum();
    }

    
    public static int addElements_Problem_0_c3b0b092_0457_4c14_ad26_c7d01dffbc97(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_17d3aa13_c540_4e61_acc2_6953fe04debb(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_0_78a3e9ae_d347_4c7d_848d_ad768b6f5ba3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5dda39bc_af19_4de3_bf00_a739cf8a4a66(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_003f20b3_eb3e_4aa0_b565_d00d7f6a5ba9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_686ef015_f7d2_482b_a694_868802dcc0f9(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3557028b_bfe9_46ff_bd6d_a8374a24da1d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int number = arr.get(i);
            if (number >= 10 && number < 100) {
                sum += number;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1c5294ca_926d_4729_9d92_89bc565355dc(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f9ba1e52_edd3_446e_81c0_b4d42b9bda36(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1b21a8a8_5f09_44f1_8b77_916f78b1f7ce(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_33bcbfa9_ee30_4758_a3db_79160d0b27ae(ArrayList<Integer> arr, int k) {
        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_1_cac50de1_f28b_4c5c_8b65_a1e8640435c7(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_8a13889b_fa68_4041_8bdd_4fc89287227e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
            if(sum2 > k) {
                sum2 -= k;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e12d7d35_8597_41ce_b0c2_b23d7991d42a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_45a54d67_5f6c_4576_ad68_d9f52c1cb7bc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_e5655505_2329_4600_981c_ef5876175f7d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2a98e370_7ce8_4c97_ba95_e3b285a0fe3e(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_27ffb4cb_43b2_43b0_a8d3_c84cde729cb4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_be889725_408b_4b86_b289_127980974e0d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_7d79f912_ed37_45b1_847e_8768c0014f37(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
            } else {
                sum += arr.get(j) - arr.get(i);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_932f1ed3_865d_4222_8d60_746d7e95db0f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_562a263f_4de7_401d_9eae_3de738a7b9a8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_ac3001dd_0a3f_4e63_b45f_087c933c6556(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_e67546d6_bfc3_4446_888f_34de8ffc429a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int max = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                max = Math.max(max, num);
            }
        }
        return sum - max;
    }

    
    public static int addElements_Problem_1_bb76185f_a6f7_4dc1_8e7c_79a8f5b4c8b6(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_5c526c17_61fb_478c_b32d_c612647ddadf(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i);
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i);
                sum += arr.get(i);
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1f3c293d_2fae_4850_b28f_dabd2bf041ad(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            int tmp;
            if (n > 9) {
                tmp = n / 10;
                n = n % 10;
                if (tmp > 9) {
                    sum += tmp / 10;
                    tmp = tmp % 10;
                }
                sum += tmp;
            }
            sum += n;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_410c04bb_c2c8_4930_b7fe_32be620bd46d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_518a94a6_1565_4a7d_ad01_d9130b0f2214(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_5a1a0710_11ae_40a5_b960_f7991526be74(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_22268cf9_b6da_4797_8011_1f636eefdae9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_527e410e_fb86_4604_b339_9162fb06ad4d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_400dd15d_d7e1_40f0_a123_c8898665ea45(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_044bd4e0_b3b3_487d_a444_32dd30bdb08e(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int size = arr.size();
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3be1185d_66f3_4c7c_8c26_3291fce612b9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_de2eee3a_9ac6_49c6_b669_edf5bf61e49b(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_a67a2781_cfc5_4921_8335_1fff598170d4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_68051c13_7a53_4c43_b145_29a28664480e(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i <= k; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_3_4b589125_d992_4414_bfbe_ad276744007a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_718ded8a_7000_4b47_a8ba_2491f2c7aae9(ArrayList<Integer> arr, int k) {
        // BEGIN_SOLUTION
        return arr.stream().limit(k).filter(n -> n < 100).mapToInteger(n -> n).sum();
        // END_SOLUTION
    }

    
    public static int addElements_Problem_2_e39bfc0f_b46e_4f06_830c_4888b890db9c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_21940948_e60a_42ef_80ae_cea02bc84d74(ArrayList<Integer> arr, int k) {
        int retVal = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                retVal += arr.get(i);
            }
        }
        return retVal;
    }

    
    public static int addElements_Problem_1_ce5adda8_3049_4430_b12a_f42f17e4d627(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num >= 100) {
                num = num % 100;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_518a94a6_1565_4a7d_ad01_d9130b0f2214(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_e19a6b1c_4868_4c99_813a_a83b874c8e9a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d94681fc_a862_449f_9224_839c391f7fc4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_428d04bf_741e_42cf_9946_c01f4a0732aa(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_098b9672_69c3_433d_802a_a2ce300fe120(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e0112073_b9ba_43e2_8400_5a2b3469d90d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d3b472c1_ba5e_4cb0_a2bd_14571694d80d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_600cbea2_0a2f_450c_bf4b_269193db8d1e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 0 && arr.get(i) <= 99) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_7fa61647_9189_4581_8d3c_16085741eb62(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_e7fded4c_049e_4969_a23e_cbadf8a7a952(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ba8a5863_4df5_4099_8071_85eea793a789(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_429df7a9_42aa_4c33_9095_824d1573b60d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2f29d8a3_12d5_44e4_a1c5_dd8a96830aa0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        if (len == 0) {
            return 0;
        }
        int start = 0;
        int end = len - 1;
        int count = 0;
        while (start <= end) {
            if (count == k) {
                break;
            }
            if (count == 0) {
                count++;
                start++;
                continue;
            }
            if (count == 1) {
                count++;
                end--;
                continue;
            }
            if (count == 2) {
                count++;
                continue;
            }
            count++;
            start++;
        }
        if (count == 2) {
            return arr.get(start) + arr.get(end);
        }
        return arr.get(start) + arr.get(end) + arr.get(start + 1) + arr.get(end - 1);
    }

    
    public static int addElements_Problem_4_662a2f41_ac64_47a5_9c7e_77a42c1dde70(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_874bc172_e9db_4140_a13e_7687815efe77(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1c9af279_3b15_41d9_88c0_e7c5e9b1d03d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f27cb5b7_def4_4636_ade9_8196d42b8d7f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6f1fb4ed_656c_476c_9ab1_c741be9addf8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_33c9145d_8bbf_4fc9_86a5_e9d042f02e60(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            int a = arr.get(i);
            int b = arr.get(j);
            if (a + b <= k) {
                sum += a + b;
                i++;
            } else {
                sum += a;
                sum += b;
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b255152b_2b68_4892_b525_35e281672ced(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f912597a_babe_4f26_9ce0_351376eff82c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d366e088_b112_4413_a38a_d3194e1e262e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_389d86f8_5292_4462_b4ac_b646981e2a89(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_1_d3acee4b_a734_4b50_839d_c9169048a50e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_46c41e96_9221_4782_93ee_c140fbf9ca98(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_c503548a_e223_4be5_b701_2ec488efab75(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6f8b795f_4140_403c_b93f_5735e1523874(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int addElements_Problem_3_662a542d_36ea_422f_ac2e_668a1a4f0e6d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d4cd369e_dd75_45be_b7c3_f7fe0d6a6e9d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8510662b_80d6_4340_b46d_5a88c9e9183c(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int index = 0; index < arr.size(); index++) {
            int current = arr.get(index);
            if (current < 100) {
                result += current;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_1_c0cb9004_890d_47ea_a794_a4fe18bda182(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size(); i++) {
            sum += arr.get(i);
            if((i+1)<arr.size() && arr.get(i+1)<10) {
                sum += arr.get(i+1);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_b5ef5c50_e42c_49f0_b4c9_7212f9f4491e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_dc392ce9_2343_42a5_a636_87e243105446(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0, (a, b) -> a + ((b / 100) * 1000 + (b % 100) * 10 + b % 10));
    }

    
    public static int addElements_Problem_3_1ef3031a_743a_4252_a0d4_a29057b14e83(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_88afcb9d_d93a_438b_a938_f90b34b1f8e9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_d61e2ad1_af92_40e2_9fbf_b2471760ff5d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_662f09d5_cdc8_47a9_9de3_f2e061b425b4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_07176f26_6c27_4591_bcc2_19b2ab61a0e3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_4d8e1c19_1c95_4bdc_b916_6bb7e069349b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b985f44b_984f_411a_a7dd_15df4dc13296(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_97a4fc5e_250b_4a92_89c3_12543c8587c2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int size = arr.size();
        for (int i = 0; i < size - k; i++) {
            sum += arr.get(i);
        }
        for (int i = size; i > k; i++) {
            sum += arr.get(i-1);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_07913233_27e5_4d4e_a848_58ade0961177(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1eb893f8_7ec8_4635_9e58_74accf0ee272(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_4a4093de_7e69_4a99_b462_05263e55415e(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_859b9cb9_191c_4e88_bb98_fce62ee5a5e7(ArrayList<Integer> arr, int k) {
        //your code here
        return 0;
    }

    
    public static int addElements_Problem_1_96287488_7ac4_488c_a86c_dd5359699abe(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f9393b7f_c651_4161_add0_bdd95c3303d6(ArrayList<Integer> arr, int k) {
        if (arr.isEmpty()) {
            return 0;
        }
        Set<Integer> digits = new HashSet<>();
        int total = 0;
        for (int i = 0; i < k; i++) {
            digits.add(arr.get(i) / 100);
        }
        for (Integer number : arr) {
            total += number / 100;
        }
        Set<Integer> set = new HashSet<>(arr);
        set.removeAll(digits);
        set.removeAll(set);
        return set.stream().mapToInteger(x -> x * 10).sum();
    }

    
    public static int addElements_Problem_2_5c76e282_3e55_47b5_b3f5_e4f7d8b35fb5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_ac738554_f122_4770_928d_0cff19ad4742(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_92206708_6c43_4aee_966a_162e4105d4da(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_cc80033a_d557_43a5_bedf_bc58265ce0b7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_9841442c_9f94_4bf1_a9ec_5d6d4abd49be(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> { return (x.intValue() < 100 && x.intValue() > 9); }).mapToInteger(x -> { return x.intValue(); }).sum();
    }

    
    public static int addElements_Problem_0_db13bc10_a5a1_4765_a5fd_81b993c51fd7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b90b175c_d231_45d7_9de6_f6437ec3a4b0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_df4c4295_896c_4c49_8af1_487141f5f355(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(arr.get(i) <= 9) {
                sum += arr.get(i);
                i++;
            } else {
                break;
            }
        }
        if(i == len) {
            return sum;
        }
        int j = i;
        while(j < len) {
            if(arr.get(j) <= 9) {
                sum += arr.get(j);
                j++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_db3a507c_7bab_4157_9146_7f821b904429(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ccac9ed7_7967_46f8_bd74_bb92b022f16c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        int j = 0;
        while(i < arr.size() && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_27cadcc2_b5e6_4637_ab88_838a6efcd886(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_9546ff62_bb9f_462a_8c1f_1556abdd4a1d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == k) {
                break;
            }
            int temp = sum - arr.get(i);
            if (temp % 100 <= 9) {
                count++;
            }
        }
        return sum - count;
    }

    
    public static int addElements_Problem_4_ee545bec_84ad_4222_8b59_1d4219b95f99(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8ac31ee1_aa24_40ad_9108_9013519bd879(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6a6bd52d_eb02_4222_9c3b_d7d75dcb1bba(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1b820575_48cf_4ba1_9b0e_9cee97eeae21(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_aebde560_e0e5_440a_9987_d9055cc2f62b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_de607f40_6297_453a_be05_3727f6945b0c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_e657c062_38b0_4d2a_9282_37efcf79a20c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_050f2a40_5943_4ba1_8bc7_cb171f2489d1(ArrayList<Integer> arr, int k) {

        // Write your code here.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_9c1fcb10_96fc_4313_b331_048636161122(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_1c4256f0_d095_42ae_9c8e_4e7e5eb3be91(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_10fe45ea_ab1c_4d00_88d1_5734260000d3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_df84e672_10b4_4b90_8509_cb0ff3833166(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_0287ea1a_460b_4b90_870b_2831d04a6c5b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_cd2b277c_8686_49d4_9e1b_abd55609e717(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_69334526_56a6_43e9_af4c_f364b401dc67(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_2ab7cfa6_ec14_47d6_a33a_6019b07b79e6(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ff173756_375a_4932_ac25_44d649622e10(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f9f4a199_3c74_4a9c_83be_f86a6a00d23a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_7107a5cf_ab2f_4ccd_acac_7927077d901a(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_9a5570a4_bdc0_45a0_aff4_14c59dda2823(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_05d80bac_e0fa_40cb_ac3e_9dbc74b87fc5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int temp = sum;
        while (temp > 99) {
            sum = 0;
            for (int i = 0; i < k; i++) {
                sum += arr.get(i);
            }
            temp = sum;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a68c9100_aede_440b_819f_d56a59c09e0b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_9088f9f0_2efd_45ec_9815_2fad15c327bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_42b87c6b_6ff4_4a4b_b869_d853606d006b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f7cf48bb_0a58_46fc_b748_408bd74c239b(ArrayList<Integer> arr, int k) {

        int len = arr.size();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i < k) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_b2756745_7fbe_435c_a22e_c83b7f4c5360(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8f10104c_5bfa_46ad_9c60_68fd7de3330c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_aaec0e69_29fb_450a_8f18_b4bcfaca8505(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f7f2dc2a_93d8_467b_9d1b_d143383dbd81(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ecb1c0f1_1afc_44b5_8837_6174d370e4b9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_519ac2bc_4103_4670_861d_e729c0726eda(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > 9) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) * 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b27f2575_25a4_4e1b_a090_e45936be2e65(ArrayList<Integer> arr, int k) {
        // sum of the elements with at most two digits from the first k elements of arr
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_09a1779e_65b5_4a37_8856_4c9fea16db32(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a15ab459_58a4_470c_8ee6_b847004f87e6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 100) {
                continue;
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1b85e4f8_eb94_4a07_abbc_68832778ebbe(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_039df966_3446_4378_bdee_38a26963fe9f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else {
                sum += arr.get(i) + arr.get(j) - k;
                k = 0;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ffa13b06_af1e_49ed_8290_f2749dcf6a0f(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_8542ba08_f418_4d9d_adb4_5e136aedfc49(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> (x < 100 && x > 9)).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_adf0be15_3925_4be5_89ff_a64bbc0e02a8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_bf5285fb_a0c6_42c1_8c48_3ea62385ed0f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_89bdc043_3662_4956_b71d_0d119b230af9(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(i -> i.toString().length() <= 2).mapToInteger(i -> i).sum();
    }

    
    public static int addElements_Problem_1_ef60c7a4_0a60_4939_90f6_3e5a303f66e4(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_54341e54_ea3f_46fc_bfdd_31435aab1e52(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(n -> n < 100).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_4_7692c5a7_9b03_4b24_93fb_91a2a16153ef(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e83689c8_423c_4839_91df_2924926d41f2(ArrayList<Integer> arr, int k) {
        if (arr.isEmpty()) {
            return 0L;
        }
        int sum = 0L;
        if (k == 1) {
            return arr.get(0);
        }
        ArrayList<Integer> smallerArr = new ArrayList<>();
        for (int curr = arr.get(0); curr < arr.get(arr.size() - 1); curr++) {
            if (k <= arr.size()) {
                smallerArr.add(curr);
                k--;
            }
            if (k == 0) {
                sum += curr;
                k--;
            }
        }
        sum += addElements_Problem_1_e83689c8_423c_4839_91df_2924926d41f2(smallerArr, k);
        return sum;
    }

    
    public static int addElements_Problem_3_6215cadb_b2c1_4ad3_aaa4_7f6aa7b8ade8(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_0ae5476c_791d_442a_87c7_585b81e9c2bf(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(e -> e >= 10 && e < 100).limit(k).mapToInteger(e -> e).sum();
    }

    
    public static int addElements_Problem_3_a59b8972_d81c_46fe_a641_2c6b797538db(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_f6a0ff58_4829_43fb_87ef_e21802d12249(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6d38dc55_281a_44d9_a178_0c6592870bc6(ArrayList<Integer> arr, int k) {
        int result = 0;
        for(int i = 0; i < arr.size(); i++) {
            boolean isValid = True;
            for(int j = 0; j < i; j++){
                if(arr.get(i) < arr.get(j)) {
                    isValid = False;
                    break;
                }
            }
            if(isValid) {
                result += arr.get(i);
                if(result > k) {
                    break;
                }
            }
        }
        return result;
    }

    
    public static int addElements_Problem_0_434bcd95_7655_4fa0_a0cc_528b1495d840(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_b3c90d08_0f7c_4f65_a470_af5c3ca2025b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_0f943187_eae3_402a_9ddb_9e6379f82e0a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_8ce801ba_29d6_4dfe_92e1_b797702f1357(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c3638e6c_ba0a_4319_883b_6cd174e94b82(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_adf6d243_b837_45a7_9f1c_17e919796be8(ArrayList<Integer> arr, int k) {
        // for each item in the array
        //   if it's a two-digit number
        //     add it to the sum
        //   if not, and you have room left
        //     add it to the sum
        //   otherwise,
        //     break
        int sum = 0;
        int c = 0;
        for (Integer i : arr) {
            if (c >= k) break;
            if (i >= 10 && i < 100) {
                sum += i;
                c++;
            } else if (c < k) {
                sum += i;
                c++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0287ea1a_460b_4b90_870b_2831d04a6c5b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2cd8feb0_75d7_4dcd_8d1d_23850d5c8a97(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_a8d86a70_d5c5_4e62_b287_1ca6116bc9f1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_5bbbe2b9_f4ac_4f60_ba3c_7522f95cb87c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6da2a791_b53f_4a91_896f_d0df4a166945(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d042dbf5_87d4_451d_b909_60fee1f6ad6b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_bad55af3_08a3_499d_9e88_5de508e8bd68(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_bc587044_7561_4007_afb4_80f2a56a41e5(ArrayList<Integer> arr, int k) {
        // Solution:
        // 1. Set an accumulator
        // 2. Iterate through the array
        // 3. Add to the accumulator if the element has at most two digits
        // 4. Return the accumulator
        int total = 0;
        int i = 0;
        while (i < arr.size() && i < k) {
            if (arr.get(i) < 100) {
                total += arr.get(i);
            }
            i++;
        }
        return total;
    }

    
    public static int addElements_Problem_0_8194b20b_8248_433a_8d64_833ac85894ed(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_426dadb8_5a2e_4563_8d78_36bed770a1b6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_3_5763d0d4_a1e3_4db5_992e_103913c5874a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ee4ee21c_81e4_4319_b32e_8ce9c6d481e7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_10f0e0e0_412d_42e6_a7e2_a643bd66ee77(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > 9 && arr.get(i) < 100) {
                result += arr.get(i);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_0_ba4816d0_ab68_45ae_b1aa_ca323af5bdde(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_2c14259c_a4d8_4a77_aaa7_468c41e22207(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_87e4a76b_4869_45c1_80ab_c47249736446(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_0c363057_09e1_498c_bdc6_99dfcd6a619f(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_305e9db8_7bae_4aec_92cc_8eee91081d5d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_de192e80_6a5d_47f9_86b2_1c4418de6aaf(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_76f9ccc4_a789_42fb_8af3_b8d13f2d7e9d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_c583b55c_72c2_4c00_94aa_d229ed01c36f(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_f1aaaa7a_4bd1_42c7_a878_da88c8c1fd3c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_61d6d04a_7263_45c1_bef9_920b2316f884(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_4_00a42c8c_2e91_4265_8651_1d0daf7c6ce1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8b8c57e6_ead7_44db_bd51_f9444ed6465b(ArrayList<Integer> arr, int k) {
        // your code here
        return 0;
    }

    
    public static int addElements_Problem_3_2a9f87a3_a951_4921_9102_137be5560141(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_efe070a0_dfe4_4832_a754_87384a912c68(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ac738554_f122_4770_928d_0cff19ad4742(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_4dc578f0_6edd_4515_82ae_ce38be524099(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_cbde1573_ac0a_4163_9484_06372d822a3d(ArrayList<Integer> arr, int k) {
        //System.out.println(arr.size());
        //System.out.println(k);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 99) {
                continue;
            }
            sum += arr.get(i);
            count++;
            if (count == k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_58b6a78e_c22b_46ec_bb0c_c3705ddc25a6(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i = 0; i < arr.size(); i++) {
            if(i < k) {
                arr2.add(arr.get(i));
            }
        }
        int sum = 0;
        for(int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e482d884_2efc_4189_8f62_bd5a9e00bbb5(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_1_5632bf14_aace_4390_9e12_05f884a74efb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e0d784a1_bdf9_42b5_97fb_b1fffb4a7c27(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int max = arr.size();
        int sum = 0;
        if (k > max){
            k = max;
        }
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ccac9ed7_7967_46f8_bd74_bb92b022f16c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        int j = 0;
        while(i < arr.size() && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b7a9ce8d_4213_4546_aef2_8937da7a8b1b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            sum += arr.get(i);
            if (sum > k) {
                sum -= arr.get(j);
                j--;
            } else {
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_763c8bfb_8f1f_448f_ad5a_fe667ffbc939(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_cd55a39a_945e_475e_9791_8b444172a3dc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1c0e3bd8_adec_477f_8bcb_4b07ecdfe6fc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c13e6aa9_8e4d_4c28_9cc2_8dcae4474d75(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (k == 1) {
            return sum;
        }
        int[] dp = new int[n + 1];
        dp[0] = sum;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            for (int j = 1; j <= i; j++) {
                dp[i] += arr.get(i - j);
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += dp[i];
        }
        return ans;
    }

    
    public static int addElements_Problem_0_44170b0d_748b_440f_a88c_12c9f4993f93(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_1e4798d9_4a13_4887_98ca_7856d12881dd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_85739b88_6886_4707_a375_e4a5b963a436(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3d02eee5_6bbf_4392_98e5_a7643a5fe2bc(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d1d31288_45ba_4df3_a4b8_00e0766f5ee1(ArrayList<Integer> arr, int k) {
        return arr.stream().map(e->e.toString().length()<=2?e:0).reduce(0,(a,b)->a+b).intValue();
    }

    
    public static int addElements_Problem_4_9ef0fc8b_2ef2_4bab_88e3_accb765d6527(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_f1c14a85_2060_410e_93a8_a98c899630a4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b8bfc3cc_5477_49a5_89e6_1e170deafdf6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_dee0fa3f_29eb_422b_9408_aa97467ed295(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_da6d0e61_8a4b_4010_a069_7802b7db574b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_6cfa54f8_9096_4f9a_8735_c94b5d931c6a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(a -> a < 100).mapToInteger(b -> b).sum();
    }

    
    public static int addElements_Problem_2_f51b4f29_5288_438c_9443_5ef7d4ff141f(ArrayList<Integer> arr, int k) {
        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_3_45a54d67_5f6c_4576_ad68_d9f52c1cb7bc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_4fbe2357_13b4_4ba0_8604_6178b7c49da3(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6ac7154a_e511_4668_8e50_62bf7dacd90a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_af5e0a82_0e3f_44bc_a9fe_fa1edb540e05(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_033b2bf1_3f71_4dcb_9885_f5f8eada42f2(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n-1;
        int sum = 0;
        while(i<j){
            if(arr.get(i) + arr.get(j) <= k){
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            }
            else{
                sum += arr.get(i) + arr.get(j) - k;
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_87c0bde3_64fd_4c97_9677_c50a91e543cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i <= arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_15bd1da1_1d5e_49b6_9bf0_f8e4a1fc72e2(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_bf7bb7f8_42d2_4cf6_8a17_9cb09e0d92f9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5dda39bc_af19_4de3_bf00_a739cf8a4a66(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_45eb4213_f0e4_4e0d_8402_3f877a3b85a0(ArrayList<Integer> arr, int k) {
        return IntStream.range(0, arr.size())
            .mapToInteger(i -> i < k && arr.get(i) < 100 ? arr.get(i) : 0)
            .sum();
    }

    
    public static int addElements_Problem_4_b2447727_d095_4ad2_9dab_856d95025dd8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_c02020af_ccaf_4543_9e22_a96b49b85582(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0b520e9d_b834_40c6_b1d3_ec2eca08822b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(i + k > len) {
                sum += arr.get(i);
                break;
            }
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_686411a2_0fb5_4091_ba32_ee35e389c20d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c89550c6_7ab0_462d_9f46_28eebf7f2111(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8fafb7a9_ac2c_4807_8017_82b67b4f74e7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_058d8c7e_2aeb_4dad_b169_84d2a183d966(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_4_5e488f58_260a_45b3_a7ae_f9927e49f417(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len) {
            if(j < k) {
                sum += arr.get(i);
                i++;
            } else {
                sum += arr.get(j);
                j++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_65509a8c_ca11_421d_abbd_4c4fff74f13a(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_d7f964a7_03f7_48ad_bd22_cac2c0ad8a53(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_83f4171e_95eb_448e_be06_50b834d7668b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_6aa0d46b_2a14_4411_9b1d_b3a882bd8eeb(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i);
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i);
                sum += arr.get(i);
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_53c74d67_fdec_4795_8d95_61c3229edd1f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e47189d1_d235_42c4_b821_7abf09bb0598(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_4af9652a_8ec5_49dc_abee_d01273943276(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_8828ca3e_260d_42ef_90b4_cf00afb04b0b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5f61978d_96bc_463e_bfe2_1193965b4040(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_56ce9891_4d13_498c_ac3e_ab350b30b4b4(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_a1ed770c_672c_4968_9987_a0a6c787fc43(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_a796568c_d4c0_417c_a04a_8f3fee3882dc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_1e4798d9_4a13_4887_98ca_7856d12881dd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_305e9db8_7bae_4aec_92cc_8eee91081d5d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_0f987b91_32ca_4f23_89f8_e01e189bac2b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_10fe45ea_ab1c_4d00_88d1_5734260000d3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d8c96b0a_9b38_446f_b82c_d9f6293a2929(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while(i < n){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_285cab38_9571_4997_b98a_954c799dc7df(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f5c758d2_d7b3_4c82_9999_a052aa33155c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_6e9e688e_f936_4b88_8f07_e8ed87612af3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_9ef0fc8b_2ef2_4bab_88e3_accb765d6527(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_908760b9_3f0d_4f21_aede_7463e47c54d2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2419793c_bf23_4f57_aa11_dedd47d1fdeb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f8524fb2_b6eb_4190_9cad_dfff1d95a4ae(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_00a42c8c_2e91_4265_8651_1d0daf7c6ce1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_bc1406c7_4748_4ffb_afdd_f2ef2e931655(ArrayList<Integer> arr, int k) {
        if (k > arr.size()) {
            throw new IllegalArgumentException("k must be in range 1..len(arr)");
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int value = arr.get(i);
            // One digit, nothing to do
            if (value < 10) {
                sum += value;
            }
            // Two digits, sum the digits
            else if (value < 100) {
                sum += value / 10;
                sum += value % 10;
            }
            // Lots of digits, sum the digits
            else {
                while (value > 0) {
                    sum += value % 10;
                    value /= 10;
                }
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_9af93756_3433_4c99_b923_46bfaaac5f30(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_7454cc9d_a9c6_47ef_816f_dcb8b3cf2cc5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d6ef74a5_ebf2_4c9a_8d7c_865ffe50f4a0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_afd9ee9d_3811_4ee8_8334_822cd3d06880(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a3786e1e_b876_4443_be56_b488e0702883(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a16225b0_8777_4121_aa6c_020766d28495(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int ans = sum;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = sum - arr.get(i) - arr.get(j);
                if (temp <= k) {
                    ans = temp;
                    break;
                }
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_1_be7ce192_eb1b_4cbd_b0a8_c7ed17275678(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_db13bc10_a5a1_4765_a5fd_81b993c51fd7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6481ced1_6fe7_4eef_9f81_7609302274e8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_28506f0a_9bb5_486d_b6c4_8a0e14821c80(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_85739b88_6886_4707_a375_e4a5b963a436(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_98289b08_c935_4417_be27_6dc715118ef6(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        for (int num : arr) {
            if (i < k) {
                sum += num;
                i++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c49a50bf_f08b_45bf_8c10_3660f6cef3d7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_845c3098_bf38_4e11_88a6_c651371d82de(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_df3a35cb_dce3_4035_864d_47284035d730(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_381f39af_1e08_463f_9c39_edcee3693722(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_bbccfcae_8f09_4efb_ad8f_a788afd484d2(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_e1084825_4084_4255_ba2b_9b72a539fd40(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_41c71ba0_c4eb_421f_8095_39db5f08e6ed(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_24215a82_3ff2_4ad6_944d_66279d2d20a9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8cb95107_96db_4dc4_953e_ec6c66ff819f(ArrayList<Integer> arr, int k) {
        int acc = 0;
        int i = 0;
        while ((i < k) && (i < arr.size())) {
            int e = arr.get(i);
            if ((e < 10) || (e < 100)) {
                acc = acc + e;
            }
            i = i + 1;
        }
        return acc;
    }

    
    public static int addElements_Problem_4_864557ed_50ab_4a66_a273_b695a1ab3f34(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_dfe59606_ed9e_443a_b393_25f30dd6258f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b5a0cdd1_8c1c_4d23_afa5_967832f2aa3f(ArrayList<Integer> arr, int k) {

        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_1_51157f2e_3abd_43ba_abd8_3c0336f1c7c8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_876cdae1_117f_49e9_ba76_bf3ec82d462f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_aec8e00e_4886_40cb_9c2a_aafeccd8e33c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_40fd3c43_165a_4c80_a604_05b1abf3583c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c16c0d38_f578_4c6e_99ac_697993d1bedc(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_48a1396b_dfae_4724_be55_e6c551fe7cdb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_63bfdc30_524f_417e_acfd_1f4b0e596bf5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1249d48f_d2d5_4128_a5d8_640c890369a6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_985d3369_5507_4141_875b_abea1e19dc0c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len && k > 0) {
            sum += arr.get(i);
            i++;
            k--;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_0203665a_9090_4b15_82dd_66497e4d6d5c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_a05dcdb5_5e4a_4b14_a7a8_d6bb3fd6fe88(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_48b8197a_3a16_4a2e_9cfe_ac6b4cf2d3d6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_e3b7584e_dd4d_4bdd_a158_4a4152e10ba1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_662a542d_36ea_422f_ac2e_668a1a4f0e6d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_613c35df_f7f7_413e_a5ff_c08ae30d47e7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_683571e2_327d_47ed_8cde_abc3c4634f04(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_89cf4281_1926_47ce_96c5_ca14672cc95f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(arr.get(i) <= 9) {
                sum += arr.get(i);
                i++;
            } else {
                break;
            }
        }
        if(i == len) {
            return sum;
        }
        int j = i;
        while(j < len) {
            if(arr.get(j) <= 9) {
                sum += arr.get(j);
                j++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_7890be94_c895_4006_bc25_6d04185cc720(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_42e45d5b_8368_4d7b_8849_8be9ab9d14e4(ArrayList<Integer> arr, int k) {
        // write your code here
        if(arr.size() < 1 || k > arr.size()){
            return 0;
        }
        int sum = 0;
        for(int i = 1; i <= k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d4b670bf_d496_472d_a244_004cf4d97cea(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_65741a91_1c70_4d4e_a222_71740077d0e8(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f41426cb_0ca8_4f84_b6d9_df3175a5ab1f(ArrayList<Integer> arr, int k) {

        // Write your code here.
        return 0;
    }

    
    public static int addElements_Problem_0_782c8664_6a1e_4de9_b925_e98c5726fc92(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_3dedd83a_35df_4487_bd5a_76d9fcd6da3f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_1_876cdae1_117f_49e9_ba76_bf3ec82d462f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_0f987b91_32ca_4f23_89f8_e01e189bac2b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_71a1f693_61b6_479f_8280_f03ddec1f7bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_ff173756_375a_4932_ac25_44d649622e10(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f5fa053f_ba97_4e87_8181_1ab61afadaf3(ArrayList<Integer> arr, int k) {
        if (arr.size() < k) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int num : arr) {
            if (num % 10 > 0) {
                sum += num;
            } else if (num % 10 == 0) {
                sum += num / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c56a2baf_ac70_46cf_9fe3_81c6a77c139b(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_4_8a13889b_fa68_4041_8bdd_4fc89287227e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
            if(sum2 > k) {
                sum2 -= k;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_4f053b2c_c35b_4906_88a0_9e931139059b(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_90363815_0756_472d_a6c6_c3046f0e87b5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d3b525a8_6f71_4ff7_adbb_ae482845980b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_947e08ee_70f4_4211_ace0_9bd255c5c2a3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_bb704d73_6fa5_48b3_9e12_f3b3fc89d643(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_029186c6_3bc6_4a9f_9562_943683bcedcf(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while(i < j) {
            if(arr.get(i) + arr.get(j) < 10) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else if(arr.get(i) + arr.get(j) >= 10) {
                sum += arr.get(i) + arr.get(j) / 10;
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6cd1a308_8332_4d67_b1e5_d3f836570df8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6cd1a308_8332_4d67_b1e5_d3f836570df8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_4e8ebb68_6903_482d_8eb0_0585569e894d(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int size = arr.size();
        if (k > size) {
            k = size;
        }
        for (int i = 0; i < k; i++) {
            arr2.add(arr.get(i));
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b906c40c_851b_42f3_a3e3_4642a0331e0d(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_ecd0f4e8_ada1_4da1_97b2_4fe981269851(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int sum = 0;
        for(int i = 0; i < len; i++){
            if(i + k <= len){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_25dbc2c9_82db_478a_acdf_94b9ecf084e3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_558d4fea_b98e_4108_8294_8f25aad629c6(ArrayList<Integer> arr, int k) {

        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            sum += arr.get(i);
            if (sum > k) {
                sum -= arr.get(j);
                j--;
            } else {
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_631be608_d3d2_4cab_acac_20e07256e114(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < arr.size(); i++) {
            int currSum = 0;
            for(int j = 0; j < k; j++) {
                currSum += arr.get(i);
                i++;
            }
            if(currSum > maxSum) {
                maxSum = currSum;
                maxSumIndex = i;
            }
        }
        sum += maxSum;
        return sum;
    }

    
    public static int addElements_Problem_1_f3946b0b_e9db_4d49_b3ef_a35e115365b9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_467a6cc9_dcee_4731_89ec_32c44a2b9c71(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> (x <= 99)).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_d2c66931_9a6d_405c_a4ca_7e93c8fcc769(ArrayList<Integer> arr, int k) {
        int res = 0;
        for (int i = 0; (i) < (k); i++) {
            int e = arr.get((i));
            if (((e) >= (10)) && ((e) < (100))) {
                res = (res) + (e);
            }
        }
        return res;
    }

    
    public static int addElements_Problem_3_a7cd62ec_60ae_4c26_98f5_3f37f2fe81d0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_cc0b429d_a585_4862_a70c_aed8a2e62ccd(ArrayList<Integer> arr, int k) {
        return (arr.stream().limit(k).filter(x -> {
            return x < 100;
        }).reduce(0, (a, b) -> {
            return a + b;
        }));
    }

    
    public static int addElements_Problem_2_f3af10f5_750a_4f38_85bf_90e2261548b7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_a8d86a70_d5c5_4e62_b287_1ca6116bc9f1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_d957aa00_cb1b_4423_b6b7_36d90c0f33aa(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            String s = arr.get(i).toString();
            if (s.length() <= 2) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_4dc578f0_6edd_4515_82ae_ce38be524099(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_faecd649_2fb5_46b5_87f3_ed9ca6ec5f86(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for( int i=1; i<=k; i++ ) {
            sum = sum + arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_4efb25bd_975e_4c07_b326_152cfdc138b3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_02fedfd8_c418_4c66_aa38_38d48dabfaaa(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_44245e21_4546_45fd_bded_2844787f9ab0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_14363b89_bfda_4508_9898_6b312df6fcd3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ef2cb340_ba8c_4495_84d3_a90995456c0a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_01fc89dd_207a_4a30_a508_310ae8babd2a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8b220bd2_b807_40cb_949a_0c84ab8e5309(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0e3a74a6_2a79_46c9_bbb6_c6c6d9304b09(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_bcd96c02_5f19_464c_ae82_4d37de8c1682(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_58ae8d1c_19d2_4d5e_820e_2592642f5dec(ArrayList<Integer> arr, int k) {
        int result = 0;
        for(int i=0; i<arr.size()-k+1; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_1_c88b8135_a539_4550_8d99_ac8d28697b53(ArrayList<Integer> arr, int k) {
        // Your code starts here.
        return arr.stream().filter(p -> p < 100).limit(k).mapToInteger(p -> p).sum();
        // Your code ends here.
    }

    
    public static int addElements_Problem_4_098b9672_69c3_433d_802a_a2ce300fe120(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_2fcef9c3_bf17_47bf_86d3_6bbe9897f8a2(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_d7134dde_a52c_4c62_bc42_790241a3230b(ArrayList<Integer> arr, int k) {

        // Write your code here.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_0f1f05d8_b2a9_45f0_93eb_de11462a9d6f(ArrayList<Integer> arr, int k) {
        // // Check for correct input.
        // assert(1 <= arr.size() && arr.size() <= 100);
        // assert(1 <= k && k <= arr.size());
        // // Create a new, sorted list.
        // ArrayList<Integer> sorted = new ArrayList<Integer>(arr);
        // Collections.sort(sorted);
        // // Add all elements to the sum.
        // int total = 0;
        // for (int i = 0; i < k; i++) {
        //     if (sorted.get(i) <= 99) {
        //         total += sorted.get(i);
        //     }
        // }
        // return total;
        return 0;
    }

    
    public static int addElements_Problem_4_bbafbad8_2a7b_45a8_9e47_1ba86dceb07c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_6a6bd52d_eb02_4222_9c3b_d7d75dcb1bba(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8b47ffe5_2e0c_48c9_83cb_0883afe1faf3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e0940816_e681_4d67_a5b4_9f7e13754d6c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6927e4c0_bbba_41cf_b8d0_8680de8239bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c5bced2a_2f72_4782_be4f_8774f6d14fef(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        int j = 0;
        while(i < arr.size() && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ab965fd7_9c18_434c_9012_3ae878673a60(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (sum > 99) {
            return sum;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == k) {
                break;
            }
            if (arr.get(i) < 10) {
                count++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_5c65fcd0_b916_457a_9ee9_78b0591a7006(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_58374f21_edf5_49d8_aa20_1ac9855df79f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size(); i++){
            sum += arr.get(i);
            if(sum > 999){
                sum -= 1000;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f67ac77a_f57c_449b_a690_9a371b7a6c46(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i) / 10;
            }
            else{
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ee29bffd_57e0_42f5_85ac_cb673365126c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8835b797_c821_4cf5_b39b_8d9d55bac10c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_038c410b_b8f6_4df7_b607_5815fe1f76e2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_616f4841_c457_40ac_8fed_23d2a03c642f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int ans = sum;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = sum - arr.get(i) - arr.get(j);
                if (temp <= k) {
                    ans += temp;
                }
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_4_2b0b6ae0_b7ee_4889_8f8f_8165c263430b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_aef7af2e_f4d1_45a0_9b91_d8aed8f90785(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_6ef4acd6_06f4_4cf1_88df_2ae954d11eac(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_582f2ab3_1d2c_49c0_90c9_b278af9261d1(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d1fc5c94_20a3_4ddb_afe1_4106bef933fe(ArrayList<Integer> arr, int k) {
        // Your code here
        int sum = 0;
        for(int i=1;i<k;i++){
            sum+= arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e7fded4c_049e_4969_a23e_cbadf8a7a952(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_718ed0f1_5bcf_4e3d_a2d8_a5bb92f8c789(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len) {
            if(j < k) {
                sum += arr.get(i);
                j++;
            }
            else {
                sum += arr.get(j);
                j++;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_dd2ba09f_c377_4232_9e96_6d0a9f3ec839(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d185893c_0603_4ab3_bd3b_60173f6fea05(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(e -> e.toString().length() <= 2).limit(k).mapToInteger(e -> e).sum();
    }

    
    public static int addElements_Problem_4_c26ecc40_c2e9_448c_808e_d857ac1e5f16(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_9804c843_e0ba_48de_ba1a_d0a046bdc220(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_9db41a97_8e62_4a1e_9293_62741f609b6f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_00d36ed3_2ec6_43ea_a1d8_88868b6a9249(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
            } else {
                sum += arr.get(j) - arr.get(i);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a67a8866_93c1_4658_983a_369c24566c4f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_6e8d7008_63cc_4eb4_8d4b_9a4ea6b59185(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_1b21a8a8_5f09_44f1_8b77_916f78b1f7ce(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e56b2048_9ea0_4eff_a537_304814420072(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d1fc5c94_20a3_4ddb_afe1_4106bef933fe(ArrayList<Integer> arr, int k) {
        // Your code here
        int sum = 0;
        for(int i=1;i<k;i++){
            sum+= arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_431e0e88_4bc9_442b_8530_25693225c5e4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_0d5f0a1a_9036_4361_adc1_8fb7671c1fd7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int n = arr.size();
        for(int i = 0; i < n; i++) {
            if(i < k) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f2b759dc_01c3_4047_a9d0_aa41f19622af(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_5632bf14_aace_4390_9e12_05f884a74efb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_fcb961d3_7356_4cb4_b968_fd5626a13af4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while(i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c91aa6d5_663d_4b92_bf11_89eb575ccd9f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_70167f05_7372_4f58_a15d_8955ce223353(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_18c2f648_4c91_4958_a1e6_13f694e57ec7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_0b36079a_8de4_4a84_8aea_fa6f01e78977(ArrayList<Integer> arr, int k) {
        // Your code here
        int index = 0;
        Integer sum = 0;
        while (index < k && index < arr.size()) {
            if (arr.get(index) > 99) {
                index += 1;
                continue;
            }
            sum += arr.get(index);
            index += 1;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_7083d6c5_fd55_4f20_aa77_6ab0a80c6361(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_68e993d5_28c2_4f15_a5dd_7d0c8177f3f3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(ArrayList<Integer> arr, int k) {
        if (k == 0) {
            return 0;
        } else {
            int el = arr.get((k - 1));
            if (10 <= el && el < 100) {
                return el + addElements_Problem_3_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(arr, k - 1);
            } else {
                return addElements_Problem_3_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(arr, k - 1);
            }
        }
    }

    
    public static int addElements_Problem_0_428d04bf_741e_42cf_9946_c01f4a0732aa(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c069c68d_752b_4fa5_bdf2_f580cc680f20(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_89ccad15_3322_4033_87d3_1911058eb5c5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i) > 9){
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }else{
                sum += arr.get(i);
            }
            if(i >= k - 1){
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8542ba08_f418_4d9d_adb4_5e136aedfc49(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> (x < 100 && x > 9)).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_f1c9de6c_6e72_461e_af66_d700345ebec0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ee29bffd_57e0_42f5_85ac_cb673365126c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b86f4bda_d230_4771_8841_af3bd13f159c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_f7b89701_602f_4d2d_9cb0_5486941ca653(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_62c021a7_997f_4f18_a4a6_867d772c78da(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b9e7fcff_84ec_4802_9251_2fd4ca05133e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1b95d89e_e363_4c01_bc53_337c77df949a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1b060de3_8bc0_4c3e_ae56_0ee6bf7fa4a0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_20b260a0_baa3_4188_9894_c3c477f285b8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_148c958b_a50c_4ae6_9a24_a0adf4af4e4a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c031130e_673b_47af_b4c4_9320d1780c24(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10 + arr.get(i) % 10;
            } else {
                sum += arr.get(i) / 100 + arr.get(i) % 100 / 10 + arr.get(i) % 100 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_562a263f_4de7_401d_9eae_3de738a7b9a8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_1c6e0b5b_1885_412c_994e_2ce24d9d69c2(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_0_773858b2_74a8_40ca_a64c_ddd2d45ca307(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_381f39af_1e08_463f_9c39_edcee3693722(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e150dc93_2bac_41d8_8592_623896eb0746(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_dee0fa3f_29eb_422b_9408_aa97467ed295(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_52b6e662_6454_4f01_9afd_a879ad51c8dd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_39eb068a_1f3d_4762_9de4_96e062d6c410(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_cf71cbf8_d65a_45b1_b081_78f57067e4ba(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_9f2efcde_a8ba_428b_af5c_bcd5ed31920d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_56b5000a_8a63_4871_bbf7_041450e4388d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_e0ef3e81_10e6_48ca_a60c_431dd49ab093(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_dab6200c_85ec_4423_879e_dae296d3d0fb(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_469a0812_7c3d_46e7_af15_50ca43f4a40b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_f6f72a8f_945e_415f_a182_7e6bc0e1550a(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_2_9bb4769e_874d_4f65_814a_e493465be035(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_ea66cbb5_afd5_4873_96e5_96334815a8bf(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c02020af_ccaf_4543_9e22_a96b49b85582(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_9c69f11c_04b2_4310_8b82_9a7262dc0bb7(ArrayList<Integer> arr, int k) {
        return (arr.subList(0, k).stream().filter(x -> x.toString().length() <= 2).mapToInteger(Integer::intValue).sum());
    }

    
    public static int addElements_Problem_1_078f6dba_c8e7_4ee6_9cb3_7af0c4482f0a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_8e05e58e_1a38_4096_a3ad_19894e8c2a11(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_67d74c11_4a95_4ca6_bcb1_345a64b1aad2(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x <= 99).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_0abb019b_7050_447d_b12e_f867c91dfb9a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while(i < n) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6f1e4f7c_20b0_49cf_a10a_31605de20e6f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_53db1987_041f_4167_9d89_1a7f30c06e3d(ArrayList<Integer> arr, int k) {
        // write your code in Java SE 8
        int sum = 0;
        for(int i = 0; i< arr.size() && i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6c4034fd_b93f_446a_8add_3bef842c54be(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10) {
                continue;
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a19b0cf6_7dc5_40ee_bf2a_897597232a0f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f0d47038_1f9d_4dac_9e27_7d057b3a296a(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_51de7ca5_fcd5_4bee_9dc0_9a0673069532(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_9139d853_7a90_4c82_bfe7_97f81e795aff(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_4f38e64b_1dc8_4dc8_8ba9_1f695fabcfa5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_58ae8d1c_19d2_4d5e_820e_2592642f5dec(ArrayList<Integer> arr, int k) {
        int result = 0;
        for(int i=0; i<arr.size()-k+1; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_1_b45ea08e_8ac2_4762_b56c_e767690d2755(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > 9) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) * 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_0f9254e4_040f_485b_8355_6b6c5b5f46cf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_0118ddfe_87ad_4495_9f1a_6336f13b70ae(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_782c8664_6a1e_4de9_b925_e98c5726fc92(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_579dd519_abab_43f3_98cf_4ddd094dfd11(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f4f445df_fcf6_4937_8f20_ae11c2402e40(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len && j < k){
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k){
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_80ab0e5b_5977_4899_8637_f9c652bc0dec(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_51de7ca5_fcd5_4bee_9dc0_9a0673069532(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_748e3937_2736_4e68_b52e_f3e951a322b3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_2cd8feb0_75d7_4dcd_8d1d_23850d5c8a97(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_db3e06ab_7d8e_48da_8621_dae75d0854f4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_62a912c4_8304_4a4f_a4f9_a41d13f5a258(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_72909e77_d888_4708_8bfd_f7c1bef011ee(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_494ab53b_4107_4dd7_8d9e_b0f2eeb4c3e5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6c4034fd_b93f_446a_8add_3bef842c54be(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10) {
                continue;
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_fd74e686_8be5_496b_a48c_61d10bcb2dca(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            if (arr.get(i) < 100) {
                break;
            }
            sum += arr.get(i) % 100;
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e7417a9c_a0f5_4ee0_b010_0fa091d6f535(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f192822a_d4bb_4439_a3cd_4cce10f3dafd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum += (arr.get(i) - min) * (arr.get(i) - max);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_662a542d_36ea_422f_ac2e_668a1a4f0e6d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8ebb7175_e77c_4f8e_b9e0_133f3518521b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_0e66af83_0e4c_418c_8a8c_4e20a7d4644a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_015354f9_47af_4bf1_9f54_5916ea7b9c72(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_fd055361_6797_40de_8008_da1d1fa44310(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(i -> i).sum();
    }

    
    public static int addElements_Problem_3_c950b7cd_7186_4f47_a558_4c5b3c9ace1a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;

    }

    
    public static int addElements_Problem_0_f8301792_a520_4401_ac66_805acafdefd1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_9869ca12_2867_4461_8e67_6380f97a0532(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 10) {
                sum += n;
            } else if (n < 100) {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e1591885_fce2_4f73_ae0f_dfdaa0becd35(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int size = arr.size();
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8326dca7_721c_471d_9fa8_c8bef4570a4f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_9139d853_7a90_4c82_bfe7_97f81e795aff(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_aea4cc6c_1980_45b1_bcda_f0d7a14199e4(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3518033f_75cf_42e1_9164_f18ce063ccdf(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_db2a8751_e643_49f6_8138_ea632eff6392(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_4_48967c55_eac2_424e_9648_6ff6a3956e1f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a55057ef_5bb3_4afb_80fc_b0954548534b(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_b8bfc3cc_5477_49a5_89e6_1e170deafdf6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f8e39e35_01b2_4866_b258_020d3f957e90(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a041a3ec_bdcf_430c_9fb0_59c2f8b5b75d(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(l -> l).sum();
    }

    
    public static int addElements_Problem_2_a97ea297_1ae7_4943_8810_c8058904c33b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_5f46f323_dc7f_4be5_8b67_a8c10bf21673(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            arr2.add(arr.get(i));
        }
        int min = arr2.get(0);
        int max = arr2.get(0);
        for (int i = 1; i < arr2.size(); i++) {
            if (arr2.get(i) < min) {
                min = arr2.get(i);
            }
            if (arr2.get(i) > max) {
                max = arr2.get(i);
            }
        }
        for (int i = 0; i < arr2.size(); i++) {
            if (arr2.get(i) < min || arr2.get(i) > max) {
                sum += arr2.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_dc392ce9_2343_42a5_a636_87e243105446(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0, (a, b) -> a + ((b / 100) * 1000 + (b % 100) * 10 + b % 10));
    }

    
    public static int addElements_Problem_4_70c1317b_79b0_41cd_be9a_108b3ed55ab5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c56a2baf_ac70_46cf_9fe3_81c6a77c139b(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_1_78cbfdc8_fa2b_4f9b_9468_7d4fcc94e847(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_1e4798d9_4a13_4887_98ca_7856d12881dd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_9672128c_5366_4e46_92d4_e42512ab0be7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_cf71cbf8_d65a_45b1_b081_78f57067e4ba(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_3fb1fab5_0a5e_4bbf_a5a0_8e4c6ebb1769(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i) > 9){
                sum += arr.get(i) / 10;
                arr.set(i, arr.get(i) % 10);
            }
            if(i >= k - 1){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e8e3c4cf_e7ff_43ed_bdbe_7a0725f9bca9(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_23300356_1b7a_4ea8_a352_0bc8367940f1(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else {
                sum += arr.get(i) + arr.get(j) - k;
                k = k - (arr.get(i) + arr.get(j));
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ba89dcb8_1ec4_435e_823f_8f8522c76ae7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f465aa8f_77cf_4cfb_b4e9_5d246da70266(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_b5ef5c50_e42c_49f0_b4c9_7212f9f4491e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ab27beca_6fa7_4182_bd8c_7e8445858981(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_333b1895_15a0_4473_ab9a_5e333e52b90f(ArrayList<Integer> arr, int k) {
        int size = arr.size();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr.get(i) > 9 && arr.get(i) < 100) {
                sum += arr.get(i);
                count++;
            }
            if (count == k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ce8c8a2c_23ad_4ce0_b544_afc4fd0442fa(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_48c162b9_ed5b_435a_8646_9d7cfe8d8919(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_58b6a78e_c22b_46ec_bb0c_c3705ddc25a6(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i = 0; i < arr.size(); i++) {
            if(i < k) {
                arr2.add(arr.get(i));
            }
        }
        int sum = 0;
        for(int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_89cf4281_1926_47ce_96c5_ca14672cc95f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(arr.get(i) <= 9) {
                sum += arr.get(i);
                i++;
            } else {
                break;
            }
        }
        if(i == len) {
            return sum;
        }
        int j = i;
        while(j < len) {
            if(arr.get(j) <= 9) {
                sum += arr.get(j);
                j++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d3b525a8_6f71_4ff7_adbb_ae482845980b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_6a6eef7c_2e49_41ef_b9f0_4658ea4a974a(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_4_db3a507c_7bab_4157_9146_7f821b904429(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f6a0ff58_4829_43fb_87ef_e21802d12249(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5fc1dd4d_e1a1_49b7_a344_8ce03c450cfd(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else {
                sum += arr.get(i) + arr.get(j) - k;
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b1ad5662_44e3_4ffe_b44b_fdc9a18e7fc6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e0940816_e681_4d67_a5b4_9f7e13754d6c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_4de43451_5169_41e0_85e2_aa245d73164b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ce74df5c_b927_451a_befe_af9321393247(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_c95aa1b0_80de_4967_ad6b_fe5e3f824759(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).map(x -> x < 10 ? x : x % 10 + x / 10).sum();
    }

    
    public static int addElements_Problem_3_5cd5b14e_4854_4c9f_98e8_d4bea2359eb8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(i -> i < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_9b463f0d_992d_49d8_a78b_1724d4634f2c(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0, (a, b) -> a + ((b / 100) * 100 + (b % 100) / 10 * 10 + b % 10));
    }

    
    public static int addElements_Problem_3_fe0f8a80_75b0_4f36_ab97_c2683aee85e8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_db3d4452_ff6d_4cea_a889_235b9aa81c70(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_b492ea1d_bcd6_47cf_a945_5141898d23e7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f8aa29a3_1192_4c50_8849_59af0b46de44(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5565af85_4503_4c1d_bfe4_6a9a936236e0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_f1c9de6c_6e72_461e_af66_d700345ebec0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_416bc94d_c649_4aaa_8269_ad67148134fd(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b565f4ff_2304_4761_88f2_bf00e22597b0(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_3_07517f69_5d22_4ce2_9fee_dd16944dc627(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_fea23963_eee3_4d7a_8dbb_3b18024f4996(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_82066adb_f416_48ae_bd81_dbcf94320a32(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_0a1b48ec_8c7d_4579_b512_498ecfb6b38b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c9be97d4_83d7_4033_88fa_c1e76c0cecf1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_1391d3ba_b6dd_4bda_a8ff_41a8c505238f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b054f2c5_0678_429e_9ea5_14ebc2c4e72b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b565f4ff_2304_4761_88f2_bf00e22597b0(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_3_6da2a791_b53f_4a91_896f_d0df4a166945(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_525a12f8_7553_46c7_bde2_1c9a28aeb535(ArrayList<Integer> arr, int k) {

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int j = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (j < k) {
                arr2.add(arr.get(i));
                j++;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_9165c309_29ac_4ac9_9118_274968841165(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_78f3f213_d2fd_443d_a32e_26b9395257ea(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_5d694bbe_6dde_450e_9b5c_9e713aae8252(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_c674cace_a64d_451a_8c12_a0ddf8e1e33f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c037eff4_c1ca_4a10_8d21_4ddd1dcb2d4a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_b5fdb614_561d_41cc_a6dc_121daee762f3(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_55b06019_b840_4b12_b7f0_6ecae14c930c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int size = arr.size();
        if (k > size) {
            k = size;
        }
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_925bfe70_1f43_4962_8893_1d5c60fc5b5b(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_1781cb1b_8297_4d37_a029_36444bc105c4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d24e193e_5d5b_4865_b206_7b81643b17e7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f8b44167_ba96_4357_b7df_ea1cad6184cc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_939ef272_8cfd_4e5c_b173_30d50f7d9910(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i = i + 1) {
            int num = arr.get(i);
            if (num < 10) {
                sum = sum + num;
            } else if (num < 100) {
                sum = sum + num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b43cb919_0f56_4107_8682_53934eb4c85d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f0bf4980_da70_47f3_b53e_4b63fa7d3389(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_00206733_1d94_42d0_ad78_d7e04753b61e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e17ac7a7_200b_492b_9792_0583c003e152(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x ->  Math.log10(x) + 1 <= 2).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_56ce9891_4d13_498c_ac3e_ab350b30b4b4(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_a55057ef_5bb3_4afb_80fc_b0954548534b(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_27309072_b150_4000_b190_406f625180ad(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_9f977c5a_c4d8_453e_b8a9_7f78690e7a45(ArrayList<Integer> arr, int k) {
        // Your code here
        int sum = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<k;i++){
            set.add(arr.get(i));
        }
        for(int x: set){
            sum += x;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_681c907b_818b_452b_ac99_90462828cc4b(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_f7cf48bb_0a58_46fc_b748_408bd74c239b(ArrayList<Integer> arr, int k) {

        int len = arr.size();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i < k) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2eaca33d_ef8f_4e2f_9c28_b94a154657ae(ArrayList<Integer> arr, int k) {
        if (arr.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2df9b7a8_632f_4305_944b_0c28c7ed8052(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d3b525a8_6f71_4ff7_adbb_ae482845980b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_b95369ae_e116_4e35_82ec_f57ccda3477d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_de960ae5_242e_4e15_9972_1f88369f9935(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_052d5bba_36cb_4fc1_85f4_1724dc9ab27b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < arr.size()) {
            if (j < k) {
                sum += arr.get(i);
                i++;
                j++;
            } else {
                sum += arr.get(i) / 10;
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ddc513ee_5cb3_418b_a479_7b6406d05fc6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_b75a8857_aecd_43a0_acea_4a371b481eab(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a64ba6f2_4a70_4196_8e96_8557dec084a6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_1f44bc13_edbf_4e23_a8eb_4bf5928af471(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while (i < n) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_781c4dcd_3d2c_4f23_a400_64ad0057cf2a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b671a4b0_cd13_49fc_9694_83b13f7dec01(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c707fa78_886b_42c5_aee4_73cc637e6f30(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_171bb1e5_52de_4087_8d61_f7423c0377aa(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d3b472c1_ba5e_4cb0_a2bd_14571694d80d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f8aa29a3_1192_4c50_8849_59af0b46de44(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_07913233_27e5_4d4e_a848_58ade0961177(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a796568c_d4c0_417c_a04a_8f3fee3882dc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_1f103c02_0c42_46f3_9519_5fed37d174ae(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_8b8efb62_bf80_42d1_987c_7108c1315102(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i <= k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5f0aa038_5980_40bb_b0ce_8809cfbbe87e(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f36425a6_fc81_4005_a352_1b34cdbf802b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_01a4320c_9316_4e51_b0c7_a8868585072c(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_cbc7924c_b62e_4b66_9bd0_6934da746dbf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_f912597a_babe_4f26_9ce0_351376eff82c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c0ca6adb_1184_4119_9b40_67dadcaf8641(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_626aef34_cc8f_46e5_8f45_fe7115732e7d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_ab33f643_f5b6_4f8d_89a8_88e51b346bae(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            String s = String.valueOf(arr.get(i));
            if (s.length() > 2) {
                s = s.substring(0, 2);
            }
            sum += Integer.parseInteger(s);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8a30dd0a_e2dd_485d_87d1_c916e69d0ee7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_4f6f7df7_1f92_4bd0_8f12_8839f6ba4959(ArrayList<Integer> arr, int k) {
        int index = 0;
        int sum = 0;
        for (int x : arr) {
            sum += x;
            index ++;
            if (index <= k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_6edf1494_07c2_4b11_8efe_a6e6114a86bc(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b1ad5662_44e3_4ffe_b44b_fdc9a18e7fc6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_cbd34bb5_22aa_4975_b6d9_3afdb71c1e15(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int l: arr) {
            if (l < 100000000000000) sum += l;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6fe1109b_60c4_46f4_ab84_b16c0f70a574(ArrayList<Integer> arr, int k) {
        // >>> arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum()
        // (24)
        return arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_073c36f6_0425_432b_9396_df856f145808(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int i = 0;
        while (i < k) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
            i += 1;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_eca0408c_80e3_4171_be55_f4d5825db54a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            if (sum > 9) {
                sum = sum % 10;
                start++;
            } else {
                break;
            }
        }
        if (start > end) {
            sum += arr.get(end);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a796568c_d4c0_417c_a04a_8f3fee3882dc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_83d52991_0345_42fb_8333_54447ddc72a4(ArrayList<Integer> arr, int k) {
        return ((Stream<Integer>)arr.stream().limit(k)).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_22a5bd41_382a_4b03_bcd7_247d48683b71(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_08661e8b_5fc3_4c58_b71e_a976ab8ca7be(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_021cc379_6600_41a5_9441_5a0e3e5b99c9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_91174b4c_1bf3_465f_86d0_6bef8a8a5140(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_541ebf1b_fbad_40af_b3ed_4a7c2c76da48(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_cfafa7a2_18a6_4fc1_b450_81b8bd1030f2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_01283cd6_859d_45e0_8fb0_eefaa71bb87d(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (a, b) -> a + b);
    }

    
    public static int addElements_Problem_1_5ec1a395_f20c_434e_9f52_dc9100888ae2(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += (arr.get(i) / 10) + (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1e304cbb_e6a8_467a_8cf1_b9c1439fa321(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_1ae0202a_b673_41f2_8d84_a39ec6736796(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_29ecfa28_669a_446f_9286_894453c901c0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < n && i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5f0aa038_5980_40bb_b0ce_8809cfbbe87e(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_30fcdfda_9754_4fa6_a8ba_faebda010c1c(ArrayList<Integer> arr, int k) {
        int index = 0;
        int sum = 0;
        while (index < k) {
            int elem = arr.get(index);
            if (elem < 10) {
                sum += elem;
            } else if (elem < 100) {
                sum += elem;
            }
            index++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9841442c_9f94_4bf1_a9ec_5d6d4abd49be(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> { return (x.intValue() < 100 && x.intValue() > 9); }).mapToInteger(x -> { return x.intValue(); }).sum();
    }

    
    public static int addElements_Problem_1_3fb1fab5_0a5e_4bbf_a5a0_8e4c6ebb1769(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i) > 9){
                sum += arr.get(i) / 10;
                arr.set(i, arr.get(i) % 10);
            }
            if(i >= k - 1){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_9fe8879a_1e07_4604_afaf_2fdec6c329cc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int a = arr.get(i);
            if (a >= 10 && a < 100) {
                sum += a;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2a661a4e_8ac1_4a2a_94c6_ec9cd7a8d089(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_933e580f_7ea3_464b_837f_1bc387b5d528(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_f62afcf4_f761_4e63_a874_6cdfb06858a0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int sum = 0;
        while (l <= r) {
            sum += arr.get(l);
            if (sum > k) {
                sum -= arr.get(r);
                r--;
            } else {
                l++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_dda46062_90b0_44f4_83e9_bd489fa9155a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8d0bdb55_567e_4a77_b477_8332bac6df3e(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3a3069b3_64b7_4c3f_9649_7b934ac36558(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_fb0450d9_b3ef_4504_80c5_276a67ad377d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_c977ce27_b214_458d_bc5a_6e872d6e8c06(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_0_ae90ea9a_ef15_4940_a2ae_8f58ef58b26f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_65509a8c_ca11_421d_abbd_4c4fff74f13a(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_f0f20b73_e04d_42f1_bc53_1e6ac512753b(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_52b6e662_6454_4f01_9afd_a879ad51c8dd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_987fd6e8_fd21_4dd3_99f7_c1350cceef38(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_aaae0a18_1cca_43d7_a80c_3b6723ca2c5d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_d8280c80_be21_4b7d_81a0_9889eb973ad1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_9fe8879a_1e07_4604_afaf_2fdec6c329cc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int a = arr.get(i);
            if (a >= 10 && a < 100) {
                sum += a;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ac974388_4f7f_4dcc_a8e4_518175148b73(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_c48ec0eb_c58a_47fb_a836_68bb790597e2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_799a4eb9_0a7f_4080_a3eb_1b1d434b141d(ArrayList<Integer> arr, int k) {
        return -1;
    }

    
    public static int addElements_Problem_2_c97ba479_02d5_4716_be49_cc6e829cb1d2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3db5f663_2fdd_4c30_93e1_a1630ecaee4d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3a3069b3_64b7_4c3f_9649_7b934ac36558(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_ff8a0bc8_ccf1_4a3c_b5e3_f7510892a5e0(ArrayList<Integer> arr, int k) {
        // Input: (ArrayList<Integer>), Integer
        // Output: Integer
        //
        // Time: O(n)
        // Space: O(1)
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10 && arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_66a207ea_ac25_4011_9909_cd563c8b114c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_91174b4c_1bf3_465f_86d0_6bef8a8a5140(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_f3bf0b21_54bd_42f6_9ae8_33eeed73832a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
            } else {
                sum += arr.get(j);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_bc573144_21e7_4193_b20b_0194602e3b43(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_cbd34bb5_22aa_4975_b6d9_3afdb71c1e15(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int l: arr) {
            if (l < 100000000000000) sum += l;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_18c2f648_4c91_4958_a1e6_13f694e57ec7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_df0ba358_a185_4129_ad03_64621afafd6a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_3439ad34_d079_45e2_a719_9361e5233d7c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_2_4dc7aee7_a55c_4441_b051_f373c350723d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0ee2626d_b9ea_4b35_bd77_eedf7b7729c5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_95a3f809_9f0b_4b88_aa4a_f45937532533(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c34ec932_8753_496a_b536_e5afdb7d2889(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_afb82dbd_adef_48d7_903b_ba3d77a35fa0(ArrayList<Integer> arr, int k) {
        List<Integer> myIntegers = arr.stream().filter(n -> n < 100).collect(Collectors.toList());
        int[] myArray = myIntegers.stream().mapToInteger(l -> l).toArray();
        Arrays.sort(myArray);
        Integer[] myIntegerArray = Arrays.stream(myArray).boxed().toArray(Integer[]::new);
        ArrayList<Integer> myIntegerArrayList = new ArrayList<Integer>(Arrays.asList(myIntegerArray));
        int mySum = 0;
        for (int i = 0; i < myIntegerArrayList.size(); i++) {
            if (i == k) {
                break;
            }
            mySum += myIntegerArrayList.get(i);
        }
        return mySum;
    }

    
    public static int addElements_Problem_3_76cf12d9_f25f_4138_aec3_2ee82e44c6b3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2252e230_5bb4_4f0e_b69c_809757caf811(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ef07c8d4_a8b4_495c_bb54_cfce93fbe7ef(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ad0a3a2b_4c7f_4546_8d2d_9b27fe4b6b31(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_fe611c91_2275_4716_9a6a_5c24e574ff13(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_c3a7d438_e58e_40f4_81f1_38af16800eda(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d7795493_27d0_4d93_a3b9_2b9c29f00b2d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1eb893f8_7ec8_4635_9e58_74accf0ee272(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5ec1a395_f20c_434e_9f52_dc9100888ae2(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += (arr.get(i) / 10) + (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b795ca99_8810_45e9_8f07_169b1444d3f0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_4c6b4a38_2884_4064_b123_05e1e13633c6(ArrayList<Integer> arr, int k) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 100)
                arr.set(i, 0);
        }
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_db3d4452_ff6d_4cea_a889_235b9aa81c70(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_8a30dd0a_e2dd_485d_87d1_c916e69d0ee7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_74f174e1_1ef0_49be_8dba_c700a3985dcf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_4fbe2357_13b4_4ba0_8604_6178b7c49da3(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_631f1bd0_81cd_46a3_b478_18fed0f5c618(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > 99) {
                continue;
            }
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_fe611c91_2275_4716_9a6a_5c24e574ff13(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_53d3f977_0185_4d49_bf88_d58447b026b2(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_51157f2e_3abd_43ba_abd8_3c0336f1c7c8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_6354367a_7037_4523_b1ac_e3cf87656dc2(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5c065c2f_e7c4_41ab_811a_d32a74b8742a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_f358c0df_ecea_4930_a79b_bb6ca125b2e1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ea253b4d_5025_43f0_ba2d_a6290bc35b8d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c5270379_dd6a_4a4e_b94e_3089c328e3f3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_4f6f7df7_1f92_4bd0_8f12_8839f6ba4959(ArrayList<Integer> arr, int k) {
        int index = 0;
        int sum = 0;
        for (int x : arr) {
            sum += x;
            index ++;
            if (index <= k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_46ab8b2e_3169_4f09_99af_fbdfb7cd01c8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_c2b58ec2_69b0_44c4_ab3c_53a26cfac891(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_2419793c_bf23_4f57_aa11_dedd47d1fdeb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_09526fe6_ad25_478d_9947_56cdac80a0a0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_2_a67a2781_cfc5_4921_8335_1fff598170d4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_bb76185f_a6f7_4dc1_8e7c_79a8f5b4c8b6(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_5ec49b1d_27a0_4e58_bd28_ba7aa029e3fd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_234fdc22_76c3_4f02_88a6_1e31755e08bd(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_85739b88_6886_4707_a375_e4a5b963a436(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_dcd2cbb3_2989_4713_be8b_5569eb47336d(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).map(x -> String.valueOf(x).length() <= 2 ? x : 0).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_3fcb179e_dd57_43f8_922f_38c04a7b43be(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == k) {
                break;
            }
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_c16c0d38_f578_4c6e_99ac_697993d1bedc(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_c34a9c17_6ad1_49dc_b583_d582044f1acc(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8dc9e32a_d260_49f0_950b_71579716fc81(ArrayList<Integer> arr, int k) {
        return StreamSupport.stream(arr.spliterator(), False).mapToInteger(n -> (n < 100) ? n : 0).sum();
    }

    
    public static int addElements_Problem_0_f66793dc_c276_4f34_aaba_c5880c894459(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_628ded2a_4915_46e5_8028_bb095b9835af(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d6f4deb5_324e_442b_9f7f_3e1368f7a516(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c7ba0999_c1d7_4ad3_8d8f_dbe4da2d1a4c(ArrayList<Integer> arr, int k) {
        // Your code here.
        return 0;
    }

    
    public static int addElements_Problem_4_262b16bb_e46f_44e7_a181_d9366c798637(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e8fbe044_8ba2_46ce_a9a1_47d7788004ac(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_e728a2a5_976e_4fa0_822d_63db4427a581(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_16209022_d978_4eee_85d8_6e1c0d312c6e(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            int num = arr.get(start);
            if (num < 10) {
                sum += num;
                start++;
            } else if (num < 100) {
                sum += num;
                start++;
                end--;
            } else {
                break;
            }
        }
        if (start > end) {
            return sum;
        }
        int start2 = start;
        int end2 = end;
        while (start2 <= end2) {
            int num = arr.get(end2);
            if (num < 10) {
                sum += num;
                end2--;
            } else if (num < 100) {
                sum += num;
                end2--;
            } else {
                break;
            }
        }
        if (start2 > end2) {
            return sum;
        }
        int start3 = start2;
        int end3 = end2;
        while (start3 <= end3) {
            int num = arr.get(end3);
            if (num < 10) {
                sum += num;
                end3--;
            } else if (num < 100) {
                sum += num;
                end3--;
            } else {
                break;
            }
        }
        if (start3 > end3) {
            return sum;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_026e91a7_1a49_4d98_8c24_686ff71b8a58(ArrayList<Integer> arr, int k) {
        int sum = 0;
        if (k == 1) {
            sum = arr.get(0);
            return sum;
        }
        if (arr.size() <= k) {
            return 0;
        }
        // we now know that there are at least k elements, so we can find the first
        // k-2 elements and add them.
        ArrayList<Integer> first2Elements = new ArrayList<Integer>();
        int i = 0;
        while (i < arr.size() && i < k - 1) {
            first2Elements.add(arr.get(i));
            i++;
        }
        sum += addElements_Problem_4_026e91a7_1a49_4d98_8c24_686ff71b8a58(first2Elements, k - 2);
        // now add the remaining elements
        while (i < arr.size()) {
            first2Elements.add(arr.get(i));
            i++;
        }
        sum += addElements_Problem_4_026e91a7_1a49_4d98_8c24_686ff71b8a58(first2Elements, k - 1);
        return sum;
    }

    
    public static int addElements_Problem_1_4efb25bd_975e_4c07_b326_152cfdc138b3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_f6280720_cc29_4c07_8e8a_32444a9dfd86(ArrayList<Integer> arr, int k) {
        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_4_f1576de5_0468_47e7_9fa0_1404f62cee1f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            if (sum >= k) {
                sum -= arr.get(end);
                end--;
            } else {
                start++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_781c4dcd_3d2c_4f23_a400_64ad0057cf2a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_68018177_79ce_4a5d_b2ff_06e946845bb6(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_856b2f12_0992_420e_9f26_d808c0148447(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_2d548dba_a2b6_46ea_a7d7_318d7c91206d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_188fb71b_ce26_4098_a115_c476dd2f54b7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_616952cf_a025_4c59_a59c_357f32301f2f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_cb84528d_5715_40f7_996f_175564239d6d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a5c21be9_a34d_4448_aaea_d4b3d9c2b84c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_937bcb01_dc5a_414a_981b_64453181596a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while(i < n) {
            if(i + k <= n) {
                sum += arr.get(i);
                i += k;
            } else {
                sum += arr.get(i);
                i = n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b7b18806_2537_4cc5_8c19_64948c93353a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_4311aac5_4a1f_4e6e_b4c2_776cdb0fe75f(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(i -> i >= 10 && i < 100).reduce(0, (a, b) -> a + b);
    }

}
