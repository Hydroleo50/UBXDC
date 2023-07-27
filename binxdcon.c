#include <stdlib.h>
#include "string.h"
#include "stdio.h"

#define BUFSIZE 8192

char* getLine()
{
    char* s = malloc(BUFSIZE);
    scanf("%s", NULL);
    fgets(s, BUFSIZE, stdin);
    return s;
}

char* xdToBinary()
{
    char* s = getLine();
    for (int i = 0; i < strlen(s); i++)
    {
        switch(s[i])
        {
            case 'x':
                s[i] = '1';
                break;
            case 'd':
                s[i] = '0';
                break;
        }
    }
    return s;
}

char* binaryStringToXd(char* s)
{
    for (int i = 0; i < strlen(s); i++)
    {
        switch(s[i])
        {
            case '0':
                s[i] = 'd';
                break;
            case '1':
                s[i] = 'x';
                break;
        }
    }
    return s;
}

char* binaryToXd()
{
    char* s = binaryStringToXd(getLine());
    return s;
}

char binaryToChar(const char* ch)
{
    char result = 0;
    for (int i = 0; i < 8; i++)
    {
        if (ch[i] == '1')
        {
            result |= (char)(1 << (7 - i));
        }
    }
    return result;
}

char* charToBinary(char ch)
{
    char* s = malloc(9);
    s[8] = 0;
    for (int i = 0; i < 8; i++)
    {
        if (ch & 1 << i)
        {
            s[7 - i] = '1';
        }
        else
        {
            s[7 - i] = '0';
        }
    }

    return s;
}

char* convertStringToXD()
{
    char* s = getLine();
    const int len = (int)strlen(s);
    const int newLen = len * 8 + len;
    char* newStr = calloc(1, newLen + 1);
    newStr[newLen] = 0;

    int i = 0;
    int j = 0;
    while (j < newLen)
    {
        char* str = binaryStringToXd(charToBinary(s[i]));
        for (int x = 0; x < 8; x++)
        {
            newStr[j] = str[x];
            j++;
        }
        newStr[j++] = ' ';
        i++;
    }

    return newStr;
}

char* convertXDToString()
{
    char* s = xdToBinary();
    const int len = (int)strlen(s);

    char* newStr = malloc(len / 8);
    int i = 0;
    int x = 0;
    while (i < len)
    {
        char ch = binaryToChar(s + i);
        newStr[x] = ch;
        i += 9;
        x++;
    }
    newStr[x] = 0;

    return newStr;
}

int main(int argc, char** argv)
{
    printf("XD TO BINARY CONVERTER\n");
    printf("To convert from xd to binary, type 1\n");
    printf("To convert from binary to xd, type 2\n");
    printf("To convert a string to xd, type 3\n");
    printf("To convert xd to string, type 4\n");
    printf("Conversion type: ");

    int d;
    scanf("%i", &d);

    printf("(I am not done implementing multiple lines yet, so)\n");
    printf("Type your content now, all into one line:\n");
    switch (d) 
    {
        case 1: 
        {
            printf("%s\n", xdToBinary());
            break;
        }
        case 2: 
        {
            printf("%s\n", binaryToXd());
            break;
        }
        case 3:
        {
            printf("%s\n", convertStringToXD());
            break;
        }
        case 4:
        {
            printf("%s\n", convertXDToString());
            break;
        }
        default:
        {
            printf("Usage: Just type the number 1, 2, 3 or 4 depending on what you need to do.\n");
            break;
        }
    }

    return 0;
}
// THERE ARE NO COMMENTS ; THE CODE IS THE COMMENT! !!!! !!
// that's a joke. there are no comments because the finished tasks are trivial
// there will be comments for more complex stuff, probably