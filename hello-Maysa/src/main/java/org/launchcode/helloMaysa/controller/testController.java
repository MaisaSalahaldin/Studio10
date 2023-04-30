package org.launchcode.helloMaysa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class testController {
    //ROOT PATH CREATE A ROUTE THAT RETUREND A STATIC RESPONSE IN SPRING BOOT
//    @GetMapping("hi")
//
//    public String hello() {
//        return "Hello, Spring!";
//}
//
/////hello/HELLO
//@GetMapping("goodbye")
//
//    public String goodbye() {
//        return "goodbye, Spring!";
//    }
//    //DYNAMIC RESPONSE BASED ON DATA THATS PART OF REQUEST
////    @GetMapping("hello")
////    @PostMapping("hello")
//    //hello/hello
//    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "hello")
//
//    public String helloWithQueryParam(@RequestParam String name,@RequestParam String choosealanguage){
//        return createMessage(name,choosealanguage);
//                //"hello "+name +" and his language is "+choosealanguage;
//    }
//    public static String createMessage(String name,String choosealanguage){
// String greeting="";
// if(choosealanguage.equals("English"))
//     greeting= "Hello ";
// else if( choosealanguage.equals("Arabic"))
//     greeting=" Alslamo Alykom ";
// else if( choosealanguage.equals("French"))
//     greeting="Bonjour ";
//
// return   greeting+""+name;
//    }
//    //handles a request of the form /hello/maysa
//    @GetMapping("hi/{name}")
//
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hi Maysa "+name;
//    }
//
//
////befor we make the url manually but now make it
//    @GetMapping("form")
//
//    public  String helloForm(){
//        return  "<html>"+
//                "<body>"+
//                "<form action='hello' method='post'>"+
//                "<input type='text' name='name'>"+
//                 "<select name='choosealanguage'>"+
//                " <option value='English'>English</option>"+
//                " <option value='Arabic'>Arabic</option>"+
//                " <option value='French'>French</option>"+
//                "</select>"+
//                "<input type='submit' value='Greet me!'>"+
//                "</form>"+
//                "</body>" +
//                "</html>";
//    }
///////////////Studio:Skills Tracker
    @GetMapping("")
    public String SkillsLanguage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                " <h2> We have a few skills we would like to learn. Here is the list! " +
                "</h2>"+
//                "<ol> " +
//                "<li> Java </li>" +
//                "<li> Java Script </li>" +
//                "<li> Sql DataBase </li>" +
//                "<li> Html </li>" +
//                "</ol>" +
                "<table>"+
                "<tr>"+
               "<th>1.</th>"+
                "<td>Java</td>"+
              "</tr>"+
                "<tr>"+
                "<th>2.</th>"+
                "<td>Java Script</td>"+
                "</tr>"+
                "<tr>"+
                "<th>3.</th>"+
                "<td>Type Script</td>"+
                "</tr>"+
"</table>"+

                "</body>" +
                "</html>";
    }
    @RequestMapping(value = "skillsTrackerResponseForm",method = {RequestMethod.GET,RequestMethod.POST})
    public String skillsTrackerResponse(@RequestParam String name
            ,@RequestParam String choosealanguage1,@RequestParam String choosealanguage2
            ,@RequestParam String choosealanguage3){

        return "<html>" +
                "<body>" +
                "<h1>" +
                name+
                "</h1>" +
//                "<ol>" +
//                "<li > " +
//                choosealanguage1+
//                "</li>" +
//                "<li>" +
//                choosealanguage2+
//                "</li>" +
//                "<li>" +
//                choosealanguage3+
//                "</li>" +
//                "</ol>" +
                "<table>"+
                "<tr>"+
                "<th>1.</th>"+
                "<td>" +
                choosealanguage1+
                "</td>"+
                "</tr>"+
                "<tr>"+
                "<th>2.</th>"+
                "<td>" +
                choosealanguage2+
                "</td>"+
                "</tr>"+
                "<tr>"+
                "<th>3.</th>"+
                "<td>" +
                choosealanguage3+
                "</td>"+
                "</tr>"+
                "</body>" +
                "</html>";
    }
    @GetMapping("form")
    public String SkillsLanguageForm(){
        return  "<html>"+
                "<body>"+
                "<form action='skillsTrackerResponseForm' method='post'>"+
                "<label> Name </label>"+
                "<input type='text' name='name'>"+
                "<br>"+
                "<block>"+
                "<label>Choose your Favorite Languages! </label>"+
                "<br>"+
                 "<select name='choosealanguage1'>"+
                " <option value='Java'>Java</option>"+
                " <option value='JavaScript'>JavaScript</option>"+
                " <option value='TypeScript'>JavaScript</option>"+
                " <option value='Html'>Html</option>"+
                " <option value='SQLDATABASE'>SQL DATABASE</option>"+
                "</select>"+
                "</block>"+
                "<br>"+
                "<block>"+
                "<label>Choose your Second Favorite Languages!  </label>"+
                "<br>"+
                "<select name='choosealanguage2'>"+
                " <option value='Java'>Java</option>"+
                " <option value='JavaScript'>JavaScript</option>"+
                " <option value='TypeScript'>JavaScript</option>"+
                " <option value='Html'>Html</option>"+
                " <option value='SQLDATABASE'>SQL DATABASE</option>"+
                "</select>"+
                "</block>"+
                "<br>"+
                "<block>"+
                "<label>Choose your Third Favorite Languages! </label>"+
                "<br>"+
                "<select name='choosealanguage3'>"+
                " <option value='Java'>Java</option>"+
                " <option value='JavaScript'>JavaScript</option>"+
                " <option value='TypeScript'>JavaScript</option>"+
                " <option value='Html'>Html</option>"+
                " <option value='SQLDATABASE'>SQL DATABASE</option>"+
                "</select>"+
                "</block>"+
                "<br>"+
                "<input type='submit' value='Submit'>"+
                "</form>"+
                "</body>" +
                "</html>";
    }

}
