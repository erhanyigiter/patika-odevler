# patika-homeworks

## Selection-Insertion-Sort

Insertion Sort

### Question 1

<pre>[22,27,16,2,18,6]</pre>

a) Yukarıdaki verilen dizinin Insertion Sort türüne göre aşamalarını yazınız.

#### Answer a:<br>
<pre>
 1: [22,27,16,2,18,6] // 22 zaten 27'den küçük olduğu için hiç bir sıralama yapılmadı<br>
 2: [22,16,27,2,18,6]   // 27 ile 16 yer değişti<br>
 3: [16,22,27,2,18,6]   // 22 ile 16 yer değişti<br>
 4: [16,22,2,27,18,6]   // 27 ile 2 yer değişti<br>
 5: [16,2,22,27,18,6]   // 22 ile 2 yer değişti<br>
 6: [2,16,22,27,18,6]   // 16 ile 2 yer değişti<br>
 7: [2,16,22,18,27,6]   // 27 ile 18 yer değişti<br>
 8: [2,16,18,22,27,6]   // 22 ile 18 yer değişti<br>
 9: [2,16,18,22,6,27]   // 27 ile 6 yer değişti<br>
 10: [2,16,18,6,22,27]  // 22 ile 6 yer değişti<br>
 11: [2,16,6,18,22,27]  // 18 ile 6 yer değişti<br>
 12: [2,6,16,18,22,27]  // 16 ile 6 yer değişti</pre>

b) Big-O gösterimini yazınız.

#### Answer b:<br>    
<pre>
O(n^2)     </pre>

c) Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız.
<pre>
1. Average Case: Aranan sayının ortada olması<br>
2. Worst Case: Aranan sayının sonda olması<br>
3. Best Case: Aranan sayının dizinin en başında olması</pre>

#### Answer c:<br>
<pre>
Average Case
</pre>

Selection Sort

### Question 2

<pre>[7,3,5,8,2,9,4,15,6] --> dizisinin Selection Sort'a göre ilk 4 adımını yazınız.</pre>

#### Answer:<br>
<pre>
 1: [2,3,5,8,7,9,4,15,6]<br>
 2: [2,3,4,8,7,9,5,15,6]<br>
 3: [2,3,4,5,7,9,8,15,6]<br>
 4: [2,3,4,5,6,9,8,15,7]<br>

 5: [2,3,4,5,6,7,8,15,9]<br>
 6: [2,3,4,5,6,7,8,9,15]
</pre>
## Merge Sort

### Question 1
  <pre> [16,21,11,8,12,22]</pre>

a) Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

#### Answer a: 
<pre>
                   [16,21,11]                             [8,12,22]<br>
                  /           \                         /           \
               [16,21]    -    [11]                  [8,12]    -    [22]
              /        \             \               /      \            \
            [16]   -     [21]    -    [11]        [8]     -    [12]    -    [22]  
              \       /              /             \         /            /
                 [16,21]    -    [11]                  [8,12]    -    [22]
                   \            /                        \           /
                     [11,16,21]                            [8,12,22]
                                
                                     [8,11,12,16,21,22]
</pre>

b) Big-O gösterimini yazınız.

Answer b:
                  <pre>               O(nlogn)</pre>

## Binary Search Tree

### Question 1 -->  <pre>[7,5,1,8,3,6,0,9,4,2]</pre>
               
  dizisinin Binary Search Tree aşamalarını yazınız. Örnek: root x'dir. Root'un sağından y bulunur. Solunda z bulunur vb.   

#### Answer:

<pre>Root x = 6


        6
      /   \ 
     5     7
    /         \
   1           8
 /   \           \
0     3           9
    /   \      
   2     4    
</pre>
<pre>
 1:     7 > 6 için root'un sağında 7 bulunur.<br>
 2:     5 < 6 için root'un solunda 5 bulunur.<br>
 3:     1 < 6 için 1 root'un soluna eklenir.<br>
 4:     8 > 6 için 8 root'un sağına eklenir.<br>
 5:     3 < 6 için 3 root'un soluna eklenir.<br>
 6:     0 < 6 için 0 root'un soluna eklenir.<br>
 7:     9 > 6 için 9 root'un sağına eklenir.<br>
 8:     4 < 6 için 4 root'un soluna eklenir. <br>                    
 9:     2 < 6 için 2 root'un soluna eklenir.                   
  </pre>
