package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class vmj extends Drawable {
    public static final /* synthetic */ int g = 0;
    public final int a;
    public final int b;
    public final oa5 c;
    public final nrl d;
    public final zyk e;
    public Bitmap f;

    public vmj(Context context, int i, int i2, umj umjVar, oa5 oa5Var) {
        int i3;
        this.a = i;
        this.b = i2;
        this.c = oa5Var;
        boolean z = umjVar != umj.a;
        int iOrdinal = umjVar.ordinal();
        if (iOrdinal == 2) {
            i3 = 1;
        } else if (iOrdinal != 3) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970235});
            try {
                i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            i3 = 0;
        }
        nrl nrlVar = new nrl();
        nrlVar.b = z ? gjf.a(context).b(i, i3) : null;
        nrlVar.a = i3 == 1;
        this.d = nrlVar;
        this.e = z4c.b(new j3i(this, (byte) 29));
    }

    public final void a(Canvas canvas) {
        Canvas canvas2;
        bcd bcdVar = (bcd) this.d.b;
        if (bcdVar != null) {
            bcdVar.b(canvas, 0.0f, 0.0f, this.c.b);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, this.a, this.b, (Paint) this.e.getValue());
        }
        b(canvas2);
    }

    public abstract void b(Canvas canvas);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        float fWidth = getBounds().width();
        int i = this.a;
        float fHeight = getBounds().height();
        int i2 = this.b;
        canvas.scale(fWidth / i, fHeight / i2);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            int iSave = canvas.save();
            canvas.clipRect(0, 0, i, i2);
            try {
                a(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ((Paint) this.e.getValue()).setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
