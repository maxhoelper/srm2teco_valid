package mbpp_633_pair_xor_Sum;

public class mbpp_633_pair_xor_Sum {

    
    public static int pairXorSum_Problem_2_66619711_3761_4f1d_a8f0_4faa99f8427f(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int xor = arr.get(i) ^ arr.get(j);
                sum += xor;
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_24226392_932d_4756_b4e2_89a7fb0e3152(ArrayList<Integer> arr, int n) {
        int sum = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < arr.size(); i++) {
            x = arr.get(i);
            y = arr.get(i + 1);
            sum = sum ^ x ^ y;
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_15a83b85_1b99_46b4_b4ec_be38d7b56edd(ArrayList<Integer> arr, int n) {
        int sum = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i < arr.size(); i++) {
            x = arr.get(i);
            y = arr.get(i + 1);
            z = x ^ y;
            sum += z;
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_bb4efc0a_9204_483b_9cfe_b547285416d3(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_6d62090f_7c4a_4c6a_807a_07d4185f0f38(ArrayList<Integer> arr, int n) {
        int sum = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < arr.size(); i++) {
            x = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                y = arr.get(j);
                sum = sum ^ x ^ y;
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_b6acf59a_7091_4f48_a37d_f3c40979f216(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_0fa457df_d81a_4bae_aa8e_4a90a9410700(ArrayList<Integer> arr, int n) {
        int sum = 0;
        int xor = 0;
        for(int i = 0; i < arr.size(); i++) {
            xor = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(xor != arr.get(j)) {
                    sum += xor;
                }
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_3d658c05_bed2_4d06_bc73_83269c4267ce(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_bb4efc0a_9204_483b_9cfe_b547285416d3(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_de77c14f_6142_49aa_9b5d_20124076ac35(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_23d98be2_7ac9_4874_af9b_28b6503a0b4d(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_eefe0bf8_5eb6_4687_a7c1_50dfb1cd3557(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_2ca9bcd8_e1c4_4aab_8ff4_46ddae71c4b6(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_f417df78_7871_4d58_85dc_d628d81eb49b(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_bc932075_b290_483e_a365_53e9e9e21d71(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += (arr.get(i) ^ arr.get(j));
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_3b5b0afe_cf75_41b1_8eab_aa605d9bb2a2(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int xor = arr.get(i) ^ arr.get(j);
                sum += xor;
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_7305edfd_fdfb_42c8_aaa2_966251f95003(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_b71e672d_3b50_46a3_b5e1_8fbb8a5df5ed(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_3306570e_cd35_41ba_8b80_55cb028c6afb(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_de77c14f_6142_49aa_9b5d_20124076ac35(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_b24f2624_a39a_46f8_bd4b_21c9d358d279(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_2fa49f24_2b21_4fef_a769_4b6ecc38c95b(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_45d02774_328b_43cb_b9d6_9102dbc30ede(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_d6d9b272_531a_4b65_88b8_d67988b24f2d(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_4d27bc63_ce2f_471c_81b3_c3368f543e3a(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_a53f9bf3_1239_4bb6_88f9_f157d5d71c6a(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_d90f31e2_2531_4b66_8410_184aed183cf1(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_5ea86a6f_6ee0_483c_902f_fabce037df2a(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_18b02700_375c_4973_838c_eeb1de3e52d7(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int xor = arr.get(i) ^ arr.get(j);
                sum += xor;
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_716ef939_6e86_4576_860a_60f3112658f0(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_99b96f99_06c4_434b_b4db_0a957811e02c(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int xor = arr.get(i) ^ arr.get(j);
                sum += xor;
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_b6acf59a_7091_4f48_a37d_f3c40979f216(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_ec15f5a2_82f7_4649_b02d_b473dc86bdbe(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_a178061f_a6a1_4066_91f9_9cec51df04db(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_0d12c68f_72f1_4cff_af7e_d40c697b6ec1(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_26efa264_1723_4c54_b8c4_7507164a2800(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_d5d9afca_dbb1_434d_aa7e_1cb0917155c6(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_b1d6c280_1570_4f2b_a67d_0fb8dfea7ea7(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum = sum ^ arr.get(i);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_309e455a_7ee0_4353_a8e2_00c4a8aca20a(ArrayList<Integer> arr, int n) {
        int totalSum = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                totalSum += ((arr.get (i)) ^ arr.get (j));
            }
        }
        return totalSum;
    }

    
    public static int pairXorSum_Problem_0_beed2a50_14e7_43e4_bfbd_67fe952a86aa(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_7f2fbd76_b287_4e7a_af12_27776df258db(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_f4274937_a91d_4ae3_960c_6e0bfd1fdcfd(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_b4ede06c_527d_4c00_9693_b61b72416b72(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_eefe0bf8_5eb6_4687_a7c1_50dfb1cd3557(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_d6b4ab46_7db6_4485_b31b_441f7aab5aed(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum = sum ^ arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_632e7e30_2762_43e3_93bb_f9c7b0847e5f(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_ddc9b88c_5566_4d73_b868_f84276e2e3ce(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_7f2fbd76_b287_4e7a_af12_27776df258db(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_4a2b205f_e935_4a4b_844c_c910212cc9bf(ArrayList<Integer> arr, int n) {
        int sum = 0;
        int xorSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                xorSum += arr.get(i) ^ arr.get(j);
            }
            sum += arr.get(i);
        }
        return xorSum;
    }

    
    public static int pairXorSum_Problem_2_fc5cdaee_03b7_487b_9fc5_c87d8e0b52e8(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_14ee210b_05f7_4982_b585_d9fffb0869d2(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum = sum ^ arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_be11deaa_4bb6_4ad2_9a44_8a28fbbe6d4b(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_5ea86a6f_6ee0_483c_902f_fabce037df2a(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_a178061f_a6a1_4066_91f9_9cec51df04db(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_8ea1e9f1_2979_4671_a5a9_96fd2fdaa573(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_886779f2_8eac_4f69_bb2a_5168d281f52c(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_a6662af5_d86d_4951_9b56_3b3b5de7e02b(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_624a3a88_e91c_4967_ae8e_bcaa23143275(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_f1ef9680_2937_4462_a557_9385fae8b9d8(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_7e52d03c_40e4_4a88_8af6_2cc2a79fe6a1(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_12854bbd_6ea6_4c61_b6d9_96c62730623c(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int xor = arr.get(i) ^ arr.get(j);
                sum += xor;
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_ba8100c3_6aad_4267_bee5_319a589b01a7(ArrayList<Integer> arr, int n) {
        int sum = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < arr.size(); i++) {
            x = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                y = arr.get(j);
                sum = sum ^ x ^ y;
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_82e1090f_8dbf_4593_bb54_b165cb22d6d3(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int xor = arr.get(i) ^ arr.get(j);
                sum += xor;
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_6fa76afa_1149_4701_8ba0_38523d94d986(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_d97b0b25_6ffb_4c97_aefe_04b4c0c36e53(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_0580db7d_f7b3_4617_84d7_d38367c104ac(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_f4f437a5_ee37_4507_a6ac_cd5ad6a3700c(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int xor = arr.get(i) ^ arr.get(j);
                sum += xor;
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_0_5fe42d2f_1fc6_406f_b5bd_365445285879(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_00613188_d5b7_4d7a_90ba_c13a1d966d12(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_2_f950200c_c54b_4164_909c_c9ba09d00df6(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

    
    public static int pairXorSum_Problem_1_39122769_a3e5_47eb_bd6c_d83f64587f2d(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i) ^ arr.get(j);
            }
        }
        return sum;
    }

}
