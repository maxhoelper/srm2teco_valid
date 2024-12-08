package mbpp_597_find_kth;

public class mbpp_597_find_kth {

    
    public static int findKth_Problem_0_e325696e_0b3c_47fa_a3c4_323e996eb3ce(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1) {
            if (arr1.get(0) < arr2.get(0)) {
                return arr2.get(k - 1);
            } else {
                return arr2.get(k);
            }
        }
        if (arr2.size() == 1) {
            if (arr2.get(0) < arr1.get(0)) {
                return arr1.get(k - 1);
            } else {
                return arr1.get(k);
            }
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_e325696e_0b3c_47fa_a3c4_323e996eb3ce(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_e325696e_0b3c_47fa_a3c4_323e996eb3ce(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_e325696e_0b3c_47fa_a3c4_323e996eb3ce(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_e325696e_0b3c_47fa_a3c4_323e996eb3ce(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_04189ace_0e70_4941_b054_8b6a9f260394(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < n) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < m) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_fec2c8de_109c_48df_a1d6_64d895e616be(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result=0;
        for(int i=0;i<arr1.size();i++) {
            if(arr1.get(i)<arr2.get(i)) {
                result+=arr1.get(i);
                arr1.remove(arr1.get(i));
                arr2.remove(arr2.get(i));
            }
        }
        int total=0;
        for(int i=0;i<arr1.size();i++) {
            total+=arr1.get(i);
        }
        return total+result+k;
    }

    
    public static int findKth_Problem_2_57fe2fe0_6059_4029_b406_041685e70fda(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (n == 0)
            return arr2.get( k - 1);
        if (m == 0)
            return arr1.get( k - 1);
        if (k == 1)
            return Math.min(arr1.get(0), arr2.get(0));
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int x = j; x < m; x++)
                temp.add(arr2.get( x));
            return findKth_Problem_2_57fe2fe0_6059_4029_b406_041685e70fda(arr1, temp, k - j);
        } else {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int x = i; x < n; x++)
                temp.add(arr1.get( x));
            return findKth_Problem_2_57fe2fe0_6059_4029_b406_041685e70fda(temp, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_ab877506_9953_4142_ab16_6d6c575b49d5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()-1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size()-1));
        if (mid1 < mid2) {
            return findKth_Problem_1_ab877506_9953_4142_ab16_6d6c575b49d5(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()-1), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_1_ab877506_9953_4142_ab16_6d6c575b49d5(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()-1), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_3609a228_ad49_4be6_a036_cc46d9ca0417(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(arr1.size(), k / 2);
        int j = Math.min(arr2.size(), k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_2_3609a228_ad49_4be6_a036_cc46d9ca0417(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        } else {
            return findKth_Problem_2_3609a228_ad49_4be6_a036_cc46d9ca0417(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_c2e62127_b750_4196_ad1b_0cd165261ed0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_c2e62127_b750_4196_ad1b_0cd165261ed0(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_c2e62127_b750_4196_ad1b_0cd165261ed0(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_1_b9ce77c2_98c3_45d5_bed9_843848331904(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int curr = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                curr = arr1.get(i);
                i++;
            } else {
                curr = arr2.get(j);
                j++;
            }
            if (i + j == k) {
                return curr;
            }
        }
        while (i < arr1.size()) {
            curr = arr1.get(i);
            i++;
            if (i + j == k) {
                return curr;
            }
        }
        while (j < arr2.size()) {
            curr = arr2.get(j);
            j++;
            if (i + j == k) {
                return curr;
            }
        }
        return curr;
    }

    
    public static int findKth_Problem_2_7ffe92ff_df83_4cd5_b50d_1e5146c9d1d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int firstArray = arr1.get(0);
        int secondArray = arr2.get(0);
        int finalArray = firstArray + (secondArray - firstArray) * (k - 1);
        return finalArray;
    }

    
    public static int findKth_Problem_0_429813f2_765e_4c96_b45d_15062e87bf39(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_0_70d53e11_bab4_475b_9d90_1e2309d73fda(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_70d53e11_bab4_475b_9d90_1e2309d73fda(arr2, arr1, k);
        }
        int a = Math.min(k / 2, arr1.size());
        int b = k - a;
        if (arr1.get(a - 1) < arr2.get(b - 1)) {
            return findKth_Problem_0_70d53e11_bab4_475b_9d90_1e2309d73fda(new ArrayList<Integer>(arr1.subList(a, arr1.size())), arr2, k - a);
        } else if (arr1.get(a - 1) > arr2.get(b - 1)) {
            return findKth_Problem_0_70d53e11_bab4_475b_9d90_1e2309d73fda(arr1, new ArrayList<Integer>(arr2.subList(b, arr2.size())), k - b);
        } else {
            return arr1.get(a - 1);
        }
    }

    
    public static int findKth_Problem_1_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (arr1.get(mid1) <= arr2.get(mid2)) {
            if (k <= mid1 + mid2 + 1) {
                return findKth_Problem_1_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            }
        } else {
            if (k <= mid1 + mid2 + 1) {
                return findKth_Problem_1_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            } else {
                return findKth_Problem_1_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        }
    }

    
    public static int findKth_Problem_1_ea01bcdf_1cbc_4ff8_bb60_4a3a146d99db(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        //write your code here
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.size(); i++) {
            sum += arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            sum1 += arr2.get(i);
        }
        int max1 = sum1 / k;
        int max2 = sum2 / k;
        int max = (sum1 + sum2) / 2;
        if (max1 < max2) {
            return max1;
        } else if (max2 < max1) {
            return max2;
        } else if (max1 == max2) {
            if (sum == max) {
                return max;
            } else {
                return max1;
            }
        } else {
            return max1;
        }

    }

    
    public static int findKth_Problem_0_3a1fbb5b_9b07_4a91_a320_426fcfd3ce5c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else {
                    j++;
                }
            } else if (i < arr1.size()) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i < arr1.size() && j < arr2.size()) {
            return Math.min(arr1.get(i), arr2.get(j));
        } else if (i < arr1.size()) {
            return arr1.get(i);
        } else {
            return arr2.get(j);
        }
    }

    
    public static int findKth_Problem_0_a9811eb7_5c85_4030_a378_98da5e9dba77(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get( (j + k - 1));
            }
            if (j >= arr2.size()) {
                return arr1.get( (i + k - 1));
            }
            if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get( (j + k - 1));
        }
        if (j >= arr2.size()) {
            return arr1.get( (i + k - 1));
        }
        return Math.min(arr1.get( i), arr2.get( j));
    }

    
    public static int findKth_Problem_1_3715de52_a3ed_4a99_a813_acbed3f97068(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_3715de52_a3ed_4a99_a813_acbed3f97068(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_3715de52_a3ed_4a99_a813_acbed3f97068(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_3715de52_a3ed_4a99_a813_acbed3f97068(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_3715de52_a3ed_4a99_a813_acbed3f97068(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_cb099428_1c24_466a_9907_6677fd1cd20c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k <= 0) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_cb099428_1c24_466a_9907_6677fd1cd20c(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_cb099428_1c24_466a_9907_6677fd1cd20c(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_6912dae3_b507_48c1_aa0d_7c1520a93c09(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k-1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k-1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size())-1);
        int mid2 = arr2.get(Math.min(k/2, arr2.size())-1);
        if (mid1 < mid2) {
            return findKth_Problem_0_6912dae3_b507_48c1_aa0d_7c1520a93c09(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_0_6912dae3_b507_48c1_aa0d_7c1520a93c09(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_a1a1120b_29e9_46a6_af96_1bd65daf6597(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_a1a1120b_29e9_46a6_af96_1bd65daf6597(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_a1a1120b_29e9_46a6_af96_1bd65daf6597(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_a1a1120b_29e9_46a6_af96_1bd65daf6597(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_a1a1120b_29e9_46a6_af96_1bd65daf6597(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_0f2a5347_bb83_4a02_8f07_d9504bd41cc5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int res = 0;
        for (int i = 0; i < arr2.size(); i++) {
            if (arr1.size() - k + 1 >= arr2.get(i)) {
                if (arr1.get(i) < arr2.get(i)) {
                    res = arr2.get(i);
                    break;
                } else if (arr1.get(i) > arr2.get(i)) {
                    res = arr1.get(i);
                    break;
                } else if (arr1.get(i) == arr2.get(i)) {
                    res = arr1.get(i);
                    break;
                }
            }
        }
        return res;
    }

    
    public static int findKth_Problem_0_30fad773_f5ce_462e_b24e_f5a778552c88(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k-1);
        if (arr2.size() == 0) return arr1.get(k-1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        if (arr1.size() > arr2.size()) return findKth_Problem_0_30fad773_f5ce_462e_b24e_f5a778552c88(arr2, arr1, k);
        int i = Math.min(k/2, arr1.size());
        int j = k - i;
        if (arr1.get(i-1) < arr2.get(j-1)) {
            ArrayList<Integer> arr = new ArrayList<Integer>(arr1.subList(i, arr1.size()));
            return findKth_Problem_0_30fad773_f5ce_462e_b24e_f5a778552c88(arr, arr2, k-i);
        }
        else if (arr1.get(i-1) > arr2.get(j-1)) {
            ArrayList<Integer> arr = new ArrayList<Integer>(arr2.subList(j, arr2.size()));
            return findKth_Problem_0_30fad773_f5ce_462e_b24e_f5a778552c88(arr1, arr, k-j);
        }
        else return arr1.get(i-1);
    }

    
    public static int findKth_Problem_1_90774b42_77d6_4c5a_b8f0_b7676dbdbb8b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get( j);
        } else if (j >= arr2.size()) {
            return arr1.get( i);
        } else {
            return Math.min(arr1.get( i), arr2.get( j));
        }
    }

    
    public static int findKth_Problem_0_da9a6695_c586_4bb7_b866_fa150a4be9c0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_da9a6695_c586_4bb7_b866_fa150a4be9c0(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_da9a6695_c586_4bb7_b866_fa150a4be9c0(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_da9a6695_c586_4bb7_b866_fa150a4be9c0(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_da9a6695_c586_4bb7_b866_fa150a4be9c0(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_a8f93177_c9d8_499d_997d_366ef7c6c631(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_0d162a35_b79b_4961_82bf_4c9b7f406381(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n > m) {
            return findKth_Problem_2_0d162a35_b79b_4961_82bf_4c9b7f406381(arr2, arr1, k);
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            return findKth_Problem_2_0d162a35_b79b_4961_82bf_4c9b7f406381(arr1, new ArrayList<Integer>(arr2.subList( j,  m)), k - j);
        } else {
            return findKth_Problem_2_0d162a35_b79b_4961_82bf_4c9b7f406381(new ArrayList<Integer>(arr1.subList( i,  n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_9156d909_0f94_4fee_9fe8_0e14c93733f2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int startIndex = 0;
        int endIndex = arr2.size() - 1;

        int mid = arr1.size() / 2;

        while (startIndex < endIndex) {
            while (startIndex < mid) {
                if (arr1.get(startIndex) < arr2.get(endIndex)) {
                    endIndex--;
                } else {
                    startIndex++;
                }
            }

            while (endIndex > mid) {
                if (arr1.get(startIndex) > arr2.get(endIndex)) {
                    startIndex++;
                } else {
                    endIndex--;
                }
            }

            if (endIndex - startIndex == k) {
                return arr1.get(startIndex);
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_0_9156d909_0f94_4fee_9fe8_0e14c93733f2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int startIndex = 0;
        int endIndex = arr2.size() - 1;

        int mid = arr1.size() / 2;

        while (startIndex < endIndex) {
            while (startIndex < mid) {
                if (arr1.get(startIndex) < arr2.get(endIndex)) {
                    endIndex--;
                } else {
                    startIndex++;
                }
            }

            while (endIndex > mid) {
                if (arr1.get(startIndex) > arr2.get(endIndex)) {
                    startIndex++;
                } else {
                    endIndex--;
                }
            }

            if (endIndex - startIndex == k) {
                return arr1.get(startIndex);
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_1_a6339143_f507_43f0_b684_acedf537b407(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int sum = 0; //sum of all elements
        int index = 0;
        for(int i = 0; i < arr1.size(); i++) {
            sum += arr1.get(i);
            if(sum > k) {
                index = i; //index where sum will be greater than k
            }
        }
        
        sum = 0;
        for(int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
            if(sum > k) {
                index = i; //index where sum will be greater than k
            }
        }
        
        
        
        
        return arr1.get(index); //return kth element from the array list
    }

    
    public static int findKth_Problem_1_1a4e3afe_cd60_4060_9477_622b47098ccf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(arr1.size() == 0) return arr2.get(k);
        if(arr2.size() == 0) return arr1.get(k);
        if(k == 0) return Math.min(arr1.get(0), arr2.get(0));
        int i = Math.min(arr1.size()-1, k/2);
        int j = Math.min(arr2.size()-1, k/2);
        if(arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_1_1a4e3afe_cd60_4060_9477_622b47098ccf(arr1, new ArrayList<Integer>(arr2.subList(j+1, arr2.size())), k-j-1);
        } else {
            return findKth_Problem_1_1a4e3afe_cd60_4060_9477_622b47098ccf(new ArrayList<Integer>(arr1.subList(i+1, arr1.size())), arr2, k-i-1);
        }
    }

    
    public static int findKth_Problem_2_4afe2e96_ad68_46d5_a8fb_5b3d766d4de1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int kth = 0;
        int prev = -99999999;
        for (int i = 0; i < arr1.size(); i++) {
            if (prev <= arr1.get(i)) {
                kth = arr1.get(i);
            }
            prev = arr2.get(i);
        }
        return kth;
    }

    
    public static int findKth_Problem_2_a8f93177_c9d8_499d_997d_366ef7c6c631(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_9b269922_6b6f_418e_a27b_0a805e4d6645(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get(0);
        int b = arr2.get(0);
        if (a < b) {
            arr1.remove(0);
        } else {
            arr2.remove(0);
        }
        return findKth_Problem_1_9b269922_6b6f_418e_a27b_0a805e4d6645(arr1, arr2, k - 1);
    }

    
    public static int findKth_Problem_2_90162c15_5ddc_4934_992b_3fd558310b63(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0 || k > arr1.size() || arr2.size() == 0 || arr2.size() < k) {
            return -1;
        }
        int firstElem = arr1.get(0);
        int secondElem = arr2.get(0);
        int diff = secondElem - firstElem;
        if (diff > arr1.get(arr1.size() - 1)) {
            secondElem = arr1.get(arr1.size() - 1);
            diff = secondElem - firstElem;
        }
        int index = -1;
        if (diff == 0) {
            int count = 0;
            for (int i = 0; i < arr2.size(); i++) {
                if (secondElem == arr2.get(i)) {
                    count++;
                    if (count == k) {
                        index = i;
                        return firstElem + (index - index / 2);
                    }
                }
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_0_f1cd36f9_1c4c_4f47_bc5e_430399abd47e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_c1fe38b7_7e78_4364_9dda_16c243919f55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (i + j + 1 == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                if (i + j + 1 == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        if (i < arr1.size()) {
            return arr1.get( (k - j - 1));
        }
        return arr2.get( (k - i - 1));
    }

    
    public static int findKth_Problem_1_775e622c_fb0f_4970_80f8_f2a5cf86446e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(k/2, arr1.size() - 1);
        int j = Math.min(k/2, arr2.size() - 1);
        if (arr1.get(i) < arr2.get(j)) {
            return findKth_Problem_1_775e622c_fb0f_4970_80f8_f2a5cf86446e(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        } else {
            return findKth_Problem_1_775e622c_fb0f_4970_80f8_f2a5cf86446e(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        }
    }

    
    public static int findKth_Problem_2_69da18ed_b330_4f12_89b1_0f672d3ac3a9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = arr2.size() - 1;
        while (i < j) {
            if (arr2.get(i) > arr2.get(j)) {
                int temp = arr1.get(i);
                arr1.set(i++, arr2.get(j));
                arr2.set(j--, temp);
            }
            else {
                i++;
            }
        }
        return arr1.get(j);
    }

    
    public static int findKth_Problem_0_2431c364_9afd_4967_bb24_eec16df905b9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write - Your - Code
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            if (k == 1) {
                return kth;
            }
            k--;
        }
        while (i < arr1.size()) {
            kth = arr1.get(i);
            i++;
            if (k == 1) {
                return kth;
            }
            k--;
        }
        while (j < arr2.size()) {
            kth = arr2.get(j);
            j++;
            if (k == 1) {
                return kth;
            }
            k--;
        }
        return kth;
    }

    
    public static int findKth_Problem_1_de46f19a_e569_4307_9c14_c8aa48d10d68(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k >= arr2.size()) {
            return arr1.get(arr2.size() - 1);
        }
        if (k <= 0) {
            return arr1.get(0);
        }
        int low = 0;
        int high = arr2.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (k < arr2.get(mid)) {
                low = mid + 1;
            } else if (k > arr2.get(mid)) {
                high = mid - 1;
            } else {
                return arr1.get(mid);
            }
        }
        return arr1.get(low);
    }

    
    public static int findKth_Problem_1_ef3fa9f4_5f02_4307_9179_5887c4b3c796(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        while (i < n && j < m && k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i == n) {
            return arr2.get( (k - 1));
        } else if (j == m) {
            return arr1.get( (k - 1));
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_0_127bd87b_f865_491b_b073_9d121e70da97(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            count++;
            if (count == k) {
                break;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else {
            return arr1.get(i);
        }
    }

    
    public static int findKth_Problem_0_b9ce77c2_98c3_45d5_bed9_843848331904(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int curr = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                curr = arr1.get(i);
                i++;
            } else {
                curr = arr2.get(j);
                j++;
            }
            if (i + j == k) {
                return curr;
            }
        }
        while (i < arr1.size()) {
            curr = arr1.get(i);
            i++;
            if (i + j == k) {
                return curr;
            }
        }
        while (j < arr2.size()) {
            curr = arr2.get(j);
            j++;
            if (i + j == k) {
                return curr;
            }
        }
        return curr;
    }

    
    public static int findKth_Problem_2_ce0cd714_dc21_471a_b29d_a47b053abdc3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (n == 0) {
            return arr2.get(k - 1);
        }
        if (m == 0) {
            return arr1.get(k - 1);
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_2_ce0cd714_dc21_471a_b29d_a47b053abdc3(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_2_ce0cd714_dc21_471a_b29d_a47b053abdc3(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_d181ce19_34ec_4785_9fee_23b31cce6d78(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get( i) < arr2.get( j)) {
                    i++;
                } else {
                    j++;
                }
            } else if (i < arr1.size()) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i < arr1.size() && j < arr2.size()) {
            return Math.min(arr1.get( i), arr2.get( j));
        } else if (i < arr1.size()) {
            return arr1.get( i);
        } else {
            return arr2.get( j);
        }
    }

    
    public static int findKth_Problem_2_b60d5887_2794_46c1_b3b0_68bc861ef826(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_802799ee_27a3_4c6f_945e_a8cf842fe256(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // low is the first element of arr1
        int high = arr1.get(arr1.size() - 1); // high is the last element of arr1
        int mid = low + (high - low) / 2; // mid is mid element of arr1
        int mid1 = arr2.get(0); // mid1 is the first element of arr2
        int mid2 = arr2.get(arr2.size() - 1); // mid2 is the last element of arr2
        while (k >= mid) {
            if (k < mid) {
                if (mid2 > mid) { // if mid2 is greater than mid
                    high = mid;
                } else {
                    low = mid;
                    mid = low + (high - low) / 2; // mid is mid element of arr1
                }
            } else if (k > mid) {
                if (mid1 > mid) { // if mid1 is greater than mid
                    low = mid;
                } else {
                    high = mid;
                    mid = low + (high - low) / 2; // mid is mid element of arr1
                }
            } else {
                return mid1;
            }
        }
        return mid2;
    }

    
    public static int findKth_Problem_1_03ca634e_d177_46d5_9d34_e6f28b5a3de2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size() - 1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size() - 1));
        if (mid1 < mid2) {
            return findKth_Problem_1_03ca634e_d177_46d5_9d34_e6f28b5a3de2(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size() - 1), arr1.size())), arr2, k - Math.min(k/2, arr1.size() - 1));
        } else {
            return findKth_Problem_1_03ca634e_d177_46d5_9d34_e6f28b5a3de2(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size() - 1), arr2.size())), k - Math.min(k/2, arr2.size() - 1));
        }
    }

    
    public static int findKth_Problem_1_6f313497_4df7_4ff0_ad55_bf394a57c16a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int middleElement1 = arr1.get(arr1.size()/2);
        int middleElement2 = arr2.get(arr2.size()/2);
        if (k == 0) return 0;
        if (k == 1) return middleElement1;
        if (k > 1 && k <= arr1.size()) 
            return middleElement1 + (k-1) * findKth_Problem_1_6f313497_4df7_4ff0_ad55_bf394a57c16a(arr1, arr2, k/2);
        else 
            return findKth_Problem_1_6f313497_4df7_4ff0_ad55_bf394a57c16a(arr1, arr2, k/2);
    }

    
    public static int findKth_Problem_2_eedce435_992f_4e14_a5a3_c5827da7c08b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1 == null || arr2 == null) {
            return -1;
        }
        int len = arr1.size() + arr2.size();
        int firstValue = arr1.get(0); // take the first element from arr1
        int secondValue = arr2.get(0); // take the first element from arr2
        int count = 0;
        // iterate over arr1 and arr2
        for (int i = 0; i <= len; i++) {
            int sum = firstValue + secondValue;
            // check if sum is greater or equal to k
            if (sum >= k) {
                // if sum is greater or equal to k, then increase count
                count += 1;
                firstValue = firstValue + arr1.get(i - count);
                secondValue = secondValue + arr2.get(i - count);
                // if sum is not equal to k, then reset count and take the first element from arr1
            } else {
                firstValue = firstValue + arr1.get(i - 1);
                secondValue = secondValue + arr2.get(i - 1);
            }
        }
        return count + 1;
    }

    
    public static int findKth_Problem_0_8896c322_c3a6_4638_ab4b_0d3956f534ff(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(arr1.size()==0 || arr2.size()==0)
            return -1L;

        int l1 = arr1.get(arr1.size()-1);
        int l2 = arr2.get(arr2.size()-1);
        if(k==1)
        {
            if(l1>l2)
                return l1; // if k is 1 then find first element from both array
            else if(l1>l2)
                return l2; // if k is 1 then find first element from both array
            else
                return -1L; // if k is 1 then find first element from both array
        }

        if(k>1 && k%2==0)
        {
            int temp = findKth_Problem_0_8896c322_c3a6_4638_ab4b_0d3956f534ff(arr1, arr2, k/2);
            if(temp==-1L)
                return -1L;
            else if(temp>l1 && temp>l2)
                return temp;
            else if(temp>l1)
                return l1;
            else
                return l2;
        }
        else if(k>1 && k%2!=0)
        {
            int temp = findKth_Problem_0_8896c322_c3a6_4638_ab4b_0d3956f534ff(arr2, arr1, k/2);
            if(temp==-1L)
                return -1L;
            else if(temp>l1 && temp>l2)
                return temp;
            else if(temp>l1)
                return l1;
            else
                return l2;
        }
        else
        {
            if(arr1.size()==1 && arr2.size()==1)
            {
                if(l1==l2)
                    return l1;
                else
                    return l2;
            }
            else
            {
                for(int i=arr1.size()-1;i>=0;i--)
                {
                    int c1 = arr1.get(i);
                    for(int j=arr2.size()-1;j>=0;j--)
                    {
                        int c2 = arr2.get(j);
                        if(c1>c2)
                        {
                            result.add(c1);
                            result.add(c2);
                            if(i==arr1.size()-1 && j==arr2.size()-1)
                            {
                                return result.get(result.size()-1);
                            }
                        }
                        else if(c1<c2)
                        {
                            result.add(c2);
                            result.add(c1);
                            if(i==arr1.size()-1 && j==arr2.size()-1)
                            {
                                return result.get(result.size()-1);
                            }
                        }
                    }
                }
                return -1L;
            }
        }
    }

    
    public static int findKth_Problem_2_09b007d3_8559_4859_bec2_722e7f6abc53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_4cf5de56_337a_4e4a_8982_466ca0c14b53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_1_1fcf2901_d4f7_471b_8dd1_77c5ffdab3b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        int min1 = arr1.get(arr1.size()-1);
        int min2 = arr2.get(arr2.size()-1);
        int i = 0;
        int next1 = 0;
        int next2 = 0;
        int min = 0;
        while (i < arr1.size() - 1) {
            next1 = min1 + arr1.get(i+1);
            next2 = min2 + arr2.get(i+1);
            min = next1;
            if (next1 < next2) {
                min = Math.min(next1, next2);
            }
            if (min == k) {
                arr3.add(min);
            }
            i++;
        }
        int ans = arr3.get(arr3.size()-1);
        return ans;
    }

    
    public static int findKth_Problem_2_94fe36dc_c134_4a40_ae3e_ef9120865668(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_94fe36dc_c134_4a40_ae3e_ef9120865668(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_94fe36dc_c134_4a40_ae3e_ef9120865668(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_94fe36dc_c134_4a40_ae3e_ef9120865668(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_94fe36dc_c134_4a40_ae3e_ef9120865668(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_4577ad26_3076_4712_8ba4_153048038039(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() + arr2.size() < k) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_4577ad26_3076_4712_8ba4_153048038039(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_4577ad26_3076_4712_8ba4_153048038039(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_1_cc7b57f6_7c77_4f42_9858_e5a313d8157d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            if (i + j == k) {
                break;
            }
        }
        if (i == arr1.size()) {
            while (j < arr2.size()) {
                kth = arr2.get(j);
                j++;
                if (i + j == k) {
                    break;
                }
            }
        } else if (j == arr2.size()) {
            while (i < arr1.size()) {
                kth = arr1.get(i);
                i++;
                if (i + j == k) {
                    break;
                }
            }
        }
        return kth;
    }

    
    public static int findKth_Problem_0_15fcd6a2_4c0a_467c_a5cc_44b6a78ec625(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get(j + k - 1);
            }
            if (j >= arr2.size()) {
                return arr1.get(i + k - 1);
            }
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_1_6453d333_eb81_46fd_8c16_918c252bbd24(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get( k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get( k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_6453d333_eb81_46fd_8c16_918c252bbd24(new ArrayList<Integer>(arr1.subList( k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_6453d333_eb81_46fd_8c16_918c252bbd24(arr1, new ArrayList<Integer>(arr2.subList( k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_1_641476ec_1b4b_48e7_a502_1cbfcbec3ab9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here.
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_51f89652_1826_422c_a27a_2ed5702048e6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        int i =  Math.min(k / 2, n);
        int j =  Math.min(k / 2, m);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_2_51f89652_1826_422c_a27a_2ed5702048e6(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_2_51f89652_1826_422c_a27a_2ed5702048e6(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_a395eb8b_b7a2_4b8a_a6ec_39c8a381e357(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_b55809cf_b6b3_47da_ac2a_3e3cf5f16b53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else {
                    j++;
                }
            } else if (i < arr1.size()) {
                i++;
            } else if (j < arr2.size()) {
                j++;
            }
            k--;
        }
        if (i < arr1.size() && j < arr2.size()) {
            return Math.min(arr1.get(i), arr2.get(j));
        } else if (i < arr1.size()) {
            return arr1.get(i);
        } else if (j < arr2.size()) {
            return arr2.get(j);
        }
        return -1;
    }

    
    public static int findKth_Problem_0_caeaa497_d132_4e87_956f_28dadf449112(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int min = arr1.get(0);
        int max = arr2.get(0);
        int result = min + max;

        if (result == k) {
            return min;
        } else if (result > k) {
            min = arr1.get(1);
            max = arr2.get(1);
            result = min + max;

            if (result == k) {
                return min;
            } else if (result > k) {
                min = arr1.get(2);
                max = arr2.get(2);
                result = min + max;

                if (result == k) {
                    return min;
                }
            }
        }
        return max;
    }

    
    public static int findKth_Problem_1_25fe0547_3a3b_40e6_b8ee_6f57610960f7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get(j);
        } else if (j >= arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_1_fda6408e_da5d_43d2_bb20_c7e587d09a06(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(k == 0 || k > arr1.size()) {
            throw new IllegalArgumentException("Invalid value for k");
        }
        if(k > arr2.size()) {
            throw new IllegalArgumentException("Invalid value for k");
        }
        if(arr1 == null || arr2 == null || arr1.size() == 0 || arr2.size() == 0) {
            throw new IllegalArgumentException("Array lists are empty");
        }

        int lower = Math.min(arr1.get(0), arr2.get(0));
        int upper = Math.max(arr1.get(arr1.size()-1), arr2.get(arr2.size()-1));
        int middle = (lower + upper) / 2;
        int i = 0;
        while(i == 0 && k < arr1.size()) {
            if(arr1.get(i) == middle || arr2.get(i) == middle) {
                k++;
            }
            else {
                i++;
            }
        }
        while(i < arr1.size() && k == arr1.size()) {
            if(arr1.get(i) == middle) {
                k++;
            }
            else {
                i++;
            }
        }
        while(i < arr2.size() && k == arr2.size()) {
            if(arr2.get(i) == middle) {
                k++;
            }
            else {
                i++;
            }
        }
        if(k > arr1.size()) {
            k = arr1.size();
        }
        if(k > arr2.size()) {
            k = arr2.size();
        }
        return middle;
    }

    
    public static int findKth_Problem_1_a395eb8b_b7a2_4b8a_a6ec_39c8a381e357(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_bb2ba83b_7b1f_4491_885e_3a2364276615(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        //Code Here
        if (arr1 == null || arr1.isEmpty() || arr2 == null || arr2.isEmpty()) {
            return 0;
        }
        int low = 0;
        int high = arr1.size();
        if (k <= high) {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mid == k) {
                    return arr1.get(mid);
                }
                else if (mid > k) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        else {
            return 0;
        }
        return 0;
    }

    
    public static int findKth_Problem_2_5fff58d2_6c92_422e_9f4f_f6229a561786(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_5fff58d2_6c92_422e_9f4f_f6229a561786(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_5fff58d2_6c92_422e_9f4f_f6229a561786(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_5fff58d2_6c92_422e_9f4f_f6229a561786(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_5fff58d2_6c92_422e_9f4f_f6229a561786(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_3715de52_a3ed_4a99_a813_acbed3f97068(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_3715de52_a3ed_4a99_a813_acbed3f97068(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_3715de52_a3ed_4a99_a813_acbed3f97068(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_3715de52_a3ed_4a99_a813_acbed3f97068(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_3715de52_a3ed_4a99_a813_acbed3f97068(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_eedce435_992f_4e14_a5a3_c5827da7c08b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1 == null || arr2 == null) {
            return -1;
        }
        int len = arr1.size() + arr2.size();
        int firstValue = arr1.get(0); // take the first element from arr1
        int secondValue = arr2.get(0); // take the first element from arr2
        int count = 0;
        // iterate over arr1 and arr2
        for (int i = 0; i <= len; i++) {
            int sum = firstValue + secondValue;
            // check if sum is greater or equal to k
            if (sum >= k) {
                // if sum is greater or equal to k, then increase count
                count += 1;
                firstValue = firstValue + arr1.get(i - count);
                secondValue = secondValue + arr2.get(i - count);
                // if sum is not equal to k, then reset count and take the first element from arr1
            } else {
                firstValue = firstValue + arr1.get(i - 1);
                secondValue = secondValue + arr2.get(i - 1);
            }
        }
        return count + 1;
    }

    
    public static int findKth_Problem_0_3659b97a_ba68_4d3a_9da5_568aac42a2af(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, arr1.size());
        int j =  Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_0_3659b97a_ba68_4d3a_9da5_568aac42a2af(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_0_3659b97a_ba68_4d3a_9da5_568aac42a2af(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_2_39082eda_6159_4576_b69f_d690e6115fbc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int ans = arr1.get(0);
        int sum = 0;
        int i=1;
        // System.out.println("arr1 " + arr1.get(0));
        // System.out.println("arr2 " + arr2.get(0));
        int max1 = arr1.get(i);
        int max2 = arr2.get(i);

        while(i < arr1.size()) {
            int mid1 = sum + max1;
            int mid2 = sum + max2;

            sum = mid1 + mid2;

            if((sum == k) || (sum == k-1)) {
                return ans;
            }
            else if(sum > k) {
                max2 = max1;
                max1 = arr1.get(i);
                i++;
            }
            else {
                max1 = max2;
                max2 = arr2.get(i);
                i++;
            }
        }
        return ans;
    }

    
    public static int findKth_Problem_2_9c9b3743_b5da_4b8a_b503_768caec9a8c0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_9c9b3743_b5da_4b8a_b503_768caec9a8c0(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_9c9b3743_b5da_4b8a_b503_768caec9a8c0(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_aaa7417a_dc05_4d2c_bcc0_a77211847bad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int kth = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    kth = arr1.get(i);
                    i++;
                } else {
                    kth = arr2.get(j);
                    j++;
                }
            } else if (i < arr1.size()) {
                kth = arr1.get(i);
                i++;
            } else if (j < arr2.size()) {
                kth = arr2.get(j);
                j++;
            }
            k--;
        }
        return kth;
    }

    
    public static int findKth_Problem_0_ece4ee1f_4a6c_405a_b6ac_59cd4d8682c6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_ece4ee1f_4a6c_405a_b6ac_59cd4d8682c6(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_ece4ee1f_4a6c_405a_b6ac_59cd4d8682c6(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_3659b97a_ba68_4d3a_9da5_568aac42a2af(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, arr1.size());
        int j =  Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_2_3659b97a_ba68_4d3a_9da5_568aac42a2af(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_2_3659b97a_ba68_4d3a_9da5_568aac42a2af(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_0_72b1f688_b079_4e88_a576_9a2c7c140be6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_0_72b1f688_b079_4e88_a576_9a2c7c140be6(new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_0_72b1f688_b079_4e88_a576_9a2c7c140be6(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_ab877506_9953_4142_ab16_6d6c575b49d5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()-1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size()-1));
        if (mid1 < mid2) {
            return findKth_Problem_2_ab877506_9953_4142_ab16_6d6c575b49d5(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()-1), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_2_ab877506_9953_4142_ab16_6d6c575b49d5(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()-1), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_46e9583e_9a09_45fa_a6ad_3a7c667e5aed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int l1 = arr1.size();
        int l2 = arr2.size();
        if(l1 > l2)
        {
            k = arr2.size() - k;
            l2 = l1;
        }
        int res = 0;
        int i = 1;
        int j = 0;
        while(j < k)
        {
            if(arr1.get(i) <= arr2.get(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return res;
    }

    
    public static int findKth_Problem_2_4cf5de56_337a_4e4a_8982_466ca0c14b53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_2_6e5227ad_2f25_4cf1_8c8b_ab9c0ec21646(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_f53da2fd_553f_435c_a723_2b12f193853b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int size1 = arr1.size();
        int size2 = arr2.size();
        int result = 0;
        while (i < size1 && j < size2) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
                if (k == 1) {
                    result = arr1.get(i);
                    break;
                } else {
                    k--;
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_1_0189e747_0948_4284_8f75_d796162879bc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get(j);
        } else if (j >= arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_0_c051a651_105e_448d_b171_846d973fd033(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int res = -1;
        if (k == arr1.size()) return arr2.get(0);
        if (k == arr2.size()) return arr1.get(0);
        int i = 0;
        while (arr1.size() > 0 && arr2.size() > 0 && i < k) {
            if (arr1.get(arr1.size() - 1) <= arr2.get(arr2.size() - 1)) {
                if (res == -1) return arr1.get(arr1.size() - 1);
                else
                    res = arr1.get(arr1.size() - 1);
                arr1.remove(arr1.size() - 1);
            } else {
                if (res == -1) return arr2.get(arr2.size() - 1);
                else
                    res = arr2.get(arr2.size() - 1);
                arr2.remove(arr2.size() - 1);
            }
            i++;
        }
        return res;
    }

    
    public static int findKth_Problem_0_55cfdeb9_5036_4ff0_a463_dbf873c93770(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.get(n - 1) < arr2.get(0)) {
            return arr1.get( k - 1);
        }
        if (arr2.get(m - 1) < arr1.get(0)) {
            return arr2.get( k - 1);
        }
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (k == 1) {
                    return arr1.get(i);
                }
                i++;
                k--;
            } else {
                if (k == 1) {
                    return arr2.get(j);
                }
                j++;
                k--;
            }
        }
        if (i < n) {
            return arr1.get( k - 1);
        }
        if (j < m) {
            return arr2.get( k - 1);
        }
        return -1;
    }

    
    public static int findKth_Problem_2_fcca2229_11db_48c6_ae97_085fc55ff4eb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_a7ef273f_8f7d_455b_b2f6_11cb9ef4a8f3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_2_a7ef273f_8f7d_455b_b2f6_11cb9ef4a8f3(new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_2_a7ef273f_8f7d_455b_b2f6_11cb9ef4a8f3(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_9afd64b9_7534_4516_b475_bf1b758082f2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid2 + 1; i < arr2.size(); i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_0_9afd64b9_7534_4516_b475_bf1b758082f2(arr1, newArr, k - mid2 - 1);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid1 + 1; i < arr1.size(); i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_0_9afd64b9_7534_4516_b475_bf1b758082f2(newArr, arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid2; i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_0_9afd64b9_7534_4516_b475_bf1b758082f2(arr1, newArr, k);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid1; i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_0_9afd64b9_7534_4516_b475_bf1b758082f2(newArr, arr2, k);
            }
        }
    }

    
    public static int findKth_Problem_0_0a57ce50_632d_45b9_915c_89e2bc1b46d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1 == null || arr2 == null) {
            System.out.println("Null ArrayLists");
            return 0;
        }
        if (arr1.size() < arr2.size()) {
            System.out.println("ArrayList 1 size is smaller than ArrayList 2");
            return 0;
        }
        int low = 0;
        int high = arr1.size() - 1;
        int mid = 0;
        int mid2 = 0;
        int res = 0;
        int flag = 0;
        if (arr1.size() < 3) {
            if (arr1.size() < arr2.size()) {
                System.out.println("ArrayList 1 size is smaller than ArrayList 2");
                return 0;
            }
        } else if (arr1.size() > arr2.size()) {
            System.out.println("ArrayList 1 size is greater than ArrayList 2");
            return 0;
        }
        while (high >= low) {
            mid = (low + high) / 2;
            mid2 =  (arr1.get(mid) * (arr2.get(mid) / arr1.get(mid)));
            if (mid2 == k)
                return arr1.get(mid);
            if (mid2 > k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("Element not found");
        return 0;
    }

    
    public static int findKth_Problem_0_b1e6eccb_bdad_41ec_8cb1_4681c2b5e009(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) <= arr2.get( j)) {
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get( i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get( j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_b24c9d76_74f8_4c05_86be_adab2bbbc045(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k/2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_2_b24c9d76_74f8_4c05_86be_adab2bbbc045(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_2_b24c9d76_74f8_4c05_86be_adab2bbbc045(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_1_4f6a2610_9528_4a12_910c_8a521aa70ac5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int min = arr1.get(0); // initialize min with first element
        int max = arr2.get(0); // initialize max with first element

        for(int i = 1; i < arr1.size(); i++) { // start from index 1
            if(arr1.get(i) < min) {
                min = arr1.get(i);
            }
            else if(arr1.get(i) > max) {
                max = arr2.get(i);
            }
        }
        int mid = (min + max) / 2; // find the mid point
        
        int pos = -1;
        int j = 0;
        for(int i = 0; i < arr2.size(); i++) {
            int temp = arr2.get(i);
            int cmp = arr1.get(i);
            if (cmp >= mid) { // when current element is greater than mid point
                j++;
                if (j == k) {
                    pos = temp;
                }
            }
        }
        return pos;
    }

    
    public static int findKth_Problem_1_3609a228_ad49_4be6_a036_cc46d9ca0417(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(arr1.size(), k / 2);
        int j = Math.min(arr2.size(), k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_1_3609a228_ad49_4be6_a036_cc46d9ca0417(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        } else {
            return findKth_Problem_1_3609a228_ad49_4be6_a036_cc46d9ca0417(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_19ea1fef_f3b9_4950_9c68_6d2534cdfc55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        final int len1 = arr1.size();
        final int len2 = arr2.size();
        int ret = 0;
        for (int i = 0; i < Math.min(len1, len2); i++) {
            if (i == len1) {
                if (arr1.get(i) == arr2.get(i)) {
                    ret = arr1.get(i);
                    break;
                }
            } else if (i == len2) {
                if (arr2.get(i) == arr1.get(i)) {
                    ret = arr2.get(i);
                    break;
                }
            } else {
                if (arr1.get(i) == arr2.get(i)) {
                    ret = arr1.get(i);
                    break;
                }
            }
        }
        return ret;
    }

    
    public static int findKth_Problem_0_9a4a19c0_4bea_4079_904d_4aac50905264(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int res = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    res = arr1.get(i);
                    i++;
                } else {
                    res = arr2.get(j);
                    j++;
                }
            } else if (i < arr1.size()) {
                res = arr1.get(i);
                i++;
            } else {
                res = arr2.get(j);
                j++;
            }
            k--;
        }
        return res;
    }

    
    public static int findKth_Problem_1_ad3d5de1_1e45_476f_bc87_bfc5aa822f3e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int firstVal = arr1.get(0), secondVal = arr2.get(0), thirdVal = 0, fourthVal = 0;
        int currentVal = 0;
        while (k >= 1) {
            currentVal = firstVal + secondVal;
            if (currentVal > arr1.get(arr1.size() - 1)) {
                currentVal = arr1.get(arr1.size() - 1);
            }
            firstVal = currentVal;
            currentVal = thirdVal + fourthVal;
            if (currentVal > arr2.get(arr2.size() - 1)) {
                currentVal = arr2.get(arr2.size() - 1);
            }
            secondVal = currentVal;
            thirdVal = currentVal - firstVal;
            if (thirdVal > arr1.get(arr1.size() - 1)) {
                thirdVal = arr1.get(arr1.size() - 1);
            }
            fourthVal = currentVal - secondVal;
            if (fourthVal > arr2.get(arr2.size() - 1)) {
                fourthVal = arr2.get(arr2.size() - 1);
            }
            k--;
        }
        return currentVal;
    }

    
    public static int findKth_Problem_1_fca4657d_0b25_40d4_8ae7_20efd937f16c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_fca4657d_0b25_40d4_8ae7_20efd937f16c(arr2, arr1, k);
        }
        int a = Math.min(k / 2, arr1.size());
        int b = k - a;
        if (arr1.get( (a - 1)) < arr2.get( (b - 1))) {
            return findKth_Problem_1_fca4657d_0b25_40d4_8ae7_20efd937f16c(new ArrayList<Integer>(arr1.subList( a, arr1.size())), arr2, k - a);
        } else if (arr1.get( (a - 1)) > arr2.get( (b - 1))) {
            return findKth_Problem_1_fca4657d_0b25_40d4_8ae7_20efd937f16c(arr1, new ArrayList<Integer>(arr2.subList( b, arr2.size())), k - b);
        } else {
            return arr1.get( (a - 1));
        }
    }

    
    public static int findKth_Problem_2_9b269922_6b6f_418e_a27b_0a805e4d6645(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get(0);
        int b = arr2.get(0);
        if (a < b) {
            arr1.remove(0);
        } else {
            arr2.remove(0);
        }
        return findKth_Problem_2_9b269922_6b6f_418e_a27b_0a805e4d6645(arr1, arr2, k - 1);
    }

    
    public static int findKth_Problem_1_b15da6bc_c563_4676_9039_6ff8b8e25afc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_b15da6bc_c563_4676_9039_6ff8b8e25afc(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_b15da6bc_c563_4676_9039_6ff8b8e25afc(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_b15da6bc_c563_4676_9039_6ff8b8e25afc(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_b15da6bc_c563_4676_9039_6ff8b8e25afc(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_20e2f203_6dc8_4488_86d3_75a88b9d9c60(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (n == 0) {
            return arr2.get(k - 1);
        }
        if (m == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_1_20e2f203_6dc8_4488_86d3_75a88b9d9c60(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_1_20e2f203_6dc8_4488_86d3_75a88b9d9c60(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_5256bd27_3363_4740_aedc_2b7c6c2e1113(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < k) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            count++;
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else {
            return arr2.get(j);
        }
    }

    
    public static int findKth_Problem_2_6e46801c_4990_4ceb_a59e_910865fa6a7d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        int size = arr1.size();
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_d59bb0ed_5644_404e_83db_0fbdd0ef0916(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k);
        }
        if (arr2.size() == 0) {
            return arr1.get( k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_d59bb0ed_5644_404e_83db_0fbdd0ef0916(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_d59bb0ed_5644_404e_83db_0fbdd0ef0916(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_d59bb0ed_5644_404e_83db_0fbdd0ef0916(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_d59bb0ed_5644_404e_83db_0fbdd0ef0916(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_70d53e11_bab4_475b_9d90_1e2309d73fda(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_70d53e11_bab4_475b_9d90_1e2309d73fda(arr2, arr1, k);
        }
        int a = Math.min(k / 2, arr1.size());
        int b = k - a;
        if (arr1.get(a - 1) < arr2.get(b - 1)) {
            return findKth_Problem_1_70d53e11_bab4_475b_9d90_1e2309d73fda(new ArrayList<Integer>(arr1.subList(a, arr1.size())), arr2, k - a);
        } else if (arr1.get(a - 1) > arr2.get(b - 1)) {
            return findKth_Problem_1_70d53e11_bab4_475b_9d90_1e2309d73fda(arr1, new ArrayList<Integer>(arr2.subList(b, arr2.size())), k - b);
        } else {
            return arr1.get(a - 1);
        }
    }

    
    public static int findKth_Problem_2_76efe490_576a_421c_b5d4_27576741d7ea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        int ans = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                ans = arr1.get(i);
                i++;
            } else {
                ans = arr2.get(j);
                j++;
            }
            count++;
            if (count == k) {
                return ans;
            }
        }
        while (i < n) {
            ans = arr1.get(i);
            i++;
            count++;
            if (count == k) {
                return ans;
            }
        }
        while (j < m) {
            ans = arr2.get(j);
            j++;
            count++;
            if (count == k) {
                return ans;
            }
        }
        return ans;
    }

    
    public static int findKth_Problem_2_834083b3_66c2_4207_927c_f259068f8522(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int curr = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                curr = arr2.get(j);
                j++;
            } else if (j >= arr2.size()) {
                curr = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                curr = arr1.get(i);
                i++;
            } else {
                curr = arr2.get(j);
                j++;
            }
            k--;
        }
        return curr;
    }

    
    public static int findKth_Problem_2_8b3a5730_3bd7_48aa_ab2a_35df3d91b529(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n,  k / 2);
        int j = Math.min(m,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> newArr = new ArrayList<Integer>();
            for (int x = j; x < m; x++) {
                newArr.add(arr2.get(x));
            }
            return findKth_Problem_2_8b3a5730_3bd7_48aa_ab2a_35df3d91b529(arr1, newArr, k - j);
        } else {
            ArrayList<Integer> newArr = new ArrayList<Integer>();
            for (int x = i; x < n; x++) {
                newArr.add(arr1.get(x));
            }
            return findKth_Problem_2_8b3a5730_3bd7_48aa_ab2a_35df3d91b529(newArr, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                arr2 = new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size()));
                return findKth_Problem_0_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k - mid2 - 1);
            } else {
                arr1 = new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size()));
                return findKth_Problem_0_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                arr1 = new ArrayList<Integer>(arr1.subList(0, mid1));
                return findKth_Problem_0_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k);
            } else {
                arr2 = new ArrayList<Integer>(arr2.subList(0, mid2));
                return findKth_Problem_0_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k);
            }
        }
    }

    
    public static int findKth_Problem_0_65e30825_85c7_408e_8577_b110e16df9ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(arr1.size() - 1, k / 2 - 1);
        int j = Math.min(arr2.size() - 1, k / 2 - 1);
        if (arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_0_65e30825_85c7_408e_8577_b110e16df9ed(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        } else {
            return findKth_Problem_0_65e30825_85c7_408e_8577_b110e16df9ed(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_0_3393713e_7915_4fbe_853f_bcea56580efa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_3393713e_7915_4fbe_853f_bcea56580efa(arr2, arr1, k);
        }
        if (arr1.size() == 1) {
            if (arr2.size() == 1) {
                return Math.max(arr1.get(0), arr2.get(0));
            }
            int i = Math.min(k / 2, arr2.size() - 1);
            if (arr1.get(0) > arr2.get(i)) {
                return findKth_Problem_0_3393713e_7915_4fbe_853f_bcea56580efa(arr1, new ArrayList<Integer>(arr2.subList(i + 1, arr2.size())), k - i - 1);
            } else {
                return findKth_Problem_0_3393713e_7915_4fbe_853f_bcea56580efa(arr1, new ArrayList<Integer>(arr2.subList(0, i)), k);
            }
        }
        int i = Math.min(k / 2, arr1.size() - 1);
        if (arr1.get(i) > arr2.get(i)) {
            return findKth_Problem_0_3393713e_7915_4fbe_853f_bcea56580efa(new ArrayList<Integer>(arr1.subList(0, i)), arr2, k);
        } else {
            return findKth_Problem_0_3393713e_7915_4fbe_853f_bcea56580efa(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_2_0189e747_0948_4284_8f75_d796162879bc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get(j);
        } else if (j >= arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_2_775e622c_fb0f_4970_80f8_f2a5cf86446e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(k/2, arr1.size() - 1);
        int j = Math.min(k/2, arr2.size() - 1);
        if (arr1.get(i) < arr2.get(j)) {
            return findKth_Problem_2_775e622c_fb0f_4970_80f8_f2a5cf86446e(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        } else {
            return findKth_Problem_2_775e622c_fb0f_4970_80f8_f2a5cf86446e(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        }
    }

    
    public static int findKth_Problem_2_b15da6bc_c563_4676_9039_6ff8b8e25afc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_b15da6bc_c563_4676_9039_6ff8b8e25afc(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_b15da6bc_c563_4676_9039_6ff8b8e25afc(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_b15da6bc_c563_4676_9039_6ff8b8e25afc(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_b15da6bc_c563_4676_9039_6ff8b8e25afc(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_a0e753e2_f1ad_442f_816f_37e70c5566dc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(arr1.isEmpty()) return -1;
        if(arr2.isEmpty()) return -1;
        int l1 = arr1.get(0), l2 = arr2.get(0);
        int curr = l1-l2;
        int prevVal;
        while(k > curr) {
            prevVal = arr1.get(arr1.size()-1);
            arr1.remove(prevVal);
            arr2.remove(prevVal);
            curr -= prevVal;
            k -= prevVal;
        }
        return arr2.get(arr2.size()-1);
    }

    
    public static int findKth_Problem_1_cfeb2334_ce6a_4927_a547_d3a1c99beff7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int n = arr1.size(), m = arr2.size();
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (i + j + 1 == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                if (i + j + 1 == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        if (i < n) {
            return arr1.get((k - m - 1));
        }
        return arr2.get((k - n - 1));
    }

    
    public static int findKth_Problem_1_3986b35d_864c_4ae3_a2ef_d56fcb34cbea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        // Return the kth element from the two sorted arrays arr1 and arr2.
        // arr1 and arr2 can have different sizes.
        // k starts from 1.
        // If k is larger than the combined size of the two arrays, return -1.
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            k--;
            if (k == 0) {
                return kth;
            }
        }
        while (i < arr1.size()) {
            kth = arr1.get(i);
            i++;
            k--;
            if (k == 0) {
                return kth;
            }
        }
        while (j < arr2.size()) {
            kth = arr2.get(j);
            j++;
            k--;
            if (k == 0) {
                return kth;
            }
        }
        return kth;
    }

    
    public static int findKth_Problem_0_69da18ed_b330_4f12_89b1_0f672d3ac3a9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = arr2.size() - 1;
        while (i < j) {
            if (arr2.get(i) > arr2.get(j)) {
                int temp = arr1.get(i);
                arr1.set(i++, arr2.get(j));
                arr2.set(j--, temp);
            }
            else {
                i++;
            }
        }
        return arr1.get(j);
    }

    
    public static int findKth_Problem_0_b41755da_db68_4eb2_afde_5e8174db2ce8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

}
