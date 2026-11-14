package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.ui.catalog.widget.OperaTextView;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h5l extends jal implements pkb, hlb, klb {
    public final d5l b;
    public final ypd c;
    public final pde d;
    public final s9i e;
    public final tsd f;
    public int g;
    public u2l h;
    public u2l i;
    public final qz j;
    public Drawable k;
    public final kol l;
    public final kol m;
    public final h5k n;

    /* JADX WARN: Illegal instructions before constructor call */
    public h5l(pde pdeVar, d5l d5lVar, ypd ypdVar, pde pdeVar2, s9i s9iVar, yqa yqaVar) {
        kol kolVar;
        ConstraintLayout constraintLayout = d5lVar.a;
        View view = d5lVar.j;
        super(constraintLayout);
        this.b = d5lVar;
        this.c = ypdVar;
        this.d = pdeVar2;
        this.e = s9iVar;
        tsd tsdVarW = a26.w(pdeVar, p37.z(constraintLayout));
        this.f = tsdVarW;
        this.j = new qz(this, (byte) 29);
        View view2 = d5lVar.i;
        final byte b = 1;
        kol kolVar2 = new kol(view2.getContext(), tsdVarW, xf8.B(xf8.V(pdeVar2, new bvk((byte) 6))), yqaVar, new e5l(this, (byte) 1));
        anh anhVar = new anh(kolVar2, b);
        dll dllVarS = q9n.s(view2);
        if (dllVarS != null) {
            u8n.b(dllVarS, view2, anhVar);
        }
        this.l = kolVar2;
        final byte b2 = 2;
        if (view != null) {
            kolVar = new kol(view.getContext(), tsdVarW, xf8.B(xf8.V(pdeVar2, new bvk((byte) 7))), yqaVar, new e5l(this, (byte) 2));
            anh anhVar2 = new anh(kolVar, b2);
            dll dllVarS2 = q9n.s(view);
            if (dllVarS2 != null) {
                u8n.b(dllVarS2, view, anhVar2);
            }
        } else {
            kolVar = null;
        }
        this.m = kolVar;
        this.n = new h5k(tsdVarW, pdeVar2, d5lVar);
        final byte b3 = 0;
        tsdVarW.k(new w4i(new e5l(this, (byte) 0), (byte) 22));
        d5lVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: f5l
            public final /* synthetic */ h5l b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b4 = b3;
                h5l h5lVar = this.b;
                switch (b4) {
                    case 0:
                        u2l u2lVar = h5lVar.i;
                        if (u2lVar != null) {
                            h5lVar.c.p(u2lVar.a, pdb.b);
                            break;
                        }
                        break;
                    case 1:
                        s9i s9iVar2 = h5lVar.e;
                        u2l u2lVar2 = h5lVar.i;
                        if (u2lVar2 != null) {
                            b2l b2lVar = u2lVar2.a;
                            if (s9iVar2.Z(b2lVar)) {
                                s9iVar2.j0(b2lVar);
                                break;
                            }
                        }
                        break;
                    case 2:
                        u2l u2lVar3 = h5lVar.i;
                        if (u2lVar3 != null) {
                            b2l b2lVar2 = u2lVar3.a;
                            boolean zF = exg.f(b2lVar2);
                            ypd ypdVar2 = h5lVar.c;
                            if (!zF) {
                                ypdVar2.O(Collections.singletonList(b2lVar2), false, false);
                                break;
                            } else {
                                ypdVar2.o0(Collections.singletonList(b2lVar2), false, false);
                                break;
                            }
                        }
                        break;
                    default:
                        s9i s9iVar3 = h5lVar.e;
                        ypd ypdVar3 = h5lVar.c;
                        ypd.K(ypdVar3, h5lVar.getBindingAdapterPosition(), 0, 6);
                        u2l u2lVar4 = h5lVar.i;
                        if (u2lVar4 != null) {
                            b2l b2lVar3 = u2lVar4.a;
                            if (!s9iVar3.Z(b2lVar3)) {
                                ypdVar3.m(b2lVar3);
                                break;
                            } else {
                                s9iVar3.j0(b2lVar3);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        AppCompatImageView appCompatImageView = d5lVar.e;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: f5l
                public final /* synthetic */ h5l b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    byte b4 = b;
                    h5l h5lVar = this.b;
                    switch (b4) {
                        case 0:
                            u2l u2lVar = h5lVar.i;
                            if (u2lVar != null) {
                                h5lVar.c.p(u2lVar.a, pdb.b);
                                break;
                            }
                            break;
                        case 1:
                            s9i s9iVar2 = h5lVar.e;
                            u2l u2lVar2 = h5lVar.i;
                            if (u2lVar2 != null) {
                                b2l b2lVar = u2lVar2.a;
                                if (s9iVar2.Z(b2lVar)) {
                                    s9iVar2.j0(b2lVar);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            u2l u2lVar3 = h5lVar.i;
                            if (u2lVar3 != null) {
                                b2l b2lVar2 = u2lVar3.a;
                                boolean zF = exg.f(b2lVar2);
                                ypd ypdVar2 = h5lVar.c;
                                if (!zF) {
                                    ypdVar2.O(Collections.singletonList(b2lVar2), false, false);
                                    break;
                                } else {
                                    ypdVar2.o0(Collections.singletonList(b2lVar2), false, false);
                                    break;
                                }
                            }
                            break;
                        default:
                            s9i s9iVar3 = h5lVar.e;
                            ypd ypdVar3 = h5lVar.c;
                            ypd.K(ypdVar3, h5lVar.getBindingAdapterPosition(), 0, 6);
                            u2l u2lVar4 = h5lVar.i;
                            if (u2lVar4 != null) {
                                b2l b2lVar3 = u2lVar4.a;
                                if (!s9iVar3.Z(b2lVar3)) {
                                    ypdVar3.m(b2lVar3);
                                    break;
                                } else {
                                    s9iVar3.j0(b2lVar3);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        d5lVar.f.setOnClickListener(new View.OnClickListener(this) { // from class: f5l
            public final /* synthetic */ h5l b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b4 = b2;
                h5l h5lVar = this.b;
                switch (b4) {
                    case 0:
                        u2l u2lVar = h5lVar.i;
                        if (u2lVar != null) {
                            h5lVar.c.p(u2lVar.a, pdb.b);
                            break;
                        }
                        break;
                    case 1:
                        s9i s9iVar2 = h5lVar.e;
                        u2l u2lVar2 = h5lVar.i;
                        if (u2lVar2 != null) {
                            b2l b2lVar = u2lVar2.a;
                            if (s9iVar2.Z(b2lVar)) {
                                s9iVar2.j0(b2lVar);
                                break;
                            }
                        }
                        break;
                    case 2:
                        u2l u2lVar3 = h5lVar.i;
                        if (u2lVar3 != null) {
                            b2l b2lVar2 = u2lVar3.a;
                            boolean zF = exg.f(b2lVar2);
                            ypd ypdVar2 = h5lVar.c;
                            if (!zF) {
                                ypdVar2.O(Collections.singletonList(b2lVar2), false, false);
                                break;
                            } else {
                                ypdVar2.o0(Collections.singletonList(b2lVar2), false, false);
                                break;
                            }
                        }
                        break;
                    default:
                        s9i s9iVar3 = h5lVar.e;
                        ypd ypdVar3 = h5lVar.c;
                        ypd.K(ypdVar3, h5lVar.getBindingAdapterPosition(), 0, 6);
                        u2l u2lVar4 = h5lVar.i;
                        if (u2lVar4 != null) {
                            b2l b2lVar3 = u2lVar4.a;
                            if (!s9iVar3.Z(b2lVar3)) {
                                ypdVar3.m(b2lVar3);
                                break;
                            } else {
                                s9iVar3.j0(b2lVar3);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final byte b4 = 3;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: f5l
            public final /* synthetic */ h5l b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b42 = b4;
                h5l h5lVar = this.b;
                switch (b42) {
                    case 0:
                        u2l u2lVar = h5lVar.i;
                        if (u2lVar != null) {
                            h5lVar.c.p(u2lVar.a, pdb.b);
                            break;
                        }
                        break;
                    case 1:
                        s9i s9iVar2 = h5lVar.e;
                        u2l u2lVar2 = h5lVar.i;
                        if (u2lVar2 != null) {
                            b2l b2lVar = u2lVar2.a;
                            if (s9iVar2.Z(b2lVar)) {
                                s9iVar2.j0(b2lVar);
                                break;
                            }
                        }
                        break;
                    case 2:
                        u2l u2lVar3 = h5lVar.i;
                        if (u2lVar3 != null) {
                            b2l b2lVar2 = u2lVar3.a;
                            boolean zF = exg.f(b2lVar2);
                            ypd ypdVar2 = h5lVar.c;
                            if (!zF) {
                                ypdVar2.O(Collections.singletonList(b2lVar2), false, false);
                                break;
                            } else {
                                ypdVar2.o0(Collections.singletonList(b2lVar2), false, false);
                                break;
                            }
                        }
                        break;
                    default:
                        s9i s9iVar3 = h5lVar.e;
                        ypd ypdVar3 = h5lVar.c;
                        ypd.K(ypdVar3, h5lVar.getBindingAdapterPosition(), 0, 6);
                        u2l u2lVar4 = h5lVar.i;
                        if (u2lVar4 != null) {
                            b2l b2lVar3 = u2lVar4.a;
                            if (!s9iVar3.Z(b2lVar3)) {
                                ypdVar3.m(b2lVar3);
                                break;
                            } else {
                                s9iVar3.j0(b2lVar3);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new zt((Object) this, (byte) 15));
        a26.T((pde) s9iVar.c, tsdVarW, new f7f(this) { // from class: g5l
            public final /* synthetic */ h5l b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                u2l u2lVar;
                byte b5 = b3;
                h5l h5lVar = this.b;
                switch (b5) {
                    case 0:
                        h5lVar.Z();
                        break;
                    default:
                        d5l d5lVar2 = h5lVar.b;
                        if (d5lVar2.e != null && (u2lVar = h5lVar.i) != null) {
                            boolean Z = h5lVar.e.Z(u2lVar.a);
                            d5lVar2.d.setVisibility(Z ? 4 : 0);
                            d5lVar2.e.setVisibility(Z ? 0 : 4);
                        }
                        h5lVar.Z();
                        break;
                }
            }
        });
        a26.T((pde) s9iVar.d, tsdVarW, new f7f(this) { // from class: g5l
            public final /* synthetic */ h5l b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                u2l u2lVar;
                byte b5 = b;
                h5l h5lVar = this.b;
                switch (b5) {
                    case 0:
                        h5lVar.Z();
                        break;
                    default:
                        d5l d5lVar2 = h5lVar.b;
                        if (d5lVar2.e != null && (u2lVar = h5lVar.i) != null) {
                            boolean Z = h5lVar.e.Z(u2lVar.a);
                            d5lVar2.d.setVisibility(Z ? 4 : 0);
                            d5lVar2.e.setVisibility(Z ? 0 : 4);
                        }
                        h5lVar.Z();
                        break;
                }
            }
        });
    }

    @Override // defpackage.hlb
    public final void A() {
        u2l u2lVar = this.i;
        if (u2lVar != null) {
            this.c.p(u2lVar.a, pdb.a);
        }
    }

    @Override // defpackage.klb
    public final void F() {
        View view = ((i) this).itemView;
        long jF = pn7.f(((eyj) this.d.g()).C);
        a26.r(view);
        a26.g(view, jF, a26.A(view), new uh7(1.0f, 1.0f, 0.0f), true);
    }

    @Override // defpackage.klb
    public final void L() {
        View view = ((i) this).itemView;
        pde pdeVar = this.d;
        long jF = pn7.f(((eyj) pdeVar.g()).C);
        float f = ((eyj) pdeVar.g()).B;
        a26.r(view);
        a26.g(view, jF, a26.A(view), new uh7(f, 1.0f, 0.0f), false);
    }

    @Override // defpackage.klb
    public final void M(ial ialVar) {
        Integer numValueOf;
        LinkedHashSet linkedHashSetM0 = CollectionsKt.m0(ialVar.a);
        u2l u2lVar = this.i;
        if (u2lVar != null) {
            b2l b2lVar = u2lVar.a;
            if (linkedHashSetM0.isEmpty()) {
                return;
            }
            d7l d7lVar = (d7l) b2lVar;
            if (d7lVar.j.a().d != 0) {
                numValueOf = Integer.valueOf(d7lVar.j.a().d);
            } else {
                linkedHashSetM0.add(b2lVar);
                int i = ((d7l) ((b2l) CollectionsKt.J(linkedHashSetM0))).j.a().d;
                numValueOf = i != 0 ? Integer.valueOf(i) : null;
            }
            this.c.P(numValueOf, linkedHashSetM0, numValueOf == null ? vr0.g : numValueOf.intValue() == 0 ? vr0.h : vr0.q);
        }
    }

    @Override // defpackage.jal
    public final View U() {
        return this.b.c;
    }

    @Override // defpackage.jal
    public final List X() {
        u2l u2lVar = this.h;
        return u2lVar != null ? Collections.singletonList(u2lVar.a) : l08.a;
    }

    public final void Z() {
        u2l u2lVar = this.i;
        if (u2lVar != null) {
            b2l b2lVar = u2lVar.a;
            s9i s9iVar = this.e;
            this.b.a.setSelected(s9iVar.Z(b2lVar) ? ((LinkedHashSet) ((pde) s9iVar.c).g()).contains(b2lVar) : ((d7l) b2lVar).j.isActive());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final void a0() {
        ?? r0 = this.g != 0 ? 1 : 0;
        h5k h5kVar = this.n;
        if (r0 != h5kVar.a) {
            h5kVar.a = r0;
            h5kVar.e();
        }
        Drawable background = this.b.a.getBackground();
        if (background != 0) {
            background.mutate();
            background.setLevel(r0);
        }
    }

    public final void b0() {
        String strG0;
        u2l u2lVar = this.i;
        if (u2lVar != null) {
            b2l b2lVar = u2lVar.a;
            d7l d7lVar = (d7l) b2lVar;
            String strH0 = d7lVar.h0();
            fol folVar = new fol(d7lVar.j.getId(), b2lVar.T(), strH0);
            kol kolVar = this.l;
            if (kolVar != null) {
                kolVar.j(folVar);
            }
            kol kolVar2 = this.m;
            if (kolVar2 != null) {
                kolVar2.j(folVar);
            }
            d5l d5lVar = this.b;
            OperaTextView operaTextView = d5lVar.h;
            ConstraintLayout constraintLayout = d5lVar.a;
            if (operaTextView != null) {
                if (z5i.a0(d7lVar.j.getUrl())) {
                    strG0 = constraintLayout.getResources().getString(2132017532);
                } else {
                    strG0 = d7lVar.g0();
                    if (wqm.r(strG0)) {
                        strG0 = wqm.H(strG0);
                    }
                    if (strG0.length() == 0 && wqm.w(strH0)) {
                        strG0 = constraintLayout.getResources().getString(2132019261);
                    }
                }
                d5lVar.h.setText(strG0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    public final void c0() {
        u2l u2lVar = this.i;
        if (u2lVar != null) {
            b2l b2lVar = u2lVar.a;
            ?? r2 = this.b.f;
            boolean zF = exg.f(b2lVar);
            boolean zH = exg.h(b2lVar);
            if (!zF && !zH) {
                r2.setVisibility(8);
            } else {
                r2.setVisibility(0);
                lah.e((StylingImageButton) r2, zF);
            }
        }
    }

    public final void e0() {
        u2l u2lVar = Intrinsics.a(this.f.g(), ng.a) ? this.h : null;
        if (Intrinsics.a(u2lVar, this.i)) {
            return;
        }
        u2l u2lVar2 = this.i;
        qz qzVar = this.j;
        if (u2lVar2 != null) {
            ((d7l) u2lVar2.a).H(qzVar);
        }
        this.i = u2lVar;
        if (u2lVar != null) {
            ((d7l) u2lVar.a).F(qzVar);
            a0();
            u2l u2lVar3 = this.i;
            if (u2lVar3 != null) {
                this.b.g.setText(((d7l) u2lVar3.a).l0());
            }
            b0();
            Z();
            c0();
        }
    }

    @Override // defpackage.jal, defpackage.pkb
    public final int getGroupId() {
        return this.g;
    }

    @Override // defpackage.hlb
    public final boolean h(i iVar) {
        return this.c.I(this, iVar);
    }

    @Override // defpackage.pkb
    public final Class k() {
        u2l u2lVar = this.h;
        if (u2lVar == null || ((d7l) u2lVar.a).j.isActive()) {
            return null;
        }
        return h5l.class;
    }

    @Override // defpackage.klb
    public final boolean z(ial ialVar) {
        u2l u2lVar = this.i;
        if (u2lVar != null) {
            return rm5.k(ialVar.a, ((d7l) u2lVar.a).j.a().d);
        }
        return false;
    }
}
