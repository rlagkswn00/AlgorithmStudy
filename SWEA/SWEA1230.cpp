// 암호문3
#include <iostream>
#include <list>
using namespace std;
int n;
int m;
void solve()
{
    list<int> l;
    cin >> n;
    int k;
    for (int i = 0; i < n; i++)
    {
        cin >> k;
        l.push_back(k);
    }

    cin >> m;
    for (int i = 0; i < m; i++)
    {
        char opcode;
        cin >> opcode;
        if (opcode == 'I')
        {
            int x, y, s;
            cin >> x >> y;

            auto iter = l.begin();
            list<int> tmp;
            cin >> x >> y;
            for (int j = 0; j < x; j++)
                iter++;

            for (int j = 0; j < y; j++)
            {
                cin >> s;
                tmp.push_back(s);
            }
            l.splice(iter, tmp);
        }
        else if (opcode == 'D')
        {
            int x, y;
            cin >> x >> y;
            list<int>::iterator iter = l.begin();
            for (int k = 0; k < x; k++)
                iter++;

            for (int k = 0; k < y; k++)
                l.erase(iter);
        }
        else if (opcode == 'A')
        {
            int y, s;
            cin >> y;

            for (int k = 0; k < y; k++)
            {
                cin >> s;
                l.push_back(s);
            }
        }
    }
    auto itr = l.begin();
    for (int i = 0; i < 10; i++, itr++)
        cout << *itr << " ";
    cout << '\n';
}
int main(void)
{

    int test_case;
    int T = 10;
    freopen("sample_input3.txt", "r", stdin);

    for (test_case = 1; test_case <= T; ++test_case)
    {

        cout << "#" << test_case << " ";
        solve();
    }
    return 0; // 정상종료시 반드시 0을 리턴해야합니다.
}