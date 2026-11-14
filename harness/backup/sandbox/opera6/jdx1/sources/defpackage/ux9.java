package defpackage;

import androidx.core.app.NotificationCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ux9 {
    public ByteBuffer b;
    public tx9 c;
    public final byte[] a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
    public int d = 0;

    public final boolean a() {
        return this.c.b;
    }

    public final tx9 b() {
        byte[] bArr;
        if (this.b == null) {
            qp2.n("You must call setData() before parseHeader()");
            return null;
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        tx9 tx9Var = this.c;
        if (zStartsWith) {
            tx9Var.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int iC = c();
            tx9 tx9Var2 = this.c;
            tx9Var2.h = (iC & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
            tx9Var2.i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.c.j = c();
            tx9 tx9Var3 = this.c;
            c();
            tx9Var3.getClass();
            if (this.c.h && !a()) {
                tx9 tx9Var4 = this.c;
                tx9Var4.a = e(tx9Var4.i);
                tx9 tx9Var5 = this.c;
                tx9Var5.k = tx9Var5.a[tx9Var5.j];
            }
        } else {
            tx9Var.b = true;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.c.d = new nx9();
                        c();
                        int iC4 = c();
                        nx9 nx9Var = this.c.d;
                        int i2 = (iC4 & 28) >> 2;
                        nx9Var.g = i2;
                        if (i2 == 0) {
                            nx9Var.g = 1;
                        }
                        nx9Var.f = (iC4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        nx9 nx9Var2 = this.c.d;
                        nx9Var2.i = s * 10;
                        nx9Var2.h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    tx9 tx9Var6 = this.c;
                    nx9 nx9Var3 = tx9Var6.d;
                    if (nx9Var3 == null) {
                        nx9Var3 = new nx9();
                        tx9Var6.d = nx9Var3;
                    }
                    nx9Var3.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int iC5 = c();
                    boolean z2 = (iC5 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    nx9 nx9Var4 = this.c.d;
                    nx9Var4.e = (iC5 & 64) != 0;
                    if (z2) {
                        nx9Var4.k = e(iPow);
                    } else {
                        nx9Var4.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        tx9 tx9Var7 = this.c;
                        tx9Var7.c++;
                        tx9Var7.e.add(tx9Var7.d);
                    }
                } else if (iC2 != 59) {
                    this.c.b = true;
                } else {
                    z = true;
                }
            }
            tx9 tx9Var8 = this.c;
            if (tx9Var8.c < 0) {
                tx9Var8.b = true;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = true;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.d = iC;
        if (iC <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.b.get(this.a, i, i3);
                i += i3;
            } catch (Exception unused) {
                this.c.b = true;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i4 << 16) | (-16777216) | (i6 << 8) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.c.b = true;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.b.position(Math.min(this.b.position() + iC, this.b.limit()));
        } while (iC > 0);
    }
}
