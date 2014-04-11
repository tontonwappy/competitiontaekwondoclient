<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
    <form action="backoffice" method="post">

                 
        <h2 style="text-align:center;color:white;background-color:#6683b1;">Espace Client</h2>
        <p style="text-align:center;">Nom : <input type="text" name="login" /></p>
        <p style="text-align:center;">Prénom : <input type="password" name="pwd" /></p>
             
        <p style="text-align:center;width:50%;margin:auto;"><input type="submit" name="Valider" value="Valider"/></p>
	</form>
        <p>c'est le backoffice.</p>
        <p>
            <% 
            String attribut = (String) request.getAttribute("test");
            out.println( attribut );
            %>
        </p>
    </body>
</html>
