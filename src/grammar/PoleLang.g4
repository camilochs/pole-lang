
grammar PoleLang;

@header {
package grammar;
import java.util.HashMap;
}

/* Lexer */
Print
:
    'print'
;
To
:
    'to'
;
If
:
    'if'
;
For
:
    'for'
;
ForIndex
:
    '='
;
Add
:
    'add'
;
Copy
:
    'copy'
;
Split
:
    'split'
;
Line
:
    'line'
;
Head
:
    'head'
;
Info
:
    'info'
;
Exists
:
    'exists'
;
With
:
    'with'
;
MaxColumn
:
    'max-column'
;
MinColumn
:
    'min-column'
;
SumColumn
:
    'sum-column'
;
FormatSize
:
    'format-size'
;
MegaBytes
:
    'mb'
;
Bytes
:
    'b'
;
KiloBytes
:
    'kb'
;
GigaBytes
:
    'gb'
;
End
:
    'end'
;

Number : [0-9]+ ;
FileNameText : [a-zA-Z0-9_-]+ '.txt';
ID : [a-z]+ ;

fragment
StringInputText : ~[\r\n]+ ;
StringInput : '"' StringInputText '"';
Ws    : [ \n\t]+ -> skip;



program
    : statement+ EOF;

/* Parser */
statement
    : actionStatement copyAction?;

//Actions
actionStatement
    : printAction | addAction | splitAction | iterativeAction;

//Print action
printAction
    : Print FileNameText printActionParameters?;

lineActionWithLimit
    : To (Number | End);

lineAction
    : Line Number lineActionWithLimit?;

exitsAction
    : lineAction Exists StringInput;

logicalAction
    : exitsAction;

ifAction
    : If ('(' logicalAction ')' | logicalAction);

infoSizeAction
:
    (Bytes | KiloBytes | MegaBytes | GigaBytes)
;

infoAction
    : Info With FormatSize infoSizeAction;

printActionParameters
    : lineAction | ifAction | infoAction;

//Add action
headAction
    : Head;

addAction
    : Add headAction? StringInput To FileNameText;

//Split action
splitMaxColumn
    : MaxColumn Number;

splitMinColumn
    : MinColumn Number;

splitSumColumn
    : SumColumn Number;

splitOperations
    : splitMaxColumn | splitMinColumn | splitSumColumn;

splitAction
    : Split FileNameText With StringInput splitOperations;

//Copy action
copyAction
    : Copy FileNameText;

//Iterative action
iterativeOutputAction
    : StringInput;
forAction
    : For ID ForIndex Number To Number iterativeOutputAction;

iterativeAction
    : forAction;

