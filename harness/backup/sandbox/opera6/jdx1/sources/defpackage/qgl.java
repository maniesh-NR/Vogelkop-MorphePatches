package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class qgl {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final u1b e = u1b.p(2, new Object[]{"auto", "none"});
    public static final u1b f = u1b.p(3, new Object[]{"dot", "sesame", "circle"});
    public static final u1b g = u1b.p(2, new Object[]{"filled", "open"});
    public static final u1b h = u1b.p(3, new Object[]{"after", "before", "outside"});
    public final int a;
    public final byte b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public qgl(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
