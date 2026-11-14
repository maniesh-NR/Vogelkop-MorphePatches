package defpackage;

import android.content.Context;
import java.util.ArrayList;
import javax.crypto.CipherInputStream;

/* loaded from: classes.dex */
public final class t28 {
    public final Context a;
    public final umi b;
    public final ck3 c;
    public s28 d;

    public t28(Context context, umi umiVar) {
        this.a = context;
        this.b = umiVar;
        this.c = new ck3(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022d A[LOOP:4: B:119:0x0227->B:121:0x022d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(javax.crypto.CipherOutputStream r27, defpackage.umi r28) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t28.a(javax.crypto.CipherOutputStream, umi):void");
    }

    public final void b(CipherInputStream cipherInputStream, umi umiVar) {
        int i;
        int iM = na2.M(cipherInputStream);
        if (iM >= 0) {
            i = 0;
        } else {
            i = iM;
            iM = na2.M(cipherInputStream);
        }
        ArrayList arrayList = new ArrayList(iM);
        while (true) {
            int i2 = iM - 1;
            String strO = null;
            if (iM <= 0) {
                break;
            }
            String strO2 = na2.O(cipherInputStream);
            String strO3 = na2.O(cipherInputStream);
            if (i <= -1) {
                strO = na2.O(cipherInputStream);
            }
            arrayList.add(new u5g(strO2, strO, strO3));
            iM = i2;
        }
        umiVar.d(new o16(arrayList, (byte) 1)).a(null);
        int iM2 = na2.M(cipherInputStream);
        ArrayList arrayList2 = new ArrayList(iM2);
        while (true) {
            int i3 = iM2 - 1;
            if (iM2 <= 0) {
                break;
            }
            arrayList2.add(new n16(na2.O(cipherInputStream), na2.O(cipherInputStream)));
            iM2 = i3;
        }
        umiVar.d(new o16(arrayList2, (byte) 0)).a(null);
        int iM3 = na2.M(cipherInputStream);
        ArrayList arrayList3 = new ArrayList(iM3);
        while (true) {
            int i4 = iM3 - 1;
            if (iM3 <= 0) {
                umiVar.d(new k16(this.a, umiVar, arrayList3)).a(null);
                return;
            } else {
                arrayList3.add(new h16(na2.O(cipherInputStream), na2.O(cipherInputStream)));
                iM3 = i4;
            }
        }
    }
}
