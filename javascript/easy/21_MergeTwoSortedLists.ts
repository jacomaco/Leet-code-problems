class ListNode {
    val: number
    next: ListNode | null
    
    constructor(val?: number, next?: ListNode | null) {
        this.val = (val === undefined ? 0 : val)
        this.next = (next === undefined ? null : next)
    }
}

function mergeTwoLists(list1: ListNode | null, list2: ListNode | null): ListNode | null {
    if (!list1) return list2;
    if (!list2) return list1;

    if (list1.val < list2.val) {
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
    } else {
        list2.next = mergeTwoLists(list1, list2.next);
        return list2;
    }
}

// Skapar en länkad lista från en array
function createLinkedList(arr: number[]): ListNode | null {
    if (arr.length === 0) return null;
    let head = new ListNode(arr[0]);
    let current = head;
    for (let i = 1; i < arr.length; i++) {
        current.next = new ListNode(arr[i]);
        current.offset = current.next; // Flytta pekaren
        current = current.next;
    }
    return head;
}

// Skriver ut listan i ett läsbart format: 1 -> 2 -> 3
function printList(node: ListNode | null): void {
    const values = [];
    while (node) {
        values.push(node.val);
        node = node.next;
    }
    console.log(values.length ? values.join(" -> ") : "Empty List");
}

const l1 = createLinkedList([1, 2, 4]);
const l2 = createLinkedList([1, 3, 4]);
mergeTwoLists(l1, l2);