package TestCases.IntegrationTest;

import static org.junit.Assert.assertEquals;

import Main.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Main.Subject;
import Main.fileIO;


import java.io.*;

public class WriteFileTest {
    Subject subject;


    @Test
    void test1() throws IOException {
        String subName = "Networks Course", subCode = "CSE333";
        String subFM = "100";
        String s1_name = "mark ashraf", s2_name = "samir";
        String s1_num = "12345678", s2_num = "87654321";
        int s1_am = 10, s2_am = 9;
        int s1_pm = 10, s2_pm = 8;
        int s1_mt = 20, s2_mt = 18;
        int s1_fm = 60, s2_fm = 55;

        subject = new Subject(subName, subCode, 100);

        Student testStudent1 = new Student(s1_name, s1_num, s1_am, s1_pm, s1_mt, s1_fm);
        Student testStudent2 = new Student(s2_name, s2_num, s2_am, s2_pm, s2_mt, s2_fm);

        subject.addStudent(testStudent1);
        subject.addStudent(testStudent2);

        fileIO.writeFile(subject);

        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line = "x";
        String actualSubName = null, actualMaxMark = null;

        for (int i = 0; line != null; i++) {
            line = reader.readLine();
            String actualName = "";
            String actualCode = "";
            String actualGPA = "";
            String actualGrade = "";
            if (i == 0) {
                actualSubName = line.substring(line.indexOf(':') + 2, line.indexOf("Max mark") - 1);
                actualMaxMark = line.substring(line.lastIndexOf(':') + 2);
                assertEquals(subName, actualSubName);
                assertEquals(subFM, actualMaxMark);

            } else if (i == 1) {
                assertEquals("Student name Student number GPA Grade", line);
            } else if (i == 2) {
                String[] current = line.split(" ");
                for (String s : current) {
                    if (Character.isAlphabetic(s.charAt(0))) {
                        actualName += s;
                        actualName += " ";
                    } else break;
                }
                actualName = actualName.substring(0, actualName.length() - 1);
                actualCode = line.substring(line.indexOf(actualName) + actualName.length() + 1, line.indexOf(actualName) + actualName.length() + 9);
                actualGPA += line.substring(line.indexOf(actualCode) + actualCode.length() + 1, line.lastIndexOf(' '));
                actualGrade += line.substring(line.lastIndexOf(' ') + 1);

                assertEquals(s1_name, actualName);
                assertEquals(s1_num, actualCode);
                int sum = s1_am + s1_mt + s1_fm + s1_pm;
                Assertions.assertEquals(Student.calculateGPA(sum), Double.parseDouble(actualGPA), 0);
                assertEquals(Student.calculateGrade(sum), actualGrade);
            } else if (i == 3) {
                String[] current = line.split(" ");
                for (String s : current) {
                    if (Character.isAlphabetic(s.charAt(0))) actualName += s + " ";
                    else break;
                }
                actualName = actualName.substring(0, actualName.length() - 1);
                actualCode = line.substring(line.indexOf(actualName) + actualName.length() + 1, line.indexOf(actualName) + actualName.length() + 9);
                actualGPA += line.substring(line.indexOf(actualCode) + actualCode.length() + 1, line.lastIndexOf(' '));
                actualGrade += line.substring(line.lastIndexOf(' ') + 1);

                assertEquals(s2_name, actualName);
                assertEquals(s2_num, actualCode);
                int sum = s2_am + s2_mt + s2_fm + s2_pm;
                Assertions.assertEquals(Student.calculateGPA(sum), Double.parseDouble(actualGPA), 0);
                assertEquals(Student.calculateGrade(sum), actualGrade);
            }
        }
        reader.close();
    }

    @Test
    void test2() throws IOException {
        String subName = "Very Long Course Name", subCode = "ABC123";
        String subFM = "100";
        String s1_name = "Long Student Name", s2_name = "short";
        String s1_num = "12345678", s2_num = "87654321";
        int s1_am = 7, s2_am = 5;
        int s1_pm = 8, s2_pm = 5;
        int s1_mt = 18, s2_mt = 15;
        int s1_fm = 55, s2_fm = 55;

        subject = new Subject(subName, subCode, 100);

        Student testStudent1 = new Student(s1_name, s1_num, s1_am, s1_pm, s1_mt, s1_fm);
        Student testStudent2 = new Student(s2_name, s2_num, s2_am, s2_pm, s2_mt, s2_fm);

        subject.addStudent(testStudent1);
        subject.addStudent(testStudent2);

        fileIO.writeFile(subject);

        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line = "x";
        String actualSubName = null, actualMaxMark = null;


        for (int i = 0; line != null; i++) {
            line = reader.readLine();
            String actualName = "";
            String actualCode = "";
            String actualGPA = "";
            String actualGrade = "";

            if (i == 0)
            {
                actualSubName = line.substring(line.indexOf(':') + 2, line.indexOf("Max mark") - 1);
                actualMaxMark = line.substring(line.lastIndexOf(':') + 2);
                assertEquals(subName, actualSubName);
                assertEquals(subFM, actualMaxMark);

            }
            else if (i == 1) assertEquals("Student name Student number GPA Grade", line);


            else if (i == 2) {
                String[] current = line.split(" ");
                for (String s : current) {
                    if (Character.isAlphabetic(s.charAt(0))) actualName += s + " ";
                    else break;
                }
                actualName = actualName.substring(0, actualName.length() - 1);
                actualCode = line.substring(line.indexOf(actualName) + actualName.length() + 1, line.indexOf(actualName) + actualName.length() + 9);
                actualGPA += line.substring(line.indexOf(actualCode) + actualCode.length() + 1, line.lastIndexOf(' '));
                actualGrade += line.substring(line.lastIndexOf(' ') + 1);
                int sum = s1_am + s1_mt + s1_fm + s1_pm;

                

                assertEquals(s1_name, actualName);
                assertEquals(s1_num, actualCode);
                Assertions.assertEquals(Student.calculateGPA(sum), Double.parseDouble(actualGPA), 0);
                assertEquals(Student.calculateGrade(sum), actualGrade);
            }



            else if (i == 3) {
                String[] current = line.split(" ");
                for (String s : current) {
                    if (Character.isAlphabetic(s.charAt(0))) actualName += s + " ";
                    else break;
                }
                actualName = actualName.substring(0, actualName.length() - 1);
                actualCode = line.substring(line.indexOf(actualName) + actualName.length() + 1, line.indexOf(actualName) + actualName.length() + 9);
                actualGPA += line.substring(line.indexOf(actualCode) + actualCode.length() + 1, line.lastIndexOf(' '));
                actualGrade += line.substring(line.lastIndexOf(' ') + 1);
                int sum = s2_am + s2_mt + s2_fm + s2_pm;


                assertEquals(s2_name, actualName);
                assertEquals(s2_num, actualCode);
                Assertions.assertEquals(Student.calculateGPA(sum), Double.parseDouble(actualGPA), 0);
                assertEquals(Student.calculateGrade(sum), actualGrade);
            }
        }

        reader.close();
    }
}

