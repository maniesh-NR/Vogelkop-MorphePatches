package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class oyf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public oyf(int i, int i2) {
        this.a = Color.red(i);
        this.b = Color.green(i);
        this.c = Color.blue(i);
        this.d = i;
        this.e = i2;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        int i = this.d;
        int iG = ab5.g(4.5f, -1, i);
        int iG2 = ab5.g(3.0f, -1, i);
        if (iG != -1 && iG2 != -1) {
            this.h = ab5.l(-1, iG);
            this.g = ab5.l(-1, iG2);
            this.f = true;
            return;
        }
        int iG3 = ab5.g(4.5f, -16777216, i);
        int iG4 = ab5.g(3.0f, -16777216, i);
        if (iG3 == -1 || iG4 == -1) {
            this.h = iG != -1 ? ab5.l(-1, iG) : ab5.l(-16777216, iG3);
            this.g = iG2 != -1 ? ab5.l(-1, iG2) : ab5.l(-16777216, iG4);
            this.f = true;
        } else {
            this.h = ab5.l(-16777216, iG3);
            this.g = ab5.l(-16777216, iG4);
            this.f = true;
        }
    }

    public final float[] b() {
        float[] fArr = this.i;
        if (fArr == null) {
            fArr = new float[3];
            this.i = fArr;
        }
        ab5.a(this.a, this.b, this.c, fArr);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oyf.class == obj.getClass()) {
            oyf oyfVar = (oyf) obj;
            if (this.e == oyfVar.e && this.d == oyfVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(oyf.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
