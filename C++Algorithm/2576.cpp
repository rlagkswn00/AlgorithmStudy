#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int a, min = 100, sum = 0;

    for (int i = 0; i < 7; i++)
    {
        cin >> a;
        if (a % 2 != 0)
        {
            sum += a;
            if (min > a)
            {
                min = a;
            }
        }
    }
    if (sum != 0)
    {

        cout << sum << "\n";
        cout << min << "\n";
    }
    else
        cout << -1 << "\n";

    return 0;
}