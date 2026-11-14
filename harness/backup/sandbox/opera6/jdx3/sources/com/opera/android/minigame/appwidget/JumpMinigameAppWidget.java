package com.opera.android.minigame.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import defpackage.atb;
import defpackage.ck0;
import defpackage.eif;
import defpackage.un0;
import defpackage.x56;
import defpackage.x5f;
import defpackage.zpa;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/minigame/appwidget/JumpMinigameAppWidget;", "Leif;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JumpMinigameAppWidget extends eif {
    @Override // defpackage.eif
    public final int a(Context context) {
        return 2131558963;
    }

    @Override // defpackage.eif
    public final void b(Context context) {
        Integer numValueOf = sfe.k0(context.getApplicationContext()) ? null : Integer.valueOf(AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) JumpMinigameAppWidget.class)).length);
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            String[] strArr = OperaApplication.K;
            x5f x5fVar = ((atb) ((OperaApplication) context.getApplicationContext()).r.T.get()).b;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                ((un0) new ck0(zpaVar, x56VarF).e.getValue()).b.p(13, 1, iIntValue);
                x5fVar.U0(x56VarF);
            }
        }
    }

    @Override // defpackage.eif
    public final void c(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131558963);
            Intent intent = new Intent("com.opera.android.action.JUMP_MINIGAME_WIDGET");
            intent.setFlags(268435456);
            intent.setClass(context, BrowserActivity.class);
            intent.putExtra("com.opera.android.action.EXTRA_FORCE_SHOW_FRAGMENT_IMMEDIATELY", "");
            remoteViews.setOnClickPendingIntent(2131365165, PendingIntent.getActivity(context, 0, intent, 201326592));
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }
}
