package Patterns;

/**
 * Created by Tetiana_Romaniv on 9/26/2016.
 */
public class Adapter {
    public static void main (String[] args) {
        //Через наследование
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();

        //Через композицию
        VectorGraphicsInterface g2 = new VectorAdapterFromRaster();
        g2.drawLine();
        g2.drawLine();
    }
}

interface VectorGraphicsInterface{
    void drawLine();
    void drawSquare();
}

class RasterGtaphics{
    void drawRasterLine(){
        System.out.println("Draw a line");
    }
    void drawRasterSquare(){
        System.out.println("Draw a square");
    }
}

class VectorAdapterFromRaster extends RasterGtaphics implements VectorGraphicsInterface{
    public void drawLine(){
        drawRasterLine();
    };
    public void drawSquare(){
        drawRasterSquare();
    };

}

class VectorAdapterFromRaster2 implements VectorGraphicsInterface{
    RasterGtaphics raster = new RasterGtaphics();
    public void drawLine(){
        raster.drawRasterLine();
    }
    public void drawSquare(){
        raster.drawRasterSquare();
    }
}