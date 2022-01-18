#include<bits/stdc++.h>
#include<iostream>
using namespace std;
int m,n;
bool chuaxet[1005];
vector<int> List[1005];
void DFS(int u){
    chuaxet[u] = false;
    for(int i=0;i<List[u].size();i++){
            int v = List[u][i];
            if(chuaxet[v]) DFS(v);
        }
}
main(){
    int t,d = 0,x,y,i;
    cin>>t;
    while(t--){
            memset(chuaxet, true,sizeof(chuaxet));
        for(i=0;i<1005;i++) List[i].clear();
        cin>>n; m=n-1;
        for(i=1;i<=m;i++){
            cin>>x>>y;
            List[x].push_back(y);
            List[y].push_back(x);
        }
        for(i=1;i<=n;i++){
            if(chuaxet[i]){
                d++;
                DFS(i);
            }
        }
        if(d==1) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }
}

