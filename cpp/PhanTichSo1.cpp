#include<bits/stdc++.h>
using namespace std;
int a[15], n;
void in(int m){
    cout<<"(";
    for(int i=1; i<m;i++)cout<<a[i]<<" ";
    cout<<a[m]<<") ";
}

void quaylui(int i, int j, int s){
    int k;
    for(k=j; k>=1;k--){
        if(s+k<=n){
            a[i] = k;
            s = s + k;
            if(s==n) in(i);
            else quaylui(i+1,k,s);
            s = s - k;
        }
    }
}

main(){
    int t; cin>>t;
    while(t--){
        cin>>n;
        quaylui(1,n,0);
        cout<<endl;
    }
}

