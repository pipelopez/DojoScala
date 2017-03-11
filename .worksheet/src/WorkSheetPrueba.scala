object WorkSheetPrueba {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  println("Welcome to the Scala worksheet");$skip(31); 
  val lista = List(1, 2, 3, 4);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(34); 
  val set = Set(1, 2, 3, 4, 5, 1);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(43); 
  val mapa = Map(1 -> "Luis", 2 -> "Juan");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(27); val res$0 = 
  lista.map { x => x + 3 };System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(53); val res$1 = 
  //La forma reducida es así lista.map{ _+3}
  lista;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(30); val res$2 = 
  lista.filter { x => x < 3 };System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(48); 

  val names = List("Juan", "Carlos", "Andres");System.out.println("""names  : List[String] = """ + $show(names ));$skip(25); val res$3 = 
  names.map { _.length };System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(77); 

  //Kata 1: de una lista capturar los pares
  val pares = List.range(1, 20);System.out.println("""pares  : List[Int] = """ + $show(pares ));$skip(30); val res$4 = 
  pares.filter { _ % 2 == 0 };System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(157); 

  //Kata 2: Encontrar los datos de una persona dado el nombre
  val megaLista = List(List("Andres", "24 years", "male"), List("Luz", "29 years", "female"));System.out.println("""megaLista  : List[List[String]] = """ + $show(megaLista ));$skip(45); val res$5 = 
  megaLista.filter { x => x(0) == "Andres" };System.out.println("""res5: List[List[String]] = """ + $show(res$5));$skip(96); 

  //Kata 3: encontrar los números primos de una lista de 1 a 20
  val list = List.range(1, 20);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(101); val res$6 = 
  list.filter { x => list.filter { y => y <= Math.sqrt(x) }.filter { z => x % z == 0 }.length == 1 };System.out.println("""res6: List[Int] = """ + $show(res$6))}

}
