#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    int t1 = 0, t2 = 0;
    while (n--)
    {
        int a;
        cin >> a;
        t1 += (a / 30) * 10 + 10;
        t2 += (a / 60) * 15 + 15;
    }
    if (t1 == t2)
        cout << "Y "
             << "M " << t1;
    else if (t1 > t2)
        cout << "M " << t2;
    else
        cout << "Y " << t1;
}