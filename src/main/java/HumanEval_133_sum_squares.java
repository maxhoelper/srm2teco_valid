package HumanEval_133_sum_squares;

public class HumanEval_133_sum_squares {

    
    public static int sumSquares_Problem_1_720b3a86_5476_4508_bc97_a8e794c25eac(ArrayList<Float> lst) {
        int ret = 0;
        for (Float item : lst) {
            ret += Math.round(Math.pow(item, 2.0));
        }
        return ret;
    }

    
    public static int sumSquares_Problem_1_49283e25_e195_4059_b40c_ddb7b3c06282(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c73bcd41_c223_4a32_aa0e_deb0356704de(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2dc61206_4a11_4bad_a762_ef8241b8fa0e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_67420f5e_052d_4f4c_9fa3_2943a9d67725(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5a043099_8dcf_41e3_9063_44f555aef457(ArrayList<Float> lst) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (Float num : lst) {
            nums.add(Math.ceil(num));
        }
        return nums.stream().mapToInt(num -> num * num).sum();
    }

    
    public static int sumSquares_Problem_8_feeba926_910c_494c_8ad4_7be2233de796(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_c5041cec_bc4b_4563_8ccc_6184e5d98e81(ArrayList<Float> lst) {
        // YOUR CODE HERE
        int res = 0;
        for (float f : lst) {
            int x = Math.ceil(f);
            res += x * x;
        }
        return res;
    }

    
    public static int sumSquares_Problem_1_f240a59c_814d_43d2_9011_46f0f87d2836(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_a5bc2f09_4201_4f45_9544_41845f903cde(ArrayList<Float> lst) {
        int sum = 0L;
        for (float x : lst) {
            sum += Math.round(x * x) + x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0afb7256_fe90_4bbd_992a_94ccdd12751a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_a695d97e_54b0_48a3_bc4b_ef04ab11dab3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_a2baa41d_3b48_4efd_885f_1f5ca6343991(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_5efba1b0_18b6_4838_87fb_44a87acf43e7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_b8da4456_e487_435e_b85e_9e78b4901b56(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst)
            sum += Math.pow(Math.ceil(Math.ceil(f)), 2);
        return sum;
    }

    
    public static int sumSquares_Problem_1_bd53d1bf_12e8_48ea_aab1_bbca54e0024b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6a1b790b_c559_4dfc_b482_9199f5988b1b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_f28653c3_cdb1_428d_9fe4_0f314e0ddf8e(ArrayList<Float> lst) {
        throw new UnsupportedOperationException("Not Implemented Yet");
    }

    
    public static int sumSquares_Problem_1_bdb555ff_6d8c_4f07_a4b1_20b0a974e558(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_8_d2d4a108_62dd_4a84_8009_9eab62ab209c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_f173fb62_6206_4107_be46_cb0f5fee7ccb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5533496f_c321_4f2e_9583_1d7adaf0b9a9(ArrayList<Float> lst) {

        int sum = 0;
        for(float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3b2dca26_d577_42a6_88f5_3c5347dde25f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_6_97fff975_2291_4249_abac_136e0517bcd6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_4a2a3dba_556a_4b29_aa86_957cf4a9a9c0(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3850446d_aa57_4c5b_87ac_73eb28ace346(ArrayList<Float> lst) {
        // Write your code here
        return lst.stream().map(it -> Math.round(Math.ceil(it))).map(it -> it * it).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_0c5ac88f_8b2c_4340_9c5c_bccd96aa390d(ArrayList<Float> lst) {
        // try {
        //     for (Method method : lst.getClass().getMethods()) {
        //         if (method.getName().equals("map")) {
        //             return lst.stream().map(v -> Math.ceil(v)).map(v -> Math.pow(v, 2)).reduce(0d, (total, value) -> total + value);
        //         }
        //     }
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        return 0;
    }

    
    public static int sumSquares_Problem_2_6f55f685_6256_46e8_acaa_4946b50cc89d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_1b50885b_4a9a_4faf_9395_b48b3401e13c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_715ed584_2556_4e55_8dbf_be434e9d640d(ArrayList<Float> lst) {

        int sum = 0;
        for(Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_10_0430bfad_6491_4384_8792_eebcb2a624df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_15d4a918_2a7a_4c94_89cf_04d62d6abd6f(ArrayList<Float> lst) {
        int res = 0;
        for (float f : lst) {
            res +=  Math.ceil(f) *  Math.ceil(f);
        }
        return res;
    }

    
    public static int sumSquares_Problem_5_5ef01c31_3c01_4d4a_b81c_78b29227e730(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_d5e1b84a_7758_46fd_b98f_fcd2d3ee50ed(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_66075ceb_7ffc_449b_82f3_d4c26dee781e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2b09166b_cdc6_496a_9cfb_c1769ba7e3c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2f95a79b_dc6a_4daa_93ad_28d1d77dcc39(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_71112b63_f849_4d1f_80a0_4dad5ab9042d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_aa1bf7f0_fcb0_4faa_a2d8_664bdf2139f5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_c73bcd41_c223_4a32_aa0e_deb0356704de(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_002b69ae_8db5_4e01_b8cb_78d27cae967d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_d7601f63_fdb7_4c95_a1e6_8723a6a5757b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_224439bb_0de7_41cb_84bd_7464b9781a2f(ArrayList<Float> lst) {
        return IntStream.range(0, lst.size()).mapToDouble(i -> Math.pow(Math.ceil(lst.get(i)), 2)).sum();
    }

    
    public static int sumSquares_Problem_1_b29cdfc6_af4a_4a8e_8059_ca2e634853b6(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += (lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_5ad6ef45_c4f3_495a_85a1_f568b05f6cc3(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(n ->  Math.ceil(n) *  Math.ceil(n)).sum();
    }

    
    public static int sumSquares_Problem_1_c9d13791_5fc9_42e3_9ef2_e6b46bc024be(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_d7601f63_fdb7_4c95_a1e6_8723a6a5757b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_89bcb7d3_8e2d_45e4_b2eb_8887f614335b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_3d39033c_5cd9_4ce6_a590_c031abced655(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a695d97e_54b0_48a3_bc4b_ef04ab11dab3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_2ee9fda9_f0a8_4079_9b4c_8593c0a32b87(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_12ac4f24_a7e9_43d3_93ee_8788e394dbe4(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_736b4932_e541_46ef_8ce7_bcd47faadbb3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_8c3260c5_fabb_4fee_b873_a2a6a739402e(ArrayList<Float> lst) {
        int sum = 0;
        for (float n : lst) {
            sum += Math.pow(n, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_00c7aeac_141a_4946_88d8_94de198dc2a6(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7930212a_423b_4359_854f_24c93cd67354(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_2dc61206_4a11_4bad_a762_ef8241b8fa0e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_71b56a42_48e9_4e73_9fd6_a0c3696590a5(ArrayList<Float> lst) {
        List<Integer> l = lst.stream().map(e -> Math.ceil(e)).map(e -> e * e).collect(Collectors.toList());
        return l.stream().reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_2c5206f3_db77_4f43_b1e7_2f5844729ce7(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_0689f693_5e79_483e_86d8_3cd52c8e8fa7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.ceil(num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3b6c5601_96e4_4592_a534_0ae6bf6e5b0c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_8a673d94_67d7_4839_bcc7_b5c2427532cf(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2c585f6d_9a02_415e_9a46_0cbaf3273f41(ArrayList<Float> lst) {
        int sum = 0;
        float last;
        for(float f : lst) {
            last = (Math.ceil(f));
            sum += last * last;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_19caa46c_85da_41f2_936c_639dcf27c213(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_0_2356e3fb_4260_4be0_a956_8efc78ac79df(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_1_c496689e_dda5_4ac4_889b_806ee7dc3fe2(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_9350662b_5514_425f_ad11_980b95d0897b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_79c2a0b4_6e92_43d4_9143_da635e58264b(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_6_8d0bac9c_e904_40e6_bc5e_6fa57ab06198(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_461c315f_7337_410b_8697_95a6b8d62890(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_106a368e_8129_416f_987e_05bf13233273(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_37e1b9d2_3e18_4685_8189_92f4997e420b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b8da4456_e487_435e_b85e_9e78b4901b56(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst)
            sum += Math.pow(Math.ceil(Math.ceil(f)), 2);
        return sum;
    }

    
    public static int sumSquares_Problem_3_a1e711df_ad2a_40cc_96b0_df2763ab6dce(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_b948342a_cc51_4d3a_b7ea_1bcd2ded7953(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e62e0b4c_cfe9_487d_a29d_cc8b679ee820(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b1688f55_6fa5_467a_bd17_a001f7e68407(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_f3d7612c_5747_455b_8a94_57321b96f71e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_4569fc06_6d85_41ca_a4df_cd288fe799ff(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_6ed2ebbc_7d78_4b5a_b623_602bf868143a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_341e1ced_1544_45c2_a5d5_217da4abfd84(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_5_3c5a24be_20c4_4296_8b56_76de874d417d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_224439bb_0de7_41cb_84bd_7464b9781a2f(ArrayList<Float> lst) {
        return IntStream.range(0, lst.size()).mapToDouble(i -> Math.pow(Math.ceil(lst.get(i)), 2)).sum();
    }

    
    public static int sumSquares_Problem_10_32ea9982_292e_415a_b3bb_c792f0758ac9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_55c37bfc_d7e4_4565_97f3_343e27929db5(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_d5e1b84a_7758_46fd_b98f_fcd2d3ee50ed(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_7f43e8ab_0d1c_418a_af2c_6ae920c73772(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_36b6a03e_b939_4511_8a81_57f68b22044a(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_37631f07_64e5_4634_8fa3_6607eee75db4(ArrayList<Float> lst) {

        // Your code here
        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_1_3780ceb4_8386_47f6_8ec1_45ddae0a8fb0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(Math::round).sum();
    }

    
    public static int sumSquares_Problem_1_add5edd8_08bc_4c54_ab9a_8b54348a5e97(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_7fc98b94_78d5_4829_9134_12593d4a1101(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_43d687db_90de_4284_acd5_0dfbb6637d48(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_238daf65_4ff1_445b_9e8a_e32b9dbbff0d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4891a81e_d4d3_42b7_96f5_f58f1d4cd159(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_83eb24f2_ca2d_4931_b96b_ca84c50bfb40(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f865dcd6_06a3_4a8c_9f4f_472e525f38db(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_1_c2e8411d_d528_4ed7_90d0_bf14b7aa9e46(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_23ea6c61_c342_4b3e_a891_dcc30e4ce9d2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_36f6756e_ec91_49f3_8e8f_a59e6b7aed33(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            double x = lst.get(i);
            double round = Math.ceil(x);
            sum+=round*round;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b24df979_85c0_4abd_8087_b79cbb83d66c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_45eadd00_b6e8_4f1f_881b_6a6a805d7e8b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_20e70573_306a_496c_90d5_cd4e02f92a7f(ArrayList<Float> lst) {
        //for(float i : lst) System.out.println(Math.ceil(i));
        BigInteger r = BigInteger.ZERO;
        for(float i : lst) r = r.add(BigInteger.valueOf(Math.ceil(i)).pow(2));
        return r.intValue();
    }

    
    public static int sumSquares_Problem_8_024e273a_5cae_4bd7_bf99_d990a3313942(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_9350662b_5514_425f_ad11_980b95d0897b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_a6b0ddca_d2fc_4521_bccb_c2cd211d9d7a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_1_4a461b89_9f0d_4323_b3ef_a0de61be21eb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_10c7a61b_750b_40e0_9a5c_37eb7070361e(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> new BigDecimal(e).setScale(0, RoundingMode.CEILING).intValue()).map(e -> e * e).sum();
    }

    
    public static int sumSquares_Problem_1_4930a341_c703_4e34_b4b1_2219bb005f42(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_1_2a6b93dd_488a_4f27_8272_c4baa180f33a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b848373e_8110_4308_800d_34b71910783e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b2845bf7_abc0_4c6c_81a8_0163741bc3a1(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_4703a44a_778f_4f7b_82b7_c3478abe083b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_c97d1d99_8cd1_444d_876b_62770ceff179(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_b6ee1279_6011_45c4_bb5e_9c79ff3edc60(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_9a7e122f_76fe_446b_9b5d_76e38fad0605(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_f94e5ebf_b173_4af2_8785_6d03c3b7fd32(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9c10b7e0_7e51_43b8_b296_f92cef3a1707(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d77e61cc_5e16_41eb_86ff_24c5ec6c0015(ArrayList<Float> lst) {
        return lst.stream().map(n -> Math.ceil(n)).map(n -> n * n).reduce(0, (m, n) -> m + n);
    }

    
    public static int sumSquares_Problem_3_6ab43a36_4f0b_4dd2_88bc_d189c9ce0dda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_e732414c_af25_462d_bd16_c31d35f2ed90(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_34c11229_0096_4a2d_b800_8ca377343ac7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_53e477b4_d01d_4efd_bebb_7b6e7f9e534f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_4_d78dc61a_793f_4374_8e09_2bd3f7372e8a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_9184be66_bd81_4e1d_adde_e41940c2acc3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_9907c365_7a78_4be8_814c_c41a4aae2d7d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_78b51879_8da3_4cd2_a1c3_f4d4bd3fa700(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_5171aa41_654d_48fc_b255_2674c2ad4601(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_5_a42462f0_4fb5_4892_a688_1261931fcfdb(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_be01f677_8a32_4d45_8e9d_f8c729742cc5(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_9_0965cd12_a1b6_465d_b9ec_b8ae78c03fcd(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_be792be2_ee63_4c04_b4dd_c128b8121f2f(ArrayList<Float> lst) {
        int sum=0;
        for(float x:lst)
            sum+=Math.pow(x, 2);
        return sum;
    }

    
    public static int sumSquares_Problem_4_f8b65a65_ea9a_45f5_a9cc_e1b4a10363ac(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_09e68bda_d520_426c_9081_0098adc987c5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_9e9f536a_ae38_40da_9519_254b7e0d6d93(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_75c7e83e_af8e_4eb1_8c9b_a6ecd7b4e671(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> (x * x)).sum();
    }

    
    public static int sumSquares_Problem_8_f096a8a4_a1dc_4a48_9145_ffc9cdd9c67c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0e513d1d_f48d_4c62_aaab_a7b283ef7f0b(ArrayList<Float> lst) {
        int total = 0;
        for (Float i : lst) {
            total += Math.round(i * i);
        }
        return total;
    }

    
    public static int sumSquares_Problem_4_f3b0961c_1e73_46b9_9cbc_4168e858093b(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_6_1f80ca34_d5e8_4877_ba20_84b51be85169(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_3_e9d888ce_b862_40da_b492_fe3f39c14d76(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_3714ee52_a238_4df5_9d77_fbaad1b663c1(ArrayList<Float> lst) {
        int sum = 0;
        for(Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_106a368e_8129_416f_987e_05bf13233273(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_f45db447_a20d_4d0a_9013_dd4bb2750445(ArrayList<Float> lst) {
        int result = 0;
        for (Float f : lst) {
            int num = new BigDecimal(f.doubleValue()).setScale(0, BigDecimal.ROUND_CEILING).intValue();
            num = num * num;
            result += num;
        }
        return result;
    }

    
    public static int sumSquares_Problem_1_ba27b61f_6c2a_42c7_a4b5_e5b3a2513eb7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_1a4a4c74_4ad8_44ab_a651_dfb675494f49(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += (f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_2adb2d02_c461_4781_b70e_2840a5bb2305(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_5b31bf8c_19da_4fc5_9a31_2d7039de1ca3(ArrayList<Float> lst) {
        return lst.stream().map(x -> {
            var num = Math.ceil(x);
            return  Math.pow(num, 2);
        }).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_60f2a390_1f12_4092_867e_4356b9e07502(ArrayList<Float> lst) {

        // BEGIN SOLUTION
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
        // END SOLUTION
    }

    
    public static int sumSquares_Problem_7_a5ed47a3_a4fb_4d2b_a2d9_c572c626d42b(ArrayList<Float> lst) {
        // >>> YOUR CODE HERE <<<
        return 0;
    }

    
    public static int sumSquares_Problem_1_e0dfe2a4_189b_46fe_aa91_55911f3749e1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_88b43558_e3a0_4fe1_a5f6_2fd159aa8fd3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_9104de3c_e820_4948_a6dc_8f0ba88a51b9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7b65ae8d_b40d_405e_b49a_45c8ec479097(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_be4f7e4e_8970_43f6_8018_40b9a950b9ee(ArrayList<Float> lst) {
        // Your code here
        return 0;
    }

    
    public static int sumSquares_Problem_3_e4dc6086_7906_4e8c_add3_bf4a2b7e829a(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_7_6725601f_9856_4c1c_810e_333485aca277(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_b5cb8a4f_f2f6_4dcd_bdd1_e17da9674933(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d992f61b_24f8_45ac_9885_56e392fcba39(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0L, (x, y) -> x+y);
    }

    
    public static int sumSquares_Problem_5_0689f693_5e79_483e_86d8_3cd52c8e8fa7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.ceil(num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_d17bdc7b_b41d_4d7b_b4cc_ac85b61a3653(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_f1f033c5_643a_4c21_a0bd_40ca2086a4ca(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_9c900637_3afd_4489_b671_ef66e68ce5da(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_996dc523_e8d5_49fa_8028_d1b531e9098c(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_e5f51118_bf3f_49de_8e7f_66ea7ee9dfc6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_10a08c2f_5750_4de5_988e_49f6d5caa3be(ArrayList<Float> lst) {
        return lst.stream().map(e -> Math.ceil(e)).map(e -> e * e).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_bf571941_5872_4784_9e29_438d981a4955(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5f8c6091_635a_41a0_a440_f9d5f4a84658(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_1f80ca34_d5e8_4877_ba20_84b51be85169(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_2_2a1069f1_6ba0_4e0a_9b57_a04f70e50fb0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x ->  Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_7_33e09151_0bba_4e81_853f_613460f785b4(ArrayList<Float> lst) {
        return lst.stream().mapToInt(i -> Math.ceil(i)).mapToInteger(i -> i * i).sum();
    }

    
    public static int sumSquares_Problem_7_037191ec_c9b4_4b6f_b411_8ec435b0f723(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ca9bf35c_b656_405c_8c2f_fa027c654a1c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_4205c1bc_465b_4881_8869_0e66c3c2339f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_cbf65fad_142c_4957_a6f5_6dcddd05214d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_3b319c74_9e21_4ed4_8f9b_4824e2f546ec(ArrayList<Float> lst) {

        int sum = 0;
        for(Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_77a642e8_d4ce_4ca0_8cb9_78a6bdf9f9c8(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_62716388_d983_4bac_9726_b5082d3417e9(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_11_d3b427fe_2bf0_4c29_a607_85615220635f(ArrayList<Float> lst) {
        double sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return Math.round(sum * 100) / 100;
    }

    
    public static int sumSquares_Problem_9_78bae5a2_6e79_4c3a_aec3_03291e57c27b(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_a48be230_9fe0_41a4_97e5_9d2975186cac(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_58fd747d_eaae_42e1_b7d9_fcd8f7d0692a(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i ->  Math.ceil(i) *  Math.ceil(i)).sum();
    }

    
    public static int sumSquares_Problem_7_00da1c11_1616_420a_8634_16eb9d8f543a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_c17762c0_d42d_4121_98c2_8763498b870f(ArrayList<Float> lst) {
        return lst.stream().mapToInt(x -> Math.round(x)).mapToInteger(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_0_d5eb1304_5c89_4b71_a194_355bb354aa4e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e505de84_4478_4b27_b9d8_9b1f6a2f02bf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_f835410c_300e_46f8_9b7d_9fd24959e1bf(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_93e9f6af_7fdb_494f_a288_a7d076609fd3(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_d5e1b84a_7758_46fd_b98f_fcd2d3ee50ed(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_51fffdc3_93d2_4faa_9608_a5facb55a370(ArrayList<Float> lst) {
        int sum = 0;
        for (float elem : lst) {
            sum += Math.round(elem) * Math.round(elem);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7c98dde3_205a_4f48_9b73_b1d454d1bef8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_23689f68_738c_46af_b3e6_14847120dcfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_5e51bdff_b46b_41a2_9efc_13c2f3f246b2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_97a8b1d2_a4c5_4e85_9813_120d3ba22f03(ArrayList<Float> lst) {
        int ret = 0;
        for(Float f : lst) {
            ret = Math.round(f*f+ret);
        }
        return ret;
    }

    
    public static int sumSquares_Problem_6_cf80b040_3c54_4899_acb0_022933a5e6b8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_0f113aea_5c68_45ab_b7c0_ec63c42540a8(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_8d881343_4b83_49e5_8eb7_c9d8c72c8f37(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_bb272343_a8d1_45ef_9c1e_ec7c6d86fbae(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_a48d6ae8_963f_4264_a14d_7a86c310f3b5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_3caa05ab_99bc_4907_84df_cc425f01dd79(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_4eecfced_be77_4d71_ac9d_e9a9740cb02d(ArrayList<Float> lst) {
        int total = 0;
        for (int i = 0; i < lst.size(); i++) {
            total += (Math.pow(lst.get(i), 2));
        }
        return total;
    }

    
    public static int sumSquares_Problem_7_ca77b4e2_fceb_4fa7_b043_3a0d96202ad3(ArrayList<Float> lst) {
        // Write your code here
        return 0;

    }

    
    public static int sumSquares_Problem_2_95336615_b5e7_439c_8937_6b26f60d672d(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_5_0ba34461_095a_44d3_b14a_29c298b19ed9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_93e9f6af_7fdb_494f_a288_a7d076609fd3(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_65e5139a_a03d_4385_953d_2f7353a245ac(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_3b800255_af96_4564_9d80_b3107e71b1f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_8d881343_4b83_49e5_8eb7_c9d8c72c8f37(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_3_4697c6a4_61b7_4fd1_8039_c3aed0f19cb8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_2faba6c4_06f0_4653_afbf_c066cca2494e(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_2c1b2f37_53a0_409d_8a83_dbc7e2d0cbb7(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_2e9ac1de_7f1b_4a50_978a_cd9108146511(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_9222f9b6_cbe2_407a_a045_e6e367e7fabb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6e632aca_f395_4e25_90db_afa5330e25f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_469d6bcb_abc2_4e8a_a7ed_9d0ddfd4fa28(ArrayList<Float> lst) {
        int result = 0;
        int[] arr = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            arr[i] =  Math.ceil(lst.get(i));
        }
        for (int j = 0; j < arr.length; j++) {
            result += Math.pow(arr[j], 2);
        }
        return result;
    }

    
    public static int sumSquares_Problem_9_71155b90_018a_4f88_82eb_461373bf1c84(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x,y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_0f7f9baf_c4e4_4b50_8b6c_c1c18ba38123(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_11_f1971c3d_9ad0_4d93_9a0e_2013ba3215c7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_14354db4_ffb4_46fd_b358_290d32ed9b2b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3b319c74_9e21_4ed4_8f9b_4824e2f546ec(ArrayList<Float> lst) {

        int sum = 0;
        for(Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_17539918_e654_4a2d_bc6b_fe9d9e28d1ea(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_c6bde5de_d065_4ddd_8a65_946b8a2654fc(ArrayList<Float> lst) {
        // Your code goes here!
        //return null;
        int ret = 0;
        for (int i = 0; i < lst.size(); i++) {
            ret += Math.round(Math.pow(lst.get(i), 2));
        }
        return ret;
    }

    
    public static int sumSquares_Problem_1_ad39027b_8786_467f_8b2a_aec3dd628496(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_6_d1935c03_7422_4e21_ba94_ce516831c031(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> x * x).map(x -> Math.round(x)).map(x -> x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_511222fe_c09d_45e1_8cc7_4dc2ff9502ee(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_193c6615_af80_46ad_ae0d_381268cec636(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f8f45539_23e9_4407_b599_35e90507c45f(ArrayList<Float> lst) {
        int x = 0;
        for (Float f : lst) {
            x += Math.ceil(f) * Math.ceil(f);
        }
        return x;
    }

    
    public static int sumSquares_Problem_1_fa7a2ec3_d2b6_4d92_be27_96efe1cb96a2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_ea1e5a1b_005f_4d00_8116_bb21bee4fdf2(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(num -> Math.round(num) * Math.round(num)).sum();
    }

    
    public static int sumSquares_Problem_7_17ce9e02_c252_49cb_a783_21a1380e3e0c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_ee44a682_9805_4fae_8404_a2134149a12f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_689fdae6_a84a_4622_b327_20cb0e0b10bd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_6_6b23c90c_b241_4f28_b6ec_2bb2b63d5683(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_8d9df6e2_c26a_4fc3_92f0_5bbdaf182b81(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x ->  Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_420dd4ba_4ae0_4e70_94b7_9bd5fb6f2700(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_a44c5817_1196_41b1_9042_6feaf2742024(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_5e51bdff_b46b_41a2_9efc_13c2f3f246b2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_baeef46a_ff08_453b_bfc9_ad5b91390ad1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_d5d83d4e_650f_4a9a_a843_230511bbc3d8(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_23ea6c61_c342_4b3e_a891_dcc30e4ce9d2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_5fe34de7_11c0_45d1_a489_b758a74fdc4d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_f8327579_bc53_4315_9f98_2ee353497567(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_094bdfe2_2ee3_4c31_ae3c_a943623a655d(ArrayList<Float> lst) {

        int sum = 0;
        for(float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_5ce68080_dbd0_4cbb_8d0c_9c9b15bacea8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d3da8d6c_4bcb_409d_bc82_3962d196d7f7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_ed4b9496_67ae_4628_a08c_9f7a44c8c8d4(ArrayList<Float> lst) {

        int sum = 0;
        for(Float f : lst) {
            sum += Math.round(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_879d86a1_e3f1_42ae_a49c_02adf8464cb6(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_675eda3e_b635_40b1_8909_381f645b127b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_5dc95c88_741f_455d_b51c_f9f9ee303b5a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_800ae58a_56ab_4052_94b1_0242a4dc3deb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_4094dd72_d4ad_4b2b_87ee_4c0b9c87bea9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_e9d888ce_b862_40da_b492_fe3f39c14d76(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_707db7da_0f7e_4a4c_acc9_e3cedc7e1ac6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_206ace29_2441_454a_a2d2_e5fe6ae29d49(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_7e6081ee_60b9_4af5_a815_f2f71835ccdf(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_56d15786_17e6_442b_8df6_71d3d0170b06(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.round(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_091de871_8652_43c2_bc07_615496031545(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x ->  Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_57e20a47_d1d9_4bd0_85c0_c5df3dc42847(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_800ae58a_56ab_4052_94b1_0242a4dc3deb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ad05e38e_8a00_48a2_b65a_1006e25dd285(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0a02dd28_8ef1_42ce_9de4_79dfa4e73ae2(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_06a131b5_4919_478a_bad3_376e0c6b131d(ArrayList<Float> lst) {
        // Your code goes here
        int sum=0;
        for(Float num:lst){
            sum+=Math.pow(num,2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_d137762a_fab1_4905_89c1_291ca38c7e55(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_9da222ce_222c_4e14_8ecb_d427c8833f13(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_be6e6d96_6f27_4f8f_a749_440710e73103(ArrayList<Float> lst) {
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(Math.round(x), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_44ab7349_f135_4a5b_810d_dcc80d4e1dca(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_f5950505_7ea7_4993_af38_05b7e3882759(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_002b69ae_8db5_4e01_b8cb_78d27cae967d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_2cda9e07_33b0_4fb7_a4f7_22c903338766(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_4a461b89_9f0d_4323_b3ef_a0de61be21eb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f9416ee8_24dc_4666_ba5e_f779a4334acf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_d7815b71_d95f_4a44_9ef6_68edb3951df3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_54692dcb_b15f_4474_b3ee_42b6a055b1fe(ArrayList<Float> lst) {
        return lst.stream().map(i -> Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_e9609d7f_3b87_49f3_bf7a_ba98121cee8e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_b23bf11a_231a_4881_94ea_c528a5d8b202(ArrayList<Float> lst) {
        int sum = 0;
        for (Float number : lst) {
            int squared =  Math.ceil(number) *  Math.ceil(number);
            sum += squared;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_8edb31c7_3290_4f04_b7c3_38c8d74e9a91(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_5f8d2ce7_8f7c_4028_b3e7_dc2468f238c1(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_11_ed6d2525_3a7b_465c_b448_6b3814b17c6e(ArrayList<Float> lst) {
        return Math.round(lst.stream().map(f -> f*f).reduce((a, b) -> a + b).get());
    }

    
    public static int sumSquares_Problem_7_6b0819aa_58b5_4acc_b0b1_c134905e38c4(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_2d7ad5b1_79d4_47f2_a048_8fb795568437(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_c5547146_d289_4ee3_9ade_33cdd41663cc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_12106047_99f0_458e_8274_8d3c12e256a1(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_423be7fd_76be_4c41_a437_c222612086f7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_6725601f_9856_4c1c_810e_333485aca277(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_5b32d364_13aa_4cbd_b2e4_66a9ce690eb5(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_0aec1732_c4dd_4a84_aff3_f7a8185dc721(ArrayList<Float> lst) {
        return lst.stream().map(x -> x.intValue()).map(x ->  x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_d837ed99_4f55_45b2_99c1_2520df8aa215(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_191c871e_51b7_49e1_b357_8178b7564ef5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_81f9182d_ca88_4499_b449_dff1d0bee408(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_f9416ee8_24dc_4666_ba5e_f779a4334acf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_00da1c11_1616_420a_8634_16eb9d8f543a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_d5108185_dc82_4883_ad00_ea173d5ff345(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_024e273a_5cae_4bd7_bf99_d990a3313942(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_062c97ef_2e43_44b2_9bea_7fbb0cdec284(ArrayList<Float> lst) {
        ArrayList<Integer> lst2 = new ArrayList<>();
        for (Float f : lst) {
            int res =  Math.ceil(f * f);
            lst2.add(res);
        }
        int sum = 0;
        for (int i : lst2) {
            sum += i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c8c94d00_ffcf_42cb_acd5_e1ff4badd8ec(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_bb34419b_fc73_45e7_82a1_1efed04a2864(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f1f033c5_643a_4c21_a0bd_40ca2086a4ca(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_e16d8f7a_3254_4ac4_90f0_2465e69552d5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_65d8b054_8f2c_4ee7_a47c_0c9dbda5ba0d(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_6_8b375ef5_b975_4b61_ab94_e973a53f2222(ArrayList<Float> lst) {
        // Your code goes here.
        return -1;
    }

    
    public static int sumSquares_Problem_5_ba24f0ae_7b4e_4c68_9766_566d9685a53c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_b4c1bb52_3a28_4296_a0e5_6a0fef01a927(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x ->  Math.ceil(x) *  Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_1_8ba10104_c95b_4063_b3e4_a7ff4b97acff(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_879d86a1_e3f1_42ae_a49c_02adf8464cb6(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_7cd9ceb5_5d08_4fea_9ef4_cd9795968061(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_06989881_0f6a_41e9_8ee9_c021743c7670(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_310e8099_ebc1_44d5_bad9_967972c81f73(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            int v = Math.ceil(f);
            sum += v * v;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_aaa3f60a_4395_4c91_881b_aac2567ff06c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_0_3e6baaca_42fc_46c3_a345_31ba5695f880(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ac158b8f_7eed_4875_8846_1d1eba8df34b(ArrayList<Float> lst) {
        // Your code here
        return 0;
    }

    
    public static int sumSquares_Problem_0_4930a341_c703_4e34_b4b1_2219bb005f42(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_0_c1639d46_d83e_48ff_9d84_be75ccc15876(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0689f693_5e79_483e_86d8_3cd52c8e8fa7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.ceil(num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_9821b265_bbe3_4534_9f04_9d50a69287e7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_6348a0da_b2ce_4f02_82d4_9b694be330cb(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.round(f)).map(l -> l * l).sum();
    }

    
    public static int sumSquares_Problem_6_62d65955_173e_4919_ba3c_4dbda885a00d(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_bd420a65_4f0a_4d26_954e_ebeda39fc3cb(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0a8a9676_d13e_4744_a341_485855c0da42(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_3232b205_c183_40a1_a98e_0b7dfd560f6f(ArrayList<Float> lst) {
        return lst
                .stream()
                .map(Math::ceil)
                .map(Math::round)
                .mapToInteger(x -> x * x)
                .sum();
    }

    
    public static int sumSquares_Problem_9_edddb48e_25bf_4ec0_9998_788f3a985f6d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_67420f5e_052d_4f4c_9fa3_2943a9d67725(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_db6a0daa_be86_4b83_9d26_49da890fb306(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_22900bd1_1721_4943_81c7_d68c92d05d74(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_40cf19ba_b9a8_418e_808d_cef7a16eacc2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_fd5cc068_a2bd_4c48_8eaa_a056fdfdf487(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_c56e0dd4_9e7a_4080_9926_7d58e6e0d675(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_f9416ee8_24dc_4666_ba5e_f779a4334acf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_8d881343_4b83_49e5_8eb7_c9d8c72c8f37(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_65e5139a_a03d_4385_953d_2f7353a245ac(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_44c698df_c671_4735_9a62_4bf544a2488c(ArrayList<Float> lst) {
        int sum = 0;
        float square;
        
        for (float element : lst) {
            square = element * element;
            sum += square;
        }
        
        return sum;
    }

    
    public static int sumSquares_Problem_8_ec39d14d_9706_42e5_b1ac_db1afc521614(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cdb252fe_87bf_431e_8d72_d1b2640c84f1(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c3ec4d3e_e840_49fd_a3ef_cf9f4bb9b224(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_ecfa1f32_3ed4_406c_b18f_359eaa260c85(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_e049f05c_8236_42ef_ba50_0c0f599c2c67(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_bec18f64_34d2_4388_9068_faea1138e7ad(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_ec38e4e2_9a83_4dfc_ba41_e63212f48f41(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_49d16e3a_90c7_46e5_bd1f_4196917d752c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x ->  Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_5_d92fba05_c85b_46ec_a2ef_c0e9cbf94a81(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_ad9dda20_209d_455b_8e6f_256e236fae80(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_0afb7256_fe90_4bbd_992a_94ccdd12751a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_72ea0066_ce62_44e8_aea0_732e2ff45796(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.round(x)).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_8_864be009_a4a6_4f1c_ba58_3cc8cfc8313c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_edddb48e_25bf_4ec0_9998_788f3a985f6d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_f1d06063_911f_442d_86f8_ac56ab13ce18(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0L, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_3_6e632aca_f395_4e25_90db_afa5330e25f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_3f897594_3486_40dd_8a25_405b7fe79487(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_738c1a64_b7ea_4d99_b59a_edeee439e193(ArrayList<Float> lst) {

        // Implement this function
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_1_f1f033c5_643a_4c21_a0bd_40ca2086a4ca(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_bdcd2064_18da_416c_8c44_3052422b7570(ArrayList<Float> lst) {
        return lst.stream().map(x -> new BigDecimal(x).setScale(0, BigDecimal.ROUND_CEILING).multiply(new BigDecimal(x)).setScale(0, BigDecimal.ROUND_CEILING).intValue()).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_ac5b7e32_3401_4f2e_9bcc_af59ede26056(ArrayList<Float> lst) {
        int sum = 0;
        for(int i = 0; i != lst.size(); i++) {
            sum += lst.get(i)*lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_49d16e3a_90c7_46e5_bd1f_4196917d752c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x ->  Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_6_7001abc8_65f0_41eb_aa8c_89dbe72c014d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_009fec38_a037_498f_a502_d249436e2da0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_461c315f_7337_410b_8697_95a6b8d62890(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_72ea0066_ce62_44e8_aea0_732e2ff45796(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.round(x)).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_11_369de820_0c08_41db_8405_92c73be29614(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_a7bb1827_0cd0_4856_8285_05319deb6fe1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_40be5333_7236_47cf_9803_1ed86dba0793(ArrayList<Float> lst) {
        int sum = 0;
        for(Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_627ab875_8457_4f34_8025_66922d815024(ArrayList<Float> lst) {
        return lst.stream().map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_fb26e9c3_6e9f_418d_8d4f_552548d165cd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(Math::round).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_7_20bbab8c_e75b_456c_b0e0_a0d81bdf8c05(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_7316fd18_fb53_4297_b514_43854a8a549b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_b9e7c61d_2726_4848_adb7_02f5a2cacc27(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_10_b1c95ec8_563b_479b_a2c6_beaa4d4449ea(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f30120ef_14e8_43ea_b97b_0f3cc213a203(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum +=  Math.pow(f ,2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cf80b040_3c54_4899_acb0_022933a5e6b8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0430bfad_6491_4384_8792_eebcb2a624df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_5ca2f226_9c57_40a6_ad49_9c988e269e95(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_9de632fb_2555_47ea_a970_4f564fe0fd25(ArrayList<Float> lst) {
        final class Java {
            static int sumSquares_Problem_4_9de632fb_2555_47ea_a970_4f564fe0fd25(ArrayList<Float> lst) {
                int acc = 0;
                for (int i = 0; i < lst.size(); i += 1) {
                    acc += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
                }
                return acc;
            }
        }
        return Java.sumSquares_Problem_4_9de632fb_2555_47ea_a970_4f564fe0fd25(lst);
    }

    
    public static int sumSquares_Problem_1_5da1180c_aeb9_4a36_bae2_6c4f3a4f54ef(ArrayList<Float> lst) {
        // Write your code here
        return 0;

    }

    
    public static int sumSquares_Problem_4_17dbb34d_46d4_49ca_ab2c_57f4d62ef69d(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_11_d77e61cc_5e16_41eb_86ff_24c5ec6c0015(ArrayList<Float> lst) {
        return lst.stream().map(n -> Math.ceil(n)).map(n -> n * n).reduce(0, (m, n) -> m + n);
    }

    
    public static int sumSquares_Problem_1_c8df8e23_25e1_4b44_8a06_64201a07aea0(ArrayList<Float> lst) {
        final int arg = 0;
        final int[] result = { arg };
        lst.stream().map(i -> Math.ceil(i)).forEach(i -> result[0] += i * i);
        return result[0];
    }

    
    public static int sumSquares_Problem_1_0dbed394_3ac1_4994_ab84_57361cf4f74c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_80fe7856_fad2_4bd7_bdc5_42cae4f4be69(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_cf829ac0_97e7_4d0c_9126_24b4fd1cc8b2(ArrayList<Float> lst) {
        int result = 0L;

        // get list of numbers
        ArrayList<Float> numbers = lst;

        // iterate through the list
        for (Float number: numbers) {
            // compute the sum of squared numbers
            result += number.floatValue() * number.floatValue();
        }

        // round result to nearest int
        result = Math.round(result);

        // return result rounded to nearest int
        return result;
    }

    
    public static int sumSquares_Problem_5_c97d1d99_8cd1_444d_876b_62770ceff179(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_11_78b5277d_c6e3_4ae4_826b_0202dddfc026(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_3780ceb4_8386_47f6_8ec1_45ddae0a8fb0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(Math::round).sum();
    }

    
    public static int sumSquares_Problem_1_4353badc_2c87_4017_8c6d_ac005bbeabe8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_087c720f_50dd_4d6a_9972_6290680833da(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_11_8fc7c0b6_3b21_4957_b3e5_7081bce5312f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_fce9091f_f6dd_4826_b6ac_a6cc3b05db7d(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_75c7b4d4_726b_449c_91ca_7cfba4ea6bb6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_d5673363_887b_4300_8f0f_d07412ab5705(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_fd5cc068_a2bd_4c48_8eaa_a056fdfdf487(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_46cd7fa3_82d8_470a_afe8_73e52ffb03ca(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.round(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_87c83a2c_08a5_488a_9c80_021a83186cfd(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_8099b17d_0403_4715_be03_3a7fb733d13e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_d038f55f_b89d_4f7e_bd27_853a0f27e35b(ArrayList<Float> lst) {
        int sum = 0;
        for (float i : lst) {
            sum += Math.round(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_fe6ed6ce_0ed7_45b9_970c_bf929a9a09d3(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7fb696fc_a96e_4fce_9ad5_bdbed133436a(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_dd501a8e_1599_458b_9e4d_d688dcc69596(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f240a59c_814d_43d2_9011_46f0f87d2836(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_941bebd7_5d0d_426d_ba8d_aff5ee783e7c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_bcf1e88a_ebf2_4404_8bf6_f7bfe2d7d28a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_bdb7c563_3c79_46b0_a755_09d342afaf79(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_a7b188c5_fd62_4252_bdef_b1bc77538ef2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_16f09714_ed92_4e22_8360_2596585cc7b8(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_0_b54710c1_76ef_4d19_830a_5befa605d832(ArrayList<Float> lst) {
        int sum = 0;
        Iterator<Float> itr = lst.iterator();
        while (itr.hasNext()) {
            float f = itr.next();
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_1fdc8714_16bf_4111_9ee4_7e620184874f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9734e986_ccdc_45b8_8c12_2c8c0da3c2d8(ArrayList<Float> lst) {
        int sum = 0;
        for (float x : lst) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_78bae5a2_6e79_4c3a_aec3_03291e57c27b(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_70b8b6c7_33a5_4254_9bb1_37bdf092ac4f(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_f55444a7_6e96_44ec_89b4_46c3cc4479c3(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_fcd38ff8_c925_4c80_b848_2d396bcc8c91(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i : lst) {
            sum +=  Math.ceil(Math.pow(i, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_c9b1df99_375e_4d0c_81fc_6b461513d0e5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_276012a2_2557_42fb_9afb_bc7019e44d7a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_a39f32c0_742c_4fd3_be29_c3fbdf358f93(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_1cbfe173_020e_4dc7_8d96_524bc512c06e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_1e41104b_4207_45aa_a4ee_15174b731f8a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a,b) -> a+b);
    }

    
    public static int sumSquares_Problem_3_8fdeda05_e849_438b_bcfa_0a264b150e1f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_cd5522c9_6017_4ffc_92fa_7a1a02a487a1(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_0_2a1069f1_6ba0_4e0a_9b57_a04f70e50fb0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x ->  Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_5_7322751d_bdf6_4b23_97b8_fef41e9724a5(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_37631f07_64e5_4634_8fa3_6607eee75db4(ArrayList<Float> lst) {

        // Your code here
        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_9_bd53d1bf_12e8_48ea_aab1_bbca54e0024b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_aacd03ba_c9c9_4fab_b50c_00187e00e788(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_81e77449_32e1_4fe5_a5a7_19cdab94f885(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_f9ff7930_b116_406c_979c_29b13e051264(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_e6cf2f7b_b605_4288_9fd6_962384295a2c(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_f0c493bb_c5b3_4400_83e0_941576fbc2dc(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_12122c76_070f_429b_a50c_47c247e605e1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_19b71e74_61bf_4b9e_b239_ca927e622400(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_d6d1dd51_d0af_487c_8d2d_e884acde38aa(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_6dd4c055_9cbf_4d78_9cbf_60cf1e58e06b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_a9d3b9a5_b74c_4682_9e8a_10ffdd50a010(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_b5a8ef79_c32c_464a_97f7_5a34f4cead11(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_c1d5e4c4_820e_493f_834a_1397b1700bda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_7569e65a_3782_407f_8ff9_2482a1eb9406(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_dd501a8e_1599_458b_9e4d_d688dcc69596(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_7bd344e2_5ce6_4554_a234_a0400a7b13e1(ArrayList<Float> lst) {
        float t = 0;
        for (int i = 0; i < lst.size(); i++) {
            float f = lst.get(i);
            t += f * f;
        }
        return Math.round(t);
    }

    
    public static int sumSquares_Problem_0_9d963ad2_85eb_4a1f_a260_fd80c498ed36(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_8f2b66eb_e8be_415f_9608_6e3ac4cadefe(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_219ddef2_0360_4864_8d33_20c8ee3f63e1(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_be1e27d6_778f_475e_af6c_4cf8ff934ebe(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_78b51879_8da3_4cd2_a1c3_f4d4bd3fa700(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_0fa89ce5_264c_46c9_85fe_2fa8ca5b4c13(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5f78964c_4805_418a_aaa4_8bc86c821aa9(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_77520194_8647_46e5_9f08_611b23220c40(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_c0b41c5b_e5b4_4251_9edb_6fb153f11980(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_b8da4456_e487_435e_b85e_9e78b4901b56(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst)
            sum += Math.pow(Math.ceil(Math.ceil(f)), 2);
        return sum;
    }

    
    public static int sumSquares_Problem_6_43d687db_90de_4284_acd5_0dfbb6637d48(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_016a1994_3ef2_4f4a_bf06_45515ed735e2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_4703a44a_778f_4f7b_82b7_c3478abe083b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_8042f086_4379_4c41_bc0a_9294a670d082(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_604c41dc_462c_48df_a33f_1832a118942f(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x))
            .map(x -> x*x)
            .reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_fb26e9c3_6e9f_418d_8d4f_552548d165cd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(Math::round).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_2_e32bab2c_b920_4235_9934_9d2c467dfb8e(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_2c766641_a13f_4f9a_97b5_9697d50eb331(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_f193db87_43c5_4999_bf30_078fe144f4fb(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x)*Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_1_17dbb34d_46d4_49ca_ab2c_57f4d62ef69d(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_8061a0f1_6bc2_4707_9cfc_b79d83f3a28e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e7f93c75_8461_4daf_9b63_0edca52bc054(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_34c11229_0096_4a2d_b800_8ca377343ac7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cdef6fe4_8b4d_44e4_b7b0_0a2f6e543d36(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_49f6d021_bee7_427f_b14f_24bf154b4c1a(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_bc1e8986_c5ab_491c_99e6_d4c63b9234c8(ArrayList<Float> lst) {
        int sum = 0;
        int i = 0;
        for (float f : lst) {
            sum += f * f;
            i++;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d137762a_fab1_4905_89c1_291ca38c7e55(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_9a12d263_add8_4f41_94f3_a1952da3f5b3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_b1c95ec8_563b_479b_a2c6_beaa4d4449ea(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5f0a536a_c351_429d_be05_606aeb16561f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_8061a0f1_6bc2_4707_9cfc_b79d83f3a28e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9a8019c8_e06a_4e7f_b57d_587e654d0cd0(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_1ee4e86d_8e11_4d5d_acc1_7aef468fd57b(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_3f3f79fc_caa6_4da5_83ce_f3afd6b5b719(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_b3f36f41_6a06_4259_a85a_a155051d3271(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_7f43e8ab_0d1c_418a_af2c_6ae920c73772(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_037098ea_c38a_46b2_aa9e_4e887e33c8ab(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_50d68640_5b92_4191_833f_b6d6c9da8dfe(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_23b7de18_604d_4e7d_b06d_be61aa02ee7b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float elem : lst) {
            sum += (Math.pow(Math.ceil(elem), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c3ec4d3e_e840_49fd_a3ef_cf9f4bb9b224(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_e16d8f7a_3254_4ac4_90f0_2465e69552d5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_9a701303_e5eb_4c79_8537_60258375fcd8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_1a9a8fa7_f98a_42ed_8c54_371b5ffae5c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float elem : lst) {
            sum += Math.pow(elem, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_aa1bf7f0_fcb0_4faa_a2d8_664bdf2139f5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_72ea0066_ce62_44e8_aea0_732e2ff45796(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.round(x)).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_7_4d308279_dcf7_484d_a187_1b6107bec51f(ArrayList<Float> lst) {
        // Type your code here
        int sum = 0;
        int len = lst.size();
        for (int i = 0; i < len; i++) {
            sum += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_9f725c99_2137_4fa8_a226_1f16e0d5000a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_2fee37fb_3439_4d60_aa1c_5e911402b7e4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_4_5092ea9f_ce8f_4992_a407_5b794b9fc09e(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x+y);
    }

    
    public static int sumSquares_Problem_0_a44c5817_1196_41b1_9042_6feaf2742024(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_2c766641_a13f_4f9a_97b5_9697d50eb331(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_8099b17d_0403_4715_be03_3a7fb733d13e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_fe14f8ca_1acd_43a9_abd3_abf181642c27(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_e4dc6086_7906_4e8c_add3_bf4a2b7e829a(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_55ce4c58_a5a5_404b_ab01_248f73cc66e6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_5b638f00_4d82_4395_8b60_02a473af3372(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            float f = lst.get(i);
            sum +=  (Math.ceil(f) * Math.ceil(f));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_f5950505_7ea7_4993_af38_05b7e3882759(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_f835410c_300e_46f8_9b7d_9fd24959e1bf(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_d220c8a5_6be2_4688_8541_ab7d4e30cef4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_107d986b_6ac6_47ac_a219_13778f8f6607(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c97d1d99_8cd1_444d_876b_62770ceff179(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_5_3b417749_9a1a_464e_ab4f_eef142eabed5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_64f448c1_02e4_4ece_8345_0cf9c12786f2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_d63fda02_5f1b_4067_9e17_7c2ad1f303ed(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_f9afcebe_c905_4f74_b67b_f1260eee512f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_c039eb02_87ab_4fd0_a5ee_0fe1afea298c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_2ccca5d6_944e_470c_879d_4508a456a3c6(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x,y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_0db728fd_d9e7_4cc4_a9b2_033a63d212aa(ArrayList<Float> lst) {
        int sum = 0;
        for(Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_1806a20d_0524_4208_bf3f_9491870d53eb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_f063c2e4_e46f_4c0c_99e7_e6d0dbf4c6c4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_638fd0d0_b94e_4741_8fad_bcb8dccf9f70(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_2_a932f727_f73e_4dca_a545_25fae8674eb3(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(i -> Math.pow(i, 2)).sum();
    }

    
    public static int sumSquares_Problem_9_009fec38_a037_498f_a502_d249436e2da0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_bea7112a_1ec7_4078_b1ad_17af38b3d272(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_fd2b23e0_ac7e_4be8_960a_4dfd323db1c4(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_5da088e9_9767_42c6_948e_c2bc337bfbf9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3de400f9_9d3e_4991_935c_0e4f1e97d0b2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_286f5e36_ca84_4e1f_97ce_3e062b3bc2f9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_b1688f55_6fa5_467a_bd17_a001f7e68407(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_0afb7256_fe90_4bbd_992a_94ccdd12751a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_313b03d5_7a72_4a54_8986_a2597a35332f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_9c93fb7a_fafb_4cbd_af10_a0fa7c49b922(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(Math.pow(lst.get(i), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_3a80530f_03a0_45cb_8a2e_3c0de997f2ff(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_2_ae2b2493_b4ab_4aae_92ee_211513d19f57(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(Math.ceil(i * i))).sum();
    }

    
    public static int sumSquares_Problem_1_a695d97e_54b0_48a3_bc4b_ef04ab11dab3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_2c1b2f37_53a0_409d_8a83_dbc7e2d0cbb7(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_edf0bc38_59ea_43c0_8e92_0fdbc4b71769(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_434826af_1bff_4a88_9279_d9e79aabb241(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_871d9ef5_27e2_497c_a2de_4f3b0c0b282e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d17bdc7b_b41d_4d7b_b4cc_ac85b61a3653(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_25bd86cc_0fdb_4692_9f73_7e425466d401(ArrayList<Float> lst) {
        // Write your code here
        int sum = 0; 
        for (int i=0; i<lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_13d10e68_fe2d_4544_a27a_c90bb97f440e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_2616c368_b8c0_4966_a42b_85be1e2e8664(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_9462d529_2356_4f76_b43d_c8575bbf662c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_cfb4f5cd_413b_4e13_95d1_0d0f39352b6f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_af5cc82e_e44e_47ba_95a9_b6bc0c3ceb63(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a843573a_9cb2_453d_a87a_83cfd9d27240(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_9a8019c8_e06a_4e7f_b57d_587e654d0cd0(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_9c7df8f4_6c4b_49f4_ba9b_34bace13bedb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_7af8d71d_d549_4859_adf8_78bb25080dd0(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_c9b1df99_375e_4d0c_81fc_6b461513d0e5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_3_4cefa27f_9bf3_4fd9_80cc_c3539684d192(ArrayList<Float> lst) {
        // Write your code here
        return 0;
    }

    
    public static int sumSquares_Problem_2_9c10b7e0_7e51_43b8_b296_f92cef3a1707(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_9a701303_e5eb_4c79_8537_60258375fcd8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_d3d27b77_dc71_41d5_a0a7_5bd7f27ba541(ArrayList<Float> lst) {
        return lst.stream().map((x) -> Math.ceil(x)*Math.ceil(x)).reduce((a, b) -> a + b).get();
    }

    
    public static int sumSquares_Problem_11_223d01c5_d296_487c_ac73_9bf3049d778b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_cf829ac0_97e7_4d0c_9126_24b4fd1cc8b2(ArrayList<Float> lst) {
        int result = 0L;

        // get list of numbers
        ArrayList<Float> numbers = lst;

        // iterate through the list
        for (Float number: numbers) {
            // compute the sum of squared numbers
            result += number.floatValue() * number.floatValue();
        }

        // round result to nearest int
        result = Math.round(result);

        // return result rounded to nearest int
        return result;
    }

    
    public static int sumSquares_Problem_9_73be0d1a_f000_4f74_8d95_710c963bcb05(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b7c83c00_3cf7_4e70_9483_08a87969aaae(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_1_6bddb885_52d7_4b53_9603_1a831cbfd78e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_23ef379e_6dd4_4a73_a990_dab0e7d8b868(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_f1f033c5_643a_4c21_a0bd_40ca2086a4ca(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_a7b188c5_fd62_4252_bdef_b1bc77538ef2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_9a7ab0ff_26f3_460a_b979_6225af9ffbd8(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_b9e7c61d_2726_4848_adb7_02f5a2cacc27(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_db8649e8_8aae_4ca0_a91d_d92da02b99b7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_97a98e8e_40b1_4e85_8430_bedf87fcdf56(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_80d64f57_0025_4547_ae44_1bb7983ab3ed(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_a36e1492_3911_4882_89aa_6a34bced23a0(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_9a701303_e5eb_4c79_8537_60258375fcd8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_22993b14_c459_45b9_887c_d73143f44c4f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_1e408936_ccea_4832_887c_2330a5add1db(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_93e9f6af_7fdb_494f_a288_a7d076609fd3(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_c0c6978a_d56f_4516_881e_ac5c08a9541a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_2a6b93dd_488a_4f27_8272_c4baa180f33a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_f5713022_f68d_441e_9b7a_746600320357(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_6ef53315_f7d9_4a5a_907a_a04607545f91(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_ff4eb359_02ed_4498_9b23_b61b9e93f91b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_e5f1f498_fdec_4903_903e_c7f9b079c1a3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_274df3fb_ee77_4c65_a875_4c02324c90f9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_bec18f64_34d2_4388_9068_faea1138e7ad(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_e8371983_e168_4479_b412_cb21351f50ab(ArrayList<Float> lst) {
      return lst.stream().mapToInteger(n -> Math.ceil(n)*Math.ceil(n)).sum();
    }

    
    public static int sumSquares_Problem_2_908fff83_36de_4d21_aeaf_3db99a37850c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ec2bf59e_640b_4bd2_9185_7cdcf8ec7df4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_7_866536ca_2bbe_4252_a75f_02b21d5aa8de(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_6d01dfd7_8f0e_406e_9f68_18a5ae99de30(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_a16daa4b_43ec_459e_a3fe_8e6338d8b5c7(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_efbd84c6_5a05_4935_817f_5f468c040ad4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_b249111b_6ca7_440b_a74c_125f490ce834(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.round(f) * Math.round(f)).sum();
    }

    
    public static int sumSquares_Problem_2_80a8d3f7_0e1a_4957_ad66_e4d9db4c06b5(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_18bf2ac8_12d8_4fe4_b81c_29e624ae5a16(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(Math.pow(lst.get(i), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_6589358d_9164_4477_b32e_ca4523eca8c4(ArrayList<Float> lst) {
        int total = 0;
        int squareSum = 0;
        // Sum up
        for(float f : lst) {
            total += Math.round(f*f);
            squareSum += f*f;
        }
        // Round down
        for(float f : lst) {
            total -= Math.round(f*f);
            squareSum -= f*f;
        }
        // Square root and multiply by two
        total += Math.sqrt(squareSum);
        total *= 2;
        return total;
    }

    
    public static int sumSquares_Problem_4_918ee2cf_eb6d_403a_b5fe_afa64786fb32(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_d1fb05a0_c691_4a7b_95d6_c0e59a573950(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_9b66536a_cf0f_4290_a1dd_63455e2c6bb6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.ceil(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_3281689f_2f9a_4622_a9fe_3e9e89c0c28a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_b1688f55_6fa5_467a_bd17_a001f7e68407(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_0218508f_19cf_457b_a562_17f36dc247ce(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_13d10e68_fe2d_4544_a27a_c90bb97f440e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_6a7d9822_7201_456f_a5bc_28f44190b1ce(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_8_72b6287e_fa0a_4fc9_b349_2743b81073bc(ArrayList<Float> lst) {
        // Implement your code here
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_1f80ca34_d5e8_4877_ba20_84b51be85169(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_1_4fb1137a_1349_4830_9c13_f43b1fe26394(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_2a548d15_b914_44db_b353_d5146b2d7ed6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3199a208_1935_49fc_8696_649b7e7d5399(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_96d12b28_5d1b_4a21_9eba_1baf8ad0a022(ArrayList<Float> lst) {
        double sum = 0;
        for (Float f : lst)
            sum += Math.pow(Math.ceil(f), 2);
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_11_1dce730e_f8f4_4ded_b174_f3029942ecbf(ArrayList<Float> lst) {
        int sum = 0;
        for(float n: lst)
            sum += n * n;
        return sum;
    }

    
    public static int sumSquares_Problem_10_5bb0d6b1_ccd3_416b_bc05_54236a894f8f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_486baaee_7c18_4da0_b569_03cfb828efa4(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_150bed98_bd85_47f1_b4fd_0315a1757d0e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_97a8b1d2_a4c5_4e85_9813_120d3ba22f03(ArrayList<Float> lst) {
        int ret = 0;
        for(Float f : lst) {
            ret = Math.round(f*f+ret);
        }
        return ret;
    }

    
    public static int sumSquares_Problem_1_81e77449_32e1_4fe5_a5a7_19cdab94f885(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2a76d62c_5e8f_4aff_9e18_757fbb0b9369(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x)).map(x -> x*x).sum();
    }

    
    public static int sumSquares_Problem_7_c89db24c_c046_4aa1_9e71_2ca1d6478292(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_ad7fd9cb_978f_446f_9fa0_f666de6a4e12(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_df3b88c1_9aa9_450a_ac1e_2c2cc1cabca4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_f14ac33a_d4b2_4028_ae43_1d6c20ec77fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_10a3c465_cc44_4a35_a58e_4dfb862092eb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_bcda7afb_441c_45fb_9bf2_fc291a247825(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b62b143f_b85b_4b28_86b4_709b2d6a4c38(ArrayList<Float> lst) {
        int result = 0L;
        for (Float f : lst) {
            result = Math.round((f * f) + 0.5);
        }
        return result;
    }

    
    public static int sumSquares_Problem_0_dd501a8e_1599_458b_9e4d_d688dcc69596(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_9e9f536a_ae38_40da_9519_254b7e0d6d93(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b29cdfc6_af4a_4a8e_8059_ca2e634853b6(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += (lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_23b7de18_604d_4e7d_b06d_be61aa02ee7b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float elem : lst) {
            sum += (Math.pow(Math.ceil(elem), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_14445f9f_33b7_4348_a985_41bf33e06360(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_4_4bc1ea6b_d8ce_49ee_86b6_64ab88cad005(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_3850446d_aa57_4c5b_87ac_73eb28ace346(ArrayList<Float> lst) {
        // Write your code here
        return lst.stream().map(it -> Math.round(Math.ceil(it))).map(it -> it * it).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_5afec0d3_cc09_4108_ac0f_5502453cab6d(ArrayList<Float> lst) {
        int sum = 0;
        if (lst != null) {
            for (float f : lst) {
                sum+=Math.pow(Math.ceil(f), 2);
            }
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_91ace805_8124_4aa2_87c1_b07265017cec(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_dd49c57f_633a_43eb_8582_ea1a8c33f460(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_c1d5e4c4_820e_493f_834a_1397b1700bda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_206ace29_2441_454a_a2d2_e5fe6ae29d49(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_7f43e8ab_0d1c_418a_af2c_6ae920c73772(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_456ad06f_8e2d_4a11_a494_f99c9bd84f7a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_d3b427fe_2bf0_4c29_a607_85615220635f(ArrayList<Float> lst) {
        double sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return Math.round(sum * 100) / 100;
    }

    
    public static int sumSquares_Problem_1_f926906a_c7ee_41f6_bef5_7198e8e2f8ef(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_918ee2cf_eb6d_403a_b5fe_afa64786fb32(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_5c11890c_c944_4663_9403_55c3cdcd9cfa(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(i * i)).sum();
    }

    
    public static int sumSquares_Problem_1_0dbed394_3ac1_4994_ab84_57361cf4f74c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2d7ad5b1_79d4_47f2_a048_8fb795568437(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ff4eb359_02ed_4498_9b23_b61b9e93f91b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_a5b8de86_2146_42df_bdf0_1761ba069939(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_fd2b23e0_ac7e_4be8_960a_4dfd323db1c4(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_4aafc38f_d133_4c8e_949c_bdb617746653(ArrayList<Float> lst) {
        int result = 0;
        for (Float f : lst) {
            result += Math.pow(f, 2);
        }
        return result;
    }

    
    public static int sumSquares_Problem_0_a6da3315_734a_44ab_b54a_7f2ab625292d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_be80bef7_71f9_4b56_ac70_10501e0b4ad8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_9ce34061_4dbb_4f7d_b046_7e18977a87a5(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_9269ab62_7f82_4792_89c2_2778734c895f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_5bf123b7_cae9_4865_92d6_eac6d071f28e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_968415b7_5a06_4764_980f_937d65fb3cfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_8_92bcc5a6_fde5_4461_809b_4beeefe541c4(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_4acf233d_28a6_4f81_b498_7bf24f9e8778(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_9a9cc892_be14_47cf_b7df_1a782d7276af(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_0_fd141c57_8750_4cb9_81ba_2ea9cecb1b58(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_3_313d4c20_dcb2_4a34_ae24_c099a442ca03(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_d40b1eb1_8565_4f76_b118_af7e6f6d3308(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5e51bdff_b46b_41a2_9efc_13c2f3f246b2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_f2fe97ec_9b78_46c1_b1e1_546f571fd315(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_e7f93c75_8461_4daf_9b63_0edca52bc054(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d71473ca_cd01_4627_a5d7_ba8baf17ead5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_049e6af0_8bc0_48ef_b860_b3324c964815(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_8c354be4_265c_4351_971a_bec9a879aa46(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c17762c0_d42d_4121_98c2_8763498b870f(ArrayList<Float> lst) {
        return lst.stream().mapToInt(x -> Math.round(x)).mapToInteger(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_8_4acf233d_28a6_4f81_b498_7bf24f9e8778(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_7306c450_3b50_4934_a40d_5667f58b1425(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_504e3bf1_a35e_4790_8825_227741a70c86(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_37631f07_64e5_4634_8fa3_6607eee75db4(ArrayList<Float> lst) {

        // Your code here
        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_b4fb5188_bb09_4b23_8037_704b17e405b4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_83eb24f2_ca2d_4931_b96b_ca84c50bfb40(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_604c41dc_462c_48df_a33f_1832a118942f(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x))
            .map(x -> x*x)
            .reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_91993075_453f_4463_b0fc_8180a652beb4(ArrayList<Float> lst) {
        int total = 0;
        for(Float f : lst) {
            total = total+Math.round(f*f);
        }
        return total;
    }

    
    public static int sumSquares_Problem_7_8ccfc838_18c4_4a67_a65d_345013072f71(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_9c0f60f0_2cc4_42f0_864c_1f1758376d33(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_2f57832c_a604_4bd6_891d_b91cf71272ec(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_dec54d69_6785_4e75_bd8d_cd14829d32e7(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_d77f5836_1148_403b_b026_d73ff6efdaf7(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_ec2bf59e_640b_4bd2_9185_7cdcf8ec7df4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_2_0aec1732_c4dd_4a84_aff3_f7a8185dc721(ArrayList<Float> lst) {
        return lst.stream().map(x -> x.intValue()).map(x ->  x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_3e6da9b8_5247_4b35_ba22_2c14816a2a25(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_bbbaff2f_e77e_41c9_822a_af18b70a4031(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_9f395924_583f_4ce8_bced_a4b735966849(ArrayList<Float> lst) {
        // write your code here
        int sum = 0;
        for (int i = 0; i < lst.size(); ++i) {
            sum += lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_d99c21c9_043b_41ab_b1ec_efb322abf14c(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_42f467bc_60fa_4c8e_83b8_96711e8ecd1d(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_e5642dc1_b6ab_439c_b66b_f821e2365d2d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_d3c8e0ee_ac51_436b_839b_de1cfeab1338(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_c8df8e23_25e1_4b44_8a06_64201a07aea0(ArrayList<Float> lst) {
        final int arg = 0;
        final int[] result = { arg };
        lst.stream().map(i -> Math.ceil(i)).forEach(i -> result[0] += i * i);
        return result[0];
    }

    
    public static int sumSquares_Problem_5_871d9ef5_27e2_497c_a2de_4f3b0c0b282e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_0057a028_6a45_4664_9b71_80f01a307af2(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_bcf1e88a_ebf2_4404_8bf6_f7bfe2d7d28a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_eac31025_3453_4967_9a79_70f6dd388f69(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_bf44cfe3_0d11_426e_a42c_2cda116923d0(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(Float::intValue).map(i -> i * i).sum();
    }

    
    public static int sumSquares_Problem_3_bfd94607_774b_4790_b383_80acb9446f33(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_e5f1f498_fdec_4903_903e_c7f9b079c1a3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_0bc73f44_d96e_4d70_97b1_098036b2d7c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ff5f67ed_369e_4dbc_8957_79cc32d35d66(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_6a4cde99_b5d1_47ca_b6bf_12fc5a913259(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_10_df798504_42d3_4509_a5dc_6491a1cc8d60(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_b6d52cae_5c95_402a_b2e1_59f9eae1eb79(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_26e957d2_1a19_4aa5_b633_955d05641fe2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_1832d0de_1df1_4a21_8ddc_c5a466dc843e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_0d762d3d_568a_4a86_942b_0c849ae0b5c4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(i -> Math.round(i*i)).sum();
    }

    
    public static int sumSquares_Problem_0_d8b893d4_109a_42b5_933e_e8d7ea0da5e0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_ab0fd528_b912_492a_927e_4d4d2d06e4d4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a,b) -> a+b);
    }

    
    public static int sumSquares_Problem_6_f044a8d0_efda_4231_b721_f55c3e395a8d(ArrayList<Float> lst) {
        int lSum = 0;
        for (int i = 0; i < lst.size(); i++) {
            lSum += Math.pow(lst.get(i), 2);
        }
        return lSum;
    }

    
    public static int sumSquares_Problem_11_879d86a1_e3f1_42ae_a49c_02adf8464cb6(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_47e91bec_a6cc_4767_be8a_cd89f0509f7d(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_ad9dda20_209d_455b_8e6f_256e236fae80(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_206ace29_2441_454a_a2d2_e5fe6ae29d49(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_6e200417_36e7_4f7f_8bd5_2c26f6fc4fba(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_062c97ef_2e43_44b2_9bea_7fbb0cdec284(ArrayList<Float> lst) {
        ArrayList<Integer> lst2 = new ArrayList<>();
        for (Float f : lst) {
            int res =  Math.ceil(f * f);
            lst2.add(res);
        }
        int sum = 0;
        for (int i : lst2) {
            sum += i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_bc6fb20a_ef86_47eb_a5e8_4b38569b07c8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7fd5d959_b83a_4da0_b52f_02588d28d5fd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_2b09166b_cdc6_496a_9cfb_c1769ba7e3c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4eeaa165_d915_4fc1_a93c_7314327e764e(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i) * lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_b62b143f_b85b_4b28_86b4_709b2d6a4c38(ArrayList<Float> lst) {
        int result = 0L;
        for (Float f : lst) {
            result = Math.round((f * f) + 0.5);
        }
        return result;
    }

    
    public static int sumSquares_Problem_6_9cb4907c_c28b_441a_8673_01f0e34c26c0(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_cf80b040_3c54_4899_acb0_022933a5e6b8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_35f15c27_b0a0_4d9d_ab27_a8afbe819e26(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_5_f6dea5ca_d0d9_4d95_be8d_a6b44291c893(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_3a98dbc3_1c79_407c_ac8a_520524e5f2a1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_7224b177_d638_416a_85ea_3a42da0e39d8(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_bd8d3c35_090c_487d_a486_a26f5a7f4ec7(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(n -> Math.round(n) * Math.round(n)).sum();
    }

    
    public static int sumSquares_Problem_1_7cd9ceb5_5d08_4fea_9ef4_cd9795968061(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_33dcd357_ae53_49ac_aa23_6366e84336f4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_c9b1df99_375e_4d0c_81fc_6b461513d0e5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_c9b1df99_375e_4d0c_81fc_6b461513d0e5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_47b911b6_c254_44d1_a847_51b1e04e3235(ArrayList<Float> lst) {
        return lst.stream().map(n -> n.intValue()).map(n -> n * n).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_6ab43a36_4f0b_4dd2_88bc_d189c9ce0dda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_310e8099_ebc1_44d5_bad9_967972c81f73(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            int v = Math.ceil(f);
            sum += v * v;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f31b24bd_e43a_47a2_b7be_ef10bd076c50(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_7f0d7486_b66d_4899_ac71_d41add20f921(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_4_279ddfca_a797_42f9_922b_7a4ec1f48604(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i: lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_4ebed367_e025_49a5_9d48_e32adb19c08f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_93723ec6_f02f_4f38_bc81_5b71b5d78553(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.round(Math.pow(i, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_95336615_b5e7_439c_8937_6b26f60d672d(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_0_be5e83a5_feb0_4fd8_97ea_4984808e041b(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_a16daa4b_43ec_459e_a3fe_8e6338d8b5c7(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_3a80530f_03a0_45cb_8a2e_3c0de997f2ff(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_2_15d6a19d_8535_4c6d_ba44_8a56fca09db1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_310e8099_ebc1_44d5_bad9_967972c81f73(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            int v = Math.ceil(f);
            sum += v * v;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_5e4dc926_c2a6_4b51_9d7c_800c4ac51035(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.ceil(e)).map(e -> e * e).sum();
    }

    
    public static int sumSquares_Problem_5_56d15786_17e6_442b_8df6_71d3d0170b06(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.round(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_469d6bcb_abc2_4e8a_a7ed_9d0ddfd4fa28(ArrayList<Float> lst) {
        int result = 0;
        int[] arr = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            arr[i] =  Math.ceil(lst.get(i));
        }
        for (int j = 0; j < arr.length; j++) {
            result += Math.pow(arr[j], 2);
        }
        return result;
    }

    
    public static int sumSquares_Problem_10_e55f7218_046e_4a75_ab1a_d50a22652037(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_a05cebdd_91d0_4d61_b284_f2fd0b013400(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_61b568a0_30ec_4ad2_9868_e3397841fa69(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_03a03cf1_d237_4ce9_8716_0963a2d88ed8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_911b295a_9ebc_4866_8e36_de3142d1ba47(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_7f43e8ab_0d1c_418a_af2c_6ae920c73772(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_9104de3c_e820_4948_a6dc_8f0ba88a51b9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4d308279_dcf7_484d_a187_1b6107bec51f(ArrayList<Float> lst) {
        // Type your code here
        int sum = 0;
        int len = lst.size();
        for (int i = 0; i < len; i++) {
            sum += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7cf6b7d7_946d_4427_9997_0d76012593ed(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5b32d364_13aa_4cbd_b2e4_66a9ce690eb5(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_9bad13fe_9df9_4338_80bd_fc391ced83ed(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f2c797d0_1751_4862_b779_f43227fa7bce(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_c42f2a40_06e1_47b9_8baa_6d064d0d5b8d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_5171aa41_654d_48fc_b255_2674c2ad4601(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_7_0bc73f44_d96e_4d70_97b1_098036b2d7c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7d51c99c_c70e_4060_8ff4_9b85d967c8d4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6248bba7_2b1b_4851_9663_9d314cf57713(ArrayList<Float> lst) {
      return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_1_024e273a_5cae_4bd7_bf99_d990a3313942(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_191c871e_51b7_49e1_b357_8178b7564ef5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5d77561e_bf0f_4756_b2d8_68a4e57d8cc2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_b8c8450a_0cb3_40ea_8b44_cac70636a096(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_b0c5f63b_c097_425e_a07e_d26c4a8e8a20(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_2d2a5b97_03db_4a15_931e_bbadfe99a997(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_2e9051cf_79ad_403b_9a58_28e5cf331e0d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_44929144_ff0e_4d57_a42a_acd6558fedf1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_2c13ef0a_061d_47d5_8e1c_cf29dd1313f0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7430fc21_e279_4b16_9725_295fbf07564a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_bea0a9ef_27c7_4e36_a9be_2cb11764da4e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e2bbd5cf_71ae_49be_85f2_5029eb573797(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_4930a341_c703_4e34_b4b1_2219bb005f42(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_6_78205afc_1404_4a3e_bf46_8e7d7a3f19d4(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_40311a09_5118_4e29_b5f5_1ee1efb73a67(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c17762c0_d42d_4121_98c2_8763498b870f(ArrayList<Float> lst) {
        return lst.stream().mapToInt(x -> Math.round(x)).mapToInteger(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_5_a5ed47a3_a4fb_4d2b_a2d9_c572c626d42b(ArrayList<Float> lst) {
        // >>> YOUR CODE HERE <<<
        return 0;
    }

    
    public static int sumSquares_Problem_1_2b86fce6_6c82_4ed7_b8f1_7aa8525274b6(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_d2a78732_692b_407c_b298_4b8b6175aa62(ArrayList<Float> lst) {
        // Implement your solution here
        return 0;
    }

    
    public static int sumSquares_Problem_3_51fffdc3_93d2_4faa_9608_a5facb55a370(ArrayList<Float> lst) {
        int sum = 0;
        for (float elem : lst) {
            sum += Math.round(elem) * Math.round(elem);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f152c3fe_383c_46c3_890e_33e1c893c265(ArrayList<Float> lst) {
        int s = 0;
        for (float f : lst) {
            s +=  Math.pow(f, 2);
        }
        return s;
    }

    
    public static int sumSquares_Problem_1_684940e0_3d63_484a_9f04_48405d8a2743(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_1_a695d97e_54b0_48a3_bc4b_ef04ab11dab3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_010daad7_1592_4318_aecf_433042980551(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_5afec0d3_cc09_4108_ac0f_5502453cab6d(ArrayList<Float> lst) {
        int sum = 0;
        if (lst != null) {
            for (float f : lst) {
                sum+=Math.pow(Math.ceil(f), 2);
            }
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3591c461_4b27_4b2d_b3cd_44c9962d44cd(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_049e6af0_8bc0_48ef_b860_b3324c964815(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_97a8b1d2_a4c5_4e85_9813_120d3ba22f03(ArrayList<Float> lst) {
        int ret = 0;
        for(Float f : lst) {
            ret = Math.round(f*f+ret);
        }
        return ret;
    }

    
    public static int sumSquares_Problem_9_c73bcd41_c223_4a32_aa0e_deb0356704de(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_f31d59a7_6850_44b3_90a2_4bf60e7a3fba(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_3d39033c_5cd9_4ce6_a590_c031abced655(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_f4a6f39f_e183_4830_b447_d23d5aeca94a(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.ceil(f) * Math.ceil(f)).sum();
    }

    
    public static int sumSquares_Problem_3_6a6a825c_f41d_4bd7_96ff_f73b356e8340(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_6b848ea1_07fc_4181_95e1_463534cf9ed9(ArrayList<Float> lst) {
        // Solution here
        return 0;
    }

    
    public static int sumSquares_Problem_8_e11d898a_853f_4111_b1f9_3107660cfb45(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_5171aa41_654d_48fc_b255_2674c2ad4601(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_3_0621ee01_2ba8_409c_adc4_c2c5f86fd559(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2c13ef0a_061d_47d5_8e1c_cf29dd1313f0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_210d4172_2ef0_449c_a874_1179286edf97(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d6de7b01_a2cf_4f8a_a4b0_890e80f56151(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_a7bb1827_0cd0_4856_8285_05319deb6fe1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0e945764_11f5_41fc_aaa5_159646ee0b00(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_9a9cc892_be14_47cf_b7df_1a782d7276af(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_10_90d5e2b7_d856_41cd_82f3_d2a5339c9002(ArrayList<Float> lst) {
        int result = 0;
        for(Float f : lst)
            result += Math.pow(Math.ceil(f), 2);
        return result;
    }

    
    public static int sumSquares_Problem_0_c9e2dcc1_c54e_48f0_9ab5_eca33727858e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_665bbb56_5043_4bad_bd96_91abbd0808d9(ArrayList<Float> lst) {
        if (lst.size() == 0)
            return 0;
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(Math.round(x), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7dae3e9d_9e3c_4df1_8593_129b29e76916(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_5_d4f2efb9_92bf_4454_a933_bcd9f074c3fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_cd9e92f5_3e7e_4c07_87a5_443ed3dd59df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_5174b0c8_605d_406f_b2ee_fcbd17269469(ArrayList<Float> lst) {
        // Write your code here.
        return lst.stream().map(d->Math.round(d)).map(d->d*d).reduce(0,(a,b)->a+b);
    }

    
    public static int sumSquares_Problem_5_8d0bac9c_e904_40e6_bc5e_6fa57ab06198(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d77e61cc_5e16_41eb_86ff_24c5ec6c0015(ArrayList<Float> lst) {
        return lst.stream().map(n -> Math.ceil(n)).map(n -> n * n).reduce(0, (m, n) -> m + n);
    }

    
    public static int sumSquares_Problem_9_4eeaa165_d915_4fc1_a93c_7314327e764e(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i) * lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_20185846_2e18_4c8c_b384_7bc9a185abb9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_d3c8e0ee_ac51_436b_839b_de1cfeab1338(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_20185846_2e18_4c8c_b384_7bc9a185abb9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c3958b44_7178_4d23_8380_48b803f66718(ArrayList<Float> lst) {
        return lst.stream().map(Float::new).map(x -> x * x).map(Math::ceil).mapToInt(x -> x.intValue()).sum();
    }

    
    public static int sumSquares_Problem_2_298286f8_cd43_4659_b93c_1f80b230e81e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_a39f32c0_742c_4fd3_be29_c3fbdf358f93(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_b6ee1279_6011_45c4_bb5e_9c79ff3edc60(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_8f1bd6b4_2949_441d_b7b4_dc3c9915a62c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_11_5af69836_473f_4ee6_9d90_bdd25f755885(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_95dab76d_8749_4647_8bc6_862e378918d6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_86094cfe_b01e_496f_b87d_4d4a37bddb62(ArrayList<Float> lst) {
        // >>>>> YOUR CODE GOES HERE <<<<<
        return 0;
    }

    
    public static int sumSquares_Problem_6_5681b66f_d17f_40bc_8938_ff27cc39c1d9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e62e0b4c_cfe9_487d_a29d_cc8b679ee820(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_e98f2185_9a4e_47dd_a82f_eb6b7a5051cc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_df23103a_721f_41ab_bf38_eb671947983a(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_665bbb56_5043_4bad_bd96_91abbd0808d9(ArrayList<Float> lst) {
        if (lst.size() == 0)
            return 0;
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(Math.round(x), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d43159eb_b64d_46d4_9c24_8d982234cfd9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_15d6a19d_8535_4c6d_ba44_8a56fca09db1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_74ddc477_6ce4_4532_bd3f_17b736c795df(ArrayList<Float> lst) {
        int ret = 0;
        for(Float f : lst) {
            ret += Math.round(Math.ceil(Math.sqrt(f)));
        }
        return ret;
    }

    
    public static int sumSquares_Problem_1_996dc523_e8d5_49fa_8028_d1b531e9098c(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_420dd4ba_4ae0_4e70_94b7_9bd5fb6f2700(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_5bf123b7_cae9_4865_92d6_eac6d071f28e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_32e5f321_76f3_40dd_b84d_bfcf74b8b63d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_1_1fae8590_414a_4ba4_a466_90ccdc438e29(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_6afef3b2_1c98_4d4b_953b_6908d3eda314(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum +=  Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_ac81890a_6e8f_42a7_874a_3b185b218b99(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_05751400_21e0_408c_8956_1cc7c97434c3(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_28d72756_20aa_40c2_8a02_070ef0f63292(ArrayList<Float> lst) {
        double sum = 0;
        for (float f : lst) {
            sum += Math.pow(f , 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_0_bec18f64_34d2_4388_9068_faea1138e7ad(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_21ccc867_c702_47fd_842b_c86a4f92bf1d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_627fc465_3810_43a9_9d1c_83fafaf88957(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_37e369fe_2070_4fad_9eaa_e4edce60251c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_5f200919_088e_4a94_8305_56b4dbd9c9bf(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(Math.pow(lst.get(i), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_c6b17361_a10b_46a5_8cf0_9f5c963acbc0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_7e6081ee_60b9_4af5_a815_f2f71835ccdf(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_fea532a1_3579_41e2_b2c1_d730d92f0905(ArrayList<Float> lst) {
        return lst.stream().map(num ->  Math.ceil(num) *  Math.ceil(num)).reduce(0, (total, num) -> total + num);
    }

    
    public static int sumSquares_Problem_4_f55444a7_6e96_44ec_89b4_46c3cc4479c3(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_7f43e8ab_0d1c_418a_af2c_6ae920c73772(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_65d8b054_8f2c_4ee7_a47c_0c9dbda5ba0d(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_be80bef7_71f9_4b56_ac70_10501e0b4ad8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_631c8f0f_9002_41f7_a64c_e9e36c0461d5(ArrayList<Float> lst) {
        // your code
        return 0;
    }

    
    public static int sumSquares_Problem_5_4ffcd32b_4227_4049_83a2_a68184b370ca(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_3d5199a5_407e_4fbc_84c4_81e1ad630272(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_ed4b9496_67ae_4628_a08c_9f7a44c8c8d4(ArrayList<Float> lst) {

        int sum = 0;
        for(Float f : lst) {
            sum += Math.round(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_a5d9961f_80eb_4441_8242_fc96887043f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e22e88ea_244e_404a_b104_caf6b9728ae4(ArrayList<Float> lst) {
        ArrayList<Integer> list = lst.stream().map(it -> Math.ceil(it)).collect(Collectors.toCollection(ArrayList::new));
        return list.stream().map(it -> it * it).reduce(0, (it, other) -> it + other);
    }

    
    public static int sumSquares_Problem_4_8d0bac9c_e904_40e6_bc5e_6fa57ab06198(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_8fc7c0b6_3b21_4957_b3e5_7081bce5312f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_248d97df_d4cc_411b_b023_1ef3f755f2cf(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_3545695b_f69e_4ea7_8aca_3055bfe697d3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_0_665bbb56_5043_4bad_bd96_91abbd0808d9(ArrayList<Float> lst) {
        if (lst.size() == 0)
            return 0;
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(Math.round(x), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_1a08ef0a_911b_4dce_b63d_9d82f0866d20(ArrayList<Float> lst) {

        int sum = 0;
        for(Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_11b442a9_8e28_4830_aa53_d93a8fa55c5c(ArrayList<Float> lst) {
        throw new RuntimeException("Please implment me.");
    }

    
    public static int sumSquares_Problem_9_b9515992_d519_42ef_a2a5_0ab0bfd6c4d0(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_6_6bddb885_52d7_4b53_9603_1a831cbfd78e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_41cb171d_0250_4295_a754_21e861b1a066(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_c496689e_dda5_4ac4_889b_806ee7dc3fe2(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_8f3e09cc_9131_44d5_8a15_9b475d9c2a5b(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.round(f) * Math.round(f)).sum();
    }

    
    public static int sumSquares_Problem_0_9a00c9f8_0023_4ee3_93c3_66bda4b79bfa(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_bc1e8986_c5ab_491c_99e6_d4c63b9234c8(ArrayList<Float> lst) {
        int sum = 0;
        int i = 0;
        for (float f : lst) {
            sum += f * f;
            i++;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_ecfa1f32_3ed4_406c_b18f_359eaa260c85(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_19b71e74_61bf_4b9e_b239_ca927e622400(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_20bbab8c_e75b_456c_b0e0_a0d81bdf8c05(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cfb4f5cd_413b_4e13_95d1_0d0f39352b6f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_034040e8_a4ce_4c75_bc33_30e97a500605(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_edf0bc38_59ea_43c0_8e92_0fdbc4b71769(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_54692dcb_b15f_4474_b3ee_42b6a055b1fe(ArrayList<Float> lst) {
        return lst.stream().map(i -> Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_d5108185_dc82_4883_ad00_ea173d5ff345(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_2432aa8c_6ff1_4996_96a1_df4c2728b961(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_20e70573_306a_496c_90d5_cd4e02f92a7f(ArrayList<Float> lst) {
        //for(float i : lst) System.out.println(Math.ceil(i));
        BigInteger r = BigInteger.ZERO;
        for(float i : lst) r = r.add(BigInteger.valueOf(Math.ceil(i)).pow(2));
        return r.intValue();
    }

    
    public static int sumSquares_Problem_6_2d2a5b97_03db_4a15_931e_bbadfe99a997(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_e4bd1b65_da49_45a4_9a55_85133ef60fb4(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4d3bdf59_3289_421f_bd71_75c29c67d6f4(ArrayList<Float> lst) {
        int sum = 0;
        for(Float x : lst) {
            sum += Math.round(x * x);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_20185846_2e18_4c8c_b384_7bc9a185abb9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e8f497f9_c9d7_4819_99c4_51a0865c5cf3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_41824a5a_ed03_4e78_833a_0bdde0f07ce6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_016a1994_3ef2_4f4a_bf06_45515ed735e2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_bd0637ac_de6e_4230_8832_6061c5c6c91c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(i -> Math.round(i * i)).sum();
    }

    
    public static int sumSquares_Problem_0_e257fcb6_f022_4385_863c_563d1fe1e1ff(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_6b0497de_a65f_42cc_95ad_7992dc0bad70(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x ->  Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_62d65955_173e_4919_ba3c_4dbda885a00d(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_689fdae6_a84a_4622_b327_20cb0e0b10bd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_79c2a0b4_6e92_43d4_9143_da635e58264b(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_7_e98f2185_9a4e_47dd_a82f_eb6b7a5051cc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_091de871_8652_43c2_bc07_615496031545(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x ->  Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_3545695b_f69e_4ea7_8aca_3055bfe697d3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_1_78205afc_1404_4a3e_bf46_8e7d7a3f19d4(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_a7ce250b_e576_4e1d_ba88_64f88facdc03(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2f8de0bc_034a_4363_91eb_831bcd39616b(ArrayList<Float> lst) {
        if (lst.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_44ab7349_f135_4a5b_810d_dcc80d4e1dca(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_ec38e4e2_9a83_4dfc_ba41_e63212f48f41(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2e9ac1de_7f1b_4a50_978a_cd9108146511(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_3591c461_4b27_4b2d_b3cd_44c9962d44cd(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2bb3ccfd_0256_45b6_afed_c71429d58bbd(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_ddef837d_85e2_4876_9f86_84ed5427265c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_7fd5d959_b83a_4da0_b52f_02588d28d5fd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_e857b832_4ff2_4332_9762_7276b7888e6c(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_90425a86_ce56_4288_8ff8_de75d974209a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_1_a36e1492_3911_4882_89aa_6a34bced23a0(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_0_bea7112a_1ec7_4078_b1ad_17af38b3d272(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_087c720f_50dd_4d6a_9972_6290680833da(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_6_402872ba_fbb2_450d_9129_d52f7969f308(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_5afec0d3_cc09_4108_ac0f_5502453cab6d(ArrayList<Float> lst) {
        int sum = 0;
        if (lst != null) {
            for (float f : lst) {
                sum+=Math.pow(Math.ceil(f), 2);
            }
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_f4ab2ac8_637d_4a55_b3f7_50c4227c8ad5(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float i : lst) {
            sum += Math.round(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_006b84c3_9578_4731_bdd6_50b7246b1dc7(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(n -> Math.round(n) * Math.round(n)).sum();
    }

    
    public static int sumSquares_Problem_2_223d01c5_d296_487c_ac73_9bf3049d778b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ca1163d1_76c9_4e2c_a2e4_f5b053453512(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_bdb555ff_6d8c_4f07_a4b1_20b0a974e558(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_4_0621ee01_2ba8_409c_adc4_c2c5f86fd559(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_9cb4907c_c28b_441a_8673_01f0e34c26c0(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_75c42a77_75b8_40ff_a837_7ecb570124dc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ee44a682_9805_4fae_8404_a2134149a12f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_2a6b93dd_488a_4f27_8272_c4baa180f33a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_1832d0de_1df1_4a21_8ddc_c5a466dc843e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_8d0bac9c_e904_40e6_bc5e_6fa57ab06198(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_04955124_2381_43d1_ab66_991ca5ea584a(ArrayList<Float> lst) {
        return lst.stream().mapToInt(Math::round).mapToInteger(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_1_4094dd72_d4ad_4b2b_87ee_4c0b9c87bea9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_1c860206_f80e_47c9_bc3c_a4c2617431e3(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_1ee4e86d_8e11_4d5d_acc1_7aef468fd57b(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_b05dcd73_3897_4ae6_a7dc_6597b617833a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_ea1e5a1b_005f_4d00_8116_bb21bee4fdf2(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(num -> Math.round(num) * Math.round(num)).sum();
    }

    
    public static int sumSquares_Problem_0_72b6287e_fa0a_4fc9_b349_2743b81073bc(ArrayList<Float> lst) {
        // Implement your code here
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_d8712a24_02d2_438e_b654_10e39c1f9965(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_5_4e62e7cd_08af_41aa_9fb3_1dd89908b3e2(ArrayList<Float> lst) {
        // Your code here
        int sum = 0;
        for (float x : lst) {
            sum += Math.round(x) * Math.round(x);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_65257237_690e_4d41_b879_ed57b06653e9(ArrayList<Float> lst) {
        float sum=0;
        for (Float num : lst) {
            sum += num*num;
        }
        return Math.round(Math.ceil(sum));
    }

    
    public static int sumSquares_Problem_1_0e945764_11f5_41fc_aaa5_159646ee0b00(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_6f839a44_ea4b_48dd_a266_f68b88261c68(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_6c67ed44_9b1d_4603_a8f2_4eb633fb2c07(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_a58ad4fc_f71c_4841_bffc_334240d176de(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_f3d7612c_5747_455b_8a94_57321b96f71e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_3d2bafe5_271b_4100_a64d_cf938d639753(ArrayList<Float> lst) {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    
    public static int sumSquares_Problem_1_12d1221d_c90a_4890_8a67_c385a7930df5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ae05289c_f2cb_4314_a896_c72430d30bfe(ArrayList<Float> lst) {
        // Your code here
        return  lst.stream().mapToDouble(Double::valueOf).map(x -> Math.ceil(x)).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_4_e2bbd5cf_71ae_49be_85f2_5029eb573797(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_298286f8_cd43_4659_b93c_1f80b230e81e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_fe5330d4_00d2_4150_8c4b_f0414c92a74d(ArrayList<Float> lst) {
        float sum=0;
        for (Float x:lst){
            sum += x*x;
        }
        return  Math.ceil(sum);
    }

    
    public static int sumSquares_Problem_1_b01e4a56_ca93_4310_a6cb_8ce66fba3042(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_13d10e68_fe2d_4544_a27a_c90bb97f440e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_191c871e_51b7_49e1_b357_8178b7564ef5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_62716388_d983_4bac_9726_b5082d3417e9(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_2_22f77089_df04_4167_a2a1_c491c0152c5c(ArrayList<Float> lst) {
        double sum = 0.0;
        for(Float x : lst) {
            sum += Math.pow(x, 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_6_e9d7b04a_6fc7_488e_9f6d_a51123a20001(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.round(e)*Math.round(e)).sum();
    }

    
    public static int sumSquares_Problem_11_968415b7_5a06_4764_980f_937d65fb3cfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_1_3281689f_2f9a_4622_a9fe_3e9e89c0c28a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2273828b_3196_47f6_aaaa_07f06c61de1b(ArrayList<Float> lst) {
        int sum = 0;
        int n = lst.size();
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        
        return sum;
    }

    
    public static int sumSquares_Problem_0_931c4168_1b2e_41cb_b51a_9d6da092a183(ArrayList<Float> lst) {
        ArrayList<Double> doubles = new ArrayList<>();
        for(Float f : lst){
            doubles.add((double)f);
        }
        int sum = 0;
        for(Double d : doubles){
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_65257237_690e_4d41_b879_ed57b06653e9(ArrayList<Float> lst) {
        float sum=0;
        for (Float num : lst) {
            sum += num*num;
        }
        return Math.round(Math.ceil(sum));
    }

    
    public static int sumSquares_Problem_0_2ccca5d6_944e_470c_879d_4508a456a3c6(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x,y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_b1da90bc_ee2f_48d7_889b_adf7d94e859c(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_0_346d275f_328f_4ef3_a050_abc8741a4a88(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_42085a82_e59d_4894_9414_91b238b9c6d9(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_b513fb36_2d70_488d_b78b_dc529c0d3e36(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_44ab7349_f135_4a5b_810d_dcc80d4e1dca(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_eac31025_3453_4967_9a79_70f6dd388f69(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_c183396b_7d0e_4665_98d3_4f433dd1b27c(ArrayList<Float> lst) {
        if(lst.size() <= 0) throw new IllegalArgumentException();
        int ret = 0;
        for(Float f : lst) ret += Math.pow(f.intValue(), 2);
        return ret;
    }

    
    public static int sumSquares_Problem_6_c0b41c5b_e5b4_4251_9edb_6fb153f11980(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_e257fcb6_f022_4385_863c_563d1fe1e1ff(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_ca813b8d_8e78_49ba_b110_95bd48ffef38(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_2e5b9f46_1ce0_4c5e_b28b_df6a9512e414(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_02757ca9_9d9d_41e9_9535_0580792ff587(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6e0d6c7f_0f61_44dc_b49b_c6517060bc06(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_9_c7d09d7e_1472_4a6b_a420_06c4895c2a62(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_9821b265_bbe3_4534_9f04_9d50a69287e7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_c97d1d99_8cd1_444d_876b_62770ceff179(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_3_900cd3b6_b580_49e4_96e5_3f1ce57adfba(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_46b99ce8_a5a7_42fc_8efb_eb1264a0725e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_7_35f5cfc7_9d07_44e1_88a2_ce6d16718f6a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_06989881_0f6a_41e9_8ee9_c021743c7670(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_5f78964c_4805_418a_aaa4_8bc86c821aa9(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_4c8101c3_c910_46cd_a1fd_e7fd22321b94(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_52d0299d_7424_4279_a05f_2e898039c036(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6afef3b2_1c98_4d4b_953b_6908d3eda314(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum +=  Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_e3d8f652_f042_40eb_a6d6_f9a909e7c003(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_eafc4559_c5d8_4933_8c89_ae94570768a3(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_23689f68_738c_46af_b3e6_14847120dcfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_6dd4c055_9cbf_4d78_9cbf_60cf1e58e06b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_a75628e7_3f31_4cb7_812a_eff948b92c81(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_734ec3a8_eebd_4c88_b45b_722ae2a8f33e(ArrayList<Float> lst) {
        int sum = 0;
        for (float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4acf233d_28a6_4f81_b498_7bf24f9e8778(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_95145a2d_b95f_4027_8ab5_a20c6f9bdfc3(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_1_20185846_2e18_4c8c_b384_7bc9a185abb9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_5883a5af_40d2_461e_aa19_d57d5b5ee0b5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_0d762d3d_568a_4a86_942b_0c849ae0b5c4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(i -> Math.round(i*i)).sum();
    }

    
    public static int sumSquares_Problem_0_4703a44a_778f_4f7b_82b7_c3478abe083b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_b37ccc99_60d9_4c41_905c_1271e982584e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_fce9091f_f6dd_4826_b6ac_a6cc3b05db7d(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_14733a6a_0679_4749_976f_8dcc83139ce6(ArrayList<Float> lst) {
        int sum = 0;
        for (float x : lst) {
            sum += x *  x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4703a44a_778f_4f7b_82b7_c3478abe083b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_e3277c14_440c_486b_ac30_da933e706311(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0fad6df8_d78a_4e14_9285_5caf2dc30697(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x ->  Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_6c67ed44_9b1d_4603_a8f2_4eb633fb2c07(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_c8939b10_d327_4bc0_8550_975802aacb81(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_d6d1dd51_d0af_487c_8d2d_e884acde38aa(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_9c183292_8a17_40f9_a01e_419884fdc4de(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_8a9ab386_eb13_4105_9b87_8864201601fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_be4f7e4e_8970_43f6_8018_40b9a950b9ee(ArrayList<Float> lst) {
        // Your code here
        return 0;
    }

    
    public static int sumSquares_Problem_1_0f113aea_5c68_45ab_b7c0_ec63c42540a8(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_e1d0e63b_e2d4_415a_8745_80f454e519f2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_a6b0ddca_d2fc_4521_bccb_c2cd211d9d7a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_4_cadcb0ef_c13c_44d9_9978_32e5010cb6db(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_a5bc2f09_4201_4f45_9544_41845f903cde(ArrayList<Float> lst) {
        int sum = 0L;
        for (float x : lst) {
            sum += Math.round(x * x) + x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_af5cc82e_e44e_47ba_95a9_b6bc0c3ceb63(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_27aebebc_de23_46f7_af4b_3a59ed1cf93f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += (f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_e62e0b4c_cfe9_487d_a29d_cc8b679ee820(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_44929144_ff0e_4d57_a42a_acd6558fedf1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_84ccb4a8_81c8_405c_be8e_1e6dea70d778(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_26e957d2_1a19_4aa5_b633_955d05641fe2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_5bf123b7_cae9_4865_92d6_eac6d071f28e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d5c5581b_97e1_46e3_b7ac_2ad6cdf7c6e2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_e32bab2c_b920_4235_9934_9d2c467dfb8e(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_c3548cb1_41f7_47ed_97f1_8453cb1bc557(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_f2fa355b_bf83_44c4_af59_3ffb8ecf5735(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_14b94557_037f_4bbd_956e_3fee8fc91854(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_861a2b82_ce76_4993_b4b9_68b407530204(ArrayList<Float> lst) {

        return lst.stream().mapToDouble(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_5_4bc1ea6b_d8ce_49ee_86b6_64ab88cad005(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_900cd3b6_b580_49e4_96e5_3f1ce57adfba(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_5bbaf889_5a6c_41b6_b680_c35e02b8e9a0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_f43c91ca_9c7f_4c12_b75e_b6efd83f464c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_54d0945d_e7c4_4391_98b4_cba796ebcfa7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_50387424_d006_4de7_989a_78ce2fcb0939(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (acc, x) -> acc + x);
    }

    
    public static int sumSquares_Problem_1_115a3ac3_8356_461c_ba98_d49fff345b1c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_a5b8de86_2146_42df_bdf0_1761ba069939(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_46d88d1a_47d1_45d6_8657_0f70f388c306(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_2_bcda7afb_441c_45fb_9bf2_fc291a247825(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_d55a414f_56b7_4279_b036_bb144dbf3a2b(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_71155b90_018a_4f88_82eb_461373bf1c84(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x,y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_f5713022_f68d_441e_9b7a_746600320357(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_88bb883b_2e93_4e48_b2b2_1b71186290f6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_00fbf781_e2cc_4f29_b081_de40ac9beec4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_c50886b9_6586_4cfd_8c89_a9e395231b1d(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_9f08f044_2d9c_42e8_8a5e_bcdcdb3f6a88(ArrayList<Float> lst) {
        // The first thing to look at is our list of floats.
        // We need to map the elements of the list to their upper int(Ceiling).
        // We can use the lst_map function to do this.
        // We also need to square each of the elements in the result of the lst_map,
        // so we can use lst_map again to square each element.
        // The final step is to return the sum of the new lst.
        // There's a function for that too, called lst_sum.
        // The whole expression looks like:
        // lst_sum(lst_map(x -> x * x, lst_map(Math::ceil, lst)))
        return 0;
    }

    
    public static int sumSquares_Problem_0_e8f2b197_1b24_45b7_bd0b_131c315511fc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_4db47fa3_4bf6_4ed1_9776_9afac23981fc(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_83b1185a_cb55_4827_b7e1_8e1075cc9143(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_be1e27d6_778f_475e_af6c_4cf8ff934ebe(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_b9515992_d519_42ef_a2a5_0ab0bfd6c4d0(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_dd11f328_df86_420c_958f_c1662957398a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_738c1a64_b7ea_4d99_b59a_edeee439e193(ArrayList<Float> lst) {

        // Implement this function
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_11_ec2bf59e_640b_4bd2_9185_7cdcf8ec7df4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_9_b19c9c45_de06_46c6_9e1d_36f5ca97a5c7(ArrayList<Float> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            result += lst.get(i);
        }
        return result;
    }

    
    public static int sumSquares_Problem_5_8a9ab386_eb13_4105_9b87_8864201601fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_62ffd843_33a6_4afb_9e19_5875a79ec129(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2a1b3d4e_6e4d_418c_9202_90e749b2c44a(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_204a281f_c972_4135_a66b_1f4c566169cf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_5bf123b7_cae9_4865_92d6_eac6d071f28e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_68d36df8_8f29_4c20_ba2f_edf27af43365(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5ae764f8_fe56_433e_8bbb_ab8c1e36ee93(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_a05cebdd_91d0_4d61_b284_f2fd0b013400(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_5e4dc926_c2a6_4b51_9d7c_800c4ac51035(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.ceil(e)).map(e -> e * e).sum();
    }

    
    public static int sumSquares_Problem_0_7d51c99c_c70e_4060_8ff4_9b85d967c8d4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7d0bc43e_0403_444f_a356_fe611050bb35(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_dd9a2e01_e89e_44b7_b9a4_bb0bc7adfe9f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_0a5ea9cc_b49d_4dd9_8485_ef7e51846c54(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_fff4e117_67cb_4b99_9cd4_80cb445f367b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_2f57832c_a604_4bd6_891d_b91cf71272ec(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_49727a5c_03ca_4631_a32c_f9f654c05577(ArrayList<Float> lst) {
        // Your code here
        float sum = 0;
        for (float num : lst)
            sum += (Math.pow(num, 2));
        return Math.round(sum * 1000) / 1000;
    }

    
    public static int sumSquares_Problem_9_f5950505_7ea7_4993_af38_05b7e3882759(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_a9d3b9a5_b74c_4682_9e8a_10ffdd50a010(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_238daf65_4ff1_445b_9e8a_e32b9dbbff0d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_ffdbd2d7_93c5_4018_b5db_f237d63ba8c6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_1e87db70_a2f4_4b5b_8a89_69b08fb57f14(ArrayList<Float> lst) {
        //throw new java.lang.UnsupportedOperationException("Please implement the sumSquares_Problem_11_1e87db70_a2f4_4b5b_8a89_69b08fb57f14 function");
        int sum=0;
        for(int i=0;i<lst.size();i++){
            sum+=Math.ceil(lst.get(i))*Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_465abda9_7b5b_4055_9e63_487f8b59ecc8(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_97fff975_2291_4249_abac_136e0517bcd6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_4e69006c_f278_4340_8a06_eddd41cb050b(ArrayList<Float> lst) {
        int sum = 0;
        for(Float fl : lst) {
            sum += Math.pow(Math.ceil(fl), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_fa25320d_566a_466f_8c33_6453bfe7f4cd(ArrayList<Float> lst) {
        return lst.stream().map(Float::intValue).map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_20e70573_306a_496c_90d5_cd4e02f92a7f(ArrayList<Float> lst) {
        //for(float i : lst) System.out.println(Math.ceil(i));
        BigInteger r = BigInteger.ZERO;
        for(float i : lst) r = r.add(BigInteger.valueOf(Math.ceil(i)).pow(2));
        return r.intValue();
    }

    
    public static int sumSquares_Problem_9_2b86fce6_6c82_4ed7_b8f1_7aa8525274b6(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_e80468c7_b0e7_4ed3_a0b7_18e118b57751(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_f28653c3_cdb1_428d_9fe4_0f314e0ddf8e(ArrayList<Float> lst) {
        throw new UnsupportedOperationException("Not Implemented Yet");
    }

    
    public static int sumSquares_Problem_3_3281689f_2f9a_4622_a9fe_3e9e89c0c28a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_95dab76d_8749_4647_8bc6_862e378918d6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_14b94557_037f_4bbd_956e_3fee8fc91854(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_17dbb34d_46d4_49ca_ab2c_57f4d62ef69d(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_e5642dc1_b6ab_439c_b66b_f821e2365d2d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_2f31433a_473a_4d6f_97d7_75da3d85e09c(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(f + f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_2fa8cacf_5974_491b_9944_b7b173855839(ArrayList<Float> lst) {
        return Math.round(lst.stream().mapToDouble(x -> Math.pow(Math.ceil(x), 2)).sum());
    }

    
    public static int sumSquares_Problem_1_6b0497de_a65f_42cc_95ad_7992dc0bad70(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x ->  Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_8_b5a8ef79_c32c_464a_97f7_5a34f4cead11(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9184be66_bd81_4e1d_adde_e41940c2acc3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_8da53af4_0980_4f5e_862a_8fde2fb82c2c(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_c039eb02_87ab_4fd0_a5ee_0fe1afea298c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_2dc61206_4a11_4bad_a762_ef8241b8fa0e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_f835410c_300e_46f8_9b7d_9fd24959e1bf(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_2fa8cacf_5974_491b_9944_b7b173855839(ArrayList<Float> lst) {
        return Math.round(lst.stream().mapToDouble(x -> Math.pow(Math.ceil(x), 2)).sum());
    }

    
    public static int sumSquares_Problem_0_dd10d9c4_d7ee_4ea1_b3bf_9d552043fd9f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_73c2aa02_59ca_49b0_b79e_768f7e4cbcf5(ArrayList<Float> lst) {

        return lst.stream().map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_56fd9229_63dd_4cd6_bd47_4012e7dfa240(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_0218508f_19cf_457b_a562_17f36dc247ce(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_85629dd7_e60a_4d05_8d2f_1861e8b66087(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_1c7cdf35_e517_40e0_af56_dac537c5f844(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_0e2611d7_f4e5_43a2_b251_4e8b41b3953b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2a548d15_b914_44db_b353_d5146b2d7ed6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_8c8b9f1d_115d_4003_9571_1f2b8ab0c6cf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float el : lst) {
            sum += Math.ceil(el) * Math.ceil(el);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_95798767_f791_47a7_9592_f34a2d123868(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_ed6d2525_3a7b_465c_b448_6b3814b17c6e(ArrayList<Float> lst) {
        return Math.round(lst.stream().map(f -> f*f).reduce((a, b) -> a + b).get());
    }

    
    public static int sumSquares_Problem_9_31b8287d_e462_48a8_8718_d3ba48e3a06d(ArrayList<Float> lst) {
        int sum = 0;
        for(float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_ef8d644a_0db1_4325_83b6_c0718eab156b(ArrayList<Float> lst) {
        // write your code here
        // make sure you handle the empty case
        if(lst==null || lst.size()==0) {
            return 0;
        }
        int sum=0;
        for(Float f: lst) {
            sum+=Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_20882c2e_0545_41a5_b240_e3c07eac6afb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_5f8d2ce7_8f7c_4028_b3e7_dc2468f238c1(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_0_c6b17361_a10b_46a5_8cf0_9f5c963acbc0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5f8c6091_635a_41a0_a440_f9d5f4a84658(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_62716388_d983_4bac_9726_b5082d3417e9(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_4_bd420a65_4f0a_4d26_954e_ebeda39fc3cb(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_8f2b66eb_e8be_415f_9608_6e3ac4cadefe(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_f2fa355b_bf83_44c4_af59_3ffb8ecf5735(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_1a08ef0a_911b_4dce_b63d_9d82f0866d20(ArrayList<Float> lst) {

        int sum = 0;
        for(Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_2d2a5b97_03db_4a15_931e_bbadfe99a997(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_f80c15a9_8bf1_4ea7_81da_ece3ecc6216b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_df798504_42d3_4509_a5dc_6491a1cc8d60(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_923e1174_ae1e_4e87_8b4e_e98fd18195cc(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_dd501a8e_1599_458b_9e4d_d688dcc69596(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_78b5277d_c6e3_4ae4_826b_0202dddfc026(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_75c7b4d4_726b_449c_91ca_7cfba4ea6bb6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c183396b_7d0e_4665_98d3_4f433dd1b27c(ArrayList<Float> lst) {
        if(lst.size() <= 0) throw new IllegalArgumentException();
        int ret = 0;
        for(Float f : lst) ret += Math.pow(f.intValue(), 2);
        return ret;
    }

    
    public static int sumSquares_Problem_11_093c935d_5546_4900_b9d1_cce251056b92(ArrayList<Float> lst) {
        return lst.stream().map(i -> i.intValue()).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_9269ab62_7f82_4792_89c2_2778734c895f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_a1e711df_ad2a_40cc_96b0_df2763ab6dce(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_e5ccdcb8_dd9c_454d_bcee_6c57c4de8016(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += num.floatValue() * num.floatValue();
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_e505de84_4478_4b27_b9d8_9b1f6a2f02bf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_be4f7e4e_8970_43f6_8018_40b9a950b9ee(ArrayList<Float> lst) {
        // Your code here
        return 0;
    }

    
    public static int sumSquares_Problem_0_8f271d74_fdc0_4e66_b4bd_f4f73e51371e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_54692dcb_b15f_4474_b3ee_42b6a055b1fe(ArrayList<Float> lst) {
        return lst.stream().map(i -> Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_09ccf914_406d_4687_a2a1_3faa702cae5f(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_2_42a63e11_2725_4ad6_95dd_2c8af19cb6d3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_bcda7afb_441c_45fb_9bf2_fc291a247825(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_fbdfe155_4600_4de4_88ba_3608e3bf4495(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_4bc1ea6b_d8ce_49ee_86b6_64ab88cad005(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_3233817b_c68e_4e81_bc9b_fb7475395cd4(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_8bf3c353_1392_4d6e_a9b8_87a827620d96(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_1b67c314_3e50_4709_a5eb_da29a4817c6f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_1_4f91e957_d06b_4c33_b5cc_7c9e2c834e71(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_d3da8d6c_4bcb_409d_bc82_3962d196d7f7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_62704a43_d368_4187_9bec_9d2bdd82a17e(ArrayList<Float> lst) {
        int size = lst.size();
        int sum = 0;
        for (Float x : lst) {
            sum += x * x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ffe4ba21_bf8c_40c9_8ab7_363233dda048(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_5f200919_088e_4a94_8305_56b4dbd9c9bf(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(Math.pow(lst.get(i), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_9e3234bb_95ca_4a31_81a6_b348b6d72dd9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_bdcd2064_18da_416c_8c44_3052422b7570(ArrayList<Float> lst) {
        return lst.stream().map(x -> new BigDecimal(x).setScale(0, BigDecimal.ROUND_CEILING).multiply(new BigDecimal(x)).setScale(0, BigDecimal.ROUND_CEILING).intValue()).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_1_0dbed394_3ac1_4994_ab84_57361cf4f74c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_89648a5c_9c6d_40f1_b133_4bcfd3f53cbc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_2273828b_3196_47f6_aaaa_07f06c61de1b(ArrayList<Float> lst) {
        int sum = 0;
        int n = lst.size();
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        
        return sum;
    }

    
    public static int sumSquares_Problem_4_091de871_8652_43c2_bc07_615496031545(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x ->  Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_cd49fbe9_9a4f_4d5c_90ad_fce3575bf82d(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.round(f) * Math.round(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_bf571941_5872_4784_9e29_438d981a4955(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_3a1a2812_9b90_4837_9eb6_b105064306f4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_25bd86cc_0fdb_4692_9f73_7e425466d401(ArrayList<Float> lst) {
        // Write your code here
        int sum = 0; 
        for (int i=0; i<lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_bb34419b_fc73_45e7_82a1_1efed04a2864(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_dc0c7e5d_8527_48d3_9a4f_a3157b024174(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_6c67ed44_9b1d_4603_a8f2_4eb633fb2c07(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_60f2a390_1f12_4092_867e_4356b9e07502(ArrayList<Float> lst) {

        // BEGIN SOLUTION
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
        // END SOLUTION
    }

    
    public static int sumSquares_Problem_0_5533496f_c321_4f2e_9583_1d7adaf0b9a9(ArrayList<Float> lst) {

        int sum = 0;
        for(float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_4aa23953_c05e_41f3_b18e_e83b815669be(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_504e3bf1_a35e_4790_8825_227741a70c86(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_27efaf57_143a_43c0_847e_d48888c26b6d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_717e21d8_0cac_40b5_b52f_4a8b436eaf96(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_c496689e_dda5_4ac4_889b_806ee7dc3fe2(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_add5edd8_08bc_4c54_ab9a_8b54348a5e97(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_871d9ef5_27e2_497c_a2de_4f3b0c0b282e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_7a4957e9_57f3_4090_a33b_173db65e3232(ArrayList<Float> lst) {
        int r = 0;
        for (Float f : lst) {
            r += Math.round(f) * Math.round(f);
        }
        return r;
    }

    
    public static int sumSquares_Problem_7_0a02dd28_8ef1_42ce_9de4_79dfa4e73ae2(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_5f200919_088e_4a94_8305_56b4dbd9c9bf(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(Math.pow(lst.get(i), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_0b473ed0_f3c8_40c8_ac2b_e368d9c094ca(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4252d753_89cd_46c4_bdd3_073e9460da6e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_931c4168_1b2e_41cb_b51a_9d6da092a183(ArrayList<Float> lst) {
        ArrayList<Double> doubles = new ArrayList<>();
        for(Float f : lst){
            doubles.add((double)f);
        }
        int sum = 0;
        for(Double d : doubles){
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_4e403631_3cf6_4081_92f0_78b75f977ac9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_eaa90b0e_32e5_4e6a_8839_5706f09901cb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_0a8a9676_d13e_4744_a341_485855c0da42(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_a692a85b_6960_45e0_b2c5_d98d1e4b4e1e(ArrayList<Float> lst) {
        // Your code here
        int sum = 0;
        for(Float num : lst) {
            sum += (num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_14354db4_ffb4_46fd_b358_290d32ed9b2b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_b62b143f_b85b_4b28_86b4_709b2d6a4c38(ArrayList<Float> lst) {
        int result = 0L;
        for (Float f : lst) {
            result = Math.round((f * f) + 0.5);
        }
        return result;
    }

    
    public static int sumSquares_Problem_0_e44b4499_7d86_4878_917e_4089f7262861(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_95087518_405d_4575_b210_f872b40513a4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_a36e1492_3911_4882_89aa_6a34bced23a0(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_0_519c8601_a0f2_4674_8e02_ade07a815f53(ArrayList<Float> lst) {
        int sum = 0;
        for(float x : lst) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c04469bf_86ae_4e9d_836d_9817811f66a7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_eac31025_3453_4967_9a79_70f6dd388f69(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_465abda9_7b5b_4055_9e63_487f8b59ecc8(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_cbca8bea_715b_4ff8_a614_56ab65aefc77(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_087c720f_50dd_4d6a_9972_6290680833da(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_3922ebb8_5d35_49ef_b777_5f81b073b007(ArrayList<Float> lst) {
        return lst.stream().map(f -> Math.ceil(f)).map(f -> f * f).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_c58fa97d_6f3f_43b7_b0c8_efc6949e442b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_701a626b_131d_4885_9ef8_0383198b2fdb(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x)).map(y -> y * y).sum();
    }

    
    public static int sumSquares_Problem_1_ad05e38e_8a00_48a2_b65a_1006e25dd285(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2ea35368_e7bb_4e26_8db9_504727ea6c04(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_ac81890a_6e8f_42a7_874a_3b185b218b99(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_27aebebc_de23_46f7_af4b_3a59ed1cf93f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += (f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_f1aa4e84_36a4_4e65_963e_2856233a7469(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_346d275f_328f_4ef3_a050_abc8741a4a88(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_248d97df_d4cc_411b_b023_1ef3f755f2cf(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_f55444a7_6e96_44ec_89b4_46c3cc4479c3(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_cfc2e522_b86e_4054_9a0a_20d262845b6d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_6_7af8d71d_d549_4859_adf8_78bb25080dd0(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_911b295a_9ebc_4866_8e36_de3142d1ba47(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_638e7f21_18f2_455a_9f7d_43f05c654428(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_313b03d5_7a72_4a54_8986_a2597a35332f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_e8096a9e_00a0_45c0_886a_a42efd4ce986(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_df3b88c1_9aa9_450a_ac1e_2c2cc1cabca4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_402872ba_fbb2_450d_9129_d52f7969f308(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_2_16cfbd6f_554a_4b08_a144_5e80f098da4e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_2_37631f07_64e5_4634_8fa3_6607eee75db4(ArrayList<Float> lst) {

        // Your code here
        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_87343ec5_bedb_4f53_92f9_b9c0cf869b13(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_da8dbc17_867b_4d0d_b0c3_e4963bdca062(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_223d01c5_d296_487c_ac73_9bf3049d778b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_fba8a305_2bdb_40dd_876f_f76870ba7233(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_3_2ec5b518_a26d_4c22_b853_ed32bc809f77(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e1f81dd6_f590_4bbb_8f4d_35c3e66b013a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_2b73d079_ef36_4339_b2f5_88b2322dc68b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_c42f2a40_06e1_47b9_8baa_6d064d0d5b8d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_3c5a24be_20c4_4296_8b56_76de874d417d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_dd49c57f_633a_43eb_8582_ea1a8c33f460(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_af5cc82e_e44e_47ba_95a9_b6bc0c3ceb63(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_2a548d15_b914_44db_b353_d5146b2d7ed6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_095f13eb_3592_41f0_a6f5_8cf706fd2b9e(ArrayList<Float> lst) {
        int len = lst.size();
        if (len == 0)
            return 0;
        int sum = 0;
        for(int i=0; i<len; i++) {
            double x = Math.round(lst.get(i) * 1.0d);
            sum += x * x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e1f81dd6_f590_4bbb_8f4d_35c3e66b013a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_8ba10104_c95b_4063_b3e4_a7ff4b97acff(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_09ccf914_406d_4687_a2a1_3faa702cae5f(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_6_e181332f_f197_4dfb_8f09_5a7cfcedb898(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_e8f8aa29_8c95_40f3_bb29_2e2c1dfc2c40(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_36f6756e_ec91_49f3_8e8f_a59e6b7aed33(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            double x = lst.get(i);
            double round = Math.ceil(x);
            sum+=round*round;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_f193db87_43c5_4999_bf30_078fe144f4fb(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x)*Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_1_9f11e9d2_1aee_4e2e_b79e_7fc37ccf6888(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_831ab11f_06d5_446f_82f4_9c148d8aef60(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_df4b1e13_0840_4d93_b92b_760a0b75983e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2acb3726_4e34_4eaf_9ed5_1e26c8e60738(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_21ccc867_c702_47fd_842b_c86a4f92bf1d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_bb272343_a8d1_45ef_9c1e_ec7c6d86fbae(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_154679f7_e430_427a_9a97_8d2c168df061(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_16f59885_a17a_41fa_bce3_258344742fc8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_5a043099_8dcf_41e3_9063_44f555aef457(ArrayList<Float> lst) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (Float num : lst) {
            nums.add(Math.ceil(num));
        }
        return nums.stream().mapToInt(num -> num * num).sum();
    }

    
    public static int sumSquares_Problem_1_d992f61b_24f8_45ac_9885_56e392fcba39(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0L, (x, y) -> x+y);
    }

    
    public static int sumSquares_Problem_3_e9d7b04a_6fc7_488e_9f6d_a51123a20001(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.round(e)*Math.round(e)).sum();
    }

    
    public static int sumSquares_Problem_6_e3d8f652_f042_40eb_a6d6_f9a909e7c003(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_65845ca4_6afd_4ab2_b66d_e7924d41947f(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_9_635bfb53_507c_4e74_9db6_5908f7af11ba(ArrayList<Float> lst) {

        // Fill this in.
        return 0;
    }

    
    public static int sumSquares_Problem_7_1e754707_88b5_4b80_bdf7_3e8c71436499(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_72741282_3ca2_47d1_9dcb_3b170b645051(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_a753d5f4_4af2_4c23_aeac_5e1314d7979f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_80d64f57_0025_4547_ae44_1bb7983ab3ed(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_6c1f33e9_cef8_43c9_b5bc_aafd5f27b68e(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_b01490b7_2504_4fc0_9939_4d8f8a2dd33d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_5174b0c8_605d_406f_b2ee_fcbd17269469(ArrayList<Float> lst) {
        // Write your code here.
        return lst.stream().map(d->Math.round(d)).map(d->d*d).reduce(0,(a,b)->a+b);
    }

    
    public static int sumSquares_Problem_0_a7da3e1a_1e77_4543_8182_b47acb762292(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_3_0e513d1d_f48d_4c62_aaab_a7b283ef7f0b(ArrayList<Float> lst) {
        int total = 0;
        for (Float i : lst) {
            total += Math.round(i * i);
        }
        return total;
    }

    
    public static int sumSquares_Problem_5_7224b177_d638_416a_85ea_3a42da0e39d8(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_9da222ce_222c_4e14_8ecb_d427c8833f13(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_77022cf3_f4e2_465b_b001_6eafcd141e35(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ae98989f_663a_4d63_85c2_1741361e2dc7(ArrayList<Float> lst) {
        return lst.stream().map(e -> Math.ceil(e)).map(e -> e * e).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_ffd0b0a9_7b67_4bd5_a66c_05b68de9900a(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_0ef44eeb_b672_4edd_8685_4d772a7f65db(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_a75628e7_3f31_4cb7_812a_eff948b92c81(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_86438689_9bac_4124_a914_2d6ad809278a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_93a2308e_d4bb_44a7_ad37_388c472e0ff5(ArrayList<Float> lst) {
        // Your code here
        return lst.stream().map(v ->  Math.ceil(v))
                            .map(v -> v * v)
                            .reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_6589358d_9164_4477_b32e_ca4523eca8c4(ArrayList<Float> lst) {
        int total = 0;
        int squareSum = 0;
        // Sum up
        for(float f : lst) {
            total += Math.round(f*f);
            squareSum += f*f;
        }
        // Round down
        for(float f : lst) {
            total -= Math.round(f*f);
            squareSum -= f*f;
        }
        // Square root and multiply by two
        total += Math.sqrt(squareSum);
        total *= 2;
        return total;
    }

    
    public static int sumSquares_Problem_8_1a656600_55ea_41ed_9f21_acbe286a7393(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_3922ebb8_5d35_49ef_b777_5f81b073b007(ArrayList<Float> lst) {
        return lst.stream().map(f -> Math.ceil(f)).map(f -> f * f).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_b1c95ec8_563b_479b_a2c6_beaa4d4449ea(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c97b8a75_4698_4fbe_927d_932a0ba48110(ArrayList<Float> lst) {
        int ret = 0;
        for (Float x : lst) {
            ret +=  Math.ceil(x) *  Math.ceil(x);
        }
        return ret;
    }

    
    public static int sumSquares_Problem_0_492f2528_190f_4d0d_863d_7a9988c9d660(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_3_d4f2efb9_92bf_4454_a933_bcd9f074c3fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c712cc54_c60f_406a_98c9_ef917a8807e8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_10a3c465_cc44_4a35_a58e_4dfb862092eb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7b33d4c6_4596_40bb_bf36_d6268d759442(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_3d2bafe5_271b_4100_a64d_cf938d639753(ArrayList<Float> lst) {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    
    public static int sumSquares_Problem_9_97fa4151_3b4e_453e_890b_bc83c9a243aa(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_ab637c05_f878_401b_b933_981e00f9f7bb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_4d9a6532_9bff_4b9d_97d1_70eb438a8243(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5171aa41_654d_48fc_b255_2674c2ad4601(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_5_e8371983_e168_4479_b412_cb21351f50ab(ArrayList<Float> lst) {
      return lst.stream().mapToInteger(n -> Math.ceil(n)*Math.ceil(n)).sum();
    }

    
    public static int sumSquares_Problem_0_962a9151_fc33_4601_8ad3_781f38738f29(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.round(num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3dd3cb72_4709_4a2e_938a_3b2a219ef4bc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_8f235683_d711_4217_94ca_04677d519277(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_80a8d3f7_0e1a_4957_ad66_e4d9db4c06b5(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_c496689e_dda5_4ac4_889b_806ee7dc3fe2(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_a96d6956_fbfa_4565_a18e_2c718cc4f2b8(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_8_cdf42630_c01d_488a_b2a9_dd18789aefc7(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_fa25320d_566a_466f_8c33_6453bfe7f4cd(ArrayList<Float> lst) {
        return lst.stream().map(Float::intValue).map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_6aaa5e3e_0a0d_4bae_b56b_beb1756d23c2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_d77f5836_1148_403b_b026_d73ff6efdaf7(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_1a4a4c74_4ad8_44ab_a651_dfb675494f49(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += (f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_bef8c4f4_9604_4163_b76c_8640be8963a6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d3da8d6c_4bcb_409d_bc82_3962d196d7f7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_4cefa27f_9bf3_4fd9_80cc_c3539684d192(ArrayList<Float> lst) {
        // Write your code here
        return 0;
    }

    
    public static int sumSquares_Problem_1_0a018e91_17ee_4ffd_a7e6_43b2a9dd2cec(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_864be009_a4a6_4f1c_ba58_3cc8cfc8313c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_4930a341_c703_4e34_b4b1_2219bb005f42(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_2_d220c8a5_6be2_4688_8541_ab7d4e30cef4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_a1e711df_ad2a_40cc_96b0_df2763ab6dce(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_115a3ac3_8356_461c_ba98_d49fff345b1c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_5ca2f226_9c57_40a6_ad49_9c988e269e95(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6b23c90c_b241_4f28_b6ec_2bb2b63d5683(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_97fff975_2291_4249_abac_136e0517bcd6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_1b75a7f3_e253_48d0_b830_0f3f855e06ef(ArrayList<Float> lst) {
        int len = lst.size();
        // Note that you need to convert from float to int using "intValue()"
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] =  Math.ceil(lst.get(i));
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i] * arr[i];
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_861a2b82_ce76_4993_b4b9_68b407530204(ArrayList<Float> lst) {

        return lst.stream().mapToDouble(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_1_091de871_8652_43c2_bc07_615496031545(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x ->  Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_1bd76b77_f851_46ac_af9e_0c24b8f581dc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_f95db433_5f91_46c9_ac39_7afebe1729cd(ArrayList<Float> lst) {
        // >>> your code goes here <<<
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cd49fbe9_9a4f_4d5c_90ad_fce3575bf82d(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.round(f) * Math.round(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_c3548cb1_41f7_47ed_97f1_8453cb1bc557(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_40c0a7bc_6198_4b7c_97be_7e6b7f47231c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_fd76a174_79b4_43a6_b573_f7bf4c150f60(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_e5b46b66_ea9c_40c6_870e_a8de3b938a45(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(i ->  Math.ceil(i * i)).sum();
    }

    
    public static int sumSquares_Problem_9_c97d1d99_8cd1_444d_876b_62770ceff179(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_9_5f6819e0_043f_4f0b_bb40_ba8d5694a92f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ffb18e80_f5d6_4f22_8a1c_fc8c3dacbe01(ArrayList<Float> lst) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        int sum = 0;
        for (Float i : lst) {
            ints.add(java.lang.Math.round(i));
        }
        for (Integer i : ints) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_3b2dca26_d577_42a6_88f5_3c5347dde25f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_5_c830edb2_0a38_4d39_9395_96bb547393a3(ArrayList<Float> lst) {
        // Your code here
        return lst.stream().mapToInteger(Float::floatToIntBits).reduce(0,(acc,x)->acc+Math.pow(x,2));
    }

    
    public static int sumSquares_Problem_3_2432aa8c_6ff1_4996_96a1_df4c2728b961(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_f6dea5ca_d0d9_4d95_be8d_a6b44291c893(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_70b8b6c7_33a5_4254_9bb1_37bdf092ac4f(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_86438689_9bac_4124_a914_2d6ad809278a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_1eb2a0bd_ddbe_45e0_9457_35e3619ad154(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_1c7cdf35_e517_40e0_af56_dac537c5f844(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_9aadcce6_7dc9_4819_a92a_95d790ee8c3d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.round(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_e732414c_af25_462d_bd16_c31d35f2ed90(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_09e68bda_d520_426c_9081_0098adc987c5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_8042f086_4379_4c41_bc0a_9294a670d082(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_93723ec6_f02f_4f38_bc81_5b71b5d78553(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.round(Math.pow(i, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_cd9e92f5_3e7e_4c07_87a5_443ed3dd59df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_43cc3933_5d84_4b1c_b302_f3627536d5bc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d837ed99_4f55_45b2_99c1_2520df8aa215(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_01bf75fe_7d08_4907_93bf_b6acfb0fe78e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_87c83a2c_08a5_488a_9c80_021a83186cfd(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_26747bfd_c746_4436_bcf7_e1b6fedd41ec(ArrayList<Float> lst) {
        if (lst.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (Float number : lst) {
            sum += Math.pow(Math.ceil(number), 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_3_c56e0dd4_9e7a_4080_9926_7d58e6e0d675(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_09ccf914_406d_4687_a2a1_3faa702cae5f(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_7_c6b17361_a10b_46a5_8cf0_9f5c963acbc0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_cac499b8_ff43_4660_9e9a_df0792d0b35f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_10_831ab11f_06d5_446f_82f4_9c148d8aef60(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_5f6819e0_043f_4f0b_bb40_ba8d5694a92f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_cd5522c9_6017_4ffc_92fa_7a1a02a487a1(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_0_9734e986_ccdc_45b8_8c12_2c8c0da3c2d8(ArrayList<Float> lst) {
        int sum = 0;
        for (float x : lst) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_e861fb03_6da6_450f_af1f_39d76cde7596(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_23ef379e_6dd4_4a73_a990_dab0e7d8b868(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_2e1ed616_b8bc_4e72_9c20_ce1632bbd2c6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_97494216_010e_49a3_93d7_e890e3706e82(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_c5547146_d289_4ee3_9ade_33cdd41663cc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_06a131b5_4919_478a_bad3_376e0c6b131d(ArrayList<Float> lst) {
        // Your code goes here
        int sum=0;
        for(Float num:lst){
            sum+=Math.pow(num,2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_5c11890c_c944_4663_9403_55c3cdcd9cfa(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(i * i)).sum();
    }

    
    public static int sumSquares_Problem_8_15d4a918_2a7a_4c94_89cf_04d62d6abd6f(ArrayList<Float> lst) {
        int res = 0;
        for (float f : lst) {
            res +=  Math.ceil(f) *  Math.ceil(f);
        }
        return res;
    }

    
    public static int sumSquares_Problem_10_bef273fa_41d1_4c8b_ae74_cbc768698a8e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_690fc036_18fa_4087_80c0_996a3b1c7ec2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_eafc4559_c5d8_4933_8c89_ae94570768a3(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_f2e56faa_11d1_45b4_b235_6ec8c4257d09(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_3dd3cb72_4709_4a2e_938a_3b2a219ef4bc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_9a8019c8_e06a_4e7f_b57d_587e654d0cd0(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_9734e986_ccdc_45b8_8c12_2c8c0da3c2d8(ArrayList<Float> lst) {
        int sum = 0;
        for (float x : lst) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5c7cb251_3e95_46fd_a755_38f7a1a00e07(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_7fd5d959_b83a_4da0_b52f_02588d28d5fd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_50c1ac5f_9a0f_456b_be0f_3a4c3057e69e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_10a08c2f_5750_4de5_988e_49f6d5caa3be(ArrayList<Float> lst) {
        return lst.stream().map(e -> Math.ceil(e)).map(e -> e * e).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_21ccc867_c702_47fd_842b_c86a4f92bf1d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b5cea375_e2b0_4fbe_9019_082aeddf62e9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_ce8cfeb1_c007_4735_b4f8_8254f568a82d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_14354db4_ffb4_46fd_b358_290d32ed9b2b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_0db728fd_d9e7_4cc4_a9b2_033a63d212aa(ArrayList<Float> lst) {
        int sum = 0;
        for(Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7270f350_bed1_44a4_b2cb_4f25eb536906(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_03a1faec_8fc5_48fd_8b29_7932a2cbc41d(ArrayList<Float> lst) {
        int total=0;
        for(Float f: lst)
            total+=Math.round(f)*Math.round(f);
        return total;
    }

    
    public static int sumSquares_Problem_0_2356e3fb_4260_4be0_a956_8efc78ac79df(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_2_bf44cfe3_0d11_426e_a42c_2cda116923d0(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(Float::intValue).map(i -> i * i).sum();
    }

    
    public static int sumSquares_Problem_0_2a1b3d4e_6e4d_418c_9202_90e749b2c44a(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_2f31433a_473a_4d6f_97d7_75da3d85e09c(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(f + f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_b099d439_f974_4e22_b990_0325f4958d41(ArrayList<Float> lst) {
        int result = 0;
        for (Float f : lst) {
            result += Math.round(Math.pow(Math.abs(f), 2));
        }
        return result;
    }

    
    public static int sumSquares_Problem_0_95f83726_a7cd_4647_b028_2f87edfeff58(ArrayList<Float> lst) {
        float sum = 0;
        for (Float num : lst) {
            sum += num * num;
        }
        return Math.round(sum * 100) / 100;
    }

    
    public static int sumSquares_Problem_6_5bb0d6b1_ccd3_416b_bc05_54236a894f8f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_4da0321f_0836_44c1_822a_5adebe3516a8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_05751400_21e0_408c_8956_1cc7c97434c3(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6b5ae535_6e10_4825_bc58_783e25f136fe(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7f0d7486_b66d_4899_ac71_d41add20f921(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_5_b6866946_ec76_4360_9a9b_e9f642889fe7(ArrayList<Float> lst) {
        int sum = 0;
        final int size = lst.size();
        for (int i = 0; i < size; i++) {
            sum += lst.get(i) * (lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_6bddb885_52d7_4b53_9603_1a831cbfd78e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_ec38e4e2_9a83_4dfc_ba41_e63212f48f41(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7c3f28e2_4d5a_429c_a6a1_eee7eca6cd0c(ArrayList<Float> lst) {
        // your code here
        Integer sum = 0;
        for (Float n : lst) {
            sum += Math.round(Math.pow(n, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_5c0b3832_87d8_4724_8fbf_f06814e962d0(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += (f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_78bae5a2_6e79_4c3a_aec3_03291e57c27b(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_48ee58f7_1698_4d51_af0c_5970fab6fc57(ArrayList<Float> lst) {

        return lst.stream().map(i -> Math.round(Math.pow(i, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_15d4a918_2a7a_4c94_89cf_04d62d6abd6f(ArrayList<Float> lst) {
        int res = 0;
        for (float f : lst) {
            res +=  Math.ceil(f) *  Math.ceil(f);
        }
        return res;
    }

    
    public static int sumSquares_Problem_11_1e1718ea_37d8_47a1_b11c_8ea84b0b0346(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0ffbc3da_433a_403a_8f16_0fb9e62381d7(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_11_f865dcd6_06a3_4a8c_9f4f_472e525f38db(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_1_1b67c314_3e50_4709_a5eb_da29a4817c6f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_10_33efa7af_ab94_48e4_a063_11e5310fd875(ArrayList<Float> lst) {
        return lst.stream()
            .mapToInt(x -> Math.round(x*x))
            .sum();
    }

    
    public static int sumSquares_Problem_1_91993075_453f_4463_b0fc_8180a652beb4(ArrayList<Float> lst) {
        int total = 0;
        for(Float f : lst) {
            total = total+Math.round(f*f);
        }
        return total;
    }

    
    public static int sumSquares_Problem_3_b54710c1_76ef_4d19_830a_5befa605d832(ArrayList<Float> lst) {
        int sum = 0;
        Iterator<Float> itr = lst.iterator();
        while (itr.hasNext()) {
            float f = itr.next();
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f31b24bd_e43a_47a2_b7be_ef10bd076c50(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_b8da4456_e487_435e_b85e_9e78b4901b56(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst)
            sum += Math.pow(Math.ceil(Math.ceil(f)), 2);
        return sum;
    }

    
    public static int sumSquares_Problem_8_840516a3_645f_49b2_bb86_4c0181b37082(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(a -> Math.round(a)*Math.round(a)).sum();
    }

    
    public static int sumSquares_Problem_1_b249111b_6ca7_440b_a74c_125f490ce834(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.round(f) * Math.round(f)).sum();
    }

    
    public static int sumSquares_Problem_6_4ed9d4d8_0730_41b1_a6b1_ced7a915d526(ArrayList<Float> lst) {
        return  lst.stream().map(n ->  Math.ceil(n) *  Math.ceil(n)).mapToDouble(n -> n).sum();
    }

    
    public static int sumSquares_Problem_8_3c19aa28_7c33_4a2e_bc18_1d55af3f624f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_4_689fdae6_a84a_4622_b327_20cb0e0b10bd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_4_30a0f78d_7fa4_4d92_ba30_9c4be2178b43(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_7e2bc535_516b_4481_9828_c7b92d31beb6(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_9104de3c_e820_4948_a6dc_8f0ba88a51b9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_c97b8a75_4698_4fbe_927d_932a0ba48110(ArrayList<Float> lst) {
        int ret = 0;
        for (Float x : lst) {
            ret +=  Math.ceil(x) *  Math.ceil(x);
        }
        return ret;
    }

    
    public static int sumSquares_Problem_5_e9ed8cb9_a45c_4415_b7a9_5e7495e67b2c(ArrayList<Float> lst) {
        // write code here
        return 0;
    }

    
    public static int sumSquares_Problem_1_65d8b054_8f2c_4ee7_a47c_0c9dbda5ba0d(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_7_32ea9982_292e_415a_b3bb_c792f0758ac9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_b6401ed5_745a_45ef_aef7_df5a57c540aa(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_c74b0d6b_ad78_4c08_b8d7_a01793e11ce1(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_23689f68_738c_46af_b3e6_14847120dcfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_e9d8136b_6925_4663_ac5d_8c3361c8d598(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_574a67c1_4ee6_42ae_abe0_43dd16a0c8ff(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_fb185e8b_cede_4307_96e2_94b38cc34ff2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_9e3234bb_95ca_4a31_81a6_b348b6d72dd9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a28e45f7_bb72_45b5_a327_709012322d4f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_c92e445b_b007_4669_8cab_f163a65ac07f(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_c7d09d7e_1472_4a6b_a420_06c4895c2a62(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_75c7e83e_af8e_4eb1_8c9b_a6ecd7b4e671(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> (x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_fff4e117_67cb_4b99_9cd4_80cb445f367b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_54d0945d_e7c4_4391_98b4_cba796ebcfa7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_8_18a072e9_7fbe_4941_9877_977f7135e267(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_5533496f_c321_4f2e_9583_1d7adaf0b9a9(ArrayList<Float> lst) {

        int sum = 0;
        for(float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c830edb2_0a38_4d39_9395_96bb547393a3(ArrayList<Float> lst) {
        // Your code here
        return lst.stream().mapToInteger(Float::floatToIntBits).reduce(0,(acc,x)->acc+Math.pow(x,2));
    }

    
    public static int sumSquares_Problem_1_39454f2a_3cec_4984_81c7_1e3a704fde11(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.ceil(e)*Math.ceil(e)).sum();
    }

    
    public static int sumSquares_Problem_0_af365e8b_3f90_45c5_a2ef_54d99114082d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f063c2e4_e46f_4c0c_99e7_e6d0dbf4c6c4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_5ef01c31_3c01_4d4a_b81c_78b29227e730(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_5fb6e6d8_185b_4d3c_966e_efc2371afe6b(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_6b997be2_e89c_49a9_b62c_edffccd33cc2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_fe14f8ca_1acd_43a9_abd3_abf181642c27(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_55ce4c58_a5a5_404b_ab01_248f73cc66e6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_85d563c4_0fe7_4843_afd3_fe1e15f1302d(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a3875e22_c5b2_4377_8dbd_7056b1bfe364(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_e5f380d1_3108_46ac_800a_0c2e9b414910(ArrayList<Float> lst) {
        int sumSquares_Problem_6_e5f380d1_3108_46ac_800a_0c2e9b414910 = 0;
        for (float val : lst) {
            sumSquares_Problem_6_e5f380d1_3108_46ac_800a_0c2e9b414910 += Math.round(Math.pow(val, 2));
        }
        return sumSquares_Problem_6_e5f380d1_3108_46ac_800a_0c2e9b414910;
    }

    
    public static int sumSquares_Problem_5_ae7583d6_5f73_4aa0_9f6d_4db599e2dc96(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_8_6a6a825c_f41d_4bd7_96ff_f73b356e8340(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_15d4a918_2a7a_4c94_89cf_04d62d6abd6f(ArrayList<Float> lst) {
        int res = 0;
        for (float f : lst) {
            res +=  Math.ceil(f) *  Math.ceil(f);
        }
        return res;
    }

    
    public static int sumSquares_Problem_11_3d2bafe5_271b_4100_a64d_cf938d639753(ArrayList<Float> lst) {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    
    public static int sumSquares_Problem_1_11b442a9_8e28_4830_aa53_d93a8fa55c5c(ArrayList<Float> lst) {
        throw new RuntimeException("Please implment me.");
    }

    
    public static int sumSquares_Problem_0_cbf2c976_76e2_4603_82e7_fbd23c5acdf3(ArrayList<Float> lst) {
        return lst.stream().map(n -> Math.ceil(n)).map(n -> n * n).reduce(0, (sum, n) -> sum + n);
    }

    
    public static int sumSquares_Problem_9_492f2528_190f_4d0d_863d_7a9988c9d660(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_0057a028_6a45_4664_9b71_80f01a307af2(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_2c13ef0a_061d_47d5_8e1c_cf29dd1313f0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e36b27a6_eb91_4921_8b52_276ec8335036(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_6132a0f2_b5c0_4ce4_8e20_d793e015ed67(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_eca3d133_816c_410e_852f_20675091b1cc(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_c6ee1980_6aff_4949_9b0f_bb27df0efe74(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_6e0d6c7f_0f61_44dc_b49b_c6517060bc06(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_2_5fe34de7_11c0_45d1_a489_b758a74fdc4d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_b6d52cae_5c95_402a_b2e1_59f9eae1eb79(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6f17f506_1b6b_4821_83f3_e047c83e49a0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_620ba87e_e60c_45a3_8928_cdfe17c6164b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.ceil(Math.sqrt(f));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_63d22b94_7fa7_4113_9ad9_18f4aeb316eb(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_d5d83d4e_650f_4a9a_a843_230511bbc3d8(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_3a34059a_b1b9_4b48_aae9_e5416e66521f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_91a41668_3e78_4d51_8db2_db00dbb7c924(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_9_12dd13a3_11d5_4ab8_9af4_3f6f1e804590(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_b2845bf7_abc0_4c6c_81a8_0163741bc3a1(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_604c41dc_462c_48df_a33f_1832a118942f(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x))
            .map(x -> x*x)
            .reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_1c7cdf35_e517_40e0_af56_dac537c5f844(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_e9ed8cb9_a45c_4415_b7a9_5e7495e67b2c(ArrayList<Float> lst) {
        // write code here
        return 0;
    }

    
    public static int sumSquares_Problem_11_150bed98_bd85_47f1_b4fd_0315a1757d0e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_e9d7b04a_6fc7_488e_9f6d_a51123a20001(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.round(e)*Math.round(e)).sum();
    }

    
    public static int sumSquares_Problem_11_bc8340bd_6330_4fe5_b72a_627904b83754(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x)).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_0_537e2eb4_4599_4fd8_b3f7_14b1c6c59d84(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_a48d6ae8_963f_4264_a14d_7a86c310f3b5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_2c5206f3_db77_4f43_b1e7_2f5844729ce7(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_2f57832c_a604_4bd6_891d_b91cf71272ec(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_ca1163d1_76c9_4e2c_a2e4_f5b053453512(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_49a6961c_df85_48d8_81a4_4257fb9eeb4a(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.pow(Math.ceil(x), 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_c56e0dd4_9e7a_4080_9926_7d58e6e0d675(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c7d09d7e_1472_4a6b_a420_06c4895c2a62(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a5b8de86_2146_42df_bdf0_1761ba069939(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_c1b3166e_d460_467a_8fa6_7b269bde8c11(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_9da222ce_222c_4e14_8ecb_d427c8833f13(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_f1aa4e84_36a4_4e65_963e_2856233a7469(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_49f6d021_bee7_427f_b14f_24bf154b4c1a(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_bdf698bf_d7ad_44e7_8b49_cada816a36e9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6e200417_36e7_4f7f_8bd5_2c26f6fc4fba(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_a6f531ef_4aad_458c_a3f6_f573561f971d(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(l -> Math.ceil(l) * Math.ceil(l)).sum();
    }

    
    public static int sumSquares_Problem_0_486baaee_7c18_4da0_b569_03cfb828efa4(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5599393e_a748_4f1a_acbf_aace29462f19(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.round(x)).mapToInt(x -> x).sum();
    }

    
    public static int sumSquares_Problem_7_db8649e8_8aae_4ca0_a91d_d92da02b99b7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_8fc7c0b6_3b21_4957_b3e5_7081bce5312f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_f865dcd6_06a3_4a8c_9f4f_472e525f38db(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_3_a9d3b9a5_b74c_4682_9e8a_10ffdd50a010(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a5b8de86_2146_42df_bdf0_1761ba069939(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_83b1185a_cb55_4827_b7e1_8e1075cc9143(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_15d6a19d_8535_4c6d_ba44_8a56fca09db1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_11_002b69ae_8db5_4e01_b8cb_78d27cae967d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_12dd13a3_11d5_4ab8_9af4_3f6f1e804590(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_9a847e51_6ef0_4192_980e_b4288452410f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_c3548cb1_41f7_47ed_97f1_8453cb1bc557(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_ad39027b_8786_467f_8b2a_aec3dd628496(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_3_86094cfe_b01e_496f_b87d_4d4a37bddb62(ArrayList<Float> lst) {
        // >>>>> YOUR CODE GOES HERE <<<<<
        return 0;
    }

    
    public static int sumSquares_Problem_10_9da222ce_222c_4e14_8ecb_d427c8833f13(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_021b01e4_1f64_42ad_bace_642b8c1fc194(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_962a9151_fc33_4601_8ad3_781f38738f29(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.round(num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_2273828b_3196_47f6_aaaa_07f06c61de1b(ArrayList<Float> lst) {
        int sum = 0;
        int n = lst.size();
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        
        return sum;
    }

    
    public static int sumSquares_Problem_11_107d986b_6ac6_47ac_a219_13778f8f6607(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5e51bdff_b46b_41a2_9efc_13c2f3f246b2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_6255bef0_230f_44ad_853e_63537c430c81(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_fabc6c65_891c_4cb5_b190_ff064d59b3a9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(Math.ceil(num), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_14354db4_ffb4_46fd_b358_290d32ed9b2b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_7b248b4c_1baf_4234_a80e_49ea971d19e7(ArrayList<Float> lst) {
        int sum = 0;
        for(float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_fb3725a9_28fc_4509_8899_1729296ab9e9(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_31b8287d_e462_48a8_8718_d3ba48e3a06d(ArrayList<Float> lst) {
        int sum = 0;
        for(float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_bec18f64_34d2_4388_9068_faea1138e7ad(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_f7947c9a_ed62_4c78_9151_8df198451b75(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b099d439_f974_4e22_b990_0325f4958d41(ArrayList<Float> lst) {
        int result = 0;
        for (Float f : lst) {
            result += Math.round(Math.pow(Math.abs(f), 2));
        }
        return result;
    }

    
    public static int sumSquares_Problem_5_b24df979_85c0_4abd_8087_b79cbb83d66c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_7fb696fc_a96e_4fce_9ad5_bdbed133436a(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_ffe4ba21_bf8c_40c9_8ab7_363233dda048(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_3_c183396b_7d0e_4665_98d3_4f433dd1b27c(ArrayList<Float> lst) {
        if(lst.size() <= 0) throw new IllegalArgumentException();
        int ret = 0;
        for(Float f : lst) ret += Math.pow(f.intValue(), 2);
        return ret;
    }

    
    public static int sumSquares_Problem_0_037191ec_c9b4_4b6f_b411_8ec435b0f723(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d4e119df_1629_4490_b01d_6986b82fdb19(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_c2df315e_052c_428f_8eb4_38c38f532f4e(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_238daf65_4ff1_445b_9e8a_e32b9dbbff0d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7b248b4c_1baf_4234_a80e_49ea971d19e7(ArrayList<Float> lst) {
        int sum = 0;
        for(float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_0e73aa05_611b_4d9f_8a14_6f338eacb4ea(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ce8cfeb1_c007_4735_b4f8_8254f568a82d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_027fe2ca_22ff_4cd0_8d9a_9ef4bc27c5bf(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_66b1b21a_59ba_4257_ab42_44bff34c401e(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)*Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_463e4bef_3005_4830_a4a9_423110abead0(ArrayList<Float> lst) {
        if (lst.isEmpty()) return 0;
        int sum = 0;
        for(float n: lst) {
            sum += Math.pow(Math.ceil(Math.sqrt(n)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_e80468c7_b0e7_4ed3_a0b7_18e118b57751(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_206ace29_2441_454a_a2d2_e5fe6ae29d49(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_50dc9be7_ed9e_4223_afff_5565a719018e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_f835410c_300e_46f8_9b7d_9fd24959e1bf(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_46d88d1a_47d1_45d6_8657_0f70f388c306(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_3_f8b65a65_ea9a_45f5_a9cc_e1b4a10363ac(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_3a1a2812_9b90_4837_9eb6_b105064306f4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_465abda9_7b5b_4055_9e63_487f8b59ecc8(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_8edb31c7_3290_4f04_b7c3_38c8d74e9a91(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_197e1b9b_b337_4d89_b5bb_756cf0b8e520(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d71473ca_cd01_4627_a5d7_ba8baf17ead5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_83eb24f2_ca2d_4931_b96b_ca84c50bfb40(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_736b4932_e541_46ef_8ce7_bcd47faadbb3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_04ff5600_1772_47b5_b158_b209743a4134(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_59760738_6214_4277_974f_f7041b33084c(ArrayList<Float> lst) {
        return lst.stream().map(i ->  Math.ceil(i * i)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_72b6287e_fa0a_4fc9_b349_2743b81073bc(ArrayList<Float> lst) {
        // Implement your code here
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_ad05e38e_8a00_48a2_b65a_1006e25dd285(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f66ab50e_9ffe_40e2_b71c_5130e4b012f5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_b24df979_85c0_4abd_8087_b79cbb83d66c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_f2c797d0_1751_4862_b779_f43227fa7bce(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_cd129120_9368_4d3c_9d3c_bbc43c48eff1(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_900cd3b6_b580_49e4_96e5_3f1ce57adfba(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_d1e389bd_ac13_45bf_a768_3678f0ffea38(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_e5ccdcb8_dd9c_454d_bcee_6c57c4de8016(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += num.floatValue() * num.floatValue();
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2acb3726_4e34_4eaf_9ed5_1e26c8e60738(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d5c5581b_97e1_46e3_b7ac_2ad6cdf7c6e2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_531bb894_884c_4faa_8a38_5bfcc3c2ed1e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_7569e65a_3782_407f_8ff9_2482a1eb9406(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9a7e122f_76fe_446b_9b5d_76e38fad0605(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_2dc61206_4a11_4bad_a762_ef8241b8fa0e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2faba6c4_06f0_4653_afbf_c066cca2494e(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_5f78964c_4805_418a_aaa4_8bc86c821aa9(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_c6bde5de_d065_4ddd_8a65_946b8a2654fc(ArrayList<Float> lst) {
        // Your code goes here!
        //return null;
        int ret = 0;
        for (int i = 0; i < lst.size(); i++) {
            ret += Math.round(Math.pow(lst.get(i), 2));
        }
        return ret;
    }

    
    public static int sumSquares_Problem_2_684940e0_3d63_484a_9f04_48405d8a2743(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_4_e1f81dd6_f590_4bbb_8f4d_35c3e66b013a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_68d36df8_8f29_4c20_ba2f_edf27af43365(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_49283e25_e195_4059_b40c_ddb7b3c06282(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_832b38dc_5ea1_407d_90ec_c680d12d54b3(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_5f8c6091_635a_41a0_a440_f9d5f4a84658(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_243b99fb_4667_4ef0_a70a_49b2c5ae186d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_0ea1cd0c_9ed8_49f7_8ff2_5f6f6de3109c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_800ae58a_56ab_4052_94b1_0242a4dc3deb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a9d3b9a5_b74c_4682_9e8a_10ffdd50a010(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_d4e119df_1629_4490_b01d_6986b82fdb19(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_7b57791a_c94f_407d_9b03_8c9cc4fe2bcd(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_0_97fa4151_3b4e_453e_890b_bc83c9a243aa(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_a9b79e73_d9b6_4786_bcbf_d0c70dcdd335(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_ca1163d1_76c9_4e2c_a2e4_f5b053453512(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_e5f380d1_3108_46ac_800a_0c2e9b414910(ArrayList<Float> lst) {
        int sumSquares_Problem_1_e5f380d1_3108_46ac_800a_0c2e9b414910 = 0;
        for (float val : lst) {
            sumSquares_Problem_1_e5f380d1_3108_46ac_800a_0c2e9b414910 += Math.round(Math.pow(val, 2));
        }
        return sumSquares_Problem_1_e5f380d1_3108_46ac_800a_0c2e9b414910;
    }

    
    public static int sumSquares_Problem_1_9222f9b6_cbe2_407a_a045_e6e367e7fabb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ae05289c_f2cb_4314_a896_c72430d30bfe(ArrayList<Float> lst) {
        // Your code here
        return  lst.stream().mapToDouble(Double::valueOf).map(x -> Math.ceil(x)).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_0_c89db24c_c046_4aa1_9e71_2ca1d6478292(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_0b179909_c4d3_406a_a14e_189ef2762174(ArrayList<Float> lst) {
        int sum = 0;
        for (float f: lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_50dc9be7_ed9e_4223_afff_5565a719018e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_ec2bf59e_640b_4bd2_9185_7cdcf8ec7df4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_7_c4cc872b_f732_49e8_91f4_cc0782e45bfa(ArrayList<Float> lst) {
        return  lst.stream().mapToDouble(x -> x * x).map(x -> Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_7_2fee37fb_3439_4d60_aa1c_5e911402b7e4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_8_f1971c3d_9ad0_4d93_9a0e_2013ba3215c7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_a7ce250b_e576_4e1d_ba88_64f88facdc03(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3312c54f_5590_4ca1_b1f9_60fa44c15168(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_094bdfe2_2ee3_4c31_ae3c_a943623a655d(ArrayList<Float> lst) {

        int sum = 0;
        for(float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_aee7cd19_e181_4f9d_80fc_bccb10331f3c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_1b75a7f3_e253_48d0_b830_0f3f855e06ef(ArrayList<Float> lst) {
        int len = lst.size();
        // Note that you need to convert from float to int using "intValue()"
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] =  Math.ceil(lst.get(i));
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i] * arr[i];
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_4afbe2d3_4112_43c4_8ba8_aa0850651d34(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_4_35323827_593e_45d3_bd69_4f5d0a4a673f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_a904ad88_a57c_4cff_9aea_d4c54120fdea(ArrayList<Float> lst) {
        // we sum the squared numbers of each element of the list.
        // we should round it to the upper integer first,
        // we will use the method Math.ceil() to get the next integer
        // from the element.
        // e.g. Math.ceil(1.4) => 2.0
        //      Math.ceil(4.2) => 5.0
        //      Math.ceil(0.0) => 1.0
        //      Math.ceil(-2.4) => -2.0
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_d71e6c6b_5450_40aa_9cd0_5fe9c01a7cda(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c4c72ab0_8b1f_4291_9206_b710984dde0b(ArrayList<Float> lst) {
        // your code here:
        return 0;
    }

    
    public static int sumSquares_Problem_9_449e9b26_8f52_4b29_b796_8819d9ad02c6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c2581e90_08ea_4f4b_8b8c_e72353bb45c8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_57e20a47_d1d9_4bd0_85c0_c5df3dc42847(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_b6866946_ec76_4360_9a9b_e9f642889fe7(ArrayList<Float> lst) {
        int sum = 0;
        final int size = lst.size();
        for (int i = 0; i < size; i++) {
            sum += lst.get(i) * (lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_b8fd505a_1817_440a_a3a7_f8bdbfd0f56e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_0218508f_19cf_457b_a562_17f36dc247ce(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_73be0d1a_f000_4f74_8d95_710c963bcb05(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_3f3f79fc_caa6_4da5_83ce_f3afd6b5b719(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_6fee58ce_c570_4741_943d_9e3ad0100116(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_77022cf3_f4e2_465b_b001_6eafcd141e35(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_46d91777_354d_4925_9c7f_16044d406f1c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_75c7b4d4_726b_449c_91ca_7cfba4ea6bb6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_f80c15a9_8bf1_4ea7_81da_ece3ecc6216b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_f9afcebe_c905_4f74_b67b_f1260eee512f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e5e69393_422c_4d7a_83ea_ada36a320d64(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_12106047_99f0_458e_8274_8d3c12e256a1(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c719d423_6c14_46a2_b3c2_f961a6bc9bb0(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_067fff98_fbfb_44b4_b33b_9341b88bfa1b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_01bf75fe_7d08_4907_93bf_b6acfb0fe78e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_0bc73f44_d96e_4d70_97b1_098036b2d7c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_38717cc2_5d98_46e9_bb27_d406d8191756(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i : lst) {
            sum += Math.ceil(i);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_0_72741282_3ca2_47d1_9dcb_3b170b645051(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_34c11229_0096_4a2d_b800_8ca377343ac7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7b65ae8d_b40d_405e_b49a_45c8ec479097(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_700935e8_eea6_4955_9061_5cafbb91f436(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_044ee05b_62c2_4e6e_8e1a_925c912d3705(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_6_23689f68_738c_46af_b3e6_14847120dcfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_346d275f_328f_4ef3_a050_abc8741a4a88(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_49f6d021_bee7_427f_b14f_24bf154b4c1a(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_f3d7612c_5747_455b_8a94_57321b96f71e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_3fb65c0e_99bf_43b5_afb3_603ef669d54b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7a2f3ccf_1ef5_4136_9fc5_d227c0d837fe(ArrayList<Float> lst) {

        // BEGIN SOLUTION
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
        // END SOLUTION
    }

    
    public static int sumSquares_Problem_1_ac85a777_cd41_4948_ab0d_5a4d5d308d05(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_6b5ae535_6e10_4825_bc58_783e25f136fe(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_0d89d1fd_9778_4a64_b3b8_98e9cc9a241c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0b473ed0_f3c8_40c8_ac2b_e368d9c094ca(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ec608f18_b773_49ed_a3a4_bde5490b331d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_178e7b09_8da9_4efd_9396_c96c04036c76(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_14bbe3e5_2b5f_4f18_8258_f755748efa1d(ArrayList<Float> lst) {
        return lst.stream().map(v -> Math.ceil(v)).map(v -> v * v).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_d272dc48_035c_4a93_b2c3_aad711b60309(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_154679f7_e430_427a_9a97_8d2c168df061(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_531bb894_884c_4faa_8a38_5bfcc3c2ed1e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_aa336e1e_42ca_44b4_b483_552c52e7b10c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_35323827_593e_45d3_bd69_4f5d0a4a673f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_274df3fb_ee77_4c65_a875_4c02324c90f9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_65845ca4_6afd_4ab2_b66d_e7924d41947f(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_b6866946_ec76_4360_9a9b_e9f642889fe7(ArrayList<Float> lst) {
        int sum = 0;
        final int size = lst.size();
        for (int i = 0; i < size; i++) {
            sum += lst.get(i) * (lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_0e945764_11f5_41fc_aaa5_159646ee0b00(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_75408399_28cd_49be_9d92_42f5501b3d32(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_5_62716388_d983_4bac_9726_b5082d3417e9(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_3_1e87db70_a2f4_4b5b_8a89_69b08fb57f14(ArrayList<Float> lst) {
        //throw new java.lang.UnsupportedOperationException("Please implement the sumSquares_Problem_3_1e87db70_a2f4_4b5b_8a89_69b08fb57f14 function");
        int sum=0;
        for(int i=0;i<lst.size();i++){
            sum+=Math.ceil(lst.get(i))*Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7b830cf3_979c_4cce_8c8c_9be28ec90518(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_6_5883a5af_40d2_461e_aa19_d57d5b5ee0b5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ee5efe13_eca0_4b05_8aec_b00f5b1ba71c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_dd501a8e_1599_458b_9e4d_d688dcc69596(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_d17bdc7b_b41d_4d7b_b4cc_ac85b61a3653(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_c6ee1980_6aff_4949_9b0f_bb27df0efe74(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_49a6961c_df85_48d8_81a4_4257fb9eeb4a(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.pow(Math.ceil(x), 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_e9d888ce_b862_40da_b492_fe3f39c14d76(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_c2581e90_08ea_4f4b_8b8c_e72353bb45c8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_c48e8c23_9894_4174_b27a_ca651fab8ee6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_fa382cc8_67f8_414e_ab97_5b0b7757c5f3(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_0b473ed0_f3c8_40c8_ac2b_e368d9c094ca(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f6ecce15_1e90_4040_9f6c_20f0959fccb2(ArrayList<Float> lst) {
        if (lst.size() == 0) {
            return 0;
        }
        return lst.stream().mapToInt(f -> Math.ceil(f)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_a58ad4fc_f71c_4841_bffc_334240d176de(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_84128fb5_ea71_465c_a83b_d1cd56907d8b(ArrayList<Float> lst) {
        return lst.stream().map(p -> Math.round(p)).map(p -> p * p).mapToInteger(p -> p).sum();
    }

    
    public static int sumSquares_Problem_3_d2ecf99b_43cb_48ee_ae2a_cbc8e4e5e88a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += (Math.ceil(f * f));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ab0fd528_b912_492a_927e_4d4d2d06e4d4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a,b) -> a+b);
    }

    
    public static int sumSquares_Problem_8_18bf2ac8_12d8_4fe4_b81c_29e624ae5a16(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(Math.pow(lst.get(i), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_bcf1e88a_ebf2_4404_8bf6_f7bfe2d7d28a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_665bbb56_5043_4bad_bd96_91abbd0808d9(ArrayList<Float> lst) {
        if (lst.size() == 0)
            return 0;
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(Math.round(x), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_0ba34461_095a_44d3_b14a_29c298b19ed9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_28e55510_25ed_40e3_8940_b76b1ac4c391(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_b7906759_790d_4389_a55e_3bdc8a359dbc(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_f8b65a65_ea9a_45f5_a9cc_e1b4a10363ac(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_3b800255_af96_4564_9d80_b3107e71b1f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_554a1f13_74b4_41b6_a41f_9523e681ca61(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_8_73c2aa02_59ca_49b0_b79e_768f7e4cbcf5(ArrayList<Float> lst) {

        return lst.stream().map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_0e513d1d_f48d_4c62_aaab_a7b283ef7f0b(ArrayList<Float> lst) {
        int total = 0;
        for (Float i : lst) {
            total += Math.round(i * i);
        }
        return total;
    }

    
    public static int sumSquares_Problem_7_cbf65fad_142c_4957_a6f5_6dcddd05214d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_864be009_a4a6_4f1c_ba58_3cc8cfc8313c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_f1f033c5_643a_4c21_a0bd_40ca2086a4ca(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_2f1676d2_7ed2_460a_b8e2_696dac88c61a(ArrayList<Float> lst) {

        return lst.stream().mapToInt(x -> Math.ceil(x)).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_5_20e70573_306a_496c_90d5_cd4e02f92a7f(ArrayList<Float> lst) {
        //for(float i : lst) System.out.println(Math.ceil(i));
        BigInteger r = BigInteger.ZERO;
        for(float i : lst) r = r.add(BigInteger.valueOf(Math.ceil(i)).pow(2));
        return r.intValue();
    }

    
    public static int sumSquares_Problem_8_4ae5a536_fe62_4482_8ccb_7814a5bc8d66(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_91a41668_3e78_4d51_8db2_db00dbb7c924(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_1_48ee58f7_1698_4d51_af0c_5970fab6fc57(ArrayList<Float> lst) {

        return lst.stream().map(i -> Math.round(Math.pow(i, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_0eefc1e8_2997_47e4_8e33_b09312bf815b(ArrayList<Float> lst) {
        int sum = 0;
        for(float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_f3ac1bed_b81a_4d73_b60d_a2228b10c5a8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_eb86a097_c767_44bf_abd2_88dff209f3e7(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_97a98e8e_40b1_4e85_8430_bedf87fcdf56(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d1935c03_7422_4e21_ba94_ce516831c031(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> x * x).map(x -> Math.round(x)).map(x -> x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_fb3725a9_28fc_4509_8899_1729296ab9e9(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_11_2f57832c_a604_4bd6_891d_b91cf71272ec(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_fd5cc068_a2bd_4c48_8eaa_a056fdfdf487(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_baeef46a_ff08_453b_bfc9_ad5b91390ad1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_5a77b304_65da_4b8c_8c29_0d0842827363(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_554a1f13_74b4_41b6_a41f_9523e681ca61(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_11_0e4e56bc_0ec5_4f68_90da_2b6cb19f83d4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_5af24a4e_0f56_4e82_848c_7436e0804743(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_3e87da8c_77fe_450c_a496_7aac4114f18a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2ea35368_e7bb_4e26_8db9_504727ea6c04(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_3_9fba7407_5cf7_42f9_b144_bdf39ae459aa(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c74b0d6b_ad78_4c08_b8d7_a01793e11ce1(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_95145a2d_b95f_4027_8ab5_a20c6f9bdfc3(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_5_fe1f8fad_5036_46b9_8175_101bf28ec798(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_83110c24_39ca_491c_bb9d_8e90aa3b2eaf(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_5_e8dd1bb8_48ed_4384_9ff0_9063bb3810a8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_db8649e8_8aae_4ca0_a91d_d92da02b99b7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_d1fb05a0_c691_4a7b_95d6_c0e59a573950(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_62d65955_173e_4919_ba3c_4dbda885a00d(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_a43b58b9_3337_4101_a0c4_5b8527cee2a9(ArrayList<Float> lst) {
        ArrayList<Float> result = new ArrayList<Float>();
        for (Float el : lst) {
            result.add(Math.ceil(el));
        }
        // System.out.println(result);
        int total = 0;
        for (Float el : result) {
            total += el * el;
        }
        return total;
    }

    
    public static int sumSquares_Problem_0_aacd03ba_c9c9_4fab_b50c_00187e00e788(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_967b9836_af67_4f46_addd_4d299715cb5c(ArrayList<Float> lst) {
        // Return the sum of squared numbers in the given array list.
        int sum = 0;
        for (Float n : lst) {
            sum += n * n;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f226b555_66c4_44b9_989a_0e71fdf52b7f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_aacd03ba_c9c9_4fab_b50c_00187e00e788(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_147f6fd8_debb_489a_b3d6_604deefd10c6(ArrayList<Float> lst) {
        int res = 0;
        for (float n : lst) {
            res += Math.pow(Math.ceil(n), 2);
        }
        return res;
    }

    
    public static int sumSquares_Problem_6_89e4aada_8a59_4f4e_94ce_6ec30cbcd7c6(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.ceil(e) * Math.ceil(e)).sum();
    }

    
    public static int sumSquares_Problem_7_23f9444f_4283_48d0_85e3_61a5f334b3a5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_bef8c4f4_9604_4163_b76c_8640be8963a6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_53c5c9ec_92a0_437f_987a_3ebb8bf4d9f6(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_d038f55f_b89d_4f7e_bd27_853a0f27e35b(ArrayList<Float> lst) {
        int sum = 0;
        for (float i : lst) {
            sum += Math.round(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_19b71e74_61bf_4b9e_b239_ca927e622400(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_c0b41c5b_e5b4_4251_9edb_6fb153f11980(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_479baba7_7d12_4080_aa3e_d2728f75e07d(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_341e1ced_1544_45c2_a5d5_217da4abfd84(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_5_df798504_42d3_4509_a5dc_6491a1cc8d60(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_15d6a19d_8535_4c6d_ba44_8a56fca09db1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_6b0497de_a65f_42cc_95ad_7992dc0bad70(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x ->  Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_f31d59a7_6850_44b3_90a2_4bf60e7a3fba(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_b43244ff_91fb_437a_a986_3f20e99bc4d2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_11_61b568a0_30ec_4ad2_9868_e3397841fa69(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_26c6029a_03f4_4b3c_8061_cb4b9a70349a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e5b4d879_9d84_4569_bed1_4d83070d9711(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_ac85a777_cd41_4948_ab0d_5a4d5d308d05(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_093c935d_5546_4900_b9d1_cce251056b92(ArrayList<Float> lst) {
        return lst.stream().map(i -> i.intValue()).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_12122c76_070f_429b_a50c_47c247e605e1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_b0aa93cf_d52b_4b8e_baf1_4c5e46c4eef6(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ed838647_c26f_4b2e_98ae_06f9e4c87fac(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_9_e4bd1b65_da49_45a4_9a55_85133ef60fb4(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_f7947c9a_ed62_4c78_9151_8df198451b75(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_cdf42630_c01d_488a_b2a9_dd18789aefc7(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_94b52245_c0f7_4551_91cb_79c65748036f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_0bc73f44_d96e_4d70_97b1_098036b2d7c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_50962751_f42e_4df9_8022_2fbc31edd89a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_86e2c31c_dfc9_41e4_aa6c_88c1e6b6190a(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_ec39d14d_9706_42e5_b1ac_db1afc521614(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_22f77089_df04_4167_a2a1_c491c0152c5c(ArrayList<Float> lst) {
        double sum = 0.0;
        for(Float x : lst) {
            sum += Math.pow(x, 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_2_bfd89c61_dfa0_4a73_82ca_c4b10db5b0f9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_f2e56faa_11d1_45b4_b235_6ec8c4257d09(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_51fffdc3_93d2_4faa_9608_a5facb55a370(ArrayList<Float> lst) {
        int sum = 0;
        for (float elem : lst) {
            sum += Math.round(elem) * Math.round(elem);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_d7815b71_d95f_4a44_9ef6_68edb3951df3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0d762d3d_568a_4a86_942b_0c849ae0b5c4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(i -> Math.round(i*i)).sum();
    }

    
    public static int sumSquares_Problem_11_a44c5817_1196_41b1_9042_6feaf2742024(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_7a4957e9_57f3_4090_a33b_173db65e3232(ArrayList<Float> lst) {
        int r = 0;
        for (Float f : lst) {
            r += Math.round(f) * Math.round(f);
        }
        return r;
    }

    
    public static int sumSquares_Problem_1_e8096a9e_00a0_45c0_886a_a42efd4ce986(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_95f83726_a7cd_4647_b028_2f87edfeff58(ArrayList<Float> lst) {
        float sum = 0;
        for (Float num : lst) {
            sum += num * num;
        }
        return Math.round(sum * 100) / 100;
    }

    
    public static int sumSquares_Problem_9_aaa3f60a_4395_4c91_881b_aac2567ff06c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_0_f6346cad_c6a3_43f3_95fa_222809ee78ab(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_5_920afa69_c306_4a1d_9c98_55816082cb23(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_16f59885_a17a_41fa_bce3_258344742fc8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ff4eb359_02ed_4498_9b23_b61b9e93f91b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_55ce4c58_a5a5_404b_ab01_248f73cc66e6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_f5216e16_ea76_4e4e_ac57_2624f891fb8f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(x.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_81f9182d_ca88_4499_b449_dff1d0bee408(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_1fae8590_414a_4ba4_a466_90ccdc438e29(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_30a0f78d_7fa4_4d92_ba30_9c4be2178b43(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_54ddaf86_232f_47a8_865a_ec28a00bac85(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f963fd77_e4b1_41cd_ad0d_712db64f2e39(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_23f9444f_4283_48d0_85e3_61a5f334b3a5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_3e6baaca_42fc_46c3_a345_31ba5695f880(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_648f3429_836d_4b28_89e9_c4300a5f23b0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_5c11890c_c944_4663_9403_55c3cdcd9cfa(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(i * i)).sum();
    }

    
    public static int sumSquares_Problem_0_701a626b_131d_4885_9ef8_0383198b2fdb(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x)).map(y -> y * y).sum();
    }

    
    public static int sumSquares_Problem_1_f80c15a9_8bf1_4ea7_81da_ece3ecc6216b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_922c9ff4_fb30_42db_98a1_8b5a50f80920(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_3de400f9_9d3e_4991_935c_0e4f1e97d0b2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_7b248b4c_1baf_4234_a80e_49ea971d19e7(ArrayList<Float> lst) {
        int sum = 0;
        for(float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5599393e_a748_4f1a_acbf_aace29462f19(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.round(x)).mapToInt(x -> x).sum();
    }

    
    public static int sumSquares_Problem_9_5770f234_bd61_4f3d_b3d2_d63387e30ef0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_a89771ce_37c4_49ff_9cae_010488241786(ArrayList<Float> lst) {
        // return Stream.of(lst).map(x -> Math.round(x * x)).mapToInteger(x -> x).sum();
        int ans = 0;
        for (Float x : lst) {
            ans += Math.round(x * x);
        }
        return ans;
    }

    
    public static int sumSquares_Problem_4_c985e223_337f_4ff3_b000_1e22d2c9430d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_0f6ee562_9691_4ff2_8f3c_4d5990006a61(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_402872ba_fbb2_450d_9129_d52f7969f308(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_11_66b1b21a_59ba_4257_ab42_44bff34c401e(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)*Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_26e957d2_1a19_4aa5_b633_955d05641fe2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_5c7cb251_3e95_46fd_a755_38f7a1a00e07(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_f9afcebe_c905_4f74_b67b_f1260eee512f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e16d8f7a_3254_4ac4_90f0_2465e69552d5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_aacd03ba_c9c9_4fab_b50c_00187e00e788(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5fb6e6d8_185b_4d3c_966e_efc2371afe6b(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_210d4172_2ef0_449c_a874_1179286edf97(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_08249358_c20e_4151_8acd_d2678c42cc36(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_b05dcd73_3897_4ae6_a7dc_6597b617833a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_f5713022_f68d_441e_9b7a_746600320357(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_42a98610_66d8_4d84_89fe_111c17b39072(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_6_cbb6a8eb_a05a_42a4_9f14_c0a5d9c81b48(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_2ccca5d6_944e_470c_879d_4508a456a3c6(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x,y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_f14ac33a_d4b2_4028_ae43_1d6c20ec77fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_33efa7af_ab94_48e4_a063_11e5310fd875(ArrayList<Float> lst) {
        return lst.stream()
            .mapToInt(x -> Math.round(x*x))
            .sum();
    }

    
    public static int sumSquares_Problem_1_16f09714_ed92_4e22_8360_2596585cc7b8(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_0_388c4912_06c6_4c5b_ae66_ba1e0dd5b29d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_191c871e_51b7_49e1_b357_8178b7564ef5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_4bcaf1e8_06f4_4270_a8bd_2ed108cdabf4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_f66ab50e_9ffe_40e2_b71c_5130e4b012f5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_27d53c2d_289e_4a78_ab51_ede80f98f1e3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_9104de3c_e820_4948_a6dc_8f0ba88a51b9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_75c42a77_75b8_40ff_a837_7ecb570124dc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2cdc071a_3615_4b58_9cd4_83ef2e88e349(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_8edb31c7_3290_4f04_b7c3_38c8d74e9a91(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_89305e72_d923_4408_9896_051eca17c811(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_2ccca5d6_944e_470c_879d_4508a456a3c6(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x,y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_2f31433a_473a_4d6f_97d7_75da3d85e09c(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(f + f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_550bde54_04d6_47ca_bf4e_77e425657277(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_31b8287d_e462_48a8_8718_d3ba48e3a06d(ArrayList<Float> lst) {
        int sum = 0;
        for(float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_cdef6fe4_8b4d_44e4_b7b0_0a2f6e543d36(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_067fff98_fbfb_44b4_b33b_9341b88bfa1b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_cbf65fad_142c_4957_a6f5_6dcddd05214d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_191c871e_51b7_49e1_b357_8178b7564ef5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2e6440e0_7bb3_4e2f_9df3_a071b6f0d05a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_4569fc06_6d85_41ca_a4df_cd288fe799ff(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_6ef53315_f7d9_4a5a_907a_a04607545f91(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_50d27be6_5c04_4325_adb4_024e76b6485a(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_455a8004_232d_4017_a862_0f09141dfc7f(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_5_e33a3bd6_fba1_47f4_bfce_f669acbd5981(ArrayList<Float> lst) {
        int sum = 0;
        for (Float number : lst) {
            sum += Math.round(Math.pow(number, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_d1fb05a0_c691_4a7b_95d6_c0e59a573950(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_08f40d11_6f63_42c0_8452_f9e21f4fb150(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_ff5f67ed_369e_4dbc_8957_79cc32d35d66(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_e007e308_1699_4d43_b5b4_60dda80ac0bf(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_832b38dc_5ea1_407d_90ec_c680d12d54b3(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_0e2611d7_f4e5_43a2_b251_4e8b41b3953b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_17f4e4ec_4c62_46eb_8505_a473334bad80(ArrayList<Float> lst) {
        return lst.stream().map(a -> Math.round(a)).map(b ->  Math.pow(b, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_29579256_fb52_401a_bcd4_da36ebd169c1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_923e1174_ae1e_4e87_8b4e_e98fd18195cc(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_049e6af0_8bc0_48ef_b860_b3324c964815(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_e176866d_d41c_46a4_baed_6c0525715041(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_fe3e8bd5_61e8_4dc5_9a4e_d404f52d3997(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_f31b24bd_e43a_47a2_b7be_ef10bd076c50(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_461c315f_7337_410b_8697_95a6b8d62890(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_9aadcce6_7dc9_4819_a92a_95d790ee8c3d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.round(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_30eb1d18_5b6d_47b3_8a54_69776e88d006(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_4fb1137a_1349_4830_9c13_f43b1fe26394(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_1e408936_ccea_4832_887c_2330a5add1db(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_5ca2f226_9c57_40a6_ad49_9c988e269e95(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_f80c15a9_8bf1_4ea7_81da_ece3ecc6216b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_5171aa41_654d_48fc_b255_2674c2ad4601(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_1_c039eb02_87ab_4fd0_a5ee_0fe1afea298c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_a692a85b_6960_45e0_b2c5_d98d1e4b4e1e(ArrayList<Float> lst) {
        // Your code here
        int sum = 0;
        for(Float num : lst) {
            sum += (num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c439ff04_5b20_4c9f_b0dd_926a30356230(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_83eb24f2_ca2d_4931_b96b_ca84c50bfb40(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f2fa637a_a092_45ea_a592_49e3a4598f10(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_d3433002_8946_4780_9953_dce153d3a2b5(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_d8712a24_02d2_438e_b654_10e39c1f9965(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_7_40311a09_5118_4e29_b5f5_1ee1efb73a67(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_fd2b23e0_ac7e_4be8_960a_4dfd323db1c4(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_53c5c9ec_92a0_437f_987a_3ebb8bf4d9f6(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_922c9ff4_fb30_42db_98a1_8b5a50f80920(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_918ee2cf_eb6d_403a_b5fe_afa64786fb32(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_40be5333_7236_47cf_9803_1ed86dba0793(ArrayList<Float> lst) {
        int sum = 0;
        for(Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_79c2a0b4_6e92_43d4_9143_da635e58264b(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_10_c04469bf_86ae_4e9d_836d_9817811f66a7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_b4541598_df0a_4c38_93a5_5d6c23f3f7e1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_d272dc48_035c_4a93_b2c3_aad711b60309(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_14354db4_ffb4_46fd_b358_290d32ed9b2b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_06a131b5_4919_478a_bad3_376e0c6b131d(ArrayList<Float> lst) {
        // Your code goes here
        int sum=0;
        for(Float num:lst){
            sum+=Math.pow(num,2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_8ba10104_c95b_4063_b3e4_a7ff4b97acff(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_5fb6e6d8_185b_4d3c_966e_efc2371afe6b(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_51fffdc3_93d2_4faa_9608_a5facb55a370(ArrayList<Float> lst) {
        int sum = 0;
        for (float elem : lst) {
            sum += Math.round(elem) * Math.round(elem);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ddef837d_85e2_4876_9f86_84ed5427265c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_279ddfca_a797_42f9_922b_7a4ec1f48604(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i: lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f0a258db_8d6c_4456_a3f4_e021c6f07a3e(ArrayList<Float> lst) {
        // Write your code here
        return 0;

    }

    
    public static int sumSquares_Problem_0_d43159eb_b64d_46d4_9c24_8d982234cfd9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cd9e92f5_3e7e_4c07_87a5_443ed3dd59df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_4fc9aaef_4b98_4ae0_aaf5_8e9b45693c11(ArrayList<Float> lst) {
        // Write your code here
        return 0;

    }

    
    public static int sumSquares_Problem_11_197e1b9b_b337_4d89_b5bb_756cf0b8e520(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_fe6ed6ce_0ed7_45b9_970c_bf929a9a09d3(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_44ab7349_f135_4a5b_810d_dcc80d4e1dca(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2c585f6d_9a02_415e_9a46_0cbaf3273f41(ArrayList<Float> lst) {
        int sum = 0;
        float last;
        for(float f : lst) {
            last = (Math.ceil(f));
            sum += last * last;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_7f48ce3d_16f5_4791_b88f_c2af65642b62(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_ae7583d6_5f73_4aa0_9f6d_4db599e2dc96(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_210d4172_2ef0_449c_a874_1179286edf97(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_116dc3ca_a5f2_4a7f_9f1d_d137fee6b7b5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_5b31bf8c_19da_4fc5_9a31_2d7039de1ca3(ArrayList<Float> lst) {
        return lst.stream().map(x -> {
            var num = Math.ceil(x);
            return  Math.pow(num, 2);
        }).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_c4cc872b_f732_49e8_91f4_cc0782e45bfa(ArrayList<Float> lst) {
        return  lst.stream().mapToDouble(x -> x * x).map(x -> Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_0_f31d59a7_6850_44b3_90a2_4bf60e7a3fba(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_11_0f6ee562_9691_4ff2_8f3c_4d5990006a61(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_4373becb_f6a1_4322_9e73_3f66d69c412c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_690fc036_18fa_4087_80c0_996a3b1c7ec2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_89305e72_d923_4408_9896_051eca17c811(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_cac499b8_ff43_4660_9e9a_df0792d0b35f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_1_8ef8ac77_0424_471d_9aae_f45a63c891d1(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_48241d80_1234_45bf_ac63_b0973489cd4c(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(Math.round(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_49283e25_e195_4059_b40c_ddb7b3c06282(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ce8cfeb1_c007_4735_b4f8_8254f568a82d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_d2722195_f4c1_4754_9107_e76ab1d3b544(ArrayList<Float> lst) {
        //TODO: Write your code here
        return 0;
    }

    
    public static int sumSquares_Problem_0_dc0c7e5d_8527_48d3_9a4f_a3157b024174(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_3d39033c_5cd9_4ce6_a590_c031abced655(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_74ddc477_6ce4_4532_bd3f_17b736c795df(ArrayList<Float> lst) {
        int ret = 0;
        for(Float f : lst) {
            ret += Math.round(Math.ceil(Math.sqrt(f)));
        }
        return ret;
    }

    
    public static int sumSquares_Problem_1_49c8ec7a_8719_45fb_94dd_3fbdbe427b1f(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_1_32ea9982_292e_415a_b3bb_c792f0758ac9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_6b79c54d_f570_4b25_9210_f37bd883efa9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_f5950505_7ea7_4993_af38_05b7e3882759(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cca505b2_9716_49e7_b918_541af255ea40(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_b7c83c00_3cf7_4e70_9483_08a87969aaae(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_4_88b43558_e3a0_4fe1_a5f6_2fd159aa8fd3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_d40b1eb1_8565_4f76_b118_af7e6f6d3308(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_d3da8d6c_4bcb_409d_bc82_3962d196d7f7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_ccfacd39_cc04_467b_b278_d631faa49320(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_f5950505_7ea7_4993_af38_05b7e3882759(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_a89771ce_37c4_49ff_9cae_010488241786(ArrayList<Float> lst) {
        // return Stream.of(lst).map(x -> Math.round(x * x)).mapToInteger(x -> x).sum();
        int ans = 0;
        for (Float x : lst) {
            ans += Math.round(x * x);
        }
        return ans;
    }

    
    public static int sumSquares_Problem_1_1a656600_55ea_41ed_9f21_acbe286a7393(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_665bbb56_5043_4bad_bd96_91abbd0808d9(ArrayList<Float> lst) {
        if (lst.size() == 0)
            return 0;
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(Math.round(x), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_7306c450_3b50_4934_a40d_5667f58b1425(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_01bf75fe_7d08_4907_93bf_b6acfb0fe78e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_2e9051cf_79ad_403b_9a58_28e5cf331e0d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_5f78964c_4805_418a_aaa4_8bc86c821aa9(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_83b1185a_cb55_4827_b7e1_8e1075cc9143(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_3_c4cc872b_f732_49e8_91f4_cc0782e45bfa(ArrayList<Float> lst) {
        return  lst.stream().mapToDouble(x -> x * x).map(x -> Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_2_b8fd505a_1817_440a_a3a7_f8bdbfd0f56e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_12122c76_070f_429b_a50c_47c247e605e1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_861a2b82_ce76_4993_b4b9_68b407530204(ArrayList<Float> lst) {

        return lst.stream().mapToDouble(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_4_dbc7ad0c_41db_4f58_b3af_4b1c93fc1307(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_cb87b003_b74b_40fb_ab13_d268f8127fb1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_cd49fbe9_9a4f_4d5c_90ad_fce3575bf82d(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.round(f) * Math.round(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_bd911b7e_22de_4bd9_aa5c_924c1b2f5445(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_2c947223_40c9_4a6e_a07e_d6203dcd5d67(ArrayList<Float> lst) {
        return Math.round(lst.stream().map(v -> Math.ceil(v)).map(v -> Math.pow(v, 2)).reduce((a, b) -> a + b).get());
    }

    
    public static int sumSquares_Problem_0_6f4594e5_dbb6_477f_a3cc_9bd78317b34f(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_a6da3315_734a_44ab_b54a_7f2ab625292d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_89bcb7d3_8e2d_45e4_b2eb_8887f614335b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_d2d4a108_62dd_4a84_8009_9eab62ab209c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0aec1732_c4dd_4a84_aff3_f7a8185dc721(ArrayList<Float> lst) {
        return lst.stream().map(x -> x.intValue()).map(x ->  x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_23d5a54d_f9af_439e_b566_3fb1ed3ad4a4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_3662b488_dbc6_46b4_a835_4c1ffd1419f0(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a05cebdd_91d0_4d61_b284_f2fd0b013400(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_0ef44eeb_b672_4edd_8685_4d772a7f65db(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_bb272343_a8d1_45ef_9c1e_ec7c6d86fbae(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_73be0d1a_f000_4f74_8d95_710c963bcb05(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_dd9a2e01_e89e_44b7_b9a4_bb0bc7adfe9f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_f7c68e4d_226e_47e5_9b01_34ae82adc939(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e59b8ea3_e9a3_4edf_be1c_d7542b87f772(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.ceil(f) * Math.ceil(f)).sum();
    }

    
    public static int sumSquares_Problem_0_1fdc8714_16bf_4111_9ee4_7e620184874f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_b513fb36_2d70_488d_b78b_dc529c0d3e36(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_fce9091f_f6dd_4826_b6ac_a6cc3b05db7d(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_be3ac18e_fa32_4a4e_a5f7_0169546bebd8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_27f8a49f_f7c5_4a60_949e_ace70a54b5c1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_80ca6e88_da47_4ac5_9962_3e5a3b82d66d(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_cddcf7d6_0347_417a_a872_a81f8ff12429(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_17582984_beaf_4446_8feb_29a5b86692a5(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_d71e6c6b_5450_40aa_9cd0_5fe9c01a7cda(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_08249358_c20e_4151_8acd_d2678c42cc36(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_c2581e90_08ea_4f4b_8b8c_e72353bb45c8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_8fdeda05_e849_438b_bcfa_0a264b150e1f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_f152c3fe_383c_46c3_890e_33e1c893c265(ArrayList<Float> lst) {
        int s = 0;
        for (float f : lst) {
            s +=  Math.pow(f, 2);
        }
        return s;
    }

    
    public static int sumSquares_Problem_6_3922ebb8_5d35_49ef_b777_5f81b073b007(ArrayList<Float> lst) {
        return lst.stream().map(f -> Math.ceil(f)).map(f -> f * f).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_5ef01c31_3c01_4d4a_b81c_78b29227e730(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_3e6da9b8_5247_4b35_ba22_2c14816a2a25(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_83b1185a_cb55_4827_b7e1_8e1075cc9143(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_023d19a2_d442_4c03_89c4_7391f7ca2c5f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f16b7199_5d8f_45e5_abf3_f2c5cf891cf7(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(Math::round).map(i -> i * i).sum();
    }

    
    public static int sumSquares_Problem_1_ae2b2493_b4ab_4aae_92ee_211513d19f57(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(Math.ceil(i * i))).sum();
    }

    
    public static int sumSquares_Problem_7_dd11f328_df86_420c_958f_c1662957398a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_0cbfd934_ef5d_497e_b9b4_70894c0d858c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_fd76a174_79b4_43a6_b573_f7bf4c150f60(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_d5bae281_a683_496e_8ca2_5eb4f5b1aedd(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_b01e4a56_ca93_4310_a6cb_8ce66fba3042(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_3b319c74_9e21_4ed4_8f9b_4824e2f546ec(ArrayList<Float> lst) {

        int sum = 0;
        for(Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_4c6646a4_91e9_4968_9e8b_77aceac27880(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_90921950_46a8_4e08_80d1_421dd0d19259(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x) * Math.ceil(x)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_931c4168_1b2e_41cb_b51a_9d6da092a183(ArrayList<Float> lst) {
        ArrayList<Double> doubles = new ArrayList<>();
        for(Float f : lst){
            doubles.add((double)f);
        }
        int sum = 0;
        for(Double d : doubles){
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_d7815b71_d95f_4a44_9ef6_68edb3951df3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_93a9c4c7_770b_4278_abda_6a8e1f880177(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_09e98ba9_9ec0_49bf_8252_75b1388cf359(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_7a2f3ccf_1ef5_4136_9fc5_d227c0d837fe(ArrayList<Float> lst) {

        // BEGIN SOLUTION
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
        // END SOLUTION
    }

    
    public static int sumSquares_Problem_6_7cd9ceb5_5d08_4fea_9ef4_cd9795968061(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_0689f693_5e79_483e_86d8_3cd52c8e8fa7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.ceil(num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_537e2eb4_4599_4fd8_b3f7_14b1c6c59d84(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_e6faab06_c2aa_4620_b690_a5568edba4d4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_7316fd18_fb53_4297_b514_43854a8a549b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_c9d13791_5fc9_42e3_9ef2_e6b46bc024be(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_be80bef7_71f9_4b56_ac70_10501e0b4ad8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_469d6bcb_abc2_4e8a_a7ed_9d0ddfd4fa28(ArrayList<Float> lst) {
        int result = 0;
        int[] arr = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            arr[i] =  Math.ceil(lst.get(i));
        }
        for (int j = 0; j < arr.length; j++) {
            result += Math.pow(arr[j], 2);
        }
        return result;
    }

    
    public static int sumSquares_Problem_1_6de8d60b_c1ad_4ea9_b2e8_035694ff9e30(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_10_3a98dbc3_1c79_407c_ac8a_520524e5f2a1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_2_56fd9229_63dd_4cd6_bd47_4012e7dfa240(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_276012a2_2557_42fb_9afb_bc7019e44d7a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_274df3fb_ee77_4c65_a875_4c02324c90f9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_4fc9aaef_4b98_4ae0_aaf5_8e9b45693c11(ArrayList<Float> lst) {
        // Write your code here
        return 0;

    }

    
    public static int sumSquares_Problem_3_7c055861_4783_490f_bd9f_0e35c79d4aa3(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_be80bef7_71f9_4b56_ac70_10501e0b4ad8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_6fee58ce_c570_4741_943d_9e3ad0100116(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_7d51c99c_c70e_4060_8ff4_9b85d967c8d4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_af5cc82e_e44e_47ba_95a9_b6bc0c3ceb63(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_b1c95ec8_563b_479b_a2c6_beaa4d4449ea(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_68d36df8_8f29_4c20_ba2f_edf27af43365(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ffdbd2d7_93c5_4018_b5db_f237d63ba8c6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_fbdfe155_4600_4de4_88ba_3608e3bf4495(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_16f59885_a17a_41fa_bce3_258344742fc8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_7d51c99c_c70e_4060_8ff4_9b85d967c8d4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_40311a09_5118_4e29_b5f5_1ee1efb73a67(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7316fd18_fb53_4297_b514_43854a8a549b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_4aa23953_c05e_41f3_b18e_e83b815669be(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_a43b58b9_3337_4101_a0c4_5b8527cee2a9(ArrayList<Float> lst) {
        ArrayList<Float> result = new ArrayList<Float>();
        for (Float el : lst) {
            result.add(Math.ceil(el));
        }
        // System.out.println(result);
        int total = 0;
        for (Float el : result) {
            total += el * el;
        }
        return total;
    }

    
    public static int sumSquares_Problem_7_6cbcadbf_ee7d_4f39_90fe_64735b50358d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d5c5581b_97e1_46e3_b7ac_2ad6cdf7c6e2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_ef6af688_155c_4248_a325_705227fc500f(ArrayList<Float> lst) {
        // your code here
        int sum = 0;
        for (Float val : lst) {
            sum += Math.round(Math.pow(val, 2.0));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c4cc872b_f732_49e8_91f4_cc0782e45bfa(ArrayList<Float> lst) {
        return  lst.stream().mapToDouble(x -> x * x).map(x -> Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_8_79c2a0b4_6e92_43d4_9143_da635e58264b(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_8_adff164f_3169_472c_9777_2e9f793eea7a(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_34c69938_4189_42c9_8213_dc3e954804dd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_3cda9a35_a507_4605_b4fe_1b75c461cfb2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_9_e5b46b66_ea9c_40c6_870e_a8de3b938a45(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(i ->  Math.ceil(i * i)).sum();
    }

    
    public static int sumSquares_Problem_6_02757ca9_9d9d_41e9_9535_0580792ff587(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f6ecce15_1e90_4040_9f6c_20f0959fccb2(ArrayList<Float> lst) {
        if (lst.size() == 0) {
            return 0;
        }
        return lst.stream().mapToInt(f -> Math.ceil(f)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_02757ca9_9d9d_41e9_9535_0580792ff587(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_da54e29f_20cf_426d_9679_32ae26458e7c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_f30120ef_14e8_43ea_b97b_0f3cc213a203(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum +=  Math.pow(f ,2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_e8f497f9_c9d7_4819_99c4_51a0865c5cf3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_2c1b2f37_53a0_409d_8a83_dbc7e2d0cbb7(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_02757ca9_9d9d_41e9_9535_0580792ff587(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_89e4aada_8a59_4f4e_94ce_6ec30cbcd7c6(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.ceil(e) * Math.ceil(e)).sum();
    }

    
    public static int sumSquares_Problem_9_49a6961c_df85_48d8_81a4_4257fb9eeb4a(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.pow(Math.ceil(x), 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_6a8150ac_8c9e_44a4_bdf5_3d558dc6867e(ArrayList<Float> lst) {
        // input:  array list of numbers
        // output: sum of squared numbers in the given array list,
        // round each element in the array list to the upper int(Ceiling) first.
        int r = 0;
        for (int i = 0; i < lst.size(); i++) {
            r += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return r;
    }

    
    public static int sumSquares_Problem_0_5a77b304_65da_4b8c_8c29_0d0842827363(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_627ab875_8457_4f34_8025_66922d815024(ArrayList<Float> lst) {
        return lst.stream().map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_b7906759_790d_4389_a55e_3bdc8a359dbc(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_cd49fbe9_9a4f_4d5c_90ad_fce3575bf82d(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.round(f) * Math.round(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0cbfd934_ef5d_497e_b9b4_70894c0d858c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_cdb252fe_87bf_431e_8d72_d1b2640c84f1(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_7316fd18_fb53_4297_b514_43854a8a549b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_75c7b4d4_726b_449c_91ca_7cfba4ea6bb6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_279ddfca_a797_42f9_922b_7a4ec1f48604(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i: lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_aacd03ba_c9c9_4fab_b50c_00187e00e788(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_8d881343_4b83_49e5_8eb7_c9d8c72c8f37(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_4496d2d7_d8e1_46fd_ad37_095dac8e4fe7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_ea1e5a1b_005f_4d00_8116_bb21bee4fdf2(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(num -> Math.round(num) * Math.round(num)).sum();
    }

    
    public static int sumSquares_Problem_2_c909f4e4_a4b9_47fe_a73f_f1ec20e45b94(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_6e80ae58_803b_4bb9_9783_592378d87576(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_1_738c1a64_b7ea_4d99_b59a_edeee439e193(ArrayList<Float> lst) {

        // Implement this function
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_8_504e3bf1_a35e_4790_8825_227741a70c86(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_f9ff7930_b116_406c_979c_29b13e051264(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_fabc6c65_891c_4cb5_b190_ff064d59b3a9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(Math.ceil(num), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_44c698df_c671_4735_9a62_4bf544a2488c(ArrayList<Float> lst) {
        int sum = 0;
        float square;
        
        for (float element : lst) {
            square = element * element;
            sum += square;
        }
        
        return sum;
    }

    
    public static int sumSquares_Problem_0_48241d80_1234_45bf_ac63_b0973489cd4c(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(Math.round(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_8fc7c0b6_3b21_4957_b3e5_7081bce5312f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_27f8a49f_f7c5_4a60_949e_ace70a54b5c1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_70f8e979_e47a_4d65_a1ee_efac4f2cd2f5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_e5642dc1_b6ab_439c_b66b_f821e2365d2d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_b37ccc99_60d9_4c41_905c_1271e982584e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_b32b06d5_85cd_4d33_adfe_d8eb78725dda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_9f395924_583f_4ce8_bced_a4b735966849(ArrayList<Float> lst) {
        // write your code here
        int sum = 0;
        for (int i = 0; i < lst.size(); ++i) {
            sum += lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_eaa90b0e_32e5_4e6a_8839_5706f09901cb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_f1d06063_911f_442d_86f8_ac56ab13ce18(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0L, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_1_1402382e_1029_459b_afc2_e26b6b3b16eb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_ac3e1d24_3f71_4e5a_abcf_0e9c3fabb5ac(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_edf0bc38_59ea_43c0_8e92_0fdbc4b71769(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7f43e8ab_0d1c_418a_af2c_6ae920c73772(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_232425da_59e8_40ba_9b4a_9d6e049bf6aa(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_4a2a3dba_556a_4b29_aa86_957cf4a9a9c0(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2cdc071a_3615_4b58_9cd4_83ef2e88e349(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_bc8340bd_6330_4fe5_b72a_627904b83754(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x)).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_2_50c1ac5f_9a0f_456b_be0f_3a4c3057e69e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_486baaee_7c18_4da0_b569_03cfb828efa4(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_41e05849_e23e_41ad_a4b0_bf9e4cec76ac(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_9a7ab0ff_26f3_460a_b979_6225af9ffbd8(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_c0b41c5b_e5b4_4251_9edb_6fb153f11980(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_e9d888ce_b862_40da_b492_fe3f39c14d76(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_504e3bf1_a35e_4790_8825_227741a70c86(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_0f6ee562_9691_4ff2_8f3c_4d5990006a61(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_967b9836_af67_4f46_addd_4d299715cb5c(ArrayList<Float> lst) {
        // Return the sum of squared numbers in the given array list.
        int sum = 0;
        for (Float n : lst) {
            sum += n * n;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_631c8f0f_9002_41f7_a64c_e9e36c0461d5(ArrayList<Float> lst) {
        // your code
        return 0;
    }

    
    public static int sumSquares_Problem_8_3b319c74_9e21_4ed4_8f9b_4824e2f546ec(ArrayList<Float> lst) {

        int sum = 0;
        for(Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_772e1096_9905_4e6b_b26b_89195c3821d4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_749c9237_f2bb_4327_88a6_54da9174958a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_87242912_2928_492d_b9a6_1332e3838d6c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_4863035f_557d_41ad_87a8_e9135aeb4f43(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_679248ac_8f07_4bed_bc7f_df76b3e00063(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_2dcafd76_eed1_4120_8ef6_03aeac8a2cd0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_88b43558_e3a0_4fe1_a5f6_2fd159aa8fd3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3e21b440_2e35_443c_a5c5_43975e01ca2b(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_75c7b4d4_726b_449c_91ca_7cfba4ea6bb6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d5bae281_a683_496e_8ca2_5eb4f5b1aedd(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_3b417749_9a1a_464e_ab4f_eef142eabed5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_39c48936_88bb_4472_bab3_4990b38e4106(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(i) * Math.round(i)).sum();
    }

    
    public static int sumSquares_Problem_5_bd924bfa_b8a3_4625_9e67_78b302420fcc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_c9b1df99_375e_4d0c_81fc_6b461513d0e5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_cc0422e0_65a7_4328_b3be_75e0a54e5c15(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_ad7fd9cb_978f_446f_9fa0_f666de6a4e12(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_49f6d021_bee7_427f_b14f_24bf154b4c1a(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_3b417749_9a1a_464e_ab4f_eef142eabed5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_f46c8a95_d208_4ced_95e5_c59ff9ca420b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f5713022_f68d_441e_9b7a_746600320357(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_8042f086_4379_4c41_bc0a_9294a670d082(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_4863035f_557d_41ad_87a8_e9135aeb4f43(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_0fa89ce5_264c_46c9_85fe_2fa8ca5b4c13(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_bf571941_5872_4784_9e29_438d981a4955(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_931c4168_1b2e_41cb_b51a_9d6da092a183(ArrayList<Float> lst) {
        ArrayList<Double> doubles = new ArrayList<>();
        for(Float f : lst){
            doubles.add((double)f);
        }
        int sum = 0;
        for(Double d : doubles){
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e8dd1bb8_48ed_4384_9ff0_9063bb3810a8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6a4cde99_b5d1_47ca_b6bf_12fc5a913259(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_6_4252d753_89cd_46c4_bdd3_073e9460da6e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_ae7583d6_5f73_4aa0_9f6d_4db599e2dc96(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_10_add5edd8_08bc_4c54_ab9a_8b54348a5e97(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_79ad5522_109c_4226_9a0f_48bc032fbbeb(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_23d5a54d_f9af_439e_b566_3fb1ed3ad4a4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_12122c76_070f_429b_a50c_47c247e605e1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d43159eb_b64d_46d4_9c24_8d982234cfd9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_3780ceb4_8386_47f6_8ec1_45ddae0a8fb0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(Math::round).sum();
    }

    
    public static int sumSquares_Problem_1_c92e445b_b007_4669_8cab_f163a65ac07f(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_fea532a1_3579_41e2_b2c1_d730d92f0905(ArrayList<Float> lst) {
        return lst.stream().map(num ->  Math.ceil(num) *  Math.ceil(num)).reduce(0, (total, num) -> total + num);
    }

    
    public static int sumSquares_Problem_4_65257237_690e_4d41_b879_ed57b06653e9(ArrayList<Float> lst) {
        float sum=0;
        for (Float num : lst) {
            sum += num*num;
        }
        return Math.round(Math.ceil(sum));
    }

    
    public static int sumSquares_Problem_11_911b295a_9ebc_4866_8e36_de3142d1ba47(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_6f839a44_ea4b_48dd_a266_f68b88261c68(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_5770f234_bd61_4f3d_b3d2_d63387e30ef0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_e44b4499_7d86_4878_917e_4089f7262861(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_e5b46b66_ea9c_40c6_870e_a8de3b938a45(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(i ->  Math.ceil(i * i)).sum();
    }

    
    public static int sumSquares_Problem_11_ad05e38e_8a00_48a2_b65a_1006e25dd285(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_a495b238_9495_4642_bbfb_c1fdaa464510(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_469d6bcb_abc2_4e8a_a7ed_9d0ddfd4fa28(ArrayList<Float> lst) {
        int result = 0;
        int[] arr = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            arr[i] =  Math.ceil(lst.get(i));
        }
        for (int j = 0; j < arr.length; j++) {
            result += Math.pow(arr[j], 2);
        }
        return result;
    }

    
    public static int sumSquares_Problem_9_72b6287e_fa0a_4fc9_b349_2743b81073bc(ArrayList<Float> lst) {
        // Implement your code here
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_89305e72_d923_4408_9896_051eca17c811(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d78dc61a_793f_4374_8e09_2bd3f7372e8a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_3e6da9b8_5247_4b35_ba22_2c14816a2a25(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_9de632fb_2555_47ea_a970_4f564fe0fd25(ArrayList<Float> lst) {
        final class Java {
            static int sumSquares_Problem_11_9de632fb_2555_47ea_a970_4f564fe0fd25(ArrayList<Float> lst) {
                int acc = 0;
                for (int i = 0; i < lst.size(); i += 1) {
                    acc += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
                }
                return acc;
            }
        }
        return Java.sumSquares_Problem_11_9de632fb_2555_47ea_a970_4f564fe0fd25(lst);
    }

    
    public static int sumSquares_Problem_1_0d89d1fd_9778_4a64_b3b8_98e9cc9a241c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e5ccdcb8_dd9c_454d_bcee_6c57c4de8016(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += num.floatValue() * num.floatValue();
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_2d35c800_4468_4ed7_a555_d2b6f972c876(ArrayList<Float> lst) {
        // Write your code here.
        return 0;
    }

    
    public static int sumSquares_Problem_1_d5eb1304_5c89_4b71_a194_355bb354aa4e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_635bfb53_507c_4e74_9db6_5908f7af11ba(ArrayList<Float> lst) {

        // Fill this in.
        return 0;
    }

    
    public static int sumSquares_Problem_1_1a6f85d5_4394_4d37_921a_a3ae824ef65a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_627ab875_8457_4f34_8025_66922d815024(ArrayList<Float> lst) {
        return lst.stream().map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_82ede255_9013_4a3a_ae2f_e564b9717ced(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f044a8d0_efda_4231_b721_f55c3e395a8d(ArrayList<Float> lst) {
        int lSum = 0;
        for (int i = 0; i < lst.size(); i++) {
            lSum += Math.pow(lst.get(i), 2);
        }
        return lSum;
    }

    
    public static int sumSquares_Problem_3_cdef6fe4_8b4d_44e4_b7b0_0a2f6e543d36(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_33efa7af_ab94_48e4_a063_11e5310fd875(ArrayList<Float> lst) {
        return lst.stream()
            .mapToInt(x -> Math.round(x*x))
            .sum();
    }

    
    public static int sumSquares_Problem_0_f173fb62_6206_4107_be46_cb0f5fee7ccb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_2cdc071a_3615_4b58_9cd4_83ef2e88e349(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c183396b_7d0e_4665_98d3_4f433dd1b27c(ArrayList<Float> lst) {
        if(lst.size() <= 0) throw new IllegalArgumentException();
        int ret = 0;
        for(Float f : lst) ret += Math.pow(f.intValue(), 2);
        return ret;
    }

    
    public static int sumSquares_Problem_1_8bedf419_ec0e_4184_a2fb_c2e1a8785ebe(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_4_2c1b2f37_53a0_409d_8a83_dbc7e2d0cbb7(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_aa1bf7f0_fcb0_4faa_a2d8_664bdf2139f5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_23b7de18_604d_4e7d_b06d_be61aa02ee7b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float elem : lst) {
            sum += (Math.pow(Math.ceil(elem), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_3e87da8c_77fe_450c_a496_7aac4114f18a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4eecfced_be77_4d71_ac9d_e9a9740cb02d(ArrayList<Float> lst) {
        int total = 0;
        for (int i = 0; i < lst.size(); i++) {
            total += (Math.pow(lst.get(i), 2));
        }
        return total;
    }

    
    public static int sumSquares_Problem_0_be3ac18e_fa32_4a4e_a5f7_0169546bebd8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_4eecfced_be77_4d71_ac9d_e9a9740cb02d(ArrayList<Float> lst) {
        int total = 0;
        for (int i = 0; i < lst.size(); i++) {
            total += (Math.pow(lst.get(i), 2));
        }
        return total;
    }

    
    public static int sumSquares_Problem_10_7197868d_a74d_4314_a9d1_29520de3d1a4(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9b619026_7132_4f37_9453_e2260b790b70(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_85e77f29_4625_46f0_8f48_ba8c4252b4d9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_a42462f0_4fb5_4892_a688_1261931fcfdb(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_2_d7601f63_fdb7_4c95_a1e6_8723a6a5757b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_bd8d3c35_090c_487d_a486_a26f5a7f4ec7(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(n -> Math.round(n) * Math.round(n)).sum();
    }

    
    public static int sumSquares_Problem_1_9f725c99_2137_4fa8_a226_1f16e0d5000a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_dec54d69_6785_4e75_bd8d_cd14829d32e7(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_05751400_21e0_408c_8956_1cc7c97434c3(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_9a12d263_add8_4f41_94f3_a1952da3f5b3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_73597ca7_fc9e_48c7_af24_e9bb955cf172(ArrayList<Float> lst) {
        
        // write your code here
        return 0;
    }

    
    public static int sumSquares_Problem_0_4e69006c_f278_4340_8a06_eddd41cb050b(ArrayList<Float> lst) {
        int sum = 0;
        for(Float fl : lst) {
            sum += Math.pow(Math.ceil(fl), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_e5f380d1_3108_46ac_800a_0c2e9b414910(ArrayList<Float> lst) {
        int sumSquares_Problem_11_e5f380d1_3108_46ac_800a_0c2e9b414910 = 0;
        for (float val : lst) {
            sumSquares_Problem_11_e5f380d1_3108_46ac_800a_0c2e9b414910 += Math.round(Math.pow(val, 2));
        }
        return sumSquares_Problem_11_e5f380d1_3108_46ac_800a_0c2e9b414910;
    }

    
    public static int sumSquares_Problem_6_0575adae_6f5f_4317_8a61_bfe8a5dbc5d7(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToDouble(Float::doubleValue).map(x -> x*x).sum();
    }

    
    public static int sumSquares_Problem_0_d3a666af_de6f_4f81_ae9d_4764ec78f284(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_6a7d9822_7201_456f_a5bc_28f44190b1ce(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_9_25bd86cc_0fdb_4692_9f73_7e425466d401(ArrayList<Float> lst) {
        // Write your code here
        int sum = 0; 
        for (int i=0; i<lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_006b84c3_9578_4731_bdd6_50b7246b1dc7(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(n -> Math.round(n) * Math.round(n)).sum();
    }

    
    public static int sumSquares_Problem_2_1b50885b_4a9a_4faf_9395_b48b3401e13c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_b8c8450a_0cb3_40ea_8b44_cac70636a096(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_23ea6c61_c342_4b3e_a891_dcc30e4ce9d2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_56e4f5ff_6409_4659_868e_3319af102e6c(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_736b4932_e541_46ef_8ce7_bcd47faadbb3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_6f839a44_ea4b_48dd_a266_f68b88261c68(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_5b66512f_6a45_45c6_b851_9f9a9a44664b(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_5da1180c_aeb9_4a36_bae2_6c4f3a4f54ef(ArrayList<Float> lst) {
        // Write your code here
        return 0;

    }

    
    public static int sumSquares_Problem_1_27d53c2d_289e_4a78_ab51_ede80f98f1e3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_38717cc2_5d98_46e9_bb27_d406d8191756(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i : lst) {
            sum += Math.ceil(i);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_0_5b66512f_6a45_45c6_b851_9f9a9a44664b(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_10_1e1718ea_37d8_47a1_b11c_8ea84b0b0346(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_426bea4a_3a34_43ab_a0fe_dfde9dabca5f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_16f59885_a17a_41fa_bce3_258344742fc8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f240a59c_814d_43d2_9011_46f0f87d2836(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_7197868d_a74d_4314_a9d1_29520de3d1a4(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_3c61a6ac_1862_48a9_9c8b_109549203139(ArrayList<Float> lst) {
        return lst.stream().mapToInt(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_df3b88c1_9aa9_450a_ac1e_2c2cc1cabca4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_aa336e1e_42ca_44b4_b483_552c52e7b10c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_e9d7b04a_6fc7_488e_9f6d_a51123a20001(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.round(e)*Math.round(e)).sum();
    }

    
    public static int sumSquares_Problem_4_ae2b2493_b4ab_4aae_92ee_211513d19f57(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(Math.ceil(i * i))).sum();
    }

    
    public static int sumSquares_Problem_0_46d91777_354d_4925_9c7f_16044d406f1c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_9bad13fe_9df9_4338_80bd_fc391ced83ed(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_4da0321f_0836_44c1_822a_5adebe3516a8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2356e3fb_4260_4be0_a956_8efc78ac79df(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_0_d55a414f_56b7_4279_b036_bb144dbf3a2b(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_77b3234d_4400_4e8f_bcf1_a64b5ddef8c5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_89648a5c_9c6d_40f1_b133_4bcfd3f53cbc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_fb85b134_b9e6_43a2_97f0_d35326906c74(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_093c935d_5546_4900_b9d1_cce251056b92(ArrayList<Float> lst) {
        return lst.stream().map(i -> i.intValue()).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_8c3260c5_fabb_4fee_b873_a2a6a739402e(ArrayList<Float> lst) {
        int sum = 0;
        for (float n : lst) {
            sum += Math.pow(n, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_4da0321f_0836_44c1_822a_5adebe3516a8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d99c21c9_043b_41ab_b1ec_efb322abf14c(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ec39d14d_9706_42e5_b1ac_db1afc521614(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a48be230_9fe0_41a4_97e5_9d2975186cac(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6248bba7_2b1b_4851_9663_9d314cf57713(ArrayList<Float> lst) {
      return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_1_d8b893d4_109a_42b5_933e_e8d7ea0da5e0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_c6b17361_a10b_46a5_8cf0_9f5c963acbc0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ab888389_eb16_414d_9b42_16de5dd70f6d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_29579256_fb52_401a_bcd4_da36ebd169c1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_313b03d5_7a72_4a54_8986_a2597a35332f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_12d1221d_c90a_4890_8a67_c385a7930df5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3d2bafe5_271b_4100_a64d_cf938d639753(ArrayList<Float> lst) {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    
    public static int sumSquares_Problem_0_21caf0a7_30a9_4553_8a2f_ee62051e7987(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_10_7fd5d959_b83a_4da0_b52f_02588d28d5fd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_edddb48e_25bf_4ec0_9998_788f3a985f6d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_204a281f_c972_4135_a66b_1f4c566169cf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ba935228_e524_411b_a065_df9e7d31b78b(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst){
            sum +=  Math.ceil(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e861fb03_6da6_450f_af1f_39d76cde7596(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_bcda7afb_441c_45fb_9bf2_fc291a247825(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5a77b304_65da_4b8c_8c29_0d0842827363(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_ccfacd39_cc04_467b_b278_d631faa49320(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_6f55f685_6256_46e8_acaa_4946b50cc89d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_3774ddb4_4341_4c88_b36a_ebd2e69ddc47(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_06bc0acd_0268_41a9_832a_242d54faab33(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3281689f_2f9a_4622_a9fe_3e9e89c0c28a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_010daad7_1592_4318_aecf_433042980551(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_be5e83a5_feb0_4fd8_97ea_4984808e041b(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_7f909d68_c3f7_49b5_927a_2f5e8c1ca8c1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_3d2bafe5_271b_4100_a64d_cf938d639753(ArrayList<Float> lst) {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    
    public static int sumSquares_Problem_5_1a9a8fa7_f98a_42ed_8c54_371b5ffae5c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float elem : lst) {
            sum += Math.pow(elem, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6a6a825c_f41d_4bd7_96ff_f73b356e8340(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_2c36746e_8cdf_4dfd_9cf8_2acc638f1a4f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_6a1b790b_c559_4dfc_b482_9199f5988b1b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_2616c368_b8c0_4966_a42b_85be1e2e8664(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f4ab2ac8_637d_4a55_b3f7_50c4227c8ad5(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float i : lst) {
            sum += Math.round(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_94e58491_5e0d_42bb_b99e_1db527e72293(ArrayList<Float> lst) {
        ArrayList<Double> sq = lst.stream()
                .mapToDouble(x -> x * x)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        return sq.stream().mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_6_83b1185a_cb55_4827_b7e1_8e1075cc9143(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_dd502b38_7c87_4f91_8e69_d715f5b58815(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_c8c94d00_ffcf_42cb_acd5_e1ff4badd8ec(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_635bfb53_507c_4e74_9db6_5908f7af11ba(ArrayList<Float> lst) {

        // Fill this in.
        return 0;
    }

    
    public static int sumSquares_Problem_11_4a2a3dba_556a_4b29_aa86_957cf4a9a9c0(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6a1b790b_c559_4dfc_b482_9199f5988b1b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_ba8c90c7_38ab_4cf5_9682_54b652a77781(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_20e00374_f79c_4d2a_979b_92bb1e0498dd(ArrayList<Float> lst) {
        int sum = 0;
        for(Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e8096a9e_00a0_45c0_886a_a42efd4ce986(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_23689f68_738c_46af_b3e6_14847120dcfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_fe14f8ca_1acd_43a9_abd3_abf181642c27(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_e740a79b_9ba4_4166_b24e_7c4675690dbf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_2e6440e0_7bb3_4e2f_9df3_a071b6f0d05a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3199a208_1935_49fc_8696_649b7e7d5399(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_3591c461_4b27_4b2d_b3cd_44c9962d44cd(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_b848373e_8110_4308_800d_34b71910783e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d77f5836_1148_403b_b026_d73ff6efdaf7(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_cc37c1bd_addf_4860_9cbd_457e594c03cc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_d220c8a5_6be2_4688_8541_ab7d4e30cef4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_f2fa637a_a092_45ea_a592_49e3a4598f10(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_ef6af688_155c_4248_a325_705227fc500f(ArrayList<Float> lst) {
        // your code here
        int sum = 0;
        for (Float val : lst) {
            sum += Math.round(Math.pow(val, 2.0));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_1dce730e_f8f4_4ded_b174_f3029942ecbf(ArrayList<Float> lst) {
        int sum = 0;
        for(float n: lst)
            sum += n * n;
        return sum;
    }

    
    public static int sumSquares_Problem_10_e8f8aa29_8c95_40f3_bb29_2e2c1dfc2c40(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_5599393e_a748_4f1a_acbf_aace29462f19(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.round(x)).mapToInt(x -> x).sum();
    }

    
    public static int sumSquares_Problem_1_50c1ac5f_9a0f_456b_be0f_3a4c3057e69e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_1e87db70_a2f4_4b5b_8a89_69b08fb57f14(ArrayList<Float> lst) {
        //throw new java.lang.UnsupportedOperationException("Please implement the sumSquares_Problem_6_1e87db70_a2f4_4b5b_8a89_69b08fb57f14 function");
        int sum=0;
        for(int i=0;i<lst.size();i++){
            sum+=Math.ceil(lst.get(i))*Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_50d68640_5b92_4191_833f_b6d6c9da8dfe(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_ab888389_eb16_414d_9b42_16de5dd70f6d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_87242912_2928_492d_b9a6_1332e3838d6c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_4bf3b389_47e6_4a81_8b2d_c54d308166ea(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_6_17dbb34d_46d4_49ca_ab2c_57f4d62ef69d(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_c97b8a75_4698_4fbe_927d_932a0ba48110(ArrayList<Float> lst) {
        int ret = 0;
        for (Float x : lst) {
            ret +=  Math.ceil(x) *  Math.ceil(x);
        }
        return ret;
    }

    
    public static int sumSquares_Problem_1_fba8a305_2bdb_40dd_876f_f76870ba7233(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_2_ade73709_a8f6_490f_8ff0_be1895154a13(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_0e2611d7_f4e5_43a2_b251_4e8b41b3953b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_095f13eb_3592_41f0_a6f5_8cf706fd2b9e(ArrayList<Float> lst) {
        int len = lst.size();
        if (len == 0)
            return 0;
        int sum = 0;
        for(int i=0; i<len; i++) {
            double x = Math.round(lst.get(i) * 1.0d);
            sum += x * x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_93e9f6af_7fdb_494f_a288_a7d076609fd3(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_08249358_c20e_4151_8acd_d2678c42cc36(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_e861fb03_6da6_450f_af1f_39d76cde7596(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_bbbaff2f_e77e_41c9_822a_af18b70a4031(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_15d4a918_2a7a_4c94_89cf_04d62d6abd6f(ArrayList<Float> lst) {
        int res = 0;
        for (float f : lst) {
            res +=  Math.ceil(f) *  Math.ceil(f);
        }
        return res;
    }

    
    public static int sumSquares_Problem_1_49d16e3a_90c7_46e5_bd1f_4196917d752c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x ->  Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_f31b24bd_e43a_47a2_b7be_ef10bd076c50(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_de7d127d_d0c0_4a2c_9fcb_d42c9ff9ee01(ArrayList<Float> lst) {
        return lst.stream().map(i -> Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_537409fd_1619_4d20_b8c5_60478171b6d8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_a96d6956_fbfa_4565_a18e_2c718cc4f2b8(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_0_e007e308_1699_4d43_b5b4_60dda80ac0bf(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_4c6646a4_91e9_4968_9e8b_77aceac27880(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_d5673363_887b_4300_8f0f_d07412ab5705(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_62d65955_173e_4919_ba3c_4dbda885a00d(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_d6de7b01_a2cf_4f8a_a4b0_890e80f56151(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5da088e9_9767_42c6_948e_c2bc337bfbf9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_6255bef0_230f_44ad_853e_63537c430c81(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_93723ec6_f02f_4f38_bc81_5b71b5d78553(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.round(Math.pow(i, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4ebed367_e025_49a5_9d48_e32adb19c08f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_1806a20d_0524_4208_bf3f_9491870d53eb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_32ea9982_292e_415a_b3bb_c792f0758ac9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_7159de65_eab5_470f_be9e_9566ee314d60(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_9b619026_7132_4f37_9453_e2260b790b70(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cd9e92f5_3e7e_4c07_87a5_443ed3dd59df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c022333e_f328_429d_be39_07a49d88251b(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_1a08ef0a_911b_4dce_b63d_9d82f0866d20(ArrayList<Float> lst) {

        int sum = 0;
        for(Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_4e403631_3cf6_4081_92f0_78b75f977ac9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_bd0637ac_de6e_4230_8832_6061c5c6c91c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(i -> Math.round(i * i)).sum();
    }

    
    public static int sumSquares_Problem_0_55ce4c58_a5a5_404b_ab01_248f73cc66e6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_00fbf781_e2cc_4f29_b081_de40ac9beec4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_037098ea_c38a_46b2_aa9e_4e887e33c8ab(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_d40b1eb1_8565_4f76_b118_af7e6f6d3308(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c6b17361_a10b_46a5_8cf0_9f5c963acbc0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d2ecf99b_43cb_48ee_ae2a_cbc8e4e5e88a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += (Math.ceil(f * f));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_2acb3726_4e34_4eaf_9ed5_1e26c8e60738(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_f8f45539_23e9_4407_b599_35e90507c45f(ArrayList<Float> lst) {
        int x = 0;
        for (Float f : lst) {
            x += Math.ceil(f) * Math.ceil(f);
        }
        return x;
    }

    
    public static int sumSquares_Problem_6_44ab7349_f135_4a5b_810d_dcc80d4e1dca(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_aac05ddc_3afd_4469_a3e7_d7c99f93a09f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_09bf93f3_b283_4ffd_8ed9_c4866ba9d6d1(ArrayList<Float> lst) {
        int sum = 0;
        for (int i=0; i<lst.size(); i++){
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_7c98dde3_205a_4f48_9b73_b1d454d1bef8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_3b800255_af96_4564_9d80_b3107e71b1f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_463e4bef_3005_4830_a4a9_423110abead0(ArrayList<Float> lst) {
        if (lst.isEmpty()) return 0;
        int sum = 0;
        for(float n: lst) {
            sum += Math.pow(Math.ceil(Math.sqrt(n)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_b5cea375_e2b0_4fbe_9019_082aeddf62e9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_7b57791a_c94f_407d_9b03_8c9cc4fe2bcd(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_0_b4541598_df0a_4c38_93a5_5d6c23f3f7e1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_b23bf11a_231a_4881_94ea_c528a5d8b202(ArrayList<Float> lst) {
        int sum = 0;
        for (Float number : lst) {
            int squared =  Math.ceil(number) *  Math.ceil(number);
            sum += squared;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_bc1e8986_c5ab_491c_99e6_d4c63b9234c8(ArrayList<Float> lst) {
        int sum = 0;
        int i = 0;
        for (float f : lst) {
            sum += f * f;
            i++;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_bdbad0e8_986e_48ac_854b_4edebf83b7dd(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce((x, y) -> x + y).get();
    }

    
    public static int sumSquares_Problem_1_a39f32c0_742c_4fd3_be29_c3fbdf358f93(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_89648a5c_9c6d_40f1_b133_4bcfd3f53cbc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_6b0819aa_58b5_4acc_b0b1_c134905e38c4(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_fa7a2ec3_d2b6_4d92_be27_96efe1cb96a2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_bdbad0e8_986e_48ac_854b_4edebf83b7dd(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce((x, y) -> x + y).get();
    }

    
    public static int sumSquares_Problem_8_81e77449_32e1_4fe5_a5a7_19cdab94f885(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_c1639d46_d83e_48ff_9d84_be75ccc15876(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_8fcdeb0c_483a_42b7_b66a_f34f6b72ab1f(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2b09166b_cdc6_496a_9cfb_c1769ba7e3c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0a018e91_17ee_4ffd_a7e6_43b2a9dd2cec(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_e32bab2c_b920_4235_9934_9d2c467dfb8e(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_1cbfe173_020e_4dc7_8d96_524bc512c06e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_be1e27d6_778f_475e_af6c_4cf8ff934ebe(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_b3f3c07b_2b8c_4a13_bd2e_389953697db8(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_4fc9aaef_4b98_4ae0_aaf5_8e9b45693c11(ArrayList<Float> lst) {
        // Write your code here
        return 0;

    }

    
    public static int sumSquares_Problem_9_537e2eb4_4599_4fd8_b3f7_14b1c6c59d84(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_92bcc5a6_fde5_4461_809b_4beeefe541c4(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_a893abbc_4cb6_420e_839c_77354962ecc7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e36b27a6_eb91_4921_8b52_276ec8335036(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_b261d0a3_63b6_4fcc_ac4e_5d4dd297116a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e22e88ea_244e_404a_b104_caf6b9728ae4(ArrayList<Float> lst) {
        ArrayList<Integer> list = lst.stream().map(it -> Math.ceil(it)).collect(Collectors.toCollection(ArrayList::new));
        return list.stream().map(it -> it * it).reduce(0, (it, other) -> it + other);
    }

    
    public static int sumSquares_Problem_5_30eb1d18_5b6d_47b3_8a54_69776e88d006(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_7306c450_3b50_4934_a40d_5667f58b1425(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c89db24c_c046_4aa1_9e71_2ca1d6478292(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_cac499b8_ff43_4660_9e9a_df0792d0b35f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_6_58fd747d_eaae_42e1_b7d9_fcd8f7d0692a(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i ->  Math.ceil(i) *  Math.ceil(i)).sum();
    }

    
    public static int sumSquares_Problem_1_2bf082b4_0952_4fa4_aa5a_8d1c7b197832(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_44929144_ff0e_4d57_a42a_acd6558fedf1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_140b3a9e_7b69_48f3_a151_7531d741586d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_39c48936_88bb_4472_bab3_4990b38e4106(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(i) * Math.round(i)).sum();
    }

    
    public static int sumSquares_Problem_9_aab23ba3_e038_4977_a4af_350f62d81eb1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_28d72756_20aa_40c2_8a02_070ef0f63292(ArrayList<Float> lst) {
        double sum = 0;
        for (float f : lst) {
            sum += Math.pow(f , 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_3_7cd9ceb5_5d08_4fea_9ef4_cd9795968061(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_b29cdfc6_af4a_4a8e_8059_ca2e634853b6(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += (lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_38717cc2_5d98_46e9_bb27_d406d8191756(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i : lst) {
            sum += Math.ceil(i);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_11_50dc9be7_ed9e_4223_afff_5565a719018e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_06a131b5_4919_478a_bad3_376e0c6b131d(ArrayList<Float> lst) {
        // Your code goes here
        int sum=0;
        for(Float num:lst){
            sum+=Math.pow(num,2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_298286f8_cd43_4659_b93c_1f80b230e81e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_50387424_d006_4de7_989a_78ce2fcb0939(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (acc, x) -> acc + x);
    }

    
    public static int sumSquares_Problem_0_bd420a65_4f0a_4d26_954e_ebeda39fc3cb(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_23ef379e_6dd4_4a73_a990_dab0e7d8b868(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_ab0fd528_b912_492a_927e_4d4d2d06e4d4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a,b) -> a+b);
    }

    
    public static int sumSquares_Problem_10_4e3f2f2c_c967_4165_a58a_719e21928d05(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_0_cca505b2_9716_49e7_b918_541af255ea40(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_3f897594_3486_40dd_8a25_405b7fe79487(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_16cfbd6f_554a_4b08_a144_5e80f098da4e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_2_154679f7_e430_427a_9a97_8d2c168df061(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_bb34419b_fc73_45e7_82a1_1efed04a2864(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_ac158b8f_7eed_4875_8846_1d1eba8df34b(ArrayList<Float> lst) {
        // Your code here
        return 0;
    }

    
    public static int sumSquares_Problem_6_e9ed8cb9_a45c_4415_b7a9_5e7495e67b2c(ArrayList<Float> lst) {
        // write code here
        return 0;
    }

    
    public static int sumSquares_Problem_1_ac81890a_6e8f_42a7_874a_3b185b218b99(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_3de400f9_9d3e_4991_935c_0e4f1e97d0b2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_5883a5af_40d2_461e_aa19_d57d5b5ee0b5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e8371983_e168_4479_b412_cb21351f50ab(ArrayList<Float> lst) {
      return lst.stream().mapToInteger(n -> Math.ceil(n)*Math.ceil(n)).sum();
    }

    
    public static int sumSquares_Problem_0_47b911b6_c254_44d1_a847_51b1e04e3235(ArrayList<Float> lst) {
        return lst.stream().map(n -> n.intValue()).map(n -> n * n).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_0cbfd934_ef5d_497e_b9b4_70894c0d858c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_a36e1492_3911_4882_89aa_6a34bced23a0(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_1e87db70_a2f4_4b5b_8a89_69b08fb57f14(ArrayList<Float> lst) {
        //throw new java.lang.UnsupportedOperationException("Please implement the sumSquares_Problem_1_1e87db70_a2f4_4b5b_8a89_69b08fb57f14 function");
        int sum=0;
        for(int i=0;i<lst.size();i++){
            sum+=Math.ceil(lst.get(i))*Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_20185846_2e18_4c8c_b384_7bc9a185abb9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_9104de3c_e820_4948_a6dc_8f0ba88a51b9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e8371983_e168_4479_b412_cb21351f50ab(ArrayList<Float> lst) {
      return lst.stream().mapToInteger(n -> Math.ceil(n)*Math.ceil(n)).sum();
    }

    
    public static int sumSquares_Problem_7_68d36df8_8f29_4c20_ba2f_edf27af43365(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_d3d27b77_dc71_41d5_a0a7_5bd7f27ba541(ArrayList<Float> lst) {
        return lst.stream().map((x) -> Math.ceil(x)*Math.ceil(x)).reduce((a, b) -> a + b).get();
    }

    
    public static int sumSquares_Problem_0_49a6961c_df85_48d8_81a4_4257fb9eeb4a(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.pow(Math.ceil(x), 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_95dab76d_8749_4647_8bc6_862e378918d6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d272dc48_035c_4a93_b2c3_aad711b60309(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_dad4638a_6275_4cd7_9ee0_335cccef0342(ArrayList<Float> lst) {
        // Implement the method
        int res = 0;
        for (Float fl : lst) {
            res += Math.ceil(fl) * Math.ceil(fl);
        }
        return res;
    }

    
    public static int sumSquares_Problem_1_0b179909_c4d3_406a_a14e_189ef2762174(ArrayList<Float> lst) {
        int sum = 0;
        for (float f: lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_3312c54f_5590_4ca1_b1f9_60fa44c15168(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_3d2bafe5_271b_4100_a64d_cf938d639753(ArrayList<Float> lst) {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    
    public static int sumSquares_Problem_1_537409fd_1619_4d20_b8c5_60478171b6d8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_8_96da233a_6375_4b8f_b0d6_2f5c9dd20628(ArrayList<Float> lst) {
        // YOUR CODE HERE
        ArrayList<Integer> f = new ArrayList<Integer>();
        for (int i = 0; i < lst.size(); i++) {
            f.add(Math.round(Math.ceil(lst.get(i))));
        }
        int sum = 0;
        for (int i = 0; i < f.size(); i++) {
            sum += Math.pow(f.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_679248ac_8f07_4bed_bc7f_df76b3e00063(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_71f87c71_40e2_4eda_86be_e6e16db3dc22(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_931c4168_1b2e_41cb_b51a_9d6da092a183(ArrayList<Float> lst) {
        ArrayList<Double> doubles = new ArrayList<>();
        for(Float f : lst){
            doubles.add((double)f);
        }
        int sum = 0;
        for(Double d : doubles){
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ad05e38e_8a00_48a2_b65a_1006e25dd285(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_fce9091f_f6dd_4826_b6ac_a6cc3b05db7d(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_49b95db9_5a1e_40f0_860f_4ef569f75faa(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_941bebd7_5d0d_426d_ba8d_aff5ee783e7c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_f2fe97ec_9b78_46c1_b1e1_546f571fd315(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_0a180038_3115_40a3_9b1a_4908137abd8d(ArrayList<Float> lst) {
        return lst.stream().map(a ->  Math.ceil(a)).map(a -> a * a).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_fa25320d_566a_466f_8c33_6453bfe7f4cd(ArrayList<Float> lst) {
        return lst.stream().map(Float::intValue).map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_b0d5dfc8_f4b1_469c_89d5_494f398e7e23(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_a5d9961f_80eb_4441_8242_fc96887043f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_7f48ce3d_16f5_4791_b88f_c2af65642b62(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_77a642e8_d4ce_4ca0_8cb9_78a6bdf9f9c8(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_49b95db9_5a1e_40f0_860f_4ef569f75faa(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_6a4cde99_b5d1_47ca_b6bf_12fc5a913259(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_9_40c0a7bc_6198_4b7c_97be_7e6b7f47231c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_4205c1bc_465b_4881_8869_0e66c3c2339f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_d77e61cc_5e16_41eb_86ff_24c5ec6c0015(ArrayList<Float> lst) {
        return lst.stream().map(n -> Math.ceil(n)).map(n -> n * n).reduce(0, (m, n) -> m + n);
    }

    
    public static int sumSquares_Problem_1_32ea9982_292e_415a_b3bb_c792f0758ac9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_52d0299d_7424_4279_a05f_2e898039c036(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_1fae8590_414a_4ba4_a466_90ccdc438e29(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_1e408936_ccea_4832_887c_2330a5add1db(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_ff4eb359_02ed_4498_9b23_b61b9e93f91b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_6a1b790b_c559_4dfc_b482_9199f5988b1b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_ba24f0ae_7b4e_4c68_9766_566d9685a53c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5c7a6ea4_ccf9_4caf_a118_bedfea11f4ce(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_fd5cc068_a2bd_4c48_8eaa_a056fdfdf487(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_91993075_453f_4463_b0fc_8180a652beb4(ArrayList<Float> lst) {
        int total = 0;
        for(Float f : lst) {
            total = total+Math.round(f*f);
        }
        return total;
    }

    
    public static int sumSquares_Problem_5_af228eb4_80ec_4250_a4e9_19dc769702f6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_2bf082b4_0952_4fa4_aa5a_8d1c7b197832(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_97fa4151_3b4e_453e_890b_bc83c9a243aa(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_fbdfe155_4600_4de4_88ba_3608e3bf4495(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_8042f086_4379_4c41_bc0a_9294a670d082(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_dd502b38_7c87_4f91_8e69_d715f5b58815(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_4fb1137a_1349_4830_9c13_f43b1fe26394(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_a6f531ef_4aad_458c_a3f6_f573561f971d(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(l -> Math.ceil(l) * Math.ceil(l)).sum();
    }

    
    public static int sumSquares_Problem_5_9fba7407_5cf7_42f9_b144_bdf39ae459aa(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_2c947223_40c9_4a6e_a07e_d6203dcd5d67(ArrayList<Float> lst) {
        return Math.round(lst.stream().map(v -> Math.ceil(v)).map(v -> Math.pow(v, 2)).reduce((a, b) -> a + b).get());
    }

    
    public static int sumSquares_Problem_0_dad4638a_6275_4cd7_9ee0_335cccef0342(ArrayList<Float> lst) {
        // Implement the method
        int res = 0;
        for (Float fl : lst) {
            res += Math.ceil(fl) * Math.ceil(fl);
        }
        return res;
    }

    
    public static int sumSquares_Problem_3_f0a258db_8d6c_4456_a3f4_e021c6f07a3e(ArrayList<Float> lst) {
        // Write your code here
        return 0;

    }

    
    public static int sumSquares_Problem_11_19a8cb03_8627_4ef5_ac10_2b6b586ed338(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_2_f226b555_66c4_44b9_989a_0e71fdf52b7f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_8_9a7e122f_76fe_446b_9b5d_76e38fad0605(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_4496d2d7_d8e1_46fd_ad37_095dac8e4fe7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_0a02dd28_8ef1_42ce_9de4_79dfa4e73ae2(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_6a8150ac_8c9e_44a4_bdf5_3d558dc6867e(ArrayList<Float> lst) {
        // input:  array list of numbers
        // output: sum of squared numbers in the given array list,
        // round each element in the array list to the upper int(Ceiling) first.
        int r = 0;
        for (int i = 0; i < lst.size(); i++) {
            r += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return r;
    }

    
    public static int sumSquares_Problem_4_a42462f0_4fb5_4892_a688_1261931fcfdb(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_11_c6bde5de_d065_4ddd_8a65_946b8a2654fc(ArrayList<Float> lst) {
        // Your code goes here!
        //return null;
        int ret = 0;
        for (int i = 0; i < lst.size(); i++) {
            ret += Math.round(Math.pow(lst.get(i), 2));
        }
        return ret;
    }

    
    public static int sumSquares_Problem_1_aab23ba3_e038_4977_a4af_350f62d81eb1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_ac5b7e32_3401_4f2e_9bcc_af59ede26056(ArrayList<Float> lst) {
        int sum = 0;
        for(int i = 0; i != lst.size(); i++) {
            sum += lst.get(i)*lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_707db7da_0f7e_4a4c_acc9_e3cedc7e1ac6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c2581e90_08ea_4f4b_8b8c_e72353bb45c8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_e9d8136b_6925_4663_ac5d_8c3361c8d598(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_e049f05c_8236_42ef_ba50_0c0f599c2c67(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4ca78c3b_d335_41d4_9e9d_d1b34ca7e338(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_016a1994_3ef2_4f4a_bf06_45515ed735e2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_b01490b7_2504_4fc0_9939_4d8f8a2dd33d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_8edb31c7_3290_4f04_b7c3_38c8d74e9a91(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_c92e445b_b007_4669_8cab_f163a65ac07f(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_7dae3e9d_9e3c_4df1_8593_129b29e76916(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_3_9f11e9d2_1aee_4e2e_b79e_7fc37ccf6888(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_9e9f536a_ae38_40da_9519_254b7e0d6d93(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_45edec01_735b_494a_8eec_f3e7718883db(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_60f2a390_1f12_4092_867e_4356b9e07502(ArrayList<Float> lst) {

        // BEGIN SOLUTION
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
        // END SOLUTION
    }

    
    public static int sumSquares_Problem_1_4d9a6532_9bff_4b9d_97d1_70eb438a8243(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7ef670a8_d43c_4ee6_8bf6_2390f0591ebb(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_7_a44c5817_1196_41b1_9042_6feaf2742024(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_d6d1dd51_d0af_487c_8d2d_e884acde38aa(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_61b568a0_30ec_4ad2_9868_e3397841fa69(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3199a208_1935_49fc_8696_649b7e7d5399(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_e007e308_1699_4d43_b5b4_60dda80ac0bf(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_84128fb5_ea71_465c_a83b_d1cd56907d8b(ArrayList<Float> lst) {
        return lst.stream().map(p -> Math.round(p)).map(p -> p * p).mapToInteger(p -> p).sum();
    }

    
    public static int sumSquares_Problem_1_2e1ed616_b8bc_4e72_9c20_ce1632bbd2c6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_8f1bd6b4_2949_441d_b7b4_dc3c9915a62c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_2_20882c2e_0545_41a5_b240_e3c07eac6afb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_a28e45f7_bb72_45b5_a327_709012322d4f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_ddef837d_85e2_4876_9f86_84ed5427265c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_de3616e6_41fa_4f81_a871_0e7b26b95784(ArrayList<Float> lst) {
        return lst.stream().map(i -> Math.ceil(i)).map(i -> i * i).reduce(0, (a,b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_bec18f64_34d2_4388_9068_faea1138e7ad(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_b948342a_cc51_4d3a_b7ea_1bcd2ded7953(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5a043099_8dcf_41e3_9063_44f555aef457(ArrayList<Float> lst) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (Float num : lst) {
            nums.add(Math.ceil(num));
        }
        return nums.stream().mapToInt(num -> num * num).sum();
    }

    
    public static int sumSquares_Problem_6_6fee58ce_c570_4741_943d_9e3ad0100116(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_9809f986_54a2_45fb_9b9a_467fc20ee625(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_95dab76d_8749_4647_8bc6_862e378918d6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_49c8ec7a_8719_45fb_94dd_3fbdbe427b1f(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_1_d29c8115_cffe_4d1a_994c_807a3d385673(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x ->  Math.pow(x, 2)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_4b3a105b_3789_48a4_8653_d996e2dbf3e7(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_049e6af0_8bc0_48ef_b860_b3324c964815(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_2dcafd76_eed1_4120_8ef6_03aeac8a2cd0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_093c935d_5546_4900_b9d1_cce251056b92(ArrayList<Float> lst) {
        return lst.stream().map(i -> i.intValue()).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_65e5139a_a03d_4385_953d_2f7353a245ac(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_9c900637_3afd_4489_b671_ef66e68ce5da(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_f865dcd6_06a3_4a8c_9f4f_472e525f38db(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_2_cd4fa2d1_3e3f_4573_9439_4d59c73be0ef(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_19b71e74_61bf_4b9e_b239_ca927e622400(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_70b8b6c7_33a5_4254_9bb1_37bdf092ac4f(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_8c354be4_265c_4351_971a_bec9a879aa46(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_8f235683_d711_4217_94ca_04677d519277(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_e5f1f498_fdec_4903_903e_c7f9b079c1a3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d5108185_dc82_4883_ad00_ea173d5ff345(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_14ae0519_c689_4a19_bed8_085c2626a1f7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_4205c1bc_465b_4881_8869_0e66c3c2339f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_8061a0f1_6bc2_4707_9cfc_b79d83f3a28e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_0c5ac88f_8b2c_4340_9c5c_bccd96aa390d(ArrayList<Float> lst) {
        // try {
        //     for (Method method : lst.getClass().getMethods()) {
        //         if (method.getName().equals("map")) {
        //             return lst.stream().map(v -> Math.ceil(v)).map(v -> Math.pow(v, 2)).reduce(0d, (total, value) -> total + value);
        //         }
        //     }
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        return 0;
    }

    
    public static int sumSquares_Problem_8_9a847e51_6ef0_4192_980e_b4288452410f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_091de871_8652_43c2_bc07_615496031545(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x ->  Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_ffb18e80_f5d6_4f22_8a1c_fc8c3dacbe01(ArrayList<Float> lst) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        int sum = 0;
        for (Float i : lst) {
            ints.add(java.lang.Math.round(i));
        }
        for (Integer i : ints) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_ec61259b_b339_4785_85c5_fc150f9f5c6e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_44853803_b366_48c1_bea6_0a8566d8b355(ArrayList<Float> lst) {
        throw new RuntimeException("Not Implemented");
    }

    
    public static int sumSquares_Problem_1_3d2bafe5_271b_4100_a64d_cf938d639753(ArrayList<Float> lst) {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    
    public static int sumSquares_Problem_1_1b75a7f3_e253_48d0_b830_0f3f855e06ef(ArrayList<Float> lst) {
        int len = lst.size();
        // Note that you need to convert from float to int using "intValue()"
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] =  Math.ceil(lst.get(i));
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i] * arr[i];
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3f3f79fc_caa6_4da5_83ce_f3afd6b5b719(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_e3c88bd4_a9eb_4a23_94c1_4ab0f404cbc7(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_2c36746e_8cdf_4dfd_9cf8_2acc638f1a4f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_9104de3c_e820_4948_a6dc_8f0ba88a51b9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_635bfb53_507c_4e74_9db6_5908f7af11ba(ArrayList<Float> lst) {

        // Fill this in.
        return 0;
    }

    
    public static int sumSquares_Problem_1_6a1b790b_c559_4dfc_b482_9199f5988b1b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_a6823a7a_e9fc_4ab6_9f8a_c5652c1f1898(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_9e9f536a_ae38_40da_9519_254b7e0d6d93(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_80ede0e8_dd59_43ea_b3c2_f49f16ebb587(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_b0576eeb_0e5c_4d7e_bc3e_3796a33245fd(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_8_c89db24c_c046_4aa1_9e71_2ca1d6478292(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_d220c8a5_6be2_4688_8541_ab7d4e30cef4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_97fff975_2291_4249_abac_136e0517bcd6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_b80c041b_993d_46f3_85a7_2d80bfbf062f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_36f6756e_ec91_49f3_8e8f_a59e6b7aed33(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            double x = lst.get(i);
            double round = Math.ceil(x);
            sum+=round*round;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_bea96bac_169c_471f_a10b_2777f316014d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_4ddadfd2_e4d3_48b2_983f_e0d430fb4746(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); ++i) {
            sum += lst.get(i) * lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_12dd13a3_11d5_4ab8_9af4_3f6f1e804590(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_d3a666af_de6f_4f81_ae9d_4764ec78f284(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_bef8c4f4_9604_4163_b76c_8640be8963a6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_1f1b7c2d_12d3_4e39_ae02_a41ffd998ac7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_648f3429_836d_4b28_89e9_c4300a5f23b0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9fba7407_5cf7_42f9_b144_bdf39ae459aa(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_0689f693_5e79_483e_86d8_3cd52c8e8fa7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.ceil(num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_ab888389_eb16_414d_9b42_16de5dd70f6d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_08249358_c20e_4151_8acd_d2678c42cc36(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_02af3a71_d366_4428_a202_9c54637a5ebe(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_5171aa41_654d_48fc_b255_2674c2ad4601(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_7_3a34059a_b1b9_4b48_aae9_e5416e66521f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_b80c041b_993d_46f3_85a7_2d80bfbf062f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_3e87da8c_77fe_450c_a496_7aac4114f18a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_9fa48fa5_2990_4ae9_b3b9_5986718f971e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f80c15a9_8bf1_4ea7_81da_ece3ecc6216b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_dd11f328_df86_420c_958f_c1662957398a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_3232b205_c183_40a1_a98e_0b7dfd560f6f(ArrayList<Float> lst) {
        return lst
                .stream()
                .map(Math::ceil)
                .map(Math::round)
                .mapToInteger(x -> x * x)
                .sum();
    }

    
    public static int sumSquares_Problem_0_be792be2_ee63_4c04_b4dd_c128b8121f2f(ArrayList<Float> lst) {
        int sum=0;
        for(float x:lst)
            sum+=Math.pow(x, 2);
        return sum;
    }

    
    public static int sumSquares_Problem_0_bda9f2f8_3df4_49ac_ad3e_4fe9a7f83cdf(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_8f235683_d711_4217_94ca_04677d519277(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_1e1718ea_37d8_47a1_b11c_8ea84b0b0346(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4205c1bc_465b_4881_8869_0e66c3c2339f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_95336615_b5e7_439c_8937_6b26f60d672d(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_0_7001abc8_65f0_41eb_aa8c_89dbe72c014d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_be3ac18e_fa32_4a4e_a5f7_0169546bebd8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_66075ceb_7ffc_449b_82f3_d4c26dee781e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_095f13eb_3592_41f0_a6f5_8cf706fd2b9e(ArrayList<Float> lst) {
        int len = lst.size();
        if (len == 0)
            return 0;
        int sum = 0;
        for(int i=0; i<len; i++) {
            double x = Math.round(lst.get(i) * 1.0d);
            sum += x * x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_cdb252fe_87bf_431e_8d72_d1b2640c84f1(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_fe5330d4_00d2_4150_8c4b_f0414c92a74d(ArrayList<Float> lst) {
        float sum=0;
        for (Float x:lst){
            sum += x*x;
        }
        return  Math.ceil(sum);
    }

    
    public static int sumSquares_Problem_0_5dc95c88_741f_455d_b51c_f9f9ee303b5a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_27d53c2d_289e_4a78_ab51_ede80f98f1e3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c439ff04_5b20_4c9f_b0dd_926a30356230(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_93a2308e_d4bb_44a7_ad37_388c472e0ff5(ArrayList<Float> lst) {
        // Your code here
        return lst.stream().map(v ->  Math.ceil(v))
                            .map(v -> v * v)
                            .reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_2b86fce6_6c82_4ed7_b8f1_7aa8525274b6(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_a7ce250b_e576_4e1d_ba88_64f88facdc03(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_043a81aa_4abe_4daa_82f4_b92aea5beb17(ArrayList<Float> lst) {
        int sz = lst.size();
        int total = 0;
        for (int i = 0; i < sz; i++) {
            Float f = lst.get(i);
            double d = Math.round(f);
            total += Math.round(d * d);
        }
        return total;
    }

    
    public static int sumSquares_Problem_6_1419826e_9f8a_4b35_8aca_fbc07501fcdb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_e4bd1b65_da49_45a4_9a55_85133ef60fb4(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_e5e69393_422c_4d7a_83ea_ada36a320d64(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_486baaee_7c18_4da0_b569_03cfb828efa4(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6f06133d_19e1_44fa_b42f_5a4a3f5b1c69(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_8099b17d_0403_4715_be03_3a7fb733d13e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_f9ff7930_b116_406c_979c_29b13e051264(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_42a63e11_2725_4ad6_95dd_2c8af19cb6d3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d21b1832_dcd1_4095_a44b_998aadc0fc7f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_346d275f_328f_4ef3_a050_abc8741a4a88(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_f9ff7930_b116_406c_979c_29b13e051264(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_fba8a305_2bdb_40dd_876f_f76870ba7233(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_1e1718ea_37d8_47a1_b11c_8ea84b0b0346(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_1a259924_d880_4d1c_8361_f0a460dc7faa(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_143a4d79_7c7a_4404_b7fe_95c0514de1b4(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_6b848ea1_07fc_4181_95e1_463534cf9ed9(ArrayList<Float> lst) {
        // Solution here
        return 0;
    }

    
    public static int sumSquares_Problem_8_40311a09_5118_4e29_b5f5_1ee1efb73a67(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_426bea4a_3a34_43ab_a0fe_dfde9dabca5f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_52d0299d_7424_4279_a05f_2e898039c036(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_62704a43_d368_4187_9bec_9d2bdd82a17e(ArrayList<Float> lst) {
        int size = lst.size();
        int sum = 0;
        for (Float x : lst) {
            sum += x * x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_193669bc_40a0_4332_9ccc_5da219fed95c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_7a505620_267b_4d8f_9a1b_a50791dba5f2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_2616c368_b8c0_4966_a42b_85be1e2e8664(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_067fff98_fbfb_44b4_b33b_9341b88bfa1b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_18b83810_201b_4d4a_bf9e_51a8d8180d0d(ArrayList<Float> lst) {
        int ret = 0;
        for (int i = 0; i < lst.size(); i++) {
            ret += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return ret;
    }

    
    public static int sumSquares_Problem_5_f8327579_bc53_4315_9f98_2ee353497567(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_bd911b7e_22de_4bd9_aa5c_924c1b2f5445(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_98c777a0_8b61_49f2_ad4f_f6e409499779(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_012c2971_3153_4746_a65f_fec902d747bc(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_32c693ec_067c_4369_8b0b_fb7512045b4f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_4922caf0_5b93_4916_bcfc_11fdc6339cfa(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_145dc1e6_2c58_48be_b98d_1e68528dad5c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3bc3482f_59f1_46d8_b877_2ba3c4940341(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.round(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e56b8174_46e6_453f_8cd7_157d62d5e1b7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_11b442a9_8e28_4830_aa53_d93a8fa55c5c(ArrayList<Float> lst) {
        throw new RuntimeException("Please implment me.");
    }

    
    public static int sumSquares_Problem_4_1806a20d_0524_4208_bf3f_9491870d53eb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_dc0c7e5d_8527_48d3_9a4f_a3157b024174(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_3a45f97e_9ee4_4637_8bd2_968e07135670(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_2a3e6bfe_937d_4e01_96a6_f141649369a9(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_5092ea9f_ce8f_4992_a407_5b794b9fc09e(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x+y);
    }

    
    public static int sumSquares_Problem_6_c4cc872b_f732_49e8_91f4_cc0782e45bfa(ArrayList<Float> lst) {
        return  lst.stream().mapToDouble(x -> x * x).map(x -> Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_9_8f1bd6b4_2949_441d_b7b4_dc3c9915a62c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_11_ae7583d6_5f73_4aa0_9f6d_4db599e2dc96(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_9_8b3df568_eb9f_408c_8e71_3fc3195f452f(ArrayList<Float> lst) {
        return Math.round(lst.stream().mapToDouble(x -> Math.pow(Math.ceil(x), 2)).sum());
    }

    
    public static int sumSquares_Problem_0_f240a59c_814d_43d2_9011_46f0f87d2836(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_09e98ba9_9ec0_49bf_8252_75b1388cf359(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_90d4a640_dc5b_4dc1_91a7_a46cc3375730(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_989f11ad_1094_4f75_bcae_a1f841f83bec(ArrayList<Float> lst) {
        return lst.stream().map(x -> x.intValue()).map(x -> x * x).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_1_d1fb05a0_c691_4a7b_95d6_c0e59a573950(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_140b3a9e_7b69_48f3_a151_7531d741586d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a1e711df_ad2a_40cc_96b0_df2763ab6dce(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_0a5ea9cc_b49d_4dd9_8485_ef7e51846c54(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_627fc465_3810_43a9_9d1c_83fafaf88957(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_9846e3d5_dab9_43ff_ae17_db2c07cf5e02(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_5c11890c_c944_4663_9403_55c3cdcd9cfa(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(i * i)).sum();
    }

    
    public static int sumSquares_Problem_8_0aec1732_c4dd_4a84_aff3_f7a8185dc721(ArrayList<Float> lst) {
        return lst.stream().map(x -> x.intValue()).map(x ->  x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_d968b4ea_a5c8_4a74_8080_ed95085d1454(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_2_0057a028_6a45_4664_9b71_80f01a307af2(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_93c80923_f93e_47a1_8303_5f7e0ee89b7f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_037098ea_c38a_46b2_aa9e_4e887e33c8ab(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_6_94e58491_5e0d_42bb_b99e_1db527e72293(ArrayList<Float> lst) {
        ArrayList<Double> sq = lst.stream()
                .mapToDouble(x -> x * x)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        return sq.stream().mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_2_b32b06d5_85cd_4d33_adfe_d8eb78725dda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_093c935d_5546_4900_b9d1_cce251056b92(ArrayList<Float> lst) {
        return lst.stream().map(i -> i.intValue()).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_14ae0519_c689_4a19_bed8_085c2626a1f7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_cf829ac0_97e7_4d0c_9126_24b4fd1cc8b2(ArrayList<Float> lst) {
        int result = 0L;

        // get list of numbers
        ArrayList<Float> numbers = lst;

        // iterate through the list
        for (Float number: numbers) {
            // compute the sum of squared numbers
            result += number.floatValue() * number.floatValue();
        }

        // round result to nearest int
        result = Math.round(result);

        // return result rounded to nearest int
        return result;
    }

    
    public static int sumSquares_Problem_0_2dcafd76_eed1_4120_8ef6_03aeac8a2cd0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3b2dca26_d577_42a6_88f5_3c5347dde25f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_c97b8a75_4698_4fbe_927d_932a0ba48110(ArrayList<Float> lst) {
        int ret = 0;
        for (Float x : lst) {
            ret +=  Math.ceil(x) *  Math.ceil(x);
        }
        return ret;
    }

    
    public static int sumSquares_Problem_0_09bf93f3_b283_4ffd_8ed9_c4866ba9d6d1(ArrayList<Float> lst) {
        int sum = 0;
        for (int i=0; i<lst.size(); i++){
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_5af24a4e_0f56_4e82_848c_7436e0804743(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_3d39033c_5cd9_4ce6_a590_c031abced655(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4fb1137a_1349_4830_9c13_f43b1fe26394(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_a52734b3_e0a7_4219_8ced_8d9bec4c66f0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_06989881_0f6a_41e9_8ee9_c021743c7670(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_7b33d4c6_4596_40bb_bf36_d6268d759442(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_c496689e_dda5_4ac4_889b_806ee7dc3fe2(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_ed838647_c26f_4b2e_98ae_06f9e4c87fac(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_2_09a288d6_ba0e_4df4_94f3_b3d0fd32dc80(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_80ede0e8_dd59_43ea_b3c2_f49f16ebb587(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_9a4d0c0e_bdae_40ab_b538_87337e3bf6a5(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_49f6d021_bee7_427f_b14f_24bf154b4c1a(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_7d51c99c_c70e_4060_8ff4_9b85d967c8d4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_27d53c2d_289e_4a78_ab51_ede80f98f1e3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_e3c88bd4_a9eb_4a23_94c1_4ab0f404cbc7(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_4ca78c3b_d335_41d4_9e9d_d1b34ca7e338(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_279ddfca_a797_42f9_922b_7a4ec1f48604(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i: lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_6dd4c055_9cbf_4d78_9cbf_60cf1e58e06b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_3c61a6ac_1862_48a9_9c8b_109549203139(ArrayList<Float> lst) {
        return lst.stream().mapToInt(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_1_e55f7218_046e_4a75_ab1a_d50a22652037(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_e7f93c75_8461_4daf_9b63_0edca52bc054(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_023d19a2_d442_4c03_89c4_7391f7ca2c5f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_62d65955_173e_4919_ba3c_4dbda885a00d(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_2273828b_3196_47f6_aaaa_07f06c61de1b(ArrayList<Float> lst) {
        int sum = 0;
        int n = lst.size();
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        
        return sum;
    }

    
    public static int sumSquares_Problem_5_f8f45539_23e9_4407_b599_35e90507c45f(ArrayList<Float> lst) {
        int x = 0;
        for (Float f : lst) {
            x += Math.ceil(f) * Math.ceil(f);
        }
        return x;
    }

    
    public static int sumSquares_Problem_0_aa74c6c1_6f4c_405f_a69c_7c43e82f5744(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_f7947c9a_ed62_4c78_9151_8df198451b75(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_5599393e_a748_4f1a_acbf_aace29462f19(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.round(x)).mapToInt(x -> x).sum();
    }

    
    public static int sumSquares_Problem_8_bc6fb20a_ef86_47eb_a5e8_4b38569b07c8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_087c720f_50dd_4d6a_9972_6290680833da(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_9_fa7a2ec3_d2b6_4d92_be27_96efe1cb96a2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_6248bba7_2b1b_4851_9663_9d314cf57713(ArrayList<Float> lst) {
      return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_0_840516a3_645f_49b2_bb86_4c0181b37082(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(a -> Math.round(a)*Math.round(a)).sum();
    }

    
    public static int sumSquares_Problem_0_4afbe2d3_4112_43c4_8ba8_aa0850651d34(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_5_ac3e1d24_3f71_4e5a_abcf_0e9c3fabb5ac(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_249c51b9_4983_4fd9_9b37_43e0e6bdf1fb(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_6e632aca_f395_4e25_90db_afa5330e25f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_7322751d_bdf6_4b23_97b8_fef41e9724a5(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_b0c5f63b_c097_425e_a07e_d26c4a8e8a20(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_08249358_c20e_4151_8acd_d2678c42cc36(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ba24f0ae_7b4e_4c68_9766_566d9685a53c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_bd924bfa_b8a3_4625_9e67_78b302420fcc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e3277c14_440c_486b_ac30_da933e706311(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_14ae0519_c689_4a19_bed8_085c2626a1f7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_7b248b4c_1baf_4234_a80e_49ea971d19e7(ArrayList<Float> lst) {
        int sum = 0;
        for(float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_bdf25f16_32cf_40ae_afcb_6137428f22a5(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_4_8b375ef5_b975_4b61_ab94_e973a53f2222(ArrayList<Float> lst) {
        // Your code goes here.
        return -1;
    }

    
    public static int sumSquares_Problem_7_15d6a19d_8535_4c6d_ba44_8a56fca09db1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_10_8a673d94_67d7_4839_bcc7_b5c2427532cf(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3d5199a5_407e_4fbc_84c4_81e1ad630272(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_a7da3e1a_1e77_4543_8182_b47acb762292(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_5_375a1b4b_f230_419d_99ab_6f9457120d8f(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_313d4c20_dcb2_4a34_ae24_c099a442ca03(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_0ba34461_095a_44d3_b14a_29c298b19ed9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_4747f387_ac56_4a71_a9e3_334ce3ad2bce(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_19a8cb03_8627_4ef5_ac10_2b6b586ed338(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_5_23d5a54d_f9af_439e_b566_3fb1ed3ad4a4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_456ad06f_8e2d_4a11_a494_f99c9bd84f7a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0b36564b_fa35_4dc8_bc8a_6e3d96898625(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_aee7cd19_e181_4f9d_80fc_bccb10331f3c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_4ebed367_e025_49a5_9d48_e32adb19c08f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_388c4912_06c6_4c5b_ae66_ba1e0dd5b29d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_4_c439ff04_5b20_4c9f_b0dd_926a30356230(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_63d22b94_7fa7_4113_9ad9_18f4aeb316eb(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_6_479baba7_7d12_4080_aa3e_d2728f75e07d(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_5a043099_8dcf_41e3_9063_44f555aef457(ArrayList<Float> lst) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (Float num : lst) {
            nums.add(Math.ceil(num));
        }
        return nums.stream().mapToInt(num -> num * num).sum();
    }

    
    public static int sumSquares_Problem_5_11b442a9_8e28_4830_aa53_d93a8fa55c5c(ArrayList<Float> lst) {
        throw new RuntimeException("Please implment me.");
    }

    
    public static int sumSquares_Problem_7_22cd20db_41fb_4cf9_84b1_9b8039a9b3d9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_6e0d6c7f_0f61_44dc_b49b_c6517060bc06(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_7a505620_267b_4d8f_9a1b_a50791dba5f2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_d7815b71_d95f_4a44_9ef6_68edb3951df3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_1ee4e86d_8e11_4d5d_acc1_7aef468fd57b(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_f31b24bd_e43a_47a2_b7be_ef10bd076c50(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_4c8101c3_c910_46cd_a1fd_e7fd22321b94(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_c3548cb1_41f7_47ed_97f1_8453cb1bc557(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_4e222e71_8e8d_4570_8bde_aa52186b526f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_ccaa4b31_6fd6_4929_8e4d_00cd92e6d572(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5465e16b_b471_46dc_a07f_88dfebc73e88(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst)
            sum += Math.pow(f, 2);
        return sum;
    }

    
    public static int sumSquares_Problem_8_4252d753_89cd_46c4_bdd3_073e9460da6e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_7d0bc43e_0403_444f_a356_fe611050bb35(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_fabc6c65_891c_4cb5_b190_ff064d59b3a9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(Math.ceil(num), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_2f8de0bc_034a_4363_91eb_831bcd39616b(ArrayList<Float> lst) {
        if (lst.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_5ef01c31_3c01_4d4a_b81c_78b29227e730(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_193669bc_40a0_4332_9ccc_5da219fed95c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_ed4b9496_67ae_4628_a08c_9f7a44c8c8d4(ArrayList<Float> lst) {

        int sum = 0;
        for(Float f : lst) {
            sum += Math.round(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_9e9f536a_ae38_40da_9519_254b7e0d6d93(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_77520194_8647_46e5_9f08_611b23220c40(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_931c4168_1b2e_41cb_b51a_9d6da092a183(ArrayList<Float> lst) {
        ArrayList<Double> doubles = new ArrayList<>();
        for(Float f : lst){
            doubles.add((double)f);
        }
        int sum = 0;
        for(Double d : doubles){
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_42f467bc_60fa_4c8e_83b8_96711e8ecd1d(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_e55e9550_d215_43bd_917e_dcf37ad4ccf5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_4_37ca82c3_fec7_42a7_91a0_e1221e495f6c(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_796dfcbb_4359_4210_9946_838222955d3c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_78205afc_1404_4a3e_bf46_8e7d7a3f19d4(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_238daf65_4ff1_445b_9e8a_e32b9dbbff0d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_cc37c1bd_addf_4860_9cbd_457e594c03cc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_3fb65c0e_99bf_43b5_afb3_603ef669d54b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_fcd38ff8_c925_4c80_b848_2d396bcc8c91(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i : lst) {
            sum +=  Math.ceil(Math.pow(i, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_09e98ba9_9ec0_49bf_8252_75b1388cf359(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_19caa46c_85da_41f2_936c_639dcf27c213(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_0_4373becb_f6a1_4322_9e73_3f66d69c412c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a6f531ef_4aad_458c_a3f6_f573561f971d(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(l -> Math.ceil(l) * Math.ceil(l)).sum();
    }

    
    public static int sumSquares_Problem_9_bdb7c563_3c79_46b0_a755_09d342afaf79(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_1_3bc3482f_59f1_46d8_b877_2ba3c4940341(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.round(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_2b09166b_cdc6_496a_9cfb_c1769ba7e3c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_bdb555ff_6d8c_4f07_a4b1_20b0a974e558(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_10_3774ddb4_4341_4c88_b36a_ebd2e69ddc47(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_7f909d68_c3f7_49b5_927a_2f5e8c1ca8c1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7322751d_bdf6_4b23_97b8_fef41e9724a5(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_7930212a_423b_4359_854f_24c93cd67354(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_d3b427fe_2bf0_4c29_a607_85615220635f(ArrayList<Float> lst) {
        double sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return Math.round(sum * 100) / 100;
    }

    
    public static int sumSquares_Problem_1_2356e3fb_4260_4be0_a956_8efc78ac79df(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_4_22f77089_df04_4167_a2a1_c491c0152c5c(ArrayList<Float> lst) {
        double sum = 0.0;
        for(Float x : lst) {
            sum += Math.pow(x, 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_10_22993b14_c459_45b9_887c_d73143f44c4f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_d9f94727_98f0_47ac_906d_9164da7706c7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_af365e8b_3f90_45c5_a2ef_54d99114082d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_8bf3c353_1392_4d6e_a9b8_87a827620d96(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_968415b7_5a06_4764_980f_937d65fb3cfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_8_d837ed99_4f55_45b2_99c1_2520df8aa215(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_3dd3cb72_4709_4a2e_938a_3b2a219ef4bc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_88bb883b_2e93_4e48_b2b2_1b71186290f6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_83110c24_39ca_491c_bb9d_8e90aa3b2eaf(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_8_f963fd77_e4b1_41cd_ad0d_712db64f2e39(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0b179909_c4d3_406a_a14e_189ef2762174(ArrayList<Float> lst) {
        int sum = 0;
        for (float f: lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_140b3a9e_7b69_48f3_a151_7531d741586d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_5bbaf889_5a6c_41b6_b680_c35e02b8e9a0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_d4791380_db61_4edd_81c5_7b888e47682b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_9a8019c8_e06a_4e7f_b57d_587e654d0cd0(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_9da222ce_222c_4e14_8ecb_d427c8833f13(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_de3616e6_41fa_4f81_a871_0e7b26b95784(ArrayList<Float> lst) {
        return lst.stream().map(i -> Math.ceil(i)).map(i -> i * i).reduce(0, (a,b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_e9ff55ba_8707_4bff_b7bb_3bc10d48e0c1(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_10_71b56a42_48e9_4e73_9fd6_a0c3696590a5(ArrayList<Float> lst) {
        List<Integer> l = lst.stream().map(e -> Math.ceil(e)).map(e -> e * e).collect(Collectors.toList());
        return l.stream().reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_ca9bf35c_b656_405c_8c2f_fa027c654a1c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b6d52cae_5c95_402a_b2e1_59f9eae1eb79(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_210d4172_2ef0_449c_a874_1179286edf97(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_e8f8aa29_8c95_40f3_bb29_2e2c1dfc2c40(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_994adc0b_713d_48d6_af20_3ac3e33d051a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7c055861_4783_490f_bd9f_0e35c79d4aa3(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_a5652fb3_12aa_4835_93ce_2c7d8c69f7bf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_45edec01_735b_494a_8eec_f3e7718883db(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_1_3b800255_af96_4564_9d80_b3107e71b1f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_736b4932_e541_46ef_8ce7_bcd47faadbb3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5770f234_bd61_4f3d_b3d2_d63387e30ef0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_04fc8bbd_49f4_4353_bb18_88436edb54d2(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_8f235683_d711_4217_94ca_04677d519277(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_cbcabd0a_38d2_4c6b_a501_4f87ab57e94f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_0f7f9baf_c4e4_4b50_8b6c_c1c18ba38123(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_3_0ce62bed_6e81_4d4f_867f_5b2984d1ae3b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_2adb2d02_c461_4781_b70e_2840a5bb2305(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_04955124_2381_43d1_ab66_991ca5ea584a(ArrayList<Float> lst) {
        return lst.stream().mapToInt(Math::round).mapToInteger(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_9_6248bba7_2b1b_4851_9663_9d314cf57713(ArrayList<Float> lst) {
      return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_5_3d5199a5_407e_4fbc_84c4_81e1ad630272(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_e74833ea_a00b_4613_bc51_a22e63a06cad(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4c4d97c1_f667_4358_bf27_21e3a706be7c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_f2fa355b_bf83_44c4_af59_3ffb8ecf5735(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_23ef379e_6dd4_4a73_a990_dab0e7d8b868(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_e8f2b197_1b24_45b7_bd0b_131c315511fc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_8e55cfde_b61a_4065_90dd_6a844edd59a8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_434826af_1bff_4a88_9279_d9e79aabb241(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_289c9543_4540_40ea_a57e_4fe83f4694b0(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_ab888389_eb16_414d_9b42_16de5dd70f6d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_46d91777_354d_4925_9c7f_16044d406f1c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_61b568a0_30ec_4ad2_9868_e3397841fa69(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_627fc465_3810_43a9_9d1c_83fafaf88957(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_22cd20db_41fb_4cf9_84b1_9b8039a9b3d9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_f5950505_7ea7_4993_af38_05b7e3882759(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0ef44eeb_b672_4edd_8685_4d772a7f65db(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_45edec01_735b_494a_8eec_f3e7718883db(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_11_5c11890c_c944_4663_9403_55c3cdcd9cfa(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(i * i)).sum();
    }

    
    public static int sumSquares_Problem_2_dd502b38_7c87_4f91_8e69_d715f5b58815(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_800ae58a_56ab_4052_94b1_0242a4dc3deb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_b5cea375_e2b0_4fbe_9019_082aeddf62e9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_8fcdeb0c_483a_42b7_b66a_f34f6b72ab1f(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_c24cb969_f673_48a9_92e6_d4deed9784d7(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_a9d3b9a5_b74c_4682_9e8a_10ffdd50a010(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_3233817b_c68e_4e81_bc9b_fb7475395cd4(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_5171aa41_654d_48fc_b255_2674c2ad4601(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_1_9a701303_e5eb_4c79_8537_60258375fcd8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_bc6fb20a_ef86_47eb_a5e8_4b38569b07c8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_1a6f85d5_4394_4d37_921a_a3ae824ef65a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_f16b7199_5d8f_45e5_abf3_f2c5cf891cf7(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(Math::round).map(i -> i * i).sum();
    }

    
    public static int sumSquares_Problem_6_db6a0daa_be86_4b83_9d26_49da890fb306(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_2616c368_b8c0_4966_a42b_85be1e2e8664(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_e3c88bd4_a9eb_4a23_94c1_4ab0f404cbc7(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_bea0a9ef_27c7_4e36_a9be_2cb11764da4e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_7c3f28e2_4d5a_429c_a6a1_eee7eca6cd0c(ArrayList<Float> lst) {
        // your code here
        Integer sum = 0;
        for (Float n : lst) {
            sum += Math.round(Math.pow(n, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_f43c91ca_9c7f_4c12_b75e_b6efd83f464c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_3662b488_dbc6_46b4_a835_4c1ffd1419f0(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_2b86fce6_6c82_4ed7_b8f1_7aa8525274b6(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_de3616e6_41fa_4f81_a871_0e7b26b95784(ArrayList<Float> lst) {
        return lst.stream().map(i -> Math.ceil(i)).map(i -> i * i).reduce(0, (a,b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_75c7e83e_af8e_4eb1_8c9b_a6ecd7b4e671(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> (x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_800ae58a_56ab_4052_94b1_0242a4dc3deb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_e1d0e63b_e2d4_415a_8745_80f454e519f2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_78b51879_8da3_4cd2_a1c3_f4d4bd3fa700(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_c97d1d99_8cd1_444d_876b_62770ceff179(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_11_fd5cc068_a2bd_4c48_8eaa_a056fdfdf487(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_049e6af0_8bc0_48ef_b860_b3324c964815(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_41b4cdb8_87a6_484d_922c_b0237fec6ef0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_e857b832_4ff2_4332_9762_7276b7888e6c(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_aacd03ba_c9c9_4fab_b50c_00187e00e788(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_627fc465_3810_43a9_9d1c_83fafaf88957(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_5c7cb251_3e95_46fd_a755_38f7a1a00e07(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_c65f8061_231a_4ff5_bae0_facc7dc92dfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_b37ccc99_60d9_4c41_905c_1271e982584e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_dbc7ad0c_41db_4f58_b3af_4b1c93fc1307(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_bd420a65_4f0a_4d26_954e_ebeda39fc3cb(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_c48e8c23_9894_4174_b27a_ca651fab8ee6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_11_8989a331_754c_45ef_b6eb_8cdc5a374f5d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_d7601f63_fdb7_4c95_a1e6_8723a6a5757b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f95db433_5f91_46c9_ac39_7afebe1729cd(ArrayList<Float> lst) {
        // >>> your code goes here <<<
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_1376be4c_8383_4eb6_bc0d_a888e1526bba(ArrayList<Float> lst) {
        // floor = Math.floor
        // ceil = Math.ceil
        // round = Math.round
        return lst.stream().map(e -> Math.ceil(e) * Math.ceil(e)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_9a00c9f8_0023_4ee3_93c3_66bda4b79bfa(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_f3d7612c_5747_455b_8a94_57321b96f71e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_34c69938_4189_42c9_8213_dc3e954804dd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_b5cea375_e2b0_4fbe_9019_082aeddf62e9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_c1639d46_d83e_48ff_9d84_be75ccc15876(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_ac85a777_cd41_4948_ab0d_5a4d5d308d05(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_af228eb4_80ec_4250_a4e9_19dc769702f6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_3_fbdfe155_4600_4de4_88ba_3608e3bf4495(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_375a1b4b_f230_419d_99ab_6f9457120d8f(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_90d4a640_dc5b_4dc1_91a7_a46cc3375730(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0b179909_c4d3_406a_a14e_189ef2762174(ArrayList<Float> lst) {
        int sum = 0;
        for (float f: lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_f30acf5b_ee61_49a8_98d1_a1b5754cc293(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_9_bea96bac_169c_471f_a10b_2777f316014d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_cbca8bea_715b_4ff8_a614_56ab65aefc77(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_ec608f18_b773_49ed_a3a4_bde5490b331d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_2d7ad5b1_79d4_47f2_a048_8fb795568437(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_65257237_690e_4d41_b879_ed57b06653e9(ArrayList<Float> lst) {
        float sum=0;
        for (Float num : lst) {
            sum += num*num;
        }
        return Math.round(Math.ceil(sum));
    }

    
    public static int sumSquares_Problem_6_e8f2b197_1b24_45b7_bd0b_131c315511fc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_9b66536a_cf0f_4290_a1dd_63455e2c6bb6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.ceil(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_22f77089_df04_4167_a2a1_c491c0152c5c(ArrayList<Float> lst) {
        double sum = 0.0;
        for(Float x : lst) {
            sum += Math.pow(x, 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_1_a5b8de86_2146_42df_bdf0_1761ba069939(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_72741282_3ca2_47d1_9dcb_3b170b645051(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_d6534816_d136_473b_9507_c71be6f64d3d(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_5f78964c_4805_418a_aaa4_8bc86c821aa9(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_d43159eb_b64d_46d4_9c24_8d982234cfd9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d05f512c_6357_4ed5_8135_9f85316f388e(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_4_2b09166b_cdc6_496a_9cfb_c1769ba7e3c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_66ad7fe5_b954_4a40_bbaf_be967a113c0d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_5a043099_8dcf_41e3_9063_44f555aef457(ArrayList<Float> lst) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (Float num : lst) {
            nums.add(Math.ceil(num));
        }
        return nums.stream().mapToInt(num -> num * num).sum();
    }

    
    public static int sumSquares_Problem_7_b454c151_b9b7_44f7_bda0_82b3738ad117(ArrayList<Float> lst) {
        // Solution goes here
        return 0;
    }

    
    public static int sumSquares_Problem_5_7fb696fc_a96e_4fce_9ad5_bdbed133436a(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_2a3e6bfe_937d_4e01_96a6_f141649369a9(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_feeb0b8e_9501_4a86_bffc_e8403e1670c9(ArrayList<Float> lst) {
        if (lst.isEmpty()) {
            return 0;
        }
        ArrayList<Float> temp = new ArrayList<>(lst);
        Collections.sort(temp, Comparator.reverseOrder());
        float sum = 0;
        for (Float f : temp) {
            sum += f;
        }
        return Math.round(sum * sum);
    }

    
    public static int sumSquares_Problem_0_82ede255_9013_4a3a_ae2f_e564b9717ced(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_107d986b_6ac6_47ac_a219_13778f8f6607(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_be6e6d96_6f27_4f8f_a749_440710e73103(ArrayList<Float> lst) {
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(Math.round(x), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_967b9836_af67_4f46_addd_4d299715cb5c(ArrayList<Float> lst) {
        // Return the sum of squared numbers in the given array list.
        int sum = 0;
        for (Float n : lst) {
            sum += n * n;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_dec54d69_6785_4e75_bd8d_cd14829d32e7(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_638e7f21_18f2_455a_9f7d_43f05c654428(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_8edb31c7_3290_4f04_b7c3_38c8d74e9a91(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_0689f693_5e79_483e_86d8_3cd52c8e8fa7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.ceil(num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c84d671a_2511_4f6d_b0a0_3c4606b5d2ac(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_0afb7256_fe90_4bbd_992a_94ccdd12751a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_800ae58a_56ab_4052_94b1_0242a4dc3deb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_3cdb8220_acb1_4cc0_abad_ac7d5ecf1c39(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_be1e27d6_778f_475e_af6c_4cf8ff934ebe(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_c7d09d7e_1472_4a6b_a420_06c4895c2a62(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_4373becb_f6a1_4322_9e73_3f66d69c412c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_01bf75fe_7d08_4907_93bf_b6acfb0fe78e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_db6a0daa_be86_4b83_9d26_49da890fb306(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_78b51879_8da3_4cd2_a1c3_f4d4bd3fa700(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_84128fb5_ea71_465c_a83b_d1cd56907d8b(ArrayList<Float> lst) {
        return lst.stream().map(p -> Math.round(p)).map(p -> p * p).mapToInteger(p -> p).sum();
    }

    
    public static int sumSquares_Problem_3_e181332f_f197_4dfb_8f09_5a7cfcedb898(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_8f2b66eb_e8be_415f_9608_6e3ac4cadefe(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_fd2b23e0_ac7e_4be8_960a_4dfd323db1c4(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_49a6961c_df85_48d8_81a4_4257fb9eeb4a(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.pow(Math.ceil(x), 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_22993b14_c459_45b9_887c_d73143f44c4f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_97fff975_2291_4249_abac_136e0517bcd6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_689fdae6_a84a_4622_b327_20cb0e0b10bd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_10_01bf75fe_7d08_4907_93bf_b6acfb0fe78e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_6ab43a36_4f0b_4dd2_88bc_d189c9ce0dda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_bfd89c61_dfa0_4a73_82ca_c4b10db5b0f9(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_b848373e_8110_4308_800d_34b71910783e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_cddcf7d6_0347_417a_a872_a81f8ff12429(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_bd8d3c35_090c_487d_a486_a26f5a7f4ec7(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(n -> Math.round(n) * Math.round(n)).sum();
    }

    
    public static int sumSquares_Problem_1_e5f1f498_fdec_4903_903e_c7f9b079c1a3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_3850446d_aa57_4c5b_87ac_73eb28ace346(ArrayList<Float> lst) {
        // Write your code here
        return lst.stream().map(it -> Math.round(Math.ceil(it))).map(it -> it * it).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_9de632fb_2555_47ea_a970_4f564fe0fd25(ArrayList<Float> lst) {
        final class Java {
            static int sumSquares_Problem_7_9de632fb_2555_47ea_a970_4f564fe0fd25(ArrayList<Float> lst) {
                int acc = 0;
                for (int i = 0; i < lst.size(); i += 1) {
                    acc += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
                }
                return acc;
            }
        }
        return Java.sumSquares_Problem_7_9de632fb_2555_47ea_a970_4f564fe0fd25(lst);
    }

    
    public static int sumSquares_Problem_1_094bdfe2_2ee3_4c31_ae3c_a943623a655d(ArrayList<Float> lst) {

        int sum = 0;
        for(float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_89648a5c_9c6d_40f1_b133_4bcfd3f53cbc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_968415b7_5a06_4764_980f_937d65fb3cfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_3_093c935d_5546_4900_b9d1_cce251056b92(ArrayList<Float> lst) {
        return lst.stream().map(i -> i.intValue()).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_67428946_c1d5_4ab7_9a7b_08e0a8c9a9ab(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_1b67c314_3e50_4709_a5eb_da29a4817c6f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_734ec3a8_eebd_4c88_b45b_722ae2a8f33e(ArrayList<Float> lst) {
        int sum = 0;
        for (float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_e98f2185_9a4e_47dd_a82f_eb6b7a5051cc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_41bb5dcf_e0af_488d_9668_14e72ac1ea17(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_1419826e_9f8a_4b35_8aca_fbc07501fcdb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_4697c6a4_61b7_4fd1_8039_c3aed0f19cb8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_4_e8dd1bb8_48ed_4384_9ff0_9063bb3810a8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7fb696fc_a96e_4fce_9ad5_bdbed133436a(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_22cd20db_41fb_4cf9_84b1_9b8039a9b3d9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_511222fe_c09d_45e1_8cc7_4dc2ff9502ee(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_e4bd1b65_da49_45a4_9a55_85133ef60fb4(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_5f200919_088e_4a94_8305_56b4dbd9c9bf(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(Math.pow(lst.get(i), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_60f2a390_1f12_4092_867e_4356b9e07502(ArrayList<Float> lst) {

        // BEGIN SOLUTION
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
        // END SOLUTION
    }

    
    public static int sumSquares_Problem_4_2e1ed616_b8bc_4e72_9c20_ce1632bbd2c6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_a904ad88_a57c_4cff_9aea_d4c54120fdea(ArrayList<Float> lst) {
        // we sum the squared numbers of each element of the list.
        // we should round it to the upper integer first,
        // we will use the method Math.ceil() to get the next integer
        // from the element.
        // e.g. Math.ceil(1.4) => 2.0
        //      Math.ceil(4.2) => 5.0
        //      Math.ceil(0.0) => 1.0
        //      Math.ceil(-2.4) => -2.0
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_4094dd72_d4ad_4b2b_87ee_4c0b9c87bea9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_b0c5f63b_c097_425e_a07e_d26c4a8e8a20(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_690fc036_18fa_4087_80c0_996a3b1c7ec2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_1f31cd07_8628_4ee8_9022_069c62fcb3bf(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_2_86438689_9bac_4124_a914_2d6ad809278a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_eb86a097_c767_44bf_abd2_88dff209f3e7(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_8bf3c353_1392_4d6e_a9b8_87a827620d96(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_97494216_010e_49a3_93d7_e890e3706e82(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_f14ac33a_d4b2_4028_ae43_1d6c20ec77fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_90d5e2b7_d856_41cd_82f3_d2a5339c9002(ArrayList<Float> lst) {
        int result = 0;
        for(Float f : lst)
            result += Math.pow(Math.ceil(f), 2);
        return result;
    }

    
    public static int sumSquares_Problem_11_d40b1eb1_8565_4f76_b118_af7e6f6d3308(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d7601f63_fdb7_4c95_a1e6_8723a6a5757b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_f1f033c5_643a_4c21_a0bd_40ca2086a4ca(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_2b86fce6_6c82_4ed7_b8f1_7aa8525274b6(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_e11d898a_853f_4111_b1f9_3107660cfb45(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_d038f55f_b89d_4f7e_bd27_853a0f27e35b(ArrayList<Float> lst) {
        int sum = 0;
        for (float i : lst) {
            sum += Math.round(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_50c1ac5f_9a0f_456b_be0f_3a4c3057e69e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_ae3415e3_486f_48b8_959b_2a63b6d5fd5f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_00fbf781_e2cc_4f29_b081_de40ac9beec4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_ca813b8d_8e78_49ba_b110_95bd48ffef38(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_4afbe2d3_4112_43c4_8ba8_aa0850651d34(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_1_04ff5600_1772_47b5_b158_b209743a4134(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_4eecfced_be77_4d71_ac9d_e9a9740cb02d(ArrayList<Float> lst) {
        int total = 0;
        for (int i = 0; i < lst.size(); i++) {
            total += (Math.pow(lst.get(i), 2));
        }
        return total;
    }

    
    public static int sumSquares_Problem_11_19b71e74_61bf_4b9e_b239_ca927e622400(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_c9e2dcc1_c54e_48f0_9ab5_eca33727858e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_f6346cad_c6a3_43f3_95fa_222809ee78ab(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_8_a932f727_f73e_4dca_a545_25fae8674eb3(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(i -> Math.pow(i, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_554a1f13_74b4_41b6_a41f_9523e681ca61(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_0_3662b488_dbc6_46b4_a835_4c1ffd1419f0(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0c5ac88f_8b2c_4340_9c5c_bccd96aa390d(ArrayList<Float> lst) {
        // try {
        //     for (Method method : lst.getClass().getMethods()) {
        //         if (method.getName().equals("map")) {
        //             return lst.stream().map(v -> Math.ceil(v)).map(v -> Math.pow(v, 2)).reduce(0d, (total, value) -> total + value);
        //         }
        //     }
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        return 0;
    }

    
    public static int sumSquares_Problem_0_900cd3b6_b580_49e4_96e5_3f1ce57adfba(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_50d27be6_5c04_4325_adb4_024e76b6485a(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_3a45f97e_9ee4_4637_8bd2_968e07135670(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_648f3429_836d_4b28_89e9_c4300a5f23b0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_b3f3c07b_2b8c_4a13_bd2e_389953697db8(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_8f235683_d711_4217_94ca_04677d519277(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_66ad7fe5_b954_4a40_bbaf_be967a113c0d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_369de820_0c08_41db_8405_92c73be29614(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_091de871_8652_43c2_bc07_615496031545(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x ->  Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_522486cc_dc0c_4b2b_b6ee_547ea3238540(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_0c5ac88f_8b2c_4340_9c5c_bccd96aa390d(ArrayList<Float> lst) {
        // try {
        //     for (Method method : lst.getClass().getMethods()) {
        //         if (method.getName().equals("map")) {
        //             return lst.stream().map(v -> Math.ceil(v)).map(v -> Math.pow(v, 2)).reduce(0d, (total, value) -> total + value);
        //         }
        //     }
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        return 0;
    }

    
    public static int sumSquares_Problem_7_8beb9d77_9488_49c6_b6c1_bc640d9474b6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_4863035f_557d_41ad_87a8_e9135aeb4f43(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_0e01a533_ecbd_49bb_879e_384a2b9de834(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_648f3429_836d_4b28_89e9_c4300a5f23b0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_45edec01_735b_494a_8eec_f3e7718883db(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_3_772e1096_9905_4e6b_b26b_89195c3821d4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_a9bd4f75_9f8d_4d34_9018_5246eb749709(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_f6ecce15_1e90_4040_9f6c_20f0959fccb2(ArrayList<Float> lst) {
        if (lst.size() == 0) {
            return 0;
        }
        return lst.stream().mapToInt(f -> Math.ceil(f)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_c5547146_d289_4ee3_9ade_33cdd41663cc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_028437b8_8b28_4f98_9533_e9f78dc86bf3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_426bea4a_3a34_43ab_a0fe_dfde9dabca5f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_2f1676d2_7ed2_460a_b8e2_696dac88c61a(ArrayList<Float> lst) {

        return lst.stream().mapToInt(x -> Math.ceil(x)).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_9_0a5ea9cc_b49d_4dd9_8485_ef7e51846c54(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_66b1b21a_59ba_4257_ab42_44bff34c401e(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)*Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_8810c4eb_c616_43d5_aeea_a52f7bfc8416(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_49f6d021_bee7_427f_b14f_24bf154b4c1a(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_e5f51118_bf3f_49de_8e7f_66ea7ee9dfc6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_1e754707_88b5_4b80_bdf7_3e8c71436499(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_1832d0de_1df1_4a21_8ddc_c5a466dc843e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c9b1df99_375e_4d0c_81fc_6b461513d0e5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_9907c365_7a78_4be8_814c_c41a4aae2d7d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_f7947c9a_ed62_4c78_9151_8df198451b75(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_ca267990_e56a_432c_8647_30b78940edbe(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_7_a28e45f7_bb72_45b5_a327_709012322d4f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_37b7d014_6239_4d3f_be66_798baf103ef4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_665bbb56_5043_4bad_bd96_91abbd0808d9(ArrayList<Float> lst) {
        if (lst.size() == 0)
            return 0;
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(Math.round(x), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_0135cfba_8740_46a9_abc7_f2a19eae3dc0(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_be4f7e4e_8970_43f6_8018_40b9a950b9ee(ArrayList<Float> lst) {
        // Your code here
        return 0;
    }

    
    public static int sumSquares_Problem_2_7e6081ee_60b9_4af5_a815_f2f71835ccdf(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_1a4a4c74_4ad8_44ab_a651_dfb675494f49(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += (f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_8099b17d_0403_4715_be03_3a7fb733d13e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_3_c8df8e23_25e1_4b44_8a06_64201a07aea0(ArrayList<Float> lst) {
        final int arg = 0;
        final int[] result = { arg };
        lst.stream().map(i -> Math.ceil(i)).forEach(i -> result[0] += i * i);
        return result[0];
    }

    
    public static int sumSquares_Problem_3_7b57791a_c94f_407d_9b03_8c9cc4fe2bcd(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_3_2311c648_8b31_407f_bf94_d3b3358e80c9(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_8_19a8cb03_8627_4ef5_ac10_2b6b586ed338(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_8_a52734b3_e0a7_4219_8ced_8d9bec4c66f0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_d05f512c_6357_4ed5_8135_9f85316f388e(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_475fd106_e421_4186_ba06_a44413b4cf7b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7af8d71d_d549_4859_adf8_78bb25080dd0(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_fce9091f_f6dd_4826_b6ac_a6cc3b05db7d(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_6e632aca_f395_4e25_90db_afa5330e25f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_3199a208_1935_49fc_8696_649b7e7d5399(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_f5216e16_ea76_4e4e_ac57_2624f891fb8f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(x.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_206ace29_2441_454a_a2d2_e5fe6ae29d49(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_39c48936_88bb_4472_bab3_4990b38e4106(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(i -> Math.round(i) * Math.round(i)).sum();
    }

    
    public static int sumSquares_Problem_8_c8c94d00_ffcf_42cb_acd5_e1ff4badd8ec(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_f5950505_7ea7_4993_af38_05b7e3882759(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_65257237_690e_4d41_b879_ed57b06653e9(ArrayList<Float> lst) {
        float sum=0;
        for (Float num : lst) {
            sum += num*num;
        }
        return Math.round(Math.ceil(sum));
    }

    
    public static int sumSquares_Problem_2_3a45f97e_9ee4_4637_8bd2_968e07135670(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_73c2aa02_59ca_49b0_b79e_768f7e4cbcf5(ArrayList<Float> lst) {

        return lst.stream().map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_b7c83c00_3cf7_4e70_9483_08a87969aaae(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_0_fd2b23e0_ac7e_4be8_960a_4dfd323db1c4(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_3232b205_c183_40a1_a98e_0b7dfd560f6f(ArrayList<Float> lst) {
        return lst
                .stream()
                .map(Math::ceil)
                .map(Math::round)
                .mapToInteger(x -> x * x)
                .sum();
    }

    
    public static int sumSquares_Problem_4_3b7caa3e_0727_4cfb_bfb2_9376f24c5112(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_95f83726_a7cd_4647_b028_2f87edfeff58(ArrayList<Float> lst) {
        float sum = 0;
        for (Float num : lst) {
            sum += num * num;
        }
        return Math.round(sum * 100) / 100;
    }

    
    public static int sumSquares_Problem_3_ffe4ba21_bf8c_40c9_8ab7_363233dda048(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_3774ddb4_4341_4c88_b36a_ebd2e69ddc47(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_8d9df6e2_c26a_4fc3_92f0_5bbdaf182b81(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x ->  Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_2_77a642e8_d4ce_4ca0_8cb9_78a6bdf9f9c8(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_83fbaf38_0945_4dc4_823f_f30887137ed2(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_ba8c90c7_38ab_4cf5_9682_54b652a77781(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_65845ca4_6afd_4ab2_b66d_e7924d41947f(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_b3f3c07b_2b8c_4a13_bd2e_389953697db8(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_e5f1f498_fdec_4903_903e_c7f9b079c1a3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_5962fecb_fa9d_4f41_bec5_6edb96ced958(ArrayList<Float> lst) {
        int result = 0;
        for(Float f : lst) {
            result += Math.round(f*f);
        }
        return result;
    }

    
    public static int sumSquares_Problem_1_5962fecb_fa9d_4f41_bec5_6edb96ced958(ArrayList<Float> lst) {
        int result = 0;
        for(Float f : lst) {
            result += Math.round(f*f);
        }
        return result;
    }

    
    public static int sumSquares_Problem_9_84128fb5_ea71_465c_a83b_d1cd56907d8b(ArrayList<Float> lst) {
        return lst.stream().map(p -> Math.round(p)).map(p -> p * p).mapToInteger(p -> p).sum();
    }

    
    public static int sumSquares_Problem_1_c7d09d7e_1472_4a6b_a420_06c4895c2a62(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_16f09714_ed92_4e22_8360_2596585cc7b8(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_1_a05cebdd_91d0_4d61_b284_f2fd0b013400(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_14733a6a_0679_4749_976f_8dcc83139ce6(ArrayList<Float> lst) {
        int sum = 0;
        for (float x : lst) {
            sum += x *  x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_442fdb55_e230_49da_b1c6_314f63025217(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_6a7d9822_7201_456f_a5bc_28f44190b1ce(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_8a26d352_5fbb_411d_9982_3c47a7078f01(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_4eecfced_be77_4d71_ac9d_e9a9740cb02d(ArrayList<Float> lst) {
        int total = 0;
        for (int i = 0; i < lst.size(); i++) {
            total += (Math.pow(lst.get(i), 2));
        }
        return total;
    }

    
    public static int sumSquares_Problem_1_b8da4456_e487_435e_b85e_9e78b4901b56(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst)
            sum += Math.pow(Math.ceil(Math.ceil(f)), 2);
        return sum;
    }

    
    public static int sumSquares_Problem_11_b62b143f_b85b_4b28_86b4_709b2d6a4c38(ArrayList<Float> lst) {
        int result = 0L;
        for (Float f : lst) {
            result = Math.round((f * f) + 0.5);
        }
        return result;
    }

    
    public static int sumSquares_Problem_9_9cb4907c_c28b_441a_8673_01f0e34c26c0(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_f5216e16_ea76_4e4e_ac57_2624f891fb8f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(x.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_9222f9b6_cbe2_407a_a045_e6e367e7fabb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_33dcd357_ae53_49ac_aa23_6366e84336f4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_2e5b9f46_1ce0_4c5e_b28b_df6a9512e414(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_ec608f18_b773_49ed_a3a4_bde5490b331d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_2c1b2f37_53a0_409d_8a83_dbc7e2d0cbb7(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_90921950_46a8_4e08_80d1_421dd0d19259(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x) * Math.ceil(x)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_a58ad4fc_f71c_4841_bffc_334240d176de(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_52177b52_eae3_4c23_ad9b_8a53a1936a05(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_d6de7b01_a2cf_4f8a_a4b0_890e80f56151(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_3f3f79fc_caa6_4da5_83ce_f3afd6b5b719(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_fe5330d4_00d2_4150_8c4b_f0414c92a74d(ArrayList<Float> lst) {
        float sum=0;
        for (Float x:lst){
            sum += x*x;
        }
        return  Math.ceil(sum);
    }

    
    public static int sumSquares_Problem_1_c58fa97d_6f3f_43b7_b0c8_efc6949e442b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_28d6db2d_239b_496a_be5b_35a9b8977447(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_be4f7e4e_8970_43f6_8018_40b9a950b9ee(ArrayList<Float> lst) {
        // Your code here
        return 0;
    }

    
    public static int sumSquares_Problem_11_778e1f84_768c_4e70_9245_21589037f7bd(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_9c93fb7a_fafb_4cbd_af10_a0fa7c49b922(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(Math.pow(lst.get(i), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_3714ee52_a238_4df5_9d77_fbaad1b663c1(ArrayList<Float> lst) {
        int sum = 0;
        for(Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_12ac4f24_a7e9_43d3_93ee_8788e394dbe4(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_00fbf781_e2cc_4f29_b081_de40ac9beec4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_b5cb8a4f_f2f6_4dcd_bdd1_e17da9674933(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3591c461_4b27_4b2d_b3cd_44c9962d44cd(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_3232b205_c183_40a1_a98e_0b7dfd560f6f(ArrayList<Float> lst) {
        return lst
                .stream()
                .map(Math::ceil)
                .map(Math::round)
                .mapToInteger(x -> x * x)
                .sum();
    }

    
    public static int sumSquares_Problem_10_c50886b9_6586_4cfd_8c89_a9e395231b1d(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_c42f2a40_06e1_47b9_8baa_6d064d0d5b8d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_028437b8_8b28_4f98_9533_e9f78dc86bf3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_01bf75fe_7d08_4907_93bf_b6acfb0fe78e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_467009e4_db85_47e0_9112_1d1f06106ecd(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_7_c6bde5de_d065_4ddd_8a65_946b8a2654fc(ArrayList<Float> lst) {
        // Your code goes here!
        //return null;
        int ret = 0;
        for (int i = 0; i < lst.size(); i++) {
            ret += Math.round(Math.pow(lst.get(i), 2));
        }
        return ret;
    }

    
    public static int sumSquares_Problem_11_4a461b89_9f0d_4323_b3ef_a0de61be21eb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_b9515992_d519_42ef_a2a5_0ab0bfd6c4d0(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_2_c89db24c_c046_4aa1_9e71_2ca1d6478292(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_d992f61b_24f8_45ac_9885_56e392fcba39(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0L, (x, y) -> x+y);
    }

    
    public static int sumSquares_Problem_0_a3e45ee4_9914_4cfa_99d1_72f0c455f8af(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_00fbf781_e2cc_4f29_b081_de40ac9beec4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_1_941bebd7_5d0d_426d_ba8d_aff5ee783e7c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_93a9c4c7_770b_4278_abda_6a8e1f880177(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_23689f68_738c_46af_b3e6_14847120dcfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_0f113aea_5c68_45ab_b7c0_ec63c42540a8(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_14445f9f_33b7_4348_a985_41bf33e06360(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_4_44ab7349_f135_4a5b_810d_dcc80d4e1dca(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_ec38e4e2_9a83_4dfc_ba41_e63212f48f41(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_08249358_c20e_4151_8acd_d2678c42cc36(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3a80530f_03a0_45cb_8a2e_3c0de997f2ff(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_1_77520194_8647_46e5_9f08_611b23220c40(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_51d026c5_405d_41c5_bf28_c145eb23a3e5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_2e6440e0_7bb3_4e2f_9df3_a071b6f0d05a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_734ec3a8_eebd_4c88_b45b_722ae2a8f33e(ArrayList<Float> lst) {
        int sum = 0;
        for (float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_8b088253_78b7_4957_8e24_cdef6ff156ba(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b7906759_790d_4389_a55e_3bdc8a359dbc(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_b32b06d5_85cd_4d33_adfe_d8eb78725dda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f8327579_bc53_4315_9f98_2ee353497567(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_8099b17d_0403_4715_be03_3a7fb733d13e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_dad4638a_6275_4cd7_9ee0_335cccef0342(ArrayList<Float> lst) {
        // Implement the method
        int res = 0;
        for (Float fl : lst) {
            res += Math.ceil(fl) * Math.ceil(fl);
        }
        return res;
    }

    
    public static int sumSquares_Problem_1_53e477b4_d01d_4efd_bebb_7b6e7f9e534f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_9_550bde54_04d6_47ca_bf4e_77e425657277(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2484682b_f8d5_4067_aa2e_0ab349da92d2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_fb26e9c3_6e9f_418d_8d4f_552548d165cd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(Math::round).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_7_74ed66c3_d0b3_4e9e_80ae_f15193c7ac5c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_a52734b3_e0a7_4219_8ced_8d9bec4c66f0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_369de820_0c08_41db_8405_92c73be29614(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_01bf75fe_7d08_4907_93bf_b6acfb0fe78e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_e6cf2f7b_b605_4288_9fd6_962384295a2c(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_4c8101c3_c910_46cd_a1fd_e7fd22321b94(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_46561f50_b3b7_4c9c_b731_2225063ec4e4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_b37ccc99_60d9_4c41_905c_1271e982584e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_ca267990_e56a_432c_8647_30b78940edbe(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_11_a2baa41d_3b48_4efd_885f_1f5ca6343991(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_fbdfe155_4600_4de4_88ba_3608e3bf4495(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7e6081ee_60b9_4af5_a815_f2f71835ccdf(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_e20affb3_5b5f_4ee7_a3b1_fe7dcc63a806(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_f8b65a65_ea9a_45f5_a9cc_e1b4a10363ac(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_6e200417_36e7_4f7f_8bd5_2c26f6fc4fba(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_46cd7fa3_82d8_470a_afe8_73e52ffb03ca(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.round(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_107d986b_6ac6_47ac_a219_13778f8f6607(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_12106047_99f0_458e_8274_8d3c12e256a1(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_449e9b26_8f52_4b29_b796_8819d9ad02c6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e257fcb6_f022_4385_863c_563d1fe1e1ff(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_bef273fa_41d1_4c8b_ae74_cbc768698a8e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0e01a533_ecbd_49bb_879e_384a2b9de834(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_b24d4e41_1f86_42c2_9c35_b6e634bd34c8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_e007e308_1699_4d43_b5b4_60dda80ac0bf(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_d92fba05_c85b_46ec_a2ef_c0e9cbf94a81(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_ee44a682_9805_4fae_8404_a2134149a12f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_2e6440e0_7bb3_4e2f_9df3_a071b6f0d05a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_27efaf57_143a_43c0_847e_d48888c26b6d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_a5bc2f09_4201_4f45_9544_41845f903cde(ArrayList<Float> lst) {
        int sum = 0L;
        for (float x : lst) {
            sum += Math.round(x * x) + x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d2ecf99b_43cb_48ee_ae2a_cbc8e4e5e88a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += (Math.ceil(f * f));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_98b312af_5bf8_4854_8a74_4f949cdd35cc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float n : lst) {
            sum += Math.pow(n , 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_0_20882c2e_0545_41a5_b240_e3c07eac6afb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_4a461b89_9f0d_4323_b3ef_a0de61be21eb(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_b01490b7_2504_4fc0_9939_4d8f8a2dd33d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_967b9836_af67_4f46_addd_4d299715cb5c(ArrayList<Float> lst) {
        // Return the sum of squared numbers in the given array list.
        int sum = 0;
        for (Float n : lst) {
            sum += n * n;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_911b295a_9ebc_4866_8e36_de3142d1ba47(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_1a656600_55ea_41ed_9f21_acbe286a7393(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_91993075_453f_4463_b0fc_8180a652beb4(ArrayList<Float> lst) {
        int total = 0;
        for(Float f : lst) {
            total = total+Math.round(f*f);
        }
        return total;
    }

    
    public static int sumSquares_Problem_1_3545695b_f69e_4ea7_8aca_3055bfe697d3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_9_9269ab62_7f82_4792_89c2_2778734c895f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_5f200919_088e_4a94_8305_56b4dbd9c9bf(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(Math.pow(lst.get(i), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_f95db433_5f91_46c9_ac39_7afebe1729cd(ArrayList<Float> lst) {
        // >>> your code goes here <<<
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_2c13ef0a_061d_47d5_8e1c_cf29dd1313f0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_3232b205_c183_40a1_a98e_0b7dfd560f6f(ArrayList<Float> lst) {
        return lst
                .stream()
                .map(Math::ceil)
                .map(Math::round)
                .mapToInteger(x -> x * x)
                .sum();
    }

    
    public static int sumSquares_Problem_8_edf0bc38_59ea_43c0_8e92_0fdbc4b71769(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_8989a331_754c_45ef_b6eb_8cdc5a374f5d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_a3e45ee4_9914_4cfa_99d1_72f0c455f8af(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_5da1180c_aeb9_4a36_bae2_6c4f3a4f54ef(ArrayList<Float> lst) {
        // Write your code here
        return 0;

    }

    
    public static int sumSquares_Problem_0_0ce62bed_6e81_4d4f_867f_5b2984d1ae3b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_8a9ab386_eb13_4105_9b87_8864201601fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_ffb18e80_f5d6_4f22_8a1c_fc8c3dacbe01(ArrayList<Float> lst) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        int sum = 0;
        for (Float i : lst) {
            ints.add(java.lang.Math.round(i));
        }
        for (Integer i : ints) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0e2611d7_f4e5_43a2_b251_4e8b41b3953b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_c24cb969_f673_48a9_92e6_d4deed9784d7(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_23b7de18_604d_4e7d_b06d_be61aa02ee7b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float elem : lst) {
            sum += (Math.pow(Math.ceil(elem), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_ba27b61f_6c2a_42c7_a4b5_e5b3a2513eb7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2bf082b4_0952_4fa4_aa5a_8d1c7b197832(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_5fe34de7_11c0_45d1_a489_b758a74fdc4d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_654683ac_5905_481d_9263_54e8d80dcab5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_ffdbd2d7_93c5_4018_b5db_f237d63ba8c6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_8f235683_d711_4217_94ca_04677d519277(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_9a00c9f8_0023_4ee3_93c3_66bda4b79bfa(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_5ea2da52_e7be_4f59_b0b2_1e0120fa36a1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_a5d9961f_80eb_4441_8242_fc96887043f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_3cc04196_feed_4448_a874_ee2633d480c7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_a695d97e_54b0_48a3_bc4b_ef04ab11dab3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_3f897594_3486_40dd_8a25_405b7fe79487(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_638e7f21_18f2_455a_9f7d_43f05c654428(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_95336615_b5e7_439c_8937_6b26f60d672d(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_3_1b989654_587b_4b88_9974_54e752dc75f7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_3a45f97e_9ee4_4637_8bd2_968e07135670(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_ad9dda20_209d_455b_8e6f_256e236fae80(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_c8939b10_d327_4bc0_8550_975802aacb81(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_140b3a9e_7b69_48f3_a151_7531d741586d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_c039eb02_87ab_4fd0_a5ee_0fe1afea298c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_e3d8f652_f042_40eb_a6d6_f9a909e7c003(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b19c9c45_de06_46c6_9e1d_36f5ca97a5c7(ArrayList<Float> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            result += lst.get(i);
        }
        return result;
    }

    
    public static int sumSquares_Problem_1_e47f9cdc_ec9b_46a2_bbef_fd7d00027278(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_bd420a65_4f0a_4d26_954e_ebeda39fc3cb(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_1bf1d799_1033_41ba_a619_f575a6568984(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_48bd1975_61a6_430c_ae91_def6b146b9f3(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_2_71155b90_018a_4f88_82eb_461373bf1c84(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.ceil(x)).reduce(0, (x,y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_32311724_8c45_4f3a_9949_f8f35933bd74(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_75c7b4d4_726b_449c_91ca_7cfba4ea6bb6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_989f11ad_1094_4f75_bcae_a1f841f83bec(ArrayList<Float> lst) {
        return lst.stream().map(x -> x.intValue()).map(x -> x * x).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_10_38717cc2_5d98_46e9_bb27_d406d8191756(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i : lst) {
            sum += Math.ceil(i);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_11_5af24a4e_0f56_4e82_848c_7436e0804743(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_3f3f79fc_caa6_4da5_83ce_f3afd6b5b719(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_3850446d_aa57_4c5b_87ac_73eb28ace346(ArrayList<Float> lst) {
        // Write your code here
        return lst.stream().map(it -> Math.round(Math.ceil(it))).map(it -> it * it).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_3146ffc4_6857_4ea2_a782_3b61c30ea665(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_6f55f685_6256_46e8_acaa_4946b50cc89d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_09bf93f3_b283_4ffd_8ed9_c4866ba9d6d1(ArrayList<Float> lst) {
        int sum = 0;
        for (int i=0; i<lst.size(); i++){
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e1d13440_b71f_48b1_9ec6_82fa9104d093(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6b79c54d_f570_4b25_9210_f37bd883efa9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_85d563c4_0fe7_4843_afd3_fe1e15f1302d(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_537409fd_1619_4d20_b8c5_60478171b6d8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_11_037191ec_c9b4_4b6f_b411_8ec435b0f723(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_b249111b_6ca7_440b_a74c_125f490ce834(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.round(f) * Math.round(f)).sum();
    }

    
    public static int sumSquares_Problem_2_d3b427fe_2bf0_4c29_a607_85615220635f(ArrayList<Float> lst) {
        double sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return Math.round(sum * 100) / 100;
    }

    
    public static int sumSquares_Problem_11_d5bae281_a683_496e_8ca2_5eb4f5b1aedd(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_0a02dd28_8ef1_42ce_9de4_79dfa4e73ae2(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_554a1f13_74b4_41b6_a41f_9523e681ca61(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_8_b4fb5188_bb09_4b23_8037_704b17e405b4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f30acf5b_ee61_49a8_98d1_a1b5754cc293(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_0_a9d561fb_e414_4e0f_aca6_93fd646206d5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_0e73aa05_611b_4d9f_8a14_6f338eacb4ea(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0eefc1e8_2997_47e4_8e33_b09312bf815b(ArrayList<Float> lst) {
        int sum = 0;
        for(float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_d3c8e0ee_ac51_436b_839b_de1cfeab1338(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_53c5c9ec_92a0_437f_987a_3ebb8bf4d9f6(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cbcabd0a_38d2_4c6b_a501_4f87ab57e94f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_da1cf573_c0b7_4700_b078_f8e30cd5570d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_17ce9e02_c252_49cb_a783_21a1380e3e0c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3513e86f_5541_44c4_b10f_d580bf3ea48a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_aee7cd19_e181_4f9d_80fc_bccb10331f3c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_11_ac3e1d24_3f71_4e5a_abcf_0e9c3fabb5ac(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_3774ddb4_4341_4c88_b36a_ebd2e69ddc47(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_0a180038_3115_40a3_9b1a_4908137abd8d(ArrayList<Float> lst) {
        return lst.stream().map(a ->  Math.ceil(a)).map(a -> a * a).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_5_8042f086_4379_4c41_bc0a_9294a670d082(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_fe1f8fad_5036_46b9_8175_101bf28ec798(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5465e16b_b471_46dc_a07f_88dfebc73e88(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst)
            sum += Math.pow(f, 2);
        return sum;
    }

    
    public static int sumSquares_Problem_0_3cda9a35_a507_4605_b4fe_1b75c461cfb2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_9_a42462f0_4fb5_4892_a688_1261931fcfdb(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_9_5b75f817_c243_4f25_a34d_a914ee12dd6f(ArrayList<Float> lst) {
        return IntStream.range(0, lst.size()).mapToInteger(i -> Math.round(Math.pow(Math.ceil(lst.get(i)), 2))).sum();
    }

    
    public static int sumSquares_Problem_1_7a4957e9_57f3_4090_a33b_173db65e3232(ArrayList<Float> lst) {
        int r = 0;
        for (Float f : lst) {
            r += Math.round(f) * Math.round(f);
        }
        return r;
    }

    
    public static int sumSquares_Problem_6_4eeaa165_d915_4fc1_a93c_7314327e764e(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i) * lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_380a2c94_10e6_494c_8edd_d4878c049845(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_81e77449_32e1_4fe5_a5a7_19cdab94f885(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_66075ceb_7ffc_449b_82f3_d4c26dee781e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5f8c6091_635a_41a0_a440_f9d5f4a84658(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3146ffc4_6857_4ea2_a782_3b61c30ea665(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_d5108185_dc82_4883_ad00_ea173d5ff345(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_9fa48fa5_2990_4ae9_b3b9_5986718f971e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_00c7aeac_141a_4946_88d8_94de198dc2a6(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_4e69006c_f278_4340_8a06_eddd41cb050b(ArrayList<Float> lst) {
        int sum = 0;
        for(Float fl : lst) {
            sum += Math.pow(Math.ceil(fl), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_1b50885b_4a9a_4faf_9395_b48b3401e13c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_6afef3b2_1c98_4d4b_953b_6908d3eda314(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum +=  Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_9b619026_7132_4f37_9453_e2260b790b70(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_71f87c71_40e2_4eda_86be_e6e16db3dc22(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_d8b893d4_109a_42b5_933e_e8d7ea0da5e0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_c40ccdd7_17c2_45f1_8847_7eccc02ebf44(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_ae05289c_f2cb_4314_a896_c72430d30bfe(ArrayList<Float> lst) {
        // Your code here
        return  lst.stream().mapToDouble(Double::valueOf).map(x -> Math.ceil(x)).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_0_7930212a_423b_4359_854f_24c93cd67354(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_19a8cb03_8627_4ef5_ac10_2b6b586ed338(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_4_b19c9c45_de06_46c6_9e1d_36f5ca97a5c7(ArrayList<Float> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            result += lst.get(i);
        }
        return result;
    }

    
    public static int sumSquares_Problem_7_f80c15a9_8bf1_4ea7_81da_ece3ecc6216b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_86e2c31c_dfc9_41e4_aa6c_88c1e6b6190a(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_0a8a9676_d13e_4744_a341_485855c0da42(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_68838a62_a2ce_45b4_83c6_cad8f02d4943(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_2_2c947223_40c9_4a6e_a07e_d6203dcd5d67(ArrayList<Float> lst) {
        return Math.round(lst.stream().map(v -> Math.ceil(v)).map(v -> Math.pow(v, 2)).reduce((a, b) -> a + b).get());
    }

    
    public static int sumSquares_Problem_8_03a1faec_8fc5_48fd_8b29_7932a2cbc41d(ArrayList<Float> lst) {
        int total=0;
        for(Float f: lst)
            total+=Math.round(f)*Math.round(f);
        return total;
    }

    
    public static int sumSquares_Problem_9_3c19aa28_7c33_4a2e_bc18_1d55af3f624f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_9_32ea9982_292e_415a_b3bb_c792f0758ac9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_49c8ec7a_8719_45fb_94dd_3fbdbe427b1f(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_a5ed47a3_a4fb_4d2b_a2d9_c572c626d42b(ArrayList<Float> lst) {
        // >>> YOUR CODE HERE <<<
        return 0;
    }

    
    public static int sumSquares_Problem_0_279ddfca_a797_42f9_922b_7a4ec1f48604(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i: lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b6d52cae_5c95_402a_b2e1_59f9eae1eb79(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_c985e223_337f_4ff3_b000_1e22d2c9430d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_b0c5f63b_c097_425e_a07e_d26c4a8e8a20(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0b473ed0_f3c8_40c8_ac2b_e368d9c094ca(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_0f6ee562_9691_4ff2_8f3c_4d5990006a61(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_f4754a83_ee5d_40c2_a17e_3564f098324d(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_d3f29676_2535_4e4f_bb2a_9d0cd06357ae(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_b2cd20c1_225e_4a66_bf07_41c67da3e0d0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_7dae3e9d_9e3c_4df1_8593_129b29e76916(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_0_0575adae_6f5f_4317_8a61_bfe8a5dbc5d7(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToDouble(Float::doubleValue).map(x -> x*x).sum();
    }

    
    public static int sumSquares_Problem_1_7325a1e8_6e52_4182_adc7_72eba35c334d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_0a7f9b4c_d364_4ccf_ae6d_113a8f664bb4(ArrayList<Float> lst) {
        int cnt=0;
        for(Float f : lst) {
            cnt+=Math.ceil(Math.pow(Math.abs(f), 2));
        }
        return cnt;
    }

    
    public static int sumSquares_Problem_10_bc1bebd1_12a6_4eb0_b209_8641469ab83c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_9_c8df8e23_25e1_4b44_8a06_64201a07aea0(ArrayList<Float> lst) {
        final int arg = 0;
        final int[] result = { arg };
        lst.stream().map(i -> Math.ceil(i)).forEach(i -> result[0] += i * i);
        return result[0];
    }

    
    public static int sumSquares_Problem_1_09bf93f3_b283_4ffd_8ed9_c4866ba9d6d1(ArrayList<Float> lst) {
        int sum = 0;
        for (int i=0; i<lst.size(); i++){
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_04ff5600_1772_47b5_b158_b209743a4134(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_27efaf57_143a_43c0_847e_d48888c26b6d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_dd10d9c4_d7ee_4ea1_b3bf_9d552043fd9f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f4a6f39f_e183_4830_b447_d23d5aeca94a(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.ceil(f) * Math.ceil(f)).sum();
    }

    
    public static int sumSquares_Problem_0_a932f727_f73e_4dca_a545_25fae8674eb3(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(i -> Math.pow(i, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_c5041cec_bc4b_4563_8ccc_6184e5d98e81(ArrayList<Float> lst) {
        // YOUR CODE HERE
        int res = 0;
        for (float f : lst) {
            int x = Math.ceil(f);
            res += x * x;
        }
        return res;
    }

    
    public static int sumSquares_Problem_2_e4bd1b65_da49_45a4_9a55_85133ef60fb4(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ed6d2525_3a7b_465c_b448_6b3814b17c6e(ArrayList<Float> lst) {
        return Math.round(lst.stream().map(f -> f*f).reduce((a, b) -> a + b).get());
    }

    
    public static int sumSquares_Problem_6_831ab11f_06d5_446f_82f4_9c148d8aef60(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_c8939b10_d327_4bc0_8550_975802aacb81(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_78bae5a2_6e79_4c3a_aec3_03291e57c27b(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_70f8e979_e47a_4d65_a1ee_efac4f2cd2f5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_8_5ea2da52_e7be_4f59_b0b2_1e0120fa36a1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_d99c21c9_043b_41ab_b1ec_efb322abf14c(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_a39f32c0_742c_4fd3_be29_c3fbdf358f93(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7322751d_bdf6_4b23_97b8_fef41e9724a5(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_ca267990_e56a_432c_8647_30b78940edbe(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_410cfa93_c323_4ac7_bb4a_7861972f5a54(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_46cd7fa3_82d8_470a_afe8_73e52ffb03ca(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.round(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_554a1f13_74b4_41b6_a41f_9523e681ca61(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_c1b3166e_d460_467a_8fa6_7b269bde8c11(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_6b848ea1_07fc_4181_95e1_463534cf9ed9(ArrayList<Float> lst) {
        // Solution here
        return 0;
    }

    
    public static int sumSquares_Problem_1_e9d7b04a_6fc7_488e_9f6d_a51123a20001(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.round(e)*Math.round(e)).sum();
    }

    
    public static int sumSquares_Problem_0_a753d5f4_4af2_4c23_aeac_5e1314d7979f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_f4754a83_ee5d_40c2_a17e_3564f098324d(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_492f2528_190f_4d0d_863d_7a9988c9d660(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_67420f5e_052d_4f4c_9fa3_2943a9d67725(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_ecfa1f32_3ed4_406c_b18f_359eaa260c85(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_33e09151_0bba_4e81_853f_613460f785b4(ArrayList<Float> lst) {
        return lst.stream().mapToInt(i -> Math.ceil(i)).mapToInteger(i -> i * i).sum();
    }

    
    public static int sumSquares_Problem_1_d77f5836_1148_403b_b026_d73ff6efdaf7(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_4a23014a_1890_4d92_b529_1a56e3c87706(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_0a5ea9cc_b49d_4dd9_8485_ef7e51846c54(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_16cfbd6f_554a_4b08_a144_5e80f098da4e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_4_93a2308e_d4bb_44a7_ad37_388c472e0ff5(ArrayList<Float> lst) {
        // Your code here
        return lst.stream().map(v ->  Math.ceil(v))
                            .map(v -> v * v)
                            .reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_1a9a8fa7_f98a_42ed_8c54_371b5ffae5c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float elem : lst) {
            sum += Math.pow(elem, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_4eeaa165_d915_4fc1_a93c_7314327e764e(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i) * lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_d2430361_299f_48dd_b87a_28f7f3b76b97(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0bc73f44_d96e_4d70_97b1_098036b2d7c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ae98989f_663a_4d63_85c2_1741361e2dc7(ArrayList<Float> lst) {
        return lst.stream().map(e -> Math.ceil(e)).map(e -> e * e).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_1e754707_88b5_4b80_bdf7_3e8c71436499(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_ed048a28_631f_49fd_a7be_87b7d2af703c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_b62b143f_b85b_4b28_86b4_709b2d6a4c38(ArrayList<Float> lst) {
        int result = 0L;
        for (Float f : lst) {
            result = Math.round((f * f) + 0.5);
        }
        return result;
    }

    
    public static int sumSquares_Problem_4_fbdfe155_4600_4de4_88ba_3608e3bf4495(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_fb85b134_b9e6_43a2_97f0_d35326906c74(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_82ede255_9013_4a3a_ae2f_e564b9717ced(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_665bbb56_5043_4bad_bd96_91abbd0808d9(ArrayList<Float> lst) {
        if (lst.size() == 0)
            return 0;
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(Math.round(x), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_d1935c03_7422_4e21_ba94_ce516831c031(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> x * x).map(x -> Math.round(x)).map(x -> x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_3fb65c0e_99bf_43b5_afb3_603ef669d54b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b2845bf7_abc0_4c6c_81a8_0163741bc3a1(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_3545695b_f69e_4ea7_8aca_3055bfe697d3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_0_9809f986_54a2_45fb_9b9a_467fc20ee625(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_994adc0b_713d_48d6_af20_3ac3e33d051a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_36f6756e_ec91_49f3_8e8f_a59e6b7aed33(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            double x = lst.get(i);
            double round = Math.ceil(x);
            sum+=round*round;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9462d529_2356_4f76_b43d_c8575bbf662c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_c1b3166e_d460_467a_8fa6_7b269bde8c11(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_6_90d4a640_dc5b_4dc1_91a7_a46cc3375730(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_062c97ef_2e43_44b2_9bea_7fbb0cdec284(ArrayList<Float> lst) {
        ArrayList<Integer> lst2 = new ArrayList<>();
        for (Float f : lst) {
            int res =  Math.ceil(f * f);
            lst2.add(res);
        }
        int sum = 0;
        for (int i : lst2) {
            sum += i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_bdf698bf_d7ad_44e7_8b49_cada816a36e9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_6ab43a36_4f0b_4dd2_88bc_d189c9ce0dda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2fee37fb_3439_4d60_aa1c_5e911402b7e4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_44929144_ff0e_4d57_a42a_acd6558fedf1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_d9f94727_98f0_47ac_906d_9164da7706c7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_dd49c57f_633a_43eb_8582_ea1a8c33f460(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2b976199_1daf_4769_b5d6_ea90aa47048c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_e9ed8cb9_a45c_4415_b7a9_5e7495e67b2c(ArrayList<Float> lst) {
        // write code here
        return 0;
    }

    
    public static int sumSquares_Problem_5_d4791380_db61_4edd_81c5_7b888e47682b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_522486cc_dc0c_4b2b_b6ee_547ea3238540(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_c24cb969_f673_48a9_92e6_d4deed9784d7(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_45eadd00_b6e8_4f1f_881b_6a6a805d7e8b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_ed6d2525_3a7b_465c_b448_6b3814b17c6e(ArrayList<Float> lst) {
        return Math.round(lst.stream().map(f -> f*f).reduce((a, b) -> a + b).get());
    }

    
    public static int sumSquares_Problem_8_0689f693_5e79_483e_86d8_3cd52c8e8fa7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.ceil(num * num);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_df23103a_721f_41ab_bf38_eb671947983a(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_77022cf3_f4e2_465b_b001_6eafcd141e35(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_20bbab8c_e75b_456c_b0e0_a0d81bdf8c05(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2bb3ccfd_0256_45b6_afed_c71429d58bbd(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_be80bef7_71f9_4b56_ac70_10501e0b4ad8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_51d026c5_405d_41c5_bf28_c145eb23a3e5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_504e3bf1_a35e_4790_8825_227741a70c86(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_0ba34461_095a_44d3_b14a_29c298b19ed9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_4ae5a536_fe62_4482_8ccb_7814a5bc8d66(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_97fa4151_3b4e_453e_890b_bc83c9a243aa(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_8d881343_4b83_49e5_8eb7_c9d8c72c8f37(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_15d6a19d_8535_4c6d_ba44_8a56fca09db1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_9_93a9c4c7_770b_4278_abda_6a8e1f880177(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_56b55e9b_d083_4c00_bb63_183cf363eb78(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_37ca82c3_fec7_42a7_91a0_e1221e495f6c(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_10_7270f350_bed1_44a4_b2cb_4f25eb536906(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_034040e8_a4ce_4c75_bc33_30e97a500605(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_248d97df_d4cc_411b_b023_1ef3f755f2cf(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_1a08ef0a_911b_4dce_b63d_9d82f0866d20(ArrayList<Float> lst) {

        int sum = 0;
        for(Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_87242912_2928_492d_b9a6_1332e3838d6c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_6a8150ac_8c9e_44a4_bdf5_3d558dc6867e(ArrayList<Float> lst) {
        // input:  array list of numbers
        // output: sum of squared numbers in the given array list,
        // round each element in the array list to the upper int(Ceiling) first.
        int r = 0;
        for (int i = 0; i < lst.size(); i++) {
            r += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return r;
    }

    
    public static int sumSquares_Problem_10_223d01c5_d296_487c_ac73_9bf3049d778b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_9c0f60f0_2cc4_42f0_864c_1f1758376d33(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_a7bb1827_0cd0_4856_8285_05319deb6fe1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_f43c91ca_9c7f_4c12_b75e_b6efd83f464c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_6c1f33e9_cef8_43c9_b5bc_aafd5f27b68e(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_3b319c74_9e21_4ed4_8f9b_4824e2f546ec(ArrayList<Float> lst) {

        int sum = 0;
        for(Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_5599393e_a748_4f1a_acbf_aace29462f19(ArrayList<Float> lst) {

        return lst.stream().map(x -> x*x).map(x -> Math.round(x)).mapToInt(x -> x).sum();
    }

    
    public static int sumSquares_Problem_1_1dce730e_f8f4_4ded_b174_f3029942ecbf(ArrayList<Float> lst) {
        int sum = 0;
        for(float n: lst)
            sum += n * n;
        return sum;
    }

    
    public static int sumSquares_Problem_0_d5eb1304_5c89_4b71_a194_355bb354aa4e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_7f909d68_c3f7_49b5_927a_2f5e8c1ca8c1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_4ca78c3b_d335_41d4_9e9d_d1b34ca7e338(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_17539918_e654_4a2d_bc6b_fe9d9e28d1ea(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_2_50d68640_5b92_4191_833f_b6d6c9da8dfe(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_7bd344e2_5ce6_4554_a234_a0400a7b13e1(ArrayList<Float> lst) {
        float t = 0;
        for (int i = 0; i < lst.size(); i++) {
            float f = lst.get(i);
            t += f * f;
        }
        return Math.round(t);
    }

    
    public static int sumSquares_Problem_9_14733a6a_0679_4749_976f_8dcc83139ce6(ArrayList<Float> lst) {
        int sum = 0;
        for (float x : lst) {
            sum += x *  x;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e8f497f9_c9d7_4819_99c4_51a0865c5cf3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_9846e3d5_dab9_43ff_ae17_db2c07cf5e02(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_8_3dd3cb72_4709_4a2e_938a_3b2a219ef4bc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cadcb0ef_c13c_44d9_9978_32e5010cb6db(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_f14ac33a_d4b2_4028_ae43_1d6c20ec77fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c58fa97d_6f3f_43b7_b0c8_efc6949e442b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2c947223_40c9_4a6e_a07e_d6203dcd5d67(ArrayList<Float> lst) {
        return Math.round(lst.stream().map(v -> Math.ceil(v)).map(v -> Math.pow(v, 2)).reduce((a, b) -> a + b).get());
    }

    
    public static int sumSquares_Problem_0_baeef46a_ff08_453b_bfc9_ad5b91390ad1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_b4fb5188_bb09_4b23_8037_704b17e405b4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_90d5e2b7_d856_41cd_82f3_d2a5339c9002(ArrayList<Float> lst) {
        int result = 0;
        for(Float f : lst)
            result += Math.pow(Math.ceil(f), 2);
        return result;
    }

    
    public static int sumSquares_Problem_7_90425a86_ce56_4288_8ff8_de75d974209a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_bec18f64_34d2_4388_9068_faea1138e7ad(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_3_15d4a918_2a7a_4c94_89cf_04d62d6abd6f(ArrayList<Float> lst) {
        int res = 0;
        for (float f : lst) {
            res +=  Math.ceil(f) *  Math.ceil(f);
        }
        return res;
    }

    
    public static int sumSquares_Problem_8_36f6756e_ec91_49f3_8e8f_a59e6b7aed33(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            double x = lst.get(i);
            double round = Math.ceil(x);
            sum+=round*round;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_150bed98_bd85_47f1_b4fd_0315a1757d0e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_97a98e8e_40b1_4e85_8430_bedf87fcdf56(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_87343ec5_bedb_4f53_92f9_b9c0cf869b13(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_84128fb5_ea71_465c_a83b_d1cd56907d8b(ArrayList<Float> lst) {
        return lst.stream().map(p -> Math.round(p)).map(p -> p * p).mapToInteger(p -> p).sum();
    }

    
    public static int sumSquares_Problem_2_94aa364b_bc71_460b_9280_0ff36b8e40a6(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_9_f2fe97ec_9b78_46c1_b1e1_546f571fd315(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e6faab06_c2aa_4620_b690_a5568edba4d4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_fa7a2ec3_d2b6_4d92_be27_96efe1cb96a2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_456ad06f_8e2d_4a11_a494_f99c9bd84f7a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_648f3429_836d_4b28_89e9_c4300a5f23b0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_a42462f0_4fb5_4892_a688_1261931fcfdb(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_6_edddb48e_25bf_4ec0_9998_788f3a985f6d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_ff4eb359_02ed_4498_9b23_b61b9e93f91b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_40c0a7bc_6198_4b7c_97be_7e6b7f47231c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_7f43e8ab_0d1c_418a_af2c_6ae920c73772(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_de3616e6_41fa_4f81_a871_0e7b26b95784(ArrayList<Float> lst) {
        return lst.stream().map(i -> Math.ceil(i)).map(i -> i * i).reduce(0, (a,b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_63cc9aed_cf95_4da7_994d_cc64f45bf902(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5174b0c8_605d_406f_b2ee_fcbd17269469(ArrayList<Float> lst) {
        // Write your code here.
        return lst.stream().map(d->Math.round(d)).map(d->d*d).reduce(0,(a,b)->a+b);
    }

    
    public static int sumSquares_Problem_0_ab0fd528_b912_492a_927e_4d4d2d06e4d4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a,b) -> a+b);
    }

    
    public static int sumSquares_Problem_7_1b50885b_4a9a_4faf_9395_b48b3401e13c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_89e4aada_8a59_4f4e_94ce_6ec30cbcd7c6(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.ceil(e) * Math.ceil(e)).sum();
    }

    
    public static int sumSquares_Problem_0_48dd1548_b403_4640_8a8c_bd1cf353a60e(ArrayList<Float> lst) {

        return lst.stream().map(i -> Math.round(Math.pow(i, 2))).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_5_95145a2d_b95f_4027_8ab5_a20c6f9bdfc3(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_9_9222f9b6_cbe2_407a_a045_e6e367e7fabb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_23ea6c61_c342_4b3e_a891_dcc30e4ce9d2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_62ffd843_33a6_4afb_9e19_5875a79ec129(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_dd11f328_df86_420c_958f_c1662957398a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_3312c54f_5590_4ca1_b1f9_60fa44c15168(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_e1d0e63b_e2d4_415a_8745_80f454e519f2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_fe3e8bd5_61e8_4dc5_9a4e_d404f52d3997(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_0a018e91_17ee_4ffd_a7e6_43b2a9dd2cec(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_ae3415e3_486f_48b8_959b_2a63b6d5fd5f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_bdb555ff_6d8c_4f07_a4b1_20b0a974e558(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_1_ed6d2525_3a7b_465c_b448_6b3814b17c6e(ArrayList<Float> lst) {
        return Math.round(lst.stream().map(f -> f*f).reduce((a, b) -> a + b).get());
    }

    
    public static int sumSquares_Problem_1_09ccf914_406d_4687_a2a1_3faa702cae5f(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_1_c183396b_7d0e_4665_98d3_4f433dd1b27c(ArrayList<Float> lst) {
        if(lst.size() <= 0) throw new IllegalArgumentException();
        int ret = 0;
        for(Float f : lst) ret += Math.pow(f.intValue(), 2);
        return ret;
    }

    
    public static int sumSquares_Problem_0_dd32d5ff_ff2a_4b75_87d9_3b222f650681(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_05751400_21e0_408c_8956_1cc7c97434c3(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_53c5c9ec_92a0_437f_987a_3ebb8bf4d9f6(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_04fc8bbd_49f4_4353_bb18_88436edb54d2(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_45eadd00_b6e8_4f1f_881b_6a6a805d7e8b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_03ee8c9b_7638_4d81_bfa9_b668bfc92f6f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_701a626b_131d_4885_9ef8_0383198b2fdb(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x)).map(y -> y * y).sum();
    }

    
    public static int sumSquares_Problem_11_2c1b2f37_53a0_409d_8a83_dbc7e2d0cbb7(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_210d4172_2ef0_449c_a874_1179286edf97(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_48ee58f7_1698_4d51_af0c_5970fab6fc57(ArrayList<Float> lst) {

        return lst.stream().map(i -> Math.round(Math.pow(i, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_2bb3ccfd_0256_45b6_afed_c71429d58bbd(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_7c487aa1_592d_456f_bc55_1aa6cf7264b5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_2f8de0bc_034a_4363_91eb_831bcd39616b(ArrayList<Float> lst) {
        if (lst.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2dcafd76_eed1_4120_8ef6_03aeac8a2cd0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_bd924bfa_b8a3_4625_9e67_78b302420fcc(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_be5e83a5_feb0_4fd8_97ea_4984808e041b(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_115a3ac3_8356_461c_ba98_d49fff345b1c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(Math.ceil(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7001abc8_65f0_41eb_aa8c_89dbe72c014d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_b4541598_df0a_4c38_93a5_5d6c23f3f7e1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_20bbab8c_e75b_456c_b0e0_a0d81bdf8c05(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_97fa4151_3b4e_453e_890b_bc83c9a243aa(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_6e632aca_f395_4e25_90db_afa5330e25f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_c40ccdd7_17c2_45f1_8847_7eccc02ebf44(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_34c69938_4189_42c9_8213_dc3e954804dd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_4863035f_557d_41ad_87a8_e9135aeb4f43(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_2a1b3d4e_6e4d_418c_9202_90e749b2c44a(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_41b4cdb8_87a6_484d_922c_b0237fec6ef0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_7_9cb4907c_c28b_441a_8673_01f0e34c26c0(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_d2d4a108_62dd_4a84_8009_9eab62ab209c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7c055861_4783_490f_bd9f_0e35c79d4aa3(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_7001abc8_65f0_41eb_aa8c_89dbe72c014d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_458afb77_d926_4fab_bfc6_7fc1bca7b43d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_ffb18e80_f5d6_4f22_8a1c_fc8c3dacbe01(ArrayList<Float> lst) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        int sum = 0;
        for (Float i : lst) {
            ints.add(java.lang.Math.round(i));
        }
        for (Integer i : ints) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_feb15843_a747_4114_ae6e_5a5b4e9808df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_3e21b440_2e35_443c_a5c5_43975e01ca2b(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_f865dcd6_06a3_4a8c_9f4f_472e525f38db(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_7_23ef379e_6dd4_4a73_a990_dab0e7d8b868(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_684940e0_3d63_484a_9f04_48405d8a2743(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_10_b8da4456_e487_435e_b85e_9e78b4901b56(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst)
            sum += Math.pow(Math.ceil(Math.ceil(f)), 2);
        return sum;
    }

    
    public static int sumSquares_Problem_0_48bd1975_61a6_430c_ae91_def6b146b9f3(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_7_6e632aca_f395_4e25_90db_afa5330e25f8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_1e1718ea_37d8_47a1_b11c_8ea84b0b0346(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b19c9c45_de06_46c6_9e1d_36f5ca97a5c7(ArrayList<Float> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            result += lst.get(i);
        }
        return result;
    }

    
    public static int sumSquares_Problem_2_b8da4456_e487_435e_b85e_9e78b4901b56(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst)
            sum += Math.pow(Math.ceil(Math.ceil(f)), 2);
        return sum;
    }

    
    public static int sumSquares_Problem_1_023d19a2_d442_4c03_89c4_7391f7ca2c5f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7a505620_267b_4d8f_9a1b_a50791dba5f2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_b261d0a3_63b6_4fcc_ac4e_5d4dd297116a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_20e70573_306a_496c_90d5_cd4e02f92a7f(ArrayList<Float> lst) {
        //for(float i : lst) System.out.println(Math.ceil(i));
        BigInteger r = BigInteger.ZERO;
        for(float i : lst) r = r.add(BigInteger.valueOf(Math.ceil(i)).pow(2));
        return r.intValue();
    }

    
    public static int sumSquares_Problem_1_f6dea5ca_d0d9_4d95_be8d_a6b44291c893(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_a5652fb3_12aa_4835_93ce_2c7d8c69f7bf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_7fc98b94_78d5_4829_9134_12593d4a1101(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_41e05849_e23e_41ad_a4b0_bf9e4cec76ac(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_cbf65fad_142c_4957_a6f5_6dcddd05214d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_a7854ca4_5a70_4199_8d7d_d5b97e67fb32(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_0d762d3d_568a_4a86_942b_0c849ae0b5c4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(i -> Math.round(i*i)).sum();
    }

    
    public static int sumSquares_Problem_3_8f3e09cc_9131_44d5_8a15_9b475d9c2a5b(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.round(f) * Math.round(f)).sum();
    }

    
    public static int sumSquares_Problem_11_70f8e979_e47a_4d65_a1ee_efac4f2cd2f5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_7_864be009_a4a6_4f1c_ba58_3cc8cfc8313c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_feb15843_a747_4114_ae6e_5a5b4e9808df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ab637c05_f878_401b_b933_981e00f9f7bb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_f1279c83_e127_4bce_9534_21178d5bced6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_f963fd77_e4b1_41cd_ad0d_712db64f2e39(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_30eb1d18_5b6d_47b3_8a54_69776e88d006(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_2a6b93dd_488a_4f27_8272_c4baa180f33a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_55c37bfc_d7e4_4565_97f3_343e27929db5(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_087c720f_50dd_4d6a_9972_6290680833da(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_0430bfad_6491_4384_8792_eebcb2a624df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_90d4a640_dc5b_4dc1_91a7_a46cc3375730(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e3d8f652_f042_40eb_a6d6_f9a909e7c003(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_88b43558_e3a0_4fe1_a5f6_2fd159aa8fd3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d2396a57_8e0b_4498_b181_b34f44332009(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_6_3281689f_2f9a_4622_a9fe_3e9e89c0c28a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_a753d5f4_4af2_4c23_aeac_5e1314d7979f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_016a1994_3ef2_4f4a_bf06_45515ed735e2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_6f06133d_19e1_44fa_b42f_5a4a3f5b1c69(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_04955124_2381_43d1_ab66_991ca5ea584a(ArrayList<Float> lst) {
        return lst.stream().mapToInt(Math::round).mapToInteger(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_4_a695d97e_54b0_48a3_bc4b_ef04ab11dab3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_49c8ec7a_8719_45fb_94dd_3fbdbe427b1f(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_1_1c860206_f80e_47c9_bc3c_a4c2617431e3(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_ee44a682_9805_4fae_8404_a2134149a12f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_2356e3fb_4260_4be0_a956_8efc78ac79df(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_1_0c7fd4d8_bd9e_438e_8168_7951ef1c0de8(ArrayList<Float> lst) {
        int result = Integer.MIN_VALUE;
        for (Float f : lst) {
            result +=  Math.pow(f, 2);
        }
        return result;
    }

    
    public static int sumSquares_Problem_11_1fdc8714_16bf_4111_9ee4_7e620184874f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_85d563c4_0fe7_4843_afd3_fe1e15f1302d(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9f395924_583f_4ce8_bced_a4b735966849(ArrayList<Float> lst) {
        // write your code here
        int sum = 0;
        for (int i = 0; i < lst.size(); ++i) {
            sum += lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4403b235_cf2a_4f18_994c_fec5b76e7062(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_c4c72ab0_8b1f_4291_9206_b710984dde0b(ArrayList<Float> lst) {
        // your code here:
        return 0;
    }

    
    public static int sumSquares_Problem_1_d43159eb_b64d_46d4_9c24_8d982234cfd9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_71f87c71_40e2_4eda_86be_e6e16db3dc22(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_aae81797_6d0f_4a09_9353_6fbdcff6532d(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.ceil(x) * Math.ceil(x)).sum();
    }

    
    public static int sumSquares_Problem_0_af365e8b_3f90_45c5_a2ef_54d99114082d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_91ace805_8124_4aa2_87c1_b07265017cec(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_ac81890a_6e8f_42a7_874a_3b185b218b99(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_968415b7_5a06_4764_980f_937d65fb3cfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_9_5b638f00_4d82_4395_8b60_02a473af3372(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            float f = lst.get(i);
            sum +=  (Math.ceil(f) * Math.ceil(f));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_25bd86cc_0fdb_4692_9f73_7e425466d401(ArrayList<Float> lst) {
        // Write your code here
        int sum = 0; 
        for (int i=0; i<lst.size(); i++) {
            sum += Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_e9ff55ba_8707_4bff_b7bb_3bc10d48e0c1(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_fb85b134_b9e6_43a2_97f0_d35326906c74(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_627ab875_8457_4f34_8025_66922d815024(ArrayList<Float> lst) {
        return lst.stream().map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_fd2b23e0_ac7e_4be8_960a_4dfd323db1c4(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_6f55f685_6256_46e8_acaa_4946b50cc89d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_2a1b3d4e_6e4d_418c_9202_90e749b2c44a(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_c56e0dd4_9e7a_4080_9926_7d58e6e0d675(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_c04469bf_86ae_4e9d_836d_9817811f66a7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_3_a5b8de86_2146_42df_bdf0_1761ba069939(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_56ee525b_5bea_4bf5_8e99_dbf1d1c19cec(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ed4b9496_67ae_4628_a08c_9f7a44c8c8d4(ArrayList<Float> lst) {

        int sum = 0;
        for(Float f : lst) {
            sum += Math.round(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_8f3e09cc_9131_44d5_8a15_9b475d9c2a5b(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.round(f) * Math.round(f)).sum();
    }

    
    public static int sumSquares_Problem_2_c73bcd41_c223_4a32_aa0e_deb0356704de(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7fc98b94_78d5_4829_9134_12593d4a1101(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_50c1ac5f_9a0f_456b_be0f_3a4c3057e69e(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e1d13440_b71f_48b1_9ec6_82fa9104d093(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_5ca2f226_9c57_40a6_ad49_9c988e269e95(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f5713022_f68d_441e_9b7a_746600320357(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_e1d0e63b_e2d4_415a_8745_80f454e519f2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_a9b79e73_d9b6_4786_bcbf_d0c70dcdd335(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_b54710c1_76ef_4d19_830a_5befa605d832(ArrayList<Float> lst) {
        int sum = 0;
        Iterator<Float> itr = lst.iterator();
        while (itr.hasNext()) {
            float f = itr.next();
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_ae7583d6_5f73_4aa0_9f6d_4db599e2dc96(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_4db47fa3_4bf6_4ed1_9776_9afac23981fc(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_ec608f18_b773_49ed_a3a4_bde5490b331d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_e32bab2c_b920_4235_9934_9d2c467dfb8e(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_0cbfd934_ef5d_497e_b9b4_70894c0d858c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_c74b0d6b_ad78_4c08_b8d7_a01793e11ce1(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_016a1994_3ef2_4f4a_bf06_45515ed735e2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_197e1b9b_b337_4d89_b5bb_756cf0b8e520(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_cfb4f5cd_413b_4e13_95d1_0d0f39352b6f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_fb185e8b_cede_4307_96e2_94b38cc34ff2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_d3b427fe_2bf0_4c29_a607_85615220635f(ArrayList<Float> lst) {
        double sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return Math.round(sum * 100) / 100;
    }

    
    public static int sumSquares_Problem_0_f835410c_300e_46f8_9b7d_9fd24959e1bf(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_1cbfe173_020e_4dc7_8d96_524bc512c06e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_18bf2ac8_12d8_4fe4_b81c_29e624ae5a16(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(Math.pow(lst.get(i), 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_80ede0e8_dd59_43ea_b3c2_f49f16ebb587(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_5b32d364_13aa_4cbd_b2e4_66a9ce690eb5(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_91a41668_3e78_4d51_8db2_db00dbb7c924(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_d032f550_255a_4a5f_b947_4aece1c64100(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_1e754707_88b5_4b80_bdf7_3e8c71436499(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_8d35f810_1dbc_467a_9d7f_05210588f0b8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_1fae8590_414a_4ba4_a466_90ccdc438e29(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_0430bfad_6491_4384_8792_eebcb2a624df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_20185846_2e18_4c8c_b384_7bc9a185abb9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_41bb5dcf_e0af_488d_9668_14e72ac1ea17(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_35323827_593e_45d3_bd69_4f5d0a4a673f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_00fbf781_e2cc_4f29_b081_de40ac9beec4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_ad12e341_d352_41b2_8d2f_d79339f23d82(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_54d0945d_e7c4_4391_98b4_cba796ebcfa7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_4_0e4e56bc_0ec5_4f68_90da_2b6cb19f83d4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_fb85b134_b9e6_43a2_97f0_d35326906c74(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_47b911b6_c254_44d1_a847_51b1e04e3235(ArrayList<Float> lst) {
        return lst.stream().map(n -> n.intValue()).map(n -> n * n).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_c2581e90_08ea_4f4b_8b8c_e72353bb45c8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_5_d05f512c_6357_4ed5_8135_9f85316f388e(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_ae52777d_8274_4a74_8b1f_16cfd195d336(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_4ffcd32b_4227_4049_83a2_a68184b370ca(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_5a043099_8dcf_41e3_9063_44f555aef457(ArrayList<Float> lst) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (Float num : lst) {
            nums.add(Math.ceil(num));
        }
        return nums.stream().mapToInt(num -> num * num).sum();
    }

    
    public static int sumSquares_Problem_1_684c95c8_2ad1_45a7_886b_40e12b40eefe(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_d9f94727_98f0_47ac_906d_9164da7706c7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_b454c151_b9b7_44f7_bda0_82b3738ad117(ArrayList<Float> lst) {
        // Solution goes here
        return 0;
    }

    
    public static int sumSquares_Problem_1_ffdbd2d7_93c5_4018_b5db_f237d63ba8c6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_d032f550_255a_4a5f_b947_4aece1c64100(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_1c7cdf35_e517_40e0_af56_dac537c5f844(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_796dfcbb_4359_4210_9946_838222955d3c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_d038f55f_b89d_4f7e_bd27_853a0f27e35b(ArrayList<Float> lst) {
        int sum = 0;
        for (float i : lst) {
            sum += Math.round(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_3513e86f_5541_44c4_b10f_d580bf3ea48a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_0ffbc3da_433a_403a_8f16_0fb9e62381d7(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_9_f063c2e4_e46f_4c0c_99e7_e6d0dbf4c6c4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_a6da3315_734a_44ab_b54a_7f2ab625292d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_8bf3c353_1392_4d6e_a9b8_87a827620d96(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_feeba926_910c_494c_8ad4_7be2233de796(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_bd420a65_4f0a_4d26_954e_ebeda39fc3cb(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_4863035f_557d_41ad_87a8_e9135aeb4f43(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_64f448c1_02e4_4ece_8345_0cf9c12786f2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_6a8150ac_8c9e_44a4_bdf5_3d558dc6867e(ArrayList<Float> lst) {
        // input:  array list of numbers
        // output: sum of squared numbers in the given array list,
        // round each element in the array list to the upper int(Ceiling) first.
        int r = 0;
        for (int i = 0; i < lst.size(); i++) {
            r += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return r;
    }

    
    public static int sumSquares_Problem_4_c039eb02_87ab_4fd0_a5ee_0fe1afea298c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_6aa6d83a_d613_423c_842a_e55464eefd32(ArrayList<Float> lst) {
        // your code
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.ceil(f));
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_7_b8da4456_e487_435e_b85e_9e78b4901b56(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst)
            sum += Math.pow(Math.ceil(Math.ceil(f)), 2);
        return sum;
    }

    
    public static int sumSquares_Problem_9_6ab43a36_4f0b_4dd2_88bc_d189c9ce0dda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_bc69c205_66e5_49e6_8e90_c6ee8a0fc1be(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_c1b3166e_d460_467a_8fa6_7b269bde8c11(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_009fec38_a037_498f_a502_d249436e2da0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_0db728fd_d9e7_4cc4_a9b2_033a63d212aa(ArrayList<Float> lst) {
        int sum = 0;
        for(Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_f4ab2ac8_637d_4a55_b3f7_50c4227c8ad5(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float i : lst) {
            sum += Math.round(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_4fb1137a_1349_4830_9c13_f43b1fe26394(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_9_1bf1d799_1033_41ba_a619_f575a6568984(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_4373becb_f6a1_4322_9e73_3f66d69c412c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_1a9a8fa7_f98a_42ed_8c54_371b5ffae5c9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float elem : lst) {
            sum += Math.pow(elem, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3b319c74_9e21_4ed4_8f9b_4824e2f546ec(ArrayList<Float> lst) {

        int sum = 0;
        for(Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_274df3fb_ee77_4c65_a875_4c02324c90f9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_95dab76d_8749_4647_8bc6_862e378918d6(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_da1cf573_c0b7_4700_b078_f8e30cd5570d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f0c493bb_c5b3_4400_83e0_941576fbc2dc(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_f4a6f39f_e183_4830_b447_d23d5aeca94a(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.ceil(f) * Math.ceil(f)).sum();
    }

    
    public static int sumSquares_Problem_9_0c5ac88f_8b2c_4340_9c5c_bccd96aa390d(ArrayList<Float> lst) {
        // try {
        //     for (Method method : lst.getClass().getMethods()) {
        //         if (method.getName().equals("map")) {
        //             return lst.stream().map(v -> Math.ceil(v)).map(v -> Math.pow(v, 2)).reduce(0d, (total, value) -> total + value);
        //         }
        //     }
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        return 0;
    }

    
    public static int sumSquares_Problem_7_7afb72f8_1957_439a_a058_e57dd11e30cf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_88b43558_e3a0_4fe1_a5f6_2fd159aa8fd3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_1fae8590_414a_4ba4_a466_90ccdc438e29(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_fff4e117_67cb_4b99_9cd4_80cb445f367b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_a495b238_9495_4642_bbfb_c1fdaa464510(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_62716388_d983_4bac_9726_b5082d3417e9(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_8_8fc7c0b6_3b21_4957_b3e5_7081bce5312f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_4ca78c3b_d335_41d4_9e9d_d1b34ca7e338(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_4e403631_3cf6_4081_92f0_78b75f977ac9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f8b65a65_ea9a_45f5_a9cc_e1b4a10363ac(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_bfd94607_774b_4790_b383_80acb9446f33(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_7159de65_eab5_470f_be9e_9566ee314d60(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_b261d0a3_63b6_4fcc_ac4e_5d4dd297116a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cbca8bea_715b_4ff8_a614_56ab65aefc77(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_749c9237_f2bb_4327_88a6_54da9174958a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_8_81f9182d_ca88_4499_b449_dff1d0bee408(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_4_0e513d1d_f48d_4c62_aaab_a7b283ef7f0b(ArrayList<Float> lst) {
        int total = 0;
        for (Float i : lst) {
            total += Math.round(i * i);
        }
        return total;
    }

    
    public static int sumSquares_Problem_6_f30acf5b_ee61_49a8_98d1_a1b5754cc293(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_10_f240a59c_814d_43d2_9011_46f0f87d2836(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_1a259924_d880_4d1c_8361_f0a460dc7faa(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_ba935228_e524_411b_a065_df9e7d31b78b(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst){
            sum +=  Math.ceil(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_eac31025_3453_4967_9a79_70f6dd388f69(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_fb185e8b_cede_4307_96e2_94b38cc34ff2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_da14aee5_70fa_4f98_86c5_abd89efeff63(ArrayList<Float> lst) {

        return lst.stream().mapToInt(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_8b088253_78b7_4957_8e24_cdef6ff156ba(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_90921950_46a8_4e08_80d1_421dd0d19259(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x) * Math.ceil(x)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_20882c2e_0545_41a5_b240_e3c07eac6afb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_f21d0fbf_7e24_4124_a25a_758ba1b916a8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_7b830cf3_979c_4cce_8c8c_9be28ec90518(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_9_5ce68080_dbd0_4cbb_8d0c_9c9b15bacea8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_8f3e09cc_9131_44d5_8a15_9b475d9c2a5b(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(f -> Math.round(f) * Math.round(f)).sum();
    }

    
    public static int sumSquares_Problem_3_346d275f_328f_4ef3_a050_abc8741a4a88(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_b9e7c61d_2726_4848_adb7_02f5a2cacc27(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_7197868d_a74d_4314_a9d1_29520de3d1a4(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_1f80ca34_d5e8_4877_ba20_84b51be85169(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_1_5b969711_32b8_44e7_9640_386712b92568(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_46b99ce8_a5a7_42fc_8efb_eb1264a0725e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_3_f2c797d0_1751_4862_b779_f43227fa7bce(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_04955124_2381_43d1_ab66_991ca5ea584a(ArrayList<Float> lst) {
        return lst.stream().mapToInt(Math::round).mapToInteger(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_3_8fcdeb0c_483a_42b7_b66a_f34f6b72ab1f(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(lst.get(i), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_1f08da69_2709_4deb_b2b8_6e5042a4a60f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_56e4f5ff_6409_4659_868e_3319af102e6c(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_48241d80_1234_45bf_ac63_b0973489cd4c(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(Math.round(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_f21d0fbf_7e24_4124_a25a_758ba1b916a8(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_1a6f85d5_4394_4d37_921a_a3ae824ef65a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_fb26e9c3_6e9f_418d_8d4f_552548d165cd(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(Math::round).map(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_10_bfd94607_774b_4790_b383_80acb9446f33(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_7a4957e9_57f3_4090_a33b_173db65e3232(ArrayList<Float> lst) {
        int r = 0;
        for (Float f : lst) {
            r += Math.round(f) * Math.round(f);
        }
        return r;
    }

    
    public static int sumSquares_Problem_2_b0d5dfc8_f4b1_469c_89d5_494f398e7e23(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_75b286a1_8968_4cb6_972d_a7a9f133433f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_143a4d79_7c7a_4404_b7fe_95c0514de1b4(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_18a072e9_7fbe_4941_9877_977f7135e267(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_11_738c1a64_b7ea_4d99_b59a_edeee439e193(ArrayList<Float> lst) {

        // Implement this function
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_3_463e4bef_3005_4830_a4a9_423110abead0(ArrayList<Float> lst) {
        if (lst.isEmpty()) return 0;
        int sum = 0;
        for(float n: lst) {
            sum += Math.pow(Math.ceil(Math.sqrt(n)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d3433002_8946_4780_9953_dce153d3a2b5(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_8b088253_78b7_4957_8e24_cdef6ff156ba(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_d220c8a5_6be2_4688_8541_ab7d4e30cef4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_df798504_42d3_4509_a5dc_6491a1cc8d60(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_d3d27b77_dc71_41d5_a0a7_5bd7f27ba541(ArrayList<Float> lst) {
        return lst.stream().map((x) -> Math.ceil(x)*Math.ceil(x)).reduce((a, b) -> a + b).get();
    }

    
    public static int sumSquares_Problem_2_06bc0acd_0268_41a9_832a_242d54faab33(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_cca505b2_9716_49e7_b918_541af255ea40(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_6589358d_9164_4477_b32e_ca4523eca8c4(ArrayList<Float> lst) {
        int total = 0;
        int squareSum = 0;
        // Sum up
        for(float f : lst) {
            total += Math.round(f*f);
            squareSum += f*f;
        }
        // Round down
        for(float f : lst) {
            total -= Math.round(f*f);
            squareSum -= f*f;
        }
        // Square root and multiply by two
        total += Math.sqrt(squareSum);
        total *= 2;
        return total;
    }

    
    public static int sumSquares_Problem_3_3a80530f_03a0_45cb_8a2e_3c0de997f2ff(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_0613be33_6b31_44eb_9d01_f81f236d3068(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_3_20bbab8c_e75b_456c_b0e0_a0d81bdf8c05(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_da1cf573_c0b7_4700_b078_f8e30cd5570d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_10a3c465_cc44_4a35_a58e_4dfb862092eb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_d6de7b01_a2cf_4f8a_a4b0_890e80f56151(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_eaa90b0e_32e5_4e6a_8839_5706f09901cb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2bf082b4_0952_4fa4_aa5a_8d1c7b197832(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_d3433002_8946_4780_9953_dce153d3a2b5(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_ed7b2560_d92a_4903_9106_ab4301ca7139(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_cafe5990_0c14_4a58_9554_ba126c9ddbdb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_c58fa97d_6f3f_43b7_b0c8_efc6949e442b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_da14aee5_70fa_4f98_86c5_abd89efeff63(ArrayList<Float> lst) {

        return lst.stream().mapToInt(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_4e403631_3cf6_4081_92f0_78b75f977ac9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_4252d753_89cd_46c4_bdd3_073e9460da6e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_b51762e7_9540_44ef_93e9_ab08eb960b8c(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_d55a414f_56b7_4279_b036_bb144dbf3a2b(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_279ddfca_a797_42f9_922b_7a4ec1f48604(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i: lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_0c7fd4d8_bd9e_438e_8168_7951ef1c0de8(ArrayList<Float> lst) {
        int result = Integer.MIN_VALUE;
        for (Float f : lst) {
            result +=  Math.pow(f, 2);
        }
        return result;
    }

    
    public static int sumSquares_Problem_5_33efa7af_ab94_48e4_a063_11e5310fd875(ArrayList<Float> lst) {
        return lst.stream()
            .mapToInt(x -> Math.round(x*x))
            .sum();
    }

    
    public static int sumSquares_Problem_0_4bc1ea6b_d8ce_49ee_86b6_64ab88cad005(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_68d36df8_8f29_4c20_ba2f_edf27af43365(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_cca9ee35_57f1_4c1c_ad6f_16219baed401(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_9_bdb555ff_6d8c_4f07_a4b1_20b0a974e558(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_7_f28653c3_cdb1_428d_9fe4_0f314e0ddf8e(ArrayList<Float> lst) {
        throw new UnsupportedOperationException("Not Implemented Yet");
    }

    
    public static int sumSquares_Problem_1_f3ac1bed_b81a_4d73_b60d_a2228b10c5a8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_0430bfad_6491_4384_8792_eebcb2a624df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2a3e6bfe_937d_4e01_96a6_f141649369a9(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_12122c76_070f_429b_a50c_47c247e605e1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_22993b14_c459_45b9_887c_d73143f44c4f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_be1e27d6_778f_475e_af6c_4cf8ff934ebe(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_9b619026_7132_4f37_9453_e2260b790b70(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_0a018e91_17ee_4ffd_a7e6_43b2a9dd2cec(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_44853803_b366_48c1_bea6_0a8566d8b355(ArrayList<Float> lst) {
        throw new RuntimeException("Not Implemented");
    }

    
    public static int sumSquares_Problem_5_12106047_99f0_458e_8274_8d3c12e256a1(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c022333e_f328_429d_be39_07a49d88251b(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_3_537409fd_1619_4d20_b8c5_60478171b6d8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_b454c151_b9b7_44f7_bda0_82b3738ad117(ArrayList<Float> lst) {
        // Solution goes here
        return 0;
    }

    
    public static int sumSquares_Problem_2_b6401ed5_745a_45ef_aef7_df5a57c540aa(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_a48d6ae8_963f_4264_a14d_7a86c310f3b5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_7a2f3ccf_1ef5_4136_9fc5_d227c0d837fe(ArrayList<Float> lst) {

        // BEGIN SOLUTION
        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
        // END SOLUTION
    }

    
    public static int sumSquares_Problem_5_e9d7b04a_6fc7_488e_9f6d_a51123a20001(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(e -> Math.round(e)*Math.round(e)).sum();
    }

    
    public static int sumSquares_Problem_6_13d10e68_fe2d_4544_a27a_c90bb97f440e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_27efaf57_143a_43c0_847e_d48888c26b6d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_341e1ced_1544_45c2_a5d5_217da4abfd84(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_5_52177b52_eae3_4c23_ad9b_8a53a1936a05(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_52d0299d_7424_4279_a05f_2e898039c036(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_994adc0b_713d_48d6_af20_3ac3e33d051a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_d2430361_299f_48dd_b87a_28f7f3b76b97(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_d272dc48_035c_4a93_b2c3_aad711b60309(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_0a5ea9cc_b49d_4dd9_8485_ef7e51846c54(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_1c7cdf35_e517_40e0_af56_dac537c5f844(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_6fee58ce_c570_4741_943d_9e3ad0100116(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_80ca6e88_da47_4ac5_9962_3e5a3b82d66d(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_5b32d364_13aa_4cbd_b2e4_66a9ce690eb5(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_298286f8_cd43_4659_b93c_1f80b230e81e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_5171aa41_654d_48fc_b255_2674c2ad4601(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_9_09a288d6_ba0e_4df4_94f3_b3d0fd32dc80(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_f5216e16_ea76_4e4e_ac57_2624f891fb8f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(x.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_71b56a42_48e9_4e73_9fd6_a0c3696590a5(ArrayList<Float> lst) {
        List<Integer> l = lst.stream().map(e -> Math.ceil(e)).map(e -> e * e).collect(Collectors.toList());
        return l.stream().reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_bdcd2064_18da_416c_8c44_3052422b7570(ArrayList<Float> lst) {
        return lst.stream().map(x -> new BigDecimal(x).setScale(0, BigDecimal.ROUND_CEILING).multiply(new BigDecimal(x)).setScale(0, BigDecimal.ROUND_CEILING).intValue()).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_32e5f321_76f3_40dd_b84d_bfcf74b8b63d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f);
        }
        return sum * sum;
    }

    
    public static int sumSquares_Problem_0_49b95db9_5a1e_40f0_860f_4ef569f75faa(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_f4ab2ac8_637d_4a55_b3f7_50c4227c8ad5(ArrayList<Float> lst) {

        // Write your code here
        int sum = 0;
        for (Float i : lst) {
            sum += Math.round(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4373becb_f6a1_4322_9e73_3f66d69c412c(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_97a8b1d2_a4c5_4e85_9813_120d3ba22f03(ArrayList<Float> lst) {
        int ret = 0;
        for(Float f : lst) {
            ret = Math.round(f*f+ret);
        }
        return ret;
    }

    
    public static int sumSquares_Problem_0_4bf3b389_47e6_4a81_8b2d_c54d308166ea(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_eaa90b0e_32e5_4e6a_8839_5706f09901cb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_463e4bef_3005_4830_a4a9_423110abead0(ArrayList<Float> lst) {
        if (lst.isEmpty()) return 0;
        int sum = 0;
        for(float n: lst) {
            sum += Math.pow(Math.ceil(Math.sqrt(n)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_2a1b3d4e_6e4d_418c_9202_90e749b2c44a(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_e3277c14_440c_486b_ac30_da933e706311(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_40cf19ba_b9a8_418e_808d_cef7a16eacc2(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_ba935228_e524_411b_a065_df9e7d31b78b(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst){
            sum +=  Math.ceil(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_fcd38ff8_c925_4c80_b848_2d396bcc8c91(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i : lst) {
            sum +=  Math.ceil(Math.pow(i, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_224439bb_0de7_41cb_84bd_7464b9781a2f(ArrayList<Float> lst) {
        return IntStream.range(0, lst.size()).mapToDouble(i -> Math.pow(Math.ceil(lst.get(i)), 2)).sum();
    }

    
    public static int sumSquares_Problem_0_3cda9a35_a507_4605_b4fe_1b75c461cfb2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_0_37e369fe_2070_4fad_9eaa_e4edce60251c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_0eefc1e8_2997_47e4_8e33_b09312bf815b(ArrayList<Float> lst) {
        int sum = 0;
        for(float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_420dd4ba_4ae0_4e70_94b7_9bd5fb6f2700(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_5_2994e9b4_e4c6_49c9_a00a_3290f5f6ad3c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_1e41104b_4207_45aa_a4ee_15174b731f8a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a,b) -> a+b);
    }

    
    public static int sumSquares_Problem_11_7930212a_423b_4359_854f_24c93cd67354(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_bcda7afb_441c_45fb_9bf2_fc291a247825(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9a00c9f8_0023_4ee3_93c3_66bda4b79bfa(ArrayList<Float> lst) {
        return lst.stream().map(x ->  Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_9d963ad2_85eb_4a1f_a260_fd80c498ed36(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_cd49fbe9_9a4f_4d5c_90ad_fce3575bf82d(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.round(f) * Math.round(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_35f15c27_b0a0_4d9d_ab27_a8afbe819e26(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_0_62716388_d983_4bac_9726_b5082d3417e9(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_6_ae3415e3_486f_48b8_959b_2a63b6d5fd5f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_c9e2dcc1_c54e_48f0_9ab5_eca33727858e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_51fffdc3_93d2_4faa_9608_a5facb55a370(ArrayList<Float> lst) {
        int sum = 0;
        for (float elem : lst) {
            sum += Math.round(elem) * Math.round(elem);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_ec608f18_b773_49ed_a3a4_bde5490b331d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_da54e29f_20cf_426d_9679_32ae26458e7c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_dad4638a_6275_4cd7_9ee0_335cccef0342(ArrayList<Float> lst) {
        // Implement the method
        int res = 0;
        for (Float fl : lst) {
            res += Math.ceil(fl) * Math.ceil(fl);
        }
        return res;
    }

    
    public static int sumSquares_Problem_5_e62e0b4c_cfe9_487d_a29d_cc8b679ee820(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_c039eb02_87ab_4fd0_a5ee_0fe1afea298c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_a5ed47a3_a4fb_4d2b_a2d9_c572c626d42b(ArrayList<Float> lst) {
        // >>> YOUR CODE HERE <<<
        return 0;
    }

    
    public static int sumSquares_Problem_1_77a642e8_d4ce_4ca0_8cb9_78a6bdf9f9c8(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_4ca78c3b_d335_41d4_9e9d_d1b34ca7e338(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_0ba34461_095a_44d3_b14a_29c298b19ed9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_10_d43159eb_b64d_46d4_9c24_8d982234cfd9(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_bd420a65_4f0a_4d26_954e_ebeda39fc3cb(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_d4f2efb9_92bf_4454_a933_bcd9f074c3fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_8b3df568_eb9f_408c_8e71_3fc3195f452f(ArrayList<Float> lst) {
        return Math.round(lst.stream().mapToDouble(x -> Math.pow(Math.ceil(x), 2)).sum());
    }

    
    public static int sumSquares_Problem_1_44ab7349_f135_4a5b_810d_dcc80d4e1dca(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_4acf233d_28a6_4f81_b498_7bf24f9e8778(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_1bd76b77_f851_46ac_af9e_0c24b8f581dc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_cb87b003_b74b_40fb_ab13_d268f8127fb1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_554d9440_ab9a_4b06_87b3_286f3d13cef5(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_908fff83_36de_4d21_aeaf_3db99a37850c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum +=  Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_cf80b040_3c54_4899_acb0_022933a5e6b8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_a3e45ee4_9914_4cfa_99d1_72f0c455f8af(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_9_4863035f_557d_41ad_87a8_e9135aeb4f43(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_b5cb8a4f_f2f6_4dcd_bdd1_e17da9674933(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_67420f5e_052d_4f4c_9fa3_2943a9d67725(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_ffb18e80_f5d6_4f22_8a1c_fc8c3dacbe01(ArrayList<Float> lst) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        int sum = 0;
        for (Float i : lst) {
            ints.add(java.lang.Math.round(i));
        }
        for (Integer i : ints) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_d3d27b77_dc71_41d5_a0a7_5bd7f27ba541(ArrayList<Float> lst) {
        return lst.stream().map((x) -> Math.ceil(x)*Math.ceil(x)).reduce((a, b) -> a + b).get();
    }

    
    public static int sumSquares_Problem_1_49283e25_e195_4059_b40c_ddb7b3c06282(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_fe14f8ca_1acd_43a9_abd3_abf181642c27(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_7_4c8101c3_c910_46cd_a1fd_e7fd22321b94(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_6f4594e5_dbb6_477f_a3cc_9bd78317b34f(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_d5673363_887b_4300_8f0f_d07412ab5705(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_e44b4499_7d86_4878_917e_4089f7262861(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_049e6af0_8bc0_48ef_b860_b3324c964815(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_c97d1d99_8cd1_444d_876b_62770ceff179(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_3_27d53c2d_289e_4a78_ab51_ede80f98f1e3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d137762a_fab1_4905_89c1_291ca38c7e55(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d5e1b84a_7758_46fd_b98f_fcd2d3ee50ed(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_2484682b_f8d5_4067_aa2e_0ab349da92d2(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_df23103a_721f_41ab_bf38_eb671947983a(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_4_63cc9aed_cf95_4da7_994d_cc64f45bf902(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_d5bae281_a683_496e_8ca2_5eb4f5b1aedd(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_a3875e22_c5b2_4377_8dbd_7056b1bfe364(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_cadcb0ef_c13c_44d9_9978_32e5010cb6db(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_97a98e8e_40b1_4e85_8430_bedf87fcdf56(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_ae7583d6_5f73_4aa0_9f6d_4db599e2dc96(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_3_46b99ce8_a5a7_42fc_8efb_eb1264a0725e(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_d6d1dd51_d0af_487c_8d2d_e884acde38aa(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_e9ed8cb9_a45c_4415_b7a9_5e7495e67b2c(ArrayList<Float> lst) {
        // write code here
        return 0;
    }

    
    public static int sumSquares_Problem_10_de7d127d_d0c0_4a2c_9fcb_d42c9ff9ee01(ArrayList<Float> lst) {
        return lst.stream().map(i -> Math.ceil(i)).map(i -> i * i).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_b32b06d5_85cd_4d33_adfe_d8eb78725dda(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_57e20a47_d1d9_4bd0_85c0_c5df3dc42847(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_93a9c4c7_770b_4278_abda_6a8e1f880177(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_00fbf781_e2cc_4f29_b081_de40ac9beec4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_37b7d014_6239_4d3f_be66_798baf103ef4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_8989a331_754c_45ef_b6eb_8cdc5a374f5d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_093c935d_5546_4900_b9d1_cce251056b92(ArrayList<Float> lst) {
        return lst.stream().map(i -> i.intValue()).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_4863035f_557d_41ad_87a8_e9135aeb4f43(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_145dc1e6_2c58_48be_b98d_1e68528dad5c(ArrayList<Float> lst) {
        int sum = 0;
        for(Float i : lst) {
            sum += i * i;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_675eda3e_b635_40b1_8909_381f645b127b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_ac9dc952_25f4_4972_bdc5_c88c8954ad52(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_14b94557_037f_4bbd_956e_3fee8fc91854(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_a9b79e73_d9b6_4786_bcbf_d0c70dcdd335(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_11_0fad6df8_d78a_4e14_9285_5caf2dc30697(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x ->  Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_d992f61b_24f8_45ac_9885_56e392fcba39(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0L, (x, y) -> x+y);
    }

    
    public static int sumSquares_Problem_0_d2a78732_692b_407c_b298_4b8b6175aa62(ArrayList<Float> lst) {
        // Implement your solution here
        return 0;
    }

    
    public static int sumSquares_Problem_3_78bae5a2_6e79_4c3a_aec3_03291e57c27b(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_cddcf7d6_0347_417a_a872_a81f8ff12429(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_143a4d79_7c7a_4404_b7fe_95c0514de1b4(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.round(Math.pow(num, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_7b65ae8d_b40d_405e_b49a_45c8ec479097(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_2a6b93dd_488a_4f27_8272_c4baa180f33a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.ceil(i * i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_1eb2a0bd_ddbe_45e0_9457_35e3619ad154(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_f173fb62_6206_4107_be46_cb0f5fee7ccb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_232425da_59e8_40ba_9b4a_9d6e049bf6aa(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_2c585f6d_9a02_415e_9a46_0cbaf3273f41(ArrayList<Float> lst) {
        int sum = 0;
        float last;
        for(float f : lst) {
            last = (Math.ceil(f));
            sum += last * last;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_65845ca4_6afd_4ab2_b66d_e7924d41947f(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_11_2ee9fda9_f0a8_4079_9b4c_8593c0a32b87(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_8f1bd6b4_2949_441d_b7b4_dc3c9915a62c(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_4_23ef379e_6dd4_4a73_a990_dab0e7d8b868(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_48241d80_1234_45bf_ac63_b0973489cd4c(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(Math.round(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_5d77561e_bf0f_4756_b2d8_68a4e57d8cc2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_ac3e1d24_3f71_4e5a_abcf_0e9c3fabb5ac(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_1b989654_587b_4b88_9974_54e752dc75f7(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_3_bc1e8986_c5ab_491c_99e6_d4c63b9234c8(ArrayList<Float> lst) {
        int sum = 0;
        int i = 0;
        for (float f : lst) {
            sum += f * f;
            i++;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_426bea4a_3a34_43ab_a0fe_dfde9dabca5f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_0e2611d7_f4e5_43a2_b251_4e8b41b3953b(ArrayList<Float> lst) {

        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9bad13fe_9df9_4338_80bd_fc391ced83ed(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_9269ab62_7f82_4792_89c2_2778734c895f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_bdb7c563_3c79_46b0_a755_09d342afaf79(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_11_f6346cad_c6a3_43f3_95fa_222809ee78ab(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_6_9184be66_bd81_4e1d_adde_e41940c2acc3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_5770f234_bd61_4f3d_b3d2_d63387e30ef0(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_d05f512c_6357_4ed5_8135_9f85316f388e(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_10_d1935c03_7422_4e21_ba94_ce516831c031(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().map(x -> x * x).map(x -> Math.round(x)).map(x -> x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_5_7001abc8_65f0_41eb_aa8c_89dbe72c014d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4c8101c3_c910_46cd_a1fd_e7fd22321b94(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_6_7c487aa1_592d_456f_bc55_1aa6cf7264b5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_511222fe_c09d_45e1_8cc7_4dc2ff9502ee(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_477e0886_bfcb_43ed_a973_d06fd34c88ba(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_ad9dda20_209d_455b_8e6f_256e236fae80(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_2_0e945764_11f5_41fc_aaa5_159646ee0b00(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_86438689_9bac_4124_a914_2d6ad809278a(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(Math.pow(f, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_3cdb8220_acb1_4cc0_abad_ac7d5ecf1c39(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_53c5c9ec_92a0_437f_987a_3ebb8bf4d9f6(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_3a98dbc3_1c79_407c_ac8a_520524e5f2a1(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_9_c022333e_f328_429d_be39_07a49d88251b(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_537409fd_1619_4d20_b8c5_60478171b6d8(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_0_97494216_010e_49a3_93d7_e890e3706e82(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_8_04955124_2381_43d1_ab66_991ca5ea584a(ArrayList<Float> lst) {
        return lst.stream().mapToInt(Math::round).mapToInteger(x -> x * x).sum();
    }

    
    public static int sumSquares_Problem_0_e861fb03_6da6_450f_af1f_39d76cde7596(ArrayList<Float> lst) {

        int sum = 0;
        for (float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_e80468c7_b0e7_4ed3_a0b7_18e118b57751(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_1f6e804a_a2a8_4c78_96c5_eada6ed28cf9(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_967b9836_af67_4f46_addd_4d299715cb5c(ArrayList<Float> lst) {
        // Return the sum of squared numbers in the given array list.
        int sum = 0;
        for (Float n : lst) {
            sum += n * n;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_78205afc_1404_4a3e_bf46_8e7d7a3f19d4(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_51d026c5_405d_41c5_bf28_c145eb23a3e5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_ec5cc652_720a_4bc6_93b9_b970965e1b56(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_e6cf2f7b_b605_4288_9fd6_962384295a2c(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x*x).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_5_5bbaf889_5a6c_41b6_b680_c35e02b8e9a0(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_2d7ad5b1_79d4_47f2_a048_8fb795568437(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_eca3d133_816c_410e_852f_20675091b1cc(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_50d68640_5b92_4191_833f_b6d6c9da8dfe(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_c3548cb1_41f7_47ed_97f1_8453cb1bc557(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_14445f9f_33b7_4348_a985_41bf33e06360(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_2bf082b4_0952_4fa4_aa5a_8d1c7b197832(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_3850446d_aa57_4c5b_87ac_73eb28ace346(ArrayList<Float> lst) {
        // Write your code here
        return lst.stream().map(it -> Math.round(Math.ceil(it))).map(it -> it * it).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_6_af365e8b_3f90_45c5_a2ef_54d99114082d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_426bea4a_3a34_43ab_a0fe_dfde9dabca5f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_9a9cc892_be14_47cf_b7df_1a782d7276af(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_8_02757ca9_9d9d_41e9_9535_0580792ff587(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cfc2e522_b86e_4054_9a0a_20d262845b6d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_2f8de0bc_034a_4363_91eb_831bcd39616b(ArrayList<Float> lst) {
        if (lst.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.ceil(lst.get(i)) * Math.ceil(lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_9c900637_3afd_4489_b671_ef66e68ce5da(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_e0dfe2a4_189b_46fe_aa91_55911f3749e1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_65845ca4_6afd_4ab2_b66d_e7924d41947f(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_7_56d15786_17e6_442b_8df6_71d3d0170b06(ArrayList<Float> lst) {
        int sum = 0;
        for (float f : lst) {
            sum += Math.round(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_83110c24_39ca_491c_bb9d_8e90aa3b2eaf(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_0_14bbe3e5_2b5f_4f18_8258_f755748efa1d(ArrayList<Float> lst) {
        return lst.stream().map(v -> Math.ceil(v)).map(v -> v * v).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_5c0b3832_87d8_4724_8fbf_f06814e962d0(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += (f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3fb65c0e_99bf_43b5_afb3_603ef669d54b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3caa05ab_99bc_4907_84df_cc425f01dd79(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_4_bc69c205_66e5_49e6_8e90_c6ee8a0fc1be(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_6e0d6c7f_0f61_44dc_b49b_c6517060bc06(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_be6e6d96_6f27_4f8f_a749_440710e73103(ArrayList<Float> lst) {
        int sum = 0;
        for (Float x : lst) {
            sum += Math.pow(Math.round(x), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_968e4843_1644_47ac_8295_fb65a27bcd33(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_fcd38ff8_c925_4c80_b848_2d396bcc8c91(ArrayList<Float> lst) {

        int sum = 0;
        for(Float i : lst) {
            sum +=  Math.ceil(Math.pow(i, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_b2845bf7_abc0_4c6c_81a8_0163741bc3a1(ArrayList<Float> lst) {

        int sum = 0;
        for (float i : lst) {
            sum += Math.ceil(i) * Math.ceil(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_fa25320d_566a_466f_8c33_6453bfe7f4cd(ArrayList<Float> lst) {
        return lst.stream().map(Float::intValue).map(i ->  Math.ceil(i)).map(i -> i * i).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_98c777a0_8b61_49f2_ad4f_f6e409499779(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_e6faab06_c2aa_4620_b690_a5568edba4d4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_c7f3aab5_091a_4411_808d_889a2efc6735(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_7_f16b7199_5d8f_45e5_abf3_f2c5cf891cf7(ArrayList<Float> lst) {

        // Write your code here
        return lst.stream().mapToInteger(Math::round).map(i -> i * i).sum();
    }

    
    public static int sumSquares_Problem_5_d21b1832_dcd1_4095_a44b_998aadc0fc7f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_8d881343_4b83_49e5_8eb7_c9d8c72c8f37(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_cbf2c976_76e2_4603_82e7_fbd23c5acdf3(ArrayList<Float> lst) {
        return lst.stream().map(n -> Math.ceil(n)).map(n -> n * n).reduce(0, (sum, n) -> sum + n);
    }

    
    public static int sumSquares_Problem_1_486baaee_7c18_4da0_b569_03cfb828efa4(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d968b4ea_a5c8_4a74_8080_ed95085d1454(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_0_2432aa8c_6ff1_4996_96a1_df4c2728b961(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_0_968415b7_5a06_4764_980f_937d65fb3cfc(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.pow(Math.ceil(x), 2)).sum();
    }

    
    public static int sumSquares_Problem_10_c84d671a_2511_4f6d_b0a0_3c4606b5d2ac(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_22900bd1_1721_4943_81c7_d68c92d05d74(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_1e41104b_4207_45aa_a4ee_15174b731f8a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a,b) -> a+b);
    }

    
    public static int sumSquares_Problem_5_16cfbd6f_554a_4b08_a144_5e80f098da4e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_10_5b969711_32b8_44e7_9640_386712b92568(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_eca3d133_816c_410e_852f_20675091b1cc(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_4_c830edb2_0a38_4d39_9395_96bb547393a3(ArrayList<Float> lst) {
        // Your code here
        return lst.stream().mapToInteger(Float::floatToIntBits).reduce(0,(acc,x)->acc+Math.pow(x,2));
    }

    
    public static int sumSquares_Problem_0_996dc523_e8d5_49fa_8028_d1b531e9098c(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_57e20a47_d1d9_4bd0_85c0_c5df3dc42847(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_7a505620_267b_4d8f_9a1b_a50791dba5f2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_7_81383991_91f0_4bfe_b650_5f7fc71f65b8(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_c039eb02_87ab_4fd0_a5ee_0fe1afea298c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_0a8a9676_d13e_4744_a341_485855c0da42(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_3_94b52245_c0f7_4551_91cb_79c65748036f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_a7854ca4_5a70_4199_8d7d_d5b97e67fb32(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_11_d4f2efb9_92bf_4454_a933_bcd9f074c3fc(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f*f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_cd5522c9_6017_4ffc_92fa_7a1a02a487a1(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_9_bd8d3c35_090c_487d_a486_a26f5a7f4ec7(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(n -> Math.round(n) * Math.round(n)).sum();
    }

    
    public static int sumSquares_Problem_0_4094dd72_d4ad_4b2b_87ee_4c0b9c87bea9(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_9_b37ccc99_60d9_4c41_905c_1271e982584e(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_52455dd8_ed1f_43ad_a677_f61d20a95129(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_cf829ac0_97e7_4d0c_9126_24b4fd1cc8b2(ArrayList<Float> lst) {
        int result = 0L;

        // get list of numbers
        ArrayList<Float> numbers = lst;

        // iterate through the list
        for (Float number: numbers) {
            // compute the sum of squared numbers
            result += number.floatValue() * number.floatValue();
        }

        // round result to nearest int
        result = Math.round(result);

        // return result rounded to nearest int
        return result;
    }

    
    public static int sumSquares_Problem_0_46561f50_b3b7_4c9c_b731_2225063ec4e4(ArrayList<Float> lst) {
        int sum = 0;
        for (Float num : lst) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_c92e445b_b007_4669_8cab_f163a65ac07f(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_22f77089_df04_4167_a2a1_c491c0152c5c(ArrayList<Float> lst) {
        double sum = 0.0;
        for(Float x : lst) {
            sum += Math.pow(x, 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_5_a43b58b9_3337_4101_a0c4_5b8527cee2a9(ArrayList<Float> lst) {
        ArrayList<Float> result = new ArrayList<Float>();
        for (Float el : lst) {
            result.add(Math.ceil(el));
        }
        // System.out.println(result);
        int total = 0;
        for (Float el : result) {
            total += el * el;
        }
        return total;
    }

    
    public static int sumSquares_Problem_3_ad05e38e_8a00_48a2_b65a_1006e25dd285(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_f063c2e4_e46f_4c0c_99e7_e6d0dbf4c6c4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_42a63e11_2725_4ad6_95dd_2c8af19cb6d3(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_21ccc867_c702_47fd_842b_c86a4f92bf1d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_4d3bdf59_3289_421f_bd71_75c29c67d6f4(ArrayList<Float> lst) {
        int sum = 0;
        for(Float x : lst) {
            sum += Math.round(x * x);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3850446d_aa57_4c5b_87ac_73eb28ace346(ArrayList<Float> lst) {
        // Write your code here
        return lst.stream().map(it -> Math.round(Math.ceil(it))).map(it -> it * it).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_3f897594_3486_40dd_8a25_405b7fe79487(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_20882c2e_0545_41a5_b240_e3c07eac6afb(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_458afb77_d926_4fab_bfc6_7fc1bca7b43d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_4_ff5f67ed_369e_4dbc_8957_79cc32d35d66(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum +=  Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_e56b8174_46e6_453f_8cd7_157d62d5e1b7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_7b57791a_c94f_407d_9b03_8c9cc4fe2bcd(ArrayList<Float> lst) {
        return 0;
    }

    
    public static int sumSquares_Problem_0_93723ec6_f02f_4f38_bc81_5b71b5d78553(ArrayList<Float> lst) {

        int sum = 0;
        for (Float i : lst) {
            sum += Math.round(Math.pow(i, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_03ee8c9b_7638_4d81_bfa9_b668bfc92f6f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_4db47fa3_4bf6_4ed1_9776_9afac23981fc(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_6a4cde99_b5d1_47ca_b6bf_12fc5a913259(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_af228eb4_80ec_4250_a4e9_19dc769702f6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_1_4bf3b389_47e6_4a81_8b2d_c54d308166ea(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(Math.ceil(x), 2)).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_11_2fee37fb_3439_4d60_aa1c_5e911402b7e4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_0_20185846_2e18_4c8c_b384_7bc9a185abb9(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_03ee8c9b_7638_4d81_bfa9_b668bfc92f6f(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_6_8099b17d_0403_4715_be03_3a7fb733d13e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();
    }

    
    public static int sumSquares_Problem_0_8061a0f1_6bc2_4707_9cfc_b79d83f3a28e(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_375a1b4b_f230_419d_99ab_6f9457120d8f(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_41e05849_e23e_41ad_a4b0_bf9e4cec76ac(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_bda9f2f8_3df4_49ac_ad3e_4fe9a7f83cdf(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_83110c24_39ca_491c_bb9d_8e90aa3b2eaf(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_0_2c13ef0a_061d_47d5_8e1c_cf29dd1313f0(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_af228eb4_80ec_4250_a4e9_19dc769702f6(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_2_8b088253_78b7_4957_8e24_cdef6ff156ba(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_375a1b4b_f230_419d_99ab_6f9457120d8f(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_0_d2396a57_8e0b_4498_b181_b34f44332009(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x,y) -> x+y);
    }

    
    public static int sumSquares_Problem_7_d17bdc7b_b41d_4d7b_b4cc_ac85b61a3653(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_6_0430bfad_6491_4384_8792_eebcb2a624df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_7430fc21_e279_4b16_9725_295fbf07564a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_b9e7c61d_2726_4848_adb7_02f5a2cacc27(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_10_ae98989f_663a_4d63_85c2_1741361e2dc7(ArrayList<Float> lst) {
        return lst.stream().map(e -> Math.ceil(e)).map(e -> e * e).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_2_210d4172_2ef0_449c_a874_1179286edf97(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_bf44cfe3_0d11_426e_a42c_2cda116923d0(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(Float::intValue).map(i -> i * i).sum();
    }

    
    public static int sumSquares_Problem_10_219ddef2_0360_4864_8d33_20c8ee3f63e1(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_1_5fe34de7_11c0_45d1_a489_b758a74fdc4d(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_37631f07_64e5_4634_8fa3_6607eee75db4(ArrayList<Float> lst) {

        // Your code here
        return lst.stream().map(x -> Math.round(Math.pow(x, 2))).reduce(0L, Integer::sum);
    }

    
    public static int sumSquares_Problem_1_65257237_690e_4d41_b879_ed57b06653e9(ArrayList<Float> lst) {
        float sum=0;
        for (Float num : lst) {
            sum += num*num;
        }
        return Math.round(Math.ceil(sum));
    }

    
    public static int sumSquares_Problem_0_0218508f_19cf_457b_a562_17f36dc247ce(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_707db7da_0f7e_4a4c_acc9_e3cedc7e1ac6(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_5_8989a331_754c_45ef_b6eb_8cdc5a374f5d(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_feb15843_a747_4114_ae6e_5a5b4e9808df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_f1f033c5_643a_4c21_a0bd_40ca2086a4ca(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_b0d5dfc8_f4b1_469c_89d5_494f398e7e23(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_d63fda02_5f1b_4067_9e17_7c2ad1f303ed(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_0_8fc7c0b6_3b21_4957_b3e5_7081bce5312f(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_20f294ed_7a9c_4440_a085_64a73ba2bcb3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_83b1185a_cb55_4827_b7e1_8e1075cc9143(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_554a1f13_74b4_41b6_a41f_9523e681ca61(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_1_83110c24_39ca_491c_bb9d_8e90aa3b2eaf(ArrayList<Float> lst) {
        return lst.stream().mapToInteger(x -> Math.round(x) * Math.round(x)).sum();

    }

    
    public static int sumSquares_Problem_11_2e6440e0_7bb3_4e2f_9df3_a071b6f0d05a(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_36b6a03e_b939_4511_8a81_57f68b22044a(ArrayList<Float> lst) {

        return lst.stream().map(x -> x * x).map(x -> Math.ceil(x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_1_4eeaa165_d915_4fc1_a93c_7314327e764e(ArrayList<Float> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i) * lst.get(i);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_4d20cfe7_25cb_4356_bee1_47201ace1b7f(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_6_f30120ef_14e8_43ea_b97b_0f3cc213a203(ArrayList<Float> lst) {
        int sum = 0;
        for(Float f : lst) {
            sum +=  Math.pow(f ,2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_7322751d_bdf6_4b23_97b8_fef41e9724a5(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_05a8c18e_db63_4aa5_b5b9_b8504cd6ab04(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.round(x)).map(x -> x * x).mapToInteger(x -> x).sum();

    }

    
    public static int sumSquares_Problem_6_9c183292_8a17_40f9_a01e_419884fdc4de(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_9_52d0299d_7424_4279_a05f_2e898039c036(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_7afb72f8_1957_439a_a058_e57dd11e30cf(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_2_cbcabd0a_38d2_4c6b_a501_4f87ab57e94f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_d3da8d6c_4bcb_409d_bc82_3962d196d7f7(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_6b997be2_e89c_49a9_b62c_edffccd33cc2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_bd53d1bf_12e8_48ea_aab1_bbca54e0024b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_4d9a6532_9bff_4b9d_97d1_70eb438a8243(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_e1f81dd6_f590_4bbb_8f4d_35c3e66b013a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).map(x -> Math.pow(x, 2)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_29579256_fb52_401a_bcd4_da36ebd169c1(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_c8939b10_d327_4bc0_8550_975802aacb81(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_e5f1f498_fdec_4903_903e_c7f9b079c1a3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_2d7ad5b1_79d4_47f2_a048_8fb795568437(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_2ea35368_e7bb_4e26_8db9_504727ea6c04(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_f3b0961c_1e73_46b9_9cbc_4168e858093b(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x ->  Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_7_6b848ea1_07fc_4181_95e1_463534cf9ed9(ArrayList<Float> lst) {
        // Solution here
        return 0;
    }

    
    public static int sumSquares_Problem_9_7af8d71d_d549_4859_adf8_78bb25080dd0(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_5_9809f986_54a2_45fb_9b9a_467fc20ee625(ArrayList<Float> lst) {
        int sum = 0;
        for (Float i : lst) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_fff4e117_67cb_4b99_9cd4_80cb445f367b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_079bb03a_2e10_4201_90da_bddad9b34db1(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_b80c041b_993d_46f3_85a7_2d80bfbf062f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_9_2a548d15_b914_44db_b353_d5146b2d7ed6(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f) * Math.ceil(f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_3_067fff98_fbfb_44b4_b33b_9341b88bfa1b(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.pow(Math.ceil(lst.get(i)), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_ac85a777_cd41_4948_ab0d_5a4d5d308d05(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_8d881343_4b83_49e5_8eb7_c9d8c72c8f37(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_8_2d35c800_4468_4ed7_a555_d2b6f972c876(ArrayList<Float> lst) {
        // Write your code here.
        return 0;
    }

    
    public static int sumSquares_Problem_1_2311c648_8b31_407f_bf94_d3b3358e80c9(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(Math.pow(x, 2))).sum();
    }

    
    public static int sumSquares_Problem_7_e4bd1b65_da49_45a4_9a55_85133ef60fb4(ArrayList<Float> lst) {

        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += Math.round(lst.get(i) * lst.get(i));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_9cb4907c_c28b_441a_8673_01f0e34c26c0(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_0_cd9e92f5_3e7e_4c07_87a5_443ed3dd59df(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_aee7cd19_e181_4f9d_80fc_bccb10331f3c(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x)).mapToInteger(x -> Math.pow(x, 2)).sum();
    }

    
    public static int sumSquares_Problem_2_690c1338_0c21_4d84_b837_fc42d81ccc3a(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_11_f55444a7_6e96_44ec_89b4_46c3cc4479c3(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_2_67420f5e_052d_4f4c_9fa3_2943a9d67725(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_c6ee1980_6aff_4949_9b0f_bb27df0efe74(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_3a34059a_b1b9_4b48_aae9_e5416e66521f(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.intValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_aacd03ba_c9c9_4fab_b50c_00187e00e788(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_7_193669bc_40a0_4332_9ccc_5da219fed95c(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_0_61b568a0_30ec_4ad2_9868_e3397841fa69(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum +=  Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_50dc9be7_ed9e_4223_afff_5565a719018e(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.round(x * x)).reduce(0, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_7_79c2a0b4_6e92_43d4_9143_da635e58264b(ArrayList<Float> lst) {

        // Implement this function
        return 0;
    }

    
    public static int sumSquares_Problem_1_70f8e979_e47a_4d65_a1ee_efac4f2cd2f5(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.round(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_6b997be2_e89c_49a9_b62c_edffccd33cc2(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_0_a6b0ddca_d2fc_4521_bccb_c2cd211d9d7a(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.pow(x, 2)).mapToInteger(x -> Math.round(x)).sum();
    }

    
    public static int sumSquares_Problem_9_fbdfe155_4600_4de4_88ba_3608e3bf4495(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.ceil(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_8_7c3f28e2_4d5a_429c_a6a1_eee7eca6cd0c(ArrayList<Float> lst) {
        // your code here
        Integer sum = 0;
        for (Float n : lst) {
            sum += Math.round(Math.pow(n, 2));
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_20f294ed_7a9c_4440_a085_64a73ba2bcb3(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_e5e69393_422c_4d7a_83ea_ada36a320d64(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += f * f;
        }
        return sum;
    }

    
    public static int sumSquares_Problem_4_cca9ee35_57f1_4c1c_ad6f_16219baed401(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x * x)).sum();
    }

    
    public static int sumSquares_Problem_1_d220c8a5_6be2_4688_8541_ab7d4e30cef4(ArrayList<Float> lst) {

        return lst.stream().mapToInteger(x -> Math.ceil(x*x)).sum();
    }

    
    public static int sumSquares_Problem_10_12d1221d_c90a_4890_8a67_c385a7930df5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(Math.ceil(f), 2);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_10_23cda737_4f6a_40e2_ad02_ef6a10a4b7c9(ArrayList<Float> lst) {
        float sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f.floatValue(), 2);
        }
        return Math.round(sum);
    }

    
    public static int sumSquares_Problem_4_79f195fe_414d_4e53_8af8_ce26958b9fac(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, Integer::sum);
    }

    
    public static int sumSquares_Problem_10_ab0fd528_b912_492a_927e_4d4d2d06e4d4(ArrayList<Float> lst) {

        return lst.stream().map(x -> Math.ceil(x*x)).reduce(0, (a,b) -> a+b);
    }

    
    public static int sumSquares_Problem_4_89bcb7d3_8e2d_45e4_b2eb_8887f614335b(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_09e68bda_d520_426c_9081_0098adc987c5(ArrayList<Float> lst) {
        int sum = 0;
        for (Float f : lst) {
            sum += Math.pow(f, 2);
        }
        return sum;

    }

    
    public static int sumSquares_Problem_1_3f3f79fc_caa6_4da5_83ce_f3afd6b5b719(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0L, (a, b) -> a + b);
    }

    
    public static int sumSquares_Problem_10_d6de7b01_a2cf_4f8a_a4b0_890e80f56151(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_11_6cbcadbf_ee7d_4f39_90fe_64735b50358d(ArrayList<Float> lst) {

        int sum = 0;
        for (Float f : lst) {
            sum += Math.round(f * f);
        }
        return sum;
    }

    
    public static int sumSquares_Problem_1_a05cebdd_91d0_4d61_b284_f2fd0b013400(ArrayList<Float> lst) {
        return lst.stream().map(x -> Math.ceil(x)).map(x -> x * x).reduce(0, (x, y) -> x + y);
    }

    
    public static int sumSquares_Problem_8_fea532a1_3579_41e2_b2c1_d730d92f0905(ArrayList<Float> lst) {
        return lst.stream().map(num ->  Math.ceil(num) *  Math.ceil(num)).reduce(0, (total, num) -> total + num);
    }

    
    public static int sumSquares_Problem_1_7930212a_423b_4359_854f_24c93cd67354(ArrayList<Float> lst) {

        return lst.stream().map(x ->  Math.ceil(Math.pow(x, 2))).reduce(0, (a, b) -> a + b);
    }

}
