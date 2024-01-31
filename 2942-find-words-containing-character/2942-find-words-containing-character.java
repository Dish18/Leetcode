class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<Integer>(); 
        for(int i=0;i<words.length;i++)
        {
            String val = words[i];
            if(val.indexOf(x)!=-1){
                list.add(i);
            }
        }
        return list;
    }
}