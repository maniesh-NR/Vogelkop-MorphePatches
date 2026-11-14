package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class a67 extends nr9 implements Function1 {
    public static final a67 a = new a67(1, StringsKt.class, "toInt", "toInt(Ljava/lang/String;)I", 1);

    public final Object invoke(Object obj) {
        return Integer.valueOf(Integer.parseInt((String) obj));
    }
}
