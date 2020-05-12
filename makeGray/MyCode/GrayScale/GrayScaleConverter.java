
/**
 * Décrivez votre classe GrayScaleConverter ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

import edu.duke.*;

public class GrayScaleConverter {
    // Create a method that calls the input image
    public ImageResource makeGray(ImageResource inputImage){
       // Make a blank image of the same size
       ImageResource outputImage = new ImageResource(inputImage.getWidth() , inputImage.getHeight());
       // iterate over each pixel in output image
       for(Pixel pixel : outputImage.pixels() ){
          // look at the corresponind pixel in inputImage
          Pixel inputPixel = inputImage.getPixel(pixel.getX(), pixel.getY());
          //compute inpuPixel's red + inpuPexxel's blue + inpuPixel's green
          int average = (inputPixel.getRed() + inputPixel.getBlue() + inputPixel.getGreen() ) / 3 ;
          // set output pixel's red to average
          pixel.setRed(average);
          // set output pixel's blue to average
          pixel.setBlue(average);
          // set output pixel's green to average
          pixel.setGreen(average);

       }
       // return our out image
       return outputImage;
    }
    public void testGray(){
       ImageResource ir = new ImageResource();
       ImageResource gray = makeGray(ir);
       gray.draw();
    
    }
    
    
    
    
    
    
    

}
