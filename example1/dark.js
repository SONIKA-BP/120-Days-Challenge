let btn=document.getElementById("btn");
let body=document.body;

btn.addEventListener('click',()=>{
    body.classList.toggle('dark-mode');
    btn.textContent = 
body.classList.contains('dark-mode') ? '☀️' : '🌙';
})