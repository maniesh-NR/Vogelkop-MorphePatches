package defpackage;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.opera.android.BrowserActivity;
import com.opera.android.BrowserAppWidget;
import com.opera.android.OperaApplication;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class eif extends AppWidgetProvider {
    public static final /* synthetic */ int a = 0;

    public int a(Context context) {
        return BrowserAppWidget.d(context);
    }

    public void b(Context context) {
        new rml(Unit.a, vml.d).a(new iv0(context, (byte) 0)).t(new iv0(context, (byte) 1)).l();
    }

    public void c(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), BrowserAppWidget.d(context));
            Intent intent = new Intent("com.opera.android.action.SEARCH_FROM_WIDGET");
            intent.setFlags(268435456);
            intent.setClass(context, BrowserActivity.class);
            intent.putExtra("query", "");
            remoteViews.setOnClickPendingIntent(2131364020, PendingIntent.getActivity(context, 0, intent, 201326592));
            if (wxe.J(context)) {
                Intent intent2 = new Intent("com.opera.android.action.VOICE_SEARCH_FROM_WIDGET");
                intent2.setFlags(268435456);
                intent2.setClass(context, BrowserActivity.class);
                remoteViews.setOnClickPendingIntent(2131364021, PendingIntent.getActivity(context, 0, intent2, 201326592));
            } else {
                remoteViews.setViewVisibility(2131364021, 8);
            }
            if (r9n.A(context)) {
                boolean z = ru9.c(context).a.getBoolean("qr.google_lens_supported", false);
                Intent intent3 = new Intent("com.opera.android.action.SCAN_QR_CODE_FROM_WIDGET");
                intent3.setFlags(268435456);
                intent3.setClass(context, BrowserActivity.class);
                remoteViews.setOnClickPendingIntent(2131364022, PendingIntent.getActivity(context, 0, intent3, 201326592));
                remoteViews.setImageViewResource(2131364022, z ? 2131232227 : 2131232121);
                remoteViews.setContentDescription(2131364022, context.getString(z ? 2132019372 : 2132020980));
            } else {
                remoteViews.setViewVisibility(2131364022, 8);
            }
            String[] strArr = OperaApplication.K;
            d7j d7jVarE = ((OperaApplication) context.getApplicationContext()).J().e();
            remoteViews.setImageViewResource(2131364042, d7jVarE == d7j.DEFAULT ? 2131233056 : d7jVarE.b);
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        appWidgetManager.partiallyUpdateAppWidget(i, new RemoteViews(context.getPackageName(), a(context)));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        b(context);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (sfe.g0(context)) {
            return;
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        Context applicationContext = context.getApplicationContext();
        if ((applicationContext instanceof OperaApplication ? (OperaApplication) applicationContext : null) == null) {
            return;
        }
        c(context, appWidgetManager, iArr);
        b(context);
    }
}
