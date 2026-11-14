package com.opera.android.webapps;

import J.N;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.bi;
import defpackage.dx3;
import defpackage.fv;
import defpackage.ghf;
import defpackage.jv;
import defpackage.nml;
import defpackage.umi;
import defpackage.xj;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class AddToHomescreenDataFetcherNative implements fv {
    public final dx3 a;
    public final umi b;
    public final WebContents c;
    public bi d;
    public Uri e;
    public boolean f;
    public Bitmap g;
    public boolean h;
    public int i = 0;
    public int j = 0;
    public long k = 2147483648L;
    public long l = 2147483648L;
    public String m;
    public String n;
    public iv o;
    public boolean p;

    public AddToHomescreenDataFetcherNative(dx3 dx3Var, umi umiVar, WebContents webContents) {
        this.a = dx3Var;
        this.b = umiVar;
        this.c = webContents;
        N.MpjW_y1N(this, webContents);
    }

    @Override // defpackage.fv
    public final void a(String str, jv jvVar) {
        this.p = true;
        Bitmap bitmap = this.g;
        if (bitmap == null) {
            this.o = new iv(this, str, jvVar, (byte) 0);
            return;
        }
        if (this.d != null) {
            ShortcutHelper.a(this.a, this.b, str, this.e, this.f, bitmap, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            jvVar.run();
        }
        N.MJ7IP8TN(this.c);
        this.d = null;
        this.o = null;
        this.p = false;
    }

    @Override // defpackage.fv
    public final void b(bi biVar) {
        this.d = biVar;
        N.MWy63Wsi(this.c);
    }

    @Override // defpackage.fv
    public final void c() {
        this.d = null;
        if (this.p) {
            return;
        }
        N.MJ7IP8TN(this.c);
        this.d = null;
        this.o = null;
        this.p = false;
    }

    public final void d(Bitmap bitmap) {
        xj xjVar = new xj(this, bitmap, (byte) 4);
        umi umiVar = this.b;
        nml nmlVarE = umiVar.e(xjVar);
        nmlVarE.b(umiVar.f(new bi(this, (byte) 9)));
        nmlVarE.a(bitmap);
    }

    public final void onFaviconFetched(@Nullable Bitmap bitmap) {
        if (bitmap != null) {
            d(bitmap);
            return;
        }
        zy9 zy9Var = new zy9(this);
        fp1 fp1Var = this.a;
        new ghf(cqp.f0(fp1Var), this.e.toString(), Math.round(fp1Var.getResources().getDimension(2131167804)), this.b, zy9Var, 3000L);
    }

    public final void onInitialized(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, int i, int i2, boolean z, long j, long j2) {
        this.e = Uri.parse(str4);
        this.f = z;
        this.i = i2;
        this.j = i;
        this.k = j;
        this.l = j2;
        this.m = str2;
        this.n = str3;
        bi biVar = this.d;
        if (biVar != null) {
            biVar.l(str);
        }
    }

    public final void onManifestIconFetched(@Nullable Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            d(null);
            return;
        }
        this.g = bitmap;
        this.h = z;
        iv ivVar = this.o;
        if (ivVar != null) {
            ivVar.run();
            this.o = null;
        }
    }
}
