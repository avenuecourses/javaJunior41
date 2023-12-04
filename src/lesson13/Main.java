package lesson13;

public class Main {
    public static void main(String[] args) {
        double[][] numsForA = {{3, 5, 7, 8},
                               {1, 3, 6, 8},
                               {2, 4, 6, 8}};
        Matrix a = new Matrix(numsForA);
        System.out.println(a.getRows());
        System.out.println(a.getColumns());
        System.out.println(a.getValueAt(0, 0));
        a.setValueAt(0,0,9);
        System.out.println(a.getValueAt(0,0));

        double[][] numsForB = {{6, 6, 6, 7},
                               {5, 5, 5, 6},
                               {4, 4, 4, 5}};
        Matrix b = new Matrix(numsForB);

        // неявный параметр - а (внутри метода доступно по this)
        // явный параметр - b (внутри метода доступен otherMatrix)
        IMatrix resultAdd = a.add(b);

        resultAdd.printToConsole();
        System.out.println("---------------");
        a.printToConsole();
        a.determinant();

    }
}
