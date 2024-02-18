class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        pascals = [[1]]
        for i in range(1, numRows):
            l = [1]
            j=1
            while(j<i):
                l.append(pascals[i-1][j-1] + pascals[i-1][j])
                j+=1
            l.append(1)
            pascals.append(l)
        return pascals 
