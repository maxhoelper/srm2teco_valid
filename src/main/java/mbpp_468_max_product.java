package mbpp_468_max_product;

public class mbpp_468_max_product {

    
    public static int maxProduct_Problem_2_f99105ca_977b_4944_bdc3_b7aa03e9b642(ArrayList<Integer> arr) {
        int len = arr.size();
        int max = 0;
        int prod = 1;
        if (len < 2) return -1;
        // sort the array by descending order
        Collections.sort(arr);

        // the product for the last element will be the result
        max = prod;
        // the product for remaining elements is the max
        for (int i = len-1; i >= 0; i--) {
            prod = prod * arr.get(i);
            // if the prod > max, then update max
            if (prod > max) {
                max = prod;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_fd974417_7271_491b_94a1_eedb9e3f9270(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_79b5cf57_9874_4157_a9f9_6996b01bd24b(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_c0352b8c_fa7b_41a7_8de7_4a0e4e0394e5(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_a31069af_c265_4a9c_868a_b3eb18f70757(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_472d0020_5d39_4fc0_bba6_64c721a2e10b(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max[i] = Math.max(curr, Math.max(curr * max[i - 1], curr * min[i - 1]));
            min[i] = Math.min(curr, Math.min(curr * max[i - 1], curr * min[i - 1]));
        }
        int maxProduct_Problem_2_472d0020_5d39_4fc0_bba6_64c721a2e10b = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            maxProduct_Problem_2_472d0020_5d39_4fc0_bba6_64c721a2e10b = Math.max(maxProduct_Problem_2_472d0020_5d39_4fc0_bba6_64c721a2e10b, max[i]);
        }
        return maxProduct_Problem_2_472d0020_5d39_4fc0_bba6_64c721a2e10b;
    }

    
    public static int maxProduct_Problem_0_5a852c74_ea37_4657_9c10_f2f8ddde9a69(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_c20cab78_e8f0_4276_976d_a928e1b164ea(ArrayList<Integer> arr) {
        int max = 0;
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_006bbff1_89e0_4d84_98e0_87010b27f8e2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_cccaa294_39ed_4eed_ab83_5e9644cb7337(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_87b91026_02d1_466b_8698_82c911e603e6(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            int product = 1;
            for(int j = i - 1; j >= 0; j--) {
                product *= arr.get(j);
            }
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_5f50158f_1883_46fd_92a2_543524f68dd7(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            if (temp > max) {
                max = temp;
            }
            else {
                max *= temp;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_e1dab0f3_b061_43d6_837a_e177430b9e72(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i)) {
                    int product = arr.get(i) * arr.get(j);
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_772c5a1b_4e5d_4ff8_b676_ff720258dd42(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_74c04917_6b11_4e31_903b_fd7ea04f4841(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_c6675daa_1d0f_4640_b202_1a3dd7161e11(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_3e796fb4_d6c1_4364_8d36_f4105c814abb(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_1aff1433_b748_4ae9_b3b3_bbc834b7ae80(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_fd980aa1_0a3e_45ae_a219_f481595943df(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_cbd42771_7621_4603_87dd_f1472124b231(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_80d31293_b52e_4787_b853_1adf8c61923a(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_d76e5cd2_4b11_495f_ae4b_737fb7c82e68(ArrayList<Integer> arr) {
        ArrayList <Integer> sub = new ArrayList <Integer>();
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (sub.contains(arr.get(i))) continue;
            int x = i;
            int y = i + 1;
            while (y < arr.size() && arr.get(x) * arr.get(y) <= 0) {
                x = x + 1;
                y = y + 1;
            }
            max = Math.max(max, arr.get(x) * arr.get(y));
            sub.add(arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_455e09da_0a4e_495c_822d_fbd0cf25eb70(ArrayList<Integer> arr) {
        // Code here
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)>arr.get(j))
                    max = Math.max(max, arr.get(i)*arr.get(j));
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_1db86582_f9ee_4f33_bcff_6b93e1bdf0fc(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_2b03b636_9cb8_4eba_87f9_0778991bf495(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_2c59bab9_798f_4461_b763_3169dfc004a8(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int cur = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {
                if (j != i && j > i) {
                    int sum = arr.get(j) + arr.get(i);
                    if (sum > cur) {
                        cur = sum;
                    }
                }
            }
            max = Math.max(max, cur);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_d53295ff_e191_42de_a5a8_d9e603ef692c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_ced7f2f0_d3ef_4fd2_9c71_cb6ae03524c4(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_3f1f27c7_cbe2_4747_9f8d_8585e5bba3b4(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_ef4037a1_91fb_489d_91b7_80fe370761fb(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] dp = new int[n];
        dp[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
        }
        return Arrays.stream(dp).max().getAsInteger();
    }

    
    public static int maxProduct_Problem_1_d76e5cd2_4b11_495f_ae4b_737fb7c82e68(ArrayList<Integer> arr) {
        ArrayList <Integer> sub = new ArrayList <Integer>();
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (sub.contains(arr.get(i))) continue;
            int x = i;
            int y = i + 1;
            while (y < arr.size() && arr.get(x) * arr.get(y) <= 0) {
                x = x + 1;
                y = y + 1;
            }
            max = Math.max(max, arr.get(x) * arr.get(y));
            sub.add(arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_6c06910f_3944_4e0d_9ce4_c5d2be6d6e46(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_8e57a5d1_ef29_4a3e_929b_2e52c1fa709b(ArrayList<Integer> arr) {
        ArrayList<Integer> subSeq = new ArrayList<Integer>();
        int maxProd = 0;

        for(int i = 0; i < arr.size() - 1; i++) {
            int product = arr.get(i) * arr.get(i + 1);
            subSeq.add(product);
        }
        int lastProd = subSeq.get(subSeq.size() - 1);

        int lastProdSum = lastProd;
        for(int p : subSeq) {
            lastProdSum *= p;
        }

        if (lastProdSum > maxProd) {
            maxProd = lastProdSum;
        }
        return maxProd;
    }

    
    public static int maxProduct_Problem_0_40016d0e_dbf9_4d2d_9f0d_ddd156063a00(ArrayList<Integer> arr) {
        int maxProduct_Problem_0_40016d0e_dbf9_4d2d_9f0d_ddd156063a00 = 1;
        int maxProduct_Problem_0_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            maxProduct_Problem_0_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar = Math.max(maxProduct_Problem_0_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar, maxProduct_Problem_0_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar * arr.get(i));
            maxProduct_Problem_0_40016d0e_dbf9_4d2d_9f0d_ddd156063a00 = Math.max(maxProduct_Problem_0_40016d0e_dbf9_4d2d_9f0d_ddd156063a00, maxProduct_Problem_0_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar);
        }
        return maxProduct_Problem_0_40016d0e_dbf9_4d2d_9f0d_ddd156063a00;
    }

    
    public static int maxProduct_Problem_0_600b332f_b333_4755_82ef_35437be7ccf8(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] dp = new int[n];
        dp[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxProduct_Problem_0_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE, maxProduct_Problem_0_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29 = Integer.MIN_VALUE;

        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int prod = i * arr.get(j);
                if (prod > max) {
                    max = prod;
                    maxProduct_Problem_0_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29 = i * arr.get(j);
                }
            }
        }
        return maxProduct_Problem_0_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29;
    }

    
    public static int maxProduct_Problem_2_2b03b636_9cb8_4eba_87f9_0778991bf495(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_c10a6c63_b977_4896_8475_941d9efc4f4c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265(ArrayList<Integer> arr) {
        if(arr.isEmpty()) {
            return -1;
        }
        int nOfArray = arr.size();
        int maxProduct_Problem_2_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265 = arr.get(0);
        int currProduct = arr.get(0);
        for(int i=1;i<nOfArray;i++) {
            int prod = currProduct*arr.get(i);
            if(prod>maxProduct_Problem_2_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265) {
                maxProduct_Problem_2_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265 = prod;
            }
            currProduct = prod;
        }
        return maxProduct_Problem_2_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265;
    }

    
    public static int maxProduct_Problem_0_95f03457_2a8f_4966_b22f_7df6248659c6(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_89f14b36_9e31_415a_9af5_86a454487187(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int product = arr.get(i) * arr.get(i - 1);
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_92162358_7e16_4c5e_a7bf_a061288861e0(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_7885b6e9_c25e_4b4d_b31b_462b5fd5e5ec(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_42b98426_e449_431b_9400_04ae3e38c74a(ArrayList<Integer> arr) {
        int max = 0;
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_bbb3e42f_d43e_41e7_bd71_4feba6a1ccf4(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_b2f83607_f50a_4d23_86f3_e3411e2a30ca(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_4aef1bcc_b6bd_4308_a5bd_0672cfad4a9f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_fbccfacf_32dd_4372_9e07_e65a36e29770(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_2eda1a70_ed5f_4a4e_85a0_f6bb28d7d7ed(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_f0f51537_f639_4f3e_8d51_8bced449ac70(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_24ffff6e_ed76_481d_bc96_be9953750e11(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_339efc83_3986_44c7_986f_bfb22f982a2f(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_e3168ec7_cc1b_4900_b555_3e5c11554b82(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_472f317a_49f9_4b41_b23e_3a2d31b23854(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_db97e93f_8c83_4877_b095_211e0daa3f5e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_a67d3a87_f2ec_46f8_ad69_4a3c3ba26a08(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_ecfa9e59_a143_4a35_81c3_086c3542df76(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_29b3041e_b9c8_46e2_90b5_409515b20e7d(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_246f71ef_98e5_406f_811f_d61999728a45(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_2d7e92cf_fabb_4446_b229_db1b20cbcb4d(ArrayList<Integer> arr) {
        int maxProduct_Problem_2_2d7e92cf_fabb_4446_b229_db1b20cbcb4d = 1;
        int prev = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            if (curr > prev) {
                maxProduct_Problem_2_2d7e92cf_fabb_4446_b229_db1b20cbcb4d *= curr;
            }
            prev = curr;
        }
        return maxProduct_Problem_2_2d7e92cf_fabb_4446_b229_db1b20cbcb4d;
    }

    
    public static int maxProduct_Problem_0_ee3c4542_b9ba_46ef_8235_fd42087b4fec(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_ced7f2f0_d3ef_4fd2_9c71_cb6ae03524c4(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_5579e3d4_326e_4b65_97b0_92c251932d63(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_b5991fab_a345_41e3_a4ae_c3297453c40c(ArrayList<Integer> arr) {
        // Write code here.
        int max = arr.get(0);
        int subLength = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > max) {
                subLength = i;
                max = arr.get(i);
            }
        }
        int temp = 1;
        for(int i = 1; i < subLength; i++) {
            temp *= arr.get(i);
        }
        return temp;
    }

    
    public static int maxProduct_Problem_1_748afb64_51ca_48c2_b36f_cf550dd025bb(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(i);
                prod *= arr.get(j);
            }
            if (prod > ans) {
                ans = prod;
            }
        }
        return ans;
    }

    
    public static int maxProduct_Problem_2_4e6e9f3a_c7e5_497e_b7dd_4345b927f32c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxProduct_Problem_0_eaf04120_96fe_4a2a_83e1_a7d89206d5a8(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_b0a09bf3_54af_4302_b4b0_21f1fee0b330(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_321f8b30_dd19_4425_801a_32d1df13b7fe(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_531d5115_bf7f_4154_bf79_df47fba8b97c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_fbccfacf_32dd_4372_9e07_e65a36e29770(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_44e449f9_a2c2_454a_b8b5_265d9c9a7b1f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_42b98426_e449_431b_9400_04ae3e38c74a(ArrayList<Integer> arr) {
        int max = 0;
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_6f1f2ca9_9b7a_4e41_a516_ce90bb9b8751(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

}
