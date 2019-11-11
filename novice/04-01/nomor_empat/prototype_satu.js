var bird = {
    fly: true,
    color: 'brown',
  };
  
  var eagle = {};
  
  eagle.__proto__ = bird;
  
  console.log(eagle.fly);
