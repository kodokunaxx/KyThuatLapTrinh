#include<bits/stdc++.h>

int M = 1e9+7;
long long powerMod(long long n, long long k){
    if(k==0) return 1;
    long long x = powerMod(n, k/2);
    if(k%2==0) return x*x%M;
    return n*(x*x%M)%M;
}

long long dao(long long n){
    long long d = 0;
    while (n>0){
        d=d*10 + n%10;
        n/=10;
    }
    return d;
}

using namespace std;
main(){
    int t; long long n;
    cin>>t;
    while (t--){
        cin>>n;
        cout << powerMod(n,dao(n)) << endl;
    }
}
