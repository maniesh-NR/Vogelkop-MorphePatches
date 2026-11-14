package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class du1 {
    public static final du1 d = new du1();
    public final i3j a;
    public final f30 b;
    public n9k c;

    public du1() {
        i3j i3jVar = new i3j((byte) 1);
        this.a = i3jVar;
        this.b = new f30((byte) 5);
        synchronized (i3jVar.c) {
            i3jVar.d = this;
        }
    }

    public final void a(long j, String str) {
        hf0 hf0Var;
        hf0 hf0Var2;
        if (TextUtils.equals(str, "startup#ui")) {
            ava.a.a(new cu1(this, (byte) 0));
        }
        n9k n9kVar = this.c;
        if (n9kVar != null) {
            x5f x5fVar = (x5f) n9kVar.b;
            zpa zpaVar = x5fVar.d;
            if (n9kVar.a) {
                return;
            }
            if (str.equals("startup#core")) {
                if (x5fVar.h) {
                    x56 x56VarF = zpa.F();
                    vq0 vq0VarX = x56VarF.A(zpaVar).x(zpaVar);
                    List list = (List) vq0VarX.n(0);
                    if (list == null || list.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        vq0VarX.q(0, 1, arrayList);
                        hf0Var = new hf0(vq0VarX, 0, arrayList);
                    } else {
                        hf0Var = new hf0(vq0VarX, 0, list);
                    }
                    hf0Var.add(Long.valueOf(j));
                    x5fVar.U0(x56VarF);
                    return;
                }
                return;
            }
            if (str.equals("startup#ui") && x5fVar.h) {
                x56 x56VarF2 = zpa.F();
                vq0 vq0VarX2 = x56VarF2.A(zpaVar).x(zpaVar);
                List list2 = (List) vq0VarX2.n(1);
                if (list2 == null || list2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    vq0VarX2.q(1, 1, arrayList2);
                    hf0Var2 = new hf0(vq0VarX2, 1, arrayList2);
                } else {
                    hf0Var2 = new hf0(vq0VarX2, 1, list2);
                }
                hf0Var2.add(Long.valueOf(j));
                x5fVar.U0(x56VarF2);
            }
        }
    }

    public final void b(String str) {
        boolean zEquals = TextUtils.equals(str, "startup#ui");
        f30 f30Var = this.b;
        i3j i3jVar = this.a;
        if (zEquals) {
            ((ayl) f30Var.get()).getClass();
            i3jVar.p("startup#core");
            i3jVar.O("startup#fps");
        } else if (TextUtils.equals(str, "startup#core")) {
            ava.a.a(new cu1(this, (byte) 1));
        }
        i3jVar.O(str);
        ((ayl) f30Var.get()).getClass();
    }
}
