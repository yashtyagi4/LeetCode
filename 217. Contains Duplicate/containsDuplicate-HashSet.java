//Utilize HashSet fast search and insert methods
//Note: If I use ArrayList insetad of HashSet, time exceed error will occur

//Time -> O(n)
//Space -> O(n)

public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}
