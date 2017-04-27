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
    List<Shape> boneco = new ArrayList<Shape>();

    public Forca() {
        boneco.add(0, new Shape() {
            @Override
            public void draw(Canvas canvas, Paint paint) {
                canvas.drawOval(50,50,50,50,paint);
            }
        });
    }

}
