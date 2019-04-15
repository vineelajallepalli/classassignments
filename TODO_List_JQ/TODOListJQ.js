// Let's create a simple todo application

// Show an unordered list of todo's
// Show an input to enter a new todo
// Show a button to add a todo. When the button is clicked:
// The text from the input box is used to add a list item to the bottom of the list
// The text from the input box is cleared out.
// When the user clicks on a list item, it is removed
$(document).ready(function () {
    $(".addListBtn").on('click', function () {
        var myInptVal = $(".todolist-input").val();
        $("ul").append("<li>" + myInptVal + "</li>");
        $(".todolist-input").val("");

        $(".todo-list li").on('click', function () {
            $(this).remove();
        })
    })

    $(".todo-list li").on('click', function () {
        $(this).remove();
    })
});