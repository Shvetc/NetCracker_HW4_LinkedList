# Result of the comparison perfomance for collections

### LinkedList and ArrayList

 - Add:
    + 100 elem: arraylist faster , linkedlist slower.
    + 1000 elem: arraylist slower , linkedlist faster.
    + 10000 elem: arraylist slower , linkedlist faster.
    + 100000 elem: arraylist slower , linkedlist faster.
 - Remove 1 element (100 000 el):    
    + remove start element: arraylist slower , linkedlist faster.
    + remove middle element: arraylist faster , linkedlist slower. 	
    + remove end element: arraylist faster , linkedlist slower.

### Conclusion:
- When adding or deleting an element it is better to use LinkedList, than ArrayList ( for LinkedList O(1), for ArrayList O(n)).
- To access an element it is better to use ArrayList, than LinkedList (for LinkedList O(n), for ArrayList O(1)).
    
### HashSet, LinkedHashSet and TreeSet

- Add:
    + 100 elements: hashSet faster , linkedHashSet slower than input hashSet , treeSet slowest.
    + 1000 elements: hashSet faster , linkedHashSet slower than input hashSet , treeSet slowest. 
    + 10000 elements: hashSet faster , linkedHashSet slower than input hashSet , treeSet slowest.
    + 100000 elements: hashSet slower than input linkedHashSet , linkedHashSet faster , treeSet slowest.
- Remove 1 element (100 000 el):
    + remove start element: hashSet slower than remove linkedHashSet, linkedHashSet faster , treeSet slowest.
	+ remove middle element: hashSet slower than remove linkedHashSet, linkedHashSet faster , treeSet slowest.
    + remove end element: hashSet slower than remove linkedHashSet , linkedHashSet faster, treeSet slowest.
 
### Conclusion:
- When removing or adding an element from set, it is better to use linkedHashSet or hashSet, 
  because their difficulty is average O(1), unlike from treeSet  is O(log(n)).

### HashMap, LinkedHashMap and TreeMap  

- Put:
    + 100 elem: hashMap faster, linkedHashMap slower than put of hashMap, treeMap slowest
    + 1000 elem: hashMap faster, linkedHashMap slower than put of hashMap, treeMap slowest
    + 10000 elem: hashMap faster, linkedHashMap slower than put of hashMap, treeMap slowest 
- Remove 1 element (100 000 el):
    + remove start element: hashMap slower than put of linkedHashMap, linkedHashMap faster, treeMap slowest
	+ remove middle element: hashMap slower than put of linkedHashMap, linkedHashMap faster, treeMap slowest
    + remove end element: hashMap slower than put of linkedHashMap, linkedHashMap faster, treeMap slowest
### Conclusion:
- Performance hashMap and linkedHashMap are better, than treeMap, but we must keep in mind that LinkedHashMap should only be used where 
  we are interested in the sequence of elements inserted into the map.

#### General conclusion 
The selection of a collection depends on the data set and the goals you set.

### Java LinkedList and MyLinkedList
 - The performance and execution time of the basic operations of my implemented myLinkedList and JavaLinkedlist do not differ much. On average, they have a similar complexity. 
   On the example of the method 'add'  descry the graphs of execution time from the number of iterations  for myLinkedList and JavaLinkedList

![Image alt](https://github.com/Shvetc/LinkedList/raw/main/image/perfomance.png)