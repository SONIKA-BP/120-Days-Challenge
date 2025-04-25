// sort()
const students=[
        {name:"Ravi",marks:82},
        {name:"Anitha",marks:91},
        {name:"Vikram",marks:76},
        {name:"Divya",marks:89}
    ];

    let sortedArr=students.sort((a,b)=>{
        return a.marks-b.marks;
    })
console.log(sortedArr);

// reduce()
const cart=[
        {name:"Shirt",price:1200},
        {name:"Jeans",price:2500},
        {name:"Shoes",price:3000},
        {name:"Watch",price:1500}
    ];
let totalPrice=cart.reduce((prev,curr)=>{
    return prev+curr.price;
},0)
console.log("Total Cart Price: "+totalPrice);