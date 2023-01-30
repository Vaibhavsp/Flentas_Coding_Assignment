#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    for (int k = 0; k < n; k++)
    {
        string s,s1;
        cin>>s;
        cin>>s1;
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < s1.length(); j++)
            {
                if (s[i] == s1[j])
                {
                    count++;
                    break;
                }
            }
            if (count == s.length())
            {
                cout<<"YES"<<endl;
                break;
            }
        }
        if (count < s.length())
        {
            cout<<"NO"<<endl;
        }
    }
}
