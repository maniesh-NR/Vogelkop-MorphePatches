package com.opera.android.browser.blocklist.bridge;

import J.N;
import androidx.annotation.NonNull;
import defpackage.bi2;
import defpackage.i7f;
import defpackage.tcl;
import defpackage.vie;
import defpackage.wie;
import defpackage.xie;
import defpackage.yie;
import defpackage.zie;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class BlockListRepositoryBridge {
    public final tcl b;
    public final i7f c = new i7f();
    public final long a = N.MkLp5l$H(this);

    public BlockListRepositoryBridge(tcl tclVar) {
        this.b = tclVar;
    }

    public static ArrayList a(String[] strArr, boolean[] zArr, long[] jArr, String[] strArr2) {
        int iMin = Math.min(Math.min(Math.min(strArr.length, zArr.length), jArr.length), strArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            String str = strArr[i];
            boolean z = zArr[i];
            long j = jArr[i];
            String str2 = strArr2[i];
            arrayList.add(new yie(str, j == -1 ? wie.j : z ? new xie(j, str2) : new vie(j, str2)));
        }
        return arrayList;
    }

    public final void notifyRuleState(@NonNull String[] strArr, @NonNull boolean[] zArr, @NonNull long[] jArr, @NonNull String[] strArr2, @NonNull String[] strArr3, @NonNull boolean[] zArr2, @NonNull long[] jArr2, @NonNull String[] strArr4, @NonNull String[] strArr5, @NonNull boolean[] zArr3, @NonNull long[] jArr3, @NonNull String[] strArr6, @NonNull String[] strArr7, @NonNull boolean[] zArr4, @NonNull long[] jArr4, @NonNull String[] strArr8) {
        this.b.d(new bi2(this, new zie(a(strArr, zArr, jArr, strArr2), a(strArr3, zArr2, jArr2, strArr4), a(strArr5, zArr3, jArr3, strArr6), a(strArr7, zArr4, jArr4, strArr8)), (byte) 13)).a(null);
    }
}
