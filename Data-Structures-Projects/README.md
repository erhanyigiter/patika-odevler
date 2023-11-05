# patika-homeworks

## Selection-Insertion-Sort

Insertion Sort

### Question 1

[22,27,16,2,18,6]

a) Yukarıdaki verilen dizinin Insertion Sort türüne göre aşamalarını yazınız.

Answer a:<br>
' Step 1: [22,27,16,2,18,6]   // 22 zaten 27'den küçük olduğu için hiç bir sıralama yapılmadı<br>
Step 2: [22,16,27,2,18,6]   // 27 ile 16 yer değişti<br>
Step 3: [16,22,27,2,18,6]   // 22 ile 16 yer değişti<br>
Step 4: [16,22,2,27,18,6]   // 27 ile 2 yer değişti<br>
Step 5: [16,2,22,27,18,6]   // 22 ile 2 yer değişti<br>
Step 6: [2,16,22,27,18,6]   // 16 ile 2 yer değişti<br>
Step 7: [2,16,22,18,27,6]   // 27 ile 18 yer değişti<br>
Step 8: [2,16,18,22,27,6]   // 22 ile 18 yer değişti<br>
Step 9: [2,16,18,22,6,27]   // 27 ile 6 yer değişti<br>
Step 10: [2,16,18,6,22,27]  // 22 ile 6 yer değişti<br>
Step 11: [2,16,6,18,22,27]  // 18 ile 6 yer değişti<br>
Step 12: [2,6,16,18,22,27]  // 16 ile 6 yer değişti '

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
Step 1: [2,3,5,8,7,9,4,15,6]<br>
Step 2: [2,3,4,8,7,9,5,15,6]<br>
Step 3: [2,3,4,5,7,9,8,15,6]<br>
Step 4: [2,3,4,5,6,9,8,15,7]<br>

Step 5: [2,3,4,5,6,7,8,15,9]<br>
Step 6: [2,3,4,5,6,7,8,9,15]
