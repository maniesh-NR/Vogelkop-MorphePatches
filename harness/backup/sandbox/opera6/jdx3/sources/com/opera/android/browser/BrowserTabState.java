package com.opera.android.browser;

import android.content.Context;
import android.net.Uri;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.UrlMangler;
import defpackage.a9l;
import defpackage.d5k;
import defpackage.d7l;
import defpackage.fue;
import defpackage.ike;
import defpackage.ilh;
import defpackage.jke;
import defpackage.olh;
import defpackage.pq4;
import defpackage.sko;
import defpackage.wqm;
import defpackage.xbf;
import defpackage.yy3;
import defpackage.z8l;
import defpackage.zy3;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BrowserTabState implements a9l {
    public final int a;
    public final int b;
    public final ArrayList c;
    public final TabInfo d;

    public BrowserTabState(ArrayList arrayList, int i, int i2, TabInfo tabInfo) {
        this.c = arrayList;
        this.b = i;
        this.a = i2;
        this.d = tabInfo;
    }

    public static BrowserTabState b(DataInputStream dataInputStream, d5o d5oVar, c5o c5oVar) throws IOException {
        String str;
        String str2;
        int i;
        byte[] bArr;
        byte[] bArr2;
        String strBuild;
        byte[] bArr3;
        Uri uri;
        String str3;
        String str4;
        jee jeeVar;
        String externalUrlWithFallback;
        String str5;
        String str6;
        String str7;
        byte[] bArr4;
        pq4 pq4Var;
        int i2;
        d5o d5oVar2 = d5oVar;
        int i3 = dataInputStream.readInt();
        if (i3 < 1 || i3 > 13) {
            s49.m(p3p.i(i3, "Unhandled version ", ", expected <= 13"));
            return null;
        }
        int i4 = i3 >= 7 ? dataInputStream.readInt() : Integer.MIN_VALUE;
        TabInfo tabInfo = new TabInfo(0, 0, System.currentTimeMillis(), 0L);
        int i5 = dataInputStream.readInt();
        int i6 = dataInputStream.readInt();
        int iMax = Math.max(Math.min(i5, i6 - 1), 0);
        if (i6 <= 0) {
            s49.m(sko.i(i6, "Invalid history entry count: "));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iMax2 = iMax;
        int i7 = 0;
        while (i7 < i6) {
            String utf = dataInputStream.readUTF();
            if (utf.startsWith("opera://")) {
                utf = "chrome://".concat(utf.substring(8));
            }
            String utf2 = dataInputStream.readUTF();
            if (utf2.startsWith("opera://")) {
                utf2 = "chrome://".concat(utf2.substring(8));
            }
            String utf3 = dataInputStream.readUTF();
            boolean z = i3 >= 12 && dataInputStream.readBoolean();
            if (i3 >= 8) {
                int i8 = dataInputStream.readInt();
                str = utf3;
                if (i8 > 32768) {
                    str2 = utf2;
                    lcp.D(dataInputStream, i8);
                } else {
                    str2 = utf2;
                    if (i8 > 0) {
                        bArr = new byte[i8];
                        dataInputStream.readFully(bArr);
                    }
                }
                bArr = null;
            } else {
                str = utf3;
                str2 = utf2;
                if (i3 >= 7) {
                    short s = dataInputStream.readShort();
                    byte[] bArr5 = null;
                    int i9 = 0;
                    while (i9 < s) {
                        short s2 = s;
                        int i10 = dataInputStream.readInt();
                        int i11 = i9;
                        byte[] bArr6 = bArr5;
                        if (i9 != 0) {
                            lcp.D(dataInputStream, i10);
                        } else {
                            if (i10 > 0) {
                                bArr5 = new byte[i10];
                                dataInputStream.readFully(bArr5);
                            }
                            i9 = i11 + 1;
                            s = s2;
                        }
                        bArr5 = bArr6;
                        i9 = i11 + 1;
                        s = s2;
                    }
                    bArr = bArr5;
                } else if (i3 < 3 || (i = dataInputStream.readInt()) <= 0) {
                    bArr = null;
                } else if (i3 < 6) {
                    byte[] bArr7 = new byte[i];
                    dataInputStream.readFully(bArr7);
                    String str8 = new String(bArr7, StandardCharsets.UTF_16);
                    byte[] bArr8 = new byte[str8.length()];
                    for (int i12 = 0; i12 < str8.length(); i12++) {
                        bArr8[i12] = (byte) str8.codePointAt(i12);
                    }
                    bArr = bArr8;
                } else {
                    bArr = new byte[i];
                    dataInputStream.readFully(bArr);
                }
            }
            if (i3 < 4 || i3 >= 11 || !dataInputStream.readBoolean()) {
                bArr2 = bArr;
                strBuild = str2;
            } else {
                if (i3 < 9) {
                    lcp.D(dataInputStream, 4L);
                }
                String utf4 = dataInputStream.readUTF();
                String utf5 = dataInputStream.readUTF();
                bArr2 = bArr;
                UrlMangler.Builder builder = new UrlMangler.Builder("search", utf);
                builder.displayString(utf5);
                builder.c.put("search_template", utf4);
                strBuild = builder.build();
            }
            if (i3 < 13 || (i2 = dataInputStream.readInt()) <= 0) {
                bArr3 = null;
            } else {
                byte[] bArr9 = new byte[i2];
                dataInputStream.readFully(bArr9);
                bArr3 = bArr9;
            }
            Uri uri2 = Uri.parse(utf);
            String[] strArr = wqm.a;
            if (uri2 == null || uri2.getScheme() == null) {
                uri = uri2;
            } else {
                uri = uri2;
                if (uri2.getScheme().equals("operaui")) {
                    Set set = (Set) d5oVar2.b;
                    String str9 = (String) d5oVar2.a;
                    str3 = utf;
                    if (CollectionsKt.E(set, uri.getHost())) {
                        if (!"startpage".equals(Uri.parse(uri.toString()).getAuthority())) {
                            str9 = str;
                        }
                        str4 = str9;
                        bArr4 = bArr2;
                        str6 = str3;
                        str7 = strBuild;
                        arrayList.add(new zy3(i7 - i6, str6, str7, str4, z, bArr4, bArr3));
                    } else {
                        if ("favorite".equals(uri.getHost()) || "dashboard".equals(uri.getHost())) {
                            String[] strArr2 = OperaApplication.K;
                            fue fueVarZ = ((OperaApplication) ((BrowserActivity) d5oVar2.c).getApplication()).z();
                            fueVarZ.d();
                            pq4Var = new pq4(d5k.b(fueVarZ.a, "topnews"), str9);
                        } else {
                            pq4Var = null;
                        }
                        if (pq4Var != null) {
                            String str10 = pq4Var.a;
                            str4 = pq4Var.b;
                            str6 = str10;
                            str7 = "";
                            bArr4 = null;
                            arrayList.add(new zy3(i7 - i6, str6, str7, str4, z, bArr4, bArr3));
                        } else if (i7 <= iMax) {
                            iMax2 = Math.max(iMax2 - 1, 0);
                        }
                    }
                }
                i7++;
                d5oVar2 = d5oVar;
            }
            str3 = utf;
            if (c5oVar != null && UrlMangler.isOffline(strBuild) && "file".equals(uri.getScheme())) {
                String path = uri.getPath();
                Iterator it = ((List) ((zyk) c5oVar.b).getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        jeeVar = null;
                        break;
                    }
                    ilh ilhVar = (ilh) it.next();
                    if (Intrinsics.a(path, ilhVar.f)) {
                        String strB = olh.b(ilhVar, ((Context) c5oVar.a).getString(2132020148));
                        jeeVar = new jee(BrowserUtils.getRendererUrl(strB), strB);
                        break;
                    }
                }
                if (jeeVar != null) {
                    externalUrlWithFallback = jeeVar.b;
                    str5 = jeeVar.c;
                } else {
                    externalUrlWithFallback = BrowserUtils.getExternalUrlWithFallback(strBuild);
                    str5 = "";
                }
                str6 = externalUrlWithFallback;
                str7 = str5;
                bArr4 = null;
                str4 = str;
                arrayList.add(new zy3(i7 - i6, str6, str7, str4, z, bArr4, bArr3));
                i7++;
                d5oVar2 = d5oVar;
            } else {
                str4 = str;
                bArr4 = bArr2;
                str6 = str3;
                str7 = strBuild;
                arrayList.add(new zy3(i7 - i6, str6, str7, str4, z, bArr4, bArr3));
                i7++;
                d5oVar2 = d5oVar;
            }
        }
        if (i3 >= 2 && i3 < 8) {
            dataInputStream.skipBytes(dataInputStream.readInt() << 2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new BrowserTabState(arrayList, iMax2, i4, tabInfo);
    }

    @Override // defpackage.a9l
    public final TabInfo a() {
        return this.d;
    }

    @Override // defpackage.a9l
    public final int d() {
        return this.c.size();
    }

    @Override // defpackage.a9l
    public final jke i() {
        ike ikeVar = new ike(this.b);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return ikeVar;
            }
            ikeVar.X(new yy3(this, (zy3) arrayList.get(i)), false);
            i++;
        }
    }

    @Override // defpackage.a9l
    public final int j() {
        return this.b;
    }

    @Override // defpackage.a9l
    public final z8l k() {
        return (zy3) this.c.get(this.b);
    }

    @Override // defpackage.a9l
    public final d7l l(xbf xbfVar) {
        return xbfVar.r(this);
    }

    @Override // defpackage.a9l
    public final int m() {
        return this.a;
    }
}
