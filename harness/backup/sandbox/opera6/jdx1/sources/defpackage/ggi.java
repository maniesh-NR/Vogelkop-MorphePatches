package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class ggi {
    public final bfi a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public ree f;
    public ree g;
    public boolean h;

    public ggi() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.a = bfi.b();
    }

    public ggi(ggi ggiVar) {
        this.b = ggiVar.b;
        this.c = ggiVar.c;
        this.d = new Paint(ggiVar.d);
        this.e = new Paint(ggiVar.e);
        ree reeVar = ggiVar.f;
        if (reeVar != null) {
            this.f = new ree(reeVar);
        }
        ree reeVar2 = ggiVar.g;
        if (reeVar2 != null) {
            this.g = new ree(reeVar2);
        }
        this.h = ggiVar.h;
        try {
            this.a = (bfi) ggiVar.a.clone();
        } catch (CloneNotSupportedException unused) {
            this.a = bfi.b();
        }
    }
}
