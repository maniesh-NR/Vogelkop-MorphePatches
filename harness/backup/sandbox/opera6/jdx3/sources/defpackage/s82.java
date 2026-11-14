package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;

/* loaded from: classes.dex */
public final class s82 extends ase {
    public Bitmap w;
    public final Uri x;

    public s82(Context context, orm ormVar, skm skmVar, Bundle bundle, s0f s0fVar, ua7 ua7Var) {
        super(context, ormVar, skmVar, bundle, s0fVar, ua7Var);
        if (TextUtils.isEmpty(this.f)) {
            throw new djb("title");
        }
        String string = bundle.getString("news_icon_url");
        this.x = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
    }

    @Override // defpackage.wbh
    public final void a() {
        Bitmap bitmapL;
        Uri uri = this.x;
        if (uri != null) {
            nrl nrlVar = this.r;
            Resources resources = (Resources) nrlVar.b;
            bitmapL = nrlVar.l(uri, resources.getDimensionPixelSize(2131167218), resources.getDimensionPixelSize(2131167221));
        } else {
            bitmapL = null;
        }
        this.w = bitmapL;
    }

    @Override // defpackage.qyl
    public final zn0 i() {
        return zn0.d;
    }

    @Override // defpackage.wbh
    public final i16 k() {
        if (Build.VERSION.SDK_INT < 31) {
            return super.k();
        }
        ua7 ua7VarD = d();
        RemoteViews remoteViewsX = x();
        l1f l1fVar = (l1f) ua7VarD.b;
        l1fVar.C = remoteViewsX;
        return new i16(l1fVar.b(), (cm) ua7VarD.c, (byte) 27);
    }

    @Override // defpackage.wbh
    public final int p() {
        return 1;
    }

    @Override // defpackage.ase
    public final RemoteViews x() {
        RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), 2131558802);
        ase.y(remoteViews, this.w);
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setViewOutlinePreferredRadiusDimen(2131362594, 2131167222);
        }
        remoteViews.setInt(2131363525, "setMaxLines", 2);
        remoteViews.setTextViewText(2131363525, this.f);
        if (TextUtils.isEmpty(this.g)) {
            remoteViews.setViewVisibility(2131363485, 8);
            return remoteViews;
        }
        remoteViews.setTextViewText(2131363485, this.g);
        return remoteViews;
    }
}
