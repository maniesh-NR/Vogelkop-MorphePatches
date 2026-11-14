package com.opera.android.account.auth;

import J.N;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.i;
import defpackage.cjm;
import defpackage.l24;
import defpackage.lsc;
import defpackage.m24;
import defpackage.ryl;
import defpackage.tvh;
import defpackage.yij;
import defpackage.zhj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public class OperaAuthPortalActivity extends yij implements m24 {
    public final pad S = new pad((byte) 7);
    public int T = 1;
    public tvh U;

    @Override // defpackage.rz4
    public final boolean E0(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2) {
        if (super.E0(navigationHandle, gurl, z, z2)) {
            return true;
        }
        Uri uri = Uri.parse(gurl.g());
        if (vep.A(this.T) != 1) {
            return false;
        }
        if (!f03.J(uri, 4) && !f03.J(uri, 11) && !f03.J(uri, 7)) {
            return false;
        }
        this.T = 1;
        invalidateOptionsMenu();
        return false;
    }

    @Override // defpackage.g53
    public final Uri F0() {
        return dgh.h().buildUpon().appendEncodedPath(vep.h(11)).appendQueryParameter("service", "ofa").build();
    }

    @Override // defpackage.g53
    public final String G0() {
        return vep.A(this.T) != 0 ? "" : getResources().getString(2132017271);
    }

    @Override // defpackage.g53
    public final void J0() {
    }

    @Override // defpackage.g53
    public final void L0(View view) {
    }

    @Override // defpackage.m24
    public final void a(l24 l24Var) {
        this.S.t(l24Var);
    }

    @Override // defpackage.m24
    public final void c(l24 l24Var) {
        this.S.A(l24Var);
    }

    @Override // defpackage.dx3
    public final cjm c0(Class cls) {
        return new cjm(2131361903, ryl.class.isAssignableFrom(cls) ? false : i.class.isAssignableFrom(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, 2130772040);
    }

    @Override // defpackage.dx3, defpackage.hjf
    public final Object getSystemService(String str) {
        return "com.opera.android.BPR_SERVICE".equals(str) ? this : super.getSystemService(str);
    }

    @Override // defpackage.dx3, defpackage.kl9
    public final void h(zhj zhjVar) {
        X(zhjVar, 2131361903);
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final int j0() {
        return 2131559178;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yij, com.opera.android.FullscreenWebActivity
    public final void p0() {
        tvh tvhVar = (tvh) yi4.x(getIntent(), "FALLBACK_REQUEST_BUILDER", tvh.class);
        this.U = tvhVar;
        if (tvhVar != null) {
            this.T = 2;
        }
        super.p0();
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void r0(int i, String str) {
        tvh tvhVar;
        lsc lscVar;
        lj9 lj9VarA;
        if (this.T != 2 || (tvhVar = this.U) == null) {
            super.r0(i, str);
            return;
        }
        boolean zIsEmpty = tvhVar.c.isEmpty();
        String str2 = tvhVar.a;
        if (zIsEmpty) {
            lscVar = new lsc(str2, 0);
            lj9VarA = null;
        } else {
            lscVar = new lsc(str2, 7);
            lscVar.c = true;
            lj9VarA = tvhVar.a();
        }
        HashMap map = new HashMap();
        ArrayList arrayList = tvhVar.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            lyf lyfVar = (lyf) obj;
            map.put((String) lyfVar.a, (String) lyfVar.b);
        }
        if (lj9VarA != null) {
        }
        lscVar.f = map;
        if (lj9VarA != null) {
            d04 d04Var = new d04();
            try {
                lj9VarA.a(d04Var, false);
            } catch (IOException unused) {
            }
            lscVar.i = new ResourceRequestBody((byte[]) N.MugoAW_d(d04Var.G().v()));
            lscVar.c = true;
        }
        this.U = null;
        if (i == 0) {
            lscVar.k = true;
        } else if (i == 1) {
            lscVar.k = false;
        }
        n0().q().r(lscVar);
    }
}
