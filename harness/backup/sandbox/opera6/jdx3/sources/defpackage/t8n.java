package defpackage;

import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class t8n {
    public final ContextWrapper a;
    public final int b;
    public final int c;

    public t8n(ContextWrapper contextWrapper, int i) {
        this.a = contextWrapper;
        this.b = i;
        this.c = contextWrapper instanceof s8n ? ((s8n) contextWrapper).b : 0;
    }
}
