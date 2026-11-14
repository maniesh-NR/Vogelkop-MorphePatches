package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class bu6 {
    public final /* synthetic */ byte a;

    public /* synthetic */ bu6(byte b) {
        this.a = b;
    }

    public final String a(Context context, boolean z) {
        String networkCountryIso;
        switch (this.a) {
            case 0:
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        return null;
                    }
                    if ((z && telephonyManager.getPhoneType() == 2) || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                        return null;
                    }
                    if (networkCountryIso.length() == 2) {
                        return networkCountryIso;
                    }
                    return null;
                } catch (RuntimeException unused) {
                    return null;
                }
            default:
                return aik.o((String) s6e.b(context).b.f);
        }
    }
}
