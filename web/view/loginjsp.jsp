<%-- 
    Document   : loginjsp
    Created on : Sep 5, 2016, 5:11:24 PM
    Author     : Akhila Damsari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Untitled Document</title>
        <link href="Styles.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <header><img src="Images/web.png" width="200" height="133" alt=""/>
            <nav><a href="index.html" class="navHome">Home</a> <a class="navAnimalGlossary">AnimalGlossary</a> <a class="navTemplateLibrary">TemplateLibrary</a> <a class="navLogNoteLibrary">LogNoteLibrary</a> <a href="login.html" class="navLogin">Login</a> <a href="search.html" class="navSearch">Search </a></nav>
        </header>

        <table  align="center" cellspacing=10 cellpadding=10>
            <tr>

                <td>


                    <table width="444" height="123" border=0 align="right" cellpadding=5 cellspacing=3 >
                        <tr> <th width="70">Email </th>
                            <td width="290"><input type=text name=username size=50 maxlength=70></td>     
                        </tr>

                        <tr>
                            <th> Password</th>
                            <td><input type=text name=password size=50 maxlength=70></td>
                        </tr>

                        <tr>
                            <td colspan="2" align="center">
                                <input type=submit class="login" value="Login">
                            </td>
                        </tr>
                    </table>

                </td>


                <td>

                    <table align="right" border=0 cellspacing=3 cellpadding=5 >


                        <tr><td colspan="2" ><font size=5 class="foggotton" align="left">Forgotton your account? </font></td>
                        </tr>
                        <tr><th colspan="2" class="create" ><font size=6 align="center"> Create an Account</font></th>
                        </tr>
                        <tr>
                            <td> First Name</td>
                            <td><input type=text name=name size=50 maxlength=70></td>    
                        </tr>
                        <tr>
                            <td> Last Name</td>
                            <td><input type=text name=name size=50 maxlength=70></td>    
                        </tr>
                        <tr>
                            <td>Email-address</td>
                            <td><input type=text name=name size=50 maxlength=70></td>    
                        </tr>
                        <tr>
                            <td>Are you a?</td>
                            <td><select name=what class="drop">
                                    <option> Nature Lover</option>
                                    <option>Scientist</option>
                                </select></td>
                        </tr>
                        <tr>
                            <td> Country</td>
                            <td><input type=text name=name size=50 maxlength=70></td>    
                        </tr>
                        <tr>
                            <td> Password</td>
                            <td><input type=text name=name size=50 maxlength=70></td>    
                        </tr>
                        <tr>
                            <td> Re-enter Password</td>
                            <td><input type=text name=name size=50 maxlength=70></td>    
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="Submit" class="createAcc" value= "Create an account">

                            </td>
                        </tr>
                    </table>

                </td>

            </tr>
        </table>
        <footer>Copyrights by CURATRIX 2016</footer>
    </body>
</html>