package com.opera.android;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

/* loaded from: classes.dex */
public class IntentDispatcherActivity extends Activity {
    public static final /* synthetic */ int a = 0;

    public final void a(Intent intent) {
        boolean z;
        int flags = intent.getFlags();
        ComponentName component = intent.getComponent();
        if (component != null) {
            intent.putExtra("com.opera.android.extra.ORIGINAL_COMPONENT_CLASS_NAME", component.getClassName());
        }
        intent.setClass(this, BrowserActivity.class).setFlags(335544320);
        if ((flags & 16777216) != 0) {
            intent.addFlags(16777216);
        }
        intent.addFlags(8192);
        Uri data = intent.getData();
        if (data == null || !"content".equals(data.getScheme())) {
            z = false;
        } else {
            intent.addFlags(1);
            z = true;
        }
        try {
            startActivity(intent);
        } catch (SecurityException e) {
            if (!z) {
                throw e;
            }
            Toast.makeText(this, getString(2132020918, getString(2132017591)), 1).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01af  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.IntentDispatcherActivity.onCreate(android.os.Bundle):void");
    }
}
