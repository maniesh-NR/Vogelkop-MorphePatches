package defpackage;

import android.text.SpannableStringBuilder;
import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cq4 extends fq4 {
    public final g1g h = new g1g();
    public final bq4 i = new bq4();
    public int j = -1;
    public final int k;
    public final aq4[] l;
    public aq4 m;
    public List n;
    public List o;
    public bq4 p;
    public int q;

    public cq4(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = j75.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new aq4[8];
        int i2 = 0;
        while (true) {
            aq4[] aq4VarArr = this.l;
            if (i2 >= 8) {
                this.m = aq4VarArr[0];
                return;
            } else {
                aq4VarArr[i2] = new aq4();
                i2++;
            }
        }
    }

    @Override // defpackage.fq4
    public final u59 b() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new u59(list, (byte) 22);
    }

    @Override // defpackage.fq4
    public final void c(dq4 dq4Var) {
        bq4 bq4Var;
        ByteBuffer byteBuffer = dq4Var.e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        g1g g1gVar = this.h;
        g1gVar.L(bArrArray, iLimit);
        while (g1gVar.a() >= 3) {
            int iA = g1gVar.A();
            int i = iA & 3;
            boolean z = (iA & 4) == 4;
            byte bA = (byte) g1gVar.A();
            byte bA2 = (byte) g1gVar.A();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        f();
                        int i2 = (bA & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            h();
                            w7d.K("Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bA & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        bq4Var = new bq4(i2, i4);
                        this.p = bq4Var;
                        byte[] bArr = bq4Var.b;
                        bq4Var.e = 1;
                        bArr[0] = bA2;
                    } else {
                        z4o.w(i == 2);
                        bq4Var = this.p;
                        if (bq4Var == null) {
                            w7d.q("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = bq4Var.b;
                            int i5 = bq4Var.e;
                            int i6 = i5 + 1;
                            bq4Var.e = i6;
                            bArr2[i5] = bA;
                            bq4Var.e = i5 + 2;
                            bArr2[i6] = bA2;
                        }
                    }
                    if (bq4Var.e == (bq4Var.d << 1) - 1) {
                        f();
                    }
                }
            }
        }
    }

    @Override // defpackage.fq4
    public final boolean e() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f() {
        int i;
        int i2;
        boolean z;
        bq4 bq4Var = this.p;
        if (bq4Var == null) {
            return;
        }
        if (bq4Var.e != (bq4Var.d << 1) - 1) {
            w7d.m("DtvCcPacket ended prematurely; size is " + ((this.p.d << 1) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        bq4 bq4Var2 = this.p;
        byte[] bArr = bq4Var2.b;
        int i3 = bq4Var2.e;
        bq4 bq4Var3 = this.i;
        bq4Var3.p(bArr, i3);
        boolean z2 = false;
        while (true) {
            if (bq4Var3.b() > 0) {
                int i4 = 3;
                int i5 = bq4Var3.i(3);
                int i6 = bq4Var3.i(5);
                int i7 = 2;
                int i8 = 7;
                if (i5 == 7) {
                    bq4Var3.t(2);
                    i5 = bq4Var3.i(6);
                    if (i5 < 7) {
                        vep.y(i5, "Invalid extended service number: ");
                    }
                }
                if (i6 == 0) {
                    if (i5 != 0) {
                        w7d.K("serviceNumber is non-zero (" + i5 + ") when blockSize is 0");
                    }
                } else if (i5 != this.k) {
                    bq4Var3.u(i6);
                } else {
                    int iG = bq4Var3.g() + (i6 << 3);
                    while (bq4Var3.g() < iG) {
                        int i9 = bq4Var3.i(8);
                        if (i9 == 16) {
                            int i10 = bq4Var3.i(8);
                            i8 = 7;
                            if (i10 <= 31) {
                                if (i10 > 7) {
                                    if (i10 <= 15) {
                                        bq4Var3.t(8);
                                    } else if (i10 <= 23) {
                                        bq4Var3.t(16);
                                    } else if (i10 <= 31) {
                                        bq4Var3.t(24);
                                    }
                                }
                            } else if (i10 <= 127) {
                                if (i10 == 32) {
                                    this.m.a(' ');
                                } else if (i10 == 33) {
                                    this.m.a((char) 160);
                                } else if (i10 == 37) {
                                    this.m.a((char) 8230);
                                } else if (i10 == 42) {
                                    this.m.a((char) 352);
                                } else if (i10 == 44) {
                                    this.m.a((char) 338);
                                } else if (i10 == 63) {
                                    this.m.a((char) 376);
                                } else if (i10 == 57) {
                                    this.m.a((char) 8482);
                                } else if (i10 == 58) {
                                    this.m.a((char) 353);
                                } else if (i10 == 60) {
                                    this.m.a((char) 339);
                                } else if (i10 != 61) {
                                    switch (i10) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (i10) {
                                                case 118:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    vep.y(i10, "Invalid G2 character: ");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                z2 = true;
                            } else if (i10 > 159) {
                                i = 2;
                                i2 = 3;
                                if (i10 <= 255) {
                                    if (i10 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        vep.y(i10, "Invalid G3 character: ");
                                        this.m.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    vep.y(i10, "Invalid extended command: ");
                                }
                            } else if (i10 <= 135) {
                                bq4Var3.t(32);
                            } else if (i10 <= 143) {
                                bq4Var3.t(40);
                            } else if (i10 <= 159) {
                                i = 2;
                                bq4Var3.t(2);
                                i2 = 3;
                                bq4Var3.t(bq4Var3.i(6) << 3);
                            }
                            i = 2;
                            i2 = 3;
                        } else if (i9 <= 31) {
                            if (i9 != 0) {
                                if (i9 == i4) {
                                    this.n = g();
                                } else if (i9 != 8) {
                                    switch (i9) {
                                        case 12:
                                            h();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i9 < 17 || i9 > 23) {
                                                if (i9 < 24 || i9 > 31) {
                                                    vep.y(i9, "Invalid C0 command: ");
                                                    break;
                                                } else {
                                                    w7d.K("Currently unsupported COMMAND_P16 Command: " + i9);
                                                    bq4Var3.t(16);
                                                    break;
                                                }
                                            } else {
                                                w7d.K("Currently unsupported COMMAND_EXT1 Command: " + i9);
                                                bq4Var3.t(8);
                                                break;
                                            }
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                            i2 = i4;
                            i = i7;
                        } else if (i9 <= 127) {
                            aq4 aq4Var = this.m;
                            if (i9 == 127) {
                                aq4Var.a((char) 9835);
                            } else {
                                aq4Var.a((char) (i9 & 255));
                            }
                            i2 = i4;
                            i = i7;
                            z2 = true;
                        } else {
                            if (i9 <= 159) {
                                aq4[] aq4VarArr = this.l;
                                switch (i9) {
                                    case NotificationCompat.FLAG_HIGH_PRIORITY /* 128 */:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z = true;
                                        int i11 = i9 - 128;
                                        if (this.q != i11) {
                                            this.q = i11;
                                            this.m = aq4VarArr[i11];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        z = true;
                                        for (int i12 = 1; i12 <= 8; i12++) {
                                            if (bq4Var3.h()) {
                                                aq4 aq4Var2 = aq4VarArr[8 - i12];
                                                aq4Var2.a.clear();
                                                aq4Var2.b.clear();
                                                aq4Var2.o = -1;
                                                aq4Var2.p = -1;
                                                aq4Var2.q = -1;
                                                aq4Var2.s = -1;
                                                aq4Var2.u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i13 = 1; i13 <= 8; i13++) {
                                            if (bq4Var3.h()) {
                                                aq4VarArr[8 - i13].d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 138:
                                        for (int i14 = 1; i14 <= 8; i14++) {
                                            if (bq4Var3.h()) {
                                                aq4VarArr[8 - i14].d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 139:
                                        for (int i15 = 1; i15 <= 8; i15++) {
                                            if (bq4Var3.h()) {
                                                aq4VarArr[8 - i15].d = !r1.d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        for (int i16 = 1; i16 <= 8; i16++) {
                                            if (bq4Var3.h()) {
                                                aq4VarArr[8 - i16].d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 141:
                                        bq4Var3.t(8);
                                        z = true;
                                        break;
                                    case 142:
                                        z = true;
                                        break;
                                    case 143:
                                        h();
                                        z = true;
                                        break;
                                    case 144:
                                        int i17 = i7;
                                        if (this.m.c) {
                                            bq4Var3.i(4);
                                            bq4Var3.i(i17);
                                            bq4Var3.i(i17);
                                            boolean zH = bq4Var3.h();
                                            boolean zH2 = bq4Var3.h();
                                            bq4Var3.i(3);
                                            bq4Var3.i(3);
                                            this.m.e(zH, zH2);
                                        } else {
                                            bq4Var3.t(16);
                                        }
                                        z = true;
                                        break;
                                    case 145:
                                        if (this.m.c) {
                                            int iC = aq4.c(bq4Var3.i(2), bq4Var3.i(2), bq4Var3.i(2), bq4Var3.i(2));
                                            int iC2 = aq4.c(bq4Var3.i(2), bq4Var3.i(2), bq4Var3.i(2), bq4Var3.i(2));
                                            bq4Var3.t(2);
                                            aq4.c(bq4Var3.i(2), bq4Var3.i(2), bq4Var3.i(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            bq4Var3.t(24);
                                        }
                                        z = true;
                                        break;
                                    case 146:
                                        if (this.m.c) {
                                            bq4Var3.t(4);
                                            int i18 = bq4Var3.i(4);
                                            bq4Var3.t(2);
                                            bq4Var3.i(6);
                                            aq4 aq4Var3 = this.m;
                                            if (aq4Var3.u != i18) {
                                                aq4Var3.a('\n');
                                            }
                                            aq4Var3.u = i18;
                                        } else {
                                            bq4Var3.t(16);
                                        }
                                        z = true;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        vep.y(i9, "Invalid C1 command: ");
                                        z = true;
                                        break;
                                    case 151:
                                        if (this.m.c) {
                                            int iC3 = aq4.c(bq4Var3.i(2), bq4Var3.i(2), bq4Var3.i(2), bq4Var3.i(2));
                                            bq4Var3.i(2);
                                            aq4.c(bq4Var3.i(2), bq4Var3.i(2), bq4Var3.i(2), 0);
                                            bq4Var3.h();
                                            bq4Var3.h();
                                            bq4Var3.i(2);
                                            bq4Var3.i(2);
                                            int i19 = bq4Var3.i(2);
                                            bq4Var3.t(8);
                                            aq4 aq4Var4 = this.m;
                                            aq4Var4.n = iC3;
                                            aq4Var4.k = i19;
                                        } else {
                                            bq4Var3.t(32);
                                        }
                                        z = true;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i20 = i9 - 152;
                                        aq4 aq4Var5 = aq4VarArr[i20];
                                        bq4Var3.t(i7);
                                        boolean zH3 = bq4Var3.h();
                                        bq4Var3.t(i7);
                                        int i21 = bq4Var3.i(i4);
                                        boolean zH4 = bq4Var3.h();
                                        int i22 = bq4Var3.i(i8);
                                        int i23 = bq4Var3.i(8);
                                        int i24 = bq4Var3.i(4);
                                        int i25 = bq4Var3.i(4);
                                        bq4Var3.t(i7);
                                        bq4Var3.t(6);
                                        bq4Var3.t(i7);
                                        int i26 = bq4Var3.i(i4);
                                        int i27 = bq4Var3.i(i4);
                                        ArrayList arrayList = aq4Var5.a;
                                        aq4Var5.c = true;
                                        aq4Var5.d = zH3;
                                        aq4Var5.e = i21;
                                        aq4Var5.f = zH4;
                                        aq4Var5.g = i22;
                                        aq4Var5.h = i23;
                                        aq4Var5.i = i24;
                                        int i28 = i25 + 1;
                                        if (aq4Var5.j != i28) {
                                            aq4Var5.j = i28;
                                            while (true) {
                                                if (arrayList.size() >= aq4Var5.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i26 != 0 && aq4Var5.l != i26) {
                                            aq4Var5.l = i26;
                                            int i29 = i26 - 1;
                                            int i30 = aq4.B[i29];
                                            boolean z3 = aq4.A[i29];
                                            int i31 = aq4.y[i29];
                                            int i32 = aq4.z[i29];
                                            int i33 = aq4.x[i29];
                                            aq4Var5.n = i30;
                                            aq4Var5.k = i33;
                                        }
                                        if (i27 != 0 && aq4Var5.m != i27) {
                                            aq4Var5.m = i27;
                                            int i34 = i27 - 1;
                                            int i35 = aq4.D[i34];
                                            int i36 = aq4.C[i34];
                                            aq4Var5.e(false, false);
                                            aq4Var5.f(aq4.v, aq4.E[i34]);
                                        }
                                        if (this.q != i20) {
                                            this.q = i20;
                                            this.m = aq4VarArr[i20];
                                        }
                                        z = true;
                                        break;
                                }
                            } else {
                                z = true;
                                if (i9 <= 255) {
                                    this.m.a((char) (i9 & 255));
                                } else {
                                    vep.y(i9, "Invalid base command: ");
                                    i = 2;
                                    i8 = 7;
                                    i2 = 3;
                                }
                            }
                            z2 = z;
                            i = 2;
                            i8 = 7;
                            i2 = 3;
                        }
                        i7 = i;
                        i4 = i2;
                    }
                }
            }
        }
        if (z2) {
            this.n = g();
        }
        this.p = null;
    }

    @Override // defpackage.fq4, defpackage.mj6
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        h();
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List g() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq4.g():java.util.List");
    }

    public final void h() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
