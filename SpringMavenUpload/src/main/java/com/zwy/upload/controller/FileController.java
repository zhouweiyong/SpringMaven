package com.zwy.upload.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;


@RestController
public class FileController {

    @RequestMapping("/upload")
    public HashMap<String, Object> upload(MultipartFile myfile) {
        System.out.println(myfile.getOriginalFilename());
        HashMap<String, Object> map = new HashMap<>();
        try {
            File file = new File("/Users/zhouweiyong/Downloads/images/" + myfile.getOriginalFilename());
            System.out.println("file path:" + file.getAbsolutePath());
            myfile.transferTo(file);
            map.put("result", "上传成功");
        } catch (IOException e) {
            map.put("result", "上传失败");
            e.printStackTrace();
        }
        return map;
    }
}
