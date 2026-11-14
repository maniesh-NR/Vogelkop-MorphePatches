package defpackage;

import com.opera.android.wallpaper.WallpaperStorefrontExtension;

/* loaded from: classes.dex */
public final class lnn extends lim {
    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        WallpaperStorefrontExtension.a = null;
    }
}
