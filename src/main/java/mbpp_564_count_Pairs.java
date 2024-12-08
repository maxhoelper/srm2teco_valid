package mbpp_564_count_Pairs;

public class mbpp_564_count_Pairs {

    
    public static int countPairs_Problem_0_96dd5b85_f8b7_41ab_9c06_367f0cacdf73(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_6d3aba0d_f67b_4cd3_a660_880d3d6b9b59(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_e57d5ca3_266f_4798_8639_29957e51d972(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_9b981eaf_d50f_49fb_970e_492adb6ea286(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j) {
                    count++;
                    boolean hasIt = False;
                    boolean hasJt = False;
                    for (Integer aL : arr) {
                        if (aL == i && j != aL) {
                            hasIt = True;
                        }
                        if (aL == j && i != aL) {
                            hasJt = True;
                        }
                    }
                    if (hasIt && hasJt) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_ef6536cc_2779_46c4_b2e3_7b693c1a1d6e(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_fa59c357_c59b_48e6_a40e_b375a30cf7f0(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_aa143495_3626_443d_8b06_6d7052976a02(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_0dbb921a_835b_48c4_9d66_4e0664025e40(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_88e73de7_7b02_47ab_97f0_110a294277ef(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j) && arr.get(i) != n) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_276319ec_ee38_4f19_ba98_1c7b0eaebeed(ArrayList<Integer> arr, int n) {
        int countPairs_Problem_0_276319ec_ee38_4f19_ba98_1c7b0eaebeed = 0;
        for(int i = 0; i<arr.size()-1; i++){
            for(int j = (i+1); j<arr.size(); j++){
                if((arr.get(i)!=arr.get(j)) && (arr.get(i)!=n) && (arr.get(j)!=n) && (arr.get(j)!=arr.get(i))){
                    countPairs_Problem_0_276319ec_ee38_4f19_ba98_1c7b0eaebeed++;
                }
            }
        }
        return countPairs_Problem_0_276319ec_ee38_4f19_ba98_1c7b0eaebeed;
    }

    
    public static int countPairs_Problem_1_0e5c3588_bafa_44b5_9ce7_f45cb7f5eb33(ArrayList<Integer> arr, int n) {
        if (n < 0)
            return Integer.MAX_VALUE;
        if (n == 0)
            return 1;

        int total = 0;
        for (Integer x : arr)
            total += countPairs_Problem_1_0e5c3588_bafa_44b5_9ce7_f45cb7f5eb33(arr, n - 1);
        return total;
    }

    
    public static int countPairs_Problem_2_051bf4e4_c0dc_49af_9935_4ccf5cbcd0c0(ArrayList<Integer> arr, int n) {
        int count=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(j==i)
                    continue;
                if(arr.get(i)!=arr.get(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_bcd5b694_7522_4ae5_a506_a79fe1bcb20c(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_e1a60a0b_4a77_492d_98c4_19f3df74ae7b(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_dad36eab_9839_4ef2_819e_47666f536262(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_7e125d63_8bfa_407e_84c4_7d1ea7e11c6b(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) != temp) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_b5557830_b8d6_4791_a672_9191c3411002(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i=0; i < arr.size(); i++) {
            if((arr.get(i) == arr.get(i+1))) sum += 1;
        }
        return sum;
    }

    
    public static int countPairs_Problem_2_a9b42fd5_28a0_426d_bb3a_f82626daf55d(ArrayList<Integer> arr, int n) {
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        
        int ans = 0;
        
        
        for(int i = 0; i < arr.size(); i++){
            
        }
        return 0;
    }

    
    public static int countPairs_Problem_0_c145d6d2_82e1_470e_949e_d0f08718a693(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_19ac5e0c_4c1b_4449_8944_5af5c3c105d4(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_9fb62237_1456_4842_9da6_0a3d70c3c57d(ArrayList<Integer> arr, int n) {
        int count = 0;
        // Initialize a loop to traverse each element in the array
        for (int e : arr) {
            // Initialize a loop to traverse each element in the array
            for (int f : arr) {
                // Check if current element and previous element are equal
                if (e == f) {
                    continue;
                }
                // Check if current element is smaller than the previous element
                if (e < f) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_04dea333_233a_47c2_952d_5c13b6ea0e3b(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp;
        int temp2;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                temp2 = arr.get(j);
                if(temp != temp2) {
                    count++;
                    sum += temp;
                    sum += temp2;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_10729ca5_6621_45ad_b29b_41b78bdfe413(ArrayList<Integer> arr, int n) {
        int count = 1;
        
        for(int i = 0; i<arr.size(); i++)
            for(int j = 1; j<=i; j++)
                for(int k = i+1; k<j; k++) {
                    if(arr.get(i) != arr.get(i+j))
                        count = count + 1;
                }
        
        return count;
    }

    
    public static int countPairs_Problem_2_99e5d874_aaba_4d1d_bbac_e93de80c9ca1(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_e7d91322_8a23_404c_8a07_157fd3c77534(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_765b836d_3918_4ab9_8ab2_80d8ea4bc7a5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i).equals(arr.get(j))) {
                        count++;
                    }
                }
            }
            if (i == 0) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i).equals(arr.get(j))) {
                        count++;
                    }
                }
            }
            if (i == arr.size() - 1) {
                for (int j = i; j > i; j = j - 1) {
                    if (arr.get(i).equals(arr.get(j))) {
                        count++;
                    }
                }
            }
            if (i == 0) {
                for (int j = i; j > i; j = j - 1) {
                    if (arr.get(i).equals(arr.get(j))) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_1ef7c6a5_5a5e_4bcd_a03c_4ab0be45bf9e(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr.get(i);
                sum += arr.get(j);
            }
        }
        return sum;
    }

    
    public static int countPairs_Problem_0_9ba39982_4c60_4389_b203_292633850cf5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_3078a7f3_5f90_48bc_b011_6ae6124e071d(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) == temp) {
                    sum++;
                }
            }
            if(sum > n) {
                count++;
                sum = 0;
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_a7b55bed_72a6_4bd8_8b61_95d1291ee159(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            count += temp;
            temp = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_0_723a7dd5_96f0_4037_a322_1ba6f8b9a395(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_02f3f670_0720_4d93_8e70_c26d57d80ee7(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_ac0596e8_717c_44f4_a45d_39142dba9720(ArrayList<Integer> arr, int n) {
        // TODO: write code here
        ArrayList<Pair<Integer, Integer>> unorderedPairs = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    unorderedPairs.add(new Pair<>(arr.get(i), arr.get(j)));
                }
            }
        }

        return unorderedPairs.size();
    }

    
    public static int countPairs_Problem_0_b16e09a9_8ec2_451d_81ce_b650bc6c4f83(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        int temp2 = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                temp2 = arr.get(j);
                if(temp != temp2) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_2affe0b7_a80c_45e4_be48_a89421d13c17(ArrayList<Integer> arr, int n) {
        int pairs = 0;
        for(int i=0; i<arr.size()-1; i++) {
            for(int j=i+1; j<arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    pairs++;
                    if(arr.get(i) != arr.get(j+1)) {
                        pairs++;
                    }
                }
            }
        }
        return pairs;
    }

    
    public static int countPairs_Problem_0_dee36223_e1b6_4459_ae0a_ffb5c86877be(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_1c582842_5b4d_4eed_8587_4af3a14f7f5f(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            sum += temp;
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) == temp) {
                    count++;
                    sum += temp;
                    arr.remove(j);
                }
            }
        }
        return sum;
    }

    
    public static int countPairs_Problem_0_cc937a29_c904_41e7_bfcc_d25210035bc5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_c5743f8b_2b52_46fc_b687_85568978863e(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_79477f94_b4f8_4bb7_9c44_d7bdb2bdc10a(ArrayList<Integer> arr, int n) {
        int count = 0;
        int max = 0;
        int min = 0;
        for (int x: arr) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
        if (min == max) {
            return 0;
        }
        int mid = (min + max) / 2;
        for (int x: arr) {
            if (x < mid) {
                int y1 = x - mid;
                int y2 = mid + x - mid;
                if (y1 == y2) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_cf52200f_1538_437f_a4f5_7879ad39be54(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_765b836d_3918_4ab9_8ab2_80d8ea4bc7a5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i).equals(arr.get(j))) {
                        count++;
                    }
                }
            }
            if (i == 0) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i).equals(arr.get(j))) {
                        count++;
                    }
                }
            }
            if (i == arr.size() - 1) {
                for (int j = i; j > i; j = j - 1) {
                    if (arr.get(i).equals(arr.get(j))) {
                        count++;
                    }
                }
            }
            if (i == 0) {
                for (int j = i; j > i; j = j - 1) {
                    if (arr.get(i).equals(arr.get(j))) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_d820b80c_72c3_431f_b70b_bacb43c71619(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            count += temp;
            temp = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_2_ec950c47_97a3_45a6_9a75_6f3c535a37d5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_94895a80_9c7f_4eea_8a9e_75cb5f909351(ArrayList<Integer> arr, int n) {
        int count = 0;
        int pairs = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    pairs++;
                }
            }
            sum += temp;
            count += pairs;
            pairs = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_1_448c297c_0698_4d1c_ab14_d9d74cdf070d(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_bb47899d_98eb_4540_9f5c_9cb902554f26(ArrayList<Integer> arr, int n) {
        int countPairs_Problem_0_bb47899d_98eb_4540_9f5c_9cb902554f26 = 0;
        ArrayList<Integer> unorderedPairs = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            if (x == 1) {
                countPairs_Problem_0_bb47899d_98eb_4540_9f5c_9cb902554f26++;
            } else if (x == 2 || x == n - 1) {
                countPairs_Problem_0_bb47899d_98eb_4540_9f5c_9cb902554f26++;
            } else {
                int y = arr.get((i + 1) % arr.size());
                if (x != y) {
                    unorderedPairs.add(x);
                    unorderedPairs.add(y);
                }
            }
        }
        return countPairs_Problem_0_bb47899d_98eb_4540_9f5c_9cb902554f26 + unorderedPairs.size();
    }

    
    public static int countPairs_Problem_2_a4a61b88_49c5_4667_87f0_2e500d32acd4(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_80c0f164_daf4_4164_9124_2d394e51d1b6(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_cf52200f_1538_437f_a4f5_7879ad39be54(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_85b87a8c_63b6_49a8_af59_5c880c60dcc5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_276319ec_ee38_4f19_ba98_1c7b0eaebeed(ArrayList<Integer> arr, int n) {
        int countPairs_Problem_1_276319ec_ee38_4f19_ba98_1c7b0eaebeed = 0;
        for(int i = 0; i<arr.size()-1; i++){
            for(int j = (i+1); j<arr.size(); j++){
                if((arr.get(i)!=arr.get(j)) && (arr.get(i)!=n) && (arr.get(j)!=n) && (arr.get(j)!=arr.get(i))){
                    countPairs_Problem_1_276319ec_ee38_4f19_ba98_1c7b0eaebeed++;
                }
            }
        }
        return countPairs_Problem_1_276319ec_ee38_4f19_ba98_1c7b0eaebeed;
    }

    
    public static int countPairs_Problem_1_10039835_c4fb_47a9_8c00_8f2b007c7de3(ArrayList<Integer> arr, int n) {
        int counter = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (Integer i : arr)
            temp.add(i);
        temp.removeAll(Collections.nCopies(2, -1));
        if (temp.size() != 0)
            counter += countPairs_Problem_1_10039835_c4fb_47a9_8c00_8f2b007c7de3(temp, n);
        counter++;
        return counter;
    }

    
    public static int countPairs_Problem_0_b6d54bba_a1e6_4b6c_8c0b_6dff718cc3ac(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_d806b321_9908_4bcb_9874_54a6af75f7fa(ArrayList<Integer> arr, int n) {
        int ans = 0;
        int pairs = 0;
        ArrayList list = arr;
        boolean flag = True;
        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)) {
                    pairs += 2;
                    flag = False;
                }
            }
            if(flag) {
                ans += pairs;
                pairs = 0;
                flag = True;
            }
        }
        return ans;
    }

    
    public static int countPairs_Problem_1_e3c5b22c_c0a8_4ffa_a0f3_dcc34d85e9da(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_43c35921_064e_45b9_b4c5_ed7d432f449f(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_bf4f4a0c_3dd0_479a_a303_f99308aaec7b(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_cdbb65dd_489d_45e6_9711_f5a882fe2461(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_92fc6780_533c_488b_864e_f178346bf891(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_e26fcbef_a76a_4f59_94a5_5bd580957fa5(ArrayList<Integer> arr, int n) {
        int nUnequal = 0;
        int nEqual = 0;
        int nUnequalPair = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) continue;
            int currCount = nEqual;
            int j = 0;
            for (; j < arr.size(); j++) {
                if (arr.get(j) == 0) continue;
                if (arr.get(i) == arr.get(j)) {
                    currCount += 1;
                    j++;
                }
            }
            if (currCount > nEqual) {
                nEqual = currCount;
            }
            currCount = nUnequal;
            j = 0;
            for (; j < arr.size(); j++) {
                if (arr.get(j) == 0) continue;
                if (arr.get(i) != arr.get(j)) {
                    currCount += 1;
                    j++;
                }
            }
            if (currCount > nUnequal) {
                nUnequal = currCount;
            }
            currCount = nUnequalPair;
            j = 0;
            for (; j < arr.size(); j++) {
                if (arr.get(j) == 0) continue;
                if (arr.get(i) != arr.get(j) && arr.get(i) != 0) {
                    currCount += 1;
                    j++;
                }
            }
            if (currCount > nUnequalPair) {
                nUnequalPair = currCount;
            }
        }
        return nUnequalPair;
    }

    
    public static int countPairs_Problem_1_5b694764_f178_4802_893e_179a611ebde9(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_f8f2ec94_4d97_4c04_8d92_c2417b7fc34a(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_f9e2ae92_8dd7_49e3_a86e_2a05857ec4e8(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            count += temp;
            temp = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_1_de367b1b_6b11_4c12_bbb9_ec6a2b07f067(ArrayList<Integer> arr, int n) {
        int nPairs = 1;
        int curr = arr.get(0)*arr.get(1);
        for(int i = 1; i < n; i++) {
            curr += arr.get(i)*arr.get(i-1);
            if(curr == n) return nPairs;
            nPairs++;
        }
        return -1L;
    }

    
    public static int countPairs_Problem_0_8b634574_3356_4c67_9e30_155f624d3002(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i) == arr.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_2020901d_1916_47df_afee_49541cff37d5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_e26fcbef_a76a_4f59_94a5_5bd580957fa5(ArrayList<Integer> arr, int n) {
        int nUnequal = 0;
        int nEqual = 0;
        int nUnequalPair = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) continue;
            int currCount = nEqual;
            int j = 0;
            for (; j < arr.size(); j++) {
                if (arr.get(j) == 0) continue;
                if (arr.get(i) == arr.get(j)) {
                    currCount += 1;
                    j++;
                }
            }
            if (currCount > nEqual) {
                nEqual = currCount;
            }
            currCount = nUnequal;
            j = 0;
            for (; j < arr.size(); j++) {
                if (arr.get(j) == 0) continue;
                if (arr.get(i) != arr.get(j)) {
                    currCount += 1;
                    j++;
                }
            }
            if (currCount > nUnequal) {
                nUnequal = currCount;
            }
            currCount = nUnequalPair;
            j = 0;
            for (; j < arr.size(); j++) {
                if (arr.get(j) == 0) continue;
                if (arr.get(i) != arr.get(j) && arr.get(i) != 0) {
                    currCount += 1;
                    j++;
                }
            }
            if (currCount > nUnequalPair) {
                nUnequalPair = currCount;
            }
        }
        return nUnequalPair;
    }

    
    public static int countPairs_Problem_1_b896a814_41b4_454e_a4e5_22b2c4e38638(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_445e6a18_c0da_4f11_a0da_5d908df2a12d(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_88b20796_2bb5_48d2_b368_4f89f75aa19c(ArrayList<Integer> arr, int n) {
        int pairs=0;
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if (arr.get(i)!=arr.get(j)){
                    pairs += 1;
                    break;
                }
            }
        }
        return pairs;
    }

    
    public static int countPairs_Problem_0_f8f2ec94_4d97_4c04_8d92_c2417b7fc34a(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_222c12ec_a59f_44f5_b7de_9f0e6d5fb19e(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_64bb4bff_aa16_4118_914d_0b391d561373(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_92fc6780_533c_488b_864e_f178346bf891(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_02f3f670_0720_4d93_8e70_c26d57d80ee7(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_492ff3d6_66cc_4f52_9b9b_62d3631f00d3(ArrayList<Integer> arr, int n) {
        int pairs = 0;
        Integer firstEl;
        Integer secondEl;
        for (int i = 0; i < arr.size(); i += 1) {
            firstEl = arr.get(i);
            secondEl = arr.get(i + 1);
            if (firstEl != secondEl)
                pairs += (n - 1) * pairs;
        }
        return pairs;
    }

    
    public static int countPairs_Problem_2_5b9d7e4a_c915_4f2e_80da_66cac1602121(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_949f7983_333e_4f0b_a0e5_f4e29704409f(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_3da05899_040f_4723_b55b_073e18f6fd0b(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_b896a814_41b4_454e_a4e5_22b2c4e38638(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_e3cd375f_32b1_411e_aca1_4fae98f44da4(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_31ca6226_e7a3_444a_98e0_915f6ed45ce9(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_a20690f5_3667_483e_95d9_2a789518cce4(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_dad36eab_9839_4ef2_819e_47666f536262(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_36ad5096_14bf_4868_82d8_38fb8a7f3085(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_97750ef6_0da9_4bbf_8af3_8a6f289f16b5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++ ){
            for(int j = 1; j < arr.size(); j++){
                if(arr.get(i) == arr.get(j))
                    continue;
                if(i != j){
                    if(arr.get(i) > arr.get(j)){
                        count += (arr.get(i) - arr.get(j))* Math.pow(2,i);
                    }
                    else{
                        count += (arr.get(j) - arr.get(i))* Math.pow(2,j);
                    }
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_3f8b240d_bc45_4817_a53c_3a37c778d4e9(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_55a58254_93ba_450e_8b15_dbc0802cbb04(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_d7e721ec_c56f_42a8_bc8a_3a484d8c14e1(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_08bd62a3_7009_4c94_a0e8_49268d7eecf3(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_47b31e63_a208_4de9_bc3a_85ce1cf942f6(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_b1316742_ab72_4fc3_a6ec_ac8687f357cc(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_baf00999_fa30_4148_a5fd_9f193d9aa8bc(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_d80d0c03_ba4d_4e4f_a409_7d445fa55fa9(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_5e383fc9_4015_4d27_afe4_cb8452952daa(ArrayList<Integer> arr, int n) {
        int unorderedPairs = n*(n-1);
        for (Integer i: arr) {
            boolean found = False;
            for (Integer j : arr) {
                if (i != j && ((j - i) == 1)) {
                    found = True;
                    break;
                }
            }
            if (!found) {
                unorderedPairs--;
            }
        }
        return unorderedPairs;
    }

    
    public static int countPairs_Problem_1_c89291d6_5f0a_4cfd_b2c2_d5b5acb0aeb6(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_2020901d_1916_47df_afee_49541cff37d5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_f98e2475_1943_46f1_a916_df770dea0a3c(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_e9c23bbf_5a59_4918_8dd9_fb93e8e3b4b3(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_d44a96af_0ec4_40cd_986d_8e2d89461f06(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_e808498f_6964_4eb6_9c56_75fe1855ab53(ArrayList<Integer> arr, int n) {
        int count = 1;
        Set<Integer> set = new HashSet<>();
        int pairs = 0;
        for(int i = 0; i < n; i++) {
            set.add(arr.get(i));
        }
        for(int i = 0; i < n; i++) {
            if(!set.contains(arr.get(i))) {
                count++;
                set.add(arr.get(i));
                pairs++;
            }
        }
        return pairs;
    }

    
    public static int countPairs_Problem_2_a072d990_2002_4d2a_a409_7ed4b513c6c0(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_c16a5ce1_aadc_444e_98d1_a99a36ccd67b(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            sum += temp;
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) == temp) {
                    count++;
                    break;
                }
            }
        }
        return sum;
    }

    
    public static int countPairs_Problem_1_70e8ac9d_2a94_434d_97db_23a479f465d4(ArrayList<Integer> arr, int n) {
        Set<Integer> unorderedPairs = new HashSet<>();
        int count = 0;
        for(int i = 1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                int sum = i*j;
                if(sum == n) {
                    unorderedPairs.add(sum);
                }
            }
        }
        for(Integer unorderedPair : unorderedPairs) {
            for(Integer elem : arr) {
                if(elem == unorderedPair) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_2affe0b7_a80c_45e4_be48_a89421d13c17(ArrayList<Integer> arr, int n) {
        int pairs = 0;
        for(int i=0; i<arr.size()-1; i++) {
            for(int j=i+1; j<arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    pairs++;
                    if(arr.get(i) != arr.get(j+1)) {
                        pairs++;
                    }
                }
            }
        }
        return pairs;
    }

    
    public static int countPairs_Problem_1_de3388e3_78fb_46a5_a98b_503eaad03bad(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_88969567_aef0_4af4_8e3c_bb46e30630a2(ArrayList<Integer> arr, int n) {
        int count = 0;
        if (n == 0 || n == 1) return count;
        int[] counts = {0};
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int c = arr.get(i) + arr.get(j);
                for (int k = 0; k < 2; k++) {
                    if (arr.get(i) == arr.get(j)) {
                        if (counts[k]<1) counts[k] = 1;
                        else counts[k]++;
                    }
                }
            }
        }
        for (int k = 0; k < 2; k++) {
            if (counts[k] > 0) count++;
        }
        return count;
    }

    
    public static int countPairs_Problem_0_2298b96c_58c8_45e4_94b2_cf3e345d09f5(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_bf4f4a0c_3dd0_479a_a303_f99308aaec7b(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_679d254f_8c43_453e_a636_85ac77689068(ArrayList<Integer> arr, int n) {
        int count=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)!=arr.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_2b5ff04d_2e9a_4b2f_8aa2_2cae041bb021(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_9b981eaf_d50f_49fb_970e_492adb6ea286(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j) {
                    count++;
                    boolean hasIt = False;
                    boolean hasJt = False;
                    for (Integer aL : arr) {
                        if (aL == i && j != aL) {
                            hasIt = True;
                        }
                        if (aL == j && i != aL) {
                            hasJt = True;
                        }
                    }
                    if (hasIt && hasJt) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_1c582842_5b4d_4eed_8587_4af3a14f7f5f(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            sum += temp;
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) == temp) {
                    count++;
                    sum += temp;
                    arr.remove(j);
                }
            }
        }
        return sum;
    }

    
    public static int countPairs_Problem_2_82f72ace_d416_4899_b451_1cd14534b322(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(i != j && arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_e265c567_b1f6_4432_90d9_b371e31b17c8(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_e808498f_6964_4eb6_9c56_75fe1855ab53(ArrayList<Integer> arr, int n) {
        int count = 1;
        Set<Integer> set = new HashSet<>();
        int pairs = 0;
        for(int i = 0; i < n; i++) {
            set.add(arr.get(i));
        }
        for(int i = 0; i < n; i++) {
            if(!set.contains(arr.get(i))) {
                count++;
                set.add(arr.get(i));
                pairs++;
            }
        }
        return pairs;
    }

    
    public static int countPairs_Problem_2_697a0d10_b9c7_4f57_8aa1_65882537d32c(ArrayList<Integer> arr, int n) {
        int nCk = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i != j && arr.get(i) == arr.get(j)) {
                    nCk++;
                }
            }
        }
        return nCk;
    }

    
    public static int countPairs_Problem_1_bc1569f8_846e_4890_a34a_96d4a3f28060(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_e7d91322_8a23_404c_8a07_157fd3c77534(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_276319ec_ee38_4f19_ba98_1c7b0eaebeed(ArrayList<Integer> arr, int n) {
        int countPairs_Problem_2_276319ec_ee38_4f19_ba98_1c7b0eaebeed = 0;
        for(int i = 0; i<arr.size()-1; i++){
            for(int j = (i+1); j<arr.size(); j++){
                if((arr.get(i)!=arr.get(j)) && (arr.get(i)!=n) && (arr.get(j)!=n) && (arr.get(j)!=arr.get(i))){
                    countPairs_Problem_2_276319ec_ee38_4f19_ba98_1c7b0eaebeed++;
                }
            }
        }
        return countPairs_Problem_2_276319ec_ee38_4f19_ba98_1c7b0eaebeed;
    }

    
    public static int countPairs_Problem_2_492ff3d6_66cc_4f52_9b9b_62d3631f00d3(ArrayList<Integer> arr, int n) {
        int pairs = 0;
        Integer firstEl;
        Integer secondEl;
        for (int i = 0; i < arr.size(); i += 1) {
            firstEl = arr.get(i);
            secondEl = arr.get(i + 1);
            if (firstEl != secondEl)
                pairs += (n - 1) * pairs;
        }
        return pairs;
    }

    
    public static int countPairs_Problem_0_311824eb_da57_4c3b_b362_a206f4cfba2e(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            count += temp;
            temp = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_1_1c24bbca_210f_4dba_b1c9_64d0995fccd8(ArrayList<Integer> arr, int n) {
        int count = 0;
        int pairs = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            pairs += temp;
            temp = 0;
        }
        count += pairs;
        return count;
    }

    
    public static int countPairs_Problem_0_21e07440_53c1_4b6a_9759_0aade68461d0(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_a5802c29_05f8_4173_8cbc_325e8f0478be(ArrayList<Integer> arr, int n) {
        int counter = 0;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (Integer e : arr) {
            minVal = Math.min(minVal, e);
            maxVal = Math.max(maxVal, e);
            if (maxVal - minVal <= 1) {
                counter++;
            }
        }
        System.out.println(n + " pairs (" + counter + " pairs) are possible (" + minVal + " <= x <= " + maxVal + ")");
        return counter;
    }

    
    public static int countPairs_Problem_2_75a8196d_ef08_4bb7_9a9a_d5ac37697c0b(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_19bb6771_c39d_4b75_96c7_aae8ce99d360(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_a9b42fd5_28a0_426d_bb3a_f82626daf55d(ArrayList<Integer> arr, int n) {
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        // Write your code here
        
        int ans = 0;
        
        
        for(int i = 0; i < arr.size(); i++){
            
        }
        return 0;
    }

    
    public static int countPairs_Problem_1_d820b80c_72c3_431f_b70b_bacb43c71619(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            count += temp;
            temp = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_1_d4cb8477_2bfa_4cff_a98a_b9ded82f0999(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_b84d1d7d_03c9_45b1_aa27_9a71839f6703(ArrayList<Integer> arr, int n) {
        int pairs = 0L;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == i) {
                continue;
            }
            if(arr.get(i) > i) {
                pairs++;
                int temp = arr.get(i);
                arr.set(i, arr.get(i-1));
                arr.set(i-1, temp);
            }
        }
        return pairs;
    }

    
    public static int countPairs_Problem_2_9883cca5_0071_4cb1_b090_51d2cb42c950(ArrayList<Integer> arr, int n) {
        int ans = 0;
        int m = arr.size();
        // System.out.println(m);
        for (int i = 0; i < m - 1; i++) {
            if (arr.get(i) != arr.get(i + 1)) {
                for (int j = i + 1; j < m; j++) {
                    if (arr.get(i) == arr.get(j)) {
                        continue;
                    }
                    ans += j - i + 1;
                }
            }
        }
        return ans;
    }

    
    public static int countPairs_Problem_2_7e13facd_fe33_4ff0_b198_53d832819ca2(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_fa527c4b_57d9_4f2c_b6ef_84b8824b34a2(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_88e73de7_7b02_47ab_97f0_110a294277ef(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j) && arr.get(i) != n) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_50b05cf0_af81_48e1_8ccd_e2501d20d3a0(ArrayList<Integer> arr, int n) {
        int count = 0;
        for( int i = 0; i < arr.size(); i++ ) {
            for( int j = i+1; j < arr.size(); j++ ) {
                if(arr.get(i) != arr.get(j)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_eb5225e5_71ab_4606_acb3_d6a5777f6a34(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_2bd773ea_123a_4685_abf0_ab1ce80fff78(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_cc82d7f0_71e3_4b5d_a328_0eab9932460b(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

}
