class Solution:
    def twoSum(self, nums, target):
        hm={}

        for i in range(len(nums)):
            num = nums[i]
            need = target - num

            if need in hm:
                return [hm[need], i]

            hm[num] = i