package com.itheima.test4;

public class Test {
    public static void main(String[] args) {
     /*定义一个长度为三的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
     学生的属性：学号，姓名，年龄。
     需求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
     需求2：添加完毕之后，遍历所有学生信息。
     需求3：通过id删除学生信息，
        如果存在，则删除；如果不存在，则提示删除失败。
     需求4：删除完毕之后，遍历所有学生信息。
     需求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/

//        定义一个数组
        Student[] arr = new Student[3];
//        创建对象并添加
        Student stu1 = new Student(1, "小黑", 18);
        Student stu2 = new Student(2, "小h", 19);
        Student stu3 = new Student(3, "小z", 23);
//        添加学生对象
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
//        需求1：
        Student stu4 = new Student(4, "小1", 26);

        boolean flag = contains(stu4.getId(), arr);
        if (flag) {
            System.out.println("当前id重复");
        } else {
//        存满：创建一个新数组
//        没存满：直接添加
            int num = getNum(arr);
            if (num == arr.length) {
                Student[] newArr = creatNewArr(arr);
                newArr[arr.length] = stu4;
                printArr(newArr);
            } else {
                arr[num] = stu4;
                printArr(arr);
            }
        }
//        需求3
        int index = getIndex(arr,2);
//        System.out.println(index);
        if(index>=0){
            arr[index]=null;
            printArr(arr);
        }else{
            System.out.println("当前id不存在");
        }
//需求5
        int index1 = getIndex(arr,2);
//        System.out.println(index);
        if(index1>=0){
            arr[index1].setAge(arr[index1].getAge()+1);
        }else{
            System.out.println("当前id不存在");
        }

    }

    //    找到id在数组中的索引
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    //    遍历数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " + arr[i].getAge());
            }
        }
    }

    //    创建一个新数组，长度=老数组长度+1，然后把老数组的元素拷贝到新数组中
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //    判断数组里存了多少元素
    public static int getNum(Student[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                cnt++;
            }
        }
        return cnt;
    }

    //    唯一性判断
    public static boolean contains(int id, Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (id == arr[i].getId()) {
                    return true;
                }
            }
        }
        return false;
    }


}
