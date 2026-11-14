package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rt1 extends z7h {
    public final /* synthetic */ byte a;

    public /* synthetic */ rt1(byte b) {
        this.a = b;
    }

    public static uc8 y(g1g g1gVar) {
        String strV = g1gVar.v();
        strV.getClass();
        String strV2 = g1gVar.v();
        strV2.getClass();
        return new uc8(strV, strV2, g1gVar.u(), g1gVar.u(), Arrays.copyOfRange(g1gVar.a, g1gVar.b, g1gVar.c));
    }

    @Override // defpackage.z7h
    public final lxd g(uxd uxdVar, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                bq4 bq4Var = new bq4(byteBuffer.array(), byteBuffer.limit());
                bq4Var.t(12);
                int iF = (bq4Var.f() + bq4Var.i(12)) - 4;
                bq4Var.t(44);
                bq4Var.u(bq4Var.i(12));
                bq4Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (bq4Var.f() < iF) {
                    bq4Var.t(48);
                    int i = bq4Var.i(8);
                    bq4Var.t(4);
                    int iF2 = bq4Var.f() + bq4Var.i(12);
                    String str = null;
                    String str2 = null;
                    while (bq4Var.f() < iF2) {
                        int i2 = bq4Var.i(8);
                        int i3 = bq4Var.i(8);
                        int iF3 = bq4Var.f() + i3;
                        if (i2 == 2) {
                            int i4 = bq4Var.i(16);
                            bq4Var.t(8);
                            if (i4 == 3) {
                                while (bq4Var.f() < iF3) {
                                    int i5 = bq4Var.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i5];
                                    bq4Var.l(i5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i6 = bq4Var.i(8);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        bq4Var.u(bq4Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i3];
                            bq4Var.l(i3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        bq4Var.q(iF3 << 3);
                    }
                    bq4Var.q(iF2 << 3);
                    if (str != null && str2 != null) {
                        arrayList.add(new qt1(i, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new lxd(arrayList);
            default:
                return new lxd(y(new g1g(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
