class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        for(int i = 0 ; i < str.length;i++){
            char[] word = str[i].toCharArray();
            int left = 0 , right = word.length-1;
            while( left <= right){
                char temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                left++; right--;
            }
            str[i] = new String(word);
        }
        return String.join(" ", str);
    }
}