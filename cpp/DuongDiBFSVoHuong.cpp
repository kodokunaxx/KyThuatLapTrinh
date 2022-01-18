#include<bits/stdc++.h>
using namespace std;

vector<int> ke[1005];
bool Ok[1005];
int truoc[1005];

void BFS(int u, int v){
    queue<int> q;
    q.push(u);
    while(q.size()>0){
        int top = q.front(); q.pop();
        Ok[top] = true;
        if(top == v) return;
        for(int i=0;i<ke[top].size();i++){
            if(!Ok[ke[top][i]]){
                Ok[ke[top][i]]=true;
                truoc[ke[top][i]]=top;
                q.push(ke[top][i]);
            }
        }
    }
}

void Trace(int u, int v){
    if(!Ok[v]){
        cout<< -1;
        return;
    }
    vector<int> a;
    while(u!=v){
        if(u==0){
            cout<<-1;
            return;
        }
        a.push_back(u);
        u = truoc[u];
    }
    a.push_back(v);
    reverse(a.begin(), a.end());
    for(int i=0; i<a.size();i++) cout <<a[i]<<' ';
}

int main(){
    int t;
    cin>>t;
    int u,v;
     while(t--){
        for(int i=0; i<1001;i++) ke[i].clear();
        memset(Ok, false, sizeof(Ok));
        memset(truoc, 0, sizeof(truoc));
        int a, b, nguon, dich;
        cin>>a>>b>>nguon>>dich;
        for(int i = 0; i<b;i++){
            cin>>u>>v;
            ke[u].push_back(v);
            ke[v].push_back(u);
        }
        BFS(nguon, dich);
        Trace(dich, nguon);
        cout<<'\n';
     }
     return 0;
}

