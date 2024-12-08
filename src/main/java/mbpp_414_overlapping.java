package mbpp_414_overlapping;

public class mbpp_414_overlapping {

    
    public static boolean overlapping_Problem_2_0f2f5a8b_f064_4b9b_ae85_9731b5c8b38b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_ebe7cc99_4b1f_4a01_8518_4d076842f446(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_2_74618918_b4c2_4776_b90b_caeb79cc84d0(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        for(Integer l1 : list1) {
            for(Integer l2 : list2) {
                if(l1.equals(l2)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_2_f50b40a3_0a75_4ce9_8e04_2ea2d00d5ec7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        for (int i : list1) {
            if (list2.contains(i)) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_0_8a8c0782_fd66_4b12_8bfa_a255f0dfe374(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer val1 : list1) {
            if (list2.contains(val1)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_bcdbff9f_df2a_4120_9c7e_8974f76c9cce(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i1 : list1) {
            for (Integer i2 : list2) {
                if (i1.equals(i2)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_5e00d6f9_fefb_4e1c_805b_b0fcbdae0c31(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_f4e3d6ce_5f6f_44fb_9f62_94db25115156(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer i: list1) {
            for(Integer j: list2) {
                if(i == j) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_1949d0a5_e30b_4932_bf12_8cf4f145a52f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() < list2.size()) {
            throw new IllegalArgumentException("list1 size less than list2 size");
        }
        if (list1.isEmpty() || list2.isEmpty()) {
            return True;
        }
        ArrayList list3 = new ArrayList<>(list1);
        list3.retainAll(list2);
        if (list3.isEmpty()) {
            return True;
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_088d7993_a45a_4b03_aa8a_655b3beea3b8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_4b1a5ebf_ec15_4077_9760_5faa91261260(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_b7cbbc02_6e15_403c_9ce3_838b48ad368f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int commonNum = list1.stream().filter(x-> list2.contains(x)).count();
        if (commonNum > 0) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean overlapping_Problem_2_47608d84_ac36_4d24_9edd_bebd96507fb9(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_74618918_b4c2_4776_b90b_caeb79cc84d0(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        for(Integer l1 : list1) {
            for(Integer l2 : list2) {
                if(l1.equals(l2)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_0_a67d887a_e932_42e2_9b6d_95428229bb11(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        Integer sum1 = 0L, sum2 = 0L;
        for (Integer i : list1) {
            sum1 += i;
        }
        for (Integer i : list2) {
            sum2 += i;
        }
        return sum1.equals(sum2);
    }

    
    public static boolean overlapping_Problem_0_7e1aa56c_3313_4e3d_a3d1_8479382e4eb4(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        set1.retainAll(set2);
        return !set1.isEmpty();
    }

    
    public static boolean overlapping_Problem_2_9f137a00_b4e1_497a_ac7c_f2d0f226dc60(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int[] array1 = list1.stream().mapToInteger(Integer::intValue).toArray();
        int[] array2 = list2.stream().mapToInteger(Integer::intValue).toArray();
        int common[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    common[i]++;
                    break;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < common.length; i++) {
            if (common[i] > 1) {
                counter++;
            }
        }
        if (counter == common.length) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean overlapping_Problem_2_dfd6a9c5_7c50_4b8e_a8b2_e678f41d9a68(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_4a51dae6_9a05_44f6_8474_09d748566ddd(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int common = list1.stream().filter(list2::contains).count();
        return common > 0;
    }

    
    public static boolean overlapping_Problem_0_e639653b_0f59_46f9_b518_51855f2b2337(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_ef176a25_f5a2_43d5_8bfb_842fa0890aae(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_0_874a82a5_20d9_4fd5_985b_6d04ee8f9b51(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set = list1.stream().flatMap(x -> list2.stream()).collect(Collectors.toSet());
        return set.size() > 0;
    }

    
    public static boolean overlapping_Problem_1_ee007d1a_951b_4fb4_b8f3_cf5ab92329b5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        List<Integer> set1 = list1.stream().sorted().distinct().collect(Collectors.toList());
        List<Integer> set2 = list2.stream().sorted().distinct().collect(Collectors.toList());
        return set1.stream().anyMatch(set2::contains);
    }

    
    public static boolean overlapping_Problem_1_004c0e53_49ba_4a30_8d78_a516f9763061(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_e680c55b_0023_4c5e_a573_07ac642994c9(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean isOverlapping = False;
        int minValue = Math.min(list1.get(0), list2.get(0));
        int maxValue = Math.max(list1.get(list1.size()-1), list2.get(list2.size()-1));
        for(int i = 0; i <= list1.size()-1; i++) {
            for(int j = 0; j <= list2.size()-1; j++) {
                if(list1.get(i) == list2.get(j)) {
                    isOverlapping = True;
                    break;
                }
            }
        }
        return isOverlapping;
    }

    
    public static boolean overlapping_Problem_1_45a09e8a_e39a_4fc6_9d77_02e7d52b874c(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_2_24ae069a_e77e_490c_84f8_6b2d023119f5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        // Loop through all the elements in both lists
        for (Integer a1 : list1) {
            for (Integer a2 : list2) {
                // If an element from list1 is found in list2, the function will return True
                if (a1 == a2) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_0_1a259f57_31c2_4fb5_827e_018685f2767e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.containsAll(list2);
    }

    
    public static boolean overlapping_Problem_1_e79d0234_7f02_4464_8114_4489e51a8e1d(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_60378cef_d47b_4b4a_80b9_03651410239a(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(x -> list2.stream().anyMatch(y -> x.equals(y)));
    }

    
    public static boolean overlapping_Problem_0_c15b92e2_f993_402c_94aa_ca99180c49d7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_2_8e324c88_4ccd_40eb_b78c_4cd70745143d(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_79451152_b647_4f91_b2fa_0add6c530509(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_e9692e5b_aaff_470e_8446_b0e143bd1e4a(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int commonElement = list1.stream().filter(list2::contains).count();
        return commonElement == list1.size();
    }

    
    public static boolean overlapping_Problem_2_7f504cec_0037_414e_9479_dd644a4607a6(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list2.stream().anyMatch((value) -> (list1.stream().anyMatch((value1) -> (value1 == value))));
    }

    
    public static boolean overlapping_Problem_2_3e53aef1_f30d_4338_b74e_30587c491d14(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_767a0ff0_ff35_495a_8e6c_3c8e0af5bafd(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // check both are of same length
        if (list1.size() != list2.size()) {
            return False;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                continue;
            }
            return False;
        }
        return True;
    }

    
    public static boolean overlapping_Problem_0_d3d15845_8bb4_4e5e_8590_436652622f9e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().filter(a -> list2.stream().filter(b -> a.equals(b)).findAny().isPresent()).findAny().isPresent();
    }

    
    public static boolean overlapping_Problem_2_ee5d1ca3_17de_48fa_9045_0e21f3fcfcf5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set1 = new HashSet<Integer>(list1);
        Set<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_0_6c5f3e6f_89a2_4422_a08e_22055b7baa4b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer num : set1) {
            if (set2.contains(num)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_8eec7ef6_55ba_47b6_a302_525df17dcbac(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean found = False;
        for (int i = 0; i < list1.size() && !found; i++) {
            for (int j = 0; j < list2.size() && !found; j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    found = True;
                    break;
                }
            }
        }
        return found;
    }

    
    public static boolean overlapping_Problem_2_20f6f061_5353_4041_b37e_b8dd014221f0(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        set1.retainAll(set2);
        return !set1.isEmpty();
    }

    
    public static boolean overlapping_Problem_1_7ca1cdb4_80ad_4753_a372_36455f7a03e6(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        for (Integer i : list1) {
            if (list2.contains(i)) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_1_820236eb_362c_43ee_9914_e40119b92b59(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list2.stream().anyMatch(list1::contains);
    }

    
    public static boolean overlapping_Problem_2_4d754a38_d8c0_4022_97ca_99e58a6543b2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int x : list2) {
            if (list1.contains(x)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_73f29791_30ff_4e2a_b851_d73c1bdb8e33(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_8c875ac5_cb82_4caa_98dd_74360279ecf8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i=0; i<list1.size(); i++) {
            for(int j=0; j<list2.size(); j++) {
                if(list1.get(i) == list2.get(j)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_4d91a47c_55d0_48a9_ab16_26f65b4edc27(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int common = list1.stream().filter(list2::contains).count();
        if (common > 0) {
            return True;
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_e9692e5b_aaff_470e_8446_b0e143bd1e4a(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int commonElement = list1.stream().filter(list2::contains).count();
        return commonElement == list1.size();
    }

    
    public static boolean overlapping_Problem_1_1393bc93_d27a_43be_95c6_420a8cd1ce2e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);
        return !set1.equals(set2);
    }

    
    public static boolean overlapping_Problem_0_0ab7ff7b_b8e5_4a66_b795_b5309d1f91d8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_88e26477_0460_4c70_8d85_849d11d4f6bb(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!list.contains(list2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean overlapping_Problem_1_1a5bac6f_0b02_455c_abec_92c231a02dc6(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_e2144888_4cf2_41be_9a8d_079efd3fc64e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_20f6f061_5353_4041_b37e_b8dd014221f0(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        set1.retainAll(set2);
        return !set1.isEmpty();
    }

    
    public static boolean overlapping_Problem_1_1a259f57_31c2_4fb5_827e_018685f2767e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.containsAll(list2);
    }

    
    public static boolean overlapping_Problem_2_8c875ac5_cb82_4caa_98dd_74360279ecf8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i=0; i<list1.size(); i++) {
            for(int j=0; j<list2.size(); j++) {
                if(list1.get(i) == list2.get(j)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_b7cbbc02_6e15_403c_9ce3_838b48ad368f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int commonNum = list1.stream().filter(x-> list2.contains(x)).count();
        if (commonNum > 0) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean overlapping_Problem_0_f988c8a4_3df1_43a2_8652_dd9fcb6cd5d1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_8a1a5ea2_c74a_49c5_833c_5ca56220d1cf(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_def2d1ec_63c6_45da_af67_31b4d57af272(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int index1 = 0;
        int index2 = 0;
        int size = list1.size() > list2.size() ? list1.size() : list2.size();
        for (int i = 0; i < size; i++) {
            if (list1.get(index1) == list2.get(index2)) {
                index2++;
                if (index2 == list2.size()) {
                    return True;
                }
            } else {
                index2 = 0;
                index1++;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_146082dd_0b29_4679_8d10_317720460669(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_32cd53b0_a407_431d_a9e2_f7204b66fda2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean flag = True;
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i.compareTo(j) != 0) {
                    flag = False;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean overlapping_Problem_2_9e5c3f33_5963_417e_bd19_fed6af80d9b5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer x : list1) {
            if (list2.contains(x)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_1ee4bf0b_333a_4123_bfaf_5300a443e198(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_6348ea75_c43e_4aaf_9668_6ab337b18026(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext()) {
            boolean isThere = False;
            Iterator<Integer> itr2 = list2.iterator();
            while(itr2.hasNext()) {
                if (itr2.next() == itr.next()) {
                    isThere = True;
                    break;
                }
            }
            if (!isThere) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean overlapping_Problem_1_2467df16_c1bf_4f56_9131_9116b8bdc9bf(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_01327874_76fc_473d_8b95_4b1c9e69c346(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(x -> list2.contains(x));
    }

    
    public static boolean overlapping_Problem_2_f1774253_a6d4_4e9b_bf4a_d0b50c3f0eaf(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_d03f42b3_0d50_4465_bdd4_bbe6773ffa0d(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_d90bd851_367f_4dab_9104_9aa69500b589(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_264154b9_b361_4ce8_a179_cc68607f13be(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_aa7de827_75f9_4867_9ff2_6abd8c700762(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_b07a9509_dc66_47e2_ad92_2f3e0c1fced3(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer x : list1) {
            set.add(x);
        }
        for (Integer x : list2) {
            if (set.contains(x)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_c3abb9ad_39e4_42af_9739_be010d0ad5d0(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int min_value1 = Collections.min(list1);
        int max_value1 = Collections.max(list1);
        int min_value2 = Collections.min(list2);
        int max_value2 = Collections.max(list2);
        if(min_value1 <= max_value2 && max_value1 >= min_value2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean overlapping_Problem_2_bb751854_6c4c_479c_8ef6_7ffac03586ad(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        set1.retainAll(set2);
        return !set1.isEmpty();
    }

    
    public static boolean overlapping_Problem_2_874a82a5_20d9_4fd5_985b_6d04ee8f9b51(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set = list1.stream().flatMap(x -> list2.stream()).collect(Collectors.toSet());
        return set.size() > 0;
    }

    
    public static boolean overlapping_Problem_1_7253024b_7e1a_4062_99f1_526317d5dfc7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean flag = False;
        int i = 0;
        for(i = 0; i < list1.size(); i++) {
            for(int j = 0; j < list2.size(); j++) {
                if(list1.get(i) == list2.get(j)) {
                    flag = True;
                }
            }
        }
        return flag;
    }

    
    public static boolean overlapping_Problem_0_3e53aef1_f30d_4338_b74e_30587c491d14(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_758cbd07_4d22_4b1f_ab17_7a82684c9be2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_e464e7db_9210_4efe_abf9_2370c9269f92(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_1a864821_a169_4830_a42a_c8602c9217d1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            set.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            if (set.contains(list2.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_a97a9bc6_5f5b_4c3d_8fa4_c7e98fc651b5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_3f778a29_9324_4cc0_84cc_e6f25066ad72(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean retval = False;
        //System.out.println("list1" + list1);
        //System.out.println("list2" + list2);
        for(int i = 0; i < list1.size(); i++) {
            if(list2.contains(list1.get(i))) {
                retval = True;
                break;
            }
        }
        return retval;
    }

    
    public static boolean overlapping_Problem_1_997cca97_a11f_452b_b624_790c747d3a86(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_32cd53b0_a407_431d_a9e2_f7204b66fda2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean flag = True;
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i.compareTo(j) != 0) {
                    flag = False;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean overlapping_Problem_2_3a3c0e28_c4d6_4db9_b534_ae25ea34f68e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list2.stream().anyMatch(list1::contains);
    }

    
    public static boolean overlapping_Problem_1_e2144888_4cf2_41be_9a8d_079efd3fc64e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_bcdbff9f_df2a_4120_9c7e_8974f76c9cce(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i1 : list1) {
            for (Integer i2 : list2) {
                if (i1.equals(i2)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_62197b59_24ae_4e80_8a3c_82b9ee092b26(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        int min1 = list1.stream().min(Comparator.naturalOrder()).get();
        int max1 = list1.stream().max(Comparator.naturalOrder()).get();
        int min2 = list2.stream().min(Comparator.naturalOrder()).get();
        int max2 = list2.stream().max(Comparator.naturalOrder()).get();
        if (min1 <= max2 && min2 <= max1) {
            result = True;
        }
        return result;
    }

    
    public static boolean overlapping_Problem_1_9c0caf8a_1e26_4ea1_9cd3_97e4407598e3(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_1dc48d6f_d503_4d38_b968_cda15e1784e6(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer l1 : list1) {
            for (Integer l2 : list2) {
                if (l1 == l2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_63e6484a_88d4_44bc_b43c_c8f28bc0c3d0(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        for (int i1 : list1) {
            for (int i2 : list2) {
                if (i1 <= i2) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_0_81c8d68d_55f6_4a85_883d_3718db2a84aa(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int i=0;
        int j=0;
        boolean found = False;
        while(i<list1.size() && j<list2.size()) {
            if(list1.get(i) == list2.get(j)) {
                found = True;
                break;
            }
            else if(list1.get(i) > list2.get(j)) {
                j++;
            }
            else {
                i++;
            }
        }
        return found;
    }

    
    public static boolean overlapping_Problem_0_f70b09b7_6d24_4809_a581_900efd5dcb88(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) return True;
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_e5a3f808_1fda_42d4_81be_858573b396b7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer i : list1) {
            if(list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_10079763_12c6_41c5_876f_435cf5eb16c0(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        set1.retainAll(set2);
        return set1.size() > 0;
    }

    
    public static boolean overlapping_Problem_1_06e44d6d_cf6f_400e_bce9_0b1db8356039(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if(list1.size() != list2.size())
            return False;

        int max = Math.max(list1.size(), list2.size());
        for(int i = 0; i < max; i++) {
            if(!list1.get(i).equals(list2.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean overlapping_Problem_0_64d023fe_05fb_4f45_9de4_c0d07760b526(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_588ca6a1_77b1_4f2f_865f_dd837809cd5e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_a2dce885_ee14_46ae_aacc_808c5cbd114b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_1_47ada443_6d23_4ea6_a7bc_205d74670eaf(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int i = 0, j = 0;
        while(i < list1.size() && j < list2.size()) {
            if(list1.get(i) == list2.get(j)) {
                return True;
            } else {
                i++;
                j++;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_824807bf_2e13_4e3d_bfac_1ebdd25be774(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_0_dde42b28_2831_4463_96c0_282b3ef098ad(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_7253024b_7e1a_4062_99f1_526317d5dfc7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean flag = False;
        int i = 0;
        for(i = 0; i < list1.size(); i++) {
            for(int j = 0; j < list2.size(); j++) {
                if(list1.get(i) == list2.get(j)) {
                    flag = True;
                }
            }
        }
        return flag;
    }

    
    public static boolean overlapping_Problem_1_8a8a2720_5e11_45f5_92a9_bc602416fef3(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer l: list1) {
            set.add(l);
        }
        for (Integer l: list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_ea9166d4_537c_444c_8d68_4897527b2354(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer elem : set1) {
            if (set2.contains(elem)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_419ee108_379e_4df0_aa92_fa4d3e375728(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i == j) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_0_474e25e3_0013_4c58_affc_80f42d0c46e8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer num1 : list1) {
            for (Integer num2 : list2) {
                if (num1 == num2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_81fa57b9_fb89_4d5f_9c81_5edd3eb2303f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_54a8920f_5d5a_4224_90d0_9390031a1dcb(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        if (list1.size() > list2.size()) {
            list2.addAll(list1);
        }
        for (int i : list1) {
            for (int j : list2) {
                if (i == j) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_2_aa7de827_75f9_4867_9ff2_6abd8c700762(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_e5331757_cb70_4f14_9eb3_2cabdb3b478f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_d31893d7_6cd6_47be_b47f_f68109cdec07(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        int min1 = list1.stream().min(Comparator.naturalOrder()).get();
        int max1 = list1.stream().max(Comparator.naturalOrder()).get();
        int min2 = list2.stream().min(Comparator.naturalOrder()).get();
        int max2 = list2.stream().max(Comparator.naturalOrder()).get();
        if (min1 <= max2 && min2 <= max1) {
            result = True;
        }
        return result;
    }

    
    public static boolean overlapping_Problem_1_264154b9_b361_4ce8_a179_cc68607f13be(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_bb751854_6c4c_479c_8ef6_7ffac03586ad(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        set1.retainAll(set2);
        return !set1.isEmpty();
    }

    
    public static boolean overlapping_Problem_0_b2c03187_3069_4cda_9364_537f56442841(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i == j) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_ad47105a_caf6_4383_b20c_d1be4d73134b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        return False;
    }

    
    public static boolean overlapping_Problem_1_31f325e2_d9ac_473f_b6c1_ca7ad3252120(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer item : list1)
            if (list2.contains(item))
                return True;
        return False;
    }

    
    public static boolean overlapping_Problem_1_ad91d0f6_d9d2_44f2_b37d_5c00e301f188(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Iterator<Integer> itr1 = list1.iterator();
        Iterator<Integer> itr2 = list2.iterator();
        while(itr1.hasNext() && itr2.hasNext()) {
            int i1 = itr1.next();
            int i2 = itr2.next();
            if(i1 > i2) return True;
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_7d5d390c_3cc7_4706_80d9_c8ae8f79b3a7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_deb1d3eb_a995_4be4_b934_96148c03ff33(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_8000d034_3891_40be_848e_05d6b097c647(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_800f2a15_b90c_4667_a65e_7a4b41a9ec3b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1 == null || list2 == null || list1.size() == 0 || list2.size() == 0)
            return False;

        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        set2.removeAll(set1);
        return set1.isEmpty() || set2.isEmpty();
    }

    
    public static boolean overlapping_Problem_2_2f14c657_1b19_4537_ad6b_104850002e50(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int min1 = list1.stream().min(Comparator.naturalOrder()).get();
        int max1 = list1.stream().max(Comparator.naturalOrder()).get();
        int min2 = list2.stream().min(Comparator.naturalOrder()).get();
        int max2 = list2.stream().max(Comparator.naturalOrder()).get();
        return min1 <= max2 && max1 >= min2;
    }

    
    public static boolean overlapping_Problem_1_4db7083d_3206_4906_8fd6_462f2e54c39f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if(list1.size() != list2.size()){
            return False;
        }
        int first1 = list1.get(0); // list1 first element
        int last1 = list1.get(list1.size() - 1); // list1 last element
        int first2 = list2.get(0); // list2 first element
        int last2 = list2.get(list2.size() - 1); // list2 last element
        // System.out.println("first1: "+first1+" last1: "+last1+" first2: "+first2+" last2: "+last2);
        for (int i = first1; i <= last1; i++) {
            for (int j = first2; j <= last2; j++) {
                if(list1.contains(list2)){
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_e1488d11_0682_4470_8fbb_f3ffe85ff781(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set1 = new HashSet<Integer>(list1);
        Set<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_0_5c9c065d_de98_4bf3_bdd4_55960fc81e12(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_f9f51c47_4887_4c54_80a1_f0b84b06004a(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list2.size() > list1.size()) {
            list2.subList(list1.size(), list2.size())
                    .forEach((e) -> {
                        list2.remove(e);
                    });
        }
        boolean isExist = False;
        int firstValue = list1.get(0);
        int secondValue = list2.get(0);
        int minVal = Collections.min(list1);
        int maxVal = Collections.max(list1);
        for (Integer value : list2) {
            int first = value.compareTo(firstValue);
            int second = value.compareTo(secondValue);
            if (first < 0) {
                firstValue = value;
            } else if (second < 0) {
                secondValue = value;
            } else if (first == 0 && second > 0) {
                isExist = True;
                firstValue = value;
                secondValue = value;
            } else if (first == 0 && second < 0) {
                isExist = False;
                break;
            }
        }
        return isExist;
    }

    
    public static boolean overlapping_Problem_1_79cfd7f1_eddf_463b_845a_afdce9cfab75(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        int temp;
        for (int i : list1) {
            for (int j : list2) {
                if (i == j) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_1_90211c84_3da8_4748_a65d_9444e740d590(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer x : list1) {
            set.add(x);
        }
        for (Integer x : list2) {
            if (set.contains(x)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_af66bc3c_15f1_46e6_a3a9_09c01ded6b5a(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.parallelStream().anyMatch(n -> list2.parallelStream().anyMatch(m -> n == m));
    }

    
    public static boolean overlapping_Problem_0_0f8b1260_0ecd_41f4_9ecc_f6efc5476f6d(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_e680c55b_0023_4c5e_a573_07ac642994c9(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean isOverlapping = False;
        int minValue = Math.min(list1.get(0), list2.get(0));
        int maxValue = Math.max(list1.get(list1.size()-1), list2.get(list2.size()-1));
        for(int i = 0; i <= list1.size()-1; i++) {
            for(int j = 0; j <= list2.size()-1; j++) {
                if(list1.get(i) == list2.get(j)) {
                    isOverlapping = True;
                    break;
                }
            }
        }
        return isOverlapping;
    }

    
    public static boolean overlapping_Problem_1_2695549e_7c99_4548_929b_cb3866b7e76e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Map<Integer, Integer> map = new HashMap<>();
        list1.forEach(x -> map.put(x, x));
        list2.forEach(x -> map.put(x, x));
        return list1.stream().anyMatch(x -> list2.contains(map.get(x)));
    }

    
    public static boolean overlapping_Problem_1_f4e3d6ce_5f6f_44fb_9f62_94db25115156(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer i: list1) {
            for(Integer j: list2) {
                if(i == j) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_8d8bfbc8_0e9b_4fdb_8e2b_31c6dd149dfa(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_0b54254d_b4b3_4779_bcdd_5f66cc3a7799(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) return False;
        for (Integer i : list1)
            if (list2.contains(i)) return True;
        return False;
    }

    
    public static boolean overlapping_Problem_1_474e25e3_0013_4c58_affc_80f42d0c46e8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer num1 : list1) {
            for (Integer num2 : list2) {
                if (num1 == num2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_47b3f1e2_fb1c_4e04_b36a_d39375330452(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean isOverlap = False;
        int min1 = list1.stream().min(Comparator.naturalOrder()).get();
        int max1 = list1.stream().max(Comparator.naturalOrder()).get();
        int min2 = list2.stream().min(Comparator.naturalOrder()).get();
        int max2 = list2.stream().max(Comparator.naturalOrder()).get();
        if (min1 < max2 && min2 < max1) {
            isOverlap = True;
        }
        return isOverlap;
    }

    
    public static boolean overlapping_Problem_0_4e8560be_e9c0_4eef_b59a_bd032ba6bbd3(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for (Integer x : list1) {
            map1.put(x, x);
        }
        for (Integer x : list2) {
            map2.put(x, x);
        }
        Set<Integer> set1 = map1.keySet();
        Set<Integer> set2 = map2.keySet();
        for (Integer x : set1) {
            if (!set2.contains(x)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_596c0020_8e80_4160_bcd2_6975453b1a73(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_69e6a2ab_793e_497d_b526_264f0916fd00(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(i -> list2.stream().anyMatch(i2 -> i == i2));
    }

    
    public static boolean overlapping_Problem_1_52e24c77_57d2_4aac_916e_e91a6519bbd4(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        return set1.containsAll(set2);
    }

    
    public static boolean overlapping_Problem_0_767a0ff0_ff35_495a_8e6c_3c8e0af5bafd(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // check both are of same length
        if (list1.size() != list2.size()) {
            return False;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                continue;
            }
            return False;
        }
        return True;
    }

    
    public static boolean overlapping_Problem_0_ef176a25_f5a2_43d5_8bfb_842fa0890aae(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_0_4f2eafde_fc70_430b_8d51_1a15e70a8303(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        set1.retainAll(set2);
        return !set1.isEmpty();
    }

    
    public static boolean overlapping_Problem_0_acfe596b_5f53_47c0_891b_1950a885d7bb(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer item : set1) {
            if (set2.contains(item)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_8fefa2d5_a6d4_48ae_bcdc_3f0bca7fc6d5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_700998a3_7206_48c4_bb3e_586823f0a15b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_48b2bedf_fcf8_43e1_8571_cb10b8b326b1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_924265b4_856b_4657_84cf_9305de28a446(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer item : list1) {
            if (list2.contains(item)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_874a82a5_20d9_4fd5_985b_6d04ee8f9b51(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set = list1.stream().flatMap(x -> list2.stream()).collect(Collectors.toSet());
        return set.size() > 0;
    }

    
    public static boolean overlapping_Problem_2_a42df10f_3221_48db_8b87_06ac7aaa7a3c(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_907996c1_7b37_4f11_bc8e_e5b5d0dbd88b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        for(Integer l : list1) {
            if(list2.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_c614e62a_9368_4dbc_84b5_75466368d92e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set2) {
            if (set1.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_f343f681_6951_49a5_af21_ebe344a94ec3(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_86fdd115_a2ea_4d08_b528_46b846262bb2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i = 0; i < list2.size(); i++) {
            for(int j = 0; j < list1.size(); j++) {
                if(list2.get(i).equals(list1.get(j))) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_9d5fc8e7_257d_4d99_a26b_78896f415c2e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer l : set2) {
            if (set1.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_865c6407_cf43_4c22_83e8_e71eed391c71(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean res = False;
        for (Integer elem : list1) {
            for (Integer elem2 : list2) {
                if (elem.equals(elem2)) {
                    res = True;
                    break;
                }
            }
            if (res) break;
        }
        return res;
    }

    
    public static boolean overlapping_Problem_2_a0b99bbc_ae6b_4239_b499_3c5ff6dc7b2f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_acfe596b_5f53_47c0_891b_1950a885d7bb(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer item : set1) {
            if (set2.contains(item)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_6379c2aa_4c62_4cd2_bff7_e05dacc28440(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1 == null || list2 == null)
            return True;

        int min = Math.min(list1.size(), list2.size());
        for (int i = 0; i < min; i++) {
            if (list1.get(i) >= list2.get(i))
                return True;
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_c6180d32_0f4c_438f_8551_2172adeed85e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // check for list1 emptiness
        if (list1.isEmpty()) {
            return False;
        }
        // check for list2 emptiness
        if (list2.isEmpty()) {
            return True;
        }
        // check for list2 first element equality
        if (list2.get(0) == list1.get(0)) {
            return True;
        }
        // check for list1 first element equality
        if (list1.get(0) == list2.get(0)) {
            return True;
        }
        // check for list2 last element equality
        if (list2.get(list2.size() - 1) == list1.get(list1.size() - 1)) {
            return True;
        }
        // check for list1 last element equality
        if (list1.get(list1.size() - 1) == list2.get(list2.size() - 1)) {
            return True;
        }
        // check for overlap between list1 and list2
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_d5f6151f_e787_4c85_ae4f_20df73b946de(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        // Write your code here
        for (Integer i : list1) {
            if (list2.contains(i)) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_2_37ee47f1_ae47_4f20_9c56_4a81f66a95f9(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_a97a9bc6_5f5b_4c3d_8fa4_c7e98fc651b5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_820236eb_362c_43ee_9914_e40119b92b59(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list2.stream().anyMatch(list1::contains);
    }

    
    public static boolean overlapping_Problem_2_34890299_aee9_40b0_93eb_0b330d8dbac6(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_53dbd785_864b_4ac2_8c0f_adaad1a62f03(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean flag = False;
        for(int l1 : list1) {
            for(int l2 : list2) {
                if(l1 == l2) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean overlapping_Problem_2_8d5063b1_d05f_49e5_b6a2_a366a6de66db(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int len = list1.size();
        int len_of_list2 = list2.size();
        boolean flag = False;
        
        if(list1.isEmpty() || list2.isEmpty())
            return flag;
        
        for(int i=0;i<len;i++) {
            for(int j=0;j<len_of_list2;j++) {
                if(list1.get(i)>list2.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        
        return flag;
    }

    
    public static boolean overlapping_Problem_1_3f778a29_9324_4cc0_84cc_e6f25066ad72(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean retval = False;
        //System.out.println("list1" + list1);
        //System.out.println("list2" + list2);
        for(int i = 0; i < list1.size(); i++) {
            if(list2.contains(list1.get(i))) {
                retval = True;
                break;
            }
        }
        return retval;
    }

    
    public static boolean overlapping_Problem_0_ca56d619_df5e_4de3_974a_8a27c557b7df(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer x : list1) {
            set.add(x);
        }
        for (Integer x : list2) {
            if (set.contains(x)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_e5aff266_20cb_4208_8062_6ee808d4c1a8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int min1 = list1.stream().min(Comparator.naturalOrder()).get();
        int max1 = list1.stream().max(Comparator.naturalOrder()).get();
        int min2 = list2.stream().min(Comparator.naturalOrder()).get();
        int max2 = list2.stream().max(Comparator.naturalOrder()).get();
        return min1 < max2 && min2 < max1;
    }

}
