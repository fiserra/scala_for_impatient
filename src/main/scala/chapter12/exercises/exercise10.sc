
def unless(condition: => Boolean)(block: => Unit) = {
  if (!condition) block
}


var x = 0

unless( x > 0) {
   x =  x + 1
}

x