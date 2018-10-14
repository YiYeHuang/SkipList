## Skip List
Moved from [My Java notes repo](https://github.com/YiYeHuang/JavaKeyStonesOneAtATime)
Based on William Pugh's paper at 1990: Skip Lists: A Probabilistic Alternative to Balanced Trees
Skip List is sorted and can implement to allow duplicate. Example application can be multiMap with a SkipList 
KeyValue Store.

## Implementation
Implementation is easier way easier than AVL tree and RB tree.
The design is based on the bst best practice: when insert the node randomly into bst, the access + operation time is 
more likely to be optimized. 

Skip list is LinkedList with more layers. The taller the layer the fewer the node is.
A perfect SkipList: the level n contains half nodes compare to of level n - 1.

The design of the level determination is based on paper:
by flipping coins n time, if the result is face, then level ++. Therefore, there are 1/2 of change nodes goes to 
level 2, 1/4 chance level 3, 1/8 chance level 4 so far and so on.

In ideal case, the total supported node number should be 
2 + 4 + 8 .... + 2^n

For this implementation the level stops at 10. to get to level 10 the chance is 1/1024
With random level + short sample size, when doing a search, you may even skip 0 nodes, but when insert size is huge, 
the performance is list as

## Printing
Call levlPrint will give you result like:

Layer 0 | head |---> [ level 0 | value 4 ]---> [ level 1 | value 5 ]---> [ level 0 | value 8 ]---> [ level 1 | value 10 ]

Layer 1 | head |-----------------------------> [ level 1 | value 5 ]-----------------------------> [ level 1 | value 10 ]


| Operation         | Time Complexity |
| ----------------- | :-------------: |
| Insertion         | O(log N)        |
| Removal           | O(log N)        |
| Check if contains | O(log N)        |


### Redis Implementation reference
[Redis data types and abstractions](https://redis.io/topics/data-types-intro)