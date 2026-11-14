package ads_mobile_sdk;

import defpackage.p3p;
import defpackage.rnp;
import defpackage.ui;
import defpackage.w7p;
import defpackage.xzh;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class ov implements ui {
    public Object a;

    public /* synthetic */ ov(Object obj) {
        this.a = obj;
    }

    public static int a(long j) {
        return p3p.f(9, 640, j) >>> 6;
    }

    public static int a(hr hrVar) {
        int size = hrVar.size();
        return i(size) + size;
    }

    public static long b(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        return p3p.e(i, 9, 352) >>> 6;
    }

    public static int j(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public final Object a(String str, Object obj, Function1 function1) {
        Object objA = ((eo) ((w7p) this.a)).a(str, function1);
        return objA == null ? obj : objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.zep r8, mt5 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.rk1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.rk1 r0 = (ads_mobile_sdk.rk1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.rk1 r0 = new ads_mobile_sdk.rk1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            java.util.Iterator r7 = r0.b
            zep r8 = r0.a
            defpackage.ybh.y(r9)
            goto L41
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L32:
            defpackage.ybh.y(r9)
            java.lang.Object r7 = r7.a
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L41:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L72
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r2 = r9.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r9 = r9.getValue()
            qso r9 = (defpackage.qso) r9
            vr3 r5 = ads_mobile_sdk.xu0.a
            java.lang.String r5 = "Configuring JsContext with modifier ["
            java.lang.String r6 = "]"
            sko.t(r5, r2, r6, r3)
            r2 = r8
            zep r2 = (defpackage.zep) r2
            r0.a = r2
            r0.b = r7
            r0.e = r4
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L41
            return r1
        L72:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ov.a(zep, mt5):java.lang.Object");
    }

    public rnp a() {
        return (rnp) this.a;
    }

    public abstract void a(byte b);

    public final void a(int i, long j, Object obj) {
        ((Unsafe) this.a).putInt(obj, j, i);
    }

    public abstract void a(int i, boolean z);

    public final void a(long j, Object obj, Object obj2) {
        ((Unsafe) this.a).putObject(obj, j, obj2);
    }

    public abstract void a(Object obj, long j, double d);

    public abstract void a(Object obj, long j, float f);

    public final void a(Object obj, long j, long j2) {
        ((Unsafe) this.a).putLong(obj, j, j2);
    }

    public abstract void a(Object obj, long j, boolean z);

    public abstract void a(String str);

    /* renamed from: a, reason: collision with other method in class */
    public boolean mo6a() {
        try {
            Class<?> cls = ((Unsafe) this.a).getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            ml3.a(th);
            return false;
        }
    }

    public abstract boolean a(long j, Object obj);

    public abstract void a$1(int i, int i2, byte[] bArr);

    public abstract void a$1(int i, byte[] bArr);

    public abstract double b(long j, Object obj);

    public abstract void b(int i, hr hrVar);

    public abstract void b(g gVar);

    public abstract void b(hr hrVar);

    public final void b(Class cls) {
        ((Unsafe) this.a).arrayIndexScale(cls);
    }

    public abstract void b(String str, int i);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[PHI: r4
      0x0046: PHI (r4v12 java.lang.reflect.Field) = (r4v9 java.lang.reflect.Field), (r4v15 java.lang.reflect.Field) binds: [B:17:0x0044, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r4 = this;
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Object r4 = r4.a
            sun.misc.Unsafe r4 = (sun.misc.Unsafe) r4
            r1 = 0
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "objectFieldOffset"
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L4c
            r4.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "getLong"
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r0}     // Catch: java.lang.Throwable -> L4c
            r4.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L4c
            sun.misc.Unsafe r4 = ads_mobile_sdk.ml3.a     // Catch: java.lang.Throwable -> L4c
            boolean r4 = ads_mobile_sdk.qe.b()     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<java.nio.Buffer> r2 = java.nio.Buffer.class
            r3 = 0
            if (r4 == 0) goto L36
            java.lang.String r4 = "effectiveDirectAddress"
            java.lang.reflect.Field r4 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L33
            goto L34
        L33:
            r4 = r3
        L34:
            if (r4 != 0) goto L46
        L36:
            java.lang.String r4 = "address"
            java.lang.reflect.Field r4 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L3d
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L47
            java.lang.Class r2 = r4.getType()     // Catch: java.lang.Throwable -> L4c
            if (r2 != r0) goto L47
        L46:
            r3 = r4
        L47:
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r4 = 1
            return r4
        L4c:
            r4 = move-exception
            ads_mobile_sdk.ml3.a(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ov.b():boolean");
    }

    public abstract float c(long j, Object obj);

    public abstract void c(long j);

    public abstract void d(int i, long j);

    public abstract void d(long j);

    @Override // defpackage.ui
    public void destroy() {
        a().destroy();
    }

    public abstract void e(int i, int i2);

    public abstract void e(int i, long j);

    public abstract void f(int i, int i2);

    public abstract void g(int i, int i2);

    public final xzh getResponseInfo() {
        return a().getResponseInfo();
    }

    public abstract void h(int i, int i2);

    public abstract void k(int i);

    public abstract void l(int i);

    public abstract void m(int i);
}
