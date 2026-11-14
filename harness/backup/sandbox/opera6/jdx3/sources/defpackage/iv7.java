package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class iv7 {
    public final k6l a;
    public final q6e b;
    public final lg c;
    public final pde d;
    public final pde e;
    public final pde f;
    public final pde g;
    public final pde h;
    public final tsd i;
    public boolean j;
    public final pde k;
    public int l;

    public iv7(ndc ndcVar, k6l k6lVar, q6e q6eVar, lg lgVar) {
        this.a = k6lVar;
        this.b = q6eVar;
        this.c = lgVar;
        pde pdeVar = new pde(Collections.unmodifiableList(q6eVar.a));
        this.d = pdeVar;
        pde pdeVar2 = new pde(q6eVar.b());
        this.e = pdeVar2;
        pde pdeVar3 = new pde(lgVar.b());
        this.f = pdeVar3;
        l6e l6eVarC = q6eVar.c(9223372036854775805L);
        pde pdeVar4 = new pde(l6eVarC instanceof l42 ? (l42) l6eVarC : null);
        this.g = pdeVar4;
        pde pdeVar5 = new pde(q6eVar.c(9223372036854775804L));
        this.h = pdeVar5;
        tsd tsdVar = new tsd(new hv7((List) pdeVar.g(), (eri) pdeVar2.g(), (eri) pdeVar3.g(), (l42) pdeVar4.g(), (eri) pdeVar5.g()));
        this.i = tsdVar;
        this.k = new pde(Boolean.valueOf(a()));
        final byte b = 1;
        final byte b2 = 0;
        aib.A(q6eVar, ndcVar.getLifecycle(), new kv1(this, b), new Function0(this) { // from class: fv7
            public final /* synthetic */ iv7 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b2;
                iv7 iv7Var = this.b;
                switch (b3) {
                    case 0:
                        iv7Var.d();
                        break;
                    default:
                        xf8.F0(iv7Var.f, iv7Var.c.b());
                        xf8.F0(iv7Var.k, Boolean.valueOf(iv7Var.a()));
                        break;
                }
                return Unit.a;
            }
        });
        aib.A(lgVar, ndcVar.getLifecycle(), new r85(this, (byte) 1), new Function0(this) { // from class: fv7
            public final /* synthetic */ iv7 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b;
                iv7 iv7Var = this.b;
                switch (b3) {
                    case 0:
                        iv7Var.d();
                        break;
                    default:
                        xf8.F0(iv7Var.f, iv7Var.c.b());
                        xf8.F0(iv7Var.k, Boolean.valueOf(iv7Var.a()));
                        break;
                }
                return Unit.a;
            }
        });
        ug ugVar = new ug(new Function1(this) { // from class: gv7
            public final /* synthetic */ iv7 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b2;
                iv7 iv7Var = this.b;
                switch (b3) {
                    case 0:
                        tsd tsdVar2 = iv7Var.i;
                        xf8.F0(tsdVar2, hv7.a((hv7) tsdVar2.g(), (List) obj, null, null, null, null, 30));
                        break;
                    case 1:
                        tsd tsdVar3 = iv7Var.i;
                        xf8.F0(tsdVar3, hv7.a((hv7) tsdVar3.g(), null, (eri) obj, null, null, null, 29));
                        break;
                    case 2:
                        tsd tsdVar4 = iv7Var.i;
                        xf8.F0(tsdVar4, hv7.a((hv7) tsdVar4.g(), null, null, (eri) obj, null, null, 27));
                        break;
                    case 3:
                        tsd tsdVar5 = iv7Var.i;
                        xf8.F0(tsdVar5, hv7.a((hv7) tsdVar5.g(), null, null, null, (l42) obj, null, 23));
                        break;
                    default:
                        tsd tsdVar6 = iv7Var.i;
                        xf8.F0(tsdVar6, hv7.a((hv7) tsdVar6.g(), null, null, null, null, (eri) obj, 15));
                        break;
                }
                return Unit.a;
            }
        }, (byte) 19);
        h42 h42Var = tsdVar.l;
        h42Var.s(pdeVar, ugVar);
        h42Var.s(pdeVar2, new ug(new Function1(this) { // from class: gv7
            public final /* synthetic */ iv7 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b;
                iv7 iv7Var = this.b;
                switch (b3) {
                    case 0:
                        tsd tsdVar2 = iv7Var.i;
                        xf8.F0(tsdVar2, hv7.a((hv7) tsdVar2.g(), (List) obj, null, null, null, null, 30));
                        break;
                    case 1:
                        tsd tsdVar3 = iv7Var.i;
                        xf8.F0(tsdVar3, hv7.a((hv7) tsdVar3.g(), null, (eri) obj, null, null, null, 29));
                        break;
                    case 2:
                        tsd tsdVar4 = iv7Var.i;
                        xf8.F0(tsdVar4, hv7.a((hv7) tsdVar4.g(), null, null, (eri) obj, null, null, 27));
                        break;
                    case 3:
                        tsd tsdVar5 = iv7Var.i;
                        xf8.F0(tsdVar5, hv7.a((hv7) tsdVar5.g(), null, null, null, (l42) obj, null, 23));
                        break;
                    default:
                        tsd tsdVar6 = iv7Var.i;
                        xf8.F0(tsdVar6, hv7.a((hv7) tsdVar6.g(), null, null, null, null, (eri) obj, 15));
                        break;
                }
                return Unit.a;
            }
        }, (byte) 19));
        final byte b3 = 2;
        h42Var.s(pdeVar3, new ug(new Function1(this) { // from class: gv7
            public final /* synthetic */ iv7 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b3;
                iv7 iv7Var = this.b;
                switch (b32) {
                    case 0:
                        tsd tsdVar2 = iv7Var.i;
                        xf8.F0(tsdVar2, hv7.a((hv7) tsdVar2.g(), (List) obj, null, null, null, null, 30));
                        break;
                    case 1:
                        tsd tsdVar3 = iv7Var.i;
                        xf8.F0(tsdVar3, hv7.a((hv7) tsdVar3.g(), null, (eri) obj, null, null, null, 29));
                        break;
                    case 2:
                        tsd tsdVar4 = iv7Var.i;
                        xf8.F0(tsdVar4, hv7.a((hv7) tsdVar4.g(), null, null, (eri) obj, null, null, 27));
                        break;
                    case 3:
                        tsd tsdVar5 = iv7Var.i;
                        xf8.F0(tsdVar5, hv7.a((hv7) tsdVar5.g(), null, null, null, (l42) obj, null, 23));
                        break;
                    default:
                        tsd tsdVar6 = iv7Var.i;
                        xf8.F0(tsdVar6, hv7.a((hv7) tsdVar6.g(), null, null, null, null, (eri) obj, 15));
                        break;
                }
                return Unit.a;
            }
        }, (byte) 19));
        final byte b4 = 3;
        h42Var.s(pdeVar4, new ug(new Function1(this) { // from class: gv7
            public final /* synthetic */ iv7 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b4;
                iv7 iv7Var = this.b;
                switch (b32) {
                    case 0:
                        tsd tsdVar2 = iv7Var.i;
                        xf8.F0(tsdVar2, hv7.a((hv7) tsdVar2.g(), (List) obj, null, null, null, null, 30));
                        break;
                    case 1:
                        tsd tsdVar3 = iv7Var.i;
                        xf8.F0(tsdVar3, hv7.a((hv7) tsdVar3.g(), null, (eri) obj, null, null, null, 29));
                        break;
                    case 2:
                        tsd tsdVar4 = iv7Var.i;
                        xf8.F0(tsdVar4, hv7.a((hv7) tsdVar4.g(), null, null, (eri) obj, null, null, 27));
                        break;
                    case 3:
                        tsd tsdVar5 = iv7Var.i;
                        xf8.F0(tsdVar5, hv7.a((hv7) tsdVar5.g(), null, null, null, (l42) obj, null, 23));
                        break;
                    default:
                        tsd tsdVar6 = iv7Var.i;
                        xf8.F0(tsdVar6, hv7.a((hv7) tsdVar6.g(), null, null, null, null, (eri) obj, 15));
                        break;
                }
                return Unit.a;
            }
        }, (byte) 19));
        final byte b5 = 4;
        h42Var.s(pdeVar5, new ug(new Function1(this) { // from class: gv7
            public final /* synthetic */ iv7 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b5;
                iv7 iv7Var = this.b;
                switch (b32) {
                    case 0:
                        tsd tsdVar2 = iv7Var.i;
                        xf8.F0(tsdVar2, hv7.a((hv7) tsdVar2.g(), (List) obj, null, null, null, null, 30));
                        break;
                    case 1:
                        tsd tsdVar3 = iv7Var.i;
                        xf8.F0(tsdVar3, hv7.a((hv7) tsdVar3.g(), null, (eri) obj, null, null, null, 29));
                        break;
                    case 2:
                        tsd tsdVar4 = iv7Var.i;
                        xf8.F0(tsdVar4, hv7.a((hv7) tsdVar4.g(), null, null, (eri) obj, null, null, 27));
                        break;
                    case 3:
                        tsd tsdVar5 = iv7Var.i;
                        xf8.F0(tsdVar5, hv7.a((hv7) tsdVar5.g(), null, null, null, (l42) obj, null, 23));
                        break;
                    default:
                        tsd tsdVar6 = iv7Var.i;
                        xf8.F0(tsdVar6, hv7.a((hv7) tsdVar6.g(), null, null, null, null, (eri) obj, 15));
                        break;
                }
                return Unit.a;
            }
        }, (byte) 19));
        aib.B(k6lVar.w, ndcVar, new qz(this, (byte) 6), new vme((byte) 19));
    }

    public final boolean a() {
        return this.j || this.c.b().getId() != this.b.b().getId();
    }

    public final boolean b() {
        return this.c.b().getId() == 9223372036854775805L;
    }

    public final void c(eri eriVar) {
        if (eriVar.b()) {
            q6e q6eVar = this.b;
            List listUnmodifiableList = Collections.unmodifiableList(q6eVar.a);
            if ((listUnmodifiableList instanceof Collection) && listUnmodifiableList.isEmpty()) {
                return;
            }
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                if (((eri) it.next()).getId() == eriVar.getId()) {
                    q6eVar.n(eriVar);
                    return;
                }
            }
        }
    }

    public final void d() {
        q6e q6eVar = this.b;
        xf8.F0(this.d, Collections.unmodifiableList(q6eVar.a));
        xf8.F0(this.e, q6eVar.b());
        l6e l6eVarC = q6eVar.c(9223372036854775805L);
        xf8.F0(this.g, l6eVarC instanceof l42 ? (l42) l6eVarC : null);
        xf8.F0(this.h, q6eVar.c(9223372036854775804L));
        xf8.F0(this.k, Boolean.valueOf(a()));
    }

    public final boolean e(eri eriVar, boolean z) {
        lg lgVar = this.c;
        boolean zF = z ? lgVar.f(eriVar, true, true) : lgVar.e(eriVar.getId());
        if (zF) {
            this.b.k(eriVar);
        }
        return zF;
    }

    public final void f() {
        eri eriVarC;
        b2l b2lVar = this.a.o;
        if (b2lVar != null) {
            eriVarC = this.b.c(((d7l) b2lVar).j0());
        } else {
            eriVarC = null;
        }
        if (eriVarC == null) {
            eriVarC = (eri) this.e.g();
        }
        e(eriVarC, false);
    }
}
