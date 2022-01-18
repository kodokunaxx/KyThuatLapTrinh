#include<bits/stdc++.h>
using namespace std;
main(){
    int i,j,n, a[1001], F[1001], kq=0;
    cin>>n;
    for(i=0;i<n;i++) cin>>a[i];
    for(i=0;i<n;i++){
        F[i] = 1;
        for(j=0; j<i;j++){
            if(a[j]<a[i]){
                F[i] = max(F[i], F[j]+1);
            }
        }
        kq = max(kq,F[i]);
    }
    cout<<kq;
}

