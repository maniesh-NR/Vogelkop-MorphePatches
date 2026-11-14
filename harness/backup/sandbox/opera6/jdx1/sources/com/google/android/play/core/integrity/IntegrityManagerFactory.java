package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class IntegrityManagerFactory {
    @NonNull
    public static IntegrityManager create(Context context) {
        uto utoVar;
        synchronized (alo.class) {
            utoVar = alo.b;
            if (utoVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                utoVar = new uto(context);
                alo.b = utoVar;
            }
        }
        return (IntegrityManager) ((vlo) utoVar.b).a();
    }
}
