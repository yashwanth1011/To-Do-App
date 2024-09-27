<%@ include file="common/header.jspf" %>
    <body>
      <%@ include file="common/navigation.jspf"%>
        <div class = "container">



            <h1>Add Task</h1>
            <form:form method = "post" modelAttribute="todo">
              <div class="form-group mb-4">
                      <fieldset>
                      <label for="Task">Task</label>
                      <form:input type="type" class="form-control"  placeholder="Description"  required ="required" path="task"/>
                      <form:errors path="task" cssClass="text-warning"/>

                       <form:input type="hidden" class="form-control"  placeholder="Description"  path="done"/>
                       <form:input type="hidden" class="form-control"  placeholder="Description"  path="id"/>
                       </fieldset>


                       <div class="form-group mb-3">
                          <label for="date">Target Date</label>
                          <form:input type="date" class="form-control" path="date"  />
                       </div>

              </div>




               <button type="submit" class="btn btn-success">Add</button>
            </form:form>






         </div>

 <%@ include file = "common/footer.jspf" %>