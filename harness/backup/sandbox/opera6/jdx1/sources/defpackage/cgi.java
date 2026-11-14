package defpackage;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class cgi implements uei {
    public final Path a = new Path();
    public float b;
    public float c;

    public cgi(i1 i1Var) {
        if (i1Var == null) {
            return;
        }
        i1Var.s(this);
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
        this.b = f3;
        this.c = f4;
    }

    public final void b(float f, float f2) {
        this.a.moveTo(f, f2);
        this.b = f;
        this.c = f2;
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
        this.b = f5;
        this.c = f6;
    }

    public final void close() {
        this.a.close();
    }

    public final void d(float f, float f2, boolean z, boolean z2, float f3, float f4, float f5) {
        igi.e(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
        this.b = f4;
        this.c = f5;
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
        this.b = f;
        this.c = f2;
    }
}
