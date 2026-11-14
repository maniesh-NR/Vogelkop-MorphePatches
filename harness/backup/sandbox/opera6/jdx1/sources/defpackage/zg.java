package defpackage;

import ads_mobile_sdk.us3;
import ads_mobile_sdk.ws3;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.j;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class zg implements g91, kgb, f94 {
    public static og5 e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public zg(byte b) {
        switch (b) {
            case 16:
                this.c = new int[10][];
                this.d = new zw5[10];
                break;
            default:
                this.b = new Object();
                this.c = null;
                this.d = null;
                this.a = 0;
                break;
        }
    }

    public zg(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        String strI = sjo.i(str);
        str3 = strI != null ? strI : str3;
        this.d = str3 == null ? UUID.randomUUID().toString() : str3;
    }

    public zg(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i;
        this.d = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public zg(ws3 ws3Var, int i, x7p x7pVar) {
        this.b = ws3Var;
        this.a = i;
        this.c = x7pVar;
    }

    public zg(ws3 ws3Var, int i, x7p x7pVar, ftj ftjVar) {
        this(ws3Var, i, x7pVar);
        this.d = ftjVar;
    }

    public zg(Paint paint) {
        this.b = paint;
        this.a = 3;
    }

    public zg(View view, AttributeSet attributeSet, int i) {
        this.b = view;
        this.c = attributeSet;
        this.a = i;
    }

    public zg(TextView textView) {
        this.a = 0;
        this.b = textView;
    }

    public zg(ikc ikcVar, ImageView imageView, lg lgVar) {
        this.b = imageView;
        this.c = lgVar;
        this.a = z7h.h(imageView.getContext(), 32.0f);
        a26.U(lgVar, ikcVar, new r85(this, (byte) 2), new j3i(this, (byte) 12));
    }

    public /* synthetic */ zg(Object obj, int i, Object obj2, Object obj3) {
        this.b = obj;
        this.a = i;
        this.c = obj2;
        this.d = obj3;
    }

    public zg(WeakReference weakReference) {
        this.b = new Handler();
        this.c = new SparseArray();
        this.d = weakReference;
    }

    public zg(lld lldVar, tvk tvkVar, lv1 lv1Var, f23 f23Var) {
        this.b = f23Var;
        this.a = -1;
        lldVar.e0(new rqi(this, (byte) 0));
        rqi rqiVar = new rqi(this, (byte) 1);
        nr8 nr8Var = (nr8) tvkVar.a;
        nr8Var.f(new a0k(nr8Var, new j12(rqiVar, (byte) 12)));
        lv1Var.a(new rqi(this, (byte) 2));
    }

    public zg(pjn pjnVar) {
        this.c = new SparseArray();
        this.d = new HashMap();
        this.b = pjnVar;
    }

    public zg(qln qlnVar) {
        this.b = qlnVar;
        this.d = qlnVar.h();
    }

    public zg(zg zgVar, sre sreVar, int i, String str) {
        this.c = zgVar;
        this.b = sreVar;
        this.a = i;
        this.d = str;
    }

    public static final void c(long j) throws iop {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % jArr[8])) != 0) {
            throw new iop();
        }
    }

    public static zg n(int i, String str, String str2) {
        sre sreVar = new sre(str2, (String) null, (byte) 1);
        zg zgVarY = y(str);
        if (zgVarY != null) {
            return new zg(zgVarY, sreVar, i, (String) null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zg o(int r13, java.lang.String r14, java.lang.String r15) {
        /*
            android.net.Uri r15 = android.net.Uri.parse(r15)
            boolean r0 = r15.isHierarchical()
            r1 = 0
            if (r0 == 0) goto Ldb
            boolean r0 = r15.isAbsolute()
            if (r0 == 0) goto Ldb
            zg r14 = y(r14)
            if (r14 == 0) goto Ldb
            java.lang.Object r0 = r14.b
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r2 = r15.getScheme()
            java.lang.String r3 = r0.getScheme()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L2d
            r0 = r3
            goto L39
        L2d:
            java.lang.String r2 = r15.toString()
            java.lang.String r0 = r0.toString()
            boolean r0 = J.N.M3e4Lx_w(r2, r0, r4)
        L39:
            if (r0 == 0) goto Ldb
            int r0 = r14.a
            if (r0 != r4) goto La9
            java.lang.String r0 = r15.getEncodedQuery()
            java.lang.Object r2 = r14.c
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String[] r5 = wqm.a
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L93
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L93
            int r5 = r0.length()
            r6 = r3
        L5a:
            r7 = 38
            int r7 = r0.indexOf(r7, r6)
            r8 = -1
            if (r7 == r8) goto L65
            r9 = r7
            goto L66
        L65:
            r9 = r5
        L66:
            r10 = 61
            int r10 = r0.indexOf(r10, r6)
            if (r10 > r9) goto L70
            if (r10 != r8) goto L71
        L70:
            r10 = r9
        L71:
            int r11 = r10 - r6
            int r12 = r2.length()
            if (r11 != r12) goto L8e
            int r11 = r2.length()
            boolean r6 = r0.regionMatches(r6, r2, r3, r11)
            if (r6 == 0) goto L8e
            if (r10 != r9) goto L88
            java.lang.String r0 = ""
            goto L94
        L88:
            int r10 = r10 + r4
            java.lang.String r0 = r0.substring(r10, r9)
            goto L94
        L8e:
            if (r7 == r8) goto L93
            int r6 = r7 + 1
            goto L5a
        L93:
            r0 = r1
        L94:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto Ldb
            zg r2 = new zg
            sre r3 = new sre
            r3.<init>(r1, r0, r4)
            java.lang.String r15 = r15.toString()
            r2.<init>(r14, r3, r13, r15)
            return r2
        La9:
            r2 = 2
            if (r0 != r2) goto Ldb
            java.lang.Object r0 = r14.d
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            if (r0 == 0) goto Lc5
            java.lang.String r2 = r15.getEncodedPath()
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r2 = r0.find()
            if (r2 == 0) goto Lc5
            java.lang.String r0 = r0.group(r4)
            goto Lc6
        Lc5:
            r0 = r1
        Lc6:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto Ldb
            zg r2 = new zg
            sre r3 = new sre
            r3.<init>(r1, r0, r4)
            java.lang.String r15 = r15.toString()
            r2.<init>(r14, r3, r13, r15)
            return r2
        Ldb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg.o(int, java.lang.String, java.lang.String):zg");
    }

    public static zg y(String str) {
        String str2;
        Uri uri = Uri.parse(str);
        if (!uri.isHierarchical() || !uri.isAbsolute()) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        String[] strArr = wqm.a;
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(encodedQuery)) {
            int length = encodedQuery.length();
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int i2 = iIndexOf != -1 ? iIndexOf : length;
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > i2 || iIndexOf2 == -1) {
                    iIndexOf2 = i2;
                }
                int i3 = iIndexOf2 + 1;
                if (i3 < i2 && "%s".equals(encodedQuery.substring(i3, i2))) {
                    hashSet.add(encodedQuery.substring(i, iIndexOf2));
                }
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
            }
        }
        int i4 = 1;
        if (hashSet.size() == 1) {
            str2 = (String) hashSet.iterator().next();
        } else if (uri.getEncodedPath().contains("%s")) {
            str2 = null;
            i4 = 2;
        } else {
            i4 = 3;
            str2 = null;
        }
        zg zgVar = new zg();
        zgVar.b = uri;
        zgVar.a = i4;
        zgVar.c = str2;
        if (i4 == 2) {
            zgVar.d = Pattern.compile("^" + uri.getEncodedPath().replace("%s", "([^/]*)") + "$");
        } else {
            zgVar.d = null;
        }
        return zgVar;
    }

    public final void A(String str) {
        b94 b94Var = (b94) this.b;
        int i = this.a;
        if (i >= 4) {
            b94Var.run(new ufc());
            return;
        }
        shf shfVar = (shf) this.c;
        new oml(((umi) shfVar.b).d(new sh3((Object) shfVar, this.d, (Object) b94Var, i, (byte) 4))).b((Object) null, 5 * (1 << (i + 1)), TimeUnit.SECONDS, (jri) null);
    }

    public final void B(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void C(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        x7o.a.b((Paint) this.b, i);
    }

    public final void D(long j) {
        x7o.a.c((Paint) this.b, j);
    }

    public final void E(kh3 kh3Var) {
        this.d = kh3Var;
        ((Paint) this.b).setColorFilter(kh3Var != null ? kh3Var.a : null);
    }

    public final void F(int i) {
        ((Paint) this.b).setFilterBitmap(!(i == 0));
    }

    public final void G(Shader shader) {
        this.c = shader;
        ((Paint) this.b).setShader(shader);
    }

    public final void H(int i) {
        ((Paint) this.b).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void I(int i) {
        ((Paint) this.b).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void J(float f) {
        ((Paint) this.b).setStrokeWidth(f);
    }

    public final void K(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public final void L(int i, boolean z) {
        TextView textView = (TextView) this.b;
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables((Drawable) (i == 1 ? this.d : this.c), compoundDrawables[1], (Drawable) (i == 1 ? this.c : this.d), compoundDrawables[3]);
        this.a = i;
        if (z) {
            Drawable drawable = (Drawable) this.c;
            if (drawable != null) {
                drawable.jumpToCurrentState();
            }
            Drawable drawable2 = (Drawable) this.d;
            if (drawable2 != null) {
                drawable2.jumpToCurrentState();
            }
        }
    }

    public final void M(char[] cArr, int i) throws IOException {
        byte[] bArr = (byte[]) this.c;
        if (i < 0) {
            qp2.o("count < 0");
            return;
        }
        if (i > cArr.length) {
            bxl.a(cArr.length, p3p.o(i, "count > string.length: ", " > "));
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (bArr.length - this.a < 1) {
                    q();
                }
                int i3 = this.a;
                int i4 = i3 + 1;
                this.a = i4;
                bArr[i3] = (byte) c;
                i2++;
                int iMin = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < iMin) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        int i5 = this.a;
                        this.a = i5 + 1;
                        bArr[i5] = (byte) c2;
                        i2++;
                    }
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.a < 2) {
                        q();
                    }
                    int i6 = this.a;
                    int i7 = i6 + 1;
                    this.a = i7;
                    bArr[i6] = (byte) ((c >> 6) | 192);
                    int i8 = (c & '?') | NotificationCompat.FLAG_HIGH_PRIORITY;
                    this.a = i6 + 2;
                    bArr[i7] = (byte) i8;
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.a < 3) {
                        q();
                    }
                    int i9 = this.a;
                    int i10 = i9 + 1;
                    this.a = i10;
                    bArr[i9] = (byte) ((c >> '\f') | 224);
                    int i11 = ((c >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY;
                    int i12 = i9 + 2;
                    this.a = i12;
                    bArr[i10] = (byte) i11;
                    int i13 = (c & '?') | NotificationCompat.FLAG_HIGH_PRIORITY;
                    this.a = i9 + 3;
                    bArr[i12] = (byte) i13;
                } else {
                    int i14 = i2 + 1;
                    char c3 = i14 < i ? cArr[i14] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.a < 1) {
                            q();
                        }
                        int i15 = this.a;
                        this.a = i15 + 1;
                        bArr[i15] = 63;
                        i2 = i14;
                    } else {
                        int i16 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (bArr.length - this.a < 4) {
                            q();
                        }
                        int i17 = this.a;
                        int i18 = i17 + 1;
                        this.a = i18;
                        bArr[i17] = (byte) ((i16 >> 18) | 240);
                        int i19 = ((i16 >> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY;
                        int i20 = i17 + 2;
                        this.a = i20;
                        bArr[i18] = (byte) i19;
                        int i21 = ((i16 >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY;
                        int i22 = i17 + 3;
                        this.a = i22;
                        bArr[i20] = (byte) i21;
                        int i23 = (i16 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY;
                        this.a = i17 + 4;
                        bArr[i22] = (byte) i23;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public final long a() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        return this.a * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]));
    }

    public final void a(long j) throws ulo, iop {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = ((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]);
        c(j);
        long j8 = j / j7;
        if (j8 < 0 || j8 > ((ws3) this.b).a.length) {
            throw new ulo();
        }
        this.a = (int) j8;
    }

    public final long b() throws ulo {
        try {
            x7p x7pVar = (x7p) this.c;
            ws3 ws3Var = (ws3) this.b;
            this.a = this.a + 1;
            return x7pVar.a(ws3Var, r2);
        } catch (IndexOutOfBoundsException e2) {
            throw new ulo(e2);
        }
    }

    public final ws3 b(long j) throws ulo, iop {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int iA = u0h.a(((~i) & i2) | i3, (i & i4) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        c(a() + j);
        int i5 = this.a;
        long j2 = i5;
        ws3 ws3Var = (ws3) this.b;
        long j3 = (j >> iA) + j2;
        if (j3 > ws3Var.a.length || j3 < j2) {
            throw new ulo();
        }
        try {
            int i6 = (int) j3;
            ws3 ws3VarA = ((x7p) this.c).a(ws3Var, i5, i6);
            this.a = i6;
            return ws3VarA;
        } catch (IndexOutOfBoundsException e2) {
            h9o.v(us3.a("CEiv6BFfPnitUE+D"), e2);
            return null;
        }
    }

    public final int c() throws ulo {
        int iA = u0h.a(1695460764, 396394489, 1519637107, 6072641) ^ 578290844;
        try {
            x7p x7pVar = (x7p) this.c;
            ws3 ws3Var = (ws3) this.b;
            int i = this.a;
            this.a = i + 1;
            int iA2 = x7pVar.a(ws3Var, i) & iA;
            x7p x7pVar2 = (x7p) this.c;
            ws3 ws3Var2 = (ws3) this.b;
            int i2 = this.a;
            this.a = i2 + 1;
            int iA3 = iA2 | ((x7pVar2.a(ws3Var2, i2) & iA) << 8);
            x7p x7pVar3 = (x7p) this.c;
            ws3 ws3Var3 = (ws3) this.b;
            int i3 = this.a;
            this.a = i3 + 1;
            int iA4 = iA3 | ((x7pVar3.a(ws3Var3, i3) & iA) << 16);
            x7p x7pVar4 = (x7p) this.c;
            ws3 ws3Var4 = (ws3) this.b;
            int i4 = this.a;
            this.a = i4 + 1;
            return iA4 | (x7pVar4.a(ws3Var4, i4) << 24);
        } catch (IndexOutOfBoundsException e2) {
            throw new ulo(e2);
        }
    }

    public final boolean canRequestPermission(String str) {
        if (!hasPermission(str)) {
            Activity activity = (Activity) ((WeakReference) this.d).get();
            if (activity == null ? false : activity.getPackageManager().isPermissionRevokedByPolicy(str, activity.getPackageName())) {
                return false;
            }
            if (!h(str)) {
                return !ht5.a.getBoolean(scd.G(str), false);
            }
            SharedPreferences sharedPreferences = ht5.a;
            String strG = scd.G(str);
            if (sharedPreferences.contains(strG)) {
                j.a(sharedPreferences, strG);
                return true;
            }
        }
        return true;
    }

    public final long d() throws ulo, xmp {
        int iA = u0h.a(2113091120, 659347295, -1784934195, 38700438) ^ 301105688;
        int i = 0;
        long j = 0;
        while (i < iA) {
            try {
                x7p x7pVar = (x7p) this.c;
                ws3 ws3Var = (ws3) this.b;
                int i2 = this.a;
                this.a = i2 + 1;
                byte bA = x7pVar.a(ws3Var, i2);
                j |= (bA & Byte.MAX_VALUE) << i;
                if (i == 63) {
                    if (bA > 1) {
                        throw new xmp();
                    }
                    i = 63;
                }
                if ((bA & 128) == 0) {
                    return (j >>> 1) ^ (-(j & 1));
                }
                i += 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new ulo(e2);
            }
        }
        throw new xmp();
    }

    public final void e(String[] strArr, p9g p9gVar) {
        int i = this.a;
        int i2 = i + 1000;
        byte b = 1;
        this.a = (i + 1) % 100;
        SparseArray sparseArray = (SparseArray) this.c;
        sparseArray.put(i2, new h91(this, strArr, p9gVar));
        Activity activity = (Activity) ((WeakReference) this.d).get();
        if (activity == null) {
            sparseArray.delete(i2);
            ((Handler) this.b).post(new iv(this, strArr, p9gVar, b));
            return;
        }
        activity.requestPermissions(strArr, i2);
        for (String str : strArr) {
            if (TextUtils.equals(str, "android.permission.POST_NOTIFICATIONS")) {
                am2.x(ht5.a.edit(), "AndroidPermissionRequestTimestamp::android.permission.POST_NOTIFICATIONS");
                return;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xqb */
    public final void f(char c) throws xqb, IOException {
        byte[] bArr = (byte[]) this.c;
        if (c < 128) {
            if (bArr.length - this.a < 1) {
                q();
            }
            int i = this.a;
            this.a = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.a < 2) {
                q();
            }
            int i2 = this.a;
            int i3 = i2 + 1;
            this.a = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            int i4 = (c & '?') | NotificationCompat.FLAG_HIGH_PRIORITY;
            this.a = i2 + 2;
            bArr[i3] = (byte) i4;
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.a < 1) {
                q();
            }
            int i5 = this.a;
            this.a = i5 + 1;
            bArr[i5] = 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.a < 3) {
                q();
            }
            int i6 = this.a;
            int i7 = i6 + 1;
            this.a = i7;
            bArr[i6] = -32;
            int i8 = ((c >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY;
            int i9 = i6 + 2;
            this.a = i9;
            bArr[i7] = (byte) i8;
            int i10 = (c & '?') | NotificationCompat.FLAG_HIGH_PRIORITY;
            this.a = i6 + 3;
            bArr[i9] = (byte) i10;
            return;
        }
        if (c > 65535) {
            throw new xqb(p3p.i(c, "Unexpected code point: ", ". Check your strings for malformed UTF-8 sequences."), (String) null, (Exception) null, 14);
        }
        if (bArr.length - this.a < 4) {
            q();
        }
        int i11 = this.a;
        int i12 = i11 + 1;
        this.a = i12;
        bArr[i11] = -16;
        int i13 = i11 + 2;
        this.a = i13;
        bArr[i12] = Byte.MIN_VALUE;
        int i14 = ((c >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY;
        int i15 = i11 + 3;
        this.a = i15;
        bArr[i13] = (byte) i14;
        int i16 = (c & '?') | NotificationCompat.FLAG_HIGH_PRIORITY;
        this.a = i11 + 4;
        bArr[i15] = (byte) i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r8, java.lang.String[] r9, int[] r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r1 = r0.get(r8)
            h91 r1 = (defpackage.h91) r1
            r0.delete(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
            r3 = r2
        L19:
            int r4 = r9.length
            if (r3 >= r4) goto L54
            r4 = r10[r3]
            if (r4 != 0) goto L26
            r4 = r9[r3]
            r8.add(r4)
            goto L51
        L26:
            r4 = r9[r3]
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r5 < r6) goto L4c
            if (r1 == 0) goto L43
            java.util.HashMap r5 = r1.b
            java.lang.Object r6 = r5.get(r4)
            if (r6 == 0) goto L43
            java.lang.Object r5 = r5.get(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L44
        L43:
            r5 = r2
        L44:
            if (r5 != 0) goto L4c
            boolean r4 = r7.h(r4)
            if (r4 == 0) goto L51
        L4c:
            r4 = r9[r3]
            r0.add(r4)
        L51:
            int r3 = r3 + 1
            goto L19
        L54:
            android.content.SharedPreferences r7 = defpackage.ht5.a
            android.content.SharedPreferences$Editor r7 = r7.edit()
            int r3 = r8.size()
            r4 = r2
        L5f:
            if (r4 >= r3) goto L71
            java.lang.Object r5 = r8.get(r4)
            int r4 = r4 + 1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = defpackage.scd.G(r5)
            r7.remove(r5)
            goto L5f
        L71:
            int r8 = r0.size()
            r3 = r2
        L76:
            r4 = 1
            if (r3 >= r8) goto L89
            java.lang.Object r5 = r0.get(r3)
            int r3 = r3 + 1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = defpackage.scd.G(r5)
            r7.putBoolean(r5, r4)
            goto L76
        L89:
            r7.apply()
            if (r1 == 0) goto L94
            p9g r7 = r1.a
            r7.k(r10, r9)
            return r4
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg.g(int, java.lang.String[], int[]):boolean");
    }

    public final boolean h(String str) {
        Activity activity = (Activity) ((WeakReference) this.d).get();
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public final boolean hasPermission(String str) {
        int iCheckPermission;
        try {
            iCheckPermission = t8.a.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (RuntimeException unused) {
            iCheckPermission = -1;
        }
        boolean z = iCheckPermission == 0;
        if (z) {
            SharedPreferences sharedPreferences = ht5.a;
            String strG = scd.G(str);
            if (sharedPreferences.contains(strG)) {
                j.a(sharedPreferences, strG);
            }
        }
        return z;
    }

    public final void i(String str) throws IOException {
        byte b;
        p(0, str.length() + 2);
        char[] cArr = (char[]) this.d;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i = length + 1;
        int length2 = 1;
        while (length2 < i) {
            char c = cArr[length2];
            String[] strArr = ohk.a;
            if (c <= 31 || c == '\"' || c == '\\') {
                int length3 = str.length();
                for (int i2 = length2 - 1; i2 < length3; i2++) {
                    p(length2, 2);
                    char cCharAt = str.charAt(i2);
                    byte[] bArr = ohk.b;
                    if (cCharAt >= bArr.length || (b = bArr[cCharAt]) == 0) {
                        int i3 = length2 + 1;
                        ((char[]) this.d)[length2] = cCharAt;
                        length2 = i3;
                    } else {
                        if (b == 1) {
                            String str2 = ohk.a[cCharAt];
                            p(length2, str2.length());
                            str2.getChars(0, str2.length(), (char[]) this.d, length2);
                            length2 = str2.length() + length2;
                        } else {
                            char[] cArr2 = (char[]) this.d;
                            cArr2[length2] = '\\';
                            cArr2[length2 + 1] = (char) b;
                            length2 += 2;
                        }
                    }
                }
                p(length2, 1);
                char[] cArr3 = (char[]) this.d;
                cArr3[length2] = '\"';
                M(cArr3, length2 + 1);
                q();
                return;
            }
            length2++;
        }
        cArr[i] = '\"';
        M(cArr, length + 2);
        q();
    }

    public final void j(String str) throws IOException {
        int length = str.length();
        p(0, length);
        str.getChars(0, length, (char[]) this.d, 0);
        M((char[]) this.d, length);
    }

    public final void k(int[] iArr, zw5 zw5Var) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = zw5Var;
        }
        int[][] iArr2 = (int[][]) this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            zw5[] zw5VarArr = new zw5[i2];
            System.arraycopy((zw5[]) this.d, 0, zw5VarArr, 0, i);
            this.d = zw5VarArr;
        }
        int[][] iArr4 = (int[][]) this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        ((zw5[]) this.d)[i3] = zw5Var;
        this.a = i3 + 1;
    }

    public final void l() {
        eri eriVarB = ((lg) this.c).b();
        hh4 hh4Var = (hh4) this.d;
        if (hh4Var != null) {
            hh4Var.cancel();
        }
        this.d = eriVarB.h(new eh7(this.a), new zzh(this, (byte) 5));
    }

    public final void m() {
        int i;
        cj9 cj9Var = (cj9) this.c;
        if (cj9Var == null || (i = this.a) < 0 || ((uvg) this.d) == null) {
            return;
        }
        f23 f23Var = (f23) this.b;
        Integer numValueOf = Integer.valueOf(i);
        uvg uvgVar = (uvg) this.d;
        if (uvgVar == null) {
            uvgVar = null;
        }
        f23Var.invoke(cj9Var, numValueOf, uvgVar);
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        String message = iOException.getMessage();
        if (message == null) {
            message = "Unknown failure";
        }
        A(message);
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        vzh vzhVar = pzhVar.g;
        b94 b94Var = (b94) this.b;
        try {
            if (pzhVar.q) {
                b94Var.run(new vfc(vzhVar.string()));
            } else {
                int i = pzhVar.d;
                String str = "Bad response: " + pzhVar.c;
                if (500 > i || i >= 600) {
                    b94Var.run(new ufc());
                } else {
                    A(str);
                }
            }
            vtp.v(vzhVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vtp.v(vzhVar, th);
                throw th2;
            }
        }
    }

    public final void p(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.d;
        if (cArr.length <= i3) {
            int i4 = i << 1;
            if (i3 < i4) {
                i3 = i4;
            }
            this.d = Arrays.copyOf(cArr, i3);
        }
    }

    public final void q() throws IOException {
        ((OutputStream) this.b).write((byte[]) this.c, 0, this.a);
        this.a = 0;
    }

    public final zw5 r(int[] iArr) {
        int i;
        int[][] iArr2 = (int[][]) this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.a) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = (int[][]) this.c;
            while (true) {
                if (i2 >= this.a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            i3 = i;
        }
        return i3 < 0 ? (zw5) this.b : ((zw5[]) this.d)[i3];
    }

    public final int s() {
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        int i = strokeCap == null ? -1 : x81.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i == 3 ? 2 : 0;
        }
        return 1;
    }

    public final int t() {
        Paint.Join strokeJoin = ((Paint) this.b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : x81.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i == 3 ? 1 : 0;
        }
        return 2;
    }

    public final void u(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mhh.c, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawableF = resourceId == 0 ? null : sgb.F(resourceId, context);
        if (drawableF != null) {
            drawableF.setBounds(0, 0, drawableF.getIntrinsicWidth(), drawableF.getIntrinsicHeight());
        }
        this.c = drawableF;
        Drawable drawableF2 = resourceId2 == 0 ? null : sgb.F(resourceId2, context);
        if (drawableF2 != null) {
            drawableF2.setBounds(0, 0, drawableF2.getIntrinsicWidth(), drawableF2.getIntrinsicHeight());
        }
        this.d = drawableF2;
        L(this.a, false);
        Drawable drawableF3 = resourceId3 == 0 ? null : sgb.F(resourceId3, context);
        if (drawableF3 != null) {
            drawableF3.setBounds(0, 0, drawableF3.getIntrinsicWidth(), drawableF3.getIntrinsicHeight());
        }
        Drawable drawableF4 = resourceId4 != 0 ? sgb.F(resourceId4, context) : null;
        if (drawableF4 != null) {
            drawableF4.setBounds(0, 0, drawableF4.getIntrinsicWidth(), drawableF4.getIntrinsicHeight());
        }
        TextView textView = (TextView) this.b;
        if (drawableF3 == null && drawableF4 == null) {
            return;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (drawableF3 != null) {
            compoundDrawables[1] = drawableF3;
        }
        if (drawableF4 != null) {
            compoundDrawables[3] = drawableF4;
        }
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    public final void v(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = ihh.O;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                zw5 zw5VarK = saj.k(typedArrayObtainAttributes, 5, new i3(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != 2130969450) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                k(StateSet.trimStateSet(iArr2, i), zw5VarK);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(android.content.Context r15, android.content.res.XmlResourceParser r16, android.util.AttributeSet r17, android.content.res.Resources.Theme r18) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r14 = this;
            r0 = r17
            r1 = r18
            int r2 = r16.getDepth()
            r3 = 1
            int r2 = r2 + r3
        La:
            int r4 = r16.next()
            if (r4 == r3) goto Ld3
            int r5 = r16.getDepth()
            if (r5 >= r2) goto L19
            r6 = 3
            if (r4 == r6) goto Ld3
        L19:
            r6 = 2
            if (r4 != r6) goto La
            if (r5 > r2) goto La
            java.lang.String r4 = r16.getName()
            java.lang.String r5 = "item"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto La
            android.content.res.Resources r4 = r15.getResources()
            r5 = 0
            int[] r7 = ihh.T
            if (r1 != 0) goto L38
            android.content.res.TypedArray r4 = r4.obtainAttributes(r0, r7)
            goto L3c
        L38:
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r0, r7, r5, r5)
        L3c:
            android.util.TypedValue r7 = r4.peekValue(r5)
            if (r7 == 0) goto L6b
            int r8 = r7.type
            r9 = 5
            if (r8 != r9) goto L5c
            rak r8 = new rak
            int r7 = r7.data
            android.content.res.Resources r9 = r4.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            int r7 = android.util.TypedValue.complexToDimensionPixelSize(r7, r9)
            float r7 = (float) r7
            r8.<init>(r6, r7)
            goto L6c
        L5c:
            r9 = 6
            if (r8 != r9) goto L6b
            rak r8 = new rak
            r9 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7.getFraction(r9, r9)
            r8.<init>(r3, r7)
            goto L6c
        L6b:
            r8 = 0
        L6c:
            r4.recycle()
            int r4 = r0.getAttributeCount()
            int[] r7 = new int[r4]
            r9 = r5
            r10 = r9
        L77:
            if (r9 >= r4) goto L91
            int r11 = r0.getAttributeNameResource(r9)
            r12 = 2130971285(0x7f040a95, float:1.7551304E38)
            if (r11 == r12) goto L8e
            int r12 = r10 + 1
            boolean r13 = r0.getAttributeBooleanValue(r9, r5)
            if (r13 != 0) goto L8b
            int r11 = -r11
        L8b:
            r7[r10] = r11
            r10 = r12
        L8e:
            int r9 = r9 + 1
            goto L77
        L91:
            int[] r4 = android.util.StateSet.trimStateSet(r7, r10)
            z4k r7 = new z4k
            r7.<init>(r6, r5)
            r7.b = r8
            int r6 = r14.a
            if (r6 == 0) goto La3
            int r8 = r4.length
            if (r8 != 0) goto La5
        La3:
            r14.b = r7
        La5:
            java.lang.Object r8 = r14.c
            int[][] r8 = (int[][]) r8
            int r9 = r8.length
            if (r6 < r9) goto Lc0
            int r9 = r6 + 10
            int[][] r10 = new int[r9][]
            java.lang.System.arraycopy(r8, r5, r10, r5, r6)
            r14.c = r10
            z4k[] r8 = new z4k[r9]
            java.lang.Object r9 = r14.d
            z4k[] r9 = (z4k[]) r9
            java.lang.System.arraycopy(r9, r5, r8, r5, r6)
            r14.d = r8
        Lc0:
            java.lang.Object r5 = r14.c
            int[][] r5 = (int[][]) r5
            int r6 = r14.a
            r5[r6] = r4
            java.lang.Object r4 = r14.d
            z4k[] r4 = (z4k[]) r4
            r4[r6] = r7
            int r6 = r6 + r3
            r14.a = r6
            goto La
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg.w(android.content.Context, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public final void writeLong(long j) throws IOException {
        j(String.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r6.b
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            androidx.recyclerview.widget.e r2 = r1.M
            r3 = 1
            if (r2 == 0) goto L13
            boolean r2 = r2.h()
            if (r2 == r3) goto L7e
        L13:
            androidx.recyclerview.widget.f r2 = r1.n
            if (r2 == 0) goto L1d
            boolean r2 = r2.isSmoothScrolling()
            if (r2 == r3) goto L7e
        L1d:
            byte r2 = r1.N
            if (r2 == r3) goto L7e
            r4 = 2
            if (r2 == r4) goto L7e
            java.lang.Object r2 = r6.c
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L37
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L5c
        L37:
            java.util.Iterator r2 = r2.iterator()
        L3b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r2.next()
            gal r4 = (gal) r4
            android.animation.ValueAnimator r5 = r4.l
            if (r5 == 0) goto L51
            boolean r5 = r5.isRunning()
            if (r5 == r3) goto L7e
        L51:
            android.animation.ValueAnimator r4 = r4.k
            if (r4 == 0) goto L3b
            boolean r4 = r4.isRunning()
            if (r4 != r3) goto L3b
            goto L7e
        L5c:
            int r2 = r6.a
            if (r2 > 0) goto L7e
            java.util.List r6 = kotlin.collections.CollectionsKt.k0(r0)
            r0.clear()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L6d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r6.next()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            goto L6d
        L7d:
            return
        L7e:
            c4 r0 = new c4
            r2 = 16
            r0.<init>(r6, r2)
            r1.postOnAnimation(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg.x():void");
    }

    public final void z() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            z4o.H(this.a > 0);
            int i = this.a - 1;
            this.a = i;
            if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                handlerThread.quit();
                this.d = null;
                this.c = null;
            }
        }
    }
}
