#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    long long a, b;
    cin >> a >> b;

    if (a < b)
        swap(a, b);
    if (a == b)
        cout << 0;
    else
    {

        cout << a - b - 1 << "\n";
        for (long long i = b + 1; i < a; i++)
            cout << i << " ";
        {
        }
    }
}