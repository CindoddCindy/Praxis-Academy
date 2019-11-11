var o = {
    a: 2,
    m: function() {
      return this.a + 1;
    }
  }
  
  // it should print 2
  console.log(o.a);
  
  // it return statement that this object is a function
  console.log(o.m);
  
  // it should print 3
  console.log(o.m());