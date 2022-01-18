#include<bits/stdc++.h>
using namespace std;
int F[1001][1001];
int qhd(string s1, string s2){
    int n = s1.length(), m = s2.length(), i, j;
    memset(F,0,sizeof(F));
    for(i=1;i<=n;i++){
        for(j=1;j<=m;j++){
            if(s1[i-1] == s2[j-1]){
                F[i][j] = F[i-1][j-1] + 1;
            }else{
                F[i][j] = max(F[i-1][j],F[i][j-1]);
            }
        }
    }
    return F[n][m];
}

main(){
    string s1, s2; int t;
    cin>>t;
    while(t--){
        cin>>s1>>s2;
        cout<<qhd(s1,s2)<<endl;
    }
}
