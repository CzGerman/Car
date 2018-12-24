/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */

public class car extends eecs.Gui
{
   public static void main(String[] args)
   {
      // declare variables
      ?? c3y = ??;
      ?? c1x = ??;
      ?? s = ??;
      ?? count = ??;
      ?? step = ??;
      ?? c2y = ??;
      ?? speed = ??;
      ?? exit = ??;
      ?? nocar = ??;
      ?? cars = ??;
      ?? c2x = ??;
      ?? lives = ??;
      ??[] img = new ??[??];
      
      openGraphWindow(200,400);
      nocar = 0;
      cars = 0;
      lives = 3;
      count = 5;
      while	(1)
      {
         s = "c" + count + ".bmp";
         img[count]	= loadBitmap(s);
         count = count - 1;
         if (count == 0)	break;
      }
      speed = 5;
      c1x = 110;
      while	(1)
      {
         exit = 0;
         while	(1)
         {
            step = 5;
            while	(1)
            {
               s = lives + "/" + cars;
               setWindowTitle(s);
               count = 0;
               while	(1)
               {
                  drawImage(img[4],0,500 - step - count * 100,200,100);
                  count = count + 1;
                  if (count > 5)	break;
               }
               drawImage(img[1],c1x,100,60,90);
               if (nocar == 0)
               {
                  if (Math.random() > 0,5)
                  {
                     c2x = 110;
                  }
                  else
                  {
                     c2x = 20;
                  }
                  c2y = 500;
                  nocar = 1;
               }
               else
               {
                  c2y = c2y - speed;
                  if (c2y > 0)
                  {
                     drawImage(img[2],c2x,c2y,60,90);
                  }
                  else
                  {
                     cars = cars + 1;
                     nocar = 0;
                  }
               }
               step = step + 5 + speed;
               if (step > 100)	break;
               if (key_down("left"))
               {
                  c1x = 20;
               }
               else
               {
               }
               if (key_down("right"))
               {
                  c1x = 110;
               }
               else
               {
               }
               if (c1x == c2x && c2y < 180 && nocar == 1)
               {
                  exit = 1;
               }
               else
               {
               }
            }
            if (exit == 1)	break;
         }
         c3y = 400;
         while	(1)
         {
            drawImage(img[5],c1x,c3y + 10,70,100);
            drawImage(img[3],c1x,c3y,70,100);
            c3y = c3y - 10;
            sleep(0,1);
            if (c3y < 100)	break;
         }
         lives = lives - 1;
         nocar = 0;
         if (lives == 0)	break;
      }
   } // close main
} // close car
