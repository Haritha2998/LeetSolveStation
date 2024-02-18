class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        splitStr = s.strip().split(" ")
        return len(splitStr[-1])
