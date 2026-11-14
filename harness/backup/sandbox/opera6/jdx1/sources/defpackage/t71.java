package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t71 implements chg {
    public hac a;
    public d3k b;
    public hbc c;
    public jdj d;

    @Override // defpackage.chg
    public final void a(mil milVar, k0b k0bVar, tmi tmiVar, lw5 lw5Var) {
        j(new ai(milVar, this, k0bVar, tmiVar, lw5Var, (byte) 1));
    }

    @Override // defpackage.chg
    public final void b() {
        j(null);
    }

    @Override // defpackage.chg
    public final void c(mil milVar, i9f i9fVar, njl njlVar, v91 v91Var, voh vohVar, voh vohVar2) {
        hbc hbcVar = this.c;
        if (hbcVar != null) {
            oac oacVar = hbcVar.m;
            synchronized (oacVar.c) {
                oacVar.j = milVar;
                oacVar.l = i9fVar;
                oacVar.k = njlVar;
                oacVar.m = vohVar;
                oacVar.n = vohVar2;
                if (oacVar.e || oacVar.d) {
                    oacVar.a();
                }
            }
        }
    }

    @Override // defpackage.chg
    public final void d() {
        d3k d3kVar = this.b;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.b = null;
        jdj jdjVarI = i();
        if (jdjVarI != null) {
            jdjVarI.l();
        }
    }

    @Override // defpackage.chg
    public final void e(mil milVar, mil milVar2) {
        hbc hbcVar = this.c;
        if (hbcVar != null) {
            boolean z = (xjl.b(hbcVar.h.b, milVar2.b) && Intrinsics.a(hbcVar.h.c, milVar2.c)) ? false : true;
            hbcVar.h = milVar2;
            int size = hbcVar.j.size();
            for (int i = 0; i < size; i++) {
                toh tohVar = (toh) ((WeakReference) hbcVar.j.get(i)).get();
                if (tohVar != null) {
                    tohVar.g = milVar2;
                }
            }
            oac oacVar = hbcVar.m;
            synchronized (oacVar.c) {
                oacVar.j = null;
                oacVar.l = null;
                oacVar.k = null;
                oacVar.m = null;
                oacVar.n = null;
            }
            if (Intrinsics.a(milVar, milVar2)) {
                if (z) {
                    z8b z8bVar = hbcVar.b;
                    int iF = xjl.f(milVar2.b);
                    int iE = xjl.e(milVar2.b);
                    xjl xjlVar = hbcVar.h.c;
                    int iF2 = xjlVar != null ? xjl.f(xjlVar.a) : -1;
                    xjl xjlVar2 = hbcVar.h.c;
                    z8bVar.D().updateSelection((View) z8bVar.a, iF, iE, iF2, xjlVar2 != null ? xjl.e(xjlVar2.a) : -1);
                    return;
                }
                return;
            }
            if (milVar != null && (!Intrinsics.a(milVar.a.b, milVar2.a.b) || (xjl.b(milVar.b, milVar2.b) && !Intrinsics.a(milVar.c, milVar2.c)))) {
                z8b z8bVar2 = hbcVar.b;
                z8bVar2.D().restartInput((View) z8bVar2.a);
                return;
            }
            int size2 = hbcVar.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                toh tohVar2 = (toh) ((WeakReference) hbcVar.j.get(i2)).get();
                if (tohVar2 != null) {
                    mil milVar3 = hbcVar.h;
                    z8b z8bVar3 = hbcVar.b;
                    if (tohVar2.k) {
                        tohVar2.g = milVar3;
                        if (tohVar2.i) {
                            z8bVar3.D().updateExtractedText((View) z8bVar3.a, tohVar2.h, xug.r(milVar3));
                        }
                        xjl xjlVar3 = milVar3.c;
                        long j = milVar3.b;
                        int iF3 = xjlVar3 != null ? xjl.f(xjlVar3.a) : -1;
                        xjl xjlVar4 = milVar3.c;
                        z8bVar3.D().updateSelection((View) z8bVar3.a, xjl.f(j), xjl.e(j), iF3, xjlVar4 != null ? xjl.e(xjlVar4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.chg
    public final void f() {
        r17 r17Var;
        hac hacVar = this.a;
        if (hacVar == null || (r17Var = (r17) z4o.N(hacVar, mi5.q)) == null) {
            return;
        }
        r17Var.a();
    }

    @Override // defpackage.chg
    public final void g(voh vohVar) {
        Rect rect;
        hbc hbcVar = this.c;
        if (hbcVar != null) {
            hbcVar.l = new Rect(zed.b(vohVar.a), zed.b(vohVar.b), zed.b(vohVar.c), zed.b(vohVar.d));
            if (!hbcVar.j.isEmpty() || (rect = hbcVar.l) == null) {
                return;
            }
            hbcVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.chg
    public final void h() {
        r17 r17Var;
        hac hacVar = this.a;
        if (hacVar == null || (r17Var = (r17) z4o.N(hacVar, mi5.q)) == null) {
            return;
        }
        r17Var.b();
    }

    public final xee i() {
        jdj jdjVar = this.d;
        if (jdjVar != null) {
            return jdjVar;
        }
        if (!sjk.a) {
            return null;
        }
        jdj jdjVarC = ipe.c(1, 0, h04.c, 2);
        this.d = jdjVarC;
        return jdjVarC;
    }

    public final void j(ai aiVar) {
        hac hacVar = this.a;
        if (hacVar == null) {
            return;
        }
        this.b = hacVar.n ? na2.B(hacVar.H0(), null, rx5.d, new qmb((Object) hacVar, (Object) new s71(aiVar, this, hacVar, (mt5) null, (byte) 0), (mt5) null, (byte) 3), 1) : null;
    }

    public final void k(hac hacVar) {
        hac hacVar2 = this.a;
        if (hacVar2 != hacVar) {
            d8b.c("Expected textInputModifierNode to be " + hacVar + " but was " + hacVar2);
        }
        this.a = null;
    }
}
