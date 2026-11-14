package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class uz0 extends nr9 implements Function2 {
    public static final uz0 a = new uz0(2, xed.class, "max", "max(II)I", 1);

    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
