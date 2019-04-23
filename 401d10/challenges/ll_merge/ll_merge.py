    def merged_list(ll1, ll2):
        """This function will merge 2 linked lists into a single
        list alternating between each list with each insert"""
        ll1_current, ll2_current = ll1.head, ll2.head
        if (ll1.head is None) and (ll2.head is None):
            raise ValueError('List1 and List2 are invalid')

        if ll1.head is None:
            return ll2.head.val
        elif ll2.head is None:
            return ll1.head.val

        while ll2.head is not None:
            self.insert_after_value(ll1_current, ll2_current)
            ll1_current, ll2_current = ll1._next, ll2._next
            return ll1.head.val
