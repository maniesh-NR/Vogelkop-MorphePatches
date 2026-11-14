package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class vdb extends nr9 implements Function2 {
    public static final vdb a = new vdb(2, xed.class, "min", "min(II)I", 1);

    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
