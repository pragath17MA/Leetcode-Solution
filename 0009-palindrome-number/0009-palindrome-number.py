class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        o=x
        s=0
        b=True
        while(x>0):
            d=x%10
            s=(s*10)+d
            x//=10
        if(s==o):
            return b
        else:
            b=False
            return b