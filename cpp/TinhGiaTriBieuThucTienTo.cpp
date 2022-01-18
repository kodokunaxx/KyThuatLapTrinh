
#include<bits/stdc++.h>
using namespace std;
int C[30], n, k, s, dem;
void in(){
    int sum = 0;
    for(int i=1;i<=k;i++)sum+=C[i];
    if(sum==s)dem++;
}

void quaylui(int i){
    int j;
    for(j=C[i-1]+1;j<=n-k+i;j++){
        C[i] = j;
        if(i==k) in();
        else quaylui(i+1);
    }
}

main(){
    int t;cin>>t;
    while(1){
        cin>>n>>k>>s;
        if(n==0&&k==0&&s==0) break;
        dem=0;
        quaylui(1);
        cout<<dem<<endl;
    }
}
