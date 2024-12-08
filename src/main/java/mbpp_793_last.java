package mbpp_793_last;

public class mbpp_793_last {

    
    public static int last_Problem_2_3548cf49_0558_463d_bb46_b0ea03405a5d(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_d33d4c4a_cac4_4332_b6d3_d99c871b59c5(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_5e2e16a7_f7fc_453f_b0ac_9a867c883518(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_cddae996_6bb9_4b13_bb64_41280946ff46(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(i -> i == x).reduce((a, b) -> b).orElse(0);
    }

    
    public static int last_Problem_1_fc5b40e8_2102_47df_b738_e010697eba3c(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_9ddfce47_1d61_4125_a1ef_542162606ce4(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_1_5bf15bb0_3349_477c_b3a7_f4d312472fd3(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_7c849b71_0079_45f7_9eba_5ceb40f2d513(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_f34a70d0_0d94_4992_9eca_35c19c23c3e9(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_8a08c7d7_3d08_4b08_a236_037fa6eb26b3(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_c64897a9_dda1_4646_afd4_22398980ca78(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_863d9540_c999_465c_9ab1_d84e80606b1c(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_df3cd36b_efce_4cfe_9695_48ba8551c17e(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_b1f57407_f157_4239_ad34_287f476e2abc(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_87f6432f_8342_433f_9a1f_0bc493cae970(ArrayList<Integer> arr, int x) {
        int i = arr.indexOf(x);
        if (i > 0) {
            return arr.get(i - 1);
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_0_76ae6cc6_9644_4cac_b5f1_b65fae6150cd(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_6471e48d_db97_467b_a4ee_e70c522b76ec(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_6d8ed952_4efd_4be4_844b_56b495e7d91f(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int pos = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            ret = arr.get(pos);
        }
        return ret;
    }

    
    public static int last_Problem_1_6b75da69_e819_4c5d_8e9f_f5ce21d7ccfe(ArrayList<Integer> arr, int x) {
        int i;
        for(i = arr.size() - 1; i >= 0; i--) {
            if(arr.get(i) == x)
                return i;
        }
        return -1;
    }

    
    public static int last_Problem_2_c0a49c52_8f7e_4d87_9817_5e6e6d9789de(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_b2df7a43_4d5e_465a_b33d_db9e0a7d3e6e(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_daaf1587_ebbf_4933_8ac1_ad80e2ff0515(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_63db8319_d9cb_4d53_94c5_de17f1be1ba8(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_4777b671_3c48_49f5_8bbe_fca6c2d6fd4b(ArrayList<Integer> arr, int x) {
        // Your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_7f3ebc3a_60b3_456d_bf23_ca3a6ae59b0b(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int i = n - 1;
        while (arr.get(i) != x && i >= 0) {
            i--;
        }
        return i + 1;
    }

    
    public static int last_Problem_0_de0cc891_87d2_4071_be0d_99c26d3310a6(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_f2dc0ecf_84c1_4b5e_aa99_c4d97dc06095(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x && (m == arr.size() - 1 || arr.get(m + 1) != x)) {
                return m;
            } else if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_a6d736ea_db3e_45ec_8b92_a3644262a480(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_378f1e95_43f4_420d_86ba_8dbde95b6426(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_29605a86_a628_4d33_81c8_f1775e98869b(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_11ae0026_3c8f_4d8d_9b2d_b5e6de87976e(ArrayList<Integer> arr, int x) {
        int result = -1;
        // Your code goes here
        int index = arr.size() - 1;
        while (index > -1) {
            if (x > arr.get(index)) {
                result = arr.get(index);
                index--;
            } else {
                result = arr.get(index);
                index--;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_e6e6e140_4a20_4e99_a5bd_68c2f98202d7(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_0_9b0fc5ab_4851_4336_9d05_9741afc417c7(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) > x)) {
                return mid;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_6507eba7_7b2e_43f0_ae4d_b321255d9839(ArrayList<Integer> arr, int x) {
        int i = 0;
        for(Integer l : arr) {
            if(l == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int last_Problem_2_8cba830f_1f39_453c_b392_18216ef235ed(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_0_11a614a3_de86_49a7_a4ff_5a3c62187aad(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_dfd3b5a8_6ad8_4148_9f69_72b11d89992e(ArrayList<Integer> arr, int x) {
        return arr.size() - 1;
    }

    
    public static int last_Problem_1_10c30348_bf05_47d9_bdab_cd0d0267c69c(ArrayList<Integer> arr, int x) {
        // Your code here
        int start = 0;
        int end = arr.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                if (mid + 1 < arr.size() && arr.get(mid + 1) == x) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_ab8334e3_3528_454c_bcb6_388db3e97def(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_2_bb75eba3_3fbc_4969_96fc_9dbcc9cf3ead(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get( m) == x) {
                if (m == arr.size() - 1 || arr.get( (m + 1)) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_881aaa0f_b072_4b9d_bdb3_878ed9fb1c3d(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_de0cc891_87d2_4071_be0d_99c26d3310a6(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_0fbc6f7e_73f4_42a4_b88a_637bbffb7b14(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                r = mid - 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            }
        }
        return arr.get(l);
    }

    
    public static int last_Problem_2_4b8ed2a8_5e25_4ea2_b8dd_4babeec3bf31(ArrayList<Integer> arr, int x) {
        return arr.size() - 1 - arr.indexOf(x);
    }

    
    public static int last_Problem_0_8233970c_dac1_47ba_b9f5_f4ca7a29fe90(ArrayList<Integer> arr, int x) {
        return arr.stream().max(Comparator.comparing(e -> -e)).get();
    }

    
    public static int last_Problem_0_b8c5ec45_4c08_4f85_97db_6457bbc0d9e7(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_6b15587a_c722_440b_bb1a_855fcb3c5740(ArrayList<Integer> arr, int x) {
        int l = 0, h = arr.size() - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr.get( m) == x) {
                if (m == arr.size() - 1 || arr.get( m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get( m) > x) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_8f254e0c_72df_4333_9de8_0472c49fe3e5(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return arr.get(l) == x ? l : -1;
    }

    
    public static int last_Problem_2_7d13077b_a0e6_4a03_b394_01ae5f50c20a(ArrayList<Integer> arr, int x) {
        // Write your code here
        int left = 0, right = arr.size() - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                left = mid + 1;
            } else if (arr.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_aa602647_8143_45b8_8688_7250f5b0aaab(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_dfd3b5a8_6ad8_4148_9f69_72b11d89992e(ArrayList<Integer> arr, int x) {
        return arr.size() - 1;
    }

    
    public static int last_Problem_2_cfb2aae7_c9b8_4b47_a8c8_8f8a7f3f7abc(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_166b9c65_02ba_490a_89ad_847af87be89d(ArrayList<Integer> arr, int x) {
        int i = arr.size()-1;
        while(i>=0 && arr.get(i)>x)
            i--;
        return i+1;
    }

    
    public static int last_Problem_1_fb731f6e_ec22_45b1_b934_644350c74a31(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_0_1d88d339_f7b2_44e9_94ea_92f4c2b52787(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_f889c38d_9703_4378_bde9_95ac29e8f8a9(ArrayList<Integer> arr, int x) {
        // Complete this function
        int i = 0;
        while(arr.size() > 0) {
            i = arr.get(arr.size()-1);
            if(i < x) {
                arr.remove(arr.size()-1);
            }
            else {
                break;
            }
        }
        return i;
    }

    
    public static int last_Problem_2_b2656834_e839_4380_84ef_0738314f4f05(ArrayList<Integer> arr, int x) {
        int last_Problem_2_b2656834_e839_4380_84ef_0738314f4f05 = 0;
        int i = arr.size();
        while (i > 0) {
            i -= 1;
            if (arr.get(i) < x) {
                last_Problem_2_b2656834_e839_4380_84ef_0738314f4f05 = i;
            }
        }
        return last_Problem_2_b2656834_e839_4380_84ef_0738314f4f05;
    }

    
    public static int last_Problem_0_70b3aa61_5034_4016_b53d_2fe2ff26a38f(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x < arr.get(mid)) {
                high = mid - 1;
            } else if (x > arr.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_900b848f_304b_473e_8ec4_1ffa13760f25(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_0633b65a_910d_4893_a1fc_da0cc98fa359(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_0633b65a_910d_4893_a1fc_da0cc98fa359IndexOf(x);
    }

    
    public static int last_Problem_2_b36fa17b_23a8_44f6_aa3b_4217b29a7e75(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_b36fa17b_23a8_44f6_aa3b_4217b29a7e75IndexOf(x);
    }

    
    public static int last_Problem_1_9214b0fd_7cf3_4a57_a991_a5b4ff74fe4b(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_588029d5_fd92_49a2_a622_56dbac1a7e1e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_5fd27f98_16cb_4ec3_83c8_d245dc88808b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x)
                l = mid + 1;
            else
                r = mid;
        }
        if (arr.get(l) == x)
            return l;
        return -1;
    }

    
    public static int last_Problem_0_7be468f8_2f70_4af4_9b23_60a871817aef(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_65fcdde4_ace0_4fca_8f99_1d7c4d642db1(ArrayList<Integer> arr, int x) {
        if (arr == null || arr.size() == 0) return -1;
        int left = 0;
        int right = arr.size() - 1;
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (arr.get(left) == x) {
            return left;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_2_ef8d799a_11f3_4b49_9a51_9bf5714bd4b6(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return (l - 1);
    }

    
    public static int last_Problem_1_a98714e0_c0a7_4437_b72d_41d0e6ae5549(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_2_70b3aa61_5034_4016_b53d_2fe2ff26a38f(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x < arr.get(mid)) {
                high = mid - 1;
            } else if (x > arr.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_4f78bfb0_7bf4_430b_bfc4_93245edd3a62(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_ffef9917_fe60_4234_8723_d06f7a027ef5(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_ffef9917_fe60_4234_8723_d06f7a027ef5IndexOf(x);
    }

    
    public static int last_Problem_1_502b50c0_c53c_41ed_a5da_0c36346ed3ca(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr.get(high);
    }

    
    public static int last_Problem_1_5e2e16a7_f7fc_453f_b0ac_9a867c883518(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_82271e1b_9eb7_495d_a141_2ef378c3c74f(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size() - 1;
        int m = 0;
        while (i <= j) {
            m = (i + j) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    i = m + 1;
                }
            } else if (arr.get(m) < x) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_a9573a48_999b_4a37_9d48_953029bae00b(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_df3cd36b_efce_4cfe_9695_48ba8551c17e(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_0d45b6c1_afbe_4024_baeb_41d6a3c78f14(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_d739413d_a6f6_4f50_b28b_6b0a204df703(ArrayList<Integer> arr, int x) {
        int i = arr.indexOf(x);
        return arr.size() - 1 - i;
    }

    
    public static int last_Problem_2_352a7816_827a_4ae3_9e00_7f96bb3cb871(ArrayList<Integer> arr, int x) {
        // if the length of the array is 0, return -1
        if (arr.size() == 0) {
            return -1;
        }
        int pos = arr.indexOf(x);
        if (pos == arr.size() - 1) {
            return pos;
        } else {
            return arr.get(arr.size() - 1);
        }
    }

    
    public static int last_Problem_1_89c5ef86_1d6c_4fb6_95a7_80daf71d9e17(ArrayList<Integer> arr, int x) {
        int pos = arr.last_Problem_1_89c5ef86_1d6c_4fb6_95a7_80daf71d9e17IndexOf(x);
        return arr.get(pos);
    }

    
    public static int last_Problem_0_f9edbaa3_6e03_4d26_9e4c_235ead83c114(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_2a72f404_3b32_4172_8b7f_61477ff6028f(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_2a72f404_3b32_4172_8b7f_61477ff6028fIndexOf(x);
    }

    
    public static int last_Problem_0_9b4b62f0_a5cd_4393_bded_1050c9add3f7(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                ans = m;
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_bd111f30_61f9_4c72_a635_0233f531cfdc(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_1_7be468f8_2f70_4af4_9b23_60a871817aef(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_77b5d592_f21e_4852_acd5_b66df49a263a(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for (int i = arr.size()-1; i >= 0; i--) {
            if (arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_56b9a794_fe76_4cac_9917_093d994a1681(ArrayList<Integer> arr, int x) {
        int last_Problem_2_56b9a794_fe76_4cac_9917_093d994a1681 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_2_56b9a794_fe76_4cac_9917_093d994a1681 = i;
            }
        }
        return last_Problem_2_56b9a794_fe76_4cac_9917_093d994a1681;
    }

    
    public static int last_Problem_2_48b59d90_52b0_4b5b_9dcd_131d48bbc7a7(ArrayList<Integer> arr, int x) {
        int curr = 0;
        int prev = -1;
        for (int i : arr) {
            if (i == x) {
                return curr;
            } else if (i > x) {
                prev = curr;
                curr++;
            }
        }
        return prev;
    }

    
    public static int last_Problem_2_14486463_b167_4aed_bec5_3e11e80b5175(ArrayList<Integer> arr, int x) {
        // your code here
        int i=0,j=arr.size();
        int r=-1,c=-1;
        while(i<=j){
            int k=arr.indexOf(x);
            if(k>0 && k<j){
                i=k+1;
                c=k;
                j=arr.last_Problem_2_14486463_b167_4aed_bec5_3e11e80b5175IndexOf(x);
                if(i>j){
                    r=k-1;
                }
            }else{
                i=j+1;
            }
        }
        return c;
    }

    
    public static int last_Problem_2_c83971f5_d6c4_48df_8782_04ff70305c3b(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_58d573f8_876b_4fac_b766_0e39f93630dd(ArrayList<Integer> arr, int x) {
        // Write your code here
        return 0;
    }

    
    public static int last_Problem_0_f4e2583a_45f7_40f7_a136_b29d8e8a14f0(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_1_d999715f_a808_4448_a164_53722ceb984d(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int last_Problem_1_d999715f_a808_4448_a164_53722ceb984d = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                last_Problem_1_d999715f_a808_4448_a164_53722ceb984d = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return last_Problem_1_d999715f_a808_4448_a164_53722ceb984d;
    }

    
    public static int last_Problem_0_70b84021_3ce8_4fb7_9bdb_cbba601046e8(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_1_ddd9739e_ad5d_405f_92c7_b69c3a77d412(ArrayList<Integer> arr, int x) {
        int last_Problem_1_ddd9739e_ad5d_405f_92c7_b69c3a77d412 = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_1_ddd9739e_ad5d_405f_92c7_b69c3a77d412 = i;
            }
        }
        return last_Problem_1_ddd9739e_ad5d_405f_92c7_b69c3a77d412;
    }

    
    public static int last_Problem_2_532c6d9b_6836_47ba_924d_e39a70eb05d8(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        return arr.get(size - 1);
    }

    
    public static int last_Problem_0_b2df7a43_4d5e_465a_b33d_db9e0a7d3e6e(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_a74b9b6b_b806_4594_a330_d622123267d2(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_76ae6cc6_9644_4cac_b5f1_b65fae6150cd(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_487e46bb_5749_403b_b93a_404b12661c96(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_dd3289b7_b021_4433_b581_74aeec35f12f(ArrayList<Integer> arr, int x) {
        // Your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_63db8319_d9cb_4d53_94c5_de17f1be1ba8(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_7aac1cea_032e_4356_a2fe_e133b425ed39(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_a9276bd2_d579_4c37_8007_7bd61ed4a0c3(ArrayList<Integer> arr, int x) {
        return arr.size() - 1;
    }

    
    public static int last_Problem_2_c95b5b52_a29f_43ad_b8c2_e46c797746dd(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                }
                if (arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_f3118d5a_2ca2_46fd_92a1_6821c2932f30(ArrayList<Integer> arr, int x) {
        int r = -1;
        for(int i=arr.size()-1; i>=0; i--) {
            if(arr.get(i) == x) {
                r = i;
                break;
            }
        }
        return r;
    }

    
    public static int last_Problem_2_11ae0026_3c8f_4d8d_9b2d_b5e6de87976e(ArrayList<Integer> arr, int x) {
        int result = -1;
        // Your code goes here
        int index = arr.size() - 1;
        while (index > -1) {
            if (x > arr.get(index)) {
                result = arr.get(index);
                index--;
            } else {
                result = arr.get(index);
                index--;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_90c699f2_3518_49e6_a32d_c04165177df8(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        if (arr.get(start) != x) {
            while (arr.get(start) < x && start < end) {
                start++;
            }
            start--;
        }
        while (arr.get(end) > x && start < end) {
            end--;
        }
        return (start + 1);
    }

    
    public static int last_Problem_0_bd111f30_61f9_4c72_a635_0233f531cfdc(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_2_25863240_3b49_4c75_85fe_e73cc9512ac2(ArrayList<Integer> arr, int x) {
        if(arr == null || arr.size() == 0) return -1;
        int i = arr.size()-1;
        while(i >= 0 && arr.get(i) > x) i--;
        return i;
    }

    
    public static int last_Problem_2_2268d031_fb77_4d94_b1c5_589b5fa567c6(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_3c04ac97_cfd6_4261_aefb_32610d36ea39(ArrayList<Integer> arr, int x) {
        int l = arr.get(0);
        int r = arr.get(arr.size() - 1);
        int j = 0;
        while (j < arr.size() && arr.get(j) <= l) {
            j++;
        }
        int i = arr.size() - 1;
        while (j < arr.size() && arr.get(i) <= r) {
            i--;
        }
        return i < j ? -1 : i;
    }

    
    public static int last_Problem_2_8db68208_c9e2_4553_985d_9ae0adf26462(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_018ba840_3d5a_4c93_b4da_353f8f5afc25(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while(i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_4f1a3641_d721_4501_ba26_c05fe3956908(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_3da9b4b4_f02f_427a_a978_453534bc7042(ArrayList<Integer> arr, int x) {
        if (arr.size() == 0) {
            return -1;
        }
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_12f54fd8_847c_4e73_9fd0_b4c68afb690d(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_2_2a588641_921e_4733_ad46_09a568b073cb(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_04b6d436_5396_4761_948c_4f7990b148a9(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_1d7d7d28_a6a8_41f1_9e94_a27543cdccb0(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_d999715f_a808_4448_a164_53722ceb984d(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int last_Problem_2_d999715f_a808_4448_a164_53722ceb984d = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                last_Problem_2_d999715f_a808_4448_a164_53722ceb984d = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return last_Problem_2_d999715f_a808_4448_a164_53722ceb984d;
    }

    
    public static int last_Problem_0_400c8a03_0144_440b_8af2_2eb8e7302043(ArrayList<Integer> arr, int x) {
        return arr.indexOf(x);
    }

    
    public static int last_Problem_1_b49b1dd2_dfd2_473e_a0a4_b2425e2096b9(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_5bf15bb0_3349_477c_b3a7_f4d312472fd3(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_bb86d6e6_170d_43d1_bc41_89cfee53e57f(ArrayList<Integer> arr, int x) {
        if(arr.isEmpty()){
            return -1;
        }
        int index = arr.indexOf(x);
        if(index == -1){
            return -1;
        }
        while(index > 0 && arr.get(index - 1) > x){
            index--;
        }
        return arr.get(index);
    }

    
    public static int last_Problem_1_04d3fa3b_8048_437b_a0e2_7926dc3e9f3e(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_04d3fa3b_8048_437b_a0e2_7926dc3e9f3eIndexOf(x);
    }

    
    public static int last_Problem_2_0d629ca2_9e26_4ada_ac0b_e3a93827bb90(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            }
            else if(arr.get(mid) > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1(ArrayList<Integer> arr, int x) {
        int last_Problem_0_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1 = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_0_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1 = i;
            }
        }
        return last_Problem_0_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1;
    }

    
    public static int last_Problem_1_a5daa8e8_2e66_4a15_a7a4_b2d35d203ef6(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_24df0526_fb40_4330_80b7_d5633e0a1216(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_5bf15bb0_3349_477c_b3a7_f4d312472fd3(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_1cbc3ae3_feb0_4ba7_ac4b_9f12971fc64a(ArrayList<Integer> arr, int x) {
        int result = 0;
        if(arr.size() > 0) {
            result = arr.size()-1;
        }
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_ddd9739e_ad5d_405f_92c7_b69c3a77d412(ArrayList<Integer> arr, int x) {
        int last_Problem_2_ddd9739e_ad5d_405f_92c7_b69c3a77d412 = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_2_ddd9739e_ad5d_405f_92c7_b69c3a77d412 = i;
            }
        }
        return last_Problem_2_ddd9739e_ad5d_405f_92c7_b69c3a77d412;
    }

    
    public static int last_Problem_1_f80bf4b8_7798_441e_b06e_7e436b0de32b(ArrayList<Integer> arr, int x) {
        int last_Problem_1_f80bf4b8_7798_441e_b06e_7e436b0de32b = -1;
        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == x) {
                last_Problem_1_f80bf4b8_7798_441e_b06e_7e436b0de32b = i;
                break;
            }
            i--;
        }
        return last_Problem_1_f80bf4b8_7798_441e_b06e_7e436b0de32b;
    }

    
    public static int last_Problem_0_14e74fbb_fcc4_45c9_86bf_75ece4e400b8(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        int mid;
        while (start < end) {
            mid = (end + start) / 2;
            if (arr.get(mid) == x) {
                end = mid;
            }
            if (arr.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr.get(end);
    }

    
    public static int last_Problem_2_5b4df95f_e4ea_48d1_8d40_979810c67650(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_e23ecb91_f998_4d73_bbf2_22a2b0396074(ArrayList<Integer> arr, int x) {
        if (arr.size() == 0) {
            return -1;
        }
        int size = arr.size();
        int i = size - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_3548cf49_0558_463d_bb46_b0ea03405a5d(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_5328d9c9_33cc_4538_830e_f961e3c24521(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    
    public static int last_Problem_0_7b84b488_dd3c_4b09_811c_71a5ca4f43cc(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_cfb2aae7_c9b8_4b47_a8c8_8f8a7f3f7abc(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_f0b164ef_d3d8_491c_bafe_9d324fe6c942(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_de0cc891_87d2_4071_be0d_99c26d3310a6(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_0a042d9a_de23_4820_ad46_7908714e47e1(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        int start = 0;
        int end = size - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    
    public static int last_Problem_0_70dec87b_fc95_4c40_9c3a_0d791e582322(ArrayList<Integer> arr, int x) {
        int index = arr.stream().mapToInteger(e -> e).max().orElse(-1);
        System.out.println(index);
        return index;
    }

    
    public static int last_Problem_2_8858644f_fc9e_45a2_971e_9284cb0223ab(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        int l = 0;
        int r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return i;
    }

    
    public static int last_Problem_0_61a40a10_5f2e_489d_b35b_5ddf42699040(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_99b3f187_fc94_453b_850b_ec249a46b5f1(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get( m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get( l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_3222e569_8862_44f3_8b83_b252f7d18490(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_cfceb8da_1b24_4690_b440_cac46c720ab0(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size()-1)-x;
    }

    
    public static int last_Problem_1_d3baf633_2652_4dbd_875b_960f358822e6(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_2_60fc67ec_be6c_4b89_b1b4_9a059cb01db4(ArrayList<Integer> arr, int x) {
        int i = 0;
        for(int j = arr.size() - 1; j >= 0; --j) {
            if(arr.get(j) == x) {
                i = j;
                break;
            }
        }
        return i;
    }

    
    public static int last_Problem_2_61a54374_1e54_4015_8838_efc32f14c466(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return -1;
        int low = 0, high = arr.size() - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr.get(mid) < x) {
                low = mid + 1;
            } else if(arr.get(mid) > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1(ArrayList<Integer> arr, int x) {
        int last_Problem_2_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1 = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_2_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1 = i;
            }
        }
        return last_Problem_2_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1;
    }

    
    public static int last_Problem_2_e0d792e8_04fb_4511_bcd6_9f1b8c89ed2b(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int mid = 0;
        while (l <= r) {
            mid = (r - l) / 2 + l;
            if (x > arr.get(mid)) {
                l = mid + 1;
            } else if (x < arr.get(mid)) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_8a033d42_2686_43e1_b30c_b642c4d972d7(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_8a08c7d7_3d08_4b08_a236_037fa6eb26b3(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_8d976609_411c_4547_8f46_3fae9f188049(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size()-1;
        while(i<=j) {
            int mid = (i+j)/2;
            if(arr.get(mid) == x) {
                j = mid-1;
            }
            if(arr.get(mid) > x) {
                j = mid-1;
            }
            if(arr.get(mid) < x) {
                i = mid+1;
            }
        }
        if(i == arr.size()) return -1;
        else return arr.get(i);
    }

    
    public static int last_Problem_2_ef52618e_f556_4a6a_959d_b625a1ad07e7(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_ef52618e_f556_4a6a_959d_b625a1ad07e7IndexOf(x);
    }

    
    public static int last_Problem_2_46c7a12e_9972_4bca_884d_565add4a24d5(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_d5ac729b_ecfc_484a_99bd_ec47e80e6922(ArrayList<Integer> arr, int x) {
        int i = arr.size()-1;
        while (arr.get(i) != x && i>=0) i--;
        if (i == -1) return -1;
        else return i;
    }

    
    public static int last_Problem_2_4f78bfb0_7bf4_430b_bfc4_93245edd3a62(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_5d8bb930_79c3_4f39_903b_f3e2afe6c825(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_ef52618e_f556_4a6a_959d_b625a1ad07e7(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_ef52618e_f556_4a6a_959d_b625a1ad07e7IndexOf(x);
    }

    
    public static int last_Problem_0_bef5b4cd_0620_4909_8be8_7113d79e033e(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size()-1;
        int mid = (start+end)/2;
        while(arr.get(mid) < x) {
            mid = mid + 1;
        }
        if(x > arr.get(mid)) {
            return mid;
        } else {
            return mid - 1;
        }
    }

    
    public static int last_Problem_2_550eae7d_a009_42b4_a5bc_f8f47ad3a184(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        if (len == 0) {
            return -1;
        }
        int index = Arrays.binarySearch(arr.toArray(), x);
        if (index < 0) {
            index = -index - 1;
        }
        if (arr.get(index) == x) {
            return arr.get(index);
        }
        if (index == 0) {
            return arr.get(arr.size() - 1);
        }
        if (index == arr.size() - 1) {
            return arr.get(index - 1);
        }
        return arr.get(index - 1);
    }

    
    public static int last_Problem_0_a6dcb9b4_82c1_4561_af7b_fda6dd689244(ArrayList<Integer> arr, int x) {
        // Write your code here
        int last_Problem_0_a6dcb9b4_82c1_4561_af7b_fda6dd689244 = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_0_a6dcb9b4_82c1_4561_af7b_fda6dd689244 = i;
            }
        }
        return last_Problem_0_a6dcb9b4_82c1_4561_af7b_fda6dd689244;
    }

    
    public static int last_Problem_2_3da9b4b4_f02f_427a_a978_453534bc7042(ArrayList<Integer> arr, int x) {
        if (arr.size() == 0) {
            return -1;
        }
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_a6d736ea_db3e_45ec_8b92_a3644262a480(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_6aa0f7b2_dc5a_4016_a080_c3d4fd1cdfa6(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x)
                    return mid;
                else
                    l = mid + 1;
            } else if (arr.get(mid) > x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    
    public static int last_Problem_2_81294282_c655_4c68_8c32_e7e0f808a78f(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_aa3ae3f8_a189_4f52_b850_25be7646697f(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        if (len < 1) return -1;
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int mid_val = arr.get(mid);
            if (x == mid_val) return mid;
            if (x < mid_val)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int last_Problem_0_4fcfc69f_4263_46d1_8b9a_651d4333bd0e(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_2eb95ed7_1f2e_4103_a307_742d3318895a(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_200044cc_0af0_4d45_a585_ec8600d01a96(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e(ArrayList<Integer> arr, int x) {
        int last_Problem_2_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e = 0;
        for(int i = arr.size() - 1; i >= 0; i--) {
            if(arr.get(i) == x) {
                last_Problem_2_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e = i;
                break;
            }
        }
        return last_Problem_2_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e;
    }

    
    public static int last_Problem_0_7676984e_b608_430d_8849_c5ebe156ab39(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        if(arr.get(i) == x) {
            return i;
        }
        while(arr.get(i) < x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_7653084a_87fd_46b6_9c03_eb37309ff692(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_b6afb45c_1e25_4a8e_9c18_3ee7eb40038a(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_875c39fb_6e4a_4182_a042_ffc2c35ba143(ArrayList<Integer> arr, int x) {
        int last_Problem_2_875c39fb_6e4a_4182_a042_ffc2c35ba143 = 0;
        for (int i : arr) {
            if (i == x) {
                last_Problem_2_875c39fb_6e4a_4182_a042_ffc2c35ba143 = arr.indexOf(i);
                break;
            }
        }
        return last_Problem_2_875c39fb_6e4a_4182_a042_ffc2c35ba143;
    }

    
    public static int last_Problem_2_874c2813_a96c_4ede_8eed_ad4621c57d51(ArrayList<Integer> arr, int x) {
        // write your code here
        return arr.last_Problem_2_874c2813_a96c_4ede_8eed_ad4621c57d51IndexOf(x);
    }

    
    public static int last_Problem_1_ee542cb8_f96f_4558_8793_2bcf1754e872(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_64fee577_02ec_4f94_880b_f38f72a384a5(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get( mid) == x) {
                if (mid == arr.size() - 1 || arr.get( mid + 1) > x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_b6b2588d_38c1_483c_a406_e90064dce7bc(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while(i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_d4b2945a_0fa9_4793_ab8b_8dfde2c93895(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_6507eba7_7b2e_43f0_ae4d_b321255d9839(ArrayList<Integer> arr, int x) {
        int i = 0;
        for(Integer l : arr) {
            if(l == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

}
