package com.opera.android.sync;

import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import defpackage.g7f;
import defpackage.ne6;
import defpackage.ywk;
import defpackage.zwk;
import java.util.Set;

/* loaded from: classes.dex */
public final class NativeSyncManager {
    public static zwk a() {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) context.getApplicationContext()).N();
    }

    public static void addToSet(@NonNull Set<ne6> set, int i, @NonNull String str) {
        set.add(new ne6(i, str));
    }

    public static void dataTypeConfigurationChanged() {
        g7f g7fVar = new g7f(a().a);
        while (g7fVar.hasNext()) {
            ((ywk) g7fVar.next()).e(true);
        }
    }

    public static void onIsReady() {
        zwk zwkVarA = a();
        zwkVarA.b = true;
        g7f g7fVar = new g7f(zwkVarA.a);
        while (g7fVar.hasNext()) {
            ((ywk) g7fVar.next()).B();
        }
    }

    public static void statusChanged(int i) {
        zwk zwkVarA = a();
        if (i == 6) {
            zwkVarA.getClass();
            if (!zwk.i()) {
                i = 2;
            }
        }
        g7f g7fVar = new g7f(zwkVarA.a);
        while (g7fVar.hasNext()) {
            ((ywk) g7fVar.next()).G(i);
        }
    }

    public static void syncCycleCompleted() {
        g7f g7fVar = new g7f(a().a);
        while (g7fVar.hasNext()) {
            ((ywk) g7fVar.next()).c0();
        }
    }
}
