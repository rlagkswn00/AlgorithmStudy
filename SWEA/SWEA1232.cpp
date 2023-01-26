// [S/W 문제해결 기본] 9일차 - 사칙연산
#include <bits/stdc++.h>
using namespace std;

constexpr size_t MAXSIZE = 9999;
struct Node
{
    int data;
    int num;
    char a;
    Node *left;
    Node *right;
};

int nodeCnt = 0;
Node nodePool[MAXSIZE];
int n, s, leftNum, rightNum;
char a;

Node *parent_new_node(int s, char a)
{
    nodePool[nodeCnt].a = a;
    nodePool[nodeCnt].num = 0;
    nodePool[nodeCnt].data = s;
    nodePool[nodeCnt].left = nullptr;
    nodePool[nodeCnt].right = nullptr;
    return &nodePool[nodeCnt++];
}

Node *child_new_node(int s, int num)
{
    nodePool[nodeCnt].a = ' ';
    nodePool[nodeCnt].num = num;
    nodePool[nodeCnt].data = s;
    nodePool[nodeCnt].left = nullptr;
    nodePool[nodeCnt].right = nullptr;
    return &nodePool[nodeCnt++];
}

void postorder(Node *cur)
{
    if (cur != 0)
    {
        postorder(cur->left);
        postorder(cur->right);
        if (cur->left != 0 && cur->right != 0)
        {
            if (cur->a == '+')
            {
                cur->num = cur->left->num + cur->right->num;
            }
            else if (cur->a == '-')
            {
                cur->num = cur->left->num - cur->right->num;
            }
            else if (cur->a == '/')
            {
                if (cur->left->num != 0 && cur->right->num != 0)
                {
                    cur->num = cur->left->num / cur->right->num;
                }
            }
            else if (cur->a == '*')
            {
                cur->num = cur->left->num * cur->right->num;
            }
        }
    }
}
void solve()
{
    cin >> n;
    for (int k = 0; k < n; k++)
    {
        int num = 0;
        char b[10];
        cin >> s >> b;

        if (b[0] >= '0' && b[0] <= '9')
        {
            for (int w = 0; b[w]; w++)
            {
                num *= 10;
                num += b[w] - '0';
            }
            Node *node_new_child = child_new_node(s, num);
        }
        else
        {
            cin >> leftNum >> rightNum;
            a = b[0];
            Node *node_new_parent = parent_new_node(s, a);
            node_new_parent->left = &nodePool[leftNum - 1];
            node_new_parent->right = &nodePool[rightNum - 1];
        }
    }
    postorder(&nodePool[0]);
    cout << nodePool[0].num << endl;
    nodeCnt = 0;
}
int main()
{
    int test_case;
    int T = 10;
    freopen("sample_input3.txt", "r", stdin);

    /*
       여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
    */
    for (test_case = 1; test_case <= T; ++test_case)
    {
        cout << "#" << test_case << " ";
        solve();
    }

    return 0;
}
