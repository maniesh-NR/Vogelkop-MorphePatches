package defpackage;

import ads_mobile_sdk.yi;

/* loaded from: classes.dex */
public interface bfp {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object c(defpackage.bfp r5, ads_mobile_sdk.sy0 r6, ads_mobile_sdk.a2 r7, ads_mobile_sdk.hg0 r8, nt5 r9) throws android.content.res.Resources.NotFoundException {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.pn0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.pn0 r0 = (ads_mobile_sdk.pn0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.pn0 r0 = new ads_mobile_sdk.pn0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ads_mobile_sdk.hg0 r8 = r0.c
            ads_mobile_sdk.a2 r7 = r0.b
            ads_mobile_sdk.sy0 r6 = r0.a
            defpackage.ybh.y(r9)
            goto L71
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L34:
            defpackage.ybh.y(r9)
            ads_mobile_sdk.cy0 r9 = r6.a
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r3
            prb r2 = new prb
            r2.<init>()
            ads_mobile_sdk.yi r3 = r5.a()
            boolean r3 = r3.d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "app_muted"
            r2.r(r4, r3)
            ads_mobile_sdk.yi r5 = r5.a()
            float r5 = r5.c
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "app_volume"
            r2.r(r3, r5)
            java.lang.String r5 = "volume"
            java.lang.Object r5 = r9.a(r2, r5, r0)
            if (r5 == r1) goto L6e
            kotlin.Unit r5 = kotlin.Unit.a
        L6e:
            if (r5 != r1) goto L71
            return r1
        L71:
            r6.b = r8
            boolean r5 = r7.c0
            if (r5 == 0) goto Lc3
            ads_mobile_sdk.tc3 r5 = new ads_mobile_sdk.tc3
            android.content.Context r7 = r6.getContext()
            r5.<init>(r7)
            android.content.res.Resources r7 = r7.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L8c
            r8 = 2132021867(0x7f14126b, float:1.9682137E38)
            java.lang.String r7 = r7.getString(r8)     // Catch: android.content.res.Resources.NotFoundException -> L8c
            goto L8e
        L8c:
            java.lang.String r7 = "Test Ad"
        L8e:
            r5.setText(r7)
            r7 = 1097859072(0x41700000, float:15.0)
            r5.setTextSize(r7)
            r7 = -1
            r5.setTextColor(r7)
            r7 = 5
            r8 = 0
            r5.setPadding(r7, r8, r7, r8)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            r7.setShape(r8)
            r8 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r7.setColor(r8)
            r8 = 1090519040(0x41000000, float:8.0)
            r7.setCornerRadius(r8)
            r5.setBackground(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = 49
            r9 = -2
            r7.<init>(r9, r9, r8)
            r6.addView(r5, r7)
            r6.bringChildToFront(r5)
        Lc3:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfp.c(bfp, ads_mobile_sdk.sy0, ads_mobile_sdk.a2, ads_mobile_sdk.hg0, nt5):java.lang.Object");
    }

    yi a();
}
