package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class r9p {
    public final String a;
    public final long[] b;
    public boolean c;
    public eyi d;
    public final /* synthetic */ z9p e;

    public r9p(z9p z9pVar, String str) {
        this.e = z9pVar;
        this.a = str;
        this.b = new long[z9pVar.f];
    }

    public final File a(int i) {
        return new File(this.e.a, this.a + "." + i);
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    public final File c(int i) {
        return new File(this.e.a, this.a + "." + i + ".tmp");
    }
}
