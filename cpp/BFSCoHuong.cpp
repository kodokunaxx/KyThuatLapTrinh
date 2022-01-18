#include<bits/stdc++.h>
using namespace std;

vector<int> ke[1005];
bool Ok[1005];

void BFS(int u){
    queue<int> q;
    q.push(u);
    while(q.size()>0){
        int top = q.front(); q.pop();
        cout<<top<<' ';
        Ok[top] = true;
        for(int i=0;i<ke[top].size();i++){
            if(!Ok[ke[top][i]]){
                Ok[ke[top][i]]=true;
                q.push(ke[top][i]);
            }
        }
    }
}

int main(){
    int t;
    cin>>t;
    int u,v;
     while(t--){
        for(int i=0; i<1001;i++) ke[i].clear();
        memset(Ok, false, sizeof(Ok));
        int a, b, nguon;
        cin>>a>>b>>nguon;
        for(int i = 0; i<b;i++){
            cin>>u>>v;
            ke[u].push_back(v);
            //ke[v].push_back(u);
        }
        BFS(nguon);
        cout<<'\n';
     }
     return 0;
}

