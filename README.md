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
$ pole print test.txt
0,1,2
1,1,2
2,1,2
3,1,2
4,1,2
5,1,2
```

```
$ pole add head '"1,"' to test.txt
$ pole print test.txt
1,0,1,2
1,1,1,2
1,2,1,2
1,3,1,2
1,4,1,2
1,5,1,2
```

```
$ pole split test.txt with '","' max-column 1
Column: 1 max-value: 1
$ pole split test.txt with '","' sum-column 1
Column: 1 sum-value: 6
$ pole split test.txt with '","' sum-column 2
Column: 1 sum-value: 15
```

```
$ pole print test.txt line 1 to 2
1,0,1,2
1,1,1,2
$ pole print test.txt line 1 to 2 exists '"0"'
1,0,1,2
$ pole print test.txt line 1 to 2 exists '"0"' copy test2.txt
1,0,1,2
Data was copied to test2.txt
```
