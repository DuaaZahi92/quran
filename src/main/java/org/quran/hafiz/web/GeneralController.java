package org.quran.hafiz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 12 May, 2018
 * Time: 8:53 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Controller
@RequestMapping("/")
public class GeneralController {
    @ResponseBody
    @GetMapping
    public String ping(){
        return "OK";
    }
}
