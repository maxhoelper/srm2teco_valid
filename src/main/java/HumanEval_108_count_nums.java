package HumanEval_108_count_nums;

public class HumanEval_108_count_nums {

    
    public static int countNums_Problem_0_53702d28_157e_4c10_b0b8_bdae639e5dbb(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = 0; j < arr.get(i).intValue(); j++) {
                sum += j;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_4daf16c1_6a95_47dd_acd4_9ed34e1bb6a6(ArrayList<Integer> arr) {
        // write your solution here
        return 0;
    }

    
    public static int countNums_Problem_0_46bb843d_325b_4c96_8b22_00365a099c94(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_7_be80d431_0d69_48e9_a76a_cf2f9ac7f8ea(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_fe1abed7_b765_4a0b_a41d_8f47057e622f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i < 10) {
                    count++;
                } else {
                    int temp = i;
                    while (temp > 0) {
                        if (temp % 10 > 0) {
                            count++;
                        }
                        temp /= 10;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_1540c2b6_36c5_4382_b089_6d98703ae94b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_015337e9_fc93_493e_b2ca_71c593292af3(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_5_33984834_75e5_43fd_b1d5_aea318d589af(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_b60c28af_26a2_470e_840d_e3cbaf4c850d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_4b25b8f8_5446_46e2_831f_bbf863098751(ArrayList<Integer> arr) {
        return arr.stream()
                .filter(e -> e > 0)
                .collect(Collectors.toList()).size();
    }

    
    public static int countNums_Problem_5_eaf8b01e_5299_4454_843e_320439e7b959(ArrayList<Integer> arr) {

        int sum = 0;
        for (Integer l : arr) {
            if (l < 0) {
                sum += l % 10;
            } else {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_0_8a5a1cac_da28_4341_9bc6_a12393801ec0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int l: arr) {
            if (l < 0)
                l = -l;
            for (int i = 0; i < 9; i++) {
                if (l % 10 + l % 100 < 10)
                    break;
                l /= 10 + l % 100;
            }
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_5_da495c2c_1b85_48f6_a74f_b919abcb61e8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_efc781f8_8efc_49f9_a3b3_7df22586ea62(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_1b5dccc7_360a_44e4_8518_1992259617d0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_1_8e24c725_e232_4dd2_8b33_c43caa61dddb(ArrayList<Integer> arr) {
        // Write your code here
        int result = 0L;
        if (arr.size() > 0) {
            int positiveNum = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                int num = arr.get(i);
                if (num > positiveNum) {
                    result += Math.abs(num - positiveNum);
                    positiveNum = num;
                }
            }
        }
        return result;
    }

    
    public static int countNums_Problem_0_2558a93b_8191_4574_8c4d_33cab2d0ea69(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_821ea9f8_dc1b_4597_adc1_361c88e3f47d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_4249ab2e_f4b9_41a0_9cec_636726bb6fa8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> {
            String s = x.toString();
            if (s.charAt(0) == '-') {
                return False;
            }
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += Character.getNumericValue(s.charAt(i));
            }
            return sum > 0;
        }).count();
    }

    
    public static int countNums_Problem_0_be80d431_0d69_48e9_a76a_cf2f9ac7f8ea(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_597ac498_ec48_40dd_8a5e_1546a5f7b1f8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_05951e7c_8429_4daa_bbda_fc3bcf1a2112(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_a382f963_f1ce_4860_92f4_a5117c1e3fd6(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            count = count + (l * l);
        }
        return count;
    }

    
    public static int countNums_Problem_7_4ed7851f_2e91_47a2_a843_e2ab23efb532(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_50010bac_e9a6_43ed_bf1b_b5879ab5654a(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return 0;
        int n = 0;
        int first =  arr.get(0);
        if (first < 0) return 0;
        for (Integer d : arr)
            n += first * 10 + d;
        return n;
    }

    
    public static int countNums_Problem_6_22f91fd4_1818_4852_a7ae_ee4941b9c68d(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_c258e4dd_fd82_42f1_a8fd_aae38db648c0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += arr.get(i) / Math.abs(arr.get(i));
            } else {
                count += arr.get(i) / arr.get(i);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_e18b7cb0_7285_4b17_8770_a845152c977a(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_0_d404aef0_7d00_4e40_829e_43d641069835(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count += 1;
            } else if (num < 0) {
                int sum = 0;
                while (num != 0) {
                    sum += Math.abs(num % 10);
                    num /= 10;
                }
                if (sum > 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_c643bf14_99be_4883_a802_24338adc37ab(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_2a492c38_45cf_4122_8521_c14e2407adad(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer val : arr) {
            sum += val.intValue();
        }
        return sum;
    }

    
    public static int countNums_Problem_1_579f0d4e_1bef_44bb_be07_26336fda0e74(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_0fc38988_93ba_4d92_ba82_ddcff7917af3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += (n % 10);
            } else {
                count += (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_6892c7f2_e48f_4b67_9d35_d58c812503f2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_0_3891cd95_aae3_4bd5_b050_8f05de873ab1(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_fb1f304e_ea6a_405b_b6e1_123d00037dd4(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0 && n % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_4eeb51e2_7e1a_4002_b5ea_c2b44e732f71(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_49e41556_54cf_44b7_9eb0_3821b47cf993(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_92839b16_7013_4782_b800_40228bf495ce(ArrayList<Integer> arr) {

        int sum = 0;
        for (int n : arr) {
            if (n < 0) {
                sum += (n % 10);
            } else {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_0_1405488e_37a8_42fa_b186_76d9553ff166(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_d30a60e3_5ef6_43c4_b521_6c0aa7ce5f36(ArrayList<Integer> arr) {
        int count = 0;
        for (int l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_5e4544d6_e837_41f5_af69_b7d0563ae0eb(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_3_d0da2346_2657_4d44_8cea_8d3eb5bab5bf(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_5de01940_ef4e_494c_baad_782ec7e6675d(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_e33cd4ad_039e_4262_9d4f_314a0e3d653f(ArrayList<Integer> arr) {
        // Write your code here
        int countNums_Problem_5_e33cd4ad_039e_4262_9d4f_314a0e3d653f = 0;
        boolean firstNumNegative = arr.get(0).intValue() < 0;
        for (int i : arr) {
            if (i == 0)
                continue;
            int sumOfDigits = Integer.parseInteger(String.valueOf(i));
            countNums_Problem_5_e33cd4ad_039e_4262_9d4f_314a0e3d653f += sumOfDigits > 0 ? sumOfDigits : 0;
            if (firstNumNegative) {
                countNums_Problem_5_e33cd4ad_039e_4262_9d4f_314a0e3d653f += sumOfDigits < 0 ? -sumOfDigits : sumOfDigits;
            }
        }
        return countNums_Problem_5_e33cd4ad_039e_4262_9d4f_314a0e3d653f;
    }

    
    public static int countNums_Problem_3_81478b90_c979_46c7_87f8_320f3cd881f8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_5_d89693f9_cd3c_4c0b_ad9e_dc81594500a1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_61a23d51_587c_40e0_95b4_53fe90473820(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_585d9b6c_1537_404e_b54e_f46feeea60d4(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_3c0912e4_bdb5_465b_92de_24d974e73311(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_24fb877f_c0ea_42ac_89b3_f803408f0524(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_6585d4a6_d6e0_4ccb_a6d8_756a1748b4e8(ArrayList<Integer> arr) {
        return arr.stream().filter(n -> n%10 != 0).count();
    }

    
    public static int countNums_Problem_6_367c8a54_b4b4_4204_943f_333a7c024626(ArrayList<Integer> arr) {
        int nums = 0;
        for (Integer l : arr) {
            if (l > 0) nums++;
            if (l < 0) nums += l / 10;
        }
        return nums;
    }

    
    public static int countNums_Problem_7_214a1b60_5b72_4942_8431_c11508789518(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_70f2b06b_246b_4794_bd58_e0fc76920d15(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_793d3937_c61b_4864_8cb1_fbbce6e970b5(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = Math.abs(num);
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_7c0a5505_589e_4ad3_866a_a94460c9067f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).count();
    }

    
    public static int countNums_Problem_1_ce6bb89c_398d_479f_9af4_1d4786393bc8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_be80d431_0d69_48e9_a76a_cf2f9ac7f8ea(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_572ac331_8252_4c52_a46f_14168a1798d4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_1031d615_44e5_4774_a46f_f829e681b5c6(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_7ca57906_ad16_412d_a81d_196107250257(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_5889246c_c8f0_453b_a70e_6521313dc475(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_042f4d94_be38_453d_8b33_1b26f26b6b93(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_26b0aba5_19a5_437b_a4d6_42884dd170dd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_00792e18_2878_4c33_9472_c2e94fec5187(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_e80b2b4d_c7da_4c27_9511_99a76b56133d(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_4_19c7bbd4_c6cd_4a22_9a92_25a848a324a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_7f454c4b_df69_49cc_a7fe_1286bd798399(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_18a7a339_4548_4726_bc81_c226dab75aae(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += n % 10;
            } else {
                count += n % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_f9153e9d_2310_4108_a2c1_5aeada0a20c1(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_502910ce_5b34_4acc_8108_e83a8d5dc877(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_276a80d0_b80b_433a_8257_531fd598da60(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_3_1540c2b6_36c5_4382_b089_6d98703ae94b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_d7842cb1_55a1_4e3c_aff8_36f8d81b4b7a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_5889246c_c8f0_453b_a70e_6521313dc475(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_00792e18_2878_4c33_9472_c2e94fec5187(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_c39d64e1_4d23_47be_9832_a8e4c52e9ce8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_5_1f6998ff_f606_4241_84dc_b55877a9b7b3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_4f91d2df_0022_4685_b0f6_0690e4fcdc62(ArrayList<Integer> arr) {
        int count = arr
            .stream()
            .filter(e -> e > 0)
            .count();
        return (count == 0) || (arr.get(0) < 0) ? count-Math.abs(arr.get(0)) : count;
    }

    
    public static int countNums_Problem_4_42f3f7c1_d3fc_4489_aef8_b3687fb2273c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_f7c3d8ae_a7a8_4fa4_850c_c7c646be7719(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_f509092b_a2ad_45a7_b72f_4808bdaf332f(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_6_e2c21890_13f9_4fb6_a5b2_820466f39a8e(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_81dc2557_5ccf_49af_80fb_52c9f3cc4cdd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l < 0) {
                count += l % 10;
            } else {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_27a3ffa6_dfaf_47ff_b247_e474a40326c4(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_d71379c6_9616_45eb_a9ec_7e488fabd3c4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_de5d137b_55f8_42be_b599_dfd7e853d794(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_6_26b0aba5_19a5_437b_a4d6_42884dd170dd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_2fff1e5c_5fa2_44a8_92f9_70ee3138363c(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_03fa7cc1_feb1_4e4e_8f52_dbe3decd6eab(ArrayList<Integer> arr) {
        // write your code here
        int n = arr.size();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = arr.get(i);
            int sign = x < 0 ? - Math.abs(x) :  Math.abs(x);
            int sum = 0;
            while (x > 0) {
                int digit =  (x % 10);
                sum += digit;
                x /= 10;
            }
            if (sum > 0 && sum < sign) {
                cnt++;
            }
        }
        return cnt;
    }

    
    public static int countNums_Problem_3_8489b3b1_1bf8_4d28_bbed_99813efb2ec3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_841d198e_e7e8_4f38_a7da_637516550787(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_5cafc1d3_5146_49b7_953c_719419ad7b59(ArrayList<Integer> arr) {
        // YOUR CODE GOES BELOW
        int numSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) numSum = Math.abs(numSum) + Math.abs(arr.get(i));
            else numSum = numSum + arr.get(i);
        }
        return numSum;
    }

    
    public static int countNums_Problem_1_b200b562_aad3_4f52_be80_fdccefb8316b(ArrayList<Integer> arr) {
        int sum = 0;
        boolean negative = False;
        boolean negativeSigned = False;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            sum += num;
            if (num < 0) {
                negativeSigned = True;
            } else {
                negativeSigned = False;
            }
            if (i == 0 || num < 0) {
                negative = True;
            }
        }
        if (negative && negativeSigned) {
            throw new RuntimeException("Negative and positive numbers.");
        }
        return sum;
    }

    
    public static int countNums_Problem_1_43dae9b4_a147_4165_ba59_49560b907504(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_83d8fe70_0998_42c4_bedf_967efff543b8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_b822bf0a_e1ce_4efa_9bd9_fa672dd19063(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_61a23d51_587c_40e0_95b4_53fe90473820(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_39819822_1ca5_4bf6_a7f6_4516375e0d6b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_ff5987ee_e465_4b17_91c4_18c53fd02108(ArrayList<Integer> arr) {
        return arr.stream().filter(l -> l.intValue() > 0).count();
    }

    
    public static int countNums_Problem_0_30f9b897_24e8_4f8b_a7d9_657a516e96c4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_e38531ca_492c_4f3f_b80b_5d93163172aa(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for (Integer l : arr) {
            int sum = 0;
            while (l > 0) {
                sum += l % 10;
                l /= 10;
            }
            if (sum > 0)
                ++count;
        }
        return count;
    }

    
    public static int countNums_Problem_0_1b9db28d_2a57_450a_8a5f_5d00de1650d1(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_76a921fe_02ac_4381_8b76_685f90b45674(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_cb3c7476_17f3_41b6_b71f_75d29011e2a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_1ecaa3a3_328c_4a44_b858_2448d0893bad(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_9fb7204e_aa6a_48bd_bde0_3c27000db70b(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_a2f047c7_3d6b_4640_89ed_9d4dcc4f0916(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_0_8ac8c01e_d8ca_4698_b57c_648bf6c70ca7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_2bda7a25_656e_49c7_8dfd_31bceeccafb7(ArrayList<Integer> arr) {

        // Write your code here
        return arr.stream().filter(x -> x > 0).mapToInteger(x -> x).count();
    }

    
    public static int countNums_Problem_2_e79c01a6_5b18_4418_9714_4aafce2e633c(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_e93d61db_6b08_4e76_8d7a_0274c20c3dba(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_e7a4196b_0201_4720_a925_26dbaea62cbc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_3ebbcb70_8866_4341_8ca2_780126fb1968(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_733df36c_ebec_40a6_8ddb_106fe5650d2a(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_50010bac_e9a6_43ed_bf1b_b5879ab5654a(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return 0;
        int n = 0;
        int first =  arr.get(0);
        if (first < 0) return 0;
        for (Integer d : arr)
            n += first * 10 + d;
        return n;
    }

    
    public static int countNums_Problem_4_5e4544d6_e837_41f5_af69_b7d0563ae0eb(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_2_a586b6a9_91d6_4965_af84_f6ac4848edbf(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer x : arr)
            if (x > 0)
                sum += x;
        return sum;
    }

    
    public static int countNums_Problem_1_95c470ce_01af_4904_8c82_6afd91a4db46(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_e79c01a6_5b18_4418_9714_4aafce2e633c(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_69c8042a_1ac5_4e0a_a122_2788c8f98a85(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_5e32ad8b_79ac_40f7_a9d9_e37b1b6c7a5e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_379a9df7_1036_43dd_a57f_67c76d3491fb(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_8934e210_ba66_4758_a301_a42a3fd2ddc1(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_1222f4af_d68e_410f_9ae8_6e0f9da5df54(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_2_eb1bec51_d822_4c97_8b9b_2c23ac2ae264(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_a2abcfd0_4f22_4868_b3a5_437183abb796(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_008496c3_2ce3_4ca3_a647_4812ad0633d6(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_c54214d1_5a94_47b9_bb3a_6cde2c946134(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_7358cb3f_bb61_4e24_81b0_d0755654bff3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_fd6c8f82_01db_4465_a64e_24b6303f3e8a(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_3_841d198e_e7e8_4f38_a7da_637516550787(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_28dac5c0_d3e8_4123_a046_a060527467d2(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_9c15ec4c_66c3_4079_9e99_588d95d342f0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_6a47bff8_e889_41f1_8c9a_4ed77fe95ac0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_5cafc1d3_5146_49b7_953c_719419ad7b59(ArrayList<Integer> arr) {
        // YOUR CODE GOES BELOW
        int numSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) numSum = Math.abs(numSum) + Math.abs(arr.get(i));
            else numSum = numSum + arr.get(i);
        }
        return numSum;
    }

    
    public static int countNums_Problem_5_d9dce561_d961_4663_8f77_db304b2ab001(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_3b8e8b2b_586e_4008_8906_d178f4bf6591(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_cf7aa7ef_0b41_4561_8fbc_80e8868efbd3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_d0f812b2_f4fd_4027_b566_ae0cf15349dd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_0_ed5dccc0_4bc5_4173_a13c_2cbc9f0aab93(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_7efd602c_9790_4179_b0b4_182afeeac21a(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i < 10) {
                    count++;
                } else {
                    int sum = 0;
                    while (i > 0) {
                        sum += i % 10;
                        i /= 10;
                    }
                    if (sum > 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_733df36c_ebec_40a6_8ddb_106fe5650d2a(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_1c64da54_270a_40cd_af1f_f2232c3bd531(ArrayList<Integer> arr) {
        int ret = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = arr.get(i);
            if (sum < 0)
                sum = -sum;
            for (int j = 0; j < sum; j++)
                ret++;
        }
        return ret;
    }

    
    public static int countNums_Problem_7_f9a05aad_0c17_423c_8bbf_e0fff59af995(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += arr.get(i) / Math.abs(arr.get(i));
            } else {
                count += arr.get(i) / arr.get(i);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_8a5a1cac_da28_4341_9bc6_a12393801ec0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int l: arr) {
            if (l < 0)
                l = -l;
            for (int i = 0; i < 9; i++) {
                if (l % 10 + l % 100 < 10)
                    break;
                l /= 10 + l % 100;
            }
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_0_1f6998ff_f606_4241_84dc_b55877a9b7b3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_d0f812b2_f4fd_4027_b566_ae0cf15349dd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_4_4bb9e8e8_e6c4_46a9_9190_001475736238(ArrayList<Integer> arr) {

        int count = 0;
        for (int x : arr) {
            if (x < 0) {
                x = -x;
            }
            int x_digits = 0;
            while (x > 0) {
                x_digits++;
                x /= 10;
            }
            if (x_digits > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_585d9b6c_1537_404e_b54e_f46feeea60d4(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_1c53849b_9d40_415c_9add_ec32ec4ea21f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_107440d5_d66f_497b_9340_75a54968a018(ArrayList<Integer> arr) {
        return arr.stream().filter((item) -> item.intValue() > 0)
            .mapToInteger((item) -> item.intValue()).count();
    }

    
    public static int countNums_Problem_1_2a492c38_45cf_4122_8521_c14e2407adad(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer val : arr) {
            sum += val.intValue();
        }
        return sum;
    }

    
    public static int countNums_Problem_3_0d139008_cc77_4896_9b76_f585ada19f17(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_24fb877f_c0ea_42ac_89b3_f803408f0524(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_ee9298e4_4f87_4532_975c_ae8e3d8f63cb(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_99397586_947b_4143_bdeb_bd26401ebe63(ArrayList<Integer> arr) {
        int count = 0;
        if (arr.isEmpty()) return 0;
        Collections.sort(arr);
        for (int num : arr) {
            if (num >= 0) count += Math.abs(num) % 10;
            else count += Math.abs(num) / 10;
        }
        return count;
    }

    
    public static int countNums_Problem_6_a586b6a9_91d6_4965_af84_f6ac4848edbf(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer x : arr)
            if (x > 0)
                sum += x;
        return sum;
    }

    
    public static int countNums_Problem_2_6319b119_841b_45f1_8cd0_c35205e696d9(ArrayList<Integer> arr) {
        
        if (arr.size() < 1) {
            return 0;
        }
        
        List<Integer> nums = arr.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());
        
        int ans = nums.size();
        
        int digitSum = 0;
        
        // iterate over all numbers to find the digit sum
        for (int i = 0; i < ans; i++){
            digitSum += nums.get(i);
        }
        
        return digitSum;
    }

    
    public static int countNums_Problem_4_fe22a901_226d_4909_8ae6_92c2a881fd76(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0 && (n % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_4f3102fe_1958_4036_a7c1_cf1d820f727a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_00792e18_2878_4c33_9472_c2e94fec5187(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_f51e9c6a_714b_429a_99bd_d3b7f7457a28(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;

    }

    
    public static int countNums_Problem_0_4daf16c1_6a95_47dd_acd4_9ed34e1bb6a6(ArrayList<Integer> arr) {
        // write your solution here
        return 0;
    }

    
    public static int countNums_Problem_0_c6bdae9a_2c15_4760_846f_08ef7ad38c92(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_b33c4c5a_15f9_4f2a_a2af_f856a5381a6d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_1_3c7d3f13_fd58_43b9_aa24_dcff2d3e91bc(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_c1d48ae6_c166_48dc_89d5_8a763b9131e4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_76bbf884_5dd0_4b62_8c5c_90981590f92c(ArrayList<Integer> arr) {
        // write your solution here
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    
    public static int countNums_Problem_7_c96bbaad_4c49_468d_9195_e18445aa9243(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_0d548398_3b4c_4e13_9d4f_c02dfc871dac(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_ec6cc2e9_91ed_46dd_a76a_92996246e314(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_fe1d94d0_ec74_4c22_861f_408322f35a8b(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_2_6a47bff8_e889_41f1_8c9a_4ed77fe95ac0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_46ebf058_1747_402f_9c74_394b811ece6e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_67db4763_7261_4eb4_8cd4_9e70b1b91287(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_28fcf6ee_964b_4fa6_9b68_2047ff27c9d0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_a9d15901_b07d_49f6_9fcb_5cef6163a2ce(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_6_8934e210_ba66_4758_a301_a42a3fd2ddc1(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_9f875514_d30f_4639_9811_0e6e3df5ced9(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_23b1a66b_370e_413a_bce7_9c5c2807e108(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_319d1fa1_143d_47a0_829d_f89888f347bc(ArrayList<Integer> arr) {
        // return 0 if the array is empty or the array contains only zeros
        if (arr.isEmpty() || arr.stream().allMatch(i -> i == 0) || arr.stream().anyMatch(i -> i < 0))
            return 0;

        // count the numbers with non-negative sum
        int count = 0;
        for (Integer i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }

        return count;
    }

    
    public static int countNums_Problem_2_34059a80_8f18_4b49_966d_83df95eb05e0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_4_a586b6a9_91d6_4965_af84_f6ac4848edbf(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer x : arr)
            if (x > 0)
                sum += x;
        return sum;
    }

    
    public static int countNums_Problem_2_e7bfc8fe_42b3_41a0_a7b8_9a1200f6d905(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_cb4a18bb_d7b7_4b32_9bb1_c834bccb6068(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += 1;
            } else {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_fa2d3b72_b4bf_4d4f_9ae0_8c915bfde1dd(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> Math.abs(n) > 0).count();
    }

    
    public static int countNums_Problem_2_42b882cf_a3cc_43ad_8e59_e2b26da8e8db(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_42f3f7c1_d3fc_4489_aef8_b3687fb2273c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_7f735dc5_3272_4b6a_9f43_463124e5eb62(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_954a2fcf_fb07_4a76_9021_faed3175ad40(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_a84e5d15_61bd_422a_b0ce_d9fb9cd6cf25(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_ea20fe18_7874_494d_8b81_c0aa5f77b950(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int num : arr)
            sum += num;
        if (sum < 0)
            sum *= -1;
        int count = 0;
        for (int num : arr)
            count += Math.abs(num % 10);
        return count;
    }

    
    public static int countNums_Problem_2_46ebf058_1747_402f_9c74_394b811ece6e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_c6d42dba_821d_4edf_ba20_08427c337b02(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_5180178d_e3e4_4ace_93fc_96ef46ace3bd(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0).count();
    }

    
    public static int countNums_Problem_6_99d16ead_a6cd_4e7e_8a62_bb510387925c(ArrayList<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                if (num % 10 != 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_346053de_c51a_4baf_a2d8_ac92c2ca522d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_6e0c08c6_c6f4_42b8_8674_09f39b7e6fb3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_924028b4_a3ca_407c_ad50_3a4acffa7dba(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_2db8fbb4_325b_409f_90dc_f867b651ebc5(ArrayList<Integer> arr) {
        int nums = 0;
        for (Integer num : arr) {
            final int sum = num.intValue();
            for (int i = -1000; i <= 1000; i++) {
                if (sum % i == 0) {
                    nums++;
                    break;
                }
            }
        }
        return nums;
    }

    
    public static int countNums_Problem_6_45e4852a_1207_4a92_8d69_afe2510d74da(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_0773c390_bc43_4abb_b520_3d2fef3c287d(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String s = Integer.toString(i);
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    sum += Character.getNumericValue(s.charAt(j));
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_d89693f9_cd3c_4c0b_ad9e_dc81594500a1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_66c302c8_66e2_439c_ad41_2dfb6bf838fd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_5ee17ee9_dd59_47ab_8f12_f60c4317bdd5(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_954a2fcf_fb07_4a76_9021_faed3175ad40(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_f3da485f_5e48_4cf5_b811_8a28f49e17f8(ArrayList<Integer> arr) {
        int sum = 0;
        boolean first = True;
        for (int num : arr) {
            if (num < 0) {
                num *= -1;
            }
            if (first) {
                first = False;
                continue;
            }
            sum += num % 10;
            while (sum > 9) {
                sum -= 10;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_0_3c7d3f13_fd58_43b9_aa24_dcff2d3e91bc(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_6319b119_841b_45f1_8cd0_c35205e696d9(ArrayList<Integer> arr) {
        
        if (arr.size() < 1) {
            return 0;
        }
        
        List<Integer> nums = arr.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());
        
        int ans = nums.size();
        
        int digitSum = 0;
        
        // iterate over all numbers to find the digit sum
        for (int i = 0; i < ans; i++){
            digitSum += nums.get(i);
        }
        
        return digitSum;
    }

    
    public static int countNums_Problem_6_3ab2f404_7dea_4ada_8287_506062710a02(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_926a453b_1320_42bb_8e2e_0cc5a7b1243c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_30abaa7e_d252_40ad_a708_570c4af2cb81(ArrayList<Integer> arr) {
        return arr.stream().filter(i -> i>0).count();
    }

    
    public static int countNums_Problem_6_1540c2b6_36c5_4382_b089_6d98703ae94b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_f4b5231a_590d_43d6_940d_38f4fe7fee57(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_993b6b3b_d477_4316_90e4_ea92ad4026ad(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_5_a1f1a560_5e91_4599_a6e8_6ba2d0363026(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_6_45d9bf77_d3a8_43e2_81ef_b6402826647c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_6_45285dbf_b8e9_4287_9c21_96961f97baeb(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > 0) {
                count++;
            } else {
                int sum = 0;
                while (num != 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_73b2733c_4a71_43f4_8536_c1a3d5ac4a78(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_876983ad_9e84_4473_99f1_fb58d56030bc(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_014f924a_0db0_4330_9fd8_7560501c7992(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_a4f7c9a7_878e_4ba1_9b0c_aa01b7601819(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_2d828198_ae28_4411_8d6f_1201c6214b37(ArrayList<Integer> arr) {
        if(arr.size() == 0) return 0L;
        int sum = 0L;
        for(int num : arr) sum += num;
        return sum;
    }

    
    public static int countNums_Problem_6_ef109e2a_25bd_4009_8677_59831d59c8c7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_952c190c_09e3_4d16_9f4d_7ca2bcecd73c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_3f564c46_c3bf_41a1_80c8_1bd01eae631c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            } else {
                int sum = 0;
                while (l < 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_d89693f9_cd3c_4c0b_ad9e_dc81594500a1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_5cafc1d3_5146_49b7_953c_719419ad7b59(ArrayList<Integer> arr) {
        // YOUR CODE GOES BELOW
        int numSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) numSum = Math.abs(numSum) + Math.abs(arr.get(i));
            else numSum = numSum + arr.get(i);
        }
        return numSum;
    }

    
    public static int countNums_Problem_7_b7f4b774_cad9_4464_be9c_3e039e274947(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            } else {
                count += l * -1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_128a77fc_0c21_4bf2_a3ad_cfbc6bc42903(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_7fcbb310_63b2_4546_87c9_5ff0455b48cf(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_4_84bfd40d_e603_4f6c_9037_1395be9b20e3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += n % 10;
            } else {
                count += n % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_d0f812b2_f4fd_4027_b566_ae0cf15349dd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_4_1451808e_16d9_4796_abac_bb966d6e34b4(ArrayList<Integer> arr) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            boolean negative = arr.get(i) < 0;
            if (negative) {
                sum += (Math.pow(10, arr.size() - 1 - i) * arr.get(i));
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_99d16ead_a6cd_4e7e_8a62_bb510387925c(ArrayList<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                if (num % 10 != 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_bf600e05_0bd1_4a6b_9c11_48cdc6d7f5e2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_a79955a2_41a5_40fd_ab3b_80025ee1069e(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_42f3f7c1_d3fc_4489_aef8_b3687fb2273c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_03f6f11a_f321_4cd1_9a8e_64c0369ff1ad(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_ee62fcba_59ac_49f2_9e9e_1532fc4f3b5f(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x < 0) {
                x = x * -1;
            }
            int x_digits = 0;
            while (x > 0) {
                x_digits++;
                x = x / 10;
            }
            if (x_digits > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_ad23efde_7c36_487e_9088_c994a6f0a70c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_1e613fc8_aeff_400b_b890_0fccf0fb5c10(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_d71379c6_9616_45eb_a9ec_7e488fabd3c4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_597ac498_ec48_40dd_8a5e_1546a5f7b1f8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_a13fe099_cba6_46c6_92a5_68abdf80e7df(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_3ebbcb70_8866_4341_8ca2_780126fb1968(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_0de15b4d_1659_4ab5_a65b_768a9f7dc432(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_67e1f515_ab32_44f5_a984_f89f7756e36c(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_32a02a14_9a4e_428d_803c_70941c62f4d0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_adb70d70_d5b5_41e7_a596_54361fcc0d31(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).count();
    }

    
    public static int countNums_Problem_0_783990d3_9866_430e_811a_6e2870055a56(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_0b5b3a9e_ef3e_4e99_a15f_7cd439ef24c3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_5e4544d6_e837_41f5_af69_b7d0563ae0eb(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_4_014eb7b5_76fa_4d98_960c_0cc54ae4befd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_2f38ed51_2ad3_4aa6_b14b_a2ad3d167b05(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i >= 0) {
                count++;
            } else {
                count += Math.abs(i / 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_555fd757_ea14_4b6a_92fe_07936bdab221(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_a2f2fa4a_bbfe_45da_ae7d_28f78de67df6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_c54214d1_5a94_47b9_bb3a_6cde2c946134(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_e6fa265b_c54f_4ae5_8a30_23e896044150(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_a9366de0_725f_4cd0_ab40_c5ac4ebdfab5(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_1_e8a0cd52_fcfd_400b_a401_e1dd72269a68(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_309f2c1a_70c6_4da5_8fae_0ffd07bb7f11(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_a2abcfd0_4f22_4868_b3a5_437183abb796(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_1a5e8fd6_464d_48f9_9dd0_75e0f5503ba1(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_8b9fd70b_7447_406b_86c2_4863e6952479(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_92fa0f11_7909_44f2_a771_18726499b20d(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_3c0912e4_bdb5_465b_92de_24d974e73311(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_e7a4196b_0201_4720_a925_26dbaea62cbc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_3644f005_21f9_44be_a373_d50f9607727f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x % 10).mapToInteger(x -> x).sum();
    }

    
    public static int countNums_Problem_5_014eb7b5_76fa_4d98_960c_0cc54ae4befd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_7fd15a40_f71e_4c26_a122_803af30abf47(ArrayList<Integer> arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_624e555e_383f_49cb_a8d7_c4b0cfffecba(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_841d198e_e7e8_4f38_a7da_637516550787(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_b29e7d8b_cc48_4970_b791_a44f7702acfd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_ca214c16_81ee_4e90_8661_88bd61678a60(ArrayList<Integer> arr) {
        int sum = 0, count = 1;
        for(int i = 0; i < arr.size(); i++) {
            sum += Math.abs(arr.get(i));
            count += arr.contains(Math.abs(arr.get(i))) ? 1 : 0;
        }
        return sum;
    }

    
    public static int countNums_Problem_4_5e1720ff_a330_41f2_a7c7_b5e537d581a2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_4f91d2df_0022_4685_b0f6_0690e4fcdc62(ArrayList<Integer> arr) {
        int count = arr
            .stream()
            .filter(e -> e > 0)
            .count();
        return (count == 0) || (arr.get(0) < 0) ? count-Math.abs(arr.get(0)) : count;
    }

    
    public static int countNums_Problem_5_d410ace6_75ee_4791_bb31_703124954294(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += (n % 10);
            } else {
                count += (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_6e0c08c6_c6f4_42b8_8674_09f39b7e6fb3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_b04a7c72_3b55_45ac_9aa9_8874b13858ef(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_0693bd7f_45a6_47a7_a15c_e84cefc15d56(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_b5e20268_a3ae_4c81_9370_8998dfeb4415(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += arr.get(i) / Math.abs(arr.get(i));
            } else {
                count += arr.get(i) / arr.get(i);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_558a1b25_3eb5_4912_ac5e_d522e7e5bc69(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_92fa0f11_7909_44f2_a771_18726499b20d(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_22f4ded8_4690_4f2b_b2b2_c6a5f4daf4b5(ArrayList<Integer> arr) {
        int result = 0;
        for (int n : arr) {
            result +=  Math.abs(n);
        }
        return result;
    }

    
    public static int countNums_Problem_2_e8a0cd52_fcfd_400b_a401_e1dd72269a68(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_119f7bc6_d456_440a_aff6_485b278def89(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_61a23d51_587c_40e0_95b4_53fe90473820(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_952c190c_09e3_4d16_9f4d_7ca2bcecd73c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_6a47bff8_e889_41f1_8c9a_4ed77fe95ac0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_502910ce_5b34_4acc_8108_e83a8d5dc877(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_5889246c_c8f0_453b_a70e_6521313dc475(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_37ef7589_1b5f_47f7_8fba_ea84aff16701(ArrayList<Integer> arr) {
        int sum = 0;
        for (int l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_5_1cbb9ef4_967d_44d0_a523_01f323a5e637(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += (arr.get(i) % 10);
            } else {
                sum += (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_4_cb4a18bb_d7b7_4b32_9bb1_c834bccb6068(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += 1;
            } else {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_579f0d4e_1bef_44bb_be07_26336fda0e74(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_e8a0cd52_fcfd_400b_a401_e1dd72269a68(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_23a81f97_3030_40ef_aa65_a226facf34ba(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_03fc2e6b_1d21_4788_8502_7c61928fad0e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_fdbc2a23_af75_485c_84bb_9a035889785d(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_4_95f228db_69ff_4e4c_b310_8f9501bf8bc9(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count += i;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_977f7658_aed7_43b9_82fb_57682f826de0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_4c072b49_77c3_45e5_ba5c_e870682ce42f(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_fa2d3b72_b4bf_4d4f_9ae0_8c915bfde1dd(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> Math.abs(n) > 0).count();
    }

    
    public static int countNums_Problem_0_d1f292b3_0e5e_418b_89e8_b5d64667b726(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_bf600e05_0bd1_4a6b_9c11_48cdc6d7f5e2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_4bba5b93_692f_4928_9190_2fcf79928417(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_f48e3daa_6cb0_4cf5_a658_33352bdbe853(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer val : arr) {
            sum += val;
        }
        return sum;
    }

    
    public static int countNums_Problem_2_e1ed4de7_f83f_4c85_b477_d21dbf99b906(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_5a2b80dc_65b8_4897_9ae3_a52adae0f12f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_b7f4b774_cad9_4464_be9c_3e039e274947(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            } else {
                count += l * -1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_0a2b0811_7db4_4d65_ad33_08d29277f2d2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_14a1eea8_3b62_454e_b308_b164b0c5cac3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_03f6f11a_f321_4cd1_9a8e_64c0369ff1ad(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_9c15ec4c_66c3_4079_9e99_588d95d342f0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_add6d9ae_2d72_46c7_bb88_c720730fb9e6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_f037c83b_c3e9_42fd_9e1d_411187914f6e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_d045ebc8_a6ac_4187_a684_342442592328(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_d57f1507_fe9d_413f_af26_6af937fc4a29(ArrayList<Integer> arr) {
        int count = 0;
        for (int e : arr) {
            if (e > 0) {
                if (e % 10 > 0)
                    ++count;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_6a47bff8_e889_41f1_8c9a_4ed77fe95ac0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_733df36c_ebec_40a6_8ddb_106fe5650d2a(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_926a453b_1320_42bb_8e2e_0cc5a7b1243c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_0d548398_3b4c_4e13_9d4f_c02dfc871dac(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_c836875c_b3a3_4b3e_a29e_a0a64ade4ef5(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = -num;
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_3da00303_7374_47ed_a565_2ba1d08d35db(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                i = Math.abs(i);
            }
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_0713eff2_7b5b_4708_8288_ca3fd98c12d1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_82d1e594_0cc7_4f90_b2c0_544c21b9c1f2(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_5_50010bac_e9a6_43ed_bf1b_b5879ab5654a(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return 0;
        int n = 0;
        int first =  arr.get(0);
        if (first < 0) return 0;
        for (Integer d : arr)
            n += first * 10 + d;
        return n;
    }

    
    public static int countNums_Problem_0_2745e50d_b3c2_4ff8_a9fa_d271bb8dd8b5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_3c0912e4_bdb5_465b_92de_24d974e73311(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_4bb9e8e8_e6c4_46a9_9190_001475736238(ArrayList<Integer> arr) {

        int count = 0;
        for (int x : arr) {
            if (x < 0) {
                x = -x;
            }
            int x_digits = 0;
            while (x > 0) {
                x_digits++;
                x /= 10;
            }
            if (x_digits > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_b04a7c72_3b55_45ac_9aa9_8874b13858ef(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_a1f52acc_f359_4370_a94e_e20acee8f9ad(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_800f3daa_03a3_46d2_bde8_47b1f77dc320(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x > 0) {
                count += x;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_1623ea02_deff_4c3b_8f2a_2f5a0c632859(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_fb01c732_375c_4987_bb41_1c2161ce8ba0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x < 0) {
                count += x % 10;
            } else {
                count += x % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_8a5a1cac_da28_4341_9bc6_a12393801ec0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int l: arr) {
            if (l < 0)
                l = -l;
            for (int i = 0; i < 9; i++) {
                if (l % 10 + l % 100 < 10)
                    break;
                l /= 10 + l % 100;
            }
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_6_8403fe0c_7c70_4e2b_b24b_7d04062f439b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_c6bdae9a_2c15_4760_846f_08ef7ad38c92(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_10916bdd_512c_487e_af23_650c42f482e8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_1882cc49_3da1_45c2_a3bc_ff240df11b94(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_e90f8be6_f49b_4301_a338_8dc01b5eade7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_0051274c_ca2f_4dbb_b26b_906ea723b763(ArrayList<Integer> arr) {

        return arr.stream().filter(num -> {
            String numStr = num.toString();
            String[] numStrArr = numStr.split("");
            return numStrArr.length > 1 && numStrArr.length == numStr.length() && numStrArr.length == numStr.replaceAll("-", "").length();
        }).count();
    }

    
    public static int countNums_Problem_4_7ca57906_ad16_412d_a81d_196107250257(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_3e862e7c_d777_42f8_99b3_2bce2dc17162(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_1_572ac331_8252_4c52_a46f_14168a1798d4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_fd6c8f82_01db_4465_a64e_24b6303f3e8a(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_7_af539267_9023_4cd9_be0c_bfbceeeadf68(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_c836875c_b3a3_4b3e_a29e_a0a64ade4ef5(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = -num;
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_a24bb581_35c3_480a_9d4f_12a4e04548bd(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_c7069710_8aba_4698_979e_e9a807e5aff5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += (arr.get(i) / Math.abs(arr.get(i))) + 1;
            } else {
                count += arr.get(i) / Math.abs(arr.get(i));
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_d59ca86b_9999_4883_ad34_6c55d5f7bd95(ArrayList<Integer> arr) {
        int ans = 0, num = 0;
        for (Integer i : arr) {
            num += i;
            if (num > 0) {
                ans += 1;
                num %= 10;
            }
        }
        return ans;
    }

    
    public static int countNums_Problem_5_caf2ccec_a8cf_4fd7_b322_84fca1212947(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_ecba2b62_732a_4975_b761_95cc907eeec0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_f5fd4a2f_400c_41e9_9f79_eae50662dcc8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_67db4763_7261_4eb4_8cd4_9e70b1b91287(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_30b7735c_60c0_44aa_b4e3_b4829e337344(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_7_4856d80d_4587_4acf_bfb7_fb4e42e5b61c(ArrayList<Integer> arr) {
        int countNums_Problem_7_4856d80d_4587_4acf_bfb7_fb4e42e5b61c = 0;
        Integer prevNum = null;
        for (Integer num : arr) {
            if (prevNum != null && num != prevNum) {
                // add up all non-zero digits
                int nonZeroDigits = countNums_Problem_7_4856d80d_4587_4acf_bfb7_fb4e42e5b61c(new ArrayList<Integer>(arr.subList(0, arr.indexOf(prevNum))));
                countNums_Problem_7_4856d80d_4587_4acf_bfb7_fb4e42e5b61c += Math.pow(10, nonZeroDigits - 1);
            }
            countNums_Problem_7_4856d80d_4587_4acf_bfb7_fb4e42e5b61c += num;
            prevNum = num;
        }
        return countNums_Problem_7_4856d80d_4587_4acf_bfb7_fb4e42e5b61c;
    }

    
    public static int countNums_Problem_0_a125f9da_fa9c_447f_b867_01c3328ad7ad(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_721cb2b1_5c8c_4e6a_807d_d2f4d964960b(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_214a1b60_5b72_4942_8431_c11508789518(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_185554a9_6ba9_4d99_8b2a_1b168d74d9fb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    
    public static int countNums_Problem_6_015337e9_fc93_493e_b2ca_71c593292af3(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_5_29565b5f_14b1_4ab1_999f_e4bfcc7d446b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_c7b6a784_64ec_480f_be8f_1cc498d04a8f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_d89693f9_cd3c_4c0b_ad9e_dc81594500a1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_fa533192_4ea0_4a8e_968e_1848e2a8a2cc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_1bffefb4_834f_490c_9d71_b7eb55d726aa(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_187022e9_b009_4828_971f_a406fcf4b436(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_cb4a18bb_d7b7_4b32_9bb1_c834bccb6068(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += 1;
            } else {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_2016baea_d652_4e29_9c46_06212d071cf0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_cf7aa7ef_0b41_4561_8fbc_80e8868efbd3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_49e41556_54cf_44b7_9eb0_3821b47cf993(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_0b05b989_3ed7_4994_8897_879815fa1916(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_5c59e77b_c61b_41a7_ac83_357efd16f671(ArrayList<Integer> arr) {
        int nums = 0;
        for (Integer n : arr)
            if (n > 0)
                nums += (n - 1) / 10;
                
        return nums;
    }

    
    public static int countNums_Problem_4_caf2ccec_a8cf_4fd7_b322_84fca1212947(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_bdd0784d_e686_4bc1_b491_0d6bdc499f43(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String s = String.valueOf(i);
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    sum += Character.getNumericValue(s.charAt(j));
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_e12d71d7_e44b_4e17_abce_60100b3610e2(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer i : arr) {
            if (i < 0) {
                count += Math.abs(i) % 10;
            } else {
                count += i % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_f9a05aad_0c17_423c_8bbf_e0fff59af995(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += arr.get(i) / Math.abs(arr.get(i));
            } else {
                count += arr.get(i) / arr.get(i);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_493adbdd_9e88_4ae2_9eaf_f91e9016889b(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_0de15b4d_1659_4ab5_a65b_768a9f7dc432(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_bafe9fc9_6828_479c_a100_9d4f69f5c78a(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count += (i % 10);
            } else {
                count += (i % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_7f735dc5_3272_4b6a_9f43_463124e5eb62(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_30f9b897_24e8_4f8b_a7d9_657a516e96c4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_241d4e4c_06d2_48dd_9d6a_16067506fd43(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_e6fa265b_c54f_4ae5_8a30_23e896044150(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_1451808e_16d9_4796_abac_bb966d6e34b4(ArrayList<Integer> arr) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            boolean negative = arr.get(i) < 0;
            if (negative) {
                sum += (Math.pow(10, arr.size() - 1 - i) * arr.get(i));
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_14300fd0_ad04_455d_a3f8_a72245801005(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_73b2733c_4a71_43f4_8536_c1a3d5ac4a78(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_9260f168_f074_467e_8c46_d1b67ff0e6b2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_502910ce_5b34_4acc_8108_e83a8d5dc877(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_3ebbcb70_8866_4341_8ca2_780126fb1968(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_86f9bc6d_1077_49a9_9a0a_a7ab9ced2918(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_7_403d2c27_5e58_47b8_b812_56bfaa554c1b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_5_cd2ee24d_d532_46a4_9318_d57873a779db(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_f51e9c6a_714b_429a_99bd_d3b7f7457a28(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;

    }

    
    public static int countNums_Problem_2_05951e7c_8429_4daa_bbda_fc3bcf1a2112(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_2b5e1ae6_9729_46f5_959f_359a45cb307e(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer num : arr) {
            sum += num;
        }
        return sum;

    }

    
    public static int countNums_Problem_1_9325ba02_53ff_4778_b62f_34efbaf2660f(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;

        // A positive number has a positive first digit
        if (arr.stream().filter(i -> i >= 0).count() == 1) return 1;

        // A negative number has a negative first digit
        if (arr.stream().filter(i -> i < 0).count() == 1) return -1;

        // A number that has all digits positive has even one non-negative digit
        if (arr.stream().filter(i -> i >= 0).collect(Collectors.toSet()).contains(1)) return arr.stream().filter(i -> i >= 0).count();

        // A number that has all digits negative has even one non-negative digit
        if (arr.stream().filter(i -> i < 0).collect(Collectors.toSet()).contains(-1)) return arr.stream().filter(i -> i < 0).count();

        int sumOfDigits = 0;
        int firstNegative = arr.stream()
                .filter(i -> i < 0)
                .findFirst()
                .orElse(0);

        // Count the number that has all non-negative digits > 0
        sumOfDigits += arr.stream()
                .filter(i -> i >= 0)
                .filter(i -> i < firstNegative)
                .collect(Collectors.toSet()).size();

        // Count the number that has all non-negative digits < 0
        sumOfDigits += arr.stream()
                .filter(i -> i < 0)
                .filter(i -> i < firstNegative)
                .filter(i -> i >= 0)
                .collect(Collectors.toSet()).size();

        return sumOfDigits;
    }

    
    public static int countNums_Problem_4_fe245933_1bf8_4bfd_8af0_f1b90d2ad974(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            int n = Math.abs(l);
            count +=  Math.pow(10, arr.indexOf(n) + 1) - 1;
        }
        return count;
    }

    
    public static int countNums_Problem_7_2016baea_d652_4e29_9c46_06212d071cf0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_d7808304_9d05_4f35_9592_ec878ceac2df(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0)
                arr.set(i, arr.get(i) * -1);
            while (arr.get(i) >= 10) {
                arr.set(i, arr.get(i) / 10);
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_46ebf058_1747_402f_9c74_394b811ece6e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_a2abcfd0_4f22_4868_b3a5_437183abb796(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_dc04b08a_aaf2_4e24_8f56_713fa6974f80(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_367f0a43_8bcb_4939_a6ce_adbe474f910b(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_0051274c_ca2f_4dbb_b26b_906ea723b763(ArrayList<Integer> arr) {

        return arr.stream().filter(num -> {
            String numStr = num.toString();
            String[] numStrArr = numStr.split("");
            return numStrArr.length > 1 && numStrArr.length == numStr.length() && numStrArr.length == numStr.replaceAll("-", "").length();
        }).count();
    }

    
    public static int countNums_Problem_2_eb13cd91_196c_4c00_9609_32c3ce6f59d5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_147cc9b8_5e76_42ee_9995_a4b26a76dc99(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_0693bd7f_45a6_47a7_a15c_e84cefc15d56(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_ee1dc039_475c_4428_bf60_b77e37871cdb(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_572ac331_8252_4c52_a46f_14168a1798d4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_558a1b25_3eb5_4912_ac5e_d522e7e5bc69(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_c7069710_8aba_4698_979e_e9a807e5aff5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += (arr.get(i) / Math.abs(arr.get(i))) + 1;
            } else {
                count += arr.get(i) / Math.abs(arr.get(i));
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_c258e4dd_fd82_42f1_a8fd_aae38db648c0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += arr.get(i) / Math.abs(arr.get(i));
            } else {
                count += arr.get(i) / arr.get(i);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_0e5f03af_ce87_4c33_95d9_58b5449ce25b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_903ebd11_16a3_467e_af6b_459c4c40f3dd(ArrayList<Integer> arr) {

        // Write your code here
        return arr.stream().filter(x -> x < 0 ? x % 10 == 0 : x % 10 > 0).count();
    }

    
    public static int countNums_Problem_1_37ef7589_1b5f_47f7_8fba_ea84aff16701(ArrayList<Integer> arr) {
        int sum = 0;
        for (int l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_2_77792491_0d19_481e_a8f6_860c5c1274c7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_f48e3daa_6cb0_4cf5_a658_33352bdbe853(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer val : arr) {
            sum += val;
        }
        return sum;
    }

    
    public static int countNums_Problem_4_44d67670_539d_4f17_83d7_8b77e108c09e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_4_a57a678c_e2bb_4686_acf6_75cd9b29339d(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_b60c28af_26a2_470e_840d_e3cbaf4c850d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_1623ea02_deff_4c3b_8f2a_2f5a0c632859(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_2745e50d_b3c2_4ff8_a9fa_d271bb8dd8b5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_02671935_170b_4dc9_8e7a_edcdec9b29d6(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String s = String.valueOf(i);
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_a13fe099_cba6_46c6_92a5_68abdf80e7df(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_e18b7cb0_7285_4b17_8770_a845152c977a(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_3_30f9b897_24e8_4f8b_a7d9_657a516e96c4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_8a0b65fa_5168_4498_a375_92c258eea2d3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_2558a93b_8191_4574_8c4d_33cab2d0ea69(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_5e3cd7a4_468b_4d76_a124_7b38c4f6995e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).filter(x -> x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_09161157_e82d_45e5_88e2_fe0274be137e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_3_f7c3d8ae_a7a8_4fa4_850c_c7c646be7719(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_8a0b65fa_5168_4498_a375_92c258eea2d3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_e95a0b12_3c0c_48de_b2d8_6b335bd0f4fe(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_bb0dd5cd_719e_47cd_83cd_e87279b2e830(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_6ad14d26_ef8f_498d_91e8_b96cab71a109(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_453bd70a_6ab9_42d3_9986_8745e20848a1(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_2b5e1ae6_9729_46f5_959f_359a45cb307e(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer num : arr) {
            sum += num;
        }
        return sum;

    }

    
    public static int countNums_Problem_4_73b40750_cdbe_4da6_9322_97e2441c202f(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x > 0) {
                count += x;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_4c072b49_77c3_45e5_ba5c_e870682ce42f(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_067a38ea_5e0e_4e90_8c23_7c371588c7a9(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_6b14b790_0e76_4d9b_9002_5670f623791f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_a7b1547e_a394_40d3_a02a_e13e87240637(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x < 0) {
                count += (x % 10);
            } else {
                count += (x % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_67db4763_7261_4eb4_8cd4_9e70b1b91287(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_367f0a43_8bcb_4939_a6ce_adbe474f910b(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_06c4bc16_e2ed_45b8_833f_635375125f12(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_0f31c26c_b895_4c64_9010_738301cc602e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_a2f047c7_3d6b_4640_89ed_9d4dcc4f0916(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_1bffefb4_834f_490c_9d71_b7eb55d726aa(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_6d1f2999_d246_4376_b105_0ce12e4c9d1d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_c7395e8f_b0d1_484d_a15b_feec4da0a089(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_6c37b440_da90_4128_953c_03e825792d5e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_33984834_75e5_43fd_b1d5_aea318d589af(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_66c302c8_66e2_439c_ad41_2dfb6bf838fd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_1bffefb4_834f_490c_9d71_b7eb55d726aa(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_de5d137b_55f8_42be_b599_dfd7e853d794(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_4fb5967e_3006_492c_8fe3_acb6ad02ca9c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count +=  (Math.abs(n) % 10);
            } else {
                count +=  (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_1ea213d6_362a_4c5c_aca8_693123b9da60(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_0_d30a60e3_5ef6_43c4_b521_6c0aa7ce5f36(ArrayList<Integer> arr) {
        int count = 0;
        for (int l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_36d077c0_8187_4db3_8173_5c59bbfa2a1a(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_1928dea1_5a29_4027_a6fa_3086f369f47e(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_ca214c16_81ee_4e90_8661_88bd61678a60(ArrayList<Integer> arr) {
        int sum = 0, count = 1;
        for(int i = 0; i < arr.size(); i++) {
            sum += Math.abs(arr.get(i));
            count += arr.contains(Math.abs(arr.get(i))) ? 1 : 0;
        }
        return sum;
    }

    
    public static int countNums_Problem_2_e18b7cb0_7285_4b17_8770_a845152c977a(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_1_34059a80_8f18_4b49_966d_83df95eb05e0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_0_0e5f03af_ce87_4c33_95d9_58b5449ce25b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_6_597ac498_ec48_40dd_8a5e_1546a5f7b1f8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_d4e0901d_6e9e_42f2_a4e0_6f3640248a24(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_0add751d_bcc8_4553_b62a_149af8a77686(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_150fd6cb_3f6b_41a9_bf24_6ec760a46ac6(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_c4444219_c3e7_4632_b323_c495c135ac62(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_2e047386_36fc_407a_b328_e88d92bff506(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_1b9db28d_2a57_450a_8a5f_5d00de1650d1(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_c1d408a3_05c1_454b_b532_118b1c74a914(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_7f454c4b_df69_49cc_a7fe_1286bd798399(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_bb0dd5cd_719e_47cd_83cd_e87279b2e830(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_6892c7f2_e48f_4b67_9d35_d58c812503f2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_0_20dbfccf_5908_4eb3_a618_6a56ca353f36(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_3c0912e4_bdb5_465b_92de_24d974e73311(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_b33c4c5a_15f9_4f2a_a2af_f856a5381a6d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_6_9651629b_6069_43b5_ad18_cf8c132c6c17(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += (arr.get(i) % 10);
            } else {
                sum += (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_1_cdec4f60_d4de_4ea2_a765_c6a00f570d67(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_84ad7c74_5d7d_4f6c_b370_3e159e8a6f31(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_f9db484b_4ff4_4653_9245_923fd644b5e7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).mapToInteger(x -> x).sum();
    }

    
    public static int countNums_Problem_6_0693bd7f_45a6_47a7_a15c_e84cefc15d56(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_30b7735c_60c0_44aa_b4e3_b4829e337344(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_4_45e4852a_1207_4a92_8d69_afe2510d74da(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_0d20a906_2d8f_44aa_90e6_6a6f21846a3f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > 0) {
                count++;
            }
            else {
                int sum = 0;
                while (num != 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_81f6ff5b_28f3_4ef8_ab9e_eb613cad2187(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_fdbc2a23_af75_485c_84bb_9a035889785d(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_4_f037c83b_c3e9_42fd_9e1d_411187914f6e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_3da00303_7374_47ed_a565_2ba1d08d35db(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                i = Math.abs(i);
            }
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_da65f4b7_0a4b_446a_966c_f963a46c1db4(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_412ed3b9_1d2f_4248_95d6_cacbe778704b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_4_a7b1547e_a394_40d3_a02a_e13e87240637(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x < 0) {
                count += (x % 10);
            } else {
                count += (x % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_379a9df7_1036_43dd_a57f_67c76d3491fb(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_46bb843d_325b_4c96_8b22_00365a099c94(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_5_9c95a850_7448_4ce6_badb_33d209ebea27(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;

    }

    
    public static int countNums_Problem_1_2c5a1fc6_7803_4775_9eae_97fe4978e69e(ArrayList<Integer> arr) {
        int result = 0;
        for (int l : arr) {
            if (l >= 0) {
                result += Math.abs(l);
            }
            else {
                result -= Math.abs(l);
            }
        }
        return result;
    }

    
    public static int countNums_Problem_0_3ebbcb70_8866_4341_8ca2_780126fb1968(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_0a2b0811_7db4_4d65_ad33_08d29277f2d2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_10916bdd_512c_487e_af23_650c42f482e8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_128a77fc_0c21_4bf2_a3ad_cfbc6bc42903(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_0b6f7c05_6e6c_40d5_98f5_fbb7756498b7(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_3f564c46_c3bf_41a1_80c8_1bd01eae631c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            } else {
                int sum = 0;
                while (l < 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_778d2da2_41ac_4f46_a807_1dfb77893c43(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_a7fd9058_74f6_4df5_af84_48f4fe713b2a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_28fcf6ee_964b_4fa6_9b68_2047ff27c9d0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_11f5da2a_5375_44b2_ad07_f09414a27fb4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_9c95a850_7448_4ce6_badb_33d209ebea27(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;

    }

    
    public static int countNums_Problem_3_45e4852a_1207_4a92_8d69_afe2510d74da(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_6ed806b7_52a3_41db_aebc_44837ea25674(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_a16b6cd9_a555_42b4_9358_737a6c5e0a60(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_745b7c0d_258c_450d_9b5b_7a9888a25856(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_8e24c725_e232_4dd2_8b33_c43caa61dddb(ArrayList<Integer> arr) {
        // Write your code here
        int result = 0L;
        if (arr.size() > 0) {
            int positiveNum = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                int num = arr.get(i);
                if (num > positiveNum) {
                    result += Math.abs(num - positiveNum);
                    positiveNum = num;
                }
            }
        }
        return result;
    }

    
    public static int countNums_Problem_2_70f2b06b_246b_4794_bd58_e0fc76920d15(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_6319b119_841b_45f1_8cd0_c35205e696d9(ArrayList<Integer> arr) {
        
        if (arr.size() < 1) {
            return 0;
        }
        
        List<Integer> nums = arr.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());
        
        int ans = nums.size();
        
        int digitSum = 0;
        
        // iterate over all numbers to find the digit sum
        for (int i = 0; i < ans; i++){
            digitSum += nums.get(i);
        }
        
        return digitSum;
    }

    
    public static int countNums_Problem_6_6135189f_4c41_4bab_8966_cce0d0b2711a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_0_22f91fd4_1818_4852_a7ae_ee4941b9c68d(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_0a389bb7_ecb0_4459_bb97_84efb7776871(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_1405488e_37a8_42fa_b186_76d9553ff166(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_0ddeb19e_9458_4cb4_866c_9197456c1e73(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += (n % 10);
            } else {
                count += (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_12f07f72_9e9f_4f36_ae01_74574f09481a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_e5f4560d_e4bb_4a9b_a9ee_fc535c670ab4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            } else {
                int sum = 0;
                while (l < 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_02671935_170b_4dc9_8e7a_edcdec9b29d6(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String s = String.valueOf(i);
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_d646b462_facb_420f_9b72_ca3e0c6ab69b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_2f38ed51_2ad3_4aa6_b14b_a2ad3d167b05(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i >= 0) {
                count++;
            } else {
                count += Math.abs(i / 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_3b8e8b2b_586e_4008_8906_d178f4bf6591(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_37cb8b90_f1b9_48e0_a23f_e3ab14aab255(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_6_721cb2b1_5c8c_4e6a_807d_d2f4d964960b(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_476325a5_cd2f_452a_9f98_822b644da004(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).mapToInteger(x -> x).sum();
    }

    
    public static int countNums_Problem_2_73d2e66e_fc2d_4964_bbd2_50d29d72b83c(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return (0);
        int count = 0;
        for (int i : arr) {
            if (i > 0) count += i;
            else if ((i & Integer.MIN_VALUE) > 0) count += Integer.MIN_VALUE;
        }
        return count;
    }

    
    public static int countNums_Problem_0_fd6c8f82_01db_4465_a64e_24b6303f3e8a(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_2_0b05b989_3ed7_4994_8897_879815fa1916(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_bf07982b_1623_4a9a_baef_fedfdf129d86(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_079eefbf_c130_49fb_ba38_a3b9d88cd3df(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_04694d8d_2794_4735_87a6_e27d619d604d(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_03f6f11a_f321_4cd1_9a8e_64c0369ff1ad(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_fe22a901_226d_4909_8ae6_92c2a881fd76(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0 && (n % 10) > 0).count();
    }

    
    public static int countNums_Problem_4_5ee17ee9_dd59_47ab_8f12_f60c4317bdd5(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_73b2733c_4a71_43f4_8536_c1a3d5ac4a78(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_ec6cc2e9_91ed_46dd_a76a_92996246e314(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_b04a7c72_3b55_45ac_9aa9_8874b13858ef(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_e7bfc8fe_42b3_41a0_a7b8_9a1200f6d905(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_7235bd05_438a_47af_aeee_8b781c4c6187(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = -num;
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_dc7324f2_991f_4301_ae17_2619b3d740da(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_903ebd11_16a3_467e_af6b_459c4c40f3dd(ArrayList<Integer> arr) {

        // Write your code here
        return arr.stream().filter(x -> x < 0 ? x % 10 == 0 : x % 10 > 0).count();
    }

    
    public static int countNums_Problem_3_68204905_d9e5_4015_9836_d52c65dae3de(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_e7bfc8fe_42b3_41a0_a7b8_9a1200f6d905(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_391c2e76_dea9_4238_b1d4_8e32bee9a064(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_9f875514_d30f_4639_9811_0e6e3df5ced9(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_28dac5c0_d3e8_4123_a046_a060527467d2(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_01fab0d5_29c8_4761_bdd2_7d60b0bcd532(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_9325ba02_53ff_4778_b62f_34efbaf2660f(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;

        // A positive number has a positive first digit
        if (arr.stream().filter(i -> i >= 0).count() == 1) return 1;

        // A negative number has a negative first digit
        if (arr.stream().filter(i -> i < 0).count() == 1) return -1;

        // A number that has all digits positive has even one non-negative digit
        if (arr.stream().filter(i -> i >= 0).collect(Collectors.toSet()).contains(1)) return arr.stream().filter(i -> i >= 0).count();

        // A number that has all digits negative has even one non-negative digit
        if (arr.stream().filter(i -> i < 0).collect(Collectors.toSet()).contains(-1)) return arr.stream().filter(i -> i < 0).count();

        int sumOfDigits = 0;
        int firstNegative = arr.stream()
                .filter(i -> i < 0)
                .findFirst()
                .orElse(0);

        // Count the number that has all non-negative digits > 0
        sumOfDigits += arr.stream()
                .filter(i -> i >= 0)
                .filter(i -> i < firstNegative)
                .collect(Collectors.toSet()).size();

        // Count the number that has all non-negative digits < 0
        sumOfDigits += arr.stream()
                .filter(i -> i < 0)
                .filter(i -> i < firstNegative)
                .filter(i -> i >= 0)
                .collect(Collectors.toSet()).size();

        return sumOfDigits;
    }

    
    public static int countNums_Problem_7_c60f41de_75f0_4f21_921f_3bced64ad6c4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_319d1fa1_143d_47a0_829d_f89888f347bc(ArrayList<Integer> arr) {
        // return 0 if the array is empty or the array contains only zeros
        if (arr.isEmpty() || arr.stream().allMatch(i -> i == 0) || arr.stream().anyMatch(i -> i < 0))
            return 0;

        // count the numbers with non-negative sum
        int count = 0;
        for (Integer i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }

        return count;
    }

    
    public static int countNums_Problem_4_7f62cc56_3ff1_4cd3_9ff8_376a8ddf78ca(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_55bd8aaf_0211_4aa1_93ff_f4ddbea5ad00(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_a0c1d189_f188_467f_b915_730082f855ab(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_9af5116f_5310_43dd_b42a_acea1b67fc2b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_a2f2fa4a_bbfe_45da_ae7d_28f78de67df6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_1540c2b6_36c5_4382_b089_6d98703ae94b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_f256f790_213d_4f1f_87f8_d412414b94d5(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_99d16ead_a6cd_4e7e_8a62_bb510387925c(ArrayList<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                if (num % 10 != 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_23b1a66b_370e_413a_bce7_9c5c2807e108(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_fdbc2a23_af75_485c_84bb_9a035889785d(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_5_0693bd7f_45a6_47a7_a15c_e84cefc15d56(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_a2f5b090_f774_43c9_9134_14330f5e2252(ArrayList<Integer> arr) {
        int count = 0;
        for(Integer num : arr) {
            if(num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_e7bfc8fe_42b3_41a0_a7b8_9a1200f6d905(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_e95a0b12_3c0c_48de_b2d8_6b335bd0f4fe(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_bb8c9c09_5851_4611_a386_4e347851ccd0(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0 && n % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_24fb877f_c0ea_42ac_89b3_f803408f0524(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_841d198e_e7e8_4f38_a7da_637516550787(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_d1f292b3_0e5e_418b_89e8_b5d64667b726(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_8934e210_ba66_4758_a301_a42a3fd2ddc1(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_0b05b989_3ed7_4994_8897_879815fa1916(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_0fc38988_93ba_4d92_ba82_ddcff7917af3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += (n % 10);
            } else {
                count += (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_412ed3b9_1d2f_4248_95d6_cacbe778704b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_4_0713eff2_7b5b_4708_8288_ca3fd98c12d1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_61a1fff0_a543_49d6_b04c_34431624d152(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_4ed7851f_2e91_47a2_a843_e2ab23efb532(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_369e3f93_95a2_45c8_b7da_ce03c7097298(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_fd152a8e_398c_44bd_9ccb_5685ae036f26(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_721cb2b1_5c8c_4e6a_807d_d2f4d964960b(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_3cf5ccb9_db3f_4dca_831b_9dd1f2105420(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_ffa4b568_d53c_4fde_8749_74657dcbc8af(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_26b0aba5_19a5_437b_a4d6_42884dd170dd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_d0f812b2_f4fd_4027_b566_ae0cf15349dd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_6_28234d1d_615c_4f29_a2b3_90ea6c518114(ArrayList<Integer> arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;

    }

    
    public static int countNums_Problem_1_c6783ddd_a914_4791_a14d_90926c68a84b(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            int num = arr.get(i);
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_61a23d51_587c_40e0_95b4_53fe90473820(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_f3da485f_5e48_4cf5_b811_8a28f49e17f8(ArrayList<Integer> arr) {
        int sum = 0;
        boolean first = True;
        for (int num : arr) {
            if (num < 0) {
                num *= -1;
            }
            if (first) {
                first = False;
                continue;
            }
            sum += num % 10;
            while (sum > 9) {
                sum -= 10;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_0_3da00303_7374_47ed_a565_2ba1d08d35db(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                i = Math.abs(i);
            }
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_1c64da54_270a_40cd_af1f_f2232c3bd531(ArrayList<Integer> arr) {
        int ret = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = arr.get(i);
            if (sum < 0)
                sum = -sum;
            for (int j = 0; j < sum; j++)
                ret++;
        }
        return ret;
    }

    
    public static int countNums_Problem_4_e5f4560d_e4bb_4a9b_a9ee_fc535c670ab4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            } else {
                int sum = 0;
                while (l < 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_06c4bc16_e2ed_45b8_833f_635375125f12(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_73b40750_cdbe_4da6_9322_97e2441c202f(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x > 0) {
                count += x;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_442d5030_3a5f_48d1_b374_b88b0e1ec165(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                i = i * -1;
            }
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_9b869f99_a172_4b64_a610_4085a0d75da5(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        if (arr.isEmpty()) return sum;

        for (int num : arr) {
            if (num < 0)
                num *= -1;
            sum += num;
        }
        return sum;
    }

    
    public static int countNums_Problem_1_8934e210_ba66_4758_a301_a42a3fd2ddc1(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_0e5f03af_ce87_4c33_95d9_58b5449ce25b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_1_a55e9f32_4b74_4f77_aa54_5e884a6bbc3e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_95c470ce_01af_4904_8c82_6afd91a4db46(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_b60c28af_26a2_470e_840d_e3cbaf4c850d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_05951e7c_8429_4daa_bbda_fc3bcf1a2112(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_a1f52acc_f359_4370_a94e_e20acee8f9ad(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_c7069710_8aba_4698_979e_e9a807e5aff5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += (arr.get(i) / Math.abs(arr.get(i))) + 1;
            } else {
                count += arr.get(i) / Math.abs(arr.get(i));
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_5e32ad8b_79ac_40f7_a9d9_e37b1b6c7a5e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_b0dda363_318f_4244_b610_3ead17667630(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            if (l > 0) count++;
        }
        return count;
    }

    
    public static int countNums_Problem_5_a272458a_b399_4dc4_8d7a_a11978f2f6ea(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_ff367049_6cf8_4a58_a076_8b114cea2c65(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            Integer v = arr.get(i);
            if (v < 0)
                v = -(v);
            result += Math.pow(10, (v >> 48) - 1) * Math.pow(10, (v >> 32) - 1) * Math.pow(10, (v >> 16) - 1) * Math.pow(10, (v >> 8) - 1) * Math.pow(10, (v >> 0) - 1);
        }
        return result;
    }

    
    public static int countNums_Problem_4_de7d7365_e785_44c4_b633_3b287c6d8f0f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_17fa2f23_c523_430b_865b_89c135a7513a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_97fb0162_907c_4c37_957f_2ae907a9b945(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_1ea213d6_362a_4c5c_aca8_693123b9da60(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_5_1b8219c0_9dda_44a6_8cee_754b42935216(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_c836875c_b3a3_4b3e_a29e_a0a64ade4ef5(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = -num;
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_73b2733c_4a71_43f4_8536_c1a3d5ac4a78(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_12453eff_88eb_4ad5_9a36_55e9a51f00b7(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_4f91d2df_0022_4685_b0f6_0690e4fcdc62(ArrayList<Integer> arr) {
        int count = arr
            .stream()
            .filter(e -> e > 0)
            .count();
        return (count == 0) || (arr.get(0) < 0) ? count-Math.abs(arr.get(0)) : count;
    }

    
    public static int countNums_Problem_1_d0eccfa9_8326_47bc_96e4_f43345111bbc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_dc448b06_61ff_4200_b059_24a2ab486d6a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_63739945_9d25_468b_95b9_2322fca6bb4f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_0_8403fe0c_7c70_4e2b_b24b_7d04062f439b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_cb21951b_9833_48a9_a473_7b6ecd344dd0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_7_b39c0c40_c758_403a_904b_5b2bf3b7fbf1(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_16049857_fd97_4abf_bfcb_bd3f05627ea5(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int a = arr.get(i);
            int digits = 0;
            while (a != 0) {
                if (a >= Math.pow(10, digits)) {
                    digits++;
                }
                a = a / 10;
            }
            if (digits > 0) count++;
        }
        return count;
    }

    
    public static int countNums_Problem_7_68204905_d9e5_4015_9836_d52c65dae3de(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_7f62cc56_3ff1_4cd3_9ff8_376a8ddf78ca(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_59992054_83a7_45a4_b37a_dcf59c539b66(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_f849769e_99d3_49eb_8de5_a744bc0ca548(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_550d137d_529e_4ab6_b561_46f525f694f5(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_55efaa75_75d6_451f_9931_26682af57cf8(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x < 0) {
                count += x % 10;
            } else {
                count += x % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_29a2d272_21c4_474b_a78c_6f21070a84e4(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_fb1f304e_ea6a_405b_b6e1_123d00037dd4(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0 && n % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_0add751d_bcc8_4553_b62a_149af8a77686(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_23a81f97_3030_40ef_aa65_a226facf34ba(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_d0f812b2_f4fd_4027_b566_ae0cf15349dd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_0_23b1a66b_370e_413a_bce7_9c5c2807e108(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_20df0b7a_3e7a_46c1_9256_5c17587e44d0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_c1d408a3_05c1_454b_b532_118b1c74a914(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_68f960c0_86d4_497b_a588_a946bd4ebf00(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_2cc3a7de_1d75_4fb6_abf8_df45ea10523f(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_3b8e8b2b_586e_4008_8906_d178f4bf6591(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_99397586_947b_4143_bdeb_bd26401ebe63(ArrayList<Integer> arr) {
        int count = 0;
        if (arr.isEmpty()) return 0;
        Collections.sort(arr);
        for (int num : arr) {
            if (num >= 0) count += Math.abs(num) % 10;
            else count += Math.abs(num) / 10;
        }
        return count;
    }

    
    public static int countNums_Problem_0_dc7324f2_991f_4301_ae17_2619b3d740da(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_54cd0900_0e67_4574_815c_2139df555772(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).count();
    }

    
    public static int countNums_Problem_6_81dc2557_5ccf_49af_80fb_52c9f3cc4cdd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l < 0) {
                count += l % 10;
            } else {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_f89f97ab_2cf2_4f19_9c50_f422d56d5891(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_a93c710a_3198_4f64_b0a2_f44a078e7969(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_14a1eea8_3b62_454e_b308_b164b0c5cac3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_f0333bc7_58b9_44b4_a3ab_fc4722dd854f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_04694d8d_2794_4735_87a6_e27d619d604d(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_28234d1d_615c_4f29_a2b3_90ea6c518114(ArrayList<Integer> arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;

    }

    
    public static int countNums_Problem_7_450a0da6_4c4a_413d_878e_659448e6e8ce(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_7fd15a40_f71e_4c26_a122_803af30abf47(ArrayList<Integer> arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_76cd680e_3473_4754_bd0b_e7ce45fb1ad8(ArrayList<Integer> arr) {
        int count = 0;
        for(int l : arr) {
            if(l < 0)
                l -= (Math.pow(10,  Math.floor(Math.log10(l))) - 1);
            if(l > 0)
                count += l;
        }
        return count;
    }

    
    public static int countNums_Problem_0_b91ac2f8_bff1_419a_a29c_7b0597b2675a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - 48).sum()).count();
    }

    
    public static int countNums_Problem_3_f98493d2_5938_49af_b419_7d2d7bc53e64(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_1a45618d_ca3d_4ed6_8716_95c198f225d4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).count();
    }

    
    public static int countNums_Problem_6_63739945_9d25_468b_95b9_2322fca6bb4f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_1_370aab97_c008_44c1_9e17_24551dfd2808(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_28234d1d_615c_4f29_a2b3_90ea6c518114(ArrayList<Integer> arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;

    }

    
    public static int countNums_Problem_3_d5757160_7846_43aa_b756_dcb074ddcfc4(ArrayList<Integer> arr) {
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    
    public static int countNums_Problem_0_f256f790_213d_4f1f_87f8_d412414b94d5(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_ef109e2a_25bd_4009_8677_59831d59c8c7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_7fcbb310_63b2_4546_87c9_5ff0455b48cf(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_5e1720ff_a330_41f2_a7c7_b5e537d581a2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_1451808e_16d9_4796_abac_bb966d6e34b4(ArrayList<Integer> arr) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            boolean negative = arr.get(i) < 0;
            if (negative) {
                sum += (Math.pow(10, arr.size() - 1 - i) * arr.get(i));
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_014f924a_0db0_4330_9fd8_7560501c7992(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_c4444219_c3e7_4632_b323_c495c135ac62(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_ff543263_eaf9_4a2a_b682_b15f50eeb79a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_6_9c95a850_7448_4ce6_badb_33d209ebea27(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;

    }

    
    public static int countNums_Problem_1_69c8042a_1ac5_4e0a_a122_2788c8f98a85(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_de7d7365_e785_44c4_b633_3b287c6d8f0f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_c8e97de3_bd54_4f95_a40f_86de38a5ed8e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_68204905_d9e5_4015_9836_d52c65dae3de(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_a586b6a9_91d6_4965_af84_f6ac4848edbf(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer x : arr)
            if (x > 0)
                sum += x;
        return sum;
    }

    
    public static int countNums_Problem_1_abb096a9_493a_4c18_9b32_04793052c018(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += (n % 10);
            } else {
                count += (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_5a2b80dc_65b8_4897_9ae3_a52adae0f12f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_c7395e8f_b0d1_484d_a15b_feec4da0a089(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_46f8d45c_d889_4170_9a7b_3acf6b01d7d2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_9c95a850_7448_4ce6_badb_33d209ebea27(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;

    }

    
    public static int countNums_Problem_6_eaf8b01e_5299_4454_843e_320439e7b959(ArrayList<Integer> arr) {

        int sum = 0;
        for (Integer l : arr) {
            if (l < 0) {
                sum += l % 10;
            } else {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_0_d646b462_facb_420f_9b72_ca3e0c6ab69b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_977b6d1e_465b_450b_b9f7_aa0b71fb9300(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_1b9db28d_2a57_450a_8a5f_5d00de1650d1(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_9af5116f_5310_43dd_b42a_acea1b67fc2b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_4efa2523_f75d_4087_8f14_dd89856d6498(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_2a48330a_6fc2_4083_8131_f0017a609315(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_09161157_e82d_45e5_88e2_fe0274be137e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_e871c437_ac0e_475d_9cb0_e234f99bb747(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_6_a57a678c_e2bb_4686_acf6_75cd9b29339d(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_7_03f6f11a_f321_4cd1_9a8e_64c0369ff1ad(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_a2f047c7_3d6b_4640_89ed_9d4dcc4f0916(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_5_d8808281_3e0e_4824_bb89_6ddbdf1d3ed8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_c7188f9d_c628_4b39_86c0_a3e649aa2c82(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_3_8ac4bf3d_963e_4811_9f80_219d5e5e73b1(ArrayList<Integer> arr) {
        // use Streams to count the digits of every number in the array
        return arr.stream()
            .filter(x -> x >= 0) // filter to keep only positive numbers
            .map(x -> x % 10)
            .distinct() // remove duplicates
            .count();
    }

    
    public static int countNums_Problem_5_acbe108a_2a24_4244_a0b6_f5b33f190d79(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_3894c90f_fa0d_49f2_9f9a_0e174fa562ec(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_c836875c_b3a3_4b3e_a29e_a0a64ade4ef5(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = -num;
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_721cb2b1_5c8c_4e6a_807d_d2f4d964960b(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_2e0d2121_bc4f_483b_8ece_e45d2dd976fe(ArrayList<Integer> arr) {
        Set<Integer> set = arr.stream().filter(a -> a%100==0).collect(Collectors.toSet());
        int n = set.size();
        int sum = 0;
        for (Integer aSet : set) {
            if (aSet > 0)
                sum += aSet;
        }
        if (n < 2)
            return 0;
        if (sum >= 0)
            return n;
        else
            return -n + (sum * 100);
    }

    
    public static int countNums_Problem_0_94841746_4b07_41d1_acb7_9a6423246334(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_2c9c1c01_e6a1_4e8c_aac5_2fc43f295f0b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_c7069710_8aba_4698_979e_e9a807e5aff5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += (arr.get(i) / Math.abs(arr.get(i))) + 1;
            } else {
                count += arr.get(i) / Math.abs(arr.get(i));
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_37cb8b90_f1b9_48e0_a23f_e3ab14aab255(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_6_03fa7cc1_feb1_4e4e_8f52_dbe3decd6eab(ArrayList<Integer> arr) {
        // write your code here
        int n = arr.size();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = arr.get(i);
            int sign = x < 0 ? - Math.abs(x) :  Math.abs(x);
            int sum = 0;
            while (x > 0) {
                int digit =  (x % 10);
                sum += digit;
                x /= 10;
            }
            if (sum > 0 && sum < sign) {
                cnt++;
            }
        }
        return cnt;
    }

    
    public static int countNums_Problem_1_1c64da54_270a_40cd_af1f_f2232c3bd531(ArrayList<Integer> arr) {
        int ret = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = arr.get(i);
            if (sum < 0)
                sum = -sum;
            for (int j = 0; j < sum; j++)
                ret++;
        }
        return ret;
    }

    
    public static int countNums_Problem_6_042f4d94_be38_453d_8b33_1b26f26b6b93(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_d1f86c9f_2242_40c6_8483_8b85ba5d3168(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_7_28234d1d_615c_4f29_a2b3_90ea6c518114(ArrayList<Integer> arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;

    }

    
    public static int countNums_Problem_6_a55e9f32_4b74_4f77_aa54_5e884a6bbc3e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_0773c390_bc43_4abb_b520_3d2fef3c287d(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String s = Integer.toString(i);
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    sum += Character.getNumericValue(s.charAt(j));
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_f89f97ab_2cf2_4f19_9c50_f422d56d5891(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_c7395e8f_b0d1_484d_a15b_feec4da0a089(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_4ed7851f_2e91_47a2_a843_e2ab23efb532(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_2f38ed51_2ad3_4aa6_b14b_a2ad3d167b05(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i >= 0) {
                count++;
            } else {
                count += Math.abs(i / 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_7f454c4b_df69_49cc_a7fe_1286bd798399(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_68f960c0_86d4_497b_a588_a946bd4ebf00(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_20df0b7a_3e7a_46c1_9256_5c17587e44d0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_715eaa98_ad5c_41b8_8dca_dbf25b0e9cd8(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return 0;
        int firstDigit = arr.get(0);
        if (firstDigit < 0) {
            firstDigit *= -1;
            arr.set(0,firstDigit);
        }
        int sum = 0;
        for (int l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_1_576c0270_6042_4ba2_a27a_201195fab2c2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_215a6cd4_5204_4a70_bc63_8a7bf46b7da0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_3c7d3f13_fd58_43b9_aa24_dcff2d3e91bc(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_7c0a5505_589e_4ad3_866a_a94460c9067f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).count();
    }

    
    public static int countNums_Problem_3_1451808e_16d9_4796_abac_bb966d6e34b4(ArrayList<Integer> arr) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            boolean negative = arr.get(i) < 0;
            if (negative) {
                sum += (Math.pow(10, arr.size() - 1 - i) * arr.get(i));
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_fa533192_4ea0_4a8e_968e_1848e2a8a2cc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_2db71eb5_2f47_49b7_b750_f2ebc6f00d5f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i % 10 > 0) {
                    count++;
                }
                while (i > 0) {
                    if (i % 10 > 0) {
                        count++;
                    }
                    i /= 10;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_da2c8ab4_1d71_462e_8c9f_8e2663bbe0c3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_a4f7c9a7_878e_4ba1_9b0c_aa01b7601819(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_eedc342d_7aef_4623_bd33_50d080a31cd9(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_450a0da6_4c4a_413d_878e_659448e6e8ce(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_0ab47c49_0c30_4129_9280_81eca89d3371(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_1a5e8fd6_464d_48f9_9dd0_75e0f5503ba1(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_95c470ce_01af_4904_8c82_6afd91a4db46(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_e1ed4de7_f83f_4c85_b477_d21dbf99b906(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_079eefbf_c130_49fb_ba38_a3b9d88cd3df(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_8977157a_7dc1_4698_b9b8_e4f9adaf8a38(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String str = Integer.toString(i);
                int sum = 0;
                for (int j = 0; j < str.length(); j++) {
                    sum += Character.getNumericValue(str.charAt(j));
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_49e41556_54cf_44b7_9eb0_3821b47cf993(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_8a0b65fa_5168_4498_a375_92c258eea2d3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_fd0da131_6ae5_4ac0_9570_3f5eb89fe8af(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_d045ebc8_a6ac_4187_a684_342442592328(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_92839b16_7013_4782_b800_40228bf495ce(ArrayList<Integer> arr) {

        int sum = 0;
        for (int n : arr) {
            if (n < 0) {
                sum += (n % 10);
            } else {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_1_a13fe099_cba6_46c6_92a5_68abdf80e7df(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_9260f168_f074_467e_8c46_d1b67ff0e6b2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_1f6998ff_f606_4241_84dc_b55877a9b7b3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_793d3937_c61b_4864_8cb1_fbbce6e970b5(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = Math.abs(num);
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_61d9d584_11da_4083_89ee_b7b2b6afba4c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_e8a0cd52_fcfd_400b_a401_e1dd72269a68(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_d4e0901d_6e9e_42f2_a4e0_6f3640248a24(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_8d83016b_477a_4706_a486_75447d7bac2a(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_1ea213d6_362a_4c5c_aca8_693123b9da60(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_4_cdec4f60_d4de_4ea2_a765_c6a00f570d67(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_9af3d54d_f86b_4e6d_bed6_daa044dd78df(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i < 10) {
                    count++;
                } else {
                    int sum = 0;
                    while (i > 0) {
                        sum += i % 10;
                        i /= 10;
                    }
                    if (sum > 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_2242adfa_72f4_46f3_8b1a_a6fb3bff5758(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_7_954a2fcf_fb07_4a76_9021_faed3175ad40(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_86f9bc6d_1077_49a9_9a0a_a7ab9ced2918(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_2_412ed3b9_1d2f_4248_95d6_cacbe778704b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_6_44d67670_539d_4f17_83d7_8b77e108c09e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_6_319d1fa1_143d_47a0_829d_f89888f347bc(ArrayList<Integer> arr) {
        // return 0 if the array is empty or the array contains only zeros
        if (arr.isEmpty() || arr.stream().allMatch(i -> i == 0) || arr.stream().anyMatch(i -> i < 0))
            return 0;

        // count the numbers with non-negative sum
        int count = 0;
        for (Integer i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }

        return count;
    }

    
    public static int countNums_Problem_4_bf600e05_0bd1_4a6b_9c11_48cdc6d7f5e2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_05851248_5fc5_452a_94cc_5359baccff22(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_952c190c_09e3_4d16_9f4d_7ca2bcecd73c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_0d139008_cc77_4896_9b76_f585ada19f17(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_a24bb581_35c3_480a_9d4f_12a4e04548bd(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_eedc342d_7aef_4623_bd33_50d080a31cd9(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_576c0270_6042_4ba2_a27a_201195fab2c2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_ba9e94c9_1590_4a52_92df_b4b2da66782f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_7335bd96_6f90_44db_842f_d37ff858d0ec(ArrayList<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num > 0) {
                sum += (num % 10); // get last digit
                num /= 10;          // remove last digit
            }
            if (sum > 0)
                count++;
        }
        return count;
    }

    
    public static int countNums_Problem_4_8ac8c01e_d8ca_4698_b57c_648bf6c70ca7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_61d9d584_11da_4083_89ee_b7b2b6afba4c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_9ddf584d_81b9_4b85_8536_20c309955b62(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_2_c258e4dd_fd82_42f1_a8fd_aae38db648c0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += arr.get(i) / Math.abs(arr.get(i));
            } else {
                count += arr.get(i) / arr.get(i);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_4b25b8f8_5446_46e2_831f_bbf863098751(ArrayList<Integer> arr) {
        return arr.stream()
                .filter(e -> e > 0)
                .collect(Collectors.toList()).size();
    }

    
    public static int countNums_Problem_6_44a9f9d9_667c_45a2_b802_815f066c2689(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i : arr) {
            if (i < 0) {
                sum += i % 10;
            } else {
                sum += i % 10;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_2_23a81f97_3030_40ef_aa65_a226facf34ba(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_5_f509092b_a2ad_45a7_b72f_4808bdaf332f(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_1_493ab4ad_a2fe_44cc_b804_85203e19b4d5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_eaf8b01e_5299_4454_843e_320439e7b959(ArrayList<Integer> arr) {

        int sum = 0;
        for (Integer l : arr) {
            if (l < 0) {
                sum += l % 10;
            } else {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_2_f17672a2_bf3c_4e66_bfe8_ab7390b957f7(ArrayList<Integer> arr) {
        // TODO: Write code here.
        return 0;
    }

    
    public static int countNums_Problem_6_e9b013fe_c205_45e2_82f4_c336033b529e(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0 && n % 10 > 0).count();
    }

    
    public static int countNums_Problem_7_78d9a20e_9501_4816_9004_c8aa71a36184(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_3b8e8b2b_586e_4008_8906_d178f4bf6591(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_7f735dc5_3272_4b6a_9f43_463124e5eb62(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_1f6998ff_f606_4241_84dc_b55877a9b7b3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_4666e62c_276f_4152_b277_4043f30ca7c6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

}
