a = 30;
console.log(a)
b = 40.44;
console.log(b)
c = 30/5;
console.log(c)
d = 0xff;
console.log(d) // 255
e = 0/0;
console.log(e) //NAN

let f = "hello";
console.log(f)
console.log(`Third Char : ${f[3]}`)

let g = true;
console.log(g)
console.log(typeof g)


let h = Symbol("id");
console.log(h)
console.log(typeof h)

let i = 100n + 200n;
console.log(i)
console.log(typeof i)

let ar1 = [1,2,"abcd", true, 500n, Symbol("id"), 0xff];
console.log(ar1);

let obj1 = {
    name: "john",
    job: "dev",
}

console.log(obj1["name"].split(""));

function f1() {
  console.log(this);
}

f1();

const f2 = () => {
  console.log(this);
}

f2();

const j = 55 + "100";
console.log(j);
const k = "55" + 100;
console.log(k);

const l = "55" * 100;
console.log(l);

const m = 100 * "55";
console.log(m);

const n = "Hello" * 55;
console.log(n);
isNaN(n) && console.log("n is not a number");


let o = 1000000;
console.log(typeof o);
console.log(typeof o.toString());

let p = 1234567890;
console.log(p.toExponential(2)); // 1.23e+9
console.log(typeof p.toExponential()); // string
console.log(p.toFixed(4)); // 1234567890.0000
console.log(p.toPrecision(2)); // 1.2e+9
console.log(typeof p.toFixed());
