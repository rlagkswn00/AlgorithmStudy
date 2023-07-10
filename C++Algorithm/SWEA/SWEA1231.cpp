// 중위순회
#include <bits/stdc++.h>
using namespace std;

typedef struct Node
{
    char data;
    Node *left;
    Node *right;
} Node;

Node *root;
Node nodePool[100];
int n, input, leftNum, rightNum;
char input;

void inOrderTraverse(Node *node)
{

    if (node->left)
        inOrderTraverse(node->left);
    cout << node->data;
    if (node->right)
        inOrderTraverse(node->right);
}
void solve()
{
    cin >> n;
    root = &nodePool[1];

    for (int i = 1; i <= n; i++)
    {
        // 트리 생성
        char input;
        cin >> input >> input;
        nodePool[i].data = input;
        if ((n % 2 == 0 && i < n / 2) || (n % 2 == 1 && i <= ((n - 1) / 2)))
        {
            cin >> leftNum >> rightNum;
            nodePool[i].left = &nodePool[leftNum];
            nodePool[i].right = &nodePool[rightNum];
        }
        else if (n % 2 == 0 && i == n / 2)
        {
            cin >> leftNum;
            nodePool[i].left = &nodePool[leftNum];
            nodePool[i].right = NULL;
        }
        else
        {
            nodePool[i].left = NULL;
            nodePool[i].right = NULL;
        }
        `
    }
    // 중위순회, 출려
    inOrderTraverse(root);
    cout << '\n';
}

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int test_case;
    int T = 10;
    freopen("sample_input1.txt", "r", stdin);
    // cin >> T;

    /*
       여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
    */
    for (test_case = 1; test_case <= T; ++test_case)
    {
        cout << "#" << test_case << " ";
        solve();
    }
    return 0; // 정상종료시 반드시 0을 리턴해야합니다.
}