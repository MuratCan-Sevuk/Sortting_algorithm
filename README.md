Java'da Sıralama Algoritmaları

--Genel Bakış--

Bu Java programı, çeşitli sıralama algoritmalarını ve bir dizideki en büyük ve en küçük elemanları bulmaya yönelik yardımcı fonksiyonları uygular. Programda aşağıdaki sıralama algoritmaları bulunmaktadır:

-Bubble Sort (Kabarcık Sıralama)

-Selection Sort (Seçmeli Sıralama)

-Insertion Sort (Eklemeli Sıralama)

-Heap Sort (Maksimum ve Minimum Yığın - MaxHeap & MinHeap)

-Quick Sort (Hızlı Sıralama)

--Fonksiyonlar--

1. Max(int[] n)

Bir dizideki en büyük değeri bulur ve döndürür.

2. Min(int[] n)

Bir dizideki en küçük değeri bulur ve döndürür.

3. BubbleSort(int[] n)

Bubble Sort algoritmasını kullanarak bir diziyi sıralar.

4. SelectionSort(int[] n)

Selection Sort algoritmasını kullanarak bir diziyi sıralar.

5. InsertionSort(int[] n)

Insertion Sort algoritmasını kullanarak bir diziyi sıralar.

6. MaxHeap(int[] n)

Bir diziyi Maksimum Yığın (Max Heap) haline getirir.

7. MinHeap(int[] n)

Bir diziyi Minimum Yığın (Min Heap) haline getirir.

8. QuickSort(int[] n, int it, int is, int p)

Quick Sort algoritmasını kullanarak bir diziyi sıralar (mevcut uygulama hatalı olabilir, gözden geçirilmesi gerekebilir).

--Programı Çalıştırma--

Main.java dosyasını Java projenize kopyalayın.

Programı bir Java derleyicisi ile derleyip çalıştırın:

javac Main.java
java Main

Program, önceden tanımlanmış {3,2,5,0,1,8,7,6,9,4} dizisini (değiştirilebilir) Quick Sort ile sıralayarak çıktıyı ekrana yazdıracaktır.

--Notlar--

Quick Sort algoritmasının mevcut uygulamasında hatalar olabilir ve beklenildiği gibi çalışmayabilir.

Heap Sort fonksiyonları (MaxHeap ve MinHeap), tam anlamıyla bir sıralama işlemi yapmaz, yalnızca yığın (heap) işlemlerini gerçekleştirir.

Program, daha fazla sıralama algoritması eklenerek ve mevcut olanlar optimize edilerek geliştirilebilir.

--Lisans--

Bu proje MIT lisansı ile lisanslanmıştır. Dilediğiniz gibi kullanabilir ve geliştirebilirsiniz.

Yazar

Murat Can Sevük
