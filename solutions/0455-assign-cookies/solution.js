/**
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    g.sort((a,b)=>a-b);
    s.sort((a,b)=>a-b);

    let gi=0;
    let si=0;
    let ans=0;

    while(gi<g.length && si<s.length){
        if(s[si]>=g[gi]){
            ans++
            gi++
            si++
        }
        else{
            si++
        }
    };
    return ans
    
};
