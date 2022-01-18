#include<bits/stdc++.h>
#include<stack>
using namespace std;

main(){
    int t;
    cin>>t;
    while(t--){
        int n; cin>>n;
        int a[n];
        int i, j, dem;
        stack<int> s;
        for(i=0; i<n; i++){
            cin>>a[i];
            s.push(n-i-1);
        }
        while(!s.empty()){
            dem=1;
            for(i=s.top()-1; i>=0;i--){
                if(a[s.top()]>=a[i]){
                    dem++;
                }else{
                    break;
                }
            }
            s.pop();
            cout<<dem<<" ";
        }
    }
}
