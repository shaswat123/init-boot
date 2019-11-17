package com.init.service;

import com.init.model.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class StudentService {

    private Boolean isCacheable =Boolean.TRUE;

    @Cacheable(key="'StudentCache'+#studentRollNo",value = "ten-sec-cache"/*,condition="#isCacheable"*/ )
    public Optional<Student>getStudents(String studentRollNo) throws InterruptedException{

        Thread.sleep(4000);

       return Arrays.asList(

                new Student("Shaswat","123","1"),
                new Student("Erik","12","2"),
                new Student("Daniel","13","3"),
                new Student("Penny","14","4"),
                new Student("Sheldon","15","5"),
                new Student("Potts","16","6"),
                new Student("Cooper","17","7"),
                new Student("Leonard","18","8"),
                new Student("Raj","19","9"),
                new Student("Ram","20","10"),
                new Student("Shyam","21","11"),
                new Student("Tara","22","12"),
                new Student("Sashi","23","13"),
                new Student("Modi","24","14"),
                new Student("Ravishankar","25","15"),
                new Student("Tim","26","16"),
                new Student("Cook","27","17"),
                new Student("Jack","28","18"),
                new Student("Ryan","29","19"),
                new Student("Mike","30","20"),
                new Student("Geer","31","21"),
                new Student("Jim","32","22"),
                new Student("Walsh","33","23"),
                new Student("Teropa","34","24"),
                new Student("Plumo","35","25"),
                new Student("Mahtreo","36","26"),
                new Student("Reys","37","27"),
                new Student("Puri","38","28"),
                new Student("Sabji","39","29"),
                new Student("Feeq","40","30"),
                new Student("Des","41","31"),
                new Student("Gupta","42","32"),
                new Student("Nauy","43","33"),
                new Student("Poyu","44","34"),
                new Student("Souy","45","35"),
                new Student("Swwq","46","36"),
                new Student("Grewi","47","37"),
                new Student("Nhutr","48","38"),
                new Student("Lopi","49","39"),
                new Student("Sopi","50","40"),
                new Student("Dwq","51","41")

        )
                .stream()
                .filter(t->t.getStudentRollNo().equals(studentRollNo))
                .findFirst();

    }
}
