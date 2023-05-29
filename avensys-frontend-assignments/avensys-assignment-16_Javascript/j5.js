let a  = [1,"Hello", true,"four"];
let b = a.join("//");
console.log(b)
console.log(typeof b)

let c = a.pop(); // Mutate array
console.log(c)
console.log(a)

console.log(a.push("Added"));
console.log(a)

console.log(a.shift());
console.log(a.unshift(99));
console.log(a)

delete a[1]
console.log(a[1])

let d = ["hey",3,false]

a = a.concat(d,d)
console.log(a)


let e = [1,2,3,4,5,6,7]
let f = ['1','2','3','7','5','6','4']
// f.sort((a,b) => a-b)
f.sort()
console.log(f)


// SPlice (VERY IMPORTANT - 4 ways to use it) - Mutate the array
let g = ['1','2','3','4','5','6','7']

// Delete element starting from the index to last
g.splice(3);
console.log(g)

// Delete elements (2nd - number of elements) starting from (1st - index)
h = g.splice(2,3)
console.log(g)
// console.log(h)

// Adding element. 1st - index , 2nd - always 0, 3rd - element to add
g.splice(1,0,3)
console.log(g)

// Remove and replace (from index 4 remove 3 element and replace with the rest)
let i = [1003, "onetwothree",'true','good afternoon', 99990, false, null, NaN]
let j = i.splice(4,3,2,100,101,103)
console.log("i: " + i)
console.log("j: " + j)

// Slice -  Does not mutate array
let k = [1,2,3,4,5,6,7,8];
k.slice(2);

console.log(k)
console.log(k.slice(2)) //return array from  index to last
console.log(k.slice(3,5)) // return array between start and end index, excluding the last index


// Reverse - Mutate
k.reverse();
console.log(k);

l = ['one', 'two']
// Loop array for-of
for(el of l){
  console.log(el)
}

//forEach loop array
k.forEach(e => console.log(e));

let name = "He Xiang";

let name1 = Array.from(name);

console.log(name1)
