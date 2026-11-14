package com.opera.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import defpackage.mdb;

/* loaded from: classes.dex */
public class BrowserRestartActivity extends Activity {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = t8.a;
        Intent intentMakeRestartActivityTask = Intent.makeRestartActivityTask(mdb.a(context));
        Intent intent = getIntent();
        if (intent != null && intent.getAction() != null) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(intentMakeRestartActivityTask.getComponent());
            intent2.setFlags(intentMakeRestartActivityTask.getFlags());
            intentMakeRestartActivityTask = intent2;
        }
        context.startActivity(intentMakeRestartActivityTask);
        finish();
        Process.killProcess(Process.myPid());
    }
}
