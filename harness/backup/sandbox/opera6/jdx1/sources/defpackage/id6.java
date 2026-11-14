package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class id6 extends IOException {
    public final int a;

    public id6(int i) {
        this.a = i;
    }

    public id6(int i, Exception exc) {
        super(exc);
        this.a = i;
    }

    public id6(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
