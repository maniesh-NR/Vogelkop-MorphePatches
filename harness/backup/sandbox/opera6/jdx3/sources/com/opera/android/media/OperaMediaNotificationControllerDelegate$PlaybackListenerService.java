package com.opera.android.media;

import android.content.IntentFilter;
import defpackage.anf;

/* loaded from: classes.dex */
public final class OperaMediaNotificationControllerDelegate$PlaybackListenerService extends ymf {
    public static final /* synthetic */ int c = 0;
    public final anf b;

    public OperaMediaNotificationControllerDelegate$PlaybackListenerService() {
        super(2131363343);
        this.b = new anf((byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        super.onCreate();
        registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        unregisterReceiver(this.b);
        super.onDestroy();
    }
}
