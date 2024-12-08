package HumanEval_84_solve;

public class HumanEval_84_solve {

    
    public static String solve_Problem_4_b72e6a93_ba4a_4756_8e67_74f359f37497(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_1511691b_6ac0_44b8_9090_e50c2960e1c8(int N) {
        // your implementation
        // your code
        return "";
}

    
    public static String solve_Problem_1_fdc20c7e_1305_424e_93ef_a81e69c146ca(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_f0f1c124_0579_4263_afda_39c868b9b903(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_7619bf97_b24b_4fbd_93fe_3f4903fbab56(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int remainder = N % 10;
            sum += remainder;
            N = N / 10;
        }
        for (int i = sum; i >= 0; i--){
            sb.append(String.valueOf(sum % 2));
            sum = sum / 2;
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_d4b087e5_e0a8_48b6_ac50_0888b1b4172d(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_94189314_b2e6_4af7_91d0_509bfe8c943a(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_4_0629c666_f6b2_4b6d_b6af_728a1e54c484(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_4e9dd11b_09c7_4b26_ba1e_dce086050fd6(int N) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        String binString = Integer.toBinaryString(N);
        String sum = String.valueOf(Arrays.stream(binString.split("")).filter(x -> !x.equals("")).mapToInt(Integer::parseInt).sum());
        return sum;
    }

    
    public static String solve_Problem_1_02826f02_2260_4f63_af35_43b2a5c6f5b1(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_e82d7384_76f6_4132_b774_3b86df0cbdd2(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_44a3873e_f327_4153_ac29_6b8df18bd00d(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainder = 0;
        while (N !=0){
            remainder = N % 2;
            N = N/2;
            sum = sum + remainder;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_4_7ab2d6b8_e683_4860_9807_9fd669471219(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_0_37f80cc6_d0c2_44cb_93e6_3b004561b264(int N) {

        String s = "";
        while (N > 0) {
            s = s + (N % 2);
            N = N / 2;
        }
        return s;
    }

    
    public static String solve_Problem_0_d3f37109_d953_4ba9_8f48_0deb6b36bbb5(int N) {

        // Write your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_cdde6155_4a86_48b0_b782_d95d33bce85d(int N) {
        return "";
    }

    
    public static String solve_Problem_1_dcf50960_2358_4232_81a6_4ed400b909d2(int N) {

        String result = "";
        while(N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_2140106c_0a03_44bc_82da_65de9c810ad2(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_d9208085_6bd3_48aa_855d_db14aeb1c906(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_0_01806cbb_1d57_4c38_b692_62f7e5ebaaaf(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_48690a92_ec59_45c6_bcc1_34a56543bd82(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_2dd2737b_5fd5_4faa_bbcb_c198a837a256(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_2771468f_ac1d_42da_a673_1e5861489a6c(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_da809e3d_c85a_42f6_a8a7_d9605dfb9334(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_a18604a9_9e0d_4d74_a9b9_8ec3751177cd(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_81d1d7f8_c932_46aa_bde1_91b08b300932(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_6ae6dad0_3c59_485a_b48a_93ffab269385(int N) {

        String binary = "";
        while (N > 0) {
            binary = N % 2 + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_4_9ae6fafb_d74b_4f00_acb0_771cc9b5ef5f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_e06cf363_d976_4336_a9b6_79db7c4b2480(int N) {

        // Write your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_2a559702_54d4_4b37_9706_83a68820e1d2(int N) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_201234f3_d556_49dc_8f67_1fdbd3264589(int N) {
        // Your code here
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_1_9621072c_3cb9_4341_82b7_bccf250dad86(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_edfe38a7_4707_4138_af8f_c5838759b8a5(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_6d9eae25_dc9d_410b_8108_4196194afa67(int N) {
        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_43b5a651_3418_47ed_b9b7_6d5b2efd30e8(int N) {
        String binary = Integer.toBinaryString(N);
        if (binary.length() > 2) {
            return "0";
        }
        String result = "";
        for (char c : binary.toCharArray()) {
            if (c == '0') {
                continue;
            }
            int digit = Character.getNumericValue(c);
            result += (char) (Math.pow(16, digit));
        }
        return result;
    }

    
    public static String solve_Problem_0_15da2849_aab4_4b01_87ca_dae8c8250615(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int temp;
        int count = 0;
        while(N !=0){
            temp = N % 10;
            sum += temp;
            N = N / 10;
            count++;
        }
        while(sum > 0){
            temp = sum % 10;
            sb.append(temp);
            sum = sum / 10;
        }
        return sb.toString();
}

    
    public static String solve_Problem_4_17e6b65f_394f_49a6_8faf_9b76606095cb(int N) {
        String binaryN = "";
        int sum = 0;
        while(N !=0) {
            sum=sum+(N%2);
            N=N/2;
        }
        binaryN=Integer.toString(sum);
        return binaryN;
}

    
    public static String solve_Problem_3_75468566_e205_4e1a_af8e_a74654084722(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_9c10269f_0118_4611_8d50_1241b25be609(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_5d1ccfc9_0253_4589_b863_649344697b8e(int N) {

        StringBuilder sb = new StringBuilder();
        while(N > 0){
            sb.insert(0, N%2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_43b5a651_3418_47ed_b9b7_6d5b2efd30e8(int N) {
        String binary = Integer.toBinaryString(N);
        if (binary.length() > 2) {
            return "0";
        }
        String result = "";
        for (char c : binary.toCharArray()) {
            if (c == '0') {
                continue;
            }
            int digit = Character.getNumericValue(c);
            result += (char) (Math.pow(16, digit));
        }
        return result;
    }

    
    public static String solve_Problem_3_2f90bf08_9ec9_4796_8bff_61fedce4f27f(int N) {
        // This is the main code
        String result = "";
        while (N != 0) {
            int remainder = N % 2;
            result = remainder + result;
            N = N / 2;
        }
        return result;
}

    
    public static String solve_Problem_3_e14f14a6_808b_49cb_932e_59eb0e2855e2(int N) {

        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_e53ec839_d313_4004_b5f9_b1dba3ad2064(int N) {
        // Write your code here.
        String s = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_0_41b0cb99_ca8b_47d7_bd32_dcc966aeb4fe(int N) {
        // write your code here
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int remainder = i % 10;
            String s = remainder + "";
            if (s.length() == 1) {
                result.append('0');
            }
            result.append((char) (s.length() - 1));
        }
        return result.toString();
}

    
    public static String solve_Problem_4_23b118a2_bffc_46a9_b34c_86355a301643(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_5db5d1c4_c531_47cf_a430_acc2083d99c4(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_01806cbb_1d57_4c38_b692_62f7e5ebaaaf(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_f524fff8_b687_4548_8c9b_d43ac3e62731(int N) {
        StringBuilder sb = new StringBuilder();
        if (N == 0) {
            sb.append("0");
            return sb.toString();
        }
        sb.append(solve_Problem_0_f524fff8_b687_4548_8c9b_d43ac3e62731(N/10));
        sb.append(solve_Problem_0_f524fff8_b687_4548_8c9b_d43ac3e62731(N%10));
        return sb.toString();
    }

    
    public static String solve_Problem_4_8b2551b8_6047_4223_b918_8125d98743d6(int N) {

        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Character.getNumericValue(binary.charAt(i));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_3_dd7a14f6_a148_4b2d_86c5_520edce58e8e(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_e5cbf74a_2645_41d1_b180_e73726dac6dc(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_b1fcc095_623a_4581_85aa_bbef6ad42248(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_f48b4774_a5cd_4db0_9632_e3faf1dddf31(int N) {
        // Your code here
        return "";
    }

    
    public static String solve_Problem_3_b910979c_04ec_4d64_9ba2_5383f2a76865(int N) {
        String s = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_3_321d98a5_a9b4_47e7_afc4_230d5afd5fab(int N) {
        StringBuilder sb = new StringBuilder();
        for(int i = N; i > 0; i /= 2)
            sb.append(i%2 == 0 ? "1" : "0");
        return sb.toString();
}

    
    public static String solve_Problem_3_2fbe35cc_d86e_45bf_a0e8_1226e9a88c1f(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(True) {
            int digit = N % 10;
            sum += digit;
            N /= 10;
            if(N == 0) break;
            sb.append(digit);
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_4_c8d9cbd0_b284_4271_996b_dda1bbf5dcd7(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_cf355ee9_a7e3_4268_a500_bbedaba85df4(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainder = 0;
        int count = 0;
        while (N > 0) {
            sum += N % 10;
            N = N / 10;
            count++;
        }
        int temp = sum;
        while (temp > 0) {
            remainder = temp % 2;
            temp = temp / 2;
            if (remainder == 1) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return sb.toString();
}

    
    public static String solve_Problem_4_f7c58cf3_b010_44c2_8fbe_313944049383(int N) {
        // First, we create a string called output that will build the binary number output.
        String output = "";
        // Create a loop to find the modulo of N and the binary number 1, and store the remainder in output.
        while (N != 0) {
            output = (N % 2) + output;
            N = N / 2;
        }
        // Return the output.
        return output;
    }

    
    public static String solve_Problem_4_9eadd6ed_f4c4_40aa_92c4_0775c1569e87(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_aa60ec22_9854_49d3_aace_6af1fab8be05(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_14fe810f_dae4_4146_941e_af653d766940(int N) {

        // Write your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_82c093ad_26ee_48a2_9dee_7fa61ad3732f(int N) {
        if (N < 0 || N > 10000) {
            return "error";
        }
        String s = Integer.toBinaryString(N);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    
    public static String solve_Problem_0_85e7697c_72b6_42ff_939c_b9e72dc93692(int N) {
        // If N is less than 0 return null
        if(N < 0) {
            return null;
        }

        // If N is zero, return an empty string
        if(N == 0) {
            return "";
        }

        // If N is 1, return "1"
        if(N == 1) {
            return "1";
        }

        // Initialize a BigDecimal for current sum
        BigDecimal sum = new BigDecimal(String.valueOf(N));

        // Start a loop
        while(sum.compareTo(BigDecimal.ZERO) == 1) {
            String s = sum.toString();
            sum.add(new BigDecimal(String.valueOf(Integer.parseInt(s.substring(0,s.length() - 1)))));
        }
        return sum.toString();
}

    
    public static String solve_Problem_1_90ce0907_fc1f_4df9_b38d_3fc399c5f93b(int N) {
        String s = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_1_87450759_31d0_41a5_b52e_0bf295cb5e98(int N) {
        String ret = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < ret.length(); i++) {
            sum += Integer.parseInt(String.valueOf(ret.charAt(i)));
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_4_82c093ad_26ee_48a2_9dee_7fa61ad3732f(int N) {
        if (N < 0 || N > 10000) {
            return "error";
        }
        String s = Integer.toBinaryString(N);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    
    public static String solve_Problem_3_521655cf_8c34_4dce_951c_e280925679eb(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_17823e19_4e5e_452a_b4f8_b32c112eabca(int N) {
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_3_8a0d970f_d135_4840_abff_68e7fe6e14d2(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_dd7a14f6_a148_4b2d_86c5_520edce58e8e(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_d116aba1_8b45_4705_a92a_77c1ebaafa9e(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_0_8d51fc33_6269_4a81_b67b_c11502b42221(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_200b78e2_3948_4176_b954_acf665eb37b4(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_87e7c9e9_b1e4_4ea8_beb7_953bf4c845e9(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_9c093847_1c67_48b4_ad49_dd8487068edb(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_4cf228df_2e11_4b08_91ba_e839fe79d66e(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = binary.chars().map(Character::getNumericValue).sum();
        return Integer.toString(sum);
}

    
    public static String solve_Problem_1_93e17d20_7cb8_4a4d_b59a_6fc6c8b6d057(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_c4a12032_a206_4b1d_8fa9_e7f2dd1fd101(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_1_90760d29_766e_4627_a98f_eef612d43a55(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_9058d4d6_e260_4a1f_9172_1607b73d88a2(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_48d08ef3_f106_4f4f_8c51_6f8501f49977(int N) {
        String result = "";
        int quotient = N;
        int remainder = 0;
        while (quotient > 0) {
            remainder = quotient % 2;
            quotient = quotient / 2;
            result = String.valueOf(remainder) + result;
        }
        return result;
    }

    
    public static String solve_Problem_3_eab90019_be85_4b85_ad51_7722fe15d85d(int N) {
        int num = 0;
        while(True){
            int temp = N % 10;
            N = N / 10;
            num += temp;
            if(N == 0){
                break;
            }
        }
        String binary = String.format("%" + String.valueOf(num) + "d", num);
        return binary;
    }

    
    public static String solve_Problem_1_2fc43b1a_0697_45e0_9651_c2c59cd573c5(int N) {
        String res = "";
        while (N != 0) {
            res = (N % 2) + res;
            N /= 2;
        }
        return res;
    }

    
    public static String solve_Problem_0_e8a303df_adb3_492d_bbec_a457df73fd16(int N) {
        StringBuilder binary = new StringBuilder();
        int rem = 0;
        int quo = N;
        while (quo != 0) {
            rem = quo % 2;
            quo = quo / 2;
            binary.append(rem);
        }
        binary.reverse();
        return binary.toString();
}

    
    public static String solve_Problem_3_f612006c_e28c_44e3_b7c2_2333f93fea10(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_cf4e5357_4ffc_4958_b0fa_54e8dad8c0f0(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_46cf48e9_2531_449d_88e8_5b372dd3c89e(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_2e1a6154_97c1_42dd_89a5_770e4ac49a03(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_4b13c839_2194_473e_af7b_52dae0b26676(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        sb = new StringBuilder();
        while (sum > 0){
            int remainder = sum % 2;
            sum = sum / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_7ad7167d_07e0_4b23_a53c_540ca623996d(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_cd0485ba_1984_476e_97a6_6a977a60c9b4(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_87e7c9e9_b1e4_4ea8_beb7_953bf4c845e9(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_a408023d_9054_4d76_b387_c2720e339c0b(int N) {

        String binary = "";
        while (N > 0) {
            binary = (N % 2) + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_0_57b5063c_e9cb_454f_ab99_5becfefb0b31(int N) {

        // Write your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_d141d0fa_4ff3_46cb_92d4_52edf4a921a0(int N) {

        String binary = "";
        while (N > 0) {
            binary = (N % 2) + binary;
            N = N / 2;
        }
        return binary;
    }

    
    public static String solve_Problem_0_7d8681bb_1465_4262_8b23_8d0346c19a2a(int N) {
        // Write your code here
        String s = "";
        int t = N;
        while (t > 0) {
            int rem = (t % 2);
            s += Integer.toString(rem);
            t /= 2;
        }
        return s;
}

    
    public static String solve_Problem_4_4b13c839_2194_473e_af7b_52dae0b26676(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        sb = new StringBuilder();
        while (sum > 0){
            int remainder = sum % 2;
            sum = sum / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_02ba8001_cb28_4c28_8c70_607d52c96204(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_10f1908a_77e8_4b2f_9718_cbf3458ec0e5(int N) {
        StringBuilder sb = new StringBuilder();
        if (N <= 0) {
            throw new IllegalArgumentException("Not a valid number. Must be greater then zero");
        }
        for (int i = 2; i <= N; i *= 10) {
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum != 0) {
                sb.append(sum);
            }
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_36a7eb1e_f113_4394_aad9_af53b85a0efb(int N) {
        // 1. Convert int N to binary
        String binary = Integer.toBinaryString(N);
        // 2. Convert binary to list of char
        char[] arr = binary.toCharArray();
        // 3. Sum up the digits in the binary number
        int sum = 0;
        for (char c : arr) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        // 4. Return the binary of the sum
        return Integer.toBinaryString(sum);
}

    
    public static String solve_Problem_4_2a9c4518_0e21_4b16_9179_f118099bfb3b(int N) {
        String result = "";
        int base = 1;
        while (N --> 0) {
            int digit = N % base;
            N = (N / base) + 1;
            int last = digit % base;
            int n =  (digit / base) + 1;
            while (n > 0) {
                result += (last%2 == 0) ? "1" : "0";
                last /= 2;
                n /= 2;
            }
        }
        return result;
    }

    
    public static String solve_Problem_4_82c3161c_fa49_422e_a00c_f866e85b8d41(int N) {
        BigInteger big = BigInteger.valueOf(N);
        return big.toString(2);
    }

    
    public static String solve_Problem_4_5d2ee892_8dd4_4844_b1e5_3f139ca98021(int N) {
        // write your code in Java here
        if(N==0) return "0";
        
        int sum=0;
        while(N>0){
            sum=sum+(N%10);
            N=N/10;
        }
        
        StringBuilder sb=new StringBuilder();
        while(sum>0){
            sb=sb.append(sum%2);
            sum=sum/2;
        }
        
        return sb.toString();
}

    
    public static String solve_Problem_0_4b13c839_2194_473e_af7b_52dae0b26676(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        sb = new StringBuilder();
        while (sum > 0){
            int remainder = sum % 2;
            sum = sum / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_61c250fc_4ee0_49ff_b79f_e6c7d51fda45(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int digit = N % 10;
            sum += digit;
            N /= 10;
        }
        while(sum > 0){
            int digit = sum % 2;
            sb.append(digit);
            sum /= 2;
        }
        return sb.toString();
}

    
    public static String solve_Problem_4_6e997dfc_a6ce_4bd6_97c6_f11b8a1f8938(int N) {
        String s = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_1_6bf4253e_1bb4_49ef_b88c_5fbd20bdee4a(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_4_eb9988e2_7b65_419e_972e_5d7469ab00e8(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_78a3601f_d651_4840_bf77_92c06c1c20a8(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_61c250fc_4ee0_49ff_b79f_e6c7d51fda45(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int digit = N % 10;
            sum += digit;
            N /= 10;
        }
        while(sum > 0){
            int digit = sum % 2;
            sb.append(digit);
            sum /= 2;
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_308499e7_8167_433b_ad73_a41067ef855c(int N) {

        // Write your code here
        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_3_93072bcb_9af1_4686_ab34_4ab5865c73e7(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_8e4670c3_351c_4b89_94e2_f4fa38ff7897(int N) {
        int remainder = 0;
        int sum = 0;
        // Set up the remainder value so that it fits in Integer.MAX_VALUE
        while (N % (sum + remainder) == 0) {
            remainder = 1;
            sum++;
        }
        // Now divide N by sum & remainder
        while (N % (sum + remainder) != 0) {
            remainder *= 10;
            sum++;
        }
        // Convert the int back into binary
        while (sum > 0) {
            int digit =  remainder;
            String s = Integer.toBinaryString(digit);
            s = s.substring(s.length() - 1);
            sum += Integer.parseInt(s);
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_0_bb003291_3e8b_42b5_8b0d_a0533b3893ca(int N) {
        int sum = 0;
        while (N !=0){
            sum += N % 10;
            N = N / 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_4_3e913d73_77b3_4b2f_9191_dd1c2e44f624(int N) {

        String result = "";
        while (N > 0) {
            result = String.valueOf(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_ceaa8847_4671_4586_bff0_6d83d813ef3d(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_2dc0a06f_a37a_4b9c_b78e_fbd3a9f91719(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_f88cd41f_fcac_4124_b013_48c7c87da2a5(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_ca876d32_a9cb_4cb0_972c_8bfe477cef01(int N) {
        int sum = 0;
        while (N !=0)
        {
            sum += N % 2;
            N = N / 2;
        }
        StringBuilder builder = new StringBuilder("");
        if (sum != 0)
        {
            builder.append(1);
        }
        return builder.reverse().toString();
    }

    
    public static String solve_Problem_3_5d23f58e_e165_421b_aac8_57dfe723297e(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_d367e2f3_f225_4f6d_ae62_01b9bb082996(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_a70b7799_d615_4366_a1e3_31f49c0a6ec1(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_3_2d047575_d311_40bf_a237_a9c091d4eacc(int N) {
        int sum = 0;
        while (N !=0) {
            sum += N % 2;
            N = N / 2;
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_1_bfd006b4_42dd_4a3f_9956_397f4de7791e(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_fdc20c7e_1305_424e_93ef_a81e69c146ca(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_cf355ee9_a7e3_4268_a500_bbedaba85df4(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainder = 0;
        int count = 0;
        while (N > 0) {
            sum += N % 10;
            N = N / 10;
            count++;
        }
        int temp = sum;
        while (temp > 0) {
            remainder = temp % 2;
            temp = temp / 2;
            if (remainder == 1) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_7a5fc138_b684_4874_99eb_d09f57a3d3e2(int N) {
        String res = "";
        while (N > 0) {
            res = (N % 2) + res;
            N /= 2;
        }
        return res;
    }

    
    public static String solve_Problem_4_60b59c59_66bf_494c_b5e1_74b09ded87cb(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_10ca07cf_0866_4520_8f8d_84cfab35eb59(int N) {
        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
}

    
    public static String solve_Problem_4_c3f32e25_b867_43a7_acb1_b6d79c45dab4(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_200d68b3_0e11_47dd_af49_7f796caaf98c(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_58e9748a_f31d_4d12_a908_938bf6ef322c(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_003c2b19_9ecd_4323_aa2c_3e47b82e0f8f(int N) {
        // Convert N to binary and then sum all digits
        String result = "";
        int sum = 0;
        while (N > 0) {
            sum += N % 2;
            N /= 2;
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_1_36e5af90_c5c4_4623_bc4e_a2d71bd97fe8(int N) {
        String s = Integer.toBinaryString(N);
        System.out.println(s);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            total += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return String.valueOf(total);
}

    
    public static String solve_Problem_4_a6cfc7b0_2eeb_4dae_a29b_58d77f768c4a(int N) {
        int ans = 0, base = 1, remainder = 1;
        while (N > 0) {
            remainder = N % base;
            ans += remainder;
            N /= base;
            base *= 2;
        }
        return String.valueOf(ans);
    }

    
    public static String solve_Problem_3_aed52ff6_6dc9_4124_a6ca_4b47860e6880(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_c540b7c0_3b3e_4278_8d33_16f242333258(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_bfa96863_91c5_4c67_988a_0f3d47c17537(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_242c9b13_ba8d_4817_92aa_fa095e1cef28(int N) {
        // write your code in Java SE 8
        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            int digit = N % 2;
            N /= 2;
            sb.append(digit);
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_bca4df27_f310_4f57_a072_fefe0d08ecd7(int N) {

        String result = "";
        while(N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_6f7a3c8c_1deb_4869_aba3_5851724eeb49(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainder = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        while(sum > 0){
            remainder = sum % 2;
            sum = sum / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_4_32ff6ac5_e5cb_4089_9637_a0a7dbecb7f9(int N) {
        String s = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_0_48fd054a_1042_43db_89e1_ee834f3d38ca(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_1_fff8af99_7bc9_4c3f_848b_f7462850d5b7(int N) {

        String result = "";
        while (N > 0) {
            result = String.valueOf(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_0591ab5d_1ef8_4c8f_99e3_992304521abc(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_1ec98de4_52fb_4bf9_8001_d037b63299ee(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_7670039a_00a6_4cb4_8dc7_e4ff4773f331(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_e17dbebb_1791_4885_8896_1f5d6e0d1a67(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_1bb0920d_32ae_4b7f_9e14_711dea342be7(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_cb7aa106_08ef_42ac_a2a7_138b24658341(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_e1ebe7ce_3778_4f55_b652_61abbbc7c27e(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        sb = new StringBuilder();
        while (sum > 0){
            int remainder = sum % 2;
            sum = sum / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_f411ceb8_322b_4096_899e_0cced4e2eab1(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_131c1cf8_d95e_4927_a597_f99f535eac8c(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_9c7c8d2e_c88e_48d7_b77b_e74d120da27b(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_fbc411a9_0df4_40ef_b7cb_20e1f2dbdb9e(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainder = 0;
        while (N !=0){
            remainder = N % 2;
            sum = sum + remainder;
            N = N/2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_1_799de3dc_7c95_42e9_8c94_61a969679d0f(int N) {
        String s = "";
        int lastDigit;
        int binarySum = 0;
        while (N !=0) {
            lastDigit = N % 10;
            binarySum += lastDigit;
            N = N / 10;
        }
        // Convert the binary number to a string with leading zeroes
        while (binarySum != 0) {
            if (binarySum % 2 == 1) {
                s = "0" + s;
            }
            binarySum = binarySum / 2;
        }
        return s;
    }

    
    public static String solve_Problem_1_a5073730_0ffd_4896_bf95_e82f7940a947(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_70668337_89c5_4c62_83b6_0ecad086777a(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_efdbab4d_99e7_45e6_a1d3_7af7d9c91028(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_dd64a5af_1710_4a7c_875a_2e55b9585ddb(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_1de7933c_4c47_4af3_83d4_dda1b4880960(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_b7fbe5d9_c797_4810_8dce_ccced9496421(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_7286f08b_efe4_454d_a81f_6602dd928c10(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_99ff8122_3a04_4a3a_947e_a4ba14c3ecf0(int N) {
        return Integer.toString(N).replaceAll("0*$", "").replaceAll("1", "0");
}

    
    public static String solve_Problem_1_605d0389_8f8c_4cf0_8e3a_7988021377d3(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_2e90eb89_afec_4347_9bd4_358598abe47d(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_8a3dd05f_bb05_4c8f_a3b0_1be283849cd0(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_5eee48ec_e092_4d2b_8299_12106885503a(int N) {
        int sum = 0;
        if (N < 0) {
            return "";
        }
        int max = 1;
        while (max < N) {
            sum = sum + N % max;
            N = N/max;
            max = max * 2;
        }
        if (sum > 0) {
            return "" + sum;
        } else {
            return solve_Problem_0_5eee48ec_e092_4d2b_8299_12106885503a(sum);
        }
    }

    
    public static String solve_Problem_4_9169aad1_834b_4d25_a3f6_c3d4dd51c904(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_fe9ff6cd_7803_45c0_a680_4aea16b802cc(int N) {

        // Write your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_3d05f388_58c9_461b_894c_ec8ed8122cf0(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_d9208085_6bd3_48aa_855d_db14aeb1c906(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_496c390b_054c_4de2_b498_0c2074c3bf3b(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_0cef604b_034d_49fd_a779_61193fa02ff9(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_fbc411a9_0df4_40ef_b7cb_20e1f2dbdb9e(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainder = 0;
        while (N !=0){
            remainder = N % 2;
            sum = sum + remainder;
            N = N/2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_4_5ee615ee_e674_41ad_8e73_da4a995d4b97(int N) {
        return Integer.toBinaryString(N).chars().sum() + "";
}

    
    public static String solve_Problem_4_04bf3e01_d507_4754_b3f2_c1175a33697a(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_de80eea8_aedb_4d9b_af23_afb33926933a(int N) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            sum += (temp % 10);
            temp /= 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_3_fc7be632_54fc_41e0_8905_29b451ba92c0(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=  0) {
            int digit = N % 10;
            sum += digit;
            N = N / 10;
            sb.append(digit);
        }
        return sum + "";
}

    
    public static String solve_Problem_0_a46a1a89_c9cd_4321_ae09_c029715e8c01(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += binary.charAt(i) - '0';
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_3_7dd4cc44_2289_486f_8e31_ced51eb9e0bb(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_a8a1f1e0_8380_48b1_aaa1_644b2618ef8c(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_90ce0907_fc1f_4df9_b38d_3fc399c5f93b(int N) {
        String s = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_1_149250a6_a067_4c0d_8570_c47070d8647a(int N) {
        // Your code here
        return "";
    }

    
    public static String solve_Problem_0_a2bea27b_c2d7_460c_a685_188fcfca80ed(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        // Loop from 0 to N and get each number in binary string
        for (int i = 0; i < N; i++) {
            String binary = Integer.toBinaryString(i).replace('-', '1');
            // Add it to the total
            sum += binary.length();
            // Append this digit
            sb.append(binary);
        }
        // Build the final answer by concatenating the total of each digit
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_3_ac23a8e3_e21e_484a_bd55_43bb75b5a4e2(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_382f483c_4965_4b87_94fb_a97f9bc602e0(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_3_a2ff1a6a_f62b_4b66_b08e_092a857dc7d0(int N) {
        // Base case
        if (N == 0)
            return "0";
        // If N < 10 then do nothing
        if (N <= 9)
            return Integer.toString(N);
        // Else split N into two numbers, N1 and N2
        int N1 = N % 10;
        int N2 = N / 10;
        return solve_Problem_3_a2ff1a6a_f62b_4b66_b08e_092a857dc7d0(N1) + solve_Problem_3_a2ff1a6a_f62b_4b66_b08e_092a857dc7d0(N2);
}

    
    public static String solve_Problem_4_f1afd8b8_78bc_4ce3_8950_129c17a1a4ef(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_8be121fd_c5f7_4fd8_b4b4_4b2aa1329005(int N) {

        String result = "";
        while (N > 0) {
            result = String.valueOf(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_18d4dc75_61eb_44a3_8382_185d1e66dc90(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_7f0e6b3e_10fb_46f5_8227_59e604798710(int N) {

        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += binary.charAt(i) - '0';
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_4_d21408fb_2994_4c3a_baf0_f9a3efee742c(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_0de0bfd0_8883_4dcb_8fa7_4f079b13a51b(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(N !=0){
            int temp = N % 10;
            sum += temp;
            N = N / 10;
        }
        for(int i = sum; i > 0; i--){
            sb.append(String.valueOf(sum % 2));
            sum = sum / 2;
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_98e16b23_a8f3_42f3_95f9_5f73967e999e(int N) {

        String result = "";
        while(N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_5969c875_f09c_4695_8fba_cf2e0975e2e0(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_693e98ae_6b67_4d78_85c0_c0bbeaf063b8(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_3_7fbda340_fc22_424b_9f65_985e5949406e(int N) {
        // Your code here
        return "";
    }

    
    public static String solve_Problem_0_6a2a0243_9d71_416c_aa55_0085d552fbb6(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        sb = new StringBuilder();
        while (sum > 0){
            int remainder = sum % 2;
            sum = sum / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_c0484366_2e89_4ae9_af7e_d008685ac8dd(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_2dd2737b_5fd5_4faa_bbcb_c198a837a256(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_5f2d3347_866d_4487_98a8_d0f5db34d6ce(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_60b59c59_66bf_494c_b5e1_74b09ded87cb(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_bfa6bce6_d13a_43e4_a738_5a00330862d3(int N) {
        int result = 0L;
        while (N > 0) {
            result = result + (N % 10);
            N /= 10;
        }
        return String.valueOf(result);
    }

    
    public static String solve_Problem_0_b9e11aca_92b3_40ff_8b4e_7357d334a31b(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(N !=0){
            int rem = N % 10;
            sum += rem;
            N /= 10;
            sb.append(rem);
        }
        return sum + "";
}

    
    public static String solve_Problem_0_f49c3dab_72a7_4af3_8aea_dbbb15154e8f(int N) {

        String res = "";
        while (N > 0) {
            res = (N % 2) + res;
            N = N / 2;
        }
        return res;
    }

    
    public static String solve_Problem_1_3a413a44_8821_4a4c_847b_923acc53117d(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_f7cd2ab6_8808_404e_9704_930a2f0d4f89(int N) {
        StringBuilder sb = new StringBuilder();
        while(N !=0){
            int remainder = N % 2;
            N = N/2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_4_192073e4_5702_4e5d_be59_fe30bf1a6902(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_4_dfb757ca_65c8_4ab3_811f_f58b975efcaf(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_153c40b2_a604_4e40_b7b3_48b2b35fd2ff(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_6a2a0243_9d71_416c_aa55_0085d552fbb6(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        sb = new StringBuilder();
        while (sum > 0){
            int remainder = sum % 2;
            sum = sum / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_4ff76a78_d5fb_475e_ba6f_1b7ffd5e1054(int N) {
        int sum = 0;
        double temp = 1;
        while (temp < N) {
            sum += temp;
            temp *= 2;
        }
        StringBuilder sb = new StringBuilder("");
        while (sum >= 1) {
            if (sum % 2 == 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            sum -= 1;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_fab3661a_fda5_4172_97a5_bbc5a2f198a7(int N) {
        if(N <= 0) return "0";
        List<Integer> digits = new ArrayList<>();
        while(N !=0) {
            digits.add(N %10);
            N = N/10;
        }
        Collections.sort(digits);
        int digit = Math.pow(2,digits.size()-1);
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < (digits.size())-1; i++) {
            ans.append(digits.get(digit));
        }
        return ans.toString();
}

    
    public static String solve_Problem_4_d92edaf4_4090_4345_a97d_24e3a2784ead(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= N; i++) {
            String binary = Integer.toBinaryString(i);
            int sum = 0;
            for (int j = 0; j < binary.length(); j++) {
                sum += binary.charAt(j) - '0';
            }
            sb.append(sum);
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_4bca5d46_10df_4a48_8a8c_615f10c2a04e(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_b06e1993_0c59_4fa6_a331_e1a0dca046b1(int N) {
        return Integer.toBinaryString(N);
}

    
    public static String solve_Problem_1_60360431_c618_41bb_b8ed_57db46664f77(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_b8b0200b_aec3_4313_b257_407c2b45d0e2(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_b8f3107e_6f24_4b4f_9429_0458c64adcfb(int N) {
        // Write your code here:
        int sumOfDigits = 0;
        int digitCount = 0;
        while (N != 0) {
            int digit = N % 2;
            sumOfDigits += digit;
            N /= 2;
            digitCount++;
        }
        StringBuilder result = new StringBuilder(digitCount);
        for (int i = 0; i < digitCount; i++) {
            result.append("1");
        }
        return result.toString();
}

    
    public static String solve_Problem_1_a561ce37_4de4_4fe1_869f_49a5119b4fc7(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_36a7eb1e_f113_4394_aad9_af53b85a0efb(int N) {
        // 1. Convert int N to binary
        String binary = Integer.toBinaryString(N);
        // 2. Convert binary to list of char
        char[] arr = binary.toCharArray();
        // 3. Sum up the digits in the binary number
        int sum = 0;
        for (char c : arr) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        // 4. Return the binary of the sum
        return Integer.toBinaryString(sum);
}

    
    public static String solve_Problem_0_932d9e94_1b0a_4b87_9ad7_a8652d4a902d(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_d7cb4540_344a_46b7_b117_1cad47941b46(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_ce902df4_55d1_43ca_8795_f314ee4bbbe5(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_4_cd9c6a2d_9456_4992_ae0c_6492340d64e5(int N) {
        int remainder = 0, sum = 0;
        while (True) {
            remainder = N % 10;
            sum += remainder;
            N /= 10;
            if (N == 0) {
                break;
            }
        }
        if (sum == 0) {
            sum = 1;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_3_c6b29d67_ca51_47d3_8834_a86e21b38d06(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_841636b4_ca87_4b17_9481_e333105596d7(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_6f9cf012_64ad_417b_b6b9_0c3ff87d7ddc(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int remainder = N % 2;
            N = N/2;
            sum = sum + remainder;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_4_430b1adc_5d57_4dd7_974e_dbb9b817036a(int N) {
        if (N == 0) {
            return "0";
        }
        String s = "";
        int n = N;
        int rem = 0;
        while (n != 0) {
            rem = n % 2;
            n = n / 2;
            s = rem + s;
        }
        return s;
}

    
    public static String solve_Problem_1_a1f11040_0d9a_434a_8719_36dbfde54b9a(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_83a68dff_02d4_4564_b2e7_6b0b9b8c09af(int N) {

        String s = Integer.toString(N, 2);
        return s;
    }

    
    public static String solve_Problem_4_7f27f79c_1121_4a3c_b131_54ac01732602(int N) {

        String res = "";
        while (N > 0) {
            res = String.valueOf(N % 2) + res;
            N = N / 2;
        }
        return res;
    }

    
    public static String solve_Problem_0_6b9f95ca_98f6_4e96_8723_cbd7b7286826(int N) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            sum += temp % 2;
            temp /= 2;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_1_d45580b2_ff63_4242_a5b7_4f5a59f7dac6(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_4_42dc0ca5_f6c7_4457_a4b1_56105ffb101e(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_6197b68d_8880_4240_b724_046e695654f5(int N) {
        StringBuilder sb = new StringBuilder();
        while(True) {
            int remainder = N % 2;
            N /= 2;
            sb.append(remainder);
            if(N == 0) break;
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_a09241d8_47cb_4aca_854e_687834b5cf08(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int temp = N % 10;
            sum += temp;
            N = N / 10;
        }
        while(sum>0){
            int temp = sum % 2;
            sb.append(temp);
            sum = sum / 2;
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_fcee3d83_8a5a_42ae_865c_f497022d748f(int N) {
        // Use a StringBuilder to hold the string result.
        StringBuilder sb = new StringBuilder();
        // Iterate from 0 to N-1, and append the digits of each number in binary form.
        for (int i = 0; i < N; i++) {
            int digit = ( Math.pow(10, i) % 2) == 0 ? 1 : 0;
            sb.append(String.format("%1$4s", Integer.toBinaryString(i))).append(digit);
        }
        return sb.toString();
    }

    
    public static String solve_Problem_4_693e98ae_6b67_4d78_85c0_c0bbeaf063b8(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_3_c4881bf0_e295_4536_86c7_a5529ae97731(int N) {
        int sum = 0;
        String binaryString = "";
        while (N !=  0) {
            int quotient = N % 10;
            sum += quotient;
            N = N / 10;
            binaryString = quotient + binaryString;
        }
        return sum + binaryString;
}

    
    public static String solve_Problem_0_e44da8fe_cde3_4ce6_9b83_2d604d5998ec(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_7062993a_ef5d_4885_b6cf_6500de5cef7f(int N) {
        String result = "";
        int i = 1;
        int j = N;
        while(j !=0){
            result += Integer.toBinaryString(j % 2);
            i ++;
            j = j / 2;
        }
        return result;
}

    
    public static String solve_Problem_3_decdc51d_48cb_4521_bfbd_cb78fe014f4b(int N) {

        // Write your code here
        String binary = "";
        while (N > 0) {
            binary = N % 2 + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_0_c6b870f9_c405_463b_a38c_9c2e6f2065ce(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_d073a9c7_0b51_435f_9df6_02647173be41(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_3097c109_ee60_4212_b634_8c7ad3c4fa90(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_9f78e521_e36d_4505_b6d8_ef54e0670aa1(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_ae4bfe9f_9c12_49b8_8267_98992bef6b09(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_4_b33866b6_16cb_47f2_b1ef_d02543ca4a18(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_6777b936_34e2_4209_8c71_1d374ee7dd89(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_d45580b2_ff63_4242_a5b7_4f5a59f7dac6(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_0_cd653fc1_ad59_4abc_97aa_7979aa6e7a2e(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_934f9a8b_8dc0_4252_9e18_4cb8bdd41bfb(int N) {
        int sum = 0;
        boolean flag = True;
        int i = 1;
        while (flag) {
            if ((N / i) % 2 == 0) {
                sum += i;
                i++;
            } else {
                sum -= i;
                i++;
            }
            flag = N < i;
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_0_1f36ef95_4b8f_4718_bebd_ce0af782366b(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_a1f11040_0d9a_434a_8719_36dbfde54b9a(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_66ef040d_bcbe_4dd9_ba6c_4c699946b087(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_26c73e04_f57c_46b9_9f44_b7b4d4e77185(int N) {
        if (N == 0) return "";
        int[] binary = {0, 0};
        while (N --> 0)
            binary[N & 1]++;
        return Arrays.stream(binary).mapToObj(x -> Integer.toString(x)).collect(Collectors.joining());
}

    
    public static String solve_Problem_3_0cf71e20_8ecf_4631_ac5e_ca124816f639(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_2eb85a68_596f_4668_a9da_a56c9a46daa3(int N) {
        return Integer.toString(N);
}

    
    public static String solve_Problem_4_5cc987b4_7d85_4aaa_9038_c449ce0ccd90(int N) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_4_9e7cd49e_d39a_4aad_bf80_6cba24eab409(int N) {
        int[] digits = new int[ Math.ceil((double) N / Math.pow(2, 50))];
        Arrays.fill(digits, 0L);
        int remainder = 1;
        for (int i = 0; i < digits.length; i++) {
            int digit = remainder % 10;
            digits[i] =  digit;
            remainder = remainder / 10;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(digits));
        return sb.toString();
    }

    
    public static String solve_Problem_4_8604201c_7f37_4e6e_8bc8_39fe54d0171e(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_e495ffe0_e17d_41e3_b629_11ecb79b2fac(int N) {
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += (i % 2 == 0) ? i%2 : 0;
        }
        String output = "";
        while(sum > 0) {
            int rem = sum % 2;
            output += (rem > 0) ? "1" : "0";
            sum = (sum - rem) / 2;
        }
        return output;
}

    
    public static String solve_Problem_1_8affb6c8_2915_497b_b8a6_70dddd53fd72(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_e426675e_e8ec_4e05_b18a_f7227e80f218(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_cfd9e60b_369b_40ca_bfad_b32bc176bcd1(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_ea7d1a73_0940_4006_aaa8_1ef0e8348a12(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_cbdd53f1_3220_4027_a898_ac93802b0818(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_db3803a0_c2b7_4885_8a22_3e1e699dd89a(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_7516328c_adbd_4efd_a769_ef9d34c8f1de(int N) {

        StringBuilder sb = new StringBuilder();
        while(N > 0){
            sb.insert(0, N%2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_4_869908fa_70f5_48bb_8b6d_2bb4c3e4bbbf(int N) {
        String binary = "";
        int sum = 0;
        while (N !=0){
            sum = sum + N % 2;
            N = N/2;
        }
        binary = Integer.toBinaryString(sum);
        return binary;
}

    
    public static String solve_Problem_4_7db76a1f_dbc6_49a4_8754_03e0ccf36a9d(int N) {
        if (N < 0) {
            return "-1";
        }
        int sum = 0;
        int count = 1;
        int remainder = 0;
        while (N > 0) {
            remainder = N % 10;
            sum += remainder * count;
            N = (N - remainder) / 10;
            count++;
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_0_ec6641f7_7401_490b_bc7e_0c479d3d638e(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int temp = N % 10;
            sum += temp;
            N /= 10;
        }
        StringBuilder sb1 = new StringBuilder();
        while (sum > 0){
            sb1.append(sum % 2);
            sum /= 2;
        }
        sb.append(sb1);
        return sb.toString();
}

    
    public static String solve_Problem_1_4911a9ae_2d07_450e_b19b_6723efa6da3b(int N) {
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_1_2903c403_c0db_446e_8443_30427d651e26(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_e7883213_3755_417a_a174_7c8244229909(int N) {
        StringBuilder sb = new StringBuilder();
        int digitSum = 0;
        while (N > 0) {
            digitSum++;
            N = N >> 1;
        }
        int rem = 0;
        for (int i = 0; i < digitSum; i++) {
            rem = N & 1;
            sb.append(rem);
            N = N >> 1;
        }
        return String.valueOf(sb.reverse());
}

    
    public static String solve_Problem_0_89bbc661_d8e1_4874_982f_bb48d68f70eb(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_5eb4ba00_41ee_4e7a_bc98_e92e13b79636(int N) {
        int temp = N;
        String result = "";
        do {
            temp /= 10;
            result += String.valueOf(temp % 2);
        } while (temp != 0);
        return result;
    }

    
    public static String solve_Problem_4_82ff1f82_7e55_4c32_98cb_e87b7b97b972(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_fc7be632_54fc_41e0_8905_29b451ba92c0(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=  0) {
            int digit = N % 10;
            sum += digit;
            N = N / 10;
            sb.append(digit);
        }
        return sum + "";
}

    
    public static String solve_Problem_4_220b13f9_4aa9_4dfb_80f4_974d6f57a391(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_7d5dd4bc_b38a_4946_9dde_1fe885bb86ca(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_5180b905_5245_4a1e_93bf_833a4006e743(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_033dcf92_4fb4_4ab8_bc05_b346ff162ab7(int N) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_4_cf0f74c7_1964_4f3a_8051_6b38efcdbabf(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_e2c74c12_a5aa_4681_914f_18bf59be3ad8(int N) {

        String result = "";
        while(N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_6e4afb90_d603_46f1_aadd_2f1e95981f0d(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_0_dfd5111d_5e60_49cf_8f15_750a88c48948(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_4abd5035_e8f1_4525_ada7_9613869563bb(int N) {
        // Your solution goes here.
        return null;
    }

    
    public static String solve_Problem_0_91a192fb_d8db_4baf_b925_cac0cab3f150(int N) {
        String binary_N = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary_N.length(); i++) {
            sum += binary_N.charAt(i) - '0';
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_0_8b966322_3bfa_4fdd_9332_c0e5ba0b277e(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_7906cf26_b8b7_4737_8349_59d5ca7995a0(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_552b0537_c48a_4b35_8b92_b51cc05da58e(int N) {

        String binary = "";
        while (N > 0) {
            binary = (N % 2) + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_0_98c8717e_9a9e_43d8_a090_00e8492461c6(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_f093c827_3c20_424e_9ccd_af2164e2b6e8(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_fec6d6a5_868c_41e0_9197_6b0d7c66ae00(int N) {
    // Solution:
        StringBuilder result = new StringBuilder();
        int remainder = 0;
        while (N > 0) {
            remainder =  (N % 2);
            N = N / 2;
            result.append(String.valueOf(remainder));
        }
        return result.reverse().toString();
    }

    
    public static String solve_Problem_3_b3cf045b_c5f3_4127_868e_7bc02f4ed126(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_b361917f_28d5_41b1_ba7d_456af158e276(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_aae85ab2_a39f_4b54_b7cb_525e925a4839(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_b56db953_f1fa_4adf_9b10_868933e9a480(int N) {
        boolean even=True;
        String ret="";
        // convert number to string
        String[] arr=Integer.toBinaryString(N).toLowerCase().split(""); 
        for( int i =0;i<arr.length;i++) {
            if(i%2==0) {
                even=True;
            } 
            else {
                even=False;
            }
            if(i<arr.length-1) {
                // add arr[i] if last digit is even
                if(even) {
                    ret+=arr[i]+"0";
                }
                // add arr[i] if last digit is odd
                else {
                    ret+=arr[i]+"1";
                }
            } 
            else 
            {
                // add arr[i] if last digit is even
                if(even) {
                    ret+=arr[i]+"0";
                }
                // add arr[i] if last digit is odd
                else {
                    ret+=arr[i]+"1";
                }
            }
        }
        
        return ret;
    }

    
    public static String solve_Problem_3_0ae09dd6_6407_4e7c_8c68_650bce62715f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_cd26aa3d_e5e4_4026_9af5_5e32940b767b(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_0dcc2568_888b_445b_9348_6075b20daf6a(int N) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= N; i++) {
            int remainder = N % 2;
            N /= 2;
            int digit = N % 10;
            sb.append(digit);
            N /= 10;
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_ccf72955_65f6_4d67_adfd_910488951b5f(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_c25f8494_96e9_423b_aa6f_b3c108584827(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_48690a92_ec59_45c6_bcc1_34a56543bd82(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_671fd9c4_3774_4e0f_9cc0_4b5a13b7fe3f(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_0_be1b8ce3_d841_4ce2_b623_d21f22a42768(int N) {
        StringBuilder sb = new StringBuilder();
        int N1 = N;
        do {
            sb.insert(0, (char) ((N1 & 1L) % 2));
            N1 /= 2;
        } while (N1 > 0);
        return sb.toString();
    }

    
    public static String solve_Problem_0_77edbad0_e5c6_4319_b957_6346135d2d4d(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_1009206b_642f_4f30_a159_77a1314aa268(int N) {
        N = N + (N % 10);
        String ans = "";
        while (N != 0) {
            ans = String.valueOf(N & 1) + ans;
            N = (N / 10) | 0;
        }
        return ans;
    }

    
    public static String solve_Problem_4_1c7a64c4_4fc2_4dae_9b56_80ec06a99318(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_131c1cf8_d95e_4927_a597_f99f535eac8c(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_6ed0ab77_f0cc_4d84_b4af_42ef954019ab(int N) {
        // Take the integer N, convert it to binary, and then add each digit together, 1+1+0+0
        // return the string of digits that make up the sum
        return Integer.toBinaryString(N).chars().map(Character::getNumericValue).sum() + "";
}

    
    public static String solve_Problem_0_0bdb156d_a7d1_4a0b_b224_90b94a29aab6(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_5d41e961_1131_4f6d_a464_a3435a8d3b1b(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_3289d476_4eae_4d13_bf86_9ff143ee4541(int N) {
        // Your code here
        String s = "";
        int lastDig, lastOne = 0, lastTwo = 0;
        boolean flag;
        while (N > 0) {
            lastOne = lastTwo = 0;
            flag = False;
            while (N > 0) {
                lastDig = N % 10;
                N = (N / 10);
                if (lastOne == 0 && lastDig != 0) {
                    s += "1";
                    flag = True;
                    break;
                }
                if (lastDig == 0 && lastTwo == 0) {
                    s += "0";
                    flag = True;
                    break;
                }
                if (lastDig != 0 && lastDig == lastOne) {
                    s += "1";
                    flag = True;
                    break;
                }
                if (lastDig != 0 && lastDig != lastOne && lastDig == lastTwo) {
                    s += "1";
                    flag = True;
                    break;
                }
                if (lastDig != 0 && lastDig != lastOne && lastDig != lastTwo && lastDig == lastTwo) {
                    s += "0";
                    flag = True;
                    break;
                }
                lastOne = lastDig;
                lastTwo = lastDig;
            }
            if (flag) {
                lastOne = lastTwo = 0;
            }
        }
        System.out.println(s);
        return s;
    }

    
    public static String solve_Problem_1_cb817936_1f9b_4fb1_946e_d33a849123dc(int N) {
        int sum = 0;
        String number = Integer.toBinaryString(N);
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(number.substring(i, i + 1));
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_0_3c4e69c0_2d17_4448_9213_1cda2f2f3aea(int N) {

        // Write your code here
        String binary = "";
        while (N > 0) {
            binary = (N % 2) + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_3_b9a01495_3e69_4162_99a8_1127e236567c(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_7209b92a_a001_4d67_9eed_e39e546be59c(int N) {
        // Your code here
        return "";
    }

    
    public static String solve_Problem_3_948ea09a_e4e1_4a7e_8f98_e2a888a3166b(int N) {
        StringBuilder builder = new StringBuilder();
        int quotient = N;
        int remainder = 0;
        while (quotient != 0) {
            remainder = quotient % 2;
            quotient = quotient / 2;
            builder.append(remainder);
        }
        return builder.reverse().toString();
    }

    
    public static String solve_Problem_0_1412f519_be8a_4aa6_b039_a8e68a9d4420(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_7bbdb6a5_aeac_4a74_b057_0547238b39f7(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_a3a96e33_7084_4867_b66e_da7991dbae87(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_e097fa44_e57e_4c4d_a033_7b473f37eecc(int N) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            sum += (temp % 10);
            temp /= 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_0_c039aa7c_76b3_49aa_841a_2303027f6099(int N) {

        StringBuilder sb = new StringBuilder();
        while(N > 0){
            sb.insert(0, N%2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_0dddfda9_6a07_4b81_bcfd_dcfc436fa133(int N) {

        String binary = "";
        while (N > 0) {
            binary = (N % 2) + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_1_a46a1a89_c9cd_4321_ae09_c029715e8c01(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += binary.charAt(i) - '0';
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_4_7732e4a2_b786_47c2_b6c1_8aac62ea0398(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_76558970_a0eb_4204_9fb3_4e3352e98ebd(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_bc29ea3b_d1db_473e_8464_5ddd288381ac(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_033825d1_c213_4d66_afdb_d0f111ff5468(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_38c10745_636e_4926_9ba8_891b33cc9da0(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_e6da1e68_8915_4d1a_96a1_42d10ec03ce8(int N) {
        return null;
    }

    
    public static String solve_Problem_0_fc93a16a_8174_4666_a4d5_71eb20e739e1(int N) {
        int sum = 0;
        String result = "";
        while (N !=0) {
            int temp = N % 10;
            sum += temp;
            N /= 10;
        }
        while (sum > 0) {
            result += sum % 2 == 0 ? "0" : "1";
            sum /= 2;
        }
        return result;
}

    
    public static String solve_Problem_3_23b118a2_bffc_46a9_b34c_86355a301643(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_39d03e77_1671_4d45_937b_f4d81b8d37ed(int N) {
        int sum = 0;
        while (N !=0){
            sum = sum + N % 2;
            N = N/2;
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_0_dce453dd_ae07_4ed9_9a3b_51d8d5b8789c(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_34c0bf0d_2186_4c25_a274_d599d4513a62(int N) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            sum += (temp % 10);
            temp /= 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_0_85cf6cd7_f43e_45ad_b620_4e7e0d7d0fba(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_19fdd5e9_6335_435a_b572_0291f524ef04(int N) {
        StringBuilder sb = new StringBuilder();
        while(N !=0){
            int remainder = N % 2;
            N = N / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_8e4670c3_351c_4b89_94e2_f4fa38ff7897(int N) {
        int remainder = 0;
        int sum = 0;
        // Set up the remainder value so that it fits in Integer.MAX_VALUE
        while (N % (sum + remainder) == 0) {
            remainder = 1;
            sum++;
        }
        // Now divide N by sum & remainder
        while (N % (sum + remainder) != 0) {
            remainder *= 10;
            sum++;
        }
        // Convert the int back into binary
        while (sum > 0) {
            int digit =  remainder;
            String s = Integer.toBinaryString(digit);
            s = s.substring(s.length() - 1);
            sum += Integer.parseInt(s);
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_4_0884f888_ca7c_450a_a8ce_c5bac91d165b(int N) {
        String s = ""; 
        int d = N; 
        while (d!=0) { 
            d = d / 2;
            s = s + "1";
        } 
        return s;
    }

    
    public static String solve_Problem_1_25ffee00_b61e_4085_8743_c22a59b26838(int N) {
        String ans = "";
        while (N > 0) {
            int r = N % 2;
            ans = r + ans;
            N /= 2;
        }
        return ans;
    }

    
    public static String solve_Problem_3_e391593d_7b4f_4c16_93c5_14c697ee9a1f(int N) {
        // 等于0的情况
        if (N == 0) {
            return "0";
        }
        // 遍历输出
        StringBuilder result = new StringBuilder();
        while (N != 0) {
            result.append(N % 2);
            N /= 2;
        }
        return result.reverse().toString();
}

    
    public static String solve_Problem_4_f6e084f1_aac1_4761_8136_8a68ce9a556f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_680abb1c_e695_4802_b09b_b2c54685a5fe(int N) {
        int number = 0;
        int base = 0;
        while (number != N) {
            number = N % base;
            N = (N - number) / base;
            base *= 10;
        }
        StringBuilder result = new StringBuilder("");
        while (N > 0) {
            if (N % 2 == 1) {
                result.append((char)('0' + N % 2));
            } else {
                result.append((char)('1' + N % 2));
            }
            N = (N - number % base) / base;
            number = number;
        }
        return result.toString();
    }

    
    public static String solve_Problem_0_a4d76734_eb87_420b_a9bc_f9a3f2f19dd1(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_59a36f29_8547_4789_8ad9_cab24fc4995a(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_48679853_707c_4afe_b438_51d4b93855e4(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_1657e30e_f429_47c2_a7ca_c61bd6bf2bed(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_122c1613_a95c_4e0b_a65d_f9dd6fef54f3(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_200d68b3_0e11_47dd_af49_7f796caaf98c(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_10ca07cf_0866_4520_8f8d_84cfab35eb59(int N) {
        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
}

    
    public static String solve_Problem_0_b14b90d9_d791_470e_b6b3_88265e38fa27(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_342d0325_2f0c_42b2_b45a_b9b155b46e75(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_3289d476_4eae_4d13_bf86_9ff143ee4541(int N) {
        // Your code here
        String s = "";
        int lastDig, lastOne = 0, lastTwo = 0;
        boolean flag;
        while (N > 0) {
            lastOne = lastTwo = 0;
            flag = False;
            while (N > 0) {
                lastDig = N % 10;
                N = (N / 10);
                if (lastOne == 0 && lastDig != 0) {
                    s += "1";
                    flag = True;
                    break;
                }
                if (lastDig == 0 && lastTwo == 0) {
                    s += "0";
                    flag = True;
                    break;
                }
                if (lastDig != 0 && lastDig == lastOne) {
                    s += "1";
                    flag = True;
                    break;
                }
                if (lastDig != 0 && lastDig != lastOne && lastDig == lastTwo) {
                    s += "1";
                    flag = True;
                    break;
                }
                if (lastDig != 0 && lastDig != lastOne && lastDig != lastTwo && lastDig == lastTwo) {
                    s += "0";
                    flag = True;
                    break;
                }
                lastOne = lastDig;
                lastTwo = lastDig;
            }
            if (flag) {
                lastOne = lastTwo = 0;
            }
        }
        System.out.println(s);
        return s;
    }

    
    public static String solve_Problem_3_73aa3049_887f_4349_9a2d_05c2ec6d3a46(int N) {
        int sum = 0;
        int remainder = 0;
        int temp = N;
        while (temp != 0) {
            remainder = temp % 10;
            sum += remainder;
            temp /= 10;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_3_dc885162_06c4_45b7_8fa7_153f82c33220(int N) {

        String result = "";
        while (N > 0) {
            result = String.valueOf(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_0888c87e_36e8_4dda_8be8_00edff885c45(int N) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_1_cc70edba_12f7_47e3_821a_bb5b9745d405(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_617ab299_c5bf_4af4_8a27_882e9292a5a4(int N) {
        StringBuilder out0 = new StringBuilder();
        out0.append(Integer.toBinaryString(N));
        return new String(out0);
    }

    
    public static String solve_Problem_3_b1823659_8b52_4627_a00f_d830bbc9de3a(int N) {
        String value = Integer.toBinaryString(N);
        String[] arr = value.split("");
        int result = 0;
        for (String num : arr) {
            result += Integer.parseInt(num);
        }
        return String.valueOf(result);
    }

    
    public static String solve_Problem_4_1637f68b_b337_453b_8c70_9df628acdecd(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_15beaac6_9e55_4765_a435_0e4c8f95a0ea(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_0_8923ae56_2fc6_4fe6_a657_ac14e2c2c545(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int remainder = N % 2;
            sum += remainder;
            N = N/2;
        }
        while(sum > 0){
            int remainder = sum % 10;
            sb.append(remainder);
            sum = sum/10;
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_2e1a6154_97c1_42dd_89a5_770e4ac49a03(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_4f11d0bf_8288_46b8_9d27_c8a53c0990eb(int N) {
        if (N == 0) {
            return "0";
        }
        BigInteger sum = new BigInteger("1");
        StringBuilder buffer = new StringBuilder("");
        for (int i = N / 2; i > 0; i /= 2)
        {
            sum = sum.add(new BigInteger(String.format("%0" + N + "d", i)));
        }
        buffer.append(sum);
        if (N % 2 == 1)
            buffer.append(1);
        return buffer.toString();
}

    
    public static String solve_Problem_0_a5f38f08_3291_481e_8017_d7a61dbc8973(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_3_430dee36_e4f0_4267_b592_bd262b343dd2(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_15a4e577_d428_4163_adc6_943281f05579(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_2bab2456_3de6_4276_8781_ae64cf7c7e60(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_13c3e04a_1298_45c6_8fde_6883fa6622be(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_7d5dd4bc_b38a_4946_9dde_1fe885bb86ca(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_561fb849_1a44_4657_99b5_1281e802786f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_5a6e7a61_170f_4c5f_b01d_beeb7f8f0a10(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_1_7f381990_c04f_4abd_a0b8_a81010dd3af8(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_8a0d970f_d135_4840_abff_68e7fe6e14d2(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_4_5f274e2a_6cc2_43e8_8848_ff75fb0e4120(int N) {
        if (N <= 0 || N > 10000) return ""; // check input
        int s = N;
        s = s % 10; // drop last digit
        while (s > 0 && s % 2 == 1) s /= 2; // shift up
        StringBuilder b = new StringBuilder();
        do {
            b.append((char) ('0' + s % 2));
            s /= 2;
        } while (s > 0);
        return b.toString();
    }

    
    public static String solve_Problem_3_5779d1f4_4812_4219_8411_e3d070bb8852(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_89e1f821_08d7_4225_953b_0e660562ca46(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_7ce67c3f_1039_4423_b108_0621b249980d(int N) {

        // Write your code here
        String binary = "";
        while (N > 0) {
            binary = String.valueOf(N % 2) + binary;
            N = N / 2;
        }
        return binary;
    }

    
    public static String solve_Problem_3_fc8e6e45_1b83_4a5d_8a74_3c50c4fc1747(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_3_3dbb73d4_ad25_4eb0_83d7_60edd57d58e6(int N) {
        int ans = N % 2L;
        int tmp = (N - 1L);
        while (tmp > 0) {
            ans += tmp % 2L;
            tmp /= 2L;
        }
        return Integer.toBinaryString(ans);
    }

    
    public static String solve_Problem_4_edfd428a_3d2f_41cc_b9c2_14d230be723a(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_4_73aa3049_887f_4349_9a2d_05c2ec6d3a46(int N) {
        int sum = 0;
        int remainder = 0;
        int temp = N;
        while (temp != 0) {
            remainder = temp % 10;
            sum += remainder;
            temp /= 10;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_3_210544ab_e9bc_49b1_9b76_624e9ff64690(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int temp = 0;
        while (N !=0){
            temp = N % 10;
            sum += temp;
            N = N / 10;
        }
        temp = sum;
        while (temp != 0){
            temp = temp / 2;
            sb.append(temp % 10);
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_cbdd53f1_3220_4027_a898_ac93802b0818(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_6190b2cf_bf9b_47c7_850e_93e947d593fa(int N) {
        String b = Integer.toBinaryString(N);
        // System.out.println(b);
        int sum = 0;
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            sum += Integer.parseInt(String.valueOf(c));
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_1_f6126dd9_a01a_42a9_b086_b620008236ca(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_43ec8dc6_f4cf_49a8_8c59_5aa03e549db8(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_48fd054a_1042_43db_89e1_ee834f3d38ca(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_4_1e5469ef_6d3e_4be3_af0f_e4877741fe4e(int N) {
        StringBuilder sb = new StringBuilder();
        while(True) {
            int remainder = N % 2;
            N /= 2;
            sb.append(remainder);
            if(N == 0)
                break;
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_a3063239_2056_4fa4_b128_d9c4078c0442(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_e937a129_e82c_4805_a844_468a4b0fc8a5(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_4ea8dfe6_01b4_4f8e_8bdf_e2f954ca5dba(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_28e0137e_cdfe_4663_aec1_676117dddda0(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_ccf72955_65f6_4d67_adfd_910488951b5f(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_f12a14a4_266a_4502_9fa6_98b26c67a487(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_fc8826ee_3c04_4217_bf02_5a49ec953f06(int N) {
        StringBuilder sb = new StringBuilder();
        while(True) {
            int digit = N % 10;
            N /= 10;
            int remainder = N % 10;
            N /= 10;
            sb.append(digit);
            sb.append(remainder);
            if(N == 0) break;
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_94f24708_1c7d_4e64_a9db_f45006f38abd(int N) {

        String result = "";
        while(N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_7d146a08_34e5_4835_a177_6f92b9ba9bee(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainder = 0;
        int digit;
        while (N !=0){
            digit = N % 10;
            sum += digit;
            N /= 10;
        }
        while(sum > 0){
            remainder = sum % 2;
            sum = sum / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_90760d29_766e_4627_a98f_eef612d43a55(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_4ba1ba43_e575_4a2e_bff2_a71be4d2f302(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_68bf3ecc_b2b6_4632_b692_0330a58f33f5(int N) {
        String binary = Integer.toBinaryString(N);
        String result = "";
        for (int i = 0; i < binary.length(); i++) {
            result += String.valueOf(binary.charAt(i));
        }
        return result;
    }

    
    public static String solve_Problem_3_cd0485ba_1984_476e_97a6_6a977a60c9b4(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_623aead3_5d73_44ce_841e_e97fd63f566e(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_4_7bb91d0a_b67b_4e7d_b36b_5814ea845399(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_b45593d2_7b5f_4297_9335_23be748d89d4(int N) {
        BigInteger result = BigInteger.ZERO;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            result = result.add(BigInteger.valueOf(i).divide(BigInteger.TEN));
            sb.append(result.mod(BigInteger.TEN));
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_27f83d59_67bd_43a2_a07d_c48a90b49bde(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_424078f3_37aa_44b3_a686_95f784a081d9(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_823d8b0e_793a_42d2_ad6b_68370a935b5f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_7bb91d0a_b67b_4e7d_b36b_5814ea845399(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_7c7a355b_26df_44d0_9356_f4880bfc9d1f(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_826da1fc_8228_43dd_b116_cd060e61cff2(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int remainder = N % 2;
            N = N / 2;
            sum = sum + remainder;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_aaa5973c_696c_411d_a5dd_a0a33f0c91b7(int N) {
        if(N < 10) {
            return String.valueOf(N);
        }

        StringBuilder builder = new StringBuilder();
        builder.append(solve_Problem_0_aaa5973c_696c_411d_a5dd_a0a33f0c91b7(N / 10));
        builder.append(N % 10);
        return builder.toString();
}

    
    public static String solve_Problem_4_7de466a9_de86_4a2a_90c6_515c666dc2e6(int N) {

        // Write your code here
        String binary = "";
        while (N > 0) {
            binary = N % 2 + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_3_a32347a6_6453_45d1_9cf2_0f4438516e2e(int N) {
        String binary = "";
        while(True){
            if(N%2==1){
                binary = binary+"1";
            }else{
                binary = binary+"0";
            }
            N = N/2;
            if(N==0){
                break;
            }
        }
        return binary;
    }

    
    public static String solve_Problem_0_dc885162_06c4_45b7_8fa7_153f82c33220(int N) {

        String result = "";
        while (N > 0) {
            result = String.valueOf(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_b9e11aca_92b3_40ff_8b4e_7357d334a31b(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(N !=0){
            int rem = N % 10;
            sum += rem;
            N /= 10;
            sb.append(rem);
        }
        return sum + "";
}

    
    public static String solve_Problem_3_d1b76965_7fe0_4285_b513_e97cba1db78f(int N) {
        // write your code here
        return "";
    }

    
    public static String solve_Problem_0_02867d8a_b882_4a43_b640_ffdb5e291263(int N) {
        // Your code here
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_0_e6fbc915_7329_455b_96db_b67564f11793(int N) {
        // Your code here
        return "";
    }

    
    public static String solve_Problem_4_8ece48c6_220e_4bf2_ac85_faf880f4761a(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_b73dd62d_ae1e_4aa4_82d8_3b5222791ae2(int N) {
        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
}

    
    public static String solve_Problem_0_71d8858a_fd9e_4532_9a78_80934e84899b(int N) {

        String binary = "";
        while (N > 0) {
            binary = (N % 2) + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_0_85037cd5_7a46_431c_8458_9d73aa59fbf1(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_e49e8c38_ec4b_4eff_92f7_350ddc92a7c4(int N) {
        
        if (N < 0) throw new IllegalArgumentException();
        if (N > 1000) throw new IllegalArgumentException();
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        do {
            int digit = Math.pow(2,N);
            if (N < 10) sb.append(Integer.toString(digit));
            else {
                int count = (Math.log10(digit)-Math.log10(2));
                for (int i = 0; i < count; i++) {
                    sb.append("1");
                    digit = digit/10;
                }
                sb.append(Integer.toString(digit));
            }
            sum += digit;
            N /= 10;
        } while(N !=  0);
        if (N < 10) {
            sb.append("0");
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_e6fbc915_7329_455b_96db_b67564f11793(int N) {
        // Your code here
        return "";
    }

    
    public static String solve_Problem_4_3402a067_89f6_4ac9_9bd7_2a98c1de8d66(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_4cca2c54_0277_48e4_a4a5_852aa2541172(int N) {

        String binary = "";
        while (N > 0) {
            binary = N % 2 + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_3_f90ebc84_0c08_476f_b1a8_9040f4ca9532(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_48690a92_ec59_45c6_bcc1_34a56543bd82(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_1f0c11cd_00f3_4f90_bcd0_3ce8c5c2a293(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_6320b3dc_ea58_4e86_8032_608405d639be(int N) {
        int digit = 0;
        int binaryDigit = 0;
        String binaryString = "";

        while(N >0) {
            digit = N % 10;
            binaryDigit =  Math.pow(2,digit);
            binaryString += String.valueOf(binaryDigit);
            N /= 10;
        }

        return binaryString;
}

    
    public static String solve_Problem_4_0ce7b556_7067_4283_a0be_c46736941a6e(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_3a7bfa78_4963_4ba7_ab74_e7449a618680(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N = N / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_cdfd6084_c668_43ab_b72f_9b752cc86093(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_d293c35f_a09a_433c_830c_74ca0f5049dd(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_7314038d_c38c_4a94_b33b_73c81db601b5(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_cd653fc1_ad59_4abc_97aa_7979aa6e7a2e(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_800e5f67_1974_421d_82f2_3447174b5f76(int N) {
        // Solve the problem!
        String s = Integer.toBinaryString(N);
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            sb.append(ch);
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_9621072c_3cb9_4341_82b7_bccf250dad86(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_0591ab5d_1ef8_4c8f_99e3_992304521abc(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_016b3e66_98d8_4e7d_8cae_52aa960dd907(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_77edbad0_e5c6_4319_b957_6346135d2d4d(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_124d3367_3ec5_4812_975e_fd69dc302698(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_3a5b5db9_b265_46b0_b796_cc93c6830bab(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_905e0449_fed6_4fe9_bab5_5f4766e2ad58(int N) {
        String n = Integer.toBinaryString(N);
        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            ans += n.charAt(i) - '0';
        }
        return Integer.toString(ans);
}

    
    public static String solve_Problem_3_003c2b19_9ecd_4323_aa2c_3e47b82e0f8f(int N) {
        // Convert N to binary and then sum all digits
        String result = "";
        int sum = 0;
        while (N > 0) {
            sum += N % 2;
            N /= 2;
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_1_5a789f8a_3454_4e02_a6e7_fdeb8ff15918(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_e6da1e68_8915_4d1a_96a1_42d10ec03ce8(int N) {
        return null;
    }

    
    public static String solve_Problem_1_e8a303df_adb3_492d_bbec_a457df73fd16(int N) {
        StringBuilder binary = new StringBuilder();
        int rem = 0;
        int quo = N;
        while (quo != 0) {
            rem = quo % 2;
            quo = quo / 2;
            binary.append(rem);
        }
        binary.reverse();
        return binary.toString();
}

    
    public static String solve_Problem_1_68425b6d_fe57_4bcf_86a7_417a89d6f7d7(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_fff8af99_7bc9_4c3f_848b_f7462850d5b7(int N) {

        String result = "";
        while (N > 0) {
            result = String.valueOf(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_68bf3ecc_b2b6_4632_b692_0330a58f33f5(int N) {
        String binary = Integer.toBinaryString(N);
        String result = "";
        for (int i = 0; i < binary.length(); i++) {
            result += String.valueOf(binary.charAt(i));
        }
        return result;
    }

    
    public static String solve_Problem_1_994ced4f_dafe_4274_84e0_2c5a661cda2b(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_e7f41c6a_e9e2_4dec_a681_6ec4fb7e6c98(int N) {

        String binary = "";
        while (N > 0) {
            binary = String.valueOf(N % 2) + binary;
            N = N / 2;
        }
        return binary;
    }

    
    public static String solve_Problem_0_6e2e5707_5aed_4669_83ac_296b1ee015f4(int N) {
        // Return result.
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_42dc0ca5_f6c7_4457_a4b1_56105ffb101e(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_9aeb183b_a332_452d_90f7_bde4c01b73f6(int N) {

        // Write your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_57b5063c_e9cb_454f_ab99_5becfefb0b31(int N) {

        // Write your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_dbea8310_8905_4632_af64_0f9a7ad575d7(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_8fc8f1bc_028e_46e5_a4bc_5d58d09eb399(int N) {
        String s = Integer.toBinaryString(N);
        int sum = s.chars().sum();
        return Integer.toBinaryString(sum);
}

    
    public static String solve_Problem_0_016b3e66_98d8_4e7d_8cae_52aa960dd907(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_21c82e66_82cd_4f3a_9df2_983f4c1cb7d7(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_91736fce_824b_4bc6_8c7e_200285c8e9d2(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_ed81cda7_86dc_4a9f_8a29_bed0d4990acf(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_f97b288e_0213_49c4_902f_215f3fdce8c8(int N) {
        int times = 0;
        int count = 0;
        while(N > 0) {
            count += N % 2;
            N /= 2;
            times++;
        }
        StringBuilder sb = new StringBuilder();
        while(times > 0) {
            if(count > 0) {
                sb.append(1);
                count--;
            } else {
                sb.append(0);
            }
            times--;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_80972f5d_44d2_428d_add8_aee9e82f2816(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_0_540489f8_157f_4ff6_98ee_3d2e37885aca(int N) {
        String binaryNum = Integer.toBinaryString(N);
        int sum = Arrays.stream(binaryNum.split(""))
                .mapToInt(Integer::parseInt)
                .sum();
        return Integer.toString(sum);
}

    
    public static String solve_Problem_4_b0350ed3_3d90_49f8_b8d9_f7f6d0274a90(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_1e8c1158_4987_4117_81b8_f7074f259e98(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N = N / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_22d37876_b3f7_49d5_8e29_da657b76f63b(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_1_f5a0c330_26d2_46b5_bfda_f4e11f4318ba(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_d2714e1c_55a9_44ef_9ac9_b5be428ac300(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_4eb720a0_8510_4fb7_b5aa_34a503bd8a1a(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_e372eab5_f0bb_4c04_99a5_88635c68a3b5(int N) {
        int ans = N;
        int sum = 0;
        int tmp = N;
        while (True) {
            while (tmp > 0) {
                int digit = tmp % 10;
                sum += digit;
                tmp /= 10;
            }
            if (ans == N) break;
            ans *= 2;
            ans -= sum;
            sum = 0;
        }
        return String.valueOf(ans);
    }

    
    public static String solve_Problem_3_5ea0fdfd_1f39_467a_b260_b9c70b389640(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_6af3040c_6459_4097_a9dd_ee2dd0fde212(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_a7610c59_c213_43e6_bc97_0fe7b2b8da9d(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            sum += Character.getNumericValue(c);
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_4_a5f38f08_3291_481e_8017_d7a61dbc8973(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_1_b37f4e05_2384_45bc_8065_8bdaad9b05c1(int N) {

        // Write your code here
        String binary = "";
        while (N > 0) {
            binary = N % 2 + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_0_e7aa25a2_6a59_4f27_9fe3_4a72266acb16(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_c736da94_f71c_47b1_92ad_cc70b8ea41e8(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_fbad9a74_fa7a_4d8b_9365_183e69a1a07a(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_43b5a651_3418_47ed_b9b7_6d5b2efd30e8(int N) {
        String binary = Integer.toBinaryString(N);
        if (binary.length() > 2) {
            return "0";
        }
        String result = "";
        for (char c : binary.toCharArray()) {
            if (c == '0') {
                continue;
            }
            int digit = Character.getNumericValue(c);
            result += (char) (Math.pow(16, digit));
        }
        return result;
    }

    
    public static String solve_Problem_1_86c56c93_7160_4913_ba13_67ba48a26054(int N) {
        int number = 0;
        int digits = 0;
        while (number != N) {
            number /= 10;
            digits++;
        }
        StringBuilder sb = new StringBuilder();
        while (digits > 0) {
            sb.append(Integer.toBinaryString(number % 2));
            number /= 2;
            digits--;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_1673c2ba_d035_4172_97d5_b899f6943896(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_c41d4f90_7a85_4a6a_8049_571de7ad37ae(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_7f34d0ea_5eef_4373_b9ee_fc7042a7dbca(int N) {

        String ans = "";
        while(N>0){
            ans = (N%2) + ans;
            N/=2;
        }
        return ans;
    }

    
    public static String solve_Problem_3_2d89b8ab_df37_4af3_b98c_2a994a75e6d9(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_1412f519_be8a_4aa6_b039_a8e68a9d4420(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_65edcd65_b7bf_4c42_82ed_ad1a75b3c342(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_e14f14a6_808b_49cb_932e_59eb0e2855e2(int N) {

        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_659305be_4f2a_4df5_b1a5_2435213664e8(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_b45ddd70_3ebf_419f_a705_42794a7e8493(int N) {
        // Write your code here.
        String converted = Integer.toBinaryString(N);
        // System.out.println(converted);
        int sum = 0;
        for (int i = 0; i < converted.length(); i++) {
            sum += Integer.parseInt(String.valueOf(converted.charAt(i)));
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_1_5751b7ce_b415_423d_b4f7_49a06bea0d59(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_a169b7a3_3f74_4114_bd50_65cab6fb4278(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_e2487cfe_d012_446c_8d24_5f0af9f0904e(int N) {
        if (N <= 0)
            return "0";
        int result = 0;
        int temp = N;
        while (temp > 0) {
            result = result + ((temp % 10) + 1);
            temp = temp / 10;
        }
        return ("" + result);
}

    
    public static String solve_Problem_0_9def2459_94fc_46be_8fa8_c4944acd0379(int N) {
        int factor = 1;
        //sum of digits in the binary representation of n.
        int decimalResult = 0;
        //step 1: get the binary representation of N
        String binaryNumber = Integer.toBinaryString(N);
        //step 2: compute the sum of digits
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == '1') {
                decimalResult += factor;
            }
            factor *= 2;
        }
        //step 3: return the result
        return "" + decimalResult;
}

    
    public static String solve_Problem_0_a470db42_18c4_4197_b8f5_6436d2686670(int N) {
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_1_fc5b6cab_31b6_42a8_ac85_0124ce6434e3(int N) {
        String[] result = new String[2];
        String binary = Integer.toBinaryString(N);
        int n = binary.length();
        result[0] = binary.substring(0, n - 1);
        result[1] = binary.substring(n-1, n);
        return Arrays.stream(result).collect(Collectors.joining());
    }

    
    public static String solve_Problem_1_0c355e74_3bf7_40d4_8421_76b83f1b51fa(int N) {
        return Integer.toBinaryString(N);
}

    
    public static String solve_Problem_4_32001da2_fa6d_4b72_9bbe_4e41121783e0(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_ed968b3e_f7e8_47b1_8882_e09a667501b7(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= N; i++) {
            String binary = Integer.toBinaryString(i);
            int sum = 0;
            for (int j = 0; j < binary.length(); j++) {
                sum += binary.charAt(j) - '0';
            }
            sb.append(sum);
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_1556fd9c_0a4a_46cc_944e_9d9c694efb9d(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_03e86434_6072_48dd_83a3_66d5ff196937(int N) {
        int sum = 0;
        while (N --> 0) sum++; // sum of the digits
        int digits = Math.floor(Math.log(N)/Math.log(2));
        String res = "";
        while (digits --> 0) res += "1";
        while (sum --> 0) res += "0";
        return res;
}

    
    public static String solve_Problem_0_3635f872_1dad_4e92_b119_84c496134713(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_4_7fae0030_ee8a_4f36_a49e_f7e21ef75eed(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_e976cfd7_2f81_42c9_80e5_0f63f9897191(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_2ed34edc_6126_4012_b9f6_77fb7962dc17(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int temp = N % 10;
            sum += temp;
            N = N / 10;
        }
        for(int i = sum; i > 0; i--){
            sb.append(String.valueOf(i & 1));
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_97cc1eee_3f95_4942_a3eb_1f5761f25109(int N) {
        // Good luck!
        String ans = "";
        for (int i = 0; i < 100000; i++) {
            if (N == 0) {
                break;
            }
            if (N % 2 == 0) {
                ans = "0" + ans;
            } else {
                ans = "1" + ans;
            }
            N /= 2;
        }
        return ans;
    }

    
    public static String solve_Problem_1_ce0f4ce9_ad87_469b_9eeb_90c45dd7b499(int N) {
        // your code here
        return Integer.toBinaryString(N);
}

    
    public static String solve_Problem_4_a2bea27b_c2d7_460c_a685_188fcfca80ed(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        // Loop from 0 to N and get each number in binary string
        for (int i = 0; i < N; i++) {
            String binary = Integer.toBinaryString(i).replace('-', '1');
            // Add it to the total
            sum += binary.length();
            // Append this digit
            sb.append(binary);
        }
        // Build the final answer by concatenating the total of each digit
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_1_4318dd7a_eb44_4b10_8061_ec40fe2e9a09(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_e67a0afa_6c28_417e_9901_f09e8e8a7c34(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_0d836cda_83aa_4387_912a_909dc66ea133(int N) {
        int sum = 0;
        while (N !=0){
            sum += N % 2;
            N = N / 2;
        }
        if (sum > 10000) {
            return "0";
        } else {
            return Integer.toBinaryString(sum);
        }
    }

    
    public static String solve_Problem_3_409d3254_2f09_40c2_bca0_1467e49b1fd7(int N) {
        // TODO: your code goes here
        int[] arr= new int[32];
        arr[0]=N;
        int[] sums=new int[32];
        while(arr[0]!=0){
            int sum=0;
            int remainder=arr[0]%2;
            int index=0;
            while(arr[index]!=0 && arr[index]!=1){
                sum+=arr[index];
                sums[index]=sum;
                index++;
            }
            sums[0]=sum;
            arr=Arrays.copyOfRange(arr,1,arr.length);
            sums=Arrays.copyOfRange(sums,1,sums.length);
        }
        int maxsum=0;
        for(int i=0; i<sums.length;i++){
            if(sums[i]>maxsum){
                maxsum=sums[i];
            }
        }
        return Integer.toString(maxsum);
}

    
    public static String solve_Problem_3_3a7bfa78_4963_4ba7_ab74_e7449a618680(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N = N / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_af3686e7_1e5e_4a2e_803c_9b8da19ed217(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_16759917_331c_408b_8828_521921cb610f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_5835248b_0f71_454b_b968_668c02762cab(int N) {
        int remainder = 1000000000L;
        int sum = 0;
        while (True) {
            int temp = remainder;
            int decimalPosition = 0;
            while (temp != 0) {
                temp = temp % 10;
                decimalPosition++;
            }
            remainder =  (N / 10);
            sum += decimalPosition;
            N -= decimalPosition * 10;
            if (N == 0)
                return String.valueOf(sum);
        }
    }

    
    public static String solve_Problem_1_6707b203_7cb7_4cf1_bcf9_a9ddea8beefc(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(N%2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_7314038d_c38c_4a94_b33b_73c81db601b5(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_46bf8a02_f418_4510_8484_3369f2f00479(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_3843ddb9_c7b1_4520_bb99_7d36cd23e655(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_d4b087e5_e0a8_48b6_ac50_0888b1b4172d(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_48a099df_1869_40bc_8dbf_236881924336(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_bfa6bce6_d13a_43e4_a738_5a00330862d3(int N) {
        int result = 0L;
        while (N > 0) {
            result = result + (N % 10);
            N /= 10;
        }
        return String.valueOf(result);
    }

    
    public static String solve_Problem_0_b8b0200b_aec3_4313_b257_407c2b45d0e2(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_08b64e91_6e77_4986_a6c9_3866592ef2f0(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_076c1749_3de1_4052_a7e4_eeac79bcb006(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_e0911190_1824_4b97_a8db_40193b05f88d(int N) {
        return Integer.toBinaryString(N);
}

    
    public static String solve_Problem_0_89c27063_005f_474a_93ca_590fb1eda14e(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_44461f0e_1e47_4956_b25e_72cf134d6752(int N) {
        return "";
    }

    
    public static String solve_Problem_1_d92edaf4_4090_4345_a97d_24e3a2784ead(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= N; i++) {
            String binary = Integer.toBinaryString(i);
            int sum = 0;
            for (int j = 0; j < binary.length(); j++) {
                sum += binary.charAt(j) - '0';
            }
            sb.append(sum);
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_4e3aa832_bc37_4fdc_813f_6361a2fe1090(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Character.getNumericValue(binary.charAt(i));
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_0_dbea8310_8905_4632_af64_0f9a7ad575d7(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_dc1b108a_3267_4fef_8946_a82e62292588(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_5a77b88f_2864_45d2_b212_367f63abbb42(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_c0fcaa15_97a1_4e96_aca0_851e8a243268(int N) {
        String x="";
        while(N>0){
            x=N%2+x;
            N/=2;
        }
        return x;
    }

    
    public static String solve_Problem_4_0575a432_4ad6_47c1_98e4_4c9b0a92cc7b(int N) {
        return Integer.toBinaryString(N).chars().map(c -> c - '0').sum() + "";
}

    
    public static String solve_Problem_0_f679c4a1_68d4_4427_889b_4ef98afa1e26(int N) {
        boolean digitSums[] = new boolean[N];
        Arrays.fill(digitSums, True);

        // add up the digits in the binary representation of N
        // and multiply that by the appropriate power of 2
        int sum = 0;
        for (int i = 0; i < N / 2; i++) {
            if (digitSums[i]) {
                sum += N % 10 * Math.pow(10, i);
                digitSums[i] = False;
            }
            N /= 10;
        }

        // convert sum to a string
        String bin = Integer.toString(sum, 2);
        if (N > 0) {
            // append 1's if the binary has non-zero digits and an odd length
            if (bin.length() > 1) {
                bin = "1" + bin;
            } else {
                bin = "0" + bin;
            }
        }
        return bin;
}

    
    public static String solve_Problem_1_bcc68e49_d709_4bf8_872a_2dfb96900c09(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_877d9c39_02df_4c41_931c_3cdcef2b8feb(int N) {
        ArrayList<Integer> digitSums = new ArrayList<Integer>();

        String binary = "";
        while (N >=10) {
            digitSums.add(N%10);
            N = N/10;
        }
        binary = digitSums.stream().map(d -> String.valueOf(d)+"0").collect(Collectors.joining());
        return binary;
}

    
    public static String solve_Problem_4_3d19e69a_8abc_48c0_af48_96733d4d70c9(int N) {
        int sum = 0;
        int power = 1;
        String ans = "";
        // Iterate through binary representation of N
        for(int i = N; i >= 1; i/= 2){
            // Add ith digit to sum
            sum += N % 10;
            // Multiply ith power of 2 with N
            power *= 2;
        }
        // Reverse sum to put in binary string
        for(int i = sum; i >= 0; i/= 2){
            ans = ans + ((ans.charAt(i) - '0') + Integer.parseInt(Integer.toBinaryString(sum)) * power);
            // Multiply power * 2 with ith power of 2
            power *= 2;
        }
        return ans;
}

    
    public static String solve_Problem_4_0b141865_7b6c_4e68_923a_ff77ca480170(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_6ec6fa70_f7c3_4e7a_830a_4afa17222246(int N) {
        int remainder = 0;
        int sum = 0;
        int remainder_count = 0;
        while(N !=  0) {
            sum = sum * 10;
            remainder = N % 10;
            sum = sum + remainder;
            N = N / 10;
            remainder_count = remainder_count + 1;
        }

        // Converting into binary
        StringBuilder binaryBuilder = new StringBuilder();
        while(sum > 0) {
            binaryBuilder.append(sum % 2);
            sum = sum / 2;
        }

        binaryBuilder.reverse();
        String result = binaryBuilder.toString();
        result = result + (remainder_count > 0 ? "(" + remainder_count + ")" : "");
        return result;
    }

    
    public static String solve_Problem_4_2b9f8a28_4575_4012_b0fa_a0f4a6c67206(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_fc8e6e45_1b83_4a5d_8a74_3c50c4fc1747(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_4_9afc225e_ac41_4553_838f_7ed3228a67d1(int N) {
        // Code here
        if (N == 0) return "0";
        if (N == 1) return "1";
        final int log2 =  (Math.log(N)/Math.log(2));
        List<String> digits = Arrays.asList(N%2 == 0 ? "1" : "0", Integer.toString(N/2), (N/2&1) == 1 ? "" : "1");
        return String.join("", digits);
}

    
    public static String solve_Problem_3_21d1bb7a_a510_45fe_9f88_6b72ac362080(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_b34f5115_719e_454e_864d_66f1ebdf8bff(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_ef6aa02b_0247_4a7b_ac0e_8b4298730925(int N) {
        String s = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_0_e8d71c74_5a2f_42fd_a5df_3fa66492abbe(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_eb936c61_c741_49d1_b98f_1b77f57b13a7(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_399bd463_8291_4073_a8b0_046ecf219524(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_8f54b894_c50b_4a98_bfc8_384c92786466(int N) {

        String binary = "";
        while (N > 0) {
            binary = (N % 2) + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_0_e364bf03_6885_4688_880c_ea0693f2e321(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_9eb0aee2_b67a_48b2_8265_ca2fd9612d13(int N) {
      // Write your code here
      // To print results to the standard output you can use System.out.println()
      // Example: System.out.println("Hello world!");
        String a = Integer.toBinaryString(N);
        String b = "";
        for(int i = a.length()-1; i >= 0; i--){
            b += a.charAt(i);
        }
        return b;
    }

    
    public static String solve_Problem_0_6af3040c_6459_4097_a9dd_ee2dd0fde212(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_46cf48e9_2531_449d_88e8_5b372dd3c89e(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_5cee3fa9_63fa_4763_be9d_e9bdbf942af1(int N) {
        if (N == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int one = N % 10;
        N /= 10;
        int two = N % 10;
        N /= 10;
        int three = N % 10;
        N /= 10;
        int four = N % 10;
        N /= 10;
        int five = N % 10;
        N /= 10;
        int six = N % 10;
        N /= 10;
        int seven = N % 10;
        N /= 10;
        int eight = N % 10;
        N /= 10;
        int nine = N % 10;
        N /= 10;
        char oneChar = '1';
        char twoChar = '2';
        char threeChar = '3';
        char fourChar = '4';
        char fiveChar = '5';
        char sixChar = '6';
        char sevenChar = '7';
        char eightChar = '8';
        char nineChar = '9';
        char digitChar = '0';
        sb.append(oneChar);
        sb.append(twoChar);
        sb.append(threeChar);
        sb.append(fourChar);
        sb.append(fiveChar);
        sb.append(sixChar);
        sb.append(sevenChar);
        sb.append(eightChar);
        sb.append(nineChar);
        sb.append(digitChar);
        sb.append(oneChar);
        if (one > 0) sb.append(oneChar);
        if (two > 0) sb.append(twoChar);
        if (three > 0) sb.append(threeChar);
        if (four > 0) sb.append(fourChar);
        if (five > 0) sb.append(fiveChar);
        if (six > 0) sb.append(sixChar);
        if (seven > 0) sb.append(sevenChar);
        if (eight > 0) sb.append(eightChar);
        if (nine > 0) sb.append(nineChar);
        return sb.toString();
}

    
    public static String solve_Problem_0_0e413f54_628e_47d8_b0e2_ac42e7df97e6(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_7f27f79c_1121_4a3c_b131_54ac01732602(int N) {

        String res = "";
        while (N > 0) {
            res = String.valueOf(N % 2) + res;
            N = N / 2;
        }
        return res;
    }

    
    public static String solve_Problem_1_70d48889_bb91_4ac7_a743_d56fa7f5d67d(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_51d0f445_d39e_43d5_aad6_46b8667bf577(int N) {
        final int bitSize = 64;
        int sum = 0;
        while (True) {
            int remainder = N % bitSize;
            N =  (N / bitSize);
            if (remainder == 0) {
                sum += bitSize;
            }
            else {
                sum +=  remainder;
            }
            if (N == 0) break;
        }
        final int twoSum = sum * sum;
        final String prefix = sum < bitSize ? Integer.toBinaryString(sum) : Integer.toBinaryString(sum - bitSize);
        final String suffix = (twoSum % bitSize == 0) ? "" : Integer.toBinaryString(twoSum / bitSize);
        final String binary = prefix + suffix;
        return binary;
    }

    
    public static String solve_Problem_3_c49aaab8_daa0_414f_a1c0_681f8538da52(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N = N / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_21e223a1_9605_4858_b279_08cece165bc2(int N) {
        String s = Integer.toBinaryString(N);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return Integer.toString(count);
}

    
    public static String solve_Problem_4_09791c7a_547c_49db_9c72_c77310fdef94(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Character.getNumericValue(binary.charAt(i));
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_3_8be121fd_c5f7_4fd8_b4b4_4b2aa1329005(int N) {

        String result = "";
        while (N > 0) {
            result = String.valueOf(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_f4530238_c5f9_4d93_ae2d_41029bfba07d(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_9198eca4_467c_4d5f_b4ad_ff39360c19f1(int N) {
        return "";
    }

    
    public static String solve_Problem_0_268b4641_acda_4667_ba42_715a731ae47f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_b3cf045b_c5f3_4127_868e_7bc02f4ed126(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_785e6b1c_456b_4d6e_8540_bc4e7ebf4aa9(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_3_cfd9e60b_369b_40ca_bfad_b32bc176bcd1(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_b53ee0a2_e5df_4023_8631_42824b2ee970(int N) {

        // Write your code here
        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_0fd46f4f_0c75_410f_8d2a_74d24cf63af1(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_22e55aec_b276_4639_aa34_e2e853d4f170(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_e5a83e26_39a2_4312_8bb5_ee5ebfd6f0b8(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_0_4e0955fa_7343_469e_9510_4221fbab4645(int N) {
        String binary = Integer.toBinaryString(N);
        // convert string to list
        List<String> list = new ArrayList<String>(Arrays.asList(binary.split("")));
        // convert list to stream and sum
        String sumOfDigits = list.stream().mapToInt(Integer::parseInt).sum() + "";
        return sumOfDigits;
}

    
    public static String solve_Problem_3_d1d08a9d_4ba7_4f84_8c8e_dcfa0c6f44a0(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_c1940a3c_1f5b_473f_9aa1_3a4601ee9bf6(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_f77c3b25_1dd3_4673_a701_e70cacfc77e4(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_0ca0dac6_80da_492b_b40c_c4f49ea4a204(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_47289acc_8eeb_4a03_bc89_8c1d6329f811(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_e7fead4e_691b_4e8e_b29c_4dfc51232a4d(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_5a64fe61_7fa1_482e_a1f5_a9a4d562d0c8(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_4_7fbda340_fc22_424b_9f65_985e5949406e(int N) {
        // Your code here
        return "";
    }

    
    public static String solve_Problem_3_6c2609e3_3000_4c14_8bd9_c19c8f79a13a(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_1_932d891d_69b4_4009_aa53_6e7cd4ea60c1(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_373e30ea_6eba_46bb_a83a_dc8c2a67de02(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_77742de9_68f2_4c9b_bbad_c5ff7193c4cd(int N) {
        String s = new String();
        s = Integer.toBinaryString(N);
        String[] sa = s.split("");
        int n = sa.length;
        int S = 0;
        for (int i = 0; i < n; i++) {
            S += Integer.parseInt(sa[i]);
        }
        s = Integer.toString(S);
        return s;
}

    
    public static String solve_Problem_4_547aadc8_4695_40f8_af63_caaf0a600563(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_55613c72_59b5_4ba3_bef2_befbac75b846(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_a7ba902d_003f_48ff_b48c_1ab4b2a30e68(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int digit = N % 10;
            sum += digit;
            N = N / 10;
        }
        sb = new StringBuilder();
        while (sum > 0){
            int digit = sum % 2;
            sb.append(digit);
            sum = sum / 2;
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_0888c87e_36e8_4dda_8be8_00edff885c45(int N) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_3_92d34c26_1a17_43df_a5f7_d2c4fd7719a9(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_160aaa34_3f6c_40a9_b6f4_32f2031913e3(int N) {
        // convert N to a string
        String str_N = Integer.toString(N);
        String[] binary = str_N.split("(?<=\\G.{1})");
        // get the length of the array
        int length = (binary.length - 1);
        // initialize a new StringBuilder
        StringBuilder bin = new StringBuilder();
        // loop through each bit of the string and append it if it
        // is set to 1
        for (int i = 0; i < length; i++) {
            if (binary[i].equals("1")) {
                bin.append(1);
            } else {
                bin.append(0);
            }
        }
        // return the string we built
        return bin.toString();
    }

    
    public static String solve_Problem_1_68198528_368e_4e32_8d26_f9c10454b68b(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(True) {
            int digit = N % 10;
            sum += digit;
            N /= 10;
            if(N == 0) break;
            sb.append(digit);
        }
        return String.valueOf(sum) + sb.toString();
}

    
    public static String solve_Problem_0_25ffee00_b61e_4085_8743_c22a59b26838(int N) {
        String ans = "";
        while (N > 0) {
            int r = N % 2;
            ans = r + ans;
            N /= 2;
        }
        return ans;
    }

    
    public static String solve_Problem_0_ef02c610_e954_45a8_8d8a_511551519b58(int N) {
        int x = 0;
        double y = N;
        boolean flag = False;
        String res = "1";
        if (N == 0) {
            return res;
        }
        // while (N > 0) {
        x %= 1000000000000L;
        x /= 1000000000000L;
        while (y > 0) {
            if (y % 2 == 0) {
                res  = res + x;
                y = y / 2;
                x = x / 2;
            }
            else {
                y /= 2;
                x = x / 2;
            }
        }
        if (res.length() == 1) {
            return res + x;
        }
        return res;
    }
    public static void main(String[] args) {
    assert(solve_Problem_0_ef02c610_e954_45a8_8d8a_511551519b58((1000)).equals(("1")));
    assert(solve_Problem_0_ef02c610_e954_45a8_8d8a_511551519b58((150)).equals(("110")));
    assert(solve_Problem_0_ef02c610_e954_45a8_8d8a_511551519b58((147)).equals(("1100")));
    assert(solve_Problem_0_ef02c610_e954_45a8_8d8a_511551519b58((333)).equals(("1001")));
    assert(solve_Problem_0_ef02c610_e954_45a8_8d8a_511551519b58((963)).equals(("10010")));
    }

}

    
    public static String solve_Problem_4_e4a4b9f3_c942_4de0_8a99_3c4e95545569(int N) {
        StringBuilder result = new StringBuilder("");
        int temp = 0;
        while (N !=0){
            temp = N % 10;
            N = N / 10;
            result.append(temp);
        }
        return result.toString();
}

    
    public static String solve_Problem_0_d9a6372d_d18d_4d96_9f57_be512091c8b4(int N) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_1_00a39bbd_57b1_4e24_8bea_48faf9bd18a4(int N) {

        String binary = "";
        while (N > 0) {
            binary += N % 2;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_0_5def7306_3f19_406f_a3f3_18b0a1e293a3(int N) {
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        while (N !=  0) {
            int last = N %10;
            N /= 10;
            sum += last;
            builder.append(last);
        }
        builder.insert(0, sum + "");
        return builder.toString();
}

    
    public static String solve_Problem_3_bacb2d25_1dc4_41d9_b6aa_e5918f2a3310(int N) {

        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += binary.charAt(i) - '0';
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_3_200b78e2_3948_4176_b954_acf665eb37b4(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_533c4565_7489_48b0_b900_bdf5afa4b3a8(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_9eadd6ed_f4c4_40aa_92c4_0775c1569e87(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_808b796b_1f21_4d23_86e4_d7b69f8430dc(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_bc33b7ed_42ad_434a_93bd_f08b4656afa4(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_ed6281d8_0f24_48fc_a8b1_501356ca7924(int N) {
        int sum = 0;
        int temp = N;
        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        StringBuilder sb = new StringBuilder();
        while(sum > 0) {
            sb.append(sum % 2 == 0 ? "1" : "0");
            sum /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_d57ffa8b_652d_47bd_be5c_773e1ff80445(int N) {
        int sum = 0;
        int temp = N;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_3_4a1ca3c7_79a0_458c_8a9a_63d08ce85f64(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_8cd810a0_88c7_4301_a326_936acbd3f67b(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_5c85a9e9_fcb5_4b21_a3d4_732b7fe7b34b(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_6b6cf337_3f71_4de2_b580_c054dad2824d(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_d1129091_1559_4c4b_8719_638f1292355e(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_24ae9dba_d8d8_4e40_868e_3479a4940267(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_3_f396947a_8d18_4370_9011_2f64ca951012(int N) {
        Map<String, Integer> digits = IntStream.range(0, 10)
                .boxed().collect(Collectors.toMap(
                        n -> String.format("%" + n + "d", n),
                        n -> n));
        StringBuilder result = new StringBuilder();
        IntStream.range(0,N).forEach(n -> {
            String binary = digits.get(n) + "";
            while (binary.length() < Integer.toString(n).length()) {
                binary = binary + '0';
            }
            result.insert(0, binary);
        });
        return result.toString();
}

    
    public static String solve_Problem_4_e4a8a255_c05d_48dd_a6c7_49ce82941efa(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_500c6299_9139_481b_af9c_ecfe73e71ad9(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_eeb7511a_7734_441e_bc88_b240d628d2c0(int N) {

        // Write your code here.
        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_4_40284078_d7d4_427a_9be9_dd6cc8de28ef(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_3e69d7e2_1300_410c_8ad9_af46996e6e8f(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_8e6d746e_f1d7_4baf_b121_16f79f1c0e14(int N) {

        String res = "";
        while (N > 0) {
            res = (N % 2) + res;
            N /= 2;
        }
        return res;
    }

    
    public static String solve_Problem_1_3fd9ea5a_1ed3_425d_b43c_75ed58f2ab0b(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            sum += N % 10;
            N /= 10;
        }
        while(sum > 0){
            sb.append((char)('0' + sum % 2));
            sum /= 2;
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_a5b250eb_8c3f_407e_8b0e_aee0f935623e(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_e495ffe0_e17d_41e3_b629_11ecb79b2fac(int N) {
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += (i % 2 == 0) ? i%2 : 0;
        }
        String output = "";
        while(sum > 0) {
            int rem = sum % 2;
            output += (rem > 0) ? "1" : "0";
            sum = (sum - rem) / 2;
        }
        return output;
}

    
    public static String solve_Problem_1_199d2d16_a2e8_4ef6_8d5e_892844d6c5e0(int N) {
        String s = "";
        if (N < 1000) {
            String t = Integer.toBinaryString(N);
            s = t.substring(t.length() - 1);
        }
        if (N < 100000000) {
            String t = String.format("%" + Integer.toBinaryString(N).length()
                    + "d", N);
            s = t.substring(t.length() - 1);
        }
        return s;
}

    
    public static String solve_Problem_4_219a26f7_5455_4ab2_be89_37c8b77effba(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_4aecbefe_25d7_4084_bca6_e92dfc5d1e78(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_57922694_6c3a_441d_9461_b5decec46a9d(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_7d8681bb_1465_4262_8b23_8d0346c19a2a(int N) {
        // Write your code here
        String s = "";
        int t = N;
        while (t > 0) {
            int rem = (t % 2);
            s += Integer.toString(rem);
            t /= 2;
        }
        return s;
}

    
    public static String solve_Problem_3_14a53142_61e0_47a8_a9c5_e0714a1c8030(int N) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_1_132a7810_a438_45ed_88ec_bbbc84f59a43(int N) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_0c9fd382_3758_419a_9382_5ac2c242e0a1(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N = N / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_8b966322_3bfa_4fdd_9332_c0e5ba0b277e(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_d0368850_5322_4294_bdf6_86342fe74b1d(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_0_7324f1da_4434_4640_9b1e_dab480ba7e06(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_00c4fb56_bf72_44cf_85b6_3cef07a70efa(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_8da1f089_65b6_4388_b259_c8b7ce4806a7(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_c7217d39_221f_4402_9db4_9153a3222235(int N) {
        // write your code in Java here
        String result = "";
        int count = 1;
        while(count <= N) {
            String s = Integer.toString(count);
            int pos = s.indexOf("1");
            String temp = s.substring(0, pos);
            result += temp;
            count = count*10 + 1;
        }
        return result;
}

    
    public static String solve_Problem_3_25079f62_da62_4b2e_be11_7f4a08f55796(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_2a84a985_5b4a_4a96_a403_0102cb7a0d4a(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_0_8525487f_1e76_4036_93b2_8b75afbb97f4(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_f36d985a_f4d3_4a62_8ba0_f90899ba417b(int N) {
        // write your code here
        return String.valueOf(N);
}

    
    public static String solve_Problem_3_4318dd7a_eb44_4b10_8061_ec40fe2e9a09(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_a70b7799_d615_4366_a1e3_31f49c0a6ec1(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_0_2b0dbd2e_935a_486c_927b_f8a1c1d95bd8(int N) {
        int result = 0;
        int digits = 0;
        int power = 0;
        int remainder = 1;

        do {
            digits =  (N / remainder);
            power++;

            result += digits * Math.pow(10, power);
            remainder =  (remainder / 10);
        } while (N != 0);

        return String.valueOf(result);
    }

    
    public static String solve_Problem_4_a706a9f7_5836_4421_9f89_8880da385d5e(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_2e7d7e9d_46a3_4537_925e_7986f99f8674(int N) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        String bin = Integer.toBinaryString(N);
        int sum = bin.chars().map(Character::getNumericValue).sum();
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_1_1a6ede5e_be4c_43ae_900f_f26d62c5feb0(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_01b3038d_3850_4b02_8deb_db5137c5b7eb(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_3a56337e_019c_473e_aa46_6d340b37c349(int N) {

        // Write your code here
        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_d16de670_3a2c_44a5_ba87_dbaaca06f6a6(int N) {
        String output = "1";

        while (N --> 0) {
            int sum = 0;

            while (N != 0) {
                sum += N % 2;
                N /= 2;
            }

            String temp = Integer.toString(sum);
            if (temp.equals("")) {
                output = output + "0";
            } else {
                output = output + temp;
            }
        }

        return output;
}

    
    public static String solve_Problem_1_57cde96f_5104_4f23_a3af_1517c14113d6(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainder = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        while(sum>0){
            remainder = sum % 2;
            sum = sum / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_3_db618416_86df_4776_86ac_a843d92846a3(int N) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_3_9d673c1d_31e8_4539_9239_793947435095(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_f278f8fc_62a3_4fd4_bbcb_bde4f239e099(int N) {
        // Write your code here
        // Hint: This is the first question,
        // you can try to solve_Problem_1_f278f8fc_62a3_4fd4_bbcb_bde4f239e099 this question with the language you like.
        // In this case, you can use Java, C++ or C#.
        // For example, you can use C++ as follows:
        int count = 0;
        int temp = N;
        // Calculate the number of digits
        while (temp != 0) {
            temp /= 2;
            count++;
        }
        // Fill the array by dividing
        int[] binary = new int[count];
        for (int i = 0; i < count; i++) {
            binary[i] = N % 2;
            N /= 2;
        }
        // Reverse the array
        for (int i = 0; i < count / 2; i++) {
            int temp2 = binary[i];
            binary[i] = binary[count - i - 1];
            binary[count - i - 1] = temp2;
        }
        // Make string
        String result = "";
        for (int i = 0; i < count; i++) {
            result += Integer.toString(binary[i]);
        }
        return result;
}

    
    public static String solve_Problem_0_210544ab_e9bc_49b1_9b76_624e9ff64690(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int temp = 0;
        while (N !=0){
            temp = N % 10;
            sum += temp;
            N = N / 10;
        }
        temp = sum;
        while (temp != 0){
            temp = temp / 2;
            sb.append(temp % 10);
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_7f23190a_b643_4479_94e3_9c5154334021(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_21d1bb7a_a510_45fe_9f88_6b72ac362080(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_3bd04dfb_8287_4ba7_ab5f_3f5266a9221f(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_4c229120_e80d_4c40_8288_f07ce5fbda49(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_4_6f65b408_f29a_4904_9ecc_ba0326200188(int N) {
        // write your code in Java here
        int a = N;
        String result = "";
        int rem;
        while ( a != 0){
            rem = a % 10;
            result += "" + rem;
            a /= 10;
        }
        return result;
    }

    
    public static String solve_Problem_0_959bf5f4_62f6_4740_8031_bda97ed30241(int N) {
        int sum = 0;
        String str = Integer.toBinaryString(N);
        for (int i = 0; i < str.length(); i++)
            sum += Integer.parseInt(str.substring(i, i + 1));
        return Integer.toString(sum);
}

    
    public static String solve_Problem_3_659305be_4f2a_4df5_b1a5_2435213664e8(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_0fe04782_8b5b_406d_abdc_747f2539d298(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N%2);
            N /= 2;
        }
        return new String(sb.reverse());
}

    
    public static String solve_Problem_0_aed52ff6_6dc9_4124_a6ca_4b47860e6880(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_88649dd8_3860_4746_9532_1464c92b83b9(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_e064f4d7_d3e4_4e1b_a5e4_789eebc45165(int N) {
        //I think I have to convert the int to binary and then count the 1s
        String s = Integer.toBinaryString(N);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return Integer.toString(count);
}

    
    public static String solve_Problem_0_5a023810_631f_4be8_a192_13dd66a4030a(int N) {
        return "";
    }

    
    public static String solve_Problem_1_2f355b86_eaea_4622_8137_ea2f06b5580c(int N) {
        StringBuilder result = new StringBuilder();
        int value = N;
        while (value != 0) {
            int rem =  value % 2;
            result.append(rem);
            value /= 2;
        }
        return result.reverse().toString();
    }

    
    public static String solve_Problem_1_8fc8f1bc_028e_46e5_a4bc_5d58d09eb399(int N) {
        String s = Integer.toBinaryString(N);
        int sum = s.chars().sum();
        return Integer.toBinaryString(sum);
}

    
    public static String solve_Problem_0_b3b7d3b6_0255_4e0d_b7a2_a0f708e4edac(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_b5ea972b_c7af_47cb_be4b_a6484abd3d70(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_ed4314cc_ac25_49c6_8385_ce6977b8e305(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_5a49cdf2_7c9a_46a6_aa41_6bf60f5d7a0c(int N) {
        String s = "";
        int sum = 0;
        while (N !=0){
            sum = sum + N % 2;
            N = N / 2;
        }
        while(sum > 0){
            int temp = sum % 10;
            s = s + temp;
            sum = sum / 10;
        }
        return s;
}

    
    public static String solve_Problem_4_2dc0a06f_a37a_4b9c_b78e_fbd3a9f91719(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_c84d44c4_edf7_4891_9ced_5df05a786912(int N) {
        return Integer.toBinaryString(N);
}

    
    public static String solve_Problem_3_ef6aa02b_0247_4a7b_ac0e_8b4298730925(int N) {
        String s = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_1_030928c2_04a2_498c_920b_1bef91bc6ed8(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_57e389af_255c_4b1d_8f86_c6c1a665c4d2(int N) {
        return Integer.toBinaryString(N).chars().map(Character::getNumericValue).sum() + "";
}

    
    public static String solve_Problem_0_4bd5a8c7_8295_4b80_9d48_260fe6e9d57c(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_89c27063_005f_474a_93ca_590fb1eda14e(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_a2ff1a6a_f62b_4b66_b08e_092a857dc7d0(int N) {
        // Base case
        if (N == 0)
            return "0";
        // If N < 10 then do nothing
        if (N <= 9)
            return Integer.toString(N);
        // Else split N into two numbers, N1 and N2
        int N1 = N % 10;
        int N2 = N / 10;
        return solve_Problem_1_a2ff1a6a_f62b_4b66_b08e_092a857dc7d0(N1) + solve_Problem_1_a2ff1a6a_f62b_4b66_b08e_092a857dc7d0(N2);
}

    
    public static String solve_Problem_0_2fbe35cc_d86e_45bf_a0e8_1226e9a88c1f(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(True) {
            int digit = N % 10;
            sum += digit;
            N /= 10;
            if(N == 0) break;
            sb.append(digit);
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_3_d6bcb074_b21a_42a8_9f7b_de8d82f24e90(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_a23df5df_1522_4192_afee_e1c12dc1e8a5(int N) {
        String result = "";
        int sum = 0;
        int remainder = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        while (sum > 0){
            remainder = sum % 2;
            sum = sum / 2;
            result = remainder + result;
        }
        return result;
}

    
    public static String solve_Problem_0_63579a64_0d71_4fa0_8d51_54165adbbfd2(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_d1129091_1559_4c4b_8719_638f1292355e(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_f9611b2a_fdf2_40bd_856e_b2cc6bbda01d(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_eeae91bd_c19f_4b17_8a16_e7ca9b75e722(int N) {
        StringBuilder sb = new StringBuilder();
        while(N !=0){
            int remainder = N % 2;
            N = N / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_b92b6933_560f_4bd2_9233_de49826e7fa9(int N) {

        // Write your code here
        String binary = "";
        while (N > 0) {
            binary = (N % 2) + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_1_0dcc2568_888b_445b_9348_6075b20daf6a(int N) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= N; i++) {
            int remainder = N % 2;
            N /= 2;
            int digit = N % 10;
            sb.append(digit);
            N /= 10;
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_3725c8d4_34c5_4766_8cd4_e526e7c5da49(int N) {

        String result = "";
        while (N > 0) {
            result = String.valueOf(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_d9ca8513_df0a_486d_856c_f85596ea7978(int N) {
        int sum = 0, rem;
        char ch = '0';
        for (int i = N; i >= 1; i--) {
            int temp = N;
            while (temp != 0) {
                rem =  Math.floor(temp / 2);
                temp = temp % 2;
                ch = (char)(ch + rem);
            }
            sum += ch;
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_3_7f5d9487_f4a0_424c_b9b9_0d495167979f(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_6e2e5707_5aed_4669_83ac_296b1ee015f4(int N) {
        // Return result.
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_2fbe35cc_d86e_45bf_a0e8_1226e9a88c1f(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(True) {
            int digit = N % 10;
            sum += digit;
            N /= 10;
            if(N == 0) break;
            sb.append(digit);
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_0_1de89ef1_3395_4543_a816_b67f4991ee7f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_0884f888_ca7c_450a_a8ce_c5bac91d165b(int N) {
        String s = ""; 
        int d = N; 
        while (d!=0) { 
            d = d / 2;
            s = s + "1";
        } 
        return s;
    }

    
    public static String solve_Problem_3_950e54c5_a284_49df_9efd_d35e45a0c728(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_716842c8_0861_4bf8_b37d_f45189476fe7(int N) {
        return "";
}

    
    public static String solve_Problem_1_405ca544_8c0c_4e1b_bbff_ff6687d93ef3(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_3402a067_89f6_4ac9_9bd7_2a98c1de8d66(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_2189b804_8595_49c7_9226_e3fa72ccafa0(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_0ae09dd6_6407_4e7c_8c68_650bce62715f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_50bc71f8_d36d_4f9a_8a37_2e977ea96737(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_dd64a5af_1710_4a7c_875a_2e55b9585ddb(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_6ec6fa70_f7c3_4e7a_830a_4afa17222246(int N) {
        int remainder = 0;
        int sum = 0;
        int remainder_count = 0;
        while(N !=  0) {
            sum = sum * 10;
            remainder = N % 10;
            sum = sum + remainder;
            N = N / 10;
            remainder_count = remainder_count + 1;
        }

        // Converting into binary
        StringBuilder binaryBuilder = new StringBuilder();
        while(sum > 0) {
            binaryBuilder.append(sum % 2);
            sum = sum / 2;
        }

        binaryBuilder.reverse();
        String result = binaryBuilder.toString();
        result = result + (remainder_count > 0 ? "(" + remainder_count + ")" : "");
        return result;
    }

    
    public static String solve_Problem_0_b9a01495_3e69_4162_99a8_1127e236567c(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_7791ad00_e54d_494a_9f14_c051fb332230(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_40505aac_94d5_4f3f_9473_e20685ed48ac(int N) {
        String stringBinaryNumber = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < stringBinaryNumber.length(); i++) {
            sum += stringBinaryNumber.charAt(i) - '0';
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_1_61f625ef_3f3e_45a0_8fb1_9fe5046bc6e8(int N) {
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_0_c16ca385_9fa9_4651_9ec1_fe4d75dca78e(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_2fc43b1a_0697_45e0_9651_c2c59cd573c5(int N) {
        String res = "";
        while (N != 0) {
            res = (N % 2) + res;
            N /= 2;
        }
        return res;
    }

    
    public static String solve_Problem_4_85743404_5d9e_4ef9_9d75_b7978f985a67(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_4_7a062090_e13b_4b80_a7b7_a33a8a3e5f6d(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_4_da809e3d_c85a_42f6_a8a7_d9605dfb9334(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_ae4bfe9f_9c12_49b8_8267_98992bef6b09(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_3_75421ada_99ce_4107_94c3_23098a7b5b04(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_3_fe956c1a_c231_44d4_a347_8427e2705235(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_5b543cf7_5539_4615_a973_8104571a2fd7(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_7afe0a24_9fed_472d_b761_3ac9d1be7933(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_0_e7883213_3755_417a_a174_7c8244229909(int N) {
        StringBuilder sb = new StringBuilder();
        int digitSum = 0;
        while (N > 0) {
            digitSum++;
            N = N >> 1;
        }
        int rem = 0;
        for (int i = 0; i < digitSum; i++) {
            rem = N & 1;
            sb.append(rem);
            N = N >> 1;
        }
        return String.valueOf(sb.reverse());
}

    
    public static String solve_Problem_0_87da3261_c70a_4d87_a48f_8a5c12fbdaec(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_4b547d5c_3667_4623_a044_cbeb19c0a7d8(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_b8c44c5f_5f63_4b9c_ab85_068980233748(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_6ac405cd_70cd_4c78_8aca_8ccbd2468169(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_02b165cd_bdec_48f0_ab68_fe944d320cfb(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_7de4c009_3908_428e_964a_be8aef4a011f(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int i = 1;
        while (i <= N) {
            sum += i;
            i = i * 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_4_24ae9dba_d8d8_4e40_868e_3479a4940267(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_0_77acff30_25dc_4543_ad70_e05f9e2ba4d1(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_e0937f4e_adf3_43cb_a6e1_0e522013ab86(int N) {
        int sum = 0;
        while (N !=0){
            sum += N % 10;
            N /= 10;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_3_70053005_25db_41b1_83f6_6de573ac6982(int N) {
        int sum = 0;
        int tmp = N;
        while (tmp > 0) {
            int digit = tmp % 10;
            sum += digit;
            tmp = tmp / 10;
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_0_00040f41_8c27_4341_9b29_072f330a2482(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainder = 0;
        while (N !=  0) {
            sum = sum + N % 10;
            N = N / 10;
        }
        while (sum != 0) {
            int temp = sum % 2;
            sum = sum / 2;
            if (temp == 0) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return sb.toString();
}

    
    public static String solve_Problem_4_b7fbe5d9_c797_4810_8dce_ccced9496421(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_187560bc_bcbb_4aa9_8d51_89617fb8dc1a(int N) {
        int digit = 0;
        int sum = 0;
        for(int i = N; i > 0; i /= 2) {
            digit = i % 10;
            sum += digit * Math.pow(2,  Math.log(i) / Math.log(2));
        }
        if (sum < N) {
            sum += N;
        }
        return String.format("%0" + Integer.toBinaryString(sum) + "d%n", N);
    }

    
    public static String solve_Problem_1_905e0449_fed6_4fe9_bab5_5f4766e2ad58(int N) {
        String n = Integer.toBinaryString(N);
        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            ans += n.charAt(i) - '0';
        }
        return Integer.toString(ans);
}

    
    public static String solve_Problem_4_0c6ccff6_b10f_45e0_8a29_96dce432df83(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_77de42c7_25cc_4571_b9c3_7bd1a6806b7b(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_085fad11_304b_42ea_ae23_22ee05066053(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_71648411_553a_468a_8f6a_1b762091e22c(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_0_8683a98a_4e4d_447e_9e9c_5f130c6cf611(int N) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_1_6781fd2c_4ccc_45a6_a13d_e72cb0050a51(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_1ca39176_bfe2_47a4_b45e_c414aad3cadd(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_28aa91e3_7fe6_4196_8b7b_6847ae926026(int N) {

        String result = "";
        while (N > 0) {
            result = N % 2 + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_99ff8122_3a04_4a3a_947e_a4ba14c3ecf0(int N) {
        return Integer.toString(N).replaceAll("0*$", "").replaceAll("1", "0");
}

    
    public static String solve_Problem_1_6baca28b_8307_44ca_9c6c_22b3951881d9(int N) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= N; i++) {
            int digit = N % 10;
            N /= 10;
            String binary = Integer.toBinaryString(digit);
            sb.append(binary);
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_635dee22_0408_44a1_a1b3_e54a19bfff2b(int N) {

        String binary = "";
        while (N > 0) {
            binary = N % 2 + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_4_a13c9acd_d22d_49b5_a339_e3426f34a606(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_ad3fff70_21c2_4ebf_b10b_dd7f28b5ce75(int N) {
        String binary = Integer.toBinaryString(N);
        StringBuilder stringBuilder = new StringBuilder();
        // Step 1: Iterate through each bit of the given integer
        for (int i = 0; i < binary.length(); i++) {
            // Step 2: If the bit is a '0' then the digit in the sum will be '0' and if it is a '1' then the digit will be '1'
            String digit = binary == Character.toString((char) 0) ? "0" : "1";
            // Step 3: Add the digit to the string builder
            stringBuilder.append(digit);
        }
        return stringBuilder.toString();
}

    
    public static String solve_Problem_4_1906b0d8_2b03_4cf4_b88c_5110115a381b(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_5394b580_2616_42e7_9c5f_68813de28d9e(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_76558970_a0eb_4204_9fb3_4e3352e98ebd(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_b33866b6_16cb_47f2_b1ef_d02543ca4a18(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_5d6e07e5_4e56_4289_8797_e62897c5a88a(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_56c2af15_5846_4fed_a7c3_86e1d260fef8(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_3_47289acc_8eeb_4a03_bc89_8c1d6329f811(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_217fbd48_75b5_4988_a14d_6539d43a1207(int N) {

        String result = "";
        while(N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_0fca7970_4ad7_45e8_8fb2_cf7df21d4a8f(int N) {
        String[] binary = new String[N];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            binary[i] = Integer.toBinaryString(i);
            if (binary[i].length() < 10) {
                result.append("0");
            }
            result.append(binary[i]);
        }
        return result.toString();
    }

    
    public static String solve_Problem_1_f5f22bd4_1f53_4ef6_a525_dc2b0de5b0f2(int N) {

        String result = "";
        while (N > 0) {
            result = String.valueOf(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_da4a00b9_f41d_4731_8ca3_e4183025a9de(int N) {
        // write your code in Java SE 7
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += (i & 1);
            while (sum > 1) {
                int temp = sum;
                sum = temp % 2;
                sb.insert(0, (temp - sum) + "");
            }
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_03ef3e21_bf35_4817_9483_70f3d125e80a(int N) {
        if (N == 0) return "0";
        return solve_Problem_1_03ef3e21_bf35_4817_9483_70f3d125e80a(N / 2) + solve_Problem_1_03ef3e21_bf35_4817_9483_70f3d125e80a(N % Math.pow(2,64));
    }

    
    public static String solve_Problem_1_ad82708e_746c_43d5_a74e_3863cb8b708e(int N) {

        // Your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_a5bd5594_d84e_442f_8b82_0ec6dce44159(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_db618416_86df_4776_86ac_a843d92846a3(int N) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.substring(i, i + 1));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_1_401729f3_9213_4a30_8b33_c4592be2cd95(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            sum = sum + N % 2;
            N = N / 2;
        }
        sb = new StringBuilder();
        while (sum != 0){
            sb.append(sum % 2);
            sum = sum / 2;
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_0ebb55e2_452b_4e7d_ba25_f521a7bcf631(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_6baf4b4f_b8e1_4c3c_be5d_64601576deb3(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_a6eeb366_5e4b_44d5_8b83_85264dd0b12f(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N !=0){
            int rem = N % 10;
            sum += rem;
            N = N / 10;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_1_1426099d_af26_4210_baaf_d8007845cb6d(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Character.getNumericValue(binary.charAt(i));
        }
        return Integer.toString(sum);
    }

    
    public static String solve_Problem_3_43ec8dc6_f4cf_49a8_8c59_5aa03e549db8(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_bfa6bce6_d13a_43e4_a738_5a00330862d3(int N) {
        int result = 0L;
        while (N > 0) {
            result = result + (N % 10);
            N /= 10;
        }
        return String.valueOf(result);
    }

    
    public static String solve_Problem_3_2a9e0e00_f349_4cc8_959e_0d090d07dde6(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_2330e3fd_3ad1_420f_95fd_df70194c5f6e(int N) {
        int sum = 0;
        while(N!=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        String s = String.valueOf(sum);
        return s;
}

    
    public static String solve_Problem_3_ed7d94a4_b33f_4b0b_b6a5_1985a02b806b(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_c60287f0_be54_4a18_bee5_033fa1bb1947(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_0b9f4fa2_f45b_41c2_91e8_d06e8ae14d9c(int N) {
        String ret = Integer.toBinaryString(N);
        return ret;
    }

    
    public static String solve_Problem_4_696531a3_eb25_4d35_b502_2e65745782f4(int N) {
        int sum = 0;
        while (N !=0){
            sum += N % 10;
            N /= 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_1_6247a86f_327a_4ea8_a165_6c23395e8d9f(int N) {

        // Write your code here
        String ans = "";
        while (N > 0) {
            ans = (N % 2) + ans;
            N /= 2;
        }
        return ans;
    }

    
    public static String solve_Problem_3_a1c3b2b2_83df_4e4c_9fc6_f86019db9c9e(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_e44da8fe_cde3_4ce6_9b83_2d604d5998ec(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_93e17d20_7cb8_4a4d_b59a_6fc6c8b6d057(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_be6b3e6b_3d32_4554_8eb9_fa607eed73c4(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_3_c364e481_2c7e_40db_9e4a_d80b0138840b(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_a773a458_8d00_4115_b614_8d92a3926eb1(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_ba0953e5_a7e9_4e7c_867c_bcffb962420c(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_cf7d8d7b_401c_43d8_88a3_2f7e6c10659e(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_1_b525df2a_b42a_4d61_a7ff_091680eeea15(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_477696c6_2461_4254_8795_2a7d741d68d0(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_95d26016_ae37_45df_956d_b2fd4fee21c9(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_50bc71f8_d36d_4f9a_8a37_2e977ea96737(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_6d4064a4_e2a1_4e96_9752_402e65f17e13(int N) {

        String binary = "";
        while (N > 0) {
            binary = N % 2 + binary;
            N /= 2;
        }
        return binary;
    }

    
    public static String solve_Problem_4_a045530c_39e7_4358_9ff9_fea9a5dd2fbe(int N) {
        // code here
        StringBuilder output = new StringBuilder();
        int i = 1;
        while (i <= N) {
            output.append(i);
            i = i * 2 + 1;
        }
        return output.toString();
}

    
    public static String solve_Problem_3_53faca39_d614_4bdc_9ea9_17f7d553fe16(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_a169b7a3_3f74_4114_bd50_65cab6fb4278(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_149250a6_a067_4c0d_8570_c47070d8647a(int N) {
        // Your code here
        return "";
    }

    
    public static String solve_Problem_3_c2eb1daa_b8b9_420e_b9ec_102619d45054(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_7785a2e6_45b6_4094_8f4d_9faf476b96f6(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_e82878af_f183_401c_afb3_6701862579de(int N) {
        return String.valueOf(solve_Problem_0_e82878af_f183_401c_afb3_6701862579de(N));
}

    
    public static String solve_Problem_1_cfe5127b_0a10_4086_84ab_d40b818fc363(int N) {
        // Your code goes here
        if(N < 0) return "ERROR";
        StringBuilder result = new StringBuilder(2);
        while(True){
            int sum = 0;
            for(int i=1;i<=N;i++){
                sum = sum + N % 10;
                N = N / 10;
            }
            result.append(sum);
            if(N == 1) break;
        }
        return result.toString();
}

    
    public static String solve_Problem_4_d75a10f4_737b_4a71_a0fc_da255e4875e7(int N) {
        N = N - 1;
        String result = "";
        int remain = N;
        while (N !=  0) {
            remain = remain/10;
            result += remain%2 + "";
            N = N/10;
        }
        return result;
    }

    
    public static String solve_Problem_1_59a36f29_8547_4789_8ad9_cab24fc4995a(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_7fbda340_fc22_424b_9f65_985e5949406e(int N) {
        // Your code here
        return "";
    }

    
    public static String solve_Problem_1_dca10049_0b74_4c25_9ec0_7b6bcbd7cd9d(int N) {
        int rem = 0;
        while (N > 0) {
            int d =  Math.pow(2, N - 1);
            int temp;
            temp = N % d;
            N = N - temp;
            rem += temp;
        }
        return String.valueOf(rem);
    }

    
    public static String solve_Problem_0_4e12065a_7fe8_4120_8f2a_4d0d4ddd17b4(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_0d937edb_a2a2_4e22_8d39_72f712a036f4(int N) {
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_3_56c2af15_5846_4fed_a7c3_86e1d260fef8(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_4_18d4dc75_61eb_44a3_8382_185d1e66dc90(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_c634f8cd_ab43_4790_ae1e_f2ffe8b06d26(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_68198528_368e_4e32_8d26_f9c10454b68b(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(True) {
            int digit = N % 10;
            sum += digit;
            N /= 10;
            if(N == 0) break;
            sb.append(digit);
        }
        return String.valueOf(sum) + sb.toString();
}

    
    public static String solve_Problem_1_d9a6372d_d18d_4d96_9f57_be512091c8b4(int N) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_4_f12a14a4_266a_4502_9fa6_98b26c67a487(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_0d2908a8_7c31_417e_a173_6a0278d3f160(int N) {
        StringBuilder result = new StringBuilder();
        int base = 2L;
        int digits = 0;
        do {
            int temp = N;
            while (temp != 0) {
                digits =  (Math.log10(temp) + 1);
                if (digits > result.length()) {
                    result.insert(0, (char)('0'));
                    for (int i = 0; i < digits - result.length(); i++) {
                        result.append(0);
                    }
                }
                temp = temp / base;
                result.insert(0, (char)('0'));
                for (int i = 0; i < digits; i++) {
                    result.insert(0, (char)('A' + i));
                }
            }
        } while (N != 0);
        return result.toString();
    }

    
    public static String solve_Problem_0_159e3041_53ed_435a_a7cc_e1916c85959f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_8ddbf83e_3528_4aa9_826d_d5b934ca248f(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_a561ce37_4de4_4fe1_869f_49a5119b4fc7(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_cf7d8d7b_401c_43d8_88a3_2f7e6c10659e(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_0_d681d0dd_3a65_44e1_bd4f_897bd57768f6(int N) {

        String result = "";
        while (N > 0) {
            result = Integer.toString(N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_a93ce020_51a0_47b6_8f26_aaa620d811fa(int N) {
        // Declare result and string with 1 digit inter
        String result = "";
        // Declare a temporary string with 1 digit inter
        String temp = "";
        // Perform a binary search to find the first digit that exceeds the N
        int firstDigit = Integer.MAX_VALUE;
        int lastDigit = 0;
        while (firstDigit < N) {
            lastDigit = firstDigit + 1;
            while (lastDigit < N) {
                temp = String.valueOf(lastDigit);
                if (temp.equals(String.valueOf(firstDigit)))
                    break;
                lastDigit++;
            }
            if (lastDigit - firstDigit > 0)
                break;
            firstDigit = lastDigit - 1;
        }
        // If firstDigit equals N, return the result with N digits;
        // otherwise, return the result with N - firstDigit digits.
        // Example
        // If N = 15, the result will be "1111"
        // If N = 12, the result will be "1100"
        // If N = 147, the result will be "11001"
        if (firstDigit == N) {
            result = String.valueOf(firstDigit);
        } else
            result = String.valueOf(firstDigit) + String.valueOf(lastDigit - firstDigit + 1);
        // Return the result
        return result;
}

    
    public static String solve_Problem_1_4cd0ec06_5015_4b3d_9ae1_d6135b5e4928(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_9eadd6ed_f4c4_40aa_92c4_0775c1569e87(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_870140ea_e318_4822_923b_15df4bdea74d(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_6baca28b_8307_44ca_9c6c_22b3951881d9(int N) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= N; i++) {
            int digit = N % 10;
            N /= 10;
            String binary = Integer.toBinaryString(digit);
            sb.append(binary);
        }
        return sb.toString();
}

    
    public static String solve_Problem_1_5db30d6b_aa42_45de_9bff_13acf6050036(int N) {
        // Write your code here.
        return "";
    }

    
    public static String solve_Problem_4_ae6b5d2c_92d9_44e5_9497_63edb8f01e14(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_1906b0d8_2b03_4cf4_b88c_5110115a381b(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_a80b2643_4d9f_4cc7_8c24_1e718aa81123(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_b3b7d3b6_0255_4e0d_b7a2_a0f708e4edac(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_1_57b5063c_e9cb_454f_ab99_5becfefb0b31(int N) {

        // Write your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_6a4ac549_3ff0_4644_b750_cd95ab758d59(int N) {
        StringBuilder sb = new StringBuilder();
        while(N !=0){
            int remainder = N % 2;
            N = N / 2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_4_94f24708_1c7d_4e64_a9db_f45006f38abd(int N) {

        String result = "";
        while(N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_b41a7108_cec4_4ae4_8b0d_45582bb1cee3(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_8e91e693_a03d_4d79_b546_928653c6e193(int N) {
        if (N <= 0) return "0";
        char[] chars = Integer.toString(N).toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            int val = chars[i] - '0';
            builder.append(val);
        }
        return builder.toString();
}

    
    public static String solve_Problem_1_e1baebfe_92a7_47d5_9bf9_c8dfdc4c31e9(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_6c9f0c73_9ee8_41c1_92f0_a2f8f0a7acea(int N) {
        int sum = 0;
        int numDigits =  Math.log10(N) + 1;
        char[] digits = String.valueOf(N).toCharArray();
        int index = 0;
        while (digits[index] == '1') {
            sum +=  Math.pow(10, numDigits - index - 1);
            index++;
        }
        if (digits[index] == '1') {
            sum +=  Math.pow(10, numDigits - index - 1);
        }
        StringBuilder result = new StringBuilder(String.valueOf(sum));
        while (index > 0) {
            int digit = digits[index - 1] - '0';
            if (digit > 0) {
                result.insert(0, (char)('0' + digit));
            } else {
                result.insert(0, (char)('1' + digit));
            }
            index--;
        }
        return result.toString();
}

    
    public static String solve_Problem_4_1af23a60_5953_4379_9662_a777fddc7d7f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_cb7aa106_08ef_42ac_a2a7_138b24658341(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_40505aac_94d5_4f3f_9473_e20685ed48ac(int N) {
        String stringBinaryNumber = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < stringBinaryNumber.length(); i++) {
            sum += stringBinaryNumber.charAt(i) - '0';
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_0_d57ffa8b_652d_47bd_be5c_773e1ff80445(int N) {
        int sum = 0;
        int temp = N;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_0_b1fcc095_623a_4581_85aa_bbef6ad42248(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_a15d67ed_c4bf_4103_a0e3_7afb4ea89d7d(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_4cc9eeb0_6f10_4e55_8bc8_41f07f26d85d(int N) {
        int result = 0;
        // loop though number
        for (int i = 0; i < N; i++) {
            // get the binary representation and split into an array of chars
            String binary = Integer.toBinaryString(i);
            char[] binaryCharArray = binary.toCharArray();
            // loop through the array of binary chars
            for (int j = 0; j < binaryCharArray.length; j++) {
                // add up the values of each digit in the binary string
                result += Integer.parseInt(Character.toString(binaryCharArray[j]));
            }
        }
        return Integer.toString(result);
}

    
    public static String solve_Problem_3_68bf3ecc_b2b6_4632_b692_0330a58f33f5(int N) {
        String binary = Integer.toBinaryString(N);
        String result = "";
        for (int i = 0; i < binary.length(); i++) {
            result += String.valueOf(binary.charAt(i));
        }
        return result;
    }

    
    public static String solve_Problem_0_9c10269f_0118_4611_8d50_1241b25be609(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_a5f59f03_56c0_4e82_a98f_f1a5f888f5d4(int N) {

        // Write your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_15db006a_8245_42a1_84f1_30d457a137e9(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_1_822513ae_c1bb_4a2f_aaf8_9811057101be(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_306b1bd3_8c8a_4c5b_8291_e4bdca0cd372(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_4_8e4670c3_351c_4b89_94e2_f4fa38ff7897(int N) {
        int remainder = 0;
        int sum = 0;
        // Set up the remainder value so that it fits in Integer.MAX_VALUE
        while (N % (sum + remainder) == 0) {
            remainder = 1;
            sum++;
        }
        // Now divide N by sum & remainder
        while (N % (sum + remainder) != 0) {
            remainder *= 10;
            sum++;
        }
        // Convert the int back into binary
        while (sum > 0) {
            int digit =  remainder;
            String s = Integer.toBinaryString(digit);
            s = s.substring(s.length() - 1);
            sum += Integer.parseInt(s);
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_3_6183dba1_52e5_473e_baa7_afbc56030897(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_029f616f_2082_4b53_87f7_1d9049295e00(int N) {
        String result = "";
        int sum = 0;
        while (N --> 0) {
            sum += N % 10;
            N /= 10;
        }
        int remainder = sum;
        int sumOfDigits = sum;
        while (remainder --> 0) {
            sumOfDigits *= 10;
            sumOfDigits += remainder % 10;
            remainder /= 10;
        }
        int remainder2 = sumOfDigits;
        while (remainder2 --> 0) {
            result += String.valueOf(remainder2 % 2);
            remainder2 /= 2;
        }
        return result;
}

    
    public static String solve_Problem_4_99e17567_15ec_4a96_9865_b9c46d697030(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_0_bfa96863_91c5_4c67_988a_0f3d47c17537(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_0_187560bc_bcbb_4aa9_8d51_89617fb8dc1a(int N) {
        int digit = 0;
        int sum = 0;
        for(int i = N; i > 0; i /= 2) {
            digit = i % 10;
            sum += digit * Math.pow(2,  Math.log(i) / Math.log(2));
        }
        if (sum < N) {
            sum += N;
        }
        return String.format("%0" + Integer.toBinaryString(sum) + "d%n", N);
    }

    
    public static String solve_Problem_4_33b9431c_9f78_4166_955a_bf0a0e25e9ab(int N) {
        return "" + Integer.toBinaryString(N).chars().map(x -> x - '0').sum();
    }

    
    public static String solve_Problem_3_a15d67ed_c4bf_4103_a0e3_7afb4ea89d7d(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_15beaac6_9e55_4765_a435_0e4c8f95a0ea(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_0_0d860402_e50f_4c5c_b4fd_9fcf8259e233(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_b3b7d3b6_0255_4e0d_b7a2_a0f708e4edac(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_00040f41_8c27_4341_9b29_072f330a2482(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainder = 0;
        while (N !=  0) {
            sum = sum + N % 10;
            N = N / 10;
        }
        while (sum != 0) {
            int temp = sum % 2;
            sum = sum / 2;
            if (temp == 0) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return sb.toString();
}

    
    public static String solve_Problem_4_48a099df_1869_40bc_8dbf_236881924336(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_431fe929_44e4_45f7_98d7_586a09da5298(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_6b6cf337_3f71_4de2_b580_c054dad2824d(int N) {

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        return sb.toString();
    }

    
    public static String solve_Problem_0_17823e19_4e5e_452a_b4f8_b32c112eabca(int N) {
        int sum = 0;
        while (N !=0){
            sum = sum + N % 10;
            N = N / 10;
        }
        return String.valueOf(sum);
    }

    
    public static String solve_Problem_1_5c1d4d3d_e2aa_4663_a108_9460d136a985(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_0745a151_6f2b_4653_8440_1de57398a6e0(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_bfc5c2ed_4f51_49f2_91cd_57ba83273157(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_6febe427_3884_4e98_a3e3_ec5c6b44572b(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_70668337_89c5_4c62_83b6_0ecad086777a(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_76558970_a0eb_4204_9fb3_4e3352e98ebd(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_a3df2828_d002_4db9_b2e6_85c11f69a5c0(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_09791c7a_547c_49db_9c72_c77310fdef94(int N) {
        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Character.getNumericValue(binary.charAt(i));
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_0_48ce2b83_0127_4189_b71a_1382bd8641a7(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_8604201c_7f37_4e6e_8bc8_39fe54d0171e(int N) {

        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_7db76a1f_dbc6_49a4_8754_03e0ccf36a9d(int N) {
        if (N < 0) {
            return "-1";
        }
        int sum = 0;
        int count = 1;
        int remainder = 0;
        while (N > 0) {
            remainder = N % 10;
            sum += remainder * count;
            N = (N - remainder) / 10;
            count++;
        }
        return Integer.toString(sum);
}

    
    public static String solve_Problem_3_f2775a71_999b_4020_ab87_302a8130772f(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_0_84a72ded_90c4_41fd_96bc_5cc0c7b79b48(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_ece84a06_8625_4afc_ba8e_45b1ebec8f73(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_e7777c5b_014c_4496_bb5d_af998a73593c(int N) {
        String bin = Integer.toBinaryString(N);
        String sum = bin.chars().mapToObj(e -> String.valueOf(e))
        .reduce((acc, e) -> String.valueOf(Integer.parseInt(acc) + Integer.parseInt(e))).get();
        return sum;
    }

    
    public static String solve_Problem_1_5c56a212_9074_4536_b459_a7ef60b0a249(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_94f24708_1c7d_4e64_a9db_f45006f38abd(int N) {

        String result = "";
        while(N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_a78eda02_d1bd_4b2d_acf6_f3152caec9cc(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_4_adf981f3_ae80_4747_9e75_a22e3515c84b(int N) {

        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_4_bfc5c2ed_4f51_49f2_91cd_57ba83273157(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_4_e2c74c12_a5aa_4681_914f_18bf59be3ad8(int N) {

        String result = "";
        while(N > 0) {
            result = (N % 2) + result;
            N /= 2;
        }
        return result;
    }

    
    public static String solve_Problem_1_a07e45a8_66ff_4059_9bc1_29c41eba0587(int N) {
        String result = "";
        while (N > 0) {
            result = (N % 2) + result;
            N = N / 2;
        }
        return result;
    }

    
    public static String solve_Problem_0_f101560d_355c_4aae_838c_195d9b7c3480(int N) {
        int sum = 0;
        while (N !=0){
            sum += N % 10;
            N /= 10;
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_4_02eaf3e9_522a_4635_88fb_2e74b684efe1(int N) {
        String res = "";
        for (int i = 0; i < 16; i++) {
            res = (N % 2) + res;
            N /= 2;
        }
        return res;
    }

    
    public static String solve_Problem_3_b8c44c5f_5f63_4b9c_ab85_068980233748(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_cee8a412_2973_4a21_b782_d9954c47c88d(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_3_1de89ef1_3395_4543_a816_b67f4991ee7f(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_3f65737b_5471_4e58_96c9_f2a4f44ac5f2(int N) {

        String binary = Integer.toBinaryString(N);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += binary.charAt(i) - '0';
        }
        return Integer.toBinaryString(sum);
    }

    
    public static String solve_Problem_4_5bef5ede_1835_48ab_9ed3_ca991c981a7a(int N) {
        String bin = Integer.toBinaryString(N);
        int result = bin.chars().map(Character::getNumericValue).sum();
        return String.valueOf(result);
}

    
    public static String solve_Problem_3_f77c3b25_1dd3_4673_a701_e70cacfc77e4(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_cb817936_1f9b_4fb1_946e_d33a849123dc(int N) {
        int sum = 0;
        String number = Integer.toBinaryString(N);
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(number.substring(i, i + 1));
        }
        return String.valueOf(sum);
}

    
    public static String solve_Problem_1_6c2609e3_3000_4c14_8bd9_c19c8f79a13a(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

    
    public static String solve_Problem_0_b1d85ab2_76ab_42ad_bc5b_e42fc9b3330a(int N) {
        StringBuilder sb = new StringBuilder();
        int rest = N;
        while (rest > 0) {
            sb.append(rest % 2);
            rest /= 2;
        }
        return sb.reverse().toString();
}

    
    public static String solve_Problem_0_0e5a3dd9_5214_4566_9115_45dc63c83a80(int N) {
        // Your code here
        return "";
    }

    
    public static String solve_Problem_3_1893a9d3_313d_46de_854e_9db2e87c52bb(int N) {

        // Write your code here
        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_1_1111bc11_be9c_4b1d_8efc_61436b917de9(int N) {
        StringBuilder sb = new StringBuilder();
        while(N !=0){
            int remainder = N % 2;
            N = N/2;
            sb.append(remainder);
        }
        return sb.toString();
}

    
    public static String solve_Problem_4_b45593d2_7b5f_4297_9335_23be748d89d4(int N) {
        BigInteger result = BigInteger.ZERO;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            result = result.add(BigInteger.valueOf(i).divide(BigInteger.TEN));
            sb.append(result.mod(BigInteger.TEN));
        }
        return sb.toString();
}

    
    public static String solve_Problem_0_477696c6_2461_4254_8795_2a7d741d68d0(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_3_aa35ef7a_a882_4b24_bada_7e0e6df01204(int N) {
        // TODO your code
        return Integer.toString(N);
}

    
    public static String solve_Problem_0_430b1adc_5d57_4dd7_974e_dbb9b817036a(int N) {
        if (N == 0) {
            return "0";
        }
        String s = "";
        int n = N;
        int rem = 0;
        while (n != 0) {
            rem = n % 2;
            n = n / 2;
            s = rem + s;
        }
        return s;
}

    
    public static String solve_Problem_4_d48e8829_c44f_4339_adf3_28525c72183f(int N) {

        String binary = Integer.toBinaryString(N);
        return binary;
    }

    
    public static String solve_Problem_3_4c229120_e80d_4c40_8288_f07ce5fbda49(int N) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (N --> 0) {
            sum += N % 2;
            N /= 2;
        }
        sb.append(sum);
        return sb.toString();
}

    
    public static String solve_Problem_0_9621072c_3cb9_4341_82b7_bccf250dad86(int N) {
        return Integer.toBinaryString(N);
    }

    
    public static String solve_Problem_1_72dae36a_acf4_4bda_89cd_8aeb49c258f8(int N) {

        String ans = "";
        while (N > 0) {
            ans = (N % 2) + ans;
            N = N / 2;
        }
        return ans;
    }

    
    public static String solve_Problem_1_d290b61d_1838_4426_85ab_59b1bbdcd6cf(int N) {
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String solve_Problem_4_3635f872_1dad_4e92_b119_84c496134713(int N) {

        String s = Integer.toBinaryString(N);
        return s;
    }

}
