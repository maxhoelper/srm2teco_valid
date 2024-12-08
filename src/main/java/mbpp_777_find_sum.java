package mbpp_777_find_sum;

public class mbpp_777_find_sum {

    
    public static int findSum_Problem_2_7649a45a_6e39_43f8_9a80_f804238abc8f(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a832a1b7_8af5_4a43_a5e0_7d8c7ca04aee(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0396dc92_cb2c_4753_b18d_4a331a9b7f9c(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
            }
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a0f08eee_ee91_4dc5_a235_ea7e608ca3e6(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_67e81755_981b_4792_b115_e691ce115be3(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_2eba5e74_5ea5_4bd9_8cae_9a561b26c911(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_042b3da3_c5cf_4168_b330_8669d6829720(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_fbf344ab_1c4a_43ff_befe_b79b048dfcc3(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_416b8e4a_0dc3_449d_b16e_9ad588835e6a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0afe758b_d614_4d0f_9c5c_a3ff51737700(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_92587418_6b09_4883_b988_801de302ab1e(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int i : arr) {
            if (map.get(i) == 1) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e3ba8d4b_e65f_4062_9359_ab4c9c95b8df(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_90db3ee2_a33c_41aa_9b9d_c7fe57170c00(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_da9d7a9f_09e4_4027_8fbe_e03afc570aed(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int findSum_Problem_0_65aecb37_e36c_4da2_b68b_4191d2922baa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_ca5cdf26_db26_4f64_b0fa_d1ee2cca0788(ArrayList<Integer> arr) {
        return arr.stream().distinct().reduce(0L, (a, b) -> a + b);
    }

    
    public static int findSum_Problem_0_aeb163b9_4e3e_48fc_8812_7c071518bb1f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_52b347cd_e41f_4213_8023_14a555a31f36(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(0, i).contains(arr.get(i)) && !arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4c46d8d0_7fb7_464c_b2af_9900058bc8b8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_d203d640_0350_4899_bf84_4b4b23c2935c(ArrayList<Integer> arr) {
        int l = arr.size();
        int ctr = 0;
        int res = 0;
        for (int i = 0; i < l; ++i) {
            int item = arr.get(i);
            boolean found = False;
            for (int j = 0; j < i; ++j) {
                if (arr.get(j) == item) {
                    found = True;
                    break;
                }
            }
            if (!found) {
                res += item;
                ctr++;
            }
        }
        return ctr == 0 ? res : -1;
    }

    
    public static int findSum_Problem_0_e8d4ce4a_5a74_4bbe_999f_651ffda1e81d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            int index = arr.lastIndexOf(val);
            if (index == -1) {
                arr.set(i, val);
            } else {
                arr.remove(index);
            }
        }
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5c3c28e0_0c97_4949_b1b5_1893ce02c00e(ArrayList<Integer> arr) {
        Integer total = 0L;
        Set<Integer> elements = new HashSet<>();
        
        for (int i : arr) {
            if (!elements.contains(i)) {
                elements.add(i);
            }
        }
        
        for (int i : arr) {
            if (elements.contains(i)) {
                total += i;
            }
        }
        
        return total;
    }

    
    public static int findSum_Problem_0_9cff71f8_0518_4b90_9b59_d50145eb95b9(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_1ec53d24_ae08_4990_8d3b_828f00d019ca(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_6bd5d778_0174_4f4b_9407_f9dc7f29eb43(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4e2d27e6_6456_4cb6_8de8_8d390dbc0951(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4b74c399_3382_4570_b1ed_73e5dbd7a747(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a054878c_8653_4908_b703_8391229e4fb2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7afcfbf6_4a13_4a66_8ec6_59a550dbe299(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a96c7647_ce48_4815_a0cf_969a3c7d495c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_1d2aeb56_c543_4638_9bed_ce4c5287c835(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_cf18cae1_26b4_4a21_b92e_bbc26e643177(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_77ad96a5_c5e1_412d_b644_8e19febec848(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_841eb482_e8d0_4ebd_9e8b_d9254943a714(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_8dfc2e12_9306_449e_ac50_754a57cf58ef(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_7fa41923_726b_40cd_92ec_efbae4b100b1(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_b0b3e694_8b67_4598_add4_013e94b02c73(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_1c24197e_7cb2_46fb_a661_dd37d47c2331(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_ceef4980_5151_4166_90b6_07570dcf1497(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            boolean isRepeated = False;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i) == arr.get(j)) {
                    isRepeated = True;
                    break;
                }
            }
            if (!isRepeated) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5ae4b159_7a1d_43e9_bec8_7f25c8d86910(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_b999d918_46ee_47de_a79f_128412ac3047(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_67630e30_582b_4f2a_874f_8ff78b6edbbd(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e8c22872_1952_4cf6_b2e7_6a1fc717c6c7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0cc4a0ef_a856_42bc_ad54_6a5bd7f0e07f(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            if (arr.indexOf(temp) == arr.lastIndexOf(temp)) {
                sum += temp;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_c6f6124b_43a0_41a3_83a5_7fabcb63c735(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_56142469_d631_4f8a_9e82_7f489bb08cbb(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_65e26c5e_0540_4df1_80d2_6c33ffb86ab8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_67630e30_582b_4f2a_874f_8ff78b6edbbd(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7066df1f_5b8f_41bd_ad7d_055675eccaed(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5c7a686d_48eb_4ba0_ac90_e507696ca222(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_2c6684e7_2bec_47bc_ac62_c9aa0e78abf4(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_c7381037_f4b7_4a2e_8639_134620f22272(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f4ddcd53_0b8d_4cb6_a237_4eaa43b361f2(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_eae9e35d_75f6_4590_bfae_40ce40ca014d(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_b6ddc1d2_957a_4912_b898_bd45da8226a8(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a531188e_d3a1_4313_ac77_b23fcbdcc5a6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_78c7aa04_647c_495e_8c29_eed75faa5cea(ArrayList<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer sum = 0L;
        for (Integer i : arr) {
            if (map.containsKey(i)) {
                sum += i;
            }
            else {
                sum += i;
            }
            map.put(i, i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e112e393_4c96_4143_8ef3_1157d7126d62(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_3c300b3a_190d_4d32_8cc2_66a2b00d0942(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5e629362_de72_40b8_83b2_b56b295bad1f(ArrayList<Integer> arr) {
        // Write your code here.
        return 0;
    }

    
    public static int findSum_Problem_2_3677a23c_9615_47ad_9038_777334ee2ac8(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_bea02cdc_0882_41b9_8e0e_08ca9bd0ef32(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_3e8d7997_8239_4518_9e01_ff26a18fccf4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a054878c_8653_4908_b703_8391229e4fb2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7d555378_66b7_40d8_82ed_09c3d3441bb4(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_64408fbc_93a9_481c_9ae4_b4abe7b07281(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int findSum_Problem_0_5378561e_704b_4c35_be25_2bcf581fb401(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a832a1b7_8af5_4a43_a5e0_7d8c7ca04aee(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_6613749f_5d51_4deb_b11b_4948c3c8b1b4(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_d2324649_4db4_4d11_aaae_e4fc82b425db(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_ceec3ad5_aed5_498b_800b_1ca0d5a30c76(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_51bd1857_b87d_4cfe_9e2e_28af87f294b5(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_a38fce83_f6dd_4771_a852_48bfa99501df(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_a531188e_d3a1_4313_ac77_b23fcbdcc5a6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f7af4d8d_e667_49dc_a373_120f6a8a005e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_8af0dd32_14f1_4ccb_a463_7376f50580e4(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int findSum_Problem_2_cf18cae1_26b4_4a21_b92e_bbc26e643177(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_416b8e4a_0dc3_449d_b16e_9ad588835e6a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_218b64b2_0946_42d4_8ff3_0740f0c0c02d(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            boolean flag = False;
            for(int j = 0; j < arr.size(); j++) {
                if(i != j && arr.get(i) == arr.get(j)) {
                    flag = True;
                    break;
                }
            }
            if(!flag) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5e4888de_99a9_4160_b0dd_a3ad02580c96(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_471fe863_2709_4872_8cbc_a5cb22dcb81a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_88a8d9c0_f388_4308_a537_2d698bef2ace(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_6fcc60d5_209f_4051_9614_3bb9a6d14317(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_1b56ffd9_1ca4_48c2_a5c2_8a405b60e6ce(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_e287abe2_90ac_4868_89af_bcd23607b6e6(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4c46d8d0_7fb7_464c_b2af_9900058bc8b8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_778edacf_c407_410e_bc5d_9213b834b8eb(ArrayList<Integer> arr) {
        Integer sum = 0L;
        for(Integer a : arr) {
            if(arr.indexOf(a) == -1) {
                sum += a;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0b286540_5ea9_42d6_81bc_69cbd95f3c0d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_fd3ae60c_18f3_4216_bc2f_b48b6227ba5f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_477bff04_5fc5_4459_ba8c_1d8712894290(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a2ef5542_e46a_4f28_b426_1d80294a4774(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

}
