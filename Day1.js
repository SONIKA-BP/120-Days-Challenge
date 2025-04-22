let Person={
    name:"Sonika B P",
    age:22,
    address:{
        city:'Mandya',
        state:'Karnataka'
    },
    Details:{
        job:'Java FullStack Developer',
        company:'Google'
    },
    play:function(){
        console.log(`${this.name} is Playing...........`);
    },
    greeting:()=>{
        console.log(`I'm from ${Person.address.city}!`);
        console.log(`I'm ${Person.age} years old!`);
    }}
console.log(Person);
Person.play();
Person.greeting();
console.log("------------------------------------");
console.log(Object.keys(Person));
console.log("-------------------------------------");
let values=Object.values(Person);
console.log(values);