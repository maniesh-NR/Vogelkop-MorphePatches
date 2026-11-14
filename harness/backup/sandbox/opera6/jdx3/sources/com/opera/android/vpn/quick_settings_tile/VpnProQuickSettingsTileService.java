package com.opera.android.vpn.quick_settings_tile;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.service.quicksettings.TileService;
import com.opera.android.OperaApplication;
import com.opera.android.vpn.VpnReceiver;
import defpackage.eif;
import defpackage.g9l;
import defpackage.ien;
import defpackage.yen;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/opera/android/vpn/quick_settings_tile/VpnProQuickSettingsTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "yen", "t8", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VpnProQuickSettingsTileService extends TileService {
    public static final /* synthetic */ int b = 0;
    public final g9l a = new g9l(this, 11);

    public final void a(boolean z) {
        String[] strArr = OperaApplication.K;
        yen yenVarT = ((OperaApplication) getApplicationContext()).T();
        yenVarT.m(z);
        yenVarT.q(z);
    }

    @Override // android.service.quicksettings.TileService, android.app.Service
    public final IBinder onBind(Intent intent) {
        try {
            return super.onBind(intent);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // android.service.quicksettings.TileService
    public final void onClick() {
        super.onClick();
        String[] strArr = OperaApplication.K;
        ien ienVarS = ((OperaApplication) getApplicationContext()).S();
        int iB = ienVarS.q().b();
        if (iB == 0) {
            byte b2 = ienVarS.q().e;
            sendBroadcast(VpnReceiver.b(this, !(b2 == 1 || b2 == 2)));
            return;
        }
        if (iB != 1) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            int i = eif.a;
            Intent intentR = kfo.R(this, "com.opera.android.action.VPN_PRO_WIDGET_OPEN_OFA");
            intentR.putExtra("com.opera.android.action.EXTRA_FORCE_SHOW_FRAGMENT_IMMEDIATELY", "");
            startActivityAndCollapse(PendingIntent.getActivity(this, 0, intentR, 201326592));
            return;
        }
        int i2 = eif.a;
        Intent intentR2 = kfo.R(this, "com.opera.android.action.VPN_PRO_WIDGET_OPEN_OFA");
        intentR2.putExtra("com.opera.android.action.EXTRA_FORCE_SHOW_FRAGMENT_IMMEDIATELY", "");
        startActivityAndCollapse(intentR2);
    }

    @Override // android.service.quicksettings.TileService
    public final void onStartListening() {
        super.onStartListening();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) getApplicationContext()).T().i.k(this.a);
    }

    @Override // android.service.quicksettings.TileService
    public final void onStopListening() {
        super.onStopListening();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) getApplicationContext()).T().i.p(this.a);
    }

    @Override // android.service.quicksettings.TileService
    public final void onTileAdded() {
        super.onTileAdded();
        a(true);
    }

    @Override // android.service.quicksettings.TileService
    public final void onTileRemoved() {
        super.onTileRemoved();
        a(false);
    }
}
