package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.opera.android.custom_views.CardView;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.view.TouchIgnoringViewPager;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class uue extends gu8 {
    public final /* synthetic */ byte m = 1;
    public final Object n;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public uue(View view, r9i r9iVar, p0c p0cVar, umi umiVar) {
        super(view, r9iVar, p0cVar);
        final byte b = 1;
        int i = 2131362915;
        View viewJ = w1h.j(2131362915, view);
        if (viewJ != null) {
            ov0 ov0VarD = ov0.d(viewJ);
            i = 2131362918;
            OperaTextView operaTextViewJ = w1h.j(2131362918, view);
            if (operaTextViewJ != null) {
                i = 2131365011;
                TouchIgnoringViewPager touchIgnoringViewPager = (TouchIgnoringViewPager) w1h.j(2131365011, view);
                if (touchIgnoringViewPager != null) {
                    i = 2131365079;
                    ?? r7 = (StylingImageView) w1h.j(2131365079, view);
                    if (r7 != 0) {
                        CardView cardView = (CardView) view;
                        this.n = new vs(cardView, ov0VarD, operaTextViewJ, touchIgnoringViewPager, (StylingImageView) r7);
                        l8i l8iVar = new l8i(umiVar, touchIgnoringViewPager, (uqe) r9iVar.b);
                        this.o = l8iVar;
                        final byte b2 = 0;
                        r8n r8nVar = new r8n(this) { // from class: m8i
                            public final /* synthetic */ uue b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.r8n
                            public final void a(View view2) {
                                byte b3 = b2;
                                uue uueVar = this.b;
                                switch (b3) {
                                    case 0:
                                        uueVar.o0();
                                        break;
                                    case 1:
                                        uueVar.p0();
                                        break;
                                    case 2:
                                        uueVar.t0();
                                        break;
                                    case 3:
                                        uueVar.q0();
                                        break;
                                    case 4:
                                        uueVar.s0();
                                        break;
                                    default:
                                        uueVar.r0();
                                        break;
                                }
                            }
                        };
                        dll dllVarS = q9n.s(cardView);
                        if (dllVarS != null) {
                            u8n.b(dllVarS, cardView, r8nVar);
                        }
                        r8n r8nVar2 = new r8n(this) { // from class: m8i
                            public final /* synthetic */ uue b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.r8n
                            public final void a(View view2) {
                                byte b3 = b;
                                uue uueVar = this.b;
                                switch (b3) {
                                    case 0:
                                        uueVar.o0();
                                        break;
                                    case 1:
                                        uueVar.p0();
                                        break;
                                    case 2:
                                        uueVar.t0();
                                        break;
                                    case 3:
                                        uueVar.q0();
                                        break;
                                    case 4:
                                        uueVar.s0();
                                        break;
                                    default:
                                        uueVar.r0();
                                        break;
                                }
                            }
                        };
                        dll dllVarS2 = q9n.s(r7);
                        if (dllVarS2 != null) {
                            u8n.b(dllVarS2, r7, r8nVar2);
                        }
                        final byte b3 = 2;
                        r8n r8nVar3 = new r8n(this) { // from class: m8i
                            public final /* synthetic */ uue b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.r8n
                            public final void a(View view2) {
                                byte b32 = b3;
                                uue uueVar = this.b;
                                switch (b32) {
                                    case 0:
                                        uueVar.o0();
                                        break;
                                    case 1:
                                        uueVar.p0();
                                        break;
                                    case 2:
                                        uueVar.t0();
                                        break;
                                    case 3:
                                        uueVar.q0();
                                        break;
                                    case 4:
                                        uueVar.s0();
                                        break;
                                    default:
                                        uueVar.r0();
                                        break;
                                }
                            }
                        };
                        dll dllVarS3 = q9n.s(operaTextViewJ);
                        if (dllVarS3 != null) {
                            u8n.b(dllVarS3, operaTextViewJ, r8nVar3);
                        }
                        LinearLayout linearLayout = (LinearLayout) ov0VarD.b;
                        final byte b4 = 3;
                        r8n r8nVar4 = new r8n(this) { // from class: m8i
                            public final /* synthetic */ uue b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.r8n
                            public final void a(View view2) {
                                byte b32 = b4;
                                uue uueVar = this.b;
                                switch (b32) {
                                    case 0:
                                        uueVar.o0();
                                        break;
                                    case 1:
                                        uueVar.p0();
                                        break;
                                    case 2:
                                        uueVar.t0();
                                        break;
                                    case 3:
                                        uueVar.q0();
                                        break;
                                    case 4:
                                        uueVar.s0();
                                        break;
                                    default:
                                        uueVar.r0();
                                        break;
                                }
                            }
                        };
                        dll dllVarS4 = q9n.s(linearLayout);
                        if (dllVarS4 != null) {
                            u8n.b(dllVarS4, linearLayout, r8nVar4);
                        }
                        ImageView imageView = (ImageView) ov0VarD.d;
                        final byte b5 = 4;
                        r8n r8nVar5 = new r8n(this) { // from class: m8i
                            public final /* synthetic */ uue b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.r8n
                            public final void a(View view2) {
                                byte b32 = b5;
                                uue uueVar = this.b;
                                switch (b32) {
                                    case 0:
                                        uueVar.o0();
                                        break;
                                    case 1:
                                        uueVar.p0();
                                        break;
                                    case 2:
                                        uueVar.t0();
                                        break;
                                    case 3:
                                        uueVar.q0();
                                        break;
                                    case 4:
                                        uueVar.s0();
                                        break;
                                    default:
                                        uueVar.r0();
                                        break;
                                }
                            }
                        };
                        dll dllVarS5 = q9n.s(imageView);
                        if (dllVarS5 != null) {
                            u8n.b(dllVarS5, imageView, r8nVar5);
                        }
                        TextView textView = (TextView) ov0VarD.c;
                        final byte b6 = 5;
                        r8n r8nVar6 = new r8n(this) { // from class: m8i
                            public final /* synthetic */ uue b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.r8n
                            public final void a(View view2) {
                                byte b32 = b6;
                                uue uueVar = this.b;
                                switch (b32) {
                                    case 0:
                                        uueVar.o0();
                                        break;
                                    case 1:
                                        uueVar.p0();
                                        break;
                                    case 2:
                                        uueVar.t0();
                                        break;
                                    case 3:
                                        uueVar.q0();
                                        break;
                                    case 4:
                                        uueVar.s0();
                                        break;
                                    default:
                                        uueVar.r0();
                                        break;
                                }
                            }
                        };
                        dll dllVarS6 = q9n.s(textView);
                        if (dllVarS6 != null) {
                            u8n.b(dllVarS6, textView, r8nVar6);
                        }
                        touchIgnoringViewPager.setAdapter(l8iVar);
                        return;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    public uue(View view, r9i r9iVar, rl3 rl3Var, p0c p0cVar) {
        super(view, r9iVar, p0cVar);
        View viewFindViewById = view.findViewById(2131362914);
        this.n = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        viewFindViewById.setVisibility(0);
        view.findViewById(2131362916).setVisibility(8);
        this.o = rl3Var;
    }

    @Override // defpackage.ab2
    public final int U() {
        switch (this.m) {
            case 1:
                return -1;
            default:
                return super.U();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    @Override // defpackage.gu8, defpackage.ab2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V(defpackage.ja2 r9, boolean r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uue.V(ja2, boolean):void");
    }

    @Override // defpackage.gu8, defpackage.ab2
    public void Y() {
        switch (this.m) {
            case 1:
                l8i l8iVar = (l8i) this.o;
                l8iVar.e.S();
                ValueAnimator valueAnimator = (ValueAnimator) l8iVar.d.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                l8iVar.g = false;
                break;
            default:
                super.Y();
                break;
        }
    }

    @Override // defpackage.lx8
    public final cmg c0() {
        switch (this.m) {
            case 1:
                return cmg.ROUNDUP_BANNER;
            default:
                return super.c0();
        }
    }

    @Override // defpackage.gu8
    public /* bridge */ /* synthetic */ oqe e0() {
        switch (this.m) {
            case 0:
                return m0();
            default:
                return super.e0();
        }
    }

    public msh m0() {
        return (msh) super.e0();
    }

    public final xlg n0() {
        j82 j82Var = (j82) this.b;
        oqe oqeVar = j82Var != null ? ((pue) j82Var).c : null;
        d9i d9iVar = oqeVar instanceof d9i ? (d9i) oqeVar : null;
        if (d9iVar != null) {
            return d9iVar.z;
        }
        return null;
    }

    public final void o0() {
        vs vsVar = (vs) this.n;
        xlg xlgVarN0 = n0();
        if (xlgVarN0 != null) {
            CardView cardView = (CardView) vsVar.b;
            wu5 wu5Var = e9i.f;
            String str = xlgVarN0.m;
            wu5Var.getClass();
            cardView.setBackgroundColor(wu5.h(str).c.a(((CardView) vsVar.b).getContext()));
        }
    }

    @Override // defpackage.gu8, android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.m) {
            case 0:
                super.onClick(view);
                if (((j82) this.b) != null && view == ((View) this.n)) {
                    final msh mshVarM0 = m0();
                    final byte b = 0;
                    final byte b2 = 1;
                    final byte b3 = 2;
                    ac8.a(new cij(view, k1g.y(mshVarM0, new ox8(this) { // from class: vy8
                        public final /* synthetic */ uue b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.ox8
                        public final void f(List list) {
                            byte b4 = b;
                            msh mshVar = mshVarM0;
                            uue uueVar = this.b;
                            switch (b4) {
                                case 0:
                                    if (list == null) {
                                        list = Collections.EMPTY_LIST;
                                    }
                                    uqe uqeVar = (uqe) uueVar.u0().b;
                                    uqeVar.k(mshVar, list, true);
                                    uqeVar.h.k(mshVar, list, false);
                                    ((rl3) uueVar.o).f(new glj(mshVar instanceof ure ? 2132019059 : 2132019057, 2500));
                                    break;
                                case 1:
                                    if (list == null) {
                                        list = Collections.EMPTY_LIST;
                                    }
                                    uqe uqeVar2 = (uqe) uueVar.u0().b;
                                    uqeVar2.k(mshVar, list, true);
                                    uqeVar2.h.k(mshVar, list, false);
                                    ((rl3) uueVar.o).f(new glj(mshVar instanceof ure ? 2132018014 : 2132018010, 2500));
                                    break;
                                default:
                                    if (list == null) {
                                        list = Collections.EMPTY_LIST;
                                    }
                                    ((uqe) uueVar.u0().b).j(mshVar, list, false, true);
                                    if (!list.isEmpty()) {
                                        ((rl3) uueVar.o).f(new glj(2132021877, 2500));
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, new ox8(this) { // from class: vy8
                        public final /* synthetic */ uue b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.ox8
                        public final void f(List list) {
                            byte b4 = b2;
                            msh mshVar = mshVarM0;
                            uue uueVar = this.b;
                            switch (b4) {
                                case 0:
                                    if (list == null) {
                                        list = Collections.EMPTY_LIST;
                                    }
                                    uqe uqeVar = (uqe) uueVar.u0().b;
                                    uqeVar.k(mshVar, list, true);
                                    uqeVar.h.k(mshVar, list, false);
                                    ((rl3) uueVar.o).f(new glj(mshVar instanceof ure ? 2132019059 : 2132019057, 2500));
                                    break;
                                case 1:
                                    if (list == null) {
                                        list = Collections.EMPTY_LIST;
                                    }
                                    uqe uqeVar2 = (uqe) uueVar.u0().b;
                                    uqeVar2.k(mshVar, list, true);
                                    uqeVar2.h.k(mshVar, list, false);
                                    ((rl3) uueVar.o).f(new glj(mshVar instanceof ure ? 2132018014 : 2132018010, 2500));
                                    break;
                                default:
                                    if (list == null) {
                                        list = Collections.EMPTY_LIST;
                                    }
                                    ((uqe) uueVar.u0().b).j(mshVar, list, false, true);
                                    if (!list.isEmpty()) {
                                        ((rl3) uueVar.o).f(new glj(2132021877, 2500));
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, new ox8(this) { // from class: vy8
                        public final /* synthetic */ uue b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.ox8
                        public final void f(List list) {
                            byte b4 = b3;
                            msh mshVar = mshVarM0;
                            uue uueVar = this.b;
                            switch (b4) {
                                case 0:
                                    if (list == null) {
                                        list = Collections.EMPTY_LIST;
                                    }
                                    uqe uqeVar = (uqe) uueVar.u0().b;
                                    uqeVar.k(mshVar, list, true);
                                    uqeVar.h.k(mshVar, list, false);
                                    ((rl3) uueVar.o).f(new glj(mshVar instanceof ure ? 2132019059 : 2132019057, 2500));
                                    break;
                                case 1:
                                    if (list == null) {
                                        list = Collections.EMPTY_LIST;
                                    }
                                    uqe uqeVar2 = (uqe) uueVar.u0().b;
                                    uqeVar2.k(mshVar, list, true);
                                    uqeVar2.h.k(mshVar, list, false);
                                    ((rl3) uueVar.o).f(new glj(mshVar instanceof ure ? 2132018014 : 2132018010, 2500));
                                    break;
                                default:
                                    if (list == null) {
                                        list = Collections.EMPTY_LIST;
                                    }
                                    ((uqe) uueVar.u0().b).j(mshVar, list, false, true);
                                    if (!list.isEmpty()) {
                                        ((rl3) uueVar.o).f(new glj(2132021877, 2500));
                                        break;
                                    }
                                    break;
                            }
                        }
                    })));
                    break;
                }
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    public final void p0() {
        vs vsVar = (vs) this.n;
        xlg xlgVarN0 = n0();
        if (xlgVarN0 != null) {
            Context context = ((StylingImageView) vsVar.d).getContext();
            StylingImageView stylingImageView = (StylingImageView) vsVar.d;
            Drawable drawableF = sgb.F(2131232708, context);
            wu5 wu5Var = e9i.f;
            String str = xlgVarN0.m;
            wu5Var.getClass();
            j14.n0(drawableF, wu5.h(str).d.a(context));
            stylingImageView.setImageDrawable(drawableF);
        }
    }

    public final void q0() {
        vs vsVar = (vs) this.n;
        xlg xlgVarN0 = n0();
        if (xlgVarN0 != null) {
            LinearLayout linearLayout = (LinearLayout) ((ov0) vsVar.c).b;
            wu5 wu5Var = e9i.f;
            String str = xlgVarN0.m;
            wu5Var.getClass();
            linearLayout.setBackgroundTintList(ColorStateList.valueOf(wu5.h(str).d.a(((LinearLayout) ((ov0) vsVar.c).b).getContext())));
        }
    }

    public final void r0() {
        vs vsVar = (vs) this.n;
        xlg xlgVarN0 = n0();
        if (xlgVarN0 != null) {
            TextView textView = (TextView) ((ov0) vsVar.c).c;
            wu5 wu5Var = e9i.f;
            String str = xlgVarN0.m;
            wu5Var.getClass();
            textView.setTextColor(wu5.h(str).e.a(((TextView) ((ov0) vsVar.c).c).getContext()));
        }
    }

    public final void s0() {
        vs vsVar = (vs) this.n;
        xlg xlgVarN0 = n0();
        if (xlgVarN0 != null) {
            wu5 wu5Var = e9i.f;
            String str = xlgVarN0.m;
            wu5Var.getClass();
            e9i e9iVarH = wu5.h(str);
            Context context = ((ImageView) ((ov0) vsVar.c).d).getContext();
            int iA = e9iVarH.e.a(context);
            ImageView imageView = (ImageView) ((ov0) vsVar.c).d;
            Drawable drawableF = sgb.F(2131232184, context);
            j14.n0(drawableF, iA);
            imageView.setImageDrawable(drawableF);
        }
    }

    public final void t0() {
        vs vsVar = (vs) this.n;
        xlg xlgVarN0 = n0();
        if (xlgVarN0 != null) {
            OperaTextView operaTextView = (OperaTextView) vsVar.e;
            wu5 wu5Var = e9i.f;
            String str = xlgVarN0.m;
            wu5Var.getClass();
            operaTextView.setTextColor(wu5.h(str).b.a(((OperaTextView) vsVar.e).getContext()));
        }
    }

    public r9i u0() {
        return this.d;
    }
}
