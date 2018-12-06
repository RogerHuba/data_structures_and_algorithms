    def merged_list(self, ll1, ll2):
        """This function will merge 2 linked lists into a single
        list alternating between each list with each insert"""
        ll1_current, ll2_current = ll1.head, ll2.head
        if (ll1.head is None) and (ll2.head is None):
            raise ValueError('List1 and List2 are invalid')

        if ll1.head is None:
            return ll2.head
        elif ll2.head is None:
            return ll1.head

        while ll2.head is not None:
            self.insert_after_value(ll1_current, ll2_current)
            ll1_current, ll2_current = ll1._next, ll2._next
            print(ll1)
            return ll1.head
