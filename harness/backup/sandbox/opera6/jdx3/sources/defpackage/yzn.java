package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.Lazy;
import com.opera.android.startup.WelcomeActivity;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class yzn extends ol9 {
    public final WelcomeActivity b;
    public final mcj c;
    public final tzn d;
    public final msl e;
    public final umi f;
    public final wv1 g;
    public final wv1 h;
    public final j4c i;
    public final wv1 j;
    public final vzn k;
    public final vzn l;
    public final vzn m;
    public final wzn n;
    public final Lazy o;

    public yzn(WelcomeActivity welcomeActivity, mcj mcjVar, tzn tznVar, msl mslVar, umi umiVar, wv1 wv1Var, wv1 wv1Var2, j4c j4cVar, wv1 wv1Var3, vzn vznVar, vzn vznVar2, vzn vznVar3, wzn wznVar, Lazy lazy) {
        this.b = welcomeActivity;
        this.c = mcjVar;
        this.d = tznVar;
        this.e = mslVar;
        this.f = umiVar;
        this.g = wv1Var;
        this.h = wv1Var2;
        this.i = j4cVar;
        this.j = wv1Var3;
        this.k = vznVar;
        this.l = vznVar2;
        this.m = vznVar3;
        this.n = wznVar;
        this.o = lazy;
    }

    public final Fragment a(ClassLoader classLoader, String str) {
        b6h b6hVar = this.j.b;
        b6h b6hVar2 = this.g.b;
        Class clsC = ol9.c(classLoader, str);
        boolean zEquals = clsC.equals(o9k.class);
        mcj mcjVar = this.c;
        tzn tznVar = this.d;
        if (zEquals) {
            return new o9k((ikc) tznVar.invoke(), this.e, this.b, mcjVar);
        }
        if (clsC.equals(y8k.class)) {
            return new y8k(mcjVar, (wsf) this.h.b.get(), (ikc) tznVar.invoke());
        }
        if (clsC.equals(pdf.class)) {
            return new pdf(this.c, (orm) b6hVar2.get(), (mdf) this.i.get(), (r65) b6hVar.get(), (yl6) this.o.get());
        }
        if (!clsC.equals(x65.class)) {
            if (clsC.equals(g49.class)) {
                return new g49(this.f, (m9k) this.n.get(), (orm) b6hVar2.get());
            }
            return clsC.equals(ocg.class) ? new ocg(new Pair(1, 1)) : super.a(classLoader, str);
        }
        return new x65(this.f, (r65) b6hVar.get(), (dll) this.k.get(), new qfl(this, (byte) 29), new m2n(this, (byte) 11), true, new b1i(), false, true, false, false, false);
    }
}
