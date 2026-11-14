package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x2l extends dt1 implements d4a {
    public static final o2l r;
    public static final o2l s;
    public static final nv6 t;
    public final pde e;
    public final k6l f;
    public final u4l g;
    public final s9i h;
    public final pde i;
    public final ypd j;
    public final t5l k;
    public p2l l = p2l.a;
    public final h5k m;
    public final tsd n;
    public o2l o;
    public final w2l p;
    public final qz q;

    static {
        l08 l08Var = l08.a;
        r = new o2l(l08Var, l08Var, new z6l(), p6l.a);
        s = new o2l(l08Var, l08Var, new z6l(), p6l.b);
        t = new nv6(new bvk((byte) 2));
    }

    public x2l(pde pdeVar, k6l k6lVar, u4l u4lVar, pde pdeVar2, s9i s9iVar, pde pdeVar3, pde pdeVar4, final pde pdeVar5, ypd ypdVar, ikc ikcVar, ikc ikcVar2, t5l t5lVar, final s5l s5lVar, v8a v8aVar, yqa yqaVar) {
        o2l o2lVar;
        this.e = pdeVar;
        this.f = k6lVar;
        this.g = u4lVar;
        this.h = s9iVar;
        this.i = pdeVar4;
        this.j = ypdVar;
        this.k = t5lVar;
        h5k h5kVar = new h5k();
        h5kVar.d = this;
        h5kVar.b = new jri(h5kVar, this, (byte) 22);
        h5kVar.c = new vl9();
        this.m = h5kVar;
        final byte b = 0;
        final byte b2 = 1;
        final byte b3 = 2;
        byte b4 = 4;
        this.n = xf8.B(new wnm(null, Arrays.asList(pdeVar2, pdeVar5, ikcVar, ikcVar2, pdeVar3), new n12(pdeVar2, pdeVar5, ikcVar, ikcVar2, pdeVar3, (byte) 2), new kkc(new er9() { // from class: c2l
            public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return new s2l((u3l) obj, (b3c) obj2, ((Boolean) s5lVar.invoke()).booleanValue(), (Set) obj3, (p6l) obj4, (i) obj5);
            }
        }, pdeVar2, pdeVar5, ikcVar, ikcVar2, pdeVar3)));
        int iOrdinal = ((p6l) ikcVar2.g()).ordinal();
        if (iOrdinal == 0) {
            o2lVar = r;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                throw null;
            }
            o2lVar = s;
        }
        this.o = o2lVar;
        this.p = new w2l(this, pdeVar5);
        byte b5 = 28;
        this.q = new qz(this, b5);
        setHasStableIds(true);
        h58 h58Var = b3c.i;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            final b3c b3cVar = (b3c) w4VarE.next();
            J(u2l.class, new vdi(this, b3cVar, yqaVar, (byte) 7), new gpk((byte) 10), new zjj() { // from class: e2l
                @Override // defpackage.zjj
                public final boolean accept(Object obj) {
                    byte b6 = b;
                    b3c b3cVar2 = b3cVar;
                    pde pdeVar6 = pdeVar5;
                    switch (b6) {
                        case 0:
                            if (pdeVar6.g() == b3cVar2) {
                                break;
                            }
                            break;
                        case 1:
                            if (pdeVar6.g() == b3cVar2) {
                                break;
                            }
                            break;
                        default:
                            if (pdeVar6.g() == b3cVar2) {
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
        }
        yqa yqaVar2 = yqaVar;
        h58 h58Var2 = b3c.i;
        w4 w4VarE2 = sko.e(h58Var2, h58Var2);
        while (w4VarE2.hasNext()) {
            final b3c b3cVar2 = (b3c) w4VarE2.next();
            J(l2l.class, new vdi(this, b3cVar2, v8aVar, (byte) 8), new gpk((byte) 11), new zjj() { // from class: e2l
                @Override // defpackage.zjj
                public final boolean accept(Object obj) {
                    byte b6 = b2;
                    b3c b3cVar22 = b3cVar2;
                    pde pdeVar6 = pdeVar5;
                    switch (b6) {
                        case 0:
                            if (pdeVar6.g() == b3cVar22) {
                                break;
                            }
                            break;
                        case 1:
                            if (pdeVar6.g() == b3cVar22) {
                                break;
                            }
                            break;
                        default:
                            if (pdeVar6.g() == b3cVar22) {
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
        }
        v8a v8aVar2 = v8aVar;
        h58 h58Var3 = b3c.i;
        w4 w4VarE3 = sko.e(h58Var3, h58Var3);
        while (w4VarE3.hasNext()) {
            final b3c b3cVar3 = (b3c) w4VarE3.next();
            J(g2l.class, new ws1(this, b3cVar3, v8aVar2, yqaVar2, (byte) 15), new gpk((byte) 13), new zjj() { // from class: e2l
                @Override // defpackage.zjj
                public final boolean accept(Object obj) {
                    byte b6 = b3;
                    b3c b3cVar22 = b3cVar3;
                    pde pdeVar6 = pdeVar5;
                    switch (b6) {
                        case 0:
                            if (pdeVar6.g() == b3cVar22) {
                                break;
                            }
                            break;
                        case 1:
                            if (pdeVar6.g() == b3cVar22) {
                                break;
                            }
                            break;
                        default:
                            if (pdeVar6.g() == b3cVar22) {
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            v8aVar2 = v8aVar;
            yqaVar2 = yqaVar;
        }
        J(h2l.class, new gpk((byte) 12), new gpk((byte) 14), new a3j(b4));
        J(i2l.class, new gpk((byte) 15), new gpk((byte) 16), new a3j(b4));
        J(k2l.class, new yjj(this) { // from class: f2l
            public final /* synthetic */ x2l b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b6 = b;
                x2l x2lVar = this.b;
                switch (b6) {
                    case 0:
                        return new c38(new d21(viewGroup.getContext(), x2lVar.e, x2lVar.i));
                    case 1:
                        int i = b38.d;
                        ypd ypdVar2 = x2lVar.j;
                        Object objN = j7c.n(viewGroup, 2131559415, viewGroup, false);
                        if (objN != null) {
                            return new b38((StylingImageButton) objN, ypdVar2);
                        }
                        t3p.q("rootView");
                        return null;
                    default:
                        return new nwj(new mwj(viewGroup.getContext(), x2lVar.e, x2lVar.i));
                }
            }
        }, new gpk((byte) 17), new a3j(b4));
        J(j2l.class, new yjj(this) { // from class: f2l
            public final /* synthetic */ x2l b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b6 = b2;
                x2l x2lVar = this.b;
                switch (b6) {
                    case 0:
                        return new c38(new d21(viewGroup.getContext(), x2lVar.e, x2lVar.i));
                    case 1:
                        int i = b38.d;
                        ypd ypdVar2 = x2lVar.j;
                        Object objN = j7c.n(viewGroup, 2131559415, viewGroup, false);
                        if (objN != null) {
                            return new b38((StylingImageButton) objN, ypdVar2);
                        }
                        t3p.q("rootView");
                        return null;
                    default:
                        return new nwj(new mwj(viewGroup.getContext(), x2lVar.e, x2lVar.i));
                }
            }
        }, new gpk((byte) 18), new a3j(b4));
        J(r2l.class, new yjj(this) { // from class: f2l
            public final /* synthetic */ x2l b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b6 = b3;
                x2l x2lVar = this.b;
                switch (b6) {
                    case 0:
                        return new c38(new d21(viewGroup.getContext(), x2lVar.e, x2lVar.i));
                    case 1:
                        int i = b38.d;
                        ypd ypdVar2 = x2lVar.j;
                        Object objN = j7c.n(viewGroup, 2131559415, viewGroup, false);
                        if (objN != null) {
                            return new b38((StylingImageButton) objN, ypdVar2);
                        }
                        t3p.q("rootView");
                        return null;
                    default:
                        return new nwj(new mwj(viewGroup.getContext(), x2lVar.e, x2lVar.i));
                }
            }
        }, new gpk((byte) 9), new a3j(b4));
        a26.U(this.f, this.e, this.p, new Function0(this) { // from class: d2l
            public final /* synthetic */ x2l b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b6 = b;
                x2l x2lVar = this.b;
                switch (b6) {
                    case 0:
                        x2lVar.m.f();
                        break;
                    default:
                        x2lVar.m.f();
                        break;
                }
                return Unit.a;
            }
        });
        a26.U(this.f.s, this.e, this.q, new Function0(this) { // from class: d2l
            public final /* synthetic */ x2l b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b6 = b2;
                x2l x2lVar = this.b;
                switch (b6) {
                    case 0:
                        x2lVar.m.f();
                        break;
                    default:
                        x2lVar.m.f();
                        break;
                }
                return Unit.a;
            }
        });
        a26.T(this.n, this.e, new qzg(this, b5));
    }

    public final void P(Runnable runnable) {
        h5k h5kVar = this.m;
        ((vl9) h5kVar.c).a(runnable);
        if (h5kVar.a || !Intrinsics.a(((x2l) h5kVar.d).e.g(), ng.a)) {
            return;
        }
        h5kVar.f();
    }

    @Override // defpackage.d4a
    public final e4a getItem(int i) {
        return (e4a) ((ArrayList) this.d).get(i);
    }

    @Override // defpackage.dt1
    public final long getItemId(int i) {
        return ((m2l) ((ArrayList) this.d).get(i)).getId();
    }
}
