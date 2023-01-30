n=int(input())
for i in range(n):
    s=input()
    s1=input()
    count=0
    for i in range(len(s)):
        for j in range(len(s1)):
            if(s[i]==s1[j]):
                count=count+1
                break
        if(count==len(s)):
            print("YES")
            break
    if(count<len(s)):
        print("NO")
