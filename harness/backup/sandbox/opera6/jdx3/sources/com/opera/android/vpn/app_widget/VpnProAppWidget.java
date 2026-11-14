package com.opera.android.vpn.app_widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.opera.android.OperaApplication;
import defpackage.eif;
import defpackage.fan;
import defpackage.g1o;
import defpackage.hq4;
import defpackage.p05;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/opera/android/vpn/app_widget/VpnProAppWidget;", "Leif;", "<init>", "()V", "ien", "upj", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VpnProAppWidget extends eif {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.eif
    public final int a(Context context) {
        return 2131559103;
    }

    @Override // defpackage.eif
    public final void b(Context context) {
        Integer numI = kfo.I(context, VpnProAppWidget.class);
        if (numI != null) {
            int iIntValue = numI.intValue();
            String[] strArr = OperaApplication.K;
            ((OperaApplication) context.getApplicationContext()).S().r(iIntValue);
        }
    }

    @Override // defpackage.eif
    public final void c(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        byte b2;
        int i;
        Bitmap bitmapX;
        String[] strArr = OperaApplication.K;
        g1o g1oVarQ = ((OperaApplication) context.getApplicationContext()).S().q();
        int i2 = g1oVarQ.d;
        byte b3 = g1oVarQ.e;
        for (int i3 : iArr) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131559103);
            remoteViews.setInt(2131364023, "setBackgroundResource", (b3 == 1 || b3 == 2) ? 2131232500 : 2131232499);
            remoteViews.setOnClickPendingIntent(2131364023, upj.m(context, g1oVarQ, g1oVarQ.c()));
            remoteViews.setInt(2131364028, "setBackgroundResource", g1oVarQ.a);
            remoteViews.setTextViewText(2131364028, context.getString(g1oVarQ.b));
            int i4 = Build.VERSION.SDK_INT;
            int i5 = g1oVarQ.c;
            if (i4 >= 31) {
                remoteViews.setColor(2131364028, "setTextColor", i5);
            } else {
                remoteViews.setTextColor(2131364028, context.getColor(i5));
            }
            int i6 = 2131232107;
            if (!g1oVarQ.d() || i2 == 0) {
                b2 = 1;
                i = 0;
                if (!g1oVarQ.d()) {
                    i6 = 2131231605;
                } else if (i2 != 0) {
                    i6 = i2;
                }
                remoteViews.setImageViewResource(2131364024, i6);
            } else {
                if (!g1oVarQ.d()) {
                    i6 = 2131231605;
                } else if (i2 != 0) {
                    i6 = i2;
                }
                int iA = fan.a(24.0f, context.getResources());
                Drawable drawableF = sgb.F(i6, context);
                Bitmap bitmap = drawableF instanceof BitmapDrawable ? ((BitmapDrawable) drawableF).getBitmap() : null;
                if (bitmap == null) {
                    bitmapX = z5i.y(sgb.F(2131232197, context), iA, iA, Bitmap.Config.ARGB_8888);
                    b2 = 1;
                    i = 0;
                } else {
                    i = 0;
                    b2 = 1;
                    bitmapX = z5i.x(new LayerDrawable(new Drawable[]{new hq4(bitmap, -1), new p05(fan.a(1.0f, context.getResources()), context.getColor(2131103872), -1)}), iA, iA);
                }
                remoteViews.setImageViewBitmap(2131364024, bitmapX);
            }
            String string = g1oVarQ.f;
            if (string == null) {
                string = context.getString(2132022173);
            }
            remoteViews.setTextViewText(2131364027, string);
            remoteViews.setTextViewText(2131364026, g1oVarQ.a(context));
            byte b4 = b2;
            remoteViews.setViewVisibility(2131364029, b3 == b4 ? 8 : i);
            remoteViews.setViewVisibility(2131364030, b3 == b4 ? i : 8);
            PendingIntent pendingIntentM = upj.m(context, g1oVarQ, g1oVarQ.b());
            if (b3 == b4) {
                remoteViews.setOnClickPendingIntent(2131364030, pendingIntentM);
            } else {
                remoteViews.setOnClickPendingIntent(2131364029, pendingIntentM);
                remoteViews.setImageViewResource(2131364029, b3 != 0 ? (b3 == b4 || b3 == 2) ? 2131232503 : i : 2131232502);
            }
            appWidgetManager.updateAppWidget(i3, remoteViews);
        }
    }

    @Override // defpackage.eif, android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        c(context, appWidgetManager, new int[]{i});
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).S().m(false);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).S().m(true);
    }
}
