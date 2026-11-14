package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.settings.SettingsStatisticView;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class f0h extends j83 {
    public final umi a;
    public final p0h b;
    public final wzg c;
    public final x5f d;
    public final boolean e;
    public final gjm f;
    public o4g g;

    public f0h(umi umiVar, p0h p0hVar, wzg wzgVar, x5f x5fVar, boolean z, gjm gjmVar) {
        this.a = umiVar;
        this.b = p0hVar;
        this.c = wzgVar;
        this.d = x5fVar;
        this.e = z;
        this.f = gjmVar;
    }

    public static void h0(OperaListItem operaListItem, o0h o0hVar, int i, int i2) {
        if (o0hVar.c) {
            operaListItem.z(new lxh(i));
            operaListItem.t(true);
        } else {
            operaListItem.z(new lxh(i2));
            operaListItem.t(false);
        }
    }

    @Override // defpackage.j83
    public final View f0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131559244, viewGroup, false);
        int i = 2131361905;
        SettingsStatisticView settingsStatisticView = (SettingsStatisticView) w1h.j(2131361905, constraintLayoutInflate);
        if (settingsStatisticView != null) {
            i = 2131362138;
            OperaListItem operaListItem = (OperaListItem) w1h.j(2131362138, constraintLayoutInflate);
            if (operaListItem != null) {
                i = 2131362140;
                OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131362140, constraintLayoutInflate);
                if (operaListItem2 != null) {
                    i = 2131362403;
                    TextView textView = (TextView) w1h.j(2131362403, constraintLayoutInflate);
                    if (textView != null) {
                        i = 2131362405;
                        TextView textView2 = (TextView) w1h.j(2131362405, constraintLayoutInflate);
                        if (textView2 != null) {
                            i = 2131362406;
                            StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362406, constraintLayoutInflate);
                            if (stylingImageView != null) {
                                i = 2131362548;
                                View viewJ = w1h.j(2131362548, constraintLayoutInflate);
                                if (viewJ != null) {
                                    i = 2131362827;
                                    View viewJ2 = w1h.j(2131362827, constraintLayoutInflate);
                                    if (viewJ2 != null) {
                                        i = 2131363877;
                                        OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131363877, constraintLayoutInflate);
                                        if (operaListItem3 != null) {
                                            i = 2131364746;
                                            if (w1h.j(2131364746, constraintLayoutInflate) != null) {
                                                i = 2131364827;
                                                SettingsStatisticView settingsStatisticView2 = (SettingsStatisticView) w1h.j(2131364827, constraintLayoutInflate);
                                                if (settingsStatisticView2 != null) {
                                                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                    this.g = new o4g(constraintLayout, settingsStatisticView, operaListItem, operaListItem2, textView, textView2, stylingImageView, viewJ, viewJ2, operaListItem3, settingsStatisticView2);
                                                    return constraintLayout;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0() {
        /*
            r9 = this;
            o4g r0 = r9.g
            android.view.View r0 = r0.c
            com.opera.android.custom_views.StylingImageView r0 = (com.opera.android.custom_views.StylingImageView) r0
            android.content.Context r1 = r0.getContext()
            p0h r2 = r9.b
            kze r3 = r2.f
            java.lang.Object r3 = r3.g()
            qwi r3 = (defpackage.qwi) r3
            nwi r3 = r3.a
            int r3 = r3.ordinal()
            r4 = 2131102465(0x7f060b01, float:1.7817369E38)
            r5 = 2130969266(0x7f0402b2, float:1.754721E38)
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L3b
            if (r3 == r8) goto L30
            if (r3 == r7) goto L3b
            if (r3 == r6) goto L3b
            android.content.res.ColorStateList r1 = f03.u(r5, r1, r4)
            goto L3f
        L30:
            r3 = 2130969282(0x7f0402c2, float:1.7547241E38)
            r4 = 2131102469(0x7f060b05, float:1.7817377E38)
            android.content.res.ColorStateList r1 = f03.u(r3, r1, r4)
            goto L3f
        L3b:
            android.content.res.ColorStateList r1 = f03.u(r5, r1, r4)
        L3f:
            r0.c(r1)
            o4g r9 = r9.g
            android.view.View r9 = r9.c
            com.opera.android.custom_views.StylingImageView r9 = (com.opera.android.custom_views.StylingImageView) r9
            android.content.Context r0 = r9.getContext()
            kze r1 = r2.f
            java.lang.Object r1 = r1.g()
            qwi r1 = (defpackage.qwi) r1
            nwi r1 = r1.a
            int r1 = r1.ordinal()
            if (r1 == 0) goto L72
            if (r1 == r8) goto L67
            if (r1 == r7) goto L72
            if (r1 == r6) goto L72
            android.content.res.ColorStateList r0 = f03.y(r0)
            goto L76
        L67:
            r1 = 2130969323(0x7f0402eb, float:1.7547325E38)
            r2 = 2131102475(0x7f060b0b, float:1.7817389E38)
            android.content.res.ColorStateList r0 = f03.u(r1, r0, r2)
            goto L76
        L72:
            android.content.res.ColorStateList r0 = f03.y(r0)
        L76:
            ua7 r9 = r9.e
            r9.M(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f0h.i0():void");
    }

    public final void onDestroyView() {
        super.onDestroyView();
        o4g o4gVar = this.g;
        if (o4gVar != null) {
            ((OperaListItem) o4gVar.e).u = null;
            ((OperaListItem) o4gVar.f).u = null;
        }
        this.g = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        p0h p0hVar = this.b;
        final byte b = 1;
        p0hVar.c.j(getViewLifecycleOwner(), new f7f(this) { // from class: d0h
            public final /* synthetic */ f0h b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void d0(java.lang.Object r6) {
                /*
                    Method dump skipped, instructions count: 342
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.d0h.d0(java.lang.Object):void");
            }
        });
        ekc ekcVar = p0hVar.d;
        final byte b2 = 2;
        ekcVar.j(getViewLifecycleOwner(), new f7f(this) { // from class: d0h
            public final /* synthetic */ f0h b;

            {
                this.b = this;
            }

            public final void d0(Object v) {
                /*
                    Method dump skipped, instructions count: 342
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.d0h.d0(java.lang.Object):void");
            }
        });
        final byte b3 = 0;
        p0hVar.f.j(getViewLifecycleOwner(), new f7f(this) { // from class: d0h
            public final /* synthetic */ f0h b;

            {
                this.b = this;
            }

            public final void d0(Object v) {
                /*
                    Method dump skipped, instructions count: 342
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.d0h.d0(java.lang.Object):void");
            }
        });
        final byte b4 = 3;
        p0hVar.h.j(getViewLifecycleOwner(), new f7f(this) { // from class: d0h
            public final /* synthetic */ f0h b;

            {
                this.b = this;
            }

            public final void d0(Object v) {
                /*
                    Method dump skipped, instructions count: 342
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.d0h.d0(java.lang.Object):void");
            }
        });
        kze kzeVar = p0hVar.e;
        final byte b5 = 4;
        kzeVar.j(getViewLifecycleOwner(), new f7f(this) { // from class: d0h
            public final /* synthetic */ f0h b;

            {
                this.b = this;
            }

            public final void d0(Object v) {
                /*
                    Method dump skipped, instructions count: 342
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.d0h.d0(java.lang.Object):void");
            }
        });
        ekc ekcVar2 = p0hVar.c;
        h42 h42Var = new h42();
        h42Var.s(ekcVar2, new c0h(this, h42Var, ekcVar2, kzeVar, (byte) 0));
        h42Var.s(kzeVar, new c0h(this, h42Var, ekcVar2, kzeVar, (byte) 1));
        h42Var.j(getViewLifecycleOwner(), new qzg((OperaListItem) this.g.e, b2));
        h42 h42Var2 = new h42();
        h42Var2.s(ekcVar, new c0h(this, h42Var2, ekcVar, kzeVar, (byte) 0));
        h42Var2.s(kzeVar, new c0h(this, h42Var2, ekcVar, kzeVar, (byte) 1));
        h42Var2.j(getViewLifecycleOwner(), new qzg((OperaListItem) this.g.f, b2));
        ((SettingsStatisticView) this.g.d).setOnClickListener(new View.OnClickListener(this) { // from class: b0h
            public final /* synthetic */ f0h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xzg parentFragment;
                byte b6 = b2;
                f0h f0hVar = this.b;
                switch (b6) {
                    case 0:
                        f0hVar.d.n0(en0.c);
                        parentFragment = f0hVar.getParentFragment() instanceof xzg ? f0hVar.getParentFragment() : null;
                        if (parentFragment != null) {
                            parentFragment.dismiss();
                        }
                        zhj.b(wyl.class).c(view2.getContext());
                        break;
                    case 1:
                        x5f x5fVar = f0hVar.d;
                        x5fVar.n0(en0.f);
                        f0hVar.g0(new i0h(f0hVar.f, f0hVar.b, x5fVar));
                        break;
                    default:
                        f0hVar.d.n0(en0.b);
                        parentFragment = f0hVar.getParentFragment() instanceof xzg ? f0hVar.getParentFragment() : null;
                        if (parentFragment != null) {
                            parentFragment.dismiss();
                        }
                        f0hVar.f.e(new qk(), false);
                        break;
                }
            }
        });
        ((SettingsStatisticView) this.g.l).setOnClickListener(new View.OnClickListener(this) { // from class: b0h
            public final /* synthetic */ f0h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xzg parentFragment;
                byte b6 = b3;
                f0h f0hVar = this.b;
                switch (b6) {
                    case 0:
                        f0hVar.d.n0(en0.c);
                        parentFragment = f0hVar.getParentFragment() instanceof xzg ? f0hVar.getParentFragment() : null;
                        if (parentFragment != null) {
                            parentFragment.dismiss();
                        }
                        zhj.b(wyl.class).c(view2.getContext());
                        break;
                    case 1:
                        x5f x5fVar = f0hVar.d;
                        x5fVar.n0(en0.f);
                        f0hVar.g0(new i0h(f0hVar.f, f0hVar.b, x5fVar));
                        break;
                    default:
                        f0hVar.d.n0(en0.b);
                        parentFragment = f0hVar.getParentFragment() instanceof xzg ? f0hVar.getParentFragment() : null;
                        if (parentFragment != null) {
                            parentFragment.dismiss();
                        }
                        f0hVar.f.e(new qk(), false);
                        break;
                }
            }
        });
        ((OperaListItem) this.g.k).setOnClickListener(new View.OnClickListener(this) { // from class: b0h
            public final /* synthetic */ f0h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xzg parentFragment;
                byte b6 = b;
                f0h f0hVar = this.b;
                switch (b6) {
                    case 0:
                        f0hVar.d.n0(en0.c);
                        parentFragment = f0hVar.getParentFragment() instanceof xzg ? f0hVar.getParentFragment() : null;
                        if (parentFragment != null) {
                            parentFragment.dismiss();
                        }
                        zhj.b(wyl.class).c(view2.getContext());
                        break;
                    case 1:
                        x5f x5fVar = f0hVar.d;
                        x5fVar.n0(en0.f);
                        f0hVar.g0(new i0h(f0hVar.f, f0hVar.b, x5fVar));
                        break;
                    default:
                        f0hVar.d.n0(en0.b);
                        parentFragment = f0hVar.getParentFragment() instanceof xzg ? f0hVar.getParentFragment() : null;
                        if (parentFragment != null) {
                            parentFragment.dismiss();
                        }
                        f0hVar.f.e(new qk(), false);
                        break;
                }
            }
        });
        AppCompatImageView appCompatImageView = (StylingImageView) this.g.c;
        kkf kkfVar = new kkf(this, b5);
        q9n.e(appCompatImageView, kkfVar);
        kkfVar.a(appCompatImageView);
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        o4g o4gVar = this.g;
        if (o4gVar == null) {
            return;
        }
        final byte b = 0;
        ((OperaListItem) o4gVar.e).u = new vlf(this) { // from class: a0h
            public final /* synthetic */ f0h b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b2 = b;
                f0h f0hVar = this.b;
                switch (b2) {
                    case 0:
                        f0hVar.d.n0(en0.d);
                        f0hVar.b.b(1, z);
                        break;
                    default:
                        f0hVar.d.n0(en0.e);
                        f0hVar.b.b(2, z);
                        break;
                }
            }
        };
        final byte b2 = 1;
        ((OperaListItem) o4gVar.f).u = new vlf(this) { // from class: a0h
            public final /* synthetic */ f0h b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b22 = b2;
                f0h f0hVar = this.b;
                switch (b22) {
                    case 0:
                        f0hVar.d.n0(en0.d);
                        f0hVar.b.b(1, z);
                        break;
                    default:
                        f0hVar.d.n0(en0.e);
                        f0hVar.b.b(2, z);
                        break;
                }
            }
        };
    }
}
