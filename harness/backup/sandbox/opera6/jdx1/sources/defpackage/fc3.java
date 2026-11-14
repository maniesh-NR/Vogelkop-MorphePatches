package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class fc3 extends k73 {
    public final up1 g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc3(Context context, a5o a5oVar, byte b) {
        super(context, a5oVar);
        this.h = b;
        this.g = new up1(this, (byte) 3);
    }

    public final void A() {
        qs7 qs7VarX = qs7.x();
        int i = ct3.a;
        qs7VarX.getClass();
        ((Context) ((k73) this).c).unregisterReceiver(this.g);
    }

    public final IntentFilter E() {
        switch (this.h) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    public final Object s() {
        boolean z = true;
        switch (this.h) {
            case 0:
                Intent intentRegisterReceiver = ((Context) ((k73) this).c).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    qs7 qs7VarX = qs7.x();
                    int i = gc3.a;
                    qs7VarX.getClass();
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent intentRegisterReceiver2 = ((Context) ((k73) this).c).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    qs7 qs7VarX2 = qs7.x();
                    int i2 = lc3.a;
                    qs7VarX2.getClass();
                    return Boolean.FALSE;
                }
                float intExtra2 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                if (intentRegisterReceiver2.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) != 1 && intExtra2 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver3 = ((Context) ((k73) this).c).registerReceiver(null, E());
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public final void z() {
        qs7 qs7VarX = qs7.x();
        int i = ct3.a;
        qs7VarX.getClass();
        ((Context) ((k73) this).c).registerReceiver(this.g, E());
    }
}
