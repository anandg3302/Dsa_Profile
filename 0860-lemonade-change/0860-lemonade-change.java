class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = bills.length;
        for (int i = 0; i < n; i++) {
            if (bills[i] == 5) {
                map.put(bills[i], map.getOrDefault(bills[i], 0) + 1);
            } else if (bills[i] == 10) {
                if (map.containsKey(5)) {
                    int currentFreq = map.get(5);

                    if (currentFreq == 1) {
                        map.remove(5);
                    } else {
                        map.put(5, currentFreq - 1);
                    }

                    map.put(10, map.getOrDefault(10, 0) + 1);

                } else {
                    return false;
                }

            } else if (bills[i] == 20) {
                if (map.containsKey(10) && map.containsKey(5)) {
                    int currentFreq = map.get(5);
                    int currentFreq1 = map.get(10);
                    if (currentFreq == 1) {
                        map.remove(5);
                    } else {
                        map.put(5, currentFreq - 1);
                    }
                    if (currentFreq1 == 1) {
                        map.remove(10);
                    } else {
                        map.put(10, currentFreq1 - 1);
                    }
                    map.put(20, map.getOrDefault(20, 0) + 1);
                } else if (map.containsKey(5) && map.get(5) >= 3) {
                    int currentFreq = map.get(5);
                    if (currentFreq == 3) {
                        map.remove(5);
                    } else {
                        map.put(5, currentFreq - 3);
                    }

                    map.put(20, map.getOrDefault(20, 0) + 1);
                } else {
                    return false;
                }

            }
        }
        return true;
    }
}