package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class rdc implements rcc, lcc {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ rdc() {
    }

    public rdc(rcc rccVar, t7i t7iVar) {
        this.b = rccVar;
        this.c = t7iVar;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    public final void a(pcc pccVar) {
        if (((pcc) this.c) == pccVar) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected state ");
        sb.append(pccVar);
        t14.h(sb, " but was ", (pcc) this.c);
    }

    @Override // defpackage.rcc
    public final void g(lcc lccVar) {
        this.b = b5j.c((Set) this.b, lccVar);
    }

    @Override // defpackage.rcc
    public final pcc getState() {
        return (pcc) this.c;
    }

    @Override // defpackage.rcc
    public final void h(lcc lccVar) {
        if (((Set) this.b).contains(lccVar)) {
            qp2.n("Already subscribed");
            return;
        }
        this.b = b5j.f((Set) this.b, lccVar);
        pcc pccVar = (pcc) this.c;
        if (pccVar.compareTo(pcc.c) >= 0) {
            lccVar.onCreate();
        }
        if (pccVar.compareTo(pcc.d) >= 0) {
            lccVar.onStart();
        }
        if (pccVar.compareTo(pcc.e) >= 0) {
            lccVar.onResume();
        }
    }

    @Override // defpackage.lcc
    public final void onCreate() {
        switch (this.a) {
            case 0:
                a(pcc.b);
                this.c = pcc.c;
                Iterator it = ((Set) this.b).iterator();
                while (it.hasNext()) {
                    ((lcc) it.next()).onCreate();
                }
                break;
            default:
                ((rcc) this.b).g(this);
                t7i t7iVar = (t7i) this.c;
                t7iVar.e.t(new ya8(t7iVar.c.c));
                break;
        }
    }

    @Override // defpackage.lcc
    public final void onDestroy() {
        switch (this.a) {
            case 0:
                a(pcc.c);
                this.c = pcc.a;
                Iterator it = CollectionsKt.Y((Set) this.b).iterator();
                while (it.hasNext()) {
                    ((lcc) it.next()).onDestroy();
                }
                this.b = v08.a;
                break;
        }
    }

    @Override // defpackage.lcc
    public final void onPause() {
        switch (this.a) {
            case 0:
                a(pcc.e);
                this.c = pcc.d;
                Iterator it = CollectionsKt.Y((Set) this.b).iterator();
                while (it.hasNext()) {
                    ((lcc) it.next()).onPause();
                }
                break;
        }
    }

    @Override // defpackage.lcc
    public final void onResume() {
        switch (this.a) {
            case 0:
                a(pcc.d);
                this.c = pcc.e;
                Iterator it = ((Set) this.b).iterator();
                while (it.hasNext()) {
                    ((lcc) it.next()).onResume();
                }
                break;
        }
    }

    @Override // defpackage.lcc
    public final void onStart() {
        switch (this.a) {
            case 0:
                a(pcc.c);
                this.c = pcc.d;
                Iterator it = ((Set) this.b).iterator();
                while (it.hasNext()) {
                    ((lcc) it.next()).onStart();
                }
                break;
        }
    }

    @Override // defpackage.lcc
    public final void onStop() {
        switch (this.a) {
            case 0:
                a(pcc.d);
                this.c = pcc.c;
                Iterator it = CollectionsKt.Y((Set) this.b).iterator();
                while (it.hasNext()) {
                    ((lcc) it.next()).onStop();
                }
                break;
        }
    }
}
