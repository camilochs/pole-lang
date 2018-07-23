#### Important: Currently pole-lang is not recommended for production use. Current in development and for experimental use only. 

<img src="https://www.lucidchart.com/publicSegments/view/cef83044-f679-4ea6-9855-e5730aaa1c5d/image.png" alt="pole-lang" width="500" />

A simple programming language written in Java for processing text files. Pole-lang is an interpreted language that works on bash.

Examples(video):
*	https://asciinema.org/a/VciwgjOy2eOjmYz6NNIlJmw0i
*	https://asciinema.org/a/z84er0JJph9zfsiJfU8BBkOoi


Code examples:

```
> pole for i = 0 to 5 '"{i},1,2"' copy test.txt
0,1,2
1,1,2
2,1,2
3,1,2
4,1,2
5,1,2
Data was copied to test.txt
```

```
> pole print test.txt
0,1,2
1,1,2
2,1,2
3,1,2
4,1,2
5,1,2
```

```
> pole add head '"1,"' to test.txt
> pole print test.txt
1,0,1,2
1,1,1,2
1,2,1,2
1,3,1,2
1,4,1,2
1,5,1,2
```
