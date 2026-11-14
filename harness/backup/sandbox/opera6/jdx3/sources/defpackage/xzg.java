package defpackage;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xzg extends uim implements am9 {
    public final umi d;
    public final p0h e;
    public final wzg f = new wzg((byte) 0);
    public ViewGroup g;
    public ei h;
    public final bp i;
    public final x5f j;
    public final gjm k;
    public final wt3 l;
    public final boolean m;
    public final boolean n;

    /* JADX WARN: Multi-variable type inference failed */
    public xzg(bp bpVar, umi umiVar, p0h p0hVar, x5f x5fVar, gjm gjmVar, wt3 wt3Var, boolean z, int i) {
        this.i = bpVar;
        this.d = umiVar;
        this.e = p0hVar;
        this.j = x5fVar;
        this.k = gjmVar;
        this.l = wt3Var;
        this.m = z;
        this.n = i;
    }

    public static void j0(w wVar, j83 j83Var, boolean z) {
        Fragment fragmentE;
        a aVarF = u35.f(wVar, wVar);
        View view = null;
        aVarF.e(2131363025, j83Var, (String) null, 2);
        aVarF.c("PrivacyMonitorFragment");
        if (z && (fragmentE = wVar.E(2131363025)) != null) {
            view = fragmentE.getView();
        }
        if (view != null) {
            j83Var.setSharedElementEnterTransition(new zzg());
            ((ym9) aVarF).r = true;
            String transitionName = view.getTransitionName();
            fn9 fn9Var = an9.a;
            WeakHashMap weakHashMap = r5n.a;
            String transitionName2 = view.getTransitionName();
            if (transitionName2 == null) {
                qp2.o("Unique transitionNames are required for all sharedElements");
                return;
            }
            if (((ym9) aVarF).p == null) {
                ((ym9) aVarF).p = new ArrayList();
                ((ym9) aVarF).q = new ArrayList();
            } else if (((ym9) aVarF).q.contains(transitionName)) {
                qp2.o(sko.k("A shared element with the target name '", transitionName, "' has already been added to the transaction."));
                return;
            } else if (((ym9) aVarF).p.contains(transitionName2)) {
                qp2.o(sko.k("A shared element with the source name '", transitionName2, "' has already been added to the transaction."));
                return;
            }
            ((ym9) aVarF).p.add(transitionName2);
            ((ym9) aVarF).q.add(transitionName);
        } else {
            ((ym9) aVarF).h = 4099;
        }
        aVarF.h();
    }

    @Override // defpackage.uim
    public final Dialog g0(Bundle bundle) {
        bp bpVar = this.i;
        return bpVar == null ? !this.n ? new rzg(this, requireContext()) : new szg(this, new s8n(requireContext(), 2130969943)) : new tzg(this, requireContext(), bpVar);
    }

    public final void i0() {
        n1h.n((StylingImageView) this.h.f, 2132021917, 0);
        p0h p0hVar = this.e;
        p0hVar.e.j(this, new hze(this));
        p0hVar.f.j(this, new qzg(this, (byte) 0));
        ei eiVar = this.h;
        new ghf(eiVar.h, eiVar.e, (FadingScrollView) eiVar.g, this.f, p0hVar.g, p0hVar.e, this);
        this.h.h.setOnClickListener(new pzg(this, (byte) 2));
        byte b = 3;
        ((StylingImageView) this.h.f).setOnClickListener(new pzg(this, b));
        ((TextSwitcher) this.h.i).setOnClickListener(new pzg(this, (byte) 4));
        getChildFragmentManager().o.add(this);
        j0(getChildFragmentManager(), new f0h(this.d, this.e, this.f, this.j, this.m, this.k), false);
        yq1 yq1Var = (StylingTextView) this.h.d;
        kkf kkfVar = new kkf(this, b);
        dll dllVarS = q9n.s(yq1Var);
        if (dllVarS != null) {
            u8n.b(dllVarS, yq1Var, kkfVar);
        }
        nv6 nv6VarB = ru9.c(requireContext()).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("privacy_monitor.shown", true);
        nv6VarB.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(java.lang.String r14, defpackage.nwi r15) {
        /*
            r13 = this;
            ei r13 = r13.h
            android.view.View r13 = r13.d
            com.opera.android.custom_views.StylingTextView r13 = (com.opera.android.custom_views.StylingTextView) r13
            android.content.Context r0 = r13.getContext()
            r1 = 2130969323(0x7f0402eb, float:1.7547325E38)
            r2 = 2131102475(0x7f060b0b, float:1.7817389E38)
            android.content.res.ColorStateList r1 = f03.u(r1, r0, r2)
            int r1 = r1.getDefaultColor()
            r2 = 2130969119(0x7f04021f, float:1.754691E38)
            r3 = 2131102430(0x7f060ade, float:1.7817298E38)
            android.content.res.ColorStateList r2 = f03.u(r2, r0, r3)
            int r2 = r2.getDefaultColor()
            r3 = 16842808(0x1010038, float:2.3693715E-38)
            r4 = 2131099826(0x7f0600b2, float:1.7812016E38)
            android.content.res.ColorStateList r0 = f03.u(r3, r0, r4)
            int r0 = r0.getDefaultColor()
            java.lang.String r3 = r14.toString()
            kpm r3 = defpackage.kpm.a(r3)
            int r4 = r3.a
            int r5 = r3.b
            int r6 = r4 + r5
            int r7 = r3.c
            int r3 = r3.d
            int r8 = r7 + r3
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r14)
            java.lang.String r10 = "data"
            r11 = 33
            if (r5 <= 0) goto La4
            int r15 = r15.ordinal()
            if (r15 == 0) goto L84
            r12 = 1
            if (r15 == r12) goto L73
            r1 = 2
            if (r15 == r1) goto L84
            r1 = 3
            if (r15 != r1) goto L9a
            lpm r15 = new lpm
            r15.<init>(r2)
            r9.setSpan(r15, r4, r6, r11)
            mpm r15 = new mpm
            r15.<init>()
            r9.setSpan(r15, r4, r6, r11)
            goto L9a
        L73:
            lpm r15 = new lpm
            r15.<init>(r1)
            r9.setSpan(r15, r4, r6, r11)
            jpm r15 = new jpm
            r15.<init>(r12)
            r9.setSpan(r15, r4, r6, r11)
            goto L9a
        L84:
            java.lang.CharSequence r15 = r14.subSequence(r4, r6)
            java.lang.String r15 = r15.toString()
            boolean r15 = r10.equals(r15)
            if (r15 != 0) goto L9a
            lpm r15 = new lpm
            r15.<init>(r0)
            r9.setSpan(r15, r4, r6, r11)
        L9a:
            if (r3 <= 0) goto La4
            lpm r15 = new lpm
            r15.<init>(r0)
            r9.setSpan(r15, r6, r7, r11)
        La4:
            if (r3 <= 0) goto Lb3
            lpm r15 = new lpm
            r15.<init>(r0)
            int r14 = r14.length()
            r9.setSpan(r15, r8, r14, r11)
            goto Lcf
        Lb3:
            if (r5 <= 0) goto Lcf
            java.lang.CharSequence r15 = r14.subSequence(r4, r6)
            java.lang.String r15 = r15.toString()
            boolean r15 = r10.equals(r15)
            if (r15 == 0) goto Lcf
            lpm r15 = new lpm
            r15.<init>(r0)
            int r14 = r14.length()
            r9.setSpan(r15, r6, r14, r11)
        Lcf:
            r13.setText(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzg.k0(java.lang.String, nwi):void");
    }

    public final void onBackStackChanged() {
        int iJ = getChildFragmentManager().J();
        if (iJ == 0) {
            dismiss();
            return;
        }
        ei eiVar = this.h;
        byte b = 0;
        byte b2 = 1;
        if (iJ == 1) {
            ((StylingImageView) eiVar.f).setVisibility(8);
        } else {
            ((StylingImageView) eiVar.f).setVisibility(0);
        }
        boolean z = getChildFragmentManager().E(2131363025) instanceof i0h;
        ei eiVar2 = this.h;
        if (z) {
            eiVar2.h.setText(2132021561);
            this.h.h.setOnClickListener(new pzg(this, b));
        } else {
            eiVar2.h.setText(2132021412);
            this.h.h.setOnClickListener(new pzg(this, b2));
        }
    }

    @Override // defpackage.uim
    public final void onDestroy() {
        getChildFragmentManager().o.remove(this);
        this.h = null;
        this.g = null;
        super.onDestroy();
    }
}
