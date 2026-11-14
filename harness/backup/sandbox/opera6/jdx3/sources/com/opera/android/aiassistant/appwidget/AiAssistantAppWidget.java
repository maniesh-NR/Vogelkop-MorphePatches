package com.opera.android.aiassistant.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import defpackage.eif;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/opera/android/aiassistant/appwidget/AiAssistantAppWidget;", "Leif;", "<init>", "()V", "k1g", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AiAssistantAppWidget extends eif {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.eif
    public final int a(Context context) {
        return k1g.t(context);
    }

    @Override // defpackage.eif
    public final void c(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), k1g.t(context));
            Intent intentR = kfo.R(context, "com.opera.android.action.AI_WIDGET_KEYBOARD");
            intentR.putExtra("com.opera.android.action.EXTRA_FORCE_SHOW_FRAGMENT_IMMEDIATELY", "");
            remoteViews.setOnClickPendingIntent(2131364031, PendingIntent.getActivity(context, 0, intentR, 201326592));
            if (wxe.J(context)) {
                Intent intentR2 = kfo.R(context, "com.opera.android.action.AI_WIDGET_VOICE");
                intentR2.putExtra("com.opera.android.action.EXTRA_FORCE_SHOW_FRAGMENT_IMMEDIATELY", "");
                remoteViews.setOnClickPendingIntent(2131364021, PendingIntent.getActivity(context, 0, intentR2, 201326592));
            } else {
                remoteViews.setViewVisibility(2131364021, 8);
            }
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }
}
