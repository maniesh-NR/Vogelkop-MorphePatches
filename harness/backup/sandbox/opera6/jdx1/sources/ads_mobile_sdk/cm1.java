package ads_mobile_sdk;

import android.util.Base64;
import android.view.MotionEvent;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.d9p;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class cm1 {
    public final Object a;
    public final dj0 b;
    public final z6 c;
    public final boolean d;

    public cm1(Object obj, dj0 dj0Var, z6 z6Var, boolean z) {
        this.a = obj;
        this.b = dj0Var;
        this.c = z6Var;
        this.d = z;
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        d9p d9pVarO = le.o();
        d9pVarO.b$1();
        le leVar = (le) d9pVarO.b;
        leVar.getClass();
        leVar.encryptionMethod_ = rfp.b(5);
        leVar.bitField0_ |= 4;
        fr frVarA = hr.a(0, bArr.length, bArr);
        d9pVarO.b$1();
        ((le) d9pVarO.b).a(frVarA);
        return Base64.encodeToString(((le) d9pVarO.a()).a(), 11);
    }

    public final synchronized void a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.a.getClass().getDeclaredMethod("close", null).invoke(this.a, null);
            z6 z6Var = this.c;
            z6Var.a.a(3001, System.currentTimeMillis() - jCurrentTimeMillis, null, null);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(Boolean.TRUE);
            taskCompletionSource.getTask();
        } catch (Exception e) {
            throw new tn3(2003, e);
        }
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.b.getClass();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.a.getClass().getDeclaredMethod("he", Map.class).invoke(this.a, map);
            z6 z6Var = this.c;
            z6Var.a.a(3003, System.currentTimeMillis() - jCurrentTimeMillis, null, null);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(Boolean.TRUE);
            taskCompletionSource.getTask();
        } catch (Exception e) {
            throw new tn3(2005, e);
        }
    }

    public final synchronized byte[] a(HashMap map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.c.a(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.a, null, map);
    }
}
