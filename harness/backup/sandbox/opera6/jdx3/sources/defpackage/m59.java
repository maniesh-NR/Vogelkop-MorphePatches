package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m59 implements x6f, ann {
    public final /* synthetic */ byte a;
    public int b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public m59() {
        this.a = (byte) 3;
        this.d = new Object();
        this.e = new ArrayMap(0);
    }

    public m59(SharedPreferences sharedPreferences, String str, b59 b59Var, c59 c59Var) {
        this.a = (byte) 0;
        this.f = sharedPreferences;
        this.d = str;
        this.e = b59Var;
        this.g = c59Var;
        int i = vep.B(5)[sharedPreferences.getInt("unfinished_task", 0)];
        this.b = i;
        if (i != 1) {
            m(i);
        }
    }

    public m59(Object obj) {
        this.a = (byte) 1;
        this.d = new Object();
        this.b = 0;
        this.c = false;
        this.f = new HashMap();
        this.g = new CopyOnWriteArraySet();
        this.e = new AtomicReference(obj);
    }

    public m59(nx5 nx5Var, x2 x2Var) {
        this.a = (byte) 5;
        this.d = nx5Var;
        this.e = x2Var;
        Object obj = new Object();
        this.f = obj;
        synchronized (obj) {
            this.g = na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new zhl((byte) 6, (mt5) null, this), 3);
        }
    }

    public m59(qln qlnVar, Integer num, boolean z, String str, int i, Callback callback) {
        this.a = (byte) 6;
        this.e = num;
        this.c = z;
        this.d = str;
        this.b = i;
        this.f = callback;
        this.g = qlnVar;
    }

    public m59(tah tahVar, b8e b8eVar, int i, dee deeVar, dee deeVar2, boolean z) {
        this.a = (byte) 2;
        this.g = tahVar;
        this.d = b8eVar;
        this.b = i;
        this.e = deeVar;
        this.f = deeVar2;
        this.c = z;
    }

    public m59(umi umiVar, mcj mcjVar) {
        this.a = (byte) 4;
        this.d = new HashSet();
        this.b = 3600000;
        this.f = umiVar;
        this.g = mcjVar;
    }

    public final boolean a(int i, int i2) {
        a8e a8eVar = (a8e) ((dee) this.e).g(this.b + i);
        a8e a8eVar2 = (a8e) ((dee) this.f).g(this.b + i2);
        return Intrinsics.a(a8eVar, a8eVar2) || a8eVar.getClass() == a8eVar2.getClass();
    }

    public final ListenableFuture b() {
        Object obj = ((AtomicReference) this.e).get();
        return obj instanceof ro2 ? new q0b((Object) null, (byte) 1) : k1g.G(obj);
    }

    public final o1j c(e4j e4jVar) {
        o1j o1jVar;
        synchronized (this.d) {
            int iJ = j();
            o1jVar = new o1j(iJ, e4jVar);
            if (this.c) {
                o1jVar.h();
            } else {
                ((ArrayMap) this.e).put(Integer.valueOf(iJ), o1jVar);
            }
        }
        return o1jVar;
    }

    @Override // defpackage.ann
    public final void d() {
        boolean z = this.c;
        qln qlnVar = (qln) this.g;
        if (z) {
            qlnVar.l(qlnVar.i(), this.b, new ilm(this, (byte) 11));
        } else {
            h(qlnVar.b());
        }
    }

    @Override // defpackage.ann
    public final void e() {
        qln qlnVar = (qln) this.g;
        int i = this.b;
        if ((i & 1) == 0) {
            if (this.c) {
                qlnVar.l(qlnVar.i(), i, new ilm(this, (byte) 11));
                return;
            } else {
                h(qlnVar.b());
                return;
            }
        }
        nv6 nv6VarB = ru9.c(qlnVar.a).b();
        SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
        editor.remove("wallpaper.item_data.id");
        editor.remove("wallpaper.item_data.content");
        nv6VarB.w();
        qlnVar.a((Callback) this.f, i & (-2));
    }

    public final void f(v6f v6fVar) {
        synchronized (this.d) {
            l(v6fVar);
        }
    }

    public final void g(Executor executor, v6f v6fVar) {
        xak xakVar;
        synchronized (this.d) {
            l(v6fVar);
            xakVar = new xak((AtomicReference) this.e, executor, v6fVar);
            ((HashMap) this.f).put(v6fVar, xakVar);
            ((CopyOnWriteArraySet) this.g).add(xakVar);
        }
        xakVar.a(0);
    }

    public final void h(qjn qjnVar) {
        qjnVar.i = true;
        ((qln) this.g).h.r(qjnVar);
        ((Callback) this.f).run(qjnVar);
    }

    public final void i() {
        if (((oml) this.e) == null && this.c && !((HashSet) this.d).isEmpty()) {
            oml omlVar = new oml(((umi) this.f).d(new mni(this, (byte) 29)));
            this.e = omlVar;
            b59 b59Var = (b59) ((mcj) this.g).a;
            long j = ((SharedPreferences) b59Var.get()).getLong("last_response", -1L);
            long jMax = j >= 0 ? Math.max(0L, (j + this.b) - System.currentTimeMillis()) : 0L;
            long j2 = ((SharedPreferences) b59Var.get()).getLong("last_request", -1L);
            omlVar.b(null, Math.min(Math.max(j2 >= 0 ? Math.max(0L, (j2 + 900000) - System.currentTimeMillis()) : 0L, jMax), this.b), TimeUnit.MILLISECONDS, null);
        }
    }

    public final int j() {
        int i;
        synchronized (this.d) {
            i = this.b;
            this.b = i + 1;
        }
        return i;
    }

    public final void k() {
        ArrayList arrayList;
        switch (this.a) {
            case 3:
                synchronized (this.d) {
                    this.c = true;
                    arrayList = new ArrayList(((ArrayMap) this.e).values());
                    ((ArrayMap) this.e).clear();
                    if (((ohd) this.f) != null) {
                        Handler handler = (Handler) this.g;
                        handler.getClass();
                        handler.post((ohd) this.f);
                        this.f = null;
                        this.g = null;
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((o1j) obj).h();
                }
                return;
            default:
                synchronized (this.f) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    d3k d3kVar = (d3k) this.g;
                    if (d3kVar != null) {
                        d3kVar.k((CancellationException) null);
                    }
                    this.g = null;
                    na2.B((nx5) this.d, (CoroutineContext) null, (rx5) null, new u6k((byte) 8, (mt5) null, this), 3);
                    return;
                }
        }
    }

    public final void l(v6f v6fVar) {
        xak xakVar = (xak) ((HashMap) this.f).remove(v6fVar);
        if (xakVar != null) {
            xakVar.c.set(false);
            ((CopyOnWriteArraySet) this.g).remove(xakVar);
        }
    }

    public final void m(int i) {
        int iA;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f;
        int i2 = this.b;
        if (i2 == i && this.c) {
            return;
        }
        if (vep.A(i2) == 2 && i == 2) {
            i = 5;
        }
        if ((i == 4 || i == 5) && sharedPreferences.getString("last_fcm_token", null) == null && ((iA = vep.A(this.b)) == 0 || iA == 2)) {
            return;
        }
        if (i == 3 && sharedPreferences.getString("last_fcm_token", null) == null && this.b == 1) {
            return;
        }
        if (i != this.b) {
            this.b = i;
            sharedPreferences.edit().putInt("unfinished_task", vep.A(i)).apply();
        }
        if (this.c) {
            return;
        }
        this.c = true;
        new l59(i, (b59) this.e, new ga6((Object) this, (byte) 12)).run();
    }

    public final void n(int i, Object obj) {
        synchronized (this.d) {
            o1j o1jVar = (o1j) ((ArrayMap) this.e).remove(Integer.valueOf(i));
            if (o1jVar != null) {
                if (o1jVar.b.getClass() == obj.getClass()) {
                    o1jVar.set(obj);
                } else {
                    w7d.K("Type mismatch, expected " + o1jVar.b.getClass() + ", but was " + obj.getClass());
                }
            }
            if (((ohd) this.f) != null && ((ArrayMap) this.e).isEmpty()) {
                k();
            }
        }
    }

    public final void o(Object obj) {
        Iterator it;
        int i;
        synchronized (this.d) {
            if (Objects.equals(((AtomicReference) this.e).getAndSet(obj), obj)) {
                return;
            }
            int i2 = this.b + 1;
            this.b = i2;
            if (this.c) {
                return;
            }
            this.c = true;
            Iterator it2 = ((CopyOnWriteArraySet) this.g).iterator();
            while (true) {
                if (it2.hasNext()) {
                    ((xak) it2.next()).a(i2);
                } else {
                    synchronized (this.d) {
                        if (this.b == i2) {
                            this.c = false;
                            return;
                        } else {
                            it = ((CopyOnWriteArraySet) this.g).iterator();
                            i = this.b;
                        }
                    }
                    it2 = it;
                    i2 = i;
                }
            }
        }
    }

    @Override // defpackage.ann
    public final void u(bnn bnnVar) {
        if (!this.c) {
            h(bnnVar.a);
        } else {
            qln qlnVar = (qln) this.g;
            qlnVar.l(qlnVar.i(), this.b, new ilm(this, (byte) 11));
        }
    }

    @Override // defpackage.ann
    public final void z(cnn cnnVar) {
        qjn qjnVar = cnnVar.a;
        qln qlnVar = (qln) this.g;
        Integer num = (Integer) this.e;
        if (num != null) {
            qlnVar.d.c(qjnVar.a.b, num.intValue(), iu0.b);
        }
        if (this.c) {
            qlnVar.e.Y("wallpaper_current", (String) this.d);
        }
        h(qjnVar);
    }
}
