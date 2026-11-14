package defpackage;

import J.N;
import android.text.TextUtils;
import com.leanplum.internal.Clock;
import com.opera.android.browser.chromium.TurboDelegate;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class w1 implements mo7 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final no7 d;

    public w1(dj9 dj9Var, x5f x5fVar, hd hdVar) {
        this.d = dj9Var;
        this.b = x5fVar;
        this.c = hdVar;
    }

    public w1(v1 v1Var, TurboDelegate turboDelegate, x5f x5fVar, hd hdVar) {
        this.d = v1Var;
        this.b = x5fVar;
        this.c = hdVar;
    }

    public w1(xnh xnhVar, lzj lzjVar, ox3 ox3Var) {
        this.d = xnhVar;
        this.b = lzjVar;
        this.c = ox3Var;
        xnhVar.F(this);
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        byte b = this.a;
        Object obj = this.c;
        no7 no7Var = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                v1 v1Var = (v1) no7Var;
                if (v1Var.y()) {
                    String strX = v1Var.x();
                    if (!TextUtils.isEmpty(strX)) {
                        x5f x5fVar = (x5f) obj2;
                        zpa zpaVar = x5fVar.d;
                        x56 x56VarF = zpa.F();
                        x56VarF.M(zpaVar).x(0, strX);
                        x5fVar.U0(x56VarF);
                        hd hdVar = (hd) obj;
                        if (hdVar.b) {
                            n9a n9aVar = (n9a) hdVar.d;
                            w56 w56VarO = n9a.o();
                            ((tn0) new bk0(n9aVar, w56VarO).c.getValue()).a.x(0, strX);
                            if (!((mgh) hdVar.g).c(w56VarO)) {
                                new rml(Unit.a, (umi) hdVar.c).a(new o5f(hdVar, (byte) 18)).m((qie) hdVar.f);
                            }
                        }
                        N.M4C08WKl("abgroup", strX);
                        N.MdrkO_AS();
                        break;
                    }
                }
                break;
            case 1:
                cj9 cj9Var = (cj9) ((dj9) no7Var).i();
                boolean zIsEmpty = cj9Var.isEmpty();
                String str = cj9Var.a;
                String str2 = cj9Var.b;
                if (!zIsEmpty) {
                    x5f x5fVar2 = (x5f) obj2;
                    String str3 = cj9Var.d;
                    String str4 = cj9Var.e;
                    int i = cj9Var.c;
                    zpa zpaVar2 = x5fVar2.d;
                    x56 x56VarF2 = zpa.F();
                    ls0 ls0VarM = x56VarF2.M(zpaVar2);
                    if (str2 != null) {
                        ls0VarM.x(2, str2);
                    }
                    if (str != null) {
                        ls0VarM.x(3, str);
                    }
                    if (str3 != null) {
                        ls0VarM.x(4, str3);
                    }
                    if (str4 != null) {
                        ls0VarM.x(5, str4);
                    }
                    long j = i;
                    byte b2 = 7;
                    ls0VarM.p(7, 1, j);
                    x5fVar2.U0(x56VarF2);
                    hd hdVar2 = (hd) obj;
                    if (hdVar2.b) {
                        if (str2 != null || str != null) {
                            hdVar2.t(new e5f(str2, str, b2));
                            break;
                        }
                    }
                }
                break;
            default:
                lzj lzjVar = (lzj) obj2;
                if (!((wnh) ((xnh) no7Var).i()).b(1)) {
                    lzjVar.a(true);
                    break;
                } else {
                    Long l = (Long) ((ox3) obj).get();
                    if (l != null && System.currentTimeMillis() <= l.longValue() + Clock.DAY_MILLIS) {
                        lzjVar.a(false);
                        break;
                    }
                }
                break;
        }
    }
}
