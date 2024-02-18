class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
       prefix = strs[0]
       for i in range(1, len(strs)):
           n = len(strs[i]) if len(strs[i]) < len(prefix) else len(prefix)
           for j in range(0, n):
               if (prefix[j] != strs[i][j]):
                   prefix = prefix[0:j-1]
                   if not prefix:
                        return prefix
                   break
        return prefix
