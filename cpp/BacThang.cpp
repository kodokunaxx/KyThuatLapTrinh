#include<bits/stdc++.h>
using namespace std;
int M = 1e9+7;

int qhd(int n, int k){
    int F[n+1] = {0}, i, j;
    F[0]=1; F[1]=1;
    for(i = 2; i<=n; i++){
        for(j=1;j<=min(i,k);j++){
            F[i] = (F[i] + F[i-j])%M;
        }
    }
    return F[n];
}

main(){
    int t,n,k;
    cin>>t;
    while(t--){
        cin>>n>>k;
        cout<<qhd(n,k)<<endl;
    }
}
