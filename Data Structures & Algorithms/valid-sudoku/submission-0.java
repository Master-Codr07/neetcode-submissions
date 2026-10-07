class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        //create hashset Arrays
        HashSet<Character> row []= new HashSet [n];
        HashSet<Character> col []= new HashSet [n];
        HashSet<Character> box[] = new HashSet [n];


        for(int i=0;i<n;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                char ch = board[r][c];

                if(ch=='.'){
                    continue;
                }

                int BoxIndex=((r/3)*3)+(c/3);

                if(row[r].contains(ch) || col[c].contains(ch) || box[BoxIndex].contains(ch)){
                    return false;
                }

                row[r].add(ch);
                col[c].add(ch);
                box[BoxIndex].add(ch);
            }
        }

        return true;
        
    }
}
