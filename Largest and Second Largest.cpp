#include<bits/stdc++.h>
using namespace std;
void solve(){
	int n;
	cin>>n;
	int sum =0;
	vector<int> a(n);
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	sort(a.begin(),a.end());
	for(int i=n-1;i<=n;--i){
	    if(a[i]==a[n-1]){
	        continue;
	    }
	    sum = a[i] + a[n-1];
	    break;
	}
	cout<< sum<<endl;
	
}
int main(){
	int t;
	cin>>t;
	while(t--){
		solve();
		
	}
	return 0;
}
