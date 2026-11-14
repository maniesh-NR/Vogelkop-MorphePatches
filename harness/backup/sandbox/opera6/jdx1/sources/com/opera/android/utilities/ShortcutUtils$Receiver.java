package com.opera.android.utilities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import defpackage.sfe;

/* loaded from: classes.dex */
public class ShortcutUtils$Receiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (sfe.g0(context) || !"com.opera.android.action.SHORTCUT_ADDED".equals(intent.getAction())) {
            return;
        }
        Toast.makeText(context, context.getResources().getString(2132021895, intent.getStringExtra("com.opera.browser.title")), 1).show();
    }
}
