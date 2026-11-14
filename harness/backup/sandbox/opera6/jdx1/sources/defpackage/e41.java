package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e41 implements ViewTranslationCallback {
    public static final e41 a = new e41();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        o41 o41Var = ((v31) view).w;
        o41Var.getClass();
        o41Var.e = k41.a;
        jde jdeVarC = o41Var.c();
        Object[] objArr = jdeVarC.c;
        long[] jArr = jdeVarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        see seeVar = ((m0j) objArr[(i << 3) + i3]).a.d.a;
                        Object objG = seeVar.g(n0j.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = seeVar.g(e0j.n);
                            c8 c8Var = (c8) (objG2 != null ? objG2 : null);
                            if (c8Var != null && (function0 = c8Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        o41 o41Var = ((v31) view).w;
        o41Var.getClass();
        o41Var.e = k41.a;
        jde jdeVarC = o41Var.c();
        Object[] objArr = jdeVarC.c;
        long[] jArr = jdeVarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        see seeVar = ((m0j) objArr[(i << 3) + i3]).a.d.a;
                        Object objG = seeVar.g(n0j.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (Intrinsics.a(objG, Boolean.TRUE)) {
                            Object objG2 = seeVar.g(e0j.m);
                            c8 c8Var = (c8) (objG2 != null ? objG2 : null);
                            if (c8Var != null && (function1 = c8Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        o41 o41Var = ((v31) view).w;
        o41Var.getClass();
        o41Var.e = k41.b;
        jde jdeVarC = o41Var.c();
        Object[] objArr = jdeVarC.c;
        long[] jArr = jdeVarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        see seeVar = ((m0j) objArr[(i << 3) + i3]).a.d.a;
                        Object objG = seeVar.g(n0j.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (Intrinsics.a(objG, Boolean.FALSE)) {
                            Object objG2 = seeVar.g(e0j.m);
                            c8 c8Var = (c8) (objG2 != null ? objG2 : null);
                            if (c8Var != null && (function1 = c8Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
