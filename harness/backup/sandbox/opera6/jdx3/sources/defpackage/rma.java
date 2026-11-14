package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.View;
import androidx.recyclerview.widget.i;
import com.leanplum.internal.RequestBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes.dex */
public final class rma {
    public static final int[] j = {-65536, -16711681, -16776961, -16711936, -65281, -256, -16777216, -1};
    public static final int[] k = {2132018294, 2132018291, 2132018286, 2132018292, 2132018293, 2132018298, 2132018285, 2132018297};
    public static final int[] l = {R.attr.state_pressed};
    public static final int[] m = {R.attr.state_selected};
    public static final int[] n = {R.attr.state_selected, R.attr.state_pressed};
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public rma(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                break;
            default:
                this.d = "";
                this.e = "";
                this.b = -1;
                this.f = j95.j(new String[]{""});
                break;
        }
    }

    public rma(Context context, wa waVar, vma vmaVar) {
        this.a = (byte) 0;
        this.c = context;
        this.d = waVar;
        this.f = new ArrayList();
        this.e = vmaVar;
    }

    public rma(Context context, String[] strArr, String str) {
        this.a = (byte) 5;
        this.f = strArr[0];
        this.b = Integer.parseInt(strArr[3]);
        this.d = new int[Integer.parseInt(strArr[5])];
        this.c = context;
        this.g = new URI(strArr[2]);
        this.h = strArr[4].length() > 0 ? strArr[4] : null;
        this.i = str;
    }

    public rma(View view, int i, int i2, float[] fArr, int i3, int i4, int i5, int i6) {
        this.a = (byte) 1;
        this.c = view;
        this.e = view.getContext().getColorStateList(i3);
        this.b = view.getResources().getDimensionPixelSize(i4);
        ColorStateList colorStateList = view.getContext().getColorStateList(i2);
        ColorStateList colorStateList2 = (ColorStateList) this.e;
        int i7 = this.b;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.g = gradientDrawable;
        gradientDrawable.setCornerRadii(fArr);
        if (i7 > 0) {
            ((GradientDrawable) this.g).setStroke(i7, colorStateList2);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.h = gradientDrawable2;
        gradientDrawable2.setCornerRadii(fArr);
        ((GradientDrawable) this.h).setStroke(i7, 0);
        this.i = new LayerDrawable(new Drawable[]{(GradientDrawable) this.g, (GradientDrawable) this.h});
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadii(fArr);
        gradientDrawable3.setColor(-1);
        int[][] iArr = {m, StateSet.NOTHING};
        int colorForState = colorStateList.getColorForState(n, colorStateList.getDefaultColor());
        int iL = ab5.l(colorForState, Math.min(Color.alpha(colorForState) << 1, 255));
        int colorForState2 = colorStateList.getColorForState(l, colorStateList.getDefaultColor());
        ColorStateList colorStateList3 = new ColorStateList(iArr, new int[]{iL, ab5.l(colorForState2, Math.min(Color.alpha(colorForState2) << 1, 255))});
        Drawable drawable = (LayerDrawable) this.i;
        view.setBackground(new RippleDrawable(colorStateList3, i5 != 0 ? new InsetDrawable(drawable, i6, i5, i6, i5) : drawable, gradientDrawable3));
        ColorStateList colorStateList4 = view.getContext().getColorStateList(i);
        if (colorStateList4 != ((ColorStateList) this.d)) {
            this.d = colorStateList4;
            ((GradientDrawable) this.g).setColor(colorStateList4);
        }
    }

    public rma(bf9 bf9Var, umi umiVar, cd9 cd9Var) {
        this.a = (byte) 3;
        final byte b = 1;
        j99 j99Var = new j99(this, b);
        this.c = j99Var;
        final byte b2 = 0;
        byte b3 = 4;
        this.g = new q65(new Runnable(this) { // from class: yc9
            public final /* synthetic */ rma b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b4 = b2;
                rma rmaVar = this.b;
                switch (b4) {
                    case 0:
                        rmaVar.l();
                        break;
                    default:
                        cd9 cd9Var2 = (cd9) rmaVar.f;
                        int i = rmaVar.b;
                        if (i != 0) {
                            ih4 ih4Var = (ih4) rmaVar.i;
                            if (ih4Var != null) {
                                ih4Var.cancel();
                                rmaVar.i = null;
                                i = rmaVar.b;
                                if (i == 0) {
                                }
                            }
                            rmaVar.b = 0;
                            int iA = vep.A(i);
                            if (iA != 0 && iA != 1) {
                                byte b5 = 2;
                                if (iA == 2) {
                                    cd9Var2.A0(2);
                                    break;
                                } else if (iA == 3) {
                                    cd9Var2.getClass();
                                    cd9Var2.z0(new br((Object) cd9Var2, 2132019094, (byte) 12));
                                    break;
                                } else if (iA == 4) {
                                    cd9Var2.getClass();
                                    cd9Var2.z0(new oc4(cd9Var2, b5, b5));
                                    break;
                                }
                            } else {
                                cd9Var2.A0(1);
                                break;
                            }
                        }
                        break;
                }
            }
        }, b3);
        this.h = new q65(new Runnable(this) { // from class: yc9
            public final /* synthetic */ rma b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b4 = b;
                rma rmaVar = this.b;
                switch (b4) {
                    case 0:
                        rmaVar.l();
                        break;
                    default:
                        cd9 cd9Var2 = (cd9) rmaVar.f;
                        int i = rmaVar.b;
                        if (i != 0) {
                            ih4 ih4Var = (ih4) rmaVar.i;
                            if (ih4Var != null) {
                                ih4Var.cancel();
                                rmaVar.i = null;
                                i = rmaVar.b;
                                if (i == 0) {
                                }
                            }
                            rmaVar.b = 0;
                            int iA = vep.A(i);
                            if (iA != 0 && iA != 1) {
                                byte b5 = 2;
                                if (iA == 2) {
                                    cd9Var2.A0(2);
                                    break;
                                } else if (iA == 3) {
                                    cd9Var2.getClass();
                                    cd9Var2.z0(new br((Object) cd9Var2, 2132019094, (byte) 12));
                                    break;
                                } else if (iA == 4) {
                                    cd9Var2.getClass();
                                    cd9Var2.z0(new oc4(cd9Var2, b5, b5));
                                    break;
                                }
                            } else {
                                cd9Var2.A0(1);
                                break;
                            }
                        }
                        break;
                }
            }
        }, b3);
        this.f = cd9Var;
        this.d = bf9Var;
        this.e = umiVar;
        bf9Var.F(j99Var);
        l();
    }

    public rma(saj sajVar) {
        this.a = (byte) 6;
        n();
        c(StateSet.WILD_CARD, sajVar);
    }

    public rma(x93 x93Var, sa2 sa2Var) {
        this.a = (byte) 2;
        this.f = new ArrayList();
        this.e = new IdentityHashMap();
        this.g = new ArrayList();
        this.h = new z();
        this.c = x93Var;
        b3g b3gVar = new b3g();
        b3gVar.a = new SparseArray();
        b3gVar.b = 0;
        this.d = b3gVar;
        int i = sa2Var.b;
        this.b = i;
        if (i == 1) {
            this.i = new isd((byte) 27);
            return;
        }
        if (i == 2) {
            hp2 hp2Var = new hp2((byte) 11, false);
            hp2Var.b = 0L;
            this.i = hp2Var;
        } else if (i == 3) {
            this.i = new yhe((byte) 24);
        } else {
            qp2.o("unknown stable id mode");
            throw null;
        }
    }

    public static rma h(Context context, String str) throws NumberFormatException {
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length < 6 || str.startsWith("#")) {
            qp2.o("Invalidly formatted test ".concat(str));
            return null;
        }
        int i = Integer.parseInt(strArrSplit[3]);
        if (i == 0) {
            return new rma(context, strArrSplit, RequestBuilder.GET);
        }
        if (i == 1) {
            return new rma(context, strArrSplit, "HEAD");
        }
        t3p.i(strArrSplit[3], "Unknown test type ");
        return null;
    }

    public static ArrayList t(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iK = StringsKt.K(str, '&', i, 4);
            if (iK == -1) {
                iK = str.length();
            }
            int iK2 = StringsKt.K(str, '=', i, 4);
            if (iK2 == -1 || iK2 > iK) {
                arrayList.add(str.substring(i, iK));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iK2));
                arrayList.add(str.substring(iK2 + 1, iK));
            }
            i = iK + 1;
        }
        return arrayList;
    }

    public final void a(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.h = arrayList;
        }
        arrayList.add(_UrlKt.canonicalize$default(str, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
        ((ArrayList) this.h).add(str2 != null ? _UrlKt.canonicalize$default(str2, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null) : null);
    }

    public final void b(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.h = arrayList;
        }
        arrayList.add(_UrlKt.canonicalize$default(str, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
        ((ArrayList) this.h).add(str2 != null ? _UrlKt.canonicalize$default(str2, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null) : null);
    }

    public final void c(int[] iArr, saj sajVar) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = sajVar;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.d = iArr3;
            saj[] sajVarArr = new saj[i2];
            System.arraycopy((saj[]) this.e, 0, sajVarArr, 0, i);
            this.e = sajVarArr;
        }
        int[][] iArr4 = (int[][]) this.d;
        int i3 = this.b;
        iArr4[i3] = iArr;
        ((saj[]) this.e)[i3] = sajVar;
        this.b = i3 + 1;
    }

    public final hra d() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            qp2.n("scheme == null");
            return null;
        }
        String strPercentDecode$default = _UrlKt.percentDecode$default((String) this.d, 0, 0, false, 7, null);
        String strPercentDecode$default2 = _UrlKt.percentDecode$default((String) this.e, 0, 0, false, 7, null);
        String str2 = (String) this.g;
        if (str2 == null) {
            qp2.n("host == null");
            return null;
        }
        int i = i();
        ArrayList arrayList2 = (ArrayList) this.f;
        ArrayList arrayList3 = new ArrayList(k95.o(arrayList2, 10));
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList3.add(_UrlKt.percentDecode$default((String) obj, 0, 0, false, 7, null));
        }
        ArrayList arrayList4 = (ArrayList) this.h;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(k95.o(arrayList4, 10));
            int size2 = arrayList4.size();
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? _UrlKt.percentDecode$default(str3, 0, 0, true, 3, null) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.i;
        return new hra(str, strPercentDecode$default, strPercentDecode$default2, str2, i, arrayList3, arrayList, str4 != null ? _UrlKt.percentDecode$default(str4, 0, 0, false, 7, null) : null, toString());
    }

    public final void e() {
        eph ephVar;
        x93 x93Var = (x93) this.c;
        ArrayList arrayList = (ArrayList) this.g;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ephVar = eph.a;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            xke xkeVar = (xke) obj;
            eph stateRestorationPolicy = xkeVar.c.getStateRestorationPolicy();
            ephVar = eph.c;
            if (stateRestorationPolicy == ephVar || (stateRestorationPolicy == eph.b && xkeVar.e == 0)) {
                break;
            }
        }
        if (ephVar != x93Var.getStateRestorationPolicy()) {
            x93Var.I(ephVar);
        }
    }

    public final void f() {
        ((q65) this.g).S();
        ((q65) this.h).S();
        ih4 ih4Var = (ih4) this.i;
        if (ih4Var != null) {
            ih4Var.cancel();
            this.i = null;
        }
        this.b = 0;
    }

    public final int g(xke xkeVar) {
        ArrayList arrayList = (ArrayList) this.g;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            xke xkeVar2 = (xke) obj;
            if (xkeVar2 == xkeVar) {
                break;
            }
            i += xkeVar2.e;
        }
        return i;
    }

    public final int i() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.c;
        if (Intrinsics.a(str, "http")) {
            return 80;
        }
        return Intrinsics.a(str, "https") ? 443 : -1;
    }

    public final void j(String str) {
        if (c.q(str, "/", false)) {
            r(0, str.length(), str);
        } else {
            bxl.d("unexpected encodedPath: ".concat(str));
        }
    }

    public final z k(int i) {
        z zVar = (z) this.h;
        if (zVar.a) {
            zVar = new z();
        } else {
            zVar.a = true;
        }
        ArrayList arrayList = (ArrayList) this.g;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            xke xkeVar = (xke) obj;
            int i4 = xkeVar.e;
            if (i4 > i3) {
                zVar.c = xkeVar;
                zVar.b = i3;
                break;
            }
            i3 -= i4;
        }
        if (((xke) zVar.c) != null) {
            return zVar;
        }
        qp2.o(sko.i(i, "Cannot find wrapper for "));
        return null;
    }

    public final void l() {
        mgh mghVarC;
        byte b = 1;
        if (this.b == 1) {
            return;
        }
        f();
        cd9 cd9Var = (cd9) this.f;
        cd9Var.n = 1;
        cd9Var.t = null;
        cd9Var.y0();
        long jUptimeMillis = SystemClock.uptimeMillis();
        bf9 bf9Var = (bf9) this.d;
        az4 az4Var = new az4(this, jUptimeMillis, b);
        mgh mghVar = bf9Var.y;
        if (mghVar != null) {
            mghVar.e((Object) null);
            bf9Var.y = null;
        }
        byte[] bArr = new byte[6];
        new SecureRandom().nextBytes(bArr);
        byte b2 = 0;
        String str = new String(new char[]{bf9.Q(bArr[0] & 63), bf9.Q((bArr[1] & 15) | ((bArr[0] & 192) >> 2)), bf9.Q(((bArr[1] & 240) >> 2) | (bArr[2] & 3)), bf9.Q((bArr[2] & 252) >> 2), '-', bf9.Q(bArr[3] & 63), bf9.Q((bArr[4] & 15) | ((bArr[3] & 192) >> 2)), bf9.Q(((bArr[4] & 240) >> 2) | (bArr[5] & 3)), bf9.Q((bArr[5] & 252) >> 2)});
        if (bf9Var.r() < 1 || bf9Var.n != null) {
            exl exlVar = new exl(new te9(bf9Var, str, az4Var, b2), az4Var);
            bf9Var.y = exlVar;
            bf9Var.g.add(exlVar);
            bf9Var.C();
            mghVarC = bf9Var.y;
        } else {
            mghVarC = bf9Var.c(str, az4Var, true);
            bf9Var.y = mghVarC;
        }
        this.b = 1;
        this.i = mghVarC;
    }

    public final xke m(i iVar) {
        xke xkeVar = (xke) ((IdentityHashMap) this.e).get(iVar);
        if (xkeVar != null) {
            return xkeVar;
        }
        n57.f("Cannot find wrapper for ", iVar, ", seems like it is not bound by this adapter: ", this);
        return null;
    }

    public final void n() {
        this.c = new saj();
        this.d = new int[10][];
        this.e = new saj[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EDGE_INSN: B:161:0x0070->B:32:0x0070 BREAK  A[LOOP:0: B:13:0x0046->B:31:0x006b]] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.String r31, defpackage.hra r32) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rma.o(java.lang.String, hra):void");
    }

    public final int p(Socket socket, boolean z) throws IOException {
        String str = (String) this.i;
        String str2 = (String) this.h;
        long jNanoTime = System.nanoTime() / 1000000;
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        URI uri = (URI) this.g;
        StringBuilder sbH = u35.h(z ? uri.toString() : uri.getPath(), "?");
        sbH.append(System.nanoTime() % 65537);
        printStream.print(str + " " + sbH.toString() + " HTTP/1.0\r\nHost: " + uri.getHost() + "\r\nCache-Control: no-cache\r\nConnection: close\r\n\r\n");
        if (printStream.checkError()) {
            throw new IOException();
        }
        boolean zEquals = str.equals("HEAD");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = null;
        while (true) {
            String line2 = bufferedReader.readLine();
            if (line2 != null) {
                if (line == null) {
                    if (line2.length() == 0) {
                        if (zEquals) {
                            line = "";
                            break;
                        }
                        line = bufferedReader.readLine();
                    }
                } else {
                    this.e = "Unexpectedly got more than one line of response";
                    break;
                }
            } else {
                break;
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000000;
        if (line == null) {
            this.e = "No response from server";
        } else if (!zEquals && ((String) this.e) == null && str2 != null && !str2.equals(line)) {
            int iMin = Math.min(line.length(), str2.length() << 1);
            StringBuilder sb = new StringBuilder("Response \"");
            sb.append(line.substring(0, iMin));
            sb.append("\" didn't match \"");
            this.e = z1m.l(sb, str2, "\"");
        }
        return (int) (jNanoTime2 - jNanoTime);
    }

    public final void q(String str, int i, int i2, boolean z, boolean z2) {
        ArrayList arrayList = (ArrayList) this.f;
        String strCanonicalize$default = _UrlKt.canonicalize$default(str, i, i2, _UrlKt.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, 112, null);
        if (Intrinsics.a(strCanonicalize$default, ".") || c.m(strCanonicalize$default, "%2e", true)) {
            return;
        }
        if (Intrinsics.a(strCanonicalize$default, "..") || c.m(strCanonicalize$default, "%2e.", true) || c.m(strCanonicalize$default, ".%2e", true) || c.m(strCanonicalize$default, "%2e%2e", true)) {
            if (((String) vep.r(1, arrayList)).length() != 0 || arrayList.isEmpty()) {
                arrayList.add("");
                return;
            } else {
                arrayList.set(arrayList.size() - 1, "");
                return;
            }
        }
        if (((CharSequence) am2.k(1, arrayList)).length() == 0) {
            arrayList.set(arrayList.size() - 1, strCanonicalize$default);
        } else {
            arrayList.add(strCanonicalize$default);
        }
        if (z) {
            arrayList.add("");
        }
    }

    public final void r(int i, int i2, String str) {
        ArrayList arrayList = (ArrayList) this.f;
        if (i != i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                arrayList.clear();
                arrayList.add("");
                i++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                int iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "/\\", i3, i2);
                boolean z = iDelimiterOffset < i2;
                rma rmaVar = this;
                String str2 = str;
                rmaVar.q(str2, i3, iDelimiterOffset, z, true);
                if (z) {
                    i3 = iDelimiterOffset + 1;
                    this = rmaVar;
                    str = str2;
                } else {
                    this = rmaVar;
                    str = str2;
                    i3 = iDelimiterOffset;
                }
            }
        }
    }

    public final int s() throws IOException {
        URI uri = (URI) this.g;
        cm cmVarG = b8h.g(uri);
        String host = uri.getHost();
        int port = uri.getPort();
        if (cmVarG != null) {
            host = cmVarG.c;
            port = cmVarG.b;
        }
        Socket socket = new Socket();
        try {
            if (port <= 0) {
                port = 80;
            }
            socket.connect(new InetSocketAddress(host, port), 3000);
            socket.setSoTimeout(3000);
            return p(socket, cmVarG != null);
        } finally {
            if (!socket.isClosed()) {
                socket.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rma.toString():java.lang.String");
    }
}
