package defpackage;

import android.graphics.Shader;

/* loaded from: classes.dex */
public final class nvj extends dz3 {
    public final long a;

    public nvj(long j) {
        this.a = j;
    }

    @Override // defpackage.dz3
    public final void a(float f, long j, zg zgVar) {
        zgVar.B(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = u95.b(jB, u95.c(jB) * f);
        }
        zgVar.D(jB);
        if (((Shader) zgVar.c) != null) {
            zgVar.G(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvj)) {
            return false;
        }
        long j = ((nvj) obj).a;
        int i = u95.h;
        return jgm.a(this.a, j);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return sko.k("SolidColor(value=", u95.h(this.a), ")");
    }
}
