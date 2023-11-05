# patika-homeworks

## Selection-Insertion-Sort

Insertion Sort

### Question 1

[22,27,16,2,18,6]

a) Yukarıdaki verilen dizinin Insertion Sort türüne göre aşamalarını yazınız.

Answer a:<br>
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
 12: [2,6,16,18,22,27]  // 16 ile 6 yer değişti

b) Big-O gösterimini yazınız.

Answer b:<br>
O(n^2)

c) Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız.

1. Average Case: Aranan sayının ortada olması<br>
2. Worst Case: Aranan sayının sonda olması<br>
3. Best Case: Aranan sayının dizinin en başında olması

Answer c:<br>
Average Case

Selection Sort

### Question 2

[7,3,5,8,2,9,4,15,6] --> dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

Answer:<br>
 1: [2,3,5,8,7,9,4,15,6]<br>
 2: [2,3,4,8,7,9,5,15,6]<br>
 3: [2,3,4,5,7,9,8,15,6]<br>
 4: [2,3,4,5,6,9,8,15,7]<br>

 5: [2,3,4,5,6,7,8,15,9]<br>
 6: [2,3,4,5,6,7,8,9,15]


