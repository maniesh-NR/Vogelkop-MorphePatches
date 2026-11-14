package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yn4 extends lim {
    public final gld a;
    public final wn4 b = new wn4();
    public final i7f c = new i7f();
    public final xn4 d = new xn4(this);
    public final vnd e;
    public xbf f;
    public SessionManager g;
    public dod h;
    public boolean i;
    public CastSession j;

    public yn4(gld gldVar) {
        this.a = gldVar;
        String strCategoryForCast = CastMediaControlIntent.categoryForCast("AA93A640");
        if (strCategoryForCast == null) {
            qp2.o("category must not be null");
            throw null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (!arrayList.contains(strCategoryForCast)) {
            arrayList.add(strCategoryForCast);
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", arrayList);
        this.e = new vnd(bundle, arrayList);
        gldVar.getLifecycle().a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @Override // defpackage.as6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(ndc r8) throws java.lang.NumberFormatException {
        /*
            r7 = this;
            gld r8 = r7.a
            android.content.Context r8 = r8.requireContext()
            boolean r0 = defpackage.i0l.g()
            r1 = 1
            if (r0 == 0) goto L31
            java.lang.String r0 = android.os.Build.ID
            r2 = 45
            int r2 = r0.indexOf(r2)
            r3 = -1
            r5 = -1
            if (r2 == r5) goto L2b
            r6 = 46
            int r6 = r0.indexOf(r6, r2)
            if (r6 == r5) goto L2b
            int r2 = r2 + r1
            java.lang.String r0 = r0.substring(r2, r6)     // Catch: java.lang.NumberFormatException -> L2b
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L2b
        L2b:
            r5 = 12936(0x3288, double:6.391E-320)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L48
        L31:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r2 = 12600000(0xc042c0, float:1.765636E-38)
            int r0 = r0.isGooglePlayServicesAvailable(r8, r2)
            if (r0 != 0) goto L48
            com.google.android.gms.cast.framework.CastContext r0 = com.google.android.gms.cast.framework.CastContext.getSharedInstance(r8)     // Catch: java.lang.RuntimeException -> L48
            java.lang.String r2 = "AA93A640"
            r0.setReceiverApplicationId(r2)     // Catch: java.lang.RuntimeException -> L48
            goto L49
        L48:
            r1 = 0
        L49:
            r7.i = r1
            if (r1 == 0) goto L53
            dod r8 = dod.d(r8)
            r7.h = r8
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn4.W(ndc):void");
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        dod dodVar = this.h;
        if (dodVar != null) {
            dodVar.j(this.b);
            this.h = null;
        }
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        dod dodVar = this.h;
        if (dodVar != null) {
            dodVar.a(this.e, this.b, 4);
        }
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        dod dodVar = this.h;
        if (dodVar != null) {
            dodVar.a(this.e, this.b, 0);
        }
    }
}
