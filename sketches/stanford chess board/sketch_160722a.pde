int NROWS = 8;
int NCOLUMNS = 8;
size(500, 500);
for (int i = 0; i<NROWS; i++) {
  for (int z = 0; z<NCOLUMNS; z++) {
    
    if (((i+1)+(z+1))%2==0) {
      fill(255);
      rect((width/NROWS)*i, z*(height/NCOLUMNS), width/NROWS, height/NCOLUMNS);
    } else {
      fill(0);
      rect((width/NROWS)*i, z*(height/NCOLUMNS), width/NROWS, height/NCOLUMNS);
    }
   println(z);
   println(i);
  }
}

