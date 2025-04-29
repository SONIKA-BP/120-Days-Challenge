// for of loop

let person={
    name:'Virat',
    age:35,
    city:'Mumbai',
    gender:'Male'
}
console.log("For in loop to access keys");
for(let key in person){
    console.log(key);
}
console.log("For in loop to access values");
for(let key in person){
    console.log(person[key]);
}
console.log("For in loop to access keys and values");
for(let key in person){
    console.log(`${key}: ${person[key]}`);
}

// for of loop
console.log("----------for of loop-----------")
let foodArr=["apple","banana","biriyani","milk","egg"];
for(let item of foodArr){
    console.log(item);
}
console.log("-------for in loop to access array elements-----");
for(let item in foodArr){
    console.log(foodArr[item]);
}
