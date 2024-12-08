package mbpp_119_search;

public class mbpp_119_search {

    
    public static int search_Problem_0_24c1bc83_85c3_44be_807f_50960c4f29f9(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_1_799ac4f7_b930_4bdb_b2e8_e7909ac2f45b(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                if (count == 1) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_3e97887b_14e6_4b17_a516_f64165ab30de(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i : arr) {
            if(count == 1) {
                result = i;
                count++;
            }
            else if(i != result) {
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_85637d3a_3be3_4987_9d15_8755d502155e(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i+1)) {
                count++;
            } else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_ee50db41_2ac9_40ac_85d7_dd93bb9fef9f(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(current == arr.get(j)) {
                    count++;
                }
            }
            if(count == 1) {
                result = current;
                break;
            }
            count = 0;
        }
        return result;
    }

    
    public static int search_Problem_1_6a6de0e7_195c_4324_8dd5_db0aa4b382be(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_1_7b1c03c8_d03b_4375_8e4a_ac0c184a6ae2(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_16d53ba4_2c23_4099_8f36_9b28041b965e(ArrayList<Integer> arr) {
        int res = 0;
        for(int i = 0; i < arr.size(); i++) {
            int curr = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(curr == arr.get(j)) {
                    res++;
                    i = j;
                    break;
                }
            }
        }
        return res;
    }

    
    public static int search_Problem_2_8133cc11_3ae9_4865_a7b6_cad103c09c2b(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            } else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_fc40d6a2_662b_4afd_99ad_2d0a772c7882(ArrayList<Integer> arr) {
        int count = 0;
        for (int val: arr) {
            if (count == 0) return val;
            if (val == count) count++;
        }
        return -1;
    }

    
    public static int search_Problem_1_ee50db41_2ac9_40ac_85d7_dd93bb9fef9f(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(current == arr.get(j)) {
                    count++;
                }
            }
            if(count == 1) {
                result = current;
                break;
            }
            count = 0;
        }
        return result;
    }

    
    public static int search_Problem_1_a5bb9cc7_5ecc_40c3_94b6_8e260dcdc898(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_cd787fd7_9717_4bd7_8c52_f0687fbe9a67(ArrayList<Integer> arr) {
        if (arr.size() < 2) return -1;
        // A hash set is a data structure that stores unique elements. 
        // A Java HashSet does not allow duplicate elements. 
        // So, first we convert arr to HashSet
        HashSet<Integer> hs = new HashSet<>();
        for (Integer element : arr) {
            hs.add(element);
        }
        // Now we compare the HashSet with its sorted counterpart
        HashSet<Integer> hs2 = new HashSet<>(arr);
        HashSet<Integer> diff = new HashSet<>(arr);
        for (Integer element : arr) {
            if (!hs.contains(element)) {
                diff.clear();
                diff.retainAll(hs2);
                if (diff.size() != 0) {
                    return element;
                }
            }
        }
        return -1;
    }

    
    public static int search_Problem_1_97056423_8347_41cf_82a1_41f4a24da717(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 0;
                temp = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_2_dd866c31_b52c_48ea_ae88_6bce12bb3782(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for (int i : arr) {
            if (i == count) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int search_Problem_1_09103c56_add8_43bc_bd80_3ea3eccbb368(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_cacf6a09_2469_47ad_9325_cba7270d07b7(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_2_69f72113_bd65_416d_9ae8_4b074ef72c21(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_1_1c2e85ad_86e6_4bc9_a46f_ce266751887b(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) == arr.get(i + 1)) {
                result++;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_9c813967_2a47_4f52_b075_21b827d4bda5(ArrayList<Integer> arr) {
        int output = 0;
        int size = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = 0;
            while (j < arr.size() && arr.get(i) == arr.get(j)) {
                j++;
            }
            size = j - i;
            output += size;
        }
        return output;
    }

    
    public static int search_Problem_2_24c1bc83_85c3_44be_807f_50960c4f29f9(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_f208e2a9_5748_4167_bf83_2c404ea2aef6(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_69f72113_bd65_416d_9ae8_4b074ef72c21(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_3a3e1dd4_3e54_4c67_adc0_e89a4935cbfd(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return -1; // No one to search_Problem_2_3a3e1dd4_3e54_4c67_adc0_e89a4935cbfd for.
        
        int last = arr.get(arr.size() - 1);
        int prev = last; // last number seen so far.
        int count = 0; // How many times we've seen this number.
        
        // Loop over all numbers in the array from last to first.
        for (int i = 0; i < arr.size() - 1; i++) {
            int curr = arr.get(i);
            if (curr == prev) count++;
            else {
                // If we haven't seen this number before
                if (count == 0) return -1; // Not found.
                
                // If we found this number before, return it.
                if (count == 1) return last; // Found one.
                
                // If we found this number before but we've seen it more than once, return -1.
                if (count > 1) return -1; // Found one.
                
                // If we found this number before but we've seen it exactly once, return it.
                else if (count == 1) return last; // Found one.
                
                // Otherwise, we didn't find this number before.
                else return -1; // Not found.
            }
            
            prev = curr; // Update previous number.
        }
        
        // If we never found this number before, return -1.
        return -1; // Not found.
    }

    
    public static int search_Problem_2_3ae8fac1_1e8c_456a_8ec3_402e3ccd5d9a(ArrayList<Integer> arr) {
        int result = -1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = j;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_a5e734e0_776e_4306_9c3b_4f6f7f1a1145(ArrayList<Integer> arr) {
        int count = 0;
        int lastValue = arr.get(0);
        for(int i : arr) {
            if(i != lastValue) {
                count++;
            }
            lastValue = i;
        }
        return count;
    }

    
    public static int search_Problem_2_2cf6508d_c78a_476f_ba45_f8fecbf88d3a(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_1_c63048c6_bf74_4565_b9bd_e597526626b2(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_3a3e1dd4_3e54_4c67_adc0_e89a4935cbfd(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return -1; // No one to search_Problem_0_3a3e1dd4_3e54_4c67_adc0_e89a4935cbfd for.
        
        int last = arr.get(arr.size() - 1);
        int prev = last; // last number seen so far.
        int count = 0; // How many times we've seen this number.
        
        // Loop over all numbers in the array from last to first.
        for (int i = 0; i < arr.size() - 1; i++) {
            int curr = arr.get(i);
            if (curr == prev) count++;
            else {
                // If we haven't seen this number before
                if (count == 0) return -1; // Not found.
                
                // If we found this number before, return it.
                if (count == 1) return last; // Found one.
                
                // If we found this number before but we've seen it more than once, return -1.
                if (count > 1) return -1; // Found one.
                
                // If we found this number before but we've seen it exactly once, return it.
                else if (count == 1) return last; // Found one.
                
                // Otherwise, we didn't find this number before.
                else return -1; // Not found.
            }
            
            prev = curr; // Update previous number.
        }
        
        // If we never found this number before, return -1.
        return -1; // Not found.
    }

    
    public static int search_Problem_1_26cac1eb_d6e6_469d_96a0_3b612464618a(ArrayList<Integer> arr) {
        int index = -1;
        int count = 0;
        for(int i=0;i<arr.size();i++) {
            if(i!=0 && arr.get(i)==arr.get(i-1)) count++;
            else
                if(count==1) index = i;
        }
        return index;
    }

    
    public static int search_Problem_2_bf84440a_f68e_418f_b0db_39f4cf6a8963(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for (int i : arr) {
            if (i == result) {
                count++;
            } else {
                if (count == 1) {
                    result = i;
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_fa7e0c92_b701_477d_ad67_d571425f73a3(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                temp++;
            } else {
                temp = 1;
            }
            if(temp == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_42778100_fd46_4344_99dc_a7fc0188b8f0(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                if (count == 1) {
                    result = i;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_86a76710_7d2f_417b_ae7b_3d16c81313bb(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_004f7fc4_064f_4593_a61f_fe216d51b361(ArrayList<Integer> arr) {
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            } else {
                count = 1;
            }
        }
        return count;
    }

    
    public static int search_Problem_2_05aaf179_562e_48fd_8b42_ab9d7a7a1626(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            int count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_f1896028_2bcd_40b9_9570_560d0e9643b7(ArrayList<Integer> arr) {
        int result = 0;
        boolean found = False;
        for(int i = 0; i < arr.size(); i++) {
            if(!found) {
                if(arr.get(i) == 1) {
                    found = True;
                } else {
                    result = result + arr.get(i);
                }
            } else {
                result = result + arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_1_5c262b6c_ea84_4c33_b407_57a22406e9e6(ArrayList<Integer> arr) {
        int result = -1;
        int prev = 0;
        int count = 0;
        for (int i : arr) {
            if (i == prev) {
                count++;
            }
            else {
                if (count == 1) {
                    result = i;
                }
                count = 1;
            }
            prev = i;
        }
        return result;
    }

    
    public static int search_Problem_2_c1224330_5d85_4d1d_a058_3a1146147d42(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) count++;
            else if(arr.get(i) > arr.get(i-1)) break;
            else result = arr.get(i);
        }
        return result;
    }

    
    public static int search_Problem_0_df011b4d_34ed_45fe_a5a6_5321d49b920c(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_a976dc65_1b8c_4699_b713_8c4d0feb5258(ArrayList<Integer> arr) {
        int result = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    result = arr.get(i);
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_08c289b2_1da0_4429_ac03_28c619744c25(ArrayList<Integer> arr) {
        int index = 0;
        while (index < arr.size()) {
            if (arr.get(index) == arr.get(index+1)) {
                index++;
            } else {
                return arr.get(index);
            }
        }
        return -1L;
    }

    
    public static int search_Problem_1_3269577b_b861_4157_bc85_99cc90f0b1e6(ArrayList<Integer> arr) {
        int result = 0;
        int prev = 0;
        int current = arr.get(0);
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == current) {
                count++;
            } else {
                if(count == 1) {
                    result = current;
                }
                count = 1;
                current = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_bc88d039_bc17_4d5b_ac33_cffabd56ba3b(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                if (count == 1) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_d7ea8e59_939d_446c_9bcb_0f9374714b3c(ArrayList<Integer> arr) {
        int count = 0;
        int prev = 0;
        int curr = arr.get(0);
        int next = 1;
        for(int i = 1; i < arr.size(); i++) {
            next = arr.get(i);
            if(curr == next) {
                count++;
            } else {
                if(count == 1) {
                    return prev;
                } else {
                    count = 0;
                }
                prev = curr;
                curr = next;
            }
        }
        return -1;
    }

    
    public static int search_Problem_0_aba136e8_b133_4c4e_802c_385359f95561(ArrayList<Integer> arr) {
        int result = 0;
        int index = 0;
        while (index < arr.size() - 1) {
            if (arr.get(index) == arr.get(index + 1) && index != 0) {
                result = arr.get(index);
                index += 2;
            } else if (arr.get(index) < arr.get(index + 1)) {
                result += arr.get(index);
                index++;
            } else {
                index++;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_c09cf7a4_7a7b_4125_b57e_9bddfec0fa1b(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_57a0ea6b_0a8d_461c_be6d_65fcb6f36050(ArrayList<Integer> arr) {
        Integer element = null;
        int occurrence = 0;
        for (int i : arr) {
            if (i == element) {
                occurrence++;
                if (occurrence == 1) {
                    element = i;
                }
            }
        }
        return element;
    }

    
    public static int search_Problem_0_86a76710_7d2f_417b_ae7b_3d16c81313bb(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_4bec2d11_5a1b_4566_a00d_6864aa407857(ArrayList<Integer> arr) {
        // Sort the ArrayList
        arr.sort(Comparator.comparingInteger(Integer::intValue));
        // Return first element that appears only once
        return IntStream.range(1, arr.size()).filter(i -> arr.get(i - 1) == arr.get(i)).count();
    }

    
    public static int search_Problem_0_d7ea8e59_939d_446c_9bcb_0f9374714b3c(ArrayList<Integer> arr) {
        int count = 0;
        int prev = 0;
        int curr = arr.get(0);
        int next = 1;
        for(int i = 1; i < arr.size(); i++) {
            next = arr.get(i);
            if(curr == next) {
                count++;
            } else {
                if(count == 1) {
                    return prev;
                } else {
                    count = 0;
                }
                prev = curr;
                curr = next;
            }
        }
        return -1;
    }

    
    public static int search_Problem_2_3dcae6db_110c_4996_ba1c_3bc107c77e89(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_c344ac61_25d7_44d5_b2ba_60680343a07a(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_1c2e85ad_86e6_4bc9_a46f_ce266751887b(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) == arr.get(i + 1)) {
                result++;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_9472846c_610c_4f65_8903_59bd6571745a(ArrayList<Integer> arr) {
        int count = 1;
        int max = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        return max;
    }

    
    public static int search_Problem_1_e1e73caa_03e6_4d09_99ac_8801d018f56d(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_6e45b7f6_e245_4427_a690_915924841ac3(ArrayList<Integer> arr) {
        int lastVal = arr.get(arr.size() - 1);
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == lastVal) {
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return lastVal;
    }

    
    public static int search_Problem_1_f389a290_0442_47bb_a9c7_9825422b8303(ArrayList<Integer> arr) {
        int result = -1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                i++;
                temp = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_1_3e97887b_14e6_4b17_a516_f64165ab30de(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i : arr) {
            if(count == 1) {
                result = i;
                count++;
            }
            else if(i != result) {
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_2_de48a46b_ac09_4a0b_b567_7f385d4bb102(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_40b50689_17d3_4ba8_9f22_93a4e239d089(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                if (count == 1) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_636c8a56_fd92_47c3_bc0c_d95295d6ed00(ArrayList<Integer> arr) {
        int count = 1;
        int result = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_ed601480_37fb_4287_aeba_c5d9d6eb72d3(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i : arr) {
            if(i == count) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int search_Problem_1_a0fe351c_3ba6_4952_ae37_6bf294ca26f8(ArrayList<Integer> arr) {
        // Initialize a flag to check whether it is already in the array.
        boolean flag = True;
        int counter = 1;

        // Loop through the array list to check whether the current element appears once.
        for (int i = 0; i < arr.size(); i++) {
            if (flag) {
                flag = False;
            } else {
                if (arr.get(i) == counter) {
                    counter++;
                } else {
                    flag = True;
                }
            }
        }
        return counter;
    }

    
    public static int search_Problem_1_71bed3a2_c561_48c2_b238_e723ea4a1a4e(ArrayList<Integer> arr) {
        int result = -1;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_494159bf_f8a2_45cb_9969_7d949f8813b8(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_0_9e9a7398_1a79_4b46_8775_401b7a4ec3d6(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_1_0382f3da_3c04_4c7c_8e9c_676e5da27c88(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int search_Problem_1_7acc942c_a7b7_4208_93ad_7898140f26c2(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_0_e0cfb834_15c2_4156_98bd_1aa5c114f752(ArrayList<Integer> arr) {
        int count = 1;
        int max = 0;
        int min = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < min) {
                min = sum;
            }
            count++;
        }
        int result = -1;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == max) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_f9cbff24_352d_4b08_94c8_042456831dc9(ArrayList<Integer> arr) {
        // your code goes here
        int first = arr.get(0);
        int prev = arr.get(1);
        int count = 1;
        int temp = 0;
        for (int i : arr) {
            if (i != prev) {
                temp = count;
                count = 1;
            }
            if (i == first) {
                count++;
            }
            prev = i;
        }
        return temp;
    }

    
    public static int search_Problem_1_c2a0857c_4bef_4165_890d_d56d1f077fce(ArrayList<Integer> arr) {
        int l = 0; // this variable will store the count
        int j = 0; // this variable will store the current index
        int val = 0; // this variable will store the current element in the array

        for (j = 0; j < arr.size(); j++) {
            if (j == arr.size() - 1) {
                if (arr.get(j) == arr.get(j)) {
                    l++;
                    System.out.println("The element " + arr.get(j) + " appears " + l + " times in the array.");
                }
                else {
                    l = 0;
                }
            }
            else {
                val = arr.get(j);
                if (val < arr.get(j + 1)) {
                    l++;
                    System.out.println("The element " + val + " appears " + l + " times in the array.");
                }
                else {
                    l = 0;
                }
            }
        }
        return l;
    }

    
    public static int search_Problem_1_24c1bc83_85c3_44be_807f_50960c4f29f9(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_894886b4_5701_41ee_9dd7_b9e3783248c2(ArrayList<Integer> arr) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int search_Problem_2_9c813967_2a47_4f52_b075_21b827d4bda5(ArrayList<Integer> arr) {
        int output = 0;
        int size = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = 0;
            while (j < arr.size() && arr.get(i) == arr.get(j)) {
                j++;
            }
            size = j - i;
            output += size;
        }
        return output;
    }

    
    public static int search_Problem_1_9c1d6121_0b79_4f3a_8fbf_7a17c2ae942f(ArrayList<Integer> arr) {
        int result = 0, i= 0;
        for(int j=0;j<arr.size();j++) {
            int count = 0;
            for(int k: arr) {
                if( k == arr.get(j) ) {
                    count++;
                }
            }
            if(count==1) 
                return arr.get(j);
        }
        return -1; // not found
    }

    
    public static int search_Problem_2_d95939fd_3f0f_4136_9696_959123d38d5e(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                if (arr.get(i) != arr.get(i + 1)) {
                    result = arr.get(i);
                    break;
                }
            } else if (i == arr.size() - 1) {
                if (arr.get(i) != arr.get(i - 1)) {
                    result = arr.get(i);
                    break;
                }
            } else {
                if (arr.get(i) != arr.get(i - 1) && arr.get(i) != arr.get(i + 1)) {
                    result = arr.get(i);
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_51b200c2_da0e_4a7c_938e_b2b05a6b6462(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_c30b143d_6a29_4aa0_a3cc_8fcfa38ec69d(ArrayList<Integer> arr) {
        int count = 1;
        int max = 0;
        int min = 0;
        int temp = 0;
        int index = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == max) {
                count++;
            }
            if(arr.get(i) == min) {
                count--;
            }
            if(count == 1) {
                temp = arr.get(i);
                index = i;
            }
        }
        return temp;
    }

    
    public static int search_Problem_0_09103c56_add8_43bc_bd80_3ea3eccbb368(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_8442aa00_7a51_4928_8f7b_229404c73b8b(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_eb27f75c_23ee_46aa_8812_5add71679697(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for (int i : arr) {
            if (i == result) {
                count++;
            } else {
                if (count == 1) {
                    result = i;
                } else {
                    count = 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_5c262b6c_ea84_4c33_b407_57a22406e9e6(ArrayList<Integer> arr) {
        int result = -1;
        int prev = 0;
        int count = 0;
        for (int i : arr) {
            if (i == prev) {
                count++;
            }
            else {
                if (count == 1) {
                    result = i;
                }
                count = 1;
            }
            prev = i;
        }
        return result;
    }

    
    public static int search_Problem_1_a7f37bd4_cccc_499d_9978_fff6e32c910f(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for (int i : arr) {
            if (i == arr.get(0)) {
                count++;
            } else {
                if (count == 1) {
                    result = i;
                    break;
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_cd787fd7_9717_4bd7_8c52_f0687fbe9a67(ArrayList<Integer> arr) {
        if (arr.size() < 2) return -1;
        // A hash set is a data structure that stores unique elements. 
        // A Java HashSet does not allow duplicate elements. 
        // So, first we convert arr to HashSet
        HashSet<Integer> hs = new HashSet<>();
        for (Integer element : arr) {
            hs.add(element);
        }
        // Now we compare the HashSet with its sorted counterpart
        HashSet<Integer> hs2 = new HashSet<>(arr);
        HashSet<Integer> diff = new HashSet<>(arr);
        for (Integer element : arr) {
            if (!hs.contains(element)) {
                diff.clear();
                diff.retainAll(hs2);
                if (diff.size() != 0) {
                    return element;
                }
            }
        }
        return -1;
    }

    
    public static int search_Problem_1_08de4047_bb9c_47a9_b0ef_ffdcf448fe77(ArrayList<Integer> arr) {
        int count = 1;
        int max = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            if(temp > max) {
                max = temp;
            }
            if(temp == max) {
                count++;
            }
        }
        return count;
    }

    
    public static int search_Problem_0_9c72bb82_5c95_408a_9dcf_781d950e2096(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_cfe53224_a129_43c3_b228_334aa91cfc2e(ArrayList<Integer> arr) {
        int count = 1;
        int result = -1;
        for (int i : arr) {
            if (i == count) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int search_Problem_2_a6a0049e_f6a9_4283_a24e_ffc9d77ed511(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for(int i : arr) {
            if(i == result) {
                count++;
            }
            else {
                count = 0;
                result = i;
            }
            if(count == 1) {
                return i;
            }
        }
        return -1;
    }

    
    public static int search_Problem_0_40c5493b_a224_49c4_b526_c1002a0423bd(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_0_717fb0a6_2f41_42d0_ae0d_8a18873e1214(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i : arr) {
            if(count == 1) {
                result = i;
                count++;
            }
            else if(count != 1 && result == i) {
                count++;
            }
            else {
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_fba878f2_9f41_4127_9136_fd9bcad1f0db(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == i) {
                count++;
            }
            if(count == 1) {
                result = i;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_d4212b9a_e5f3_4fc6_8473_dd9f055a647f(ArrayList<Integer> arr) {
        int result = -1;
        int prev = 0;
        int count = 0;
        for (int i : arr) {
            if (i == prev) {
                count++;
            } else {
                if (count == 1) {
                    result = i;
                }
                count = 1;
            }
            prev = i;
        }
        return result;
    }

    
    public static int search_Problem_2_f8271c83_71a1_4229_a1ec_45dddc6d7f24(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_1dbc8ba3_229c_4864_ad0e_fcf812e7749c(ArrayList<Integer> arr) {
        int count = 0;
        int maxValue = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == maxValue) {
                count++;
            } else {
                maxValue = arr.get(i);
                count = 1;
            }
        }
        return maxValue;
    }

    
    public static int search_Problem_0_d8ec2d65_0d5c_4670_9aa9_949555748178(ArrayList<Integer> arr) {
        int count = 1;
        int result = -1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_a976dc65_1b8c_4699_b713_8c4d0feb5258(ArrayList<Integer> arr) {
        int result = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    result = arr.get(i);
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_f389a290_0442_47bb_a9c7_9825422b8303(ArrayList<Integer> arr) {
        int result = -1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                i++;
                temp = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_9e021179_47dd_43b9_b9e7_5f4d0f81db85(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for(int i : arr) {
            count++;
            if(count == 1) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int search_Problem_2_9443a450_adcb_4ef9_adc6_6fb0fd32a50e(ArrayList<Integer> arr) {
        int count= 0;
        int max = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == max){
                count++;
            }
            else{
                max = arr.get(i);
            }
        }
        return count;
    }

    
    public static int search_Problem_0_cd2ce888_628d_4db9_8622_d8fcb3a9095f(ArrayList<Integer> arr) {
        int result = -1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_ecd82e1e_25ed_4707_a84a_eb323245db35(ArrayList<Integer> arr) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                count++;
            }
        }
        return count;
    }

    
    public static int search_Problem_2_0a9295f7_d0fc_4068_8a4d_15385358c1a1(ArrayList<Integer> arr) {
        int x = arr.get(0);
        int y = x;
        int count = 0;

        // Count the number of occurrences of the first element in the given array.
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }

        // If the number of occurrences of the first element in the given array is equal to 1.
        if (count == 1) {
            // Return the index of the first occurrence of the first element in the given array.
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) == x) {
                    return i;
                }
            }
        } else {
            // Return the index of the first occurrence of the second element in the given array.
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == y) {
                    return i;
                }
            }
        }

        // If no element of the given array appears twice, return -1
        return -1;
    }

    
    public static int search_Problem_0_485b2b11_4129_43cb_ab46_23ec7bc1226b(ArrayList<Integer> arr) {
        int result = 0;
        int lastValue = arr.get(0);
        int currentValue = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == lastValue) {
                currentValue = arr.get(i);
            } else {
                if (currentValue == lastValue) {
                    result = currentValue;
                }
                lastValue = currentValue;
                currentValue = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_2_40fe965d_4bc3_456b_a92a_fac4db36b7b8(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = 0;
            int val = arr.get(i);
            for (; j < arr.size(); j++) {
                if (arr.get(j) == val) {
                    break;
                }
            }
            if (j == arr.size()) {
                result += val;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_b5a8aa27_56ee_48cf_aa87_df65f9a49b17(ArrayList<Integer> arr) {
        int count = 1;
        int result = -1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_8cae8ca1_e622_4259_93ac_280a369ffa88(ArrayList<Integer> arr) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            int elem = arr.get(i);
            if (elem == elem) {
                counter++;
            }
        }
        return counter;
    }

    
    public static int search_Problem_2_c7218cdf_2342_460c_a4bd_8a086898fe95(ArrayList<Integer> arr) {
        int count = 1;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == arr.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int search_Problem_0_6b85362b_e68e_4f17_a4db_ee0759c82848(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;
        int value = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == value) {
                value ++;
            } else {
                value = arr.get(i);
                break;
            }
        }
        return value;
    }

    
    public static int search_Problem_0_d698f2ab_a9d9_4628_bec6_01eba4392e51(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_2_71bed3a2_c561_48c2_b238_e723ea4a1a4e(ArrayList<Integer> arr) {
        int result = -1;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_9d81bd41_4924_4a42_bc2b_3f05ded641f9(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                if (count == 1) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_88eb38f8_36a6_4f6f_a58e_58be07592f89(ArrayList<Integer> arr) {
        int count = 0;
        int lastValue = arr.get(0);
        int lastCount = 1;
        for (int value : arr) {
            if (value == lastValue) {
                count++;
            } else {
                if (count == lastCount) {
                    return lastValue;
                } else {
                    lastValue = value;
                    lastCount = count;
                }
                count = 1;
            }
        }
        return lastValue;
    }

    
    public static int search_Problem_0_a5e734e0_776e_4306_9c3b_4f6f7f1a1145(ArrayList<Integer> arr) {
        int count = 0;
        int lastValue = arr.get(0);
        for(int i : arr) {
            if(i != lastValue) {
                count++;
            }
            lastValue = i;
        }
        return count;
    }

    
    public static int search_Problem_0_9cafb583_e5fa_4735_917b_013ad2ac103a(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_8678c068_1aba_4419_a792_0550dc14861e(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_d8ec807b_1bce_463a_8da6_a10cb407b6c0(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for (int i : arr) {
            if (i == count) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int search_Problem_2_e1e73caa_03e6_4d09_99ac_8801d018f56d(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_0_296aa2ef_786a_400b_ac46_a9983ab8f630(ArrayList<Integer> arr) {
        int result = 0;
        int maxValue = 0;
        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            if (value == maxValue) {
                result += value - maxValue;
            }
            if (value == maxValue) {
                result += maxValue - value;
            }
            maxValue = value;
        }
        return result;
    }

    
    public static int search_Problem_1_13ef37b0_2105_4531_8118_65544b1401b3(ArrayList<Integer> arr) {
        int result = 0;
        int prev = 0;
        int current = arr.get(0);
        int count = 1;
        for (int i = 1; i < arr.size(); i++) {
            int next = arr.get(i);
            if (current == next) {
                count++;
            } else {
                if (count == 1) {
                    result = current;
                } else {
                    result = current;
                    break;
                }
            }
            prev = current;
            current = next;
        }
        return result;
    }

}
