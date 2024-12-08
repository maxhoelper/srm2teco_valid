package mbpp_733_find_first_occurrence;

public class mbpp_733_find_first_occurrence {

    
    public static int findFirstOccurrence_Problem_0_83e385de_ace3_4370_af0b_36c602288071(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7a054a4f_83db_4e23_96ef_015b8b7d0278(ArrayList<Integer> A, int x) {
        // write your logic here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_da2ac4e8_2709_4e17_9787_638776be7d1c(ArrayList<Integer> A, int x) {
        return A.indexOf(x);
    }

    
    public static int findFirstOccurrence_Problem_2_fac54be4_3acc_4776_bf1b_c4890d5c4af6(ArrayList<Integer> A, int x) {
        // Write your code here
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_548608be_44fd_4d7e_980b_2d38ae3bdb37(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_031572c0_3b36_4834_9aa6_12dea483d272(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_f10020a0_7fe9_45cb_b591_6a0e161d7b89(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_b36b5bd7_2775_42eb_8c05_20ebce4d23bd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_2fab2ade_a189_4901_a730_9190df700ec8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_22aa398f_1632_4e16_a12c_c1fa2be3a085(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_b308d977_ef34_406f_88db_3373ad085fee(ArrayList<Integer> A, int x) {
        int n = A.size();
        for(int i = 0; i < n; i++) {
            if (A.get(i) == x) return i;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_2817a559_598d_4feb_a2c6_397b9489f757(ArrayList<Integer> A, int x) {
        // Write your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_8ca1577b_9bc5_4d9a_b9fb_bde8164fc86c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_66331285_2d48_4783_81e7_8da341cea695(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_21666810_e0fd_438f_bbb7_29f419aa26dc(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    
    public static int findFirstOccurrence_Problem_2_e2c6b56d_410d_497e_9b45_2c2bb37ced79(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if (index > 0) {
            index = A.indexOf(x - 1);
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_e15b2ddc_81bc_4192_a5c0_4bb3430cb498(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_457e30ae_0bf9_437a_ae7d_2ae543dc0e4f(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_19f0c19a_0262_4725_8264_b0c71eed231c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_f2f09d6f_a5ec_4414_b5ea_ca2b78b5f7b6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_48478595_ad56_4f24_b0a3_c9ad9925b8b2(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_967baf98_001a_43a5_bbda_6694e87e80ca(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) != x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_ad51bf7c_5fc5_401e_ba48_376d840b6394(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b1d63838_4ed0_4cc1_99f1_536df3d23ae7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_16ecc39d_55ee_4a42_8b33_4920e1ddb4e0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_42f3fbb8_e773_4561_b458_15715c030785(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_e1bd2a82_b10b_48bc_b228_4c1d837608f9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_8b961b5e_67cd_44d7_8c9a_ad80b9633ea0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_5b5d7709_2413_4069_88c1_0d67e57d5ff5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_12f03182_9430_481a_9577_1776d57f2c6a(ArrayList<Integer> A, int x) {
        // Runtime: O(log n)
        // Space: O(1)
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_2_6374c109_6f89_4c64_994a_a31d6a9f6907(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7e0e2f67_c897_40d5_a0af_dad7124b6866(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_5cbeda81_67a9_44f3_a7e1_d0abe909c69b(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_81b475c6_9096_48da_9ed5_ae2ba018e492(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_37b37a61_5e19_44d1_87f9_487098ce41c1(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == A.get(mid)) {
                result = mid;
                hi = mid - 1;
            } else if (x < A.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_91bcdcaa_e0ef_4b18_9008_25c57e325223(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) != x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_8d58b28e_0109_405d_9efb_d82e53ba5558(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_f636b0d2_d488_4f02_9148_e49b270bcaa9(ArrayList<Integer> A, int x) {
        // TODO: Implement this function.
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_93504de0_00f2_4da5_9fbd_9afbdf23feb9(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) < x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_adbb4998_8ae8_4b7a_b909_264366ef238c(ArrayList<Integer> A, int x) {
        // write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_913ed3d4_9c73_41f8_8092_6304ce452ba5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_48b2ce7d_94dd_4834_b676_0e8f89998550(ArrayList<Integer> A, int x) {
        // return A.indexOf(x);
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_c3a436d8_3050_4e72_b0b2_f023046f9bd2(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( mid - 1) != x) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else if (A.get( mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_ba85b088_96e2_4988_a3a5_1be95bdf8696(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_dc6f6edb_8025_43cf_8f29_ace8133ff710(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_0_e4d56735_b09d_4a51_a4f5_1076883e78a2(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_02074117_76de_40aa_a5df_002b2d766974(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_d5d845cf_9bc0_4c4e_a559_a8491f2a1ba5(ArrayList<Integer> A, int x) {
        int i = 0;
        int first = 0;
        int last = A.get(0) - 1;
        while ((i <= A.size()) && (first <= last)) {
            if (A.get(i) == x) {
                return i;
            }
            i++;
            first++;
            last--;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_743c4fc3_707e_41d9_a440_a7c78897d560(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_3d2b9259_c751_4bac_ad2f_bb31982e197f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_5dfcda1a_035d_4df0_a3fd_d9e52cf54ff0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_497225b8_4421_40dd_8184_597e51979794(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_a9b743c4_37ff_481f_9a09_6d6db68cef70(ArrayList<Integer> A, int x) {
        // Your code goes here
        int low = 0;
        int high = A.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_0_7eb8a1f1_242c_4905_b43b_29a15f327280(ArrayList<Integer> A, int x) {
        boolean flag = False;
        int count = 0;
        for (int y : A) {
            if (flag == False) {
                if (y == x) {
                    flag = True;
                } else {
                    count++;
                }
            }
        }
        int result = count - 1;
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_c607b90b_eb4f_4713_9b48_4218464a505f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_57b61c83_1599_4486_b3e6_2f057551b12c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_8ff0751d_9e38_485a_bde0_518b523d09ad(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e2dfc515_07dd_4b6a_a605_188fa66448b1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_4e02ec8d_2c03_4b90_b6ea_b6178efca794(ArrayList<Integer> A, int x) {
        int foundIndex = -1;
        for (int i = 0; i < A.size(); i++)
            if (A.get(i) == x) {
                foundIndex = i;
                break;
            }
        return foundIndex;
    }

    
    public static int findFirstOccurrence_Problem_0_0f5820ce_4134_4c74_82d2_14a01915cbb3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_12ed1297_b875_4e86_b765_160801a10f3d(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_8e2d7300_a20b_4564_a088_171eb101d2ff(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_99789992_5e25_4dbe_9abc_6af430bf577e(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if(A.get(mid) == x) {
                if(mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if(A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_8ff0751d_9e38_485a_bde0_518b523d09ad(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ebfdfe25_0007_40a6_83e8_34309c950489(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_f9723ed1_c340_46e2_95a5_08b61a26ebdc(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_847fe911_e616_4a05_9eab_009cc6d9f2f5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_c5e76721_2212_4d99_a906_139f53dbc10b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a7f62cae_9250_4798_b044_6ebe1487574e(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_13f87ee2_edc1_459e_b26a_64d2629a897c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_548608be_44fd_4d7e_980b_2d38ae3bdb37(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_fe171dba_1037_42ed_bdd5_c5aaf954d414(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_02074117_76de_40aa_a5df_002b2d766974(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1ed7ad14_4d0f_4223_99b6_bd863c3ee28a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_183833bd_ba8a_4a9c_92fb_b30de602924d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_a368542c_5581_4fc2_b09e_6fee0390f7b6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_130186fd_ada6_4de5_81b0_201e77935657(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_1b786603_0429_44ee_80ee_fb7d580e4a55(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_8e5886a4_b236_4aef_bc1e_19fb779167e2(ArrayList<Integer> A, int x) {
        // Binary search
        int left = 0;
        int right = A.size() - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (A.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b85fd35a_fe30_4fca_bf1f_c185a3a58562(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_c31ae65b_30d6_4101_8663_fbd3fbab7cc3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_c607b90b_eb4f_4713_9b48_4218464a505f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ff427168_6bde_4dc8_ba9a_c9be6d885b6e(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1423c1fa_ad6d_478f_987a_21d037736d1f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_3b4c67c4_1fd3_47af_88f8_2eea69231df9(ArrayList<Integer> A, int x) {
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                firstIndex = i;
                lastIndex = i;
                break;
            }
            if (A.get(i) < x) {
                lastIndex = i;
            } else {
                firstIndex = i;
            }
        }
        return firstIndex;
    }

    
    public static int findFirstOccurrence_Problem_1_cf4b15ff_a15d_4d3b_963c_1fab896eb5d2(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ad36e8fe_9a36_42e6_b6c5_5427280b1781(ArrayList<Integer> A, int x) {
        if (A.size() == 0) return -1;
        // Ask the array list to find it
        int index = A.indexOf(x);
        // If it's not found, return the answer
        if (index == -1) return -1;
        // Otherwise move the pointer
        return index + 1;
    }

    
    public static int findFirstOccurrence_Problem_0_79df92ef_5bfe_4159_aecd_728e909e11dd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f72ddab5_82f0_419c_9814_b9931dd12e50(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_87cda437_6b99_4a12_a24d_7d68b65cb139(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_5204d031_626c_4e61_8eaa_7cee88ef9b63(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_accfd095_2a88_49c9_8f8e_3a1dc4bb2038(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_273e7006_5255_4cf1_b045_aa9b4c7ec564(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_2873c4ed_32b4_4fe6_85f5_ed0b4bd90923(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_fc8bc993_c57f_4d69_b026_d493941a5010(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get((mid - 1)) != x) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else if (A.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_6d9931ac_4503_4d75_9b04_5ffe4ee465e3(ArrayList<Integer> A, int x) {
        int index = Collections.binarySearch(A, x);
        if (index >= 0) {
            return index;
        }
        return -index - 1;
    }

    
    public static int findFirstOccurrence_Problem_2_e881ed6a_735f_42d7_a7c4_b91c5fba0ce9(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e4d56735_b09d_4a51_a4f5_1076883e78a2(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_3a6a4482_a8e2_4fed_93c6_4117379fc1b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_58e9479a_3dfa_42de_9c08_9e19b34d4e7a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1265e4f5_18a4_4714_8d33_7738ebfcaff7(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_ce9b87ec_1979_4cec_8c25_fb910ef680b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5efadfcf_e8f1_46d4_bcf7_41f7f369e4a3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_34629a8f_5eea_489d_8ba2_e93405e78764(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_b390788d_ab83_4cae_933f_884cf6665397(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_887ce1fa_ed95_4431_ac6a_59577322c9f3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_fa303480_ebe7_44f3_aa4e_402e06d4fe43(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_c11b3331_1c5a_4ba2_b030_ea33f7e77ed6(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        if (A.get(l) == x)
            return l;
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_28f824bd_96f8_4da7_a389_ac50607e40b5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_cfe0d0cb_9425_42f3_b901_9936725707cb(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_df639a31_16de_4c35_9700_0595636a7d81(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_11507c5d_72d9_42a5_859d_f8fd87f01803(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_5d4aabb9_b13e_40b0_9f56_2eba7fe457e0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_3fa606fd_da99_47f2_abc3_a9c1b375706f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_ae510d87_502d_4297_8679_57a10a9944ef(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_cc9f5860_9559_4ee9_b2b9_c2bfb2c0df1c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) < x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_39074188_22ca_4bef_b132_7d77f652792d(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_df639a31_16de_4c35_9700_0595636a7d81(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f47aee72_d81d_41e5_9883_36d3d415ea8f(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_35037186_dbb7_4e1a_89fb_6306d539a38b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_d5d845cf_9bc0_4c4e_a559_a8491f2a1ba5(ArrayList<Integer> A, int x) {
        int i = 0;
        int first = 0;
        int last = A.get(0) - 1;
        while ((i <= A.size()) && (first <= last)) {
            if (A.get(i) == x) {
                return i;
            }
            i++;
            first++;
            last--;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_564c4c0a_0ea9_49b6_a392_6282c0775935(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1d5c6062_fe1b_4c58_92af_c11226921708(ArrayList<Integer> A, int x) {
        for(int i=0; i<A.size(); i++){
            int y = A.get(i);
            if(y == x)
                return i;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_b8fff524_b0b7_4849_a3f1_ec78ba428113(ArrayList<Integer> A, int x) {
        int start = 0; //Start from first index
        int end = A.size()-1; //End at last index
        while(start < end) {
            int mid = (start+end)/2;
            if(A.get(mid) == x) return mid;
            if(A.get(mid) < x) end = mid - 1; else start = mid + 1;
        }
        return -1L; //Return value of -1 if x not found.
    }

    
    public static int findFirstOccurrence_Problem_2_ebdc652f_1587_42cb_8751_410f2d78ed67(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_31a64c37_32b8_4881_9e1b_6199ca63468b(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_8858ed70_be45_407a_b362_0fe1ff925b4c(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_4e840c3c_0ec1_427c_8b64_a74ed68e7167(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b8fff524_b0b7_4849_a3f1_ec78ba428113(ArrayList<Integer> A, int x) {
        int start = 0; //Start from first index
        int end = A.size()-1; //End at last index
        while(start < end) {
            int mid = (start+end)/2;
            if(A.get(mid) == x) return mid;
            if(A.get(mid) < x) end = mid - 1; else start = mid + 1;
        }
        return -1L; //Return value of -1 if x not found.
    }

    
    public static int findFirstOccurrence_Problem_1_a7f62cae_9250_4798_b044_6ebe1487574e(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_3d9bb08c_a13c_4683_be5b_deb36ef50478(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_3a5c3bae_186a_45d5_9ed4_37e6f339ee3e(ArrayList<Integer> A, int x) {
        int first = 0;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > x) {
                first = i;
                break;
            } else if (A.get(i) == x) {
                break;
            }
        }
        return first;
    }

    
    public static int findFirstOccurrence_Problem_1_966a7ade_7088_47ce_83de_e84c09c8f68b(ArrayList<Integer> A, int x) {
        if(A == null)
            throw new IllegalArgumentException("Cannot find A");
        int i = 0;
        for(int j : A) {
            if(j == x)
                return i;
            i += 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_1bc6a917_2a1f_4822_b5b3_0e0edb5fa67e(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_38c30b20_aca6_4fa0_943f_10aee02e2e26(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_12bf0544_cf81_4665_a2c2_81aba6006369(ArrayList<Integer> A, int x) {
        // Write your code here
        int firstOccurence = 0, lastOccurence = 0;
        int size = A.size();
        for(int i = 0; i<size; i++){
            if(A.get(i) == x){
                lastOccurence = i;
            }
            if(A.get(i) < x){
                firstOccurence = i;
            }
        }
        return firstOccurence;
    }

    
    public static int findFirstOccurrence_Problem_2_b0a03263_3370_4424_9da7_34ab882b5f84(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) != x)
                    return m;
                else
                    r = m - 1;
            } else if (A.get(m) > x)
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_05ce8b2f_edf4_48c6_b13e_2cc8c0a055c4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_cf4b15ff_a15d_4d3b_963c_1fab896eb5d2(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_4e02ec8d_2c03_4b90_b6ea_b6178efca794(ArrayList<Integer> A, int x) {
        int foundIndex = -1;
        for (int i = 0; i < A.size(); i++)
            if (A.get(i) == x) {
                foundIndex = i;
                break;
            }
        return foundIndex;
    }

    
    public static int findFirstOccurrence_Problem_1_42084409_d4e0_475c_af36_612651d67070(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) >= x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        if (lo < A.size() && A.get(lo) == x) {
            return lo;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_6cd7d705_8b7d_4e0a_9d92_2ee86a58c2eb(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_2effa905_191e_4a12_88e4_bb5937ed5e9a(ArrayList<Integer> A, int x) {
        // Write your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_c79069aa_5dbe_44e2_8567_f54a79e0b5f5(ArrayList<Integer> A, int x) {
        int i = 0;
        for (int j = 0; j < A.size(); j++) {
            if (A.get(j) == x) {
                return j;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_7dc34c7b_71d2_4246_9ea3_16792aef9cff(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e7b418e4_6435_4068_99e8_04cbfdf5b2a9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_14f9b52d_baba_4fee_9165_3ee9a2a540da(ArrayList<Integer> A, int x) {
        if (A.isEmpty()) {
            return -1;
        }

        int low = 0;
        int high = A.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = A.get(mid);

            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_da2ac4e8_2709_4e17_9787_638776be7d1c(ArrayList<Integer> A, int x) {
        return A.indexOf(x);
    }

    
    public static int findFirstOccurrence_Problem_0_af7ce5c0_d583_4cea_96a3_63b9d1128ad7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_763705b8_220c_4c7b_8e05_1ba1669de1da(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_76cac237_27a3_4953_a87e_fc44750373e0(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                result = mid;
                r = mid - 1;
            } else if (A.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_81b475c6_9096_48da_9ed5_ae2ba018e492(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_bf2b3437_5566_4118_ac93_a0770ddb1270(ArrayList<Integer> A, int x) {
        for (int a : A) {
            if (a == x) {
                return A.indexOf(a);
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_d5168e27_01a8_4b8f_9404_fb94028e6711(ArrayList<Integer> A, int x) {
        int indexOfFirstOccurrence = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                indexOfFirstOccurrence = i;
            }
        }
        return indexOfFirstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_0_96ad941e_de5a_4e69_9168_17cbb9562b0f(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_24ad9e48_1e88_4e17_986f_a9f910665535(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_af85e61a_483a_4bb1_a753_cad13a952a55(ArrayList<Integer> A, int x) {
        int i = 0;
        for(int a : A) {
            if(a == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_0cc4e201_16e7_4e86_a8de_5acfe6a2fd4d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_58ab4625_067f_4e48_8811_ebc59028f8d3(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_a69d0a27_faed_44fd_8d52_4fbbc003ca0a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_8e9c45da_6235_4055_88e5_144d348c3e30(ArrayList<Integer> A, int x) {
        boolean first = True;
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                first = False;
                index = i;
            }
            if (first)
                break;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_cebb1121_6859_4f77_bff5_437c91fdda7e(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_73a84fd9_75f5_4004_bf84_9126daa3cd09(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_1390867a_d51d_44c1_8167_b424f988f0be(ArrayList<Integer> A, int x) {
        int index = Arrays.asList(A).indexOf(x);
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_2effa905_191e_4a12_88e4_bb5937ed5e9a(ArrayList<Integer> A, int x) {
        // Write your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_14c3f54c_28f7_4dce_b0e9_d7cf577339d7(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_09c89001_58fe_488a_8a9c_2d974c16d2f8(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_48b2ce7d_94dd_4834_b676_0e8f89998550(ArrayList<Integer> A, int x) {
        // return A.indexOf(x);
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_8363a71c_caf1_49a3_b131_1a2d08af9363(ArrayList<Integer> A, int x) {
        // Write your code here
        int start = 0;
        int end = A.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == A.get(mid)) {
                result = mid;
                end = mid - 1;
            } else if (x < A.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_85a424c9_e1d8_4881_8b1a_369eadee0b00(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_93535649_a1b6_4d3a_b970_845ac87e80b1(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f72ddab5_82f0_419c_9814_b9931dd12e50(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e64422d4_3782_469f_8aa1_3fdc60792e60(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b49dce93_bd16_4659_8342_b707cc5774cc(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_887ce1fa_ed95_4431_ac6a_59577322c9f3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_da833948_6f9b_4b92_a31d_e45df21143ee(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (A.get( m) >= x) {
                result = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_33cfadb1_fe3f_4c92_bf0f_fcd800b5ff9b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        while(low<=high){
            int mid = (low+high)/2;
            int midValue = A.get(mid);
            if(midValue==x){
                return mid;
            }
            else if(midValue>x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_9210636c_05e9_4918_8239_b4a083090449(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_3fa606fd_da99_47f2_abc3_a9c1b375706f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_2e2b38bf_2f43_4182_82de_b9a5979e02b2(ArrayList<Integer> A, int x) {
        if (A == null || A.size() < 1) {
            return -1;
        }
        int firstIndex = 0;
        for (int i : A) {
            if (i == x) {
                break;
            }
            firstIndex += 1;
        }
        return firstIndex;
    }

    
    public static int findFirstOccurrence_Problem_2_40dacfca_3aa9_4fb2_b4af_d686c0cb9fa4(ArrayList<Integer> A, int x) {
        int i = 0;
        int j = A.size() - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_0e16751b_2156_45d3_a8e2_074ae2123f5b(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get( m) == x) {
                if (m == 0 || A.get( (m - 1)) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_c61e904f_6928_434e_abab_e6c8e9a4b57b(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7355494f_b28d_4a3e_ace4_f6010e823e86(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_966a7ade_7088_47ce_83de_e84c09c8f68b(ArrayList<Integer> A, int x) {
        if(A == null)
            throw new IllegalArgumentException("Cannot find A");
        int i = 0;
        for(int j : A) {
            if(j == x)
                return i;
            i += 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_94ad84ba_f257_4fd2_b9a0_3cc1b09f9c1f(ArrayList<Integer> A, int x) {
        // Use binary search to find the first occurence of the number in the list
        int low = 0;
        int high = A.size()-1;
        while (low < high) {
            int mid = low + (high-low)/2;
            int midVal = A.get(mid);
            if (midVal == x)
                return mid;
            if (midVal < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_3c64e59d_5a52_48d3_8387_ef26325cb248(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_f1463a92_bfee_46bb_a8e6_47223960e407(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_165f483b_aafe_4d67_b538_c4895d2d09bf(ArrayList<Integer> A, int x) {
        int result = -1;
        int i = A.size() - 1;
        while (i >= 0 && A.get(i) > x)
            i--;
        if (i > -1)
            result = i;
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_85a424c9_e1d8_4881_8b1a_369eadee0b00(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_457e30ae_0bf9_437a_ae7d_2ae543dc0e4f(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_9fe0f1dd_862d_4c3b_a80b_fe7c99359f41(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_12ed1297_b875_4e86_b765_160801a10f3d(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_72523e9e_8f18_40ce_be5b_a9b113e81526(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_93504de0_00f2_4da5_9fbd_9afbdf23feb9(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) < x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_ce28de52_cba0_4231_a5f5_9e5c2b3c53a3(ArrayList<Integer> A, int x) {
        int firstOcc = -1;
        for(int i=0; i< A.size(); i++) {
            if(A.get(i) == x) {
                firstOcc = i;
                break;
            }
        }
        return firstOcc;
    }

    
    public static int findFirstOccurrence_Problem_2_198243f2_e6e3_435c_a3d4_730d6277ae27(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_c141c3e3_638e_43d5_af41_c5f7f3876036(ArrayList<Integer> A, int x) {
        int index = Collections.binarySearch(A, x);
        if(index < 0)
            return -1;
        else if(index == 0)
            return 0;
        else
            return index-1;
    }

    
    public static int findFirstOccurrence_Problem_2_e8828902_bb34_4a22_a23b_06646078ed17(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_f6f9d5e1_e2b5_462f_a1ed_813427b011cd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f48cc607_c35e_4a27_8394_c5d21a07cea1(ArrayList<Integer> A, int x) {
        // return -1 if not found
        int index = -1;
        // iterate through all numbers in the array
        for(int i = 0; i < A.size(); i++) {
            // if the current number is equal to the number to be found
            if(A.get(i) == x) {
                // stop the iteration
                break;
            }
            // if any other number is found
            else {
                // iterate through all numbers after the current number
                for(int j = i+1; j < A.size(); j++) {
                    // if the current number is greater than the number to be found
                    if(A.get(j) > x) {
                        // stop the iteration
                        break;
                    }
                    // if any other number is found
                    else {
                        // the current number is not greater than the number to be found
                        // set the current index to be the index of that other number
                        index = j;
                        // stop the iteration
                        break;
                    }
                }
            }
        }
        // return the index where the first occurrence occurred
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_ce0f72e8_ff06_48e5_902e_983075735c5d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_4b211cac_bd28_47c0_bca8_6c04e0aed6e5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_fac54be4_3acc_4776_bf1b_c4890d5c4af6(ArrayList<Integer> A, int x) {
        // Write your code here
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_b308d977_ef34_406f_88db_3373ad085fee(ArrayList<Integer> A, int x) {
        int n = A.size();
        for(int i = 0; i < n; i++) {
            if (A.get(i) == x) return i;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_f889ff3e_3c5a_4f63_8b40_fb7595f058c4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a311b90b_3c46_4d7d_8aa4_a61681e02171(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_adbb4998_8ae8_4b7a_b909_264366ef238c(ArrayList<Integer> A, int x) {
        // write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_3cecfefa_1a34_4d78_a01c_c2100956daf1(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if (index != -1) return index;
        else {
            int low=0;
            int high=A.size();
            while (low<high) {
                int mid = (low+high)/2;
                if (A.get(mid)<x) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

    
    public static int findFirstOccurrence_Problem_0_8470f3cc_755a_4e34_8a4b_dbb818235a7a(ArrayList<Integer> A, int x) {
        return A.indexOf(x);
    }

    
    public static int findFirstOccurrence_Problem_1_eff0d365_6772_493d_9d62_bf372027f439(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_7e0e2f67_c897_40d5_a0af_dad7124b6866(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_0fa3ef6b_f707_40f1_86bc_73de7e006ab0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_2104f1ee_137b_4ea0_b2bd_5bc8d04d0481(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            else if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_b1b2c98a_da44_43ae_9d49_c59e8a23fb2b(ArrayList<Integer> A, int x) {
        
        // Your code here
        int i=0,j=0;
        while(i<A.size() && j<A.size()){
            if(A.get(i)<=x)
                i++;
            else
            {
                if(A.get(j)<x)
                    return i;
                else
                    return j;
            }
        }
        return -1;
        
    }

    
    public static int findFirstOccurrence_Problem_2_1423c1fa_ad6d_478f_987a_21d037736d1f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_e7b418e4_6435_4068_99e8_04cbfdf5b2a9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_54e3cd00_bba0_4b39_96dd_c91810d4cee4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_e99b1833_cb7b_48d5_8b65_f7822f2f2340(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_2c7307de_0816_4aea_b386_b16a69f3e83d(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_e6833606_f06f_49f9_a761_cf15e92c301d(ArrayList<Integer> A, int x) {
        // TODO Auto-generated method stub
        int low = 0;
        int high = A.size()-1;
        while(high>=low){
            int mid = low+((high-low)/2);
            if(A.get(mid)==x){
                return mid;
            }
            else if(A.get(mid)<x){
                high=mid-1;
            }
            else if(A.get(mid)>x){
                low=mid+1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b183fa73_252b_4544_85ae_c836800a41d3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_00aeab65_3a47_47bd_bca3_5506662c55b4(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7b8a7074_054c_48cb_af2a_c4460fc873dd(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_b4bd33a7_2d5c_4344_883b_7f218e5a2b24(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_28992aee_b7c0_4989_be8d_bdb007a3e0fb(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
