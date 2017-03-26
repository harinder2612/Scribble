package me.gurpreet.collabratevid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

public class PencilView extends ImageView {
    private boolean selected;
    private float density;

    public PencilView(Context context) {
        super(context);
        init();
    }

    public PencilView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PencilView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        density = getContext().getResources().getDisplayMetrics().density;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!selected) {
            return;
        }
        final Paint paint = new Paint();
        paint.setColor(0xccffffff);
        final float top = getHeight() - (12 * density);
        final float rad = 3 * density;
        canvas.drawCircle(getWidth() / 2, top, rad, paint);
    }
}
