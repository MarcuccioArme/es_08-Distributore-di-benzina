# es_08-Distributore-di-benzina
### Un programma che simula il funzionamento di un distributore di benzina

Dopo aver definito una classe Automobile e una classe Motocicletta,  progettare una classe di nome DistributoreBenzina, per rappresentare un distributore di carburante.

Tale classe prevede due attributi: 
- deposito, di tipo double
<br> per rappresentare la quantità di benzina presente nel serbatoio del distributore.
- euroPerLitro, di tipo double
<br> per rappresenta il prezzo della benzina, espresso in euro per litro.

La classe deve prevedere i seguenti metodi:
-  public DistributoreBenzina (double unPrezzoPerLitro) // il costruttore
<br> che imposta la quantita iniziale di benzina a zero e il prezzo al valore del parametro;
- public void rifornisci (double unaQuantita) 
<br> che rifornisce il distributore di benzina di una certo numero di litri;
- public void vendi (double euro, unaAutomobile)
<br> che vende una quantità di benzina corrispondente all'ammontare di euro pagato e che va a rifornire l'automobile passata come parametro esplicito;
- public void aggiorna (double unPrezzoPerLitro)
<br> che aggiorna il prezzo della benzina.
