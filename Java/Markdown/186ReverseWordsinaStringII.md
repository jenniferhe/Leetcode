### 186. Reverse Words in a String II

Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.

The input string does not contain leading or trailing spaces and the words are always separated by a single space.

For example,
Given s = "`the sky is blue`",
return "`blue is sky the`".

Could you do it *in-place* without allocating extra space?



```
public class Solution {
    public void reverseWords(char[] s) {
        rotate(s,0,s.length);
        int tmp = 0;
        for(int i = 0; i < s.length;i++){
            if(s[i]==' '){
                rotate(s,tmp,i);
                tmp = i+1;
            }
        }
        rotate(s,tmp,s.length);
    }
    private void rotate(char[] s, int start, int end){
        for(int i = 0; i < (end-start)/2;i++){
            char tmp = s[start+i];
            s[start+i] = s[end-i-1];
            s[end-i-1] = tmp;
        }
    }
}
```

