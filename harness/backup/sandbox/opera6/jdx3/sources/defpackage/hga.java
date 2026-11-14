package defpackage;

import android.content.Context;
import android.text.TextUtils;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class hga implements esk {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ hga(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((cj9) ((dj9) obj).i()).a;
            default:
                String strE = wwc.e((Context) obj);
                if (TextUtils.isEmpty(strE)) {
                    strE = wwc.d(wwc.a);
                }
                if (strE == null) {
                    strE = "";
                }
                return (String) CollectionsKt.K(StringsKt.Y(wwc.c(strE), new String[]{"-"}, 0, 6));
        }
    }
}
