package ads_mobile_sdk;

import android.content.Context;
import android.media.AudioManager;
import defpackage.mip;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class gl extends sr {
    public final Context l;
    public final yi m;

    public gl(Context context, qr0 qr0Var, yi yiVar, nx5 nx5Var, mip mipVar, ux2 ux2Var, g0 g0Var) {
        super(mipVar, nx5Var, ux2Var, qr0Var, g0Var);
        this.l = context;
        this.m = yiVar;
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.AUDIO;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        Pair pair;
        Double d;
        Double d2;
        AudioManager audioManager = (AudioManager) this.l.getSystemService(AudioManager.class);
        int streamVolume = audioManager.getStreamVolume(3);
        qr0 qr0Var = this.f;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:normalized_device_volume:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
            int streamMinVolume = audioManager.getStreamMinVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMinVolume > streamVolume || streamVolume > streamMaxVolume) {
                d2 = new Double(-2.0d);
            } else {
                d2 = new Double(streamMinVolume == streamMaxVolume ? 1.0d : ((int) (((streamVolume - streamMinVolume) / (streamMaxVolume - streamMinVolume)) * 100.0d)) / 100.0d);
            }
            pair = new Pair(new Integer(streamMinVolume), new Integer(streamMaxVolume));
            d = d2;
        } else {
            pair = null;
            d = null;
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int ringerMode = audioManager.getRingerMode();
        int streamVolume2 = audioManager.getStreamVolume(2);
        yi yiVar = this.m;
        return new hv0(new fl(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, pair, ringerMode, streamVolume2, yiVar.c, yiVar.d, d));
    }
}
