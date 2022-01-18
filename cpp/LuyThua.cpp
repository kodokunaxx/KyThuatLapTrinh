#include<bits/stdc++.h>

int M = 1e9+7;
long long powerMod(long long n, long long k){
    if(k==0) return 1;
    long long x = powerMod(n, k/2);
    if(k%2==0) return x*x%M;
    return n*(x*x%M)%M;
}

using namespace std;
main(){
    long long n, k;
    for(int i=0;i<20;i++){
        cin>>n>>k;
        if(n==0 && k==0){break;}
        cout << powerMod(n,k) << endl;
    }
}
