class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        total = sum(chalk)
        left = k%total
        for i,value in enumerate(chalk):
            left -= value
            if left<0:
                return i
        return -1