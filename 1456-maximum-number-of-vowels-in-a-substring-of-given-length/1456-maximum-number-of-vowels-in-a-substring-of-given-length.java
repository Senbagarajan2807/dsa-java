class Solution {
    public int maxVowels(String s, int k) {
      char[] res = s.toCharArray();
      int vowels = 0;
      int maxVowels = 0;
      for(int i = 0;i<k;i++){
        if(res[i]=='a' || res[i]=='e' || res[i]=='i' || res[i] == 'o'||res[i]=='u'){
            vowels++;
        }  
      } maxVowels = vowels;
        for(int j = k;j<res.length;j++){
        if(res[j-k]=='a' || res[j-k]=='e' || res[j-k]=='i' || res[j-k] == 'o'|| res[j-k]=='u'){
            vowels--;
        } 
        if(res[j]=='a' || res[j]=='e' || res[j]=='i' || res[j] == 'o'|| res[j]=='u'){
            vowels++;
        } 
        maxVowels = Math.max(vowels,maxVowels); 
      } 
      return maxVowels;  
    }
}