package com.project2.project2spring.repository;

import com.project2.project2spring.entity.Mobs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MobsRepositoryTest {

    @Autowired
    private MobsRepository repository;

    public String checkFile() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/entities/mobs.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

    @Test
    public void saveMobs() throws IOException {
        String[] mobs = checkFile().split("4");
        System.out.println("*********************************************************************************");
        String[] mobsDefined = new String[4];
        int count = 0;
        for(int i=0; i <= mobs.length-1; i++){
            mobsDefined = mobs[i].split("/");
            Mobs mob = Mobs.builder()
                    .name(mobsDefined[0])
                    .url("assets/Images/Mobs/"+mobsDefined[1])
                    .status(Integer.parseInt(mobsDefined[2]))
                    .description(mobsDefined[3])
                    .build();
            repository.save(mob);
            count++;
        }
        System.out.println(count);
    }

    @Test
    public void displayAllMobs(){
        List<Mobs> mobs = repository.findAll();
        for(int i=0; i <= mobs.size()-1; i++){
            System.out.println(mobs.get(i));
        }
    }
}