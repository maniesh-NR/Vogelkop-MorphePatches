package com.opera.android;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import defpackage.eif;
import defpackage.x56;
import defpackage.x5f;
import defpackage.zpa;

/* loaded from: classes.dex */
public class BrowserAppWidget extends eif {
    public static final /* synthetic */ int b = 0;

    public static int d(Context context) {
        String[] strArr = OperaApplication.K;
        switch (((OperaApplication) context.getApplicationContext()).J().g().ordinal()) {
            case 0:
                return 2131559450;
            case 1:
                return 2131559455;
            case 2:
                return 2131559452;
            case 3:
                return 2131559451;
            case 4:
                return 2131559454;
            case 5:
                return 2131559453;
            case 6:
                return 2131559102;
            case 7:
                return 2131559456;
            case 8:
                return 2131559610;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static boolean e(Context context) {
        Integer numValueOf = sfe.k0(context.getApplicationContext()) ? null : Integer.valueOf(AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) BrowserAppWidget.class)).length);
        return numValueOf != null && numValueOf.intValue() > 0;
    }

    @Override // defpackage.eif
    public final void b(Context context) {
        Integer numValueOf = sfe.k0(context.getApplicationContext()) ? null : Integer.valueOf(AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) BrowserAppWidget.class)).length);
        if (numValueOf != null) {
            String[] strArr = OperaApplication.K;
            x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
            int iIntValue = numValueOf.intValue();
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                x56VarF.J(zpaVar).p(7, 1, iIntValue);
                x5fVar.U0(x56VarF);
            }
        }
    }
}
