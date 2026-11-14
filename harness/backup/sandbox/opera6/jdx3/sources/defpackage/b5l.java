package defpackage;

import com.opera.android.browser.TabInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class b5l extends y08 implements j6l {
    public final s99 a;
    public final k6l b;
    public final xbf c;
    public final s4k d;
    public final LinkedHashSet e = new LinkedHashSet();

    public b5l(s99 s99Var, k6l k6lVar, xbf xbfVar, s4k s4kVar) {
        this.a = s99Var;
        this.b = k6lVar;
        this.c = xbfVar;
        this.d = s4kVar;
    }

    @Override // defpackage.j6l
    public final void H(b2l b2lVar, b2l b2lVar2, int i) {
        int iA = vep.A(i);
        if (iA != 0) {
            if (iA == 1) {
                return;
            }
            if (iA != 2) {
                h9o.p();
                return;
            }
        }
        if (b2lVar != null) {
            d7l d7lVar = (d7l) b2lVar;
            TabInfo tabInfoA = d7lVar.j.a();
            tabInfoA.getClass();
            d7lVar.s(TabInfo.a(tabInfoA, System.currentTimeMillis(), 0, 0, 13));
        }
        TabInfo tabInfoA2 = ((d7l) b2lVar2).j.a();
        tabInfoA2.getClass();
        ((d7l) b2lVar2).s(TabInfo.a(tabInfoA2, System.currentTimeMillis(), tabInfoA2.c + 1, 0, 9));
    }

    @Override // defpackage.j6l
    public final void L(b2l b2lVar, boolean z) {
        X(((d7l) b2lVar).j.a().d);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void T(b2l b2lVar, TabInfo tabInfo) {
        if (tabInfo.d != ((d7l) b2lVar).j.a().d) {
            X(tabInfo.d);
        }
    }

    public final void W(b2l b2lVar, d7l d7lVar) {
        if (d7lVar.j.a().d == 0) {
            if (((d7l) b2lVar).j.a().d == 0 && ((Boolean) this.a.invoke()).booleanValue()) {
                d7l d7lVar2 = (d7l) b2lVar;
                d7lVar2.s(TabInfo.a(d7lVar2.j.a(), 0L, 0, ((vzk) this.c.b).L(false), 7));
            }
            d7l d7lVar3 = (d7l) b2lVar;
            if (d7lVar3.j.a().d != 0) {
                d7lVar.s(TabInfo.a(d7lVar.j.a(), 0L, 0, d7lVar3.j.a().d, 7));
            }
        }
    }

    public final void X(int i) {
        if (i != 0) {
            k6l k6lVar = this.b;
            if (((ArrayList) k6lVar.d.b).contains(h6l.b)) {
                return;
            }
            this.e.add(Integer.valueOf(i));
            if (((ArrayList) k6lVar.d.b).isEmpty()) {
                vml.c(new qlk(this, (byte) 25));
            }
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void a(b2l b2lVar, d7l d7lVar) {
        W(b2lVar, d7lVar);
    }

    @Override // defpackage.j6l
    public final void k() {
        if (((ArrayList) this.b.d.b).isEmpty()) {
            vml.c(new qlk(this, (byte) 25));
        }
    }
}
