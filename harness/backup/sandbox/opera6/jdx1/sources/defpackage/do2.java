package defpackage;

import android.opengl.EGLSurface;

/* loaded from: classes.dex */
public final class do2 {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public do2(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            t3p.q("Null eglSurface");
            throw null;
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof do2) {
            do2 do2Var = (do2) obj;
            if (this.a.equals(do2Var.a) && this.b == do2Var.b && this.c == do2Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return p3p.k(this.c, "}", sb);
    }
}
