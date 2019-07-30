package pers.xy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Description
 * @Date 2019/7/12
 * @Created by xiayun
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {

    private String path = "H:\\test_upload\\springboottest\\";

    @RequestMapping("/to_upload")
    public String to_upload(){
        return "to_upload";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("head_img")MultipartFile file, HttpServletRequest request){

        String name = request.getParameter("name");
        System.out.println(name);

        String fileName = file.getOriginalFilename();
        System.out.println(fileName);

        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID() + suffixName;
        File dest = new File(path + fileName);

        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileName;

    }


}
