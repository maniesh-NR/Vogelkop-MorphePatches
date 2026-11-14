package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class j8k extends ab2 implements ev8 {
    public final or2 d;
    public final fd e;
    public final tsd f;

    /* JADX WARN: Illegal instructions before constructor call */
    public j8k(or2 or2Var, pde pdeVar, fd fdVar, tsd tsdVar) {
        LinearLayout linearLayout = (LinearLayout) or2Var.c;
        super(linearLayout);
        this.d = or2Var;
        this.e = fdVar;
        this.f = tsdVar;
        kze kzeVarZ = p37.z(linearLayout);
        final byte b = 0;
        a26.T(pdeVar, kzeVarZ, new f7f(this) { // from class: h8k
            public final /* synthetic */ j8k b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                j8k j8kVar = this.b;
                switch (b2) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        p37.o0((LinearLayout) j8kVar.d.c, iIntValue, 0, iIntValue, 0, 10);
                        break;
                    default:
                        or2 or2Var2 = j8kVar.d;
                        j8kVar.b0((FrameLayout) or2Var2.d);
                        j8kVar.b0((FrameLayout) or2Var2.e);
                        break;
                }
            }
        });
        a26.U(fdVar, kzeVarZ, new yc(this, (byte) 5), new dnj(this, (byte) 13));
        int i = d03.e;
        FrameLayout frameLayout = (FrameLayout) or2Var.d;
        ydp.q(frameLayout, j14.i0(2131233194, frameLayout.getContext()));
        FrameLayout frameLayout2 = (FrameLayout) or2Var.e;
        ydp.q(frameLayout2, j14.i0(2131233194, frameLayout2.getContext()));
        final byte b2 = 1;
        a26.T(tsdVar, kzeVarZ, new f7f(this) { // from class: h8k
            public final /* synthetic */ j8k b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                j8k j8kVar = this.b;
                switch (b22) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        p37.o0((LinearLayout) j8kVar.d.c, iIntValue, 0, iIntValue, 0, 10);
                        break;
                    default:
                        or2 or2Var2 = j8kVar.d;
                        j8kVar.b0((FrameLayout) or2Var2.d);
                        j8kVar.b0((FrameLayout) or2Var2.e);
                        break;
                }
            }
        });
        r8n r8nVar = new r8n(this) { // from class: i8k
            public final /* synthetic */ j8k b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view) {
                byte b3 = b;
                j8k j8kVar = this.b;
                switch (b3) {
                    case 0:
                        j8kVar.b0((FrameLayout) j8kVar.d.d);
                        j8kVar.e0();
                        break;
                    default:
                        or2 or2Var2 = j8kVar.d;
                        j8kVar.b0((FrameLayout) or2Var2.e);
                        j8kVar.c0((FrameLayout) or2Var2.e, (StylingTextView) or2Var2.f, pc.A);
                        break;
                }
            }
        };
        dll dllVarS = q9n.s(frameLayout);
        if (dllVarS != null) {
            u8n.b(dllVarS, frameLayout, r8nVar);
        }
        r8n r8nVar2 = new r8n(this) { // from class: i8k
            public final /* synthetic */ j8k b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view) {
                byte b3 = b2;
                j8k j8kVar = this.b;
                switch (b3) {
                    case 0:
                        j8kVar.b0((FrameLayout) j8kVar.d.d);
                        j8kVar.e0();
                        break;
                    default:
                        or2 or2Var2 = j8kVar.d;
                        j8kVar.b0((FrameLayout) or2Var2.e);
                        j8kVar.c0((FrameLayout) or2Var2.e, (StylingTextView) or2Var2.f, pc.A);
                        break;
                }
            }
        };
        dll dllVarS2 = q9n.s(frameLayout2);
        if (dllVarS2 == null) {
            return;
        }
        u8n.b(dllVarS2, frameLayout2, r8nVar2);
    }

    public final void b0(View view) {
        view.setBackgroundTintList(ColorStateList.valueOf(((v8k) this.f.g()).d(view.getContext())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(View view, StylingTextView stylingTextView, pc pcVar) {
        jf jfVarE = this.e.e(pcVar);
        if (jfVarE == null) {
            jfVarE = fd.e;
        }
        xc xcVar = jfVarE.c;
        if (xcVar == null) {
            xcVar = pcVar.a;
        }
        Context context = stylingTextView.getContext();
        int i = xcVar.a;
        rxh rxhVar = xcVar.b;
        Drawable drawableF = sgb.F(i, context);
        rm5 rm5Var = xcVar.f;
        if (rm5Var.equals(uc.m)) {
            j14.o0(drawableF, f03.u(2130969288, stylingTextView.getContext(), 0));
        } else if (!rm5Var.equals(vc.m) && !(rm5Var instanceof wc)) {
            h9o.p();
            return;
        }
        stylingTextView.setText(rxhVar.a(stylingTextView.getResources()));
        stylingTextView.s(drawableF, null);
        CharSequence charSequenceA = rxhVar.a(view.getResources());
        int i2 = xcVar.e;
        view.setContentDescription(charSequenceA);
        n1h.o(view, charSequenceA, i2);
        view.setOnClickListener(new a24(jfVarE, (byte) 1));
        view.setEnabled(jfVarE.d);
    }

    public final void e0() {
        pc pcVar = pc.z;
        boolean zB = this.e.b(pcVar);
        or2 or2Var = this.d;
        if (zB) {
            c0((FrameLayout) or2Var.d, (StylingTextView) or2Var.b, pcVar);
        } else {
            c0((FrameLayout) or2Var.d, (StylingTextView) or2Var.b, pc.m);
        }
    }
}
