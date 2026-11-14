package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.ui.catalog.widget.OperaTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class h85 extends jal implements pkb, hlb, klb {
    public final i85 b;
    public final v8a c;
    public final k6l d;
    public final ypd e;
    public final u4l f;
    public final pde g;
    public final s9i h;
    public g2l i;
    public final ne5 j;
    public hal k;

    /* JADX WARN: Illegal instructions before constructor call */
    public h85(pde pdeVar, i85 i85Var, v8a v8aVar, k6l k6lVar, ypd ypdVar, u4l u4lVar, pde pdeVar2, s9i s9iVar, yqa yqaVar) {
        ne5 ne5Var;
        ConstraintLayout constraintLayout = i85Var.a;
        super(constraintLayout);
        this.b = i85Var;
        this.c = v8aVar;
        this.d = k6lVar;
        this.e = ypdVar;
        this.f = u4lVar;
        this.g = pdeVar2;
        this.h = s9iVar;
        tsd tsdVarW = a26.w(pdeVar, p37.z(constraintLayout));
        final byte b = 0;
        this.i = new g2l(l08.a, 0);
        View view = i85Var.k;
        byte b2 = 29;
        if (view != null) {
            ne5Var = new ne5();
            ne5Var.a = tsdVarW;
            ne5Var.b = view;
            ne5Var.c = yqaVar;
            ne5Var.d = l08.a;
            ne5Var.e = new ArrayList();
            k4a k4aVar = new k4a();
            ne5Var.f = k4aVar;
            tsd tsdVarB = xf8.B(xf8.V(pdeVar2, new d58((byte) 28)));
            ne5Var.g = tsdVarB;
            view.setBackground(k4aVar);
            pc5 pc5Var = new pc5((Object) ne5Var, (byte) 25);
            dll dllVarS = q9n.s(view);
            if (dllVarS != null) {
                u8n.b(dllVarS, view, pc5Var);
            }
            a26.T(xf8.B(xf8.V(tsdVarB, new d58(b2))), tsdVarW, new ks6(ne5Var, (byte) 17));
            tsdVarW.k(new cl4(new tu7((Object) ne5Var, (byte) 24), (byte) 26));
        } else {
            ne5Var = null;
        }
        this.j = ne5Var;
        byte b3 = 5;
        qz qzVar = new qz(this, b3);
        new h5k(tsdVarW, pdeVar2, i85Var);
        TextView textView = i85Var.d;
        u7 u7Var = new u7(this, b2);
        dll dllVarS2 = q9n.s(textView);
        if (dllVarS2 != null) {
            u8n.b(dllVarS2, textView, u7Var);
        }
        final byte b4 = 1;
        a26.U(v8aVar, tsdVarW, new f85(this, (byte) 0), new Function0(this) { // from class: e85
            public final /* synthetic */ h85 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b5 = b4;
                h85 h85Var = this.b;
                switch (b5) {
                    case 0:
                        h85Var.b0();
                        break;
                    default:
                        h85Var.a0();
                        break;
                }
                return Unit.a;
            }
        });
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: g85
            public final /* synthetic */ h85 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b;
                h85 h85Var = this.b;
                switch (b5) {
                    case 0:
                        if (!h85Var.h.Y()) {
                            h85Var.e.r(h85Var.i.b);
                            break;
                        } else {
                            h85Var.c0();
                            break;
                        }
                    case 1:
                        h85Var.e.g0(CollectionsKt.n0(h85Var.i.a), pdb.b, vr0.z, false);
                        break;
                    case 2:
                        h85Var.c0();
                        break;
                    default:
                        List list = h85Var.i.a;
                        boolean zG = exg.g(list);
                        ypd ypdVar2 = h85Var.e;
                        if (!zG) {
                            ypdVar2.O(list, false, false);
                            break;
                        } else {
                            ypdVar2.o0(list, false, false);
                            break;
                        }
                }
            }
        });
        constraintLayout.setOnLongClickListener(new zt(this, b3));
        AppCompatImageView appCompatImageView = i85Var.h;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: g85
                public final /* synthetic */ h85 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b5 = b4;
                    h85 h85Var = this.b;
                    switch (b5) {
                        case 0:
                            if (!h85Var.h.Y()) {
                                h85Var.e.r(h85Var.i.b);
                                break;
                            } else {
                                h85Var.c0();
                                break;
                            }
                        case 1:
                            h85Var.e.g0(CollectionsKt.n0(h85Var.i.a), pdb.b, vr0.z, false);
                            break;
                        case 2:
                            h85Var.c0();
                            break;
                        default:
                            List list = h85Var.i.a;
                            boolean zG = exg.g(list);
                            ypd ypdVar2 = h85Var.e;
                            if (!zG) {
                                ypdVar2.O(list, false, false);
                                break;
                            } else {
                                ypdVar2.o0(list, false, false);
                                break;
                            }
                    }
                }
            });
        }
        AppCompatImageView appCompatImageView2 = i85Var.i;
        if (appCompatImageView2 != null) {
            final byte b5 = 2;
            appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: g85
                public final /* synthetic */ h85 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b52 = b5;
                    h85 h85Var = this.b;
                    switch (b52) {
                        case 0:
                            if (!h85Var.h.Y()) {
                                h85Var.e.r(h85Var.i.b);
                                break;
                            } else {
                                h85Var.c0();
                                break;
                            }
                        case 1:
                            h85Var.e.g0(CollectionsKt.n0(h85Var.i.a), pdb.b, vr0.z, false);
                            break;
                        case 2:
                            h85Var.c0();
                            break;
                        default:
                            List list = h85Var.i.a;
                            boolean zG = exg.g(list);
                            ypd ypdVar2 = h85Var.e;
                            if (!zG) {
                                ypdVar2.O(list, false, false);
                                break;
                            } else {
                                ypdVar2.o0(list, false, false);
                                break;
                            }
                    }
                }
            });
        }
        AppCompatImageView appCompatImageView3 = i85Var.j;
        if (appCompatImageView3 != null) {
            final byte b6 = 3;
            appCompatImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: g85
                public final /* synthetic */ h85 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b52 = b6;
                    h85 h85Var = this.b;
                    switch (b52) {
                        case 0:
                            if (!h85Var.h.Y()) {
                                h85Var.e.r(h85Var.i.b);
                                break;
                            } else {
                                h85Var.c0();
                                break;
                            }
                        case 1:
                            h85Var.e.g0(CollectionsKt.n0(h85Var.i.a), pdb.b, vr0.z, false);
                            break;
                        case 2:
                            h85Var.c0();
                            break;
                        default:
                            List list = h85Var.i.a;
                            boolean zG = exg.g(list);
                            ypd ypdVar2 = h85Var.e;
                            if (!zG) {
                                ypdVar2.O(list, false, false);
                                break;
                            } else {
                                ypdVar2.o0(list, false, false);
                                break;
                            }
                    }
                }
            });
        }
        a26.T((pde) s9iVar.c, tsdVarW, new f7f(this) { // from class: d85
            public final /* synthetic */ h85 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b7 = b4;
                h85 h85Var = this.b;
                switch (b7) {
                    case 0:
                        i85 i85Var2 = h85Var.b;
                        StylingImageButton stylingImageButton = i85Var2.i;
                        AppCompatImageView appCompatImageView4 = i85Var2.h;
                        if (stylingImageButton != null && appCompatImageView4 != null) {
                            boolean zY = h85Var.h.Y();
                            appCompatImageView4.setVisibility(zY ? 4 : 0);
                            i85Var2.i.setVisibility(zY ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        h85Var.b.a.setSelected(h85Var.h.X(h85Var.i.a));
                        break;
                }
            }
        });
        a26.T((pde) s9iVar.d, tsdVarW, new f7f(this) { // from class: d85
            public final /* synthetic */ h85 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b7 = b;
                h85 h85Var = this.b;
                switch (b7) {
                    case 0:
                        i85 i85Var2 = h85Var.b;
                        StylingImageButton stylingImageButton = i85Var2.i;
                        AppCompatImageView appCompatImageView4 = i85Var2.h;
                        if (stylingImageButton != null && appCompatImageView4 != null) {
                            boolean zY = h85Var.h.Y();
                            appCompatImageView4.setVisibility(zY ? 4 : 0);
                            i85Var2.i.setVisibility(zY ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        h85Var.b.a.setSelected(h85Var.h.X(h85Var.i.a));
                        break;
                }
            }
        });
        a26.U(k6lVar.s, tsdVarW, qzVar, new Function0(this) { // from class: e85
            public final /* synthetic */ h85 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b52 = b;
                h85 h85Var = this.b;
                switch (b52) {
                    case 0:
                        h85Var.b0();
                        break;
                    default:
                        h85Var.a0();
                        break;
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.hlb
    public final void A() {
        pdb pdbVar = pdb.a;
        this.e.g0(CollectionsKt.n0(this.i.a), pdbVar, vr0.z, false);
    }

    @Override // defpackage.hlb
    public final void D() {
        this.k = new hal(this.i.b, CollectionsKt.k0(Collections.unmodifiableList(this.d.b)));
        this.e.q(this.i.b);
    }

    @Override // defpackage.klb
    public final void F() {
        View view = ((i) this).itemView;
        long jF = pn7.f(((eyj) this.g.g()).C);
        a26.r(view);
        a26.g(view, jF, a26.A(view), new uh7(1.0f, 1.0f, 0.0f), true);
    }

    @Override // defpackage.klb
    public final void L() {
        View view = ((i) this).itemView;
        pde pdeVar = this.g;
        long jF = pn7.f(((eyj) pdeVar.g()).C);
        float f = ((eyj) pdeVar.g()).B;
        a26.r(view);
        a26.g(view, jF, a26.A(view), new uh7(f, 1.0f, 0.0f), false);
    }

    @Override // defpackage.klb
    public final void M(ial ialVar) {
        Iterable iterable = ialVar.a;
        this.e.P(Integer.valueOf(this.i.b), CollectionsKt.n0(iterable), vr0.q);
    }

    @Override // defpackage.jal
    public final View U() {
        return this.b.c;
    }

    @Override // defpackage.jal
    public final hal V() {
        return this.k;
    }

    @Override // defpackage.jal
    public final List X() {
        return this.i.a;
    }

    @Override // defpackage.jal
    public final void Y() {
        this.k = null;
    }

    public final void Z() {
        k4l k4lVarB = this.f.a(this.i.b).b();
        TextView textView = this.b.d;
        textView.setBackgroundTintList(k4lVarB.a.b(textView.getContext()));
        textView.setTextColor(k4lVarB.b.b(textView.getContext()));
    }

    public final void a0() {
        m4l m4lVarA = this.f.a(this.i.b);
        i85 i85Var = this.b;
        i85Var.f.setText(m4lVarA.c().a(i85Var.f.getResources()));
        Z();
        u8a u8aVar = (u8a) this.c.g.get(Integer.valueOf(this.i.b));
        Integer numValueOf = u8aVar != null ? Integer.valueOf(u8aVar.b) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            TextView textView = i85Var.e;
            if (textView != null) {
                String str = String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
                if (str.length() > 2) {
                    str = "…";
                }
                textView.setText(str);
            }
            OperaTextView operaTextView = i85Var.g;
            if (operaTextView != null) {
                Resources resources = operaTextView.getResources();
                operaTextView.setText(resources != null ? resources.getQuantityString(2131886148, iIntValue, Integer.valueOf(iIntValue)) : null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    public final void b0() {
        ?? r0 = this.b.j;
        if (r0 == 0) {
            return;
        }
        List list = this.i.a;
        boolean zG = exg.g(list);
        boolean zI = exg.i(list);
        if (!zG && !zI) {
            r0.setVisibility(8);
        } else {
            r0.setVisibility(0);
            lah.e((StylingImageButton) r0, zG);
        }
    }

    @Override // defpackage.hlb
    public final void c() {
        int i;
        hal halVar = this.k;
        if (halVar != null) {
            this.k = null;
            List list = this.i.a;
            int i2 = halVar.a;
            List list2 = halVar.b;
            a21 a21Var = (a21) this.e.a;
            if (list.isEmpty() || (i = ((d7l) ((b2l) CollectionsKt.K(list))).j.a().d) == i2) {
                return;
            }
            k6l k6lVar = (k6l) a21Var.d;
            m4l m4lVarA = ((u4l) a21Var.g).a(i);
            Set setN0 = CollectionsKt.n0(list);
            ehc ehcVarB = a.b();
            Iterator it = setN0.iterator();
            while (it.hasNext()) {
                ehcVarB.add(new s6l((b2l) it.next(), i2));
            }
            a21Var.q(new s14(k6lVar, m4lVarA, false, list2, a.a(ehcVarB), (byte) 21));
        }
    }

    public final void c0() {
        s9i s9iVar = this.h;
        if (s9iVar.Y()) {
            List list = this.i.a;
            if (s9iVar.X(list)) {
                s9iVar.J(list);
            } else {
                s9iVar.d0(list);
            }
        }
    }

    @Override // defpackage.pkb
    public final boolean d() {
        return true;
    }

    @Override // defpackage.jal, defpackage.pkb
    public final int getGroupId() {
        return this.i.b;
    }

    @Override // defpackage.hlb
    public final boolean h(i iVar) {
        return this.e.I(this, iVar);
    }

    @Override // defpackage.hlb
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hlb
    public final boolean y() {
        return true;
    }

    @Override // defpackage.klb
    public final boolean z(ial ialVar) {
        return rm5.k(ialVar.a, this.i.b);
    }
}
