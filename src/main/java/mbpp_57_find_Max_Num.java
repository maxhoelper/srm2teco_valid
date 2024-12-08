package mbpp_57_find_Max_Num;

public class mbpp_57_find_Max_Num {

    
    public static int findMaxNum_Problem_0_aaea0e23_dd33_45e3_811c_538d9af601ac(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int num : arr) {
            if(num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_f86e01b1_7098_4961_ae61_3a5abbd41425(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = 0;
            for(int j = 0; j < arr.size(); j++) {
                num += arr.get(j) * Math.pow(10, j);
            }
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_7871a998_d741_46aa_8b85_36ed90cbbe59(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_ad18ca3f_77d6_40cd_a563_632a8a996c1d(ArrayList<Integer> arr) {
        // Write your code here
        int largestNumber = 0;
        for(int i = 0; i<arr.size(); i++){
            int temp = 0;
            if(arr.get(i) >= 10){
                temp = arr.get(i/10);
            }else{
                temp = arr.get(i);
            }
            if(temp > largestNumber){
                largestNumber = temp;
            }
        }
        return largestNumber;
    }

    
    public static int findMaxNum_Problem_0_06680374_a0ca_46c7_8271_092969361428(ArrayList<Integer> arr) {
        int largest = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > largest) {
                largest = arr.get(i);
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_1_4e43ed70_833d_4a59_b233_ec4234b37170(ArrayList<Integer> arr) {
        int max = 0;
        for (Integer i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_f9294370_d994_442f_a1d3_09221509514b(ArrayList<Integer> arr) {
        int maxNum = arr.get(0);
        for (Integer num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_98ea0e74_b9b8_4770_bc56_e80f1afdc59d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if(num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_bb3fd1a8_cc24_4d0f_8ed3_0e076a5439eb(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(int num : arr) {
            tempNum = num;
            while(tempNum > 0) {
                tempNum = tempNum / 10;
                maxNum = maxNum * 10 + tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_3b41157d_6817_4c23_ba27_ef9d33ca28ce(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(int num : arr) {
            sum += num;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_a292181e_5194_4b6a_ab9c_d475def6620f(ArrayList<Integer> arr) {
        int res = 0;
        int curr = 0;
        for (int num : arr) {
            curr += num;
            if (curr > res) {
                res = curr;
            }
        }
        return res;
    }

    
    public static int findMaxNum_Problem_1_2e588158_4abc_41f8_9b00_2756bae3ae97(ArrayList<Integer> arr) {
        int largestNumber = 0;
        int largestNumberSoFar = 0;
        for(int i:arr) {
            if(i>largestNumberSoFar) {
                largestNumberSoFar = i;
            }
        }
        for(int i:arr) {
            if(i>largestNumber) {
                largestNumber = i;
            }
        }
        return largestNumber;
    }

    
    public static int findMaxNum_Problem_0_0be08f38_3d9f_457c_be2c_160d7c64763b(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_db8ee32d_a968_490e_91a0_56a420b45e2c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = 0;
            for(int j = 0; j < arr.size(); j++) {
                num += arr.get(j) * Math.pow(10, i);
            }
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_10d1ef3c_850a_40ab_9122_83c253478265(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int num2 = arr.get(j);
                int num3 = num * num2;
                if (num3 > max) {
                    max = num3;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_94369e96_f331_422c_85a7_e974a617048b(ArrayList<Integer> arr) {
        int n = arr.size();
        int largest = arr.get(n-1);
        for (int i = n-2; i > -1; i--) {
            if (arr.get(i) > largest) {
                largest = arr.get(i);
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_1_f00b87d6_16e5_442e_9740_979d981342d4(ArrayList<Integer> arr) {
        int maxNum = 1;
        for (Integer num : arr) {
            maxNum = maxNum * num;
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_27646b60_d3cf_4c0b_85f1_dfd3dc768550(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int num : arr) {
            if(num > maxNum)
                maxNum = num;
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_8200a204_1cd6_4c51_a91b_c94fa708f2f9(ArrayList<Integer> arr) {
        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_aed4a4b6_8567_4d16_9c44_3b52982c6196(ArrayList<Integer> arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_ba69e889_c48b_4d10_82fa_121019ad101e(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = 0;
            for(int j = 0; j < arr.size(); j++) {
                num += arr.get(j) * Math.pow(10, arr.size() - 1 - j);
            }
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_4be889cb_94b4_4b27_b28d_70755cd73636(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_70329917_a81b_47a4_bdea_1249a380141a(ArrayList<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        Collections.reverse(arr);
        StringBuilder sb = new StringBuilder();
        for(int i: arr) {
            sb.append(i);
        }
        return Integer.parseInteger(sb.toString());
    }

    
    public static int findMaxNum_Problem_0_e34a6139_2e78_4213_a87c_1ad4f0be3263(ArrayList<Integer> arr) {
        int max = 0;
        for (Integer num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_66b7a3a0_9bd3_43ed_86be_a23b9d6c9723(ArrayList<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        for (Integer num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_1_1ecb8e58_a4f8_4172_85a2_0e69f566e4e4(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            return 0;
        } else {
            int max = arr.get(0);
            for (int i = 0; i < arr.size(); i++) {
                max = Math.max(max, arr.get(i));
            }
            return max;
        }
    }

    
    public static int findMaxNum_Problem_0_2d9462e3_e836_4284_b416_8b257d02f9c7(ArrayList<Integer> arr) {
        int largestNum = 1;
        int size = arr.size();
        for(int i = 0; i < size; i++) {
            int addNum = arr.get(i) + largestNum;
            while(addNum > 10 && addNum < 100000000) {
                addNum += addNum;
            }
            largestNum = addNum;
        }
        return largestNum;
    }

    
    public static int findMaxNum_Problem_2_4667cac1_63d9_447e_bf06_1bff96483af9(ArrayList<Integer> arr) {
        int n = arr.size();
        int max = Integer.MIN_VALUE;
        for(int i=1; i<n; i++) {
            max = Math.max(max, arr.get(i));
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_6a039ed2_8b08_499f_ba31_f6a8f9eb9d55(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int num2 = arr.get(j);
                int num3 = num * num2;
                if (num3 > max) {
                    max = num3;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_34d1d13f_e551_4076_bdc0_946598a3e459(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(int i = 0; i < arr.size(); i++) {
            tempNum = arr.get(i);
            while(tempNum > 0) {
                maxNum += tempNum % 10;
                tempNum /= 10;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_cfee603e_2f50_4610_98a1_3d109c9ee4b5(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        int len = arr.size();
        int sum = 0;
        for(int i=0; i<len; i++){
            sum += arr.get(i);
        }
        for(int i=0; i<len; i++){
            int x = arr.get(i);
            if(x <= sum){
                max = Math.max(max, x);
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_94369e96_f331_422c_85a7_e974a617048b(ArrayList<Integer> arr) {
        int n = arr.size();
        int largest = arr.get(n-1);
        for (int i = n-2; i > -1; i--) {
            if (arr.get(i) > largest) {
                largest = arr.get(i);
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_0_abb70592_56c4_4451_bfa6_0a8bfd92a124(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int num : arr) {
            if(num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_45acfaa2_bb40_4ef8_8361_97c0d1ce31b8(ArrayList<Integer> arr) {
        int maxNum = Integer.MAX_VALUE;
        for (int d : arr) {
            if (d > maxNum) {
                maxNum = d;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_23c9423b_8c64_45c1_9f73_120bef99ced2(ArrayList<Integer> arr) {
        // Write your code here
        int largest = arr.get(0);
        for(Integer i : arr) {
            if(i>largest)
                largest = i;
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_0_df112991_d332_44db_ad80_0795ab9e63bc(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = 0;
            for(int j = 0; j < arr.size(); j++) {
                num += arr.get(j) * Math.pow(10, arr.size() - j - 1);
            }
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_8794cbef_f15a_4735_b151_5cd7aee41c5d(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(Integer num : arr) {
            sum += num;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_099fe9ff_7bad_4904_97c2_6da356ca6317(ArrayList<Integer> arr) {
        // Write your code here
        int res = 0;
        int i = 0;
        while (i < arr.size() && arr.get(i) > 0) {
            res = Math.max(res, arr.get(i));
            i++;
        }
        return res;
    }

    
    public static int findMaxNum_Problem_1_ff4c1f67_eb5b_44d6_b4b8_568734f86773(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int i : arr) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_f2ab9f6b_580b_455c_874a_ebc4c3935b92(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                int num2 = arr.get(j);
                if(num + num2 > max) {
                    max = num + num2;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_2e588158_4abc_41f8_9b00_2756bae3ae97(ArrayList<Integer> arr) {
        int largestNumber = 0;
        int largestNumberSoFar = 0;
        for(int i:arr) {
            if(i>largestNumberSoFar) {
                largestNumberSoFar = i;
            }
        }
        for(int i:arr) {
            if(i>largestNumber) {
                largestNumber = i;
            }
        }
        return largestNumber;
    }

    
    public static int findMaxNum_Problem_0_147fd7de_3146_4f6e_8f87_df95e9f4e875(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_7426ad89_0cc9_4c35_a9c1_fa614898ca54(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        int max = arr.get(0);
        int maxDigit = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            int currentDigit = arr.get(i);
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
                max = arr.get(i);
            } else if (currentDigit == maxDigit) {
                if (max < currentDigit) {
                    max = currentDigit;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_01b5b323_839a_4a75_86d9_ddcac1d3b669(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_6d33a5e9_dea2_4c20_aa4f_d7ee3f148537(ArrayList<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_2_9dcb3edd_428f_4b26_89e1_9c42c3cfd21e(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_866e030f_a55c_4a22_91e3_d9e4c9c89b9f(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_6b67a61d_222b_4f8e_8419_bf6cf10911bb(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_3603c2d3_3045_4d75_94c1_84fb151c0279(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int num : arr) {
            int temp = num;
            while(temp > 0) {
                maxNum = maxNum * 10;
                maxNum += temp % 10;
                temp /= 10;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_a3692401_1495_44c0_b47b_d1335f9ae489(ArrayList<Integer> arr) {
        int num = 0;
        int n = arr.size();

        if(n < 2) {
            return 0;
        }

        for(int i = 0; i < n - 1; i++) {
            num = Math.max(num, arr.get(i) + arr.get(i + 1));
        }

        num = Math.max(num, arr.get(n - 1));
        return num;
    }

    
    public static int findMaxNum_Problem_2_51fc08ee_eb91_4199_9985_6518064b7548(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_506997b8_3f42_4923_b325_808058cea701(ArrayList<Integer> arr) {
        return arr.stream().reduce(0L, Integer::max);
    }

    
    public static int findMaxNum_Problem_0_78a71f4c_89be_417b_bf40_fa6a9a433cf4(ArrayList<Integer> arr) {
        int maxNum = 0;
        int prevNum = 1;
        for(int i = 0; i < arr.size(); i++) {
            int currNum = prevNum + arr.get(i);
            if(currNum > maxNum) {
                maxNum = currNum;
                prevNum = currNum;
            }
            else {
                prevNum = currNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_a224ceea_72df_4bd6_a625_5f582e72d5fe(ArrayList<Integer> arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_afef404b_ca14_4f7d_b801_f72598595b0a(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int num : arr) {
            maxNum = Math.max(maxNum, num);
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_cd1e8f8d_71c9_425a_ac8e_5b19c2e115e7(ArrayList<Integer> arr) {
        // Your code goes here
        return 0;
    }

    
    public static int findMaxNum_Problem_1_2721cd91_e2a4_4b58_bd38_b7c059910204(ArrayList<Integer> arr) {
        int maxNum = 0;
        int nextNum = 0;
        // loop through the given array
        for (int num : arr) {
            nextNum = num * 10;
            while (nextNum > maxNum) {
                maxNum = nextNum;
            }
            nextNum = 0;
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_6546014a_550d_4bfe_9400_7404b72f958a(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int temp = 0;
            for(int j = 0; j < arr.size(); j++) {
                if(arr.get(j) == 0) {
                    continue;
                }
                temp = temp * 10 + arr.get(j);
            }
            if(temp > max) {
                max = temp;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_1a92e311_c7b1_46c6_ae58_290c8390a256(ArrayList<Integer> arr) {
        int largest = 0;
        for(int num : arr) {
            largest = Math.max(num, largest);
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_1_c699fd05_66d0_4230_b72c_45bdefc6a5ac(ArrayList<Integer> arr) {
        // Write your logic here
        int max = 1;
        for (int i : arr)
            if (i > max)
                max = i;
        return max;
    }

    
    public static int findMaxNum_Problem_0_51ac0161_fddf_4d1c_aa04_2dfbc81f0d1f(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_345dbc9a_7fe2_4017_a2f6_77915add70b5(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(int num : arr) {
            sum += num;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_61cf1063_aeed_4e19_b817_c9289b77348c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int temp = 0;
            for(int j = 0; j < arr.size(); j++) {
                if(j != i) {
                    temp += arr.get(j);
                }
            }
            max = Math.max(max, temp);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_169707f6_13dd_42ec_b739_bc004ea0a0a9(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(int i = 0; i < arr.size(); i++) {
            tempNum = arr.get(i);
            while(tempNum > 0) {
                tempNum = tempNum / 10;
                maxNum = maxNum * 10 + tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_78a71f4c_89be_417b_bf40_fa6a9a433cf4(ArrayList<Integer> arr) {
        int maxNum = 0;
        int prevNum = 1;
        for(int i = 0; i < arr.size(); i++) {
            int currNum = prevNum + arr.get(i);
            if(currNum > maxNum) {
                maxNum = currNum;
                prevNum = currNum;
            }
            else {
                prevNum = currNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_d71efc72_4f3f_4dd2_8a7e_652b49ffc08b(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(int i = 0; i < arr.size(); i++) {
            tempNum = arr.get(i);
            while(tempNum > 0) {
                maxNum = maxNum * 10;
                maxNum += tempNum % 10;
                tempNum /= 10;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_d875bab8_ac01_48da_8d28_331d51b4ec74(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(Integer num: arr){
            maxNum = maxNum > num ? maxNum : num;
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_b797f714_aa29_4627_8260_97dcbbfb9845(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_dbfb506e_2ecb_4ff7_9587_4a9bc86b815b(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for (int num : arr) {
            tempNum = num;
            if (tempNum > maxNum) {
                maxNum = tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_8efb1921_121e_4e59_87d7_b41a7064530e(ArrayList<Integer> arr) {
        int max = 0;
        for(int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_fa34d183_2f93_4894_a6a3_febe833caaa5(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_cd46e27e_9a3d_4293_aa3b_b1d85b3ab089(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_222294f7_e87d_4c17_bdc5_51156a3aabe3(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int i : arr) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_d0206008_f05d_497f_9eb2_0ab8fb0ceb70(ArrayList<Integer> arr) {
        int largestNum = 0;
        int largest = arr.get(0);
        int counter = 1;

        for (int num : arr) {
            largestNum = num;
            counter = 1;
            while (num != 0 && counter < largestNum) {
                largestNum *= 10;
                largest = Math.max(largestNum, largest);
                counter++;
            }
        }

        return largest;
    }

    
    public static int findMaxNum_Problem_1_32485067_6f35_4265_b12a_ec49df3f8b83(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(int num : arr) {
            sum += num;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_f2f1d3e1_d81e_4d3b_8f8b_f057bead6a0d(ArrayList<Integer> arr) {
        int maxNum = Integer.MIN_VALUE;
        for(Integer num : arr) {
            maxNum = Math.max(maxNum, num);
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_f096c165_93c5_4751_98d8_b67e3b6ce8df(ArrayList<Integer> arr) {
        int maxNum = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int currentNum = arr.get(i);
            if(currentNum > maxNum) {
                maxNum = currentNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_9e9b6714_f4fc_48ac_a53c_82130790ad6c(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_7ccdecf1_3b49_4b09_811d_4e4aa4604d7b(ArrayList<Integer> arr) {
        if(arr.isEmpty())
            return 0;
        int max = Integer.MIN_VALUE;
        for(int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_2176a321_a60f_4b8b_972d_f9564b609f3d(ArrayList<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        for (Integer val : arr) {
            int tmp = Integer.parseInteger(val.toString());
            largest = Math.max(tmp, largest);
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_0_5bfbe13c_9d6f_4ac7_b05a_0389952ab716(ArrayList<Integer> arr) {
        int maxNumber = 0;
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = 0; j < len; j++) {
                if (j == i)
                    continue;
                sum += arr.get(j);
            }
            if (sum > maxNumber)
                maxNumber = sum;
        }
        return maxNumber;
    }

    
    public static int findMaxNum_Problem_1_dca60f07_bba2_43b0_89e3_2a90f137edea(ArrayList<Integer> arr) {
        int maxNum = 0;
        int num = 0;
        for (int i : arr) {
            num = num * 10 + i;
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_049e9bbc_150d_4813_8d53_18e8bca5501b(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(int num : arr) {
            tempNum = num;
            while(tempNum > 0) {
                tempNum = tempNum / 10;
                maxNum = tempNum > maxNum ? tempNum : maxNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_74ea4dfa_7251_4f27_b16a_00c5f45d71c1(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int i : arr) {
            int temp = i * i;
            if (temp > maxNum) {
                maxNum = temp;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_6ea2561e_06af_41f6_ae55_503222a84a87(ArrayList<Integer> arr) {
        int maxNum = arr.get(0);
        int sum = 0;
        for (Integer d : arr) {
            sum = sum + d;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_01eb95e3_54b6_4a9f_936c_f27c1f4505a9(ArrayList<Integer> arr) {
        int maxNum = 0;
        // Write your code here.
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    maxNum = arr.get(i);
                }
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_ff3f9897_ef8f_43c3_8189_0729c832b98f(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for (int num : arr) {
            tempNum = num;
            if (tempNum > maxNum) {
                maxNum = tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_f114dd62_6650_4889_a91d_45bc94006e48(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_441e5999_b781_42db_987a_c16b6643bafd(ArrayList<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        for (Integer num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_2_f9752d7d_e86b_448d_a419_f24f53435ae9(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_9ccd64dd_95e4_4a6f_8842_858f6c3e6d68(ArrayList<Integer> arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_e8a66d9d_d0fe_4f93_ae85_0e8f90f3061b(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i: arr)
            if(i>max) max = i;
        return max;
    }

    
    public static int findMaxNum_Problem_0_cf03f10b_66a2_4f69_9ddf_8f2e983a9945(ArrayList<Integer> arr) {
        int max = 0;
        int temp = 0;
        for(int i : arr) {
            temp = i;
            if(temp > max) {
                max = temp;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_cf6ca0ca_0ad0_4fd5_a678_1c05386bb281(ArrayList<Integer> arr) {
        int maxNum = 0;
        int curNum = 0;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_bffb1cc9_c071_400a_92e5_1982aaffe905(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(int num : arr) {
            tempNum = num;
            while(tempNum > 0) {
                tempNum = tempNum / 10;
                maxNum = tempNum > maxNum ? tempNum : maxNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_b288bb9e_6154_474e_b0eb_d06850773a9e(ArrayList<Integer> arr) {
        // Write your logic here
        int maxNum = arr.get(0);
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_4f61399a_2e3c_40ca_a011_65ebcf56827a(ArrayList<Integer> arr) {
        int largestNum = 1;
        int sumOfNums = 0;
        int sumOfFactors = 0;
        for (int num : arr) {
            sumOfFactors += num % 10;
            sumOfNums += num;
            if (sumOfNums > largestNum) {
                largestNum = sumOfNums;
            }
        }
        return largestNum;
    }

    
    public static int findMaxNum_Problem_2_0420b981_0624_45c8_8b68_3dae195411b2(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for (Integer num : arr) {
            tempNum = num;
            if (tempNum > maxNum) {
                maxNum = tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_cb27b3e3_db40_4da2_a76b_41307db18bfd(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_f660c7a2_4300_4fae_b745_54fca1de64cd(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int num : arr) {
            if(num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_175f35ba_e983_40f3_908e_2d9ea8be280d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i< arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_199328f8_9f79_4b9d_8c86_a4fa87402f26(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for(int num : arr) {
            max = Math.max(num, max);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_2472f652_b3ee_4fde_96ba_7e01ddc8dbc1(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(int num : arr) {
            sum += num;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_84ff7301_34fd_43e4_a11d_2d566a77be80(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if(num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_5f9bebd5_10e0_46ab_8c29_c720dcebd5a9(ArrayList<Integer> arr) {
        int maxNum = arr.get(0);
        for (Integer num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_44f11837_85dd_4d93_9845_cb2504b1d163(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for(int j = 0; j < arr.size(); j++) {
                if(i != j) {
                    int temp = arr.get(j);
                    if(num + temp > max) {
                        max = num + temp;
                    }
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_04529353_9f2f_477c_bf41_bcf42b60708e(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_b56fd2a7_15ea_4a52_af7b_5d206def5563(ArrayList<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_0_ff3f9897_ef8f_43c3_8189_0729c832b98f(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for (int num : arr) {
            tempNum = num;
            if (tempNum > maxNum) {
                maxNum = tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_98785445_efb3_4a13_b568_00777e2adc95(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_396f8602_e803_4459_8115_4ebe0e1a55ed(ArrayList<Integer> arr) {
        int max = 0;
        for (Integer i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_91d659be_13e6_40f3_a165_0e27e07bb268(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_558c5509_aa3b_41c4_bcdc_51c2aa8399ac(ArrayList<Integer> arr) {
        int size = arr.size();
        if (size == 0) return 0;
        int max = arr.get(0);
        int digit = size - 1;
        do {
            if (max < arr.get(digit)) max = arr.get(digit);
            digit--;
        } while (digit >= 0);
        return max;
    }

    
    public static int findMaxNum_Problem_2_fed93dc8_8091_441b_9ce9_33e3e7c029ee(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_866e030f_a55c_4a22_91e3_d9e4c9c89b9f(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_10309218_e1d5_4a76_b2d6_7fcc61d10cb8(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = 0;
            for(int j = 0; j < arr.size(); j++) {
                num += arr.get(j) * Math.pow(10, arr.size() - j - 1);
            }
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_30982232_304f_4601_9431_da931ba14cab(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_66fcd976_9bfe_40f4_bea1_ce0952131b50(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_e3b6a50d_1297_4223_96e7_1e1c3f06e2ee(ArrayList<Integer> arr) {
        // TODO Auto-generated method stub
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;
    }

    
    public static int findMaxNum_Problem_0_52eee2fc_393c_4a31_a3cc_767f7b0d5c3a(ArrayList<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i) > largest) {
                largest = arr.get(i);
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_1_7e96e03a_2f0e_4c82_a005_21db65aedfea(ArrayList<Integer> arr) {
        int max = 0;
        int temp = 0;
        for (int i : arr) {
            temp = i;
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_c035f111_9fb0_4e13_b20d_5feba43bfec3(ArrayList<Integer> arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_8a92bbda_7782_46a6_967e_473b08112970(ArrayList<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_2_a5531e68_e254_43a7_8f63_b2c3708af1b5(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;

        for(int i = 0; i<arr.size(); i++) {
            sum += arr.get(i);
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_70c8cac1_7d07_4a37_ac20_1ea646fd3a9a(ArrayList<Integer> arr) {
        int max = 0;
        for (Integer i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_9446f30d_fb45_4389_802e_5ee83de59e41(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = 0;
            for (int j = 0; j < arr.size(); j++) {
                num += arr.get(j) * Math.pow(10, i);
            }
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_98ea0e74_b9b8_4770_bc56_e80f1afdc59d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if(num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_f4fe2cea_6f09_4456_9b94_20538d62c8d7(ArrayList<Integer> arr) {
        // Initialize max to first element of array.
        int max = arr.get(0);

        // Loop to find largest number in array.
        for (int i = 1; i < arr.size(); i++) {
            // If current number is greater than max.
            if (arr.get(i) > max) {
                // Update max to current number.
                max = arr.get(i);
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_8794cbef_f15a_4735_b151_5cd7aee41c5d(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(Integer num : arr) {
            sum += num;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_8300d14d_f754_4cdc_830f_f3f4adef102f(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (Integer num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_3de54c40_1a3d_4591_8929_a0e4f7e7a8c1(ArrayList<Integer> arr) {
        int n = arr.size();
        int maxNum = 0;
        for(int i=0;i<n; i++) {
            int temp = 0;
            for(int j=0;j<arr.size();j++) {
                if(arr.get(i) % (10*j) == 0) {
                    temp = temp*10 + arr.get(i);
                    break;
                }
            }
            if(temp > maxNum) {
                maxNum = temp;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_0e7405c5_0d4e_4d27_a64c_5af3cd3dc38f(ArrayList<Integer> arr) {
        // Your code here
        return 0;
    }

    
    public static int findMaxNum_Problem_0_3a4c795c_8f8a_4418_ba92_a4d1e3bd5703(ArrayList<Integer> arr) {
        int maxValue = 0; // the maximum value of digits in the array
        for (int i : arr) {
            maxValue = Math.max(i, maxValue);
        }
        return maxValue;
    }

    
    public static int findMaxNum_Problem_1_61cf1063_aeed_4e19_b817_c9289b77348c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int temp = 0;
            for(int j = 0; j < arr.size(); j++) {
                if(j != i) {
                    temp += arr.get(j);
                }
            }
            max = Math.max(max, temp);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_175f35ba_e983_40f3_908e_2d9ea8be280d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i< arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_4614c295_275c_42b5_a22d_e75a366461db(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = 0;
            for(int j = 0; j < arr.size(); j++) {
                num += arr.get(j) * Math.pow(10, i);
            }
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_53479432_0708_495e_9644_3f02b06c2da0(ArrayList<Integer> arr) {
        int max = 0, temp = 0;
        for(int i : arr) {
            temp = i;
            if (i < max) {
                max = i;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_9d344f8a_1095_40d6_b949_bcee4cfdd5de(ArrayList<Integer> arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_1b94d594_678c_42b1_aeef_dcfd8e1a1ecc(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(int i : arr) {
            sum += i;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_6ddd4ccc_5984_4442_9d05_42fd367f4e46(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_5e21f399_06f3_4320_b0b2_9bfe85dddd19(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(int num : arr) {
            tempNum = num;
            while(tempNum > 0) {
                tempNum = tempNum / 10;
                maxNum = maxNum * 10 + tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_0e39fa81_299f_4eb7_84a5_fb117ce1b407(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(int num : arr) {
            sum += num;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_17e28fd5_9c2a_4a12_9249_c2591066667c(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int findMaxNum_Problem_0_4e43ed70_833d_4a59_b233_ec4234b37170(ArrayList<Integer> arr) {
        int max = 0;
        for (Integer i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_2ab33eaa_b500_4b80_8e37_b52a7c7d08e3(ArrayList<Integer> arr) {
        int max = 0;
        int temp = 0;
        for(int num : arr) {
            temp = num;
            if(temp > max) {
                max = temp;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_8c41c52a_0b75_4af9_9c32_e871835cbf17(ArrayList<Integer> arr) {
        int maxNum = 0;
        int temp = 0;
        for (int i : arr) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_c7de9f3e_1531_472a_a8d1_c68c14bcfbf5(ArrayList<Integer> arr) {
        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_b29e3478_8d6c_436d_aa37_d1c2e5500183(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(int i = 0; i < arr.size(); i++) {
            tempNum = arr.get(i);
            while(tempNum > 0) {
                tempNum = tempNum / 10;
                maxNum = maxNum * 10 + tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_226f4ff9_acb6_4dad_95a3_a5b1757e133f(ArrayList<Integer> arr) {
        int max = 0;
        int curr = arr.get(0);
        for(int num : arr) {
            if(num > curr) curr = num;
            if(num > max) max = num;
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_9d318978_b613_4b02_889f_7a89185613d4(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_b3964d7a_9c8e_4959_ae7a_6af695a5a93d(ArrayList<Integer> arr) {
        int largest = 0;
        for (int i = 0; i < arr.size(); i++) {
            int temp;
            temp = arr.get(i);
            if (temp > largest) {
                largest = temp;
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_2_a5fb9b51_7517_44ee_9a7d_d85711ed66db(ArrayList<Integer> arr) {
        int max=0;
        int curr=0;
        for (Integer i: arr) {
            curr+=i;
            if(max<curr)
                max=curr;
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_b4150dd3_04b4_4f3c_a40f_fbbb4d3b128c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_6a8349b9_cbfe_4bf6_aa35_3050c42a8451(ArrayList<Integer> arr) {
        int largest = 0;
        for(int x : arr){
            if(x>largest)
                largest = x;
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_0_c031afbf_4280_49aa_a05b_4cf00e17f31b(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for(int j = 0; j < arr.size(); j++) {
                if(i != j) {
                    int num2 = arr.get(j);
                    int num3 = num + num2;
                    if(num3 > max) {
                        max = num3;
                    }
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_f660c7a2_4300_4fae_b745_54fca1de64cd(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int num : arr) {
            if(num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_42dbf9b5_f3f8_489f_b078_ef5de1cba405(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_51ac0161_fddf_4d1c_aa04_2dfbc81f0d1f(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_66fcd976_9bfe_40f4_bea1_ce0952131b50(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_c3ad12b2_0a90_4ed1_977f_b4097e7aebbe(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int num = arr.get(i) * arr.get(j);
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_cd1be56a_b062_4b7f_8894_1bdc6386f71b(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_202e234e_5284_4554_ab90_70cb7ccadbff(ArrayList<Integer> arr) {
        int max = 0;
        int temp = 0;
        for(int num : arr) {
            temp = num;
            while(temp > 0) {
                temp = temp / 10;
            }
            if(max < temp) {
                max = temp;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_c035f111_9fb0_4e13_b20d_5feba43bfec3(ArrayList<Integer> arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_823aa8f1_a005_4a89_98a4_618803a5bdb1(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int i : arr) {
            if( i > maxNum) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_01d8c9fa_8cdd_41e3_8ceb_75508b21acc7(ArrayList<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        int sumOfDigitsUsed = 0;
        for (int i : arr) {
            sumOfDigitsUsed += i;
        }
        for (int i : arr) {
            int currentMax = sumOfDigitsUsed % 10;
            sumOfDigitsUsed /= 10;
            if (currentMax < largest) {
                largest = currentMax;
            }
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_2_aaea0e23_dd33_45e3_811c_538d9af601ac(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int num : arr) {
            if(num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_1a92e311_c7b1_46c6_ae58_290c8390a256(ArrayList<Integer> arr) {
        int largest = 0;
        for(int num : arr) {
            largest = Math.max(num, largest);
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_0_70765ad3_e62b_4749_835c_ea7ef7c7dab4(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int num : arr) {
            if(num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_e8a66d9d_d0fe_4f93_ae85_0e8f90f3061b(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i: arr)
            if(i>max) max = i;
        return max;
    }

    
    public static int findMaxNum_Problem_0_a4a20767_205b_4a51_8a38_b505c9371532(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_4f47ca1f_7ab2_4fd6_9e90_991cce603f02(ArrayList<Integer> arr) {
        int max = 0;
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_cd1be56a_b062_4b7f_8894_1bdc6386f71b(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_45fcc2ab_fbc4_47cc_b4d3_928120e9bf52(ArrayList<Integer> arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_ef41952b_5938_41d7_b4b3_ae4da1497b9c(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int num: arr) {
            maxNum = maxNum > num ? maxNum : num;
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_09a041ff_afe2_4215_b99e_3a57c3b16469(ArrayList<Integer> arr) {
        int maxNum = 0;
        int temp = 0;
        for(int num : arr) {
            temp = num;
            while(temp > 0) {
                maxNum = temp;
                temp -= num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_043068f7_2731_45f9_8eb6_5d0c03d875d8(ArrayList<Integer> arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_8645d851_4fee_40aa_8fd7_14ff82202d41(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    int temp = arr.get(j);
                    if (num + temp > max) {
                        max = num + temp;
                    }
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_1fbf40e6_f544_4c73_9a6b_629a540f8c85(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(Integer num : arr) {
            sum += num;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_465682a3_c693_4e8e_8240_7f9d7005cb2a(ArrayList<Integer> arr) {
        int maxNumber = 0;
        for (Integer item : arr) {
            if (item > maxNumber) {
                maxNumber = item;
            }
        }
        return maxNumber;
    }

    
    public static int findMaxNum_Problem_0_32485067_6f35_4265_b12a_ec49df3f8b83(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(int num : arr) {
            sum += num;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_bec3b37d_0300_439b_b535_d5fd69f7b508(ArrayList<Integer> arr) {
        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_b128481b_c300_4b1c_a998_793394f3779e(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (Integer num : arr) {
            maxNum = Math.max(maxNum, num);
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_7f489cd9_11ea_44e4_973a_6891379fd389(ArrayList<Integer> arr) {
        int maxNum = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_70329917_a81b_47a4_bdea_1249a380141a(ArrayList<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        Collections.reverse(arr);
        StringBuilder sb = new StringBuilder();
        for(int i: arr) {
            sb.append(i);
        }
        return Integer.parseInteger(sb.toString());
    }

    
    public static int findMaxNum_Problem_2_693458a2_0d99_4151_b672_1d156ec779bc(ArrayList<Integer> arr) {
        // Write your code here.
        Collections.sort(arr);
        Collections.reverse(arr);
        StringBuilder sb = new StringBuilder();
        for(Integer l : arr) {
            sb.append(l);
        }
        return Integer.parseInteger(sb.toString());
    }

    
    public static int findMaxNum_Problem_2_14a8001f_0bc2_40b6_930b_20dcf83dc831(ArrayList<Integer> arr) {
        int max = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            if(temp > max) {
                max = temp;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_cc9a71aa_7c2f_4d9d_9aa5_6073eda28591(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
                maxNum = num;
            } else if (num == max) {
                if (num > maxNum) {
                    maxNum = num;
                }
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_5175a8b0_3afd_4150_ab80_f1ee593905f4(ArrayList<Integer> arr) {
        int num = 0;
        int max = 0;
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        num = max;
        return num;
    }

    
    public static int findMaxNum_Problem_1_2be3a6b2_ac7a_450c_b08e_2771a6f7a8c7(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_48a22354_4d3e_4f6e_8aa2_286a29f636b4(ArrayList<Integer> arr) {
        int max = 0;
        int temp = 0;
        for (int i : arr) {
            temp = i;
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_44a93e59_0219_4440_b03e_6e2748e0e0c4(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(int i = 0; i < arr.size(); i++) {
            tempNum = arr.get(i);
            while(tempNum > 0) {
                maxNum = maxNum * 10;
                maxNum += tempNum % 10;
                tempNum /= 10;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_ab389a8e_c173_46eb_a635_d76098e64377(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_4bd5f16d_3256_40e5_ab06_a45927bb9a02(ArrayList<Integer> arr) {
        int maxNum = 0;
        int curNum = 0;
        for(int num : arr) {
            curNum = num;
            while(curNum > 0) {
                maxNum = curNum;
                curNum = curNum / 10;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_b5810286_c06f_46f5_888e_0b2626d23937(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_b29e3478_8d6c_436d_aa37_d1c2e5500183(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(int i = 0; i < arr.size(); i++) {
            tempNum = arr.get(i);
            while(tempNum > 0) {
                tempNum = tempNum / 10;
                maxNum = maxNum * 10 + tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_76f83843_1c79_4fed_8541_912e782f8d6f(ArrayList<Integer> arr) {
        int largest = 0;
        for (Integer i : arr) {
            largest = Math.max(i, largest);
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_2_984d6a88_b87a_4c6d_8a7f_2b1d292a7eed(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int num2 = arr.get(j);
                int num3 = num * num2;
                if (num3 > max) {
                    max = num3;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_10d1ef3c_850a_40ab_9122_83c253478265(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int num2 = arr.get(j);
                int num3 = num * num2;
                if (num3 > max) {
                    max = num3;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_f4870708_609a_451b_94c0_d9c9eb5906a4(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for (Integer i : arr) {
            tempNum = i;
            if (tempNum > maxNum) {
                maxNum = tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_0f36947f_4fbd_4203_a31a_bf598b6343d3(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.size(); j++) {
                if(i != j) {
                    int num = arr.get(i) * arr.get(j);
                    if(num > max) {
                        max = num;
                    }
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_3603c2d3_3045_4d75_94c1_84fb151c0279(ArrayList<Integer> arr) {
        int maxNum = 0;
        for(int num : arr) {
            int temp = num;
            while(temp > 0) {
                maxNum = maxNum * 10;
                maxNum += temp % 10;
                temp /= 10;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_c5828fff_7449_405b_aa1f_243e06f79067(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int num2 = arr.get(j);
                int num3 = num + num2;
                if (num3 > max) {
                    max = num3;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_542bf4d1_294f_4bec_b6b3_c68e3734a393(ArrayList<Integer> arr) {
        Collections.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Integer i : arr) {
            sb.append(i);
        }
        return Integer.parseInteger(sb.toString());
    }

    
    public static int findMaxNum_Problem_0_eba9270d_7ca1_48b1_958e_c648dd89f3fd(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (Integer num : arr) {
            maxNum = Math.max(maxNum, num);
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_44f11837_85dd_4d93_9845_cb2504b1d163(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for(int j = 0; j < arr.size(); j++) {
                if(i != j) {
                    int temp = arr.get(j);
                    if(num + temp > max) {
                        max = num + temp;
                    }
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_01fdf68c_fa4a_4a7c_8e04_db01de1024f2(ArrayList<Integer> arr) {
        int maxNum = 0;
        int tempNum = 0;
        for(Integer num : arr) {
            tempNum = num;
            if(tempNum > maxNum) {
                maxNum = tempNum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_18e2e928_0558_445b_adef_0aeb5b69593c(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i < max) {
                max = i;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_e06be786_f061_4b78_9cfb_256853cbcc13(ArrayList<Integer> arr) {
        int maxNum = 0;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_199328f8_9f79_4b9d_8c86_a4fa87402f26(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for(int num : arr) {
            max = Math.max(num, max);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_fe4b9963_b6bc_47ed_bb6c_85d37934fbc3(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for(int num : arr) {
            sum += num;
            if(sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_dc2dd177_3125_4cb7_8770_5f444cf29b06(ArrayList<Integer> arr) {
        int largest = 0;
        // TODO: Write your code here
        // For loop
        for (Integer number : arr) {
            largest = number;
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_1_15e346dd_9a2c_4887_b15a_abec1e21c0e6(ArrayList<Integer> arr) {
        int max = arr.stream().mapToInteger(Integer::intValue).reduce(0, Integer::max);
        return max;
    }

    
    public static int findMaxNum_Problem_2_099fe9ff_7bad_4904_97c2_6da356ca6317(ArrayList<Integer> arr) {
        // Write your code here
        int res = 0;
        int i = 0;
        while (i < arr.size() && arr.get(i) > 0) {
            res = Math.max(res, arr.get(i));
            i++;
        }
        return res;
    }

    
    public static int findMaxNum_Problem_0_d7d8c961_73ef_46e7_8ed3_fe8775ba1dbf(ArrayList<Integer> arr) {
        int max = 0;
        int temp = 0;
        for (int num : arr) {
            temp = num;
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_0f365e79_58e2_42f8_9103_0eb866438ccd(ArrayList<Integer> arr) {
        int max = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            max = Math.max(max, temp);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_0_1ac5d1b1_66e0_4d8d_b984_83af6c69c513(ArrayList<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        for(int num : arr) {
            largest = Math.max(largest, num);
        }
        return largest;
    }

    
    public static int findMaxNum_Problem_0_01b5b323_839a_4a75_86d9_ddcac1d3b669(ArrayList<Integer> arr) {
        int maxNum = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_c699fd05_66d0_4230_b72c_45bdefc6a5ac(ArrayList<Integer> arr) {
        // Write your logic here
        int max = 1;
        for (int i : arr)
            if (i > max)
                max = i;
        return max;
    }

    
    public static int findMaxNum_Problem_1_bb8b6ae5_baac_45f7_a13b_5f13f012caa3(ArrayList<Integer> arr) {
        int maxNum = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            while(temp > 0) {
                maxNum = maxNum * 10;
                maxNum += temp % 10;
                temp /= 10;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_6fe0a02f_0499_4bf4_8f1c_6a024bc9e9cf(ArrayList<Integer> arr) {
        int result = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n < result) {
                result = n;
            }
        }
        return result;
    }

    
    public static int findMaxNum_Problem_2_1b257afc_4af0_4bbf_adbc_0fad7f69af61(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int temp = 0;
            for(int j = 0; j < arr.size(); j++) {
                temp += arr.get(j) * Math.pow(10, i);
            }
            max = Math.max(max, temp);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_1346608f_9b5d_4670_8d4b_cc07f0d10574(ArrayList<Integer> arr) {
        //use streams to filter the array and get the max number
        return arr.stream().filter(a -> a >= 0).reduce(Math::max).get();
    }

    
    public static int findMaxNum_Problem_1_a321780e_327f_430e_b5db_b0f95d3e6e9e(ArrayList<Integer> arr) {
        int maxNum = Integer.MIN_VALUE;
        int currentNum = Integer.MIN_VALUE;
        for(Integer d : arr) {
            if(d > currentNum) {
                currentNum = d;
            }
        }
        if(currentNum > maxNum) {
            maxNum = currentNum;
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_1_aef3e5a2_e21d_46b0_b330_74a644d98f1b(ArrayList<Integer> arr) {
        int maxNum = arr.get(0);
        for(int n: arr) {
            if( n > maxNum) {
                maxNum = n;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_0_681fe34a_cf15_441e_871b_9f96fc3c3094(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int num2 = arr.get(j);
                int num3 = num * num2;
                if (num3 > max) {
                    max = num3;
                }
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_fd3ca335_e2cf_437e_bcb2_3d2089333cad(ArrayList<Integer> arr) {
        int maxNum = 0;
        int maxNumIndex = 0;
        int currentNum = 0;
        for(int i = 0; i < arr.size(); i++) {
            currentNum = arr.get(i);
            if(currentNum > maxNum) {
                maxNum = currentNum;
                maxNumIndex = i;
            }
        }
        return maxNum;
    }

    
    public static int findMaxNum_Problem_2_54bd730b_7fd6_4832_abe6_021949fcb4e4(ArrayList<Integer> arr) {
        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    
    public static int findMaxNum_Problem_1_f660252a_16b1_4a8a_a922_c50bb8752525(ArrayList<Integer> arr) {
        int maxnum = Integer.MIN_VALUE;
        for (Integer elem : arr)
            if (maxnum < elem)
                maxnum = elem;
        return maxnum;
    }

    
    public static int findMaxNum_Problem_0_2be3a6b2_ac7a_450c_b08e_2771a6f7a8c7(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMaxNum_Problem_2_933c5e46_e8cc_4dad_9d6a_5fc7ee7145a3(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = 0;
            for(int j = 0; j < arr.size(); j++) {
                num += arr.get(j) * Math.pow(10, i);
            }
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

}
