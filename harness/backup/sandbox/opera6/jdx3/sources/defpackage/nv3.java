package defpackage;

import com.opera.android.BrowserActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class nv3 implements pvk {
    public final h1b a;
    public pvk b;
    public final /* synthetic */ BrowserActivity c;

    public nv3(BrowserActivity browserActivity, ArrayList arrayList) {
        this.c = browserActivity;
        this.a = h1b.r(arrayList);
    }

    @Override // defpackage.pvk
    public final boolean a(int i) {
        ewg ewgVarH;
        gbf gbfVar = this.c.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        if (gbfVar.j.p()) {
            return false;
        }
        Iterator it = this.a.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                ewgVarH = h3.a;
                break;
            }
            Object next = it.next();
            if (((pvk) next).a(i)) {
                ewgVarH = orf.h(next);
                break;
            }
        }
        return ((pvk) ewgVarH.j()) != null;
    }

    @Override // defpackage.pvk
    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        pvk pvkVar = this.b;
        if (pvkVar == null) {
            return;
        }
        pvkVar.b(i, i2, i3, i4, i5, i6);
    }

    @Override // defpackage.pvk
    public final void c(int i, int i2, int i3, int i4, int i5, int i6) {
        pvk pvkVar = this.b;
        if (pvkVar == null) {
            return;
        }
        pvkVar.c(i, i2, i3, i4, i5, i6);
    }

    @Override // defpackage.pvk
    public final void d() {
        pvk pvkVar = this.b;
        if (pvkVar == null) {
            return;
        }
        pvkVar.d();
        this.b = null;
    }

    @Override // defpackage.pvk
    public final void e(int i, int i2, int i3) {
        ewg ewgVarH;
        Iterator it = this.a.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                ewgVarH = h3.a;
                break;
            }
            Object next = it.next();
            if (((pvk) next).a(i)) {
                ewgVarH = orf.h(next);
                break;
            }
        }
        pvk pvkVar = (pvk) ewgVarH.j();
        this.b = pvkVar;
        if (pvkVar == null) {
            return;
        }
        pvkVar.e(i, i2, i3);
    }
}
