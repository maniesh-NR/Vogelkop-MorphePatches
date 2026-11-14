package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class haj extends dz3 {
    public u7k a;
    public long b = 9205357640488583168L;

    @Override // defpackage.dz3
    public final void a(float f, long j, zg zgVar) {
        Paint paint = (Paint) zgVar.b;
        u7k u7kVar = this.a;
        if (u7kVar == null || !bpj.a(this.b, j)) {
            if (bpj.e(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                u7kVar = null;
            } else {
                u7kVar = this.a;
                if (u7kVar == null) {
                    u7kVar = new u7k();
                    this.a = u7kVar;
                }
                u7kVar.a = b(j);
                this.a = u7kVar;
                this.b = j;
            }
        }
        long jA = x7o.a.a(paint);
        long j2 = u95.b;
        if (!jgm.a(jA, j2)) {
            zgVar.D(j2);
        }
        if (!Intrinsics.a((Shader) zgVar.c, u7kVar != null ? (Shader) u7kVar.a : null)) {
            zgVar.G(u7kVar != null ? (Shader) u7kVar.a : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        zgVar.B(f);
    }

    public abstract Shader b(long j);
}
