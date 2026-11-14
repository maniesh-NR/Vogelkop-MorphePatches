package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.versionedparcelable.ParcelImpl;
import com.opera.android.BrowserActivity;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.import_data.ImportChromeBookmarksActivity;
import java.io.File;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class o0g {
    public static final ue5 a = new ue5(482161978, new ef5((byte) 28), false);
    public static final int[] b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final KSerializer[] c = new KSerializer[0];
    public static final long[] d = new long[0];
    public static final int[] e = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] f = {-32595792, -7943725, 4688975, 3500415, 6194736, 33281959, -12573105, -1002827, 163343, 5703241};
    public static final iip g = new iip(8);
    public static boolean h = true;

    public static void A(int i, int i2, byte[] bArr, int[] iArr) {
        int iC = C(i, bArr);
        int iC2 = C(i + 4, bArr);
        int iC3 = C(i + 8, bArr);
        int iC4 = C(i + 12, bArr);
        iArr[i2] = iC & 67108863;
        iArr[i2 + 1] = ((iC2 << 6) | (iC >>> 26)) & 67108863;
        iArr[i2 + 2] = ((iC3 << 12) | (iC2 >>> 20)) & 33554431;
        iArr[i2 + 3] = ((iC4 << 19) | (iC3 >>> 13)) & 67108863;
        iArr[i2 + 4] = iC4 >>> 7;
    }

    public static final ne2 A0(InputStream inputStream) {
        return new ne2(inputStream, new jql(), (byte) 1);
    }

    public static void B(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2] = i3 & 67108863;
        iArr2[i2 + 1] = ((i4 << 6) | (i3 >>> 26)) & 67108863;
        iArr2[i2 + 2] = ((i5 << 12) | (i4 >>> 20)) & 33554431;
        iArr2[i2 + 3] = ((i6 << 19) | (i5 >>> 13)) & 67108863;
        iArr2[i2 + 4] = i6 >>> 7;
    }

    public static void B0(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        long j = i;
        long j2 = j * j;
        long j3 = i2 << 1;
        long j4 = j * j3;
        long j5 = i3 << 1;
        long j6 = j * j5;
        long j7 = i2;
        long j8 = (j7 * j7) + j6;
        long j9 = i4 << 1;
        long j10 = (j * j9) + (j3 * j5);
        long j11 = i5 << 1;
        long j12 = (j7 * j9) + (j * j11) + (i3 * j5);
        long j13 = (j5 * j9) + (j3 * j11);
        long j14 = j5 * j11;
        long j15 = i4;
        long j16 = (j15 * j15) + j14;
        long j17 = j15 * j11;
        long j18 = i6;
        long j19 = j18 * j18;
        long j20 = i7 << 1;
        long j21 = j18 * j20;
        long j22 = i8 << 1;
        long j23 = j18 * j22;
        long j24 = i7;
        long j25 = (j24 * j24) + j23;
        long j26 = j20 * j22;
        long j27 = i9 << 1;
        long j28 = i10 << 1;
        long j29 = (j24 * j27) + (j18 * j28) + (i8 * j22);
        long j30 = (j22 * j27) + (j20 * j28);
        long j31 = j22 * j28;
        long j32 = i9;
        long j33 = j2 - (j30 * 38);
        long j34 = j4 - (((j32 * j32) + j31) * 38);
        long j35 = j8 - ((j32 * j28) * 38);
        long j36 = j10 - ((i10 * j28) * 38);
        long j37 = j13 - j19;
        long j38 = j16 - j21;
        long j39 = j17 - j25;
        long j40 = (i5 * j11) - ((j18 * j27) + j26);
        int i11 = i2 + i7;
        int i12 = i3 + i8;
        int i13 = i4 + i9;
        int i14 = i5 + i10;
        long j41 = i + i6;
        long j42 = i11 << 1;
        long j43 = j41 * j42;
        long j44 = i12 << 1;
        long j45 = i11;
        long j46 = (j45 * j45) + (j41 * j44);
        long j47 = i13 << 1;
        long j48 = i14 << 1;
        long j49 = i13;
        long j50 = i14 * j48;
        long j51 = (((j41 * j47) + (j42 * j44)) - j36) + j40;
        int i15 = ((int) j51) & 67108863;
        long j52 = ((((j45 * j47) + ((j41 * j48) + (i12 * j44))) - j12) - j29) + (j51 >> 26);
        int i16 = ((int) j52) & 33554431;
        long j53 = ((((j52 >> 25) + ((j47 * j44) + (j42 * j48))) - j37) * 38) + j33;
        iArr2[0] = ((int) j53) & 67108863;
        long j54 = ((((j49 * j49) + (j44 * j48)) - j38) * 38) + j34 + (j53 >> 26);
        iArr2[1] = ((int) j54) & 67108863;
        long j55 = (((j49 * j48) - j39) * 38) + j35 + (j54 >> 26);
        iArr2[2] = ((int) j55) & 33554431;
        long j56 = ((j50 - j40) * 38) + j36 + (j55 >> 25);
        iArr2[3] = ((int) j56) & 67108863;
        long jD = osp.d(j29, 38L, j12, j56 >> 26);
        iArr2[4] = ((int) jD) & 33554431;
        long j57 = ((j41 * j41) - j33) + j37 + (jD >> 25);
        iArr2[5] = ((int) j57) & 67108863;
        long j58 = (j43 - j34) + j38 + (j57 >> 26);
        iArr2[6] = ((int) j58) & 67108863;
        long j59 = (j46 - j35) + j39 + (j58 >> 26);
        iArr2[7] = ((int) j59) & 33554431;
        long j60 = (j59 >> 25) + i15;
        iArr2[8] = ((int) j60) & 67108863;
        iArr2[9] = i16 + ((int) (j60 >> 26));
    }

    public static int C(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24);
    }

    public static void C0(int[] iArr, int[] iArr2, int i) {
        B0(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                B0(iArr2, iArr2);
            }
        }
    }

    public static boolean D(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 7;
        while (true) {
            z = true;
            if (i >= 0) {
                int i2 = iArr[8 + i] + LinearLayoutManager.INVALID_OFFSET;
                int i3 = iArr2[i] + LinearLayoutManager.INVALID_OFFSET;
                if (i2 >= i3) {
                    if (i2 > i3) {
                        break;
                    }
                    i--;
                } else {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            G0(8, 0, iArr, iArr2, iArr3);
            return z;
        }
        G0(0, 8, iArr2, iArr, iArr3);
        return z;
    }

    public static void D0(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i3 - 1;
            long j2 = iArr[i3] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = ((i2 << 31) & 4294967295L) | (j4 >>> 33);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[1] & 4294967295L;
                long j7 = (j6 * j) + j5;
                int i6 = (int) j7;
                iArr2[1] = (i6 << 1) | i5;
                long j8 = (iArr2[2] & 4294967295L) + (j7 >>> 32);
                long j9 = iArr[2] & 4294967295L;
                long j10 = j8 + (j9 * j);
                int i7 = (int) j10;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long jD = osp.d(j9, j6, j10 >>> 32, iArr2[3] & 4294967295L);
                long j11 = (iArr2[4] & 4294967295L) + (jD >>> 32);
                long j12 = iArr[3] & 4294967295L;
                long j13 = (iArr2[5] & 4294967295L) + (j11 >>> 32);
                long j14 = (iArr2[6] & 4294967295L) + (j13 >>> 32);
                long j15 = j13 & 4294967295L;
                long j16 = (j12 * j) + (jD & 4294967295L);
                int i8 = (int) j16;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                long jD2 = osp.d(j12, j6, j16 >>> 32, j11 & 4294967295L);
                long jD3 = osp.d(j12, j9, jD2 >>> 32, j15);
                long j17 = j14 + (jD3 >>> 32);
                long j18 = jD3 & 4294967295L;
                long j19 = iArr[4] & 4294967295L;
                long j20 = (iArr2[7] & 4294967295L) + (j17 >>> 32);
                long j21 = (iArr2[8] & 4294967295L) + (j20 >>> 32);
                long j22 = (jD2 & 4294967295L) + (j19 * j);
                int i9 = (int) j22;
                iArr2[4] = (i9 << 1) | (i8 >>> 31);
                long jD4 = osp.d(j19, j6, j22 >>> 32, j18);
                long jD5 = osp.d(j19, j9, jD4 >>> 32, j17 & 4294967295L);
                long jD6 = osp.d(j19, j12, jD5 >>> 32, j20 & 4294967295L);
                long j23 = jD5 & 4294967295L;
                long j24 = j21 + (jD6 >>> 32);
                long j25 = iArr[5] & 4294967295L;
                long j26 = (iArr2[9] & 4294967295L) + (j24 >>> 32);
                long j27 = (iArr2[10] & 4294967295L) + (j26 >>> 32);
                long j28 = j26 & 4294967295L;
                long j29 = (j25 * j) + (jD4 & 4294967295L);
                int i10 = (int) j29;
                iArr2[5] = (i10 << 1) | (i9 >>> 31);
                long jD7 = osp.d(j25, j6, j29 >>> 32, j23);
                long jD8 = osp.d(j25, j9, jD7 >>> 32, jD6 & 4294967295L);
                long jD9 = osp.d(j25, j12, jD8 >>> 32, j24 & 4294967295L);
                long j30 = jD8 & 4294967295L;
                long jD10 = osp.d(j25, j19, jD9 >>> 32, j28);
                long j31 = jD9 & 4294967295L;
                long j32 = j27 + (jD10 >>> 32);
                long j33 = iArr[6] & 4294967295L;
                long j34 = (iArr2[11] & 4294967295L) + (j32 >>> 32);
                long j35 = (iArr2[12] & 4294967295L) + (j34 >>> 32);
                long j36 = (jD7 & 4294967295L) + (j33 * j);
                int i11 = (int) j36;
                iArr2[6] = (i11 << 1) | (i10 >>> 31);
                long jD11 = osp.d(j33, j6, j36 >>> 32, j30);
                long jD12 = osp.d(j33, j9, jD11 >>> 32, j31);
                long jD13 = osp.d(j33, j12, jD12 >>> 32, jD10 & 4294967295L);
                long j37 = jD12 & 4294967295L;
                long jD14 = osp.d(j33, j19, jD13 >>> 32, j32 & 4294967295L);
                long j38 = jD13 & 4294967295L;
                long jD15 = osp.d(j33, j25, jD14 >>> 32, j34 & 4294967295L);
                long j39 = j35 + (jD15 >>> 32);
                long j40 = jD15 & 4294967295L;
                long j41 = iArr[7] & 4294967295L;
                long j42 = (iArr2[13] & 4294967295L) + (j39 >>> 32);
                long j43 = (iArr2[14] & 4294967295L) + (j42 >>> 32);
                long j44 = j42 & 4294967295L;
                long j45 = (j41 * j) + (jD11 & 4294967295L);
                int i12 = (int) j45;
                iArr2[7] = (i12 << 1) | (i11 >>> 31);
                long jD16 = osp.d(j41, j6, j45 >>> 32, j37);
                long jD17 = osp.d(j41, j9, jD16 >>> 32, j38);
                long jD18 = osp.d(j41, j12, jD17 >>> 32, jD14 & 4294967295L);
                long jD19 = osp.d(j41, j19, jD18 >>> 32, j40);
                long jD20 = osp.d(j41, j25, jD19 >>> 32, j39 & 4294967295L);
                long jD21 = osp.d(j41, j33, jD20 >>> 32, j44);
                long j46 = j43 + (jD21 >>> 32);
                int i13 = (int) jD16;
                iArr2[8] = (i13 << 1) | (i12 >>> 31);
                int i14 = (int) jD17;
                iArr2[9] = (i14 << 1) | (i13 >>> 31);
                int i15 = (int) jD18;
                iArr2[10] = (i15 << 1) | (i14 >>> 31);
                int i16 = (int) jD19;
                iArr2[11] = (i16 << 1) | (i15 >>> 31);
                int i17 = (int) jD20;
                iArr2[12] = (i17 << 1) | (i16 >>> 31);
                int i18 = (int) jD21;
                iArr2[13] = (i18 << 1) | (i17 >>> 31);
                int i19 = (int) j46;
                iArr2[14] = (i19 << 1) | (i18 >>> 31);
                iArr2[15] = ((iArr2[15] + ((int) (j46 >>> 32))) << 1) | (i19 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static void E(int i, int i2, byte[] bArr, int[] iArr) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        G(i3 | (i4 << 26), i2, bArr);
        G((i4 >>> 6) | (i5 << 20), i2 + 4, bArr);
        G((i5 >>> 12) | (i6 << 13), i2 + 8, bArr);
        G((i6 >>> 19) | (i7 << 7), i2 + 12, bArr);
    }

    public static void E0(BrowserActivity browserActivity, ni niVar, w2b w2bVar) {
        Intent intentE0 = FullscreenWebActivity.e0(browserActivity, ImportChromeBookmarksActivity.class, "https://takeout.google.com", new qxh("Google Takeout"), true, lqm.d);
        intentE0.putExtra("extra_import_entry_point", w2bVar.a);
        oi.d(browserActivity).D(intentE0, niVar);
    }

    public static void F(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        iArr2[i2] = i3 | (i4 << 26);
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i6 >>> 19) | (i7 << 7);
    }

    public static int F0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        long j8 = ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static void G(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void G0(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[i] & 4294967295L) - (iArr2[i2] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[i + 1] & 4294967295L) - (iArr2[i2 + 1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[i + 2] & 4294967295L) - (iArr2[i2 + 2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[i + 3] & 4294967295L) - (iArr2[i2 + 3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[i + 4] & 4294967295L) - (iArr2[i2 + 4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[i + 5] & 4294967295L) - (iArr2[i2 + 5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((iArr[i + 6] & 4294967295L) - (iArr2[i2 + 6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        iArr3[7] = (int) (((iArr[i + 7] & 4294967295L) - (iArr2[i2 + 7] & 4294967295L)) + (j7 >> 32));
    }

    public static final void H(CoroutineContext coroutineContext) {
        unb unbVar = coroutineContext.get(ulp.h);
        if (unbVar != null && !unbVar.isActive()) {
            throw unbVar.p();
        }
    }

    public static void H0(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static boolean I(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void I0(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        iArr2[7] = (int) (((iArr2[7] & 4294967295L) - (iArr[7] & 4294967295L)) + (j7 >> 32));
    }

    public static boolean J(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger J0(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                sfe.h0(i2, (7 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final c8e K(c8e c8eVar, boolean z, lde ldeVar) {
        return c8eVar.d(z ? new zg9(ldeVar) : z7e.b);
    }

    public static BigInteger K0(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                sfe.v0(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static Pair L(orb orbVar) {
        ArrayMap arrayMap = new ArrayMap(0);
        ArrayMap arrayMap2 = new ArrayMap(0);
        Iterator<String> itKeys = orbVar.a.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Pair pairO = O(orbVar.c(next));
                Object obj = pairO.first;
                if (obj != null) {
                    arrayMap.put(next, (List) obj);
                }
                Object obj2 = pairO.second;
                if (obj2 != null) {
                    arrayMap2.put(next, (List) obj2);
                }
            } catch (JSONException unused) {
            }
        }
        return new Pair(arrayMap, arrayMap2);
    }

    public static vpb L0(ArrayList arrayList) {
        vpb vpbVar = new vpb();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            orb orbVar = new orb();
            ((dy8) obj).a(orbVar);
            vpbVar.a(orbVar);
        }
        return vpbVar;
    }

    public static int[] M(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            hai.d();
            return null;
        }
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static vpb M0(List list) {
        vpb vpbVar = new vpb();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tx8 tx8Var = (tx8) it.next();
            orb orbVar = new orb();
            orbVar.p(tx8Var.a, "id");
            orbVar.p(tx8Var.b, "value");
            orbVar.p(tx8Var.c, "content");
            orbVar.p(tx8Var.d, "text");
            orbVar.p(tx8Var.e, "description");
            vpbVar.a(orbVar);
        }
        return vpbVar;
    }

    public static ArrayList N(vpb vpbVar) {
        JSONArray jSONArray = vpbVar.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(tx8.a(vpbVar.c(i)));
            } catch (JSONException unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static void N0(Dialog dialog) {
        View decorView = dialog.getWindow().getDecorView();
        Drawable background = decorView.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                decorView.setOnTouchListener(new p9b(dialog, rect));
            }
        }
    }

    public static Pair O(orb orbVar) {
        vpb vpbVarH = orbVar.h("not_interested");
        ArrayList arrayListN = vpbVarH != null ? N(vpbVarH) : null;
        vpb vpbVarH2 = orbVar.h("report");
        return new Pair(arrayListN, vpbVarH2 != null ? N(vpbVarH2) : null);
    }

    public static void O0(poe poeVar, slh slhVar) {
        slhVar.u0(poeVar.a);
        slhVar.writeByte(10);
        slhVar.u0(poeVar.b);
        slhVar.writeByte(10);
        slhVar.u0(poeVar.c);
        slhVar.writeByte(10);
        Set<Map.Entry> setEntrySet = poeVar.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        slhVar.u0(size);
        slhVar.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                slhVar.S((String) entry.getKey());
                slhVar.S(":");
                slhVar.S(str);
                slhVar.writeByte(10);
            }
        }
    }

    public static int P(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final int P0(float f2, float[] fArr, int i) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final nx5 Q(ae5 r6) {
        /*
            nrl r0 = r6.a()
            java.lang.Object r1 = r0.b
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "componentScope"
            java.lang.Object r1 = r1.get(r2)
            bbb r1 = (bbb) r1
            if (r1 != 0) goto L54
            cbb r1 = new cbb
            cv6 r3 = bb7.a
            d7a r3 = s6d.a
            boolean r4 = defpackage.o0g.h
            if (r4 == 0) goto L22
            d7a r3 = r3.e     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r3 = 0
            defpackage.o0g.h = r3
        L22:
            cv6 r3 = bb7.a
            d7a r3 = s6d.a
        L26:
            csk r4 = defpackage.zch.a()
            r3.getClass()
            kotlin.coroutines.CoroutineContext r3 = kotlin.coroutines.e.a(r3, r4)
            a64 r3 = defpackage.sgb.b(r3)
            rcc r6 = r6.getLifecycle()
            pcc r4 = r6.getState()
            pcc r5 = defpackage.pcc.a
            if (r4 != r5) goto L46
            r6 = 0
            defpackage.sgb.k(r3, r6)
            goto L4e
        L46:
            ox5 r4 = new ox5
            r4.<init>(r3)
            r6.h(r4)
        L4e:
            r1.<init>(r3)
            r0.J(r2, r1)
        L54:
            cbb r1 = (defpackage.cbb) r1
            a64 r6 = r1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0g.Q(ae5):nx5");
    }

    public static int R(Context context) {
        return ab5.e(-1, X(2130969303, context)) >= 3.0d ? -1 : -570425344;
    }

    public static float S(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable T(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawableF = sgb.F(typedArrayObtainStyledAttributes.getResourceId(0, 0), context);
        if (g0(context)) {
            drawableF.setTint(context.getColor(2131101263));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawableF;
    }

    public static final unb U(CoroutineContext coroutineContext) {
        unb unbVar = coroutineContext.get(ulp.h);
        if (unbVar != null) {
            return unbVar;
        }
        n57.h(coroutineContext, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static int W(Context context) {
        return g0(context) ? R(context) == -570425344 ? 2132084132 : 2132084133 : R(context) == -570425344 ? 2132084134 : 2132084131;
    }

    public static int X(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int Y(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static g2n Z(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(o0g.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final void a(final g1b g1bVar, final Function2 function2, final Function1 function1, c8e c8eVar, ih5 ih5Var, final int i) {
        final c8e c8eVar2;
        znh znhVarR;
        Function2 function22;
        final g1b g1bVar2 = g1bVar;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1658230373);
        int i2 = i | (vt9Var.f(g1bVar2) ? 4 : 2) | (vt9Var.h(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(function1) ? 2048 : 1024) | 24576;
        if (vt9Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zIsEmpty = g1bVar2.isEmpty();
            final z7e z7eVar = z7e.b;
            if (zIsEmpty) {
                znhVarR = vt9Var.r();
                if (znhVarR != null) {
                    final byte b2 = 0;
                    function22 = new Function2(g1bVar2, function2, function1, z7eVar, i, b2) { // from class: k23
                        public final /* synthetic */ byte a;
                        public final /* synthetic */ g1b b;
                        public final /* synthetic */ Function2 c;
                        public final /* synthetic */ Function1 d;
                        public final /* synthetic */ c8e e;

                        {
                            this.a = b2;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iM = aoh.m(49);
                                    o0g.a(this.b, this.c, this.d, this.e, (ih5) obj, iM);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iM2 = aoh.m(49);
                                    o0g.a(this.b, this.c, this.d, this.e, (ih5) obj, iM2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    znhVarR.d = function22;
                }
                return;
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z || objK == zpaVar) {
                objK = new oc2(g1bVar2, (byte) 6);
                vt9Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            txf txfVar = uxf.a;
            Object[] objArr = new Object[0];
            c67 c67Var = gu6.G;
            boolean zD = vt9Var.d(0) | vt9Var.c(0.0f) | vt9Var.f(function0);
            Object objK2 = vt9Var.K();
            if (zD || objK2 == zpaVar) {
                objK2 = new nx0(function0, (byte) 7);
                vt9Var.g0(objK2);
            }
            gu6 gu6Var = (gu6) w1h.u(objArr, c67Var, (Function0) objK2, vt9Var, 0);
            gu6Var.F.setValue(function0);
            boolean zF = vt9Var.f(gu6Var) | (i3 == 4) | ((i2 & 7168) == 2048);
            Object objK3 = vt9Var.K();
            if (zF || objK3 == zpaVar) {
                objK3 = new s3(gu6Var, g1bVar, function1, null, (byte) 10);
                gu6Var = gu6Var;
                g1bVar2 = g1bVar;
                vt9Var.g0(objK3);
            }
            rm5.e(vt9Var, gu6Var, (Function2) objK3);
            i39 i39Var = mpj.a;
            gu6 gu6Var2 = gu6Var;
            db5 db5VarA = cb5.a(new x62(16.0f, true, new t40((byte) 19)), rbe.o, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, i39Var);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            d(gu6Var2, i39Var, a26.c(2, 16.0f, 0.0f), null, 16.0f, null, null, false, null, null, null, gyg.P(-1755502820, new dr9() { // from class: l23
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    ih5 ih5Var2 = (ih5) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= ((vt9) ih5Var2).d(iIntValue) ? 32 : 16;
                    }
                    vt9 vt9Var2 = (vt9) ih5Var2;
                    if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        wxe.a((j23) g1bVar2.get(iIntValue), function2, mpj.a, vt9Var2, 384);
                    } else {
                        vt9Var2.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var), vt9Var, 196656);
            if (g1bVar.size() > 1) {
                vt9Var.W(-135873144);
                f(g1bVar.size(), gu6Var2, vt9Var, 0);
                vt9Var.p(false);
            } else {
                vt9Var.W(-135812601);
                vt9Var.p(false);
            }
            vt9Var.p(true);
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znhVarR = vt9Var.r();
        if (znhVarR != null) {
            final byte b3 = 1;
            function22 = new Function2(g1bVar, function2, function1, c8eVar2, i, b3) { // from class: k23
                public final /* synthetic */ byte a;
                public final /* synthetic */ g1b b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ c8e e;

                {
                    this.a = b3;
                }

                public final Object invoke(Object obj, Object obj2) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM = aoh.m(49);
                            o0g.a(this.b, this.c, this.d, this.e, (ih5) obj, iM);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM2 = aoh.m(49);
                            o0g.a(this.b, this.c, this.d, this.e, (ih5) obj, iM2);
                            break;
                    }
                    return Unit.a;
                }
            };
            znhVarR.d = function22;
        }
    }

    public static boolean a0(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] + LinearLayoutManager.INVALID_OFFSET;
            int i3 = iArr2[i] + LinearLayoutManager.INVALID_OFFSET;
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static final void b(b3m b3mVar, c8e c8eVar, h49 h49Var, Function1 function1, ue5 ue5Var, ih5 ih5Var, int i) {
        Function1 function12;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1877370462);
        int i2 = (i & 6) == 0 ? (vt9Var.f(b3mVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(h49Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 16384 : 8192;
        }
        if (vt9Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = h50.q;
                vt9Var.g0(objK);
            }
            Function1 function13 = (Function1) objK;
            Object objK2 = vt9Var.K();
            Object obj = objK2;
            if (objK2 == zpaVar) {
                puj pujVar = new puj();
                pujVar.add(b3mVar.c());
                vt9Var.g0(pujVar);
                obj = pujVar;
            }
            puj pujVar2 = (puj) obj;
            Object objK3 = vt9Var.K();
            if (objK3 == zpaVar) {
                long[] jArr = imi.a;
                objK3 = new see();
                vt9Var.g0(objK3);
            }
            see seeVar = (see) objK3;
            Object objC = b3mVar.c();
            t0g t0gVar = b3mVar.d;
            if (Intrinsics.a(objC, t0gVar.getValue())) {
                vt9Var.W(321145192);
                if (pujVar2.size() == 1 && Intrinsics.a(pujVar2.get(0), t0gVar.getValue())) {
                    vt9Var.W(321469824);
                    vt9Var.p(false);
                } else {
                    vt9Var.W(321279546);
                    boolean z = (i3 & 14) == 4;
                    Object objK4 = vt9Var.K();
                    if (z || objK4 == zpaVar) {
                        objK4 = new b11((Object) b3mVar, (byte) 8);
                        vt9Var.g0(objK4);
                    }
                    o95.v(pujVar2, (Function1) objK4);
                    seeVar.a();
                    vt9Var.p(false);
                }
                vt9Var.p(false);
            } else {
                vt9Var.W(321475776);
                vt9Var.p(false);
            }
            if (seeVar.b(t0gVar.getValue())) {
                vt9Var.W(322279296);
                vt9Var.p(false);
            } else {
                vt9Var.W(321536443);
                mea meaVarListIterator = pujVar2.listIterator();
                int i4 = 0;
                while (true) {
                    mea meaVar = meaVarListIterator;
                    if (!meaVar.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (Intrinsics.a(function13.invoke(meaVar.next()), function13.invoke(t0gVar.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    pujVar2.add(t0gVar.getValue());
                } else {
                    pujVar2.set(i4, t0gVar.getValue());
                }
                seeVar.a();
                int size = pujVar2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj2 = pujVar2.get(i5);
                    seeVar.m(obj2, gyg.P(-934471669, new s26(b3mVar, h49Var, obj2, ue5Var), vt9Var));
                }
                vt9Var.p(false);
            }
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.j(vt9Var, Integer.valueOf(iHashCode));
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            vt9Var.W(-1312707512);
            int size2 = pujVar2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Object obj3 = pujVar2.get(i6);
                vt9Var.U(1171574969, function13.invoke(obj3));
                Function2 function2 = (Function2) seeVar.g(obj3);
                if (function2 == null) {
                    vt9Var.W(1959122128);
                } else {
                    vt9Var.W(1171576145);
                    function2.invoke(vt9Var, 0);
                }
                vt9Var.p(false);
                vt9Var.p(false);
            }
            vt9Var.p(false);
            vt9Var.p(true);
            function12 = function13;
        } else {
            vt9Var.Q();
            function12 = function1;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new t26(b3mVar, c8eVar, h49Var, function12, ue5Var, i);
        }
    }

    public static final xb7 b0(unb unbVar, boolean z, job jobVar) {
        return unbVar instanceof xob ? ((xob) unbVar).g0(z, jobVar) : unbVar.o(jobVar.o(), z, new ci7(1, jobVar, job.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, (byte) 15));
    }

    public static final void c(Boolean bool, c8e c8eVar, h49 h49Var, String str, ue5 ue5Var, ih5 ih5Var, int i) {
        c8e c8eVar2;
        String str2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-513216493);
        int i2 = i | (vt9Var.f(bool) ? 4 : 2) | 48 | (vt9Var.h(h49Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | 3072;
        if (vt9Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            z7e z7eVar = z7e.b;
            b(r9h.v(bool, "Crossfade", vt9Var, (i2 & 14) | 48, 0), z7eVar, h49Var, null, ue5Var, vt9Var, i2 & 58352);
            c8eVar2 = z7eVar;
            str2 = "Crossfade";
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
            str2 = str;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new p26(bool, c8eVar2, h49Var, str2, ue5Var, i);
        }
    }

    public static final boolean c0(CoroutineContext coroutineContext) {
        unb unbVar = coroutineContext.get(ulp.h);
        if (unbVar != null) {
            return unbVar.isActive();
        }
        return true;
    }

    public static final void d(final gu6 gu6Var, final c8e c8eVar, final zvf zvfVar, ydp ydpVar, final float f2, sd3 sd3Var, mtj mtjVar, boolean z, eu6 eu6Var, n9a n9aVar, v51 v51Var, final ue5 ue5Var, ih5 ih5Var, final int i) {
        final ydp ydpVar2;
        final sd3 sd3Var2;
        final mtj mtjVar2;
        final boolean z2;
        final eu6 eu6Var2;
        final n9a n9aVar2;
        final v51 v51Var2;
        mtj mtjVar3;
        v51 v51VarB;
        sd3 sd3Var3;
        eu6 eu6Var3;
        ydp ydpVar3;
        int i2;
        boolean z3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1860873769);
        int i3 = i | (vt9Var.f(gu6Var) ? 4 : 2) | (vt9Var.f(zvfVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | 911764480;
        if (vt9Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            vt9Var.S();
            if ((i & 1) == 0 || vt9Var.x()) {
                ydp ydpVar4 = ydp.i;
                sd3 sd3Var4 = rbe.l;
                int i4 = (i3 & 14) | 196608;
                Object lxfVar = new lxf();
                wi6 wi6VarA = m0k.a(vt9Var);
                Map map = tan.a;
                a2k a2kVarR = rm5.R(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                Object obj = (n27) vt9Var.j(mi5.h);
                g7h g7hVar = mi5.n;
                d2c d2cVar = (d2c) vt9Var.j(g7hVar);
                boolean zF = ((((i4 & 14) ^ 6) > 4 && vt9Var.f(gu6Var)) || (i4 & 6) == 4) | vt9Var.f(wi6VarA) | vt9Var.f(a2kVarR) | vt9Var.f(lxfVar) | vt9Var.f(obj) | vt9Var.d(d2cVar.ordinal());
                Object objK = vt9Var.K();
                Object obj2 = hh5.a;
                byte b2 = 14;
                if (zF || objK == obj2) {
                    b57 b57Var = new b57(gu6Var, d2cVar, b2);
                    z8b z8bVar = new z8b();
                    z8bVar.a = gu6Var;
                    z8bVar.b = b57Var;
                    objK = new mtj(z8bVar, wi6VarA, a2kVarR);
                    vt9Var.g0(objK);
                }
                mtj mtjVar4 = (mtj) objK;
                int i5 = i3 & (-29360129);
                fsf fsfVar = fsf.a;
                int i6 = (i3 & 14) | 432;
                d2c d2cVar2 = (d2c) vt9Var.j(g7hVar);
                boolean zD = ((((i6 & 14) ^ 6) > 4 && vt9Var.f(gu6Var)) || (i6 & 6) == 4) | vt9Var.d(d2cVar2.ordinal());
                Object objK2 = vt9Var.K();
                if (zD || objK2 == obj2) {
                    objK2 = new eu6(gu6Var, d2cVar2);
                    vt9Var.g0(objK2);
                }
                n9aVar2 = n9a.m;
                mtjVar3 = mtjVar4;
                v51VarB = bvf.b(vt9Var);
                sd3Var3 = sd3Var4;
                eu6Var3 = (eu6) objK2;
                ydpVar3 = ydpVar4;
                i2 = i5;
                z3 = true;
            } else {
                vt9Var.Q();
                i2 = i3 & (-29360129);
                ydpVar3 = ydpVar;
                sd3Var3 = sd3Var;
                mtjVar3 = mtjVar;
                z3 = z;
                eu6Var3 = eu6Var;
                n9aVar2 = n9aVar;
                v51VarB = v51Var;
            }
            vt9Var.q();
            fsf fsfVar2 = fsf.a;
            ipe.d(c8eVar, gu6Var, zvfVar, mtjVar3, z3, v51VarB, f2, ydpVar3, eu6Var3, sd3Var3, n9aVar2, ue5Var, vt9Var, 24582 | ((i2 << 3) & 112) | (i2 & 896) | 907545600, 1797510);
            v51Var2 = v51VarB;
            sd3Var2 = sd3Var3;
            eu6Var2 = eu6Var3;
            z2 = z3;
            ydpVar2 = ydpVar3;
            mtjVar2 = mtjVar3;
        } else {
            vt9Var.Q();
            ydpVar2 = ydpVar;
            sd3Var2 = sd3Var;
            mtjVar2 = mtjVar;
            z2 = z;
            eu6Var2 = eu6Var;
            n9aVar2 = n9aVar;
            v51Var2 = v51Var;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(c8eVar, zvfVar, ydpVar2, f2, sd3Var2, mtjVar2, z2, eu6Var2, n9aVar2, v51Var2, ue5Var, i) { // from class: dxf
                public final /* synthetic */ c8e b;
                public final /* synthetic */ zvf c;
                public final /* synthetic */ ydp d;
                public final /* synthetic */ float e;
                public final /* synthetic */ sd3 f;
                public final /* synthetic */ mtj g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ eu6 i;
                public final /* synthetic */ n9a j;
                public final /* synthetic */ v51 k;
                public final /* synthetic */ ue5 l;

                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM = aoh.m(196657);
                    o0g.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (ih5) obj3, iM);
                    return Unit.a;
                }
            };
        }
    }

    public static boolean d0(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                qp2.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static ynb e() {
        return new ynb((unb) null);
    }

    public static final boolean e0(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final void f(int i, gu6 gu6Var, ih5 ih5Var, int i2) {
        long j;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2047846438);
        int i3 = (vt9Var.d(i) ? 4 : 2) | i2 | (vt9Var.f(gu6Var) ? 32 : 16);
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            o9i o9iVarA = m9i.a(new x62(6.0f, true, new t40((byte) 19)), rbe.k, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            vt9Var.W(-1065169821);
            int i4 = 0;
            while (i4 < i) {
                boolean z = gu6Var.k() == i4;
                c8e c8eVarJ = x1p.j(mpj.h(z7eVar, 8.0f), v8i.a);
                if (z) {
                    vt9Var.W(1501404870);
                    j = ((sa5) vt9Var.j(ua5.a)).s;
                    vt9Var.p(false);
                } else {
                    vt9Var.W(1501508255);
                    j = ((sa5) vt9Var.j(ua5.a)).H;
                    vt9Var.p(false);
                }
                nr3.a(sfe.C(c8eVarJ, j, kfo.i), vt9Var, 0);
                i4++;
            }
            vt9Var.p(false);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new m23(i, gu6Var, i2);
        }
    }

    public static final boolean f0(o6c o6cVar, int i) {
        return i <= o6cVar.e() && o6cVar.c() <= i;
    }

    public static int g(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean g0(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(2130969972, typedValue, true) && typedValue.data != 0;
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static boolean h0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int i(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean i0(long[] jArr) {
        if (jArr[0] == 1) {
            for (int i = 1; i < 4; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static int j(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L) + (i3 & 4294967295L);
        iArr2[i2] = (int) j;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j >>> 32);
        iArr2[i2 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j2 >>> 32);
        iArr2[i2 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j3 >>> 32);
        iArr2[i2 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j4 >>> 32);
        iArr2[i2 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j5 >>> 32);
        iArr2[i2 + 5] = (int) j6;
        long j7 = (iArr[i + 6] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j6 >>> 32);
        iArr2[i2 + 6] = (int) j7;
        long j8 = (iArr[i + 7] & 4294967295L) + (iArr2[r10] & 4294967295L) + (j7 >>> 32);
        iArr2[i2 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int j0(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return ((i - 1) & (~i)) >> 31;
    }

    public static int k(int[] iArr, int[] iArr2) {
        long j = (iArr[8] & 4294967295L) + (iArr2[16] & 4294967295L);
        int i = (int) j;
        iArr[8] = i;
        iArr2[16] = i;
        long j2 = (iArr[9] & 4294967295L) + (iArr2[17] & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[9] = i2;
        iArr2[17] = i2;
        long j3 = (iArr[10] & 4294967295L) + (iArr2[18] & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[10] = i3;
        iArr2[18] = i3;
        long j4 = (iArr[11] & 4294967295L) + (iArr2[19] & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[11] = i4;
        iArr2[19] = i4;
        long j5 = (iArr[12] & 4294967295L) + (iArr2[20] & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[12] = i5;
        iArr2[20] = i5;
        long j6 = (iArr[13] & 4294967295L) + (iArr2[21] & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[13] = i6;
        iArr2[21] = i6;
        long j7 = (iArr[14] & 4294967295L) + (iArr2[22] & 4294967295L) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[14] = i7;
        iArr2[22] = i7;
        long j8 = (iArr[15] & 4294967295L) + (iArr2[23] & 4294967295L) + (j7 >>> 32);
        int i8 = (int) j8;
        iArr[15] = i8;
        iArr2[23] = i8;
        return (int) (j8 >>> 32);
    }

    public static boolean k0(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc A[Catch: tkb -> 0x01ab, TRY_ENTER, TryCatch #1 {tkb -> 0x01ab, blocks: (B:62:0x0178, B:32:0x00be, B:39:0x00dc, B:41:0x00e9, B:47:0x00fb, B:49:0x010f, B:53:0x0124, B:27:0x00a1, B:31:0x00ae, B:72:0x019b, B:73:0x01aa), top: B:91:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x016e -> B:62:0x0178). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.o6c r27, int r28, int r29, defpackage.n27 r30, nt5 r31) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0g.l(o6c, int, int, n27, nt5):java.lang.Object");
    }

    public static boolean l0(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m(boolean z, o6c o6cVar, int i) {
        if (z) {
            if (o6cVar.c() <= i) {
                return o6cVar.c() == i && o6cVar.d() > 0;
            }
            return true;
        }
        if (o6cVar.c() >= i) {
            return o6cVar.c() == i && o6cVar.d() < 0;
        }
        return true;
    }

    public static int m0(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                qp2.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static void n(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    public static int n0(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        qp2.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = p(r9, r10, r11)
            boolean r1 = p(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L6f
            if (r0 == 0) goto L6f
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L39
            if (r9 == r3) goto L32
            if (r9 == r4) goto L2b
            if (r9 != r1) goto L27
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L6e
            goto L3f
        L27:
            qp2.o(r0)
            return r2
        L2b:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L6e
            goto L3f
        L32:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L6e
            goto L3f
        L39:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L6e
        L3f:
            if (r9 == r5) goto L6e
            if (r9 == r4) goto L6e
            int r11 = m0(r9, r10, r11)
            if (r9 == r5) goto L63
            if (r9 == r3) goto L5e
            if (r9 == r4) goto L59
            if (r9 != r1) goto L55
            int r9 = r12.bottom
            int r10 = r10.bottom
        L53:
            int r9 = r9 - r10
            goto L68
        L55:
            qp2.o(r0)
            return r2
        L59:
            int r9 = r12.right
            int r10 = r10.right
            goto L53
        L5e:
            int r9 = r10.top
            int r10 = r12.top
            goto L53
        L63:
            int r9 = r10.left
            int r10 = r12.left
            goto L53
        L68:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L6f
        L6e:
            return r6
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0g.o(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static void o0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = i;
        long j2 = i2;
        long j3 = j * j2;
        long j4 = i4;
        long j5 = j * j4;
        long j6 = i3;
        long j7 = (j6 * j2) + j5;
        long j8 = i6;
        long j9 = (j6 * j4) + (j * j8);
        long j10 = i5;
        long j11 = (j10 * j2) + j9;
        long j12 = ((j10 * j4) + (j6 * j8)) << 1;
        long j13 = i8;
        long j14 = j * j13;
        long j15 = i7;
        long jD = osp.d(j15, j2, j14, j12);
        long j16 = (j10 * j8) << 1;
        long j17 = i10;
        long j18 = i9;
        long jD2 = osp.d(j18, j2, (j15 * j4) + (j6 * j13) + (j * j17), j16);
        long j19 = ((j18 * j4) + ((j15 * j8) + ((j10 * j13) + (j6 * j17)))) << 1;
        long j20 = (j15 * j13) + (((j18 * j8) + (j10 * j17)) << 1);
        long j21 = (j18 * j13) + (j15 * j17);
        long j22 = (j18 * j17) << 1;
        long j23 = i11;
        long j24 = i12;
        long j25 = j23 * j24;
        long j26 = i14;
        long j27 = j23 * j26;
        long j28 = i13;
        long j29 = (j28 * j24) + j27;
        long j30 = i16;
        long j31 = (j28 * j26) + (j23 * j30);
        long j32 = i15;
        long j33 = i18;
        long j34 = j23 * j33;
        long j35 = i17;
        long jD3 = osp.d(j35, j24, j34, ((j32 * j26) + (j28 * j30)) << 1);
        long j36 = i20;
        long j37 = (j35 * j26) + (j28 * j33) + (j23 * j36);
        long j38 = i19;
        long jD4 = osp.d(j38, j24, j37, (j32 * j30) << 1);
        long j39 = j3 - (((j26 * j38) + ((j35 * j30) + ((j32 * j33) + (j28 * j36)))) * 76);
        long j40 = j7 - (((j35 * j33) + (((j30 * j38) + (j32 * j36)) << 1)) * 38);
        long j41 = j11 - (((j38 * j33) + (j35 * j36)) * 38);
        long j42 = jD - ((j36 * j38) * 76);
        long j43 = j19 - j25;
        long j44 = j20 - j29;
        long j45 = j21 - ((j32 * j24) + j31);
        long j46 = j22 - jD3;
        long j47 = i + i11;
        long j48 = i2 + i12;
        long j49 = j47 * j48;
        long j50 = i4 + i14;
        long j51 = j47 * j50;
        long j52 = i3 + i13;
        long j53 = (j52 * j48) + j51;
        long j54 = i6 + i16;
        long j55 = i5 + i15;
        long j56 = (j55 * j48) + (j52 * j50) + (j47 * j54);
        long j57 = ((j55 * j50) + (j52 * j54)) << 1;
        long j58 = i8 + i18;
        long j59 = i7 + i17;
        long jD5 = osp.d(j59, j48, j47 * j58, j57);
        long j60 = i10 + i20;
        long j61 = i9 + i19;
        long jD6 = osp.d(j61, j48, (j59 * j50) + (j52 * j58) + (j47 * j60), (j55 * j54) << 1);
        long j62 = ((j50 * j61) + ((j59 * j54) + ((j55 * j58) + (j52 * j60)))) << 1;
        long j63 = (j59 * j58) + (((j54 * j61) + (j55 * j60)) << 1);
        long j64 = (j61 * j58) + (j59 * j60);
        long j65 = (j60 * j61) << 1;
        long j66 = (jD5 - j42) + j46;
        int i21 = ((int) j66) & 67108863;
        long j67 = ((jD6 - jD2) - jD4) + (j66 >> 26);
        int i22 = ((int) j67) & 33554431;
        long j68 = ((((j67 >> 25) + j62) - j43) * 38) + j39;
        iArr3[0] = ((int) j68) & 67108863;
        long j69 = ((j63 - j44) * 38) + j40 + (j68 >> 26);
        iArr3[1] = ((int) j69) & 67108863;
        long j70 = ((j64 - j45) * 38) + j41 + (j69 >> 26);
        iArr3[2] = ((int) j70) & 33554431;
        long j71 = ((j65 - j46) * 38) + j42 + (j70 >> 25);
        iArr3[3] = ((int) j71) & 67108863;
        long jD7 = osp.d(jD4, 38L, jD2, j71 >> 26);
        iArr3[4] = ((int) jD7) & 33554431;
        long j72 = (j49 - j39) + j43 + (jD7 >> 25);
        iArr3[5] = ((int) j72) & 67108863;
        long j73 = (j53 - j40) + j44 + (j72 >> 26);
        iArr3[6] = ((int) j73) & 67108863;
        long j74 = (j56 - j41) + j45 + (j73 >> 26);
        iArr3[7] = ((int) j74) & 33554431;
        long j75 = (j74 >> 25) + i21;
        iArr3[8] = ((int) j75) & 67108863;
        iArr3[9] = i22 + ((int) (j75 >> 26));
    }

    public static boolean p(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        qp2.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
                if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static void p0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr2[7] & 4294967295L;
        long j9 = iArr[0] & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        int i = 1;
        for (int i2 = 8; i < i2; i2 = 8) {
            long j18 = iArr[i] & 4294967295L;
            long j19 = (j18 * j) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j19;
            int i3 = i + 1;
            long j20 = j5;
            long j21 = (j18 * j2) + (iArr3[i3] & 4294967295L) + (j19 >>> 32);
            iArr3[i3] = (int) j21;
            long j22 = (j18 * j3) + (iArr3[r7] & 4294967295L) + (j21 >>> 32);
            iArr3[i + 2] = (int) j22;
            long j23 = (j18 * j4) + (iArr3[r7] & 4294967295L) + (j22 >>> 32);
            iArr3[i + 3] = (int) j23;
            long j24 = (j18 * j20) + (iArr3[r7] & 4294967295L) + (j23 >>> 32);
            iArr3[i + 4] = (int) j24;
            long j25 = (j18 * j6) + (iArr3[r7] & 4294967295L) + (j24 >>> 32);
            iArr3[i + 5] = (int) j25;
            long j26 = (j18 * j7) + (iArr3[r7] & 4294967295L) + (j25 >>> 32);
            iArr3[i + 6] = (int) j26;
            long j27 = (j18 * j8) + (iArr3[r7] & 4294967295L) + (j26 >>> 32);
            iArr3[i + 7] = (int) j27;
            iArr3[i + 8] = (int) (j27 >>> 32);
            i = i3;
            j5 = j20;
        }
    }

    public static final void q(CoroutineContext coroutineContext, CancellationException cancellationException) {
        unb unbVar = coroutineContext.get(ulp.h);
        if (unbVar != null) {
            unbVar.k(cancellationException);
        }
    }

    public static int q0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr2[7] & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 8) {
            long j10 = iArr[i] & 4294967295L;
            int i2 = i;
            long j11 = (j10 * j) + (iArr3[i2] & 4294967295L);
            iArr3[i2] = (int) j11;
            int i3 = i2 + 1;
            long j12 = (j10 * j2) + (iArr3[i3] & 4294967295L) + (j11 >>> 32);
            iArr3[i3] = (int) j12;
            long j13 = (j10 * j3) + (iArr3[r4] & 4294967295L) + (j12 >>> 32);
            iArr3[i2 + 2] = (int) j13;
            long j14 = (j10 * j4) + (iArr3[r4] & 4294967295L) + (j13 >>> 32);
            iArr3[i2 + 3] = (int) j14;
            long j15 = (j10 * j5) + (iArr3[r4] & 4294967295L) + (j14 >>> 32);
            iArr3[i2 + 4] = (int) j15;
            long j16 = (j10 * j6) + (iArr3[r4] & 4294967295L) + (j15 >>> 32);
            iArr3[i2 + 5] = (int) j16;
            long j17 = (j10 * j7) + (iArr3[r4] & 4294967295L) + (j16 >>> 32);
            iArr3[i2 + 6] = (int) j17;
            long j18 = (j10 * j8) + (iArr3[r4] & 4294967295L) + (j17 >>> 32);
            iArr3[i2 + 7] = (int) j18;
            long j19 = (j18 >>> 32) + (iArr3[r4] & 4294967295L) + j9;
            iArr3[i2 + 8] = (int) j19;
            j9 = j19 >>> 32;
            i = i3;
        }
        return (int) j9;
    }

    public static void r(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr2[i3];
            iArr2[i3] = i4 ^ ((iArr[i2 + i3] ^ i4) & i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.rr3 r0(long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0g.r0(long, long, long):rr3");
    }

    public static void s(int i, int[] iArr) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static void s0(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        y0(i, iArr);
        y0(-i, iArr);
    }

    public static hv4 t(ih5 ih5Var) {
        sa5 sa5Var = (sa5) ((vt9) ih5Var).j(ua5.a);
        hv4 hv4Var = sa5Var.c0;
        if (hv4Var != null) {
            return hv4Var;
        }
        long jC = ua5.c(sa5Var, mv4.c);
        long j = u95.f;
        ta5 ta5Var = mv4.a;
        long jC2 = ua5.c(sa5Var, ta5Var);
        ta5 ta5Var2 = mv4.b;
        hv4 hv4Var2 = new hv4(jC, j, jC2, j, u95.b(ua5.c(sa5Var, ta5Var2), 0.38f), j, u95.b(ua5.c(sa5Var, ta5Var2), 0.38f), ua5.c(sa5Var, ta5Var), ua5.c(sa5Var, mv4.f), u95.b(ua5.c(sa5Var, ta5Var2), 0.38f), u95.b(ua5.c(sa5Var, mv4.e), 0.38f), u95.b(ua5.c(sa5Var, ta5Var2), 0.38f));
        sa5Var.c0 = hv4Var2;
        return hv4Var2;
    }

    public static void u(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static void v(int[] iArr, int[] iArr2, int i) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
        iArr2[i + 7] = iArr[7];
    }

    public static void v0(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void w(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static c8e w0(c8e c8eVar, o91 o91Var) {
        return c8eVar.d(new img(o91Var));
    }

    public static void x(long[] jArr, long[] jArr2, int i) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
    }

    public static poe x0(tlh tlhVar) throws NumberFormatException {
        int i = Integer.parseInt(tlhVar.M(Long.MAX_VALUE));
        long j = Long.parseLong(tlhVar.M(Long.MAX_VALUE));
        long j2 = Long.parseLong(tlhVar.M(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = Integer.parseInt(tlhVar.M(Long.MAX_VALUE));
        for (int i3 = 0; i3 < i2; i3++) {
            String strM = tlhVar.M(Long.MAX_VALUE);
            int iK = StringsKt.K(strM, ':', 0, 6);
            if (iK == -1) {
                bxl.d("Unexpected header: ".concat(strM));
                return null;
            }
            String string = StringsKt.l0(strM.substring(0, iK)).toString();
            String strSubstring = strM.substring(iK + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new poe(i, j, j2, new one(rbd.i(linkedHashMap)), null, null);
    }

    public static ContextThemeWrapper y(Context context, int i, boolean z) {
        if (i == 0) {
            i = Y(!z ? 2130969525 : 2130968638, context);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return Y(2130970333, contextThemeWrapper) != 0 ? new ContextThemeWrapper(contextThemeWrapper, W(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static void y0(int i, int[] iArr) {
        int i2 = iArr[9];
        long j = (((i2 >> 24) + i) * 19) + iArr[0];
        iArr[0] = ((int) j) & 67108863;
        long j2 = (j >> 26) + iArr[1];
        iArr[1] = ((int) j2) & 67108863;
        long j3 = (j2 >> 26) + iArr[2];
        iArr[2] = ((int) j3) & 33554431;
        long j4 = (j3 >> 25) + iArr[3];
        iArr[3] = ((int) j4) & 67108863;
        long j5 = (j4 >> 26) + iArr[4];
        iArr[4] = ((int) j5) & 33554431;
        long j6 = (j5 >> 25) + iArr[5];
        iArr[5] = ((int) j6) & 67108863;
        long j7 = (j6 >> 26) + iArr[6];
        iArr[6] = ((int) j7) & 67108863;
        long j8 = (j7 >> 26) + iArr[7];
        iArr[7] = ((int) j8) & 33554431;
        long j9 = (j8 >> 25) + iArr[8];
        iArr[8] = ((int) j9) & 67108863;
        iArr[9] = (16777215 & i2) + ((int) (j9 >> 26));
    }

    public static byte[] z(byte[] bArr) {
        if (bArr.length != 16) {
            qp2.o("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b2 = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (b2 | ((byte) ((bArr[i + 1] >> 7) & 1)));
            }
        }
        bArr2[15] = (byte) (bArr2[15] ^ ((byte) ((bArr[0] >> 7) & 135)));
        return bArr2;
    }

    public static void z0(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(context.getColor(g0(context) ? 2131101255 : 2131101254), PorterDuff.Mode.SRC_IN);
        }
    }

    public abstract File V();

    public abstract void t0(Throwable th);

    public abstract void u0(cyd cydVar);
}
