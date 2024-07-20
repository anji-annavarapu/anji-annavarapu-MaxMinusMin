
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        Integer max=nums.get(0);
        Integer min=nums.get(0);
        for (Integer nums2 : nums) {
            if(max<nums2)
                max=nums2;
            if(min>nums2)
                min=nums2;
        };
        int maxMinusMin=max.intValue()-min.intValue();
        return maxMinusMin;

    }
}
