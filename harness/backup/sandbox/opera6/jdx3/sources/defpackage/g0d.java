package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.leanplum.internal.Constants;
import java.io.Closeable;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.a;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class g0d implements Closeable {
    public static final byte[] f = {0, -1, 0};
    public static final long g;
    public static final byte[] h;
    public static final byte[] i;
    public final umi a;
    public final z4f b;
    public final SQLiteDatabase c;
    public final vzc d;
    public Boolean e;

    static {
        on7 on7Var = pn7.b;
        g = cs5.x0(1, un7.f);
        h = new byte[]{0, 0, 0, 0};
        i = new byte[]{28, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 110, 117, 108, 108};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028f A[Catch: all -> 0x036d, TRY_ENTER, TryCatch #8 {all -> 0x036d, blocks: (B:108:0x0284, B:111:0x028f, B:114:0x02a2, B:115:0x02a7, B:116:0x02a8, B:127:0x02f7, B:129:0x0302, B:131:0x0318, B:132:0x033b, B:133:0x0340, B:134:0x0341, B:142:0x0369, B:143:0x036c, B:117:0x02cb, B:118:0x02ce, B:120:0x02d4, B:123:0x02e6, B:140:0x0367), top: B:204:0x0284, outer: #0, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a8 A[Catch: all -> 0x036d, TRY_LEAVE, TryCatch #8 {all -> 0x036d, blocks: (B:108:0x0284, B:111:0x028f, B:114:0x02a2, B:115:0x02a7, B:116:0x02a8, B:127:0x02f7, B:129:0x0302, B:131:0x0318, B:132:0x033b, B:133:0x0340, B:134:0x0341, B:142:0x0369, B:143:0x036c, B:117:0x02cb, B:118:0x02ce, B:120:0x02d4, B:123:0x02e6, B:140:0x0367), top: B:204:0x0284, outer: #0, inners: #3, #5 }] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v40, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g0d(defpackage.umi r31, defpackage.vx r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0d.<init>(umi, vx, java.lang.String):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    public final String h(byte[] bArr) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr.length < 3 || !Arrays.equals(e82.z(bArr, new IntRange(0, 2, 1)), f)) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        byte[] bArrA = this.b.a(e82.z(bArr, djh.j(3, bArr.length)));
        if (bArrA != null) {
            return new String(bArrA, StandardCharsets.UTF_8);
        }
        return null;
    }

    public final z5i k(byte[] bArr) throws NoSuchPaddingException, InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Key keyA;
        String strH;
        wzc wzcVar = wzc.x;
        vzc vzcVar = this.d;
        if (vzcVar != null && (keyA = vzcVar.get()) != null) {
            if (bArr.length < 32 || (bArr.length - 16) % 16 != 0) {
                strH = h(bArr);
            } else {
                byte[] bArrZ = e82.z(bArr, djh.j(0, 16));
                byte[] bArrZ2 = e82.z(bArr, djh.j(16, bArr.length));
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                try {
                    cipher.init(2, keyA, new IvParameterSpec(bArrZ));
                    strH = new String(cipher.doFinal(bArrZ2), StandardCharsets.UTF_8);
                } catch (Exception unused) {
                    strH = null;
                }
            }
            if (strH != null) {
                return new xzc(strH);
            }
        }
        return wzcVar;
    }

    public final e0d l(v3g v3gVar) {
        szc[] szcVarArr = szc.b;
        Cursor cursorQuery = this.c.query("logins", new String[]{"id", "password_value", "keychain_identifier"}, "origin_url == ? AND username_element == ? AND username_value == ? AND password_element == ? AND signon_realm == ?", new String[]{v3gVar.d, v3gVar.j, v3gVar.k, v3gVar.m, v3gVar.c}, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            if (!cursor.moveToFirst()) {
                vtp.v(cursorQuery, (Throwable) null);
                return new e0d("", -1L, null);
            }
            long j = cursor.getLong(0);
            byte[] bArrY = wyh.y(cursor, 1);
            byte[] bArrZ = wyh.z(cursor, 2);
            z5i z5iVarK = k(bArrY);
            e0d e0dVar = z5iVarK instanceof xzc ? new e0d(((xzc) z5iVarK).x, j, bArrZ) : new e0d("", j, bArrZ);
            vtp.v(cursorQuery, (Throwable) null);
            return e0dVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vtp.v(cursorQuery, th);
                throw th2;
            }
        }
    }

    public final y9m m(Cursor cursor, boolean z) throws NoSuchPaddingException, InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        if (this.e == null) {
            this.e = Boolean.FALSE;
        }
        ehc ehcVarB = a.b();
        boolean z2 = false;
        while (cursor.moveToNext()) {
            szc[] szcVarArr = szc.b;
            int i2 = cursor.getInt(10);
            Integer numValueOf = cursor.isNull(11) ? null : Integer.valueOf(cursor.getInt(11));
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            Integer numValueOf2 = cursor.isNull(18) ? null : Integer.valueOf(cursor.getInt(18));
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
            long j = cursor.getLong(20);
            String string = cursor.getString(0);
            String string2 = cursor.isNull(1) ? null : cursor.getString(1);
            String str = string2 == null ? "" : string2;
            String string3 = cursor.isNull(2) ? null : cursor.getString(2);
            String str2 = string3 == null ? "" : string3;
            String string4 = cursor.isNull(3) ? null : cursor.getString(3);
            String str3 = string4 == null ? "" : string4;
            String string5 = cursor.isNull(4) ? null : cursor.getString(4);
            String str4 = string5 == null ? "" : string5;
            byte[] bArrZ = wyh.z(cursor, 28);
            String string6 = cursor.isNull(6) ? null : cursor.getString(6);
            if (string6 == null) {
                string6 = "";
            }
            String string7 = cursor.getString(7);
            long j2 = cursor.getLong(8);
            boolean z3 = cursor.getInt(9) > 0;
            Iterator it = x3g.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((x3g) next).ordinal() == i2) {
                    break;
                }
            }
            x3g x3gVar = (x3g) next;
            if (x3gVar == null) {
                x3gVar = x3g.a;
            }
            Iterator it2 = y3g.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((y3g) next2).ordinal() == iIntValue) {
                    break;
                }
            }
            y3g y3gVar = (y3g) next2;
            if (y3gVar == null) {
                y3gVar = y3g.a;
            }
            y3g y3gVar2 = y3gVar;
            szc[] szcVarArr2 = szc.b;
            byte[] bArrZ2 = wyh.z(cursor, 19);
            Integer numValueOf3 = cursor.isNull(12) ? null : Integer.valueOf(cursor.getInt(12));
            int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
            byte[] bArrZ3 = wyh.z(cursor, 13);
            String string8 = cursor.isNull(14) ? null : cursor.getString(14);
            String str5 = string8 == null ? "" : string8;
            String string9 = cursor.isNull(15) ? null : cursor.getString(15);
            String str6 = string9 == null ? "" : string9;
            String string10 = cursor.isNull(16) ? null : cursor.getString(16);
            String str7 = string10 == null ? "" : string10;
            Integer numValueOf4 = cursor.isNull(17) ? null : Integer.valueOf(cursor.getInt(17));
            boolean z4 = (numValueOf4 != null ? numValueOf4.intValue() : 0) > 0;
            Iterator it3 = jv9.c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (((jv9) next3).ordinal() == iIntValue2) {
                    break;
                }
            }
            jv9 jv9Var = (jv9) next3;
            if (jv9Var == null) {
                jv9Var = jv9.a;
            }
            jv9 jv9Var2 = jv9Var;
            szc[] szcVarArr3 = szc.b;
            long j3 = cursor.getLong(21);
            long j4 = cursor.getLong(30);
            byte[] bArrZ4 = wyh.z(cursor, 22);
            long j5 = cursor.getLong(23);
            String string11 = cursor.isNull(24) ? null : cursor.getString(24);
            String str8 = string11 == null ? "" : string11;
            String string12 = cursor.isNull(25) ? null : cursor.getString(25);
            String str9 = string12 == null ? "" : string12;
            String string13 = cursor.isNull(29) ? null : cursor.getString(29);
            String str10 = string13 == null ? "" : string13;
            Long lValueOf = cursor.isNull(26) ? null : Long.valueOf(cursor.getLong(26));
            long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            int i3 = 1;
            int i4 = 3;
            int i5 = 2;
            v3g v3gVar = new v3g(Long.valueOf(j), x3gVar, string7, string, str, string6, str2, str3, bArrZ2, str4, bArrZ, j3, j4, j5, j2, z3, y3gVar2, iIntValue3, bArrZ3, jv9Var2, str5, str6, str7, z4, bArrZ4, str8, str9, str10, jLongValue, cursor.getInt(27) > 0, cursor.getInt(31) > 0, 1610621152, 0);
            long jLongValue2 = v3gVar.a.longValue();
            u9d u9dVar = new u9d();
            h58 h58Var = tzc.c;
            ArrayList arrayList = new ArrayList(k95.o(h58Var, 10));
            Iterator it4 = h58Var.iterator();
            while (it4.hasNext()) {
                arrayList.add(((tzc) it4.next()).a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            tzc[] tzcVarArr = tzc.b;
            Cursor cursorQuery = this.c.query("insecure_credentials", strArr, "parent_id == ?", new String[]{String.valueOf(jLongValue2)}, null, null, null);
            try {
                Cursor cursor2 = cursorQuery;
                while (cursor2.moveToNext()) {
                    tzc[] tzcVarArr2 = tzc.b;
                    int i6 = cursor2.getInt(i3);
                    Iterator it5 = n9b.c.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it5.next();
                        if (((n9b) next4).ordinal() == i6) {
                            break;
                        }
                    }
                    n9b n9bVar = (n9b) next4;
                    if (n9bVar == null) {
                        n9bVar = n9b.a;
                    }
                    tzc[] tzcVarArr3 = tzc.b;
                    long j6 = cursor2.getLong(i5);
                    boolean z5 = cursor2.getInt(i4) > 0;
                    boolean z6 = cursor2.getInt(4) > 0;
                    o9b o9bVar = new o9b();
                    o9bVar.a = j6;
                    o9bVar.b = z5;
                    o9bVar.c = z6;
                    u9dVar.put(n9bVar, o9bVar);
                    i4 = 3;
                    i5 = 2;
                    i3 = 1;
                }
                vtp.v(cursorQuery, (Throwable) null);
                v3gVar.D = u9dVar.g();
                long jLongValue3 = v3gVar.a.longValue();
                ehc ehcVarB2 = a.b();
                h58 h58Var2 = uzc.c;
                ArrayList arrayList2 = new ArrayList(k95.o(h58Var2, 10));
                Iterator it6 = h58Var2.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(((uzc) it6.next()).a);
                }
                String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                uzc[] uzcVarArr = uzc.b;
                cursorQuery = this.c.query("password_notes", strArr2, "parent_id == ?", new String[]{String.valueOf(jLongValue3)}, null, null, null);
                try {
                    Cursor cursor3 = cursorQuery;
                    while (cursor3.moveToNext()) {
                        uzc[] uzcVarArr2 = uzc.b;
                        byte[] bArrZ5 = wyh.z(cursor3, 3);
                        if (bArrZ5 == null) {
                            bArrZ5 = new byte[0];
                        }
                        z5i z5iVarK = k(bArrZ5);
                        if (z5iVarK instanceof xzc) {
                            String str11 = ((xzc) z5iVarK).x;
                            String string14 = cursor3.getString(2);
                            long j7 = cursor3.getLong(4);
                            Integer numValueOf5 = cursor3.isNull(5) ? null : Integer.valueOf(cursor3.getInt(5));
                            ehcVarB2.add(new t4g(j7, string14, str11, (numValueOf5 != null ? numValueOf5.intValue() : 0) > 0));
                        }
                    }
                    vtp.v(cursorQuery, (Throwable) null);
                    v3gVar.E = a.a(ehcVarB2);
                    if (z) {
                        szc[] szcVarArr4 = szc.b;
                        byte[] bArrZ6 = wyh.z(cursor, 5);
                        if (bArrZ6 == null) {
                            bArrZ6 = new byte[0];
                        }
                        z5i z5iVarK2 = k(bArrZ6);
                        if (z5iVarK2 instanceof wzc) {
                            z2 = true;
                        } else {
                            if (!(z5iVarK2 instanceof xzc)) {
                                h9o.p();
                                return null;
                            }
                            v3gVar.n = ((xzc) z5iVarK2).x;
                        }
                    }
                    ehcVarB.add(v3gVar);
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        return z2 ? a0d.q : new b0d(a.a(ehcVarB));
    }

    public final void n(long j, List list) {
        Key keyA;
        byte[] bArrU;
        uzc[] uzcVarArr = uzc.b;
        String[] strArr = {String.valueOf(j)};
        SQLiteDatabase sQLiteDatabase = this.c;
        sQLiteDatabase.delete("password_notes", "parent_id == ?", strArr);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t4g t4gVar = (t4g) it.next();
            String str = t4gVar.b;
            phj zzcVar = yzc.t;
            vzc vzcVar = this.d;
            if (vzcVar != null && (keyA = vzcVar.get()) != null && (bArrU = wyh.u(str, keyA)) != null) {
                zzcVar = new zzc(bArrU);
            }
            if (zzcVar instanceof zzc) {
                byte[] bArr = ((zzc) zzcVar).t;
                ContentValues contentValues = new ContentValues(uzc.c.d());
                contentValues.put("parent_id", Long.valueOf(j));
                contentValues.put("key", t4gVar.a);
                contentValues.put(Constants.Params.VALUE, bArr);
                contentValues.put("date_created", Long.valueOf(t4gVar.c));
                contentValues.put("confidential", Boolean.valueOf(t4gVar.d));
                sQLiteDatabase.insertWithOnConflict("password_notes", null, contentValues, 5);
            }
        }
    }
}
