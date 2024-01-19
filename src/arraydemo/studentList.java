/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author tybutler
 */
public class studentList {
    public static void main(String[] args){
        student[] studentList = new student[3];
        
        student s1 = new student(1,"John");
        
        studentList[0] = s1;
        studentList[1] = new student(2,"Bob");
        studentList[2] = new student(3, "Rob");
        
        for(int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].getsName());
        }
    }//end of main
}
