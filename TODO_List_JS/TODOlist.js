const todoList = document.querySelector(".todo-list ");
const todoInput = document.querySelector(".todolist-input");
const addListBtn = document.querySelector(".addListBtn");

addListBtn.addEventListener('click',function(){
    const newLi = document.createElement('li');
    const liCont = document.createTextNode(todoInput.value);
    newLi.appendChild(liCont);
    todoList.appendChild(newLi).addEventListener('click',function(){
        this.style.textDecoration = "line-through";
        // setTimeout(function(){
		// 	// this.remove();
        // },1000)
        this.remove();
    });
    todoInput.value='';
});

const listItems = document.querySelectorAll(".todo-list li");
for(listItem of listItems){
    //console.log(listItem);
     listItem.addEventListener('click',function(){
        this.style.textDecoration = "line-through";
    //    setTimeout(function(){
           // listItem.remove();
		// },1000);
        this.remove();
    });
}
