package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;

/* loaded from: classes.dex */
public final class qe3 extends ej8 {
    public final String A;
    public Bitmap y;
    public final Uri z;

    public qe3(Context context, orm ormVar, skm skmVar, Bundle bundle, s0f s0fVar, ua7 ua7Var) {
        super(context, ormVar, skmVar, bundle, s0fVar, ua7Var);
        if (TextUtils.isEmpty(this.f)) {
            throw new djb("title");
        }
        String string = bundle.getString("news_icon_url");
        this.z = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
        this.A = bundle.getString("news_domain", "");
    }

    @Override // defpackage.wbh
    public final void a() {
        Bitmap bitmapL;
        Uri uri = this.z;
        if (uri != null) {
            bitmapL = this.r.l(uri, (int) (fan.a(256.0f, r1.getResources()) / 0.5625f), fan.a(256.0f, this.a.getResources()));
        } else {
            bitmapL = null;
        }
        this.y = bitmapL;
    }

    @Override // defpackage.qyl
    public final zn0 i() {
        return zn0.e;
    }

    @Override // defpackage.wbh
    public final int p() {
        return 2;
    }

    @Override // defpackage.ase, defpackage.wbh
    public final boolean w() {
        if (super.w()) {
            return true;
        }
        if (this.t != cue.NewsFeed) {
            return false;
        }
        String str = this.s;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ua7 ua7Var = this.u;
        return xqe.c((Context) ua7Var.b, str, (qre) ((ii) ua7Var.c).get(), new rqd((byte) 18)) != null;
    }

    @Override // defpackage.ase
    public final RemoteViews x() {
        RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), 2131558804);
        ase.y(remoteViews, this.y);
        remoteViews.setTextViewText(2131363065, this.w);
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setViewOutlinePreferredRadiusDimen(2131362594, 2131167222);
            remoteViews.setViewVisibility(2131361967, 8);
        }
        remoteViews.setTextViewText(2131363525, this.f);
        return remoteViews;
    }

    @Override // defpackage.ej8
    public final RemoteViews z() {
        RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), 2131558792);
        Bitmap bitmap = this.y;
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(2131361998, bitmap);
            remoteViews.setViewVisibility(2131362254, 0);
            if (Build.VERSION.SDK_INT >= 31) {
                remoteViews.setViewOutlinePreferredRadiusDimen(2131361998, 2131167219);
                remoteViews.setViewOutlinePreferredRadiusDimen(2131362254, 2131167219);
            }
        }
        remoteViews.setTextViewText(2131363065, this.w);
        remoteViews.setTextViewText(2131362893, this.f);
        remoteViews.setTextViewText(2131362267, this.A);
        return remoteViews;
    }
}
