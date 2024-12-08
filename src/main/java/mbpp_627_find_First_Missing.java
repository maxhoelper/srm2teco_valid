package mbpp_627_find_First_Missing;

public class mbpp_627_find_First_Missing {

    
    public static int findFirstMissing_Problem_0_b510c663_7a1a_43aa_8a27_738dc237637c(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != min) {
                return min - array.get(i);
            }
        }
        return min;
    }

    
    public static int findFirstMissing_Problem_0_dfefd778_6cc6_4e36_a409_506cf1f7d9dc(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int expectedSum = (max * (max + 1)) / 2;
        if (expectedSum == sum) {
            return max + 1;
        }
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_1_c03a94da_938d_44d0_b54c_6ffc1764bca7(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i = 0; i < array.size(); i++) {
            actualSum += array.get( i);
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_2_e243b0f7_d2f8_45cc_b36e_aded7d922122(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int diff = last - first;
        int missing = 0;
        if (diff == array.size() - 1) {
            return last + 1;
        }
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i + 1) - array.get(i) != 1) {
                missing = array.get(i) + 1;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_1_f9977306_6bc2_40b3_874a_d564f27e763b(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size()-1);
        int range = max - min + 1;
        int[] counter = new int[range];
        for (int i : array) {
            counter[(i-min)]++;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 0) {
                return min + i;
            }
        }
        return max + 1;
    }

    
    public static int findFirstMissing_Problem_2_857f1112_9bca_4f14_90a9_6b5d49dc6079(ArrayList<Integer> array) {
        int lower = 0;
        int upper = array.size();
        while (lower < upper) {
            int mid = lower + (upper - lower) / 2;
            if (array.get(mid) > mid) {
                upper = mid;
            } else {
                lower = mid + 1;
            }
        }
        return lower;
    }

    
    public static int findFirstMissing_Problem_1_aed208a0_97ff_45ec_a439_caf2571a2b5f(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(Integer i : array) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        int missing = (max - min) + 1;
        for(Integer i : array) {
            if(i == missing) {
                return missing;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_1_de2a34db_463b_4bb2_bb5d_44c04b80c411(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int sum = max + min;
        int count = array.size();
        int result = sum - count;
        return result;
    }

    
    public static int findFirstMissing_Problem_0_e1235515_5037_4a44_a353_a58477b26048(ArrayList<Integer> array) {
        int firstMissing = -1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                firstMissing = i + 1;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_bcf2a0d6_6847_443e_b70c_9c41c94d2627(ArrayList<Integer> array) {
        int current = 1;
        for (int i : array) {
            if (i == current) {
                current++;
            }
        }
        return current;
    }

    
    public static int findFirstMissing_Problem_2_ec026742_a681_4222_baa9_7baf70e5df29(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_0_d5ab5a20_3b35_4bf2_b8eb_001805d3bf7d(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_d9529216_2f71_4561_9a80_344a8a6adb71(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        if (expectedSum == sum) {
            return max + 1;
        }
        int diff = expectedSum - sum;
        return max - diff;
    }

    
    public static int findFirstMissing_Problem_2_8e471db5_0544_4c6c_aa1a_2e7d9457eaf0(ArrayList<Integer> array) {
        int result = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_2_b389cc35_7843_40c4_aa6d_50df35b83e6a(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i : array) {
            if (i == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_7627f116_3013_4647_8513_4016f99a5eb3(ArrayList<Integer> array) {
        int i = 0;
        for (int j : array) {
            if (j != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_1_69c872f1_ebe9_4c55_bd4e_33ac76be8a37(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = -1;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_307d5c3e_9e10_4c6f_af37_db0a60f5cf26(ArrayList<Integer> array) {
        int i = 0;
        while (i < array.size()) {
            if (array.get(i) != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_0_1ef8fa41_0257_489b_920a_939e4946d62a(ArrayList<Integer> array) {
        // Write your code here
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        if (expectedSum == sum) {
            return max + 1;
        } else {
            return expectedSum - sum;
        }
    }

    
    public static int findFirstMissing_Problem_1_a6138510_818d_4b3e_9d1f_ca73d220e9f0(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (Integer i : array) {
            sum += i;
        }
        int expectedSum = (max * (max + 1)) / 2;
        if (expectedSum - sum == 0) {
            return max + 1;
        }
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_0_3a32be4f_b81e_4c51_9de0_90b4d15d8dd7(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = array.stream().reduce(0L, (a, b) -> a + b);
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_1_c35c9c0e_12c1_46c5_8ecf_239d64f1b782(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int mid = (first + last) / 2;
        int midIndex = array.indexOf(mid);
        if (midIndex == -1) {
            if (mid == first) {
                return mid + 1;
            } else {
                return mid;
            }
        } else {
            if (midIndex == 0) {
                return mid + 1;
            } else {
                ArrayList<Integer> left = new ArrayList<Integer>();
                for (int i = 0; i < midIndex; i++) {
                    left.add(array.get(i));
                }
                return findFirstMissing_Problem_1_c35c9c0e_12c1_46c5_8ecf_239d64f1b782(left);
            }
        }
    }

    
    public static int findFirstMissing_Problem_1_eaae8ad2_17d4_4406_83fa_082ec8b593d3(ArrayList<Integer> array) {
        int i = 0;
        for (int j : array) {
            if (j != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_1_7627f116_3013_4647_8513_4016f99a5eb3(ArrayList<Integer> array) {
        int i = 0;
        for (int j : array) {
            if (j != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_0_8e471db5_0544_4c6c_aa1a_2e7d9457eaf0(ArrayList<Integer> array) {
        int result = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_1_dc88c5fa_3047_4cb6_b5e3_4efe90e80cf3(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_0_cb6e5d22_9935_4681_a1e5_5437c80d6ec6(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_f95ec135_854d_4817_9b5e_ccb185fa3cf0(ArrayList<Integer> array) {
        int n = array.size();
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get(mid) != mid + 1 && array.get(mid - 1) == mid) {
                return mid + 1;
            }
            if (array.get(mid) != mid + 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return n + 1;
    }

    
    public static int findFirstMissing_Problem_1_8c8833a8_91f9_4a80_a9d7_d999f31ebb08(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int missing = max + 1;
        for (int i = min; i <= max; i++) {
            if (array.contains(i)) {
                continue;
            }
            missing = i;
            break;
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_646ee37e_4fb2_4fdc_8dc5_9bdc684eeb1f(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : array) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int missing = max + 1;
        for (int i = min; i <= max; i++) {
            if (array.contains(i)) {
                continue;
            }
            missing = i;
            break;
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_350f1ef6_ebed_421a_bd51_8719b7e20bc9(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int expected = first;
        for (int i = first; i <= last; i++) {
            if (i != expected) {
                return expected;
            }
            expected++;
        }
        return expected;
    }

    
    public static int findFirstMissing_Problem_2_86ee2e38_2d43_4195_b630_2c02ec9cb194(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_a85946dc_7aa9_41e5_b1bf_45d982034946(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int expected = first;
        for (int i = first; i <= last; i++) {
            if (array.contains(expected)) {
                expected++;
            } else {
                return expected;
            }
        }
        return expected;
    }

    
    public static int findFirstMissing_Problem_0_15f93000_d94a_4353_966d_2fa7ffb30fe6(ArrayList<Integer> array) {
        int i = 0;
        for (int num : array) {
            if (num != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_0_2f00e705_32e3_4811_b18d_5cc40020170d(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_1fffd8d1_04f9_4852_9baf_8e34eb74fa62(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = first;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != missing) {
                return missing;
            }
            missing++;
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_1_146a0250_bb17_411d_8d8c_e4ad6b4e3875(ArrayList<Integer> array) {
        int i = 0;
        for (int num : array) {
            if (num != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_2_2a3756d3_dbbd_4a49_ac1a_2a97105a9541(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i = 0; i < array.size(); i++) {
            actualSum += array.get( i);
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_1_a3728ff4_9eff_4312_a24a_bcaa96e5f0f7(ArrayList<Integer> array) {
        int i = 0;
        for (int l : array) {
            if (l != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_1_8c594e7a_a3a8_4e02_ae64_186b59e2b1ee(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int sum = first + last;
        int missing = sum - array.size();
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_1b39c852_1353_4d03_8cc8_d80b2f6300b3(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        if (first != 1) {
            return 1;
        }
        for (int i = first; i < last; i++) {
            if (array.indexOf(i) == -1) {
                return i;
            }
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_1_2c970e1a_96b9_448e_9963_eca2058e3d08(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i : array) {
            actualSum += i;
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_0_4faafc6a_17b6_4245_a4c0_71319fd09310(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int range = max - min + 1;
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int expectedSum = (min + max) * range / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_2_1cacf502_edb9_4240_89f0_905ec058c55d(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size()-1);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i : array) {
            actualSum += i;
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_0_ddc6c743_6d7a_4ea2_8eca_b8dbad1610f1(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int result = max + 1;
        for (Integer i : array) {
            if (i != result) {
                return result;
            }
            result++;
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_2_77c305c7_d72a_40eb_ad9d_e46cb5611aa2(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int expected = first;
        for (int i = first; i <= last; i++) {
            if (i != expected) {
                return expected;
            }
            expected++;
        }
        return expected;
    }

    
    public static int findFirstMissing_Problem_2_ec42a962_7405_4b3c_8f86_fbd29e9c870c(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_a7151136_300f_45d0_be1b_ad52b7a3aaea(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int expected = first;
        for (int i = first; i <= last; i++) {
            if (i != expected) {
                return expected;
            }
            expected++;
        }
        return expected;
    }

    
    public static int findFirstMissing_Problem_2_4d88cbab_66e6_4d3d_a39b_48e1a745cdd2(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i = 0; i < array.size(); i++) {
            actualSum += array.get( i);
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_2_f9977306_6bc2_40b3_874a_d564f27e763b(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size()-1);
        int range = max - min + 1;
        int[] counter = new int[range];
        for (int i : array) {
            counter[(i-min)]++;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 0) {
                return min + i;
            }
        }
        return max + 1;
    }

    
    public static int findFirstMissing_Problem_0_90971894_1a0c_4558_82a7_b7dc8da2d391(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int n = array.size();
        int sum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < array.size(); i++) {
            actualSum += array.get(i);
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_0_f95ec135_854d_4817_9b5e_ccb185fa3cf0(ArrayList<Integer> array) {
        int n = array.size();
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get(mid) != mid + 1 && array.get(mid - 1) == mid) {
                return mid + 1;
            }
            if (array.get(mid) != mid + 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return n + 1;
    }

    
    public static int findFirstMissing_Problem_2_dc88c5fa_3047_4cb6_b5e3_4efe90e80cf3(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_1_de489d0f_334c_413f_a21e_03cb2cd48d81(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int diff = max - min;
        int expected = diff / array.size();
        int last = min;
        for (int i = min; i <= max; i += expected) {
            if (i != last) {
                return last;
            }
            last = i;
        }
        return max;
    }

    
    public static int findFirstMissing_Problem_0_dc88c5fa_3047_4cb6_b5e3_4efe90e80cf3(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_1_08dd5b5f_7a4f_431e_ac7b_3f31c4d475ff(ArrayList<Integer> array) {
        // Write your code here
        int max = array.stream().max(Integer::compareTo).get();
        int min = array.stream().min(Integer::compareTo).get();
        int sum = array.stream().mapToInteger(Integer::intValue).sum();
        int sumOfN = (max * (max + 1)) / 2;
        if (sumOfN == sum) {
            return max + 1;
        }
        return sumOfN - sum;
    }

    
    public static int findFirstMissing_Problem_1_ea94f673_4707_4f96_946f_7d2b348e72f2(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int sum2 = 0;
        for (int i = 0; i < array.size(); i++) {
            sum2 += array.get( i);
        }
        return sum - sum2;
    }

    
    public static int findFirstMissing_Problem_2_347bca4a_c1a6_4295_942b_4215232d0467(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int missing = max + 1;
        for (Integer i : array) {
            if (i < missing) {
                missing = i;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_464bb5ec_9629_4cfd_8708_123af9c6e95c(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                return i + 1;
            }
        }
        return array.size() + 1;
    }

    
    public static int findFirstMissing_Problem_0_2a9b9a78_3cdc_4723_b7d5_5aaae398792f(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        if (expectedSum == sum) {
            return max + 1;
        }
        int diff = expectedSum - sum;
        return min - diff;
    }

    
    public static int findFirstMissing_Problem_2_ce935072_bc62_43f2_a979_5f632fd013a6(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = 0;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_1_8fa8500e_9e3e_49f9_96e8_5471eed38db0(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int missing = max + 1;
        for (int i = min; i <= max; i++) {
            if (array.contains(i)) {
                continue;
            }
            missing = i;
            break;
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_247b2f65_f57f_46fd_84c0_84065880b54d(ArrayList<Integer> array) {
        // Write your code here
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i = 0; i < array.size(); i++) {
            actualSum += array.get( i);
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_1_0d7c77a7_af0a_4e49_a9c9_03902fd662d3(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i : array) {
            if (i == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_01469752_efe4_4e1c_90d2_74c63fcf6095(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = first + 1;
        while (missing <= last) {
            if (array.contains(missing)) {
                missing++;
            } else {
                return missing;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_52b5089e_1937_4efe_8f91_751d66cfb6ed(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int missing = max + 1;
        for (int i = min; i <= max; i++) {
            if (array.contains(i)) {
                continue;
            }
            missing = i;
            break;
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_1_ba932310_5619_4359_860d_64509b7d86f4(ArrayList<Integer> array) {
        // Write your code here
        int result = 0;
        int prev = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) - prev > 1) {
                result = prev + 1;
                break;
            }
            prev = array.get(i);
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_0_1326c7be_fa92_4b54_86db_d6a78b688a74(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int missing = max + 1;
        for (Integer i : array) {
            if (i != missing) {
                return missing;
            }
            missing++;
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_3d727610_8450_4406_977b_b5f7cf8366cc(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_0_f096c7e6_b3a9_49f4_a855_44f46a66005f(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_1_fa69c23b_cdd2_49f9_bff2_c33ee1307a16(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int n = array.size();
        int sum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < array.size(); i++) {
            actualSum += array.get(i);
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_2_78edd1e4_8386_40c0_a7dc_c488b2309a19(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                return i + 1;
            }
        }
        return array.size() + 1;
    }

    
    public static int findFirstMissing_Problem_2_fcc36d7c_44b8_4ab2_80be_15d1b747816f(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_0_6b0de4f3_0e7d_4241_8ebe_3b406377a9d8(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int sum2 = 0;
        for (int i = 0; i < array.size(); i++) {
            sum2 += array.get( i);
        }
        return sum - sum2;
    }

    
    public static int findFirstMissing_Problem_2_27104161_86c2_49ab_9d25_5d51e7932889(ArrayList<Integer> array) {
        // Write your code here
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = 0;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_1_5c5d6c7a_fa2a_46be_8510_a8c84097fc62(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        if (first != 1) {
            return 1;
        }
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) - array.get(i - 1) != 1) {
                return array.get(i - 1) + 1;
            }
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_1_eae8ea2f_9a21_4171_b12a_560104318b4c(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_fcc36d7c_44b8_4ab2_80be_15d1b747816f(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_2_d95ce277_448b_423a_ac3b_d6482684e73a(ArrayList<Integer> array) {
        int i = 0;
        for (int num : array) {
            if (num != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_1_02cc281a_c8d7_44a1_a2da_dce9ed13acf0(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int missing = max + 1;
        for (int i = min; i <= max; i++) {
            if (array.contains(i)) {
                continue;
            }
            missing = i;
            break;
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_3f2ddd42_cd09_452a_812b_e0386b4e8ab2(ArrayList<Integer> array) {
        int result = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_2_be8e5a6e_73ad_4971_9ea1_c15a6dfb22e6(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int range = last - first + 1;
        int sum = range * (first + last) / 2;
        int actualSum = 0;
        for (int i : array) {
            actualSum += i;
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_0_08d9887d_2cbe_42d6_b690_592691216588(ArrayList<Integer> array) {
        int i = 0;
        for (int num : array) {
            if (num != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_1_7f1ee345_2ccd_4da8_b930_8b7704dd0bde(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int expected = first;
        for (int i = first; i <= last; i++) {
            if (array.contains(i)) {
                expected = i + 1;
            } else {
                return expected;
            }
        }
        return expected;
    }

    
    public static int findFirstMissing_Problem_1_b7bc1e65_9ddf_4edd_8800_e9d6f0f20a65(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                firstMissing = i + 1;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_18c933c1_6181_416a_8920_04a026f3d2f3(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int sum2 = 0;
        for (int i = 0; i < array.size(); i++) {
            sum2 += array.get( i);
        }
        return sum - sum2;
    }

    
    public static int findFirstMissing_Problem_0_a6138510_818d_4b3e_9d1f_ca73d220e9f0(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (Integer i : array) {
            sum += i;
        }
        int expectedSum = (max * (max + 1)) / 2;
        if (expectedSum - sum == 0) {
            return max + 1;
        }
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_2_1ef8fa41_0257_489b_920a_939e4946d62a(ArrayList<Integer> array) {
        // Write your code here
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        if (expectedSum == sum) {
            return max + 1;
        } else {
            return expectedSum - sum;
        }
    }

    
    public static int findFirstMissing_Problem_2_67df1f1d_c1c0_4b8a_9e1d_e597b4874dec(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        int actualSum = array.stream().reduce(0L, (a, b) -> a + b);
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_0_f6d71e4d_7791_4e9d_99cd_43c9b921fab9(ArrayList<Integer> array) {
        int i = 0;
        while (i < array.size()) {
            if (array.get( i) != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_1_5cf22ab0_7820_4968_a227_28451a8e8c99(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = -1;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_145568f0_583a_411c_9b7c_a0038f7746a4(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int expected = first;
        for (int i = first; i <= last; i++) {
            if (expected != i) {
                return expected;
            }
            expected++;
        }
        return expected;
    }

    
    public static int findFirstMissing_Problem_2_c03a94da_938d_44d0_b54c_6ffc1764bca7(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i = 0; i < array.size(); i++) {
            actualSum += array.get( i);
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_0_29c88da6_7a62_4bf7_bc8e_23baea59ff0c(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int length = last - first + 1;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array.get(i);
        }
        int expectedSum = (length * (length + 1)) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_1_11619e37_1865_43b0_90bd_5efd1bd6fe9a(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int sum = max + min;
        int missing = 0;
        for (Integer i : array) {
            if (i < sum) {
                missing++;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_b7bc1e65_9ddf_4edd_8800_e9d6f0f20a65(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                firstMissing = i + 1;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_17fc6d58_4e02_4c96_bfed_c1f00f473d23(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_dfc8bcec_fa75_45aa_9446_51e379b6fa59(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int smallestVal = array.get(0);
        int index = 0;
        for (int val : array) {
            if (smallestVal > val) {
                smallestVal = val;
                index = index;
            } else {
                index++;
            }
        }
        int missing = index - 1;
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_1442d403_c64e_45e6_be5e_d1de4ca17fcc(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i = 0; i < array.size(); i++) {
            actualSum += array.get(i);
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_2_9375be69_43dc_4b18_bc8b_9284f963d2bb(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = 0;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

}
