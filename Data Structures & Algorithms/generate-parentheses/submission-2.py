class Solution:
    
    def generateParenthesis(self, n: int) -> List[str]:
        result=[]
        str = ""
        
        def validparenthesis(str ,open ,close):

             if open==0 and close==0:
              result.append(str)
              return

             if close < open:
              return

             if open>0:
               validparenthesis(str+"(",open-1,close)    

             if close>0  and open<close:
               validparenthesis(str+")",open,close-1)        

        validparenthesis(str,n,n)
        return result