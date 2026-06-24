class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            al.add(temp.val);
            temp = temp.next;
        }

        Collections.rotate(al,k);

        ListNode dummy = new ListNode(-1);
        temp = dummy;
        for(int i=0;i<al.size();i++)
        {
            temp.next = new ListNode(al.get(i));
            temp = temp.next;
        }
        return dummy.next;
    }
}