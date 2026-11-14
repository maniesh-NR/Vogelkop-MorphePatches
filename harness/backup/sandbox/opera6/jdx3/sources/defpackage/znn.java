package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class znn implements bl {
    public final WeakReference a;

    public znn(WeakReference weakReference) {
        this.a = weakReference;
    }

    public znn(ndc ndcVar) {
        this.a = new WeakReference(ndcVar);
    }

    @Override // defpackage.bl
    public final boolean a(String str) {
        return false;
    }

    @Override // defpackage.bl
    public final boolean e(String str, String str2) {
        return false;
    }

    @Override // defpackage.bl
    public final boolean h(String str) {
        return false;
    }

    @Override // defpackage.bl
    public final boolean k(String str) {
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(872415232);
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            try {
                if (weakReference.get() != null) {
                    ((Activity) weakReference.get()).startActivity(intentAddFlags);
                    return true;
                }
            } catch (RuntimeException unused) {
                return false;
            }
        }
        ((Context) phf.a.a).startActivity(intentAddFlags);
        return true;
    }
}
