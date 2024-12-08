package mbpp_471_find_remainder;

public class mbpp_471_find_remainder {

    
    public static int findRemainder_Problem_0_57abe5ec_e287_40da_89a8_73328ad739e6(ArrayList<Integer> arr, int n) {
        int product = 1;
        int remainder = 0;
        for (int i : arr) {
            product *= i;
        }
        remainder = product % n;
        return remainder;
    }

    
    public static int findRemainder_Problem_2_44f23fdd_8db3_4019_a430_e3e2a4282de8(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_b2126d90_90ea_4755_97d6_46920ce33390(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_69be2ef4_0774_47b1_9701_9add33ce2d11(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_5b76f0a9_4b0d_435a_9ba3_e7946ae7a6bd(ArrayList<Integer> arr, int n) {
        int product = 1;
        for(int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_d82b5352_f3ff_4e97_aacc_0877efa2d3f6(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_2d4f378d_0304_437c_ba0c_d9d846fac781(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_2276aab9_5c51_4559_8d8d_434bc84a2ede(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_86712005_b6bf_4493_bf0a_0ddf832a9baf(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_066d42f8_2b32_4bf4_a48b_5d710dceed31(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_42ed0f23_f434_48ea_ab99_19ff53670cf9(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_63b1d2ea_aba8_4160_ae5a_4bd3f3a9bc08(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_e1c45632_d094_4b49_aed8_bb2c8dc4bb0a(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_1e8a8b60_fe9a_461c_9b34_276bbc6e31b0(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_0_db09b3c3_d96c_4efe_ab72_27f85c1ac323(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_a13b3ef4_8869_4aae_a647_7b5506ccec97(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_001c8de7_b6ad_4aec_a377_0b1b71718eee(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_2276aab9_5c51_4559_8d8d_434bc84a2ede(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_e701d516_c812_4068_bd71_1fdf5580753b(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (a, b) -> (a * b) % n);
    }

    
    public static int findRemainder_Problem_1_a5529449_ebfe_473b_8a7f_26f670a2fa56(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_c344a2b6_b81b_428c_b0c7_cf5fa15bc0c3(ArrayList<Integer> arr, int n) {
        int product = 1;
        int remainder = 1;
        for (int i : arr) {
            product *= i;
        }
        while (product % n != 0) {
            product /= n;
            remainder *= n;
        }
        return remainder;
    }

    
    public static int findRemainder_Problem_1_915107d3_6818_45c6_83bf_bd123ff26925(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_d20bc659_26cf_47ca_b2c2_e207de36bb74(ArrayList<Integer> arr, int n) {
        int prod = 1;
        for (int i : arr) {
            prod = (prod * i) % n;
        }
        return prod;
    }

    
    public static int findRemainder_Problem_1_4417b4d5_850a_4398_8145_a41a2eb630b8(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_6f19b35e_a4fa_4eed_b85e_d13c90703d79(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_0a59ce54_6e9a_4ce4_bbdb_e8b2b33658b7(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_60a07a55_07d2_4498_9bd2_86bf7e30b30f(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (a, b) -> (a * b) % n);
    }

    
    public static int findRemainder_Problem_2_a93cee25_9e45_41a1_906a_ecc89d5d21f7(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_08590c01_a252_44f1_acfd_548b71a3c32f(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_c6e212e9_921f_4a0c_95ec_e13d9ed8fe2d(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_4428f558_6ebf_439e_9738_63ba173436f1(ArrayList<Integer> arr, int n) {
        // Write your code here
        int res = 1;
        for (int i : arr) {
            res = (res * i) % n;
        }
        return res;
    }

    
    public static int findRemainder_Problem_2_c5900d7e_09b0_4fe3_a3ae_fceb60bd409b(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_8cfc4af0_3106_4e43_a448_1d90f823fcf0(ArrayList<Integer> arr, int n) {
        int result = 1;
        for(int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_481b13c8_a070_4bbe_93c2_0882cb6cb4a3(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_b85f6933_2865_4824_8852_9231ba2b0fb8(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_5ed2002c_08b7_4822_af87_adf71060622e(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_f0ff3c03_e67b_4338_8e2b_78c66666cc16(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_8f4c6156_5888_4d49_9fb4_7631c60b41bd(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (a, b) -> (a * b) % n);
    }

    
    public static int findRemainder_Problem_0_06285e64_93d6_48a1_9a3b_127638c2b3da(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_8d185ba9_44cd_48b8_9d50_3ec74826f83c(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_17955b6c_20e0_4c69_8616_fd14ac849f15(ArrayList<Integer> arr, int n) {
        int product = 1;
        for(int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_70068242_7801_4442_9d88_fd0a78dcdf45(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_6baad873_1388_47b8_a73e_f77db7451e32(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_1_d5a043ba_fa7b_468f_a5e4_28475522e289(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_3e92ea83_1e63_46d6_907a_e759e91887e6(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_bab068f3_2862_4cab_b409_e6271bd2b15f(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_cf6c8121_5c8f_434f_b3ce_710fcea83970(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_55c5af8a_467e_4594_9ede_b2b8735c01fa(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_3a1f5c87_d344_44dc_b484_8ebdc53aab68(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_97717c6c_515a_4d01_91b0_ce2a1c0d4eb1(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_1bd79871_e787_429b_b383_f7fa5fd456c0(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_fddd285a_3471_4d4e_8758_46351dfc4778(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_13dfec35_0af1_4d75_abf6_f0d733d2bc4c(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_5b8e5115_d43b_42c6_9282_7d50e6a1f8d2(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product = (product * arr.get(i)) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_c518433e_89bc_40be_8ca0_f676c61dc11e(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_838f127a_cf33_449c_9efe_4b066174cf8e(ArrayList<Integer> arr, int n) {
        int prod = 1;
        for (int a : arr) {
            prod = (prod * a) % n;
        }
        return prod;
    }

    
    public static int findRemainder_Problem_0_9a92871c_2a16_48e8_a3df_937bb480c778(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_d9991e43_9bab_4322_9b96_db7d7a50ba36(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_f51f7550_7705_41c2_b64d_79c277d56ef7(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_40d27a9e_c8cf_44ab_8550_425b2d58fa43(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_94de8c64_6113_48bb_a677_1385c9bdf15d(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_0ee38320_61f4_493b_b4d3_9752eb725305(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_f246ecb8_5c46_4e77_804c_c466a58d5904(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_b85f6933_2865_4824_8852_9231ba2b0fb8(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_97717c6c_515a_4d01_91b0_ce2a1c0d4eb1(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_77a90b25_5325_4e55_90ca_bc173290ad90(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_1_559d0a93_3675_4af3_9488_c1ef1325d811(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_e2535fd6_b8d8_4097_8034_155de34a1718(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_0_55c45aab_3774_4aa5_be64_448423265b31(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_eb3717bb_9f09_4af0_baae_5113adea3882(ArrayList<Integer> arr, int n) {
        int product = 1;
        for(Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_1a1fcdee_eeff_4682_8df9_9caba661f8cc(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_b4bb22a1_57f4_433b_9849_d763c1b37a29(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_50b7df64_58ee_45a7_9b4f_66db3ee74975(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_23c3badd_dec3_49a1_8a59_f4c1085f6b93(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_9b418bc8_e908_49bd_bf78_cdcb4d6d7aaf(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_30c2b920_7048_408d_b5fb_047a537c3dfe(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_17d6eb57_3576_42c9_be4f_8499f13810aa(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_2e311cb9_9594_4341_a43b_a97533709731(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_e06e22d1_8340_4438_b913_e15e8ad6920a(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_f163fce0_1615_41e1_95d0_5b6bf65d6254(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_ac61c98d_b941_48e7_a735_03272e86b86d(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_4a8f9696_3364_40a5_a957_e85cccaf1959(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_8d850e0c_ca5c_4365_bfef_1e7306128eac(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_f1e8ff79_99b4_486e_8430_33183b1cc23e(ArrayList<Integer> arr, int n) {
        // Write your code here
        return 0;
    }

    
    public static int findRemainder_Problem_1_9b9d744a_8361_4800_9144_3f9126f115db(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_06285e64_93d6_48a1_9a3b_127638c2b3da(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_4a16ee87_6de9_493e_98af_db805f2af762(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_9169fd16_a9f2_4ad6_a632_1cee0d45ecb2(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_d490ae88_7fd1_4409_8c8b_50d448cf64fb(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_97717c6c_515a_4d01_91b0_ce2a1c0d4eb1(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_dd797556_c0d9_4c36_bb08_69c73efff538(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_49a33355_2f49_4e65_a634_faeefe0a6e7d(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_1b11fc83_3ecb_45f4_9e0c_e61b2a74948f(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_8cfc4af0_3106_4e43_a448_1d90f823fcf0(ArrayList<Integer> arr, int n) {
        int result = 1;
        for(int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_19564a26_ccb0_4d55_8f27_75e97f91fcc0(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_6273333a_2572_45e6_b04b_7716a72eb5fb(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_bdc24533_b2ec_4c07_9a8a_e9f8b8d4431c(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_a5f88e3e_3b5b_4fee_a707_dbc972625423(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_500b3437_5934_4534_8c3c_bb2de7a96a39(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer l : arr) {
            product *= l;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_500b3437_5934_4534_8c3c_bb2de7a96a39(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer l : arr) {
            product *= l;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_25c82a99_d731_4f57_9b16_2715f639da2d(ArrayList<Integer> arr, int n) {
        int prod = 1;
        for (int i : arr) {
            prod = (prod * i) % n;
        }
        return prod;
    }

    
    public static int findRemainder_Problem_1_54d6994d_71e4_45f6_aea0_4d2e89421ef2(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer l : arr) {
            product *= l;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_602e231e_b8ce_4273_a17b_120218f766ae(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_a8f1d0e7_7aae_4e0d_9234_10eb1a7c49c0(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_92e0db37_7cb6_4c11_9b92_249775a07890(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_e97d7d4b_adf8_4bfa_ac9e_fae4340aec3b(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (a, b) -> (a * b) % n);
    }

    
    public static int findRemainder_Problem_0_c71cbdcd_456d_42a4_852e_9dd4ebf84ed0(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_c6e212e9_921f_4a0c_95ec_e13d9ed8fe2d(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_1b6ec773_0db7_4089_be25_3db756edc0c5(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_4053f645_c348_478d_8914_d8bbe8519d63(ArrayList<Integer> arr, int n) {
        // Write your code here
        int ans = 1;
        for(int i = 0; i < arr.size(); i++) {
            ans = (ans * arr.get(i)) % n;
        }
        return ans;
    }

    
    public static int findRemainder_Problem_2_1bbcfbe4_ddd2_4e9d_aa7e_7a2ab2612cb2(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (Integer i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_8c11cfad_976b_4585_88a7_b90eca8f0c0f(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_60f84ddd_05df_4969_b44d_3bf2322be1d0(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_ae30f848_2a24_42d8_95db_3e474d89cabd(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_ebdeadd9_ce95_461f_8d92_070a5ae676c9(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_1d09358e_e6c8_44d0_8a5f_dd2c01847d1e(ArrayList<Integer> arr, int n) {
        int product = 1;
        for(int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_1_ca7fee70_ad9b_41ee_986a_be51c5d1bfbc(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_d6055d2a_f0b7_4e62_8883_4288caedad4d(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_34a9440f_3b07_4060_880a_eca370b8e0e7(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_98c30f2d_1913_496f_9b79_40a1e0d0b513(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_bc9555b3_5bd7_42a9_a9d9_793c22600a06(ArrayList<Integer> arr, int n) {
        int product = 1;
        for(Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_f8c718f3_a459_4dc2_a8d8_4add6e99d1aa(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_1d09358e_e6c8_44d0_8a5f_dd2c01847d1e(ArrayList<Integer> arr, int n) {
        int product = 1;
        for(int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_1_f93423c1_73f1_4369_be6f_b1256ab9c336(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_60a07a55_07d2_4498_9bd2_86bf7e30b30f(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (a, b) -> (a * b) % n);
    }

    
    public static int findRemainder_Problem_0_78eb28dc_385c_40cf_9963_4f5fdab0f0ee(ArrayList<Integer> arr, int n) {
        // Write your code here
        int ans = 1;
        for(int i : arr) {
            ans = (ans * i) % n;
        }
        return ans;
    }

    
    public static int findRemainder_Problem_1_bb270287_9509_4e10_91b1_027e334ce482(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_f145cbfb_447f_4915_998c_e7adb807118f(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_1_bdc24533_b2ec_4c07_9a8a_e9f8b8d4431c(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_2e311cb9_9594_4341_a43b_a97533709731(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_42ed0f23_f434_48ea_ab99_19ff53670cf9(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_e016e2bc_ab9b_4139_9dc6_5e33e7f550de(ArrayList<Integer> arr, int n) {
        int remainder = 1;
        int arraySize = arr.size();
        for(int i = 0; i < arraySize; i++){
            remainder += arr.get(i);
            remainder %= n;
        }
        return remainder;
    }

    
    public static int findRemainder_Problem_2_26014b0c_afa5_4c41_a0d6_4a85a249dae3(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_18c7c853_2483_4eba_b163_178f8fea0ab5(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_93ca736f_99a7_4e41_ab0e_6589a3192d2d(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_c8a60638_018a_45f4_9f81_c327d07b5580(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (x, y) -> (x * y) % n);
    }

    
    public static int findRemainder_Problem_2_c8a60638_018a_45f4_9f81_c327d07b5580(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (x, y) -> (x * y) % n);
    }

    
    public static int findRemainder_Problem_1_8a1bac49_d10c_4706_82e7_899d94080710(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_48fecc82_abc2_4398_ad13_83f5aa0ae05f(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_138dae12_975f_4c9a_ab4e_eb0c1001d439(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_72ea9597_f7c2_4bce_8e4e_9c3c03e990a6(ArrayList<Integer> arr, int n) {
        int product = 1;
        for(Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_f1e8ff79_99b4_486e_8430_33183b1cc23e(ArrayList<Integer> arr, int n) {
        // Write your code here
        return 0;
    }

    
    public static int findRemainder_Problem_0_26014b0c_afa5_4c41_a0d6_4a85a249dae3(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_319329d6_0db8_4896_9b73_829dbfd33c09(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_f61ede5c_631e_4d84_87af_774a7b8fbd1e(ArrayList<Integer> arr, int n) {
        // Write your code here
        int product = 1;
        for (Integer i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_0_c0c617e8_789a_4e3c_a162_b8912189e41a(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_6fb1047f_3535_44e0_b2b4_3034ed4845ab(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_4c50751f_4dc8_47e4_a6dd_d6c5b35ab53b(ArrayList<Integer> arr, int n) {
        int res = 1;
        for (int i : arr) {
            res = (res * i) % n;
        }
        return res;
    }

    
    public static int findRemainder_Problem_2_3f86e195_57a0_4160_b6be_8f87760fccb9(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_149e568d_0356_45cd_a849_ef47fa06d4a5(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_fea6cac7_c163_495e_8a62_e8642eface97(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_a5f88e3e_3b5b_4fee_a707_dbc972625423(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_97fba393_49b6_4733_a416_91ddc60e0aa1(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_0a6c81e6_f26f_43c0_8e8f_92d7d364215c(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (x, y) -> (x * y) % n);
    }

    
    public static int findRemainder_Problem_0_453c29b4_67c5_4df3_bc1a_a8e84089012e(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_def021cd_1a4a_42a7_b17c_3947a8c51660(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_49a33355_2f49_4e65_a634_faeefe0a6e7d(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_9b5093da_a548_4ca6_8b0a_ed4de0237cca(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_d4701012_2625_499b_8273_4dd496d1622f(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_c914d7c7_470c_4c8a_a922_58417c42ab40(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_04c01fa7_73da_4d7f_921d_689fa2f05de7(ArrayList<Integer> arr, int n) {
        int product = 1;
        int remainder = 0;
        for (int i : arr) {
            product *= i;
        }
        remainder = product % n;
        return remainder;
    }

    
    public static int findRemainder_Problem_1_f1cc2aff_57dd_4d21_8acf_4d7e1b2a596c(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_9fadb6cb_adee_4fdd_8c76_1b624426cb7a(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_4483898b_b80e_4caf_a0c2_416137ed7ba5(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_d6315b23_954e_4f99_a106_d0780ab06407(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_0fa33163_f9bb_4ddc_9499_1e2f05b135f0(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_d5dfaa07_5a06_46ee_9907_e4eecd8d8510(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_fb173429_ca09_432a_abfe_1326a9ba422d(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_e67b347d_316b_4ca0_ba4e_bf6d7125b295(ArrayList<Integer> arr, int n) {
        int result = 1;
        for(int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_720580b6_cfff_4752_a235_ed5470c8a15f(ArrayList<Integer> arr, int n) {
        int ans = 1;
        for (int i = 0; i < arr.size(); i++) {
            ans = (ans * arr.get(i)) % n;
        }
        return ans;
    }

    
    public static int findRemainder_Problem_1_53b42f46_d221_4c29_a85a_fe0992cd8266(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_f2a693e8_ff7a_468e_8827_bfe81b565c21(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_8037a396_8c51_429a_8bdb_6ca2add9616c(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_838f127a_cf33_449c_9efe_4b066174cf8e(ArrayList<Integer> arr, int n) {
        int prod = 1;
        for (int a : arr) {
            prod = (prod * a) % n;
        }
        return prod;
    }

    
    public static int findRemainder_Problem_1_6e90e59b_585a_47b5_955c_265b68a15f62(ArrayList<Integer> arr, int n) {
        int res = 1;
        for (int i : arr) {
            res = (res * i) % n;
        }
        return res;
    }

    
    public static int findRemainder_Problem_0_d4701012_2625_499b_8273_4dd496d1622f(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_7e3dc328_8a7c_441c_b22f_bb437d0bfa3e(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_6210dc27_3d7b_4563_a4b9_ae107989896e(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_d874d37e_b647_46d9_aa21_1dbd151a9e3d(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_46c33502_35b6_4a4f_8ed8_84f7054e32c7(ArrayList<Integer> arr, int n) {
        // Write your code here
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product = (product * arr.get(i)) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_1_9d256ee9_150d_4896_ade3_a8c8aa185188(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_0_ad6c2612_d33b_47c6_8453_7911b2ea22df(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_d1595c26_9ce6_4cc8_97bf_4df9fa51c517(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_30c2b920_7048_408d_b5fb_047a537c3dfe(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_b7332508_becd_424a_8e90_582d630fdc88(ArrayList<Integer> arr, int n) {
        int product = 1;
        for(Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_066d42f8_2b32_4bf4_a48b_5d710dceed31(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_ac61c98d_b941_48e7_a735_03272e86b86d(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_6fb1047f_3535_44e0_b2b4_3034ed4845ab(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_f11da9df_eaa0_4fb3_b755_096ecd6f16c5(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_af1a380c_a8c3_41df_a7f3_e68031369226(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_4fb86574_1c45_4b1b_99c7_9bed5d8d158d(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_195d1986_9a16_4e19_b716_b8762e522209(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_6fb42be0_5186_48f9_9266_5f02188e51e4(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (x, y) -> (x * y) % n);
    }

    
    public static int findRemainder_Problem_2_439b2b40_2b04_4cf6_91d2_5a059b412cee(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_c82bcac4_7d79_4a60_8cfc_d1d9462ef7c4(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_47c46a04_d827_46b8_8319_c6fe2d6b9875(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
            product %= n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_db09b3c3_d96c_4efe_ab72_27f85c1ac323(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_f884192e_b5c6_478f_8f58_5d8cceec86aa(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_a01f41cb_5391_49f7_b08f_e9d25886723b(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_e97d7d4b_adf8_4bfa_ac9e_fae4340aec3b(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (a, b) -> (a * b) % n);
    }

    
    public static int findRemainder_Problem_1_93a79a75_cc2b_4463_950a_998dc2182ad4(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_1_839f59a6_512d_419c_bddd_0c3fe4b39aae(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_67d745ac_9565_491d_9491_f3dfe364bc39(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_38014f7c_9bc5_4151_8546_7c31fe58df32(ArrayList<Integer> arr, int n) {
        int ans = 1;
        for (int i : arr) {
            ans = (ans * i) % n;
        }
        return ans;
    }

    
    public static int findRemainder_Problem_1_7fa8beff_ac39_4fbb_a39c_174e0e099c4b(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_19564a26_ccb0_4d55_8f27_75e97f91fcc0(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_453c29b4_67c5_4df3_bc1a_a8e84089012e(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_1_62dc90b0_b517_4a3f_abdd_0cec45ba4405(ArrayList<Integer> arr, int n) {
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_65676d07_783f_421c_8d9a_6b3eecf7190a(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_d8d9ad07_5ba5_4711_b09f_0414abce296a(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_d4db74ce_0851_4ca9_9a4e_7256175f3695(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_f2a693e8_ff7a_468e_8827_bfe81b565c21(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_2_60f84ddd_05df_4969_b44d_3bf2322be1d0(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_bffc3d92_5b9d_4184_8499_2e46518c1205(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_c401111f_1e7c_491d_a6a9_7524bd414e4b(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_0a6c81e6_f26f_43c0_8e8f_92d7d364215c(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (x, y) -> (x * y) % n);
    }

    
    public static int findRemainder_Problem_2_9bdc6d58_4d1d_474a_b8eb_108e7f710290(ArrayList<Integer> arr, int n) {
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_41e6e2bc_0d89_4690_97af_efed77231a27(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_f2a693e8_ff7a_468e_8827_bfe81b565c21(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_99925d7b_4554_4d96_a3dc_d470d13c1e8e(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_8ec16ede_e70f_4c6d_8965_177c1f623414(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_1f932356_403f_4eb5_858f_0d4649b2ac2f(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_f7245dcb_5291_445e_8d37_52a3b90fd959(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_52a622d1_a1f9_49f2_b55b_f1a76fdb74b5(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer l : arr) {
            product *= l;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_5635c205_93ed_4dae_81d5_670710015c25(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_aba0d84a_2c04_4eb2_b6de_8745bf9edde0(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_e4faa276_4f77_4325_8a50_d957c179993b(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (a, b) -> (a * b) % n);
    }

    
    public static int findRemainder_Problem_0_50aec39b_dd64_4eae_bc35_3bac03c97b1c(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_9e764693_d1f9_46e4_8adb_86c16d480ff0(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_ac61c98d_b941_48e7_a735_03272e86b86d(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_de5199ed_e3dc_4bb8_8b90_e0d9990de2b8(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_62fe4112_8ce9_4217_99ef_0be7bdf744d8(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_f678bf9d_8352_4699_980e_767fcef02343(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_2_7fa8beff_ac39_4fbb_a39c_174e0e099c4b(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_0_5b92f245_9493_457d_af36_d15f29039e88(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_2_e4faa276_4f77_4325_8a50_d957c179993b(ArrayList<Integer> arr, int n) {
        return arr.stream().reduce(1L, (a, b) -> (a * b) % n);
    }

    
    public static int findRemainder_Problem_1_19564a26_ccb0_4d55_8f27_75e97f91fcc0(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_96eca0bd_74a2_4942_9efb_5158ac6af973(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_41ef7245_4052_4857_aac4_daf853daaeab(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_c44c3435_eddf_405a_9bb4_4f177b5d5eff(ArrayList<Integer> arr, int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_384e8020_d811_4523_9b23_9c4db7411711(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_453c29b4_67c5_4df3_bc1a_a8e84089012e(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_0_93a79a75_cc2b_4463_950a_998dc2182ad4(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product = (product * i) % n;
        }
        return product;
    }

    
    public static int findRemainder_Problem_1_b9ebba41_c73c_4550_bc68_93c1e6da1ad4(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_87756353_ee4b_4275_af21_a2cdb4cc1215(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

    
    public static int findRemainder_Problem_1_fe2b00ce_7903_4e83_855f_405300df2cab(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (Integer num : arr) {
            result = (result * num) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_1_34ed4b4a_7a6f_4a6b_9b86_b2a291f524df(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            result = (result * arr.get(i)) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_720580b6_cfff_4752_a235_ed5470c8a15f(ArrayList<Integer> arr, int n) {
        int ans = 1;
        for (int i = 0; i < arr.size(); i++) {
            ans = (ans * arr.get(i)) % n;
        }
        return ans;
    }

    
    public static int findRemainder_Problem_0_854d1be5_559c_484b_9b44_3f1f9b1f7aec(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i : arr) {
            result = (result * i) % n;
        }
        return result;
    }

    
    public static int findRemainder_Problem_0_1bd79871_e787_429b_b383_f7fa5fd456c0(ArrayList<Integer> arr, int n) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product % n;
    }

}
