package defpackage;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class is6 implements gx6, n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ is6(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ is6(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public final void a(int i) {
        int i2;
        js6 js6Var = (js6) this.c;
        yzb yzbVar = (yzb) this.d;
        zmc zmcVar = (zmc) this.e;
        j4c j4cVar = (j4c) js6Var.f;
        xoc xocVar = (xoc) js6Var.g;
        qkc qkcVar = (qkc) yzbVar.b;
        if (qkcVar.k) {
            int iA = vep.A(i);
            if (iA == 0) {
                i2 = 2132019520;
            } else if (iA == 1) {
                i2 = 2132020080;
            } else if (iA == 2) {
                i2 = 2132019519;
            } else if (iA == 3) {
                i2 = 2132019518;
            } else {
                h9o.p();
            }
            rxh rxhVar = new rxh(i2);
            ysj ysjVarJ0 = ((tkc) qkcVar.f.a).f.b.J0();
            glj gljVar = new glj(rxhVar, 2500);
            ysjVarJ0.getClass();
            ysjVarJ0.b(gljVar, ijm.b);
        }
        int iA2 = vep.A(i);
        boolean z = this.b;
        if (iA2 == 0) {
            xocVar.a(tg0.c);
            if (z) {
                xocVar.a(tg0.j);
                vs6 vs6Var = (vs6) j4cVar.get();
                long j = zmcVar.a().a;
                zmcVar.a().getClass();
                vs6Var.b(j, apc.c, 1, ch9.b);
                return;
            }
            return;
        }
        if (iA2 == 1) {
            xocVar.a(tg0.d);
            if (z) {
                xocVar.a(tg0.k);
                vs6 vs6Var2 = (vs6) j4cVar.get();
                long j2 = zmcVar.a().a;
                zmcVar.a().getClass();
                apc apcVar = apc.c;
                ch9 ch9Var = ch9.a;
                vs6Var2.d(j2, apcVar, 1);
            }
        }
    }

    public final Object g(Object obj) {
        IconCompat iconCompatB;
        byte b = this.a;
        boolean z = false;
        boolean z2 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 2:
                iji ijiVar = (iji) obj4;
                ijiVar.s(new gg7(ijiVar, (Uri) obj3, (String) obj2, this.b, (byte) 4));
                return null;
            case 3:
                fp1 fp1Var = (dx3) obj4;
                String str = (String) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                Intent intent = (Intent) obj;
                if (intent == null) {
                    m5h.B(fp1Var, str);
                } else {
                    String string = UUID.randomUUID().toString();
                    if (z2) {
                        PorterDuff.Mode mode = IconCompat.k;
                        bitmap.getClass();
                        iconCompatB = new IconCompat(5);
                        iconCompatB.b = bitmap;
                    } else {
                        iconCompatB = IconCompat.b(bitmap);
                    }
                    m5h.y(fp1Var, string, str, iconCompatB, intent);
                }
                return null;
            case 4:
                vnj vnjVar = (vnj) obj4;
                lnj lnjVar = (lnj) obj3;
                String str2 = (String) obj2;
                SQLiteDatabase sQLiteDatabase = vnjVar.h;
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase == null ? null : sQLiteDatabase;
                int i = vnj.j;
                mnj mnjVar = lnjVar.a;
                long j = lnjVar.b;
                Cursor cursorQuery = sQLiteDatabase2.query(ybh.x(mnjVar), new String[]{"icon"}, ybh.d(mnjVar).concat("=?"), new String[]{String.valueOf(j)}, null, null, null);
                try {
                    Cursor cursor = cursorQuery;
                    if (!cursor.moveToNext() || cursor.isNull(0)) {
                        vtp.v(cursorQuery, (Throwable) null);
                    } else {
                        long j2 = cursor.getLong(0);
                        if (z2) {
                            SQLiteDatabase sQLiteDatabase3 = vnjVar.h;
                            cursorQuery = (sQLiteDatabase3 == null ? null : sQLiteDatabase3).query("icons", new String[]{"id"}, "id=? AND origin=?", new String[]{String.valueOf(j2), str2}, null, null, null);
                            try {
                                if (cursorQuery.moveToNext()) {
                                    vtp.v(cursorQuery, (Throwable) null);
                                    vtp.v(cursorQuery, (Throwable) null);
                                    z = true;
                                } else {
                                    vtp.v(cursorQuery, (Throwable) null);
                                }
                            } finally {
                            }
                        }
                        SQLiteDatabase sQLiteDatabase4 = vnjVar.h;
                        if (sQLiteDatabase4 == null) {
                            sQLiteDatabase4 = null;
                        }
                        sQLiteDatabase4.delete(ybh.x(mnjVar), ybh.d(mnjVar).concat("=?"), new String[]{String.valueOf(j)});
                        vtp.v(cursorQuery, (Throwable) null);
                    }
                    return Boolean.valueOf(!z);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                s14 s14Var = (s14) obj4;
                ContentResolver contentResolver = (ContentResolver) obj3;
                Uri uri = (Uri) obj2;
                File file = (File) s14Var.c;
                if (file.exists() || file.mkdirs()) {
                    return s14Var.H(contentResolver, uri, 0, z2);
                }
                return null;
        }
    }

    public final csh h(int i, eyl eylVar, int[] iArr) {
        jx6 jx6Var = (jx6) this.c;
        bx6 bx6Var = (bx6) this.d;
        int[] iArr2 = (int[]) this.e;
        ww6 ww6Var = new ww6(jx6Var, bx6Var, (byte) 0);
        int i2 = iArr2[i];
        z0b z0bVarP = h1b.p();
        for (int i3 = 0; i3 < eylVar.a; i3++) {
            z0bVarP.c(new xw6(i, eylVar, i3, bx6Var, iArr[i3], this.b, ww6Var, i2));
        }
        return z0bVarP.g();
    }
}
