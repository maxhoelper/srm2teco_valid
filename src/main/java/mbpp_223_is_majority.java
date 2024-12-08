package mbpp_223_is_majority;

public class mbpp_223_is_majority {

    
    public static boolean isMajority_Problem_1_183d25b2_2a21_4bfc_8770_232a05103496(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_cf903859_0930_41b5_a607_d851deb88ec8(ArrayList<Integer> arr, int n, int x) {
        boolean flag = False;
        int k = 0;
        for(int i = 0; i<arr.size(); i++)
        {
            int count = 0;
            int current = arr.get(i);
            if(current == x)
            {
                count++;
            }
            for(int j = 0; j<arr.size(); j++)
            {
                if(arr.get(j) == current)
                {
                    count++;
                }
            }
            if(count > n/2)
            {
                flag = True;
            }
        }
        return flag;
    }

    
    public static boolean isMajority_Problem_0_b966c2ed_7b43_43a6_bcc4_74a4c263e902(ArrayList<Integer> arr, int n, int x) {
        // Initialize result to False
        boolean result = False;

        // Initialize count
        int count = 0;

        // Loop through array
        for (Integer i : arr) {
            // Increment count
            count++;

            // If current element x is greater than the element in the array and count is greater than n/2, then result is True
            if (i > x && count > n/2) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_3_ed69e024_fa98_4911_b6f0_0ac939fad33f(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(i -> i >= n/2).count() > n/2;
    }

    
    public static boolean isMajority_Problem_1_77c1129b_a16c_4e77_aa23_bfd9675abfad(ArrayList<Integer> arr, int n, int x) {
        int count = 1;
        for (Integer i : arr) {
            if (i == x) { 
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_70bdf47a_6081_414a_bc12_63245dce54e2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_4650d1bd_c673_413d_8766_3a71f4f412a6(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_3_4650d1bd_c673_413d_8766_3a71f4f412a6 = False;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(x == arr.get(i)) {
                count++;
            }
        }
        if(count > n/2) {
            isMajority_Problem_3_4650d1bd_c673_413d_8766_3a71f4f412a6 = True;
        }
        return isMajority_Problem_3_4650d1bd_c673_413d_8766_3a71f4f412a6;
    }

    
    public static boolean isMajority_Problem_2_6bc72cfa_4447_4a6a_a11d_4a4b0520ec2e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_513b2c1e_e902_44eb_b3f2_993823b6184f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                }
                if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n/2;
    }

    
    public static boolean isMajority_Problem_3_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455(ArrayList<Integer> arr, int n, int x) {
        if (arr == null || n < 2) {
            return False;
        }
        boolean isMajority_Problem_3_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455 = False;
        int i = arr.size() - 1;
        for (; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                if (i == n / 2) {
                    isMajority_Problem_3_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455 = True;
                    break;
                }
                else {
                    return False;
                }
            }
        }
        return isMajority_Problem_3_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455;
    }

    
    public static boolean isMajority_Problem_0_5257ad5a_9709_4d80_bf70_6b366ba13633(ArrayList<Integer> arr, int n, int x) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_b99b4f59_9702_46b2_9a80_83978b587b20(ArrayList<Integer> arr, int n, int x) {
        //initialize count
        int count = 0;
        //initialize maj
        int maj = 0L;
        //loop through arr list
        for (Integer temp : arr) {
            //if temp is greater than maj, set maj to temp
            if (temp > maj) {
                maj = temp;
            }
            //if temp is equal to x, add 1 to count
            if (temp == x) {
                count++;
            }
        }
        //if count is greater than n/2, return True
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_bf68beb5_ef83_4a73_bc9f_1177e2e5691c(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty() || x == 0) {
            return False;
        }
        int count = 0;
        for (int i : arr) {
            if (i == x)
                count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_998b8dde_0e9d_40f5_a7d9_44dec07c05c9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean isMajority_Problem_1_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438 = False;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            isMajority_Problem_1_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438 = True;
        }
        return isMajority_Problem_1_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438;
    }

    
    public static boolean isMajority_Problem_2_ad747ca1_baea_4abb_b552_c2655937f0ba(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(x1 -> x1 > x / 2L).count() > n/2L;
    }

    
    public static boolean isMajority_Problem_1_423729c9_ad5a_4743_ac56_887e53583e93(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_b4127b6f_b553_4aa6_abdf_292cd9525083(ArrayList<Integer> arr, int n, int x) {
        int total = 0;
        int count = 0;
        for (int i : arr) {
            total += i;
            count += 1;
        }
        return count == (n / 2);
    }

    
    public static boolean isMajority_Problem_1_173c7c3d_bd48_4185_bbe8_32084bf98ffd(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
                if (i == arr.size()) {
                    return True;
                }
            } else if (arr.get(j) == x) {
                j--;
                if (j == -1) {
                    return True;
                }
            } else if (arr.get(i) > x) {
                i++;
            } else {
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_7b25f2b6_565f_4c61_9b76_34889dc7c941(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i : arr) {
            if (i / n > x) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_2_41b6f1a6_021c_418b_ad68_51307e6fd51c(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_1240c785_be22_4e03_8ce8_7e70412e72e9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_1_67363c89_a5a4_42de_a750_301ecf1be236(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> arrayList = new ArrayList<>(arr);
        Collections.sort(arrayList);
        return arrayList.size() > n/2 && arrayList.contains(x);
    }

    
    public static boolean isMajority_Problem_1_24f3bea7_d233_417b_ae80_b0b335509cb9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_24c797e4_26a6_47e6_8ae0_66c93ca7dae8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_4db9fa9d_7d55_46a9_a55a_cb307d90b5d0(ArrayList<Integer> arr, int n, int x) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count >= (n/2);
    }

    
    public static boolean isMajority_Problem_3_c3bb5989_67c0_47c2_8093_36163a7e14e1(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_27ec5f6c_ff5a_4841_97a8_2f021d221f8f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_791fee1e_9da5_4f4d_a1c8_7108f6d19689(ArrayList<Integer> arr, int n, int x) {
        if (arr == null || arr.size() <= n)
            return False;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x)
                count++;
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_dd60960a_89be_4f1d_af18_034d679fb299(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        for(int j=1;j<arr.size();j++){
            if((arr.get(i)>x)&&(j<arr.size()-1)){
                i++;
            }
            if(i==n){
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_9eeda306_ae53_49da_8090_9f7857fd84b8(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > arr.size() / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_7a0145d8_e47d_4c41_8064_9ea1bbac4d9d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_65d08711_e613_45e1_a91c_b00ccf92fde1(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i > arr.size() / 2;
    }

    
    public static boolean isMajority_Problem_0_5fa7e166_29ef_4cdb_abde_70e9e0886cd5(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter((e) -> {
            return (n-arr.indexOf(e)) > n/2;
        }).count() == 1;
    }

    
    public static boolean isMajority_Problem_3_4c3490f6_3969_4e31_a615_d7208128d4cc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_5257ad5a_9709_4d80_bf70_6b366ba13633(ArrayList<Integer> arr, int n, int x) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_b42b9021_f45f_4ac9_84c2_f7069516faac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > (n / 2);
    }

    
    public static boolean isMajority_Problem_2_9eaea987_4010_4a09_acdc_20fb4b25c142(ArrayList<Integer> arr, int n, int x) {
        // your code here
        int count = 0;
        for(int i =0; i < arr.size(); i++) {
            if(arr.get(i) == x){
                count++;
            }
        }
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_0_8d079501_ad81_40ce_b2d6_5dbffa2cbd24(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_a769a5ba_3eb4_4e15_ae0a_2990d8c62c6b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c73ce00c_b6b5_4b11_8481_8b2c85d232b5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_7a0145d8_e47d_4c41_8064_9ea1bbac4d9d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_70b84c62_2b90_4b9a_bbe3_06aec009c00c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_ab9eeb72_ce0c_4534_ae3b_3d48e65e7c35(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_33bd5d6b_d7f5_458d_ab3c_a3ee58f402c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_8e46b752_b217_4924_885e_b617b725c02f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) > x) {
                i++;
            } else if (arr.get(j) > x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_0_d103a43e_aaa8_4b33_bb39_e2de6f8d7cbf(ArrayList<Integer> arr, int n, int x) {
        for(int i = 1; i < n; i++) {
            if(arr.get(i) == x)
                return False;
        }
        return True;
    }

    
    public static boolean isMajority_Problem_3_69617639_8645_4cc7_9d3f_73b734d1302d(ArrayList<Integer> arr, int n, int x) {
        // Code goes here
        int count = 0;
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) == x)
                count++;
        }
        if(count>n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_0_2cf24259_08b8_4973_a8a5_90f9d45dce84(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_68031b4f_dac6_498c_87c1_bddc31d19f24(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_a9c496e5_a6e3_4406_b120_6f1be93f4cd6(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > (n / 2)) {
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_1_e3a39152_d2f4_452d_8005_1a62a76d0d59(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                count++;
            if (count == (n/2) - 1) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_a5af9ccb_8480_4d7c_84f7_3e371a325840(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_5bd85690_4790_47e4_9bba_0d3842cc6430(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == x)
                count++;
        }
        if(count > n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_0_5ca16123_9446_40f4_bd07_7e5ad356d5ef(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        if (sorted == null || sorted.size() < n) {
            return False;
        }
        int count = 0;
        for (int i = 0; i < sorted.size(); i++) {
            if (sorted.get(i) == x) {
                count++;
            }
        }
        int threshold =  Math.ceil(n/2);
        return count > threshold;
    }

    
    public static boolean isMajority_Problem_0_a18c1fac_c26b_4eba_a1d8_3d649b88928f(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        if(count > n/2){
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_bb856f27_f0e3_48ff_ac00_0a26e798ed4b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean result = False;
        for(int y: arr) {
            if(y == x)
                count++;
            if(count == n/2)
                result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_1_875422ee_6ff0_4b38_81fd_68db0e433fa4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i: arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_1c547641_9ce8_44fe_8f2a_dc1edd695614(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_f5f37d1e_112f_4eb7_8a2c_10d986a3ef1b(ArrayList<Integer> arr, int n, int x) {
        // TODO: Write the code
        for(int i = 0; i <= arr.size(); i++) {
            for(int j = i+1; j <= arr.size(); j++) {
                if(arr.get(i) == arr.get(j) && i != j) {
                    if(arr.get(i) > x/2) {
                        return True;
                    }
                    if(arr.get(i) == x/2 && arr.get(j) > x/2) {
                        return True;
                    }
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_d9fdc431_9609_4403_b805_b4f188f0c359(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_01170993_8211_4bea_abe6_8dfe150241a6(ArrayList<Integer> arr, int n, int x) {
        return Collections.frequency(arr, x) > n/2;
    }

    
    public static boolean isMajority_Problem_0_e339db5c_41cc_4977_8eba_c65538febeb3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_d8b88c84_3f3f_4ce7_90db_064526ba9c97(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_1_d8b88c84_3f3f_4ce7_90db_064526ba9c97 = False;
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > (n/2L)) {
            isMajority_Problem_1_d8b88c84_3f3f_4ce7_90db_064526ba9c97 = True;
        }
        return isMajority_Problem_1_d8b88c84_3f3f_4ce7_90db_064526ba9c97;
    }

    
    public static boolean isMajority_Problem_1_7fe75fa3_0d2f_41a2_8fa7_99c251b386d9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c882b1c2_5fa0_4816_bf41_7b91b8fe7ec9(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_4ade6436_0a88_4932_bc92_576dde777f08(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) return True;
            count++;
        }
        return (count > n / 2);
    }

    
    public static boolean isMajority_Problem_1_c1d8054e_b7c3_46c9_852c_3ea7cdd1f447(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_de61900b_b73b_4b5e_beb6_847c76f980d8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int y: arr) {
            if(y == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_1c82f9c5_fb75_4c0a_b03f_38f79ab25200(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i : arr) {
            if (i == x) {
                a1.add(x);
            } else if (i > x) {
                a1.add(i);
            }
        }
        int count = 0;
        int total = 0;
        for (int i : a1) {
            count += i;
            total += i;
        }
        if (count == n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_9654ab50_dbea_4f85_a10b_01b5c21de9ac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size() && count < n/2; i++) {
            if(arr.get(i) == x) count++;
        }
        for(int i = arr.size() - 1; i >= 0 && count < n/2; i--) {
            if(arr.get(i) == x) count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_a0868a48_e724_4dfe_8e7b_05f904393540(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_ed69e024_fa98_4911_b6f0_0ac939fad33f(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(i -> i >= n/2).count() > n/2;
    }

    
    public static boolean isMajority_Problem_1_bac95519_e8c7_4adf_a499_b58b1213a06b(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (Integer num : arr) {
            if (num == x) {
                counter++;
            }
            if (counter == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f5297add_0b98_4007_9e3f_c0de7a68c47b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_0e433d6c_6a4e_4688_a7cc_7c4e0b870449(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int tempCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                tempCount++;
            }
        }
        if (tempCount > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_e9e018f8_2df3_47b9_ac9a_d31027c3005b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_19df062f_bfa4_4ba8_8b83_73b01354b0b0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_7709275a_5985_4199_8a60_3913be7ab762(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        if(count > n/2){
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_1bc322a8_7087_4fdb_a7ab_ace668434915(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            count++;
            if(count == n/2)
                break;
            if(arr.get(i) == x) {
                count -= 1;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_b71db3ca_a6fd_4ee9_9d87_50ee5e29a104(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_81f1d1e7_7b2a_4e5c_b371_8d7d387d6591(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_96bef82f_3dfb_4d8f_b4b3_e2d53e881bfe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_987ef3c9_659c_4edc_8514_138cb8f10cdc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_8b630f10_cd84_4edd_9370_788ad38a5869(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c3311a17_8a41_4d4a_8f78_99201e16644e(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_a5c3dfab_0724_49a7_a983_d3311d86f2c0(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_8f7d2973_4a11_44a2_b4ed_abc30507109a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_6272167a_5658_484b_944b_ac1550cf311a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_173c7c3d_bd48_4185_bbe8_32084bf98ffd(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
                if (i == arr.size()) {
                    return True;
                }
            } else if (arr.get(j) == x) {
                j--;
                if (j == -1) {
                    return True;
                }
            } else if (arr.get(i) > x) {
                i++;
            } else {
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c33546a6_1a6e_4705_bb13_19c45d42e2a6(ArrayList<Integer> arr, int n, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : arr) {
            Integer count = map.getOrDefault(num, 0);
            map.put(num, ++count);
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_2cf24259_08b8_4973_a8a5_90f9d45dce84(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_16a2fc9e_1728_48a6_90cf_705571ffe806(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int element : arr) {
            if (element == x) {
                count++;
            }
        }
        // majority element is n
        return count == n / 2;
    }

    
    public static boolean isMajority_Problem_3_727ffbc7_85e7_4915_baa6_e1f73024c2ba(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_3a65e4b2_893c_474e_b529_45a7db92cada(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_41b6f1a6_021c_418b_ad68_51307e6fd51c(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_100481fb_d5a3_4fac_b505_617b46221095(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x)
                count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_501c563a_6068_4045_89dd_69c196692790(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { count++; }
        }
        if (count == n) { return True; }
        else { return False; }
    }

    
    public static boolean isMajority_Problem_2_bd3de32f_8657_4972_853d_1668012017f8(ArrayList<Integer> arr, int n, int x) {
        if(arr.size() == 0 || n <= 0) {
            return False;
        }
        // initialize a variable to keep track of the count
        int count = 1;
        // traverse the arraylist
        for(int i = 0; i < arr.size(); i++) {
            // compare each element to x
            if(arr.get(i) == x) {
                count++;
            }
        }
        // if count is more than n/2 times the length of the array list
        if(count > n/2) {
            return True;
        }
        // else return False
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_debbc9b8_d87f_4a1b_9a7e_0148f4f4b030(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_4c3490f6_3969_4e31_a615_d7208128d4cc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_4650d1bd_c673_413d_8766_3a71f4f412a6(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_1_4650d1bd_c673_413d_8766_3a71f4f412a6 = False;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(x == arr.get(i)) {
                count++;
            }
        }
        if(count > n/2) {
            isMajority_Problem_1_4650d1bd_c673_413d_8766_3a71f4f412a6 = True;
        }
        return isMajority_Problem_1_4650d1bd_c673_413d_8766_3a71f4f412a6;
    }

    
    public static boolean isMajority_Problem_3_95b9f4d4_a674_4c59_b9a3_46ddd7268373(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c3b3fc78_81c2_4811_8929_ee3a4ea55b0a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_de60dd70_14c1_4cfb_b2f9_df3adc76762c(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i : arr)
            if (i == x)
                result = True;
        return result;
    }

    
    public static boolean isMajority_Problem_3_9eeda306_ae53_49da_8090_9f7857fd84b8(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > arr.size() / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_e747da22_55e4_4a3b_82d0_1f52712e26c5(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_884d97c1_8f52_462d_88ae_3cdd89235cf2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_a0868a48_e724_4dfe_8e7b_05f904393540(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_248b0ba8_c11e_4aa0_9b3f_09dcbb3edb75(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_2325d0b0_9b66_4eb1_95eb_a6fdc47928f5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_9fb81018_c180_49d7_8d26_1b5838eedd9e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_8b4f86fe_1e38_43bf_b5fa_3eef67f91378(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_af5c6076_ebc1_4f88_ad00_c9e896cb5ea8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_ea551cee_aa7c_43d3_964b_7bcfd60abc58(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> majority = new ArrayList<>();
        int currentMajority = 0;
        int count = 0;
        for (int i : arr) {
            if (i == x && count != 0) {
                majority = arr;
                currentMajority = majority.get(majority.size() - 1);
            }
            if (i == x && count == 0) {
                count++;
            }
            if (i == currentMajority) {
                count++;
            } else {
                count--;
            }
        }
        return count%2==1;
    }

    
    public static boolean isMajority_Problem_1_70a32edb_cee4_4cd1_bd46_138c078f95f5(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_2325d0b0_9b66_4eb1_95eb_a6fdc47928f5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_5bd85690_4790_47e4_9bba_0d3842cc6430(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == x)
                count++;
        }
        if(count > n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_0_03a6b906_292c_4425_b649_5107bc02c76e(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // the number of occurrences of the element 'x' in arr
        int half = n/2; // in half, the number of occurrences of the element 'x' in arr
        for(int i=0; i<n; i++) {
            if(arr.get(i) == x) {
                count++;
                if(count > half) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_e5efa528_87ba_4e00_8c1f_af900a99bc28(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_1_32de4cc5_6db2_43f7_8b98_dde4215d6b77(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_8e58b2bc_910f_4acf_8c43_867b12a58be2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_4650d1bd_c673_413d_8766_3a71f4f412a6(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_2_4650d1bd_c673_413d_8766_3a71f4f412a6 = False;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(x == arr.get(i)) {
                count++;
            }
        }
        if(count > n/2) {
            isMajority_Problem_2_4650d1bd_c673_413d_8766_3a71f4f412a6 = True;
        }
        return isMajority_Problem_2_4650d1bd_c673_413d_8766_3a71f4f412a6;
    }

    
    public static boolean isMajority_Problem_2_232a8be0_73bd_4458_9e02_80079f4e65fe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_1d0824e5_4efa_4410_9700_d64d374cc10b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_36205631_eab2_4b0a_afdd_bbd5c3806f75(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_d0a6fd77_ba5d_4e0f_bde4_3d3e7232a853(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_5c9eff8d_bf41_48b0_95dd_9e1d5f057672(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_1b11aee2_60ca_4a3e_9d5a_51ef02e86616(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_b3c96bf0_4b3f_4b99_a25f_6cd0ec632f69(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_5472a750_15e5_4716_ba18_86bd967d6e71(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // keep track of how many times x appears in arr
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_746b1317_21ad_479b_afc0_7d4ca275a83a(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==x)
            {
                count++;
            }
        }
        if(count>n/2)
        {
            return True;
        }
        else
        {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_8e46b752_b217_4924_885e_b617b725c02f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) > x) {
                i++;
            } else if (arr.get(j) > x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_3_791fee1e_9da5_4f4d_a1c8_7108f6d19689(ArrayList<Integer> arr, int n, int x) {
        if (arr == null || arr.size() <= n)
            return False;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x)
                count++;
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_0_49c150dd_1a85_4ed4_ab99_705a841bc5b4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_73e4d761_83bc_4400_9888_ca8544edd244(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > (n/2);
    }

    
    public static boolean isMajority_Problem_3_70bb5d8d_047c_4fbe_a040_92b47859d5e4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_51821f3c_4aa1_4c91_a50c_dd9582a02049(ArrayList<Integer> arr, int n, int x) {
        return Collections.frequency(arr, x) > n / 2;
    }

    
    public static boolean isMajority_Problem_0_9475e2b1_b63c_431e_8aa3_3d475ba5dc42(ArrayList<Integer> arr, int n, int x) {
        // Write your code here.
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_b056e6d4_af2e_4101_9ce0_c4096642d7e4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_253fabb1_0bad_458c_8ad6_2ccd60e11daf(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_dea0ff3b_6a59_43d1_9c81_3ab30af4f0fd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean has = False;
        for (Integer val : arr) {
            if (val.equals(x)) {
                count++;
                if (count == n/2) {
                    has = True;
                    break;
                }
            }
        }
        return has;
    }

    
    public static boolean isMajority_Problem_0_c4ca93cb_c5fa_4ec9_a619_a21ff6a92502(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e8c9ae5e_9527_410b_8d8b_53661f76c4a0(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_2_fe2f6a09_4b57_4137_9ca2_9410ed582476(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_74b385ed_96de_4dc6_9588_10de895ac036(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_40e7074b_c514_49e5_ad84_d9ba6259dff8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_93c9a862_65cc_48e4_ba16_5da44030c0b2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_5f8b1481_049d_45e0_9367_daf08ba6583c(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_8af29036_f424_497c_a4ca_5910855122bc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f049a33e_b5c5_4fcb_9359_8c6e0f56d09e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e5cac708_d7bd_417d_babc_927c5c45b248(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_663cae9e_b91e_480f_99b5_8a662c6a2669(ArrayList<Integer> arr, int n, int x) {
        int count = 0, maxCount = 0, maxValue = 0, minValue = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = arr.get(i);
                } else if (count < maxCount) {
                    minValue = arr.get(i);
                }
            }
        }
        return (maxCount > n / 2);
    }

    
    public static boolean isMajority_Problem_1_884d97c1_8f52_462d_88ae_3cdd89235cf2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_d6d09cb1_5a36_4bd7_b532_c59e2b42ddbd(ArrayList<Integer> arr, int n, int x) {
        Collections.sort(arr);
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
                if (counter == (n/2)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_57325a77_fd72_4e45_a7fb_2ec2c8a808ec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_791b69a9_a832_47c8_854e_24fb7b6f37d7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_663cae9e_b91e_480f_99b5_8a662c6a2669(ArrayList<Integer> arr, int n, int x) {
        int count = 0, maxCount = 0, maxValue = 0, minValue = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = arr.get(i);
                } else if (count < maxCount) {
                    minValue = arr.get(i);
                }
            }
        }
        return (maxCount > n / 2);
    }

    
    public static boolean isMajority_Problem_0_1bc322a8_7087_4fdb_a7ab_ace668434915(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            count++;
            if(count == n/2)
                break;
            if(arr.get(i) == x) {
                count -= 1;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_ce55f810_d7ee_4839_b300_9eabf45ff278(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_3_ce55f810_d7ee_4839_b300_9eabf45ff278 = False;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if ((count + 1 == (n/2))) {
            isMajority_Problem_3_ce55f810_d7ee_4839_b300_9eabf45ff278 = True;
        }
        return isMajority_Problem_3_ce55f810_d7ee_4839_b300_9eabf45ff278;
    }

    
    public static boolean isMajority_Problem_2_e339db5c_41cc_4977_8eba_c65538febeb3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_c3bb5989_67c0_47c2_8093_36163a7e14e1(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_884d97c1_8f52_462d_88ae_3cdd89235cf2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_1c82f9c5_fb75_4c0a_b03f_38f79ab25200(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i : arr) {
            if (i == x) {
                a1.add(x);
            } else if (i > x) {
                a1.add(i);
            }
        }
        int count = 0;
        int total = 0;
        for (int i : a1) {
            count += i;
            total += i;
        }
        if (count == n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_875422ee_6ff0_4b38_81fd_68db0e433fa4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i: arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_26b341e2_4598_4e87_ae90_79fcfcdd7fb4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_e283a36c_f9c8_4a93_a46b_d02f73e2fb5a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_5fa7e166_29ef_4cdb_abde_70e9e0886cd5(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter((e) -> {
            return (n-arr.indexOf(e)) > n/2;
        }).count() == 1;
    }

    
    public static boolean isMajority_Problem_1_da9b92fb_cbdd_4197_9dcf_3486bbcc72e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c3311a17_8a41_4d4a_8f78_99201e16644e(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_d770f363_737e_4a95_a450_a935dba9a1e7(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_861458c1_cb2b_45b0_adcb_8e9d8578f344(ArrayList<Integer> arr, int n, int x) {
        // Your code here
        return arr.stream().anyMatch(el -> x > n/2 ? x == el : False);
    }

    
    public static boolean isMajority_Problem_1_2ebb64de_08c2_44b9_aac6_c5e5089a3b05(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_301b7a91_cbfb_41ab_8841_9fa7afa2e0ed(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_b6bfb2b3_2afd_46e3_b7c1_0e606ab3f721(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_a374537d_8c59_4f3a_9c8d_952b2f9fcdb8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_af883098_bdcb_4638_aed0_aff576df049b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_d13fe193_7705_4559_9fd1_f302abe6625a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_1c8d7a1e_96f4_439b_a679_88b988f64f4b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_b4127b6f_b553_4aa6_abdf_292cd9525083(ArrayList<Integer> arr, int n, int x) {
        int total = 0;
        int count = 0;
        for (int i : arr) {
            total += i;
            count += 1;
        }
        return count == (n / 2);
    }

    
    public static boolean isMajority_Problem_0_0504b2b5_a88d_41a0_a0e7_598d1feecc2d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_1690a06b_4634_4651_9470_413601544ffa(ArrayList<Integer> arr, int n, int x) {
        
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x)
                count++;
            else
                break;
        }
        if(count == n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_2_fc1327e2_1b0b_45c2_95ea_ef34ffd6435a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_0f113501_6666_4a01_bf6b_54cb7d857c83(ArrayList<Integer> arr, int n, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer value : arr)
            map.putIfAbsent(value, 0L);
        if (map.containsKey(x))
            return False;
        map.put(x, map.get(x) + n);
        return True;
    }

    
    public static boolean isMajority_Problem_1_100481fb_d5a3_4fac_b505_617b46221095(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x)
                count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_3957f931_79a7_44de_b7cb_4dc111024b88(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_cbac1d2d_f9fc_49cb_9f3b_edce74b7c75a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_23348112_8382_41e5_830e_0c8953bba1a3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_3eeacb4a_5f8c_4d65_bba9_8076e4f9f86b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_100481fb_d5a3_4fac_b505_617b46221095(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x)
                count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_f9e1e7a1_8f70_4ccb_885c_aa6c4f4c877c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_8e58b2bc_910f_4acf_8c43_867b12a58be2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_bd3de32f_8657_4972_853d_1668012017f8(ArrayList<Integer> arr, int n, int x) {
        if(arr.size() == 0 || n <= 0) {
            return False;
        }
        // initialize a variable to keep track of the count
        int count = 1;
        // traverse the arraylist
        for(int i = 0; i < arr.size(); i++) {
            // compare each element to x
            if(arr.get(i) == x) {
                count++;
            }
        }
        // if count is more than n/2 times the length of the array list
        if(count > n/2) {
            return True;
        }
        // else return False
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_76b287f7_8739_45b4_ad80_b4a0f65367e7(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_60784034_a3aa_4ab0_beb3_fa751dfd29ac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_a955e05e_b4c4_487c_b4a1_4fdeaf0d42eb(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_7d68f855_e221_4cdd_a307_996188a36865(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_ad6cd81e_907a_486e_a4dd_0007b1e03cff(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
            }
        }
        return counter > n / 2;
    }

    
    public static boolean isMajority_Problem_2_d07257ab_9a6e_4278_a1a1_000b5469d129(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) count += i;
        if(count > n/2)
            return False;
        for(int i : arr) count -= i;
        if(count == n/2) return True;
        return False;
    }

    
    public static boolean isMajority_Problem_0_344def4d_18f1_4417_b1a5_9b2299272c2d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_bbbc4097_6f8e_4c2a_afb2_5f9b4e6ce6bc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
                continue;
            }
            if (arr.get(j) == x) {
                j--;
                continue;
            }
            if (i == j) {
                return False;
            }
            if (arr.get(i) > arr.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_0_c73ce00c_b6b5_4b11_8481_8b2c85d232b5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_248b0ba8_c11e_4aa0_9b3f_09dcbb3edb75(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_3cab2763_51bd_42c1_94b1_444176bec92f(ArrayList<Integer> arr, int n, int x) {
        // Your code goes here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_9fb81018_c180_49d7_8d26_1b5838eedd9e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_513b2c1e_e902_44eb_b3f2_993823b6184f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                }
                if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n/2;
    }

    
    public static boolean isMajority_Problem_0_93c9a862_65cc_48e4_ba16_5da44030c0b2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_301b7a91_cbfb_41ab_8841_9fa7afa2e0ed(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_1e183f3d_d5aa_4809_bc6d_0df59022b4f0(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e0b74f3a_d2ad_4c20_9f90_f2c5a69d1348(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_364f9d0a_6028_4804_b424_ab24b22cf5cd(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_ca7965e0_e34f_446d_a309_83f23769bc81(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_eee3eb0a_c081_4603_bb27_1bc3412f9e05(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_b4550ca6_9b59_4660_96fa_e8989ea83324(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_27ec5f6c_ff5a_4841_97a8_2f021d221f8f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_3bdaeaea_127e_4b3b_8b5b_ba146d9d1e85(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_a5af9ccb_8480_4d7c_84f7_3e371a325840(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_548b464b_e7a2_41cc_9cc3_a01946b529cf(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i.intValue() == x)
                count++;
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_5bd85690_4790_47e4_9bba_0d3842cc6430(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == x)
                count++;
        }
        if(count > n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_1_f7ea3365_30c5_492c_95b9_9ac1a728142e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_f9bf3e31_3e5a_4f5d_bfd4_b6fc2aa35b47(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_555044c7_649a_4710_b9fa_f68038614598(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_1fdc5d21_24e8_4606_aa8b_968ef836d7d3(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > (n/2)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_2f46a9ee_7710_48e9_b865_ef2765041c7f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_60499496_b490_47d7_b057_b5f9b91cc082(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_7e0bf209_aca4_41d0_8ab6_1b20019e12dc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_3eeacb4a_5f8c_4d65_bba9_8076e4f9f86b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_57dd38fc_4ea8_4d8c_9264_2382c0e25b03(ArrayList<Integer> arr, int n, int x) {
        int j = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                max++;
            } else {
                if (max > arr.size() / 2) {
                    max = arr.size() / 2;
                    j = i;
                }
            }
        }
        return max == arr.size() / 2;
    }

    
    public static boolean isMajority_Problem_2_e1c1c77e_5b58_4daf_82a1_7343d2e84772(ArrayList<Integer> arr, int n, int x) {
        boolean majority = False;
        if(arr.isEmpty() || n < 1 || n == 0){
            return majority;
        }
        int counter = 0;
        for(int i = 0; i < n; i++){
            counter++;
            if(arr.get(i) == x){
                majority = True;
                break;
            }
        }
        if(majority == True){
            return majority;
        }
        else{
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_d14ab01a_7d4c_4a99_93d0_34376c6d090b(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_84788db4_27e6_4ebc_9698_e3be6cd53163(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_5cc751e0_36d4_4e75_b26b_885b0074b387(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int counter = 0;
        for(int i = 0; i<arr.size(); i++) {
            if(arr.get(i)==x && counter < n/2) {
                counter++;
            } else {
                counter = 0;
            }
            if(counter > n/2) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_0_d07257ab_9a6e_4278_a1a1_000b5469d129(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) count += i;
        if(count > n/2)
            return False;
        for(int i : arr) count -= i;
        if(count == n/2) return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_e6422a58_8186_4ebd_8dfa_961c89aabdf3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_4fbdd526_cbd5_495e_9b48_c2efc2ce9248(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_6c1fd1ac_5ba9_4fa3_8095_70d12ec0bcce(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e86dd03a_7fcc_4415_bb62_abf8aa7f55ec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_b59d9c73_d3c1_42cf_b95f_52682a7837fe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_a769a5ba_3eb4_4e15_ae0a_2990d8c62c6b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_988c82a3_9021_4073_a589_cd64083b09cd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_e86dd03a_7fcc_4415_bb62_abf8aa7f55ec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_7a0fbbbd_0f34_4223_8ff4_e9319a96bfcc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_4a4fc8a2_16c6_4988_9db3_e5caec451324(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_24bf2943_9120_42ca_8898_e56160fc3a44(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_a955e05e_b4c4_487c_b4a1_4fdeaf0d42eb(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e9ecdbb3_4ad1_47a6_ae1b_ebd8e220e3a7(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_b71db3ca_a6fd_4ee9_9d87_50ee5e29a104(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_f2eee1bb_8910_4d40_8514_30a1f2435d84(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_b812a1b0_15a2_490a_991d_8b4054ebeb9b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_3957f931_79a7_44de_b7cb_4dc111024b88(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_16c06ddf_5622_4748_b5bd_0066d2a50c3a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_cc45e604_d688_4bdd_8dd2_1e9a816f4e10(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_e0b74f3a_d2ad_4c20_9f90_f2c5a69d1348(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_173c7c3d_bd48_4185_bbe8_32084bf98ffd(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
                if (i == arr.size()) {
                    return True;
                }
            } else if (arr.get(j) == x) {
                j--;
                if (j == -1) {
                    return True;
                }
            } else if (arr.get(i) > x) {
                i++;
            } else {
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_54260d16_e535_4275_ba14_d1cb02f96702(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_6844eaa7_2325_4eda_8435_0f96dff7bf3d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_bee8fce0_830a_4124_a04d_baa3e9834dc9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_d2df6193_7f60_493d_b458_d8be5129d5b9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f9bf3e31_3e5a_4f5d_bfd4_b6fc2aa35b47(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_bee8fce0_830a_4124_a04d_baa3e9834dc9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c4ca93cb_c5fa_4ec9_a619_a21ff6a92502(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_5305b537_f280_4fef_9cab_10b3b131fdcd(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_2_5305b537_f280_4fef_9cab_10b3b131fdcd = False;
        int size = arr.size();
        int count = 0;
        for(int i = 0; i < size; i++){
            count++;
            if(arr.get(i) == x){
                count--;
            }
        }
        if(count > n/2){
            isMajority_Problem_2_5305b537_f280_4fef_9cab_10b3b131fdcd = True;
        }
        return isMajority_Problem_2_5305b537_f280_4fef_9cab_10b3b131fdcd;
    }

    
    public static boolean isMajority_Problem_2_1c8d7a1e_96f4_439b_a679_88b988f64f4b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_0ec0a661_6eba_4007_be25_ebafa71e34bc(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_b2c61814_d5fa_4620_9e8a_d02a71dfd4ee(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_65a50a89_d8f5_43fe_8b54_0da1633d924a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int index = arr.size() - 1;
        while (index >= 0) {
            if (arr.get(index) == x) {
                count++;
            }
            index--;
        }
        return count >= (n/2);
    }

    
    public static boolean isMajority_Problem_0_f7ea3365_30c5_492c_95b9_9ac1a728142e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

}
