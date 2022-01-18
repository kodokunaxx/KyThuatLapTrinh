#include<bits/stdc++.h>
using namespace std;
long long F[100];
typedef struct Matran{
    long long f[2][2];
};

int M = 1e9+7;
Matran operator*(Matran A, Matran B){
    Matran C;
    for(int i=0; i<=1;i++){
        for(int j=0; j<=1; j++){
            C.f[i][j] = 0;
            for(int k=0; k<=1; k++){
                C.f[i][j] = (C.f[i][j] + (A.f[i][k]*B.f[k][j])%M)%M;
            }
        }
    }
    return C;
}

Matran powerMod(Matran A, int n){
    if(n==1) return A;
    Matran X = powerMod(A,n/2);
    if(n%2==0) return X*X;
    return A*X*X;
}

main(){
    int t,n;
    cin>>t;
    Matran A;
    A.f[0][0] = 1; A.f[0][1] = 1;
    A.f[1][0] = 1; A.f[1][1] = 0;
    while(t--){
        cin>>n;
        Matran X = powerMod(A,n);
        cout << X.f[1][0]<<endl;
    }
}
