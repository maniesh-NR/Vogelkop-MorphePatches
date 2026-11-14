package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class s7m {
    public final String a;
    public final int b;
    public final short c;
    public int d;
    public String e;

    public s7m(int i, int i2) {
        this(LinearLayoutManager.INVALID_OFFSET, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s7m(int i, int i2, int i3) {
        this.a = i != Integer.MIN_VALUE ? u35.g(i, "/") : "";
        this.b = i2;
        this.c = i3;
        this.d = LinearLayoutManager.INVALID_OFFSET;
        this.e = "";
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        qp2.n("generateNewId() must be called before retrieving ids.");
    }
}
