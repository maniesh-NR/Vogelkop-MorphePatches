package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class sfl extends jfl {
    public final String b;
    public final int c;
    public final Function1 d;

    public sfl(Object obj, String str, int i, Function1 function1) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = function1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return p3p.k(this.c, ")", sb);
    }
}
