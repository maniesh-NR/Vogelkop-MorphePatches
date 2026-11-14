package org.chromium.ui.base;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import defpackage.t8;

/* loaded from: classes.dex */
public final class IdleDetector extends BroadcastReceiver {
    public boolean a;
    public long b;

    public static IdleDetector create() {
        IdleDetector idleDetector = new IdleDetector();
        if (idleDetector.isScreenLocked()) {
            idleDetector.a = true;
            idleDetector.b = SystemClock.elapsedRealtime();
        } else {
            idleDetector.a = false;
            idleDetector.b = 0L;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        t8.Q(t8.a, idleDetector, intentFilter);
        return idleDetector;
    }

    public final long getIdleTime() {
        if (this.a) {
            return (SystemClock.elapsedRealtime() - this.b) / 1000;
        }
        return 0L;
    }

    public final boolean isScreenLocked() {
        Context context = t8.a;
        if (((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return true;
        }
        if (((PowerManager) context.getSystemService("power")) == null) {
            return false;
        }
        return !r2.isInteractive();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.a = true;
            this.b = SystemClock.elapsedRealtime();
        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.a = false;
            this.b = 0L;
        }
    }
}
