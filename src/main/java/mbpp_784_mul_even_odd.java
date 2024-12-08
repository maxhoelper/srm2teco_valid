package mbpp_784_mul_even_odd;

public class mbpp_784_mul_even_odd {

    
    public static int mulEvenOdd_Problem_1_5d9c7ce0_0e8f_4c92_866b_981b1c13aa54(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_97521506_49e7_4773_b284_60cc5dce9bd2(ArrayList<Integer> list1) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(list1.get(0));
        for(int i=1;i<list1.size();i++) {
            if((list1.get(i) % 2) == 0)
                list.add(list1.get(i));
        }
        int num = 1;
        for (int i : list) {
            num = num * i;
        }
        return num;
    }

    
    public static int mulEvenOdd_Problem_1_40d0da5e_627f_48da_832f_facc809c11fa(ArrayList<Integer> list1) {
        int product = 1;
        for (int num : list1) {
            if (num % 2 == 0) {
                product *= num;
            }
            else {
                product *= num * -1;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_587ade9f_ea80_451e_80cf_0c80b948b603(ArrayList<Integer> list1) {
        int product = 1;
        // Iterate the given arraylist to get the even and odd numbers.
        for (int i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
            if (i % 2 != 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_901b051e_06f3_41c7_b56d_adf4b08c78e4(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_4d3f729c_fdc8_4ee2_a125_bd73261d7e90(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_1cc10164_50a9_47d7_819d_955687a210b8(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_d025c2f0_8be4_43c2_beaa_e3d82321440b(ArrayList<Integer> list1) {
        int even = 1;
        int odd = 1;
        for (int i : list1) {
            if (i % 2 == 0) {
                even *= i;
            } else {
                odd *= i;
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_0_a0650598_7123_444a_b947_62082b648315(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_35ea9a51_f91e_4cb8_b74f_0205e1807815(ArrayList<Integer> list1) {
        int product = 1;
        for(Integer i : list1) {
            if((i%2) == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_dc439ed2_b05a_4f6c_858e_450f0389d0e9(ArrayList<Integer> list1) {
        int ret = 1;
        for (Integer n : list1) {
            if (n % 2 == 0) {
                ret *= n;
            }
        }
        return ret;
    }

    
    public static int mulEvenOdd_Problem_2_824a4ed5_14dc_4e67_8383_50666c8df91e(ArrayList<Integer> list1) {
        int product = 0, prod = 1L;
        for(Integer i : list1){
            if(i%2 == 0){
                prod *= i;
            }
            if(i%2 == 1){
                product += i;
            }
        }
        System.out.println("product is " + product);
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_0e809c7d_28c5_446d_a427_07d857d10d07(ArrayList<Integer> list1) {
        int product=1;
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)%2==0){
                product*=list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_5632a34d_186c_467b_9cd8_66b53fc0c781(ArrayList<Integer> list1) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                even = list1.get(i);
                break;
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 != 0) {
                odd = list1.get(i);
                break;
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_0_b1e6d5ad_cab1_4ae3_80ff_e777305138c7(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_081f47e8_d1e0_4f86_ae49_b02b6f97b13e(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_1cffbfe7_7e68_425e_9333_3f8edc58986d(ArrayList<Integer> list1) {
        int result=1;
        for (int i=0; i<list1.size(); i++) {
            int x=list1.get(i);
            if (x%2==0){
                result=result*x;
            }
            else if (x%2!=0){
                result=result*(x+1);
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_2_d983cc4a_2968_476e_986d_665384024a42(ArrayList<Integer> list1) {
        int sumOfProduct = list1.stream().reduce(1L, (a, b) -> a * b);
        return sumOfProduct;
    }

    
    public static int mulEvenOdd_Problem_0_37502fe4_f673_4982_a0ee_a04b399ea97d(ArrayList<Integer> list1) {
        // Write your code here
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_2_0407f640_90fe_4b92_a330_627b4019e5a1(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_b16db438_fa10_46b2_b3ee_75c05d8e2d61(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_0aad4cec_9008_42a6_ad10_90743926fb26(ArrayList<Integer> list1) {
        int product = 1;
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // Create temporary array
        for (int element : list1) {
            if (element % 2 == 0) {
                list2.add(element);
            }
        }

        for (int element : list2) {
            if (element % 2 != 0) {
                product *= element;
            }
        }

        return product;
    }

    
    public static int mulEvenOdd_Problem_2_c05e8548_7b7a_46e4_bafe_04a13bef0404(ArrayList<Integer> list1) {
        int product = 1;
        for (int i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_a4b57b92_c128_42aa_ba61_f625f026d891(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_9dc9ed26_fc0d_4a52_bb5c_2ebdc32b751e(ArrayList<Integer> list1) {
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_1_1793bee7_6de1_452e_b3c9_e3202fc79927(ArrayList<Integer> list1) {
        int prod = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(i % 2 == 0) {
                prod *= list1.get(i);
            }
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_2_815a3993_fe61_4101_8ac4_968c75351ba4(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_1220b529_f978_424a_b261_01b1a0c09116(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_37114f65_1d3b_4325_90d0_622688c4728f(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_6c075cae_a436_455c_8ed9_ba4bad28e873(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_7d2688ef_66c1_4c80_a829_379f1d590113(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_5d46ca63_a626_4065_b31d_a04bc416b57e(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_01e23b79_d4c9_4004_9643_b2969f38ab12(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_bca6ec95_5631_4a4d_b9ed_f53eb2dfe358(ArrayList<Integer> list1) {
        int result = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                result *= list1.get(i);
            } else {
                result *= list1.get(i);
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_2_a615d445_f8f9_4cad_90cf_c5242482a50d(ArrayList<Integer> list1) {
        int product = 1;
        int length = list1.size();
        for (int i = 0; i < length; i++) {
            if (list1.get(i) % 2 == 0)
                product *= list1.get(i);
            else
                product *= list1.get(i);
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_85e7d9c3_da70_4c39_845c_9ab337bcc4a4(ArrayList<Integer> list1) {
        int product = 1;
        for(Integer i : list1) {
            if((i%2) == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_ead2bbc0_6c9f_4bf1_9ee8_6ce53f9b4ded(ArrayList<Integer> list1) {
        int sum = 0;
        for (int l : list1) {
            if (l % 2 == 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int mulEvenOdd_Problem_2_f87b4bff_342e_409e_8940_ef2ff7762ed7(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_e4280b3a_8a30_467c_ad18_272aeb79ffea(ArrayList<Integer> list1) {
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_0_466e4bdb_49f0_4957_a826_c4df40d61f35(ArrayList<Integer> list1) {
        int result = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                result *= i;
            } else {
                result *= i;
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_0_a6663e81_ddff_43f1_96c9_9aa03ab03f12(ArrayList<Integer> list1) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even = list1.get(i);
            } else {
                odd = list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_0_21410648_eca5_4bc1_bbaa_0995cb061383(ArrayList<Integer> list1) {
        // TODO implement here
        return 0;
    }

    
    public static int mulEvenOdd_Problem_0_7a8608de_e4b5_428c_99a1_231cc4a4d058(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_1efd0e38_bb0b_4eff_8c57_d3e01bb98e97(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(i % 2 == 0) {
                product *= list1.get(i);
            }
            else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_85f4c99a_a9b8_41d3_b9b3_50fa59384333(ArrayList<Integer> list1) {
        int product = 1;
        for (int i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_f668f367_5241_4f0a_8dc2_467b100a8335(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_3ccc44ae_1f05_45bb_b927_f8a1cdc6dde9(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_5568336c_6f20_4d85_be56_1f507764fc73(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_471b6da1_1a68_435c_92dd_2ae78e29d6f8(ArrayList<Integer> list1) {
        if(list1.isEmpty()) {
            throw new RuntimeException("No elements");
        }
        int p = 0;
        Iterator<Integer> it = list1.iterator();
        while(it.hasNext()) {
            int nextVal = it.next();
            int evenVal;
            int oddVal;
            if(nextVal%2 == 0) {
                evenVal = nextVal;
                oddVal = 1;
            } else {
                evenVal = 1;
                oddVal = nextVal;
            }
            p += evenVal*oddVal;
        }
        return p;
    }

    
    public static int mulEvenOdd_Problem_0_11eb9eff_aad6_4044_9c5f_eee1052306c2(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_b7e27f65_46d0_4592_8c75_f35b1fcb6233(ArrayList<Integer> list1) {
        int result = 1;
        for (Integer num : list1) {
            result *= num;
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_0_41b0b889_008e_4192_b3a2_ff7e6221edd5(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_e4280b3a_8a30_467c_ad18_272aeb79ffea(ArrayList<Integer> list1) {
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_1_f19ee13d_99da_426c_bee6_ad146d2df761(ArrayList<Integer> list1) {
        int product = 1;
        for(Integer num : list1) {
            if(num % 2 == 0) {
                product *= num;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_3a8c5fcd_7ff3_48da_8f53_a1a5e1ee2f52(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_64167945_9b68_4527_85b8_1339a3aed397(ArrayList<Integer> list1) {
        int prod = 1;
        for (int i = 0; i < list1.size(); i += 2) {
            prod *= list1.get(i);
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_2_cd76418c_e0f5_4223_b275_35f11074b6df(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_a71a36c3_ca75_4ea3_a7d1_19443bfec506(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(i % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_59309f68_9dcb_4997_b512_8ce41717f29a(ArrayList<Integer> list1) {
        int sumEven = list1.stream().filter(x -> x % 2 == 0).mapToInteger(x -> x).sum();
        int sumOdd = list1.stream().filter(x -> x % 2 != 0).mapToInteger(x -> x).sum();
        return sumEven * sumOdd;
    }

    
    public static int mulEvenOdd_Problem_2_feee6c0b_ddec_48a4_b16c_ccc62961460d(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_471b6da1_1a68_435c_92dd_2ae78e29d6f8(ArrayList<Integer> list1) {
        if(list1.isEmpty()) {
            throw new RuntimeException("No elements");
        }
        int p = 0;
        Iterator<Integer> it = list1.iterator();
        while(it.hasNext()) {
            int nextVal = it.next();
            int evenVal;
            int oddVal;
            if(nextVal%2 == 0) {
                evenVal = nextVal;
                oddVal = 1;
            } else {
                evenVal = 1;
                oddVal = nextVal;
            }
            p += evenVal*oddVal;
        }
        return p;
    }

    
    public static int mulEvenOdd_Problem_2_937c3b87_7083_400e_9b03_ea4af6aea326(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if ((list1.get(i) % 2 == 0) && list1.get(i) > 1) {
                product = product * list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_61396fc5_2f75_4c36_96b8_fd29dd95ec3e(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_291d40d6_6ca6_4f61_b66f_1dd807ef75b5(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_697b684f_e80c_4e20_afb6_2f75d920b680(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_b2bd5608_ab5c_4c02_8b3a_c748567c2cc9(ArrayList<Integer> list1) {
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_2_c06f3c87_b57f_49b2_a7c0_131664c69f84(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_825e1deb_011f_4edc_bf9c_d409e320bbd0(ArrayList<Integer> list1) {
        if (list1 == null || list1.isEmpty() || list1.get(0) == 0) return 0;
        return list1.get(0) * list1.get(1) / 2;
    }

    
    public static int mulEvenOdd_Problem_0_1efd0e38_bb0b_4eff_8c57_d3e01bb98e97(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(i % 2 == 0) {
                product *= list1.get(i);
            }
            else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_933b7f0e_a016_48dc_a798_95801ab0cfed(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_9b9210f4_3041_4653_9a03_2ceadb7c2da4(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_37114f65_1d3b_4325_90d0_622688c4728f(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_42b8fde3_199d_4830_821c_9c51099096bf(ArrayList<Integer> list1) {
        int prod=0;
        boolean isEven=True;
        for (Integer l:list1) {
            if (isEven) {
                prod=prod+l;
            }
            isEven=!isEven;
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_1_b2243cfb_116a_4c81_baf8_ecd0c11b8647(ArrayList<Integer> list1) {
        int result = 0;
        for (int i : list1) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_2_2d6fa422_cd18_4c68_9f31_9c834d6118ed(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_569c7ab8_fcd0_4049_bc1e_64e899a6ace2(ArrayList<Integer> list1) {
        int product = 0;
        boolean evenOdd = True;
        for (Integer num : list1) {
            if (evenOdd && num % 2 == 0) {
                product += num;
            } else if (evenOdd && num % 2 == 1) {
                product *= num;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_1e6f698c_77df_4f07_b66a_7ce23b45885e(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_92febca9_9e60_4495_a9f1_b459f93f5972(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_e4aef2a7_9fb8_4b7d_baf7_6ceb306b09bc(ArrayList<Integer> list1) {
        return list1.stream().filter(x -> x % 2 == 0).findFirst().get() * list1.stream().filter(x -> x % 2 != 0).findFirst().get();
    }

    
    public static int mulEvenOdd_Problem_1_8a22401e_1ed0_449d_bfed_1b87021b8743(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_6e9f2a90_7b88_4c07_813f_fdd15a0cac58(ArrayList<Integer> list1) {
        
        return list1.stream().reduce(1L, (a, b) -> a * b);
    }

    
    public static int mulEvenOdd_Problem_1_3911c309_9018_4536_9112_be8a76311a48(ArrayList<Integer> list1) {
        int product = 1;
        for(int i : list1) {
            if(i%2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_108ff94f_8c46_45ac_a5c3_0e0829df2a92(ArrayList<Integer> list1) {
        int product = 1;
        for(Integer number : list1) {
            if(number % 2 == 0) {
                product = product * number;
            }
            else {
                product = product * number * 3;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_5f4db5c1_83f4_40b8_9c7c_27a67bbc5c58(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_2f884699_785d_49d8_acdb_463cd124bbf6(ArrayList<Integer> list1) {
        int prod=0;
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)%2==0){
                prod=prod*list1.get(i);
            }
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_1_3ef35fa7_92d5_4717_b958_33884b0046b5(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_3a8c5fcd_7ff3_48da_8f53_a1a5e1ee2f52(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_afeaa62c_fe56_44bc_8a83_37b8e96fa314(ArrayList<Integer> list1) {
        int even = 0;
        int odd = 1;
        int result = 1;
        for(int value : list1) {
            if((value % 2) == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        result = (even * odd);
        return result;
    }

    
    public static int mulEvenOdd_Problem_0_5d9c7ce0_0e8f_4c92_866b_981b1c13aa54(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_97521506_49e7_4773_b284_60cc5dce9bd2(ArrayList<Integer> list1) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(list1.get(0));
        for(int i=1;i<list1.size();i++) {
            if((list1.get(i) % 2) == 0)
                list.add(list1.get(i));
        }
        int num = 1;
        for (int i : list) {
            num = num * i;
        }
        return num;
    }

    
    public static int mulEvenOdd_Problem_1_37e1008b_f1c1_4a15_a06e_3b031142bd15(ArrayList<Integer> list1) {
        int p = 0;
        if (list1.size() > 0 && list1.get(0) != 0) {
            for (int i = 1; i < list1.size(); i++) {
                if (list1.get(i) % 2 == 0) {
                    p = p * list1.get(i);
                } else if (list1.get(i) % 2 != 0) {
                    p = p * list1.get(i) / 2;
                }
            }
        }
        return p;
    }

    
    public static int mulEvenOdd_Problem_1_c7d1113b_5646_49ef_9275_1d8617f0df11(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_3b675408_abbd_47a5_b62e_6eca288096d1(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product = product * i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_869469ec_4ff6_46d3_bdb7_8576df6981ac(ArrayList<Integer> list1) {
        int product=1;
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)%2==0){
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_9b44d552_c11d_4186_9e73_a518fea7cc33(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_098a6f03_80a4_4617_a045_9a765d797bad(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_6fb74d59_2e69_4bc4_976c_5a770a5e2f40(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_04f9c004_3074_49df_a700_afe0eb134b36(ArrayList<Integer> list1) {
        Integer product=null;
        for(int i=0;i<list1.size();i++){
            if (list1.get(i)%2==0){
                product=(product*list1.get(i))+list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_d25330ca_c2be_4f9a_bb31_b294838bf787(ArrayList<Integer> list1) {
        int mul = 1;
        for(Integer i: list1){
            if (i.intValue() % 2 == 0)
                mul *= i.intValue();
            else
                mul *= 2 * i.intValue();
        }
        return mul;
    }

    
    public static int mulEvenOdd_Problem_1_2d6fa422_cd18_4c68_9f31_9c834d6118ed(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_010c86e7_91fa_4c82_aacd_2400924a7407(ArrayList<Integer> list1) {
        int prod = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                prod *= list1.get(i);
            } else {
                prod *= list1.get(i);
            }
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_0_6e9f2a90_7b88_4c07_813f_fdd15a0cac58(ArrayList<Integer> list1) {
        
        return list1.stream().reduce(1L, (a, b) -> a * b);
    }

    
    public static int mulEvenOdd_Problem_1_83344716_86bf_4f2e_adf6_766801573b0a(ArrayList<Integer> list1) {
        int product = 0;
        for(Integer i : list1){
            if(i%2==0 && i!=0){
                product+=i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_98a0fddd_ad21_4544_bd40_b528bd5fff50(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_41e76a3f_f8c0_404b_8989_c6d65491bf0d(ArrayList<Integer> list1) {
        int evenNumber = 0;
        int oddNumber = 0;
        for (Integer integer : list1) {
            if (integer % 2 == 0) {
                evenNumber = evenNumber * integer;
            } else {
                oddNumber = oddNumber * integer;
            }
        }
        int product = evenNumber;
        product = product * oddNumber;
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_d483dbe6_8b04_42d8_b82a_0b19f3fe6b85(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_c6fa8951_6b71_44bd_a850_869d21c0560c(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_721ba38f_8962_4667_8bb6_a10320dc8774(ArrayList<Integer> list1) {
        int product = list1.stream().mapToInteger(x -> x%2 == 0 ? x*2 : x*3).sum();
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_f94ee3d7_1c48_4035_9c44_538fe87afd13(ArrayList<Integer> list1) {
        int sum = 0L;
        for(Integer i : list1){
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int mulEvenOdd_Problem_1_214c9577_32eb_403c_9d7c_832903bfa988(ArrayList<Integer> list1) {
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_0_8b60abfa_0b81_44a0_a56b_7db69189cfd6(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_ead2bbc0_6c9f_4bf1_9ee8_6ce53f9b4ded(ArrayList<Integer> list1) {
        int sum = 0;
        for (int l : list1) {
            if (l % 2 == 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int mulEvenOdd_Problem_2_39c97d63_f10e_4027_bd77_16c932d02621(ArrayList<Integer> list1) {
        // Your code goes here
        int sum =0;
        for(int i = 0;i<list1.size();i++){
        if(list1.get(i).intValue() %2 ==0)
            sum=sum+list1.get(i);
        }
        return sum;
    }

    
    public static int mulEvenOdd_Problem_0_16ad7e09_092a_4ec8_a73a_b5feffdccecb(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_e2c25d7d_5371_404c_b47c_d3d49729de8c(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_94e4a7f5_2f55_421a_92c5_ffa0e6df2178(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_feba80b8_77fd_4587_944f_9dfc0335d030(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_0c6b6a43_f9ed_4d58_ad2d_0cc03b0ff04b(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_3cea8c50_28d0_4540_9527_629cecf01787(ArrayList<Integer> list1) {
        // Write your code here
        int product = 0;
        int length = list1.size();
        int temp;
        for(int i=0;i<length;i++){
            if(list1.get(i) % 2 == 0){
                temp=list1.get(i);
                product=list1.get(i)*product;
                System.out.println(temp);
            }
        }
        System.out.println(product);
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_83344716_86bf_4f2e_adf6_766801573b0a(ArrayList<Integer> list1) {
        int product = 0;
        for(Integer i : list1){
            if(i%2==0 && i!=0){
                product+=i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_7963cd33_0ace_41d3_bbf8_2a73ed143d07(ArrayList<Integer> list1) {
        int result = 0;
        for (Integer val : list1) {
            if (val % 2 == 0) {
                result *= val;
            } else {
                result *= val;
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_2_039767e3_e7e6_4bc1_8175_a8c7dcb4084f(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_66693f17_2c06_454b_ac8e_a92a4b0c32a0(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_61f0ffe1_27ce_4d2b_afd3_bee2ef27b450(ArrayList<Integer> list1) {
        int product = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
            if (list1.get(i) % 2 != 0) {
                product *= list1.get(i) * list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_43a975b7_27d4_4e5e_aad2_2f436b080dd5(ArrayList<Integer> list1) {
        int result = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                result *= list1.get(i);
            } else {
                result *= list1.get(i);
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_1_c1cc3fd5_e3a3_41db_aac9_977670da9b95(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_5bdef4f5_145c_478c_9c3f_51a3e38c65f1(ArrayList<Integer> list1) {
        int result = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(i % 2 == 0) {
                result *= list1.get(i);
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_1_ef8a38f8_3677_45c2_b410_40ac75f3c512(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_ea02df41_668e_4d6f_b536_98928ccb1183(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_1e6f698c_77df_4f07_b66a_7ce23b45885e(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_26a5496d_618f_4a77_95f1_00eee4285cff(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_dcb6dd2f_6ee5_45ed_af2d_be8219a24820(ArrayList<Integer> list1) {
        int result = 0;
        for (int i = 0; i < list1.size(); i += 2) {
            result += list1.get(i);
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_2_85e7d9c3_da70_4c39_845c_9ab337bcc4a4(ArrayList<Integer> list1) {
        int product = 1;
        for(Integer i : list1) {
            if((i%2) == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_a0650598_7123_444a_b947_62082b648315(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_1af4bf10_55a0_41f2_8c10_d93d3597d656(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            } else {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_0102fbfa_67c5_43f1_8ae9_1a887964abd3(ArrayList<Integer> list1) {
        int prod = 0;
        for (Integer val : list1) {
            prod *= val;
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_2_b6ed2fcc_5bf8_4ed2_bf29_49c4c166b959(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_9e160779_18a6_4516_94c3_dc7cbf13aa8f(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(i % 2 == 0) {
                product *= list1.get(i);
            }
            else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_f19ee13d_99da_426c_bee6_ad146d2df761(ArrayList<Integer> list1) {
        int product = 1;
        for(Integer num : list1) {
            if(num % 2 == 0) {
                product *= num;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_e4dbdddf_3973_4e47_9683_a01d7d5cea61(ArrayList<Integer> list1) {
        int product = 1;
        int i = 0;
        while (i < list1.size()) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            }
            i++;
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_de8e4f2d_2143_4488_a33d_fe251b90ab59(ArrayList<Integer> list1) {
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_1_471b6da1_1a68_435c_92dd_2ae78e29d6f8(ArrayList<Integer> list1) {
        if(list1.isEmpty()) {
            throw new RuntimeException("No elements");
        }
        int p = 0;
        Iterator<Integer> it = list1.iterator();
        while(it.hasNext()) {
            int nextVal = it.next();
            int evenVal;
            int oddVal;
            if(nextVal%2 == 0) {
                evenVal = nextVal;
                oddVal = 1;
            } else {
                evenVal = 1;
                oddVal = nextVal;
            }
            p += evenVal*oddVal;
        }
        return p;
    }

    
    public static int mulEvenOdd_Problem_1_7bfa0dce_8b23_4ec1_897a_5ccfd1d69e9c(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer n : list1) {
            if ((n % 2) == 0) {
                product = product * n;
            } else {
                product *= n;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_084ff98a_20fe_4536_a694_28f5537d35d0(ArrayList<Integer> list1) {
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_0_30665b1a_4cc5_47a1_8b72_d5d991e04a5e(ArrayList<Integer> list1) {
        int product = 0;
        if (list1.size() > 1) {
            int len = list1.size();
            Collections.reverse(list1);
            for (int i = 0; i < len - 1; i++) {
                if (list1.get(i) % (len / 2) != 0) {
                    product += list1.get(i);
                }
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_9d921855_fac5_47d2_8e60_bcbca2fc8dfe(ArrayList<Integer> list1) {
        int product = 1;
        for (int i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_e1849391_7ae2_4761_9d7d_2d8ef2ff5e17(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_26a5496d_618f_4a77_95f1_00eee4285cff(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_c5f5e383_8474_4468_b78a_b3d48e0a15a1(ArrayList<Integer> list1) {
        int result = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                result *= list1.get(i);
            } else {
                result *= list1.get(i);
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_2_86ddf587_e137_4f2d_992d_4582d448c630(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_25abcdca_7581_4e5d_8092_298ef316c6b4(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_0224115e_ede9_42d5_9d42_e368c8a26b6c(ArrayList<Integer> list1) {
        int sum=0;
        for (int i=0; i < list1.size();i++) {
            if (list1.get(i) %2 == 0)
                sum += list1.get(i);
            else
                sum += list1.get(i) * 2;
        }
        return sum;
    }

    
    public static int mulEvenOdd_Problem_0_8c658501_941a_4899_a3dd_a76f5b23ac53(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_dc19c550_9b82_430a_a344_8e265a87ae98(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_c1cc3fd5_e3a3_41db_aac9_977670da9b95(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_6fb74d59_2e69_4bc4_976c_5a770a5e2f40(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_f8fa8384_4d3a_4e6f_8588_55d43f96d3a2(ArrayList<Integer> list1) {
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_0_869469ec_4ff6_46d3_bdb7_8576df6981ac(ArrayList<Integer> list1) {
        int product=1;
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)%2==0){
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_d5d92a0f_6c1d_41fa_82b6_005ba80be4aa(ArrayList<Integer> list1) {
        int prod = list1.stream().filter(x -> x % 2 == 0).reduce((x, y) -> x * y).get();
        System.out.println(prod);
        return prod;
    }

    
    public static int mulEvenOdd_Problem_0_ba3d4fca_4bac_42c6_bbe4_fe1eae46e8ae(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_16ad7e09_092a_4ec8_a73a_b5feffdccecb(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_e4f95164_588c_4d59_803b_7b2e430cddfe(ArrayList<Integer> list1) {
        
        int countEven = 0;
        int countOdd = 0;
        int multOfEven = 0;
        int multOfOdd = 0;
        for (Integer l : list1) {
            if (l % 2 == 0) {
                countEven++;
                multOfEven = l * multOfEven;
            } else {
                countOdd++;
                multOfOdd = l * multOfOdd;
            }
        }
        return multOfEven + multOfOdd;
    }

    
    public static int mulEvenOdd_Problem_0_f4387d79_b531_4f2a_a864_6254826fc4a0(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_e7c42c91_873a_43b4_b5bb_6351749563a0(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_c04fd011_b507_429e_b0df_ba0b49711639(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_30665b1a_4cc5_47a1_8b72_d5d991e04a5e(ArrayList<Integer> list1) {
        int product = 0;
        if (list1.size() > 1) {
            int len = list1.size();
            Collections.reverse(list1);
            for (int i = 0; i < len - 1; i++) {
                if (list1.get(i) % (len / 2) != 0) {
                    product += list1.get(i);
                }
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_4625a95b_dc35_4946_bc73_e5c817faacef(ArrayList<Integer> list1) {
        // Write your code here
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_0_59309f68_9dcb_4997_b512_8ce41717f29a(ArrayList<Integer> list1) {
        int sumEven = list1.stream().filter(x -> x % 2 == 0).mapToInteger(x -> x).sum();
        int sumOdd = list1.stream().filter(x -> x % 2 != 0).mapToInteger(x -> x).sum();
        return sumEven * sumOdd;
    }

    
    public static int mulEvenOdd_Problem_0_a3192cff_aba5_426d_a0c8_fa696c4caf1b(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_6ae377f3_2e84_4644_8c5c_217c0fa44557(ArrayList<Integer> list1) {
        int prod = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(i % 2 == 0) {
                prod *= list1.get(i);
            } else {
                prod *= list1.get(i);
            }
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_0_6cb4ab3e_1ba7_4a47_8d3c_70794f001026(ArrayList<Integer> list1) {
        int result = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                result *= list1.get(i);
            } else {
                result *= list1.get(i);
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_2_b53ac5fe_340c_4a7d_bea6_2a028c0269f6(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_9b9210f4_3041_4653_9a03_2ceadb7c2da4(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_413e6ae2_e347_4694_98c0_58aab6f4b71f(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_ae00079f_6fc2_49ec_b05d_f2782311b2d1(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_2f884699_785d_49d8_acdb_463cd124bbf6(ArrayList<Integer> list1) {
        int prod=0;
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)%2==0){
                prod=prod*list1.get(i);
            }
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_2_a6663e81_ddff_43f1_96c9_9aa03ab03f12(ArrayList<Integer> list1) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even = list1.get(i);
            } else {
                odd = list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_0_1377742e_deb7_41bd_ac8e_a74a788a5f30(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_b1de61e7_eb65_464d_ab4d_f1786564b4dd(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_9a9c086f_a12f_4717_802c_9e3b44ac1f80(ArrayList<Integer> list1) {
        int prod = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                prod *= list1.get(i);
            } else {
                prod *= list1.get(i);
            }
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_2_0fec4a44_7b7c_4a0d_b6f9_e06596a58461(ArrayList<Integer> list1) {
        int prod = 0;
        boolean isEven = False;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                isEven = True;
            }
            else if (i % 2 != 0) {
                isEven = False;
            }
            if (isEven == True) {
                prod += i;
            }
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_2_0c26b84e_883a_41e6_8e68_797c771704bd(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_009f803a_d3d9_444e_b865_1f4faff8432d(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_33e2c971_bb05_493a_b762_a7e94e967d1c(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_78cca85b_e915_4191_8772_aac5fb88369b(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_12693510_552e_48cb_807a_68503e78c436(ArrayList<Integer> list1) {
        int result = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                result *= list1.get(i);
            } else {
                result *= list1.get(i);
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_0_1f05ca9b_fc2a_42b1_9ab2_f7cdc77342d6(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_4cebd4ef_8e70_4b0d_a378_9af4ac9acfdd(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_ef8a38f8_3677_45c2_b410_40ac75f3c512(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_01f3cde1_3629_4083_b23c_3dee2abdb82f(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_37502fe4_f673_4982_a0ee_a04b399ea97d(ArrayList<Integer> list1) {
        // Write your code here
        int even = 1;
        int odd = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_1_9a425a8e_8473_4308_832d_5f3450c95c71(ArrayList<Integer> list1) {
        int sum = 0;
        int prod = 1;
        if (list1 == null) {
            return 0;
        }
        if (list1.size() % 2 == 0) {
            for (int i = 0; i < list1.size(); i += 2) {
                sum += list1.get(i);
                prod *= list1.get(i);
            }
        } else {
            for (int i = 1; i < list1.size(); i += 2) {
                sum += list1.get(i);
                prod *= list1.get(i);
            }
        }
        return prod;
    }

    
    public static int mulEvenOdd_Problem_0_61fea930_b049_42f6_86ab_d7372399e284(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_0fefc038_a38d_40ea_b3fb_bddc408c704b(ArrayList<Integer> list1) {
        // Write your code here
        int even = 1;
        int odd = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(i % 2 == 0) {
                even *= list1.get(i);
            } else {
                odd *= list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_2_cdb19f05_2c02_49f1_9e2c_25e82717ff6f(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_0dac9ad3_0cac_4463_a296_4704f404b75c(ArrayList<Integer> list1) {
        int result = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                result *= list1.get(i);
            } else {
                result *= list1.get(i);
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_1_c475244f_ea54_4d7b_8d08_a7e09f645bd7(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_3fa05d6b_8593_49b0_a7df_a948a588c65f(ArrayList<Integer> list1) {
        int result = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                result *= list1.get(i);
            } else {
                result *= list1.get(i);
            }
        }
        return result;
    }

    
    public static int mulEvenOdd_Problem_0_8b6309b3_73ea_42d6_83a6_57415830df85(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_8827dcd9_e629_4705_abb8_af8fd95848f5(ArrayList<Integer> list1) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                even = list1.get(i);
                break;
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 != 0) {
                odd = list1.get(i);
                break;
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_2_83344716_86bf_4f2e_adf6_766801573b0a(ArrayList<Integer> list1) {
        int product = 0;
        for(Integer i : list1){
            if(i%2==0 && i!=0){
                product+=i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_6a23f8c8_5543_4c50_bec4_ed3fe328e985(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_87f2868b_db45_42e0_85f6_dcb477ca5156(ArrayList<Integer> list1) {
        int odd = list1.stream().filter(i -> i % 2 == 0).mapToInteger(i -> i).sum();
        int even = list1.stream().filter(i -> i % 2 == 1).mapToInteger(i -> i).sum();
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_0_c99d5da0_f1a5_4da6_976e_862d23523787(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_aafccf09_1933_48e0_bae2_760f55cebec3(ArrayList<Integer> list1) {
        int product = 1;
        for(Integer i : list1) {
            if(i%2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_f033e6ef_b0f7_4b55_b5c5_c24697b0452c(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            } else {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_815a3993_fe61_4101_8ac4_968c75351ba4(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_ebbec59c_ff33_477a_921a_f4d5951d6871(ArrayList<Integer> list1) {
        int product = 0;
        for(int i=0;i<list1.size();i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
            else if(list1.get(i) % 2 != 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_0c6b6a43_f9ed_4d58_ad2d_0cc03b0ff04b(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_3a11ddfb_6c66_40b6_b05e_ca92d0e04ef1(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_e4dbdddf_3973_4e47_9683_a01d7d5cea61(ArrayList<Integer> list1) {
        int product = 1;
        int i = 0;
        while (i < list1.size()) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            }
            i++;
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_40dc0be4_d2af_4920_bdb3_567031a5319c(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_f5297b7d_5d20_424a_abe9_2623ad29a854(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_da2b6360_9f33_443a_929c_d3d6f9d74be2(ArrayList<Integer> list1) {
        int even = 0, odd = 0;
        for( int i = 0; i < list1.size(); i++) {
            if( list1.get(i) % 2 == 0 ) {
                even = even + list1.get(i);
            } else {
                odd = odd + list1.get(i);
            }
        }
        return even * odd;
    }

    
    public static int mulEvenOdd_Problem_2_8c658501_941a_4899_a3dd_a76f5b23ac53(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_2_9b793873_1551_424c_af9d_29d975d97a58(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                product *= list1.get(i);
            } else {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_5db35730_8e13_4cd7_a471_0dba67c5751a(ArrayList<Integer> list1) {
        if(list1.isEmpty()) return 0;
        int firstEven = list1.get(0) * list1.get(0);
        int firstOdd = list1.get(1);
        for(Integer num : list1) {
            if(num % 2 == 0) {
                firstEven *= num;
            } else {
                firstOdd *= num;
            }
        }
        return firstEven + firstOdd;
    }

    
    public static int mulEvenOdd_Problem_1_459b04fa_d1ad_47e3_8e39_3cc98443f92a(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer i : list1) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_aefd2e1e_d2d7_45b6_8eae_6dfd2c5a0fbf(ArrayList<Integer> list1) {
        int product = 1;
        for (Integer e : list1) {
            if (e % 2 == 1) {
                product *= e;
            } else {
                product *= e * 3;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_0a4613a3_a667_4c18_ac2d_307a9b374b2e(ArrayList<Integer> list1) {
        int product = 1;
        for(Integer i : list1) {
            if(i%2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_e18c3328_23fc_4cde_bdba_39d0d4d3c84d(ArrayList<Integer> list1) {
        int product = 1;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_0_90dd2c0c_9fd7_41a0_85dc_427b493ed049(ArrayList<Integer> list1) {
        int product = 1;
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0) {
                product *= list1.get(i);
            }
        }
        return product;
    }

    
    public static int mulEvenOdd_Problem_1_824a4ed5_14dc_4e67_8383_50666c8df91e(ArrayList<Integer> list1) {
        int product = 0, prod = 1L;
        for(Integer i : list1){
            if(i%2 == 0){
                prod *= i;
            }
            if(i%2 == 1){
                product += i;
            }
        }
        System.out.println("product is " + product);
        return product;
    }

}
