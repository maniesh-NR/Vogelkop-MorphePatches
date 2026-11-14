package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.browser.blocklist.manifest.db.BlockListDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class oc2 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oc2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        ex3 ex3VarS;
        Lazy lazyF;
        yg8 yg8Var;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int i;
        int iMin;
        double dMax;
        int i2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return b8h.d((v9j) ((igi) obj).e);
            case 1:
                ua7 ua7Var = ((xq2) obj).v;
                cqp.r0(ua7Var, tq2.a);
                ua7Var.D();
                return Unit.a;
            case 2:
                yr2 yr2Var = new yr2();
                yr2Var.a = (tjc) obj;
                return yr2Var;
            case 3:
                dx3 dx3VarL = dx3.L(((ts2) obj).a.e());
                if (dx3VarL == null || (ex3VarS = dx3VarL.s()) == null || (lazyF = ex3VarS.f()) == null) {
                    return null;
                }
                return (bt2) lazyF.get();
            case 4:
                nv2 nv2Var = (nv2) obj;
                h58 h58Var = hk6.i;
                ArrayList arrayList = new ArrayList();
                Iterator it = h58Var.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (nv2Var.a((hk6) next)) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            case 5:
                ((d13) obj).o.getClass();
                throw new ClassCastException();
            case 6:
                return Integer.valueOf(((g1b) obj).size());
            case 7:
                z43 z43Var = (z43) obj;
                ((v43) z43Var.f).c(((k6l) z43Var.c).o);
                return Unit.a;
            case 8:
                w43 w43Var = (w43) obj;
                w43Var.W(((k6l) w43Var.b).o);
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (sf1) obj;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                jg3 jg3Var = (jg3) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                vrf vrfVar = jg3Var.b;
                gg3 gg3Var = new gg3(((oza) jg3Var.d).source(), (byte) 0);
                tlh tlhVar = new tlh(gg3Var);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new jk3(tlhVar.peek(), (byte) 3), null, options);
                Exception exc = gg3Var.b;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = mh8.a;
                String str = options.outMimeType;
                ((ih8) jg3Var.e).getClass();
                if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
                    gh8 gh8Var = new gh8(new i34(new jk3(tlhVar.peek(), (byte) 3)));
                    int iD = gh8Var.d(1, "Orientation");
                    boolean z2 = iD == 2 || iD == 7 || iD == 4 || iD == 5;
                    switch (gh8Var.d(1, "Orientation")) {
                        case 3:
                        case 4:
                            i2 = 180;
                            break;
                        case 5:
                        case 8:
                            i2 = 270;
                            break;
                        case 6:
                        case 7:
                            i2 = 90;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    yg8Var = new yg8(z2, i2);
                } else {
                    yg8Var = yg8.c;
                }
                int i3 = yg8Var.a;
                boolean z3 = yg8Var.b;
                Exception exc2 = gg3Var.b;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                xm5 xm5Var = eza.c;
                ColorSpace colorSpace = (ColorSpace) xf8.K(vrfVar, xm5Var);
                Context context = vrfVar.a;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = (ColorSpace) xf8.K(vrfVar, xm5Var);
                }
                options.inPremultiplied = ((Boolean) xf8.K(vrfVar, eza.d)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) xf8.K(vrfVar, eza.b);
                if ((z3 || i3 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) xf8.K(vrfVar, eza.g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && Intrinsics.a(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i4 = options.outWidth;
                if (i4 <= 0 || (i = options.outHeight) <= 0) {
                    options.inSampleSize = 1;
                    z = false;
                    options.inScaled = false;
                } else {
                    int i5 = (i3 == 90 || i3 == 270) ? i : i4;
                    if (i3 != 90 && i3 != 270) {
                        i4 = i;
                    }
                    apj apjVar = vrfVar.b;
                    lli lliVar = vrfVar.c;
                    xm5 xm5Var2 = dza.b;
                    long jQ = zi4.q(i5, i4, apjVar, lliVar, (apj) xf8.K(vrfVar, xm5Var2));
                    int i6 = (int) (jQ >> 32);
                    int i7 = (int) (jQ & 4294967295L);
                    int iHighestOneBit = Integer.highestOneBit(i5 / i6);
                    int iHighestOneBit2 = Integer.highestOneBit(i4 / i7);
                    int iOrdinal = lliVar.ordinal();
                    if (iOrdinal == 0) {
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                    } else {
                        if (iOrdinal != 1) {
                            h9o.p();
                            return null;
                        }
                        iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                    }
                    if (iMin < 1) {
                        iMin = 1;
                    }
                    options.inSampleSize = iMin;
                    double d = iMin;
                    double d2 = i5 / d;
                    double d3 = i4 / d;
                    double d4 = i7;
                    apj apjVar2 = (apj) xf8.K(vrfVar, xm5Var2);
                    double d5 = i6 / d2;
                    double d6 = d4 / d3;
                    int iOrdinal2 = lliVar.ordinal();
                    if (iOrdinal2 == 0) {
                        dMax = Math.max(d5, d6);
                    } else {
                        if (iOrdinal2 != 1) {
                            h9o.p();
                            return null;
                        }
                        dMax = Math.min(d5, d6);
                    }
                    if (apjVar2.a instanceof e97) {
                        double d7 = r4.a / d2;
                        if (dMax > d7) {
                            dMax = d7;
                        }
                    }
                    if (apjVar2.b instanceof e97) {
                        double d8 = r0.a / d3;
                        if (dMax > d8) {
                            dMax = d8;
                        }
                    }
                    if (vrfVar.d == wog.b && dMax > 1.0d) {
                        dMax = 1.0d;
                    }
                    boolean z4 = dMax == 1.0d;
                    options.inScaled = !z4;
                    if (!z4) {
                        if (dMax > 1.0d) {
                            options.inDensity = zed.a(2.147483647E9d / dMax);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = zed.a(2.147483647E9d * dMax);
                        }
                    }
                    z = false;
                }
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new jk3(tlhVar, (byte) 3), null, options);
                    tlhVar.close();
                    Exception exc3 = gg3Var.b;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        qp2.n("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z3 || i3 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z3) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i3 > 0) {
                            matrix.postRotate(i3, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f = rectF.left;
                        if (f != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i3 == 90 || i3 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, mh8.a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    jva jvaVarK = ipe.k(new BitmapDrawable(context.getResources(), bitmapDecodeStream));
                    if (options.inSampleSize > 1 || options.inScaled) {
                        z = true;
                    }
                    return new ej6(jvaVarK, z);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vtp.v(tlhVar, th);
                        throw th2;
                    }
                }
            case 11:
                return new mi3((BlockListDatabase_Impl) obj);
            case 12:
                return ((ij3) obj).f;
            case 13:
                ((qb7) obj).z();
                return Unit.a;
            case 14:
                return b8h.d((v9j) ((ami) obj).g);
            case 15:
                ((bp3) obj).i(false);
                return Unit.a;
            case 16:
                ((gq3) obj).b();
                return Unit.a;
            case 17:
                return (voh) obj;
            case SizeUtil.textSize0_1 /* 18 */:
                String[] strArr = OperaApplication.K;
                ((OperaApplication) ((ju3) obj).e.e.getApplication()).L().c.z0(-1L);
                return Unit.a;
            case 19:
                String[] strArr2 = OperaApplication.K;
                glh glhVarH = ((OperaApplication) ((Context) ((c5o) obj).a).getApplicationContext()).H();
                glhVarH.getClass();
                wzg wzgVar = new wzg((byte) 1);
                glhVarH.d.n(new oml(glhVarH.c.c(new q2g(glhVarH, wzgVar, (byte) 20))), null);
                try {
                    ((CountDownLatch) wzgVar.b).await();
                } catch (InterruptedException unused) {
                    wzgVar.c = Collections.EMPTY_LIST;
                }
                return (List) wzgVar.c;
            case SizeUtil.textSize0 /* 20 */:
                ((boolean[]) obj)[0] = true;
                return Unit.a;
            case 21:
                return (orm) ((li) obj).get();
            case SizeUtil.textSize1 /* 22 */:
                return (skm) ((li) obj).get();
            case 23:
                return ((mt3) obj).b.H0();
            case SizeUtil.textSize2 /* 24 */:
                return (fd) ((lu3) obj).invoke();
            case 25:
                return ru9.c((dx3) obj);
            case 26:
                return ((hx3) obj).b.j;
            case 27:
                ((tz3) obj).c();
                return Unit.a;
            case 28:
                w04 w04Var = (w04) obj;
                x05 x05Var = w04Var.b;
                Context context2 = w04Var.a;
                float fL = wz3.a.l(context2);
                u05 u05Var = x05Var.a;
                u05Var.h = fL;
                u05Var.b.setStrokeWidth(fL);
                x05Var.invalidateSelf();
                x05Var.b(new int[]{f03.t(2130969303, context2, 2131101243)});
                return Unit.a;
            default:
                qb7 qb7Var = (qb7) obj;
                qb7Var.A((ImageView) qb7Var.a, pc.y);
                qb7Var.A((ImageView) qb7Var.b, pc.v);
                return Unit.a;
        }
    }
}
