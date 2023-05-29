// Switch

let type;
switch (10) {
  case 1:
    type = "Vitamin A";
    break;
  case 2:
    type = "Vitamin B";
    break;
  case 3:
    type = "Vitamin C";
    break;
  case 4:
    type = "Vitamin D";
    break;
  default:
    console.log("Invalid");
}

if (type) {
  console.log(type);
}

// FOr loop
for (var i = 0;i<10;i++){
  console.log("Whyy")
}

console.log("i" + i)

let a = {
  one:"value one",
  two:"value two",
  three:"value three",
  four:"value four",
}

a[1] // This give undefined!!!

// For-in loop is for object
for (key in a) {
  console.log(`Key: ${key} | Value: ${a[key]}`)
}

const b = "Javascript"
// For-of loop is for array
for (element of b) {
  console.log(element)
}


// While loop
let j = 0;

while(j<10) {
  console.log("In while loop " + j );
  j++;
}


// Do - While loop
let k =11;
do {
  console.log("In DO-while loop " + k );
  k++;
} while(k<10)


// Function
function average(a, b) {
  return (a+b)/2
}
console.log(average(4,5))

// Arrow Function
let avg = (a,b) => (a+b)/2;
console.log(avg(4,5))

// Array
let arr = [1,"two", true, 100];
console.log(typeof arr[3]);
console.log(arr.length);
arr[20] = "Changed VALUE";
console.log(arr)

console.log(typeof arr)
console.log(typeof NaN)
console.log(typeof null)

console.log(arr.toString())
