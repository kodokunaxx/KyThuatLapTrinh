#include<bits/stdc++.h>
using namespace std;
int B[30], n, k;
void in(){
    int i, sum = 0;
    for(i=1;i<=n;i++)sum+=B[i];
    if(sum==k){
        for(i=1;i<=n;i++)cout<<B[i];
        cout<<endl;
    }
}

void quaylui(int i){
    int j;
    for(j=0;j<=1;j++){
        B[i] = j;
        if(i==n) in();
        else quaylui(i+1);
    }
}

main(){
    int t;cin>>t;
    while(t--){
        cin>>n>>k;
        quaylui(1);
        cout<<endl;
    }
}
