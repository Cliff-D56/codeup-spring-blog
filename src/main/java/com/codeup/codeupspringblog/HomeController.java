package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/{name}")
    public String hi (@PathVariable String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
    @GetMapping("/hello")
    public String hi2 (){
//    TODO SPRING GET MAPPING AND RETURN TO MAP URL AND RETURN THAT PAGE
        return "hello";
    }
    @GetMapping("/")
    @ResponseBody
    public String hi1(){
        return "<div>\n" +
                "    <h1>Konami Code</h1>\n" +
                "    <h1>LEGO LeftRightLeftRightUpUpDownDownBAEnter</h1>\n" +
                "    <form>\n" +
                "        <button id=\"reset\">Click to reset</button>\n" +
                "    </form>\n" +
                "    <h1 id=\"count\"></h1>\n" +
                "    <form method=\"post\" action=\"/posts/create\">\n" +
                "        <button type=\"submit\">HI</button>\n" +
                "    </form>\n" +
                "</div>\n" +
                "<div id=\"papa\"></div>\n" +
                "<script src=\"https://code.jquery.com/jquery-3.7.1.min.js\" integrity=\"sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=\" crossorigin=\"anonymous\"></script>\n" +
                "<script>\n" +
                "    \"use strict\";\n" +
                "    let count=0;\n" +
                "    let code=\"\";\n" +
                "    let konami = \"3838404037393739666513\";\n" +
                "    let lego =\"3739373938384040666513\";\n" +
                " \n" +
                "\n" +
                "\n" +
                "    $(\"#reset\").on('click',function (){\n" +
                "        code = \"\";\n" +
                "        alert(`Cheat Code reseted: ${code}`)\n" +
                "    })\n" +
                "    $(document).keyup(function(event){\n" +
                "        code +=event.keyCode;\n" +
                "        $(\"#count\").text(`Keys Inputted, ${(code.length/2)}(Reset at 14)`)\n" +
                "        code.toString();\n" +
                "        count++\n" +
                "    if (count===14){\n" +
                "        alert(\"Maxed out code settings, Resumbit code\")\n" +
                "        code=\"\";\n" +
                "        count=0;\n" +
                "    }\n" +
                "        // }\n" +
                "        switch (code){\n" +
                "            case konami:\n" +
                "                $('#papa').html('<iframe width=\"100%\" height=\"680px\" src=\"https://www.youtube.com/embed/CN_DjYDHEVU?autoplay=1\"allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\"></iframe>')\n" +
                "                break;\n" +
                "            case lego:\n" +
                "                $('#papa').html('<iframe width=\"100%\" height=\"680px\" src=\"https://www.youtube.com/embed/Sc-toKMYPTc?autoplay=1\"allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\"></iframe>')\n" +
                "                break;\n" +
                "            case \"2\":\n" +
                "                $('#papa').html('<iframe width=\"100%\" height=\"680px\" src=\"https://www.youtube.com/embed/Sc-toKMYPTc?autoplay=1\"allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\"></iframe>')\n" +
                "                break;\n" +
                "            case \"3\":\n" +
                "                $('#papa').html('<iframe width=\"100%\" height=\"680px\" src=\"https://www.youtube.com/embed/Sc-toKMYPTc?autoplay=1\"allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\"></iframe>')\n" +
                "                break;\n" +
                "        }\n" +
                "    // if (code.includes(konami)){\n" +
                "    //     console.log(\"YOU'RE A CHEATER!!!!\");\n" +
                "    //     $('body').html('<iframe width=\"100%\" height=\"750px\" src=\"https://www.youtube.com/embed/Sc-toKMYPTc?autoplay=1\"allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\"></iframe>')\n" +
                "    });\n" +
                "</script>";
    }
}
