package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class eoi {
    public final Function0 a;
    public final Function0 b;

    public eoi(Function0 function0, Function0 function02) {
        this.a = function0;
        this.b = function02;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + this.a.invoke() + ", maxValue=" + this.b.invoke() + ", reverseScrolling=false)";
    }
}
