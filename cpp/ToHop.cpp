#include<bits/stdc++.h>
using namespace std;
int C[1005][1005], M=1e9+7;;


khoitao(){
    int i,j;
    for(i=0;i<=1000;i++){
        for(j=0;j<=i;j++){
            if(j==0 || i==j) C[i][j] =1;
            else C[i][j] = (C[i-1][j] + C[i-1][j-1])%M;
        }
    }
}

main(){
    khoitao();
    int t,n,k;
    cin>>t;
    while(t--){
        cin>>n>>k;
        cout<<C[n][k]<<endl;
    }
}

