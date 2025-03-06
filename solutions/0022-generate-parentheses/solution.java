class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> result=new ArrayList<>();
     
     generateParenthesishelp(n,0,0,"",result);
     
     return result;
        
    }
  public static void generateParenthesishelp(int n,int l,int r,String k,List<String> result){
    
    if(k.length() == 2 * n){
      result.add(k);
      return;
      
    }
   
      
    
    if(l>r){
      generateParenthesishelp(n,l,r+1,k+")",result);
        
    }
    if(l<n){
      generateParenthesishelp(n,l+1,r,k+"(",result);
      
    }
  } 
   
    
}
