package defpackage;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.leanplum.internal.Constants;

/* loaded from: classes.dex */
public final class rne extends PhoneStateListener {
    public final TelephonyManager a;

    public rne(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.a = telephonyManager;
        telephonyManager.listen(this, Constants.Crypt.KEY_LENGTH);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        lcp.q = signalStrength.getGsmSignalStrength();
        this.a.listen(this, 0);
    }
}
