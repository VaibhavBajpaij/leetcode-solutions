class Solution {
    public boolean isPalindrome(String s) {

        String result=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        System.out.println(result);
        int i=0;
        int j=result.length()-1;
        while(i<j){
            if(result.charAt(i)!=result.charAt(j)){
               return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
