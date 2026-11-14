package defpackage;

import android.content.SharedPreferences;
import com.opera.android.Lazy;

/* loaded from: classes.dex */
public final class mm6 implements w6f {
    public final ki a;
    public final Lazy b;
    public final ki c;
    public final ki d;
    public final cq5 e;
    public final oi f;
    public final h7f g = new h7f();
    public final x5f h;

    public mm6(ki kiVar, Lazy lazy, ki kiVar2, ki kiVar3, cq5 cq5Var, oi oiVar, x5f x5fVar) {
        this.a = kiVar;
        this.b = lazy;
        this.c = kiVar2;
        this.d = kiVar3;
        this.e = cq5Var;
        this.f = oiVar;
        this.h = x5fVar;
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.g.b((ly3) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.g.c((ly3) obj);
    }

    public final yl6 a() {
        return (yl6) this.b.get();
    }

    public final void b(String str, Runnable runnable) {
        ((SharedPreferences) a().c.get()).edit().putInt("resume_type", 3).putString("resume_deep_link", str).apply();
        a().e(this.f, runnable);
    }

    public final void c(vb0 vb0Var, ac0 ac0Var, String str) {
        ((yl6) this.b.get()).i(this.h, vb0Var, ac0Var, false, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r21, final defpackage.eej r22, defpackage.qim r23) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm6.e(boolean, eej, qim):void");
    }

    public final void f(sl6 sl6Var, qim qimVar, ac0 ac0Var, String str, Runnable runnable) {
        c(vb0.b, ac0Var, str);
        if (sl6Var.b()) {
            g7f g7fVar = new g7f(this.g);
            while (g7fVar.hasNext()) {
                ly3 ly3Var = (ly3) g7fVar.next();
                byte b = ly3Var.a;
                Object obj = ly3Var.b;
                switch (b) {
                    case 0:
                        ((ny3) obj).c();
                        break;
                    default:
                        ((daj) obj).g();
                        break;
                }
            }
            vml.d(new ig(this, qimVar), 200L);
        } else {
            a().getClass();
            if (tl6.a() && !a().d().c()) {
                runnable.run();
            }
        }
        a().h(this.h);
    }

    public final void g(jm6 jm6Var) {
        h(jm6Var);
        a().e(this.f, null);
    }

    public final void h(jm6 jm6Var) {
        ((SharedPreferences) a().c.get()).edit().putInt("resume_type", jm6Var.a.ordinal()).putString("resume_deep_link", jm6Var.b).apply();
    }

    public final void i() {
        nej nejVar = ((qim) this.a.b).d;
        og5 og5Var = new og5((Object) this, (byte) 1);
        nejVar.getClass();
        nejVar.b(og5Var, ijm.b);
    }
}
