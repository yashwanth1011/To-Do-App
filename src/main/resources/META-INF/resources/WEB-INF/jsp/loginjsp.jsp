<%@ include file="common/header.jspf" %>
   <body>

        <center> <h1> Login Form </h1> </center>
        <pre> ${errorMessage}</pre>





        <div class = "container">
           <form method = "post">
             <div class="mb-3">
               <label for="exampleInputEmail1" class="form-label">Name</label>
               <input type="text" class="form-control" id="exampleInputEmail1" name = "name" >

             </div>
             <div class="mb-3">
               <label for="exampleInputPassword1" class="form-label">Password</label>
               <input type="password" class="form-control" id="exampleInputPassword1" name = "password">
             </div>

             <button type="submit" class="btn btn-primary">Login</button>
           </form>
          </div>



<%@ include file = "common/footer.jspf" %>