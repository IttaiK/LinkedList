Author: Ittai Kohavi
Acknowledgments: Mr. Kuzmaul -> taught the concept in class

List of written methods for the linked list (linkedList class):
    insert:
        In: A Node
        Out: Nothing
        Effect: Inserts node in the correct location in the linked list
    delete:
        In: An Int
        Out: Nothing
        Effect: Deletes the first node of given value, without breaking the linked list
    findMinimum:
        In: Nothing
        Out: an Int
        Effect: returns the smallest Int value of any node in the linked list
    getRoot:
        In: Nothing
        Out: An int
        Effect: returns the value of the root (or head) of the linked list
    printWalk:
        In: Nothing
        Out: A string
        Effect: Returns a string of all the values in the linked list by order of insertion

List of methods in the Node class
    getChild()
        In: Nothing
        Out: A Node
        Effect: Returns the child node of the called upon node
    getParent()
        In: Nothing
        Out: A Node
        Effect: Returns the parent node of the called upon node
    getNum:
        In: Nothing
        Out: a Node
        Effect: Returns the int value of the node
    setChild()
        In: A Node
        Out: Nothing
        Effect: Sets the called upon node's child to the given node
    setParent()
        In: A Node
        Out: Nothing
        Effect: Sets the called upon node's parent to the given node