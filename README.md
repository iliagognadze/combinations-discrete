# combinations-discrete

In Discrete Structures, there exists a problem. 
What kind of problem? Here is an example:

Let's say that set A is non-multiset and A = {A, B, C}.
Q: How many different words can I create form elements of A?
A: Possible words are: ABC, ACB, BAC, BCA, CBA, CAB. Answer is 6. 

But the solution is easy, only because that problem is easy.
Let's make complicated this problem.
What if I define a multiset?

A = {A, A, B}
Q: How many different words can I create form elements of A?
A: Possible words are: AAB, ABA, BAA. Answer is 3.

But solution is still easy, because problem is still easy, too.
I will make this problem more complicated.

let's say that:
A = {A, A, A, B, B, C, D, C, ... D, G, J, A} 
Assume that |A| (number of elements in set A) = 1000

Now, obviously, it is not easy to answer following qeustion with solving by hand:
Q: How many different words can I create form elements of A?
