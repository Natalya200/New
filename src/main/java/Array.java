
public class Array {
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArraySizeException {
        // Проверка размера массива
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4.");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {

                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {

                    try {
                        throw new MyArrayDataExcpetion("Ошибка в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                    } catch (MyArrayDataExcpetion ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        }

        return sum;
    }
}



