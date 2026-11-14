package defpackage;

import android.content.Context;
import android.database.DataSetObservable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class bh extends DataSetObservable {
    public static final Object i = new Object();
    public static final HashMap j = new HashMap();
    public final Context d;
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final byte f = 50;
    public boolean g = true;
    public boolean h = true;
    public final String e = "share_history.xml";

    public bh(Context context) {
        this.d = context.getApplicationContext();
    }

    public static bh b(Context context) {
        bh bhVar;
        synchronized (i) {
            HashMap map = j;
            bhVar = (bh) map.get("share_history.xml");
            if (bhVar == null) {
                bhVar = new bh(context);
                map.put("share_history.xml", bhVar);
            }
        }
        return bhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.g
            java.util.ArrayList r1 = r10.c
            r2 = 1
            r3 = 0
            if (r0 == 0) goto La3
            boolean r0 = r10.h
            if (r0 == 0) goto La3
            java.lang.String r0 = r10.e
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto La3
            r10.g = r3
            android.content.Context r4 = r10.d     // Catch: java.lang.Throwable -> La1
            java.io.FileInputStream r0 = r4.openFileInput(r0)     // Catch: java.lang.Throwable -> La1
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            java.lang.String r5 = "UTF-8"
            r4.setInput(r0, r5)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            r5 = r3
        L26:
            if (r5 == r2) goto L30
            r6 = 2
            if (r5 == r6) goto L30
            int r5 = r4.next()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            goto L26
        L30:
            java.lang.String r5 = "historical-records"
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            if (r5 == 0) goto L8a
            r1.clear()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
        L3f:
            int r5 = r4.next()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            if (r5 != r2) goto L48
            if (r0 == 0) goto La1
            goto L9e
        L48:
            r6 = 3
            if (r5 == r6) goto L3f
            r6 = 4
            if (r5 == r6) goto L3f
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            java.lang.String r6 = "historical-record"
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            if (r5 == 0) goto L82
            java.lang.String r5 = "activity"
            r6 = 0
            java.lang.String r5 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            java.lang.String r7 = "time"
            java.lang.String r7 = r4.getAttributeValue(r6, r7)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            java.lang.String r9 = "weight"
            java.lang.String r6 = r4.getAttributeValue(r6, r9)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            ah r9 = new ah     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            android.content.ComponentName r5 = android.content.ComponentName.unflattenFromString(r5)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            r9.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            r1.add(r9)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            goto L3f
        L82:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            java.lang.String r5 = "Share records file not well-formed."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            throw r4     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
        L8a:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            java.lang.String r5 = "Share records file does not start with historical-records tag."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            throw r4     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
        L92:
            r10 = move-exception
            if (r0 == 0) goto L98
            r0.close()     // Catch: java.io.IOException -> L98
        L98:
            throw r10
        L99:
            if (r0 == 0) goto La1
            goto L9e
        L9c:
            if (r0 == 0) goto La1
        L9e:
            r0.close()
        La1:
            r0 = r2
            goto La4
        La3:
            r0 = r3
        La4:
            int r4 = r1.size()
            byte r5 = r10.f
            int r4 = r4 - r5
            if (r4 <= 0) goto Lbb
            r10.h = r2
            r2 = r3
        Lb0:
            if (r2 >= r4) goto Lbb
            java.lang.Object r5 = r1.remove(r3)
            ah r5 = (defpackage.ah) r5
            int r2 = r2 + 1
            goto Lb0
        Lbb:
            if (r0 == 0) goto Lc0
            r10.notifyChanged()
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh.a():void");
    }

    public final void c(int i2) {
        synchronized (this.a) {
            a();
            if (this.b.get(i2) != null) {
                throw new ClassCastException();
            }
            throw null;
        }
    }

    public final int d() {
        int size;
        synchronized (this.a) {
            a();
            size = this.b.size();
        }
        return size;
    }

    public final void e() {
        synchronized (this.a) {
            a();
            if (!this.b.isEmpty()) {
                if (this.b.get(0) != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        }
    }
}
