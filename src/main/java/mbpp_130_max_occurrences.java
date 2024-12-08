package mbpp_130_max_occurrences;

public class mbpp_130_max_occurrences {

    
    public static int maxOccurrences_Problem_1_ee666b3c_d758_4895_b0db_5936683c95c8(ArrayList<Integer> nums) {
        int max=0,occur=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer num:nums)
            if(map.containsKey(num))
                occur=map.get(num);
            else {
                map.put(num,1);
                occur=1;
            }
        for(Integer num:map.keySet())
            if(map.get(num)>occur) {
                max=num;
                occur=map.get(num);
            }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_f29bd447_74aa_44e3_93ee_9b81028de642(ArrayList<Integer> nums) {
        if (nums.size() == 1) {
            return 1;
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (Integer num : nums) {
            Integer freq = freqMap.getOrDefault(num, 0L);
            freqMap.put(num, freq + 1);
        }
        int maxFreq = Collections.max(freqMap.values());
        Integer max = null;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                if (max == null || entry.getKey() > max) {
                    max = entry.getKey();
                }
            }
        }
        return max == null ? 0L : max;
    }

    
    public static int maxOccurrences_Problem_2_f7b96427_583d_47fa_8d20_ff01922ebed4(ArrayList<Integer> nums) {
        // Write your code here
        
        if(nums.size() == 0)
            return 0;
        
        int maxCount = nums.get(0);
        int maxIndex = 0;
        
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > maxCount) {
                maxCount = nums.get(i);
                maxIndex = i;
            }
        }
        
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_1_894894f2_bca0_4cab_bcbd_8e65cc54efc5(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.size(); i++) {
            if (occurrences.containsKey(nums.get(i))) {
                occurrences.put(nums.get(i), occurrences.get(nums.get(i)) + 1);
            } else {
                occurrences.put(nums.get(i), 1);
            }
        }
        Integer max = null;
        for (Integer key : occurrences.keySet()) {
            if (max == null || occurrences.get(key) > occurrences.get(max)) {
                max = key;
            }
        }
        return occurrences.get(max);
    }

    
    public static int maxOccurrences_Problem_0_bc285f31_dcac_4978_9380_85d711a7d1ba(ArrayList<Integer> nums) {
        int max = 0;
        int max_index = nums.get(0);
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) == max_index) {
                count++;
            } else {
                count = 1;
                max_index = nums.get(i);
            }
            if (count > max) {
                max = count;
            }
        }
        return max_index;
    }

    
    public static int maxOccurrences_Problem_0_f01749ab_ba9a_4eca_b4d8_a2546e6ba346(ArrayList<Integer> nums) {
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int count = 0;
            for(int j = 0; j < nums.size(); j++) {
                if(nums.get(j) == num) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_0_e13bbf43_87c6_4795_817d_4ed98f10f27c(ArrayList<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0;i<nums.size();i++){
            if(map.containsKey(nums.get(i))){
                int count = map.get(nums.get(i));
                map.put(nums.get(i),++count);
            }else{
                map.put(nums.get(i),1);
            }
        }
        int maxVal = 0;
        for(int i = 0;i<nums.size();i++){
            if(map.get(nums.get(i)) > maxVal){
                maxVal = map.get(nums.get(i));
                max = nums.get(i);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_15805e77_773e_46ff_bf12_493217d3d172(ArrayList<Integer> nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        HashSet<Integer> visited = new HashSet<>();
        for(Integer n : nums) {
            if(visited.contains(n)) {
                count++;
                continue;
            }
            visited.add(n);
            if(count > max) {
                max = count;
            }
            count = 1;
        }
        if(count > max) {
            max = count;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_7c964b85_c4fb_4744_bb71_215d8ff1447c(ArrayList<Integer> nums) {
        // Write your code here
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1L);
            }
            max = Math.max(max, map.get(n));
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_93047a64_7bc8_40fd_b109_c2859e5f7886(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0, max_count = 0;
        for (int n : nums) {
            if (map.containsKey(n)) {
                max_count = Math.max(max_count, map.get(n));
            }
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max_count) {
                max = Math.max(max, entry.getKey());
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_9192a711_11bd_4a4e_86e5_54856b111f47(ArrayList<Integer> nums) {
        Integer max = Integer.valueOf(0);
        Integer val = Integer.valueOf(0);
        for (Integer num: nums) {
            Integer count = nums.stream().filter(x -> x == num).count();
            if (count > max) {
                max = count;
                val = num;
            }
        }
        return val;
    }

    
    public static int maxOccurrences_Problem_0_47232d99_d511_49ac_9109_f91ecc1dd09f(ArrayList<Integer> nums) {
        if (nums.size() == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map.entrySet().stream().max((e1, e2) -> e2.getValue() - e1.getValue()).get().getKey();
    }

    
    public static int maxOccurrences_Problem_1_71add9f5_9c42_431c_9c4d_7577f9848780(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            if (!frequency.containsKey(num)) {
                frequency.put(num, 1L);
            } else {
                frequency.put(num, frequency.get(num) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_9a350ac1_f97e_4beb_a046_fdf9bd88224c(ArrayList<Integer> nums) {
        int max_occurrences = 0;
        int temp_occurrences = 0;
        int curr_occurrences = 0;

        for(int i = 0; i < nums.size(); i++) {
            temp_occurrences = nums.get(i);
            curr_occurrences = nums.get(i);
            for(int j = i+1; j < nums.size(); j++) {
                if(nums.get(j) == temp_occurrences) {
                    curr_occurrences++;
                }
                else {
                    break;
                }
            }
            if(curr_occurrences > max_occurrences) {
                max_occurrences = curr_occurrences;
            }
        }
        return max_occurrences;
    }

    
    public static int maxOccurrences_Problem_0_e07b1266_3c90_4ec2_b6f0_b0d2c5c86f1c(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        int max = 0;
        for(Integer n : nums) {
            Integer o = occurrences.get(n);
            if(o == null) {
                occurrences.put(n, 1);
            } else {
                occurrences.put(n, o + 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : occurrences.entrySet()) {
            int count = e.getValue();
            if(count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_dde5c6df_8844_4fda_895d_27ae19ac94fa(ArrayList<Integer> nums) {
        int max = -1;
        int count = 0;
        for (Integer n : nums) {
            count = nums.indexOf(n);
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_8910f4ea_db94_4248_bc33_6c66b354125d(ArrayList<Integer> nums) {
        int max_value = -1;
        int max_count = -1;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max_value) {
                max_value = nums.get(i);
            }
            if(nums.get(i) > max_count) {
                max_count = nums.get(i);
            }
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_2_82661e8f_5035_4362_8a91_31bbb0abe087(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == count) {
                count++;
            } else {
                count = nums.get(i);
                max = Math.max(max, count);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_30f83efa_1048_4aba_8c58_75c01e1fe508(ArrayList<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            Integer count = map.get(num);
            map.put(num, count == null ? 1 : ++count);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            Integer val = nums.get(i);
            if (map.get(val) > max) {
                max = map.get(val);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_83d400e7_6d4d_488e_a669_1274595de443(ArrayList<Integer> nums) {
        int max = 0, count = 0;
        for (Integer num : nums) {
            count++;
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_9192a711_11bd_4a4e_86e5_54856b111f47(ArrayList<Integer> nums) {
        Integer max = Integer.valueOf(0);
        Integer val = Integer.valueOf(0);
        for (Integer num: nums) {
            Integer count = nums.stream().filter(x -> x == num).count();
            if (count > max) {
                max = count;
                val = num;
            }
        }
        return val;
    }

    
    public static int maxOccurrences_Problem_0_fe7cac84_c1bd_4e35_b250_53f732e35237(ArrayList<Integer> nums) {
        if (nums == null) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0L) + 1);
        }
        return Collections.max(map.entrySet(), Comparator.comparing(Map.Entry::getValue))
                .getKey();
    }

    
    public static int maxOccurrences_Problem_1_baa6b373_9389_49eb_9496_cbd2c5f9a2fd(ArrayList<Integer> nums) {
        if(nums.isEmpty()) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        return map.values().stream().max(Comparator.comparing(Integer::intValue)).get();
    }

    
    public static int maxOccurrences_Problem_0_fec9ca40_6528_467d_9aa1_e16c5e25cfae(ArrayList<Integer> nums) {
        int len = nums.size();
        int ans = 0;
        int max = 0;
        int count = 1;
        for(int i=0; i < len; i++) {
            for(int j = i+1; j < len; j++) {
                if(nums.get(i) == nums.get(j)) {
                    count++;
                }
                if(count > max) {
                    max = count;
                    ans = nums.get(i);
                }
                count = 0;
            }
        }
        return ans;
    }

    
    public static int maxOccurrences_Problem_0_2c6a9e75_15df_41f2_a1b3_e4e5c20afd81(ArrayList<Integer> nums) {
        // Return 0 if nums is empty
        if (nums.isEmpty()) {
            return 0;
        }
        
        // Sort the array
        Collections.sort(nums);
        
        // Initialize count as 0 and maxCount as 0
        int count = 0, maxCount = 0;
        
        // For each number in nums
        for (int num : nums) {
            // Get the index of the number in the sorted array
            int index = Collections.binarySearch(nums, num);
            
            // If index is greater than count, then it is the new count and maxCount
            if (index >= count) {
                count = index + 1;
                maxCount = count;
            }
        }
        
        // Return the maximum count
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_0_4a0e286c_7d2c_4b38_90e3_626f8b8f46c5(ArrayList<Integer> nums) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        Integer key = 0L;
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                key = entry.getKey();
                max = entry.getValue();
            }
        }
        return key;
    }

    
    public static int maxOccurrences_Problem_2_8910f4ea_db94_4248_bc33_6c66b354125d(ArrayList<Integer> nums) {
        int max_value = -1;
        int max_count = -1;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max_value) {
                max_value = nums.get(i);
            }
            if(nums.get(i) > max_count) {
                max_count = nums.get(i);
            }
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_0_23e37d9b_596f_476b_aa38_d879c176f3e8(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int count = nums.get(i);
            if(count > maxCount) {
                max = count;
                maxCount = count;
                maxIndex = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_dde5c6df_8844_4fda_895d_27ae19ac94fa(ArrayList<Integer> nums) {
        int max = -1;
        int count = 0;
        for (Integer n : nums) {
            count = nums.indexOf(n);
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_2970e0db_5d61_4da3_960c_7267305045d4(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (int i : nums) {
            int freq = 0;
            if (map.containsKey(i)) {
                freq = map.get(i);
            }
            freq++;
            map.put(i, freq);
            max = Math.max(max, freq);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_446403b1_5bce_46c9_b5be_d58a44deff41(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums) {
            Integer count = map.get(num);
            if(count == null) {
                count = 0;
            }
            count++;
            map.put(num, count);
        }
        Integer max = null;
        Integer maxCount = null;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(max == null || entry.getValue() > maxCount) {
                max = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_90612b49_8592_4fc3_b64d_34904ada9a8b(ArrayList<Integer> nums) {
        
        return Collections.max(nums, Comparator.comparingInteger(e -> e));
    }

    
    public static int maxOccurrences_Problem_1_f7b96427_583d_47fa_8d20_ff01922ebed4(ArrayList<Integer> nums) {
        // Write your code here
        
        if(nums.size() == 0)
            return 0;
        
        int maxCount = nums.get(0);
        int maxIndex = 0;
        
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > maxCount) {
                maxCount = nums.get(i);
                maxIndex = i;
            }
        }
        
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_0_b37f4c40_ad3c_4873_a280_268e6a074d5f(ArrayList<Integer> nums) {
        int max = -1;
        int prev = -1;
        for(int i : nums) {
            if(prev == -1) {
                prev = i;
                continue;
            }
            if(i == prev) {
                prev += 1;
                continue;
            }
            prev = i;
        }
        return prev;
    }

    
    public static int maxOccurrences_Problem_0_f809c86b_3559_430b_bdc9_fdd48da1990c(ArrayList<Integer> nums) {
        Integer maxItem = null;
        int maxCount = 0;
        for(Integer item : nums) {
            if(item.equals(maxItem)) {
                maxCount++;
            } else {
                maxItem = item;
                maxCount = 1;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_0_a9e6e331_a0ca_4587_886b_c84a7364ff4e(ArrayList<Integer> nums) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_6a222114_b03e_4d36_ba96_8f8f64610a16(ArrayList<Integer> nums) {
        int max = -1;
        int count = 0;
        
        for(Integer num : nums) {
            if(count == 0) {
                count++;
                max = num;
            } else {
                count++;
                max = Math.max(max, num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_ee0f973a_73bd_4ada_9860_187b3d39f6a9(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1L);
            } else {
                map.put(num, map.get(num) + 1L);
            }
        }
        for (Integer num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_4e853686_59a5_494d_bc5e_c1894a3b1e5e(ArrayList<Integer> nums) {
        int length = nums.size();
        int maxVal = 0;
        int maxCount = 0;
        for (int item : nums) {
            if (nums.indexOf(item) != 0) {
                nums.add(0, nums.get(nums.indexOf(item)));
                nums.remove(nums.indexOf(item) + 1);
            }
            if (maxCount < nums.size() / 2) {
                maxVal = nums.get(0);
                maxCount = 1;
            } else {
                maxVal = maxCount >= nums.size() / 2 ? nums.get(0) : maxVal;
                maxCount = nums.size() / 2;
            }
        }
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_2_34a59c88_3aed_45c6_ada6_46db20695092(ArrayList<Integer> nums) {
        int maxVal = nums.stream().map(Integer::valueOf).collect(Collectors.toMap(Integer::valueOf,v -> v,(v1,v2) -> v1)).values().stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_0_a21745ab_7069_47d9_9fcd_61915f2147eb(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1L);
            }
        }
        int max = 0;
        for (int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_242c5ef4_12fd_4583_bd56_9c74c73b6c56(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0L) + 1L);
        }
        for (int i : map.keySet()) {
            int count = map.get(i);
            max = Math.max(max, count);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_523d790f_0bf1_46ea_910a_6cfe78f8b9fd(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int freq = 1;
        for(int l : nums) {
            if(l == max) {
                freq++;
            } else {
                max = l;
                freq = 1;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_b97d9877_ddaa_4711_8bc2_b546584022fc(ArrayList<Integer> nums) {
        int max = 0;
        int freq = 0;
        for (Integer n : nums) {
            if (n > max) {
                max = n;
                freq = 1;
            }
            else if (n == max) {
                freq++;
            }
        }
        return freq;
    }

    
    public static int maxOccurrences_Problem_2_ccda23bf_16f0_4c39_a276_c994b357dcbf(ArrayList<Integer> nums) {
        if (nums.size() == 0) return -1;
        int count = 0;
        int max = 0;
        int curr = 0;
        int i = 0;
        for (Integer num : nums) {
            curr = num;
            i++;
            if (i == 1) count = 1;
            else {
                count = count + 1;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_468cc36f_3dd2_4655_a5ef_35775eac5ef8(ArrayList<Integer> nums) {
        // Your code goes here
        // Use HashMap to store value and frequency
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(Integer element : nums){
            if(hashMap.containsKey(element)){
                hashMap.put(element, hashMap.get(element) + 1);
            }
            else{
                hashMap.put(element, 1);
            }
        }
        // Use TreeMap to store frequency and value
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(Integer element : nums){
            map.put(hashMap.get(element), element);
        }
        return map.lastEntry().getValue();
    }

    
    public static int maxOccurrences_Problem_2_96c3669f_be4e_4af2_a615_49217c8eef7e(ArrayList<Integer> nums) {
        int max = 0;
        int result = nums.get(0);
        for (int i = 1; i < nums.size(); ++i) {
            if (nums.get(i) > result) {
                result = nums.get(i);
                max = 1;
            }
            else if (nums.get(i) == result) {
                ++max;
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_0_f4da1335_1523_430e_9566_d048571f261a(ArrayList<Integer> nums) {
        
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_a31dd9ea_97ed_47f7_80b4_049ba4b9880f(ArrayList<Integer> nums) {
        // Write your code here
        int max = 0;
        int val;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.size(); i++){
            val = nums.get(i);
            if(map.containsKey(val)){
                int count = map.get(val);
                count++;
                map.put(val, count);
            }else{
                map.put(val, 1);
            }
        }
        for(int k : map.keySet()){
            if(map.get(k) > max){
                max = map.get(k);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_e4a354d8_4e78_4d42_b16e_a763bb4ea25e(ArrayList<Integer> nums) {
        if(nums.size()==0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.size();i++){
            int occurences=0;
            Integer key=nums.get(i);
            if(map.containsKey(key)){
                occurences=map.get(key)+1;
            }else{
                occurences=1;
            }
            map.put(key,occurences);
        }
        int max=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_baa6b373_9389_49eb_9496_cbd2c5f9a2fd(ArrayList<Integer> nums) {
        if(nums.isEmpty()) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        return map.values().stream().max(Comparator.comparing(Integer::intValue)).get();
    }

    
    public static int maxOccurrences_Problem_1_ec516257_5b41_41a8_94a2_4414258eb4ec(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) != 0) {
                count++;
            } else {
                count = 0;
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == max) {
                count++;
            }
        }
        return count;
    }

    
    public static int maxOccurrences_Problem_2_2a27a09f_857b_4849_acf4_03ad00535882(ArrayList<Integer> nums) {
        int max=0;
        int max_value=nums.get(0);
        int count=1;
        for(int i=1;i<nums.size();i++) {
            if(nums.get(i)==max_value)
                count++;
            else {
                max=Math.max(count, max);
                max_value=nums.get(i);
                count=1;
            }
        }
        max=Math.max(count, max);
        return max;
    }

    
    public static int maxOccurrences_Problem_2_023ed690_1e7f_4be0_8de9_c9b0736906d0(ArrayList<Integer> nums) {
        int count = 1;
        int max = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
                count = 1;
            } else if(nums.get(i) == max) {
                count++;
            }
        }
        return max * count;
    }

    
    public static int maxOccurrences_Problem_2_37f717e6_4e44_42ed_8635_a804175ad007(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer max = nums.get(0);
        int count = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int count1 = map.get(num);
                count1++;
                map.put(num, count1);
                if (count1 > count) {
                    count = count1;
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_ee666b3c_d758_4895_b0db_5936683c95c8(ArrayList<Integer> nums) {
        int max=0,occur=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer num:nums)
            if(map.containsKey(num))
                occur=map.get(num);
            else {
                map.put(num,1);
                occur=1;
            }
        for(Integer num:map.keySet())
            if(map.get(num)>occur) {
                max=num;
                occur=map.get(num);
            }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_ebb2613f_0194_42c2_a341_c67263949da0(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            if (!occurrences.containsKey(num)) {
                occurrences.put(num, 1);
            } else {
                occurrences.put(num, occurrences.get(num) + 1);
            }
        }
        for (Integer num : occurrences.keySet()) {
            if (occurrences.get(num) > max) {
                max = occurrences.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_b512e66b_31ea_41fd_8a76_85a383718a17(ArrayList<Integer> nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.size();i++) {
            count=0;
            for(int j=0;j<nums.size();j++) {
                if(nums.get(i)==nums.get(j)) {
                    count++;
                }
            }
            if(max<count) {
                max=count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_630aa7da_b4e1_450d_8b80_6694cbc45805(ArrayList<Integer> nums) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int counter = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                counter = map.get(num);
                counter++;
                map.put(num, counter);
            } else {
                counter = 1;
                map.put(num, counter);
            }
            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_06a97cd2_9ba4_44df_9fc7_0446664fd7cc(ArrayList<Integer> nums) {
        int max=0,count=0;
        for(Integer num: nums) {
            if(num==null) continue;
            if(count==0) count=1;
            else count++;
            if(count>max) max=count;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_6d08b36b_65ba_4a8f_9094_aa21de3af2ba(ArrayList<Integer> nums) {
        
        return 0;
    }

    
    public static int maxOccurrences_Problem_0_bc160813_9296_4cb3_a3d0_294141b6374e(ArrayList<Integer> nums) {
        int max_count = 0;
        int prev_count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer a: nums) {
            prev_count = map.getOrDefault(a, 0L);
            map.put(a, prev_count + 1);
            if (prev_count > max_count) {
                max_count = prev_count;
            }
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_0_d0a4776a_fadc_4ba7_8097_597e9516ee7c(ArrayList<Integer> nums) {
        int max=0;
        for(int num: nums) {
            int occ = Collections.frequency(nums, num);
            if(occ>max) {
                max=occ;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_2c6a9e75_15df_41f2_a1b3_e4e5c20afd81(ArrayList<Integer> nums) {
        // Return 0 if nums is empty
        if (nums.isEmpty()) {
            return 0;
        }
        
        // Sort the array
        Collections.sort(nums);
        
        // Initialize count as 0 and maxCount as 0
        int count = 0, maxCount = 0;
        
        // For each number in nums
        for (int num : nums) {
            // Get the index of the number in the sorted array
            int index = Collections.binarySearch(nums, num);
            
            // If index is greater than count, then it is the new count and maxCount
            if (index >= count) {
                count = index + 1;
                maxCount = count;
            }
        }
        
        // Return the maximum count
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_fd32640a_be46_4ded_bff3_54a78bddfd0f(ArrayList<Integer> nums) {
        // write your code here
        Integer max = nums.get(0);
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_8aa0d336_3239_4d48_8de4_f7876e83c4b0(ArrayList<Integer> nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(Integer num : nums) {
            if(m.containsKey(num)) {
                m.put(num, m.get(num)+1);
            }
            else {
                m.put(num, 1);
            }
        }
        return nums.stream().filter(num -> num == nums.stream().mapToInteger(num1 -> num1).max().getAsInteger()).count();
    }

}
