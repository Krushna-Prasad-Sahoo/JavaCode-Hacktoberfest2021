import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RGB_to_Gray {

    public static void main(String [] args){

        BufferedImage img = null;
        File f = null;

        try{
            f = new File ("C:\\Users\\Elridge\\Desktop\\COLLAGE\\mountain.jpg");
            img = ImageIO.read(f);
        }catch(IOException e){
            System.out.println(e);
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
            }
        }

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int p = img.getRGB(x,y);
                int a = (p>>24)&0xff;
                int r = (p>>16)&0xff;
                int g = (p>>8)&0xff;
                int b = p&0xff;
                int avg = (r+g+b)/3;
                p = (a<<24) | (avg<<16) | (avg<<8) | avg;
                img.setRGB(x, y, p);
            }
        }


        try{
            f = new File ("C:\\Users\\Elridge\\Desktop\\COLLAGE\\mountain_gray.jpg");
            ImageIO.write(img, "jpg", f);
        }catch(IOException e){
            System.out.println(e);
        }

    }

}
