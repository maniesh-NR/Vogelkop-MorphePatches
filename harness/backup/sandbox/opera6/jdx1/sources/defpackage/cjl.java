package defpackage;

import android.graphics.Rect;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cjl implements chg {
    public final v31 a;
    public final ua7 b;
    public final k31 c;
    public boolean d;
    public Function1 e;
    public Function1 f;
    public mil g;
    public k0b h;
    public final ArrayList i;
    public final l4c j;
    public Rect k;
    public final o46 l;
    public final dfe m;
    public cbl n;

    public cjl(v31 v31Var, v31 v31Var2, k31 k31Var) {
        ua7 ua7Var = new ua7(v31Var);
        this.a = v31Var;
        this.b = ua7Var;
        this.c = k31Var;
        this.e = new bvk((byte) 26);
        this.f = new bvk((byte) 27);
        this.g = new mil(4, xjl.b, "");
        this.h = k0b.g;
        this.i = new ArrayList();
        this.j = z4c.a(f7c.c, new p7l(this, (byte) 5));
        this.l = new o46(v31Var2, ua7Var);
        this.m = new dfe(new bjl[16]);
    }

    @Override // defpackage.chg
    public final void a(mil milVar, k0b k0bVar, tmi tmiVar, lw5 lw5Var) {
        this.d = true;
        this.g = milVar;
        this.h = k0bVar;
        this.e = tmiVar;
        this.f = lw5Var;
        i(bjl.a);
    }

    @Override // defpackage.chg
    public final void b() {
        i(bjl.a);
    }

    @Override // defpackage.chg
    public final void c(mil milVar, i9f i9fVar, njl njlVar, v91 v91Var, voh vohVar, voh vohVar2) {
        o46 o46Var = this.l;
        synchronized (o46Var.c) {
            o46Var.j = milVar;
            o46Var.l = i9fVar;
            o46Var.k = njlVar;
            o46Var.m = v91Var;
            o46Var.n = vohVar;
            o46Var.o = vohVar2;
            if (o46Var.e || o46Var.d) {
                o46Var.a();
            }
        }
    }

    @Override // defpackage.chg
    public final void d() {
        this.d = false;
        this.e = new bvk((byte) 24);
        this.f = new bvk((byte) 25);
        this.k = null;
        i(bjl.b);
    }

    @Override // defpackage.chg
    public final void e(mil milVar, mil milVar2) {
        boolean z = (xjl.b(this.g.b, milVar2.b) && Intrinsics.a(this.g.c, milVar2.c)) ? false : true;
        this.g = milVar2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            soh sohVar = (soh) ((WeakReference) this.i.get(i)).get();
            if (sohVar != null) {
                sohVar.d = milVar2;
            }
        }
        o46 o46Var = this.l;
        synchronized (o46Var.c) {
            o46Var.j = null;
            o46Var.l = null;
            o46Var.k = null;
            o46Var.m = u91.c;
            o46Var.n = null;
            o46Var.o = null;
        }
        if (Intrinsics.a(milVar, milVar2)) {
            if (z) {
                ua7 ua7Var = this.b;
                int iF = xjl.f(milVar2.b);
                int iE = xjl.e(milVar2.b);
                xjl xjlVar = this.g.c;
                int iF2 = xjlVar != null ? xjl.f(xjlVar.a) : -1;
                xjl xjlVar2 = this.g.c;
                ((InputMethodManager) ((l4c) ua7Var.c).getValue()).updateSelection((v31) ua7Var.b, iF, iE, iF2, xjlVar2 != null ? xjl.e(xjlVar2.a) : -1);
                return;
            }
            return;
        }
        if (milVar != null && (!Intrinsics.a(milVar.a.b, milVar2.a.b) || (xjl.b(milVar.b, milVar2.b) && !Intrinsics.a(milVar.c, milVar2.c)))) {
            ua7 ua7Var2 = this.b;
            ((InputMethodManager) ((l4c) ua7Var2.c).getValue()).restartInput((v31) ua7Var2.b);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            soh sohVar2 = (soh) ((WeakReference) this.i.get(i2)).get();
            if (sohVar2 != null) {
                mil milVar3 = this.g;
                ua7 ua7Var3 = this.b;
                if (sohVar2.h) {
                    sohVar2.d = milVar3;
                    if (sohVar2.f) {
                        ((InputMethodManager) ((l4c) ua7Var3.c).getValue()).updateExtractedText((v31) ua7Var3.b, sohVar2.e, x1p.X(milVar3));
                    }
                    xjl xjlVar3 = milVar3.c;
                    long j = milVar3.b;
                    int iF3 = xjlVar3 != null ? xjl.f(xjlVar3.a) : -1;
                    xjl xjlVar4 = milVar3.c;
                    ((InputMethodManager) ((l4c) ua7Var3.c).getValue()).updateSelection((v31) ua7Var3.b, xjl.f(j), xjl.e(j), iF3, xjlVar4 != null ? xjl.e(xjlVar4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.chg
    public final void f() {
        i(bjl.d);
    }

    @Override // defpackage.chg
    public final void g(voh vohVar) {
        Rect rect;
        this.k = new Rect(zed.b(vohVar.a), zed.b(vohVar.b), zed.b(vohVar.c), zed.b(vohVar.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.chg
    public final void h() {
        i(bjl.c);
    }

    public final void i(bjl bjlVar) {
        this.m.c(bjlVar);
        if (this.n == null) {
            Runnable cblVar = new cbl(this, (byte) 5);
            this.c.execute(cblVar);
            this.n = cblVar;
        }
    }
}
