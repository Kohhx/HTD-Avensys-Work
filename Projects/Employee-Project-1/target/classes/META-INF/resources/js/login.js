import { TypeWriter } from "./typewriter.js";
console.log("Typewriter")
// Declare all the typewriters
// new TypeWriter("type1", { type: "alternate", interval: 60, delay:1000 }).run();
// new TypeWriter("type2", { type: "forward-backward" }).run();
// new TypeWriter("type3", { type: "forward", interval: 150,}).run();
// new TypeWriter("type4", { type: "flicker" , interval: 1}).run();

new TypeWriter("first-line", { type: "forward", interval: 100}).run();
new TypeWriter("second-line", { type: "forward", interval: 100, delay: 1000}).run();
new TypeWriter("third-line", { type: "forward", interval: 100, delay: 2000}).run();