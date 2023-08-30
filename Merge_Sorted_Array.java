class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=0;i<n;i++){
          nums1[m+i] = nums2[i];
          }
         Arrays.sort(nums1);
        }
    }
// using 2 pointer approach in c++:
/*#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int32_t main() {
int n, m;
cin >> n >> m;
vector<int> a(n), b(m);
for (int i = 0; i < n; i++) {
cin >> a[i];
}
for (int i = 0; i < m; i++) {
cin >> b[i];
}
int i = 0, j = 0;
vector<int> c;
while (i < n && j < m) {
if (a[i] <= b[j]) {
c.push_back(a[i]);
i++;
} else {
c.push_back(b[j]);
j++;
}
}
while (j < m) {
c.push_back(b[j]);
j++;
}
while (i < n) {
c.push_back(a[i]);
i++;
}
for (int i = 0; i < m + n; i++) {
cout << c[i] << ' ';
}
return 0;
}
*/
