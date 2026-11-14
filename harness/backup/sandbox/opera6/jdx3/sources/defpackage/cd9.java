package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailability;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.Spinner;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class cd9 extends s63 implements jbl, gi2 {
    public final umi l = vml.d;
    public final ArrayList m = new ArrayList();
    public int n = 1;
    public ne5 o;
    public rma p;
    public oml q;
    public Bitmap r;
    public String s;
    public String t;
    public od9 u;
    public boolean v;

    public final void A0(int i) {
        int iA = vep.A(i);
        if (iA == 0) {
            String string = getString(2132019103);
            this.n = 3;
            this.t = string;
            y0();
            return;
        }
        if (iA == 1 || iA == 2) {
            String string2 = getString(2132019102);
            this.n = 3;
            this.t = string2;
            y0();
        }
    }

    public final void B0(int i) {
        od9 od9Var = this.u;
        if (od9Var != null) {
            od9Var.g0();
            this.u = null;
        }
        bn7 bn7Var = new bn7((Object) this, (byte) 29);
        n99 n99Var = new n99();
        n99Var.l = bn7Var;
        n99Var.m = i;
        n99Var.w0(getContext());
    }

    public final void C0(String str) {
        this.n = 1;
        this.t = null;
        y0();
        oml omlVar = this.q;
        if (omlVar != null) {
            omlVar.cancel(true);
        }
        this.s = str;
        Resources resources = getResources();
        Context contextRequireContext = requireContext();
        n5o s49Var = new s49((byte) 6);
        umi umiVar = this.l;
        nml nmlVarE = umiVar.e(s49Var);
        nmlVarE.b(umiVar.f(new bm8(this, (byte) 13)));
        ArrayList arrayList = new ArrayList();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165747);
        int iT = f03.t(2130970478, contextRequireContext, 2131101243);
        Drawable drawableF = sgb.F(2131232497, contextRequireContext);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165746);
        arrayList.add(new seh(drawableF, new fr(dimensionPixelSize2, dimensionPixelSize2, (byte) 19)));
        Drawable drawableF2 = sgb.F(2131232496, contextRequireContext);
        if (str == null || dimensionPixelSize <= 0) {
            hai.d();
        } else {
            this.q = nmlVarE.a(new teh(str, dimensionPixelSize, iT, arrayList, drawableF2));
        }
    }

    @Override // defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        this.p = new rma(((OperaApplication) context.getApplicationContext()).s(), this.l, this);
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        oml omlVar = this.q;
        if (omlVar != null) {
            omlVar.cancel(true);
            this.q = null;
        }
        rma rmaVar = this.p;
        if (rmaVar != null) {
            rmaVar.f();
            ((bf9) rmaVar.d).H((j99) rmaVar.c);
            this.p = null;
        }
    }

    @Override // defpackage.gi2
    public final void p(String str, s14 s14Var) {
        z0(new gl6((Object) this, (Object) str, (Object) s14Var, (byte) 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d7 A[PHI: r1
      0x01d7: PHI (r1v4 int) = (r1v3 int), (r1v12 int) binds: [B:46:0x00d5, B:60:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.s63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dgh s0(android.view.LayoutInflater r26, android.view.ViewGroup r27, defpackage.epj r28) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd9.s0(android.view.LayoutInflater, android.view.ViewGroup, epj):dgh");
    }

    @Override // defpackage.s63
    public final void t0() {
        od9 od9Var = this.u;
        if (od9Var != null) {
            od9Var.g0();
            this.u = null;
        }
        this.s = null;
        this.o = null;
    }

    @Override // defpackage.s63
    public final void v0() {
        if (!this.v) {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(getContext());
            if (iIsGooglePlayServicesAvailable == 0) {
                this.v = true;
            } else {
                googleApiAvailability.showErrorDialogFragment(getActivity(), iIsGooglePlayServicesAvailable, 0);
            }
        }
        ArrayList arrayList = this.m;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        vml.c(new cn7(this, arrayList2, (byte) 22));
    }

    @Override // defpackage.jbl
    public final String y() {
        return "flow-generate";
    }

    public final void y0() {
        ne5 ne5Var = this.o;
        if (ne5Var != null) {
            ((StylingImageView) ne5Var.d).setImageBitmap(this.r);
            ((StylingTextView) this.o.e).setText(this.t);
            int iA = vep.A(this.n);
            if (iA == 0) {
                ((Spinner) this.o.a).animate().alpha(1.0f);
                ((StylingImageView) this.o.d).animate().alpha(0.0f);
                ((StylingImageButton) this.o.b).animate().alpha(0.0f);
            } else if (iA == 1) {
                ((Spinner) this.o.a).animate().alpha(0.0f);
                ((StylingImageView) this.o.d).animate().alpha(1.0f);
                ((StylingImageButton) this.o.b).animate().alpha(0.0f);
            } else {
                if (iA != 2) {
                    return;
                }
                ((Spinner) this.o.a).animate().alpha(0.0f);
                ((StylingImageView) this.o.d).animate().alpha(0.0f);
                ((StylingImageButton) this.o.b).animate().alpha(1.0f);
            }
        }
    }

    public final void z0(Runnable runnable) {
        if (isResumed()) {
            runnable.run();
        } else {
            this.m.add(runnable);
        }
    }
}
