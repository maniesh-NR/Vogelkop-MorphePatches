package defpackage;

import androidx.core.app.NotificationCompat;
import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class esb implements Closeable {
    public static final String[] e = new String[NotificationCompat.FLAG_HIGH_PRIORITY];
    public int a;
    public int[] b;
    public String[] c;
    public int[] d;

    static {
        int i = 0;
        while (true) {
            String[] strArr = e;
            if (i > 31) {
                strArr[34] = "\\\"";
                strArr[92] = "\\\\";
                strArr[9] = "\\t";
                strArr[8] = "\\b";
                strArr[10] = "\\n";
                strArr[13] = "\\r";
                strArr[12] = "\\f";
                return;
            }
            strArr[i] = String.format("\\u%04x", Integer.valueOf(i));
            i++;
        }
    }

    public final void D(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new e22("Nesting too deep at ".concat(n()));
            }
            this.b = Arrays.copyOf(iArr, iArr.length << 1);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length << 1);
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int E(z8b z8bVar);

    public abstract void G();

    public abstract void H();

    public final void I(String str) throws g65 {
        StringBuilder sbR = p3p.r(str, " at path ");
        sbR.append(n());
        throw new g65(sbR.toString());
    }

    public abstract void h();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public final String n() {
        int i = this.a;
        int[] iArr = this.b;
        String[] strArr = this.c;
        int[] iArr2 = this.d;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean o();

    public abstract boolean p();

    public abstract double q();

    public abstract int r();

    public abstract String s();

    public abstract int t();
}
