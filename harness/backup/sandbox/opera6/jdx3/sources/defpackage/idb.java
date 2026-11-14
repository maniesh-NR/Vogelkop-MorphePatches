package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class idb implements wcj {
    public final Intent a;
    public final ResolveInfo b;
    public final zcj c;

    public idb(Intent intent, ResolveInfo resolveInfo, zcj zcjVar) {
        this.a = intent;
        this.b = resolveInfo;
        this.c = zcjVar;
    }

    @Override // defpackage.wcj
    public final void a(Context context) {
        e(context, this.a);
    }

    @Override // defpackage.wcj
    public final Drawable b(Context context) {
        int iA = fan.a(40.0f, context.getResources());
        Drawable drawableLoadIcon = this.b.loadIcon(context.getPackageManager());
        int i = b0j.d;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawableLoadIcon});
        layerDrawable.setId(0, 0);
        layerDrawable.setLayerWidth(0, iA);
        layerDrawable.setLayerHeight(0, iA);
        return new b0j(layerDrawable, 0);
    }

    @Override // defpackage.wcj
    public final void c(Context context, i4d i4dVar) {
        e(context, (Intent) i4dVar.b);
    }

    @Override // defpackage.wcj
    public final CharSequence d(Context context) {
        return this.b.loadLabel(context.getPackageManager());
    }

    public final void e(Context context, Intent intent) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = this.b.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        intent2.addFlags(268435456);
        try {
            context.startActivity(intent2);
        } catch (SecurityException unused) {
        }
        this.c.e(getId());
    }

    @Override // defpackage.wcj
    public final String getId() {
        ActivityInfo activityInfo = this.b.activityInfo;
        return activityInfo.packageName + ':' + activityInfo.name;
    }
}
