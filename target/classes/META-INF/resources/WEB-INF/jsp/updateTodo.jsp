<%@ include file="common/header.jspf" %>
    <body>
    <%@ include file="common/navigation.jspf"%>
        <div class = "container">

            <h1> Update Task</h1>
                    <form:form modelAttribute="todo">
                      <div class="form-group mb-3">
                        <label for="Task">Task</label>
                        <form:input type="text" class="form-control" path="task"/>

                         <form:input type="hidden" class="form-control"    path="id"/>
                      </div>

                       <div class="form-group mb-3">
                            <label for="done">Done</label>
                            <form:input type="text" class="form-control"   path="done"/>
                       </div>

                       <div class="form-group mb-3">
                             <label for="date">Target Date</label>
                             <form:input type="date" class="form-control" path="date"  />
                        </div>





                      <button type="submit" class="btn btn-primary">Update</button>
                    </form:form>
        </div>

  <%@ include file = "common/footer.jspf" %>