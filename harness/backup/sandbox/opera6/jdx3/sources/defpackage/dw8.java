package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.CapturableButton;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class dw8 extends mv9 {
    public final StylingImageView e;
    public final /* synthetic */ ew8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw8(final ew8 ew8Var, View view) {
        super(ew8Var, view);
        this.f = ew8Var;
        int i = 2131362240;
        View viewJ = w1h.j(2131362240, view);
        if (viewJ != null) {
            ov0 ov0VarC = ov0.c(viewJ);
            MaterialButton materialButton = (CapturableButton) ov0VarC.d;
            MaterialButton materialButton2 = (CapturableButton) ov0VarC.c;
            int i2 = 2131362997;
            StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362997, view);
            if (stylingImageView != null) {
                i2 = 2131363101;
                if (w1h.j(2131363101, view) != null) {
                    i2 = 2131363509;
                    if (w1h.j(2131363509, view) != null) {
                        this.e = stylingImageView;
                        materialButton2.setText(2132019498);
                        final byte b = 0;
                        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: cw8
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int iIndexOf;
                                byte b2 = b;
                                ew8 ew8Var2 = ew8Var;
                                switch (b2) {
                                    case 0:
                                        nrl nrlVar = ew8Var2.k;
                                        Object obj = ew8Var2.m;
                                        nrlVar.a = false;
                                        ((qp5) nrlVar.b).accept(obj);
                                        ew8Var2.q.s0();
                                        ew8Var2.w();
                                        break;
                                    default:
                                        nrl nrlVar2 = ew8Var2.k;
                                        Object obj2 = ew8Var2.l;
                                        nrlVar2.a = false;
                                        ((qp5) nrlVar2.b).accept(obj2);
                                        jue jueVar = ew8Var2.o;
                                        kue kueVar = jueVar.d;
                                        bwf bwfVar = jueVar.c;
                                        if (bwfVar != null && (iIndexOf = kueVar.f.indexOf(bwfVar)) != -1) {
                                            kueVar.a(iIndexOf);
                                            ew8Var2.q.s0();
                                        }
                                        ew8Var2.w();
                                        break;
                                }
                            }
                        });
                        materialButton.setText(2132020631);
                        final byte b2 = 1;
                        materialButton.setOnClickListener(new View.OnClickListener() { // from class: cw8
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int iIndexOf;
                                byte b22 = b2;
                                ew8 ew8Var2 = ew8Var;
                                switch (b22) {
                                    case 0:
                                        nrl nrlVar = ew8Var2.k;
                                        Object obj = ew8Var2.m;
                                        nrlVar.a = false;
                                        ((qp5) nrlVar.b).accept(obj);
                                        ew8Var2.q.s0();
                                        ew8Var2.w();
                                        break;
                                    default:
                                        nrl nrlVar2 = ew8Var2.k;
                                        Object obj2 = ew8Var2.l;
                                        nrlVar2.a = false;
                                        ((qp5) nrlVar2.b).accept(obj2);
                                        jue jueVar = ew8Var2.o;
                                        kue kueVar = jueVar.d;
                                        bwf bwfVar = jueVar.c;
                                        if (bwfVar != null && (iIndexOf = kueVar.f.indexOf(bwfVar)) != -1) {
                                            kueVar.a(iIndexOf);
                                            ew8Var2.q.s0();
                                        }
                                        ew8Var2.w();
                                        break;
                                }
                            }
                        });
                        return;
                    }
                }
            }
            i = i2;
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        this.f.p.f = new bn7(this, (byte) 23);
        e0();
    }

    @Override // defpackage.ab2
    public final void Y() {
        this.f.p.f = null;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void e0() {
        lvc lvcVar = this.f.p;
        ?? r6 = this.e;
        Context context = r6.getContext();
        lvcVar.getClass();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), vtp.K(2131231685, lvcVar.e));
        int iRound = Math.round(TypedValue.applyDimension(1, 40.0f, context.getResources().getDisplayMetrics()));
        int iRound2 = Math.round(TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics()));
        PathInterpolator pathInterpolator = s8i.d;
        r6.setImageDrawable(new p8i(iRound, iRound2, context, bitmapDecodeResource));
    }
}
