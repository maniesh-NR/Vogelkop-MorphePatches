package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import com.google.android.gms.common.internal.ImagesContract;
import com.opera.api.Callback;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class glh {
    public final jlh a;
    public final h7f b = new h7f();
    public final umi c;
    public final qie d;
    public final ContentResolver e;
    public final syd f;
    public final HashSet g;
    public File h;

    public glh(Context context, umi umiVar, syd sydVar) {
        qie qieVar = new qie((byte) 19);
        this.d = qieVar;
        this.g = new HashSet();
        this.c = umiVar;
        this.a = new jlh(context, "reading.db", null, 5, (byte) 0);
        this.e = context.getContentResolver();
        qieVar.n(new oml(umiVar.b(new ow3(this, context, (byte) 8))), null);
        this.f = sydVar;
        if (Build.VERSION.SDK_INT < 30 || ru9.c(context).a.getBoolean("readinglist.access_after_upgrade.all_access", false)) {
            return;
        }
        nml nmlVarB = umiVar.b(new dlh(this, (byte) 0));
        nmlVarB.b(umiVar.f(new mgf((Object) this, (Object) context, (byte) 12)));
        qieVar.n(new oml(nmlVarB), null);
    }

    public final void a(Collection collection, boolean z) {
        bu3 bu3Var = new bu3((byte) 4, this, collection, z);
        umi umiVar = this.c;
        nml nmlVarC = umiVar.c(bu3Var);
        nmlVarC.b(umiVar.d(new q2g(this, collection, (byte) 19)));
        this.d.n(new oml(nmlVarC), null);
    }

    public final void b(String str) throws FileNotFoundException {
        Uri uri = Uri.parse(str);
        if ("content".equals(uri.getScheme())) {
            try {
                DocumentsContract.deleteDocument(this.e, uri);
            } catch (Exception unused) {
            }
        } else {
            if ("file".equals(uri.getScheme())) {
                str = uri.getPath();
            }
            new File(str).delete();
        }
    }

    public final void c(Callback callback, long j) {
        gc9 gc9Var = new gc9(this, j, (byte) 1);
        umi umiVar = this.c;
        nml nmlVarB = umiVar.b(gc9Var);
        nmlVarB.b(umiVar.f(new lw0(callback, (byte) 7)));
        this.d.n(new oml(nmlVarB), null);
    }

    public final void d(final String str, final String str2, final String str3, final long j, xx1 xx1Var) {
        esk eskVar = new esk() { // from class: flh
            public final Object get() throws Throwable {
                String str4 = str2;
                glh glhVar = this.a;
                jlh jlhVar = glhVar.a;
                String str5 = str3;
                Long lK = jlhVar.k(str5);
                String str6 = str;
                if (lK != null) {
                    List listSingletonList = Collections.singletonList(lK);
                    ArrayList arrayListH = jlhVar.h(listSingletonList, true);
                    int size = arrayListH.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListH.get(i);
                        i++;
                        String str7 = (String) obj;
                        if (!str7.equals(str6)) {
                            glhVar.b(str7);
                        }
                    }
                    jlhVar.getWritableDatabase().execSQL(String.format("DELETE FROM reading WHERE id IN (%1$s)", new r40(",", (byte) 3).b(listSingletonList)));
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                SQLiteDatabase writableDatabase = jlhVar.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(ImagesContract.URL, str5);
                    contentValues.put("title", str4);
                    contentValues.put("content_path", str6);
                    contentValues.put("content_mime_type", "multipart/related");
                    long j2 = j;
                    if (j2 > -1) {
                        contentValues.put("filesize", Long.valueOf(j2));
                    }
                    contentValues.put("timestamp", Long.valueOf(jCurrentTimeMillis));
                    contentValues.put("transcoded", (Integer) 3);
                    long jInsert = writableDatabase.insert("reading", null, contentValues);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    return Long.valueOf(jInsert);
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        };
        umi umiVar = this.c;
        nml nmlVarB = umiVar.b(eskVar);
        nmlVarB.b(umiVar.f(new mgf(this, xx1Var, str3)));
        this.d.n(new oml(nmlVarB), null);
    }

    public final boolean e() {
        return ((SharedPreferences) this.f.c.get()).getBoolean("active", false);
    }

    public final void f(Callback callback) {
        dlh dlhVar = new dlh(this, (byte) 1);
        umi umiVar = this.c;
        nml nmlVarB = umiVar.b(dlhVar);
        nmlVarB.b(umiVar.f(new lw0(callback, (byte) 6)));
        this.d.n(new oml(nmlVarB), null);
    }

    public final void g(long j, boolean z) {
        HashSet hashSet = this.g;
        if (z) {
            if (!hashSet.add(Long.valueOf(j))) {
                return;
            }
        } else if (!hashSet.remove(Long.valueOf(j))) {
            return;
        }
        h7f h7fVar = this.b;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((clh) g7fVarH.next()).getClass();
        }
    }

    public final void h(Runnable runnable, String str, long j) {
        elh elhVar = new elh(this, j, str, (byte) 1);
        umi umiVar = this.c;
        nml nmlVarC = umiVar.c(elhVar);
        nmlVarC.b(umiVar.d(new ni2((Object) this, j, (Object) runnable, (byte) 5)));
        this.d.n(new oml(nmlVarC), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.ArrayList r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r18.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto Ld8
            r3 = r18
            java.lang.Object r4 = r3.get(r2)
            int r2 = r2 + 1
            ilh r4 = (defpackage.ilh) r4
            java.lang.Long r5 = r4.i
            java.lang.String r6 = r4.e
            if (r5 != 0) goto L7
            r7 = 0
            if (r6 == 0) goto L2d
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r6 = r5.isDirectory()
            if (r6 != 0) goto L2d
            long r5 = r5.length()
            goto L2e
        L2d:
            r5 = r7
        L2e:
            java.lang.String r9 = r4.f
            android.net.Uri r11 = android.net.Uri.parse(r9)
            java.lang.String r10 = "content"
            java.lang.String r12 = r11.getScheme()
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L7d
            android.content.ContentResolver r10 = r0.e
            java.lang.String r9 = "_size"
            java.lang.String[] r12 = new java.lang.String[]{r9}
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6d
            if (r11 == 0) goto L65
            int r9 = r10.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6d
            boolean r11 = r10.isNull(r9)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6d
            if (r11 != 0) goto L65
            long r7 = r10.getLong(r9)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6d
        L65:
            r10.close()
            goto L9c
        L69:
            r0 = move-exception
            r16 = r10
            goto L71
        L6d:
            r16 = r10
            goto L77
        L70:
            r0 = move-exception
        L71:
            if (r16 == 0) goto L76
            r16.close()
        L76:
            throw r0
        L77:
            if (r16 == 0) goto L9c
            r16.close()
            goto L9c
        L7d:
            java.io.File r10 = new java.io.File
            java.lang.String r12 = "file"
            java.lang.String r13 = r11.getScheme()
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L8f
            java.lang.String r9 = r11.getPath()
        L8f:
            r10.<init>(r9)
            boolean r9 = r10.isDirectory()
            if (r9 != 0) goto L9c
            long r7 = r10.length()
        L9c:
            long r5 = r5 + r7
            long r7 = r4.a
            jlh r9 = r0.a
            android.database.sqlite.SQLiteDatabase r9 = r9.getWritableDatabase()
            r9.beginTransaction()
            java.lang.String r10 = "id=?"
            java.lang.String r7 = java.lang.Long.toString(r7)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> Ld3
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Ld3
            r8.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r11 = "filesize"
            java.lang.Long r12 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Ld3
            r8.put(r11, r12)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r11 = "reading"
            r9.update(r11, r8, r10, r7)     // Catch: java.lang.Throwable -> Ld3
            r9.setTransactionSuccessful()     // Catch: java.lang.Throwable -> Ld3
            r9.endTransaction()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.i = r5
            goto L7
        Ld3:
            r0 = move-exception
            r9.endTransaction()
            throw r0
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glh.i(java.util.ArrayList):void");
    }
}
