package defpackage;

import ads_mobile_sdk.u8;
import ads_mobile_sdk.ws3;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnFailureListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class drj implements m2k, w7e, lo7, x7p, ylo, ee5, OnFailureListener {
    public final /* synthetic */ byte a;

    public drj() {
        this.a = (byte) 6;
    }

    public /* synthetic */ drj(byte b) {
        this.a = b;
    }

    public static u8 b(String str) {
        return Intrinsics.a(str.toLowerCase(Locale.ROOT), "app_open_ad") ? u8.d : (u8) Enum.valueOf(u8.class, str);
    }

    public static itk c(htk htkVar, ftk ftkVar) {
        igk igkVar = itk.e;
        return new itk(htkVar, ftkVar, itk.e);
    }

    public static Font f(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int i2 = i(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int i4 = i(fontStyle, font2.getStyle());
            if (i4 < i2) {
                font = font2;
                i2 = i4;
            }
        }
        return font;
    }

    public static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.itk j(int r4, android.util.Size r5, defpackage.zo2 r6, int r7, defpackage.gtk r8, defpackage.igk r9) {
        /*
            java.util.LinkedHashMap r0 = defpackage.itk.h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r1)
            htk r0 = (defpackage.htk) r0
            if (r0 != 0) goto L10
            htk r0 = defpackage.htk.a
        L10:
            ftk r1 = defpackage.ftk.NOT_SUPPORT
            int r2 = defpackage.qpj.a(r5)
            r3 = 1
            if (r7 != r3) goto L45
            java.util.LinkedHashMap r5 = r6.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r7)
            android.util.Size r5 = (android.util.Size) r5
            int r5 = defpackage.qpj.a(r5)
            if (r2 > r5) goto L2f
            ftk r1 = defpackage.ftk.S720P_16_9
            goto Ld7
        L2f:
            java.util.LinkedHashMap r5 = r6.d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r5.get(r4)
            android.util.Size r4 = (android.util.Size) r4
            int r4 = defpackage.qpj.a(r4)
            if (r2 > r4) goto Ld7
            ftk r1 = defpackage.ftk.S1440P_4_3
            goto Ld7
        L45:
            gtk r3 = defpackage.gtk.a
            if (r8 != r3) goto L77
            java.util.LinkedHashMap r6 = r6.f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r6.get(r4)
            android.util.Size r4 = (android.util.Size) r4
            ftk[] r6 = defpackage.itk.f
            int r7 = r6.length
            r8 = 0
        L59:
            if (r8 >= r7) goto L6a
            r2 = r6[r8]
            android.util.Size r3 = r2.b
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L67
            r1 = r2
            goto L6a
        L67:
            int r8 = r8 + 1
            goto L59
        L6a:
            ftk r6 = defpackage.ftk.NOT_SUPPORT
            if (r1 != r6) goto Ld7
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Ld7
            ftk r1 = defpackage.ftk.MAXIMUM
            goto Ld7
        L77:
            android.util.Size r5 = r6.a
            int r8 = r5.getWidth()
            int r5 = r5.getHeight()
            int r5 = r5 * r8
            if (r2 > r5) goto L87
            ftk r1 = defpackage.ftk.VGA
            goto Ld7
        L87:
            android.util.Size r5 = r6.c
            int r5 = defpackage.qpj.a(r5)
            if (r2 > r5) goto L92
            ftk r1 = defpackage.ftk.PREVIEW
            goto Ld7
        L92:
            android.util.Size r5 = r6.e
            int r5 = defpackage.qpj.a(r5)
            if (r2 > r5) goto L9d
            ftk r1 = defpackage.ftk.RECORD
            goto Ld7
        L9d:
            java.util.LinkedHashMap r5 = r6.f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r8)
            android.util.Size r5 = (android.util.Size) r5
            java.util.LinkedHashMap r6 = r6.i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r6.get(r4)
            android.util.Size r4 = (android.util.Size) r4
            if (r5 == 0) goto Lc2
            int r6 = r5.getWidth()
            int r5 = r5.getHeight()
            int r5 = r5 * r6
            if (r2 > r5) goto Lc8
        Lc2:
            r5 = 2
            if (r7 == r5) goto Lc8
            ftk r1 = defpackage.ftk.MAXIMUM
            goto Ld7
        Lc8:
            if (r4 == 0) goto Ld7
            int r5 = r4.getWidth()
            int r4 = r4.getHeight()
            int r4 = r4 * r5
            if (r2 > r4) goto Ld7
            ftk r1 = defpackage.ftk.ULTRA_MAXIMUM
        Ld7:
            itk r4 = new itk
            r4.<init>(r0, r1, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drj.j(int, android.util.Size, zo2, int, gtk, igk):itk");
    }

    @Override // defpackage.x7p
    public final byte a(ws3 ws3Var, int i) {
        return ws3Var.a(i);
    }

    @Override // defpackage.x7p
    public final ws3 a(ws3 ws3Var, int i, int i2) {
        byte[] bArr;
        if (i >= 0 && i <= i2) {
            byte[] bArr2 = ws3Var.a;
            if (i2 <= bArr2.length && i <= i2 && i2 <= bArr2.length) {
                int i3 = i2 - i;
                if (i3 == 0) {
                    bArr = new byte[0];
                } else {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, i, bArr3, 0, i3);
                    bArr = bArr3;
                }
                return new ws3(bArr);
            }
        }
        t3p.t();
        return null;
    }

    public final Object a() {
        return new yfp((byte) 1);
    }

    @Override // defpackage.x7p
    /* renamed from: a, reason: collision with other method in class */
    public final x7p mo12a() {
        return new drj((byte) 14);
    }

    public final Typeface d(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyG = g((ni9[]) list.get(0), contentResolver);
            if (fontFamilyG == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyG);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyG2 = g((ni9[]) list.get(i2), contentResolver);
                if (fontFamilyG2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyG2);
                }
            }
            return customFallbackBuilder.setStyle(f(fontFamilyG, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final long e(long j) {
        return -1L;
    }

    public final FontFamily g(ni9[] ni9VarArr, ContentResolver contentResolver) throws IOException {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (ni9 ni9Var : ni9VarArr) {
            if (Objects.equals(ni9Var.a.getScheme(), "systemfont")) {
                fontBuild = h(ni9Var);
            } else {
                try {
                    Uri uri = ni9Var.a;
                    str = ni9Var.e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(ni9Var.c).setSlant(ni9Var.d ? 1 : 0).setTtcIndex(ni9Var.b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font h(ni9 ni9Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    public final void onFailure(Exception exc) {
    }

    public final Object r(x79 x79Var) {
        switch (this.a) {
            case 17:
                return new r7e();
            default:
                return new qsp((atp) x79Var.a(atp.class), (mg8) x79Var.a(mg8.class), (k3e) x79Var.a(k3e.class));
        }
    }

    @Override // defpackage.w7e
    public final v7e w(d5o d5oVar) {
        switch (this.a) {
            case 2:
                return new nhk(d5oVar.r(Uri.class, InputStream.class), (byte) 0);
            default:
                return new uqm(d5oVar.r(xy9.class, InputStream.class));
        }
    }

    public final no7 x(Context context) {
        return new bml(context);
    }
}
