let a = "123456.7890"
console.log(typeof a)
console.log(typeof Number(a))


// Parse int will remove all number after the decimal
let b = "69 09 .989  68  2"
let c = "67.8962731234567890"
console.log(parseInt(b))
console.log(parseFloat(c))

let d = "Hello everyone";
console.log(typeof d[2]);
console.log(typeof d.charAt(2));
console.log(d.indexOf("e"));
console.log(d.lastIndexOf("e"));
console.log(d.includes("x"));


let e = "Hello";
let f = "AAH!";
let g = "Hello";
let k = "ZZZZZ";
console.log(e.localeCompare(f));

let aa = "Hi!!"
let ab = "Who are you?"
let ac = "I am John"
let ad = "No you are not!"

let ae = aa.concat(ab, ac, ad);

console.log(ae);
console.log(ae.slice(0,4));
console.log(ae.substring(0,4));

console.log(ae.slice(2));
console.log(ae.substring(2));

let l = "    Hello,    World!   "
console.log(l.toLowerCase());
console.log(l.toUpperCase());
console.log(l.trim());

console.log(l.replace("l", '*'))
console.log(l.replaceAll("l", '*'))

let m = "Hello,World!"
console.log(m.split(","));

// Operator
let z1 = 5;
let z2 = z1++;
let z3 = ++z1;
console.log(z3);

let z4 = 5;
console.log(~z4); // 5 --> -5 - 1

// Unary negation
let z5 = "asd";
console.log(~z5) // -1 (If not number, return -1)


// Bit shift
let cc = 2;
let dd = 1;
console.log(cc>>=dd);
console.log(cc>>=dd);
