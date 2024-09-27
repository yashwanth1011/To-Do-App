<%@ include file="common/header.jspf" %>
    <body>
    <%@ include file="common/navigation.jspf"%>
        <div class = "container">
            <h2>${name} - To Do App</h2>



            <div "table-responsive-sm">
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">Topic</th>
                            <th scope="col">Target Date</th>
                            <th scope="col">Done</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${todosList}" var="todo">
                            <tr>
                                <td>${todo.task}</td>
                                <td>${todo.date}</td>
                                <td>${todo.done}</td>
                                <td> <a href = "delete-todo?id=${todo.id}" class = "btn btn-danger">DELETE </a> </td>
                                <td> <a href = "update-todo?id=${todo.id}" class = "btn btn-warning">UPDATE </a> </td>

                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
             <a href = "add-todo" class = "btn btn-success"> ADD TODO </a>

        </div>

<%@ include file = "common/footer.jspf" %>