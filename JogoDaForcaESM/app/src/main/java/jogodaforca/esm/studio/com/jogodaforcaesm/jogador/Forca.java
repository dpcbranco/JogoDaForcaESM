package jogodaforca.esm.studio.com.jogodaforcaesm.jogador;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shikado on 26/04/2017.
 */

class Forca {
    private List<Shape> boneco = new ArrayList<Shape>();

    public Forca() {
        boneco.add(0, new Shape() {
            @Override
            public void draw(Canvas canvas, Paint paint) {
                canvas.drawOval(50,50,50,50,paint);
            }
        });
        boneco.add(1, new Shape(){
            @Override
            public void draw (Canvas canvas, Paint paint){
                canvas.drawLine(-50, 0, 50, 0, paint);
            }
        });

        boneco.add(2, new Shape(){
           @Override
            public void draw (Canvas canvas, Paint paint){
               canvas.drawLine(0, 150, 0, 0, paint);
           }
        });

        boneco.add(3, new Shape(){
           @Override
            public void draw (Canvas canvas, Paint paint){
               canvas.drawLine(0, 43, 25, 0, paint);
           }
        });

        boneco.add(4, new Shape(){
            @Override
            public void draw (Canvas canvas, Paint paint){
                canvas.drawLine(0, 43, -25, 0, paint);
            }
        });
    }

    //parte = erros-1
    public void exibirParte(int parte){
        á

    }

}
