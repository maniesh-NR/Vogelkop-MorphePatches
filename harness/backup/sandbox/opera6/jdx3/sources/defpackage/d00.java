package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d00 implements fd2 {
    public final Context a;
    public final ab b;

    public d00(Context context, ab abVar) {
        this.a = context.getApplicationContext();
        this.b = abVar;
    }

    @Override // defpackage.fd2
    public final Object b(Object obj) {
        Context context = this.a;
        c00 c00VarA = null;
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0) {
            return null;
        }
        for (int i = 0; i <= 2; i++) {
            try {
                c00VarA = c00.a(AdvertisingIdClient.getAdvertisingIdInfo(context));
                break;
            } catch (IOException unused) {
            } catch (GooglePlayServicesRepairableException | GooglePlayServicesNotAvailableException | SecurityException unused2) {
            }
        }
        return c00VarA;
    }

    @Override // defpackage.fd2
    public final void onResult(Object obj) {
        this.b.run((c00) obj);
    }
}
