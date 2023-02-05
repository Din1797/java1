// 1 Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    int randomNum(int min, int max) {
        int num = (int) (Math.random(0, 200) * ((max - min) + 1)) + min;
        return num;
    }

// 2 Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    int seniorBit(int i) {
        int binLen = Integer.toBinaryString(i).length();
        return binLen;
    }
    
// 3 Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    ArrayList<Integer> arrayMult(int i, int n, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i + 1; j <= max; j++) {
            if (j % n == 0) {
                list.add(j);
            }
        }
        return list;
    }

// 4 Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    ArrayList<Integer> arrayNotMult(int i, int n, int min) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i - 1; j >= min; j--) {
            if (j % n != 0) {
                list.add(j);
            }
        }
        return list;
    }