public class LoopFor {
    public static void main(String[] args) {
        // Loop For em Arrays/Coleções
        String alunas[] = {"Ana", "Bela", "Isa", "Lua"};
        int notas[] = {10, 7, 8, 9};
        // Loop For
        for(int x = 1; x <= notas.length; x++){
            System.out.println("nota " + x + " = " + notas[x -1]);
            if(x == 2)
                break;
                //continue;
        }
        // Loop For Each
        for(String al : alunas){
            System.out.println("Aluna: " + al);
        }
    }
}
