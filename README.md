# UBXDC
This is an Universal Binary to XD converter.

Do you type your messages with lots of 'xd's in them?
Do you want to mess with your friends and family, and encode binary messages into 'xd'nary messages,
so you can send the most inefficient and easy to decode encoded messages?

Example:
```
Input: 1001 0110 1000 1010 1011
Output: xddx dxxd xddd xdxd xdxx
```
Or the other way around:
```
Input: xxxx dddx xddx ddxx xxdx
Output: 1111 0001 1001 0011 1101
```
If yes, then this tool is right for you!

It will (hopefully) be frequently updated to implement all the desired Functionalities, like:
- directly decoding/encoding 'xd'nary messages
- encoding/decoding multiple messages (right now it terminates after one operation)

Currently, xd to binary and binary to xd work.

# Installation
Its a command line tool for now. I might implement a GUI version in the future.
1. Make sure you have Java installed (If not, install it)
2. In the same folder as the binxdcon.java file, run:
```
javac binxdcon.java
```
to compile the tool.

3. Then, to run the tool, use:
```
java binxdcon
```
4. Follow the on screen prompts.


# Roadmap
- Finish the intended functionality (multiple encode/decode, direct encode/decode)
- Make the code legible(Optional)
- Optimize(Optional)
- Fix the Prompt formatting
- "Sanitize" Input and make Output look better
- Do something about that multiple line thing

# FAQ

- Why are you doing this?

I was forced to learn java, so i am writing this fun little project as practice.

(I am aware tools already exist which you can do this with. That is not the point.)

- Dude, you should use C for this. More cool and efficient and stuff.

I'll do that later. Maybe. Devs are known to be lazy;

I am no exception.

- Do you accept Criticism?

No

- Do you accept constructive Criticism?

Yes


