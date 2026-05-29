class Solution:
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        q=deque()
        q.append((beginWord,1))
        s=set(wordList)
        
        

        while(q):
            word,step=q.popleft()
            if(word==endWord):
                return step

            for i in range(len(word)):
                orignal=word
                for ch in "qwertyuiopasdfghjklzxcvbnm":
                    newword=word[:i]+ch+word[i+1:]

                    if(newword in s):
                        
                        s.remove(newword)
                        q.append((newword,step+1))
            
        return 0

        
