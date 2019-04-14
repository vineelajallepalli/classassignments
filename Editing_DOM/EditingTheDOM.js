
{/* <html>
	<body>
		<h2>Shopping List</h2>
		<ul id="list">
			<li>Ramen</li>
			<li>Coffee</li>
			<li>Poptarts</li>
			<li>Twinkies</li>
		</ul>

	</body>
</html>
Update the 'Coffee' item to say 'Fair Trade Coffee'
Remove 'Twinkies' from the list
Add an item 'Cheese Whiz'
Clear the list and programmatically add items from the array ['protein powder', 'muscle milk', 'power bars']
Add the class 'important' to the muscle milk item. */}

// const A=document.querySelector("#list");
// A.children[1].innerHTML = "Fair Trade Coffee";


//Update the 'Coffee' item to say 'Fair Trade Coffee'
const list=document.querySelector("#list");
list.children[1].innerHTML="Fair Trade Coffee";

// Remove 'Twinkies' from the list
list.children[3].remove();

//Add an item 'Cheese Whiz'
const newLI = document.createElement('li');
newLI.innerHTML = "Cheese Whiz";
list.appendChild(newLI);

// Clear the list and programmatically add items from the array
//  ['protein powder', 'muscle milk', 'power bars']
 list.innerHTML='';
var a=0;
const newlist=['protein powder', 'muscle milk', 'power bars'];
for(i=0 ;i<newlist.length ;i++){
	const newItem=document.createElement('li');
	newItem.innerHTML=newlist[i];
	list.appendChild(newItem);

}

// const newitems= ['protein powder', 'muscle milk', 'power bars'];
// for(i=0;i<=3;i++)
// list[i].innerHTML=newitems[i];

// let newChild = document.createElement('li');
// newChild.innerHTML = "cheesewiz";

// const list = document.querySelector('ul');
// list.appendChild(newChild);