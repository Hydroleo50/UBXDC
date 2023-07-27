# UBXDC
This is an Universal Binary to XD converter.

Do you type your messages with lots of 'xd's in them?
Do you want to mess with your friends and family, and encode binary messages into 'xd'nary messages,
so you can send the most inefficient and easy to decode encoded messages?

If yes, then this tool is right for you!

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
There is also direct encoding/decoding:
```
Input: Hello there
Output: dxddxddd dxxddxdx dxxdxxdd dxxdxxdd dxxdxxxx ddxddddd dxxxdxdd dxxdxddd dxxddxdx dxxxddxd dxxddxdx
```
And back:
```
Input: dxdddxxx dxxddxdx dxxdxxxd dxxddxdx dxxxddxd dxxddddx dxxdxxdd ddxddddd dxddxdxx dxxddxdx dxxdxxxd dxxdxxxx dxxdddxd dxxdxddx
Output: General Kenobi
```

It will (hopefully) be frequently updated to implement all the desired Functionalities, like:
- encoding/decoding multiple messages (right now it terminates after one operation)

Currently, all conversions work. (not perfectly)

# Installation
Its a command line tool for now. I might implement a GUI version in the future.

For the Java version:
All you need is the binxdcon.java file, so first download that.
1. Make sure you have Java installed (If not, install it)
2. In the same folder as the binxdcon.java file, open a terminal or cmd prompt and run:
```
javac binxdcon.java
```
to compile the tool.

3. Then, to run the tool, use:
```
java binxdcon
```
4. Follow the on screen prompts.

For the C version:
1. Download binxdcon.c
2. Compile it using your favorite compiler, for example gcc
```
gcc -o binxdcon binxdcon.c
```
3. Run it, and follow the on screen prompts
```
./binxdcon
```


# Roadmap
- Finish the intended functionality (multiple encode/decode)
- Make the code legible(Optional)
- Optimize(Optional)
- Fix the Prompt formatting
- "Sanitize" Input and make Output look better <- Halfway done
- Do something about that multiple line thing

# FAQ

- Why are you doing this?

> I was forced to learn java, so i am writing this fun little project as practice.

> (I am aware tools already exist which you can do this with. That is not the point.)

- Dude, you should use C for this. More cool and efficient and stuff.

> ~~I'll do that later. Maybe. Devs are known to be lazy;~~

> ~~I am no exception.~~

> A C version of this was created by @marv7000.

- Do you accept Criticism?

> No

- Do you accept constructive Criticism?

> Yes


