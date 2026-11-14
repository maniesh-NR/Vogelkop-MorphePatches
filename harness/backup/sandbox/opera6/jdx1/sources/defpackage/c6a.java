package defpackage;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class c6a {
    public final hyl a;
    public final boolean b;
    public final boolean c;
    public final bq4 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public b6a m = new b6a();
    public b6a n = new b6a();

    public c6a(hyl hylVar, boolean z, boolean z2) {
        this.a = hylVar;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];
        this.g = bArr;
        this.f = new bq4(bArr, 0, 0);
        this.k = false;
        this.o = false;
        b6a b6aVar = this.n;
        b6aVar.b = false;
        b6aVar.a = false;
    }
}
