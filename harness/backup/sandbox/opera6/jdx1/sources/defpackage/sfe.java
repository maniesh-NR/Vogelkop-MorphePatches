package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Rational;
import android.view.inputmethod.EditorInfo;
import androidx.camera.core.ImageProcessingUtil;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.SortedSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class sfe {
    public static final ue5 a = new ue5(-832039807, new ef5((byte) 22), false);
    public static final ue5 b = new ue5(-840118148, new ef5((byte) 23), false);
    public static final ue5 c = new ue5(1912820602, new ef5((byte) 24), false);
    public static final ue5 d = new ue5(-1180442053, new ef5((byte) 25), false);
    public static final StackTraceElement[] e;
    public static final f69 f;
    public static final iip g;

    static {
        new ue5(1591330985, new gf5((byte) 8), false);
        new ue5(-1354202672, new gf5((byte) 9), false);
        new ue5(37979313, new gf5((byte) 10), false);
        new ue5(75469468, new gf5((byte) 7), false);
        e = new StackTraceElement[0];
        f = new f69(0);
        g = new iip((byte) 5);
    }

    public static int A(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >>> 32);
    }

    public static boolean A0(Iterable iterable, srg srgVar) {
        boolean z = false;
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            srgVar.getClass();
            while (it.hasNext()) {
                if (srgVar.apply(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        List list = (List) iterable;
        srgVar.getClass();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!srgVar.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        F0(list, srgVar, i2, i);
                    } catch (UnsupportedOperationException unused2) {
                        F0(list, srgVar, i2, i);
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static c8e B(c8e c8eVar, haj hajVar, u8i u8iVar, int i) {
        paj pajVar = u8iVar;
        if ((i & 2) != 0) {
            pajVar = kfo.i;
        }
        return c8eVar.d(new e03(0L, hajVar, pajVar, uup.d, 1));
    }

    public static void B0(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r9n.R(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            r9n.R(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        if (i2 <= i3) {
            i3 = i2;
            i2 = i3;
        }
        int length = charSequence.length();
        if (i3 < 0 || i2 > length) {
            C0(editorInfo, null, 0, 0);
            return;
        }
        int i4 = editorInfo.inputType & 4095;
        if (i4 == 129 || i4 == 225 || i4 == 18) {
            C0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            C0(editorInfo, charSequence, i3, i2);
            return;
        }
        int i5 = i2 - i3;
        int i6 = i5 > 1024 ? 0 : i5;
        int i7 = 2048 - i6;
        int iMin = Math.min(charSequence.length() - i2, i7 - Math.min(i3, (int) (i7 * 0.8d)));
        int iMin2 = Math.min(i3, i7 - iMin);
        int i8 = i3 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i8))) {
            i8++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i9 = iMin2 + i6;
        C0(editorInfo, i6 != i5 ? TextUtils.concat(charSequence.subSequence(i8, i8 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i8, i9 + iMin + i8), iMin2, i9);
    }

    public static final c8e C(c8e c8eVar, long j, paj pajVar) {
        return c8eVar.d(new e03(j, null, pajVar, uup.d, 2));
    }

    public static void C0(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static int D(int i, byte[] bArr) {
        return (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public static void D0(short s, byte[] bArr) {
        bArr[20] = (byte) (s >>> 8);
        bArr[21] = (byte) s;
    }

    public static final go3 E(boolean z, ih5 ih5Var) {
        if (z) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.W(893456408);
            unf unfVar = pof.a;
            go3 go3VarG = cqp.G(pof.a(vt9Var).a.j(), 2.0f);
            vt9Var.p(false);
            return go3VarG;
        }
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.W(893528111);
        unf unfVar2 = pof.a;
        go3 go3VarG2 = cqp.G(pof.a(vt9Var2).b.b(), 1.0f);
        vt9Var2.p(false);
        return go3VarG2;
    }

    public static final long F(boolean z, ih5 ih5Var) {
        if (!z) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.W(76717922);
            vt9Var.p(false);
            return u95.f;
        }
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.W(76647521);
        unf unfVar = pof.a;
        long jB = u95.b(pof.a(vt9Var2).a.j(), 0.12f);
        vt9Var2.p(false);
        return jB;
    }

    public static void F0(List list, srg srgVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (srgVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static final int G(float f2, float f3, float f4, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        return zed.b((f4 * (i - 1 <= 1 ? r3 : 1)) + (f3 * i3) + f2);
    }

    public static ArrayList G0(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b2 = byteBufferAsReadOnlyBuffer.get();
                int i = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b2 >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b3 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b3 & Byte.MAX_VALUE) << (i2 * 7);
                        if ((b3 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new n7f(i, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static byte[] H(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                t3p.w("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static void H0(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 10;
        int i2 = 0;
        int i3 = 4;
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
                long j10 = (j9 * j) + j8;
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
                long j21 = j17 & 4294967295L;
                long j22 = (iArr2[8] & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (j19 * j) + (jD2 & 4294967295L);
                int i9 = (int) j24;
                iArr2[4] = (i9 << 1) | (i8 >>> 31);
                long jD4 = osp.d(j19, j6, j24 >>> 32, j18);
                long jD5 = osp.d(j19, j9, jD4 >>> 32, j21);
                long jD6 = osp.d(j19, j12, jD5 >>> 32, j23);
                long j25 = j22 + (jD6 >>> 32);
                int i10 = (int) jD4;
                iArr2[5] = (i10 << 1) | (i9 >>> 31);
                int i11 = (int) jD5;
                iArr2[6] = (i11 << 1) | (i10 >>> 31);
                int i12 = (int) jD6;
                iArr2[7] = (i12 << 1) | (i11 >>> 31);
                int i13 = (int) j25;
                iArr2[8] = (i13 << 1) | (i12 >>> 31);
                iArr2[9] = ((iArr2[9] + ((int) (j25 >>> 32))) << 1) | (i13 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static qu4 I(orb orbVar) throws JSONException {
        boolean z = orbVar.a.getBoolean("thinkHarder");
        ArrayList arrayList = new ArrayList();
        vpb vpbVarB = orbVar.b("skills");
        int length = vpbVarB.a.length();
        for (int i = 0; i < length; i++) {
            orb orbVarC = vpbVarB.c(i);
            arrayList.add(new spj(orbVarC.e("name"), orbVarC.e("description"), orbVarC.e("prompt")));
        }
        ArrayList arrayList2 = new ArrayList();
        vpb vpbVarB2 = orbVar.b("webpageContext");
        int length2 = vpbVarB2.a.length();
        for (int i2 = 0; i2 < length2; i2++) {
            arrayList2.add(new vfb(vpbVarB2.c(i2).e("id")));
        }
        return new qu4(arrayList, arrayList2, z);
    }

    public static int I0(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >> 32);
    }

    public static void J(int[] iArr, int[] iArr2, int i) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
    }

    public static void J0(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        iArr2[4] = (int) (((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32));
    }

    public static Bitmap K(qya qyaVar) {
        int format = qyaVar.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(qyaVar.getWidth(), qyaVar.getHeight(), Bitmap.Config.ARGB_8888);
            qyaVar.A0()[0].u().rewind();
            ImageProcessingUtil.e(bitmapCreateBitmap, qyaVar.A0()[0].u(), qyaVar.A0()[0].R());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.c(qyaVar);
        }
        if (format != 256 && format != 4101) {
            j9h.l("Incorrect image format of the input image proxy: ", qyaVar.getFormat(), ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            return null;
        }
        if (!m0(qyaVar.getFormat())) {
            s49.h(qyaVar.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer byteBufferU = qyaVar.A0()[0].u();
        int iCapacity = byteBufferU.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferU.rewind();
        byteBufferU.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        yt7.k("Decode jpeg byte array failed");
        return null;
    }

    public static BigInteger K0(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                h0(i2, (4 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static Bundle L(Uri uri) {
        Bundle bundle = new Bundle();
        bundle.putString("com.opera.android.media.MEDIA_URI", uri.toString());
        return bundle;
    }

    public static String L0(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static uf9 M(int i, Context context) {
        float f2 = i;
        return new uf9(context, new sll(context, (Drawable) null, new ShapeDrawable(new RoundRectShape(new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, null, null))), i, 2130969783);
    }

    public static zlb M0(Iterable iterable, xq9 xq9Var) {
        iterable.getClass();
        return new zlb(iterable, xq9Var, (byte) 1);
    }

    public static boolean N(Iterable iterable, Iterable iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return ipe.s(iterable.iterator(), iterable2.iterator());
    }

    public static List N0(tq8 tq8Var, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < tq8Var.e.size() && i > 0; i2++) {
            tq8 tq8VarU = tq8Var.u(i2);
            if (tq8VarU.j()) {
                List listN0 = N0(tq8VarU, i);
                arrayList.addAll(listN0);
                i -= listN0.size();
            } else {
                arrayList.add(tq8VarU);
                i--;
            }
        }
        return arrayList;
    }

    public static boolean O(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static final void O0(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            d8b.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        d8b.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static sf9 P0(Context context, Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(intrinsicWidth);
        shapeDrawable.setIntrinsicHeight(intrinsicHeight);
        return new sf9(context, new sll(context, drawable, shapeDrawable), Paint.Style.STROKE, 2130969783);
    }

    public static zlb Q(Iterable iterable, srg srgVar) {
        iterable.getClass();
        return new zlb(iterable, srgVar, (byte) 0);
    }

    public static byte[] Q0(qya qyaVar, Rect rect, int i, int i2) throws uza {
        int i3;
        if (qyaVar.getFormat() != 35) {
            s49.h(qyaVar.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        pya pyaVar = qyaVar.A0()[0];
        pya pyaVar2 = qyaVar.A0()[1];
        int i4 = 2;
        pya pyaVar3 = qyaVar.A0()[2];
        ByteBuffer byteBufferU = pyaVar.u();
        ByteBuffer byteBufferU2 = pyaVar2.u();
        ByteBuffer byteBufferU3 = pyaVar3.u();
        byteBufferU.rewind();
        byteBufferU2.rewind();
        byteBufferU3.rewind();
        int iRemaining = byteBufferU.remaining();
        byte[] bArr = new byte[((qyaVar.getHeight() * qyaVar.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i5 = 0; i5 < qyaVar.getHeight(); i5++) {
            byteBufferU.get(bArr, width, qyaVar.getWidth());
            width += qyaVar.getWidth();
            byteBufferU.position(Math.min(iRemaining, pyaVar.R() + (byteBufferU.position() - qyaVar.getWidth())));
        }
        int height = qyaVar.getHeight() / 2;
        int width2 = qyaVar.getWidth() / 2;
        int iR = pyaVar3.R();
        int iR2 = pyaVar2.R();
        int iI0 = pyaVar3.i0();
        int iI02 = pyaVar2.i0();
        byte[] bArr2 = new byte[iR];
        byte[] bArr3 = new byte[iR2];
        int i6 = 0;
        while (true) {
            i3 = i4;
            if (i6 >= height) {
                break;
            }
            byteBufferU3.get(bArr2, 0, Math.min(iR, byteBufferU3.remaining()));
            byteBufferU2.get(bArr3, 0, Math.min(iR2, byteBufferU2.remaining()));
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < width2; i9++) {
                int i10 = width + 1;
                bArr[width] = bArr2[i7];
                width += 2;
                bArr[i10] = bArr3[i8];
                i7 += iI0;
                i8 += iI02;
            }
            i6++;
            i4 = i3;
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, qyaVar.getWidth(), qyaVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        lh8[] lh8VarArr = zg8.b;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        xg8 xg8Var = new xg8();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = xg8Var.a;
        xg8Var.c("Orientation", strValueOf, arrayList);
        xg8Var.c("XResolution", "72/1", arrayList);
        xg8Var.c("YResolution", "72/1", arrayList);
        xg8Var.c("ResolutionUnit", String.valueOf(i3), arrayList);
        xg8Var.c("YCbCrPositioning", String.valueOf(1), arrayList);
        xg8Var.c("Make", Build.MANUFACTURER, arrayList);
        xg8Var.c("Model", Build.MODEL, arrayList);
        if (qyaVar.h1() != null) {
            qyaVar.h1().a(xg8Var);
        }
        xg8Var.d(i2);
        xg8Var.c("ImageWidth", String.valueOf(qyaVar.getWidth()), arrayList);
        xg8Var.c("ImageLength", String.valueOf(qyaVar.getHeight()), arrayList);
        ArrayList list = Collections.list(new wg8(xg8Var));
        if (!((Map) list.get(1)).isEmpty()) {
            xg8Var.b("ExposureProgram", String.valueOf(0), list);
            xg8Var.b("ExifVersion", "0230", list);
            xg8Var.b("ComponentsConfiguration", zg8.e, list);
            xg8Var.b("MeteringMode", String.valueOf(0), list);
            xg8Var.b("LightSource", String.valueOf(0), list);
            xg8Var.b("FlashpixVersion", "0100", list);
            xg8Var.b("FocalPlaneResolutionUnit", String.valueOf(i3), list);
            xg8Var.b("FileSource", String.valueOf(3), list);
            xg8Var.b("SceneType", String.valueOf(1), list);
            xg8Var.b("CustomRendered", String.valueOf(0), list);
            xg8Var.b("SceneCaptureType", String.valueOf(0), list);
            xg8Var.b("Contrast", String.valueOf(0), list);
            xg8Var.b("Saturation", String.valueOf(0), list);
            xg8Var.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i3)).isEmpty()) {
            xg8Var.b("GPSVersionID", "2300", list);
            xg8Var.b("GPSSpeedRef", "K", list);
            xg8Var.b("GPSTrackRef", "T", list);
            xg8Var.b("GPSImgDirectionRef", "T", list);
            xg8Var.b("GPSDestBearingRef", "T", list);
            xg8Var.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, qyaVar.getWidth(), qyaVar.getHeight()) : rect, i, new kh8(byteArrayOutputStream, new zg8(list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new uza("YuvImage failed to encode jpeg.");
    }

    public static zlb R(Iterable iterable, Class cls) {
        iterable.getClass();
        return new zlb(iterable, new wrg(cls), (byte) 0);
    }

    public static String S(String str) {
        return str.equals("no") ? "nb" : str.equals("iw") ? "he" : str.equals("in") ? "id" : str;
    }

    public static int[] T(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            hai.d();
            return null;
        }
        int[] iArr = new int[5];
        for (int i = 0; i < 5; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static z77 U(Context context) {
        return (z77) context.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
    }

    public static int V(int[] iArr) {
        return iArr[0] & 1;
    }

    public static fr W(hq8 hq8Var) {
        int i;
        tq8 tq8Var;
        tq8 tq8Var2 = hq8Var.b;
        if (tq8Var2 == null) {
            i = -1;
        } else if (tq8Var2.y() || (tq8Var = ((hq8) tq8Var2).b) == null) {
            i = hq8Var.b != tq8Var2 ? -1 : hq8Var.c;
            i = -1;
        } else {
            int i2 = tq8Var != null ? ((hq8) tq8Var2).c : -1;
            i = hq8Var.b == tq8Var2 ? hq8Var.c : -1;
            i = i2;
        }
        return new fr(i, i, (byte) 8);
    }

    public static ArrayList X(tq8 tq8Var) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < tq8Var.e.size(); i++) {
            tq8 tq8VarU = tq8Var.u(i);
            if (tq8VarU.j()) {
                arrayList.addAll(X(tq8VarU));
            } else {
                arrayList.add(tq8VarU);
            }
        }
        return arrayList;
    }

    public static ArrayList Y(tq8 tq8Var, hq8... hq8VarArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < tq8Var.e.size(); i++) {
            tq8 tq8VarU = tq8Var.u(i);
            if (!Arrays.stream(hq8VarArr).anyMatch(new zx1(tq8VarU, (byte) 10))) {
                if (tq8VarU.j()) {
                    arrayList.addAll(Y(tq8VarU, hq8VarArr));
                } else {
                    arrayList.add(tq8VarU);
                }
            }
        }
        return arrayList;
    }

    public static Object Z(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static final void a(xtl xtlVar, ue5 ue5Var, ztl ztlVar, c8e c8eVar, ue5 ue5Var2, ih5 ih5Var, int i) {
        xtl xtlVar2;
        int i2;
        afe afeVar;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1221877520);
        if ((i & 6) == 0) {
            xtlVar2 = xtlVar;
            i2 = (vt9Var.f(xtlVar2) ? 4 : 2) | i;
        } else {
            xtlVar2 = xtlVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & NotificationCompat.FLAG_GROUP_SUMMARY) == 0 ? vt9Var.f(ztlVar) : vt9Var.h(ztlVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.h(null) ? 16384 : 8192;
        }
        boolean z = false;
        if ((i & 196608) == 0) {
            i2 |= vt9Var.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= vt9Var.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= vt9Var.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= vt9Var.h(ue5Var2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (vt9Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = rm5.p(h.a, vt9Var);
                vt9Var.g0(objK);
            }
            nx5 nx5Var = (nx5) objK;
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = hyg.k(Boolean.FALSE);
                vt9Var.g0(objK2);
            }
            afe afeVar2 = (afe) objK2;
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, z7e.b);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            if (ztlVar.b()) {
                vt9Var.W(-1891243071);
                w(xtlVar2, ztlVar, nx5Var, false, afeVar2, ue5Var, vt9Var, ((i3 << 15) & 3670016) | (i3 & 14) | 196608 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896));
                afeVar = afeVar2;
                vt9Var = vt9Var;
                vt9Var.p(false);
            } else {
                afeVar = afeVar2;
                vt9Var.W(-1890863476);
                vt9Var.p(false);
            }
            x(ztlVar, afeVar, c8eVar, ue5Var2, vt9Var, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | ((i3 << 3) & 57344) | ((i3 >> 9) & 458752));
            vt9Var.p(true);
            if ((i3 & 896) == 256 || ((i3 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 && vt9Var.h(ztlVar))) {
                z = true;
            }
            Object objK3 = vt9Var.K();
            if (z || objK3 == zpaVar) {
                objK3 = new t02(ztlVar, (byte) 24);
                vt9Var.g0(objK3);
            }
            rm5.b(ztlVar, (Function1) objK3, vt9Var);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lc1(xtlVar, ue5Var, ztlVar, c8eVar, ue5Var2, i, (byte) 1);
        }
    }

    public static Icon a0(Context context, r3g r3gVar) {
        Bitmap bitmapA;
        return (!c.q(r3gVar.o(), "android", false) || (bitmapA = rab.a(context, r3gVar.o())) == null) ? Icon.createWithResource(context, 2131232199) : Icon.createWithBitmap(bitmapA).setTintMode(PorterDuff.Mode.DST);
    }

    public static final void b(String str, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1720961738);
        int i2 = (vt9Var.f(str) ? 4 : 2) | i;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            sd3 sd3Var = rbe.l;
            c8e c8eVarB0 = a26.b0(z7e.b, 10.0f, 0.0f, 0.0f, 0.0f, 14);
            o9i o9iVarA = m9i.a(b72.a, sd3Var, vt9Var, 48);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarB0);
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
            ikl iklVar = ((wam) vt9Var.j(abm.a)).j;
            unf unfVar = pof.a;
            ijl.b("•  " + str, null, pof.a(vt9Var).a.w(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar, vt9Var, 0, 0, 131066);
            vt9Var = vt9Var;
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lx0(str, i, (byte) 10);
        }
    }

    public static String b0(Locale locale) {
        return S(locale.getLanguage().toLowerCase(Locale.US));
    }

    public static final void c(u8d u8dVar, final lyi lyiVar, Integer num, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, Function0 function05, ih5 ih5Var, int i) {
        int i2;
        Function0 function06;
        Function0 function07;
        znh znhVarR;
        k8d k8dVar;
        byte b2;
        byte b3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-312410927);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(u8dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.d(lyiVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.f(num) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            function06 = function0;
            i2 |= vt9Var.h(function06) ? 2048 : 1024;
        } else {
            function06 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.h(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function07 = function03;
            i2 |= vt9Var.h(function07) ? 131072 : 65536;
        } else {
            function07 = function03;
        }
        if ((1572864 & i) == 0) {
            i2 |= vt9Var.h(function04) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= vt9Var.h(function05) ? 8388608 : 4194304;
        }
        if (vt9Var.N(i2 & 1, (4793491 & i2) != 4793490)) {
            byte b4 = 19;
            z7e z7eVar = z7e.b;
            if (num != null) {
                vt9Var.W(160527507);
                pof.b.getClass();
                ocp.c(vt9Var, mpj.c(z7eVar, 16.0f));
                p37.d(mpj.a, new x62(8.0f, true, new t40(b4)), new x62(8.0f, true, new t40(b4)), null, 0, 0, gyg.P(-2138726831, new b57((Object) function05, (Object) function02, (byte) 11), vt9Var), vt9Var, 1572870, 56);
                vt9Var.p(false);
                znhVarR = vt9Var.r();
                if (znhVarR == null) {
                    return;
                } else {
                    k8dVar = new k8d(u8dVar, lyiVar, num, function06, function02, function07, function04, function05, i, (byte) 1);
                }
            } else {
                boolean z = false;
                vt9Var.W(161202129);
                vt9Var.p(false);
                boolean z2 = (u8dVar == null || u8dVar.b || (b3 = u8dVar.a) == 0 || b3 == 3 || !u8dVar.j) ? false : true;
                final boolean z3 = u8dVar != null && u8dVar.a == 2;
                if (u8dVar != null && !u8dVar.b && (((b2 = u8dVar.a) == 0 || b2 == 3) && u8dVar.j)) {
                    z = true;
                }
                if (z2 || z3 || z) {
                    pof.b.getClass();
                    ocp.c(vt9Var, mpj.c(z7eVar, 16.0f));
                    i39 i39Var = mpj.a;
                    x62 x62Var = new x62(8.0f, true, new t40(b4));
                    x62 x62Var2 = new x62(8.0f, true, new t40(b4));
                    final boolean z4 = z;
                    final boolean z5 = z2;
                    ue5 ue5VarP = gyg.P(980685132, new cr9() { // from class: j8d
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            ih5 ih5Var2 = (ih5) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            vt9 vt9Var2 = (vt9) ih5Var2;
                            if (vt9Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                if (z4) {
                                    vt9Var2.W(1223255393);
                                    sfe.m(2132020923, 0, vt9Var2, function04);
                                    vt9Var2.p(false);
                                } else {
                                    vt9Var2.W(1223398582);
                                    vt9Var2.p(false);
                                }
                                if (z5) {
                                    vt9Var2.W(1223447562);
                                    scd.f(function0, mzg.q(vt9Var2, 2132018208), null, false, false, smf.b, null, null, null, null, null, null, null, null, vt9Var2, 196608, 0, 16348);
                                    vt9Var2.p(false);
                                } else {
                                    vt9Var2.W(1223653526);
                                    vt9Var2.p(false);
                                }
                                if (z3) {
                                    vt9Var2.W(1223692276);
                                    Pair pair = lyiVar == lyi.b ? new Pair(2132021715, function02) : new Pair(2132021720, function03);
                                    scd.f((Function0) pair.b, mzg.q(vt9Var2, ((Number) pair.a).intValue()), null, false, false, smf.b, null, null, null, null, null, null, null, null, vt9Var2, 196608, 0, 16348);
                                    vt9Var2.p(false);
                                } else {
                                    vt9Var2.W(1224124726);
                                    vt9Var2.p(false);
                                }
                            } else {
                                vt9Var2.Q();
                            }
                            return Unit.a;
                        }
                    }, vt9Var);
                    vt9Var = vt9Var;
                    p37.d(i39Var, x62Var, x62Var2, null, 0, 0, ue5VarP, vt9Var, 1572870, 56);
                } else {
                    znhVarR = vt9Var.r();
                    if (znhVarR == null) {
                        return;
                    } else {
                        k8dVar = new k8d(u8dVar, lyiVar, num, function0, function02, function03, function04, function05, i, (byte) 2);
                    }
                }
            }
            znhVarR.d = k8dVar;
        }
        vt9Var.Q();
        znhVarR = vt9Var.r();
        if (znhVarR != null) {
            k8dVar = new k8d(u8dVar, lyiVar, num, function0, function02, function03, function04, function05, i, (byte) 0);
            znhVarR.d = k8dVar;
        }
    }

    public static Object c0(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return am2.l(1, list);
            }
            t3p.y();
            return null;
        }
        if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final cd5 d(Object obj) {
        cd5 cd5Var = new cd5();
        cd5Var.j0(obj);
        return cd5Var;
    }

    public static Uri d0(vjd vjdVar) {
        String string;
        Bundle bundle = vjdVar.I;
        if (bundle == null || (string = bundle.getString("com.opera.android.media.MEDIA_URI", null)) == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public static final void e(final int i, final Date date, final float f2, ih5 ih5Var, final int i2) {
        int i3;
        Date date2;
        float f3;
        int i4;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1522660497);
        int i5 = (vt9Var.d(i) ? 4 : 2) | i2 | (vt9Var.h(date) ? 32 : 16) | (vt9Var.c(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (!vt9Var.N(i5 & 1, (i5 & 147) != 146)) {
            i3 = i;
            date2 = date;
            f3 = f2;
            i4 = i2;
            vt9Var.Q();
        } else {
            if (date == null) {
                znh znhVarR = vt9Var.r();
                if (znhVarR != null) {
                    final byte b2 = 0;
                    znhVarR.d = new Function2(i, date, f2, i2, b2) { // from class: p8d
                        public final /* synthetic */ byte a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ Date c;
                        public final /* synthetic */ float d;

                        {
                            this.a = b2;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.a;
                            ih5 ih5Var2 = (ih5) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    sfe.e(this.b, this.c, this.d, ih5Var2, aoh.m(1));
                                    break;
                                default:
                                    sfe.e(this.b, this.c, this.d, ih5Var2, aoh.m(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            i3 = i;
            date2 = date;
            f3 = f2;
            i4 = i2;
            ocp.c(vt9Var, mpj.c(z7e.b, f3));
            Context context = (Context) vt9Var.j(j41.b);
            boolean zF = vt9Var.f(date2);
            Object objK = vt9Var.K();
            if (zF || objK == hh5.a) {
                objK = DateFormat.getLongDateFormat(context).format(date2);
                vt9Var.g0(objK);
            }
            h(i3, (String) objK, vt9Var, i5 & 14);
        }
        znh znhVarR2 = vt9Var.r();
        if (znhVarR2 != null) {
            final int i6 = i4;
            final float f4 = f3;
            final Date date3 = date2;
            final int i7 = i3;
            final byte b3 = 1;
            znhVarR2.d = new Function2(i7, date3, f4, i6, b3) { // from class: p8d
                public final /* synthetic */ byte a;
                public final /* synthetic */ int b;
                public final /* synthetic */ Date c;
                public final /* synthetic */ float d;

                {
                    this.a = b3;
                }

                public final Object invoke(Object obj, Object obj2) {
                    byte b32 = this.a;
                    ih5 ih5Var2 = (ih5) obj;
                    ((Integer) obj2).getClass();
                    switch (b32) {
                        case 0:
                            sfe.e(this.b, this.c, this.d, ih5Var2, aoh.m(1));
                            break;
                        default:
                            sfe.e(this.b, this.c, this.d, ih5Var2, aoh.m(1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static Rational e0(int i, Rational rational) {
        return (i == 90 || i == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static final void f(int i, ih5 ih5Var, c8e c8eVar, Function0 function0, boolean z) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-39634683);
        int i2 = (vt9Var.g(z) ? 4 : 2) | i | (vt9Var.h(function0) ? 32 : 16) | (vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            pof.b.getClass();
            ocp.c(vt9Var, mpj.c(z7e.b, 16.0f));
            u(E(z, vt9Var), F(z, vt9Var), c8eVar, function0, ui6.j, vt9Var, (i2 & 896) | 24576 | ((i2 << 6) & 7168));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new q01((byte) 2, i, (Object) function0, (Object) c8eVar, z);
        }
    }

    public static boolean f0(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.Integer r6, defpackage.u8d r7, kotlin.jvm.functions.Function0 r8, defpackage.ih5 r9, int r10) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfe.g(java.lang.Integer, u8d, kotlin.jvm.functions.Function0, ih5, int):void");
    }

    public static boolean g0(Context context) {
        if (Build.VERSION.SDK_INT >= 36) {
            return false;
        }
        return Application.class.equals(context.getApplicationContext().getClass());
    }

    public static final void h(int i, String str, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        String str2 = str;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(152668779);
        int i3 = i2 | (vt9Var2.d(i) ? 4 : 2) | (vt9Var2.f(str2) ? 32 : 16);
        if (vt9Var2.N(i3 & 1, (i3 & 19) != 18)) {
            String strQ = mzg.q(vt9Var2, i);
            hp7 hp7Var = abm.a;
            ikl iklVar = ((wam) vt9Var2.j(hp7Var)).j;
            unf unfVar = pof.a;
            ijl.b(strQ, null, pof.a(vt9Var2).a.f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar, vt9Var2, 0, 0, 131066);
            vt9Var = vt9Var2;
            str2 = str;
            ijl.b(str2, null, pof.a(vt9Var2).a.w(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var)).k, vt9Var, (i3 >> 3) & 14, 0, 131066);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new r8d(i, str2, i2);
        }
    }

    public static void h0(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static final void i(vtb vtbVar, c8e c8eVar, u5c u5cVar, m5c m5cVar, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1055276397);
        int i2 = (vt9Var.h(vtbVar) ? 4 : 2) | i | (vt9Var.f(c8eVar) ? 32 : 16) | (vt9Var.f(u5cVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.f(m5cVar) ? 2048 : 1024);
        if (vt9Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            mkh.b(gyg.P(-933153643, new l5c(u5cVar, c8eVar, m5cVar, hyg.o(vtbVar, vt9Var), (byte) 0), vt9Var), vt9Var, 6);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new px0(vtbVar, c8eVar, u5cVar, m5cVar, i, (byte) 6);
        }
    }

    public static byte[] i0(int i) {
        byte[] bArr = new byte[4];
        h0(i, 0, bArr);
        return bArr;
    }

    public static final void j(Function0 function0, c8e c8eVar, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1864131423);
        if ((i & 6) == 0) {
            i2 = i | (vt9Var.h(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            smf smfVar = smf.c;
            String strQ = mzg.q(vt9Var, 2132019679);
            c8e c8eVarD = c8eVar.d(mpj.a);
            hyf hyfVarH0 = phj.h0(vt9Var, 2131231895);
            pof.c.getClass();
            scd.f(function0, strQ, c8eVarD, false, false, smfVar, null, null, null, null, hyfVarH0, new u95(u95.g), mpj.h(z7e.b, 18.0f), null, vt9Var, (i2 & 14) | 196608, 56, 9176);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new uf1(function0, c8eVar, i, (byte) 8);
        }
    }

    public static void j0(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static final void k(final v8d v8dVar, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function0 function06, final Function0 function07, final Function0 function08, c8e c8eVar, ih5 ih5Var, final int i) {
        Function0 function09;
        Function0 function010;
        Function0 function011;
        Function0 function012;
        Function0 function013;
        vt9 vt9Var;
        final c8e c8eVar2;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1808448706);
        int i2 = (vt9Var2.f(v8dVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= vt9Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var2.h(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var2.h(function03) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function09 = function04;
            i2 |= vt9Var2.h(function09) ? 16384 : 8192;
        } else {
            function09 = function04;
        }
        if ((196608 & i) == 0) {
            function010 = function05;
            i2 |= vt9Var2.h(function010) ? 131072 : 65536;
        } else {
            function010 = function05;
        }
        if ((1572864 & i) == 0) {
            function011 = function06;
            i2 |= vt9Var2.h(function011) ? 1048576 : 524288;
        } else {
            function011 = function06;
        }
        if ((12582912 & i) == 0) {
            function012 = function07;
            i2 |= vt9Var2.h(function012) ? 8388608 : 4194304;
        } else {
            function012 = function07;
        }
        if ((100663296 & i) == 0) {
            function013 = function08;
            i2 |= vt9Var2.h(function013) ? 67108864 : 33554432;
        } else {
            function013 = function08;
        }
        int i3 = i2 | 805306368;
        if (vt9Var2.N(i3 & 1, (306783379 & i3) != 306783378)) {
            final u8d u8dVar = v8dVar.a;
            final lyi lyiVar = v8dVar.b;
            final Integer num = v8dVar.c;
            rul rulVarA = uof.a(vt9Var2);
            ble bleVarA = rulVarA.a();
            z7e z7eVar = z7e.b;
            final Function0 function014 = function09;
            final Function0 function015 = function010;
            final Function0 function016 = function011;
            final Function0 function017 = function012;
            final Function0 function018 = function013;
            vt9Var = vt9Var2;
            w1h.a(alo.c0(z7eVar, bleVarA, (s9i) null), gyg.P(480145658, new g9(function0, rulVarA, function02), vt9Var2), null, null, null, 0, 0L, 0L, null, gyg.P(-1862654193, new cr9() { // from class: q8d
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                    xvf xvfVar = (xvf) obj;
                    ih5 ih5Var2 = (ih5) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((vt9) ih5Var2).f(xvfVar) ? 4 : 2;
                    }
                    vt9 vt9Var3 = (vt9) ih5Var2;
                    if (vt9Var3.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        sfe.q(u8dVar, lyiVar, num, function03, function014, function015, function016, function017, function018, a26.W(mpj.b, xvfVar), vt9Var3, 0);
                    } else {
                        vt9Var3.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var2), vt9Var, 805306416, 508);
            c8eVar2 = z7eVar;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: s8d
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sfe.k(v8dVar, function0, function02, function03, function04, function05, function06, function07, function08, c8eVar2, (ih5) obj, aoh.m(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static boolean k0(Context context) {
        if (((UserManager) context.getSystemService("user")) == null) {
            return false;
        }
        return !r1.isUserUnlocked();
    }

    public static final void l(u8d u8dVar, ih5 ih5Var, int i) {
        int i2;
        float f2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1136328283);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(u8dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 0;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            if ((u8dVar != null ? u8dVar.f : null) == null) {
                pof.b.getClass();
                f2 = 20.0f;
            } else {
                pof.b.getClass();
                f2 = 8.0f;
            }
            e(2132019677, u8dVar != null ? u8dVar.f : null, 20.0f, vt9Var, 0);
            e(2132019671, u8dVar != null ? u8dVar.g : null, f2, vt9Var, 0);
            if (u8dVar == null || !u8dVar.h) {
                vt9Var.W(577166621);
                vt9Var.p(false);
            } else {
                vt9Var.W(576926371);
                ocp.c(vt9Var, mpj.c(z7e.b, 16.0f));
                h(2132019678, mzg.q(vt9Var, 2132019228), vt9Var, 0);
                vt9Var.p(false);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new l8d(u8dVar, i, b2);
        }
    }

    public static final void m(int i, int i2, ih5 ih5Var, Function0 function0) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-76370748);
        int i3 = (vt9Var2.h(function0) ? 4 : 2) | i2 | (vt9Var2.d(i) ? 32 : 16);
        byte b2 = 1;
        if (vt9Var2.N(i3 & 1, (i3 & 19) != 18)) {
            unf unfVar = pof.a;
            ez3 ez3Var = new ez3(Arrays.asList(new u95(pof.a(vt9Var2).c.e()), new u95(pof.a(vt9Var2).c.s())), b2);
            zvf zvfVar = b24.a;
            vt9Var = vt9Var2;
            scd.f(function0, mzg.q(vt9Var2, i), null, false, false, null, null, b24.b(u95.f, pof.a(vt9Var2).c.c(), 0L, 0L, vt9Var2, 12), null, ez3Var, null, null, null, null, vt9Var, i3 & 14, 0, 15740);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new w6d(function0, i, i2);
        }
    }

    public static boolean m0(int i) {
        return i == 256 || i == 4101;
    }

    public static final void n(u8d u8dVar, ih5 ih5Var, int i) {
        String string;
        boolean z;
        boolean z2;
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1431313049);
        int i3 = i | (vt9Var.f(u8dVar) ? 4 : 2);
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) vt9Var.j(j41.b);
            int i4 = 2132021672;
            String string2 = null;
            if (u8dVar != null) {
                double d2 = u8dVar.c;
                String str = u8dVar.e;
                int iA = u8dVar.d.a();
                if (iA == 0) {
                    i2 = 2132021669;
                } else if (iA == 1) {
                    i2 = 2132021671;
                } else if (iA == 2) {
                    i2 = 2132021679;
                } else if (iA != 3) {
                    string = z7h.k(str, d2);
                } else {
                    i2 = 2132021672;
                }
                string = context.getString(i2, z7h.k(str, d2));
            } else {
                string = null;
            }
            if (u8dVar != null) {
                o9g o9gVar = u8dVar.d;
                double dMax = u8dVar.c / Math.max((o9gVar.a * 12) + o9gVar.b, 1);
                int iA2 = o9gVar.a();
                if (iA2 == 0) {
                    i4 = 2132021678;
                } else if (iA2 == 1) {
                    i4 = 2132021675;
                } else if (iA2 == 2) {
                    i4 = 2132021677;
                } else if (iA2 == 3) {
                    i4 = 2132021676;
                }
                string2 = context.getString(i4, z7h.k(u8dVar.e, dMax));
            }
            String str2 = string2;
            i39 i39Var = mpj.a;
            unf unfVar = pof.a;
            pof.b.getClass();
            c8e c8eVarA0 = a26.a0(i39Var, 16.0f, 8.0f, 12.0f, 12.0f);
            db5 db5VarA = cb5.a(b72.c, rbe.n, vt9Var, 0);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarA0);
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
            if (string != null) {
                vt9Var.W(828906380);
                z2 = true;
                z = false;
                ijl.b(string, null, pof.a(vt9Var).a.f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).k, vt9Var, 0, 0, 131066);
                vt9Var = vt9Var;
                vt9Var.p(false);
            } else {
                z = false;
                z2 = true;
                vt9Var.W(829076787);
                vt9Var.p(false);
            }
            if (str2 != null) {
                vt9Var.W(829125922);
                vt9 vt9Var2 = vt9Var;
                ijl.b(str2, null, pof.a(vt9Var).a.w(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).k, vt9Var2, 0, 0, 131066);
                vt9Var = vt9Var2;
                vt9Var.p(z);
            } else {
                vt9Var.W(829305939);
                vt9Var.p(z);
            }
            vt9Var.p(z2);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new a7b(u8dVar, i, (byte) 10);
        }
    }

    public static boolean n0(int[] iArr) {
        if (iArr[0] == 1) {
            for (int i = 1; i < 5; i++) {
                if (iArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void o(Integer num, ih5 ih5Var, int i) throws Resources.NotFoundException {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-2003658433);
        if ((i & 6) == 0) {
            i2 = i | (vt9Var.f(num) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            vt9Var.Q();
        } else if (num != null) {
            vt9Var.W(467209133);
            String quantityString = ((Resources) vt9Var.j(j41.c)).getQuantityString(2131886134, num.intValue(), Arrays.copyOf(new Object[]{num}, 1));
            i39 i39Var = mpj.a;
            o9i o9iVarA = m9i.a(b72.f, rbe.l, vt9Var, 54);
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
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            String strQ = mzg.q(vt9Var, 2132022237);
            hp7 hp7Var = abm.a;
            ikl iklVar = ((wam) vt9Var.j(hp7Var)).i;
            unf unfVar = pof.a;
            ijl.b(strQ, null, pof.a(vt9Var).a.j(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar, vt9Var, 0, 0, 131066);
            ikl iklVar2 = ((wam) vt9Var.j(hp7Var)).m;
            vec vecVar = new vec(Arrays.asList(new u95(pof.a(vt9Var).c.e()), new u95(pof.a(vt9Var).c.s())), null, 0L, 9187343241974906880L, 0);
            ikl iklVar3 = ikl.d;
            float fB = iklVar2.a.a.b();
            rwj rwjVar = iklVar2.a;
            long j = rwjVar.b;
            ki9 ki9Var = rwjVar.c;
            gi9 gi9Var = rwjVar.d;
            hi9 hi9Var = rwjVar.e;
            lh9 lh9Var = rwjVar.f;
            String str = rwjVar.g;
            long j2 = rwjVar.h;
            ua3 ua3Var = rwjVar.i;
            vil vilVar = rwjVar.j;
            awc awcVar = rwjVar.k;
            long j3 = rwjVar.l;
            bgl bglVar = rwjVar.m;
            jaj jajVar = rwjVar.n;
            nk7 nk7Var = rwjVar.p;
            yzf yzfVar = iklVar2.b;
            int i3 = yzfVar.a;
            int i4 = yzfVar.b;
            long j4 = yzfVar.c;
            wil wilVar = yzfVar.d;
            dhg dhgVar = iklVar2.c;
            ijl.b(quantityString, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, new ikl(new rwj(new fz3(vecVar, fB), j, ki9Var, gi9Var, hi9Var, lh9Var, str, j2, ua3Var, vilVar, awcVar, j3, bglVar, jajVar, dhgVar != null ? dhgVar.a : null, nk7Var), new yzf(i3, i4, j4, wilVar, dhgVar != null ? dhgVar.b : null, yzfVar.f, yzfVar.g, yzfVar.h, yzfVar.i), dhgVar), vt9Var, 0, 0, 131070);
            vt9Var = vt9Var;
            vt9Var.p(true);
            vt9Var.p(false);
        } else {
            vt9Var.W(468266636);
            String strQ2 = mzg.q(vt9Var, 2132022237);
            ikl iklVar4 = ((wam) vt9Var.j(abm.a)).i;
            unf unfVar2 = pof.a;
            ijl.b(strQ2, null, pof.a(vt9Var).a.j(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar4, vt9Var, 0, 0, 131066);
            vt9Var = vt9Var;
            vt9Var.p(false);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new m23((Object) num, i, (byte) 2);
        }
    }

    public static boolean o0(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final void p(final u8d u8dVar, final boolean z, final boolean z2, final Function0 function0, ih5 ih5Var, final int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1769039234);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(u8dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.g(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.h(function0) ? 2048 : 1024;
        }
        if (vt9Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            tfd tfdVarC = nr3.c(rbe.b, false);
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
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            u(E(z2, vt9Var), F(z2, vt9Var), y9m.o(z7eVar, (u8dVar == null || !u8dVar.i) ? 1.0f : 0.13f), function0, gyg.P(254438374, new Function2() { // from class: m8d
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v1, types: [ih5, vt9] */
                /* JADX WARN: Type inference failed for: r12v10 */
                /* JADX WARN: Type inference failed for: r12v11 */
                /* JADX WARN: Type inference failed for: r12v5, types: [int] */
                /* JADX WARN: Type inference failed for: r2v7 */
                /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r2v9 */
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    ?? r12;
                    ?? r2;
                    long jB;
                    float f2;
                    ih5 ih5Var2 = (ih5) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ?? r11 = (vt9) ih5Var2;
                    if (r11.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        rd3 rd3Var = rbe.n;
                        v62 v62Var = b72.c;
                        db5 db5VarA = cb5.a(v62Var, rd3Var, r11, 0);
                        int iHashCode2 = Long.hashCode(r11.T);
                        oag oagVarL2 = r11.l();
                        z7e z7eVar2 = z7e.b;
                        c8e c8eVarP2 = qyn.P(r11, z7eVar2);
                        bh5.To.getClass();
                        r11.a0();
                        boolean z4 = r11.S;
                        fza fzaVar = m3c.S;
                        if (z4) {
                            r11.k(fzaVar);
                        } else {
                            r11.j0();
                        }
                        ah5 ah5Var = ujp.f;
                        y4h.o((ih5) r11, db5VarA, ah5Var);
                        ah5 ah5Var2 = ujp.e;
                        y4h.o((ih5) r11, oagVarL2, ah5Var2);
                        Integer numValueOf = Integer.valueOf(iHashCode2);
                        ah5 ah5Var3 = ujp.g;
                        y4h.o((ih5) r11, numValueOf, ah5Var3);
                        y4h.m((ih5) r11);
                        ah5 ah5Var4 = ujp.d;
                        y4h.o((ih5) r11, c8eVarP2, ah5Var4);
                        unf unfVar = pof.a;
                        pof.b.getClass();
                        c8e c8eVarB0 = a26.b0(z7eVar2, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                        o9i o9iVarA = m9i.a(b72.a, rbe.l, r11, 48);
                        int iHashCode3 = Long.hashCode(r11.T);
                        oag oagVarL3 = r11.l();
                        c8e c8eVarP3 = qyn.P(r11, c8eVarB0);
                        r11.a0();
                        if (r11.S) {
                            r11.k(fzaVar);
                        } else {
                            r11.j0();
                        }
                        y4h.o((ih5) r11, o9iVarA, ah5Var);
                        y4h.o((ih5) r11, oagVarL3, ah5Var2);
                        u35.j(iHashCode3, (vt9) r11, ah5Var3, (vt9) r11);
                        y4h.o((ih5) r11, c8eVarP3, ah5Var4);
                        ijl.b(mzg.q((ih5) r11, 2132022254), null, pof.a(r11).a.f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) r11.j(abm.a)).g, r11, 0, 0, 131066);
                        boolean z5 = z;
                        u8d u8dVar2 = u8dVar;
                        if (z5) {
                            r11.W(-1714490147);
                            ocp.c(r11, mpj.h(z7eVar2, 8.0f));
                            sfe.t(mzg.q((ih5) r11, 2132019148), false, r11, 0, 2);
                            r11.p(false);
                            r12 = 0;
                        } else {
                            boolean z6 = false;
                            r11.W(-1714306503);
                            if (u8dVar2 == null) {
                                r11.W(-1714277519);
                            } else {
                                r11.W(-1302225264);
                                r11.W(1217010927);
                                byte b2 = u8dVar2.a;
                                Integer num = b2 != 0 ? b2 != 1 ? b2 != 2 ? b2 != 3 ? null : 2132019061 : 2132022252 : 2132019232 : 2132019672;
                                strQ = num != null ? mzg.q((ih5) r11, num.intValue()) : null;
                                z6 = false;
                                r11.p(false);
                            }
                            r11.p(z6);
                            if (strQ != null) {
                                r11.W(-1714200514);
                                ocp.c(r11, mpj.h(z7eVar2, 8.0f));
                                byte b3 = u8dVar2.a;
                                z3 = false;
                                sfe.t(strQ, b3 == 1 || b3 == 0 || b3 == 3, r11, 0, 0);
                                r11.p(false);
                            } else {
                                z3 = false;
                                r11.W(-1713735390);
                                r11.p(false);
                            }
                            r11.p(z3);
                            r12 = z3;
                        }
                        r11.p(true);
                        ocp.c(r11, mpj.c(z7eVar2, 4.0f));
                        c8e c8eVarZ = a26.Z(z7eVar2, 16.0f, 0.0f, 2);
                        db5 db5VarA2 = cb5.a(v62Var, rd3Var, r11, r12);
                        int iHashCode4 = Long.hashCode(r11.T);
                        oag oagVarL4 = r11.l();
                        c8e c8eVarP4 = qyn.P(r11, c8eVarZ);
                        r11.a0();
                        if (r11.S) {
                            r11.k(fzaVar);
                        } else {
                            r11.j0();
                        }
                        y4h.o((ih5) r11, db5VarA2, ah5Var);
                        y4h.o((ih5) r11, oagVarL4, ah5Var2);
                        u35.j(iHashCode4, (vt9) r11, ah5Var3, (vt9) r11);
                        y4h.o((ih5) r11, c8eVarP4, ah5Var4);
                        sfe.b(mzg.q((ih5) r11, 2132022194), r11, 0);
                        sfe.b(mzg.q((ih5) r11, 2132022195), r11, 0);
                        sfe.b(mzg.q((ih5) r11, 2132022196), r11, 0);
                        r11.p(true);
                        ocp.c(r11, mpj.c(z7eVar2, 8.0f));
                        if (z5) {
                            r11.W(-555843290);
                            r11.p(false);
                        } else {
                            r11.W(-556353581);
                            if (z2) {
                                r11.W(-556281072);
                                jB = pof.a(r11).a.j();
                                r2 = 0;
                                r11.p(false);
                                f2 = 2.0f;
                            } else {
                                r2 = 0;
                                r11.W(-556189529);
                                jB = pof.a(r11).b.b();
                                r11.p(false);
                                f2 = 1.0f;
                            }
                            scd.d(null, f2, jB, r11, 0, 1);
                            sfe.n(u8dVar2, r11, r2);
                            r11.p(r2);
                        }
                        r11.p(true);
                    } else {
                        r11.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var), vt9Var, (i2 & 7168) | 24576);
            xf8.d(u8dVar != null && u8dVar.i, as3.a.a(z7eVar, rbe.f), null, null, null, ui6.k, vt9Var, 196608, 28);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: n8d
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sfe.p(u8dVar, z, z2, function0, (ih5) obj, aoh.m(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static amb p0(Iterable iterable, int i) {
        iterable.getClass();
        z4o.v("limit is negative", i >= 0);
        return new amb(iterable, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(defpackage.u8d r23, lyi r24, java.lang.Integer r25, kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function0 r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function0 r29, kotlin.jvm.functions.Function0 r30, kotlin.jvm.functions.Function0 r31, defpackage.c8e r32, defpackage.ih5 r33, int r34) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfe.q(u8d, lyi, java.lang.Integer, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, c8e, ih5, int):void");
    }

    public static int q0(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(java.lang.String r22, kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function0 r24, defpackage.c8e r25, defpackage.ue5 r26, defpackage.ih5 r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfe.r(java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, c8e, ue5, ih5, int, int):void");
    }

    public static void r0(byte[] bArr, int[] iArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = q0(i2, bArr);
            i2 += 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(java.lang.String r23, defpackage.c8e r24, defpackage.ih5 r25, int r26, int r27) {
        /*
            r0 = r25
            vt9 r0 = (defpackage.vt9) r0
            r1 = -1759909276(0xffffffff9719ea64, float:-4.973281E-25)
            r0.Y(r1)
            r1 = r26 & 6
            if (r1 != 0) goto L1c
            r3 = r23
            boolean r1 = r0.f(r3)
            if (r1 == 0) goto L18
            r1 = 4
            goto L19
        L18:
            r1 = 2
        L19:
            r1 = r26 | r1
            goto L1e
        L1c:
            r1 = r26
        L1e:
            r2 = r27 & 2
            if (r2 == 0) goto L27
            r1 = r1 | 48
        L24:
            r4 = r24
            goto L39
        L27:
            r4 = r26 & 48
            if (r4 != 0) goto L24
            r4 = r24
            boolean r5 = r0.f(r4)
            if (r5 == 0) goto L36
            r5 = 32
            goto L38
        L36:
            r5 = 16
        L38:
            r1 = r1 | r5
        L39:
            r5 = r1 & 19
            r6 = 18
            if (r5 == r6) goto L41
            r5 = 1
            goto L42
        L41:
            r5 = 0
        L42:
            r6 = r1 & 1
            boolean r5 = r0.N(r6, r5)
            if (r5 == 0) goto La7
            if (r2 == 0) goto L4f
            z7e r2 = defpackage.z7e.b
            goto L50
        L4f:
            r2 = r4
        L50:
            unf r4 = defpackage.pof.a
            apf r4 = defpackage.pof.b(r0)
            ikl r4 = r4.i
            akf r5 = defpackage.pof.a(r0)
            s7 r5 = r5.a
            long r5 = r5.j()
            i39 r7 = defpackage.mpj.a
            c8e r7 = r2.d(r7)
            dof r8 = defpackage.pof.b
            r8.getClass()
            r8 = 1101004800(0x41a00000, float:20.0)
            r9 = 1090519040(0x41000000, float:8.0)
            r10 = 1098907648(0x41800000, float:16.0)
            c8e r7 = defpackage.a26.a0(r7, r10, r8, r10, r9)
            r19 = r1 & 14
            r20 = 0
            r21 = 131064(0x1fff8, float:1.8366E-40)
            r1 = r2
            r17 = r4
            r2 = r5
            r4 = 0
            r6 = 0
            r9 = r1
            r1 = r7
            r7 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r22 = r18
            r18 = r0
            r0 = r23
            defpackage.ijl.b(r0, r1, r2, r4, r6, r7, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4 = r22
            goto Lac
        La7:
            r18 = r0
            r18.Q()
        Lac:
            znh r0 = r18.r()
            if (r0 == 0) goto Lc0
            dy5 r2 = new dy5
            r7 = 1
            r3 = r23
            r5 = r26
            r6 = r27
            r2.<init>(r3, r4, r5, r6, r7)
            r0.d = r2
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfe.s(java.lang.String, c8e, ih5, int, int):void");
    }

    public static long s0(int i, byte[] bArr) {
        return ((q0(i + 4, bArr) & 4294967295L) << 32) | (q0(i, bArr) & 4294967295L);
    }

    public static final void t(final String str, boolean z, ih5 ih5Var, final int i, final int i2) {
        final boolean z2;
        int i3;
        long j;
        long jR;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(438041641);
        int i4 = i | (vt9Var.f(str) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (vt9Var.g(z2) ? 32 : 16);
        }
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i5 != 0 ? false : z2;
            if (z3) {
                vt9Var.W(51225646);
                unf unfVar = pof.a;
                j = pof.a(vt9Var).a.K();
                vt9Var.p(false);
                vt9Var.W(51228816);
                jR = pof.a(vt9Var).a.F();
            } else {
                vt9Var.W(51226736);
                unf unfVar2 = pof.a;
                j = pof.a(vt9Var).a.j();
                vt9Var.p(false);
                vt9Var.W(51229970);
                jR = pof.a(vt9Var).a.r();
            }
            vt9Var.p(false);
            u8i u8iVar = v8i.a;
            h9g h9gVar = new h9g(50.0f);
            c8e c8eVarC = C(x1p.j(z7e.b, new u8i(h9gVar, h9gVar, h9gVar, h9gVar)), j, kfo.i);
            pof.b.getClass();
            c8e c8eVarY = a26.Y(c8eVarC, 12.0f, 2.0f);
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarY);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ijl.b(str, null, jR, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).n, vt9Var, i3 & 14, 0, 131066);
            vt9Var = vt9Var;
            vt9Var.p(true);
            z2 = z3;
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(i, i2, str, z2) { // from class: o8d
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ byte c;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.a = str;
                    this.b = z2;
                    this.c = i2;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(1);
                    sfe.t(this.a, this.b, (ih5) obj, iM, this.c);
                    return Unit.a;
                }
            };
        }
    }

    public static final void t0(pfe pfeVar, kuk kukVar) {
        if (hib.c(pfeVar, rfe.a, kukVar) != px5.a) {
            mt5 mt5VarB = hib.b(kukVar);
            Unit unit = Unit.a;
            p0i p0iVar = t0i.b;
            mt5VarB.resumeWith(unit);
        }
    }

    public static final void u(go3 go3Var, long j, c8e c8eVar, Function0 function0, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(98103244);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(go3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 16384 : 8192;
        }
        if (vt9Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            pof.c.getClass();
            u8i u8iVarA = v8i.a(12.0f);
            c8e c8eVarD = C(x1p.j(c8eVar.d(mpj.a), u8iVarA), j, kfo.i).d(new fo3(go3Var.a, go3Var.b, u8iVarA));
            if (function0 != null) {
                c8eVarD = c8eVarD.d(jpo.q(z7e.b, false, (String) null, function0, 15));
            }
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarD);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            o18.r((i2 >> 12) & 14, ue5Var, vt9Var, true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new tn3(go3Var, j, c8eVar, function0, ue5Var, i);
        }
    }

    public static void u0(skm skmVar, tqi tqiVar, fr frVar, long j, int i) {
        int i2 = frVar.c;
        int i3 = frVar.b;
        int i4 = tqiVar.a;
        Integer num = tqiVar.b;
        if (i == 1) {
            x5f x5fVar = (x5f) skmVar;
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            if0 if0VarC0 = x56VarF.B(zpaVar).C0();
            kq0 kq0VarL = zpa.L();
            kq0VarL.e(2);
            kq0VarL.e(4);
            x5fVar.e(if0VarC0, kq0VarL, i4, num, i3 + 1, i2 + 1);
            x5fVar.U0(x56VarF);
            return;
        }
        if (i == 2) {
            x5f x5fVar2 = (x5f) skmVar;
            zpa zpaVar2 = x5fVar2.d;
            x56 x56VarF2 = zpa.F();
            if0 if0VarC02 = x56VarF2.B(zpaVar2).C0();
            kq0 kq0VarL2 = zpa.L();
            kq0VarL2.y().add(Long.valueOf(j));
            kq0VarL2.e(3);
            x5fVar2.e(if0VarC02, kq0VarL2, i4, num, i3 + 1, i2 + 1);
            x5fVar2.U0(x56VarF2);
            return;
        }
        if (i == 4) {
            x5f x5fVar3 = (x5f) skmVar;
            zpa zpaVar3 = x5fVar3.d;
            x56 x56VarF3 = zpa.F();
            x5fVar3.e(x56VarF3.B(zpaVar3).C0(), zpa.L(), i4, num, i3 + 1, i2 + 1).p(5, 1, 1L);
            x5fVar3.U0(x56VarF3);
            return;
        }
        if (i == 5) {
            x5f x5fVar4 = (x5f) skmVar;
            zpa zpaVar4 = x5fVar4.d;
            x56 x56VarF4 = zpa.F();
            x5fVar4.e(x56VarF4.B(zpaVar4).C0(), zpa.L(), i4, num, i3 + 1, i2 + 1);
            x5fVar4.U0(x56VarF4);
            return;
        }
        if (i != 6) {
            return;
        }
        x5f x5fVar5 = (x5f) skmVar;
        zpa zpaVar5 = x5fVar5.d;
        x56 x56VarF5 = zpa.F();
        x5fVar5.e(x56VarF5.B(zpaVar5).C0(), zpa.L(), i4, num, i3 + 1, i2 + 1).e(8);
        x5fVar5.U0(x56VarF5);
    }

    public static final void v(u8d u8dVar, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var;
        l8d l8dVar;
        znh znhVarR;
        Integer num;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1770280807);
        if ((i & 6) == 0) {
            i2 = (vt9Var2.f(u8dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 1;
        if (vt9Var2.N(i2 & 1, (i2 & 3) != 2)) {
            if (u8dVar != null) {
                if (u8dVar.b) {
                    num = 2132019674;
                } else {
                    byte b3 = u8dVar.a;
                    num = b3 != 1 ? b3 != 2 ? null : 2132019675 : 2132019676;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    unf unfVar = pof.a;
                    scd.d(null, 1.0f, pof.a(vt9Var2).b.b(), vt9Var2, 48, 1);
                    pof.b.getClass();
                    ocp.c(vt9Var2, mpj.c(z7e.b, 8.0f));
                    vt9Var = vt9Var2;
                    ijl.b(mzg.q(vt9Var2, iIntValue), a26.Z(mpj.a, 16.0f, 0.0f, 2), pof.a(vt9Var2).a.w(), 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, ((wam) vt9Var2.j(abm.a)).l, vt9Var, 0, 0, 130040);
                }
            }
            znhVarR = vt9Var2.r();
            if (znhVarR != null) {
                l8dVar = new l8d(u8dVar, i, b2);
                znhVarR.d = l8dVar;
            }
            return;
        }
        vt9Var = vt9Var2;
        vt9Var.Q();
        znhVarR = vt9Var.r();
        if (znhVarR != null) {
            l8dVar = new l8d(u8dVar, i, (byte) 2);
            znhVarR.d = l8dVar;
        }
    }

    public static void v0(long j, byte[] bArr, int i) {
        h0((int) (j >>> 32), i, bArr);
        h0((int) (j & 4294967295L), i + 4, bArr);
    }

    public static final void w(xtl xtlVar, ztl ztlVar, nx5 nx5Var, boolean z, afe afeVar, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        xtl xtlVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1413720282);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(xtlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? vt9Var.f(ztlVar) : vt9Var.h(ztlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(null) ? 256 : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.h(nx5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= vt9Var.f(afeVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 1048576 : 524288;
        }
        byte b2 = 0;
        if (vt9Var.N(i2 & 1, (599187 & i2) != 599186)) {
            String strQ = mzg.q(vt9Var, 2132021908);
            boolean zH = ((i2 & 896) == 256) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && vt9Var.h(ztlVar))) | vt9Var.h(nx5Var) | ((458752 & i2) == 131072);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new hv(ztlVar, nx5Var, afeVar, (byte) 5);
                vt9Var.g0(objK);
            }
            cwi cwiVar = cwi.a;
            xtlVar2 = xtlVar;
            w91.a(xtlVar2, (Function0) objK, new gog(z, true), gyg.P(-1287705660, new ub3(strQ, ue5Var, b2), vt9Var), vt9Var, (i2 & 14) | 3072, 0);
        } else {
            xtlVar2 = xtlVar;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new tb3(xtlVar2, ztlVar, nx5Var, z, afeVar, ue5Var, i);
        }
    }

    public static void w0(long j, byte[] bArr, int i, int i2) {
        long j2 = j << ((8 - i2) << 3);
        int i3 = 56;
        bArr[i] = (byte) (j2 >>> 56);
        for (int i4 = 1; i4 < i2; i4++) {
            i3 -= 8;
            bArr[i + i4] = (byte) (j2 >>> i3);
        }
    }

    public static final void x(ztl ztlVar, afe afeVar, c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1873232064);
        byte b2 = 1;
        if ((i & 6) == 0) {
            i2 = (vt9Var.g(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? vt9Var.f(ztlVar) : vt9Var.h(ztlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.f(afeVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        byte b3 = 0;
        if ((i & 3072) == 0) {
            i2 |= vt9Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 131072 : 65536;
        }
        if (vt9Var.N(i2 & 1, (74899 & i2) != 74898)) {
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = rm5.p(h.a, vt9Var);
                vt9Var.g0(objK);
            }
            nx5 nx5Var = (nx5) objK;
            c8e c8eVarN = f03.N(z0(ruk.a(ruk.a(c8eVar, ztlVar, new zb3(ztlVar, b3)), ztlVar, new zb3(ztlVar, b2)).d(new c1g(new f9(mzg.q(vt9Var, 2132021925), nx5Var, ztlVar, (byte) 12))), new cv2(nx5Var, ztlVar, (byte) 3)), new m91((Object) ztlVar, (Object) afeVar, (byte) 3));
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarN);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            o18.r((i2 >> 15) & 14, ue5Var, vt9Var, true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fz0((Object) ztlVar, (Object) afeVar, c8eVar, ue5Var, i, (byte) 1);
        }
    }

    public static void x0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr[0] & 4294967295L;
        long j7 = j6 * j;
        iArr3[0] = (int) j7;
        char c2 = ' ';
        long j8 = (j7 >>> 32) + (j6 * j2);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (j6 * j3);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (j6 * j4);
        iArr3[3] = (int) j10;
        long j11 = (j6 * j5) + (j10 >>> 32);
        iArr3[4] = (int) j11;
        iArr3[5] = (int) (j11 >>> 32);
        int i = 1;
        for (int i2 = 5; i < i2; i2 = 5) {
            long j12 = iArr[i] & 4294967295L;
            int i3 = i;
            long j13 = (j12 * j) + (iArr3[i] & 4294967295L);
            iArr3[i3] = (int) j13;
            long j14 = j12 * j2;
            int i4 = i3 + 1;
            char c3 = c2;
            long j15 = j14 + (iArr3[i4] & 4294967295L) + (j13 >>> c2);
            iArr3[i4] = (int) j15;
            long j16 = (j12 * j3) + (iArr3[r11] & 4294967295L) + (j15 >>> c3);
            iArr3[i3 + 2] = (int) j16;
            long j17 = (j12 * j4) + (iArr3[r11] & 4294967295L) + (j16 >>> c3);
            iArr3[i3 + 3] = (int) j17;
            long j18 = (j12 * j5) + (iArr3[r7] & 4294967295L) + (j17 >>> c3);
            iArr3[i3 + 4] = (int) j18;
            iArr3[i3 + 5] = (int) (j18 >>> c3);
            i = i4;
            c2 = c3;
        }
    }

    public static int y(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >>> 32);
    }

    public static int y0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr2[4] & 4294967295L;
        long j7 = 0;
        while (i < 5) {
            long j8 = j;
            long j9 = iArr[i] & j8;
            int i2 = i;
            long j10 = (j9 * j2) + (iArr3[i] & j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j3) + (iArr3[i3] & j8) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            long j12 = (j9 * j4) + (iArr3[r15] & j8) + (j11 >>> 32);
            iArr3[i2 + 2] = (int) j12;
            long j13 = (j9 * j5) + (iArr3[r2] & j8) + (j12 >>> 32);
            iArr3[i2 + 3] = (int) j13;
            long j14 = (j9 * j6) + (iArr3[r2] & j8) + (j13 >>> 32);
            iArr3[i2 + 4] = (int) j14;
            long j15 = (j14 >>> 32) + (iArr3[r0] & j8) + j7;
            iArr3[i2 + 5] = (int) j15;
            j7 = j15 >>> 32;
            j = j8;
            j2 = j2;
            i = i3;
        }
        return (int) j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void z(AbstractCollection abstractCollection, zlb zlbVar) {
        if (zlbVar instanceof Collection) {
            abstractCollection.addAll((Collection) zlbVar);
        } else {
            ipe.f(abstractCollection, zlbVar.iterator());
        }
    }

    public static final c8e z0(c8e c8eVar, Function1 function1) {
        return c8eVar.d(new jf9(function1));
    }

    public abstract sfe E0();

    public abstract boolean P(sfe sfeVar);

    public abstract boolean l0(int i);
}
