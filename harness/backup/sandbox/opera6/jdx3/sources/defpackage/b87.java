package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public interface b87 extends oim {
    rim createDialog(Context context, b2l b2lVar);

    default boolean isAllowed(b2l b2lVar) {
        return true;
    }
}
