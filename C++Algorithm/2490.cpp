#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int a, b, c, d;

    // 도 : A : 3
    // 개 : B : 2
    // 걸 : C : 1
    // 윳 : D : 0
    // 모 : E  : 4
    for (int e = 0; e < 3; e++)
    {
        cin >> a >> b >> c >> d;
        int result = a + b + c + d;
        if (result == 4)
            cout << 'E' << '\n';
        else if (result == 3)
            cout << 'A' << '\n';
        else if (result == 2)
            cout << 'B' << '\n';
        else if (result == 1)
            cout << 'C' << '\n';
        else if (result == 0)
            cout << 'D' << '\n';
    }
    return 0;
}