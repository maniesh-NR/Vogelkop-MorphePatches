package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r7m {
    public final String a;
    public final short b;
    public final List c;
    public final byte[] d;

    /* JADX WARN: Multi-variable type inference failed */
    public r7m(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        this.a = str;
        this.b = i2;
        this.c = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.d = bArr;
    }

    public final int a() {
        short s = this.b;
        if (s == 2) {
            return 2048;
        }
        if (s != 3) {
            return 0;
        }
        return NotificationCompat.FLAG_GROUP_SUMMARY;
    }
}
