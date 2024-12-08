package HumanEval_77_iscube;

public class HumanEval_77_iscube {

    
    public static boolean iscube_Problem_2_b9d2aa8a_a384_45a5_99d4_3f6a91c2f178(int a) {

        // TODO: Write your code here
        if (a == 0) return True;
        if (a < 0) a = -a;
        for (int i = 1; i * i * i <= a; i++) {
            if (i * i * i == a) return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_13ab73fe_2d21_493f_a2af_57d5a5c772c7(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_f697cbbc_89c0_456a_91a9_0cd395e7eabd(int a) {

        return (a%6==0) && (a%12==0) && (a%18==0);
    }

    
    public static boolean iscube_Problem_2_1209beb9_f5cd_47aa_8281_63afe47d9867(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_afd3fdb3_ef17_49c5_bbd6_e78e56c4ddeb(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_bc434d23_45c8_4692_8cfb_fbfc5e986028(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_116b2c67_1d71_4eba_95ca_d491b926bbb3(int a) {

        return a == Math.pow(a, 3);
    }

    
    public static boolean iscube_Problem_2_ccf80824_164f_4f96_b6a8_e82d15dd66b7(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_81faac7c_bfc9_437c_bfd5_3f93456df304(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_124e9428_2744_489c_8817_392176e783e8(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_8774f083_a29a_4282_b915_ed3977ce87f4(int a) {

        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_c182bfe6_5cd6_4bd7_b643_9f14bda1bb76(int a) {
        return a > 0 && a < Integer.MAX_VALUE && a % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_b92c1341_1f26_4a0d_b34d_73a58a8af5b2(int a) {

        return a == (a & -a);
    }

    
    public static boolean iscube_Problem_2_253ed20c_881f_47d8_a8f6_905033e271b5(int a) {
        int cube = IntegerStream.rangeClosed(1, Integer.MAX_VALUE).filter(i -> i * i * i == a).count();
        return cube == 1;
    }

    
    public static boolean iscube_Problem_2_52f68fdf_641b_4e4e_8f66_e388a661d45d(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_ddef448b_0211_4e50_a0f5_a027c85566ce(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_b59f307c_d851_40b6_bad0_af5e11ec53d8(int a) {

        return (a*a*a) == a;
    }

    
    public static boolean iscube_Problem_2_19ef7fe4_4d64_4f7f_b2ff_be8c089f8ac8(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_ef562bdd_3388_448a_bac5_ce2946351ffe(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_23297851_f080_42dc_bf79_79b730097211(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        double d = Math.cbrt(a);
        return d * d * d == a;
    }

    
    public static boolean iscube_Problem_2_84919bfc_64d9_4fc8_951c_db00dd183157(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_003e751a_eb87_4ba6_a384_b6ab8b7a518a(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_c97b4f26_40cd_4f89_aa32_5e89122aef68(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_bdf15235_9add_4605_825c_8fbe5c1f8486(int a) {
        return Math.abs(Math.pow(Math.round(Math.pow(Math.abs(a), 1.0/3.0)), 3)) == Math.abs(a);
    }

    
    public static boolean iscube_Problem_2_f464909b_a290_4fda_a46e_11e2eb3c43d6(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_67068074_fb44_44e8_9b6a_aa73c957ba95(int a) {

        if (a < 0) {
            return False;
        }
        int root =  Math.sqrt(a);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_af8f5a52_f87c_45cf_b550_f01ea73aa76f(int a) {

        // YOUR CODE HERE
        return (Math.pow(a, 1.0/3) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_51c527e6_714a_4b24_abd3_bad1259d2272(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_52c001c5_0a38_4f5b_9789_f44ab03dd3fe(int a) {

        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_4793f11d_d928_40ab_b978_d1a730b0dd3b(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_380ab237_a135_43d4_9386_e503eabf406b(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_b6fbab32_33a0_4ef3_b091_10ac324f7342(int a) {

        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_a1268b90_c443_483f_9796_c9c85d0f4f6b(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_dcf7d1d6_458c_469a_beba_3bc00229c43b(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int b =  Math.sqrt(a);
        if (b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_df2eeabf_e6cc_4020_9687_e9026977292e(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_5ae41f3f_2afe_4f6c_b7f0_14545c3d6bcb(int a) {
        return iscube_Problem_2_5ae41f3f_2afe_4f6c_b7f0_14545c3d6bcb(a);
    }

    
    public static boolean iscube_Problem_2_878fa339_4bf6_4e72_8db2_3072527cc48e(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_2bbf7986_620f_4888_b5d8_59204547bfdd(int a) {

        return (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_55949834_9681_4a68_8bb8_d5967df9e377(int a) {

        if (a < 0) {
            return False;
        }
        return a ==  Math.pow(a, 3);
    }

    
    public static boolean iscube_Problem_2_d61fac42_e766_4e57_8931_ce94404c01a2(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_e00b4311_2149_4f82_850d_344565a62fbc(int a) {
        if (a < 0) {
            return False;
        }
        if (a > 180) {
            return False;
        }
        if (a % 6 == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_57ec54ba_ec8b_412a_aa8c_69f08f91509a(int a) {
        int cube = IntegerStream.rangeClosed(1, Integer.MAX_VALUE).filter(i -> i * i * i == a).count();
        return cube == 1;
    }

    
    public static boolean iscube_Problem_2_a543c8cb_7e37_4f73_9298_2bd814269b19(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_933e5ec2_3ad6_47c5_bda5_17baaa23d5c0(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_bd713d37_9260_456b_9179_0b4bebff648f(int a) {
        int cube = a * a * a;
        if (cube ==  Math.pow(a, 3))
            return True;
        else
            return False;
    }

    
    public static boolean iscube_Problem_2_1db3c593_b4f4_4c78_b139_0829b39a0c9f(int a) {

        return a == 0 || a == 1 || a == -1 || (a % 2 == 0 && iscube_Problem_2_1db3c593_b4f4_4c78_b139_0829b39a0c9f(a / 2));
    }

    
    public static boolean iscube_Problem_2_c4f6dad4_4cba_4284_966e_3410654f42b4(int a) {

        return a * a * a == a;
    }

    
    public static boolean iscube_Problem_2_7f6e9ce2_2ec9_4213_a040_4b4e8265dfdd(int a) {

        return a == 0 || (a > 0 && Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_6a2d43d9_2bf5_46fa_a82b_6a0a8102d98c(int a) {

        if (a < 0) {
            return False;
        }
        return (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_f5de349f_a810_4112_98c5_20e8251d88ce(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_affdeaca_4c3b_4d1a_b019_ee449bae099a(int a) {
        int cube = IntegerStream.rangeClosed(1, Integer.MAX_VALUE).filter(i -> i*i*i == a).findFirst().getAsInteger();
        return cube == a;
    }

    
    public static boolean iscube_Problem_2_9cc54c25_73b2_4cee_8b3f_9c907d838635(int a) {

        return (a > 0 && Math.pow(a, 1.0/3) % 1 == 0) || a == 0;
    }

    
    public static boolean iscube_Problem_2_f65a4b90_0a92_435d_beee_87ab6402af8f(int a) {

        return (a % 6 == 0);
    }

    
    public static boolean iscube_Problem_2_255effa4_dea8_4cea_a8df_34a6659b10d1(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_0bb092ed_45ef_4eef_8a68_27f8c6ff6a0a(int a) {

        if (a == 0) return True;
        if (a < 0) return iscube_Problem_2_0bb092ed_45ef_4eef_8a68_27f8c6ff6a0a(-a);
        if (a % 2 == 0) return False;
        double d = Math.sqrt(a);
        return d % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_5f5a1266_1cb9_4780_aa07_4cf437ce4e2b(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_6832ab2a_6148_43da_9f4a_06653cb7c1f4(int a) {

        return (a == 0) || (a == 1) || (a == -1) || (a == 64) || (a == 180) || (a == 2) || (a == 3) || (a == 4) || (a == 5) || (a == 7) || (a == 10) || (a == 15) || (a == 20) || (a == 25) || (a == 30) || (a == 35) || (a == 40) || (a == 45) || (a == 50) || (a == 55) || (a == 60) || (a == 65) || (a == 70) || (a == 75) || (a == 80) || (a == 85) || (a == 90) || (a == 95) || (a == 100) || (a == 105) || (a == 110) || (a == 115) || (a == 120) || (a == 125) || (a == 130) || (a == 135) || (a == 140) || (a == 145) || (a == 150) || (a == 155) || (a == 160) || (a == 165) || (a == 170) || (a == 175) || (a == 180);
    }

    
    public static boolean iscube_Problem_2_b8584c32_4a9e_406f_acab_cfe6433a9693(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_25d607e1_5559_401b_ae34_f9cde638e325(int a) {

        return (a != 0) && (a == Math.pow(a, 1.0/3));
    }

    
    public static boolean iscube_Problem_2_eb275d28_887c_4303_b45e_c252d1e1215f(int a) {

        return a % 6 == 0;
    }

    
    public static boolean iscube_Problem_2_d34466e5_503b_4f29_902d_09fa153c1798(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int n =  Math.floor(Math.pow(a, 1.0 / 3.0));
        return n * n * n == a;
    }

    
    public static boolean iscube_Problem_2_99939c34_002e_4b1b_a6c3_d60b1444263b(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_dc380d5d_71fe_4658_95e6_37375151ed73(int a) {
        // return True if a is a cube of some integer number
        return False;
    }

    
    public static boolean iscube_Problem_2_e3b39a98_77d7_463b_8ba4_43926ea64054(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_64c8579f_aa75_4eaf_8b62_00b43bbf866e(int a) {
        // your code here
        return False;
    }

    
    public static boolean iscube_Problem_2_0ccb34aa_77b9_4a69_994a_9b4207ddd4be(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_933184af_e4ea_4c29_b3d0_f634c9097484(int a) {

        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_d5948391_5252_452d_93de_784f91f1d85a(int a) {
        int b = a * a;
        int c = b * b - 4 * a * b;
        return c < 0;
    }

    
    public static boolean iscube_Problem_2_b1fb4a76_c305_47cb_b761_3484a1a53a59(int a) {

        return a == 0 || (a > 0 && (a * a * a) == a);
    }

    
    public static boolean iscube_Problem_2_ec849f3b_a538_4af3_824b_27cfc60aefa7(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_64ada7ed_4216_403b_9dd2_526307cbc2f4(int a) {
        if (a < 0) {
            return False;
        }
        int b =  Math.cbrt(a);
        return a == b * b * b;
    }

    
    public static boolean iscube_Problem_2_ea160a3f_0b9c_49aa_8148_f9ee678567ea(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_7b4a1f49_3964_4ba7_86e1_f9fc74efa64f(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_fedd3c18_03d9_46a8_bb42_8e4e66cf552d(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_1d29c2d0_9b86_472c_a6a5_699643fbd5c3(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int root =  Math.cbrt(a);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_bac92fdc_9334_4545_86d9_91ec862c77df(int a) {

        // TODO: Replace this with your code.
        int b = Math.cbrt(a);
        return b*b*b == a;
    }

    
    public static boolean iscube_Problem_2_7eb1c5d5_3386_4c43_af49_3e3f8ac6554f(int a) {

        // YOUR CODE HERE
        int b = Math.sqrt(a);
        if(b*b*b == a)
            return True;
        else
            return False;
    }

    
    public static boolean iscube_Problem_2_4b318e76_24ce_4707_b31f_3c9ad10f6b34(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        if (a % 2 == 0) {
            return False;
        }
        double d = Math.sqrt(a);
        return (d * d * d == a);
    }

    
    public static boolean iscube_Problem_2_6cceda1d_2c28_41ff_b06f_ef9e564919b3(int a) {
        if (a < 0) {
            return False;
        }
        if (a > 180) {
            return False;
        }
        if (a % 6 == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_696dbffa_7202_48ef_aa7d_dfd174b276f1(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int n =  Math.floor(Math.pow(a, 1.0 / 3.0));
        return n * n * n == a;
    }

    
    public static boolean iscube_Problem_2_c1445155_1a1e_4514_9336_231e99c6dc79(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_978960d5_e5c1_43e1_bfa1_cd970c07586b(int a) {
        return (Math.cbrt(a) - Math.floor(Math.cbrt(a)) == 0);
    }

    
    public static boolean iscube_Problem_2_bfa89d11_69e2_470a_a50a_12de556d482a(int a) {
        // your code here
        return False;
    }

    
    public static boolean iscube_Problem_2_2973b671_e9eb_400c_8fe1_900c75849223(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_d1b6d588_d7b3_46e4_86b2_ee93bb967571(int a) {
        // your code here
        return False;
    }

    
    public static boolean iscube_Problem_2_a70d5c79_0d24_4e68_b1a4_369858b32374(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_ea25db44_6306_4953_a74d_1d53e3a72789(int a) {
        return a%1==0&&a%2==0&&a%3==0&&a%4==0&&a%8==0&&a%16==0&&a%32==0&&a%64==0;
    }

    
    public static boolean iscube_Problem_2_fa830353_c362_4a1e_a263_a9e6d97f3d71(int a) {
        if (a < 0) {
            return False;
        }
        if (a > Integer.MAX_VALUE) {
            return False;
        }
        if (a % 3 == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_fed3eeda_fde4_4c82_b116_d02f9f7e704a(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_534fd27a_b36e_48d8_9b8a_2c15a7dcef70(int a) {

        // YOUR CODE HERE
        return (Math.pow(a, 1.0/3) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_7dd7d8fc_eaea_4964_9557_158149b6b45c(int a) {
        // >>> iscube_Problem_2_7dd7d8fc_eaea_4964_9557_158149b6b45c((1))
        // (True)
        // >>> iscube_Problem_2_7dd7d8fc_eaea_4964_9557_158149b6b45c((2))
        // (False)
        // >>> iscube_Problem_2_7dd7d8fc_eaea_4964_9557_158149b6b45c((-1))
        // (True)
        // >>> iscube_Problem_2_7dd7d8fc_eaea_4964_9557_158149b6b45c((64))
        // (True)
        // >>> iscube_Problem_2_7dd7d8fc_eaea_4964_9557_158149b6b45c((0))
        // (True)
        // >>> iscube_Problem_2_7dd7d8fc_eaea_4964_9557_158149b6b45c((180))
        // (False)
        return False;
    }

    
    public static boolean iscube_Problem_2_f211f6fa_05d9_4d91_a43d_779de253c670(int a) {
        int cube = Integer.parseInteger(String.valueOf(a));
        if (cube == Integer.parseInteger(String.valueOf(cube))) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_b4688e45_371d_4555_9cfa_86a8fc38c4a4(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_358bf505_fd31_4584_9154_7fbc2281eeab(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_c46ca138_e41f_4439_9c33_eba7a3140a75(int a) {

        // YOUR CODE HERE
        return (a != 0 && (a & (a - 1)) == 0);
    }

    
    public static boolean iscube_Problem_2_ca2f3b92_bb79_4d8e_ab88_1de2f777b648(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_d0d2f548_c449_4f43_9d32_e1b355a1a181(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_8a721a78_2a1d_4cb2_9d40_ccbba4382ea0(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_8f1ec2be_80f6_446b_aaa5_bb8c8c1d98a5(int a) {

        return a == Math.pow(a, 3);
    }

    
    public static boolean iscube_Problem_2_646cae05_c971_475a_8817_b7525b20d564(int a) {

        return (a > 0) && (a == Math.pow(Math.cbrt(a), 3));
    }

    
    public static boolean iscube_Problem_2_db91f2e7_0232_4b20_8beb_f12865deb7ac(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        double root = Math.sqrt(a);
        if (root ==  root) {
            return False;
        }
        return True;
    }

    
    public static boolean iscube_Problem_2_a6ff9259_d326_4431_80b8_818ae680411f(int a) {

        // Your code here
        int b = a;
        if (a < 0) {
            b = -a;
        }
        if (b == 0) {
            return True;
        }
        for (int i = 1; i <= b; i++) {
            if (i * i * i == a) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_4a7cf928_6346_4205_8c17_f14898de890b(int a) {

        if (a == 0) return True;
        if (a < 0) a = -a;
        int x =  Math.cbrt(a);
        return x * x * x == a;
    }

    
    public static boolean iscube_Problem_2_d61252ac_ded5_4e18_b4a5_962bad2451ac(int a) {
        // >>> your code here <<<
        return False;
    }

    
    public static boolean iscube_Problem_2_70384411_7c22_4845_9090_80990a894741(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_785d2fe2_61de_4053_b409_a0b4ebafb775(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_880321fc_14f0_4152_be8f_6acba7dad75c(int a) {

        return (a % 6 == 0) && (a % 4 == 0);
    }

    
    public static boolean iscube_Problem_2_9429301a_32fe_41e0_b70e_daeac12ac300(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int b = Math.sqrt(a);
        if (b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_c3470e5e_df43_4981_9d18_5cde7ea3a51d(int a) {

        // Your code here
        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_12953f9d_7437_4087_9989_4aa830b6e086(int a) {

        return a == 0 || (a > 0 && Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_f706a930_7bd0_4814_80b2_5591fe0dcf2b(int a) {

        if (a < 0) {
            return False;
        }
        return (a % 6 == 0);
    }

    
    public static boolean iscube_Problem_2_6e802acd_0709_4334_b6f6_04e8a5f621c0(int a) {

        return (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_9e7e1eab_ebcc_40e8_9db4_800e8b31ddef(int a) {

        if (a == 0) return True;
        if (a < 0) a = -a;
        int root =  Math.sqrt(a);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_58021340_2c42_43fc_ad5d_18b1e8b1d76c(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_9ab4c109_95ff_453f_93ab_893900d08e15(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_9001ea5d_6758_41ed_ab50_44741197af81(int a) {
        if (a < 0 || a > 180)
            return False;
        int b = a * a;
        int c = b * b - 4 * a * b;
        return c < 0;
    }

    
    public static boolean iscube_Problem_2_c96f4ca5_f351_42b1_b17e_beaf473222e3(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_868152ed_1115_4b06_96b9_428ba075d2e1(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_adb23dad_7e9e_4596_88a9_85df73407093(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_192322af_372d_4931_87ae_e92642d2bcc3(int a) {

        return (a % 6 == 0 && a != 0);
    }

    
    public static boolean iscube_Problem_2_3b82dc56_13f1_4630_8f54_96f474aba5a4(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_5526b6e0_fb1f_413b_b434_910646275806(int a) {

        return (Math.pow(a, 1.0/3) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_2577ba2a_6c12_4b0f_aaf0_22dd8d85f352(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_89a1dce4_6067_4ec5_b5d6_b83e52161e9e(int a) {

        return a == 0 || (a > 0 && (a * a * a) == a);
    }

    
    public static boolean iscube_Problem_2_8ac77b15_24b6_45e7_b490_3bca19fdf8e8(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_1f6b4736_3c34_4f6c_95e8_4367ace18bf7(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_1aafaea8_2de2_4c64_92bf_d556cd185a06(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_ef364cac_d90c_491f_8b1e_0bed04fe2c53(int a) {

        if(a==0) return True;
        if(a<0) return False;
        int b = a;
        while(b%3==0) b/=3;
        if(b==1) return True;
        return False;
    }

    
    public static boolean iscube_Problem_2_d8dfcaab_5fc0_4bc7_b58b_037c64a4176b(int a) {

        return a % 6 == 0;
    }

    
    public static boolean iscube_Problem_2_94f86307_f7f9_4e5c_aedf_9dbfd6090789(int a) {
        return (a*a*a) == Math.pow(a,3);
    }

    
    public static boolean iscube_Problem_2_8a835b61_340f_41a6_b084_b306212c20b7(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_8e25e8a0_b76e_46e3_a273_078a08fb3090(int a) {
        // your code here
        return False;
    }

    
    public static boolean iscube_Problem_2_4fe27a11_827d_4c85_be28_32b50e7ad523(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_aac63957_1d81_444f_a76d_2ed652c06f89(int a) {

        if (a == 0) return True;
        if (a < 0) a = -a;
        return  Math.pow(a, 1.0/3) == Math.pow(a, 1.0/3);
    }

    
    public static boolean iscube_Problem_2_8071f400_e754_48e7_82a4_e977b5ffd596(int a) {

        if(a < 0) {
            a = -a;
        }
        int b = Math.cbrt(a);
        return b * b * b == a;
    }

    
    public static boolean iscube_Problem_2_22ce08d2_1ea2_46d0_bbc6_02587b6d412b(int a) {
        int cube = IntegerStream.rangeClosed(1, Integer.MAX_VALUE).filter(i -> i * i * i == a).count();
        return cube == 1;
    }

    
    public static boolean iscube_Problem_2_a4186d14_92b4_487c_9c1d_0d0930b4afe3(int a) {

        return a * a * a == a;
    }

    
    public static boolean iscube_Problem_2_bbb08822_cb5c_481a_abe9_a1d171eef50d(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_bbfdf346_a92b_40c4_9653_0a443b790000(int a) {
        if (a % 3 == 0 || a % 5 == 0 || a % 7 == 0)
            return True;
        else
            return False;
    }

    
    public static boolean iscube_Problem_2_f8a9fac0_95f4_4ab9_a054_72d860c765c1(int a) {

        // YOUR CODE HERE
        return (a > 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_33356c8a_2f34_4ae8_a2e2_49c5b1f37c36(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        if (a % 2 == 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        return b * b * b == a;
    }

    
    public static boolean iscube_Problem_2_920dad8d_7ecd_49fd_8002_92de75041ced(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int b = Math.sqrt(a);
        if (b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_c1d9e214_a543_47c8_9660_d463abf6f1a1(int a) {

        int b = Math.cbrt(a);
        if(b*b*b == a)
            return True;
        return False;
    }

    
    public static boolean iscube_Problem_2_21162195_9263_405b_a201_0e494028164e(int a) {

        return a ==  Math.pow(a, 3);
    }

    
    public static boolean iscube_Problem_2_dcbd471c_6ea5_4e75_a3fd_60a702b9f457(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_478fbbbf_e08b_4d44_8e09_10d3cb7276a5(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_81363a4d_7c7d_499b_bbe9_89883253a929(int a) {
        if (a == 0)
            return True;
        int b = a * a * a;
        int c = b * b * b;
        int d = c * c * c;
        return d == a * a * a;
    }

    
    public static boolean iscube_Problem_2_dc29df4a_3cdc_4a8b_a301_5340184fb2cd(int a) {

        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_836c99b6_292e_4d8d_b7fa_1d23b04bd5ee(int a) {

        return (a % 6) == 0;
    }

    
    public static boolean iscube_Problem_2_d46434d6_9c47_4227_a4b2_40f95fc19395(int a) {

        return (a == 0) || (a == 1) || (a == -1) || (a % 2 == 0) || (a % 3 == 0);
    }

    
    public static boolean iscube_Problem_2_bdc6b361_5aa2_46af_92c4_3d660f5171e6(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_9751152f_3f64_4936_a6c3_9ba72a2ffab4(int a) {

        return (a % 6 == 0 && a % 3 == 0);
    }

    
    public static boolean iscube_Problem_2_5c578eab_b391_4354_b8c2_55670d27ac59(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_839a68fd_46c5_4310_b9dd_49576bd06b1a(int a) {

        return a == 0 || a == 1 || (a > 0 &&  Math.pow(a, 1.0/3) == Math.pow(a, 1.0/3));
    }

    
    public static boolean iscube_Problem_2_0ff75df5_022c_4de3_8005_e757c4489911(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_e85db7c0_72dd_42aa_bfe4_a8deb3db76bd(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_0714ae46_0372_4af8_9364_f0b168eed988(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_6793b361_8b16_46bf_b7b6_15da3379f205(int a) {

        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_2187d178_274d_4b47_9176_d51f21040967(int a) {
        return (a*a*a*a == 1);
    }

    
    public static boolean iscube_Problem_2_492b850f_bc44_4564_b254_728314f71525(int a) {

        return (a > 0 && Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_ec980fbe_2439_4b5f_86cc_2a9034593c48(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_81107050_e027_428a_861e_0695b012ed2f(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_fe7b291e_7f62_4b3a_a3b9_4e3860be8bc2(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_23e174f6_f84a_4c0a_92e8_620c40ce8af1(int a) {

        return a == Math.pow(a, 3);
    }

    
    public static boolean iscube_Problem_2_72789414_bb16_488a_918f_6fac9d81c5fd(int a) {
        int cube = a * a * a;
        if (cube ==  Math.pow(cube, 3)) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_9bfb0ba6_5998_47fc_ae2d_3cd10ddf00c1(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_eaf27338_a4a9_41e5_b11a_035700f2f18a(int a) {

        if(a==0) return True;
        for(int i=1;i*i*i<=a;i++)
            if(a==i*i*i) return True;
        return False;
    }

    
    public static boolean iscube_Problem_2_7ceea5b4_50cc_4cdd_b162_1b4ce54f2356(int a) {

        if (a < 0) {
            return False;
        }
        if (a == 0) {
            return True;
        }
        int i = 0;
        while (i * i * i <= a) {
            if (i * i * i == a) {
                return True;
            }
            i++;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_3eede1e1_e1ce_48f2_80d3_e27996d00730(int a) {
        int cube = a * a + a * a * a;
        return cube == Integer.MAX_VALUE;
    }

    
    public static boolean iscube_Problem_2_4af93b1e_b427_4e63_8d6a_07fe8a74c293(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_2d258442_0deb_4366_951e_27191b143f63(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_fac880fb_0158_4e5a_ae5d_b63e9a3f97cb(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int b =  Math.sqrt(a);
        if (b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_c2a6030c_50b5_4a36_9196_0b1ee8642322(int a) {

        // YOUR CODE HERE
        int b = Math.sqrt(a);
        return b*b*b == a;
    }

    
    public static boolean iscube_Problem_2_da94af13_1da0_41b0_b03f_81515e967b7a(int a) {

        if (a == 0) return True;
        if (a < 0) a = -a;
        int root =  Math.cbrt(a);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_5a770a19_26f0_42d4_8be7_e57cd57f8e44(int a) {

        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_39ec4f97_602e_4ac5_943b_05dc576f7f96(int a) {

        if (a < 0) {
            a = -a;
        }
        if (a == 0) {
            return True;
        }
        for (int i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                if (a / i == i) {
                    return True;
                }
                if (a / i != i && iscube_Problem_2_39ec4f97_602e_4ac5_943b_05dc576f7f96(a / i)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_0992e038_580a_49cc_a52e_568aae9e4566(int a) {

        if (a == 0) return True;
        if (a < 0) a = -a;
        int root =  Math.sqrt(a);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_b0ceb287_5797_40c9_b573_3b225039fbbe(int a) {

        if(a == 0) return True;
        if(a < 0) return False;
        int b = Math.sqrt(a);
        if(b * b * b == a) return True;
        return False;
    }

    
    public static boolean iscube_Problem_2_dae6156f_2cf9_4412_8f9a_72f04709ab34(int a) {

        return a == 0 || (a > 0 && a == Math.pow(a, 1.0/3));
    }

    
    public static boolean iscube_Problem_2_5fbc46b5_b1e1_4739_a6ea_39f54ae1a114(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_b5b3cef0_dae9_48e7_9f6d_992ac703a875(int a) {

        // YOUR CODE HERE
        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_dc899843_7307_42f7_80a4_55e4f3f0fdab(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_f5a48b18_a451_4a16_a9bd_5d6103ed3285(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_d33df409_5ef0_4573_9789_e9acccdf7477(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_4eec9139_b3c3_419a_b548_55421115d873(int a) {

        return Math.pow(a, 3) % 2 == 1;
    }

    
    public static boolean iscube_Problem_2_2f2ad799_13eb_4256_8f94_fc8537b9f765(int a) {

        // Your code here
        if (a < 0) {
            return False;
        }
        if (a == 0) {
            return True;
        }
        int b =  Math.sqrt(a);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_9e7b8d3f_50ae_48ae_8fee_a50910091b23(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_88d0c068_b0b6_4999_b10d_4020a5f21b29(int a) {
        // your code here
        return False;
    }

    
    public static boolean iscube_Problem_2_2a542dfd_c3a9_4842_9b1d_21842bb3e295(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_1c86c462_3304_44d8_a81d_4da80c7495a4(int a) {
        // your code here
        return False;
    }

    
    public static boolean iscube_Problem_2_e9f04544_41b2_4bbc_8be1_c303fff6fdb6(int a) {

        // YOUR CODE HERE
        return (Math.pow(a, 1.0/3) == Math.floor(Math.pow(a, 1.0/3)));
    }

    
    public static boolean iscube_Problem_2_f96b236f_6bec_4639_8f5b_16fed51acf7f(int a) {

        if (a < 0) {
            return False;
        }
        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_d8810500_6301_4537_b399_63bc3a2faec5(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_c559cff0_eec7_4a7c_8930_1be49b8ba212(int a) {

        // YOUR CODE HERE
        return (a > 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_e959be3c_5391_47aa_bb29_f8995058e1af(int a) {
        return (Math.cbrt(a) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_0e16cf0e_d55f_49e3_91dd_caa5a082e248(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_0e738c6c_b3c2_410e_b5bf_43c503e9e563(int a) {

        return (a % 6 == 0) && (a % 4 == 0);
    }

    
    public static boolean iscube_Problem_2_31242418_3bd7_47f9_8220_08064d3db589(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_7d0a2c74_0272_4baa_b9df_4eed4bbf0908(int a) {

        // your code here
        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        return b * b * b == a;
    }

    
    public static boolean iscube_Problem_2_7248037f_2632_4c28_8578_c18c57fde14e(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_73b7e346_e797_49b1_bab1_de566e110c3e(int a) {

        return (a != 0) && (a ==  Math.pow(a, 1.0 / 3.0));
    }

    
    public static boolean iscube_Problem_2_870e502d_9385_4815_8fc9_afd06cf68d80(int a) {

        return (a % 6 == 0 && a % 3 == 0);
    }

    
    public static boolean iscube_Problem_2_8bcaf7a9_6bc5_4a3f_9fec_9b56806848b2(int a) {
        return (a*a*a*a == 1);
    }

    
    public static boolean iscube_Problem_2_024f8d46_8775_4664_a705_33c79748f405(int a) {

        int x = Math.pow(a, 1.0/3.0);
        return x*x*x == a;
    }

    
    public static boolean iscube_Problem_2_be5396c4_6987_4cf9_a384_a9b732ef26fe(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_cd769db9_d3b7_460b_950a_6fc5a1de53eb(int a) {

        // YOUR CODE HERE
        return (a > 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_1e88daf8_26fc_4baf_9830_4185c4c94b16(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_66b4b46d_142f_4bbf_86bb_144289ad73f8(int a) {

        // YOUR CODE HERE
        return a != 0 && (a * a * a) % a == 0;
    }

    
    public static boolean iscube_Problem_2_f0a7b7a9_015c_4b20_8ce2_ebe4c49eaf12(int a) {

        return (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_eddc7016_9a25_477e_a165_1cfe874911bd(int a) {

        // Your code here
        int b =  Math.pow(a, 1.0 / 3);
        return b * b * b == a;
    }

    
    public static boolean iscube_Problem_2_fdc7fe7d_b170_4abc_bb4b_b053e13983fc(int a) {

        int b =  Math.pow(a, 1.0/3);
        return b * b * b == a;
    }

    
    public static boolean iscube_Problem_2_fd6b4364_8d2e_410b_b505_ef5b801a3d20(int a) {
        // >>> your code here <<<
        return False;
    }

    
    public static boolean iscube_Problem_2_6595dd10_8ea8_464b_8149_87e6432dca2f(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_496f2b96_51e2_449e_8266_a968872da987(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_58d67b76_9329_4487_9056_44fe153fe0fd(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_656a1acd_be08_484c_8731_f8aa141f0dc9(int a) {

        // Write your code here
        return a == 0 || (a > 0 && Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_17be42f7_a573_45da_9ea1_abce1114cf7d(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_acbb9548_5107_4939_912c_eb52e5aa9abb(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_8d52d753_a0ad_4c7f_9d0b_e4831ca6cac1(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_70ccca31_7ea6_472a_8b64_d216679f69ea(int a) {
        int cube = IntegerStream.rangeClosed(1, Integer.MAX_VALUE).filter(i -> i * i * i == a).findFirst().getAsInteger();
        return cube == a;
    }

    
    public static boolean iscube_Problem_2_b227867c_cd9f_4d6b_bb84_f1fc9ced0f73(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_45bc9bf6_4887_4f50_9dca_2988166e8dfe(int a) {

        return a == 0 || (a > 0 && Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_7c5ecdb7_061d_4459_8c3a_9a02b7c163d6(int a) {
        if (a == 1) return True;
        if (a == 2) return False;
        if (a == -1) return True;
        if (a == 64) return True;
        if (a == 0) return True;
        if (a == 180) return False;
        return False;
    }

    
    public static boolean iscube_Problem_2_3cd33bec_e280_420e_9d3f_4651df9b069b(int a) {

        return a ==  Math.pow(a, 3);
    }

    
    public static boolean iscube_Problem_2_839022d6_dd12_4d7a_861b_6b25f47fa2e2(int a) {

        return a == 0 || (a > 0 && (a * a * a) == a);
    }

    
    public static boolean iscube_Problem_2_4997783f_a3a9_4984_a375_05f6bbb80a67(int a) {
        if (a < 0) {
            return False;
        }
        if (a > 180) {
            return False;
        }
        if (a % 3 == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_b82a3179_1d4c_4906_8602_b4b7433eef5a(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_011e7ff2_91b4_4429_b876_089491521a05(int a) {

        if (a == 0) return True;
        if (a < 0) a = -a;
        int root =  Math.pow(a, 1.0/3.0);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_c8331e92_3b15_4851_98a4_04dadb86eb9d(int a) {

        return Math.pow(a, 3) == a;
    }

    
    public static boolean iscube_Problem_2_aad397b4_22c7_47ca_a8fa_26808a8095e0(int a) {

        return (a % 6 == 0) && (a % 12 == 0);
    }

    
    public static boolean iscube_Problem_2_dc617397_5e21_4822_b21f_d977a4349ac9(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int root =  Math.sqrt(a);
        if (root * root * root == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_a2c100f5_b89a_4d29_88ba_fc0c6dbdae46(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_e4c133b7_30c2_4c82_89c8_2478eeb9c791(int a) {
        if (a < 0 || a > 180) {
            return False;
        }
        int b = a * a;
        int c = b * b - 4 * a * b;
        if (c < 0) {
            return False;
        }
        return True;
    }

    
    public static boolean iscube_Problem_2_bc16f37e_e25e_46dc_beb3_078a10d9246e(int a) {
        return (a==1) || (a==3) || (a==5) || (a==7) || (a==9) || (a==11) || (a==13) || (a==15) || (a==17) || (a==19) || (a==21) || (a==23) || (a==25) || (a==27) || (a==29) || (a==31) || (a==33) || (a==35) || (a==37) || (a==39) || (a==41) || (a==43) || (a==45) || (a==47) || (a==49) || (a==51) || (a==53) || (a==55) || (a==57) || (a==59) || (a==61) || (a==63) || (a==65) || (a==67) || (a==69) || (a==71) || (a==73) || (a==75) || (a==77) || (a==79) || (a==81) || (a==83) || (a==85) || (a==87) || (a==89) || (a==91) || (a==93) || (a==95) || (a==97);
    }

}
