package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class woc extends wbh {
    public final nrl r;
    public final Resources s;
    public final joc t;
    public final Uri u;
    public final Uri v;
    public Bitmap w;
    public Bitmap x;
    public final w1f y;

    public woc(Context context, orm ormVar, skm skmVar, Bundle bundle, s0f s0fVar) {
        super(context, ormVar, skmVar, bundle, s0fVar);
        Resources resources = context.getApplicationContext().getResources();
        this.s = resources;
        this.r = new nrl(resources, bundle.getBoolean("news_icon_fetch_failed"));
        String string = bundle.getString("home_team_logo");
        this.u = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
        String string2 = bundle.getString("away_team_logo");
        this.v = !TextUtils.isEmpty(string2) ? Uri.parse(string2) : null;
        if (!bundle.containsKey("match_id")) {
            throw new djb("match_id");
        }
        long j = bundle.getLong("match_id", -1L);
        if (j == -1) {
            throw new djb("match_id", null);
        }
        String string3 = bundle.getString("match_type");
        if (TextUtils.isEmpty(string3)) {
            throw new djb("match_type");
        }
        try {
            joc jocVar = new joc(j, zi4.M(string3));
            this.t = jocVar;
            this.y = new w1f(sgb.v(jocVar), sgb.t(jocVar));
        } catch (IllegalArgumentException e) {
            throw new djb("match_type", e);
        }
    }

    @Override // defpackage.wbh
    public final void a() {
        int iA = fan.a(32.0f, this.s);
        nrl nrlVar = this.r;
        Uri uri = this.u;
        this.w = uri != null ? nrlVar.l(uri, iA, iA) : null;
        Uri uri2 = this.v;
        this.x = uri2 != null ? nrlVar.l(uri2, iA, iA) : null;
    }

    @Override // defpackage.qyl
    public final Boolean b() {
        return null;
    }

    @Override // defpackage.wbh
    public final ua7 d() {
        ua7 ua7VarD = super.d();
        String str = this.g;
        l1f l1fVar = (l1f) ua7VarD.b;
        g1f g1fVar = new g1f((byte) 0);
        g1fVar.e = l1f.c(str);
        l1fVar.j(g1fVar);
        Bitmap bitmap = this.w;
        Bitmap bitmap2 = null;
        if (bitmap != null && this.x != null && bitmap.getWidth() == this.w.getHeight() && this.x.getWidth() == this.x.getHeight() && this.w.getWidth() == this.x.getWidth()) {
            int height = this.w.getHeight();
            int i = ((int) (0.6f * height)) + height;
            int i2 = i - height;
            Bitmap bitmapU = z5i.u(i, i, Bitmap.Config.ARGB_8888);
            if (bitmapU != null) {
                Canvas canvas = new Canvas(bitmapU);
                canvas.drawBitmap(this.w, 0.0f, 0.0f, (Paint) null);
                float f = i2;
                canvas.drawBitmap(this.x, f, f, (Paint) null);
                bitmap2 = bitmapU;
            }
        }
        if (bitmap2 == null) {
            return ua7VarD;
        }
        l1fVar.i(bitmap2);
        return ua7VarD;
    }

    @Override // defpackage.qyl
    public final zn0 i() {
        int iOrdinal = this.t.b.ordinal();
        if (iOrdinal == 0) {
            return zn0.j;
        }
        if (iOrdinal == 1) {
            return zn0.l;
        }
        throw new RuntimeException(null, null);
    }

    @Override // defpackage.wbh
    public final w1f n() {
        return this.y;
    }

    @Override // defpackage.wbh
    public final String q(Bundle bundle) {
        return bundle.getString("title", "");
    }

    @Override // defpackage.wbh
    public final String r(Bundle bundle) {
        String string = bundle.getString("news_header_title");
        String[] strArr = aik.a;
        return string == null ? "" : string;
    }

    @Override // defpackage.wbh
    public final void s(long j, boolean z) {
        gse gseVar;
        super.s(j, z);
        zn0 zn0VarI = i();
        yn0 yn0VarC = c();
        String str = this.k;
        hd hdVar = hd.h;
        if (hdVar == null) {
            return;
        }
        if (yn0.f == yn0VarC && (zn0VarI == zn0.d || zn0VarI == zn0.e || zn0VarI == zn0.j || zn0VarI == zn0.l)) {
            gseVar = new gse("firebase", str, this.l, "click", System.currentTimeMillis());
        } else {
            gseVar = null;
        }
        hdVar.s(gseVar);
    }

    @Override // defpackage.wbh
    public final void u() {
        gse gseVar;
        super.u();
        zn0 zn0VarI = i();
        yn0 yn0VarC = c();
        String str = this.k;
        hd hdVar = hd.h;
        if (hdVar == null) {
            return;
        }
        if (yn0.f == yn0VarC && (zn0VarI == zn0.d || zn0VarI == zn0.e || zn0VarI == zn0.j || zn0VarI == zn0.l)) {
            gseVar = new gse("firebase", str, this.l, "receive", System.currentTimeMillis());
        } else {
            gseVar = null;
        }
        hdVar.s(gseVar);
    }

    @Override // defpackage.wbh
    public final void v(boolean z) {
        gse gseVar;
        super.v(z);
        zn0 zn0VarI = i();
        yn0 yn0VarC = c();
        String str = this.k;
        hd hdVar = hd.h;
        if (hdVar == null) {
            return;
        }
        if (yn0.f == yn0VarC && (zn0VarI == zn0.d || zn0VarI == zn0.e || zn0VarI == zn0.j || zn0VarI == zn0.l)) {
            gseVar = new gse("firebase", str, this.l, "show", System.currentTimeMillis());
        } else {
            gseVar = null;
        }
        hdVar.s(gseVar);
    }

    @Override // defpackage.wbh
    public final boolean w() {
        Context context = this.a;
        boolean zB = ((wnh) xnh.t(context).i()).b(1024);
        vn0 vn0Var = vn0.s;
        if (!zB) {
            t(vn0Var);
            return true;
        }
        int iOrdinal = this.t.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new RuntimeException(null, null);
            }
            t(vn0Var);
            return true;
        }
        if (wbh.m(context, "livescore") != 1) {
            t(vn0.q);
            return true;
        }
        if (((loc) loc.c.d(context)).b(this.l)) {
            return false;
        }
        t(vn0.i);
        return true;
    }
}
