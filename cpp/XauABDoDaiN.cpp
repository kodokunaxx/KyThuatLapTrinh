
#include<bits/stdc++.h>
using namespace std;
int B[30], n;
void in(){
    int i, sum = 0;
    for(i=1;i<=n;i++)cout<<(char) ('A'+B[i]);
    cout<<" ";
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
        cin>>n;
        quaylui(1);
        cout<<endl;
    }
}
