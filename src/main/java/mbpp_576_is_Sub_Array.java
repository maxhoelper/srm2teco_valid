package mbpp_576_is_Sub_Array;

public class mbpp_576_is_Sub_Array {

    
    public static boolean isSubArray_Problem_1_a23cc699_6a03_4e11_8d55_99dac03cd84e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_73c4881d_37e4_423f_bcd5_23c47bc9380a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_22363d43_0570_4e81_8b2c_758b5cc775df(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        if (A.size() != B.size()) {
            return False;
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_7badae59_e78f_4884_a761_d252e47c6e5e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_74672463_eb4f_4524_bba4_c73cd6d1ce81(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> B1 = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for (int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        if (A.size() != B.size()) {
            return False;
        }
        for (int i = 0; i < A.size(); i++) {
            if (!A1.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_7341ad5e_9573_4f7c_8fb8_8c3c556cc79a(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean flag = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_32da881c_4415_47a4_bb4b_12c2b8e40edc(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i) == A.get(i-1)) {
                C.add(A.get(i));
            }
        }
        for(int i = 0; i < B.size(); i++) {
            if(C.contains(B.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_e44d11ec_b894_4ead_9a7c_25112d166857(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = i;
            while (j < m && k < n && A.get(k) == B.get(j)) {
                j++;
                k++;
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_4c5fdc71_8002_439e_a331_0127ce9b89e0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_2_d817dc7b_9f96_487c_bbd0_932cf90f1fe2(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_5f4ab65d_9c0d_4364_bc73_afea2d240646(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return False;
    }

    
    public static boolean isSubArray_Problem_2_8715ea4f_7366_41d7_8426_b43679b6e2d7(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_e9d8db3e_c7bc_4979_a36b_35c65c69ba4a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        if (m > n)
            return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (A.get(i + j) != B.get(j))
                    break;
            if (j == m)
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_32631fe9_d91d_468d_bcfd_c785a0103600(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        } else if (A.size() < B.size()) {
            return True;
        }
        Integer[] arrayA = new Integer[A.size()];
        Integer[] arrayB = new Integer[B.size()];
        for (int i = 0; i < A.size(); i++) {
            arrayA[i] = A.get(i);
        }
        for (int j = 0; j < B.size(); j++) {
            arrayB[j] = B.get(j);
        }
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        return Arrays.equals(arrayA, arrayB);
    }

    
    public static boolean isSubArray_Problem_0_d8c8bf1d_d9c3_4707_b739_9247f3f9c5ba(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_13dd9afa_81a6_4251_a38d_fa69c132d444(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(Integer i : A) {
            A2.add(i);
        }
        for(Integer i : B) {
            B2.add(i);
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A2.contains(A1.get(i))) {
                return False;
            }
        }
        for(int i = 0; i < B1.size(); i++) {
            if(!B2.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_ce4a4398_c6a2_4076_9467_853ed11a096b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() && B.isEmpty()) return True;
        if (A.isEmpty()) return False;
        if (B.isEmpty()) return False;
        int N = A.size();
        int m = B.size();
        if (N != m) {
            return False;
        }
        int i = 0; // index for A
        int j = 0; // index for B
        int sum = 0; // check sum
        int flag = 0; // check flag
        while (i < N && j < m) {
            sum += A.get(i++);
            sum += B.get(j++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        int k = 0;
        while (k < m && j < m) {
            sum += A.get(k++);
            sum += B.get(j++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        while (i < N && k < (m - 1)) {
            sum += A.get(i++);
            sum += B.get(k++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        while (j < m && k < (m - 1)) {
            sum += A.get(k++);
            sum += B.get(j++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        return (i == N && j == m);
    }

    
    public static boolean isSubArray_Problem_1_69e300da_218b_4ce2_85d4_d3498fa2a2ab(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Return True if both arrays are same
        if (A.size() == B.size()) {
            // Sort the array list
            ArrayList<Integer> sortedA = new ArrayList<>(A);
            Collections.sort(sortedA);
            ArrayList<Integer> sortedB = new ArrayList<>(B);
            Collections.sort(sortedB);
            // compare the first element of both arrays
            return ((sortedA.get(0)).equals(sortedB.get(0)));
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_6db860e3_85ee_4fca_b1ba_6d03a80f933f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> AB = new ArrayList<Integer>();
        for (Integer i : A) {
            for (Integer j : B) {
                if (i.equals(j)) {
                    AB.add(i);
                }
            }
        }
        return AB.equals(B);
    }

    
    public static boolean isSubArray_Problem_2_4e75c98f_7799_4ce1_9724_624c83cfc409(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code in java8
        List<Integer> intsA = A.stream().distinct().collect(Collectors.toList());
        List<Integer> intsB = B.stream().distinct().collect(Collectors.toList());
        List<Integer> intersection = new ArrayList<>();

        intersection.retainAll(intsA);
        if (intersection.size() != A.size())
            return False;

        intersection.retainAll(intsB);
        if (intersection.size() != B.size())
            return False;

        return True;
    }

    
    public static boolean isSubArray_Problem_2_f7efc320_f78e_41f6_9ac8_b8b8daa922df(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_3c523f48_6224_4b72_9ef3_536cda4da001(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        boolean flag = True;
        for(int i=0; i<A1.size(); i++) {
            for(int j=0; j<B1.size(); j++) {
                if(A1.get(i) == B1.get(j)) {
                    C.add(A1.get(i));
                    A1.remove(i);
                    B1.remove(j);
                    flag = False;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_c6476c2f_bdd9_414e_acff_d77cbfb8c6c5(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        ArrayList<Integer> temp = new ArrayList<Integer>(A);
        ArrayList<Integer> temp2 = new ArrayList<Integer>(B);
        Collections.sort(temp);
        Collections.sort(temp2);
        return A==B;
    }

    
    public static boolean isSubArray_Problem_1_a4d62ae6_0baa_475b_8195_dbc3505aac2f(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_17b40f2d_a2c5_46a1_b41d_101dc41cf3af(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>(A.subList(0, A.size()));
        ArrayList<Integer> A2 = new ArrayList<>(A.subList(0, A.size()));
        ArrayList<Integer> B1 = new ArrayList<>(B.subList(0, B.size()));
        ArrayList<Integer> B2 = new ArrayList<>(B.subList(0, B.size()));
        if (A1.equals(B1)) {
            return True;
        }
        if (A2.equals(B2)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_2fb849bd_9efe_46f8_8b19_89264e028ae5(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_8dc1b77f_bc86_40df_a233_e7bd7e964be6(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> sub = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.contains(B.get(i)) && B.contains(A.get(j)))
                    sub.add(A.get(i));
            }
        }
        return sub.isEmpty();
    }

    
    public static boolean isSubArray_Problem_0_3ac5c84e_45d0_4cc1_87ad_7661ed0d61a7(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.equals(B);
    }

    
    public static boolean isSubArray_Problem_0_abfd79fb_5c83_4f80_974a_7176c029df4c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_a2359daa_8f7c_4487_a9ba_720bb5152bf3(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() > B.size()) return False;
        int i = 0;
        for(i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_878d30a0_bb55_4b2e_86ba_79a4300ac674(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_2_dc34e281_3505_4e9c_b17a_bc85af920265(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size()) {
            return False;
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_5ed10caa_97a3_4669_b9f0_330bcbad9578(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_edaffb95_ac2e_4239_a45c_743f936a8e08(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A1.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_59ad32ee_e773_4452_9cfd_da4d925cc254(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        if (n < m) return False;
        for (int i = 0; i <= n - m; i++) {
            boolean found = True;
            for (int j = 0; j < m; j++) {
                if (A.get(i + j) != B.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_c476f97f_ae0a_4749_a750_07230b32f516(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_961d4c66_c1ab_4348_ab82_64ff79bb3b78(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i=0;i<A.size();i++) {
            a[i] = A.get(i);
        }
        for(int i=0;i<B.size();i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++) {
            if(a[i]!=b[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_624b6d59_def5_4225_b32d_85bb29ec971a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            C.add(A.get(i));
        }
        for(int i=0;i<m;i++) {
            C.add(B.get(i));
        }
        return A.subList(0,n).containsAll(C);
    }

    
    public static boolean isSubArray_Problem_1_64ed271d_9738_48d4_82a1_c9efd2e823d5(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        boolean flag = False;
        for(int i = 0; i < A1.size(); i++) {
            for(int j = 0; j < B1.size(); j++) {
                if(A1.get(i) == B1.get(j)) {
                    flag = True;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_6e09c54d_5c71_4e22_abdd_508d211c99a4(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_f7efc320_f78e_41f6_9ac8_b8b8daa922df(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_c8e55bc8_a517_49b8_a19c_fbb3649414fd(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_cbf2db63_b2c8_4ff1_b362_af4d5fbf927b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        for(int i = 0; i < A1.size(); i++) {
            for(int j = 0; j < B1.size(); j++) {
                if(A1.get(i) == B1.get(j)) {
                    A1.remove(i);
                    B1.remove(j);
                }
            }
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_aed045ed_ca4e_497d_b0af_88de03a40158(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_65b05002_8a56_40a3_a52b_2aee6efb16c1(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int index = 0;
        for (Integer val : A) {
            if (B.contains(val)) {
                result.add(val);
                index++;
            } else {
                if (index != 0) {
                    result.add(A.get(index));
                    index++;
                }
            }
        }
        return result.size() == B.size();
    }

    
    public static boolean isSubArray_Problem_1_b331e7df_a22a_4c05_9076_ba74cb060c5b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_d1fd36e5_92de_4368_896f_a9a6158b0351(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.isEmpty() || B.isEmpty())
            return False;
        int sizeA = A.size();
        int sizeB = B.size();
        if(sizeA != sizeB)
            return False;
        for(int i=0; i < sizeA; i++) {
            if(!A.equals(B))
                return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_411eec7b_e337_4ed2_837b_5e7a04e0a711(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_5eab6b94_b913_45b2_9d25_b42e51f8cec2(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().anyMatch(elem -> B.contains(elem));
    }

    
    public static boolean isSubArray_Problem_2_1222b9bb_24e7_4976_80f8_358ef5cffbc7(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() > B.size()) return False;
        for(int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSubArray_Problem_2_1222b9bb_24e7_4976_80f8_358ef5cffbc7 = True;
            for(int j = 0; j < A.size(); j++) {
                if(!A.get(j).equals(B.get(i + j))) {
                    isSubArray_Problem_2_1222b9bb_24e7_4976_80f8_358ef5cffbc7 = False;
                    break;
                }
            }
            if(isSubArray_Problem_2_1222b9bb_24e7_4976_80f8_358ef5cffbc7) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_306527f8_9fc3_44c4_99b2_690457724fde(ArrayList<Integer> A, ArrayList<Integer> B) {
        // TODO: implement this function
        return False;
    }

    
    public static boolean isSubArray_Problem_2_0bcce17d_1c99_4d4d_befd_c1c129aa1c4d(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
            }
            j++;
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_2_ad604b88_c977_4269_97e3_3154d6c053a6(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i=0;i<B.size();i++)
            c.add(B.get(i));
        for(int i=0;i<A.size();i++)
            if(!c.contains(A.get(i)))
                return False;
        return True;
    }

    
    public static boolean isSubArray_Problem_2_bdbcc40e_ade6_433c_b414_38608089b9a5(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            int index = 0;
            while (index < B.size() && A.get(i) == B.get(index)) {
                index++;
            }
            C.add(A.get(i));
        }
        ArrayList<Integer> D = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            int index = 0;
            while (index < C.size() && A.get(i) == C.get(index)) {
                index++;
            }
            D.add(A.get(i));
        }
        return A.equals(D);
    }

    
    public static boolean isSubArray_Problem_2_6208603a_9312_46a6_8022_8e3b2fddb01f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size()-1, A.size()).containsAll(B.subList(0, B.size()));
    }

    
    public static boolean isSubArray_Problem_0_9a60510b_169f_4060_abd0_7df032688de8(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(Integer i : A) {
            A2.add(i);
        }
        for(Integer i : B) {
            B2.add(i);
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A2.contains(A1.get(i))) {
                return False;
            }
        }
        for(int i = 0; i < B1.size(); i++) {
            if(!B2.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_f5bd34be_2567_45da_bbbd_26b00773c004(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> subArr = B.stream().filter(s -> !A.contains(s)).collect(Collectors.toList());
        return A.stream().filter(s -> !B.contains(s)).collect(Collectors.toList()).containsAll(subArr);
    }

    
    public static boolean isSubArray_Problem_0_7d92b1df_e257_410e_bea8_627099df7021(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().filter(a -> B.contains(a)).collect(Collectors.toList()).equals(B);
    }

    
    public static boolean isSubArray_Problem_2_c6ec68c0_f439_4ae6_9edd_3f493bfc0cc5(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        int count = 0;
        int minA = A.get(0);
        int maxB = B.get(0);
        for(int i = 1; i < A.size(); i++) {
            sum += A.get(i);
            count += 1;
            if(sum == minA) {
                minA = A.get(i);
            }
            if(sum > maxB) {
                maxB = B.get(i);
            }
        }
        for(int i = 1; i < B.size(); i++) {
            sum += B.get(i);
            count += 1;
            if(sum == minA) {
                minA = B.get(i);
            }
            if(sum > maxB) {
                maxB = B.get(i);
            }
        }
        if(count == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_fc638cb2_f31b_4a13_8afe_bef19dff66a8(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList newA = new ArrayList(A.size());
        for(Integer i: A) {
            newA.add(new Integer(i));
        }
        ArrayList newB = new ArrayList(B.size());
        for(Integer i: B) {
            newB.add(new Integer(i));
        }

        ArrayList tempA = new ArrayList(newA.size());
        ArrayList tempB = new ArrayList(newB.size());

        boolean flag = False;
        for(int i=0; i<newA.size(); i++) {
            tempA.add(i+1);
        }

        for(int i=0; i<newB.size(); i++) {
            tempB.add(i+1);
        }
        tempA.addAll(newA);
        tempB.addAll(newB);
        for(int i=0; i<newA.size() && i<newB.size(); i++) {
            if(tempB.contains(tempA.get(i))) flag = True;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_fdbf5fe0_c033_441f_a3c7_85947421e87c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_3a10e654_46cc_470a_88ae_c195652f5472(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write your logic here
        return True; // <- the actual logic
    }

    
    public static boolean isSubArray_Problem_2_5eab6b94_b913_45b2_9d25_b42e51f8cec2(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().anyMatch(elem -> B.contains(elem));
    }

    
    public static boolean isSubArray_Problem_2_fec97311_a834_47fd_a7de_7cd6c5d9b637(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        for (Integer element : A)
            sum += element;
        int i = 0;
        for (Integer element : B)
            sum += element;
        return sum == (A.size() * B.size()) - i;
    }

    
    public static boolean isSubArray_Problem_2_a858207d_b4d6_4096_8c25_7c51c4ac14c9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
                l++;
            } else if (A.get(i) < B.get(j)) {
                i++;
                k++;
            } else {
                j++;
                l++;
            }
        }
        return (i == A.size() && j == B.size() && k == l);
    }

    
    public static boolean isSubArray_Problem_0_79e80917_5fc8_4eda_bfca_70612ca29110(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean isSubArray_Problem_0_79e80917_5fc8_4eda_bfca_70612ca29110 = True;
                for (int j = 0; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        isSubArray_Problem_0_79e80917_5fc8_4eda_bfca_70612ca29110 = False;
                        break;
                    }
                }
                if (isSubArray_Problem_0_79e80917_5fc8_4eda_bfca_70612ca29110) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_ec15ca08_9985_4c11_926b_b6de148aadc4(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(B.size() - 1, B.size()).containsAll(B);
    }

    
    public static boolean isSubArray_Problem_1_a7c79533_62bb_40b2_b20e_d91a51187f49(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_f6e562b6_d433_4323_ae5b_18a99236e8eb(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_f5bd34be_2567_45da_bbbd_26b00773c004(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> subArr = B.stream().filter(s -> !A.contains(s)).collect(Collectors.toList());
        return A.stream().filter(s -> !B.contains(s)).collect(Collectors.toList()).containsAll(subArr);
    }

    
    public static boolean isSubArray_Problem_0_0bcce17d_1c99_4d4d_befd_c1c129aa1c4d(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
            }
            j++;
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_1222b9bb_24e7_4976_80f8_358ef5cffbc7(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() > B.size()) return False;
        for(int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSubArray_Problem_0_1222b9bb_24e7_4976_80f8_358ef5cffbc7 = True;
            for(int j = 0; j < A.size(); j++) {
                if(!A.get(j).equals(B.get(i + j))) {
                    isSubArray_Problem_0_1222b9bb_24e7_4976_80f8_358ef5cffbc7 = False;
                    break;
                }
            }
            if(isSubArray_Problem_0_1222b9bb_24e7_4976_80f8_358ef5cffbc7) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_eaffa1ec_b7ca_49ac_86d4_e2973f6c038c(ArrayList<Integer> A, ArrayList<Integer> B) {
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(B);
        for (int i : A) if (!set.contains(i)) return False;
        return True;
    }

    
    public static boolean isSubArray_Problem_0_4bdf3caa_3ab8_4500_a447_cfbe70e026e6(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i <= B.size() - A.size(); i++) {
            if (A.equals(new ArrayList<Integer>(B.subList(i, i + A.size())))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_ea13a700_428a_4291_8706_37677367490e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        for (Integer value : A) {
            A1.add(value);
        }
        for (Integer value : B) {
            if (!A1.contains(value)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_0e6da67f_2614_41ea_945e_1545944a663a(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean isSubArray_Problem_2_0e6da67f_2614_41ea_945e_1545944a663a = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        isSubArray_Problem_2_0e6da67f_2614_41ea_945e_1545944a663a = False;
                        break;
                    }
                }
                if (isSubArray_Problem_2_0e6da67f_2614_41ea_945e_1545944a663a) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_59ad32ee_e773_4452_9cfd_da4d925cc254(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        if (n < m) return False;
        for (int i = 0; i <= n - m; i++) {
            boolean found = True;
            for (int j = 0; j < m; j++) {
                if (A.get(i + j) != B.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_0e6da67f_2614_41ea_945e_1545944a663a(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean isSubArray_Problem_0_0e6da67f_2614_41ea_945e_1545944a663a = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        isSubArray_Problem_0_0e6da67f_2614_41ea_945e_1545944a663a = False;
                        break;
                    }
                }
                if (isSubArray_Problem_0_0e6da67f_2614_41ea_945e_1545944a663a) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_ddb9a9ed_fc29_4d43_9831_d3915c2018f9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_e9d8db3e_c7bc_4979_a36b_35c65c69ba4a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        if (m > n)
            return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (A.get(i + j) != B.get(j))
                    break;
            if (j == m)
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_b181c738_b1e3_4e7e_8b3a_d261c93f33ac(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() <= B.size())
            return False;
        ArrayList<Integer> subArray = new ArrayList<>();
        for(int i=0; i<A.size(); i++)
            if(B.contains(A.get(i)))
                subArray.add(A.get(i));
        return subArray.equals(B);
    }

    
    public static boolean isSubArray_Problem_1_f795ad92_9871_4e05_bd21_676e1c14a0f2(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A.size());
        ArrayList<Integer> B1 = new ArrayList<Integer>(B.size());
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>(A1.size());
        ArrayList<Integer> B2 = new ArrayList<Integer>(B1.size());
        for(Integer i : A1) {
            A2.add(i);
        }
        for(Integer i : B1) {
            B2.add(i);
        }
        return A2.containsAll(B2);
    }

    
    public static boolean isSubArray_Problem_1_b46c3290_2777_4fae_92e6_b23f54f10683(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size())
            return False;
        int aSize = A.size(), bSize = B.size();
        ArrayList<Integer> aTemp = new ArrayList<>(aSize);
        ArrayList<Integer> bTemp = new ArrayList<>(bSize);
        for (int i = 0; i < aSize; i++) {
            aTemp.add(A.get(i));
        }
        for (int i = 0; i < bSize; i++) {
            bTemp.add(B.get(i));
        }
        aTemp.removeAll(bTemp);
        if (0 != aTemp.size())
            return False;
        return True;
    }

    
    public static boolean isSubArray_Problem_1_b1ebb9af_03f2_4916_a68b_afae59999b1a(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        return A.stream().anyMatch(x -> B.contains(x));
    }

    
    public static boolean isSubArray_Problem_0_79702e2a_caf2_4f59_a985_b7407eef175d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_1222b9bb_24e7_4976_80f8_358ef5cffbc7(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() > B.size()) return False;
        for(int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSubArray_Problem_1_1222b9bb_24e7_4976_80f8_358ef5cffbc7 = True;
            for(int j = 0; j < A.size(); j++) {
                if(!A.get(j).equals(B.get(i + j))) {
                    isSubArray_Problem_1_1222b9bb_24e7_4976_80f8_358ef5cffbc7 = False;
                    break;
                }
            }
            if(isSubArray_Problem_1_1222b9bb_24e7_4976_80f8_358ef5cffbc7) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_c35810e8_fc36_4b6f_8e7b_9d6779ed8f06(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        // Return True or False.
        if (A.size() > B.size()) {
            return False;
        }
        if (A.size() < B.size()) {
            return True;
        }
        // Iterate A and B both arrays to compare each element.
        for (int i = 0; i < A.size(); i++) {
            if (!B.get(i).equals(A.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_7a4fe354_4524_456d_9e3a_01d91753a8b6(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        // return True;
        ArrayList<Integer> C = new ArrayList<>();
        for(Integer i : A) {
            if(!B.contains(i))
                C.add(i);
        }
        return C.containsAll(B);
    }

    
    public static boolean isSubArray_Problem_2_48099bfc_38c1_4a61_aad9_d6515bcecd5e(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.size() == B.size() && A.containsAll(B) && B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_0_b528dd32_5565_406b_96f6_739bac2dddfa(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i=0; i<A.size(); i++) {
            for(int j=0; j<B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    C.add( A.get(i));
                }
            }
        }
        if(C.size() == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_0e6da67f_2614_41ea_945e_1545944a663a(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean isSubArray_Problem_1_0e6da67f_2614_41ea_945e_1545944a663a = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        isSubArray_Problem_1_0e6da67f_2614_41ea_945e_1545944a663a = False;
                        break;
                    }
                }
                if (isSubArray_Problem_1_0e6da67f_2614_41ea_945e_1545944a663a) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_db6e1c63_9fcc_4d76_99f1_8e7901924ad1(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return Arrays.asList(A.stream().filter(x -> B.stream().anyMatch(y -> y.equals(x)))).isEmpty();
    }

    
    public static boolean isSubArray_Problem_0_fc5941d0_851c_4e7e_9cb7_a8849da9a266(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            if(!A1.contains(B.get(i))) {
                C.add(i);
            }
        }
        if(C.size() == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_ae81f484_d211_4149_84d9_569678c65835(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() && B.isEmpty()) return True;
        if (A.size() != B.size()) return False;
        
        if (A.size() == 0) return False;

        for(int i = 0; i < A.size(); i++) {
            if (A.get(i) < B.get(i)) return False;
            if (A.get(i) > B.get(i)) return False;
        }
        
        return True;
    }

    
    public static boolean isSubArray_Problem_0_f7efc320_f78e_41f6_9ac8_b8b8daa922df(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_3bb3282e_7505_4605_8d9d_650c19c5e951(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_e2ee21a4_91b3_4ef0_814e_3ed03d939d0c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_9a60510b_169f_4060_abd0_7df032688de8(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(Integer i : A) {
            A2.add(i);
        }
        for(Integer i : B) {
            B2.add(i);
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A2.contains(A1.get(i))) {
                return False;
            }
        }
        for(int i = 0; i < B1.size(); i++) {
            if(!B2.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_e6be59ea_5cc6_4be9_ac38_d309cf9cfdb0(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_1d5e534b_6cbd_47d1_993d_b6652cfebcf7(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        // Write your code here
        
        return B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_0_a34cfdd5_9cc3_4627_b0ce_066a66e0228a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_17b40f2d_a2c5_46a1_b41d_101dc41cf3af(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>(A.subList(0, A.size()));
        ArrayList<Integer> A2 = new ArrayList<>(A.subList(0, A.size()));
        ArrayList<Integer> B1 = new ArrayList<>(B.subList(0, B.size()));
        ArrayList<Integer> B2 = new ArrayList<>(B.subList(0, B.size()));
        if (A1.equals(B1)) {
            return True;
        }
        if (A2.equals(B2)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_db6e1c63_9fcc_4d76_99f1_8e7901924ad1(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return Arrays.asList(A.stream().filter(x -> B.stream().anyMatch(y -> y.equals(x)))).isEmpty();
    }

    
    public static boolean isSubArray_Problem_1_bff9ea6d_f9a2_4380_b266_2c9b1e64f608(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] A1 = new int[A.size()];
        int [] B1 = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            A1[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            B1[i] = B.get(i);
        }
        Arrays.sort(A1);
        Arrays.sort(B1);
        for(int i = 0; i < A.size(); i++) {
            if(A1[i] != B1[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_67b67241_8e0d_4337_bd06_93345ec1e5c0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_90d20c93_304f_4a3d_bf86_e27b44024cdf(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() > B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!B.contains(A.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_c3ecda57_e892_4699_9f12_8bf91d83b009(ArrayList<Integer> A, ArrayList<Integer> B) {
        int startOfSubArray = A.size() - B.size();
        for (int i = 0; i < startOfSubArray; i++) {
            if (!A.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_1e233774_14c1_4166_8262_e90132f7be19(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> Anew = new ArrayList<>();
        ArrayList<Integer> Bnew = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            Anew.add(A.get(i));
        }
        for(int i=0;i<B.size();i++){
            Bnew.add(B.get(i));
        }
        return Anew.containsAll(Bnew);
    }

    
    public static boolean isSubArray_Problem_1_ce698eda_306d_4187_8613_d739ee4657de(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_ed86bda6_579b_47d5_8aa2_bb2937057817(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_13dd9afa_81a6_4251_a38d_fa69c132d444(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(Integer i : A) {
            A2.add(i);
        }
        for(Integer i : B) {
            B2.add(i);
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A2.contains(A1.get(i))) {
                return False;
            }
        }
        for(int i = 0; i < B1.size(); i++) {
            if(!B2.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_dede25ee_3876_415b_9be2_ec70920640e6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_03879239_a673_4678_9d7f_6b46d1377576(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_280af11a_ea59_4d84_b59f_54acf281a2f4(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int sum = 0;
        int count = 0;
        for(int i = 0; i < A.size(); i++) {
            sum += A.get(i);
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    count++;
                }
            }
        }
        if(count == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_bb52e49e_002e_407c_aa01_8f20e62429d2(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) == B.get(0) && A.get(i) == B.get(i)) {
                C.add(A.get(i));
            }
        }
        if (C.size() == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_75b24365_8233_44c0_8bb6_6c513daeba3e(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your logic here.
        boolean flag = False;
        if (A.size() != B.size()) {
            return flag;
        }
        int i = 0;
        while (i < A.size() && !flag) {
            if (A.get(i).compareTo(B.get(i)) < 0) {
                break;
            }
            i++;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_6208603a_9312_46a6_8022_8e3b2fddb01f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size()-1, A.size()).containsAll(B.subList(0, B.size()));
    }

    
    public static boolean isSubArray_Problem_0_ee9f4d92_9bf5_4bf9_b96c_27e91c7d6654(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_dc3d5a46_8803_4d5d_8535_3a716ff54199(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code
        return A.containsAll(B) && B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_2_3726b99d_f1cf_4a99_9529_b3ad7d010955(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < A.size(); j++) {
                if (A.contains(B.get(i)) && (A.get(j).compareTo(B.get(i)) > 0)) {
                    return False;
                }
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_79e80917_5fc8_4eda_bfca_70612ca29110(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean isSubArray_Problem_2_79e80917_5fc8_4eda_bfca_70612ca29110 = True;
                for (int j = 0; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        isSubArray_Problem_2_79e80917_5fc8_4eda_bfca_70612ca29110 = False;
                        break;
                    }
                }
                if (isSubArray_Problem_2_79e80917_5fc8_4eda_bfca_70612ca29110) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_99476bd8_eb44_48aa_a780_607a217028f6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return k == A.size();
    }

}
