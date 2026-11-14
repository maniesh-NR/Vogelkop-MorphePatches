package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class guo extends gcp {
    public final eq k;
    public lzo l;
    public ne5 m;
    public d3k n;
    public boolean o;
    public boolean p;
    public boolean q;

    public guo(Context context, String str, eq eqVar) {
        pro proVar = new pro(str, sm.d, eqVar, wjo.REGULAR);
        vdp vdpVar = new vdp(proVar);
        super(context, new q5p(proVar, vdpVar, wjh.i.b(context), new wtm(context, (qro) ujp.u, vdpVar)));
        this.k = eqVar;
    }

    @Override // defpackage.pxo
    public final void a() {
        this.e = this.e.c(new cno(this, (byte) 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.z13 r26, defpackage.guo r27, defpackage.y13 r28, kotlin.jvm.functions.Function1 r29, kotlin.jvm.functions.Function2 r30) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guo.f(z13, guo, y13, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2):void");
    }

    public final void h() {
        if (!this.o && this.p && this.q) {
            this.o = true;
            this.e.f();
            p7p p7pVar = this.i;
            if (p7pVar != null) {
                LinkedHashSet linkedHashSet = p7p.c;
                p7pVar.b(null, null, null);
            }
            sxo sxoVar = this.g;
            if (sxoVar != null) {
                sxoVar.c();
            }
            uuj uujVar = this.c;
            if (uujVar != null) {
                uujVar.c();
            }
        }
    }
}
