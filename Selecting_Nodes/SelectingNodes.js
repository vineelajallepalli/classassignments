
// Get the header element
// Get all the section elements
// Get the section element with class="current"
// Get the section that comes after the current section
// Get the h2 node from the section before the 'current' section
// Get the div that contains the section that has an h2 with a class of 'highlight'
// Get all the sections that contain an H2 (using a single statement);


var headerElement = document.getElementsByTagName("header");
 console.log(headerElement);

 var section = document.getElementsByTagName("section");
 console.log(section);

var sectionCurrent= document.querySelector('section.current');
console.log(sectionCurrent);

const sectionAfterCurrent = sectionCurrent.nextElementSibling;
console.log(sectionAfterCurrent);

const h2node = sectionCurrent.previousElementSibling.querySelector('h2');
console.log(h2node);

const h2highlight = document.querySelector('h2.highlight').parentElement.parentElement;
console.log(h2highlight);

const allh2=document.querySelectorAll('h2');
console.log(allh2);