package defpackage;

import android.content.Context;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.permissions.PermissionBridge;

/* loaded from: classes.dex */
public final class z9g extends nz0 {
    public final lag a;
    public final int b;
    public kag c;
    public boolean d;
    public final /* synthetic */ jb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9g(jb jbVar, lag lagVar, int i) {
        super(true, false);
        this.e = jbVar;
        this.a = lagVar;
        this.b = i;
    }

    public final void b(boolean z, boolean z2) {
        if (this.d) {
            return;
        }
        this.d = true;
        jb jbVar = this.e;
        jbVar.d(this.b, z2, jbVar.b && z);
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132018541);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132017536);
    }

    @Override // defpackage.nz0
    public final boolean isRequestValid(b2l b2lVar) {
        jb jbVar = this.e;
        nrl nrlVar = (nrl) jbVar.d;
        String str = (String) jbVar.h;
        String str2 = (String) jbVar.i;
        lag lagVar = lag.b;
        lag lagVar2 = this.a;
        if (lagVar2 != lagVar && lagVar2 != lag.h) {
            str = str2;
        }
        kag kagVarH = ((s9g) nrlVar.b).h(lagVar2, str, nrlVar.a);
        if (kagVarH == kag.ASK) {
            return super.isRequestValid(b2lVar);
        }
        this.c = kagVarH;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.nz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateDialog(az0 r12) throws android.content.res.Resources.NotFoundException {
        /*
            r11 = this;
            android.content.Context r0 = r12.getContext()
            wy0 r1 = r12.a
            android.content.res.Resources r0 = r0.getResources()
            jb r2 = r11.e
            java.io.Serializable r3 = r2.h
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.i
            java.lang.String r4 = (java.lang.String) r4
            lag r5 = defpackage.lag.b
            lag r11 = r11.a
            if (r11 == r5) goto L1f
            lag r5 = defpackage.lag.h
            if (r11 == r5) goto L1f
            r3 = r4
        L1f:
            int r11 = r11.ordinal()
            r4 = 2
            r5 = 1
            r6 = 0
            if (r11 == r4) goto L5e
            r4 = 3
            if (r11 == r4) goto L57
            r4 = 4
            if (r11 == r4) goto L50
            r4 = 5
            if (r11 == r4) goto L50
            r4 = 7
            if (r11 == r4) goto L48
            r4 = 8
            if (r11 == r4) goto L3d
            r11 = r6
            r4 = r11
            r7 = r4
        L3b:
            r8 = r7
            goto L65
        L3d:
            r11 = 2132019545(0x7f140959, float:1.9677428E38)
            r4 = 2132019544(0x7f140958, float:1.9677426E38)
            r7 = 2131232126(0x7f08057e, float:1.8080352E38)
            r8 = r5
            goto L65
        L48:
            r11 = 2132017977(0x7f140339, float:1.9674248E38)
            r4 = 2132017976(0x7f140338, float:1.9674246E38)
        L4e:
            r7 = r6
            goto L3b
        L50:
            r11 = 2132022090(0x7f14134a, float:1.968259E38)
            r4 = 2132022089(0x7f141349, float:1.9682588E38)
            goto L4e
        L57:
            r11 = 2132020582(0x7f140d66, float:1.9679531E38)
            r4 = 2132020581(0x7f140d65, float:1.967953E38)
            goto L4e
        L5e:
            r11 = 2132019206(0x7f140806, float:1.967674E38)
            r4 = 2132019205(0x7f140805, float:1.9676738E38)
            goto L4e
        L65:
            java.lang.Object[] r9 = new java.lang.Object[]{r3}
            java.lang.String r4 = r0.getString(r4, r9)
            r9 = 0
            if (r7 == 0) goto L9e
            android.content.Context r10 = r12.getContext()
            java.lang.String r11 = r0.getString(r11)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r10)
            r10 = 2131558667(0x7f0d010b, float:1.8742656E38)
            android.view.View r0 = r0.inflate(r10, r9, r6)
            r6 = 2131362594(0x7f0a0322, float:1.8344973E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageResource(r7)
            r6 = 2131363525(0x7f0a06c5, float:1.8346861E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r11)
            r1.e = r0
            goto La5
        L9e:
            java.lang.String r11 = r0.getString(r11)
            r12.setTitle(r11)
        La5:
            if (r8 == 0) goto Lc4
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r4)
            int r0 = r4.indexOf(r3)
            if (r0 < 0) goto Lc1
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r5)
            int r3 = r3.length()
            int r3 = r3 + r0
            r6 = 33
            r11.setSpan(r4, r0, r3, r6)
        Lc1:
            r1.f = r11
            goto Lc6
        Lc4:
            r1.f = r4
        Lc6:
            boolean r11 = r2.b
            if (r11 == 0) goto Ld8
            android.content.Context r11 = r12.getContext()
            r0 = 2132020887(0x7f140e97, float:1.968015E38)
            android.widget.FrameLayout r11 = phj.I(r11, r0, r5, r9)
            r12.setView(r11)
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9g.onCreateDialog(az0):void");
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        bz0Var.setCanceledOnTouchOutside(false);
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        jb jbVar;
        int i;
        kag kagVar = this.c;
        if (kagVar != null) {
            b(true, kagVar == kag.GRANTED);
            return;
        }
        if (hjmVar == hjm.b && this.b == (i = (jbVar = this.e).c)) {
            cag[] cagVarArr = (cag[]) jbVar.g;
            cagVarArr[i] = new cag(kag.ASK, cagVarArr[i].b);
            PermissionBridge.PermissionCallback permissionCallback = (PermissionBridge.PermissionCallback) jbVar.j;
            if (permissionCallback != null) {
                permissionCallback.run(cagVarArr);
            }
            ((s9g) ((nrl) jbVar.d).b).g.remove(Integer.valueOf(jbVar.a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Override // defpackage.nz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNegativeButtonClicked(bz0 r3) {
        /*
            r2 = this;
            jb r0 = r2.e
            boolean r0 = r0.b
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = 2131362471(0x7f0a02a7, float:1.8344724E38)
            android.view.View r3 = r3.findViewById(r0)
            com.opera.android.custom_views.CheckBox r3 = (com.opera.android.custom_views.CheckBox) r3
            if (r3 != 0) goto L14
            r3 = r1
            goto L16
        L14:
            boolean r3 = r3.n
        L16:
            if (r3 == 0) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = r1
        L1b:
            r2.b(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9g.onNegativeButtonClicked(bz0):void");
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        boolean z = false;
        if (this.e.b) {
            CheckBox checkBox = (CheckBox) bz0Var.findViewById(2131362471);
            if (checkBox == null ? false : checkBox.n) {
                z = true;
            }
        }
        b(z, true);
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        phj.Q(bz0Var, true);
        q9n.h(bz0Var.getContext());
    }

    @Override // defpackage.nz0
    public final boolean useTapStealingProtection() {
        return true;
    }
}
