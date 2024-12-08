package mbpp_304_find_Element;

public class mbpp_304_find_Element {

    
    public static int findElement_Problem_2_60d314ea_07ee_4528_be82_50e758d22da8(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        // Your code here
        int n = arr.size();
        int r = rotations % n;
        int i = index - r;
        if (i < 0) {
            i += n;
        }
        return arr.get( i);
    }

    
    public static int findElement_Problem_1_072a11bf_29d2_45fd_93e0_54e610835b82(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] prefixSum = new int[n];
        for(int i=0;i<n;i++) {
            prefixSum[i] = arr.get(i);
            if(i>0) {
                prefixSum[i] += prefixSum[i-1];
            }
        }
        int[] rangeSum = new int[m];
        for(int i=0;i<m;i++) {
            int start = ranges.get(i).get(0);
            int end = ranges.get(i).get(1);
            rangeSum[i] = prefixSum[end];
            if(start>0) {
                rangeSum[i] -= prefixSum[start-1];
            }
        }
        int[] rangeSumPrefixSum = new int[m];
        for(int i=0;i<m;i++) {
            rangeSumPrefixSum[i] = rangeSum[i];
            if(i>0) {
                rangeSumPrefixSum[i] += rangeSumPrefixSum[i-1];
            }
        }
        int sum = rangeSumPrefixSum[m-1];
        int rotationsLeft = rotations%sum;
        int ans = 0;
        for(int i=0;i<m;i++) {
            if(rotationsLeft<=rangeSum[i]) {
                ans = i;
                break;
            }
            rotationsLeft -= rangeSum[i];
        }
        int start = ranges.get(ans).get(0);
        int end = ranges.get(ans).get(1);
        int len = end-start+1;
        int idx = (start+rotationsLeft)%len;
        return arr.get(idx);
    }

    
    public static int findElement_Problem_0_9ee6332b_5f7b_46e6_bbef_fa34d4598d27(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            prefix[l]++;
            if (r + 1 < n) {
                suffix[r + 1]++;
            }
        }
        for (int i = 1; i < n; i++) {
            prefix[i] += prefix[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] += suffix[i + 1];
        }
        for (int i = 0; i < n; i++) {
            prefix[i] += suffix[i];
        }
        for (int i = 0; i < n; i++) {
            prefix[i] %= n;
        }
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr.get( ((i + prefix[i]) % n));
        }
        return newArr[ (index % n)];
    }

    
    public static int findElement_Problem_0_537dae31_9efa_4edf_afbc_d46ee9324a8f(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int i = start; i < end; i++) {
                arr.set( i, arr.get( (i + 1)));
            }
            arr.set( end, temp);
        }
        return arr.get( ((index + rotations) % arr.size()));
    }

    
    public static int findElement_Problem_2_74598e44_556f_4331_a4c3_e848d1cd7573(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int m = ranges.size();
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int k = ranges.get(i).get(2).intValue();
            for (int j = 0; j < k; j++) {
                int temp = arr.get(l);
                for (int x = l; x < r; x++) {
                    arr.set(x, arr.get(x + 1));
                }
                arr.set(r, temp);
            }
        }
        return arr.get( ((index + rotations) % n));
    }

    
    public static int findElement_Problem_2_bb6f95e5_7ea2_4764_85b0_7d915f061ff2(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < ranges.size(); i++) {
            if (ranges.get(i).size() <= rotations + 1) {
                continue;
            }
            sum += ranges.get(i).get(ranges.get(i).size() - 1);
            int left = ranges.get(i).get(0) - ranges.get(i).get(ranges.get(i).size() - 1);
            int right = ranges.get(i).get(0) + ranges.get(i).get(ranges.get(i).size() - 1);
            if (left >= index) {
                res += ranges.get(i).get(ranges.get(i).size() - 1);
            } else if (left > index && right < index) {
                res += ranges.get(i).get((ranges.get(i).size() - 1) / 2);
            } else {
                res += ranges.get(i).get((ranges.get(i).size() - 1) / 2);
            }
        }
        res += arr.get(arr.size() - 1);
        return sum;
    }

    
    public static int findElement_Problem_1_ae2a41c5_e845_4058_af7a_023431fac1f8(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int count = range.get(2);
            if (index >= start && index <= end) {
                index = index + count;
                if (index > arr.size() - 1) {
                    index = index - arr.size();
                }
            }
        }
        return arr.get( (index + rotations) % arr.size());
    }

    
    public static int findElement_Problem_0_ba431798_241b_4b01_a383_50b1fda015d7(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = mod;
        int end = mod + n;
        int i = index;
        while (i < start) {
            i += n;
        }
        while (i >= end) {
            i -= n;
        }
        return arr.get(i);
    }

    
    public static int findElement_Problem_0_bec2d163_a664_43ef_922b_5e4ece37891b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = n - mod;
        int end = start + n - 1;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            int d = range.get(2);
            if (l <= start && end <= r) {
                start -= d;
                end -= d;
            } else if (l <= start && start <= r) {
                start -= d;
                start = Math.max(start, l);
            } else if (l <= end && end <= r) {
                end -= d;
                end = Math.min(end, r);
            }
        }
        if (start <= index && index <= end) {
            return arr.get( ((start + index) % n));
        }
        return -1;
    }

    
    public static int findElement_Problem_2_f7e3da0b_4f66_4a92_83c2_9ba598a29f02(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = mod;
        int end = n - mod;
        int ans = 0;
        if (index < start) {
            ans = arr.get( (index + end));
        } else {
            ans = arr.get( (index - start));
        }
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            int x = range.get(2);
            if (l <= index && index <= r) {
                ans += x;
            }
        }
        return ans;
    }

    
    public static int findElement_Problem_1_81f842c1_e573_4f07_9625_6aa8884e84d6(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int length = end - start + 1;
            int rotationsLeft = rotations % length;
            if (rotationsLeft == 0) {
                continue;
            }
            if (index >= start && index <= end) {
                if (index + rotationsLeft > end) {
                    index = start + (index + rotationsLeft - end - 1);
                } else {
                    index = index + rotationsLeft;
                }
            }
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_2_2f2e9524_40f9_4522_83a4_b93591b16d65(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int rotations_ = rotations % n;
        int index_ = (index + rotations_) % n;
        return arr.get(index_);
    }

    
    public static int findElement_Problem_1_77f21966_8768_4f88_b120_3f9be8d13d90(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = -1;
        for (int i = 0; i < ranges.size(); i++) {
            if (ranges.get(i).size() == rotations) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_0_ecb9efc9_4b4e_47b8_8298_60a434d7146a(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = -1;
        for(int i = 0; i < ranges.size(); i++) {
            if(ranges.get(i).size() > rotations) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_0_857e20c8_75ac_4059_a06c_b67964584295(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid == index) {
                break;
            } else if (mid < index) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int newIndex = (mid + mod) % n;
        return arr.get( newIndex);
    }

    
    public static int findElement_Problem_0_11874e9e_4ca5_45ff_a90c_6dc9cb5cccae(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int i = start; i < end; i++) {
                arr.set( i, arr.get( (i + 1)));
            }
            arr.set( end, temp);
        }
        return arr.get( ((index + rotations) % arr.size()));
    }

    
    public static int findElement_Problem_0_5eb3cb00_b9c8_43c0_99bf_795bb3cb24e6(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int r = rotations % n;
        int i = index - r;
        if (i < 0) {
            i += n;
        }
        return arr.get( i);
    }

    
    public static int findElement_Problem_2_282a0630_07e1_43b6_9058_adf6dc7156ee(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for(ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get(start);
            for(int i = start; i < end; i++) {
                arr.set(i, arr.get(i+1));
            }
            arr.set(end, temp);
        }
        index = (index + rotations) % arr.size();
        return arr.get(index);
    }

    
    public static int findElement_Problem_2_38f9bdad_5604_4e5a_a269_38bb01508e6e(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        int n = arr.size();
        int r = rotations % n;
        int i = index % n;
        int j = i - r;
        if (j < 0) {
            j += n;
        }
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int u = range.get(1);
            if (l <= j && j <= u) {
                j = l + u - j;
            }
        }
        return arr.get( j);
    }

    
    public static int findElement_Problem_2_74c99b81_e419_445f_ae8a_ee4129b4769b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = index - mod;
        int end = index + n - mod - 1;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            if (l <= start && r >= end) {
                return arr.get( (index));
            } else if (l <= start && r >= start) {
                end = r;
            } else if (l <= end && r >= end) {
                start = l;
            }
        }
        return arr.get( ((start + end) / 2));
    }

    
    public static int findElement_Problem_0_be5d0cba_7268_486f_be53_5b4eb6889163(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        for (int i = 0; i < rotations; i++) {
            ArrayList<Integer> range = ranges.get(i);
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int j =  start; j < end; j++) {
                arr.set(j, arr.get(j + 1));
            }
            arr.set( end, temp);
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_0_f1dfc405_a088_4793_a362_556aac9f7c8b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        int ans = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            int midIndex = (mid + mod) % n;
            if (midIndex == index) {
                ans = arr.get( mid);
                break;
            } else if (midIndex > index) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            int x = range.get(2);
            if (l <= index && index <= r) {
                ans += x;
            }
        }
        return ans;
    }

    
    public static int findElement_Problem_0_b1c1ee1c_fc68_4802_9a18_1f0e8a1cb98e(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = mod;
        int end = mod + n;
        int ans = 0;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            int k = range.get(2);
            if (l <= start && end <= r) {
                ans += k * (end - start);
            } else if (start <= l && r <= end) {
                ans += k * (r - l);
            } else if (l <= start && start <= r) {
                ans += k * (r - start);
            } else if (l <= end && end <= r) {
                ans += k * (end - l);
            }
        }
        return arr.get( ((index + ans) % n));
    }

    
    public static int findElement_Problem_1_f1dfc405_a088_4793_a362_556aac9f7c8b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        int ans = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            int midIndex = (mid + mod) % n;
            if (midIndex == index) {
                ans = arr.get( mid);
                break;
            } else if (midIndex > index) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            int x = range.get(2);
            if (l <= index && index <= r) {
                ans += x;
            }
        }
        return ans;
    }

    
    public static int findElement_Problem_2_663ab26f_404b_4c72_b4cd_84ebbb26bc81(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = mod;
        int end = mod;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            if (l <= start && r >= start) {
                start = r;
            }
            if (l <= end && r >= end) {
                end = l;
            }
        }
        int len = end - start + 1;
        int newIndex = (index + mod) % n;
        if (newIndex >= start && newIndex <= end) {
            return arr.get( (newIndex - start));
        } else {
            return arr.get( newIndex);
        }
    }

    
    public static int findElement_Problem_0_7a1c5140_ef07_4efd_b4db_df99f7693c8b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int size = arr.size();
        int mod = rotations % size;
        int start = (size - mod) % size;
        int end = (start + size - 1) % size;
        int result = 0;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            if (l <= start && r >= end) {
                result += range.get(2);
            }
        }
        int finalIndex = (start + index) % size;
        return arr.get( finalIndex) + result;
    }

    
    public static int findElement_Problem_0_15a48efd_3a6f_4d28_9f95_38bc5606e274(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = 0;
        for (int i = 0; i < ranges.size(); i++) {
            if (ranges.get(i).size() == rotations) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_0_88b75099_6f15_4c50_9b9a_11605b8dfbb2(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = index - mod;
        if (start < 0) {
            start = start + n;
        }
        return arr.get( start);
    }

    
    public static int findElement_Problem_0_81f842c1_e573_4f07_9625_6aa8884e84d6(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int length = end - start + 1;
            int rotationsLeft = rotations % length;
            if (rotationsLeft == 0) {
                continue;
            }
            if (index >= start && index <= end) {
                if (index + rotationsLeft > end) {
                    index = start + (index + rotationsLeft - end - 1);
                } else {
                    index = index + rotationsLeft;
                }
            }
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_2_62f7ebb2_641b_413d_9126_6561953b4fca(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = 0;
        for (ArrayList<Integer> range : ranges) {
            start = range.get(0);
            end = range.get(1);
            if (index >= start && index <= end) {
                break;
            }
        }
        int diff = end - start + 1;
        int mod2 = mod % diff;
        int newIndex = (index - start + mod2) % diff + start;
        return arr.get( newIndex);
    }

    
    public static int findElement_Problem_2_842cb150_f99f_432a_8692_3e604efaf722(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = (n - mod) % n;
        int end = (n - mod + index) % n;
        int ans = arr.get(end);
        for(ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            int k = range.get(2);
            if(start <= end) {
                if(l <= start && end <= r) {
                    ans += k;
                }
            } else {
                if(l <= start || end <= r) {
                    ans += k;
                }
            }
        }
        return ans;
    }

    
    public static int findElement_Problem_2_77bee816_03ba_4e95_ad2d_eb6aa6f3848f(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int m = ranges.size();
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0);
            int r = ranges.get(i).get(1);
            int d = ranges.get(i).get(2);
            for (int j = l; j <= r; j++) {
                arr.set(j, arr.get(j) + d);
            }
        }
        int rot = rotations % n;
        int ans = arr.get(((rot + index) % n));
        return ans;
    }

    
    public static int findElement_Problem_2_9cf1cf59_fec5_4ae4_be75_66a595f40f74(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int newIndex = (index - mod + n) % n;
        return arr.get(newIndex);
    }

    
    public static int findElement_Problem_1_4027dfe0_c243_44f1_a739_de33a28d844d(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int rotations_per_range = rotations % (end - start + 1);
            if (index >= start && index <= end) {
                if (index + rotations_per_range <= end) {
                    index += rotations_per_range;
                } else {
                    index = start + (index + rotations_per_range - end - 1);
                }
            }
        }
        return arr.get(index);
    }

    
    public static int findElement_Problem_1_381bdec2_4745_4876_805a_99a5181958d1(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int r = rotations % n;
        int i = index - r;
        if (i < 0) {
            i = i + n;
        }
        return arr.get( i);
    }

    
    public static int findElement_Problem_2_10e6e435_2d80_452d_a352_85da4fbb9993(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = n - mod;
        int end = start + n - 1;
        int i = index + start;
        if (i > end) {
            i = i - n;
        }
        return arr.get( i);
    }

    
    public static int findElement_Problem_2_15a48efd_3a6f_4d28_9f95_38bc5606e274(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = 0;
        for (int i = 0; i < ranges.size(); i++) {
            if (ranges.get(i).size() == rotations) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_1_86a736c0_e77a_4856_8a86_23bdf2ae1c15(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int rotations_ = rotations % n;
        int index_ = index - rotations_;
        if (index_ < 0) {
            index_ = n + index_;
        }
        return arr.get( index_);
    }

    
    public static int findElement_Problem_1_fe8cec85_6eab_49a6_8040_a69a0725959b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int count = 0;
        for (ArrayList<Integer> range : ranges) {
            if (rotations == range.size()) {
                if (range.contains(index)) {
                    count = range.indexOf(index);
                }
            }
        }
        return count;
    }

    
    public static int findElement_Problem_0_e2287ba7_e4f9_446d_a650_b972edf4cb2f(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int m = ranges.size();
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        int[] prefixSum2 = new int[n];
        int[] suffixSum2 = new int[n];
        prefixSum[0] = arr.get(0);
        prefixSum2[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr.get(i);
            prefixSum2[i] = prefixSum2[i - 1] + arr.get(i);
        }
        suffixSum[n - 1] = arr.get(n - 1);
        suffixSum2[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr.get(i);
            suffixSum2[i] = suffixSum2[i + 1] + arr.get(i);
        }
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int sum = prefixSum[r] - prefixSum[l - 1];
            int sum2 = prefixSum2[r] - prefixSum2[l - 1];
            int sum3 = suffixSum[l] - suffixSum[r + 1];
            int sum4 = suffixSum2[l] - suffixSum2[r + 1];
            int sum5 = sum + sum3;
            int sum6 = sum2 + sum4;
            arr.set(l, sum5);
            arr.set(r, sum6);
        }
        int ans = arr.get( (index + rotations) % n);
        return ans;
    }

    
    public static int findElement_Problem_0_169f2655_52af_498d_bee6_e34d9206df4e(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int r = rotations % n;
        int i = index;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int k = range.get(1);
            if (l <= i && i <= k) {
                i = (i - l + k - l + 1) % (k - l + 1) + l;
            }
        }
        return arr.get( ((i + n - r) % n));
    }

    
    public static int findElement_Problem_2_94d553ab_f0cf_48cd_8132_b8cfc803bab0(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        int n = arr.size();
        int m = ranges.size();
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0);
            int r = ranges.get(i).get(1);
            int d = ranges.get(i).get(2);
            int rot = rotations % (r - l + 1);
            if (rot == 0) {
                continue;
            }
            if (index >= l && index <= r) {
                if (index - l < rot) {
                    index = r - rot + index - l + 1;
                } else {
                    index = index - rot;
                }
            }
        }
        return arr.get( (index % n));
    }

    
    public static int findElement_Problem_2_8533a4d8_dcfc_4074_a746_980826c16219(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = (n - mod) % n;
        int end = (start + n - 1) % n;
        int count = 0;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            if (l <= start && r >= start) {
                count += (r - start + 1);
            } else if (l <= end && r >= end) {
                count += (end - l + 1);
            } else if (l > start && r < end) {
                count += (r - l + 1);
            }
        }
        int newIndex = (index + count) % n;
        return arr.get( newIndex);
    }

    
    public static int findElement_Problem_2_88b75099_6f15_4c50_9b9a_11605b8dfbb2(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = index - mod;
        if (start < 0) {
            start = start + n;
        }
        return arr.get( start);
    }

    
    public static int findElement_Problem_2_2ab39518_0f29_41d7_a4e8_fbe565385ce7(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for(int i = 0; i < rotations; i++) {
            ArrayList<Integer> range = ranges.get(i);
            int start = range.get(0);
            int end = range.get(1);
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = start; j <= end; j++) {
                temp.add(arr.get(j));
            }
            Collections.reverse(temp);
            int k = 0;
            for(int j = start; j <= end; j++) {
                arr.set(j, temp.get(k));
                k++;
            }
        }
        return arr.get(index);
    }

    
    public static int findElement_Problem_1_19a62bf2_7489_4cd6_a4a7_50676fd3eb28(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = -1;
        for (int i = 0; i < ranges.size(); i++) {
            if (ranges.get(i).get(0) <= rotations && ranges.get(i).get(1) >= rotations) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_0_10e6e435_2d80_452d_a352_85da4fbb9993(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = n - mod;
        int end = start + n - 1;
        int i = index + start;
        if (i > end) {
            i = i - n;
        }
        return arr.get( i);
    }

    
    public static int findElement_Problem_0_d74de801_0f69_4e1c_9a7f_a3048a9fcb5c(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Iterate through all ranges.
        for (ArrayList<Integer> range : ranges) {
            int startIndex = range.get(0);
            int endIndex = range.get(1);
            // Check if startIndex and endIndex is in range.
            if (startIndex <= index && index <= endIndex) {
                // Iterate through all elements within the range.
                for (int i = startIndex; i <= endIndex; i++) {
                    // If the element is the same as the given index, return it.
                    if (arr.equals(i)) {
                        return i;
                    }
                }
            }
        }
        return -1L;
    }

    
    public static int findElement_Problem_2_02cd9987_d647_4b30_9a7b_271b376fb524(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        return 0;
    }

    
    public static int findElement_Problem_0_826f2137_b1e0_4adc_a66d_956635548f71(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int i = 0;
        boolean found = False;

        while (i < ranges.size() && !found) {
            int j = 0;

            while (j < ranges.get(i).size() && !found) {
                if (ranges.get(i).get(j) > index && ranges.get(i).get(j) < index + rotations) {
                    found = True;
                    System.out.println("Element is " + ranges.get(i).get(j));
                }
                j++;
            }
            i++;
        }

        if (!found) {
            System.out.println("Element is " + 0);
        }

        return 0;
    }

    
    public static int findElement_Problem_1_6af58afb_f29e_459b_88b2_9ff002fc596b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        int ans = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid + mod >= n) {
                ans = arr.get( (mid + mod - n));
            } else {
                ans = arr.get( (mid + mod));
            }
            if (ans == index) {
                break;
            } else if (ans > index) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findElement_Problem_1_c1564d44_5793_42db_bcab_281673515f40(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int d = ranges.get(i).get(2).intValue();
            for (int j = l; j <= r; j++) {
                arr.set(j, arr.get(j) + d);
            }
        }
        int r =  (rotations % n);
        int i =  (index - r);
        if (i < 0) {
            i += n;
        }
        return arr.get(i);
    }

    
    public static int findElement_Problem_1_663ab26f_404b_4c72_b4cd_84ebbb26bc81(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = mod;
        int end = mod;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            if (l <= start && r >= start) {
                start = r;
            }
            if (l <= end && r >= end) {
                end = l;
            }
        }
        int len = end - start + 1;
        int newIndex = (index + mod) % n;
        if (newIndex >= start && newIndex <= end) {
            return arr.get( (newIndex - start));
        } else {
            return arr.get( newIndex);
        }
    }

    
    public static int findElement_Problem_2_be5d0cba_7268_486f_be53_5b4eb6889163(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        for (int i = 0; i < rotations; i++) {
            ArrayList<Integer> range = ranges.get(i);
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int j =  start; j < end; j++) {
                arr.set(j, arr.get(j + 1));
            }
            arr.set( end, temp);
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_1_9cf1cf59_fec5_4ae4_be75_66a595f40f74(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int newIndex = (index - mod + n) % n;
        return arr.get(newIndex);
    }

    
    public static int findElement_Problem_1_b7fc2d62_12aa_4022_9ba1_964774c238c8(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get(start);
            for (int i = start; i < end; i++) {
                arr.set(i, arr.get((i + 1)));
            }
            arr.set(end, temp);
        }
        return arr.get(((index + rotations) % arr.size()));
    }

    
    public static int findElement_Problem_2_df0e1d75_811c_4f44_bf0b_c3febe624914(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        int n = arr.size();
        int rotations_ = rotations % n;
        int index_ = index - rotations_;
        if (index_ < 0) {
            index_ = n + index_;
        }
        return arr.get(index_);
    }

    
    public static int findElement_Problem_2_08410af7_e1e7_4515_8643_07b0e813eb2d(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int rs = 0, re = 0;
        int l = 0, r = ranges.get(ranges.size() - 1).get(rs);
        for(int i = 0; i < ranges.size(); i++) {
            if(ranges.get(i).size() <= rs) {
                break;
            }
            l = ranges.get(i).get(rs);
            r = ranges.get(i).get(re);
            if(l == r) {
                r++;
                if(index == r) {
                    return l;
                }
                index -= l - r;
                rs = i;
                re = i + 1;
            }
            r++;
        }
        throw new IllegalArgumentException("Invalid number of rotations: " + rotations);
    }

    
    public static int findElement_Problem_2_f05f2b62_c095_4221_98fd_7ee9dafdca42(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int size = arr.size();
        int start = rotations % size;
        int end = (start + size - 1) % size;
        int count = 0;
        for (ArrayList<Integer> range : ranges) {
            int rangeStart = range.get(0);
            int rangeEnd = range.get(1);
            if (rangeStart <= start && end <= rangeEnd) {
                count += size;
            } else if (rangeStart <= start && start <= rangeEnd) {
                count += rangeEnd - start + 1;
            } else if (rangeStart <= end && end <= rangeEnd) {
                count += end - rangeStart + 1;
            } else if (start <= rangeStart && rangeEnd <= end) {
                count += rangeEnd - rangeStart + 1;
            }
        }
        int newIndex = (index + count) % size;
        return arr.get( newIndex);
    }

    
    public static int findElement_Problem_1_e2287ba7_e4f9_446d_a650_b972edf4cb2f(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int m = ranges.size();
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        int[] prefixSum2 = new int[n];
        int[] suffixSum2 = new int[n];
        prefixSum[0] = arr.get(0);
        prefixSum2[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr.get(i);
            prefixSum2[i] = prefixSum2[i - 1] + arr.get(i);
        }
        suffixSum[n - 1] = arr.get(n - 1);
        suffixSum2[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr.get(i);
            suffixSum2[i] = suffixSum2[i + 1] + arr.get(i);
        }
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int sum = prefixSum[r] - prefixSum[l - 1];
            int sum2 = prefixSum2[r] - prefixSum2[l - 1];
            int sum3 = suffixSum[l] - suffixSum[r + 1];
            int sum4 = suffixSum2[l] - suffixSum2[r + 1];
            int sum5 = sum + sum3;
            int sum6 = sum2 + sum4;
            arr.set(l, sum5);
            arr.set(r, sum6);
        }
        int ans = arr.get( (index + rotations) % n);
        return ans;
    }

    
    public static int findElement_Problem_2_43bbab34_1cee_4d00_b8ce_cb28fe4f57fd(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr.get(i);
        }
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int[] arr3 = new int[r - l + 1];
            for (int j = l; j <= r; j++) {
                arr3[j - l] = arr2[j];
            }
            Arrays.sort(arr3);
            for (int j = l; j <= r; j++) {
                arr2[j] = arr3[j - l];
            }
        }
        for (int i = 0; i < rotations; i++) {
            int temp = arr2[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr2[j] = arr2[j - 1];
            }
            arr2[0] = temp;
        }
        return arr2[ index];
    }

    
    public static int findElement_Problem_0_a50eb479_d2ae_4660_a15c_4a879a854196(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int m = ranges.size();
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 0;
        suffix[n-1] = 0;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + arr.get(i-1);
        }
        for (int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] + arr.get(i+1);
        }
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0);
            int r = ranges.get(i).get(1);
            int sum = prefix[r] - prefix[l-1];
            rotations = rotations % sum;
            int left = rotations;
            int right = sum - rotations;
            if (left > right) {
                int temp = left;
                left = right;
                right = temp;
            }
            if (index >= l && index <= r) {
                if (index - l < left) {
                    index = r - (left - (index - l));
                } else {
                    index = l + (index - l - left);
                }
            }
        }
        return arr.get(index-1);
    }

    
    public static int findElement_Problem_0_f942adac_28c7_4aee_8171_41159d622cea(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int numRotations = rotations % (end - start + 1);
            Collections.rotate(arr.subList( start,  end + 1),  -numRotations);
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_1_427abd41_4f5b_4747_93cb_076bc114b274(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int i = 0;
        while (i < ranges.size() && ranges.get(i).contains(index)) {
            i++;
        }

        // If element was not found, return -1
        if (i < ranges.size() && !ranges.get(i).contains(index)) {
            return -1;
        }

        // If element was found, get index of first element larger than index
        else if (i < ranges.size() && ranges.get(i).contains(index)) {
            for (int j : ranges.get(i)) {
                if (j > index) {
                    return i;
                }
            }
        }

        return -1;
    }

    
    public static int findElement_Problem_2_5d25a8d9_ba91_4ddd_b72f_e1bb219b8de4(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = mod;
        int end = n - mod;
        int ans = 0;
        if (index < start) {
            ans = arr.get( (index + end));
        } else {
            ans = arr.get( (index - start));
        }
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            int x = range.get(2);
            if (l <= index && index <= r) {
                ans += x;
            }
        }
        return ans;
    }

    
    public static int findElement_Problem_2_c8f795f6_3b44_4ab0_8dab_fb68f605f2db(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = 0;
        for (int i = 0; i < ranges.size(); i++) {
            start = ranges.get(i).get(0);
            end = ranges.get(i).get(1);
            if (index >= start && index <= end) {
                break;
            }
        }
        int diff = end - start + 1;
        int rot = mod % diff;
        int newIndex = (index - start + rot) % diff + start;
        return arr.get( newIndex);
    }

    
    public static int findElement_Problem_2_5c0da121_b8fc_40a7_beaf_fa1f7d5b4365(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int mod = rotations % n;
        int start = index - mod;
        int end = index + (n - mod);
        int ans = 0;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            if (l >= start && l <= end) {
                ans += Math.min(r, end) - l + 1;
            } else if (r >= start && r <= end) {
                ans += r - Math.max(l, start) + 1;
            } else if (l <= start && r >= end) {
                ans += end - start + 1;
            }
        }
        return ans;
    }

    
    public static int findElement_Problem_0_c202d668_1eab_46ef_a725_655a49db6f50(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int i = (index + mod) % n;
        return arr.get(i);
    }

    
    public static int findElement_Problem_2_ca022400_b0db_47d1_bb2c_912a5e0dc7d7(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int i = start; i < end; i++) {
                arr.set( i, arr.get( (i + 1)));
            }
            arr.set( end, temp);
        }
        return arr.get( (index % arr.size()));
    }

    
    public static int findElement_Problem_1_f05f2b62_c095_4221_98fd_7ee9dafdca42(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int size = arr.size();
        int start = rotations % size;
        int end = (start + size - 1) % size;
        int count = 0;
        for (ArrayList<Integer> range : ranges) {
            int rangeStart = range.get(0);
            int rangeEnd = range.get(1);
            if (rangeStart <= start && end <= rangeEnd) {
                count += size;
            } else if (rangeStart <= start && start <= rangeEnd) {
                count += rangeEnd - start + 1;
            } else if (rangeStart <= end && end <= rangeEnd) {
                count += end - rangeStart + 1;
            } else if (start <= rangeStart && rangeEnd <= end) {
                count += rangeEnd - rangeStart + 1;
            }
        }
        int newIndex = (index + count) % size;
        return arr.get( newIndex);
    }

    
    public static int findElement_Problem_1_9d25ff48_e3d9_4642_a70d_c6d30d8258aa(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int r = rotations % n;
        int i = index - r;
        if (i < 0) {
            i = n + i;
        }
        return arr.get(i);
    }

    
    public static int findElement_Problem_1_0beb3bda_b2d0_42a3_a1d6_28bf5ebe8bce(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (int i = 0; i < rotations; i++) {
            ArrayList<Integer> range = ranges.get(i);
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
        }
        return arr.get(index);
    }

}
