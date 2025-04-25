// Advanced Array Methods

// 1.forEach()
 let details=['sonika bp','karnataka',69000000,
    'google'];
 details.forEach((ele,index)=>{
    console.log(ele+"   -->    "+index);
 })

//  2.filter()

let students=[
    {name:"Alice",isActive:true,score:82},
    {name:"Bob",isActive:false,score:90},
    {name:"Charlie",isActive:true,score:65},
    {name:"Diana",isActive:true,score:78},
];

let res=students.filter((ele)=>{
    return ele.isActive==true && ele.score>70;
})
console.log(res);

// 3.map()

let st=["Aarav","Kruthika","Nihal","Divya"];
let resSt=st.map((ele)=>{
    return "Hello, "+ele+"!";
})
console.log(resSt);


const products=[
    {name:"Notebook",price:50,quantity:2},
    {name:"Pen",price:10,quantity:5},
    {name:"Backpack",price:100,quantity:1},
]

let proRes=products.map((ele)=>{
    return "Product: "+ele.name+", TotalPrice: "
    +ele.price*ele.quantity;
})
console.log(proRes);
