#include <iostream>
#define MAX_N 100000

using namespace std;
int heap[MAX_N];
int heapCnt;

void add(int val)
{
    int pivot = heapCnt;
    heap[heapCnt++] = val;
    while (pivot > 0)
    {
        int ppivot = pivot;
        pivot--;
        pivot = pivot >> 1;
        if (heap[pivot] < val)
        {
            heap[ppivot] = heap[pivot];
            heap[pivot] = val;
        }
        else
            return;
    }
    return;
}

int pop()
{
    if (heapCnt == 0)
        return -1;
    int val = heap[0];
    heapCnt--;
    heap[0] = heap[heapCnt];
    int pivot = 0;
    while (true)
    {
        int ppivot = pivot;
        pivot = pivot << 1;
        pivot++;
        if (pivot >= heapCnt)
        {
            break;
        }
        else if (pivot + 1 == heapCnt)
        {
            if (heap[ppivot] > heap[pivot])
                break;
            int tmp = heap[ppivot];
            heap[ppivot] = heap[pivot];
            heap[pivot] = tmp;
            break;
        }
        else
        {
            if (heap[pivot] < heap[pivot + 1])
                pivot++;
            if (heap[ppivot] > heap[pivot])
                break;
            int tmp = heap[pivot];
            heap[pivot] = heap[ppivot];
            heap[ppivot] = tmp;
        }
    }
    return val;
}
void solve()
{
    heapCnt = 0;
    int N;
    cin >> N;
    for (int n = 0; n < N; n++)
    {
        int act;
        cin >> act;
        if (act == 1)
        {
            int num;
            cin >> num;
            add(num);
        }
        else
        {
            cout << pop() << ' ';
        }
    }
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    freopen("sample_input2.txt", "r", stdin);

    int T;
    cin >> T;
    for (int tc = 1; tc <= T; tc++)
    {
        cout << '#' << tc << ' ';
        solve();
        cout << '\n';
    }
    return 0;
}