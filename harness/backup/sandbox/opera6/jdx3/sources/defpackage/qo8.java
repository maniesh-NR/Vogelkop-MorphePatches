package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes.dex */
public final class qo8 extends View {
    public int a;
    public short b;
    public rm c;
    public final Paint d;
    public final Paint e;
    public final Paint f;

    public qo8(Activity activity) {
        super(activity);
        this.a = 320;
        this.b = (short) 50;
        this.c = rm.BANNER_SMALL;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        paint.setColor(-7829368);
        paint2.setColor(-7829368);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(a(2));
        paint3.setColor(-12303292);
        paint3.setFakeBoldText(true);
        paint3.setTextSize(a(16));
    }

    public final int a(int i) {
        return Math.round(i * getResources().getDisplayMetrics().density);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.e);
        int iA = a(8);
        float height = getHeight() / 2.0f;
        Paint paint = this.f;
        canvas.drawText(sko.k("Mock Ad Banner (", this.c.name(), ")"), iA << 1, height - ((paint.ascent() + paint.descent()) / 2.0f), paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.a;
        short s = this.b;
        setMeasuredDimension(View.resolveSize(a(i3), i), View.resolveSize(a(s), i2));
    }
}
