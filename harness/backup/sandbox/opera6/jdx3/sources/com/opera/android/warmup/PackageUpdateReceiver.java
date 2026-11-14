package com.opera.android.warmup;

import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.opera.android.OperaApplication;
import com.opera.android.news.newsfeed.internal.NewsPushUploaderService;
import com.opera.android.notifications.channels.ChannelsUpdateService;
import com.opera.android.notifications.channels.ChannelsUpdateWorker;
import com.opera.android.startup.InstallSplitLocaleActivity;
import defpackage.r0k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* loaded from: classes.dex */
public class PackageUpdateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (sfe.g0(context) || intent == null || !"android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            return;
        }
        int i = ChannelsUpdateService.f;
        ((JobScheduler) context.getApplicationContext().getSystemService(JobScheduler.class)).cancel(1009);
        ChannelsUpdateWorker.d(context);
        int i2 = UpdateLibraryService.f;
        ((JobScheduler) context.getApplicationContext().getSystemService(JobScheduler.class)).cancel(1006);
        int i3 = NewsPushUploaderService.f;
        ((JobScheduler) context.getApplicationContext().getSystemService(JobScheduler.class)).cancel(1005);
        if (InstallSplitLocaleActivity.K(context)) {
            Locale localeF = wwc.f(context.getSharedPreferences("localize", 0).getString("language_code", null));
            String[] strArr = OperaApplication.K;
            ((OperaApplication) context.getApplicationContext()).K().a(Collections.singletonList(localeF));
        }
        ArrayList arrayList = new ArrayList(2);
        String[] strArr2 = OperaApplication.K;
        r0k r0kVarK = ((OperaApplication) context.getApplicationContext()).K();
        if (((Boolean) ((OperaApplication) context.getApplicationContext()).v().d.g()).booleanValue()) {
            String string = context.getString(2132019796);
            if (!r0kVarK.h().contains(string)) {
                arrayList.add(string);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        r0kVarK.k(arrayList);
    }
}
