# remove repeted elements from the given linked list

def removeDuplicates(arr):
    '''

    :param arr: this method expects a list of integers. Each element of the list will be considered as a node.
    :return: void
    '''

    class Node:
        def __init__(self, value=None, next=None):
            self.value = value
            self.next = next


    class LinkedList:
        def __init__(self):
            self.head = None


        def display(self):
            '''

            :return: void
            '''
            temp = self.head
            while temp != None:
                print(temp.value)
                temp = temp.next


        def insert(self, data):
            '''
            this method will insert element at the beginig of the linked list

            :param data: data to be inserted
            :return: void
            '''
            if self.head == None:
                node = Node(value=data)
                self.head = node
            else:
                node = Node(value=data, next=self.head)
                self.head = node
                # print(f' current head: {self.head.value}')
            # print(node.next)
            # print(self.head.value)



        def delete(self, data):
            '''
            :param data: data(value of any node) to be removed.
            :return: None
            '''

            temp = self.head
            if (temp is not None) and (temp.value == data):
                self.head = temp.next
                temp = None
                return
            elif (temp == None):
                return
            else:
                while (temp is not None):
                    if temp.value == data:
                        break
                    prev = temp
                    temp = temp.next

            prev.next = temp.next
            temp = None


    # instantiating linked list
    l1 = LinkedList()

    # inserting nodes
    for i in arr:
        l1.insert(i)

    # displaying linked list of given nodes
    print('given list:')
    l1.display()

    # logic for removing duplicates
    d = set()
    for _ in arr:
        if _ in d:
            l1.delete(_)
            # print(_)
        else:
            d.add(_)


    # displaying linked list after removing duplicates
    print('linked list of unique nodes:')
    l1.display()


if __name__ == '__main__':
    removeDuplicates(arr = [1,2,3,4,1,3,3,3])
