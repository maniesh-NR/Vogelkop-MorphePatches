package defpackage;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class khg {
    public final g9 a;
    public final InstallReferrerClient b;

    public khg(Context context, g9 g9Var) {
        this.a = g9Var;
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
        this.b = installReferrerClientBuild;
        try {
            installReferrerClientBuild.startConnection(new wub(this));
        } catch (SecurityException unused) {
            this.a.invoke(hg0.e, null);
        }
    }
}
