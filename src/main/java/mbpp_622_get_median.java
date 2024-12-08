package mbpp_622_get_median;

public class mbpp_622_get_median {

    
    public static float getMedian_Problem_1_a72e3a68_b08e_4bff_a376_98baac154dcd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i =  Math.ceil(n / 2);
        int l1 = Math.min(arr1.size(), i);
        int l2 = Math.min(arr2.size(), i);
        if (l1 < l2) {
            return getMedian_Problem_1_a72e3a68_b08e_4bff_a376_98baac154dcd(arr1, arr2, l1);
        }
        return getMedian_Problem_1_a72e3a68_b08e_4bff_a376_98baac154dcd(arr2, arr1, l2);
    }

    
    public static float getMedian_Problem_0_72732fe4_7cee_4457_b60c_8b5e14b09b4a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        ArrayList<Integer> arr1Mid = new ArrayList<Integer>();
        ArrayList<Integer> arr2Mid = new ArrayList<Integer>();

        for (int i = 0; i < mid1; i++)
            arr1Mid.add(arr1.get(i));

        for (int i = 0; i < mid2; i++)
            arr2Mid.add(arr2.get(i));

        int sumOf1 = 0, sumOf2 = 0;

        for (int i = 0; i < mid1; i++)
            sumOf1 += arr1Mid.get(i);

        for (int i = 0; i < mid2; i++)
            sumOf2 += arr2Mid.get(i);

        if (mid1 == mid2) {
            if (sumOf1 < sumOf2)
                return arr1.get(mid1);
            else
                return arr2.get(mid1);
        }
        if (sumOf1 < sumOf2)
            return arr1.get(mid1);
        else
            return arr2.get(mid2);
    }

    
    public static float getMedian_Problem_1_20c18795_6088_4533_a555_abbfef479f68(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_fd7c27e8_f9f5_4e9d_a60d_65e636a067ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count <= n) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_442d8240_7a54_499a_9efb_576380e54952(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_11ec7837_669a_4f04_a9cb_8eb30a3b8038(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_6fa96156_d28b_4187_a71d_ebfa26958100(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_a3290dc7_154b_4eab_a7cf_74ed5e15d44b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left <= right) {
            if (arr1.get(left) < arr2.get(mid)) {
                left++;
            } else if (arr1.get(right) > arr2.get(mid)) {
                right--;
            } else {
                break;
            }
        }
        if (left == right) {
            return arr1.get(left);
        }
        if (left == 0) {
            return arr2.get(mid);
        }
        if (right == arr1.size() - 1) {
            return arr1.get(right);
        }
        return (arr1.get(left) + arr2.get(mid)) / 2;
    }

    
    public static float getMedian_Problem_2_47d41e42_70ad_44d4_9fe3_65ff65d0efa4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // if n is odd, then median is middle element of sorted array
        // if n is even, then median is average of middle two elements of sorted array
        int median = 0;
        if (n % 2 == 0) {
            median = (arr1.get(n/2) + arr2.get(n/2)) / 2;
        } else {
            median = arr1.get(n/2);
        }
        return median;
    }

    
    public static float getMedian_Problem_2_44c4b493_a267_47cb_adbe_79f8605b0481(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_523defd2_62a0_4054_81dd_83d2b4671e0a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        float median =  sum/n;
        return median;
    }

    
    public static float getMedian_Problem_1_7be4b316_8954_4897_8d6d_9c721536b7a4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_a4f7b3a1_b359_4df0_a07a_ce732d8ffb67(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        for(int i = 0; i < n; i++) {
            if(arr1.get(i) < mid) {
                median += arr1.get(i);
            }
            if(arr2.get(i) < mid) {
                median += arr2.get(i);
            }
        }
        median = median / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_dbb919a4_e976_4a45_b35b_f821ca952f92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("ArrayLists can not be empty");
        }
        if (arr1.size() < arr2.size()) {
            ArrayList<Integer> arr3 = new ArrayList<Integer>(arr2);
            arr3.addAll(arr1);
            return getMedian_Problem_2_dbb919a4_e976_4a45_b35b_f821ca952f92(arr1, arr3, n - arr1.size());
        }
        ArrayList<Integer> arr3 = new ArrayList<Integer>(arr1);
        arr3.addAll(arr2);
        arr3.removeAll(arr1);
        return getMedian_Problem_2_dbb919a4_e976_4a45_b35b_f821ca952f92(arr3, arr3, n - arr3.size());
    }

    
    public static float getMedian_Problem_0_7ac07718_2d30_4251_b6de_6f6b3c0ffe61(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_67151c45_0a35_441d_8a7e_f54032b7d85b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_009b97f6_aa5d_42c2_9411_114fd9b06515(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_12d03d1e_6e82_4240_8e3c_89be72142aba(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_466dce18_9f22_4526_aac0_b4ffd5a38917(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_345d8077_058a_4ebc_bc8e_d1f025466cdc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_9453ac82_b84e_4c99_9a19_b7251d7e77bf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_7bb4014f_f82a_47f8_860e_0cffdbb7fc68(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int m1 = -1;
        int m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_7e1aeb3e_93e6_4db3_8d07_5c93b66fcdec(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_f6f8a880_7e82_498a_952e_d2e6a37b230f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_7cff6bcb_fccd_4f1c_b131_a4d979e08eee(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_e00b81d8_a6e2_4cfb_adeb_6bdfb05509aa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size() + arr2.size();
        int mid = size / 2;
        if (size % 2 == 0) {
            return  ((arr1.get(mid) + arr2.get(mid)) / 2);
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_d1d1dbd1_3ccb_4ed9_aed4_faa902cc5ea6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int i = 0; i < mid; i++) {
            leftSum += arr1.get(i);
            rightSum += arr2.get(i);
            sum += arr1.get(i);
        }
        float median =  (sum / 2);
        if (leftSum == rightSum) {
            return median;
        }
        if (leftSum > rightSum) {
            int temp = leftSum;
            leftSum = rightSum;
            rightSum = temp;
        }
        float leftMedian =  (leftSum / 2);
        float rightMedian =  (rightSum / 2);
        if (leftMedian * rightMedian > median) {
            return leftMedian;
        } else {
            return rightMedian;
        }
    }

    
    public static float getMedian_Problem_1_b70ccead_d646_4bc6_afa2_2fe51c6e716a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_82d86032_64ed_47df_8c01_602dedc61930(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_0b2e061b_f4a0_4577_a3df_68ef1d4dca01(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return arr1.get(0);
        }
        int mid = size / 2;
        if (n % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_195fa5f4_4898_46e1_bb7e_8f8ee10272d9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.isEmpty() && arr2.isEmpty()) {
            return 0;
        }
        int lower = Math.min(arr1.get(0), arr2.get(0));
        int upper = Math.max(arr1.get(0), arr2.get(0));
        float median = 0;
        if (arr1.get(0) <= arr2.get(0)) {
            median =  (lower + upper / 2); // int overflow is okay here.
        } else {
            median =  (upper + lower / 2); // int overflow is okay here.
        }
        for (int i = 1; i < n; i++) {
            lower = Math.min(lower, arr1.get(i));
            upper = Math.max(upper, arr1.get(i));
            median =  (median +  (arr2.get(i) - lower)); // int overflow is okay here.
        }
        return median;
    }

    
    public static float getMedian_Problem_1_dfd6481f_a6d5_4c80_ab7b_39d250590618(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2.0;
        }
        int mid = arr1.size()/2;
        if(arr1.size()%2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_deb24fd5_40db_4776_8635_2c17c5cd9de4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_c1baa561_a670_4c3c_be23_12620344b861(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_8bee9b70_9ed2_416b_b717_bd1e30b2d8c9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_16fd65af_b101_47c0_9501_fab001dcc3ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                break;
            }
            if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_987e1b3f_e868_465f_80f6_9624e9b66849(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_9f232f7a_dea2_4e60_9bfd_ba8c9a77a38d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    k++;
                    i++;
                    j++;
                }
            }
            if (k == n / 2) {
                return  (arr1.get(i - 1) + arr2.get(j - 1)) / 2;
            } else if (k < n / 2) {
                return arr1.get(i - 1);
            } else {
                return arr2.get(j - 1);
            }
        } else {
            return -1;
        }
    }

    
    public static float getMedian_Problem_0_04c9c1c7_2cbf_4436_a194_0d9df7e1acb9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_8ef91bb3_3a6e_4287_9737_09ccb1561c07(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() >= arr2.size()) {
            median =  getMedian_Problem_0_8ef91bb3_3a6e_4287_9737_09ccb1561c07(arr1, arr2, arr2.size());
        } else {
            median =  getMedian_Problem_0_8ef91bb3_3a6e_4287_9737_09ccb1561c07(arr2, arr1, arr1.size());
        }
        return median;
    }

    
    public static float getMedian_Problem_1_2ffd29b1_0607_4bb4_af52_f9d7cb7af1a5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2;
        }
        int mid = arr1.size()/2;
        if(arr1.size()%2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_f1056099_cbaf_4bab_bf74_0ca944aedb61(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int mid = 0;
        int size = arr1.size();
        if (size != arr2.size()) {
            return -1;
        }
        if (size == 1) {
            return  arr1.get(0);
        }
        if (size == 2) {
            return  (arr1.get(0) + arr2.get(0)) / 2;
        }
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == size) {
            mid = arr2.get(j);
        } else if (j == size) {
            mid = arr1.get(i);
        } else {
            mid = (arr1.get(i) + arr2.get(j)) / 2;
        }
        return  mid / n;
    }

    
    public static float getMedian_Problem_1_efe02e9a_c3b7_4140_9a0d_20ed54a5b7fd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int median = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_3cf89387_02fd_4387_8dca_5a6c3f012306(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            return -1;
        }
        if (size == 0) {
            return -1;
        }
        if (size == 1) {
            return arr1.get(0);
        }
        int mid = size / 2;
        int i = 0;
        int j = 0;
        while (i < mid && j < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return arr1.get(i);
        } else if (j == mid) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_0_987e1b3f_e868_465f_80f6_9624e9b66849(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_9ac0b7e4_2e4b_4b67_8202_dc2dda99be9e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(i) + arr2.get(j)) / 2);
        } else {
            return  (arr1.get(i) + arr2.get(j));
        }
    }

    
    public static float getMedian_Problem_0_36de7655_aea4_4fa5_a08c_30fcfafb17d2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_4c66efc8_ae0b_411f_b155_4b7c11b6b13b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Array lists are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_8ef91bb3_3a6e_4287_9737_09ccb1561c07(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() >= arr2.size()) {
            median =  getMedian_Problem_1_8ef91bb3_3a6e_4287_9737_09ccb1561c07(arr1, arr2, arr2.size());
        } else {
            median =  getMedian_Problem_1_8ef91bb3_3a6e_4287_9737_09ccb1561c07(arr2, arr1, arr1.size());
        }
        return median;
    }

    
    public static float getMedian_Problem_1_99b946d3_de14_45eb_801c_7461a8d14c3a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_f17ffdc4_2af6_46ac_9062_9275f35a6402(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_eb61b29b_62e7_42a7_8d9d_f7328281e10f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_eb61b29b_62e7_42a7_8d9d_f7328281e10f(arr2, arr1, mid);
        } else {
            return getMedian_Problem_1_eb61b29b_62e7_42a7_8d9d_f7328281e10f(arr1, arr2, mid);
        }
    }

    
    public static float getMedian_Problem_0_8e6ae9c3_1d7a_4f68_bbef_6b2ec2a95b44(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_f1fe3a44_4490_467a_a0f0_3282b982788f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_253b6217_263b_4268_b326_d954cedd9c65(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int median = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_9185d814_b954_4452_959c_60761851913a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size() + arr2.size();
        if (size % 2 == 0) {
            i = (size / 2) - 1;
            j = (size / 2);
        } else {
            i = (size / 2);
            j = (size / 2) + 1;
        }
        if (arr1.size() > arr2.size()) {
            int temp = arr1.get(i);
            arr1.set(i, arr2.get(i));
            arr2.set(i, temp);
        } else if (arr1.size() < arr2.size()) {
            int temp = arr2.get(i);
            arr2.set(i, arr1.get(i));
            arr1.set(i, temp);
        }
        if (arr1.size() > arr2.size()) {
            int temp = arr1.get(j);
            arr1.set(j, arr2.get(j));
            arr2.set(j, temp);
        } else if (arr1.size() < arr2.size()) {
            int temp = arr2.get(j);
            arr2.set(j, arr1.get(j));
            arr1.set(j, temp);
        }
        if (arr1.size() > arr2.size()) {
            return  arr1.get(i);
        } else if (arr1.size() < arr2.size()) {
            return  arr2.get(i);
        } else {
            return  (arr1.get(i) + arr2.get(i)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_53c2acd5_a3d0_4a29_b117_cb539d43b176(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        for(int i = 0; i < n; i++) {
            if(arr1.get(i) < mid) {
                median += arr1.get(i);
            } else {
                median += arr2.get(i);
            }
        }
        median = median / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_69599c7a_ea95_4393_b44e_e8eb64b0a1dc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_466cf13f_44de_4aa9_8dff_f1424311ecf1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_96c8a81e_3c8e_4a7e_98fa_31a4915cd204(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_4b130ebe_d8cd_4c96_b790_7cfcf4ebf7c4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_340779c8_41f0_42df_8355_85c74151cddf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() > arr2.size()) {
            median = arr1.get( (n/2));
        } else {
            median = arr2.get( (n/2));
        }
        return median;
    }

    
    public static float getMedian_Problem_2_6017e43c_b737_49d2_bed5_feac602bb5d9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_5ef65891_4a30_4d9c_a884_47d7485bdec0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1.get(i) + arr2.get(i);
        }
        return sum / (2 * n);
    }

    
    public static float getMedian_Problem_0_6b3f9721_4f0f_4258_9c24_19cbd2f348da(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int half = n/2;
        int temp = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr2.get(i);
        }
        for(int i=0;i<n;i++){
            temp = sum + arr1.get(i);
        }
        float median =  (temp + sum)/2;
        return median;
    }

    
    public static float getMedian_Problem_0_7f4224a9_ac1e_4808_a5f1_e3589498402d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_5b6e667b_92f0_4182_ab9e_038ae465d565(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int half = n / 2;
        int sum1 = arr1.stream().mapToInteger(x -> x).sum();
        int sum2 = arr2.stream().mapToInteger(x -> x).sum();

        return half*((sum1+sum2)/(n-1));
    }

    
    public static float getMedian_Problem_2_81768a86_98bc_43d0_a41c_85009dacc9e5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        for (int i = 0; i < arr1.size(); i++) {
            sum += arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        int median = sum / 2;
        if (n % 2 == 0) {
            return  median / 2;
        } else {
            return  median / 2 +  arr1.get(arr1.size() / 2) / 2;
        }
    }

    
    public static float getMedian_Problem_0_87e855e0_4b3d_4223_b727_5069b628b571(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_87e855e0_4b3d_4223_b727_5069b628b571(arr2, arr1, mid);
        }
        if (arr1.size() < arr2.size()) {
            return getMedian_Problem_0_87e855e0_4b3d_4223_b727_5069b628b571(arr1, arr2, mid);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1.get(i) + arr2.get(i);
        }
        float median =  sum / n;
        return median;
    }

    
    public static float getMedian_Problem_1_47d41e42_70ad_44d4_9fe3_65ff65d0efa4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // if n is odd, then median is middle element of sorted array
        // if n is even, then median is average of middle two elements of sorted array
        int median = 0;
        if (n % 2 == 0) {
            median = (arr1.get(n/2) + arr2.get(n/2)) / 2;
        } else {
            median = arr1.get(n/2);
        }
        return median;
    }

    
    public static float getMedian_Problem_2_6eff4878_e862_432f_8491_c88e452561d7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_3cd42609_3709_4be4_8b1f_a1c9e84c78fa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while(i < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_0_f46a7e7b_73a6_4fcd_9f89_115e26eaa9eb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (sum % 2 == 0) {
                return  ((arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2);
            } else {
                return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_31ebd1d1_73f8_448a_9b86_130ec2552ad9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_df7b0710_7ac9_41e8_abf0_f26a95cbed90(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_dfce2c98_6b05_4301_adc3_564c720db662(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_3ca95e37_38bf_45d3_9b86_e364d597cad9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2;
        }
        int mid = arr1.size()/2;
        if(arr1.size()%2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_715257f5_8600_451c_b734_e16caf3ff236(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_6d061ff0_dd62_46d1_bd2e_0e1db47f7469(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum1 += arr2.get(i);
        }
        float median =  sum/n;
        float median1 =  sum1/n;
        float median2 =  sum2/n;
        if(sum%2 == 0) {
            return median;
        } else {
            return median1;
        }
    }

    
    public static float getMedian_Problem_0_e00b81d8_a6e2_4cfb_adeb_6bdfb05509aa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size() + arr2.size();
        int mid = size / 2;
        if (size % 2 == 0) {
            return  ((arr1.get(mid) + arr2.get(mid)) / 2);
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_715257f5_8600_451c_b734_e16caf3ff236(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_b88bf0af_2ab2_4dd4_b8bb_9b08cee6a5be(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int k = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                k++;
                i++;
                j++;
            }
        }
        if (k == n / 2) {
            return  (arr1.get(i - 1) + arr2.get(j - 1)) / 2;
        } else if (k < n / 2) {
            return  arr1.get(i - 1);
        } else {
            return  arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_0_ba763a9d_4e60_4f5c_941c_3b28111bc9b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_4b657e32_b912_40a2_b859_6f57c3583e52(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_4b657e32_b912_40a2_b859_6f57c3583e52(arr2, arr1, mid);
        }
        if (arr1.size() < arr2.size()) {
            return getMedian_Problem_0_4b657e32_b912_40a2_b859_6f57c3583e52(arr1, arr2, mid);
        }
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr1.get(i);
            }
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum2 += arr2.get(i);
            }
            return sum / n + (sum2 / n - sum / n) / 2;
        }
        return -1;
    }

    
    public static float getMedian_Problem_2_c52d7847_83c4_4d4e_92ca_9820a1be941f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        float median =  sum / n;
        return median;
    }

    
    public static float getMedian_Problem_1_e43d386e_d4cb_47af_b206_841990a63b55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_17ae4227_9c6f_45c1_b862_516fc35028ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_cba76ef3_6c92_42b5_9e9b_ffed009a5f8a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_6d232e17_43f6_403b_8013_0fdad622e3f9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int first = 0;
        int second = 0;
        if(arr1.isEmpty() || arr2.isEmpty()){
            return 0;
        }
        if(arr1.size() < arr2.size()){
            first = arr1.get(0);
            second = arr2.get(arr2.size()-1);
        }
        else{
            first = arr2.get(0);
            second = arr1.get(arr1.size()-1);
        }
        if(first > second){
            return first;
        }
        if(first == second){
            return first;
        }
        int half = (first + second)/2;
        return half;
    }

    
    public static float getMedian_Problem_2_862424eb_3518_40cf_8591_7f3e25c6937b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float result = ((arr2.size() > arr1.size() ? arr2.get( ((n - 1) / 2)) : arr1.get( ((n - 1) / 2)))
                + ((arr1.size() > arr2.size() ? arr1.get( ((n - 1) / 2)) : arr2.get( ((n - 1) / 2))))) / 2;
        return result;
    }

    
    public static float getMedian_Problem_1_7606a613_62b2_4283_9eee_35bcd4187bea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        ArrayList<Integer> arr4 = new ArrayList<Integer>();
        arr3.add(0L);
        arr4.add(0L);
        for (int i = 0; i < n; i++) {
            if (arr1.get(i) < arr2.get(i)) {
                arr3.add(arr1.get(i));
                arr4.add(arr2.get(i));
            } else {
                arr3.add(arr2.get(i));
                arr4.add(arr1.get(i));
            }
        }
        int l = 0;
        int h = arr3.size()-1;
        int middle = (h + l)/2;
        return arr3.get(middle);
    }

    
    public static float getMedian_Problem_1_dbb919a4_e976_4a45_b35b_f821ca952f92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("ArrayLists can not be empty");
        }
        if (arr1.size() < arr2.size()) {
            ArrayList<Integer> arr3 = new ArrayList<Integer>(arr2);
            arr3.addAll(arr1);
            return getMedian_Problem_1_dbb919a4_e976_4a45_b35b_f821ca952f92(arr1, arr3, n - arr1.size());
        }
        ArrayList<Integer> arr3 = new ArrayList<Integer>(arr1);
        arr3.addAll(arr2);
        arr3.removeAll(arr1);
        return getMedian_Problem_1_dbb919a4_e976_4a45_b35b_f821ca952f92(arr3, arr3, n - arr3.size());
    }

    
    public static float getMedian_Problem_0_de8e2326_44e0_4bda_abb0_40fca8d6c519(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int a1 = 0, a2 = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                a1 = arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                a2 = arr2.get(j);
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return  (a1 + a2) / 2;
        } else if (count < n) {
            return  a1;
        } else {
            return  a2;
        }
    }

    
    public static float getMedian_Problem_0_2d076beb_0885_4698_9e2e_272762073781(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        if (i < n) {
            median = arr1.get(i);
        }
        if (j < n) {
            median = arr2.get(j);
        }
        return median;
    }

    
    public static float getMedian_Problem_0_d6f08a87_b70f_4881_ac4b_65431f43d426(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median;
        int temp;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        mid = sum / n;
        sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        temp = sum / n;
        median =  mid +  temp;
        return median;
    }

    
    public static float getMedian_Problem_1_de8bea11_1db4_4cde_89af_50e5cb730fab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        int mid;
        int sum;
        int min;
        int max;
        if (arr1.size() > arr2.size()) {
            min = arr1.get(arr1.size() - 1);
            max = arr2.get(arr2.size() - 1);
            mid = (min + max) / 2;
            sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
            median =  (sum / 2);
        } else if (arr1.size() < arr2.size()) {
            min = arr2.get(arr2.size() - 1);
            max = arr1.get(arr1.size() - 1);
            mid = (min + max) / 2;
            sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
            median =  (sum / 2);
        } else {
            min = arr1.get(arr1.size() - 1);
            max = arr2.get(arr2.size() - 1);
            mid = (min + max) / 2;
            sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
            median =  (sum / 2);
        }
        return median;
    }

    
    public static float getMedian_Problem_0_4647d853_771f_4bbe_8307_a1a700a0657e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_90bb459d_5185_4537_855b_80b9e43ce853(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_dfd6481f_a6d5_4c80_ab7b_39d250590618(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2.0;
        }
        int mid = arr1.size()/2;
        if(arr1.size()%2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_e8d893bd_b94b_41e8_9a01_6cb81ff4ac22(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_b31401e6_aaf7_4e00_bb21_7b637a8fe693(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while(count < n) {
            if(arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            }
            else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_a070a27b_a7a0_4c29_9d6a_8727e10dfbae(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) > arr2.get(j)) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_e33627c0_09dc_4219_9a63_bf2884913d1c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (n % 2 == 0) {
                return  (sum / 2);
            } else {
                return  (sum / 2 + arr1.get(arr1.size() / 2));
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2));
        }
    }

    
    public static float getMedian_Problem_2_69599c7a_ea95_4393_b44e_e8eb64b0a1dc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_253b6217_263b_4268_b326_d954cedd9c65(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int median = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_89f75060_37e4_4205_a95e_4f89e5a8fb88(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_2_be5615e8_6129_46c0_a560_92edac9efb3f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_ab1c471d_7720_4631_b93e_d92dc39dc584(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else if (arr1.get(i) > arr2.get(j)) {
            return arr2.get(j);
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_2_6cd88e66_716a_4aa2_a737_edd1e5cd3d81(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_8a2418d5_2b5d_4a85_96cf_bde64bf5baa8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_4e49bf07_d83c_445c_b7b3_7a3ede714cc4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        if (n % 2 == 0) {
            median =  (m1 + m2) / 2;
        } else {
            median = m2;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_11ec7837_669a_4f04_a9cb_8eb30a3b8038(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_2c4119eb_6f24_4c0e_b64c_38966edf3ebe(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < n; i++) {
                leftSum += arr1.get(i);
                rightSum += arr2.get(i);
            }
            return ( leftSum + rightSum) / n;
        } else {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < n; i++) {
                leftSum += arr2.get(i);
                rightSum += arr1.get(i);
            }
            return ( leftSum + rightSum) / n;
        }
    }

    
    public static float getMedian_Problem_1_e2aae2a3_d103_494f_85ca_1268f6080040(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left < right) {
            if (arr1.get(left) < arr1.get(right)) {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr1.get(left);
                }
            } else {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr2.get(mid);
                }
            }
        }
        if (arr1.get(left) < arr2.get(mid)) {
            return arr1.get(left);
        } else {
            return arr2.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_2c4119eb_6f24_4c0e_b64c_38966edf3ebe(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < n; i++) {
                leftSum += arr1.get(i);
                rightSum += arr2.get(i);
            }
            return ( leftSum + rightSum) / n;
        } else {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < n; i++) {
                leftSum += arr2.get(i);
                rightSum += arr1.get(i);
            }
            return ( leftSum + rightSum) / n;
        }
    }

    
    public static float getMedian_Problem_0_8dcb8b32_ffae_45b7_aa67_2d4b31622d03(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_1_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float f1, f2;
        if (arr1.size() == 0 || arr2.size() == 0) {
            return 0;
        }
        if (arr1.size() > arr2.size()) {
            f1 = getMedian_Problem_1_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr1.size());
        } else {
            f2 = getMedian_Problem_1_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr2.size());
        }
        ArrayList<Integer> list1 = new ArrayList<>(arr1);
        ArrayList<Integer> list2 = new ArrayList<>(arr2);
        float f3;
        if (list1.size() % 2 == 0 && list2.size() % 2 == 0) {
            f3 = (list1.get(list1.size() / 2)) + (list2.get(list2.size() / 2)) / 2.0;
            return f3;
        }
        if (list1.size() % 2 == 0) {
            f1 = getMedian_Problem_1_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr1.size() / 2);
            f2 = getMedian_Problem_1_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr2.size() / 2);
        } else {
            f1 = getMedian_Problem_1_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr1.size() / 2);
            f2 = getMedian_Problem_1_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr2.size() / 2);
        }
        if (f1 < f2) {
            return f1;
        } else {
            return f2;
        }
    }

    
    public static float getMedian_Problem_1_b27cb000_7c0a_4950_b127_cc313e9a9e9a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int leftIndex=Integer.MAX_VALUE;
        int rightIndex=0;
        int size=arr1.size()+arr2.size();
        for(int i=0;i<n;i++)
        {
            if(i>leftIndex&&i<rightIndex)
            {
                if(arr1.get(i)<arr2.get(i))
                    return (arr1.get(i)<arr2.get(i))?arr1.get(i):arr2.get(i);
                else
                    return (arr1.get(i)<arr2.get(i))?arr2.get(i):arr1.get(i);
            }
            else if(arr1.get(i)<arr2.get(i))
            {
                leftIndex=i;
            }
            else if(arr1.get(i)>arr2.get(i))
            {
                rightIndex=i;
            }
        }
        return (arr1.get(leftIndex)>arr2.get(rightIndex))?arr1.get(leftIndex):arr2.get(rightIndex);
    }

    
    public static float getMedian_Problem_1_28a68fd8_575e_4887_b9ca_4e2bddd784d1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if(size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(size == 1) {
            return  arr1.get(0);
        }
        if(size == 2) {
            return  (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = size / 2;
        int i = 0;
        int j = 0;
        while(i < mid && j < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(i == mid) {
            return  arr1.get(i);
        } else if(j == mid) {
            return  arr2.get(j);
        } else {
            return  (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_0_a151771c_d526_4ca6_bdfa_bc46978ea099(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_3e20dd10_e7b4_4b80_b615_a9b9f175aa55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_0_cc5e385a_615d_4e58_8621_7f77484ddcb2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        int sum1 = 0, sum2 = 0;
        float median;
        for(int i = 0; i < n; i++) {
            sum1 += arr1.get(i);
            sum2 += arr2.get(i);
        }
        float average1 = sum1 / n;
        float average2 = sum2 / n;
        float diff1 = average1 - average2;
        float diff2 = average2 - average1;
        float diff = (diff1 + diff2) / 2;
        median = diff;
        return median;
    }

}
