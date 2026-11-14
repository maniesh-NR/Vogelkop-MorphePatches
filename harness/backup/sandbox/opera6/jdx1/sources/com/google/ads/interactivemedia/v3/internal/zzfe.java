package com.google.ads.interactivemedia.v3.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.impl.data.zzg;
import defpackage.gpe;
import defpackage.x66;

/* loaded from: classes.dex */
public final class zzfe {
    public final mbi a;
    public zzg b;

    public zzfe(mbi mbiVar, zzg zzgVar) {
        this.a = mbiVar;
        this.b = zzgVar;
    }

    public final boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://"));
        mbi mbiVar = this.a;
        ResolveInfo resolveInfoResolveActivity = mbiVar.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
            return false;
        }
        if (this.b.c()) {
            x66 x66VarA = new gpe().a();
            Uri uri = Uri.parse(str);
            Intent intent2 = x66VarA.a;
            intent2.setData(uri);
            mbiVar.startActivity(intent2, x66VarA.b);
            return true;
        }
        if (str == null || str.length() <= 0) {
            return true;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent3.setFlags(268435456);
        mbiVar.startActivity(intent3);
        return true;
    }
}
