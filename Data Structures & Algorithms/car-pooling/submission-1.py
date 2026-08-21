class Solution:
    def carPooling(self, trips: List[List[int]], capacity: int) -> bool:
        trips.sort(key=lambda t:t[1])
        
        min_heap=[]
        curcap=0

        for numpass , start, end in trips:
            while min_heap and start>=min_heap[0][0]:
                curcap -= heapq.heappop(min_heap)[1]

            curcap += numpass
            if(curcap > capacity): return False
            
            heapq.heappush(min_heap,[end,numpass])

        
        
        
        
        
        
        
        
        
        return True


        