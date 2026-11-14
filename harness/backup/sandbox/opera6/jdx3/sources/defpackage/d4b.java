package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class d4b implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjh b;

    public /* synthetic */ d4b(tjh tjhVar, byte b) {
        this.a = b;
        this.b = tjhVar;
    }

    public final Object invoke() {
        byte b = this.a;
        tjh tjhVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((SharedPreferences) tjhVar.a.get()).getBoolean("rated", false));
            case 1:
                return Long.valueOf(((SharedPreferences) tjhVar.a.get()).getLong("lastShown", 0L));
            default:
                return Boolean.valueOf(((SharedPreferences) tjhVar.a.get()).getBoolean("hasRated", false));
        }
    }
}
