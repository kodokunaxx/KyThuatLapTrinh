#include<bits/stdc++.h>
using namespace std;

int qhd(int a[], int n){
    int i,j,F[1005], kq=0;
    for(i=0;i<n;i++){
        F[i] = 1;
        for(j=0; j<i;j++){
            if(a[j]<=a[i]){
                F[i] = max(F[i], F[j]+1);
            }
        }
        kq = max(kq,F[i]);
    }
    return n-kq;
}

main(){
    int i,j,t,n, a[1001];
    cin>>t;
    while(t--){
        cin>>n;
        for(i=0; i<n; i++) cin>>a[i];
        cout<<qhd(a,n)<<endl;
    }
}

