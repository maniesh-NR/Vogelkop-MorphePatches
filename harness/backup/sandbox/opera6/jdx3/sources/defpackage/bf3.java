package defpackage;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import com.leanplum.internal.ResourceQualifiers;

/* loaded from: classes.dex */
public final class bf3 {
    public volatile hr5 a;
    public final Context b;
    public volatile ye3 c;
    public volatile boolean d;

    public final boolean a() {
        try {
            Context context = this.b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            zzc.zzp("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }
}
