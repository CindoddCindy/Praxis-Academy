const name = "John Doe";

const concatMe = () => {
  return name + " is me.";
};

concatMe(); // "John Doe is me."

// IMPURE FUNCTION 2: Not returning any value
const divideByThree = (num) => {
  const result = num / 3;
};

dividedByThree(); // undefined

// IMPURE FUNCTION 3: Possibility to return different values for single input
const addByRandom = (num) => {
  const randomNumber = Math.floor(Math.random() * 10);
  return num + randomNumber;
};

addByRandom(3); // 5
addByRandom(3); // 7
addByRandom(3); // 9
// for num = 3, the function returns different values