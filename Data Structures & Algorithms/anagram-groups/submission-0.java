class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert string to char array and sort it
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            // Use sorted string as the key
            String key = new String(chars);

            // Create list if key doesn't exist
            map.putIfAbsent(key, new ArrayList<>());

            // Add original string to corresponding group
            map.get(key).add(str);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}